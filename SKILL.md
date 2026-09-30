---
name: dataforseo-java-client
description: Use the DataForSEO Java client (Maven io.github.dataforseo:dataforseo-client) to call DataForSEO API v3 (SERP, Keywords Data, DataForSEO Labs, Backlinks, OnPage, AI Optimization, etc.). Read this before exploring the code; it explains the layout, naming rules and how to find an endpoint without reading the huge generated files.
---

# DataForSEO Java client

Generated, typed Java client for DataForSEO API v3.
Every API endpoint is one method; every request/response body is one model class.

- Maven: `io.github.dataforseo:dataforseo-client` ([Maven Central](https://central.sonatype.com/artifact/io.github.dataforseo/dataforseo-client))
- Root package: `io.github.dataforseo.client`; Java 8+; HTTP: OkHttp; JSON: Gson
- Base URL: `https://api.dataforseo.com` (sandbox with free dummy data: `https://sandbox.dataforseo.com`)
- Auth: HTTP Basic with the DataForSEO API login and password (not the dashboard password)

## Do not read generated code in full

The client is generated from an OpenAPI spec and is very large (thousands of model files, `api/*Api.java` files of several hundred KB). Never open files whole. Derive names with the rules below and use targeted search (grep) only to confirm them.

## Layout

Paths are relative to `io/github/dataforseo/client/` (`src/main/java/io/github/dataforseo/client/` in the repository; the same path inside `dataforseo-client-<version>-sources.jar` from Maven Central, while `README.md` and `SKILL.md` are in `META-INF/` of the jars):

```
ApiClient.java             HTTP transport: base path, credentials, timeouts, headers
Configuration.java         Configuration.getDefaultApiClient()
ApiException.java          thrown on non-2xx HTTP responses
JSON.java                  Gson setup incl. polymorphic type selectors
auth/                      HttpBasicAuth etc.
api/<Section>Api.java      one class per API section, one method per endpoint
model/<ClassName>.java     one model class per file
```

Sections (the `api/` folder is the source of truth): `SerpApi`, `KeywordsDataApi`, `DataforseoLabsApi`, `DomainAnalyticsApi`, `BacklinksApi`, `OnPageApi`, `ContentAnalysisApi`, `AiOptimizationApi`, `MerchantApi`, `AppDataApi`, `BusinessDataApi`, `AppendixApi`.

## Naming rules (derive names instead of searching)

Endpoint path `/v3/<section>/<rest>` maps to:

| What | Rule | Example for `/v3/serp/google/organic/live/advanced` |
|---|---|---|
| API class | `api.<Section>Api` | `SerpApi` |
| Method | camelCase of `<rest>` (usually) | `googleOrganicLiveAdvanced` |
| Request model | `model.<Section><Rest>RequestInfo` | `SerpGoogleOrganicLiveAdvancedRequestInfo` |
| Response model | `model.<Section><Rest>ResponseInfo` | `SerpGoogleOrganicLiveAdvancedResponseInfo` |
| Task item | `<Section><Rest>TaskInfo` | `SerpGoogleOrganicLiveAdvancedTaskInfo` |
| Result item | `<Section><Rest>ResultInfo` | `SerpGoogleOrganicLiveAdvancedResultInfo` |

Model names follow the rule strictly. Method names sometimes keep the section prefix (e.g. `dataforseoLabsIdList`), so confirm the method by its response model:

```bash
grep -n "public SerpGoogleOrganicLiveAdvancedResponseInfo " api/SerpApi.java   # -> method signature
```

JSON field `location_code` becomes `getLocationCode()` / `setLocationCode()` / fluent `locationCode(...)`. Field descriptions (required/optional, allowed values, limits) are the javadoc of the getters; grep the field you need instead of reading the file:

```bash
grep -n -B 6 "getLocationCode()" model/SerpGoogleOrganicLiveAdvancedRequestInfo.java
```

## Method shapes

- `POST` endpoints: `XResponseInfo x(List<XRequestInfo> payload) throws ApiException`, the body is always a list of tasks.
- `GET` endpoints: `XResponseInfo x()` or `x(String id)` (task id for `taskGet*`, `country` for locations etc.).
- Every method also has `xWithHttpInfo(...)` (returns `ApiResponse<T>` with status code and headers) and `xAsync(..., ApiCallback<T>)` (OkHttp async).

## Setup

```java
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.api.SerpApi;
import io.github.dataforseo.client.model.*;

ApiClient apiClient = Configuration.getDefaultApiClient();
apiClient.setBasePath("https://api.dataforseo.com"); // or https://sandbox.dataforseo.com
apiClient.setUsername("API_LOGIN");
apiClient.setPassword("API_PASSWORD");
apiClient.setReadTimeout(120_000); // OkHttp default (10 s) is too short for many Live endpoints

SerpApi serpApi = new SerpApi(apiClient);
```

Create one `ApiClient` and reuse it for all section classes.

## Live request (result in the same call)

```java
import java.util.ArrayList;
import java.util.List;
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.api.SerpApi;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dataforseo.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("USERNAME"); //set your username
        basicAuth.setPassword("PASSWORD"); //set your password
    
        SerpApi apiInstance = new SerpApi(defaultClient);
        try {

          SerpGoogleOrganicLiveAdvancedRequestInfo task = new SerpGoogleOrganicLiveAdvancedRequestInfo();

          task.setLocationCode(2840);
          task.setLanguageCode("en");
          task.setKeyword("albert einstein");
    
          List<SerpGoogleOrganicLiveAdvancedRequestInfo> serpTaskRequestInfo = new ArrayList<SerpGoogleOrganicLiveAdvancedRequestInfo>();
          serpTaskRequestInfo.add(task);

          SerpGoogleOrganicLiveAdvancedResponseInfo result = apiInstance.googleOrganicLiveAdvanced(serpTaskRequestInfo);
          System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SerpApi#googleOrganicLiveAdvanced");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

## Task-based request (post -> wait -> get)

```java
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.api.SerpApi;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;

import io.github.dataforseo.client.Configuration;

public class App {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME"); //set your username
    basicAuth.setPassword("PASSWORD"); //set your password

    SerpApi apiInstance = new SerpApi(defaultClient);

    try {

      SerpGoogleOrganicTaskPostRequestInfo task = new SerpGoogleOrganicTaskPostRequestInfo();

      task.setLocationCode(2840);
      task.setLanguageCode("en");
      task.setKeyword("albert einstein");

      List<SerpGoogleOrganicTaskPostRequestInfo> serpTaskRequestInfo = new ArrayList<SerpGoogleOrganicTaskPostRequestInfo>();
      serpTaskRequestInfo.add(task);

      SerpGoogleOrganicTaskPostResponseInfo taskPost = apiInstance.googleOrganicTaskPost(serpTaskRequestInfo);
      String taskId = taskPost.getTasks().get(0).getId();

      long startTime = System.currentTimeMillis();

      boolean isTaskReady = GoogleOrganicTaskReady(apiInstance, taskId);
      while (!isTaskReady && (System.currentTimeMillis() - startTime) < 60000) {
        isTaskReady = GoogleOrganicTaskReady(apiInstance, taskId);
        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          System.err.println("Thread was interrupted, Failed to complete operation");
          break;
        }
      }

      SerpGoogleOrganicTaskGetAdvancedResponseInfo result = apiInstance.googleOrganicTaskGetAdvanced(taskId);
      System.out.println(result);

    } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleOrganicTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }

  private static boolean GoogleOrganicTaskReady(SerpApi serpApi, String taskId) throws ApiException {

    SerpGoogleOrganicTasksReadyResponseInfo result = serpApi.googleOrganicTasksReady();
    for (SerpGoogleOrganicTasksReadyTaskInfo task : result.getTasks()) {
      for (SerpGoogleOrganicTasksReadyResultInfo xx : task.getResult()) {
        if (xx.getId().equals(taskId)) {
          return true;
        }
      }
    }

    return false;
  }
}
```

Instead of polling you can set `postbackUrl(...)` / `pingbackUrl(...)` in the task request.

## Response envelope (same for every endpoint)

```
XResponseInfo
  getVersion, getStatusCode, getStatusMessage, getTime, getCost, getTasksCount, getTasksError
  getTasks(): List<XTaskInfo>
    XTaskInfo
      getId, getStatusCode, getStatusMessage, getTime, getCost, getResultCount, getPath, getData (echo of the request)
      getResult(): List<XResultInfo>   // endpoint specific payload, often with getItems()
```

- Status code `20000` means OK (both top-level and per task); `20100` = task created; `4xxxx`/`5xxxx` = errors. Always check the per-task status code: the HTTP status is usually 200 even when a task failed.
- Getters return boxed types and may return `null`; null-check lists and numbers.
- Unknown JSON fields are kept and available via `getAdditionalProperty(key)`.

## Polymorphic items

Lists like `getItems()` are typed as a base class (e.g. `BaseSerpApiElementItem`) and deserialized into concrete subclasses by the JSON `type` field (`organic` -> `OrganicSerpElementItem`, `paid` -> `PaidSerpElementItem`, `featured_snippet` -> `FeaturedSnippetSerpElementItem`, ...). Use `instanceof`. The mapping is registered in `JSON.java` (`classByDiscriminatorValue.put("<type>", ...)`); grep there instead of reading it.

## Errors

Non-2xx HTTP responses throw `io.github.dataforseo.client.ApiException` with `getCode()`, `getResponseBody()`, `getResponseHeaders()`.

## Useful facts

- Location / language codes: `locationCode(2840)` (United States), `languageCode("en")`. Full lists come from endpoints like `serpApi.googleLocations()` / `googleLanguages()` (and similar per section).
- Most Live endpoints accept one task per request; Task POST endpoints accept many tasks (up to 100) in one call.
- `taskGet*` has several variants (`Regular`, `Advanced`, `Html`); use the one matching the data you need.
- Field semantics, allowed values and limits: javadoc of the request model getters (it comes from the official API docs).

## External documentation (last resort)

Use https://dataforseo.com/llms.txt only when this file or the generated code do not answer the question (for example pricing, account limits or endpoint behaviour that is not described locally). Everything needed to write client code is already in this library.

`llms.txt` is a large (~200 KB) index of links to per-endpoint Markdown pages (`https://docs.dataforseo.com/v3/...md`). Do not read it whole: search it for the endpoint path or name and fetch only the linked page.

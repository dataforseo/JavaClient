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

## Knowledge base: start here

`knowledge-base/` (next to this file) has one Markdown file per API section, i.e. per class in `api/`. Each file explains what data the section provides and when to use another section instead, gives ready-to-run examples and lists every endpoint with its method name. Open only the file of the section you need: it is much cheaper than searching the generated code.

| API class | Use it for |
|---|---|
| [`SerpApi`](knowledge-base/SerpApi.md) | Search engine results pages (SERP) collected on request: what a search engine shows for a query in a given location, language and device, from engines such as Google, Bing, YouTube, Yahoo and others, including search verticals such as maps, news, images, jobs and AI search modes. |
| [`DataforseoLabsApi`](knowledge-base/DataforseoLabsApi.md) | Keyword research, competitor analysis and search analytics from DataForSEO's own databases of keywords, search results and rankings, for search engines and platforms such as Google, Amazon, Google Play and the App Store. |
| [`DomainAnalyticsApi`](knowledge-base/DomainAnalyticsApi.md) | Information about websites as such: the technologies a site is built with (CMS, analytics, frameworks, advertising and other tools), which sites use a given technology, statistics of technology usage, and domain registration (Whois) data enriched with search and backlink metrics. |
| [`KeywordsDataApi`](knowledge-base/KeywordsDataApi.md) | Keyword metrics from advertising platforms and trend services: search volume, cost per click, competition and their monthly dynamics, keyword ideas, ad traffic forecasts and keyword popularity trends, from sources such as Google Ads, Bing Ads, Google Trends, DataForSEO Trends and clickstream data. |
| [`BacklinksApi`](knowledge-base/BacklinksApi.md) | Backlink data for any domain, subdomain or web page from DataForSEO's continuously updated link index: inbound links, referring domains, pages and networks, anchor texts, link-based authority (rank) and spam score, how the link profile changes over time, and how it compares with other sites. |
| [`AiOptimizationApi`](knowledge-base/AiOptimizationApi.md) | Data for AI search optimization (GEO): answers of large language models such as ChatGPT, Claude, Gemini and Perplexity to your prompts, results scraped from the web interfaces of AI assistants, search volume of keywords in AI tools, and how often brands, domains and pages are mentioned in AI-generated answers. |
| [`OnPageApi`](knowledge-base/OnPageApi.md) | Technical SEO audit of websites with a configurable crawler: crawl a site and get per-page checks, resources, internal and external links, duplicates, redirects, indexability issues, keyword density and page speed data; or analyze individual pages instantly, extract their content, take screenshots and run Google Lighthouse. |
| [`ContentAnalysisApi`](knowledge-base/ContentAnalysisApi.md) | Brand monitoring and sentiment analysis across the web: pages that mention (cite) a keyword or brand, with the sentiment polarity and emotional connotations of each mention, content ratings and categories, and aggregated trends of mentions over time. |
| [`MerchantApi`](knowledge-base/MerchantApi.md) | E-commerce data from marketplaces and shopping search engines such as Amazon and Google Shopping: product listings for a search query, product details, product variations, sellers and their offers, with prices, ratings, reviews count and paid placements. |
| [`AppDataApi`](knowledge-base/AppDataApi.md) | Mobile application data from app stores such as Google Play and the App Store: app search results, top charts and collections, detailed app information and user reviews, plus a searchable database of app listings. |
| [`BusinessDataApi`](knowledge-base/BusinessDataApi.md) | Publicly available data about businesses and local places: business profiles, reviews, questions and answers, hotel data and a database of business listings, from sources such as Google, Trustpilot and Tripadvisor. |
| [`AppendixApi`](knowledge-base/AppendixApi.md) | Account and service information that applies to the whole DataForSEO API rather than to a data source: account balance, spending, limits and prices, the current status of the APIs, the list of error codes, and re-sending webhooks (pingbacks and postbacks) of completed tasks. |

## Layout

Paths are relative to `io/github/dataforseo/client/` (`src/main/java/io/github/dataforseo/client/` in the repository; the same path inside `dataforseo-client-<version>-sources.jar` from Maven Central, while `README.md`, `SKILL.md` and `knowledge-base/` are in `META-INF/` of the jars):

```
ApiClient.java             HTTP transport: base path, credentials, timeouts, headers
Configuration.java         Configuration.getDefaultApiClient()
ApiException.java          thrown on non-2xx HTTP responses
JSON.java                  Gson setup incl. polymorphic type selectors
auth/                      HttpBasicAuth etc.
api/<Section>Api.java      one class per API section, one method per endpoint
model/<ClassName>.java     one model class per file
```

The per-section guides are in `knowledge-base/<Section>Api.md` at the repository root (see above).

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

Use https://dataforseo.com/llms.txt only when this file, the knowledge base or the generated code do not answer the question (for example pricing, account limits or endpoint behaviour that is not described locally). Everything needed to write client code is already in this library.

`llms.txt` is a large (~200 KB) index of links to per-endpoint Markdown pages (`https://docs.dataforseo.com/v3/...md`). Do not read it whole: search it for the endpoint path or name and fetch only the linked page.
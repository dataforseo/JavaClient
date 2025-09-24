## OVERVIEW

This is a Java client providing you, as a developer, with a tool for obtaining the necessary data from DataForSEO APIs. You don't have to figure out how to make a request and process a response - all that is readily available in this client.

[![GitHub issues](https://img.shields.io/github/issues/dataforseo/JavaClient.svg)](https://github.com/dataforseo/JavaClient/issues)
[![GitHub license](https://img.shields.io/github/license/dataforseo/JavaClient.svg)](https://github.com/dataforseo/JavaClient)

DataForSEO API uses REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows using our API with almost any programming language.

Client contains 13 sections (aka APIs):

- AI Optimization API (source docs | api docs)
- SERP ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/SerpApi.md) | [api docs](https://docs.dataforseo.com/v3/serp/overview/?bash))
- Keywords Data ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/KeywordsDataApi.md) | [api docs](https://docs.dataforseo.com/v3/keywords_data/overview/?bash))
- Domain Analytics ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/DomainAnalyticsApi.md) | [api docs](https://docs.dataforseo.com/v3/domain_analytics/overview/?bash))
- DataForSEO Labs ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/DataforseoLabsApi.md) | [api docs](https://docs.dataforseo.com/v3/dataforseo_labs/overview/?bash))
- Backlinks ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/BacklinksApi.md) | [api docs](https://docs.dataforseo.com/v3/backlinks/overview/?bash))
- OnPage ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/OnPageApi.md) | [api docs](https://docs.dataforseo.com/v3/on_page/overview/?bash))
- Content Analysis ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/ContentAnalysisApi.md) | [api docs](https://docs.dataforseo.com/v3/content_analysis/overview/?bash))
- Content Generation ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/ContentGenerationApi.md) | [api docs](https://docs.dataforseo.com/v3/content_generation/overview/?bash))
- Merchant ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/MerchantApi.md) | [api docs](https://docs.dataforseo.com/v3/merchant/overview/?bash))
- App Data ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/AppDataApi.md) | [api docs](https://docs.dataforseo.com/v3/app_data/overview/?bash))
- Business Data ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/BusinessDataApi.md) | [api docs](https://docs.dataforseo.com/v3/business_data/overview/?bash))
- Appendix ([source docs](https://github.com/dataforseo/JavaClient/tree/master/docs/AppendixApi.md) | [api docs](https://docs.dataforseo.com/v3/appendix/user_data/?bash))

API Contains 2 types of requests:
1) Live (Simple HTTP request/response message)
2) Task-based (Requires sending a 'Task' entity to execute, waiting until the 'Task' status is ready, and getting the 'Task' result in a special endpoint. Usually, it is represented by 3 types of endpoints: 'TaskPost', 'TaskReady', and 'TaskGet')

For more details, please follow [here](https://docs.dataforseo.com/v3/?bash)

## YAML Spec

Our API description is based on the Open API [syntax](https://spec.openapis.org/oas/v3.1.0) in YAML format. The YAML file attached to the [project root](https://github.com/dataforseo/OpenApiDocumentation)

## Code generation

Code generated using the [openapi generator cli](https://openapi-generator.tech/docs/installation/)

## Documentation
The documentation for code objects, formatted in Markdown (.md) is available [here](https://github.com/dataforseo/JavaClient/tree/master/docs/).
Official documentation for DataForSEO API is available [here](https://docs.dataforseo.com/v3/?bash).

## Package source
Information about adding the package to your project you can see [here](https://central.sonatype.com/artifact/io.github.dataforseo/dataforseo-client)

## Examples of usage

Example of live request
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
            System.err.println("Exception when calling SerpApi#googleOrganicTaskGetAdvanced");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

Example of Task-based endpoint
```java
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.api.SerpApi;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;

import okhttp3.internal.concurrent.Task;

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

      SerpTaskRequestInfo task = new SerpTaskRequestInfo();

      task.setLocationCode(2840);
      task.setLanguageCode("en");
      task.setKeyword("albert einstein");

      List<SerpTaskRequestInfo> serpTaskRequestInfo = new ArrayList<SerpTaskRequestInfo>();
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
      System.err.println("Exception when calling SerpApi#googleOrganicLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }

  private static boolean GoogleOrganicTaskReady(SerpApi serpApi, String taskId) throws ApiException {

    SerpGoogleOrganicTasksReadyResponseInfo result = serpApi.googleOrganicTasksReady();
    for (SerpGoogleOrganicTasksReadyTask task : result.getTasks()) {
      for (SerpGoogleTasksReadyResultInfo xx : task.getResult()) {
        if (xx.getId().equals(taskId)) {
          return true;
        }
      }
    }

    return false;
  }
}
```

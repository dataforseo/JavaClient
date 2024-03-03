## OVERVIEW

There is a Java client to call DataForSeo API.

DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.

Client contains 12 sections (aka API):
- Serp ([source](https://docs.dataforseo.com/v3/serp/overview/?bash))
- KeywordsData ([source](https://docs.dataforseo.com/v3/keywords_data/overview/?bash))
- DomainAnalytics ([source](https://docs.dataforseo.com/v3/domain_analytics/overview/?bash))
- DataforseoLabs ([source](https://docs.dataforseo.com/v3/dataforseo_labs/overview/?bash))
- Backlinks ([source](https://docs.dataforseo.com/v3/backlinks/overview/?bash))
- OnPage ([source](https://docs.dataforseo.com/v3/on_page/overview/?bash))
- ContentAnalysis ([source](https://docs.dataforseo.com/v3/content_analysis/overview/?bash))
- ContentGeneration ([source](https://docs.dataforseo.com/v3/content_generation/overview/?bash))
- Merchant ([source](https://docs.dataforseo.com/v3/merchant/overview/?bash))
- AppData ([source](https://docs.dataforseo.com/v3/app_data/overview/?bash))
- BusinessData ([source](https://docs.dataforseo.com/v3/business_data/overview/?bash))
- Appendix ([source](https://docs.dataforseo.com/v3/appendix/user_data/?bash))

API Contains 2 types of requests:
1) Live (Simple HTTP request/response message)
2) Task-Based (Where you need to send a 'Task' entity to execute, waiting until the 'Task' status is ready and getting the 'Task' result in a special endpoint. Usually it represents in 3 endpoints 'TaskPost', 'TaskReady' and 'TaskGet')

For more details - please follow [here](https://docs.dataforseo.com/v3/?bash)

## YAML Spec

Our API description is based on open API [syntax](https://spec.openapis.org/oas/v3.1.0) in YAML format. The YAML file attached to the [project root](./openapi_specification.yaml)

## Code generation

Code generated with using [openapi generator cli](https://openapi-generator.tech/docs/installation/)

## documentation
Code Objects documentation in .md format was also generated using 'openapi-generator-cli' and placed [here](./docs)

## package source
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

          SerpTaskRequestInfo task = new SerpTaskRequestInfo();

          task.setLocationCode(2840);
          task.setLanguageCode("en");
          task.setKeyword("albert einstein");
    
          List<SerpTaskRequestInfo> serpTaskRequestInfo = new ArrayList<SerpTaskRequestInfo>();
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

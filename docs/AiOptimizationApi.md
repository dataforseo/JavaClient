# AiOptimizationApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**chatGptLlmScraperLocations**](AiOptimizationApi.md#chatGptLlmScraperLocations) | **GET**  /v3/ai_optimization/chat_gpt/llm_scraper/locations  |
| [**chatGptLlmScraperLocationsCountry**](AiOptimizationApi.md#chatGptLlmScraperLocationsCountry) | **GET**  /v3/ai_optimization/chat_gpt/llm_scraper/locations/{country}  |
| [**chatGptLlmScraperLanguages**](AiOptimizationApi.md#chatGptLlmScraperLanguages) | **GET**  /v3/ai_optimization/chat_gpt/llm_scraper/languages  |
| [**chatGptLlmScraperTaskPost**](AiOptimizationApi.md#chatGptLlmScraperTaskPost) | **POST**  /v3/ai_optimization/chat_gpt/llm_scraper/task_post  |
| [**chatGptLlmScraperTasksReady**](AiOptimizationApi.md#chatGptLlmScraperTasksReady) | **GET**  /v3/ai_optimization/chat_gpt/llm_scraper/tasks_ready  |
| [**chatGptLlmScraperTaskGetAdvanced**](AiOptimizationApi.md#chatGptLlmScraperTaskGetAdvanced) | **GET**  /v3/ai_optimization/chat_gpt/llm_scraper/task_get/advanced/{id}  |
| [**chatGptLlmScraperTaskGetHtml**](AiOptimizationApi.md#chatGptLlmScraperTaskGetHtml) | **GET**  /v3/ai_optimization/chat_gpt/llm_scraper/task_get/html/{id}  |
| [**chatGptLlmScraperLiveAdvanced**](AiOptimizationApi.md#chatGptLlmScraperLiveAdvanced) | **POST**  /v3/ai_optimization/chat_gpt/llm_scraper/live/advanced  |
| [**chatGptLlmScraperLiveHtml**](AiOptimizationApi.md#chatGptLlmScraperLiveHtml) | **POST**  /v3/ai_optimization/chat_gpt/llm_scraper/live/html  |
| [**chatGptLlmResponsesModels**](AiOptimizationApi.md#chatGptLlmResponsesModels) | **GET**  /v3/ai_optimization/chat_gpt/llm_responses/models  |
| [**chatGptLlmResponsesLive**](AiOptimizationApi.md#chatGptLlmResponsesLive) | **POST**  /v3/ai_optimization/chat_gpt/llm_responses/live  |
| [**chatGptLlmResponsesTaskPost**](AiOptimizationApi.md#chatGptLlmResponsesTaskPost) | **POST**  /v3/ai_optimization/chat_gpt/llm_responses/task_post  |
| [**chatGptLlmResponsesTasksReady**](AiOptimizationApi.md#chatGptLlmResponsesTasksReady) | **GET**  /v3/ai_optimization/chat_gpt/llm_responses/tasks_ready  |
| [**chatGptLlmResponsesTaskGet**](AiOptimizationApi.md#chatGptLlmResponsesTaskGet) | **GET**  /v3/ai_optimization/chat_gpt/llm_responses/task_get/{id}  |
| [**claudeLlmResponsesModels**](AiOptimizationApi.md#claudeLlmResponsesModels) | **GET**  /v3/ai_optimization/claude/llm_responses/models  |
| [**claudeLlmResponsesLive**](AiOptimizationApi.md#claudeLlmResponsesLive) | **POST**  /v3/ai_optimization/claude/llm_responses/live  |
| [**claudeLlmResponsesTaskPost**](AiOptimizationApi.md#claudeLlmResponsesTaskPost) | **POST**  /v3/ai_optimization/claude/llm_responses/task_post  |
| [**claudeLlmResponsesTasksReady**](AiOptimizationApi.md#claudeLlmResponsesTasksReady) | **GET**  /v3/ai_optimization/claude/llm_responses/tasks_ready  |
| [**claudeLlmResponsesTaskGet**](AiOptimizationApi.md#claudeLlmResponsesTaskGet) | **GET**  /v3/ai_optimization/claude/llm_responses/task_get/{id}  |
| [**geminiLlmResponsesModels**](AiOptimizationApi.md#geminiLlmResponsesModels) | **GET**  /v3/ai_optimization/gemini/llm_responses/models  |
| [**geminiLlmResponsesTaskPost**](AiOptimizationApi.md#geminiLlmResponsesTaskPost) | **POST**  /v3/ai_optimization/gemini/llm_responses/task_post  |
| [**geminiLlmResponsesTasksReady**](AiOptimizationApi.md#geminiLlmResponsesTasksReady) | **GET**  /v3/ai_optimization/gemini/llm_responses/tasks_ready  |
| [**geminiLlmResponsesTaskGet**](AiOptimizationApi.md#geminiLlmResponsesTaskGet) | **GET**  /v3/ai_optimization/gemini/llm_responses/task_get/{id}  |
| [**geminiLlmResponsesLive**](AiOptimizationApi.md#geminiLlmResponsesLive) | **POST**  /v3/ai_optimization/gemini/llm_responses/live  |
| [**geminiLlmScraperLocations**](AiOptimizationApi.md#geminiLlmScraperLocations) | **GET**  /v3/ai_optimization/gemini/llm_scraper/locations  |
| [**geminiLlmScraperLanguages**](AiOptimizationApi.md#geminiLlmScraperLanguages) | **GET**  /v3/ai_optimization/gemini/llm_scraper/languages  |
| [**geminiLlmScraperTaskPost**](AiOptimizationApi.md#geminiLlmScraperTaskPost) | **POST**  /v3/ai_optimization/gemini/llm_scraper/task_post  |
| [**geminiLlmScraperTasksReady**](AiOptimizationApi.md#geminiLlmScraperTasksReady) | **GET**  /v3/ai_optimization/gemini/llm_scraper/tasks_ready  |
| [**geminiLlmScraperTaskGetAdvanced**](AiOptimizationApi.md#geminiLlmScraperTaskGetAdvanced) | **GET**  /v3/ai_optimization/gemini/llm_scraper/task_get/advanced/{id}  |
| [**geminiLlmScraperTaskGetHtml**](AiOptimizationApi.md#geminiLlmScraperTaskGetHtml) | **GET**  /v3/ai_optimization/gemini/llm_scraper/task_get/html/{id}  |
| [**geminiLlmScraperLiveAdvanced**](AiOptimizationApi.md#geminiLlmScraperLiveAdvanced) | **POST**  /v3/ai_optimization/gemini/llm_scraper/live/advanced  |
| [**geminiLlmScraperLiveHtml**](AiOptimizationApi.md#geminiLlmScraperLiveHtml) | **POST**  /v3/ai_optimization/gemini/llm_scraper/live/html  |
| [**perplexityLlmResponsesModels**](AiOptimizationApi.md#perplexityLlmResponsesModels) | **GET**  /v3/ai_optimization/perplexity/llm_responses/models  |
| [**perplexityLlmResponsesLive**](AiOptimizationApi.md#perplexityLlmResponsesLive) | **POST**  /v3/ai_optimization/perplexity/llm_responses/live  |
| [**aiKeywordDataAvailableFilters**](AiOptimizationApi.md#aiKeywordDataAvailableFilters) | **GET**  /v3/ai_optimization/ai_keyword_data/available_filters  |
| [**aiKeywordDataLocationsAndLanguages**](AiOptimizationApi.md#aiKeywordDataLocationsAndLanguages) | **GET**  /v3/ai_optimization/ai_keyword_data/locations_and_languages  |
| [**aiKeywordDataKeywordsSearchVolumeLive**](AiOptimizationApi.md#aiKeywordDataKeywordsSearchVolumeLive) | **POST**  /v3/ai_optimization/ai_keyword_data/keywords_search_volume/live  |
| [**llmMentionsAvailableFilters**](AiOptimizationApi.md#llmMentionsAvailableFilters) | **GET**  /v3/ai_optimization/llm_mentions/available_filters  |
| [**llmMentionsLocationsAndLanguages**](AiOptimizationApi.md#llmMentionsLocationsAndLanguages) | **GET**  /v3/ai_optimization/llm_mentions/locations_and_languages  |
| [**llmMentionsSearchMentionsLive**](AiOptimizationApi.md#llmMentionsSearchMentionsLive) | **POST**  /v3/ai_optimization/llm_mentions/search_mentions/live  |
| [**llmMentionsTargetMetricsLive**](AiOptimizationApi.md#llmMentionsTargetMetricsLive) | **POST**  /v3/ai_optimization/llm_mentions/target_metrics/live  |
| [**llmMentionsMultiTargetMetricsLive**](AiOptimizationApi.md#llmMentionsMultiTargetMetricsLive) | **POST**  /v3/ai_optimization/llm_mentions/multi_target_metrics/live  |
| [**llmMentionsTopMentionedDomainsLive**](AiOptimizationApi.md#llmMentionsTopMentionedDomainsLive) | **POST**  /v3/ai_optimization/llm_mentions/top_mentioned_domains/live  |
| [**llmMentionsTopMentionedPagesLive**](AiOptimizationApi.md#llmMentionsTopMentionedPagesLive) | **POST**  /v3/ai_optimization/llm_mentions/top_mentioned_pages/live  |
| [**llmMentionsTopMentionedBrandsLive**](AiOptimizationApi.md#llmMentionsTopMentionedBrandsLive) | **POST**  /v3/ai_optimization/llm_mentions/top_mentioned_brands/live  |
| [**llmMentionsTopMentionedBrandCategoriesLive**](AiOptimizationApi.md#llmMentionsTopMentionedBrandCategoriesLive) | **POST**  /v3/ai_optimization/llm_mentions/top_mentioned_brand_categories/live  |
| [**llmMentionsTargetMetricsLiteLive**](AiOptimizationApi.md#llmMentionsTargetMetricsLiteLive) | **POST**  /v3/ai_optimization/llm_mentions/target_metrics_lite/live  |
| [**llmMentionsTopMentionedDomainsLiteLive**](AiOptimizationApi.md#llmMentionsTopMentionedDomainsLiteLive) | **POST**  /v3/ai_optimization/llm_mentions/top_mentioned_domains_lite/live  |
| [**llmMentionsTopMentionedPagesLiteLive**](AiOptimizationApi.md#llmMentionsTopMentionedPagesLiteLive) | **POST**  /v3/ai_optimization/llm_mentions/top_mentioned_pages_lite/live  |
| [**llmMentionsTopMentionedBrandsLiteLive**](AiOptimizationApi.md#llmMentionsTopMentionedBrandsLiteLive) | **POST**  /v3/ai_optimization/llm_mentions/top_mentioned_brands_lite/live  |
| [**llmMentionsTopMentionedBrandCategoriesLiteLive**](AiOptimizationApi.md#llmMentionsTopMentionedBrandCategoriesLiteLive) | **POST**  /v3/ai_optimization/llm_mentions/top_mentioned_brand_categories_lite/live  |
| [**llmMentionsHistoricalLive**](AiOptimizationApi.md#llmMentionsHistoricalLive) | **POST**  /v3/ai_optimization/llm_mentions/historical/live  |
| [**llmMentionsTimeseriesDeltaLive**](AiOptimizationApi.md#llmMentionsTimeseriesDeltaLive) | **POST**  /v3/ai_optimization/llm_mentions/timeseries_delta/live  |
| [**llmMentionsTimeseriesNewLostLive**](AiOptimizationApi.md#llmMentionsTimeseriesNewLostLive) | **POST**  /v3/ai_optimization/llm_mentions/timeseries_new_lost/live  |

<a id="chatGptLlmScraperLocations"></a>
# **chatGptLlmScraperLocations**
> AiOptimizationChatGptLlmScraperLocationsResponseInfo chatGptLlmScraperLocations()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationChatGptLlmScraperLocationsResponseInfo response = apiInstance.chatGptLlmScraperLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmScraperLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationChatGptLlmScraperLocationsResponseInfo**](AiOptimizationChatGptLlmScraperLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmScraperLocationsCountry"></a>
# **chatGptLlmScraperLocationsCountry**
> AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo chatGptLlmScraperLocationsCountry()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    String country = "us";
    AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo response = apiInstance.chatGptLlmScraperLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmScraperLocationsCountry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo**](AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmScraperLanguages"></a>
# **chatGptLlmScraperLanguages**
> AiOptimizationChatGptLlmScraperLanguagesResponseInfo chatGptLlmScraperLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationChatGptLlmScraperLanguagesResponseInfo response = apiInstance.chatGptLlmScraperLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmScraperLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationChatGptLlmScraperLanguagesResponseInfo**](AiOptimizationChatGptLlmScraperLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmScraperTaskPost"></a>
# **chatGptLlmScraperTaskPost**
> AiOptimizationChatGptLlmScraperTaskPostResponseInfo chatGptLlmScraperTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationChatGptLlmScraperTaskPostRequestInfo model = new AiOptimizationChatGptLlmScraperTaskPostRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .keyword("what is chatgpt");
    AiOptimizationChatGptLlmScraperTaskPostResponseInfo response = apiInstance.chatGptLlmScraperTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmScraperTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationChatGptLlmScraperTaskPostRequestInfo>&gt;**](List<AiOptimizationChatGptLlmScraperTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationChatGptLlmScraperTaskPostResponseInfo**](AiOptimizationChatGptLlmScraperTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmScraperTasksReady"></a>
# **chatGptLlmScraperTasksReady**
> AiOptimizationChatGptLlmScraperTasksReadyResponseInfo chatGptLlmScraperTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationChatGptLlmScraperTasksReadyResponseInfo response = apiInstance.chatGptLlmScraperTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmScraperTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationChatGptLlmScraperTasksReadyResponseInfo**](AiOptimizationChatGptLlmScraperTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmScraperTaskGetAdvanced"></a>
# **chatGptLlmScraperTaskGetAdvanced**
> AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo chatGptLlmScraperTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo response = apiInstance.chatGptLlmScraperTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmScraperTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo**](AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmScraperTaskGetHtml"></a>
# **chatGptLlmScraperTaskGetHtml**
> AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo chatGptLlmScraperTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo response = apiInstance.chatGptLlmScraperTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmScraperTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo**](AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmScraperLiveAdvanced"></a>
# **chatGptLlmScraperLiveAdvanced**
> AiOptimizationChatGptLlmScraperLiveAdvancedResponseInfo chatGptLlmScraperLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo model = new AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .keyword("albert einstein");
    AiOptimizationChatGptLlmScraperLiveAdvancedResponseInfo response = apiInstance.chatGptLlmScraperLiveAdvanced(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmScraperLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo>&gt;**](List<AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationChatGptLlmScraperLiveAdvancedResponseInfo**](AiOptimizationChatGptLlmScraperLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmScraperLiveHtml"></a>
# **chatGptLlmScraperLiveHtml**
> AiOptimizationChatGptLlmScraperLiveHtmlResponseInfo chatGptLlmScraperLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationChatGptLlmScraperLiveHtmlRequestInfo model = new AiOptimizationChatGptLlmScraperLiveHtmlRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .keyword("albert einstein");
    AiOptimizationChatGptLlmScraperLiveHtmlResponseInfo response = apiInstance.chatGptLlmScraperLiveHtml(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmScraperLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationChatGptLlmScraperLiveHtmlRequestInfo>&gt;**](List<AiOptimizationChatGptLlmScraperLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationChatGptLlmScraperLiveHtmlResponseInfo**](AiOptimizationChatGptLlmScraperLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmResponsesModels"></a>
# **chatGptLlmResponsesModels**
> AiOptimizationChatGptLlmResponsesModelsResponseInfo chatGptLlmResponsesModels()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationChatGptLlmResponsesModelsResponseInfo response = apiInstance.chatGptLlmResponsesModels();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmResponsesModels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationChatGptLlmResponsesModelsResponseInfo**](AiOptimizationChatGptLlmResponsesModelsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmResponsesLive"></a>
# **chatGptLlmResponsesLive**
> AiOptimizationChatGptLlmResponsesLiveResponseInfo chatGptLlmResponsesLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationChatGptLlmResponsesLiveRequestInfo model = new AiOptimizationChatGptLlmResponsesLiveRequestInfo()
           .systemMessage("communicate as if we are in a business meeting")
           .messageChain(
               List.of(
                   ,
               
                ))
           .maxOutputTokens(200)
           .temperature(0.3d)
           .topP(0.5d)
           .modelName("gpt-4.1-mini")
           .webSearch(true)
           .webSearchCountryIsoCode("FR")
           .webSearchCity("Paris")
           .userPrompt("provide information on how relevant the amusement park business is in France now");
    AiOptimizationChatGptLlmResponsesLiveResponseInfo response = apiInstance.chatGptLlmResponsesLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmResponsesLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationChatGptLlmResponsesLiveRequestInfo>&gt;**](List<AiOptimizationChatGptLlmResponsesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationChatGptLlmResponsesLiveResponseInfo**](AiOptimizationChatGptLlmResponsesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmResponsesTaskPost"></a>
# **chatGptLlmResponsesTaskPost**
> AiOptimizationChatGptLlmResponsesTaskPostResponseInfo chatGptLlmResponsesTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationChatGptLlmResponsesTaskPostRequestInfo model = new AiOptimizationChatGptLlmResponsesTaskPostRequestInfo()
           .systemMessage("communicate as if we are in a business meeting")
           .messageChain(
               List.of(
                   ,
               
                ))
           .modelName("gpt-4.1-mini")
           .userPrompt("provide information on how relevant the amusement park business is in France now");
    AiOptimizationChatGptLlmResponsesTaskPostResponseInfo response = apiInstance.chatGptLlmResponsesTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmResponsesTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationChatGptLlmResponsesTaskPostRequestInfo>&gt;**](List<AiOptimizationChatGptLlmResponsesTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationChatGptLlmResponsesTaskPostResponseInfo**](AiOptimizationChatGptLlmResponsesTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmResponsesTasksReady"></a>
# **chatGptLlmResponsesTasksReady**
> AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo chatGptLlmResponsesTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo response = apiInstance.chatGptLlmResponsesTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmResponsesTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo**](AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="chatGptLlmResponsesTaskGet"></a>
# **chatGptLlmResponsesTaskGet**
> AiOptimizationChatGptLlmResponsesTaskGetResponseInfo chatGptLlmResponsesTaskGet()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    AiOptimizationChatGptLlmResponsesTaskGetResponseInfo response = apiInstance.chatGptLlmResponsesTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#chatGptLlmResponsesTaskGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationChatGptLlmResponsesTaskGetResponseInfo**](AiOptimizationChatGptLlmResponsesTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="claudeLlmResponsesModels"></a>
# **claudeLlmResponsesModels**
> AiOptimizationClaudeLlmResponsesModelsResponseInfo claudeLlmResponsesModels()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationClaudeLlmResponsesModelsResponseInfo response = apiInstance.claudeLlmResponsesModels();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#claudeLlmResponsesModels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationClaudeLlmResponsesModelsResponseInfo**](AiOptimizationClaudeLlmResponsesModelsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="claudeLlmResponsesLive"></a>
# **claudeLlmResponsesLive**
> AiOptimizationClaudeLlmResponsesLiveResponseInfo claudeLlmResponsesLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationClaudeLlmResponsesLiveRequestInfo model = new AiOptimizationClaudeLlmResponsesLiveRequestInfo()
           .systemMessage("communicate as if we are in a business meeting")
           .messageChain(
               List.of(
                   ,
               
                ))
           .maxOutputTokens(200)
           .modelName("claude-opus-4-0")
           .temperature(0.3d)
           .webSearch(true)
           .webSearchCountryIsoCode("FR")
           .userPrompt("provide information on how relevant the amusement park business is in France now");
    AiOptimizationClaudeLlmResponsesLiveResponseInfo response = apiInstance.claudeLlmResponsesLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#claudeLlmResponsesLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationClaudeLlmResponsesLiveRequestInfo>&gt;**](List<AiOptimizationClaudeLlmResponsesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationClaudeLlmResponsesLiveResponseInfo**](AiOptimizationClaudeLlmResponsesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="claudeLlmResponsesTaskPost"></a>
# **claudeLlmResponsesTaskPost**
> AiOptimizationClaudeLlmResponsesTaskPostResponseInfo claudeLlmResponsesTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationClaudeLlmResponsesTaskPostRequestInfo model = new AiOptimizationClaudeLlmResponsesTaskPostRequestInfo()
           .systemMessage("communicate as if we are in a business meeting")
           .messageChain(
               List.of(
                   ,
               
                ))
           .maxOutputTokens(1024)
           .temperature(0.3d)
           .webSearchCountryIsoCode("FR")
           .modelName("claude-sonnet-4-0")
           .webSearch(true)
           .userPrompt("provide information on how relevant the amusement park business is in France now");
    AiOptimizationClaudeLlmResponsesTaskPostResponseInfo response = apiInstance.claudeLlmResponsesTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#claudeLlmResponsesTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationClaudeLlmResponsesTaskPostRequestInfo>&gt;**](List<AiOptimizationClaudeLlmResponsesTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationClaudeLlmResponsesTaskPostResponseInfo**](AiOptimizationClaudeLlmResponsesTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="claudeLlmResponsesTasksReady"></a>
# **claudeLlmResponsesTasksReady**
> AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo claudeLlmResponsesTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo response = apiInstance.claudeLlmResponsesTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#claudeLlmResponsesTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo**](AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="claudeLlmResponsesTaskGet"></a>
# **claudeLlmResponsesTaskGet**
> AiOptimizationClaudeLlmResponsesTaskGetResponseInfo claudeLlmResponsesTaskGet()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    AiOptimizationClaudeLlmResponsesTaskGetResponseInfo response = apiInstance.claudeLlmResponsesTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#claudeLlmResponsesTaskGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationClaudeLlmResponsesTaskGetResponseInfo**](AiOptimizationClaudeLlmResponsesTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmResponsesModels"></a>
# **geminiLlmResponsesModels**
> AiOptimizationGeminiLlmResponsesModelsResponseInfo geminiLlmResponsesModels()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationGeminiLlmResponsesModelsResponseInfo response = apiInstance.geminiLlmResponsesModels();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmResponsesModels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationGeminiLlmResponsesModelsResponseInfo**](AiOptimizationGeminiLlmResponsesModelsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmResponsesTaskPost"></a>
# **geminiLlmResponsesTaskPost**
> AiOptimizationGeminiLlmResponsesTaskPostResponseInfo geminiLlmResponsesTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationGeminiLlmResponsesTaskPostRequestInfo model = new AiOptimizationGeminiLlmResponsesTaskPostRequestInfo()
           .systemMessage("communicate as if we are in a business meeting")
           .messageChain(
               List.of(
                   ,
               
                ))
           .modelName("gemini-2.5-flash")
           .userPrompt("provide information on how relevant the amusement park business is in France now");
    AiOptimizationGeminiLlmResponsesTaskPostResponseInfo response = apiInstance.geminiLlmResponsesTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmResponsesTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationGeminiLlmResponsesTaskPostRequestInfo>&gt;**](List<AiOptimizationGeminiLlmResponsesTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationGeminiLlmResponsesTaskPostResponseInfo**](AiOptimizationGeminiLlmResponsesTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmResponsesTasksReady"></a>
# **geminiLlmResponsesTasksReady**
> AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo geminiLlmResponsesTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo response = apiInstance.geminiLlmResponsesTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmResponsesTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo**](AiOptimizationGeminiLlmResponsesTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmResponsesTaskGet"></a>
# **geminiLlmResponsesTaskGet**
> AiOptimizationGeminiLlmResponsesTaskGetResponseInfo geminiLlmResponsesTaskGet()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    AiOptimizationGeminiLlmResponsesTaskGetResponseInfo response = apiInstance.geminiLlmResponsesTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmResponsesTaskGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationGeminiLlmResponsesTaskGetResponseInfo**](AiOptimizationGeminiLlmResponsesTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmResponsesLive"></a>
# **geminiLlmResponsesLive**
> AiOptimizationGeminiLlmResponsesLiveResponseInfo geminiLlmResponsesLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationGeminiLlmResponsesLiveRequestInfo model = new AiOptimizationGeminiLlmResponsesLiveRequestInfo()
           .systemMessage("communicate as if we are in a business meeting")
           .messageChain(
               List.of(
                   ,
               
                ))
           .maxOutputTokens(200)
           .temperature(0.3d)
           .topP(0.5d)
           .modelName("gemini-2.5-flash")
           .webSearch(true)
           .userPrompt("provide information on how relevant the amusement park business is in France now");
    AiOptimizationGeminiLlmResponsesLiveResponseInfo response = apiInstance.geminiLlmResponsesLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmResponsesLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationGeminiLlmResponsesLiveRequestInfo>&gt;**](List<AiOptimizationGeminiLlmResponsesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationGeminiLlmResponsesLiveResponseInfo**](AiOptimizationGeminiLlmResponsesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmScraperLocations"></a>
# **geminiLlmScraperLocations**
> AiOptimizationGeminiLlmScraperLocationsResponseInfo geminiLlmScraperLocations()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationGeminiLlmScraperLocationsResponseInfo response = apiInstance.geminiLlmScraperLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmScraperLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationGeminiLlmScraperLocationsResponseInfo**](AiOptimizationGeminiLlmScraperLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmScraperLanguages"></a>
# **geminiLlmScraperLanguages**
> AiOptimizationGeminiLlmScraperLanguagesResponseInfo geminiLlmScraperLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationGeminiLlmScraperLanguagesResponseInfo response = apiInstance.geminiLlmScraperLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmScraperLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationGeminiLlmScraperLanguagesResponseInfo**](AiOptimizationGeminiLlmScraperLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmScraperTaskPost"></a>
# **geminiLlmScraperTaskPost**
> AiOptimizationGeminiLlmScraperTaskPostResponseInfo geminiLlmScraperTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationGeminiLlmScraperTaskPostRequestInfo model = new AiOptimizationGeminiLlmScraperTaskPostRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .keyword("albert einstein");
    AiOptimizationGeminiLlmScraperTaskPostResponseInfo response = apiInstance.geminiLlmScraperTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmScraperTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationGeminiLlmScraperTaskPostRequestInfo>&gt;**](List<AiOptimizationGeminiLlmScraperTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationGeminiLlmScraperTaskPostResponseInfo**](AiOptimizationGeminiLlmScraperTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmScraperTasksReady"></a>
# **geminiLlmScraperTasksReady**
> AiOptimizationGeminiLlmScraperTasksReadyResponseInfo geminiLlmScraperTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationGeminiLlmScraperTasksReadyResponseInfo response = apiInstance.geminiLlmScraperTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmScraperTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationGeminiLlmScraperTasksReadyResponseInfo**](AiOptimizationGeminiLlmScraperTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmScraperTaskGetAdvanced"></a>
# **geminiLlmScraperTaskGetAdvanced**
> AiOptimizationGeminiLlmScraperTaskGetAdvancedResponseInfo geminiLlmScraperTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    AiOptimizationGeminiLlmScraperTaskGetAdvancedResponseInfo response = apiInstance.geminiLlmScraperTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmScraperTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationGeminiLlmScraperTaskGetAdvancedResponseInfo**](AiOptimizationGeminiLlmScraperTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmScraperTaskGetHtml"></a>
# **geminiLlmScraperTaskGetHtml**
> AiOptimizationGeminiLlmScraperTaskGetHtmlResponseInfo geminiLlmScraperTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    AiOptimizationGeminiLlmScraperTaskGetHtmlResponseInfo response = apiInstance.geminiLlmScraperTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmScraperTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationGeminiLlmScraperTaskGetHtmlResponseInfo**](AiOptimizationGeminiLlmScraperTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmScraperLiveAdvanced"></a>
# **geminiLlmScraperLiveAdvanced**
> AiOptimizationGeminiLlmScraperLiveAdvancedResponseInfo geminiLlmScraperLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationGeminiLlmScraperLiveAdvancedRequestInfo model = new AiOptimizationGeminiLlmScraperLiveAdvancedRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .keyword("albert einstein");
    AiOptimizationGeminiLlmScraperLiveAdvancedResponseInfo response = apiInstance.geminiLlmScraperLiveAdvanced(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmScraperLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationGeminiLlmScraperLiveAdvancedRequestInfo>&gt;**](List<AiOptimizationGeminiLlmScraperLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationGeminiLlmScraperLiveAdvancedResponseInfo**](AiOptimizationGeminiLlmScraperLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="geminiLlmScraperLiveHtml"></a>
# **geminiLlmScraperLiveHtml**
> AiOptimizationGeminiLlmScraperLiveHtmlResponseInfo geminiLlmScraperLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationGeminiLlmScraperLiveHtmlRequestInfo model = new AiOptimizationGeminiLlmScraperLiveHtmlRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .keyword("albert einstein");
    AiOptimizationGeminiLlmScraperLiveHtmlResponseInfo response = apiInstance.geminiLlmScraperLiveHtml(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#geminiLlmScraperLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationGeminiLlmScraperLiveHtmlRequestInfo>&gt;**](List<AiOptimizationGeminiLlmScraperLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationGeminiLlmScraperLiveHtmlResponseInfo**](AiOptimizationGeminiLlmScraperLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="perplexityLlmResponsesModels"></a>
# **perplexityLlmResponsesModels**
> AiOptimizationPerplexityLlmResponsesModelsResponseInfo perplexityLlmResponsesModels()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationPerplexityLlmResponsesModelsResponseInfo response = apiInstance.perplexityLlmResponsesModels();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#perplexityLlmResponsesModels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationPerplexityLlmResponsesModelsResponseInfo**](AiOptimizationPerplexityLlmResponsesModelsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="perplexityLlmResponsesLive"></a>
# **perplexityLlmResponsesLive**
> AiOptimizationPerplexityLlmResponsesLiveResponseInfo perplexityLlmResponsesLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationPerplexityLlmResponsesLiveRequestInfo model = new AiOptimizationPerplexityLlmResponsesLiveRequestInfo()
           .systemMessage("communicate as if we are in a business meeting")
           .messageChain(
               List.of(
                   ,
               
                ))
           .maxOutputTokens(200)
           .temperature(0.3d)
           .topP(0.5d)
           .webSearchCountryIsoCode("FR")
           .modelName("sonar")
           .userPrompt("provide information on how relevant the amusement park business is in France now");
    AiOptimizationPerplexityLlmResponsesLiveResponseInfo response = apiInstance.perplexityLlmResponsesLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#perplexityLlmResponsesLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationPerplexityLlmResponsesLiveRequestInfo>&gt;**](List<AiOptimizationPerplexityLlmResponsesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationPerplexityLlmResponsesLiveResponseInfo**](AiOptimizationPerplexityLlmResponsesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="aiKeywordDataAvailableFilters"></a>
# **aiKeywordDataAvailableFilters**
> AiOptimizationAiKeywordDataAvailableFiltersResponseInfo aiKeywordDataAvailableFilters()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationAiKeywordDataAvailableFiltersResponseInfo response = apiInstance.aiKeywordDataAvailableFilters();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#aiKeywordDataAvailableFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationAiKeywordDataAvailableFiltersResponseInfo**](AiOptimizationAiKeywordDataAvailableFiltersResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="aiKeywordDataLocationsAndLanguages"></a>
# **aiKeywordDataLocationsAndLanguages**
> AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo aiKeywordDataLocationsAndLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo response = apiInstance.aiKeywordDataLocationsAndLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#aiKeywordDataLocationsAndLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo**](AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="aiKeywordDataKeywordsSearchVolumeLive"></a>
# **aiKeywordDataKeywordsSearchVolumeLive**
> AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo aiKeywordDataKeywordsSearchVolumeLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo model = new AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo()
           .languageName("English")
           .locationCode(2840)
           .keywords(
               List.of(
                   "iphone",
                   "seo"
                ));
    AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo response = apiInstance.aiKeywordDataKeywordsSearchVolumeLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#aiKeywordDataKeywordsSearchVolumeLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo>&gt;**](List<AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo**](AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsAvailableFilters"></a>
# **llmMentionsAvailableFilters**
> AiOptimizationLlmMentionsAvailableFiltersResponseInfo llmMentionsAvailableFilters()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationLlmMentionsAvailableFiltersResponseInfo response = apiInstance.llmMentionsAvailableFilters();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsAvailableFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationLlmMentionsAvailableFiltersResponseInfo**](AiOptimizationLlmMentionsAvailableFiltersResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsLocationsAndLanguages"></a>
# **llmMentionsLocationsAndLanguages**
> AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo llmMentionsLocationsAndLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

    AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo response = apiInstance.llmMentionsLocationsAndLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsLocationsAndLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo**](AiOptimizationLlmMentionsLocationsAndLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsSearchMentionsLive"></a>
# **llmMentionsSearchMentionsLive**
> AiOptimizationLlmMentionsSearchMentionsLiveResponseInfo llmMentionsSearchMentionsLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsSearchMentionsLiveRequestInfo model = new AiOptimizationLlmMentionsSearchMentionsLiveRequestInfo()
           .languageName("English")
           .locationCode(2840)
           .target(
               List.of(
                   ,
               
                ))
           .platform("google")
           .filters(
               List.of(
               
                ))
           .orderBy(
               List.of(
                   "ai_search_volume,desc"
                ))
           .offset(0)
           .limit(3);
    AiOptimizationLlmMentionsSearchMentionsLiveResponseInfo response = apiInstance.llmMentionsSearchMentionsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsSearchMentionsLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsSearchMentionsLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsSearchMentionsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsSearchMentionsLiveResponseInfo**](AiOptimizationLlmMentionsSearchMentionsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTargetMetricsLive"></a>
# **llmMentionsTargetMetricsLive**
> AiOptimizationLlmMentionsTargetMetricsLiveResponseInfo llmMentionsTargetMetricsLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTargetMetricsLiveRequestInfo model = new AiOptimizationLlmMentionsTargetMetricsLiveRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .platform("chat_gpt")
           .target(
               List.of(
                   ,
               
                ))
           .initialDatasetFilters(
               List.of(
               
                ))
           .internalListLimit(10);
    AiOptimizationLlmMentionsTargetMetricsLiveResponseInfo response = apiInstance.llmMentionsTargetMetricsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTargetMetricsLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTargetMetricsLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTargetMetricsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTargetMetricsLiveResponseInfo**](AiOptimizationLlmMentionsTargetMetricsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsMultiTargetMetricsLive"></a>
# **llmMentionsMultiTargetMetricsLive**
> AiOptimizationLlmMentionsMultiTargetMetricsLiveResponseInfo llmMentionsMultiTargetMetricsLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsMultiTargetMetricsLiveRequestInfo model = new AiOptimizationLlmMentionsMultiTargetMetricsLiveRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .platform("google")
           .targets(
               List.of(
                   ,
                   ,
                   ,
               
                ))
           .initialDatasetFilters(
               List.of(
               
                ))
           .internalListLimit(5);
    AiOptimizationLlmMentionsMultiTargetMetricsLiveResponseInfo response = apiInstance.llmMentionsMultiTargetMetricsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsMultiTargetMetricsLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsMultiTargetMetricsLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsMultiTargetMetricsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsMultiTargetMetricsLiveResponseInfo**](AiOptimizationLlmMentionsMultiTargetMetricsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTopMentionedDomainsLive"></a>
# **llmMentionsTopMentionedDomainsLive**
> AiOptimizationLlmMentionsTopMentionedDomainsLiveResponseInfo llmMentionsTopMentionedDomainsLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTopMentionedDomainsLiveRequestInfo model = new AiOptimizationLlmMentionsTopMentionedDomainsLiveRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .platform("chat_gpt")
           .target(
               List.of(
                   ,
               
                ))
           .linksScope("sources")
           .initialDatasetFilters(
               List.of(
               
                ))
           .limit(3)
           .internalListLimit(2);
    AiOptimizationLlmMentionsTopMentionedDomainsLiveResponseInfo response = apiInstance.llmMentionsTopMentionedDomainsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTopMentionedDomainsLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTopMentionedDomainsLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTopMentionedDomainsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTopMentionedDomainsLiveResponseInfo**](AiOptimizationLlmMentionsTopMentionedDomainsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTopMentionedPagesLive"></a>
# **llmMentionsTopMentionedPagesLive**
> AiOptimizationLlmMentionsTopMentionedPagesLiveResponseInfo llmMentionsTopMentionedPagesLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTopMentionedPagesLiveRequestInfo model = new AiOptimizationLlmMentionsTopMentionedPagesLiveRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .platform("chat_gpt")
           .target(
               List.of(
                   ,
               
                ))
           .linksScope("sources")
           .initialDatasetFilters(
               List.of(
               
                ))
           .limit(3)
           .internalListLimit(2);
    AiOptimizationLlmMentionsTopMentionedPagesLiveResponseInfo response = apiInstance.llmMentionsTopMentionedPagesLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTopMentionedPagesLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTopMentionedPagesLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTopMentionedPagesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTopMentionedPagesLiveResponseInfo**](AiOptimizationLlmMentionsTopMentionedPagesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTopMentionedBrandsLive"></a>
# **llmMentionsTopMentionedBrandsLive**
> AiOptimizationLlmMentionsTopMentionedBrandsLiveResponseInfo llmMentionsTopMentionedBrandsLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTopMentionedBrandsLiveRequestInfo model = new AiOptimizationLlmMentionsTopMentionedBrandsLiveRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .platform("chat_gpt")
           .target(
               List.of(
                   ,
               
                ))
           .initialDatasetFilters(
               List.of(
               
                ))
           .limit(3)
           .internalListLimit(2);
    AiOptimizationLlmMentionsTopMentionedBrandsLiveResponseInfo response = apiInstance.llmMentionsTopMentionedBrandsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTopMentionedBrandsLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTopMentionedBrandsLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTopMentionedBrandsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTopMentionedBrandsLiveResponseInfo**](AiOptimizationLlmMentionsTopMentionedBrandsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTopMentionedBrandCategoriesLive"></a>
# **llmMentionsTopMentionedBrandCategoriesLive**
> AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiveResponseInfo llmMentionsTopMentionedBrandCategoriesLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiveRequestInfo model = new AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiveRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .platform("chat_gpt")
           .target(
               List.of(
                   ,
               
                ))
           .initialDatasetFilters(
               List.of(
               
                ))
           .limit(3)
           .internalListLimit(2);
    AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiveResponseInfo response = apiInstance.llmMentionsTopMentionedBrandCategoriesLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTopMentionedBrandCategoriesLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiveResponseInfo**](AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTargetMetricsLiteLive"></a>
# **llmMentionsTargetMetricsLiteLive**
> AiOptimizationLlmMentionsTargetMetricsLiteLiveResponseInfo llmMentionsTargetMetricsLiteLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTargetMetricsLiteLiveRequestInfo model = new AiOptimizationLlmMentionsTargetMetricsLiteLiveRequestInfo()
           .languageCode("es")
           .locationCode(2840)
           .platform("google")
           .target(
               List.of(
                   ,
               
                ))
           .initialDatasetFilters(
               List.of(
               
                ))
           .limit(6);
    AiOptimizationLlmMentionsTargetMetricsLiteLiveResponseInfo response = apiInstance.llmMentionsTargetMetricsLiteLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTargetMetricsLiteLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTargetMetricsLiteLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTargetMetricsLiteLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTargetMetricsLiteLiveResponseInfo**](AiOptimizationLlmMentionsTargetMetricsLiteLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTopMentionedDomainsLiteLive"></a>
# **llmMentionsTopMentionedDomainsLiteLive**
> AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveResponseInfo llmMentionsTopMentionedDomainsLiteLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveRequestInfo model = new AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .platform("chat_gpt")
           .target(
               List.of(
                   ,
               
                ))
           .linksScope("sources")
           .initialDatasetFilters(
               List.of(
               
                ))
           .limit(3)
           .internalListLimit(2);
    AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveResponseInfo response = apiInstance.llmMentionsTopMentionedDomainsLiteLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTopMentionedDomainsLiteLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveResponseInfo**](AiOptimizationLlmMentionsTopMentionedDomainsLiteLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTopMentionedPagesLiteLive"></a>
# **llmMentionsTopMentionedPagesLiteLive**
> AiOptimizationLlmMentionsTopMentionedPagesLiteLiveResponseInfo llmMentionsTopMentionedPagesLiteLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo model = new AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .platform("chat_gpt")
           .target(
               List.of(
                   ,
               
                ))
           .linksScope("sources")
           .initialDatasetFilters(
               List.of(
               
                ))
           .limit(3)
           .internalListLimit(2);
    AiOptimizationLlmMentionsTopMentionedPagesLiteLiveResponseInfo response = apiInstance.llmMentionsTopMentionedPagesLiteLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTopMentionedPagesLiteLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTopMentionedPagesLiteLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTopMentionedPagesLiteLiveResponseInfo**](AiOptimizationLlmMentionsTopMentionedPagesLiteLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTopMentionedBrandsLiteLive"></a>
# **llmMentionsTopMentionedBrandsLiteLive**
> AiOptimizationLlmMentionsTopMentionedBrandsLiteLiveResponseInfo llmMentionsTopMentionedBrandsLiteLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTopMentionedBrandsLiteLiveRequestInfo model = new AiOptimizationLlmMentionsTopMentionedBrandsLiteLiveRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .platform("chat_gpt")
           .target(
               List.of(
                   ,
               
                ))
           .initialDatasetFilters(
               List.of(
               
                ))
           .limit(3)
           .internalListLimit(2);
    AiOptimizationLlmMentionsTopMentionedBrandsLiteLiveResponseInfo response = apiInstance.llmMentionsTopMentionedBrandsLiteLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTopMentionedBrandsLiteLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTopMentionedBrandsLiteLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTopMentionedBrandsLiteLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTopMentionedBrandsLiteLiveResponseInfo**](AiOptimizationLlmMentionsTopMentionedBrandsLiteLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTopMentionedBrandCategoriesLiteLive"></a>
# **llmMentionsTopMentionedBrandCategoriesLiteLive**
> AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResponseInfo llmMentionsTopMentionedBrandCategoriesLiteLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveRequestInfo model = new AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveRequestInfo()
           .languageCode("en")
           .locationCode(2840)
           .platform("chat_gpt")
           .target(
               List.of(
                   ,
               
                ))
           .initialDatasetFilters(
               List.of(
               
                ))
           .limit(3)
           .internalListLimit(2);
    AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResponseInfo response = apiInstance.llmMentionsTopMentionedBrandCategoriesLiteLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTopMentionedBrandCategoriesLiteLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResponseInfo**](AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsHistoricalLive"></a>
# **llmMentionsHistoricalLive**
> AiOptimizationLlmMentionsHistoricalLiveResponseInfo llmMentionsHistoricalLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsHistoricalLiveRequestInfo model = new AiOptimizationLlmMentionsHistoricalLiveRequestInfo()
           .languageCode("es")
           .locationCode(2840)
           .platform("google")
           .target(
               List.of(
                   ,
               
                ));
    AiOptimizationLlmMentionsHistoricalLiveResponseInfo response = apiInstance.llmMentionsHistoricalLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsHistoricalLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsHistoricalLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsHistoricalLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsHistoricalLiveResponseInfo**](AiOptimizationLlmMentionsHistoricalLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTimeseriesDeltaLive"></a>
# **llmMentionsTimeseriesDeltaLive**
> AiOptimizationLlmMentionsTimeseriesDeltaLiveResponseInfo llmMentionsTimeseriesDeltaLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTimeseriesDeltaLiveRequestInfo model = new AiOptimizationLlmMentionsTimeseriesDeltaLiveRequestInfo()
           .languageName("English")
           .locationCode(2840)
           .target(
               List.of(
                   ,
               
                ))
           .platform("google")
           .groupRange("month");
    AiOptimizationLlmMentionsTimeseriesDeltaLiveResponseInfo response = apiInstance.llmMentionsTimeseriesDeltaLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTimeseriesDeltaLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTimeseriesDeltaLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTimeseriesDeltaLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTimeseriesDeltaLiveResponseInfo**](AiOptimizationLlmMentionsTimeseriesDeltaLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTimeseriesNewLostLive"></a>
# **llmMentionsTimeseriesNewLostLive**
> AiOptimizationLlmMentionsTimeseriesNewLostLiveResponseInfo llmMentionsTimeseriesNewLostLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
    AiOptimizationLlmMentionsTimeseriesNewLostLiveRequestInfo model = new AiOptimizationLlmMentionsTimeseriesNewLostLiveRequestInfo()
           .languageName("English")
           .locationCode(2840)
           .target(
               List.of(
                   ,
               
                ))
           .platform("google")
           .groupRange("month");
    AiOptimizationLlmMentionsTimeseriesNewLostLiveResponseInfo response = apiInstance.llmMentionsTimeseriesNewLostLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTimeseriesNewLostLive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTimeseriesNewLostLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTimeseriesNewLostLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTimeseriesNewLostLiveResponseInfo**](AiOptimizationLlmMentionsTimeseriesNewLostLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
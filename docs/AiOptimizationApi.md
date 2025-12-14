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
| [**llmMentionsLocationsAndLanguages**](AiOptimizationApi.md#llmMentionsLocationsAndLanguages) | **GET**  /v3/ai_optimization/llm_mentions/locations_and_languages  |
| [**llmMentionsAvailableFilters**](AiOptimizationApi.md#llmMentionsAvailableFilters) | **GET**  /v3/ai_optimization/llm_mentions/available_filters  |
| [**llmMentionsSearchLive**](AiOptimizationApi.md#llmMentionsSearchLive) | **POST**  /v3/ai_optimization/llm_mentions/search/live  |
| [**llmMentionsTopPagesLive**](AiOptimizationApi.md#llmMentionsTopPagesLive) | **POST**  /v3/ai_optimization/llm_mentions/top_pages/live  |
| [**llmMentionsTopDomainsLive**](AiOptimizationApi.md#llmMentionsTopDomainsLive) | **POST**  /v3/ai_optimization/llm_mentions/top_domains/live  |
| [**llmMentionsAggregatedMetricsLive**](AiOptimizationApi.md#llmMentionsAggregatedMetricsLive) | **POST**  /v3/ai_optimization/llm_mentions/aggregated_metrics/live  |
| [**llmMentionsCrossAggregatedMetricsLive**](AiOptimizationApi.md#llmMentionsCrossAggregatedMetricsLive) | **POST**  /v3/ai_optimization/llm_mentions/cross_aggregated_metrics/live  |
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
| [**perplexityLlmResponsesModels**](AiOptimizationApi.md#perplexityLlmResponsesModels) | **GET**  /v3/ai_optimization/perplexity/llm_responses/models  |
| [**perplexityLlmResponsesLive**](AiOptimizationApi.md#perplexityLlmResponsesLive) | **POST**  /v3/ai_optimization/perplexity/llm_responses/live  |
| [**aiKeywordDataAvailableFilters**](AiOptimizationApi.md#aiKeywordDataAvailableFilters) | **GET**  /v3/ai_optimization/ai_keyword_data/available_filters  |
| [**aiKeywordDataLocationsAndLanguages**](AiOptimizationApi.md#aiKeywordDataLocationsAndLanguages) | **GET**  /v3/ai_optimization/ai_keyword_data/locations_and_languages  |
| [**aiKeywordDataKeywordsSearchVolumeLive**](AiOptimizationApi.md#aiKeywordDataKeywordsSearchVolumeLive) | **POST**  /v3/ai_optimization/ai_keyword_data/keywords_search_volume/live  |

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
    String country = ;
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
    AiOptimizationChatGptLlmScraperTaskPostResponseInfo response = apiInstance.chatGptLlmScraperTaskPost(
       List.of(
    
           new AiOptimizationChatGptLlmScraperTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("what is chatgpt")
    
       )
    );
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
    String id = ;
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
    String id = ;
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

<a id="llmMentionsSearchLive"></a>
# **llmMentionsSearchLive**
> AiOptimizationLlmMentionsSearchLiveResponseInfo llmMentionsSearchLive()


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
    AiOptimizationLlmMentionsSearchLiveResponseInfo response = apiInstance.llmMentionsSearchLive(
       List.of(
    
           new AiOptimizationLlmMentionsSearchLiveRequestInfo()
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .target(List.of(
    
           new AiOptimizationLLmMentionsDomainElement()
        
           .domain("dataforseo.com")
        
        
           .searchFilter("exclude"),
    
           new AiOptimizationLLmMentionsKeywordElement()
        
           .keyword("bmw")
        
        
           .searchScope(List.of(
    
           "answer"
    
       ))
    
       ))
        
        
           .platform("google")
        
        
           .filters(List.of(
    
           List.of(
    
           "ai_search_volume",
    
           ">",
    
           1000
    
       )
    
       ))
        
        
           .orderBy(List.of(
    
           "ai_search_volume,desc"
    
       ))
        
        
           .offset(0)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsSearchLive");
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
    | **** | [**List&lt;List<AiOptimizationLlmMentionsSearchLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsSearchLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsSearchLiveResponseInfo**](AiOptimizationLlmMentionsSearchLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTopPagesLive"></a>
# **llmMentionsTopPagesLive**
> AiOptimizationLlmMentionsTopPagesLiveResponseInfo llmMentionsTopPagesLive()


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
    AiOptimizationLlmMentionsTopPagesLiveResponseInfo response = apiInstance.llmMentionsTopPagesLive(
       List.of(
    
           new AiOptimizationLlmMentionsTopPagesLiveRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .platform("google")
        
        
           .target(List.of(
    
           new AiOptimizationLLmMentionsKeywordElement()
        
           .keyword("bmw")
        
        
           .searchScope(List.of(
    
           "answer"
    
       )),
    
           new AiOptimizationLLmMentionsKeywordElement()
        
           .keyword("auto")
        
        
           .searchScope(List.of(
    
           "question"
    
       ))
        
        
           .matchType("partial_match")
    
       ))
        
        
           .linksScope("sources")
        
        
           .initialDatasetFilters(List.of(
    
           List.of(
    
           "ai_search_volume",
    
           ">",
    
           10
    
       )
    
       ))
        
        
           .itemsListLimit(3)
        
        
           .internalListLimit(2)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTopPagesLive");
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
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTopPagesLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTopPagesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTopPagesLiveResponseInfo**](AiOptimizationLlmMentionsTopPagesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsTopDomainsLive"></a>
# **llmMentionsTopDomainsLive**
> AiOptimizationLlmMentionsTopDomainsLiveResponseInfo llmMentionsTopDomainsLive()


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
    AiOptimizationLlmMentionsTopDomainsLiveResponseInfo response = apiInstance.llmMentionsTopDomainsLive(
       List.of(
    
           new AiOptimizationLlmMentionsTopDomainsLiveRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .platform("chat_gpt")
        
        
           .target(List.of(
    
           new AiOptimizationLLmMentionsKeywordElement()
        
           .keyword("bmw")
        
        
           .searchScope(List.of(
    
           "answer"
    
       )),
    
           new AiOptimizationLLmMentionsKeywordElement()
        
           .keyword("auto")
        
        
           .searchScope(List.of(
    
           "question"
    
       ))
        
        
           .matchType("partial_match")
    
       ))
        
        
           .linksScope("sources")
        
        
           .initialDatasetFilters(List.of(
    
           List.of(
    
           "ai_search_volume",
    
           ">",
    
           10
    
       )
    
       ))
        
        
           .itemsListLimit(3)
        
        
           .internalListLimit(2)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsTopDomainsLive");
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
    | **** | [**List&lt;List<AiOptimizationLlmMentionsTopDomainsLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsTopDomainsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsTopDomainsLiveResponseInfo**](AiOptimizationLlmMentionsTopDomainsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsAggregatedMetricsLive"></a>
# **llmMentionsAggregatedMetricsLive**
> AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo llmMentionsAggregatedMetricsLive()


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
    AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo response = apiInstance.llmMentionsAggregatedMetricsLive(
       List.of(
    
           new AiOptimizationLlmMentionsAggregatedMetricsLiveRequestInfo()
        
           .languageCode("es")
        
        
           .locationCode(2840)
        
        
           .platform("google")
        
        
           .target(List.of(
    
           new AiOptimizationLLmMentionsDomainElement()
        
           .domain("en.wikipedia.org")
        
        
           .searchFilter("exclude"),
    
           new AiOptimizationLLmMentionsKeywordElement()
        
           .keyword("bmw")
        
        
           .searchScope(List.of(
    
           "answer"
    
       ))
    
       ))
        
        
           .initialDatasetFilters(List.of(
    
           List.of(
    
           "ai_search_volume",
    
           ">",
    
           10
    
       )
    
       ))
        
        
           .internalListLimit(10)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsAggregatedMetricsLive");
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
    | **** | [**List&lt;List<AiOptimizationLlmMentionsAggregatedMetricsLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsAggregatedMetricsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo**](AiOptimizationLlmMentionsAggregatedMetricsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="llmMentionsCrossAggregatedMetricsLive"></a>
# **llmMentionsCrossAggregatedMetricsLive**
> AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo llmMentionsCrossAggregatedMetricsLive()


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
    AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo response = apiInstance.llmMentionsCrossAggregatedMetricsLive(
       List.of(
    
           new AiOptimizationLlmMentionsCrossAggregatedMetricsLiveRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .platform("google")
        
        
           .targets(List.of(
    
           new AiOptimizationLLmMentionsCrossAggregateMetricsTargetInfo()
        
           .aggregationKey("chat_gpt")
        
        
           .target(List.of(
    
           new AiOptimizationLLmMentionsKeywordElement()
        
           .keyword("chat gpt")
    
       )),
    
           new AiOptimizationLLmMentionsCrossAggregateMetricsTargetInfo()
        
           .aggregationKey("claude")
        
        
           .target(List.of(
    
           new AiOptimizationLLmMentionsKeywordElement()
        
           .keyword("claude")
    
       )),
    
           new AiOptimizationLLmMentionsCrossAggregateMetricsTargetInfo()
        
           .aggregationKey("gemini")
        
        
           .target(List.of(
    
           new AiOptimizationLLmMentionsKeywordElement()
        
           .keyword("gemini")
    
       )),
    
           new AiOptimizationLLmMentionsCrossAggregateMetricsTargetInfo()
        
           .aggregationKey("perplexity")
        
        
           .target(List.of(
    
           new AiOptimizationLLmMentionsKeywordElement()
        
           .keyword("perplexity")
        
        
           .searchFilter("include")
    
       ))
    
       ))
        
        
           .initialDatasetFilters(List.of(
    
           List.of(
    
           "ai_search_volume",
    
           ">",
    
           10
    
       )
    
       ))
        
        
           .internalListLimit(5)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AiOptimizationApi#llmMentionsCrossAggregatedMetricsLive");
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
    | **** | [**List&lt;List<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveRequestInfo>&gt;**](List<AiOptimizationLlmMentionsCrossAggregatedMetricsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo**](AiOptimizationLlmMentionsCrossAggregatedMetricsLiveResponseInfo.md)

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
    AiOptimizationChatGptLlmResponsesLiveResponseInfo response = apiInstance.chatGptLlmResponsesLive(
       List.of(
    
           new AiOptimizationChatGptLlmResponsesLiveRequestInfo()
        
           .systemMessage("communicate as if we are in a business meeting")
        
        
           .messageChain(List.of(
    
           new LlmMessageChainItem()
        
           .role("user")
        
        
           .message("Hello, what’s up?"),
    
           new LlmMessageChainItem()
        
           .role("ai")
        
        
           .message("Hello! I’m doing well, thank you. How can I assist you today? Are there any specific topics or projects you’d like to discuss in our meeting?")
    
       ))
        
        
           .maxOutputTokens(200)
        
        
           .temperature(0.3d)
        
        
           .topP(0.5d)
        
        
           .modelName("gpt-4.1-mini")
        
        
           .webSearch(true)
        
        
           .webSearchCountryIsoCode("FR")
        
        
           .webSearchCity("Paris")
        
        
           .userPrompt("provide information on how relevant the amusement park business is in France now")
    
       )
    );
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
    AiOptimizationChatGptLlmResponsesTaskPostResponseInfo response = apiInstance.chatGptLlmResponsesTaskPost(
       List.of(
    
           new AiOptimizationChatGptLlmResponsesTaskPostRequestInfo()
        
           .systemMessage("communicate as if we are in a business meeting")
        
        
           .messageChain(List.of(
    
           new LlmMessageChainItem()
        
           .role("user")
        
        
           .message("Hello, what’s up?"),
    
           new LlmMessageChainItem()
        
           .role("ai")
        
        
           .message("Hello! I’m doing well, thank you. How can I assist you today? Are there any specific topics or projects you’d like to discuss in our meeting?")
    
       ))
        
        
           .modelName("gpt-4.1-mini")
        
        
           .userPrompt("provide information on how relevant the amusement park business is in France now")
    
       )
    );
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
    String id = ;
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
    AiOptimizationClaudeLlmResponsesLiveResponseInfo response = apiInstance.claudeLlmResponsesLive(
       List.of(
    
           new AiOptimizationClaudeLlmResponsesLiveRequestInfo()
        
           .systemMessage("communicate as if we are in a business meeting")
        
        
           .messageChain(List.of(
    
           new LlmMessageChainItem()
        
           .role("user")
        
        
           .message("Hello, what’s up?"),
    
           new LlmMessageChainItem()
        
           .role("ai")
        
        
           .message("Hello! I’m doing well, thank you. How can I assist you today? Are there any specific topics or projects you’d like to discuss in our meeting?")
    
       ))
        
        
           .maxOutputTokens(200)
        
        
           .modelName("claude-opus-4-0")
        
        
           .temperature(0.3d)
        
        
           .topP(0.5d)
        
        
           .webSearch(true)
        
        
           .webSearchCountryIsoCode("FR")
        
        
           .userPrompt("provide information on how relevant the amusement park business is in France now")
    
       )
    );
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
    AiOptimizationClaudeLlmResponsesTaskPostResponseInfo response = apiInstance.claudeLlmResponsesTaskPost(
       List.of(
    
           new AiOptimizationClaudeLlmResponsesTaskPostRequestInfo()
        
           .systemMessage("communicate as if we are in a business meeting")
        
        
           .messageChain(List.of(
    
           new LlmMessageChainItem()
        
           .role("user")
        
        
           .message("Hello, what’s up?"),
    
           new LlmMessageChainItem()
        
           .role("ai")
        
        
           .message("Hello! I’m doing well, thank you. How can I assist you today? Are there any specific topics or projects you’d like to discuss in our meeting?")
    
       ))
        
        
           .maxOutputTokens(1024)
        
        
           .temperature(0.3d)
        
        
           .topP(0.5d)
        
        
           .webSearchCountryIsoCode("FR")
        
        
           .modelName("claude-sonnet-4-0")
        
        
           .webSearch(true)
        
        
           .userPrompt("provide information on how relevant the amusement park business is in France now")
    
       )
    );
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
    String id = ;
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
    AiOptimizationGeminiLlmResponsesTaskPostResponseInfo response = apiInstance.geminiLlmResponsesTaskPost(
       List.of(
    
           new AiOptimizationGeminiLlmResponsesTaskPostRequestInfo()
        
           .systemMessage("communicate as if we are in a business meeting")
        
        
           .messageChain(List.of(
    
           new LlmMessageChainItem()
        
           .role("user")
        
        
           .message("Hello, what’s up?"),
    
           new LlmMessageChainItem()
        
           .role("ai")
        
        
           .message("Hello! I’m doing well, thank you. How can I assist you today? Are there any specific topics or projects you’d like to discuss in our meeting?")
    
       ))
        
        
           .modelName("gemini-2.5-flash")
        
        
           .userPrompt("provide information on how relevant the amusement park business is in France now")
    
       )
    );
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
    String id = ;
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
    AiOptimizationGeminiLlmResponsesLiveResponseInfo response = apiInstance.geminiLlmResponsesLive(
       List.of(
    
           new AiOptimizationGeminiLlmResponsesLiveRequestInfo()
        
           .systemMessage("communicate as if we are in a business meeting")
        
        
           .messageChain(List.of(
    
           new LlmMessageChainItem()
        
           .role("user")
        
        
           .message("Hello, what’s up?"),
    
           new LlmMessageChainItem()
        
           .role("ai")
        
        
           .message("Hello! I’m doing well, thank you. How can I assist you today? Are there any specific topics or projects you’d like to discuss in our meeting?")
    
       ))
        
        
           .maxOutputTokens(200)
        
        
           .temperature(0.3d)
        
        
           .topP(0.5d)
        
        
           .modelName("gemini-2.5-flash")
        
        
           .webSearch(true)
        
        
           .userPrompt("provide information on how relevant the amusement park business is in France now")
    
       )
    );
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
    AiOptimizationPerplexityLlmResponsesLiveResponseInfo response = apiInstance.perplexityLlmResponsesLive(
       List.of(
    
           new AiOptimizationPerplexityLlmResponsesLiveRequestInfo()
        
           .systemMessage("communicate as if we are in a business meeting")
        
        
           .messageChain(List.of(
    
           new LlmMessageChainItem()
        
           .role("user")
        
        
           .message("Hello, what’s up?"),
    
           new LlmMessageChainItem()
        
           .role("ai")
        
        
           .message("Hello! I’m doing well, thank you. How can I assist you today? Are there any specific topics or projects you’d like to discuss in our meeting?")
    
       ))
        
        
           .maxOutputTokens(200)
        
        
           .temperature(0.3d)
        
        
           .topP(0.5d)
        
        
           .webSearchCountryIsoCode("FR")
        
        
           .modelName("sonar-reasoning")
        
        
           .userPrompt("provide information on how relevant the amusement park business is in France now")
    
       )
    );
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
    AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo response = apiInstance.aiKeywordDataKeywordsSearchVolumeLive(
       List.of(
    
           new AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo()
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .keywords(List.of(
    
           "iphone",
    
           "seo"
    
       ))
    
       )
    );
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
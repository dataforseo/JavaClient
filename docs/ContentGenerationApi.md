# ContentGenerationApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateLive**](ContentGenerationApi.md#generateLive) | **POST**  /v3/content_generation/generate/live  |
| [**generateTextLive**](ContentGenerationApi.md#generateTextLive) | **POST**  /v3/content_generation/generate_text/live  |
| [**generateMetaTagsLive**](ContentGenerationApi.md#generateMetaTagsLive) | **POST**  /v3/content_generation/generate_meta_tags/live  |
| [**generateSubTopicsLive**](ContentGenerationApi.md#generateSubTopicsLive) | **POST**  /v3/content_generation/generate_sub_topics/live  |
| [**paraphraseLive**](ContentGenerationApi.md#paraphraseLive) | **POST**  /v3/content_generation/paraphrase/live  |
| [**checkGrammarLive**](ContentGenerationApi.md#checkGrammarLive) | **POST**  /v3/content_generation/check_grammar/live  |
| [**contentGenerationCheckGrammarLanguages**](ContentGenerationApi.md#contentGenerationCheckGrammarLanguages) | **GET**  /v3/content_generation/check_grammar/languages  |
| [**grammarRules**](ContentGenerationApi.md#grammarRules) | **GET**  /v3/content_generation/grammar_rules  |
| [**textSummaryLive**](ContentGenerationApi.md#textSummaryLive) | **POST**  /v3/content_generation/text_summary/live  |
| [**contentGenerationTextSummaryLanguages**](ContentGenerationApi.md#contentGenerationTextSummaryLanguages) | **GET**  /v3/content_generation/text_summary/languages  |

<a id="generateLive"></a>
# **generateLive**
> ContentGenerationGenerateLiveResponseInfo generateLive()


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
    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    ContentGenerationGenerateLiveRequestInfo model = new ContentGenerationGenerateLiveRequestInfo()
           .text("SEO is")
           .maxNewTokens(100)
           .creativityIndex(1d)
           .avoidStartingWords(
               List.of(
                   "SEO",
                   "search engine optimization",
                   "SEO is"
                ))
           .stopWords(
               List.of(
                   "123",
                   "n"
                ));
    ContentGenerationGenerateLiveResponseInfo response = apiInstance.generateLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentGenerationApi#generateLive");
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
    | **** | [**List&lt;List<ContentGenerationGenerateLiveRequestInfo>&gt;**](List<ContentGenerationGenerateLiveRequestInfo>.md)|  | [optional] |



### Return type

[**ContentGenerationGenerateLiveResponseInfo**](ContentGenerationGenerateLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="generateTextLive"></a>
# **generateTextLive**
> ContentGenerationGenerateTextLiveResponseInfo generateTextLive()


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
    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    ContentGenerationGenerateTextLiveRequestInfo model = new ContentGenerationGenerateTextLiveRequestInfo()
           .topic("Steve Jobs")
           .wordCount(50l)
           .subTopics(
               List.of(
                   "Apple",
                   "Pixar",
                   "Amazing Products"
                ))
           .description("Take a closer look at Steve Jobs' life and his incredible impact on the tech industry, with a special focus on the development of the iPhone.")
           .metaKeywords(
               List.of(
                   "iPhone",
                   "sell",
                   "CEO"
                ))
           .creativityIndex(0.8d)
           .includeConclusion(true);
    ContentGenerationGenerateTextLiveResponseInfo response = apiInstance.generateTextLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentGenerationApi#generateTextLive");
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
    | **** | [**List&lt;List<ContentGenerationGenerateTextLiveRequestInfo>&gt;**](List<ContentGenerationGenerateTextLiveRequestInfo>.md)|  | [optional] |



### Return type

[**ContentGenerationGenerateTextLiveResponseInfo**](ContentGenerationGenerateTextLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="generateMetaTagsLive"></a>
# **generateMetaTagsLive**
> ContentGenerationGenerateMetaTagsLiveResponseInfo generateMetaTagsLive()


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
    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    ContentGenerationGenerateMetaTagsLiveRequestInfo model = new ContentGenerationGenerateMetaTagsLiveRequestInfo()
           .text("The idea to develop an instrument for local SEO didn’t come to the GMB Crush CEO, Matteo Barletta, out of the blue. Having a huge interest in search engine optimization, Matteo has come a long way from being an SEO freelancer to launching his own agency, SEO Heroes. At some point, he and his team noticed that it was quite challenging to work with local SEO projects, especially those related to Google My Business listings. There were simply no tools that could streamline their work and provide the functionality the agency needed.nn“We started to develop the idea of ··our tool capable of doing Google Business SEO audits, tracking stats, and generating business proposals at the same time.");
    ContentGenerationGenerateMetaTagsLiveResponseInfo response = apiInstance.generateMetaTagsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentGenerationApi#generateMetaTagsLive");
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
    | **** | [**List&lt;List<ContentGenerationGenerateMetaTagsLiveRequestInfo>&gt;**](List<ContentGenerationGenerateMetaTagsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**ContentGenerationGenerateMetaTagsLiveResponseInfo**](ContentGenerationGenerateMetaTagsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="generateSubTopicsLive"></a>
# **generateSubTopicsLive**
> ContentGenerationGenerateSubTopicsLiveResponseInfo generateSubTopicsLive()


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
    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    ContentGenerationGenerateSubTopicsLiveRequestInfo model = new ContentGenerationGenerateSubTopicsLiveRequestInfo()
           .topic("Steve Jobs")
           .creativityIndex(0.9d);
    ContentGenerationGenerateSubTopicsLiveResponseInfo response = apiInstance.generateSubTopicsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentGenerationApi#generateSubTopicsLive");
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
    | **** | [**List&lt;List<ContentGenerationGenerateSubTopicsLiveRequestInfo>&gt;**](List<ContentGenerationGenerateSubTopicsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**ContentGenerationGenerateSubTopicsLiveResponseInfo**](ContentGenerationGenerateSubTopicsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="paraphraseLive"></a>
# **paraphraseLive**
> ContentGenerationParaphraseLiveResponseInfo paraphraseLive()


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
    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    ContentGenerationParaphraseLiveRequestInfo model = new ContentGenerationParaphraseLiveRequestInfo()
           .text("The idea to develop an instrument for local SEO didn’t come to the GMB Crush CEO, Matteo Barletta, out of the blue. Having a huge interest in search engine optimization, Matteo has come a long way from being an SEO freelancer to launching his own agency, SEO Heroes. At some point, he and his team noticed that it was quite challenging to work with local SEO projects, especially those related to Google My Business listings.")
           .creativityIndex(0.8d);
    ContentGenerationParaphraseLiveResponseInfo response = apiInstance.paraphraseLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentGenerationApi#paraphraseLive");
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
    | **** | [**List&lt;List<ContentGenerationParaphraseLiveRequestInfo>&gt;**](List<ContentGenerationParaphraseLiveRequestInfo>.md)|  | [optional] |



### Return type

[**ContentGenerationParaphraseLiveResponseInfo**](ContentGenerationParaphraseLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="checkGrammarLive"></a>
# **checkGrammarLive**
> ContentGenerationCheckGrammarLiveResponseInfo checkGrammarLive()


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
    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    ContentGenerationCheckGrammarLiveRequestInfo model = new ContentGenerationCheckGrammarLiveRequestInfo()
           .text("Hello, my name is John! And I'm very glad to work with you toda")
           .languageCode("en-US");
    ContentGenerationCheckGrammarLiveResponseInfo response = apiInstance.checkGrammarLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentGenerationApi#checkGrammarLive");
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
    | **** | [**List&lt;List<ContentGenerationCheckGrammarLiveRequestInfo>&gt;**](List<ContentGenerationCheckGrammarLiveRequestInfo>.md)|  | [optional] |



### Return type

[**ContentGenerationCheckGrammarLiveResponseInfo**](ContentGenerationCheckGrammarLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentGenerationCheckGrammarLanguages"></a>
# **contentGenerationCheckGrammarLanguages**
> ContentGenerationCheckGrammarLanguagesResponseInfo contentGenerationCheckGrammarLanguages()


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
    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);

    ContentGenerationCheckGrammarLanguagesResponseInfo response = apiInstance.contentGenerationCheckGrammarLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentGenerationApi#contentGenerationCheckGrammarLanguages");
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

[**ContentGenerationCheckGrammarLanguagesResponseInfo**](ContentGenerationCheckGrammarLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="grammarRules"></a>
# **grammarRules**
> ContentGenerationGrammarRulesResponseInfo grammarRules()


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
    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);

    ContentGenerationGrammarRulesResponseInfo response = apiInstance.grammarRules();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentGenerationApi#grammarRules");
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

[**ContentGenerationGrammarRulesResponseInfo**](ContentGenerationGrammarRulesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="textSummaryLive"></a>
# **textSummaryLive**
> ContentGenerationTextSummaryLiveResponseInfo textSummaryLive()


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
    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    ContentGenerationTextSummaryLiveRequestInfo model = new ContentGenerationTextSummaryLiveRequestInfo()
           .text("Removing [RequireHttps] does nothing but break the https redirection, and doesn't enforce an https url on my route. I've got one method which i want to expose over http and a different one over https. If i accidentally enter http in my url for the https-only method, it should redirect. It currently works as is, the problem is that there is an undocument (seemingly unrelated) setting I have to add to get it all working. And that is the SslPort thing")
           .languageName("English (United States)");
    ContentGenerationTextSummaryLiveResponseInfo response = apiInstance.textSummaryLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentGenerationApi#textSummaryLive");
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
    | **** | [**List&lt;List<ContentGenerationTextSummaryLiveRequestInfo>&gt;**](List<ContentGenerationTextSummaryLiveRequestInfo>.md)|  | [optional] |



### Return type

[**ContentGenerationTextSummaryLiveResponseInfo**](ContentGenerationTextSummaryLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentGenerationTextSummaryLanguages"></a>
# **contentGenerationTextSummaryLanguages**
> ContentGenerationTextSummaryLanguagesResponseInfo contentGenerationTextSummaryLanguages()


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
    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);

    ContentGenerationTextSummaryLanguagesResponseInfo response = apiInstance.contentGenerationTextSummaryLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentGenerationApi#contentGenerationTextSummaryLanguages");
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

[**ContentGenerationTextSummaryLanguagesResponseInfo**](ContentGenerationTextSummaryLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
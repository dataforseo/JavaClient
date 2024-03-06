[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# ContentGenerationApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkGrammarLive**](ContentGenerationApi.md#checkGrammarLive) | **POST** /v3/content_generation/check_grammar/live |  |
| [**contentGenerationCheckGrammarLanguages**](ContentGenerationApi.md#contentGenerationCheckGrammarLanguages) | **GET** /v3/content_generation/check_grammar/languages |  |
| [**contentGenerationTextSummaryLanguages**](ContentGenerationApi.md#contentGenerationTextSummaryLanguages) | **GET** /v3/content_generation/text_summary/languages |  |
| [**generateLive**](ContentGenerationApi.md#generateLive) | **POST** /v3/content_generation/generate/live |  |
| [**generateMetaTagsLive**](ContentGenerationApi.md#generateMetaTagsLive) | **POST** /v3/content_generation/generate_meta_tags/live |  |
| [**generateSubTopicsLive**](ContentGenerationApi.md#generateSubTopicsLive) | **POST** /v3/content_generation/generate_sub_topics/live |  |
| [**generateTextLive**](ContentGenerationApi.md#generateTextLive) | **POST** /v3/content_generation/generate_text/live |  |
| [**grammarRules**](ContentGenerationApi.md#grammarRules) | **GET** /v3/content_generation/grammar_rules |  |
| [**paraphraseLive**](ContentGenerationApi.md#paraphraseLive) | **POST** /v3/content_generation/paraphrase/live |  |
| [**textSummaryLive**](ContentGenerationApi.md#textSummaryLive) | **POST** /v3/content_generation/text_summary/live |  |

<a id="checkGrammarLive"></a>

# **checkGrammarLive**

> ContentGenerationCheckGrammarLiveResponseInfo checkGrammarLive(contentGenerationCheckGrammarLiveRequestInfo)

‌ This endpoint will provide you with grammar and spelling corrections for the text you specify. for more info please visit &#39;https://docs.dataforseo.com/v3/content_generation/check_grammar/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.ContentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    List<ContentGenerationCheckGrammarLiveRequestInfo> contentGenerationCheckGrammarLiveRequestInfo = Arrays.asList(); // List<ContentGenerationCheckGrammarLiveRequestInfo> | 
    try {
      ContentGenerationCheckGrammarLiveResponseInfo result = apiInstance.checkGrammarLive(contentGenerationCheckGrammarLiveRequestInfo);
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
| **contentGenerationCheckGrammarLiveRequestInfo** | [**List&lt;ContentGenerationCheckGrammarLiveRequestInfo&gt;**](ContentGenerationCheckGrammarLiveRequestInfo.md)|  | [optional] |

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

You will receive the list of languages by calling this API.   As a response of the API server, you will receive JSON-encoded data containing a tasks array with the information specific to the set tasks. for more info please visit &#39;https://docs.dataforseo.com/v3/content_generation/check_grammar/languages/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.ContentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    try {
      ContentGenerationCheckGrammarLanguagesResponseInfo result = apiInstance.contentGenerationCheckGrammarLanguages();
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

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentGenerationTextSummaryLanguages"></a>

# **contentGenerationTextSummaryLanguages**

> ContentGenerationTextSummaryLanguagesResponseInfo contentGenerationTextSummaryLanguages()

You will receive the list of languages by calling this API.   As a response of the API server, you will receive JSON-encoded data containing a tasks array with the information specific to the set tasks. for more info please visit &#39;https://docs.dataforseo.com/v3/content_generation/text_summary/languages/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.ContentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    try {
      ContentGenerationTextSummaryLanguagesResponseInfo result = apiInstance.contentGenerationTextSummaryLanguages();
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

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="generateLive"></a>

# **generateLive**

> ContentGenerationGenerateLiveResponseInfo generateLive(contentGenerationGenerateLiveRequestInfo)

‌ This endpoint will provide you with a text generated based on the part of the text you define and other available parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/content_generation/generate/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.ContentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    List<ContentGenerationGenerateLiveRequestInfo> contentGenerationGenerateLiveRequestInfo = Arrays.asList(); // List<ContentGenerationGenerateLiveRequestInfo> | 
    try {
      ContentGenerationGenerateLiveResponseInfo result = apiInstance.generateLive(contentGenerationGenerateLiveRequestInfo);
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
| **contentGenerationGenerateLiveRequestInfo** | [**List&lt;ContentGenerationGenerateLiveRequestInfo&gt;**](ContentGenerationGenerateLiveRequestInfo.md)|  | [optional] |

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

<a id="generateMetaTagsLive"></a>

# **generateMetaTagsLive**

> ContentGenerationGenerateMetaTagsLiveResponseInfo generateMetaTagsLive(contentGenerationGenerateMetaTagsLiveRequestInfo)

‌ This endpoint is designed to generate title and description meta tags for a text specified in the request. for more info please visit &#39;https://docs.dataforseo.com/v3/content_generation/generate_meta_tags/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.ContentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    List<ContentGenerationGenerateMetaTagsLiveRequestInfo> contentGenerationGenerateMetaTagsLiveRequestInfo = Arrays.asList(); // List<ContentGenerationGenerateMetaTagsLiveRequestInfo> | 
    try {
      ContentGenerationGenerateMetaTagsLiveResponseInfo result = apiInstance.generateMetaTagsLive(contentGenerationGenerateMetaTagsLiveRequestInfo);
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
| **contentGenerationGenerateMetaTagsLiveRequestInfo** | [**List&lt;ContentGenerationGenerateMetaTagsLiveRequestInfo&gt;**](ContentGenerationGenerateMetaTagsLiveRequestInfo.md)|  | [optional] |

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

> ContentGenerationGenerateSubTopicsLiveResponseInfo generateSubTopicsLive(contentGenerationGenerateSubTopicsLiveRequestInfo)

‌ This endpoint will provide you with 10 subtopics generated based on the topic and other parameters you specify. for more info please visit &#39;https://docs.dataforseo.com/v3/content_generation/generate_sub_topics/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.ContentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    List<ContentGenerationGenerateSubTopicsLiveRequestInfo> contentGenerationGenerateSubTopicsLiveRequestInfo = Arrays.asList(); // List<ContentGenerationGenerateSubTopicsLiveRequestInfo> | 
    try {
      ContentGenerationGenerateSubTopicsLiveResponseInfo result = apiInstance.generateSubTopicsLive(contentGenerationGenerateSubTopicsLiveRequestInfo);
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
| **contentGenerationGenerateSubTopicsLiveRequestInfo** | [**List&lt;ContentGenerationGenerateSubTopicsLiveRequestInfo&gt;**](ContentGenerationGenerateSubTopicsLiveRequestInfo.md)|  | [optional] |

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

<a id="generateTextLive"></a>

# **generateTextLive**

> ContentGenerationGenerateTextLiveResponseInfo generateTextLive(contentGenerationGenerateTextLiveRequestInfo)

‌ This endpoint will provide you with a text generated based on the topic and other parameters you specify. for more info please visit &#39;https://docs.dataforseo.com/v3/content_generation/generate_text/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.ContentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    List<ContentGenerationGenerateTextLiveRequestInfo> contentGenerationGenerateTextLiveRequestInfo = Arrays.asList(); // List<ContentGenerationGenerateTextLiveRequestInfo> | 
    try {
      ContentGenerationGenerateTextLiveResponseInfo result = apiInstance.generateTextLive(contentGenerationGenerateTextLiveRequestInfo);
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
| **contentGenerationGenerateTextLiveRequestInfo** | [**List&lt;ContentGenerationGenerateTextLiveRequestInfo&gt;**](ContentGenerationGenerateTextLiveRequestInfo.md)|  | [optional] |

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

<a id="grammarRules"></a>

# **grammarRules**

> ContentGenerationGrammarRulesResponseInfo grammarRules()

You will receive the list of grammar rules by calling this API.   As a response of the API server, you will receive JSON-encoded data containing a tasks array with the information specific to the set tasks. for more info please visit &#39;https://docs.dataforseo.com/v3/content_generation/grammar_rules/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.ContentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    try {
      ContentGenerationGrammarRulesResponseInfo result = apiInstance.grammarRules();
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

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="paraphraseLive"></a>

# **paraphraseLive**

> ContentGenerationParaphraseLiveResponseInfo paraphraseLive(contentGenerationParaphraseLiveRequestInfo)

‌ This endpoint will provide you with a paraphrased version of the text you specify. for more info please visit &#39;https://docs.dataforseo.com/v3/content_generation/paraphrase/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.ContentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    List<ContentGenerationParaphraseLiveRequestInfo> contentGenerationParaphraseLiveRequestInfo = Arrays.asList(); // List<ContentGenerationParaphraseLiveRequestInfo> | 
    try {
      ContentGenerationParaphraseLiveResponseInfo result = apiInstance.paraphraseLive(contentGenerationParaphraseLiveRequestInfo);
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
| **contentGenerationParaphraseLiveRequestInfo** | [**List&lt;ContentGenerationParaphraseLiveRequestInfo&gt;**](ContentGenerationParaphraseLiveRequestInfo.md)|  | [optional] |

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

<a id="textSummaryLive"></a>

# **textSummaryLive**

> ContentGenerationTextSummaryLiveResponseInfo textSummaryLive(contentGenerationTextSummaryLiveRequestInfo)

‌ This endpoint will provide you with statistical data based on the given text, such as the number of words and sentences, vocabulary density, and text readability. for more info please visit &#39;https://docs.dataforseo.com/v3/content_generation/text_summary/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.ContentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentGenerationApi apiInstance = new ContentGenerationApi(defaultClient);
    List<ContentGenerationTextSummaryLiveRequestInfo> contentGenerationTextSummaryLiveRequestInfo = Arrays.asList(); // List<ContentGenerationTextSummaryLiveRequestInfo> | 
    try {
      ContentGenerationTextSummaryLiveResponseInfo result = apiInstance.textSummaryLive(contentGenerationTextSummaryLiveRequestInfo);
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
| **contentGenerationTextSummaryLiveRequestInfo** | [**List&lt;ContentGenerationTextSummaryLiveRequestInfo&gt;**](ContentGenerationTextSummaryLiveRequestInfo.md)|  | [optional] |

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

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
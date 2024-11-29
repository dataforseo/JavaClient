# ContentAnalysisApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**categoryTrendsLive**](ContentAnalysisApi.md#categoryTrendsLive) | **POST** /v3/content_analysis/category_trends/live |  |
| [**contentAnalysisAvailableFilters**](ContentAnalysisApi.md#contentAnalysisAvailableFilters) | **GET** /v3/content_analysis/available_filters |  |
| [**contentAnalysisCategories**](ContentAnalysisApi.md#contentAnalysisCategories) | **GET** /v3/content_analysis/categories |  |
| [**contentAnalysisIdList**](ContentAnalysisApi.md#contentAnalysisIdList) | **POST** /v3/content_analysis/id_list |  |
| [**contentAnalysisLanguages**](ContentAnalysisApi.md#contentAnalysisLanguages) | **GET** /v3/content_analysis/languages |  |
| [**contentAnalysisLocations**](ContentAnalysisApi.md#contentAnalysisLocations) | **GET** /v3/content_analysis/locations |  |
| [**contentAnalysisSummaryLive**](ContentAnalysisApi.md#contentAnalysisSummaryLive) | **POST** /v3/content_analysis/summary/live |  |
| [**phraseTrendsLive**](ContentAnalysisApi.md#phraseTrendsLive) | **POST** /v3/content_analysis/phrase_trends/live |  |
| [**ratingDistributionLive**](ContentAnalysisApi.md#ratingDistributionLive) | **POST** /v3/content_analysis/rating_distribution/live |  |
| [**searchLive**](ContentAnalysisApi.md#searchLive) | **POST** /v3/content_analysis/search/live |  |
| [**sentimentAnalysisLive**](ContentAnalysisApi.md#sentimentAnalysisLive) | **POST** /v3/content_analysis/sentiment_analysis/live |  |


<a id="categoryTrendsLive"></a>
# **categoryTrendsLive**
> ContentAnalysisCategoryTrendsLiveResponseInfo categoryTrendsLive(contentAnalysisCategoryTrendsLiveRequestInfo)



‌ This endpoint will provide you with data on all citations in the target category for the indicated date range. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/category_trends/live/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    List<ContentAnalysisCategoryTrendsLiveRequestInfo> contentAnalysisCategoryTrendsLiveRequestInfo = Arrays.asList(); // List<ContentAnalysisCategoryTrendsLiveRequestInfo> | 
    try {
      ContentAnalysisCategoryTrendsLiveResponseInfo result = apiInstance.categoryTrendsLive(contentAnalysisCategoryTrendsLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#categoryTrendsLive");
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
| **contentAnalysisCategoryTrendsLiveRequestInfo** | [**List&lt;ContentAnalysisCategoryTrendsLiveRequestInfo&gt;**](ContentAnalysisCategoryTrendsLiveRequestInfo.md)|  | [optional] |

### Return type

[**ContentAnalysisCategoryTrendsLiveResponseInfo**](ContentAnalysisCategoryTrendsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentAnalysisAvailableFilters"></a>
# **contentAnalysisAvailableFilters**
> ContentAnalysisAvailableFiltersResponseInfo contentAnalysisAvailableFilters()



‌‌ Here you will find all the necessary information about filters that can be used with Content Analysis API endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/filters/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    try {
      ContentAnalysisAvailableFiltersResponseInfo result = apiInstance.contentAnalysisAvailableFilters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#contentAnalysisAvailableFilters");
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

[**ContentAnalysisAvailableFiltersResponseInfo**](ContentAnalysisAvailableFiltersResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentAnalysisCategories"></a>
# **contentAnalysisCategories**
> ContentAnalysisCategoriesResponseInfo contentAnalysisCategories()



We use Google product and service categories. This endpoint will provide you with the full list of available categories. You can also download the CSV file by this link. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/categories/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    try {
      ContentAnalysisCategoriesResponseInfo result = apiInstance.contentAnalysisCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#contentAnalysisCategories");
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

[**ContentAnalysisCategoriesResponseInfo**](ContentAnalysisCategoriesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentAnalysisIdList"></a>
# **contentAnalysisIdList**
> ContentAnalysisIdListResponseInfo contentAnalysisIdList(contentAnalysisIdListRequestInfo)



This endpoint is designed to provide you with the list of IDs and metadata of the completed Content Analysis tasks during the specified period. You will get all task IDs that were made including successful, uncompleted, and tasks that responded as errors. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/id_list/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    List<ContentAnalysisIdListRequestInfo> contentAnalysisIdListRequestInfo = Arrays.asList(); // List<ContentAnalysisIdListRequestInfo> | 
    try {
      ContentAnalysisIdListResponseInfo result = apiInstance.contentAnalysisIdList(contentAnalysisIdListRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#contentAnalysisIdList");
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
| **contentAnalysisIdListRequestInfo** | [**List&lt;ContentAnalysisIdListRequestInfo&gt;**](ContentAnalysisIdListRequestInfo.md)|  | [optional] |

### Return type

[**ContentAnalysisIdListResponseInfo**](ContentAnalysisIdListResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentAnalysisLanguages"></a>
# **contentAnalysisLanguages**
> ContentAnalysisLanguagesResponseInfo contentAnalysisLanguages()



You will receive the list of languages by calling this API.   As a response of the API server, you will receive JSON-encoded data containing a tasks array with the information specific to the set tasks. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/languages/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    try {
      ContentAnalysisLanguagesResponseInfo result = apiInstance.contentAnalysisLanguages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#contentAnalysisLanguages");
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

[**ContentAnalysisLanguagesResponseInfo**](ContentAnalysisLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentAnalysisLocations"></a>
# **contentAnalysisLocations**
> ContentAnalysisLocationsResponseInfo contentAnalysisLocations()



You will receive the list of locations by this API call. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/locations/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    try {
      ContentAnalysisLocationsResponseInfo result = apiInstance.contentAnalysisLocations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#contentAnalysisLocations");
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

[**ContentAnalysisLocationsResponseInfo**](ContentAnalysisLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentAnalysisSummaryLive"></a>
# **contentAnalysisSummaryLive**
> ContentAnalysisSummaryLiveResponseInfo contentAnalysisSummaryLive(contentAnalysisSummaryLiveRequestInfo)



‌ This endpoint will provide you with an overview of citation data available for the target keyword. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/summary/live/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    List<ContentAnalysisSummaryLiveRequestInfo> contentAnalysisSummaryLiveRequestInfo = Arrays.asList(); // List<ContentAnalysisSummaryLiveRequestInfo> | 
    try {
      ContentAnalysisSummaryLiveResponseInfo result = apiInstance.contentAnalysisSummaryLive(contentAnalysisSummaryLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#contentAnalysisSummaryLive");
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
| **contentAnalysisSummaryLiveRequestInfo** | [**List&lt;ContentAnalysisSummaryLiveRequestInfo&gt;**](ContentAnalysisSummaryLiveRequestInfo.md)|  | [optional] |

### Return type

[**ContentAnalysisSummaryLiveResponseInfo**](ContentAnalysisSummaryLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="phraseTrendsLive"></a>
# **phraseTrendsLive**
> ContentAnalysisPhraseTrendsLiveResponseInfo phraseTrendsLive(contentAnalysisPhraseTrendsLiveRequestInfo)



‌ This endpoint will provide you with data on all citations of the target keyword for the indicated date range. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/phrase_trends/live/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    List<ContentAnalysisPhraseTrendsLiveRequestInfo> contentAnalysisPhraseTrendsLiveRequestInfo = Arrays.asList(); // List<ContentAnalysisPhraseTrendsLiveRequestInfo> | 
    try {
      ContentAnalysisPhraseTrendsLiveResponseInfo result = apiInstance.phraseTrendsLive(contentAnalysisPhraseTrendsLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#phraseTrendsLive");
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
| **contentAnalysisPhraseTrendsLiveRequestInfo** | [**List&lt;ContentAnalysisPhraseTrendsLiveRequestInfo&gt;**](ContentAnalysisPhraseTrendsLiveRequestInfo.md)|  | [optional] |

### Return type

[**ContentAnalysisPhraseTrendsLiveResponseInfo**](ContentAnalysisPhraseTrendsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="ratingDistributionLive"></a>
# **ratingDistributionLive**
> ContentAnalysisRatingDistributionLiveResponseInfo ratingDistributionLive(contentAnalysisRatingDistributionLiveRequestInfo)



‌ This endpoint will provide you with rating distribution data for the keyword and other parameters specified in the request. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/rating_distribution/live/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    List<ContentAnalysisRatingDistributionLiveRequestInfo> contentAnalysisRatingDistributionLiveRequestInfo = Arrays.asList(); // List<ContentAnalysisRatingDistributionLiveRequestInfo> | 
    try {
      ContentAnalysisRatingDistributionLiveResponseInfo result = apiInstance.ratingDistributionLive(contentAnalysisRatingDistributionLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#ratingDistributionLive");
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
| **contentAnalysisRatingDistributionLiveRequestInfo** | [**List&lt;ContentAnalysisRatingDistributionLiveRequestInfo&gt;**](ContentAnalysisRatingDistributionLiveRequestInfo.md)|  | [optional] |

### Return type

[**ContentAnalysisRatingDistributionLiveResponseInfo**](ContentAnalysisRatingDistributionLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="searchLive"></a>
# **searchLive**
> ContentAnalysisSearchLiveResponseInfo searchLive(contentAnalysisSearchLiveRequestInfo)



‌ This endpoint will provide you with detailed citation data available for the target keyword. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/search/live/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    List<ContentAnalysisSearchLiveRequestInfo> contentAnalysisSearchLiveRequestInfo = Arrays.asList(); // List<ContentAnalysisSearchLiveRequestInfo> | 
    try {
      ContentAnalysisSearchLiveResponseInfo result = apiInstance.searchLive(contentAnalysisSearchLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#searchLive");
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
| **contentAnalysisSearchLiveRequestInfo** | [**List&lt;ContentAnalysisSearchLiveRequestInfo&gt;**](ContentAnalysisSearchLiveRequestInfo.md)|  | [optional] |

### Return type

[**ContentAnalysisSearchLiveResponseInfo**](ContentAnalysisSearchLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="sentimentAnalysisLive"></a>
# **sentimentAnalysisLive**
> ContentAnalysisSentimentAnalysisLiveResponseInfo sentimentAnalysisLive(contentAnalysisSentimentAnalysisLiveRequestInfo)



‌ This endpoint will provide you with sentiment analysis data for the citations available for the target keyword. for more info please visit &#39;https://docs.dataforseo.com/v3/content_analysis/sentiment_analysis/live/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.ContentAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    List<ContentAnalysisSentimentAnalysisLiveRequestInfo> contentAnalysisSentimentAnalysisLiveRequestInfo = Arrays.asList(); // List<ContentAnalysisSentimentAnalysisLiveRequestInfo> | 
    try {
      ContentAnalysisSentimentAnalysisLiveResponseInfo result = apiInstance.sentimentAnalysisLive(contentAnalysisSentimentAnalysisLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#sentimentAnalysisLive");
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
| **contentAnalysisSentimentAnalysisLiveRequestInfo** | [**List&lt;ContentAnalysisSentimentAnalysisLiveRequestInfo&gt;**](ContentAnalysisSentimentAnalysisLiveRequestInfo.md)|  | [optional] |

### Return type

[**ContentAnalysisSentimentAnalysisLiveResponseInfo**](ContentAnalysisSentimentAnalysisLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


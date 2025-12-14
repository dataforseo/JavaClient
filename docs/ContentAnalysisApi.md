# ContentAnalysisApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contentAnalysisIdList**](ContentAnalysisApi.md#contentAnalysisIdList) | **POST**  /v3/content_analysis/id_list  |
| [**contentAnalysisAvailableFilters**](ContentAnalysisApi.md#contentAnalysisAvailableFilters) | **GET**  /v3/content_analysis/available_filters  |
| [**locations**](ContentAnalysisApi.md#locations) | **GET**  /v3/content_analysis/locations  |
| [**languages**](ContentAnalysisApi.md#languages) | **GET**  /v3/content_analysis/languages  |
| [**contentAnalysisCategories**](ContentAnalysisApi.md#contentAnalysisCategories) | **GET**  /v3/content_analysis/categories  |
| [**searchLive**](ContentAnalysisApi.md#searchLive) | **POST**  /v3/content_analysis/search/live  |
| [**contentAnalysisSummaryLive**](ContentAnalysisApi.md#contentAnalysisSummaryLive) | **POST**  /v3/content_analysis/summary/live  |
| [**sentimentAnalysisLive**](ContentAnalysisApi.md#sentimentAnalysisLive) | **POST**  /v3/content_analysis/sentiment_analysis/live  |
| [**ratingDistributionLive**](ContentAnalysisApi.md#ratingDistributionLive) | **POST**  /v3/content_analysis/rating_distribution/live  |
| [**phraseTrendsLive**](ContentAnalysisApi.md#phraseTrendsLive) | **POST**  /v3/content_analysis/phrase_trends/live  |
| [**categoryTrendsLive**](ContentAnalysisApi.md#categoryTrendsLive) | **POST**  /v3/content_analysis/category_trends/live  |

<a id="contentAnalysisIdList"></a>
# **contentAnalysisIdList**
> ContentAnalysisIdListResponseInfo contentAnalysisIdList()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    ContentAnalysisIdListResponseInfo response = apiInstance.contentAnalysisIdList(
       List.of(
    
           new ContentAnalysisIdListRequestInfo()
        
           .datetimeFrom()
        
        
           .datetimeTo()
        
        
           .limit(100)
        
        
           .offset(0)
        
        
           .sort("desc")
        
        
           .includeMetadata(true)
    
       )
    );
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
    | **** | [**List&lt;List<ContentAnalysisIdListRequestInfo>&gt;**](List<ContentAnalysisIdListRequestInfo>.md)|  | [optional] |



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

<a id="contentAnalysisAvailableFilters"></a>
# **contentAnalysisAvailableFilters**
> ContentAnalysisAvailableFiltersResponseInfo contentAnalysisAvailableFilters()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);

    ContentAnalysisAvailableFiltersResponseInfo response = apiInstance.contentAnalysisAvailableFilters();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="locations"></a>
# **locations**
> ContentAnalysisLocationsResponseInfo locations()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);

    ContentAnalysisLocationsResponseInfo response = apiInstance.locations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#locations");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="languages"></a>
# **languages**
> ContentAnalysisLanguagesResponseInfo languages()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);

    ContentAnalysisLanguagesResponseInfo response = apiInstance.languages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling ContentAnalysisApi#languages");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentAnalysisCategories"></a>
# **contentAnalysisCategories**
> ContentAnalysisCategoriesResponseInfo contentAnalysisCategories()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);

    ContentAnalysisCategoriesResponseInfo response = apiInstance.contentAnalysisCategories();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="searchLive"></a>
# **searchLive**
> ContentAnalysisSearchLiveResponseInfo searchLive()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    ContentAnalysisSearchLiveResponseInfo response = apiInstance.searchLive(
       List.of(
    
           new ContentAnalysisSearchLiveRequestInfo()
        
           .keywordFields(Map.of(
    
           "snippet", "logitech"
    
    
       ))
        
        
           .keyword("logitech")
        
        
           .pageType(List.of(
    
           "ecommerce",
    
           "news",
    
           "blogs",
    
           "message-boards",
    
           "organization"
    
       ))
        
        
           .searchMode("as_is")
        
        
           .filters(List.of(
    
           "main_domain",
    
           "=",
    
           "reviewfinder.ca"
    
       ))
        
        
           .orderBy(List.of(
    
           "content_info.sentiment_connotations.anger,desc"
    
       ))
        
        
           .limit(10)
    
       )
    );
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
    | **** | [**List&lt;List<ContentAnalysisSearchLiveRequestInfo>&gt;**](List<ContentAnalysisSearchLiveRequestInfo>.md)|  | [optional] |



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

<a id="contentAnalysisSummaryLive"></a>
# **contentAnalysisSummaryLive**
> ContentAnalysisSummaryLiveResponseInfo contentAnalysisSummaryLive()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    ContentAnalysisSummaryLiveResponseInfo response = apiInstance.contentAnalysisSummaryLive(
       List.of(
    
           new ContentAnalysisSummaryLiveRequestInfo()
        
           .keyword("logitech")
        
        
           .pageType(List.of(
    
           "ecommerce",
    
           "news",
    
           "blogs",
    
           "message-boards",
    
           "organization"
    
       ))
        
        
           .internalListLimit(8)
        
        
           .positiveConnotationThreshold(0.5d)
    
       )
    );
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
    | **** | [**List&lt;List<ContentAnalysisSummaryLiveRequestInfo>&gt;**](List<ContentAnalysisSummaryLiveRequestInfo>.md)|  | [optional] |



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

<a id="sentimentAnalysisLive"></a>
# **sentimentAnalysisLive**
> ContentAnalysisSentimentAnalysisLiveResponseInfo sentimentAnalysisLive()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    ContentAnalysisSentimentAnalysisLiveResponseInfo response = apiInstance.sentimentAnalysisLive(
       List.of(
    
           new ContentAnalysisSentimentAnalysisLiveRequestInfo()
        
           .keyword("logitech")
        
        
           .internalListLimit(1)
    
       )
    );
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
    | **** | [**List&lt;List<ContentAnalysisSentimentAnalysisLiveRequestInfo>&gt;**](List<ContentAnalysisSentimentAnalysisLiveRequestInfo>.md)|  | [optional] |



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

<a id="ratingDistributionLive"></a>
# **ratingDistributionLive**
> ContentAnalysisRatingDistributionLiveResponseInfo ratingDistributionLive()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    ContentAnalysisRatingDistributionLiveResponseInfo response = apiInstance.ratingDistributionLive(
       List.of(
    
           new ContentAnalysisRatingDistributionLiveRequestInfo()
        
           .keyword("logitech")
        
        
           .searchMode("as_is")
        
        
           .internalListLimit(10)
    
       )
    );
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
    | **** | [**List&lt;List<ContentAnalysisRatingDistributionLiveRequestInfo>&gt;**](List<ContentAnalysisRatingDistributionLiveRequestInfo>.md)|  | [optional] |



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

<a id="phraseTrendsLive"></a>
# **phraseTrendsLive**
> ContentAnalysisPhraseTrendsLiveResponseInfo phraseTrendsLive()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    ContentAnalysisPhraseTrendsLiveResponseInfo response = apiInstance.phraseTrendsLive(
       List.of(
    
           new ContentAnalysisPhraseTrendsLiveRequestInfo()
        
           .keyword("logitech")
        
        
           .searchMode("as_is")
        
        
           .dateFrom()
        
        
           .dateGroup("month")
    
       )
    );
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
    | **** | [**List&lt;List<ContentAnalysisPhraseTrendsLiveRequestInfo>&gt;**](List<ContentAnalysisPhraseTrendsLiveRequestInfo>.md)|  | [optional] |



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

<a id="categoryTrendsLive"></a>
# **categoryTrendsLive**
> ContentAnalysisCategoryTrendsLiveResponseInfo categoryTrendsLive()


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
    ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
    ContentAnalysisCategoryTrendsLiveResponseInfo response = apiInstance.categoryTrendsLive(
       List.of(
    
           new ContentAnalysisCategoryTrendsLiveRequestInfo()
        
           .categoryCode(10994)
        
        
           .searchMode("as_is")
        
        
           .dateFrom()
        
        
           .dateGroup("month")
    
       )
    );
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
    | **** | [**List&lt;List<ContentAnalysisCategoryTrendsLiveRequestInfo>&gt;**](List<ContentAnalysisCategoryTrendsLiveRequestInfo>.md)|  | [optional] |



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
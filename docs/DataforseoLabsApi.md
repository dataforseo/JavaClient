# DataforseoLabsApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dataforseoLabsIdList**](DataforseoLabsApi.md#dataforseoLabsIdList) | **POST**  /v3/dataforseo_labs/id_list  |
| [**status**](DataforseoLabsApi.md#status) | **GET**  /v3/dataforseo_labs/status  |
| [**dataforseoLabsErrors**](DataforseoLabsApi.md#dataforseoLabsErrors) | **POST**  /v3/dataforseo_labs/errors  |
| [**availableFilters**](DataforseoLabsApi.md#availableFilters) | **GET**  /v3/dataforseo_labs/available_filters  |
| [**locationsAndLanguages**](DataforseoLabsApi.md#locationsAndLanguages) | **GET**  /v3/dataforseo_labs/locations_and_languages  |
| [**categories**](DataforseoLabsApi.md#categories) | **GET**  /v3/dataforseo_labs/categories  |
| [**googleAvailableHistory**](DataforseoLabsApi.md#googleAvailableHistory) | **GET**  /v3/dataforseo_labs/google/available_history  |
| [**googleKeywordsForSiteLive**](DataforseoLabsApi.md#googleKeywordsForSiteLive) | **POST**  /v3/dataforseo_labs/google/keywords_for_site/live  |
| [**googleRelatedKeywordsLive**](DataforseoLabsApi.md#googleRelatedKeywordsLive) | **POST**  /v3/dataforseo_labs/google/related_keywords/live  |
| [**googleKeywordSuggestionsLive**](DataforseoLabsApi.md#googleKeywordSuggestionsLive) | **POST**  /v3/dataforseo_labs/google/keyword_suggestions/live  |
| [**googleKeywordIdeasLive**](DataforseoLabsApi.md#googleKeywordIdeasLive) | **POST**  /v3/dataforseo_labs/google/keyword_ideas/live  |
| [**googleBulkKeywordDifficultyLive**](DataforseoLabsApi.md#googleBulkKeywordDifficultyLive) | **POST**  /v3/dataforseo_labs/google/bulk_keyword_difficulty/live  |
| [**googleSearchIntentLive**](DataforseoLabsApi.md#googleSearchIntentLive) | **POST**  /v3/dataforseo_labs/google/search_intent/live  |
| [**googleCategoriesForKeywordsLanguages**](DataforseoLabsApi.md#googleCategoriesForKeywordsLanguages) | **GET**  /v3/dataforseo_labs/google/categories_for_keywords/languages  |
| [**googleCategoriesForDomainLive**](DataforseoLabsApi.md#googleCategoriesForDomainLive) | **POST**  /v3/dataforseo_labs/google/categories_for_domain/live  |
| [**googleCategoriesForKeywordsLive**](DataforseoLabsApi.md#googleCategoriesForKeywordsLive) | **POST**  /v3/dataforseo_labs/google/categories_for_keywords/live  |
| [**googleKeywordsForCategoriesLive**](DataforseoLabsApi.md#googleKeywordsForCategoriesLive) | **POST**  /v3/dataforseo_labs/google/keywords_for_categories/live  |
| [**googleDomainMetricsByCategoriesLive**](DataforseoLabsApi.md#googleDomainMetricsByCategoriesLive) | **POST**  /v3/dataforseo_labs/google/domain_metrics_by_categories/live  |
| [**googleTopSearchesLive**](DataforseoLabsApi.md#googleTopSearchesLive) | **POST**  /v3/dataforseo_labs/google/top_searches/live  |
| [**googleDomainWhoisOverviewLive**](DataforseoLabsApi.md#googleDomainWhoisOverviewLive) | **POST**  /v3/dataforseo_labs/google/domain_whois_overview/live  |
| [**googleRankedKeywordsLive**](DataforseoLabsApi.md#googleRankedKeywordsLive) | **POST**  /v3/dataforseo_labs/google/ranked_keywords/live  |
| [**googleSerpCompetitorsLive**](DataforseoLabsApi.md#googleSerpCompetitorsLive) | **POST**  /v3/dataforseo_labs/google/serp_competitors/live  |
| [**googleCompetitorsDomainLive**](DataforseoLabsApi.md#googleCompetitorsDomainLive) | **POST**  /v3/dataforseo_labs/google/competitors_domain/live  |
| [**googleDomainIntersectionLive**](DataforseoLabsApi.md#googleDomainIntersectionLive) | **POST**  /v3/dataforseo_labs/google/domain_intersection/live  |
| [**googleSubdomainsLive**](DataforseoLabsApi.md#googleSubdomainsLive) | **POST**  /v3/dataforseo_labs/google/subdomains/live  |
| [**googleRelevantPagesLive**](DataforseoLabsApi.md#googleRelevantPagesLive) | **POST**  /v3/dataforseo_labs/google/relevant_pages/live  |
| [**googleDomainRankOverviewLive**](DataforseoLabsApi.md#googleDomainRankOverviewLive) | **POST**  /v3/dataforseo_labs/google/domain_rank_overview/live  |
| [**googleHistoricalSerpsLive**](DataforseoLabsApi.md#googleHistoricalSerpsLive) | **POST**  /v3/dataforseo_labs/google/historical_serps/live  |
| [**googleHistoricalRankOverviewLive**](DataforseoLabsApi.md#googleHistoricalRankOverviewLive) | **POST**  /v3/dataforseo_labs/google/historical_rank_overview/live  |
| [**googlePageIntersectionLive**](DataforseoLabsApi.md#googlePageIntersectionLive) | **POST**  /v3/dataforseo_labs/google/page_intersection/live  |
| [**googleBulkTrafficEstimationLive**](DataforseoLabsApi.md#googleBulkTrafficEstimationLive) | **POST**  /v3/dataforseo_labs/google/bulk_traffic_estimation/live  |
| [**googleHistoricalBulkTrafficEstimationLive**](DataforseoLabsApi.md#googleHistoricalBulkTrafficEstimationLive) | **POST**  /v3/dataforseo_labs/google/historical_bulk_traffic_estimation/live  |
| [**googleHistoricalKeywordDataLive**](DataforseoLabsApi.md#googleHistoricalKeywordDataLive) | **POST**  /v3/dataforseo_labs/google/historical_keyword_data/live  |
| [**googleKeywordOverviewLive**](DataforseoLabsApi.md#googleKeywordOverviewLive) | **POST**  /v3/dataforseo_labs/google/keyword_overview/live  |
| [**amazonBulkSearchVolumeLive**](DataforseoLabsApi.md#amazonBulkSearchVolumeLive) | **POST**  /v3/dataforseo_labs/amazon/bulk_search_volume/live  |
| [**amazonRelatedKeywordsLive**](DataforseoLabsApi.md#amazonRelatedKeywordsLive) | **POST**  /v3/dataforseo_labs/amazon/related_keywords/live  |
| [**amazonRankedKeywordsLive**](DataforseoLabsApi.md#amazonRankedKeywordsLive) | **POST**  /v3/dataforseo_labs/amazon/ranked_keywords/live  |
| [**amazonProductRankOverviewLive**](DataforseoLabsApi.md#amazonProductRankOverviewLive) | **POST**  /v3/dataforseo_labs/amazon/product_rank_overview/live  |
| [**amazonProductCompetitorsLive**](DataforseoLabsApi.md#amazonProductCompetitorsLive) | **POST**  /v3/dataforseo_labs/amazon/product_competitors/live  |
| [**amazonProductKeywordIntersectionsLive**](DataforseoLabsApi.md#amazonProductKeywordIntersectionsLive) | **POST**  /v3/dataforseo_labs/amazon/product_keyword_intersections/live  |
| [**bingBulkKeywordDifficultyLive**](DataforseoLabsApi.md#bingBulkKeywordDifficultyLive) | **POST**  /v3/dataforseo_labs/bing/bulk_keyword_difficulty/live  |
| [**bingBulkTrafficEstimationLive**](DataforseoLabsApi.md#bingBulkTrafficEstimationLive) | **POST**  /v3/dataforseo_labs/bing/bulk_traffic_estimation/live  |
| [**bingCompetitorsDomainLive**](DataforseoLabsApi.md#bingCompetitorsDomainLive) | **POST**  /v3/dataforseo_labs/bing/competitors_domain/live  |
| [**bingDomainIntersectionLive**](DataforseoLabsApi.md#bingDomainIntersectionLive) | **POST**  /v3/dataforseo_labs/bing/domain_intersection/live  |
| [**bingDomainRankOverviewLive**](DataforseoLabsApi.md#bingDomainRankOverviewLive) | **POST**  /v3/dataforseo_labs/bing/domain_rank_overview/live  |
| [**bingPageIntersectionLive**](DataforseoLabsApi.md#bingPageIntersectionLive) | **POST**  /v3/dataforseo_labs/bing/page_intersection/live  |
| [**bingRankedKeywordsLive**](DataforseoLabsApi.md#bingRankedKeywordsLive) | **POST**  /v3/dataforseo_labs/bing/ranked_keywords/live  |
| [**bingRelatedKeywordsLive**](DataforseoLabsApi.md#bingRelatedKeywordsLive) | **POST**  /v3/dataforseo_labs/bing/related_keywords/live  |
| [**bingRelevantPagesLive**](DataforseoLabsApi.md#bingRelevantPagesLive) | **POST**  /v3/dataforseo_labs/bing/relevant_pages/live  |
| [**bingSerpCompetitorsLive**](DataforseoLabsApi.md#bingSerpCompetitorsLive) | **POST**  /v3/dataforseo_labs/bing/serp_competitors/live  |
| [**bingSubdomainsLive**](DataforseoLabsApi.md#bingSubdomainsLive) | **POST**  /v3/dataforseo_labs/bing/subdomains/live  |
| [**googleBulkAppMetricsLive**](DataforseoLabsApi.md#googleBulkAppMetricsLive) | **POST**  /v3/dataforseo_labs/google/bulk_app_metrics/live  |
| [**googleKeywordsForAppLive**](DataforseoLabsApi.md#googleKeywordsForAppLive) | **POST**  /v3/dataforseo_labs/google/keywords_for_app/live  |
| [**googleAppCompetitorsLive**](DataforseoLabsApi.md#googleAppCompetitorsLive) | **POST**  /v3/dataforseo_labs/google/app_competitors/live  |
| [**googleAppIntersectionLive**](DataforseoLabsApi.md#googleAppIntersectionLive) | **POST**  /v3/dataforseo_labs/google/app_intersection/live  |
| [**appleBulkAppMetricsLive**](DataforseoLabsApi.md#appleBulkAppMetricsLive) | **POST**  /v3/dataforseo_labs/apple/bulk_app_metrics/live  |
| [**appleKeywordsForAppLive**](DataforseoLabsApi.md#appleKeywordsForAppLive) | **POST**  /v3/dataforseo_labs/apple/keywords_for_app/live  |
| [**appleAppCompetitorsLive**](DataforseoLabsApi.md#appleAppCompetitorsLive) | **POST**  /v3/dataforseo_labs/apple/app_competitors/live  |
| [**appleAppIntersectionLive**](DataforseoLabsApi.md#appleAppIntersectionLive) | **POST**  /v3/dataforseo_labs/apple/app_intersection/live  |

<a id="dataforseoLabsIdList"></a>
# **dataforseoLabsIdList**
> DataforseoLabsIdListResponseInfo dataforseoLabsIdList()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsIdListResponseInfo response = apiInstance.dataforseoLabsIdList(
       List.of(
    
           new DataforseoLabsIdListRequestInfo()
        
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
      System.err.println("Exception when calling DataforseoLabsApi#dataforseoLabsIdList");
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
    | **** | [**List&lt;List<DataforseoLabsIdListRequestInfo>&gt;**](List<DataforseoLabsIdListRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsIdListResponseInfo**](DataforseoLabsIdListResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="status"></a>
# **status**
> DataforseoLabsStatusResponseInfo status()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);

    DataforseoLabsStatusResponseInfo response = apiInstance.status();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#status");
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

[**DataforseoLabsStatusResponseInfo**](DataforseoLabsStatusResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="dataforseoLabsErrors"></a>
# **dataforseoLabsErrors**
> DataforseoLabsErrorsResponseInfo dataforseoLabsErrors()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsErrorsResponseInfo response = apiInstance.dataforseoLabsErrors(
       List.of(
    
           new DataforseoLabsErrorsRequestInfo()
        
           .limit(10)
        
        
           .offset(0)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#dataforseoLabsErrors");
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
    | **** | [**List&lt;List<DataforseoLabsErrorsRequestInfo>&gt;**](List<DataforseoLabsErrorsRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsErrorsResponseInfo**](DataforseoLabsErrorsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="availableFilters"></a>
# **availableFilters**
> DataforseoLabsAvailableFiltersResponseInfo availableFilters()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);

    DataforseoLabsAvailableFiltersResponseInfo response = apiInstance.availableFilters();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#availableFilters");
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

[**DataforseoLabsAvailableFiltersResponseInfo**](DataforseoLabsAvailableFiltersResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="locationsAndLanguages"></a>
# **locationsAndLanguages**
> DataforseoLabsLocationsAndLanguagesResponseInfo locationsAndLanguages()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);

    DataforseoLabsLocationsAndLanguagesResponseInfo response = apiInstance.locationsAndLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#locationsAndLanguages");
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

[**DataforseoLabsLocationsAndLanguagesResponseInfo**](DataforseoLabsLocationsAndLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="categories"></a>
# **categories**
> DataforseoLabsCategoriesResponseInfo categories()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);

    DataforseoLabsCategoriesResponseInfo response = apiInstance.categories();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#categories");
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

[**DataforseoLabsCategoriesResponseInfo**](DataforseoLabsCategoriesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAvailableHistory"></a>
# **googleAvailableHistory**
> DataforseoLabsGoogleAvailableHistoryResponseInfo googleAvailableHistory()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);

    DataforseoLabsGoogleAvailableHistoryResponseInfo response = apiInstance.googleAvailableHistory();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleAvailableHistory");
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

[**DataforseoLabsGoogleAvailableHistoryResponseInfo**](DataforseoLabsGoogleAvailableHistoryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleKeywordsForSiteLive"></a>
# **googleKeywordsForSiteLive**
> DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo googleKeywordsForSiteLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo response = apiInstance.googleKeywordsForSiteLive(
       List.of(
    
           new DataforseoLabsGoogleKeywordsForSiteLiveRequestInfo()
        
           .target("apple.com")
        
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .includeSerpInfo(true)
        
        
           .includeSubdomains(true)
        
        
           .filters(List.of(
    
           "serp_info.se_results_count",
    
           ">",
    
           0
    
       ))
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleKeywordsForSiteLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleKeywordsForSiteLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleKeywordsForSiteLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo**](DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleRelatedKeywordsLive"></a>
# **googleRelatedKeywordsLive**
> DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo googleRelatedKeywordsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo response = apiInstance.googleRelatedKeywordsLive(
       List.of(
    
           new DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo()
        
           .keyword("phone")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleRelatedKeywordsLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo**](DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleKeywordSuggestionsLive"></a>
# **googleKeywordSuggestionsLive**
> DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo googleKeywordSuggestionsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo response = apiInstance.googleKeywordSuggestionsLive(
       List.of(
    
           new DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo()
        
           .keyword("phone")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .includeSerpInfo(true)
        
        
           .includeSeedKeyword(true)
        
        
           .limit(1)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleKeywordSuggestionsLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo**](DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleKeywordIdeasLive"></a>
# **googleKeywordIdeasLive**
> DataforseoLabsGoogleKeywordIdeasLiveResponseInfo googleKeywordIdeasLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleKeywordIdeasLiveResponseInfo response = apiInstance.googleKeywordIdeasLive(
       List.of(
    
           new DataforseoLabsGoogleKeywordIdeasLiveRequestInfo()
        
           .keywords(List.of(
    
           "phone",
    
           "watch"
    
       ))
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .includeSerpInfo(true)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleKeywordIdeasLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleKeywordIdeasLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleKeywordIdeasLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleKeywordIdeasLiveResponseInfo**](DataforseoLabsGoogleKeywordIdeasLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleBulkKeywordDifficultyLive"></a>
# **googleBulkKeywordDifficultyLive**
> DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo googleBulkKeywordDifficultyLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo response = apiInstance.googleBulkKeywordDifficultyLive(
       List.of(
    
           new DataforseoLabsGoogleBulkKeywordDifficultyLiveRequestInfo()
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .keywords(List.of(
    
           "dentist new york",
    
           "pizza brooklyn",
    
           "car dealer los angeles"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleBulkKeywordDifficultyLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleBulkKeywordDifficultyLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleBulkKeywordDifficultyLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo**](DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSearchIntentLive"></a>
# **googleSearchIntentLive**
> DataforseoLabsGoogleSearchIntentLiveResponseInfo googleSearchIntentLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleSearchIntentLiveResponseInfo response = apiInstance.googleSearchIntentLive(
       List.of(
    
           new DataforseoLabsGoogleSearchIntentLiveRequestInfo()
        
           .languageCode("en")
        
        
           .keywords(List.of(
    
           "login page",
    
           "audi a7",
    
           "elon musk",
    
           "milk store new york"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleSearchIntentLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleSearchIntentLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleSearchIntentLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleSearchIntentLiveResponseInfo**](DataforseoLabsGoogleSearchIntentLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleCategoriesForKeywordsLanguages"></a>
# **googleCategoriesForKeywordsLanguages**
> DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo googleCategoriesForKeywordsLanguages()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);

    DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo response = apiInstance.googleCategoriesForKeywordsLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleCategoriesForKeywordsLanguages");
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

[**DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo**](DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleCategoriesForDomainLive"></a>
# **googleCategoriesForDomainLive**
> DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo googleCategoriesForDomainLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo response = apiInstance.googleCategoriesForDomainLive(
       List.of(
    
           new DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo()
        
           .target("dataforseo.com")
        
        
           .languageCode("en")
        
        
           .locationName("United States")
        
        
           .itemTypes(List.of(
    
           "paid",
    
           "organic",
    
           "featured_snippet",
    
           "local_pack"
    
       ))
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleCategoriesForDomainLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo**](DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleCategoriesForKeywordsLive"></a>
# **googleCategoriesForKeywordsLive**
> DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo googleCategoriesForKeywordsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo response = apiInstance.googleCategoriesForKeywordsLive(
       List.of(
    
           new DataforseoLabsGoogleCategoriesForKeywordsLiveRequestInfo()
        
           .languageCode("en")
        
        
           .keywords(List.of(
    
           "dentist new york",
    
           "pizza brooklyn",
    
           "car dealer los angeles"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleCategoriesForKeywordsLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleCategoriesForKeywordsLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleCategoriesForKeywordsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo**](DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleKeywordsForCategoriesLive"></a>
# **googleKeywordsForCategoriesLive**
> DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo googleKeywordsForCategoriesLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo response = apiInstance.googleKeywordsForCategoriesLive(
       List.of(
    
           new DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo()
        
           .categoryCodes(List.of(
    
           12191,
    
           12193
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .includeSerpInfo(true)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleKeywordsForCategoriesLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo**](DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDomainMetricsByCategoriesLive"></a>
# **googleDomainMetricsByCategoriesLive**
> DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo googleDomainMetricsByCategoriesLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo response = apiInstance.googleDomainMetricsByCategoriesLive(
       List.of(
    
           new DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo()
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .categoryCodes(List.of(
    
           13418,
    
           11494
    
       ))
        
        
           .firstDate()
        
        
           .secondDate()
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleDomainMetricsByCategoriesLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo**](DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleTopSearchesLive"></a>
# **googleTopSearchesLive**
> DataforseoLabsGoogleTopSearchesLiveResponseInfo googleTopSearchesLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleTopSearchesLiveResponseInfo response = apiInstance.googleTopSearchesLive(
       List.of(
    
           new DataforseoLabsGoogleTopSearchesLiveRequestInfo()
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleTopSearchesLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleTopSearchesLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleTopSearchesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleTopSearchesLiveResponseInfo**](DataforseoLabsGoogleTopSearchesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDomainWhoisOverviewLive"></a>
# **googleDomainWhoisOverviewLive**
> DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo googleDomainWhoisOverviewLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo response = apiInstance.googleDomainWhoisOverviewLive(
       List.of(
    
           new DataforseoLabsGoogleDomainWhoisOverviewLiveRequestInfo()
        
           .limit(2)
        
        
           .filters(List.of(
    
           List.of(
    
           "epp_status_codes",
    
           "in",
    
           List.of(
    
           "client_transfer_prohibited",
    
           "client_update_prohibited"
    
       )
    
       )
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleDomainWhoisOverviewLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleDomainWhoisOverviewLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleDomainWhoisOverviewLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo**](DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleRankedKeywordsLive"></a>
# **googleRankedKeywordsLive**
> DataforseoLabsGoogleRankedKeywordsLiveResponseInfo googleRankedKeywordsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleRankedKeywordsLiveResponseInfo response = apiInstance.googleRankedKeywordsLive(
       List.of(
    
           new DataforseoLabsGoogleRankedKeywordsLiveRequestInfo()
        
           .target("dataforseo.com")
        
        
           .languageName("English")
        
        
           .locationName("United States")
        
        
           .loadRankAbsolute(true)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleRankedKeywordsLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleRankedKeywordsLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleRankedKeywordsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleRankedKeywordsLiveResponseInfo**](DataforseoLabsGoogleRankedKeywordsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSerpCompetitorsLive"></a>
# **googleSerpCompetitorsLive**
> DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo googleSerpCompetitorsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo response = apiInstance.googleSerpCompetitorsLive(
       List.of(
    
           new DataforseoLabsGoogleSerpCompetitorsLiveRequestInfo()
        
           .keywords(List.of(
    
           "phone"
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .itemTypes(List.of(
    
           "organic"
    
       ))
        
        
           .limit(5)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleSerpCompetitorsLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleSerpCompetitorsLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleSerpCompetitorsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo**](DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleCompetitorsDomainLive"></a>
# **googleCompetitorsDomainLive**
> DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo googleCompetitorsDomainLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo response = apiInstance.googleCompetitorsDomainLive(
       List.of(
    
           new DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo()
        
           .target("newmouth.com")
        
        
           .intersectingDomains(List.of(
    
           "dentaly.org",
    
           "health.com",
    
           "trysnow.com"
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleCompetitorsDomainLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo**](DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDomainIntersectionLive"></a>
# **googleDomainIntersectionLive**
> DataforseoLabsGoogleDomainIntersectionLiveResponseInfo googleDomainIntersectionLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleDomainIntersectionLiveResponseInfo response = apiInstance.googleDomainIntersectionLive(
       List.of(
    
           new DataforseoLabsGoogleDomainIntersectionLiveRequestInfo()
        
           .target1("mom.com")
        
        
           .target2("quora.com")
        
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .includeSerpInfo(true)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleDomainIntersectionLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleDomainIntersectionLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleDomainIntersectionLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleDomainIntersectionLiveResponseInfo**](DataforseoLabsGoogleDomainIntersectionLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSubdomainsLive"></a>
# **googleSubdomainsLive**
> DataforseoLabsGoogleSubdomainsLiveResponseInfo googleSubdomainsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleSubdomainsLiveResponseInfo response = apiInstance.googleSubdomainsLive(
       List.of(
    
           new DataforseoLabsGoogleSubdomainsLiveRequestInfo()
        
           .target("dataforseo.com")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .filters(List.of(
    
           List.of(
    
           "metrics.organic.pos_1",
    
           "<>",
    
           0
    
       ),
    
           "or",
    
           List.of(
    
           "metrics.organic.pos_2_3",
    
           "<>",
    
           0
    
       )
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleSubdomainsLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleSubdomainsLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleSubdomainsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleSubdomainsLiveResponseInfo**](DataforseoLabsGoogleSubdomainsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleRelevantPagesLive"></a>
# **googleRelevantPagesLive**
> DataforseoLabsGoogleRelevantPagesLiveResponseInfo googleRelevantPagesLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleRelevantPagesLiveResponseInfo response = apiInstance.googleRelevantPagesLive(
       List.of(
    
           new DataforseoLabsGoogleRelevantPagesLiveRequestInfo()
        
           .target("amazon.com")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .filters(List.of(
    
           List.of(
    
           "metrics.organic.pos_1",
    
           "<>",
    
           0
    
       ),
    
           "or",
    
           List.of(
    
           "metrics.organic.pos_2_3",
    
           "<>",
    
           0
    
       )
    
       ))
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleRelevantPagesLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleRelevantPagesLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleRelevantPagesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleRelevantPagesLiveResponseInfo**](DataforseoLabsGoogleRelevantPagesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDomainRankOverviewLive"></a>
# **googleDomainRankOverviewLive**
> DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo googleDomainRankOverviewLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo response = apiInstance.googleDomainRankOverviewLive(
       List.of(
    
           new DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo()
        
           .target("dataforseo.com")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleDomainRankOverviewLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo**](DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHistoricalSerpsLive"></a>
# **googleHistoricalSerpsLive**
> DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo googleHistoricalSerpsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo response = apiInstance.googleHistoricalSerpsLive(
       List.of(
    
           new DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo()
        
           .keyword("albert einstein")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .dateFrom()
        
        
           .dateTo()
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleHistoricalSerpsLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo**](DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHistoricalRankOverviewLive"></a>
# **googleHistoricalRankOverviewLive**
> DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo googleHistoricalRankOverviewLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo response = apiInstance.googleHistoricalRankOverviewLive(
       List.of(
    
           new DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo()
        
           .target("dataforseo.com")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .dateFrom()
        
        
           .dateTo()
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleHistoricalRankOverviewLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo**](DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googlePageIntersectionLive"></a>
# **googlePageIntersectionLive**
> DataforseoLabsGooglePageIntersectionLiveResponseInfo googlePageIntersectionLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGooglePageIntersectionLiveResponseInfo response = apiInstance.googlePageIntersectionLive(
       List.of(
    
           new DataforseoLabsGooglePageIntersectionLiveRequestInfo()
        
           .pages(Map.of(
    
           "1", "https://forbes.com"
           ,
    
           "2", "https://cnn.com/*"
    
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .includeSerpInfo(true)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googlePageIntersectionLive");
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
    | **** | [**List&lt;List<DataforseoLabsGooglePageIntersectionLiveRequestInfo>&gt;**](List<DataforseoLabsGooglePageIntersectionLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGooglePageIntersectionLiveResponseInfo**](DataforseoLabsGooglePageIntersectionLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleBulkTrafficEstimationLive"></a>
# **googleBulkTrafficEstimationLive**
> DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo googleBulkTrafficEstimationLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo response = apiInstance.googleBulkTrafficEstimationLive(
       List.of(
    
           new DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo()
        
           .targets(List.of(
    
           "dataforseo.com",
    
           "cnn.com",
    
           "forbes.com"
    
       ))
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .itemTypes(List.of(
    
           "organic",
    
           "paid"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleBulkTrafficEstimationLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo**](DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHistoricalBulkTrafficEstimationLive"></a>
# **googleHistoricalBulkTrafficEstimationLive**
> DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo googleHistoricalBulkTrafficEstimationLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo response = apiInstance.googleHistoricalBulkTrafficEstimationLive(
       List.of(
    
           new DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo()
        
           .targets(List.of(
    
           "dataforseo.com",
    
           "cnn.com",
    
           "forbes.com"
    
       ))
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .dateFrom()
        
        
           .dateTo()
        
        
           .itemTypes(List.of(
    
           "organic",
    
           "paid"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleHistoricalBulkTrafficEstimationLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo**](DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHistoricalKeywordDataLive"></a>
# **googleHistoricalKeywordDataLive**
> DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo googleHistoricalKeywordDataLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo response = apiInstance.googleHistoricalKeywordDataLive(
       List.of(
    
           new DataforseoLabsGoogleHistoricalKeywordDataLiveRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keywords(List.of(
    
           "iphone"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleHistoricalKeywordDataLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleHistoricalKeywordDataLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleHistoricalKeywordDataLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo**](DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleKeywordOverviewLive"></a>
# **googleKeywordOverviewLive**
> DataforseoLabsGoogleKeywordOverviewLiveResponseInfo googleKeywordOverviewLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleKeywordOverviewLiveResponseInfo response = apiInstance.googleKeywordOverviewLive(
       List.of(
    
           new DataforseoLabsGoogleKeywordOverviewLiveRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .includeClickstreamData(true)
        
        
           .includeSerpInfo(true)
        
        
           .keywords(List.of(
    
           "iphone"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleKeywordOverviewLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleKeywordOverviewLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleKeywordOverviewLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleKeywordOverviewLiveResponseInfo**](DataforseoLabsGoogleKeywordOverviewLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonBulkSearchVolumeLive"></a>
# **amazonBulkSearchVolumeLive**
> DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo amazonBulkSearchVolumeLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo response = apiInstance.amazonBulkSearchVolumeLive(
       List.of(
    
           new DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo()
        
           .keywords(List.of(
    
           "buy laptop",
    
           "cheap laptops for sale",
    
           "purchase laptop"
    
       ))
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#amazonBulkSearchVolumeLive");
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
    | **** | [**List&lt;List<DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo>&gt;**](List<DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo**](DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonRelatedKeywordsLive"></a>
# **amazonRelatedKeywordsLive**
> DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo amazonRelatedKeywordsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo response = apiInstance.amazonRelatedKeywordsLive(
       List.of(
    
           new DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo()
        
           .keyword("computer mouse")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(5)
        
        
           .includeSeedKeyword(true)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#amazonRelatedKeywordsLive");
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
    | **** | [**List&lt;List<DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo>&gt;**](List<DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo**](DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonRankedKeywordsLive"></a>
# **amazonRankedKeywordsLive**
> DataforseoLabsAmazonRankedKeywordsLiveResponseInfo amazonRankedKeywordsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsAmazonRankedKeywordsLiveResponseInfo response = apiInstance.amazonRankedKeywordsLive(
       List.of(
    
           new DataforseoLabsAmazonRankedKeywordsLiveRequestInfo()
        
           .asin("B00R92CL5E")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#amazonRankedKeywordsLive");
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
    | **** | [**List&lt;List<DataforseoLabsAmazonRankedKeywordsLiveRequestInfo>&gt;**](List<DataforseoLabsAmazonRankedKeywordsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsAmazonRankedKeywordsLiveResponseInfo**](DataforseoLabsAmazonRankedKeywordsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonProductRankOverviewLive"></a>
# **amazonProductRankOverviewLive**
> DataforseoLabsAmazonProductRankOverviewLiveResponseInfo amazonProductRankOverviewLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsAmazonProductRankOverviewLiveResponseInfo response = apiInstance.amazonProductRankOverviewLive(
       List.of(
    
           new DataforseoLabsAmazonProductRankOverviewLiveRequestInfo()
        
           .asins(List.of(
    
           "B001TJ3HUG",
    
           "B01LW2SL7R"
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#amazonProductRankOverviewLive");
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
    | **** | [**List&lt;List<DataforseoLabsAmazonProductRankOverviewLiveRequestInfo>&gt;**](List<DataforseoLabsAmazonProductRankOverviewLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsAmazonProductRankOverviewLiveResponseInfo**](DataforseoLabsAmazonProductRankOverviewLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonProductCompetitorsLive"></a>
# **amazonProductCompetitorsLive**
> DataforseoLabsAmazonProductCompetitorsLiveResponseInfo amazonProductCompetitorsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsAmazonProductCompetitorsLiveResponseInfo response = apiInstance.amazonProductCompetitorsLive(
       List.of(
    
           new DataforseoLabsAmazonProductCompetitorsLiveRequestInfo()
        
           .asin("019005476X")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#amazonProductCompetitorsLive");
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
    | **** | [**List&lt;List<DataforseoLabsAmazonProductCompetitorsLiveRequestInfo>&gt;**](List<DataforseoLabsAmazonProductCompetitorsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsAmazonProductCompetitorsLiveResponseInfo**](DataforseoLabsAmazonProductCompetitorsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonProductKeywordIntersectionsLive"></a>
# **amazonProductKeywordIntersectionsLive**
> DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo amazonProductKeywordIntersectionsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo response = apiInstance.amazonProductKeywordIntersectionsLive(
       List.of(
    
           new DataforseoLabsAmazonProductKeywordIntersectionsLiveRequestInfo()
        
           .asins(Map.of(
    
           "1", "B09172433Z"
           ,
    
           "2", "B07GBZ4Q68"
           ,
    
           "3", "B07GCKQD77"
    
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#amazonProductKeywordIntersectionsLive");
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
    | **** | [**List&lt;List<DataforseoLabsAmazonProductKeywordIntersectionsLiveRequestInfo>&gt;**](List<DataforseoLabsAmazonProductKeywordIntersectionsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo**](DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingBulkKeywordDifficultyLive"></a>
# **bingBulkKeywordDifficultyLive**
> DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo bingBulkKeywordDifficultyLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo response = apiInstance.bingBulkKeywordDifficultyLive(
       List.of(
    
           new DataforseoLabsBingBulkKeywordDifficultyLiveRequestInfo()
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .keywords(List.of(
    
           "dentist new york",
    
           "pizza brooklyn",
    
           "car dealer los angeles"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingBulkKeywordDifficultyLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingBulkKeywordDifficultyLiveRequestInfo>&gt;**](List<DataforseoLabsBingBulkKeywordDifficultyLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo**](DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingBulkTrafficEstimationLive"></a>
# **bingBulkTrafficEstimationLive**
> DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo bingBulkTrafficEstimationLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo response = apiInstance.bingBulkTrafficEstimationLive(
       List.of(
    
           new DataforseoLabsBingBulkTrafficEstimationLiveRequestInfo()
        
           .targets(List.of(
    
           "dataforseo.com",
    
           "cnn.com",
    
           "forbes.com"
    
       ))
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .itemTypes(List.of(
    
           "organic",
    
           "paid"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingBulkTrafficEstimationLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingBulkTrafficEstimationLiveRequestInfo>&gt;**](List<DataforseoLabsBingBulkTrafficEstimationLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo**](DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingCompetitorsDomainLive"></a>
# **bingCompetitorsDomainLive**
> DataforseoLabsBingCompetitorsDomainLiveResponseInfo bingCompetitorsDomainLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingCompetitorsDomainLiveResponseInfo response = apiInstance.bingCompetitorsDomainLive(
       List.of(
    
           new DataforseoLabsBingCompetitorsDomainLiveRequestInfo()
        
           .target("newmouth.com")
        
        
           .intersectingDomains(List.of(
    
           "dentaly.org",
    
           "health.com",
    
           "trysnow.com"
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingCompetitorsDomainLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingCompetitorsDomainLiveRequestInfo>&gt;**](List<DataforseoLabsBingCompetitorsDomainLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingCompetitorsDomainLiveResponseInfo**](DataforseoLabsBingCompetitorsDomainLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingDomainIntersectionLive"></a>
# **bingDomainIntersectionLive**
> DataforseoLabsBingDomainIntersectionLiveResponseInfo bingDomainIntersectionLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingDomainIntersectionLiveResponseInfo response = apiInstance.bingDomainIntersectionLive(
       List.of(
    
           new DataforseoLabsBingDomainIntersectionLiveRequestInfo()
        
           .target1("mom.me")
        
        
           .target2("quora.com")
        
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .filters(List.of(
    
           List.of(
    
           "first_domain_serp_element.etv",
    
           ">",
    
           0
    
       ),
    
           "and",
    
           List.of(
    
           "first_domain_serp_element.description",
    
           "like",
    
           "%goat%"
    
       )
    
       ))
        
        
           .limit(5)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingDomainIntersectionLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingDomainIntersectionLiveRequestInfo>&gt;**](List<DataforseoLabsBingDomainIntersectionLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingDomainIntersectionLiveResponseInfo**](DataforseoLabsBingDomainIntersectionLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingDomainRankOverviewLive"></a>
# **bingDomainRankOverviewLive**
> DataforseoLabsBingDomainRankOverviewLiveResponseInfo bingDomainRankOverviewLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingDomainRankOverviewLiveResponseInfo response = apiInstance.bingDomainRankOverviewLive(
       List.of(
    
           new DataforseoLabsBingDomainRankOverviewLiveRequestInfo()
        
           .target("dataforseo.com")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingDomainRankOverviewLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingDomainRankOverviewLiveRequestInfo>&gt;**](List<DataforseoLabsBingDomainRankOverviewLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingDomainRankOverviewLiveResponseInfo**](DataforseoLabsBingDomainRankOverviewLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingPageIntersectionLive"></a>
# **bingPageIntersectionLive**
> DataforseoLabsBingPageIntersectionLiveResponseInfo bingPageIntersectionLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingPageIntersectionLiveResponseInfo response = apiInstance.bingPageIntersectionLive(
       List.of(
    
           new DataforseoLabsBingPageIntersectionLiveRequestInfo()
        
           .pages(Map.of(
    
           "1", "https://dataforseo.com"
           ,
    
           "2", "https://ahrefs.com/*"
    
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingPageIntersectionLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingPageIntersectionLiveRequestInfo>&gt;**](List<DataforseoLabsBingPageIntersectionLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingPageIntersectionLiveResponseInfo**](DataforseoLabsBingPageIntersectionLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingRankedKeywordsLive"></a>
# **bingRankedKeywordsLive**
> DataforseoLabsBingRankedKeywordsLiveResponseInfo bingRankedKeywordsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingRankedKeywordsLiveResponseInfo response = apiInstance.bingRankedKeywordsLive(
       List.of(
    
           new DataforseoLabsBingRankedKeywordsLiveRequestInfo()
        
           .target("dataforseo.com")
        
        
           .languageName("English")
        
        
           .locationName("United States")
        
        
           .loadRankAbsolute(true)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingRankedKeywordsLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingRankedKeywordsLiveRequestInfo>&gt;**](List<DataforseoLabsBingRankedKeywordsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingRankedKeywordsLiveResponseInfo**](DataforseoLabsBingRankedKeywordsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingRelatedKeywordsLive"></a>
# **bingRelatedKeywordsLive**
> DataforseoLabsBingRelatedKeywordsLiveResponseInfo bingRelatedKeywordsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingRelatedKeywordsLiveResponseInfo response = apiInstance.bingRelatedKeywordsLive(
       List.of(
    
           new DataforseoLabsBingRelatedKeywordsLiveRequestInfo()
        
           .keyword("phone")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingRelatedKeywordsLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingRelatedKeywordsLiveRequestInfo>&gt;**](List<DataforseoLabsBingRelatedKeywordsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingRelatedKeywordsLiveResponseInfo**](DataforseoLabsBingRelatedKeywordsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingRelevantPagesLive"></a>
# **bingRelevantPagesLive**
> DataforseoLabsBingRelevantPagesLiveResponseInfo bingRelevantPagesLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingRelevantPagesLiveResponseInfo response = apiInstance.bingRelevantPagesLive(
       List.of(
    
           new DataforseoLabsBingRelevantPagesLiveRequestInfo()
        
           .target("dataforseo.com")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .filters(List.of(
    
           List.of(
    
           "metrics.organic.pos_1",
    
           "<>",
    
           0
    
       ),
    
           "or",
    
           List.of(
    
           "metrics.organic.pos_2_3",
    
           "<>",
    
           0
    
       )
    
       ))
        
        
           .limit(5)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingRelevantPagesLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingRelevantPagesLiveRequestInfo>&gt;**](List<DataforseoLabsBingRelevantPagesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingRelevantPagesLiveResponseInfo**](DataforseoLabsBingRelevantPagesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingSerpCompetitorsLive"></a>
# **bingSerpCompetitorsLive**
> DataforseoLabsBingSerpCompetitorsLiveResponseInfo bingSerpCompetitorsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingSerpCompetitorsLiveResponseInfo response = apiInstance.bingSerpCompetitorsLive(
       List.of(
    
           new DataforseoLabsBingSerpCompetitorsLiveRequestInfo()
        
           .keywords(List.of(
    
           "phone"
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .itemTypes(List.of(
    
           "organic"
    
       ))
        
        
           .limit(5)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingSerpCompetitorsLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingSerpCompetitorsLiveRequestInfo>&gt;**](List<DataforseoLabsBingSerpCompetitorsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingSerpCompetitorsLiveResponseInfo**](DataforseoLabsBingSerpCompetitorsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingSubdomainsLive"></a>
# **bingSubdomainsLive**
> DataforseoLabsBingSubdomainsLiveResponseInfo bingSubdomainsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsBingSubdomainsLiveResponseInfo response = apiInstance.bingSubdomainsLive(
       List.of(
    
           new DataforseoLabsBingSubdomainsLiveRequestInfo()
        
           .target("dataforseo.com")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .filters(List.of(
    
           List.of(
    
           "metrics.organic.pos_1",
    
           "<>",
    
           0
    
       ),
    
           "or",
    
           List.of(
    
           "metrics.organic.pos_2_3",
    
           "<>",
    
           0
    
       )
    
       ))
        
        
           .limit(5)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#bingSubdomainsLive");
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
    | **** | [**List&lt;List<DataforseoLabsBingSubdomainsLiveRequestInfo>&gt;**](List<DataforseoLabsBingSubdomainsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsBingSubdomainsLiveResponseInfo**](DataforseoLabsBingSubdomainsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleBulkAppMetricsLive"></a>
# **googleBulkAppMetricsLive**
> DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo googleBulkAppMetricsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo response = apiInstance.googleBulkAppMetricsLive(
       List.of(
    
           new DataforseoLabsGoogleBulkAppMetricsLiveRequestInfo()
        
           .appIds(List.of(
    
           "org.telegram.messenger",
    
           "com.zhiliaoapp.musically"
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleBulkAppMetricsLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleBulkAppMetricsLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleBulkAppMetricsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo**](DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleKeywordsForAppLive"></a>
# **googleKeywordsForAppLive**
> DataforseoLabsGoogleKeywordsForAppLiveResponseInfo googleKeywordsForAppLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleKeywordsForAppLiveResponseInfo response = apiInstance.googleKeywordsForAppLive(
       List.of(
    
           new DataforseoLabsGoogleKeywordsForAppLiveRequestInfo()
        
           .appId("org.telegram.messenger")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(10)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleKeywordsForAppLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleKeywordsForAppLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleKeywordsForAppLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleKeywordsForAppLiveResponseInfo**](DataforseoLabsGoogleKeywordsForAppLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppCompetitorsLive"></a>
# **googleAppCompetitorsLive**
> DataforseoLabsGoogleAppCompetitorsLiveResponseInfo googleAppCompetitorsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleAppCompetitorsLiveResponseInfo response = apiInstance.googleAppCompetitorsLive(
       List.of(
    
           new DataforseoLabsGoogleAppCompetitorsLiveRequestInfo()
        
           .appId("org.telegram.messenger")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(10)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleAppCompetitorsLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleAppCompetitorsLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleAppCompetitorsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleAppCompetitorsLiveResponseInfo**](DataforseoLabsGoogleAppCompetitorsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppIntersectionLive"></a>
# **googleAppIntersectionLive**
> DataforseoLabsGoogleAppIntersectionLiveResponseInfo googleAppIntersectionLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsGoogleAppIntersectionLiveResponseInfo response = apiInstance.googleAppIntersectionLive(
       List.of(
    
           new DataforseoLabsGoogleAppIntersectionLiveRequestInfo()
        
           .appIds(Map.of(
    
           "1", "org.telegram.messenger"
           ,
    
           "2", "com.zhiliaoapp.musically"
    
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(10)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#googleAppIntersectionLive");
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
    | **** | [**List&lt;List<DataforseoLabsGoogleAppIntersectionLiveRequestInfo>&gt;**](List<DataforseoLabsGoogleAppIntersectionLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsGoogleAppIntersectionLiveResponseInfo**](DataforseoLabsGoogleAppIntersectionLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleBulkAppMetricsLive"></a>
# **appleBulkAppMetricsLive**
> DataforseoLabsAppleBulkAppMetricsLiveResponseInfo appleBulkAppMetricsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsAppleBulkAppMetricsLiveResponseInfo response = apiInstance.appleBulkAppMetricsLive(
       List.of(
    
           new DataforseoLabsAppleBulkAppMetricsLiveRequestInfo()
        
           .appIds(List.of(
    
           "686449807",
    
           "382617920"
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#appleBulkAppMetricsLive");
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
    | **** | [**List&lt;List<DataforseoLabsAppleBulkAppMetricsLiveRequestInfo>&gt;**](List<DataforseoLabsAppleBulkAppMetricsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsAppleBulkAppMetricsLiveResponseInfo**](DataforseoLabsAppleBulkAppMetricsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleKeywordsForAppLive"></a>
# **appleKeywordsForAppLive**
> DataforseoLabsAppleKeywordsForAppLiveResponseInfo appleKeywordsForAppLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsAppleKeywordsForAppLiveResponseInfo response = apiInstance.appleKeywordsForAppLive(
       List.of(
    
           new DataforseoLabsAppleKeywordsForAppLiveRequestInfo()
        
           .appId("686449807")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(10)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#appleKeywordsForAppLive");
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
    | **** | [**List&lt;List<DataforseoLabsAppleKeywordsForAppLiveRequestInfo>&gt;**](List<DataforseoLabsAppleKeywordsForAppLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsAppleKeywordsForAppLiveResponseInfo**](DataforseoLabsAppleKeywordsForAppLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppCompetitorsLive"></a>
# **appleAppCompetitorsLive**
> DataforseoLabsAppleAppCompetitorsLiveResponseInfo appleAppCompetitorsLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsAppleAppCompetitorsLiveResponseInfo response = apiInstance.appleAppCompetitorsLive(
       List.of(
    
           new DataforseoLabsAppleAppCompetitorsLiveRequestInfo()
        
           .appId("686449807")
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(10)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#appleAppCompetitorsLive");
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
    | **** | [**List&lt;List<DataforseoLabsAppleAppCompetitorsLiveRequestInfo>&gt;**](List<DataforseoLabsAppleAppCompetitorsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsAppleAppCompetitorsLiveResponseInfo**](DataforseoLabsAppleAppCompetitorsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppIntersectionLive"></a>
# **appleAppIntersectionLive**
> DataforseoLabsAppleAppIntersectionLiveResponseInfo appleAppIntersectionLive()


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
    DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
    DataforseoLabsAppleAppIntersectionLiveResponseInfo response = apiInstance.appleAppIntersectionLive(
       List.of(
    
           new DataforseoLabsAppleAppIntersectionLiveRequestInfo()
        
           .appIds(Map.of(
    
           "1", "686449807"
           ,
    
           "2", "382617920"
    
    
       ))
        
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .limit(10)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling DataforseoLabsApi#appleAppIntersectionLive");
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
    | **** | [**List&lt;List<DataforseoLabsAppleAppIntersectionLiveRequestInfo>&gt;**](List<DataforseoLabsAppleAppIntersectionLiveRequestInfo>.md)|  | [optional] |



### Return type

[**DataforseoLabsAppleAppIntersectionLiveResponseInfo**](DataforseoLabsAppleAppIntersectionLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
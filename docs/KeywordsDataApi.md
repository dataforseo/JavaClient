# KeywordsDataApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**keywordsDataIdList**](KeywordsDataApi.md#keywordsDataIdList) | **POST**  /v3/keywords_data/id_list  |
| [**keywordsDataErrors**](KeywordsDataApi.md#keywordsDataErrors) | **POST**  /v3/keywords_data/errors  |
| [**googleAdsStatus**](KeywordsDataApi.md#googleAdsStatus) | **GET**  /v3/keywords_data/google_ads/status  |
| [**keywordsDataGoogleAdsLocations**](KeywordsDataApi.md#keywordsDataGoogleAdsLocations) | **GET**  /v3/keywords_data/google_ads/locations  |
| [**keywordsDataGoogleAdsLocationsCountry**](KeywordsDataApi.md#keywordsDataGoogleAdsLocationsCountry) | **GET**  /v3/keywords_data/google_ads/locations/{country}  |
| [**keywordsDataGoogleAdsLanguages**](KeywordsDataApi.md#keywordsDataGoogleAdsLanguages) | **GET**  /v3/keywords_data/google_ads/languages  |
| [**googleAdsSearchVolumeTaskPost**](KeywordsDataApi.md#googleAdsSearchVolumeTaskPost) | **POST**  /v3/keywords_data/google_ads/search_volume/task_post  |
| [**googleAdsSearchVolumeTasksReady**](KeywordsDataApi.md#googleAdsSearchVolumeTasksReady) | **GET**  /v3/keywords_data/google_ads/search_volume/tasks_ready  |
| [**googleAdsSearchVolumeTaskGet**](KeywordsDataApi.md#googleAdsSearchVolumeTaskGet) | **GET**  /v3/keywords_data/google_ads/search_volume/task_get/{id}  |
| [**googleAdsSearchVolumeLive**](KeywordsDataApi.md#googleAdsSearchVolumeLive) | **POST**  /v3/keywords_data/google_ads/search_volume/live  |
| [**googleAdsKeywordsForSiteTaskPost**](KeywordsDataApi.md#googleAdsKeywordsForSiteTaskPost) | **POST**  /v3/keywords_data/google_ads/keywords_for_site/task_post  |
| [**googleAdsKeywordsForSiteTasksReady**](KeywordsDataApi.md#googleAdsKeywordsForSiteTasksReady) | **GET**  /v3/keywords_data/google_ads/keywords_for_site/tasks_ready  |
| [**googleAdsKeywordsForSiteTaskGet**](KeywordsDataApi.md#googleAdsKeywordsForSiteTaskGet) | **GET**  /v3/keywords_data/google_ads/keywords_for_site/task_get/{id}  |
| [**googleAdsKeywordsForSiteLive**](KeywordsDataApi.md#googleAdsKeywordsForSiteLive) | **POST**  /v3/keywords_data/google_ads/keywords_for_site/live  |
| [**googleAdsKeywordsForKeywordsTaskPost**](KeywordsDataApi.md#googleAdsKeywordsForKeywordsTaskPost) | **POST**  /v3/keywords_data/google_ads/keywords_for_keywords/task_post  |
| [**googleAdsKeywordsForKeywordsTasksReady**](KeywordsDataApi.md#googleAdsKeywordsForKeywordsTasksReady) | **GET**  /v3/keywords_data/google_ads/keywords_for_keywords/tasks_ready  |
| [**googleAdsKeywordsForKeywordsTaskGet**](KeywordsDataApi.md#googleAdsKeywordsForKeywordsTaskGet) | **GET**  /v3/keywords_data/google_ads/keywords_for_keywords/task_get/{id}  |
| [**googleAdsKeywordsForKeywordsLive**](KeywordsDataApi.md#googleAdsKeywordsForKeywordsLive) | **POST**  /v3/keywords_data/google_ads/keywords_for_keywords/live  |
| [**googleAdsAdTrafficByKeywordsTaskPost**](KeywordsDataApi.md#googleAdsAdTrafficByKeywordsTaskPost) | **POST**  /v3/keywords_data/google_ads/ad_traffic_by_keywords/task_post  |
| [**googleAdsAdTrafficByKeywordsTasksReady**](KeywordsDataApi.md#googleAdsAdTrafficByKeywordsTasksReady) | **GET**  /v3/keywords_data/google_ads/ad_traffic_by_keywords/tasks_ready  |
| [**googleAdsAdTrafficByKeywordsTaskGet**](KeywordsDataApi.md#googleAdsAdTrafficByKeywordsTaskGet) | **GET**  /v3/keywords_data/google_ads/ad_traffic_by_keywords/task_get/{id}  |
| [**googleAdsAdTrafficByKeywordsLive**](KeywordsDataApi.md#googleAdsAdTrafficByKeywordsLive) | **POST**  /v3/keywords_data/google_ads/ad_traffic_by_keywords/live  |
| [**keywordsDataGoogleTrendsLocations**](KeywordsDataApi.md#keywordsDataGoogleTrendsLocations) | **GET**  /v3/keywords_data/google_trends/locations  |
| [**keywordsDataGoogleTrendsLocationsCountry**](KeywordsDataApi.md#keywordsDataGoogleTrendsLocationsCountry) | **GET**  /v3/keywords_data/google_trends/locations/{country}  |
| [**keywordsDataGoogleTrendsLanguages**](KeywordsDataApi.md#keywordsDataGoogleTrendsLanguages) | **GET**  /v3/keywords_data/google_trends/languages  |
| [**googleTrendsCategories**](KeywordsDataApi.md#googleTrendsCategories) | **GET**  /v3/keywords_data/google_trends/categories  |
| [**googleTrendsExploreTaskPost**](KeywordsDataApi.md#googleTrendsExploreTaskPost) | **POST**  /v3/keywords_data/google_trends/explore/task_post  |
| [**googleTrendsExploreTasksReady**](KeywordsDataApi.md#googleTrendsExploreTasksReady) | **GET**  /v3/keywords_data/google_trends/explore/tasks_ready  |
| [**googleTrendsExploreTaskGet**](KeywordsDataApi.md#googleTrendsExploreTaskGet) | **GET**  /v3/keywords_data/google_trends/explore/task_get/{id}  |
| [**googleTrendsExploreLive**](KeywordsDataApi.md#googleTrendsExploreLive) | **POST**  /v3/keywords_data/google_trends/explore/live  |
| [**keywordsDataDataforseoTrendsLocations**](KeywordsDataApi.md#keywordsDataDataforseoTrendsLocations) | **GET**  /v3/keywords_data/dataforseo_trends/locations  |
| [**keywordsDataDataforseoTrendsLocationsCountry**](KeywordsDataApi.md#keywordsDataDataforseoTrendsLocationsCountry) | **GET**  /v3/keywords_data/dataforseo_trends/locations/{country}  |
| [**dataforseoTrendsExploreLive**](KeywordsDataApi.md#dataforseoTrendsExploreLive) | **POST**  /v3/keywords_data/dataforseo_trends/explore/live  |
| [**dataforseoTrendsSubregionInterestsLive**](KeywordsDataApi.md#dataforseoTrendsSubregionInterestsLive) | **POST**  /v3/keywords_data/dataforseo_trends/subregion_interests/live  |
| [**dataforseoTrendsDemographyLive**](KeywordsDataApi.md#dataforseoTrendsDemographyLive) | **POST**  /v3/keywords_data/dataforseo_trends/demography/live  |
| [**dataforseoTrendsMergedDataLive**](KeywordsDataApi.md#dataforseoTrendsMergedDataLive) | **POST**  /v3/keywords_data/dataforseo_trends/merged_data/live  |
| [**keywordsDataBingLocations**](KeywordsDataApi.md#keywordsDataBingLocations) | **GET**  /v3/keywords_data/bing/locations  |
| [**keywordsDataBingLanguages**](KeywordsDataApi.md#keywordsDataBingLanguages) | **GET**  /v3/keywords_data/bing/languages  |
| [**bingSearchVolumeTaskPost**](KeywordsDataApi.md#bingSearchVolumeTaskPost) | **POST**  /v3/keywords_data/bing/search_volume/task_post  |
| [**bingSearchVolumeTasksReady**](KeywordsDataApi.md#bingSearchVolumeTasksReady) | **GET**  /v3/keywords_data/bing/search_volume/tasks_ready  |
| [**bingSearchVolumeTaskGet**](KeywordsDataApi.md#bingSearchVolumeTaskGet) | **GET**  /v3/keywords_data/bing/search_volume/task_get/{id}  |
| [**bingSearchVolumeLive**](KeywordsDataApi.md#bingSearchVolumeLive) | **POST**  /v3/keywords_data/bing/search_volume/live  |
| [**bingAudienceEstimationJobFunctions**](KeywordsDataApi.md#bingAudienceEstimationJobFunctions) | **GET**  /v3/keywords_data/bing/audience_estimation/job_functions  |
| [**bingAudienceEstimationIndustries**](KeywordsDataApi.md#bingAudienceEstimationIndustries) | **GET**  /v3/keywords_data/bing/audience_estimation/industries  |
| [**bingAudienceEstimationTaskPost**](KeywordsDataApi.md#bingAudienceEstimationTaskPost) | **POST**  /v3/keywords_data/bing/audience_estimation/task_post  |
| [**bingAudienceEstimationTasksReady**](KeywordsDataApi.md#bingAudienceEstimationTasksReady) | **GET**  /v3/keywords_data/bing/audience_estimation/tasks_ready  |
| [**bingAudienceEstimationTaskGet**](KeywordsDataApi.md#bingAudienceEstimationTaskGet) | **GET**  /v3/keywords_data/bing/audience_estimation/task_get/{id}  |
| [**bingAudienceEstimationLive**](KeywordsDataApi.md#bingAudienceEstimationLive) | **POST**  /v3/keywords_data/bing/audience_estimation/live  |
| [**bingKeywordsForSiteTaskPost**](KeywordsDataApi.md#bingKeywordsForSiteTaskPost) | **POST**  /v3/keywords_data/bing/keywords_for_site/task_post  |
| [**bingKeywordsForSiteTasksReady**](KeywordsDataApi.md#bingKeywordsForSiteTasksReady) | **GET**  /v3/keywords_data/bing/keywords_for_site/tasks_ready  |
| [**bingKeywordsForSiteTaskGet**](KeywordsDataApi.md#bingKeywordsForSiteTaskGet) | **GET**  /v3/keywords_data/bing/keywords_for_site/task_get/{id}  |
| [**bingKeywordsForSiteLive**](KeywordsDataApi.md#bingKeywordsForSiteLive) | **POST**  /v3/keywords_data/bing/keywords_for_site/live  |
| [**bingKeywordsForKeywordsTaskPost**](KeywordsDataApi.md#bingKeywordsForKeywordsTaskPost) | **POST**  /v3/keywords_data/bing/keywords_for_keywords/task_post  |
| [**bingKeywordsForKeywordsTasksReady**](KeywordsDataApi.md#bingKeywordsForKeywordsTasksReady) | **GET**  /v3/keywords_data/bing/keywords_for_keywords/tasks_ready  |
| [**bingKeywordsForKeywordsTaskGet**](KeywordsDataApi.md#bingKeywordsForKeywordsTaskGet) | **GET**  /v3/keywords_data/bing/keywords_for_keywords/task_get/{id}  |
| [**bingKeywordsForKeywordsLive**](KeywordsDataApi.md#bingKeywordsForKeywordsLive) | **POST**  /v3/keywords_data/bing/keywords_for_keywords/live  |
| [**keywordsDataBingKeywordPerformanceLocationsAndLanguages**](KeywordsDataApi.md#keywordsDataBingKeywordPerformanceLocationsAndLanguages) | **GET**  /v3/keywords_data/bing/keyword_performance/locations_and_languages  |
| [**bingKeywordPerformanceTaskPost**](KeywordsDataApi.md#bingKeywordPerformanceTaskPost) | **POST**  /v3/keywords_data/bing/keyword_performance/task_post  |
| [**bingKeywordPerformanceTasksReady**](KeywordsDataApi.md#bingKeywordPerformanceTasksReady) | **GET**  /v3/keywords_data/bing/keyword_performance/tasks_ready  |
| [**bingKeywordPerformanceTaskGet**](KeywordsDataApi.md#bingKeywordPerformanceTaskGet) | **GET**  /v3/keywords_data/bing/keyword_performance/task_get/{id}  |
| [**bingKeywordPerformanceLive**](KeywordsDataApi.md#bingKeywordPerformanceLive) | **POST**  /v3/keywords_data/bing/keyword_performance/live  |
| [**keywordsDataBingSearchVolumeHistoryLocationsAndLanguages**](KeywordsDataApi.md#keywordsDataBingSearchVolumeHistoryLocationsAndLanguages) | **GET**  /v3/keywords_data/bing/search_volume_history/locations_and_languages  |
| [**bingSearchVolumeHistoryTaskPost**](KeywordsDataApi.md#bingSearchVolumeHistoryTaskPost) | **POST**  /v3/keywords_data/bing/search_volume_history/task_post  |
| [**bingSearchVolumeHistoryTasksReady**](KeywordsDataApi.md#bingSearchVolumeHistoryTasksReady) | **GET**  /v3/keywords_data/bing/search_volume_history/tasks_ready  |
| [**bingSearchVolumeHistoryTaskGet**](KeywordsDataApi.md#bingSearchVolumeHistoryTaskGet) | **GET**  /v3/keywords_data/bing/search_volume_history/task_get/{id}  |
| [**bingSearchVolumeHistoryLive**](KeywordsDataApi.md#bingSearchVolumeHistoryLive) | **POST**  /v3/keywords_data/bing/search_volume_history/live  |
| [**keywordsDataClickstreamDataLocationsAndLanguages**](KeywordsDataApi.md#keywordsDataClickstreamDataLocationsAndLanguages) | **GET**  /v3/keywords_data/clickstream_data/locations_and_languages  |
| [**clickstreamDataDataforseoSearchVolumeLive**](KeywordsDataApi.md#clickstreamDataDataforseoSearchVolumeLive) | **POST**  /v3/keywords_data/clickstream_data/dataforseo_search_volume/live  |
| [**clickstreamDataGlobalSearchVolumeLive**](KeywordsDataApi.md#clickstreamDataGlobalSearchVolumeLive) | **POST**  /v3/keywords_data/clickstream_data/global_search_volume/live  |
| [**clickstreamDataBulkSearchVolumeLive**](KeywordsDataApi.md#clickstreamDataBulkSearchVolumeLive) | **POST**  /v3/keywords_data/clickstream_data/bulk_search_volume/live  |

<a id="keywordsDataIdList"></a>
# **keywordsDataIdList**
> KeywordsDataIdListResponseInfo keywordsDataIdList()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataIdListRequestInfo model = new KeywordsDataIdListRequestInfo()
           .datetimeFrom("2025-08-10 11:01:48 +00:00")
           .datetimeTo("2025-10-10 11:01:48 +00:00")
           .limit(100)
           .offset(0)
           .sort("desc");
    KeywordsDataIdListResponseInfo response = apiInstance.keywordsDataIdList(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataIdList");
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
    | **** | [**List&lt;List<KeywordsDataIdListRequestInfo>&gt;**](List<KeywordsDataIdListRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataIdListResponseInfo**](KeywordsDataIdListResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataErrors"></a>
# **keywordsDataErrors**
> KeywordsDataErrorsResponseInfo keywordsDataErrors()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataErrorsRequestInfo model = new KeywordsDataErrorsRequestInfo()
           .limit(10)
           .offset(0)
           .filteredFunction("pingback_url");
    KeywordsDataErrorsResponseInfo response = apiInstance.keywordsDataErrors(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataErrors");
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
    | **** | [**List&lt;List<KeywordsDataErrorsRequestInfo>&gt;**](List<KeywordsDataErrorsRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataErrorsResponseInfo**](KeywordsDataErrorsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsStatus"></a>
# **googleAdsStatus**
> KeywordsDataGoogleAdsStatusResponseInfo googleAdsStatus()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleAdsStatusResponseInfo response = apiInstance.googleAdsStatus();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsStatus");
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

[**KeywordsDataGoogleAdsStatusResponseInfo**](KeywordsDataGoogleAdsStatusResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataGoogleAdsLocations"></a>
# **keywordsDataGoogleAdsLocations**
> KeywordsDataGoogleAdsLocationsResponseInfo keywordsDataGoogleAdsLocations()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleAdsLocationsResponseInfo response = apiInstance.keywordsDataGoogleAdsLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataGoogleAdsLocations");
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

[**KeywordsDataGoogleAdsLocationsResponseInfo**](KeywordsDataGoogleAdsLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataGoogleAdsLocationsCountry"></a>
# **keywordsDataGoogleAdsLocationsCountry**
> KeywordsDataGoogleAdsLocationsCountryResponseInfo keywordsDataGoogleAdsLocationsCountry()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String country = "us";
    KeywordsDataGoogleAdsLocationsCountryResponseInfo response = apiInstance.keywordsDataGoogleAdsLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataGoogleAdsLocationsCountry");
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

[**KeywordsDataGoogleAdsLocationsCountryResponseInfo**](KeywordsDataGoogleAdsLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataGoogleAdsLanguages"></a>
# **keywordsDataGoogleAdsLanguages**
> KeywordsDataGoogleAdsLanguagesResponseInfo keywordsDataGoogleAdsLanguages()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleAdsLanguagesResponseInfo response = apiInstance.keywordsDataGoogleAdsLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataGoogleAdsLanguages");
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

[**KeywordsDataGoogleAdsLanguagesResponseInfo**](KeywordsDataGoogleAdsLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsSearchVolumeTaskPost"></a>
# **googleAdsSearchVolumeTaskPost**
> KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo googleAdsSearchVolumeTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo model = new KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo()
           .keywords(
               List.of(
                   "buy laptop",
                   "cheap laptops for sale",
                   "purchase laptop"
                ))
           .locationName("United States");
    KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo response = apiInstance.googleAdsSearchVolumeTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsSearchVolumeTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo>&gt;**](List<KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo**](KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsSearchVolumeTasksReady"></a>
# **googleAdsSearchVolumeTasksReady**
> KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo googleAdsSearchVolumeTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo response = apiInstance.googleAdsSearchVolumeTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsSearchVolumeTasksReady");
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

[**KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo**](KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsSearchVolumeTaskGet"></a>
# **googleAdsSearchVolumeTaskGet**
> KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo googleAdsSearchVolumeTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo response = apiInstance.googleAdsSearchVolumeTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsSearchVolumeTaskGet");
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

[**KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo**](KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsSearchVolumeLive"></a>
# **googleAdsSearchVolumeLive**
> KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo googleAdsSearchVolumeLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo model = new KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo()
           .keywords(
               List.of(
                   "buy laptop",
                   "cheap laptops for sale",
                   "purchase laptop"
                ))
           .locationCode(2840)
           .searchPartners(true)
           .dateFrom("2025-08-10");
    KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo response = apiInstance.googleAdsSearchVolumeLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsSearchVolumeLive");
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
    | **** | [**List&lt;List<KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo>&gt;**](List<KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo**](KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsKeywordsForSiteTaskPost"></a>
# **googleAdsKeywordsForSiteTaskPost**
> KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo googleAdsKeywordsForSiteTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo model = new KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo()
           .target("dataforseo.com")
           .locationCode(2840);
    KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo response = apiInstance.googleAdsKeywordsForSiteTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsKeywordsForSiteTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo>&gt;**](List<KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo**](KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsKeywordsForSiteTasksReady"></a>
# **googleAdsKeywordsForSiteTasksReady**
> KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo googleAdsKeywordsForSiteTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo response = apiInstance.googleAdsKeywordsForSiteTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsKeywordsForSiteTasksReady");
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

[**KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo**](KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsKeywordsForSiteTaskGet"></a>
# **googleAdsKeywordsForSiteTaskGet**
> KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo googleAdsKeywordsForSiteTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo response = apiInstance.googleAdsKeywordsForSiteTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsKeywordsForSiteTaskGet");
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

[**KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo**](KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsKeywordsForSiteLive"></a>
# **googleAdsKeywordsForSiteLive**
> KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo googleAdsKeywordsForSiteLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo model = new KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo()
           .target("dataforseo.com")
           .locationCode(2840);
    KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo response = apiInstance.googleAdsKeywordsForSiteLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsKeywordsForSiteLive");
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
    | **** | [**List&lt;List<KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo>&gt;**](List<KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo**](KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsKeywordsForKeywordsTaskPost"></a>
# **googleAdsKeywordsForKeywordsTaskPost**
> KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo googleAdsKeywordsForKeywordsTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo model = new KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo()
           .keywords(
               List.of(
                   "phone",
                   "cellphone"
                ))
           .locationCode(2840);
    KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo response = apiInstance.googleAdsKeywordsForKeywordsTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsKeywordsForKeywordsTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo>&gt;**](List<KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo**](KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsKeywordsForKeywordsTasksReady"></a>
# **googleAdsKeywordsForKeywordsTasksReady**
> KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo googleAdsKeywordsForKeywordsTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo response = apiInstance.googleAdsKeywordsForKeywordsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsKeywordsForKeywordsTasksReady");
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

[**KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo**](KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsKeywordsForKeywordsTaskGet"></a>
# **googleAdsKeywordsForKeywordsTaskGet**
> KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo googleAdsKeywordsForKeywordsTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo response = apiInstance.googleAdsKeywordsForKeywordsTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsKeywordsForKeywordsTaskGet");
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

[**KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo**](KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsKeywordsForKeywordsLive"></a>
# **googleAdsKeywordsForKeywordsLive**
> KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo googleAdsKeywordsForKeywordsLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo model = new KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo()
           .keywords(
               List.of(
                   "phone",
                   "cellphone"
                ))
           .locationCode(2840);
    KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo response = apiInstance.googleAdsKeywordsForKeywordsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsKeywordsForKeywordsLive");
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
    | **** | [**List&lt;List<KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo>&gt;**](List<KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo**](KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsAdTrafficByKeywordsTaskPost"></a>
# **googleAdsAdTrafficByKeywordsTaskPost**
> KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo googleAdsAdTrafficByKeywordsTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo model = new KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo()
           .keywords(
               List.of(
                   "seo marketing"
                ))
           .bid(999d)
           .match("exact")
           .locationCode(2840)
           .languageCode("en");
    KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo response = apiInstance.googleAdsAdTrafficByKeywordsTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsAdTrafficByKeywordsTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo>&gt;**](List<KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo**](KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsAdTrafficByKeywordsTasksReady"></a>
# **googleAdsAdTrafficByKeywordsTasksReady**
> KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo googleAdsAdTrafficByKeywordsTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo response = apiInstance.googleAdsAdTrafficByKeywordsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsAdTrafficByKeywordsTasksReady");
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

[**KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo**](KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsAdTrafficByKeywordsTaskGet"></a>
# **googleAdsAdTrafficByKeywordsTaskGet**
> KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo googleAdsAdTrafficByKeywordsTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo response = apiInstance.googleAdsAdTrafficByKeywordsTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsAdTrafficByKeywordsTaskGet");
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

[**KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo**](KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsAdTrafficByKeywordsLive"></a>
# **googleAdsAdTrafficByKeywordsLive**
> KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo googleAdsAdTrafficByKeywordsLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo model = new KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo()
           .keywords(
               List.of(
                   "seo marketing"
                ))
           .bid(999l)
           .match("exact")
           .locationCode(2840)
           .languageCode("en");
    KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo response = apiInstance.googleAdsAdTrafficByKeywordsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleAdsAdTrafficByKeywordsLive");
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
    | **** | [**List&lt;List<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo>&gt;**](List<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo**](KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataGoogleTrendsLocations"></a>
# **keywordsDataGoogleTrendsLocations**
> KeywordsDataGoogleTrendsLocationsResponseInfo keywordsDataGoogleTrendsLocations()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleTrendsLocationsResponseInfo response = apiInstance.keywordsDataGoogleTrendsLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataGoogleTrendsLocations");
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

[**KeywordsDataGoogleTrendsLocationsResponseInfo**](KeywordsDataGoogleTrendsLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataGoogleTrendsLocationsCountry"></a>
# **keywordsDataGoogleTrendsLocationsCountry**
> KeywordsDataGoogleTrendsLocationsCountryResponseInfo keywordsDataGoogleTrendsLocationsCountry()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String country = "us";
    KeywordsDataGoogleTrendsLocationsCountryResponseInfo response = apiInstance.keywordsDataGoogleTrendsLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataGoogleTrendsLocationsCountry");
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

[**KeywordsDataGoogleTrendsLocationsCountryResponseInfo**](KeywordsDataGoogleTrendsLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataGoogleTrendsLanguages"></a>
# **keywordsDataGoogleTrendsLanguages**
> KeywordsDataGoogleTrendsLanguagesResponseInfo keywordsDataGoogleTrendsLanguages()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleTrendsLanguagesResponseInfo response = apiInstance.keywordsDataGoogleTrendsLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataGoogleTrendsLanguages");
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

[**KeywordsDataGoogleTrendsLanguagesResponseInfo**](KeywordsDataGoogleTrendsLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleTrendsCategories"></a>
# **googleTrendsCategories**
> KeywordsDataGoogleTrendsCategoriesResponseInfo googleTrendsCategories()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleTrendsCategoriesResponseInfo response = apiInstance.googleTrendsCategories();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleTrendsCategories");
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

[**KeywordsDataGoogleTrendsCategoriesResponseInfo**](KeywordsDataGoogleTrendsCategoriesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleTrendsExploreTaskPost"></a>
# **googleTrendsExploreTaskPost**
> KeywordsDataGoogleTrendsExploreTaskPostResponseInfo googleTrendsExploreTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataGoogleTrendsExploreTaskPostRequestInfo model = new KeywordsDataGoogleTrendsExploreTaskPostRequestInfo()
           .keywords(
               List.of(
                   "seo api",
                   "rank api"
                ))
           .type("youtube")
           .categoryCode(3)
           .dateFrom("2025-08-10")
           .dateTo("2025-10-10");
    KeywordsDataGoogleTrendsExploreTaskPostResponseInfo response = apiInstance.googleTrendsExploreTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleTrendsExploreTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataGoogleTrendsExploreTaskPostRequestInfo>&gt;**](List<KeywordsDataGoogleTrendsExploreTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataGoogleTrendsExploreTaskPostResponseInfo**](KeywordsDataGoogleTrendsExploreTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleTrendsExploreTasksReady"></a>
# **googleTrendsExploreTasksReady**
> KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo googleTrendsExploreTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo response = apiInstance.googleTrendsExploreTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleTrendsExploreTasksReady");
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

[**KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo**](KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleTrendsExploreTaskGet"></a>
# **googleTrendsExploreTaskGet**
> KeywordsDataGoogleTrendsExploreTaskGetResponseInfo googleTrendsExploreTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataGoogleTrendsExploreTaskGetResponseInfo response = apiInstance.googleTrendsExploreTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleTrendsExploreTaskGet");
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

[**KeywordsDataGoogleTrendsExploreTaskGetResponseInfo**](KeywordsDataGoogleTrendsExploreTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleTrendsExploreLive"></a>
# **googleTrendsExploreLive**
> KeywordsDataGoogleTrendsExploreLiveResponseInfo googleTrendsExploreLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataGoogleTrendsExploreLiveRequestInfo model = new KeywordsDataGoogleTrendsExploreLiveRequestInfo()
           .keywords(
               List.of(
                   "rugby",
                   "cricket"
                ))
           .locationName("United States")
           .type("youtube")
           .categoryCode(3)
           .dateFrom("2025-08-10")
           .dateTo("2025-10-10");
    KeywordsDataGoogleTrendsExploreLiveResponseInfo response = apiInstance.googleTrendsExploreLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#googleTrendsExploreLive");
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
    | **** | [**List&lt;List<KeywordsDataGoogleTrendsExploreLiveRequestInfo>&gt;**](List<KeywordsDataGoogleTrendsExploreLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataGoogleTrendsExploreLiveResponseInfo**](KeywordsDataGoogleTrendsExploreLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataDataforseoTrendsLocations"></a>
# **keywordsDataDataforseoTrendsLocations**
> KeywordsDataDataforseoTrendsLocationsResponseInfo keywordsDataDataforseoTrendsLocations()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataDataforseoTrendsLocationsResponseInfo response = apiInstance.keywordsDataDataforseoTrendsLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataDataforseoTrendsLocations");
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

[**KeywordsDataDataforseoTrendsLocationsResponseInfo**](KeywordsDataDataforseoTrendsLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataDataforseoTrendsLocationsCountry"></a>
# **keywordsDataDataforseoTrendsLocationsCountry**
> KeywordsDataDataforseoTrendsLocationsCountryResponseInfo keywordsDataDataforseoTrendsLocationsCountry()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String country = "us";
    KeywordsDataDataforseoTrendsLocationsCountryResponseInfo response = apiInstance.keywordsDataDataforseoTrendsLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataDataforseoTrendsLocationsCountry");
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

[**KeywordsDataDataforseoTrendsLocationsCountryResponseInfo**](KeywordsDataDataforseoTrendsLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="dataforseoTrendsExploreLive"></a>
# **dataforseoTrendsExploreLive**
> KeywordsDataDataforseoTrendsExploreLiveResponseInfo dataforseoTrendsExploreLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataDataforseoTrendsExploreLiveRequestInfo model = new KeywordsDataDataforseoTrendsExploreLiveRequestInfo()
           .keywords(
               List.of(
                   "iphone 14",
                   "samsung s23"
                ))
           .locationCode(2840);
    KeywordsDataDataforseoTrendsExploreLiveResponseInfo response = apiInstance.dataforseoTrendsExploreLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#dataforseoTrendsExploreLive");
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
    | **** | [**List&lt;List<KeywordsDataDataforseoTrendsExploreLiveRequestInfo>&gt;**](List<KeywordsDataDataforseoTrendsExploreLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataDataforseoTrendsExploreLiveResponseInfo**](KeywordsDataDataforseoTrendsExploreLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="dataforseoTrendsSubregionInterestsLive"></a>
# **dataforseoTrendsSubregionInterestsLive**
> KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo dataforseoTrendsSubregionInterestsLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo model = new KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo()
           .keywords(
               List.of(
                   "rugby",
                   "cricket"
                ))
           .locationName("United States")
           .type("web")
           .dateFrom("2025-08-10")
           .dateTo("2025-10-10");
    KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo response = apiInstance.dataforseoTrendsSubregionInterestsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#dataforseoTrendsSubregionInterestsLive");
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
    | **** | [**List&lt;List<KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo>&gt;**](List<KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo**](KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="dataforseoTrendsDemographyLive"></a>
# **dataforseoTrendsDemographyLive**
> KeywordsDataDataforseoTrendsDemographyLiveResponseInfo dataforseoTrendsDemographyLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataDataforseoTrendsDemographyLiveRequestInfo model = new KeywordsDataDataforseoTrendsDemographyLiveRequestInfo()
           .keywords(
               List.of(
                   "rugby",
                   "cricket"
                ))
           .locationName("United States")
           .type("web")
           .dateFrom("2025-08-10")
           .dateTo("2025-10-10");
    KeywordsDataDataforseoTrendsDemographyLiveResponseInfo response = apiInstance.dataforseoTrendsDemographyLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#dataforseoTrendsDemographyLive");
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
    | **** | [**List&lt;List<KeywordsDataDataforseoTrendsDemographyLiveRequestInfo>&gt;**](List<KeywordsDataDataforseoTrendsDemographyLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataDataforseoTrendsDemographyLiveResponseInfo**](KeywordsDataDataforseoTrendsDemographyLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="dataforseoTrendsMergedDataLive"></a>
# **dataforseoTrendsMergedDataLive**
> KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo dataforseoTrendsMergedDataLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo model = new KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo()
           .keywords(
               List.of(
                   "rugby",
                   "cricket"
                ))
           .locationName("United States")
           .type("web")
           .dateFrom("2025-08-10")
           .dateTo("2025-10-10");
    KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo response = apiInstance.dataforseoTrendsMergedDataLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#dataforseoTrendsMergedDataLive");
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
    | **** | [**List&lt;List<KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo>&gt;**](List<KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo**](KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataBingLocations"></a>
# **keywordsDataBingLocations**
> KeywordsDataBingLocationsResponseInfo keywordsDataBingLocations()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingLocationsResponseInfo response = apiInstance.keywordsDataBingLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataBingLocations");
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

[**KeywordsDataBingLocationsResponseInfo**](KeywordsDataBingLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataBingLanguages"></a>
# **keywordsDataBingLanguages**
> KeywordsDataBingLanguagesResponseInfo keywordsDataBingLanguages()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingLanguagesResponseInfo response = apiInstance.keywordsDataBingLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataBingLanguages");
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

[**KeywordsDataBingLanguagesResponseInfo**](KeywordsDataBingLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingSearchVolumeTaskPost"></a>
# **bingSearchVolumeTaskPost**
> KeywordsDataBingSearchVolumeTaskPostResponseInfo bingSearchVolumeTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingSearchVolumeTaskPostRequestInfo model = new KeywordsDataBingSearchVolumeTaskPostRequestInfo()
           .keywords(
               List.of(
                   "average page rpm adsense",
                   "adsense blank ads how long",
                   "leads and prospects"
                ))
           .locationName("United States")
           .languageName("English");
    KeywordsDataBingSearchVolumeTaskPostResponseInfo response = apiInstance.bingSearchVolumeTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingSearchVolumeTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataBingSearchVolumeTaskPostRequestInfo>&gt;**](List<KeywordsDataBingSearchVolumeTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingSearchVolumeTaskPostResponseInfo**](KeywordsDataBingSearchVolumeTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingSearchVolumeTasksReady"></a>
# **bingSearchVolumeTasksReady**
> KeywordsDataBingSearchVolumeTasksReadyResponseInfo bingSearchVolumeTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingSearchVolumeTasksReadyResponseInfo response = apiInstance.bingSearchVolumeTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingSearchVolumeTasksReady");
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

[**KeywordsDataBingSearchVolumeTasksReadyResponseInfo**](KeywordsDataBingSearchVolumeTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingSearchVolumeTaskGet"></a>
# **bingSearchVolumeTaskGet**
> KeywordsDataBingSearchVolumeTaskGetResponseInfo bingSearchVolumeTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataBingSearchVolumeTaskGetResponseInfo response = apiInstance.bingSearchVolumeTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingSearchVolumeTaskGet");
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

[**KeywordsDataBingSearchVolumeTaskGetResponseInfo**](KeywordsDataBingSearchVolumeTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingSearchVolumeLive"></a>
# **bingSearchVolumeLive**
> KeywordsDataBingSearchVolumeLiveResponseInfo bingSearchVolumeLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingSearchVolumeLiveRequestInfo model = new KeywordsDataBingSearchVolumeLiveRequestInfo()
           .keywords(
               List.of(
                   "tom and jerry",
                   "silicon valley",
                   "spider man"
                ))
           .locationName("United States")
           .languageCode("en");
    KeywordsDataBingSearchVolumeLiveResponseInfo response = apiInstance.bingSearchVolumeLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingSearchVolumeLive");
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
    | **** | [**List&lt;List<KeywordsDataBingSearchVolumeLiveRequestInfo>&gt;**](List<KeywordsDataBingSearchVolumeLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingSearchVolumeLiveResponseInfo**](KeywordsDataBingSearchVolumeLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingAudienceEstimationJobFunctions"></a>
# **bingAudienceEstimationJobFunctions**
> KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo bingAudienceEstimationJobFunctions()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo response = apiInstance.bingAudienceEstimationJobFunctions();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingAudienceEstimationJobFunctions");
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

[**KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo**](KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingAudienceEstimationIndustries"></a>
# **bingAudienceEstimationIndustries**
> KeywordsDataBingAudienceEstimationIndustriesResponseInfo bingAudienceEstimationIndustries()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingAudienceEstimationIndustriesResponseInfo response = apiInstance.bingAudienceEstimationIndustries();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingAudienceEstimationIndustries");
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

[**KeywordsDataBingAudienceEstimationIndustriesResponseInfo**](KeywordsDataBingAudienceEstimationIndustriesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingAudienceEstimationTaskPost"></a>
# **bingAudienceEstimationTaskPost**
> KeywordsDataBingAudienceEstimationTaskPostResponseInfo bingAudienceEstimationTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingAudienceEstimationTaskPostRequestInfo model = new KeywordsDataBingAudienceEstimationTaskPostRequestInfo()
           .locationCoordinate("29.6821525,-82.4098881,100")
           .age(
               List.of(
                   "twenty_five_to_thirty_four",
                   "eighteen_to_twenty_four",
                   "unknown"
                ))
           .bid(1d)
           .dailyBudget(24d)
           .gender(
               List.of(
                   "male"
                ))
           .industry(
               List.of(
                   "806303407",
                   "806301758"
                ))
           .jobFunction(
               List.of(
                   "806298607"
                ));
    KeywordsDataBingAudienceEstimationTaskPostResponseInfo response = apiInstance.bingAudienceEstimationTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingAudienceEstimationTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataBingAudienceEstimationTaskPostRequestInfo>&gt;**](List<KeywordsDataBingAudienceEstimationTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingAudienceEstimationTaskPostResponseInfo**](KeywordsDataBingAudienceEstimationTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingAudienceEstimationTasksReady"></a>
# **bingAudienceEstimationTasksReady**
> KeywordsDataBingAudienceEstimationTasksReadyResponseInfo bingAudienceEstimationTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingAudienceEstimationTasksReadyResponseInfo response = apiInstance.bingAudienceEstimationTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingAudienceEstimationTasksReady");
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

[**KeywordsDataBingAudienceEstimationTasksReadyResponseInfo**](KeywordsDataBingAudienceEstimationTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingAudienceEstimationTaskGet"></a>
# **bingAudienceEstimationTaskGet**
> KeywordsDataBingAudienceEstimationTaskGetResponseInfo bingAudienceEstimationTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataBingAudienceEstimationTaskGetResponseInfo response = apiInstance.bingAudienceEstimationTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingAudienceEstimationTaskGet");
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

[**KeywordsDataBingAudienceEstimationTaskGetResponseInfo**](KeywordsDataBingAudienceEstimationTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingAudienceEstimationLive"></a>
# **bingAudienceEstimationLive**
> KeywordsDataBingAudienceEstimationLiveResponseInfo bingAudienceEstimationLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingAudienceEstimationLiveRequestInfo model = new KeywordsDataBingAudienceEstimationLiveRequestInfo()
           .locationCoordinate("29.6821525,-82.4098881,100")
           .age(
               List.of(
                   "twenty_five_to_thirty_four",
                   "eighteen_to_twenty_four",
                   "unknown"
                ))
           .bid(1d)
           .dailyBudget(24d)
           .gender(
               List.of(
                   "male"
                ))
           .industry(
               List.of(
                   "806303407",
                   "806301758"
                ))
           .jobFunction(
               List.of(
                   "806298607"
                ));
    KeywordsDataBingAudienceEstimationLiveResponseInfo response = apiInstance.bingAudienceEstimationLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingAudienceEstimationLive");
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
    | **** | [**List&lt;List<KeywordsDataBingAudienceEstimationLiveRequestInfo>&gt;**](List<KeywordsDataBingAudienceEstimationLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingAudienceEstimationLiveResponseInfo**](KeywordsDataBingAudienceEstimationLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordsForSiteTaskPost"></a>
# **bingKeywordsForSiteTaskPost**
> KeywordsDataBingKeywordsForSiteTaskPostResponseInfo bingKeywordsForSiteTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingKeywordsForSiteTaskPostRequestInfo model = new KeywordsDataBingKeywordsForSiteTaskPostRequestInfo()
           .target("dataforseo.com")
           .locationCode(2840)
           .languageCode("en");
    KeywordsDataBingKeywordsForSiteTaskPostResponseInfo response = apiInstance.bingKeywordsForSiteTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordsForSiteTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataBingKeywordsForSiteTaskPostRequestInfo>&gt;**](List<KeywordsDataBingKeywordsForSiteTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingKeywordsForSiteTaskPostResponseInfo**](KeywordsDataBingKeywordsForSiteTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordsForSiteTasksReady"></a>
# **bingKeywordsForSiteTasksReady**
> KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo bingKeywordsForSiteTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo response = apiInstance.bingKeywordsForSiteTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordsForSiteTasksReady");
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

[**KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo**](KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordsForSiteTaskGet"></a>
# **bingKeywordsForSiteTaskGet**
> KeywordsDataBingKeywordsForSiteTaskGetResponseInfo bingKeywordsForSiteTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataBingKeywordsForSiteTaskGetResponseInfo response = apiInstance.bingKeywordsForSiteTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordsForSiteTaskGet");
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

[**KeywordsDataBingKeywordsForSiteTaskGetResponseInfo**](KeywordsDataBingKeywordsForSiteTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordsForSiteLive"></a>
# **bingKeywordsForSiteLive**
> KeywordsDataBingKeywordsForSiteLiveResponseInfo bingKeywordsForSiteLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingKeywordsForSiteLiveRequestInfo model = new KeywordsDataBingKeywordsForSiteLiveRequestInfo()
           .target("dataforseo.com")
           .locationCode(2840)
           .languageCode("en");
    KeywordsDataBingKeywordsForSiteLiveResponseInfo response = apiInstance.bingKeywordsForSiteLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordsForSiteLive");
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
    | **** | [**List&lt;List<KeywordsDataBingKeywordsForSiteLiveRequestInfo>&gt;**](List<KeywordsDataBingKeywordsForSiteLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingKeywordsForSiteLiveResponseInfo**](KeywordsDataBingKeywordsForSiteLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordsForKeywordsTaskPost"></a>
# **bingKeywordsForKeywordsTaskPost**
> KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo bingKeywordsForKeywordsTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo model = new KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo()
           .keywords(
               List.of(
                   "average page rpm adsense",
                   "adsense blank ads how long",
                   "leads and prospects"
                ))
           .locationCode(2840)
           .languageCode("en");
    KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo response = apiInstance.bingKeywordsForKeywordsTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordsForKeywordsTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo>&gt;**](List<KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo**](KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordsForKeywordsTasksReady"></a>
# **bingKeywordsForKeywordsTasksReady**
> KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo bingKeywordsForKeywordsTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo response = apiInstance.bingKeywordsForKeywordsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordsForKeywordsTasksReady");
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

[**KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo**](KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordsForKeywordsTaskGet"></a>
# **bingKeywordsForKeywordsTaskGet**
> KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo bingKeywordsForKeywordsTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo response = apiInstance.bingKeywordsForKeywordsTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordsForKeywordsTaskGet");
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

[**KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo**](KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordsForKeywordsLive"></a>
# **bingKeywordsForKeywordsLive**
> KeywordsDataBingKeywordsForKeywordsLiveResponseInfo bingKeywordsForKeywordsLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingKeywordsForKeywordsLiveRequestInfo model = new KeywordsDataBingKeywordsForKeywordsLiveRequestInfo()
           .keywords(
               List.of(
                   "average page rpm adsense",
                   "adsense blank ads how long",
                   "leads and prospects"
                ))
           .locationName("United States")
           .languageName("English");
    KeywordsDataBingKeywordsForKeywordsLiveResponseInfo response = apiInstance.bingKeywordsForKeywordsLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordsForKeywordsLive");
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
    | **** | [**List&lt;List<KeywordsDataBingKeywordsForKeywordsLiveRequestInfo>&gt;**](List<KeywordsDataBingKeywordsForKeywordsLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingKeywordsForKeywordsLiveResponseInfo**](KeywordsDataBingKeywordsForKeywordsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataBingKeywordPerformanceLocationsAndLanguages"></a>
# **keywordsDataBingKeywordPerformanceLocationsAndLanguages**
> KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo keywordsDataBingKeywordPerformanceLocationsAndLanguages()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo response = apiInstance.keywordsDataBingKeywordPerformanceLocationsAndLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataBingKeywordPerformanceLocationsAndLanguages");
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

[**KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo**](KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordPerformanceTaskPost"></a>
# **bingKeywordPerformanceTaskPost**
> KeywordsDataBingKeywordPerformanceTaskPostResponseInfo bingKeywordPerformanceTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingKeywordPerformanceTaskPostRequestInfo model = new KeywordsDataBingKeywordPerformanceTaskPostRequestInfo()
           .keywords(
               List.of(
                   "dataforseo",
                   "seo",
                   "ranking"
                ))
           .locationCode(2840)
           .languageCode("en");
    KeywordsDataBingKeywordPerformanceTaskPostResponseInfo response = apiInstance.bingKeywordPerformanceTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordPerformanceTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataBingKeywordPerformanceTaskPostRequestInfo>&gt;**](List<KeywordsDataBingKeywordPerformanceTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingKeywordPerformanceTaskPostResponseInfo**](KeywordsDataBingKeywordPerformanceTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordPerformanceTasksReady"></a>
# **bingKeywordPerformanceTasksReady**
> KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo bingKeywordPerformanceTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo response = apiInstance.bingKeywordPerformanceTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordPerformanceTasksReady");
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

[**KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo**](KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordPerformanceTaskGet"></a>
# **bingKeywordPerformanceTaskGet**
> KeywordsDataBingKeywordPerformanceTaskGetResponseInfo bingKeywordPerformanceTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataBingKeywordPerformanceTaskGetResponseInfo response = apiInstance.bingKeywordPerformanceTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordPerformanceTaskGet");
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

[**KeywordsDataBingKeywordPerformanceTaskGetResponseInfo**](KeywordsDataBingKeywordPerformanceTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingKeywordPerformanceLive"></a>
# **bingKeywordPerformanceLive**
> KeywordsDataBingKeywordPerformanceLiveResponseInfo bingKeywordPerformanceLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingKeywordPerformanceLiveRequestInfo model = new KeywordsDataBingKeywordPerformanceLiveRequestInfo()
           .keywords(
               List.of(
                   "dataforseo",
                   "seo",
                   "ranking"
                ))
           .locationCode(2840)
           .languageCode("en");
    KeywordsDataBingKeywordPerformanceLiveResponseInfo response = apiInstance.bingKeywordPerformanceLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingKeywordPerformanceLive");
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
    | **** | [**List&lt;List<KeywordsDataBingKeywordPerformanceLiveRequestInfo>&gt;**](List<KeywordsDataBingKeywordPerformanceLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingKeywordPerformanceLiveResponseInfo**](KeywordsDataBingKeywordPerformanceLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataBingSearchVolumeHistoryLocationsAndLanguages"></a>
# **keywordsDataBingSearchVolumeHistoryLocationsAndLanguages**
> KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo keywordsDataBingSearchVolumeHistoryLocationsAndLanguages()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo response = apiInstance.keywordsDataBingSearchVolumeHistoryLocationsAndLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataBingSearchVolumeHistoryLocationsAndLanguages");
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

[**KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo**](KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingSearchVolumeHistoryTaskPost"></a>
# **bingSearchVolumeHistoryTaskPost**
> KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo bingSearchVolumeHistoryTaskPost()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo model = new KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo()
           .keywords(
               List.of(
                   "10 minute timer"
                ))
           .locationCode(2840)
           .languageCode("en");
    KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo response = apiInstance.bingSearchVolumeHistoryTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingSearchVolumeHistoryTaskPost");
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
    | **** | [**List&lt;List<KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo>&gt;**](List<KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo**](KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingSearchVolumeHistoryTasksReady"></a>
# **bingSearchVolumeHistoryTasksReady**
> KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo bingSearchVolumeHistoryTasksReady()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo response = apiInstance.bingSearchVolumeHistoryTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingSearchVolumeHistoryTasksReady");
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

[**KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo**](KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingSearchVolumeHistoryTaskGet"></a>
# **bingSearchVolumeHistoryTaskGet**
> KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo bingSearchVolumeHistoryTaskGet()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo response = apiInstance.bingSearchVolumeHistoryTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingSearchVolumeHistoryTaskGet");
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

[**KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo**](KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingSearchVolumeHistoryLive"></a>
# **bingSearchVolumeHistoryLive**
> KeywordsDataBingSearchVolumeHistoryLiveResponseInfo bingSearchVolumeHistoryLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataBingSearchVolumeHistoryLiveRequestInfo model = new KeywordsDataBingSearchVolumeHistoryLiveRequestInfo()
           .keywords(
               List.of(
                   "10 minute timer"
                ))
           .locationCode(2840)
           .languageCode("en");
    KeywordsDataBingSearchVolumeHistoryLiveResponseInfo response = apiInstance.bingSearchVolumeHistoryLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#bingSearchVolumeHistoryLive");
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
    | **** | [**List&lt;List<KeywordsDataBingSearchVolumeHistoryLiveRequestInfo>&gt;**](List<KeywordsDataBingSearchVolumeHistoryLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataBingSearchVolumeHistoryLiveResponseInfo**](KeywordsDataBingSearchVolumeHistoryLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordsDataClickstreamDataLocationsAndLanguages"></a>
# **keywordsDataClickstreamDataLocationsAndLanguages**
> KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo keywordsDataClickstreamDataLocationsAndLanguages()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

    KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo response = apiInstance.keywordsDataClickstreamDataLocationsAndLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#keywordsDataClickstreamDataLocationsAndLanguages");
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

[**KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo**](KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="clickstreamDataDataforseoSearchVolumeLive"></a>
# **clickstreamDataDataforseoSearchVolumeLive**
> KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo clickstreamDataDataforseoSearchVolumeLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo model = new KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo()
           .keywords(
               List.of(
                   "you tube",
                   "youtube",
                   "youtub"
                ))
           .locationCode(2840)
           .languageCode("en")
           .tag("test-tag");
    KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo response = apiInstance.clickstreamDataDataforseoSearchVolumeLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#clickstreamDataDataforseoSearchVolumeLive");
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
    | **** | [**List&lt;List<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo>&gt;**](List<KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo**](KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="clickstreamDataGlobalSearchVolumeLive"></a>
# **clickstreamDataGlobalSearchVolumeLive**
> KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo clickstreamDataGlobalSearchVolumeLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo model = new KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo()
           .keywords(
               List.of(
                   "you tube",
                   "youtube",
                   "youtub"
                ))
           .tag("test-tag");
    KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo response = apiInstance.clickstreamDataGlobalSearchVolumeLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#clickstreamDataGlobalSearchVolumeLive");
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
    | **** | [**List&lt;List<KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo>&gt;**](List<KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo**](KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="clickstreamDataBulkSearchVolumeLive"></a>
# **clickstreamDataBulkSearchVolumeLive**
> KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo clickstreamDataBulkSearchVolumeLive()


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
    KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
    KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo model = new KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo()
           .keywords(
               List.of(
                   "you tube",
                   "youtube",
                   "youtub"
                ))
           .locationCode(2840)
           .tag("test-tag");
    KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo response = apiInstance.clickstreamDataBulkSearchVolumeLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling KeywordsDataApi#clickstreamDataBulkSearchVolumeLive");
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
    | **** | [**List&lt;List<KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo>&gt;**](List<KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo>.md)|  | [optional] |



### Return type

[**KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo**](KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
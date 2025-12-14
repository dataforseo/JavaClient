# BusinessDataApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**businessDataIdList**](BusinessDataApi.md#businessDataIdList) | **POST**  /v3/business_data/id_list  |
| [**businessDataErrors**](BusinessDataApi.md#businessDataErrors) | **POST**  /v3/business_data/errors  |
| [**businessListingsLocations**](BusinessDataApi.md#businessListingsLocations) | **GET**  /v3/business_data/business_listings/locations  |
| [**businessListingsCategories**](BusinessDataApi.md#businessListingsCategories) | **GET**  /v3/business_data/business_listings/categories  |
| [**businessListingsAvailableFilters**](BusinessDataApi.md#businessListingsAvailableFilters) | **GET**  /v3/business_data/business_listings/available_filters  |
| [**businessListingsSearchLive**](BusinessDataApi.md#businessListingsSearchLive) | **POST**  /v3/business_data/business_listings/search/live  |
| [**businessListingsCategoriesAggregationLive**](BusinessDataApi.md#businessListingsCategoriesAggregationLive) | **POST**  /v3/business_data/business_listings/categories_aggregation/live  |
| [**businessDataGoogleLocations**](BusinessDataApi.md#businessDataGoogleLocations) | **GET**  /v3/business_data/google/locations  |
| [**businessDataGoogleLocationsCountry**](BusinessDataApi.md#businessDataGoogleLocationsCountry) | **GET**  /v3/business_data/google/locations/{country}  |
| [**businessDataGoogleLanguages**](BusinessDataApi.md#businessDataGoogleLanguages) | **GET**  /v3/business_data/google/languages  |
| [**googleMyBusinessInfoTaskPost**](BusinessDataApi.md#googleMyBusinessInfoTaskPost) | **POST**  /v3/business_data/google/my_business_info/task_post  |
| [**googleMyBusinessInfoTasksReady**](BusinessDataApi.md#googleMyBusinessInfoTasksReady) | **GET**  /v3/business_data/google/my_business_info/tasks_ready  |
| [**businessDataTasksReady**](BusinessDataApi.md#businessDataTasksReady) | **GET**  /v3/business_data/tasks_ready  |
| [**googleMyBusinessInfoTaskGet**](BusinessDataApi.md#googleMyBusinessInfoTaskGet) | **GET**  /v3/business_data/google/my_business_info/task_get/{id}  |
| [**googleMyBusinessInfoLive**](BusinessDataApi.md#googleMyBusinessInfoLive) | **POST**  /v3/business_data/google/my_business_info/live  |
| [**googleMyBusinessUpdatesTaskPost**](BusinessDataApi.md#googleMyBusinessUpdatesTaskPost) | **POST**  /v3/business_data/google/my_business_updates/task_post  |
| [**googleMyBusinessUpdatesTasksReady**](BusinessDataApi.md#googleMyBusinessUpdatesTasksReady) | **GET**  /v3/business_data/google/my_business_updates/tasks_ready  |
| [**googleMyBusinessUpdatesTaskGet**](BusinessDataApi.md#googleMyBusinessUpdatesTaskGet) | **GET**  /v3/business_data/google/my_business_updates/task_get/{id}  |
| [**googleHotelSearchesTaskPost**](BusinessDataApi.md#googleHotelSearchesTaskPost) | **POST**  /v3/business_data/google/hotel_searches/task_post  |
| [**googleHotelSearchesTasksReady**](BusinessDataApi.md#googleHotelSearchesTasksReady) | **GET**  /v3/business_data/google/hotel_searches/tasks_ready  |
| [**googleHotelSearchesTaskGet**](BusinessDataApi.md#googleHotelSearchesTaskGet) | **GET**  /v3/business_data/google/hotel_searches/task_get/{id}  |
| [**googleHotelSearchesLive**](BusinessDataApi.md#googleHotelSearchesLive) | **POST**  /v3/business_data/google/hotel_searches/live  |
| [**googleHotelInfoTaskPost**](BusinessDataApi.md#googleHotelInfoTaskPost) | **POST**  /v3/business_data/google/hotel_info/task_post  |
| [**googleHotelInfoTasksReady**](BusinessDataApi.md#googleHotelInfoTasksReady) | **GET**  /v3/business_data/google/hotel_info/tasks_ready  |
| [**googleHotelInfoTaskGetAdvanced**](BusinessDataApi.md#googleHotelInfoTaskGetAdvanced) | **GET**  /v3/business_data/google/hotel_info/task_get/advanced/{id}  |
| [**googleHotelInfoTaskGetHtml**](BusinessDataApi.md#googleHotelInfoTaskGetHtml) | **GET**  /v3/business_data/google/hotel_info/task_get/html/{id}  |
| [**googleHotelInfoLiveAdvanced**](BusinessDataApi.md#googleHotelInfoLiveAdvanced) | **POST**  /v3/business_data/google/hotel_info/live/advanced  |
| [**googleHotelInfoLiveHtml**](BusinessDataApi.md#googleHotelInfoLiveHtml) | **POST**  /v3/business_data/google/hotel_info/live/html  |
| [**googleReviewsTaskPost**](BusinessDataApi.md#googleReviewsTaskPost) | **POST**  /v3/business_data/google/reviews/task_post  |
| [**googleReviewsTasksReady**](BusinessDataApi.md#googleReviewsTasksReady) | **GET**  /v3/business_data/google/reviews/tasks_ready  |
| [**googleReviewsTaskGet**](BusinessDataApi.md#googleReviewsTaskGet) | **GET**  /v3/business_data/google/reviews/task_get/{id}  |
| [**googleExtendedReviewsTaskPost**](BusinessDataApi.md#googleExtendedReviewsTaskPost) | **POST**  /v3/business_data/google/extended_reviews/task_post  |
| [**googleExtendedReviewsTasksReady**](BusinessDataApi.md#googleExtendedReviewsTasksReady) | **GET**  /v3/business_data/google/extended_reviews/tasks_ready  |
| [**googleExtendedReviewsTaskGet**](BusinessDataApi.md#googleExtendedReviewsTaskGet) | **GET**  /v3/business_data/google/extended_reviews/task_get/{id}  |
| [**googleQuestionsAndAnswersTaskPost**](BusinessDataApi.md#googleQuestionsAndAnswersTaskPost) | **POST**  /v3/business_data/google/questions_and_answers/task_post  |
| [**googleQuestionsAndAnswersTasksReady**](BusinessDataApi.md#googleQuestionsAndAnswersTasksReady) | **GET**  /v3/business_data/google/questions_and_answers/tasks_ready  |
| [**googleQuestionsAndAnswersTaskGet**](BusinessDataApi.md#googleQuestionsAndAnswersTaskGet) | **GET**  /v3/business_data/google/questions_and_answers/task_get/{id}  |
| [**googleQuestionsAndAnswersLive**](BusinessDataApi.md#googleQuestionsAndAnswersLive) | **POST**  /v3/business_data/google/questions_and_answers/live  |
| [**trustpilotSearchTaskPost**](BusinessDataApi.md#trustpilotSearchTaskPost) | **POST**  /v3/business_data/trustpilot/search/task_post  |
| [**trustpilotSearchTasksReady**](BusinessDataApi.md#trustpilotSearchTasksReady) | **GET**  /v3/business_data/trustpilot/search/tasks_ready  |
| [**trustpilotSearchTaskGet**](BusinessDataApi.md#trustpilotSearchTaskGet) | **GET**  /v3/business_data/trustpilot/search/task_get/{id}  |
| [**trustpilotReviewsTaskPost**](BusinessDataApi.md#trustpilotReviewsTaskPost) | **POST**  /v3/business_data/trustpilot/reviews/task_post  |
| [**trustpilotReviewsTasksReady**](BusinessDataApi.md#trustpilotReviewsTasksReady) | **GET**  /v3/business_data/trustpilot/reviews/tasks_ready  |
| [**trustpilotReviewsTaskGet**](BusinessDataApi.md#trustpilotReviewsTaskGet) | **GET**  /v3/business_data/trustpilot/reviews/task_get/{id}  |
| [**tripadvisorLocations**](BusinessDataApi.md#tripadvisorLocations) | **GET**  /v3/business_data/tripadvisor/locations  |
| [**tripadvisorLocationsCountry**](BusinessDataApi.md#tripadvisorLocationsCountry) | **GET**  /v3/business_data/tripadvisor/locations/{country}  |
| [**tripadvisorLanguages**](BusinessDataApi.md#tripadvisorLanguages) | **GET**  /v3/business_data/tripadvisor/languages  |
| [**tripadvisorSearchTaskPost**](BusinessDataApi.md#tripadvisorSearchTaskPost) | **POST**  /v3/business_data/tripadvisor/search/task_post  |
| [**tripadvisorSearchTasksReady**](BusinessDataApi.md#tripadvisorSearchTasksReady) | **GET**  /v3/business_data/tripadvisor/search/tasks_ready  |
| [**tripadvisorSearchTaskGet**](BusinessDataApi.md#tripadvisorSearchTaskGet) | **GET**  /v3/business_data/tripadvisor/search/task_get/{id}  |
| [**tripadvisorReviewsTaskPost**](BusinessDataApi.md#tripadvisorReviewsTaskPost) | **POST**  /v3/business_data/tripadvisor/reviews/task_post  |
| [**tripadvisorReviewsTasksReady**](BusinessDataApi.md#tripadvisorReviewsTasksReady) | **GET**  /v3/business_data/tripadvisor/reviews/tasks_ready  |
| [**tripadvisorReviewsTaskGet**](BusinessDataApi.md#tripadvisorReviewsTaskGet) | **GET**  /v3/business_data/tripadvisor/reviews/task_get/{id}  |
| [**socialMediaPinterestLive**](BusinessDataApi.md#socialMediaPinterestLive) | **POST**  /v3/business_data/social_media/pinterest/live  |
| [**socialMediaFacebookLive**](BusinessDataApi.md#socialMediaFacebookLive) | **POST**  /v3/business_data/social_media/facebook/live  |
| [**socialMediaRedditLive**](BusinessDataApi.md#socialMediaRedditLive) | **POST**  /v3/business_data/social_media/reddit/live  |

<a id="businessDataIdList"></a>
# **businessDataIdList**
> BusinessDataIdListResponseInfo businessDataIdList()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataIdListResponseInfo response = apiInstance.businessDataIdList(
       List.of(
    
           new BusinessDataIdListRequestInfo()
        
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
      System.err.println("Exception when calling BusinessDataApi#businessDataIdList");
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
    | **** | [**List&lt;List<BusinessDataIdListRequestInfo>&gt;**](List<BusinessDataIdListRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataIdListResponseInfo**](BusinessDataIdListResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataErrors"></a>
# **businessDataErrors**
> BusinessDataErrorsResponseInfo businessDataErrors()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataErrorsResponseInfo response = apiInstance.businessDataErrors(
       List.of(
    
           new BusinessDataErrorsRequestInfo()
        
           .limit(10)
        
        
           .offset(0)
        
        
           .filteredFunction("pingback_url")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataErrors");
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
    | **** | [**List&lt;List<BusinessDataErrorsRequestInfo>&gt;**](List<BusinessDataErrorsRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataErrorsResponseInfo**](BusinessDataErrorsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessListingsLocations"></a>
# **businessListingsLocations**
> BusinessDataBusinessListingsLocationsResponseInfo businessListingsLocations()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataBusinessListingsLocationsResponseInfo response = apiInstance.businessListingsLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessListingsLocations");
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

[**BusinessDataBusinessListingsLocationsResponseInfo**](BusinessDataBusinessListingsLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessListingsCategories"></a>
# **businessListingsCategories**
> BusinessDataBusinessListingsCategoriesResponseInfo businessListingsCategories()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataBusinessListingsCategoriesResponseInfo response = apiInstance.businessListingsCategories();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessListingsCategories");
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

[**BusinessDataBusinessListingsCategoriesResponseInfo**](BusinessDataBusinessListingsCategoriesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessListingsAvailableFilters"></a>
# **businessListingsAvailableFilters**
> BusinessDataBusinessListingsAvailableFiltersResponseInfo businessListingsAvailableFilters()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataBusinessListingsAvailableFiltersResponseInfo response = apiInstance.businessListingsAvailableFilters();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessListingsAvailableFilters");
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

[**BusinessDataBusinessListingsAvailableFiltersResponseInfo**](BusinessDataBusinessListingsAvailableFiltersResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessListingsSearchLive"></a>
# **businessListingsSearchLive**
> BusinessDataBusinessListingsSearchLiveResponseInfo businessListingsSearchLive()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataBusinessListingsSearchLiveResponseInfo response = apiInstance.businessListingsSearchLive(
       List.of(
    
           new BusinessDataBusinessListingsSearchLiveRequestInfo()
        
           .categories(List.of(
    
           "pizza_restaurant"
    
       ))
        
        
           .description("pizza")
        
        
           .title("pizza")
        
        
           .isClaimed(true)
        
        
           .locationCoordinate("53.476225,-2.243572,10")
        
        
           .orderBy(List.of(
    
           "rating.value,desc"
    
       ))
        
        
           .filters(List.of(
    
           List.of(
    
           "rating.value",
    
           ">",
    
           3
    
       )
    
       ))
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessListingsSearchLive");
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
    | **** | [**List&lt;List<BusinessDataBusinessListingsSearchLiveRequestInfo>&gt;**](List<BusinessDataBusinessListingsSearchLiveRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataBusinessListingsSearchLiveResponseInfo**](BusinessDataBusinessListingsSearchLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessListingsCategoriesAggregationLive"></a>
# **businessListingsCategoriesAggregationLive**
> BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo businessListingsCategoriesAggregationLive()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo response = apiInstance.businessListingsCategoriesAggregationLive(
       List.of(
    
           new BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo()
        
           .categories(List.of(
    
           "pizza_restaurant"
    
       ))
        
        
           .description("pizza")
        
        
           .title("pizza")
        
        
           .isClaimed(true)
        
        
           .locationCoordinate("53.476225,-2.243572,10")
        
        
           .initialDatasetFilters(List.of(
    
           List.of(
    
           "rating.value",
    
           ">",
    
           3
    
       )
    
       ))
        
        
           .limit(3)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessListingsCategoriesAggregationLive");
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
    | **** | [**List&lt;List<BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo>&gt;**](List<BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo**](BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataGoogleLocations"></a>
# **businessDataGoogleLocations**
> BusinessDataGoogleLocationsResponseInfo businessDataGoogleLocations()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataGoogleLocationsResponseInfo response = apiInstance.businessDataGoogleLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataGoogleLocations");
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

[**BusinessDataGoogleLocationsResponseInfo**](BusinessDataGoogleLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataGoogleLocationsCountry"></a>
# **businessDataGoogleLocationsCountry**
> BusinessDataGoogleLocationsCountryResponseInfo businessDataGoogleLocationsCountry()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String country = ;
    BusinessDataGoogleLocationsCountryResponseInfo response = apiInstance.businessDataGoogleLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataGoogleLocationsCountry");
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

[**BusinessDataGoogleLocationsCountryResponseInfo**](BusinessDataGoogleLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataGoogleLanguages"></a>
# **businessDataGoogleLanguages**
> BusinessDataGoogleLanguagesResponseInfo businessDataGoogleLanguages()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataGoogleLanguagesResponseInfo response = apiInstance.businessDataGoogleLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataGoogleLanguages");
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

[**BusinessDataGoogleLanguagesResponseInfo**](BusinessDataGoogleLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessInfoTaskPost"></a>
# **googleMyBusinessInfoTaskPost**
> BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo googleMyBusinessInfoTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo response = apiInstance.googleMyBusinessInfoTaskPost(
       List.of(
    
           new BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationName("New York,New York,United States")
        
        
           .keyword("RustyBrick, Inc.")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleMyBusinessInfoTaskPost");
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
    | **** | [**List&lt;List<BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo>&gt;**](List<BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo**](BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessInfoTasksReady"></a>
# **googleMyBusinessInfoTasksReady**
> BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo googleMyBusinessInfoTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo response = apiInstance.googleMyBusinessInfoTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleMyBusinessInfoTasksReady");
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

[**BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo**](BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataTasksReady"></a>
# **businessDataTasksReady**
> BusinessDataTasksReadyResponseInfo businessDataTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataTasksReadyResponseInfo response = apiInstance.businessDataTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataTasksReady");
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

[**BusinessDataTasksReadyResponseInfo**](BusinessDataTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessInfoTaskGet"></a>
# **googleMyBusinessInfoTaskGet**
> BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo googleMyBusinessInfoTaskGet()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo response = apiInstance.googleMyBusinessInfoTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleMyBusinessInfoTaskGet");
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

[**BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo**](BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessInfoLive"></a>
# **googleMyBusinessInfoLive**
> BusinessDataGoogleMyBusinessInfoLiveResponseInfo googleMyBusinessInfoLive()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleMyBusinessInfoLiveResponseInfo response = apiInstance.googleMyBusinessInfoLive(
       List.of(
    
           new BusinessDataGoogleMyBusinessInfoLiveRequestInfo()
        
           .languageCode("en")
        
        
           .locationName("New York,New York,United States")
        
        
           .keyword("RustyBrick, Inc.")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleMyBusinessInfoLive");
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
    | **** | [**List&lt;List<BusinessDataGoogleMyBusinessInfoLiveRequestInfo>&gt;**](List<BusinessDataGoogleMyBusinessInfoLiveRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleMyBusinessInfoLiveResponseInfo**](BusinessDataGoogleMyBusinessInfoLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessUpdatesTaskPost"></a>
# **googleMyBusinessUpdatesTaskPost**
> BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo googleMyBusinessUpdatesTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo response = apiInstance.googleMyBusinessUpdatesTaskPost(
       List.of(
    
           new BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationName("New York,New York,United States")
        
        
           .keyword("RustyBrick, Inc.")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleMyBusinessUpdatesTaskPost");
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
    | **** | [**List&lt;List<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo>&gt;**](List<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo**](BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessUpdatesTasksReady"></a>
# **googleMyBusinessUpdatesTasksReady**
> BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo googleMyBusinessUpdatesTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo response = apiInstance.googleMyBusinessUpdatesTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleMyBusinessUpdatesTasksReady");
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

[**BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo**](BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessUpdatesTaskGet"></a>
# **googleMyBusinessUpdatesTaskGet**
> BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo googleMyBusinessUpdatesTaskGet()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo response = apiInstance.googleMyBusinessUpdatesTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleMyBusinessUpdatesTaskGet");
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

[**BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo**](BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelSearchesTaskPost"></a>
# **googleHotelSearchesTaskPost**
> BusinessDataGoogleHotelSearchesTaskPostResponseInfo googleHotelSearchesTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleHotelSearchesTaskPostResponseInfo response = apiInstance.googleHotelSearchesTaskPost(
       List.of(
    
           new BusinessDataGoogleHotelSearchesTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationName("New York,New York,United States")
        
        
           .keyword("cheap hotel")
        
        
           .checkIn()
        
        
           .checkOut()
        
        
           .currency("USD")
        
        
           .adults(2)
        
        
           .children(List.of(
    
           14
    
       ))
        
        
           .sortBy("highest_rating")
        
        
           .priority(2)
        
        
           .tag("example")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleHotelSearchesTaskPost");
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
    | **** | [**List&lt;List<BusinessDataGoogleHotelSearchesTaskPostRequestInfo>&gt;**](List<BusinessDataGoogleHotelSearchesTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleHotelSearchesTaskPostResponseInfo**](BusinessDataGoogleHotelSearchesTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelSearchesTasksReady"></a>
# **googleHotelSearchesTasksReady**
> BusinessDataGoogleHotelSearchesTasksReadyResponseInfo googleHotelSearchesTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataGoogleHotelSearchesTasksReadyResponseInfo response = apiInstance.googleHotelSearchesTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleHotelSearchesTasksReady");
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

[**BusinessDataGoogleHotelSearchesTasksReadyResponseInfo**](BusinessDataGoogleHotelSearchesTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelSearchesTaskGet"></a>
# **googleHotelSearchesTaskGet**
> BusinessDataGoogleHotelSearchesTaskGetResponseInfo googleHotelSearchesTaskGet()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataGoogleHotelSearchesTaskGetResponseInfo response = apiInstance.googleHotelSearchesTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleHotelSearchesTaskGet");
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

[**BusinessDataGoogleHotelSearchesTaskGetResponseInfo**](BusinessDataGoogleHotelSearchesTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelSearchesLive"></a>
# **googleHotelSearchesLive**
> BusinessDataGoogleHotelSearchesLiveResponseInfo googleHotelSearchesLive()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleHotelSearchesLiveResponseInfo response = apiInstance.googleHotelSearchesLive(
       List.of(
    
           new BusinessDataGoogleHotelSearchesLiveRequestInfo()
        
           .languageCode("en")
        
        
           .locationName("New York,New York,United States")
        
        
           .keyword("cheap hotel")
        
        
           .checkIn()
        
        
           .checkOut()
        
        
           .currency("USD")
        
        
           .adults(2)
        
        
           .children(List.of(
    
           14
    
       ))
        
        
           .sortBy("highest_rating")
        
        
           .tag("example")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleHotelSearchesLive");
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
    | **** | [**List&lt;List<BusinessDataGoogleHotelSearchesLiveRequestInfo>&gt;**](List<BusinessDataGoogleHotelSearchesLiveRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleHotelSearchesLiveResponseInfo**](BusinessDataGoogleHotelSearchesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelInfoTaskPost"></a>
# **googleHotelInfoTaskPost**
> BusinessDataGoogleHotelInfoTaskPostResponseInfo googleHotelInfoTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleHotelInfoTaskPostResponseInfo response = apiInstance.googleHotelInfoTaskPost(
       List.of(
    
           new BusinessDataGoogleHotelInfoTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationName("New York,New York,United States")
        
        
           .hotelIdentifier("ChYIq6SB--i6p6cpGgovbS8wN2s5ODZfEAE")
        
        
           .tag("some_string_123")
        
        
           .postbackUrl("https://your-server.com/postbackscript.php")
        
        
           .postbackData("advanced")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleHotelInfoTaskPost");
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
    | **** | [**List&lt;List<BusinessDataGoogleHotelInfoTaskPostRequestInfo>&gt;**](List<BusinessDataGoogleHotelInfoTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleHotelInfoTaskPostResponseInfo**](BusinessDataGoogleHotelInfoTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelInfoTasksReady"></a>
# **googleHotelInfoTasksReady**
> BusinessDataGoogleHotelInfoTasksReadyResponseInfo googleHotelInfoTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataGoogleHotelInfoTasksReadyResponseInfo response = apiInstance.googleHotelInfoTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleHotelInfoTasksReady");
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

[**BusinessDataGoogleHotelInfoTasksReadyResponseInfo**](BusinessDataGoogleHotelInfoTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelInfoTaskGetAdvanced"></a>
# **googleHotelInfoTaskGetAdvanced**
> BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo googleHotelInfoTaskGetAdvanced()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo response = apiInstance.googleHotelInfoTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleHotelInfoTaskGetAdvanced");
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

[**BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo**](BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelInfoTaskGetHtml"></a>
# **googleHotelInfoTaskGetHtml**
> BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo googleHotelInfoTaskGetHtml()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo response = apiInstance.googleHotelInfoTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleHotelInfoTaskGetHtml");
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

[**BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo**](BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelInfoLiveAdvanced"></a>
# **googleHotelInfoLiveAdvanced**
> BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo googleHotelInfoLiveAdvanced()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo response = apiInstance.googleHotelInfoLiveAdvanced(
       List.of(
    
           new BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationName("New York,New York,United States")
        
        
           .hotelIdentifier("CgoI-KWyzenM_MV3EAE")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleHotelInfoLiveAdvanced");
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
    | **** | [**List&lt;List<BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo>&gt;**](List<BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo**](BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelInfoLiveHtml"></a>
# **googleHotelInfoLiveHtml**
> BusinessDataGoogleHotelInfoLiveHtmlResponseInfo googleHotelInfoLiveHtml()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleHotelInfoLiveHtmlResponseInfo response = apiInstance.googleHotelInfoLiveHtml(
       List.of(
    
           new BusinessDataGoogleHotelInfoLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationName("New York,New York,United States")
        
        
           .hotelIdentifier("ChYIq6SB--i6p6cpGgovbS8wN2s5ODZfEAE")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleHotelInfoLiveHtml");
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
    | **** | [**List&lt;List<BusinessDataGoogleHotelInfoLiveHtmlRequestInfo>&gt;**](List<BusinessDataGoogleHotelInfoLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleHotelInfoLiveHtmlResponseInfo**](BusinessDataGoogleHotelInfoLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleReviewsTaskPost"></a>
# **googleReviewsTaskPost**
> BusinessDataGoogleReviewsTaskPostResponseInfo googleReviewsTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleReviewsTaskPostResponseInfo response = apiInstance.googleReviewsTaskPost(
       List.of(
    
           new BusinessDataGoogleReviewsTaskPostRequestInfo()
        
           .locationName("London,England,United Kingdom")
        
        
           .languageName("English")
        
        
           .keyword("hedonism wines")
        
        
           .depth(50)
        
        
           .sortBy("highest_rating")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleReviewsTaskPost");
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
    | **** | [**List&lt;List<BusinessDataGoogleReviewsTaskPostRequestInfo>&gt;**](List<BusinessDataGoogleReviewsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleReviewsTaskPostResponseInfo**](BusinessDataGoogleReviewsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleReviewsTasksReady"></a>
# **googleReviewsTasksReady**
> BusinessDataGoogleReviewsTasksReadyResponseInfo googleReviewsTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataGoogleReviewsTasksReadyResponseInfo response = apiInstance.googleReviewsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleReviewsTasksReady");
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

[**BusinessDataGoogleReviewsTasksReadyResponseInfo**](BusinessDataGoogleReviewsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleReviewsTaskGet"></a>
# **googleReviewsTaskGet**
> BusinessDataGoogleReviewsTaskGetResponseInfo googleReviewsTaskGet()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataGoogleReviewsTaskGetResponseInfo response = apiInstance.googleReviewsTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleReviewsTaskGet");
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

[**BusinessDataGoogleReviewsTaskGetResponseInfo**](BusinessDataGoogleReviewsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleExtendedReviewsTaskPost"></a>
# **googleExtendedReviewsTaskPost**
> BusinessDataGoogleExtendedReviewsTaskPostResponseInfo googleExtendedReviewsTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleExtendedReviewsTaskPostResponseInfo response = apiInstance.googleExtendedReviewsTaskPost(
       List.of(
    
           new BusinessDataGoogleExtendedReviewsTaskPostRequestInfo()
        
           .locationName("London,England,United Kingdom")
        
        
           .languageName("english")
        
        
           .cid("17626775537598922320")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleExtendedReviewsTaskPost");
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
    | **** | [**List&lt;List<BusinessDataGoogleExtendedReviewsTaskPostRequestInfo>&gt;**](List<BusinessDataGoogleExtendedReviewsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleExtendedReviewsTaskPostResponseInfo**](BusinessDataGoogleExtendedReviewsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleExtendedReviewsTasksReady"></a>
# **googleExtendedReviewsTasksReady**
> BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo googleExtendedReviewsTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo response = apiInstance.googleExtendedReviewsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleExtendedReviewsTasksReady");
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

[**BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo**](BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleExtendedReviewsTaskGet"></a>
# **googleExtendedReviewsTaskGet**
> BusinessDataGoogleExtendedReviewsTaskGetResponseInfo googleExtendedReviewsTaskGet()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataGoogleExtendedReviewsTaskGetResponseInfo response = apiInstance.googleExtendedReviewsTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleExtendedReviewsTaskGet");
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

[**BusinessDataGoogleExtendedReviewsTaskGetResponseInfo**](BusinessDataGoogleExtendedReviewsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleQuestionsAndAnswersTaskPost"></a>
# **googleQuestionsAndAnswersTaskPost**
> BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo googleQuestionsAndAnswersTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo response = apiInstance.googleQuestionsAndAnswersTaskPost(
       List.of(
    
           new BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationName("Los Angeles,California,United States")
        
        
           .keyword("The Last Bookstore")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleQuestionsAndAnswersTaskPost");
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
    | **** | [**List&lt;List<BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo>&gt;**](List<BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo**](BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleQuestionsAndAnswersTasksReady"></a>
# **googleQuestionsAndAnswersTasksReady**
> BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo googleQuestionsAndAnswersTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo response = apiInstance.googleQuestionsAndAnswersTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleQuestionsAndAnswersTasksReady");
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

[**BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo**](BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleQuestionsAndAnswersTaskGet"></a>
# **googleQuestionsAndAnswersTaskGet**
> BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo googleQuestionsAndAnswersTaskGet()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo response = apiInstance.googleQuestionsAndAnswersTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleQuestionsAndAnswersTaskGet");
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

[**BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo**](BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleQuestionsAndAnswersLive"></a>
# **googleQuestionsAndAnswersLive**
> BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo googleQuestionsAndAnswersLive()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo response = apiInstance.googleQuestionsAndAnswersLive(
       List.of(
    
           new BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo()
        
           .languageCode("en")
        
        
           .locationName("Los Angeles,California,United States")
        
        
           .keyword("The Last Bookstore")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#googleQuestionsAndAnswersLive");
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
    | **** | [**List&lt;List<BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo>&gt;**](List<BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo**](BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="trustpilotSearchTaskPost"></a>
# **trustpilotSearchTaskPost**
> BusinessDataTrustpilotSearchTaskPostResponseInfo trustpilotSearchTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataTrustpilotSearchTaskPostResponseInfo response = apiInstance.trustpilotSearchTaskPost(
       List.of(
    
           new BusinessDataTrustpilotSearchTaskPostRequestInfo()
        
           .keyword("pizza restaurant")
        
        
           .depth(20)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#trustpilotSearchTaskPost");
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
    | **** | [**List&lt;List<BusinessDataTrustpilotSearchTaskPostRequestInfo>&gt;**](List<BusinessDataTrustpilotSearchTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataTrustpilotSearchTaskPostResponseInfo**](BusinessDataTrustpilotSearchTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="trustpilotSearchTasksReady"></a>
# **trustpilotSearchTasksReady**
> BusinessDataTrustpilotSearchTasksReadyResponseInfo trustpilotSearchTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataTrustpilotSearchTasksReadyResponseInfo response = apiInstance.trustpilotSearchTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#trustpilotSearchTasksReady");
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

[**BusinessDataTrustpilotSearchTasksReadyResponseInfo**](BusinessDataTrustpilotSearchTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="trustpilotSearchTaskGet"></a>
# **trustpilotSearchTaskGet**
> BusinessDataTrustpilotSearchTaskGetResponseInfo trustpilotSearchTaskGet()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataTrustpilotSearchTaskGetResponseInfo response = apiInstance.trustpilotSearchTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#trustpilotSearchTaskGet");
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

[**BusinessDataTrustpilotSearchTaskGetResponseInfo**](BusinessDataTrustpilotSearchTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="trustpilotReviewsTaskPost"></a>
# **trustpilotReviewsTaskPost**
> BusinessDataTrustpilotReviewsTaskPostResponseInfo trustpilotReviewsTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataTrustpilotReviewsTaskPostResponseInfo response = apiInstance.trustpilotReviewsTaskPost(
       List.of(
    
           new BusinessDataTrustpilotReviewsTaskPostRequestInfo()
        
           .domain("www.thepearlsource.com")
        
        
           .depth(40)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#trustpilotReviewsTaskPost");
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
    | **** | [**List&lt;List<BusinessDataTrustpilotReviewsTaskPostRequestInfo>&gt;**](List<BusinessDataTrustpilotReviewsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataTrustpilotReviewsTaskPostResponseInfo**](BusinessDataTrustpilotReviewsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="trustpilotReviewsTasksReady"></a>
# **trustpilotReviewsTasksReady**
> BusinessDataTrustpilotReviewsTasksReadyResponseInfo trustpilotReviewsTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataTrustpilotReviewsTasksReadyResponseInfo response = apiInstance.trustpilotReviewsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#trustpilotReviewsTasksReady");
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

[**BusinessDataTrustpilotReviewsTasksReadyResponseInfo**](BusinessDataTrustpilotReviewsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="trustpilotReviewsTaskGet"></a>
# **trustpilotReviewsTaskGet**
> BusinessDataTrustpilotReviewsTaskGetResponseInfo trustpilotReviewsTaskGet()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataTrustpilotReviewsTaskGetResponseInfo response = apiInstance.trustpilotReviewsTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#trustpilotReviewsTaskGet");
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

[**BusinessDataTrustpilotReviewsTaskGetResponseInfo**](BusinessDataTrustpilotReviewsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorLocations"></a>
# **tripadvisorLocations**
> BusinessDataTripadvisorLocationsResponseInfo tripadvisorLocations()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataTripadvisorLocationsResponseInfo response = apiInstance.tripadvisorLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#tripadvisorLocations");
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

[**BusinessDataTripadvisorLocationsResponseInfo**](BusinessDataTripadvisorLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorLocationsCountry"></a>
# **tripadvisorLocationsCountry**
> BusinessDataTripadvisorLocationsCountryResponseInfo tripadvisorLocationsCountry()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String country = ;
    BusinessDataTripadvisorLocationsCountryResponseInfo response = apiInstance.tripadvisorLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#tripadvisorLocationsCountry");
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

[**BusinessDataTripadvisorLocationsCountryResponseInfo**](BusinessDataTripadvisorLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorLanguages"></a>
# **tripadvisorLanguages**
> BusinessDataTripadvisorLanguagesResponseInfo tripadvisorLanguages()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataTripadvisorLanguagesResponseInfo response = apiInstance.tripadvisorLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#tripadvisorLanguages");
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

[**BusinessDataTripadvisorLanguagesResponseInfo**](BusinessDataTripadvisorLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorSearchTaskPost"></a>
# **tripadvisorSearchTaskPost**
> BusinessDataTripadvisorSearchTaskPostResponseInfo tripadvisorSearchTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataTripadvisorSearchTaskPostResponseInfo response = apiInstance.tripadvisorSearchTaskPost(
       List.of(
    
           new BusinessDataTripadvisorSearchTaskPostRequestInfo()
        
           .keyword("pizza")
        
        
           .locationCode(1003854)
        
        
           .depth(30)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#tripadvisorSearchTaskPost");
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
    | **** | [**List&lt;List<BusinessDataTripadvisorSearchTaskPostRequestInfo>&gt;**](List<BusinessDataTripadvisorSearchTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataTripadvisorSearchTaskPostResponseInfo**](BusinessDataTripadvisorSearchTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorSearchTasksReady"></a>
# **tripadvisorSearchTasksReady**
> BusinessDataTripadvisorSearchTasksReadyResponseInfo tripadvisorSearchTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataTripadvisorSearchTasksReadyResponseInfo response = apiInstance.tripadvisorSearchTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#tripadvisorSearchTasksReady");
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

[**BusinessDataTripadvisorSearchTasksReadyResponseInfo**](BusinessDataTripadvisorSearchTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorSearchTaskGet"></a>
# **tripadvisorSearchTaskGet**
> BusinessDataTripadvisorSearchTaskGetResponseInfo tripadvisorSearchTaskGet()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataTripadvisorSearchTaskGetResponseInfo response = apiInstance.tripadvisorSearchTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#tripadvisorSearchTaskGet");
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

[**BusinessDataTripadvisorSearchTaskGetResponseInfo**](BusinessDataTripadvisorSearchTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorReviewsTaskPost"></a>
# **tripadvisorReviewsTaskPost**
> BusinessDataTripadvisorReviewsTaskPostResponseInfo tripadvisorReviewsTaskPost()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataTripadvisorReviewsTaskPostResponseInfo response = apiInstance.tripadvisorReviewsTaskPost(
       List.of(
    
           new BusinessDataTripadvisorReviewsTaskPostRequestInfo()
        
           .urlPath("Hotel_Review-g60763-d23462501-Reviews-Margaritaville_Times_Square-New_York_City_New_York.html")
        
        
           .locationCode(1003854)
        
        
           .pingbackUrl("https://your-server.com/pingback.php?id=$id&tag=$tag")
        
        
           .tag("some_string_123")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#tripadvisorReviewsTaskPost");
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
    | **** | [**List&lt;List<BusinessDataTripadvisorReviewsTaskPostRequestInfo>&gt;**](List<BusinessDataTripadvisorReviewsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataTripadvisorReviewsTaskPostResponseInfo**](BusinessDataTripadvisorReviewsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorReviewsTasksReady"></a>
# **tripadvisorReviewsTasksReady**
> BusinessDataTripadvisorReviewsTasksReadyResponseInfo tripadvisorReviewsTasksReady()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

    BusinessDataTripadvisorReviewsTasksReadyResponseInfo response = apiInstance.tripadvisorReviewsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#tripadvisorReviewsTasksReady");
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

[**BusinessDataTripadvisorReviewsTasksReadyResponseInfo**](BusinessDataTripadvisorReviewsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorReviewsTaskGet"></a>
# **tripadvisorReviewsTaskGet**
> BusinessDataTripadvisorReviewsTaskGetResponseInfo tripadvisorReviewsTaskGet()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = ;
    BusinessDataTripadvisorReviewsTaskGetResponseInfo response = apiInstance.tripadvisorReviewsTaskGet(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#tripadvisorReviewsTaskGet");
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

[**BusinessDataTripadvisorReviewsTaskGetResponseInfo**](BusinessDataTripadvisorReviewsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="socialMediaPinterestLive"></a>
# **socialMediaPinterestLive**
> BusinessDataSocialMediaPinterestLiveResponseInfo socialMediaPinterestLive()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataSocialMediaPinterestLiveResponseInfo response = apiInstance.socialMediaPinterestLive(
       List.of(
    
           new BusinessDataSocialMediaPinterestLiveRequestInfo()
        
           .targets(List.of(
    
           "https://www.simplyrecipes.com/recipes/grilled_salmon_with_cucumber_mango_salsa/",
    
           "https://tasty.co/recipe/classic-lasagna",
    
           "https://www.allrecipes.com/recipe/255263/sicilian-roasted-chicken/"
    
       ))
        
        
           .tag("some_string_123")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#socialMediaPinterestLive");
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
    | **** | [**List&lt;List<BusinessDataSocialMediaPinterestLiveRequestInfo>&gt;**](List<BusinessDataSocialMediaPinterestLiveRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataSocialMediaPinterestLiveResponseInfo**](BusinessDataSocialMediaPinterestLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="socialMediaFacebookLive"></a>
# **socialMediaFacebookLive**
> BusinessDataSocialMediaFacebookLiveResponseInfo socialMediaFacebookLive()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataSocialMediaFacebookLiveResponseInfo response = apiInstance.socialMediaFacebookLive(
       List.of(
    
           new BusinessDataSocialMediaFacebookLiveRequestInfo()
        
           .targets(List.of(
    
           "https://prnt.sc/",
    
           "https://developers.facebook.com/docs/plugins/like-button/",
    
           "https://www.shbarcelona.com/blog/en/salsa-dance-clubs-in-barcelona/"
    
       ))
        
        
           .tag("some_string_123")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#socialMediaFacebookLive");
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
    | **** | [**List&lt;List<BusinessDataSocialMediaFacebookLiveRequestInfo>&gt;**](List<BusinessDataSocialMediaFacebookLiveRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataSocialMediaFacebookLiveResponseInfo**](BusinessDataSocialMediaFacebookLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="socialMediaRedditLive"></a>
# **socialMediaRedditLive**
> BusinessDataSocialMediaRedditLiveResponseInfo socialMediaRedditLive()


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
    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    BusinessDataSocialMediaRedditLiveResponseInfo response = apiInstance.socialMediaRedditLive(
       List.of(
    
           new BusinessDataSocialMediaRedditLiveRequestInfo()
        
           .targets(List.of(
    
           "https://vk.com/",
    
           "https://ahrefs.com/",
    
           "https://google.com/",
    
           "https://twitter.com/",
    
           "https://reddit.com/",
    
           "https://facebook.com/"
    
       ))
        
        
           .tag("some_string_123")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#socialMediaRedditLive");
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
    | **** | [**List&lt;List<BusinessDataSocialMediaRedditLiveRequestInfo>&gt;**](List<BusinessDataSocialMediaRedditLiveRequestInfo>.md)|  | [optional] |



### Return type

[**BusinessDataSocialMediaRedditLiveResponseInfo**](BusinessDataSocialMediaRedditLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
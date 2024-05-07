# BusinessDataApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**businessDataBusinessListingsLocations**](BusinessDataApi.md#businessDataBusinessListingsLocations) | **GET** /v3/business_data/business_listings/locations |  |
| [**businessDataErrors**](BusinessDataApi.md#businessDataErrors) | **POST** /v3/business_data/errors |  |
| [**businessDataGoogleLanguages**](BusinessDataApi.md#businessDataGoogleLanguages) | **GET** /v3/business_data/google/languages |  |
| [**businessDataGoogleLocations**](BusinessDataApi.md#businessDataGoogleLocations) | **GET** /v3/business_data/google/locations |  |
| [**businessDataGoogleLocationsCountry**](BusinessDataApi.md#businessDataGoogleLocationsCountry) | **GET** /v3/business_data/google/locations/{country} |  |
| [**businessDataIdList**](BusinessDataApi.md#businessDataIdList) | **POST** /v3/business_data/id_list |  |
| [**businessDataTripadvisorLanguages**](BusinessDataApi.md#businessDataTripadvisorLanguages) | **GET** /v3/business_data/tripadvisor/languages |  |
| [**businessDataTripadvisorLocations**](BusinessDataApi.md#businessDataTripadvisorLocations) | **GET** /v3/business_data/tripadvisor/locations |  |
| [**businessDataTripadvisorLocationsCountry**](BusinessDataApi.md#businessDataTripadvisorLocationsCountry) | **GET** /v3/business_data/tripadvisor/locations/{country} |  |
| [**businessDataYelpLanguages**](BusinessDataApi.md#businessDataYelpLanguages) | **GET** /v3/business_data/yelp/languages |  |
| [**businessDataYelpLocations**](BusinessDataApi.md#businessDataYelpLocations) | **GET** /v3/business_data/yelp/locations |  |
| [**businessDataYelpLocationsCountry**](BusinessDataApi.md#businessDataYelpLocationsCountry) | **GET** /v3/business_data/yelp/locations/{country} |  |
| [**businessListingsAvailableFilters**](BusinessDataApi.md#businessListingsAvailableFilters) | **GET** /v3/business_data/business_listings/available_filters |  |
| [**businessListingsCategories**](BusinessDataApi.md#businessListingsCategories) | **GET** /v3/business_data/business_listings/categories |  |
| [**businessListingsCategoriesAggregationLive**](BusinessDataApi.md#businessListingsCategoriesAggregationLive) | **POST** /v3/business_data/business_listings/categories_aggregation/live |  |
| [**businessListingsSearchLive**](BusinessDataApi.md#businessListingsSearchLive) | **POST** /v3/business_data/business_listings/search/live |  |
| [**googleHotelInfoLiveAdvanced**](BusinessDataApi.md#googleHotelInfoLiveAdvanced) | **POST** /v3/business_data/google/hotel_info/live/advanced |  |
| [**googleHotelInfoLiveHtml**](BusinessDataApi.md#googleHotelInfoLiveHtml) | **POST** /v3/business_data/google/hotel_info/live/html |  |
| [**googleHotelInfoTaskGetAdvanced**](BusinessDataApi.md#googleHotelInfoTaskGetAdvanced) | **GET** /v3/business_data/google/hotel_info/task_get/advanced/{id} |  |
| [**googleHotelInfoTaskGetHtml**](BusinessDataApi.md#googleHotelInfoTaskGetHtml) | **GET** /v3/business_data/google/hotel_info/task_get/html/{id} |  |
| [**googleHotelInfoTaskPost**](BusinessDataApi.md#googleHotelInfoTaskPost) | **POST** /v3/business_data/google/hotel_info/task_post |  |
| [**googleHotelInfoTasksReady**](BusinessDataApi.md#googleHotelInfoTasksReady) | **GET** /v3/business_data/google/hotel_info/tasks_ready |  |
| [**googleHotelSearchesLive**](BusinessDataApi.md#googleHotelSearchesLive) | **POST** /v3/business_data/google/hotel_searches/live |  |
| [**googleHotelSearchesTaskGet**](BusinessDataApi.md#googleHotelSearchesTaskGet) | **GET** /v3/business_data/google/hotel_searches/task_get/{id} |  |
| [**googleHotelSearchesTaskPost**](BusinessDataApi.md#googleHotelSearchesTaskPost) | **POST** /v3/business_data/google/hotel_searches/task_post |  |
| [**googleHotelSearchesTasksReady**](BusinessDataApi.md#googleHotelSearchesTasksReady) | **GET** /v3/business_data/google/hotel_searches/tasks_ready |  |
| [**googleMyBusinessInfoTaskGet**](BusinessDataApi.md#googleMyBusinessInfoTaskGet) | **GET** /v3/business_data/google/my_business_info/task_get/{id} |  |
| [**googleMyBusinessInfoTaskPost**](BusinessDataApi.md#googleMyBusinessInfoTaskPost) | **POST** /v3/business_data/google/my_business_info/task_post |  |
| [**googleMyBusinessInfoTasksReady**](BusinessDataApi.md#googleMyBusinessInfoTasksReady) | **GET** /v3/business_data/google/my_business_info/tasks_ready |  |
| [**googleMyBusinessUpdatesTaskGet**](BusinessDataApi.md#googleMyBusinessUpdatesTaskGet) | **GET** /v3/business_data/google/my_business_updates/task_get/{id} |  |
| [**googleMyBusinessUpdatesTaskPost**](BusinessDataApi.md#googleMyBusinessUpdatesTaskPost) | **POST** /v3/business_data/google/my_business_updates/task_post |  |
| [**googleMyBusinessUpdatesTasksReady**](BusinessDataApi.md#googleMyBusinessUpdatesTasksReady) | **GET** /v3/business_data/google/my_business_updates/tasks_ready |  |
| [**googleQuestionsAndAnswersLive**](BusinessDataApi.md#googleQuestionsAndAnswersLive) | **POST** /v3/business_data/google/questions_and_answers/live |  |
| [**googleQuestionsAndAnswersTaskGet**](BusinessDataApi.md#googleQuestionsAndAnswersTaskGet) | **GET** /v3/business_data/google/questions_and_answers/task_get/{id} |  |
| [**googleQuestionsAndAnswersTaskPost**](BusinessDataApi.md#googleQuestionsAndAnswersTaskPost) | **POST** /v3/business_data/google/questions_and_answers/task_post |  |
| [**googleQuestionsAndAnswersTasksReady**](BusinessDataApi.md#googleQuestionsAndAnswersTasksReady) | **GET** /v3/business_data/google/questions_and_answers/tasks_ready |  |
| [**googleReviewsTaskGet**](BusinessDataApi.md#googleReviewsTaskGet) | **GET** /v3/business_data/google/reviews/task_get/{id} |  |
| [**googleReviewsTaskPost**](BusinessDataApi.md#googleReviewsTaskPost) | **POST** /v3/business_data/google/reviews/task_post |  |
| [**googleReviewsTasksReady**](BusinessDataApi.md#googleReviewsTasksReady) | **GET** /v3/business_data/google/reviews/tasks_ready |  |
| [**socialMediaFacebookLive**](BusinessDataApi.md#socialMediaFacebookLive) | **POST** /v3/business_data/social_media/facebook/live |  |
| [**socialMediaPinterestLive**](BusinessDataApi.md#socialMediaPinterestLive) | **POST** /v3/business_data/social_media/pinterest/live |  |
| [**socialMediaRedditLive**](BusinessDataApi.md#socialMediaRedditLive) | **POST** /v3/business_data/social_media/reddit/live |  |
| [**tripadvisorReviewsTaskGet**](BusinessDataApi.md#tripadvisorReviewsTaskGet) | **GET** /v3/business_data/tripadvisor/reviews/task_get/{id} |  |
| [**tripadvisorReviewsTaskPost**](BusinessDataApi.md#tripadvisorReviewsTaskPost) | **POST** /v3/business_data/tripadvisor/reviews/task_post |  |
| [**tripadvisorReviewsTasksReady**](BusinessDataApi.md#tripadvisorReviewsTasksReady) | **GET** /v3/business_data/tripadvisor/reviews/tasks_ready |  |
| [**tripadvisorSearchTaskGet**](BusinessDataApi.md#tripadvisorSearchTaskGet) | **GET** /v3/business_data/tripadvisor/search/task_get/{id} |  |
| [**tripadvisorSearchTaskPost**](BusinessDataApi.md#tripadvisorSearchTaskPost) | **POST** /v3/business_data/tripadvisor/search/task_post |  |
| [**tripadvisorSearchTasksReady**](BusinessDataApi.md#tripadvisorSearchTasksReady) | **GET** /v3/business_data/tripadvisor/search/tasks_ready |  |
| [**trustpilotReviewsTaskGet**](BusinessDataApi.md#trustpilotReviewsTaskGet) | **GET** /v3/business_data/trustpilot/reviews/task_get/{id} |  |
| [**trustpilotReviewsTaskPost**](BusinessDataApi.md#trustpilotReviewsTaskPost) | **POST** /v3/business_data/trustpilot/reviews/task_post |  |
| [**trustpilotReviewsTasksReady**](BusinessDataApi.md#trustpilotReviewsTasksReady) | **GET** /v3/business_data/trustpilot/reviews/tasks_ready |  |
| [**trustpilotSearchTaskGet**](BusinessDataApi.md#trustpilotSearchTaskGet) | **GET** /v3/business_data/trustpilot/search/task_get/{id} |  |
| [**trustpilotSearchTaskPost**](BusinessDataApi.md#trustpilotSearchTaskPost) | **POST** /v3/business_data/trustpilot/search/task_post |  |
| [**trustpilotSearchTasksReady**](BusinessDataApi.md#trustpilotSearchTasksReady) | **GET** /v3/business_data/trustpilot/search/tasks_ready |  |
| [**yelpReviewsTaskGet**](BusinessDataApi.md#yelpReviewsTaskGet) | **GET** /v3/business_data/yelp/reviews/task_get/{id} |  |
| [**yelpReviewsTaskPost**](BusinessDataApi.md#yelpReviewsTaskPost) | **POST** /v3/business_data/yelp/reviews/task_post |  |
| [**yelpReviewsTasksReady**](BusinessDataApi.md#yelpReviewsTasksReady) | **GET** /v3/business_data/yelp/reviews/tasks_ready |  |
| [**yelpSearchTaskGet**](BusinessDataApi.md#yelpSearchTaskGet) | **GET** /v3/business_data/yelp/search/task_get/{id} |  |
| [**yelpSearchTaskPost**](BusinessDataApi.md#yelpSearchTaskPost) | **POST** /v3/business_data/yelp/search/task_post |  |
| [**yelpSearchTasksReady**](BusinessDataApi.md#yelpSearchTasksReady) | **GET** /v3/business_data/yelp/search/tasks_ready |  |


<a id="businessDataBusinessListingsLocations"></a>
# **businessDataBusinessListingsLocations**
> BusinessDataBusinessListingsLocationsResponseInfo businessDataBusinessListingsLocations()



You will receive the list of locations by this API call. You can also download the full list of supported locations in the CSV format (last updated 2024-04-04). for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/business_listings/locations/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataBusinessListingsLocationsResponseInfo result = apiInstance.businessDataBusinessListingsLocations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataBusinessListingsLocations");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataErrors"></a>
# **businessDataErrors**
> BusinessDataErrorsResponseInfo businessDataErrors(businessDataErrorsRequestInfo)



By calling this endpoint you will receive information about the Business Data API tasks that returned an error within the past 24 hours. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/errors/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataErrorsRequestInfo> businessDataErrorsRequestInfo = Arrays.asList(); // List<BusinessDataErrorsRequestInfo> | 
    try {
      BusinessDataErrorsResponseInfo result = apiInstance.businessDataErrors(businessDataErrorsRequestInfo);
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
| **businessDataErrorsRequestInfo** | [**List&lt;BusinessDataErrorsRequestInfo&gt;**](BusinessDataErrorsRequestInfo.md)|  | [optional] |

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

<a id="businessDataGoogleLanguages"></a>
# **businessDataGoogleLanguages**
> BusinessDataGoogleLanguagesResponseInfo businessDataGoogleLanguages()



You will receive the list of languages by calling this API. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/languages/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataGoogleLanguagesResponseInfo result = apiInstance.businessDataGoogleLanguages();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataGoogleLocations"></a>
# **businessDataGoogleLocations**
> BusinessDataGoogleLocationsResponseInfo businessDataGoogleLocations()



You will receive the list of locations by this API call. You can filter the list of locations by country when setting a task. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/locations/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataGoogleLocationsResponseInfo result = apiInstance.businessDataGoogleLocations();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataGoogleLocationsCountry"></a>
# **businessDataGoogleLocationsCountry**
> BusinessDataGoogleLocationsCountryResponseInfo businessDataGoogleLocationsCountry(country)



You will receive the list of locations by this API call. You can filter the list of locations by country when setting a task. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/locations/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String country = "us"; // String | country ISO code optional field specify the ISO code if you want to filter the list of locations by country example: us
    try {
      BusinessDataGoogleLocationsCountryResponseInfo result = apiInstance.businessDataGoogleLocationsCountry(country);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **country** | **String**| country ISO code optional field specify the ISO code if you want to filter the list of locations by country example: us | |

### Return type

[**BusinessDataGoogleLocationsCountryResponseInfo**](BusinessDataGoogleLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataIdList"></a>
# **businessDataIdList**
> BusinessDataIdListResponseInfo businessDataIdList(businessDataIdListRequestInfo)



This endpoint is designed to provide you with the list of IDs and metadata of the completed Business Data tasks during the specified period. You will get all task IDs that were made including successful, uncompleted, and tasks that responded as errors. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/id_list/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataIdListRequestInfo> businessDataIdListRequestInfo = Arrays.asList(); // List<BusinessDataIdListRequestInfo> | 
    try {
      BusinessDataIdListResponseInfo result = apiInstance.businessDataIdList(businessDataIdListRequestInfo);
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
| **businessDataIdListRequestInfo** | [**List&lt;BusinessDataIdListRequestInfo&gt;**](BusinessDataIdListRequestInfo.md)|  | [optional] |

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

<a id="businessDataTripadvisorLanguages"></a>
# **businessDataTripadvisorLanguages**
> BusinessDataTripadvisorLanguagesResponseInfo businessDataTripadvisorLanguages()



You will receive the list of languages by calling this API. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/tripadvisor/languages/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataTripadvisorLanguagesResponseInfo result = apiInstance.businessDataTripadvisorLanguages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataTripadvisorLanguages");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataTripadvisorLocations"></a>
# **businessDataTripadvisorLocations**
> BusinessDataTripadvisorLocationsResponseInfo businessDataTripadvisorLocations()



You will receive the list of locations by this API call. You can filter the list of locations by country when setting a task. Note that supported location types in Tripadvisor Business Data API are City and Region only. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/tripadvisor/locations/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataTripadvisorLocationsResponseInfo result = apiInstance.businessDataTripadvisorLocations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataTripadvisorLocations");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataTripadvisorLocationsCountry"></a>
# **businessDataTripadvisorLocationsCountry**
> BusinessDataTripadvisorLocationsCountryResponseInfo businessDataTripadvisorLocationsCountry(country)



You will receive the list of locations by this API call. You can filter the list of locations by country when setting a task. Note that supported location types in Tripadvisor Business Data API are City and Region only. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/tripadvisor/locations/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String country = "us"; // String | country ISO code optional field specify the ISO code if you want to filter the list of locations by country example: us
    try {
      BusinessDataTripadvisorLocationsCountryResponseInfo result = apiInstance.businessDataTripadvisorLocationsCountry(country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataTripadvisorLocationsCountry");
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
| **country** | **String**| country ISO code optional field specify the ISO code if you want to filter the list of locations by country example: us | |

### Return type

[**BusinessDataTripadvisorLocationsCountryResponseInfo**](BusinessDataTripadvisorLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataYelpLanguages"></a>
# **businessDataYelpLanguages**
> BusinessDataYelpLanguagesResponseInfo businessDataYelpLanguages()



You will receive the list of languages by calling this API. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/yelp/languages/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataYelpLanguagesResponseInfo result = apiInstance.businessDataYelpLanguages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataYelpLanguages");
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

[**BusinessDataYelpLanguagesResponseInfo**](BusinessDataYelpLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataYelpLocations"></a>
# **businessDataYelpLocations**
> BusinessDataYelpLocationsResponseInfo businessDataYelpLocations()



You will receive the list of locations by this API call. You can filter the list of locations by country when setting a task. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/yelp/locations/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataYelpLocationsResponseInfo result = apiInstance.businessDataYelpLocations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataYelpLocations");
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

[**BusinessDataYelpLocationsResponseInfo**](BusinessDataYelpLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessDataYelpLocationsCountry"></a>
# **businessDataYelpLocationsCountry**
> BusinessDataYelpLocationsCountryResponseInfo businessDataYelpLocationsCountry(country)



You will receive the list of locations by this API call. You can filter the list of locations by country when setting a task. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/yelp/locations/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String country = "us"; // String | country ISO code optional field specify the ISO code if you want to filter the list of locations by country example: us
    try {
      BusinessDataYelpLocationsCountryResponseInfo result = apiInstance.businessDataYelpLocationsCountry(country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#businessDataYelpLocationsCountry");
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
| **country** | **String**| country ISO code optional field specify the ISO code if you want to filter the list of locations by country example: us | |

### Return type

[**BusinessDataYelpLocationsCountryResponseInfo**](BusinessDataYelpLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessListingsAvailableFilters"></a>
# **businessListingsAvailableFilters**
> BusinessDataBusinessListingsAvailableFiltersResponseInfo businessListingsAvailableFilters()



‌‌ Here you will find all the necessary information about filters that can be used with Business Listings API. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/business_listings/filters/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataBusinessListingsAvailableFiltersResponseInfo result = apiInstance.businessListingsAvailableFilters();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessListingsCategories"></a>
# **businessListingsCategories**
> BusinessDataBusinessListingsCategoriesResponseInfo businessListingsCategories()



This endpoint will provide you with the list of top categories by business count. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/business_listings/categories/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataBusinessListingsCategoriesResponseInfo result = apiInstance.businessListingsCategories();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="businessListingsCategoriesAggregationLive"></a>
# **businessListingsCategoriesAggregationLive**
> BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo businessListingsCategoriesAggregationLive(businessDataBusinessListingsCategoriesAggregationLiveRequestInfo)



‌‌ Business Listings Categories Aggregation endpoint provides results containing information about groups of related categories along with the number of entities in each category. The provided results are specific to the specified parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/business_listings/categories_aggregation/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo> businessDataBusinessListingsCategoriesAggregationLiveRequestInfo = Arrays.asList(); // List<BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo> | 
    try {
      BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo result = apiInstance.businessListingsCategoriesAggregationLive(businessDataBusinessListingsCategoriesAggregationLiveRequestInfo);
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
| **businessDataBusinessListingsCategoriesAggregationLiveRequestInfo** | [**List&lt;BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo&gt;**](BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo.md)|  | [optional] |

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

<a id="businessListingsSearchLive"></a>
# **businessListingsSearchLive**
> BusinessDataBusinessListingsSearchLiveResponseInfo businessListingsSearchLive(businessDataBusinessListingsSearchLiveRequestInfo)



‌‌ Business Listings Search API provides results containing information about business entities listed on Google Maps in the specified categories. You will receive the address, contacts, rating, working hours, and other relevant data. The provided results are specific to the selected location (see the List of Locations) settings. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/business_listings/search/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataBusinessListingsSearchLiveRequestInfo> businessDataBusinessListingsSearchLiveRequestInfo = Arrays.asList(); // List<BusinessDataBusinessListingsSearchLiveRequestInfo> | 
    try {
      BusinessDataBusinessListingsSearchLiveResponseInfo result = apiInstance.businessListingsSearchLive(businessDataBusinessListingsSearchLiveRequestInfo);
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
| **businessDataBusinessListingsSearchLiveRequestInfo** | [**List&lt;BusinessDataBusinessListingsSearchLiveRequestInfo&gt;**](BusinessDataBusinessListingsSearchLiveRequestInfo.md)|  | [optional] |

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

<a id="googleHotelInfoLiveAdvanced"></a>
# **googleHotelInfoLiveAdvanced**
> BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo googleHotelInfoLiveAdvanced(businessDataGoogleHotelInfoLiveAdvancedRequestInfo)



‌‌ Google Hotel Info will provide you with structured data available for a specific hotel entity on the Google Hotels platform: such as service description, location details, rating, amenities, reviews, images, prices, and more. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/hotel_info/live/advanced/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo> businessDataGoogleHotelInfoLiveAdvancedRequestInfo = Arrays.asList(); // List<BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo> | 
    try {
      BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo result = apiInstance.googleHotelInfoLiveAdvanced(businessDataGoogleHotelInfoLiveAdvancedRequestInfo);
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
| **businessDataGoogleHotelInfoLiveAdvancedRequestInfo** | [**List&lt;BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo&gt;**](BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo.md)|  | [optional] |

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
> BusinessDataGoogleHotelInfoLiveHtmlResponseInfo googleHotelInfoLiveHtml(businessDataGoogleHotelInfoLiveHtmlRequestInfo)



‌‌ Google Hotel Info will provide you with unstructured HTML data available for a specific hotel entity on the Google Hotels platform: such as service description, location details, rating, amenities, reviews, images, prices, and more. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/hotel_info/live/html/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataGoogleHotelInfoLiveHtmlRequestInfo> businessDataGoogleHotelInfoLiveHtmlRequestInfo = Arrays.asList(); // List<BusinessDataGoogleHotelInfoLiveHtmlRequestInfo> | 
    try {
      BusinessDataGoogleHotelInfoLiveHtmlResponseInfo result = apiInstance.googleHotelInfoLiveHtml(businessDataGoogleHotelInfoLiveHtmlRequestInfo);
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
| **businessDataGoogleHotelInfoLiveHtmlRequestInfo** | [**List&lt;BusinessDataGoogleHotelInfoLiveHtmlRequestInfo&gt;**](BusinessDataGoogleHotelInfoLiveHtmlRequestInfo.md)|  | [optional] |

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

<a id="googleHotelInfoTaskGetAdvanced"></a>
# **googleHotelInfoTaskGetAdvanced**
> BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo googleHotelInfoTaskGetAdvanced(id)



for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/hotel_info/task_get/advanced/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo result = apiInstance.googleHotelInfoTaskGetAdvanced(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo**](BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelInfoTaskGetHtml"></a>
# **googleHotelInfoTaskGetHtml**
> BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo googleHotelInfoTaskGetHtml(id)



for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/hotel_info/task_get/html/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "4fde18dd-ed19-4bc7-914a-2f060d8be9ce"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 7 days to request the results of the task at any time
    try {
      BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo result = apiInstance.googleHotelInfoTaskGetHtml(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 7 days to request the results of the task at any time | |

### Return type

[**BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo**](BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelInfoTaskPost"></a>
# **googleHotelInfoTaskPost**
> BusinessDataGoogleHotelInfoTaskPostResponseInfo googleHotelInfoTaskPost(businessDataGoogleHotelInfoTaskPostRequestInfo)



‌‌ Google Hotel Info will provide you with structured data available for a specific hotel entity on the Google Hotels platform: such as service description, location details, rating, amenities, reviews, images, prices, and more. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/hotel_info/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataGoogleHotelInfoTaskPostRequestInfo> businessDataGoogleHotelInfoTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataGoogleHotelInfoTaskPostRequestInfo> | 
    try {
      BusinessDataGoogleHotelInfoTaskPostResponseInfo result = apiInstance.googleHotelInfoTaskPost(businessDataGoogleHotelInfoTaskPostRequestInfo);
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
| **businessDataGoogleHotelInfoTaskPostRequestInfo** | [**List&lt;BusinessDataGoogleHotelInfoTaskPostRequestInfo&gt;**](BusinessDataGoogleHotelInfoTaskPostRequestInfo.md)|  | [optional] |

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



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/hotel_info/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataGoogleHotelInfoTasksReadyResponseInfo result = apiInstance.googleHotelInfoTasksReady();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelSearchesLive"></a>
# **googleHotelSearchesLive**
> BusinessDataGoogleHotelSearchesLiveResponseInfo googleHotelSearchesLive(businessDataGoogleHotelSearchesLiveRequestInfo)



‌‌ Hotel Searches API provides results containing information about different hotels listed on Google Hotels. The provided results are specific to the selected location (see the List of Locations) and language (see the List of Languages) settings. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/hotel_searches/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataGoogleHotelSearchesLiveRequestInfo> businessDataGoogleHotelSearchesLiveRequestInfo = Arrays.asList(); // List<BusinessDataGoogleHotelSearchesLiveRequestInfo> | 
    try {
      BusinessDataGoogleHotelSearchesLiveResponseInfo result = apiInstance.googleHotelSearchesLive(businessDataGoogleHotelSearchesLiveRequestInfo);
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
| **businessDataGoogleHotelSearchesLiveRequestInfo** | [**List&lt;BusinessDataGoogleHotelSearchesLiveRequestInfo&gt;**](BusinessDataGoogleHotelSearchesLiveRequestInfo.md)|  | [optional] |

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

<a id="googleHotelSearchesTaskGet"></a>
# **googleHotelSearchesTaskGet**
> BusinessDataGoogleHotelSearchesTaskGetResponseInfo googleHotelSearchesTaskGet(id)



for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/hotel_searches/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataGoogleHotelSearchesTaskGetResponseInfo result = apiInstance.googleHotelSearchesTaskGet(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataGoogleHotelSearchesTaskGetResponseInfo**](BusinessDataGoogleHotelSearchesTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleHotelSearchesTaskPost"></a>
# **googleHotelSearchesTaskPost**
> BusinessDataGoogleHotelSearchesTaskPostResponseInfo googleHotelSearchesTaskPost(businessDataGoogleHotelSearchesTaskPostRequestInfo)



‌‌ Hotel Searches API provides results containing information about different hotels listed on Google. The provided results are specific to the keyword, selected location (see the List of Locations) and language (see the List of Languages) settings. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/hotel_searches/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataGoogleHotelSearchesTaskPostRequestInfo> businessDataGoogleHotelSearchesTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataGoogleHotelSearchesTaskPostRequestInfo> | 
    try {
      BusinessDataGoogleHotelSearchesTaskPostResponseInfo result = apiInstance.googleHotelSearchesTaskPost(businessDataGoogleHotelSearchesTaskPostRequestInfo);
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
| **businessDataGoogleHotelSearchesTaskPostRequestInfo** | [**List&lt;BusinessDataGoogleHotelSearchesTaskPostRequestInfo&gt;**](BusinessDataGoogleHotelSearchesTaskPostRequestInfo.md)|  | [optional] |

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



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/hotel_searches/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataGoogleHotelSearchesTasksReadyResponseInfo result = apiInstance.googleHotelSearchesTasksReady();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessInfoTaskGet"></a>
# **googleMyBusinessInfoTaskGet**
> BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo googleMyBusinessInfoTaskGet(id)



for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/my_business_info/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo result = apiInstance.googleMyBusinessInfoTaskGet(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo**](BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessInfoTaskPost"></a>
# **googleMyBusinessInfoTaskPost**
> BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo googleMyBusinessInfoTaskPost(businessDataTaskRequestInfo)



‌‌ Business Data API provides results containing information about specific business entity from Google. The provided results are specific to the selected location (see the List of Locations) and language (see the List of Languages) settings. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/my_business_info/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataTaskRequestInfo> businessDataTaskRequestInfo = Arrays.asList(); // List<BusinessDataTaskRequestInfo> | 
    try {
      BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo result = apiInstance.googleMyBusinessInfoTaskPost(businessDataTaskRequestInfo);
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
| **businessDataTaskRequestInfo** | [**List&lt;BusinessDataTaskRequestInfo&gt;**](BusinessDataTaskRequestInfo.md)|  | [optional] |

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



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/my_business_info/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo result = apiInstance.googleMyBusinessInfoTasksReady();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessUpdatesTaskGet"></a>
# **googleMyBusinessUpdatesTaskGet**
> BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo googleMyBusinessUpdatesTaskGet(id)



for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/my_business_updates/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo result = apiInstance.googleMyBusinessUpdatesTaskGet(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo**](BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMyBusinessUpdatesTaskPost"></a>
# **googleMyBusinessUpdatesTaskPost**
> BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo googleMyBusinessUpdatesTaskPost(businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo)



‌‌ This endpoints provides the latest updates of a specific business entity from Google SERP. The provided results are specific to the selected location (see the List of Locations) and language (see the List of Languages) settings. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/my_business_updates/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo> businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo> | 
    try {
      BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo result = apiInstance.googleMyBusinessUpdatesTaskPost(businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo);
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
| **businessDataGoogleMyBusinessUpdatesTaskPostRequestInfo** | [**List&lt;BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo&gt;**](BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.md)|  | [optional] |

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



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/my_business_updates/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo result = apiInstance.googleMyBusinessUpdatesTasksReady();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleQuestionsAndAnswersLive"></a>
# **googleQuestionsAndAnswersLive**
> BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo googleQuestionsAndAnswersLive(businessDataGoogleQuestionsAndAnswersLiveRequestInfo)



‌‌ This endpoint will provide you with a detailed overview of questions and answers associated with a specific business entity listed on Google My Business. By submitting a request to this endpoint, you can access comprehensive data on the inquiries and responses related to a particular business, including the full text of the questions and answers, as well as metadata such as timestamps, user information.   The provided results are specific to the selected location (see the List of Locations) and language (see the List of Languages) settings.   Your account will be billed for every 20 questions, the maximum number of answers returned for each question is 5. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/questions_and_answers/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo> businessDataGoogleQuestionsAndAnswersLiveRequestInfo = Arrays.asList(); // List<BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo> | 
    try {
      BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo result = apiInstance.googleQuestionsAndAnswersLive(businessDataGoogleQuestionsAndAnswersLiveRequestInfo);
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
| **businessDataGoogleQuestionsAndAnswersLiveRequestInfo** | [**List&lt;BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo&gt;**](BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo.md)|  | [optional] |

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

<a id="googleQuestionsAndAnswersTaskGet"></a>
# **googleQuestionsAndAnswersTaskGet**
> BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo googleQuestionsAndAnswersTaskGet(id)



for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/questions_and_answers/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo result = apiInstance.googleQuestionsAndAnswersTaskGet(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo**](BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleQuestionsAndAnswersTaskPost"></a>
# **googleQuestionsAndAnswersTaskPost**
> BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo googleQuestionsAndAnswersTaskPost(businessDataGoogleQuestionsAndAnswersTaskPostRequestInfo)



‌‌ This endpoint will provide you with a detailed overview of questions and answers associated with a specific business entity listed on Google My Business. By submitting a request to this endpoint, you can access comprehensive data on the inquiries and responses related to a particular business, including the full text of the questions and answers, as well as metadata such as timestamps, user information.   The provided results are specific to the selected location (see the List of Locations) and language (see the List of Languages) settings.   Your account will be billed for every 20 questions, the maximum number of answers returned for each question is 5. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/questions_and_answers/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo> businessDataGoogleQuestionsAndAnswersTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo> | 
    try {
      BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo result = apiInstance.googleQuestionsAndAnswersTaskPost(businessDataGoogleQuestionsAndAnswersTaskPostRequestInfo);
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
| **businessDataGoogleQuestionsAndAnswersTaskPostRequestInfo** | [**List&lt;BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo&gt;**](BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo.md)|  | [optional] |

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



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/questions_and_answers/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo result = apiInstance.googleQuestionsAndAnswersTasksReady();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleReviewsTaskGet"></a>
# **googleReviewsTaskGet**
> BusinessDataGoogleReviewsTaskGetResponseInfo googleReviewsTaskGet(id)



The returned results are specific to the indicated local establishment name, search engine, location and language parameters. We emulate set location and search engine with the highest accuracy so that the results you receive will match the actual search results for the specified parameters at the time of task setting. You can always check the returned results accessing the check_url in the Incognito mode to make sure the received data is entirely relevant. Note that user preferences, search history, and other personalized search factors are ignored by our system and thus would not be reflected in the returned results. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/reviews/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataGoogleReviewsTaskGetResponseInfo result = apiInstance.googleReviewsTaskGet(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataGoogleReviewsTaskGetResponseInfo**](BusinessDataGoogleReviewsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleReviewsTaskPost"></a>
# **googleReviewsTaskPost**
> BusinessDataGoogleReviewsTaskPostResponseInfo googleReviewsTaskPost(businessDataGoogleReviewsTaskPostRequestInfo)



‌‌ This endpoint provides results from the “Reviews” element of Google SERPs. The results are specific to the selected location (see the List of Locations) and language (see the List of Languages) parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/reviews/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataGoogleReviewsTaskPostRequestInfo> businessDataGoogleReviewsTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataGoogleReviewsTaskPostRequestInfo> | 
    try {
      BusinessDataGoogleReviewsTaskPostResponseInfo result = apiInstance.googleReviewsTaskPost(businessDataGoogleReviewsTaskPostRequestInfo);
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
| **businessDataGoogleReviewsTaskPostRequestInfo** | [**List&lt;BusinessDataGoogleReviewsTaskPostRequestInfo&gt;**](BusinessDataGoogleReviewsTaskPostRequestInfo.md)|  | [optional] |

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



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/google/reviews/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataGoogleReviewsTasksReadyResponseInfo result = apiInstance.googleReviewsTasksReady();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="socialMediaFacebookLive"></a>
# **socialMediaFacebookLive**
> BusinessDataSocialMediaFacebookLiveResponseInfo socialMediaFacebookLive(businessDataSocialMediaFacebookLiveRequestInfo)



‌‌ Social Media Facebook API will provide you with the number of likes a certain page received through the Facebook Like button embed. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/social_media/facebook/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataSocialMediaFacebookLiveRequestInfo> businessDataSocialMediaFacebookLiveRequestInfo = Arrays.asList(); // List<BusinessDataSocialMediaFacebookLiveRequestInfo> | 
    try {
      BusinessDataSocialMediaFacebookLiveResponseInfo result = apiInstance.socialMediaFacebookLive(businessDataSocialMediaFacebookLiveRequestInfo);
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
| **businessDataSocialMediaFacebookLiveRequestInfo** | [**List&lt;BusinessDataSocialMediaFacebookLiveRequestInfo&gt;**](BusinessDataSocialMediaFacebookLiveRequestInfo.md)|  | [optional] |

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

<a id="socialMediaPinterestLive"></a>
# **socialMediaPinterestLive**
> BusinessDataSocialMediaPinterestLiveResponseInfo socialMediaPinterestLive(businessDataSocialMediaPinterestLiveRequestInfo)



‌‌ Social Media Pinterest API will provide you with data on pins made from the specified URLs. Pins on Pinterest correspond to content saves. For each specified page URL, you will get the number of content saves to Pinterest made using the Pinterest Save Button placed on that page. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/social_media/pinterest/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataSocialMediaPinterestLiveRequestInfo> businessDataSocialMediaPinterestLiveRequestInfo = Arrays.asList(); // List<BusinessDataSocialMediaPinterestLiveRequestInfo> | 
    try {
      BusinessDataSocialMediaPinterestLiveResponseInfo result = apiInstance.socialMediaPinterestLive(businessDataSocialMediaPinterestLiveRequestInfo);
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
| **businessDataSocialMediaPinterestLiveRequestInfo** | [**List&lt;BusinessDataSocialMediaPinterestLiveRequestInfo&gt;**](BusinessDataSocialMediaPinterestLiveRequestInfo.md)|  | [optional] |

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

<a id="socialMediaRedditLive"></a>
# **socialMediaRedditLive**
> BusinessDataSocialMediaRedditLiveResponseInfo socialMediaRedditLive(businessDataSocialMediaRedditLiveRequestInfo)



Social Media Reddit API provides information for each share of the target webpage on Reddit. For each specified Reddit URL, you will get subreddit and author names, permalink, title, and the number of subreddit members. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/social_media/reddit/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataSocialMediaRedditLiveRequestInfo> businessDataSocialMediaRedditLiveRequestInfo = Arrays.asList(); // List<BusinessDataSocialMediaRedditLiveRequestInfo> | 
    try {
      BusinessDataSocialMediaRedditLiveResponseInfo result = apiInstance.socialMediaRedditLive(businessDataSocialMediaRedditLiveRequestInfo);
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
| **businessDataSocialMediaRedditLiveRequestInfo** | [**List&lt;BusinessDataSocialMediaRedditLiveRequestInfo&gt;**](BusinessDataSocialMediaRedditLiveRequestInfo.md)|  | [optional] |

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

<a id="tripadvisorReviewsTaskGet"></a>
# **tripadvisorReviewsTaskGet**
> BusinessDataTripadvisorReviewsTaskGetResponseInfo tripadvisorReviewsTaskGet(id)



This endpoint provides feedback data on businesses listed on the Tripadvisor platform, including their locations, ratings, review content and count. The results are specific to the URL path indicated in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/tripadvisor/reviews/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataTripadvisorReviewsTaskGetResponseInfo result = apiInstance.tripadvisorReviewsTaskGet(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataTripadvisorReviewsTaskGetResponseInfo**](BusinessDataTripadvisorReviewsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorReviewsTaskPost"></a>
# **tripadvisorReviewsTaskPost**
> BusinessDataTripadvisorReviewsTaskPostResponseInfo tripadvisorReviewsTaskPost(businessDataTripadvisorReviewsTaskPostRequestInfo)



‌‌ This endpoint provides results from the “Reviews” element on the Tripadvisor platform. The results are specific to the URL path or keyword you indicate, and and the selected location (see the List of Locations). for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/tripadvisor/reviews/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataTripadvisorReviewsTaskPostRequestInfo> businessDataTripadvisorReviewsTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataTripadvisorReviewsTaskPostRequestInfo> | 
    try {
      BusinessDataTripadvisorReviewsTaskPostResponseInfo result = apiInstance.tripadvisorReviewsTaskPost(businessDataTripadvisorReviewsTaskPostRequestInfo);
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
| **businessDataTripadvisorReviewsTaskPostRequestInfo** | [**List&lt;BusinessDataTripadvisorReviewsTaskPostRequestInfo&gt;**](BusinessDataTripadvisorReviewsTaskPostRequestInfo.md)|  | [optional] |

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



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/tripadvisor/reviews/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataTripadvisorReviewsTasksReadyResponseInfo result = apiInstance.tripadvisorReviewsTasksReady();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorSearchTaskGet"></a>
# **tripadvisorSearchTaskGet**
> BusinessDataTripadvisorSearchTaskGetResponseInfo tripadvisorSearchTaskGet(id)



This endpoint will provide you with data on businesses listed on the Tripadvisor platform. The results obtained through this endpoint are specific to the location (see the List of Tripadvisor Locations) and keyword parameters used in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/tripadvisor/search/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataTripadvisorSearchTaskGetResponseInfo result = apiInstance.tripadvisorSearchTaskGet(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataTripadvisorSearchTaskGetResponseInfo**](BusinessDataTripadvisorSearchTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tripadvisorSearchTaskPost"></a>
# **tripadvisorSearchTaskPost**
> BusinessDataTripadvisorSearchTaskPostResponseInfo tripadvisorSearchTaskPost(businessDataTripadvisorSearchTaskPostRequestInfo)



‌‌ This endpoint provides a list of business profiles listed on the Tripadvisor platform. The returned results are relevant to the specified keyword and the selected location (see the List of Locations). for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/tripadvisor/search/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataTripadvisorSearchTaskPostRequestInfo> businessDataTripadvisorSearchTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataTripadvisorSearchTaskPostRequestInfo> | 
    try {
      BusinessDataTripadvisorSearchTaskPostResponseInfo result = apiInstance.tripadvisorSearchTaskPost(businessDataTripadvisorSearchTaskPostRequestInfo);
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
| **businessDataTripadvisorSearchTaskPostRequestInfo** | [**List&lt;BusinessDataTripadvisorSearchTaskPostRequestInfo&gt;**](BusinessDataTripadvisorSearchTaskPostRequestInfo.md)|  | [optional] |

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



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/tripadvisor/search/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataTripadvisorSearchTasksReadyResponseInfo result = apiInstance.tripadvisorSearchTasksReady();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="trustpilotReviewsTaskGet"></a>
# **trustpilotReviewsTaskGet**
> BusinessDataTrustpilotReviewsTaskGetResponseInfo trustpilotReviewsTaskGet(id)



This endpoint provides reviews published on the Trustpilot platform The returned results are specific to the indicated business entity. We emulate set parameters with the highest accuracy so that the results you receive will match the actual search results for the specified parameters at the time of task setting. You can always check the returned results accessing the check_url in the Incognito mode to make sure the received data is entirely relevant. Note that user preferences, search history, and other personalized search factors are ignored by our system and thus would not be reflected in the returned results. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/trustpilot/reviews/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataTrustpilotReviewsTaskGetResponseInfo result = apiInstance.trustpilotReviewsTaskGet(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataTrustpilotReviewsTaskGetResponseInfo**](BusinessDataTrustpilotReviewsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="trustpilotReviewsTaskPost"></a>
# **trustpilotReviewsTaskPost**
> BusinessDataTrustpilotReviewsTaskPostResponseInfo trustpilotReviewsTaskPost(businessDataTrustpilotReviewsTaskPostRequestInfo)



‌‌ This endpoint provides reviews published on the Trustpilot platform for the local establishment specified in the domain field. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/trustpilot/reviews/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataTrustpilotReviewsTaskPostRequestInfo> businessDataTrustpilotReviewsTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataTrustpilotReviewsTaskPostRequestInfo> | 
    try {
      BusinessDataTrustpilotReviewsTaskPostResponseInfo result = apiInstance.trustpilotReviewsTaskPost(businessDataTrustpilotReviewsTaskPostRequestInfo);
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
| **businessDataTrustpilotReviewsTaskPostRequestInfo** | [**List&lt;BusinessDataTrustpilotReviewsTaskPostRequestInfo&gt;**](BusinessDataTrustpilotReviewsTaskPostRequestInfo.md)|  | [optional] |

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



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/trustpilot/reviews/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataTrustpilotReviewsTasksReadyResponseInfo result = apiInstance.trustpilotReviewsTasksReady();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="trustpilotSearchTaskGet"></a>
# **trustpilotSearchTaskGet**
> BusinessDataTrustpilotSearchTaskGetResponseInfo trustpilotSearchTaskGet(id)



This endpoint provides a list of business profiles listed on the Trustpilot platform. The returned results are relevant to the keyword specified in a POST request. We emulate set parameters with the highest accuracy so that the results you receive match the actual search results for the specified parameters at the time of task setting. You can always check the returned results accessing the check_url in the Incognito mode to make sure the received data is entirely relevant. Note that user preferences, search history, and other personalized search factors are ignored by our system and thus will not be reflected in the returned results. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/trustpilot/search/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataTrustpilotSearchTaskGetResponseInfo result = apiInstance.trustpilotSearchTaskGet(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataTrustpilotSearchTaskGetResponseInfo**](BusinessDataTrustpilotSearchTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="trustpilotSearchTaskPost"></a>
# **trustpilotSearchTaskPost**
> BusinessDataTrustpilotSearchTaskPostResponseInfo trustpilotSearchTaskPost(businessDataTrustpilotSearchTaskPostRequestInfo)



‌‌ This endpoint provides a list of business profiles listed on the Trustpilot platform. The returned results are relevant to the specified keyword. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/trustpilot/search/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataTrustpilotSearchTaskPostRequestInfo> businessDataTrustpilotSearchTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataTrustpilotSearchTaskPostRequestInfo> | 
    try {
      BusinessDataTrustpilotSearchTaskPostResponseInfo result = apiInstance.trustpilotSearchTaskPost(businessDataTrustpilotSearchTaskPostRequestInfo);
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
| **businessDataTrustpilotSearchTaskPostRequestInfo** | [**List&lt;BusinessDataTrustpilotSearchTaskPostRequestInfo&gt;**](BusinessDataTrustpilotSearchTaskPostRequestInfo.md)|  | [optional] |

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



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/trustpilot/search/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataTrustpilotSearchTasksReadyResponseInfo result = apiInstance.trustpilotSearchTasksReady();
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yelpReviewsTaskGet"></a>
# **yelpReviewsTaskGet**
> BusinessDataYelpReviewsTaskGetResponseInfo yelpReviewsTaskGet(id)



This endpoint provides reviews published on the Yelp platform. The results are specific to the selected alias and language parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/yelp/reviews/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataYelpReviewsTaskGetResponseInfo result = apiInstance.yelpReviewsTaskGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#yelpReviewsTaskGet");
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
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataYelpReviewsTaskGetResponseInfo**](BusinessDataYelpReviewsTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yelpReviewsTaskPost"></a>
# **yelpReviewsTaskPost**
> BusinessDataYelpReviewsTaskPostResponseInfo yelpReviewsTaskPost(businessDataYelpReviewsTaskPostRequestInfo)



‌‌ This endpoint provides reviews published on the Yelp platform. The results are specific to the selected alias and language (see the List of Languages) parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/yelp/reviews/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataYelpReviewsTaskPostRequestInfo> businessDataYelpReviewsTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataYelpReviewsTaskPostRequestInfo> | 
    try {
      BusinessDataYelpReviewsTaskPostResponseInfo result = apiInstance.yelpReviewsTaskPost(businessDataYelpReviewsTaskPostRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#yelpReviewsTaskPost");
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
| **businessDataYelpReviewsTaskPostRequestInfo** | [**List&lt;BusinessDataYelpReviewsTaskPostRequestInfo&gt;**](BusinessDataYelpReviewsTaskPostRequestInfo.md)|  | [optional] |

### Return type

[**BusinessDataYelpReviewsTaskPostResponseInfo**](BusinessDataYelpReviewsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yelpReviewsTasksReady"></a>
# **yelpReviewsTasksReady**
> BusinessDataYelpReviewsTasksReadyResponseInfo yelpReviewsTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/yelp/reviews/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataYelpReviewsTasksReadyResponseInfo result = apiInstance.yelpReviewsTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#yelpReviewsTasksReady");
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

[**BusinessDataYelpReviewsTasksReadyResponseInfo**](BusinessDataYelpReviewsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yelpSearchTaskGet"></a>
# **yelpSearchTaskGet**
> BusinessDataYelpSearchTaskGetResponseInfo yelpSearchTaskGet(id)



This endpoint will provide you with data on businesses listed on the Yelp platform. The results obtained through this endpoint are specific to the location (see the List of Yelp Locations) and keyword parameters used in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/yelp/search/task_get/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      BusinessDataYelpSearchTaskGetResponseInfo result = apiInstance.yelpSearchTaskGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#yelpSearchTaskGet");
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
| **id** | **String**| task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time | |

### Return type

[**BusinessDataYelpSearchTaskGetResponseInfo**](BusinessDataYelpSearchTaskGetResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yelpSearchTaskPost"></a>
# **yelpSearchTaskPost**
> BusinessDataYelpSearchTaskPostResponseInfo yelpSearchTaskPost(businessDataYelpSearchTaskPostRequestInfo)



‌‌ By using this endpoint you can request data on businesses listed on the Yelp platform. The results will be specific to the location (see the List of Yelp Locations) and keyword parameters used in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/yelp/search/task_post/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    List<BusinessDataYelpSearchTaskPostRequestInfo> businessDataYelpSearchTaskPostRequestInfo = Arrays.asList(); // List<BusinessDataYelpSearchTaskPostRequestInfo> | 
    try {
      BusinessDataYelpSearchTaskPostResponseInfo result = apiInstance.yelpSearchTaskPost(businessDataYelpSearchTaskPostRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#yelpSearchTaskPost");
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
| **businessDataYelpSearchTaskPostRequestInfo** | [**List&lt;BusinessDataYelpSearchTaskPostRequestInfo&gt;**](BusinessDataYelpSearchTaskPostRequestInfo.md)|  | [optional] |

### Return type

[**BusinessDataYelpSearchTaskPostResponseInfo**](BusinessDataYelpSearchTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yelpSearchTasksReady"></a>
# **yelpSearchTasksReady**
> BusinessDataYelpSearchTasksReadyResponseInfo yelpSearchTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you don’t use the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/business_data/yelp/search/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BusinessDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
    try {
      BusinessDataYelpSearchTasksReadyResponseInfo result = apiInstance.yelpSearchTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessDataApi#yelpSearchTasksReady");
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

[**BusinessDataYelpSearchTasksReadyResponseInfo**](BusinessDataYelpSearchTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


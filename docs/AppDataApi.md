# AppDataApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appDataAppleLanguages**](AppDataApi.md#appDataAppleLanguages) | **GET** /v3/app_data/apple/languages |  |
| [**appDataAppleLocations**](AppDataApi.md#appDataAppleLocations) | **GET** /v3/app_data/apple/locations |  |
| [**appDataErrors**](AppDataApi.md#appDataErrors) | **POST** /v3/app_data/errors |  |
| [**appDataGoogleLanguages**](AppDataApi.md#appDataGoogleLanguages) | **GET** /v3/app_data/google/languages |  |
| [**appDataGoogleLocations**](AppDataApi.md#appDataGoogleLocations) | **GET** /v3/app_data/google/locations |  |
| [**appDataGoogleLocationsCountry**](AppDataApi.md#appDataGoogleLocationsCountry) | **GET** /v3/app_data/google/locations/{country} |  |
| [**appDataIdList**](AppDataApi.md#appDataIdList) | **POST** /v3/app_data/id_list |  |
| [**appDataTasksReady**](AppDataApi.md#appDataTasksReady) | **GET** /v3/app_data/tasks_ready |  |
| [**appleAppInfoTaskGetAdvanced**](AppDataApi.md#appleAppInfoTaskGetAdvanced) | **GET** /v3/app_data/apple/app_info/task_get/advanced/{id} |  |
| [**appleAppInfoTaskPost**](AppDataApi.md#appleAppInfoTaskPost) | **POST** /v3/app_data/apple/app_info/task_post |  |
| [**appleAppInfoTasksReady**](AppDataApi.md#appleAppInfoTasksReady) | **GET** /v3/app_data/apple/app_info/tasks_ready |  |
| [**appleAppListTaskGetAdvanced**](AppDataApi.md#appleAppListTaskGetAdvanced) | **GET** /v3/app_data/apple/app_list/task_get/advanced/{id} |  |
| [**appleAppListTaskPost**](AppDataApi.md#appleAppListTaskPost) | **POST** /v3/app_data/apple/app_list/task_post |  |
| [**appleAppListTasksReady**](AppDataApi.md#appleAppListTasksReady) | **GET** /v3/app_data/apple/app_list/tasks_ready |  |
| [**appleAppListingsCategories**](AppDataApi.md#appleAppListingsCategories) | **GET** /v3/app_data/apple/app_listings/categories |  |
| [**appleAppListingsSearchLive**](AppDataApi.md#appleAppListingsSearchLive) | **POST** /v3/app_data/apple/app_listings/search/live |  |
| [**appleAppReviewsTaskGetAdvanced**](AppDataApi.md#appleAppReviewsTaskGetAdvanced) | **GET** /v3/app_data/apple/app_reviews/task_get/advanced/{id} |  |
| [**appleAppReviewsTaskPost**](AppDataApi.md#appleAppReviewsTaskPost) | **POST** /v3/app_data/apple/app_reviews/task_post |  |
| [**appleAppReviewsTasksReady**](AppDataApi.md#appleAppReviewsTasksReady) | **GET** /v3/app_data/apple/app_reviews/tasks_ready |  |
| [**appleAppSearchesTaskGetAdvanced**](AppDataApi.md#appleAppSearchesTaskGetAdvanced) | **GET** /v3/app_data/apple/app_searches/task_get/advanced/{id} |  |
| [**appleAppSearchesTaskPost**](AppDataApi.md#appleAppSearchesTaskPost) | **POST** /v3/app_data/apple/app_searches/task_post |  |
| [**appleAppSearchesTasksReady**](AppDataApi.md#appleAppSearchesTasksReady) | **GET** /v3/app_data/apple/app_searches/tasks_ready |  |
| [**appleCategories**](AppDataApi.md#appleCategories) | **GET** /v3/app_data/apple/categories |  |
| [**googleAppInfoTaskGetAdvanced**](AppDataApi.md#googleAppInfoTaskGetAdvanced) | **GET** /v3/app_data/google/app_info/task_get/advanced/{id} |  |
| [**googleAppInfoTaskGetHtml**](AppDataApi.md#googleAppInfoTaskGetHtml) | **GET** /v3/app_data/google/app_info/task_get/html/{id} |  |
| [**googleAppInfoTaskPost**](AppDataApi.md#googleAppInfoTaskPost) | **POST** /v3/app_data/google/app_info/task_post |  |
| [**googleAppInfoTasksReady**](AppDataApi.md#googleAppInfoTasksReady) | **GET** /v3/app_data/google/app_info/tasks_ready |  |
| [**googleAppListTaskGetAdvanced**](AppDataApi.md#googleAppListTaskGetAdvanced) | **GET** /v3/app_data/google/app_list/task_get/advanced/{id} |  |
| [**googleAppListTaskGetHtml**](AppDataApi.md#googleAppListTaskGetHtml) | **GET** /v3/app_data/google/app_list/task_get/html/{id} |  |
| [**googleAppListTaskPost**](AppDataApi.md#googleAppListTaskPost) | **POST** /v3/app_data/google/app_list/task_post |  |
| [**googleAppListTasksReady**](AppDataApi.md#googleAppListTasksReady) | **GET** /v3/app_data/google/app_list/tasks_ready |  |
| [**googleAppListingsCategories**](AppDataApi.md#googleAppListingsCategories) | **GET** /v3/app_data/google/app_listings/categories |  |
| [**googleAppListingsSearchLive**](AppDataApi.md#googleAppListingsSearchLive) | **POST** /v3/app_data/google/app_listings/search/live |  |
| [**googleAppReviewsTaskGetAdvanced**](AppDataApi.md#googleAppReviewsTaskGetAdvanced) | **GET** /v3/app_data/google/app_reviews/task_get/advanced/{id} |  |
| [**googleAppReviewsTaskGetHtml**](AppDataApi.md#googleAppReviewsTaskGetHtml) | **GET** /v3/app_data/google/app_reviews/task_get/html/{id} |  |
| [**googleAppReviewsTaskPost**](AppDataApi.md#googleAppReviewsTaskPost) | **POST** /v3/app_data/google/app_reviews/task_post |  |
| [**googleAppReviewsTasksReady**](AppDataApi.md#googleAppReviewsTasksReady) | **GET** /v3/app_data/google/app_reviews/tasks_ready |  |
| [**googleAppSearchesTaskGetAdvanced**](AppDataApi.md#googleAppSearchesTaskGetAdvanced) | **GET** /v3/app_data/google/app_searches/task_get/advanced/{id} |  |
| [**googleAppSearchesTaskGetHtml**](AppDataApi.md#googleAppSearchesTaskGetHtml) | **GET** /v3/app_data/google/app_searches/task_get/html/{id} |  |
| [**googleAppSearchesTaskPost**](AppDataApi.md#googleAppSearchesTaskPost) | **POST** /v3/app_data/google/app_searches/task_post |  |
| [**googleAppSearchesTasksReady**](AppDataApi.md#googleAppSearchesTasksReady) | **GET** /v3/app_data/google/app_searches/tasks_ready |  |
| [**googleCategories**](AppDataApi.md#googleCategories) | **GET** /v3/app_data/google/categories |  |


<a id="appDataAppleLanguages"></a>
# **appDataAppleLanguages**
> AppDataAppleLanguagesResponseInfo appDataAppleLanguages()



By calling this endpoint you will receive the list of Apple languages supported in App Data API. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/languages/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataAppleLanguagesResponseInfo result = apiInstance.appDataAppleLanguages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appDataAppleLanguages");
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

[**AppDataAppleLanguagesResponseInfo**](AppDataAppleLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appDataAppleLocations"></a>
# **appDataAppleLocations**
> AppDataAppleLocationsResponseInfo appDataAppleLocations()



By calling this endpoint you will receive the list of Apple locations supported in App Data API. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/locations/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataAppleLocationsResponseInfo result = apiInstance.appDataAppleLocations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appDataAppleLocations");
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

[**AppDataAppleLocationsResponseInfo**](AppDataAppleLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appDataErrors"></a>
# **appDataErrors**
> AppDataErrorsResponseInfo appDataErrors(appDataErrorsRequestInfo)



By calling this endpoint you will receive information about the App Data API tasks that returned an error within the past 7 days. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/errors/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataErrorsRequestInfo> appDataErrorsRequestInfo = Arrays.asList(); // List<AppDataErrorsRequestInfo> | 
    try {
      AppDataErrorsResponseInfo result = apiInstance.appDataErrors(appDataErrorsRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appDataErrors");
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
| **appDataErrorsRequestInfo** | [**List&lt;AppDataErrorsRequestInfo&gt;**](AppDataErrorsRequestInfo.md)|  | [optional] |

### Return type

[**AppDataErrorsResponseInfo**](AppDataErrorsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appDataGoogleLanguages"></a>
# **appDataGoogleLanguages**
> AppDataGoogleLanguagesResponseInfo appDataGoogleLanguages()



By calling this endpoint you will receive the list of Google languages supported in App Data API. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/languages/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataGoogleLanguagesResponseInfo result = apiInstance.appDataGoogleLanguages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appDataGoogleLanguages");
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

[**AppDataGoogleLanguagesResponseInfo**](AppDataGoogleLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appDataGoogleLocations"></a>
# **appDataGoogleLocations**
> AppDataGoogleLocationsResponseInfo appDataGoogleLocations()



By calling this endpoint you will receive the list of Google locations supported in App Data API. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/locations/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataGoogleLocationsResponseInfo result = apiInstance.appDataGoogleLocations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appDataGoogleLocations");
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

[**AppDataGoogleLocationsResponseInfo**](AppDataGoogleLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appDataGoogleLocationsCountry"></a>
# **appDataGoogleLocationsCountry**
> AppDataGoogleLocationsCountryResponseInfo appDataGoogleLocationsCountry(country)



By calling this endpoint you will receive the list of Google locations supported in App Data API. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/locations/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String country = "us"; // String | country ISO code optional field specify the ISO code if you want to filter the list of locations by country example: us
    try {
      AppDataGoogleLocationsCountryResponseInfo result = apiInstance.appDataGoogleLocationsCountry(country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appDataGoogleLocationsCountry");
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

[**AppDataGoogleLocationsCountryResponseInfo**](AppDataGoogleLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appDataIdList"></a>
# **appDataIdList**
> AppDataIdListResponseInfo appDataIdList(appDataIdListRequestInfo)



This endpoint is designed to provide you with the list of IDs and metadata of the completed App Data tasks during the specified period. You will get all task IDs that were made including successful, uncompleted, and tasks that responded as errors. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/id_list/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataIdListRequestInfo> appDataIdListRequestInfo = Arrays.asList(); // List<AppDataIdListRequestInfo> | 
    try {
      AppDataIdListResponseInfo result = apiInstance.appDataIdList(appDataIdListRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appDataIdList");
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
| **appDataIdListRequestInfo** | [**List&lt;AppDataIdListRequestInfo&gt;**](AppDataIdListRequestInfo.md)|  | [optional] |

### Return type

[**AppDataIdListResponseInfo**](AppDataIdListResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appDataTasksReady"></a>
# **appDataTasksReady**
> AppDataTasksReadyResponseInfo appDataTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with a list of completed tasks that haven’t been collected yet. If you use the Standard method without specifying the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_searches/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataTasksReadyResponseInfo result = apiInstance.appDataTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appDataTasksReady");
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

[**AppDataTasksReadyResponseInfo**](AppDataTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppInfoTaskGetAdvanced"></a>
# **appleAppInfoTaskGetAdvanced**
> AppDataAppleAppInfoTaskGetAdvancedResponseInfo appleAppInfoTaskGetAdvanced(id)



This endpoint will provide you with information about the mobile application specified in a POST request. You will receive its ID, icon, description, reviews count, rating, images, and other data. The results are specific to the app_id parameter specified in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_info/task_get/advanced/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "b3dcf205-7143-4f6d-9589-e0094fd966b9"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      AppDataAppleAppInfoTaskGetAdvancedResponseInfo result = apiInstance.appleAppInfoTaskGetAdvanced(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppInfoTaskGetAdvanced");
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

[**AppDataAppleAppInfoTaskGetAdvancedResponseInfo**](AppDataAppleAppInfoTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppInfoTaskPost"></a>
# **appleAppInfoTaskPost**
> AppDataAppleAppInfoTaskPostResponseInfo appleAppInfoTaskPost(appDataAppleAppInfoTaskPostRequestInfo)



‌‌ This endpoint will provide you with information about the App Store application specified in the app_id field of the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_info/task_post/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataAppleAppInfoTaskPostRequestInfo> appDataAppleAppInfoTaskPostRequestInfo = Arrays.asList(); // List<AppDataAppleAppInfoTaskPostRequestInfo> | 
    try {
      AppDataAppleAppInfoTaskPostResponseInfo result = apiInstance.appleAppInfoTaskPost(appDataAppleAppInfoTaskPostRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppInfoTaskPost");
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
| **appDataAppleAppInfoTaskPostRequestInfo** | [**List&lt;AppDataAppleAppInfoTaskPostRequestInfo&gt;**](AppDataAppleAppInfoTaskPostRequestInfo.md)|  | [optional] |

### Return type

[**AppDataAppleAppInfoTaskPostResponseInfo**](AppDataAppleAppInfoTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppInfoTasksReady"></a>
# **appleAppInfoTasksReady**
> AppDataAppleAppInfoTasksReadyResponseInfo appleAppInfoTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with a list of completed tasks that haven’t been collected yet. If you use the Standard method without specifying the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_info/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataAppleAppInfoTasksReadyResponseInfo result = apiInstance.appleAppInfoTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppInfoTasksReady");
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

[**AppDataAppleAppInfoTasksReadyResponseInfo**](AppDataAppleAppInfoTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppListTaskGetAdvanced"></a>
# **appleAppListTaskGetAdvanced**
> AppDataAppleAppListTaskGetAdvancedResponseInfo appleAppListTaskGetAdvanced(id)



This endpoint will provide you with a list of applications published in the top app charts on the App Store platform, including app IDs, ratings, prices, titles, and more. The results are specific to the app_collection as well as the location and language parameters specified in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_list/task_get/advanced/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "e0958be6-9041-4ce5-96f2-698ef25cfe2c"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      AppDataAppleAppListTaskGetAdvancedResponseInfo result = apiInstance.appleAppListTaskGetAdvanced(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppListTaskGetAdvanced");
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

[**AppDataAppleAppListTaskGetAdvancedResponseInfo**](AppDataAppleAppListTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppListTaskPost"></a>
# **appleAppListTaskPost**
> AppDataAppleAppListTaskPostResponseInfo appleAppListTaskPost(appDataAppleAppListTaskPostRequestInfo)



‌‌ This endpoint will provide you with a list of mobile applications published in the top app charts on the App Store platform. The returned results are specific to the app collection as well as the language and location parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_list/task_post/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataAppleAppListTaskPostRequestInfo> appDataAppleAppListTaskPostRequestInfo = Arrays.asList(); // List<AppDataAppleAppListTaskPostRequestInfo> | 
    try {
      AppDataAppleAppListTaskPostResponseInfo result = apiInstance.appleAppListTaskPost(appDataAppleAppListTaskPostRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppListTaskPost");
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
| **appDataAppleAppListTaskPostRequestInfo** | [**List&lt;AppDataAppleAppListTaskPostRequestInfo&gt;**](AppDataAppleAppListTaskPostRequestInfo.md)|  | [optional] |

### Return type

[**AppDataAppleAppListTaskPostResponseInfo**](AppDataAppleAppListTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppListTasksReady"></a>
# **appleAppListTasksReady**
> AppDataAppleAppListTasksReadyResponseInfo appleAppListTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with a list of completed tasks that haven’t been collected yet. If you use the Standard method without specifying the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_list/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataAppleAppListTasksReadyResponseInfo result = apiInstance.appleAppListTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppListTasksReady");
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

[**AppDataAppleAppListTasksReadyResponseInfo**](AppDataAppleAppListTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppListingsCategories"></a>
# **appleAppListingsCategories**
> AppDataAppleAppListingsCategoriesResponseInfo appleAppListingsCategories()



This endpoint will provide you with a full list of app categories available on Apple App Store. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_listings/categories/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataAppleAppListingsCategoriesResponseInfo result = apiInstance.appleAppListingsCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppListingsCategories");
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

[**AppDataAppleAppListingsCategoriesResponseInfo**](AppDataAppleAppListingsCategoriesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppListingsSearchLive"></a>
# **appleAppListingsSearchLive**
> AppDataAppleAppListingsSearchLiveResponseInfo appleAppListingsSearchLive(appDataAppleAppListingsSearchLiveRequestInfo)



This endpoint will provide you with a list of apps published on App Store along with additional information: its ID, icon, reviews count, rating, price, and other data. The results are specific to the title, description, and categories parameters specified in the API request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_listings/search/live/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataAppleAppListingsSearchLiveRequestInfo> appDataAppleAppListingsSearchLiveRequestInfo = Arrays.asList(); // List<AppDataAppleAppListingsSearchLiveRequestInfo> | 
    try {
      AppDataAppleAppListingsSearchLiveResponseInfo result = apiInstance.appleAppListingsSearchLive(appDataAppleAppListingsSearchLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppListingsSearchLive");
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
| **appDataAppleAppListingsSearchLiveRequestInfo** | [**List&lt;AppDataAppleAppListingsSearchLiveRequestInfo&gt;**](AppDataAppleAppListingsSearchLiveRequestInfo.md)|  | [optional] |

### Return type

[**AppDataAppleAppListingsSearchLiveResponseInfo**](AppDataAppleAppListingsSearchLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppReviewsTaskGetAdvanced"></a>
# **appleAppReviewsTaskGetAdvanced**
> AppDataAppleAppReviewsTaskGetAdvancedResponseInfo appleAppReviewsTaskGetAdvanced(id)



This endpoint will provide you with feedback data on applications listed on the App Store platform, including review ratings, review content, user profile info of each reviewer, review publication dates, and more. The results are specific to the app_id as well as the location and language parameters specified in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_reviews/task_get/advanced/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "481a8f6d-caa3-4550-8926-a1ed6c8c0845"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      AppDataAppleAppReviewsTaskGetAdvancedResponseInfo result = apiInstance.appleAppReviewsTaskGetAdvanced(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppReviewsTaskGetAdvanced");
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

[**AppDataAppleAppReviewsTaskGetAdvancedResponseInfo**](AppDataAppleAppReviewsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppReviewsTaskPost"></a>
# **appleAppReviewsTaskPost**
> AppDataAppleAppReviewsTaskPostResponseInfo appleAppReviewsTaskPost(appDataAppleAppReviewsTaskPostRequestInfo)



‌‌ This endpoint will provide you with reviews published on the App Store platform for the app specified in the app_id field. The returned results are specific to the indicated language and location parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_reviews/task_post/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataAppleAppReviewsTaskPostRequestInfo> appDataAppleAppReviewsTaskPostRequestInfo = Arrays.asList(); // List<AppDataAppleAppReviewsTaskPostRequestInfo> | 
    try {
      AppDataAppleAppReviewsTaskPostResponseInfo result = apiInstance.appleAppReviewsTaskPost(appDataAppleAppReviewsTaskPostRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppReviewsTaskPost");
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
| **appDataAppleAppReviewsTaskPostRequestInfo** | [**List&lt;AppDataAppleAppReviewsTaskPostRequestInfo&gt;**](AppDataAppleAppReviewsTaskPostRequestInfo.md)|  | [optional] |

### Return type

[**AppDataAppleAppReviewsTaskPostResponseInfo**](AppDataAppleAppReviewsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppReviewsTasksReady"></a>
# **appleAppReviewsTasksReady**
> AppDataAppleAppReviewsTasksReadyResponseInfo appleAppReviewsTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with a list of completed tasks that haven’t been collected yet. If you use the Standard method without specifying the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_reviews/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataAppleAppReviewsTasksReadyResponseInfo result = apiInstance.appleAppReviewsTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppReviewsTasksReady");
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

[**AppDataAppleAppReviewsTasksReadyResponseInfo**](AppDataAppleAppReviewsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppSearchesTaskGetAdvanced"></a>
# **appleAppSearchesTaskGetAdvanced**
> AppDataAppleAppSearchesTaskGetAdvancedResponseInfo appleAppSearchesTaskGetAdvanced(id)



This endpoint will provide you with a list of apps ranking on the App Store for the keyword specified in a POST request. You will also receive additional information about each application: its ID, icon, reviews count, rating, price, and other data. The results are specific to the keyword as well as location and language parameters specified in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_searches/task_get/advanced/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "ce9f6344-2e3f-4e04-a7c2-d5c0d1a8906c"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      AppDataAppleAppSearchesTaskGetAdvancedResponseInfo result = apiInstance.appleAppSearchesTaskGetAdvanced(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppSearchesTaskGetAdvanced");
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

[**AppDataAppleAppSearchesTaskGetAdvancedResponseInfo**](AppDataAppleAppSearchesTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppSearchesTaskPost"></a>
# **appleAppSearchesTaskPost**
> AppDataAppleAppSearchesTaskPostResponseInfo appleAppSearchesTaskPost(appDataAppleAppSearchesTaskPostRequestInfo)



‌‌ This endpoint will provide you with a list of apps ranking on the App Store for the specified keyword. The returned results are specific to the indicated keyword, as well as the location and language parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_searches/task_post/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataAppleAppSearchesTaskPostRequestInfo> appDataAppleAppSearchesTaskPostRequestInfo = Arrays.asList(); // List<AppDataAppleAppSearchesTaskPostRequestInfo> | 
    try {
      AppDataAppleAppSearchesTaskPostResponseInfo result = apiInstance.appleAppSearchesTaskPost(appDataAppleAppSearchesTaskPostRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppSearchesTaskPost");
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
| **appDataAppleAppSearchesTaskPostRequestInfo** | [**List&lt;AppDataAppleAppSearchesTaskPostRequestInfo&gt;**](AppDataAppleAppSearchesTaskPostRequestInfo.md)|  | [optional] |

### Return type

[**AppDataAppleAppSearchesTaskPostResponseInfo**](AppDataAppleAppSearchesTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppSearchesTasksReady"></a>
# **appleAppSearchesTasksReady**
> AppDataAppleAppSearchesTasksReadyResponseInfo appleAppSearchesTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with a list of completed tasks that haven’t been collected yet. If you use the Standard method without specifying the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/app_searches/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataAppleAppSearchesTasksReadyResponseInfo result = apiInstance.appleAppSearchesTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleAppSearchesTasksReady");
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

[**AppDataAppleAppSearchesTasksReadyResponseInfo**](AppDataAppleAppSearchesTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleCategories"></a>
# **appleCategories**
> AppDataAppleCategoriesResponseInfo appleCategories()



This endpoint will provide you with a full list of app categories available on App Store. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/apple/categories/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataAppleCategoriesResponseInfo result = apiInstance.appleCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleCategories");
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

[**AppDataAppleCategoriesResponseInfo**](AppDataAppleCategoriesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppInfoTaskGetAdvanced"></a>
# **googleAppInfoTaskGetAdvanced**
> AppDataGoogleAppInfoTaskGetAdvancedResponseInfo googleAppInfoTaskGetAdvanced(id)



This endpoint will provide you with information about the mobile application specified in a POST request. You will receive its ID, icon, description, reviews count, rating, number of installs, images, and other data. The results are specific to the app_id parameter specified in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_info/task_get/advanced/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "779b1038-69a7-4f4a-94e8-dee2ee6a16fa"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      AppDataGoogleAppInfoTaskGetAdvancedResponseInfo result = apiInstance.googleAppInfoTaskGetAdvanced(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppInfoTaskGetAdvanced");
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

[**AppDataGoogleAppInfoTaskGetAdvancedResponseInfo**](AppDataGoogleAppInfoTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppInfoTaskGetHtml"></a>
# **googleAppInfoTaskGetHtml**
> AppDataGoogleAppInfoTaskGetHtmlResponseInfo googleAppInfoTaskGetHtml(id)



Description of the fields for sending a request: for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_info/task_get/html/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "ee862562-6bb2-4db0-9c63-f099faad2567"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 7 days to request the results of the task at any time
    try {
      AppDataGoogleAppInfoTaskGetHtmlResponseInfo result = apiInstance.googleAppInfoTaskGetHtml(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppInfoTaskGetHtml");
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

[**AppDataGoogleAppInfoTaskGetHtmlResponseInfo**](AppDataGoogleAppInfoTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppInfoTaskPost"></a>
# **googleAppInfoTaskPost**
> AppDataGoogleAppInfoTaskPostResponseInfo googleAppInfoTaskPost(appDataGoogleAppInfoTaskPostRequestInfo)



‌‌ This endpoint will provide you with information about the Google Play application specified in the app_id field of the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_info/task_post/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataGoogleAppInfoTaskPostRequestInfo> appDataGoogleAppInfoTaskPostRequestInfo = Arrays.asList(); // List<AppDataGoogleAppInfoTaskPostRequestInfo> | 
    try {
      AppDataGoogleAppInfoTaskPostResponseInfo result = apiInstance.googleAppInfoTaskPost(appDataGoogleAppInfoTaskPostRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppInfoTaskPost");
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
| **appDataGoogleAppInfoTaskPostRequestInfo** | [**List&lt;AppDataGoogleAppInfoTaskPostRequestInfo&gt;**](AppDataGoogleAppInfoTaskPostRequestInfo.md)|  | [optional] |

### Return type

[**AppDataGoogleAppInfoTaskPostResponseInfo**](AppDataGoogleAppInfoTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppInfoTasksReady"></a>
# **googleAppInfoTasksReady**
> AppDataGoogleAppInfoTasksReadyResponseInfo googleAppInfoTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with a list of completed tasks that haven’t been collected yet. If you use the Standard method without specifying the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_info/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataGoogleAppInfoTasksReadyResponseInfo result = apiInstance.googleAppInfoTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppInfoTasksReady");
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

[**AppDataGoogleAppInfoTasksReadyResponseInfo**](AppDataGoogleAppInfoTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListTaskGetAdvanced"></a>
# **googleAppListTaskGetAdvanced**
> AppDataGoogleAppListTaskGetAdvancedResponseInfo googleAppListTaskGetAdvanced(id)



This endpoint will provide you with a list of applications published in the top charts on the Google Play platform, including app IDs, ratings, prices, titles, and more. The results are specific to the app_collection as well as the location and language parameters specified in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_list/task_get/advanced/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "f9f0bbbe-0c73-4d63-a01e-59caf1fa9f34"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      AppDataGoogleAppListTaskGetAdvancedResponseInfo result = apiInstance.googleAppListTaskGetAdvanced(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppListTaskGetAdvanced");
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

[**AppDataGoogleAppListTaskGetAdvancedResponseInfo**](AppDataGoogleAppListTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListTaskGetHtml"></a>
# **googleAppListTaskGetHtml**
> AppDataGoogleAppListTaskGetHtmlResponseInfo googleAppListTaskGetHtml(id)



Description of the fields for sending a request: for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_list/task_get/html/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "36af0481-c859-46e2-a03f-44a255307416"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 7 days to request the results of the task at any time
    try {
      AppDataGoogleAppListTaskGetHtmlResponseInfo result = apiInstance.googleAppListTaskGetHtml(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppListTaskGetHtml");
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

[**AppDataGoogleAppListTaskGetHtmlResponseInfo**](AppDataGoogleAppListTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListTaskPost"></a>
# **googleAppListTaskPost**
> AppDataGoogleAppListTaskPostResponseInfo googleAppListTaskPost(appDataGoogleAppListTaskPostRequestInfo)



‌‌ This endpoint will provide you with a list of mobile applications published in the top charts on the Google Play platform. The returned results are specific to the app collection as well as the the language and location parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_list/task_post/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataGoogleAppListTaskPostRequestInfo> appDataGoogleAppListTaskPostRequestInfo = Arrays.asList(); // List<AppDataGoogleAppListTaskPostRequestInfo> | 
    try {
      AppDataGoogleAppListTaskPostResponseInfo result = apiInstance.googleAppListTaskPost(appDataGoogleAppListTaskPostRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppListTaskPost");
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
| **appDataGoogleAppListTaskPostRequestInfo** | [**List&lt;AppDataGoogleAppListTaskPostRequestInfo&gt;**](AppDataGoogleAppListTaskPostRequestInfo.md)|  | [optional] |

### Return type

[**AppDataGoogleAppListTaskPostResponseInfo**](AppDataGoogleAppListTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListTasksReady"></a>
# **googleAppListTasksReady**
> AppDataGoogleAppListTasksReadyResponseInfo googleAppListTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with a list of completed tasks that haven’t been collected yet. If you use the Standard method without specifying the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_list/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataGoogleAppListTasksReadyResponseInfo result = apiInstance.googleAppListTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppListTasksReady");
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

[**AppDataGoogleAppListTasksReadyResponseInfo**](AppDataGoogleAppListTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListingsCategories"></a>
# **googleAppListingsCategories**
> AppDataGoogleAppListingsCategoriesResponseInfo googleAppListingsCategories()



This endpoint will provide you with a full list of app categories available on Google Play. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_listings/categories/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataGoogleAppListingsCategoriesResponseInfo result = apiInstance.googleAppListingsCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppListingsCategories");
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

[**AppDataGoogleAppListingsCategoriesResponseInfo**](AppDataGoogleAppListingsCategoriesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListingsSearchLive"></a>
# **googleAppListingsSearchLive**
> AppDataGoogleAppListingsSearchLiveResponseInfo googleAppListingsSearchLive(appDataGoogleAppListingsSearchLiveRequestInfo)



This endpoint will provide you with a list of apps published on Google Play along with additional information: its ID, icon, reviews count, rating, price, and other data. The results are specific to the title, description, and categories parameters specified in the API request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_listings/search/live/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataGoogleAppListingsSearchLiveRequestInfo> appDataGoogleAppListingsSearchLiveRequestInfo = Arrays.asList(); // List<AppDataGoogleAppListingsSearchLiveRequestInfo> | 
    try {
      AppDataGoogleAppListingsSearchLiveResponseInfo result = apiInstance.googleAppListingsSearchLive(appDataGoogleAppListingsSearchLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppListingsSearchLive");
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
| **appDataGoogleAppListingsSearchLiveRequestInfo** | [**List&lt;AppDataGoogleAppListingsSearchLiveRequestInfo&gt;**](AppDataGoogleAppListingsSearchLiveRequestInfo.md)|  | [optional] |

### Return type

[**AppDataGoogleAppListingsSearchLiveResponseInfo**](AppDataGoogleAppListingsSearchLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppReviewsTaskGetAdvanced"></a>
# **googleAppReviewsTaskGetAdvanced**
> AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo googleAppReviewsTaskGetAdvanced(id)



This endpoint will provide you with feedback data on applications listed on the Google Play platform, including review ratings, review content, user profile info of each reviewer, review publication dates, and more. The results are specific to the app_id as well as the location and language parameters specified in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_reviews/task_get/advanced/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "cadcc491-f9f6-4dd4-bb7e-865175afb6ed"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo result = apiInstance.googleAppReviewsTaskGetAdvanced(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppReviewsTaskGetAdvanced");
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

[**AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo**](AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppReviewsTaskGetHtml"></a>
# **googleAppReviewsTaskGetHtml**
> AppDataGoogleAppReviewsTaskGetHtmlResponseInfo googleAppReviewsTaskGetHtml(id)



Description of the fields for sending a request: for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_reviews/task_get/html/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "4cf3984f-4d56-4b89-b466-c6e1f1910b13"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 7 days to request the results of the task at any time
    try {
      AppDataGoogleAppReviewsTaskGetHtmlResponseInfo result = apiInstance.googleAppReviewsTaskGetHtml(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppReviewsTaskGetHtml");
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

[**AppDataGoogleAppReviewsTaskGetHtmlResponseInfo**](AppDataGoogleAppReviewsTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppReviewsTaskPost"></a>
# **googleAppReviewsTaskPost**
> AppDataGoogleAppReviewsTaskPostResponseInfo googleAppReviewsTaskPost(appDataGoogleAppReviewsTaskPostRequestInfo)



‌‌ This endpoint will provide you with reviews published on the Google Play platform for the app specified in the app_id field. The returned results are specific to the indicated language and location parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_reviews/task_post/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataGoogleAppReviewsTaskPostRequestInfo> appDataGoogleAppReviewsTaskPostRequestInfo = Arrays.asList(); // List<AppDataGoogleAppReviewsTaskPostRequestInfo> | 
    try {
      AppDataGoogleAppReviewsTaskPostResponseInfo result = apiInstance.googleAppReviewsTaskPost(appDataGoogleAppReviewsTaskPostRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppReviewsTaskPost");
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
| **appDataGoogleAppReviewsTaskPostRequestInfo** | [**List&lt;AppDataGoogleAppReviewsTaskPostRequestInfo&gt;**](AppDataGoogleAppReviewsTaskPostRequestInfo.md)|  | [optional] |

### Return type

[**AppDataGoogleAppReviewsTaskPostResponseInfo**](AppDataGoogleAppReviewsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppReviewsTasksReady"></a>
# **googleAppReviewsTasksReady**
> AppDataGoogleAppReviewsTasksReadyResponseInfo googleAppReviewsTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with a list of completed tasks that haven’t been collected yet. If you use the Standard method without specifying the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_reviews/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataGoogleAppReviewsTasksReadyResponseInfo result = apiInstance.googleAppReviewsTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppReviewsTasksReady");
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

[**AppDataGoogleAppReviewsTasksReadyResponseInfo**](AppDataGoogleAppReviewsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppSearchesTaskGetAdvanced"></a>
# **googleAppSearchesTaskGetAdvanced**
> AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo googleAppSearchesTaskGetAdvanced(id)



This endpoint will provide you with a list of apps ranking on Google Play for the keyword specified in a POST request. You will also receive additional information about each application: its ID, icon, reviews count, rating, price, and other data. The results are specific to the keyword as well as location and language parameters specified in the POST request. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_searches/task_get/advanced/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "67f93c95-b356-4951-8a09-0ebe7ff364cb"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 30 days to request the results of the task at any time
    try {
      AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo result = apiInstance.googleAppSearchesTaskGetAdvanced(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppSearchesTaskGetAdvanced");
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

[**AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo**](AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppSearchesTaskGetHtml"></a>
# **googleAppSearchesTaskGetHtml**
> AppDataGoogleAppSearchesTaskGetHtmlResponseInfo googleAppSearchesTaskGetHtml(id)



Description of the fields for sending a request: for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_searches/task_get/html/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = "df5c7e9b-aa3d-40b8-bd48-f3e1fb5cea1c"; // String | task identifier unique task identifier in our system in the UUID format you will be able to use it within 7 days to request the results of the task at any time
    try {
      AppDataGoogleAppSearchesTaskGetHtmlResponseInfo result = apiInstance.googleAppSearchesTaskGetHtml(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppSearchesTaskGetHtml");
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

[**AppDataGoogleAppSearchesTaskGetHtmlResponseInfo**](AppDataGoogleAppSearchesTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppSearchesTaskPost"></a>
# **googleAppSearchesTaskPost**
> AppDataGoogleAppSearchesTaskPostResponseInfo googleAppSearchesTaskPost(appDataGoogleAppSearchesTaskPostRequestInfo)



‌‌ This endpoint will provide you with a list of apps ranking on Google Play for the specified keyword. The returned results are specific to the indicated keyword, as well as the language and location parameters. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_searches/task_post/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    List<AppDataGoogleAppSearchesTaskPostRequestInfo> appDataGoogleAppSearchesTaskPostRequestInfo = Arrays.asList(); // List<AppDataGoogleAppSearchesTaskPostRequestInfo> | 
    try {
      AppDataGoogleAppSearchesTaskPostResponseInfo result = apiInstance.googleAppSearchesTaskPost(appDataGoogleAppSearchesTaskPostRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppSearchesTaskPost");
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
| **appDataGoogleAppSearchesTaskPostRequestInfo** | [**List&lt;AppDataGoogleAppSearchesTaskPostRequestInfo&gt;**](AppDataGoogleAppSearchesTaskPostRequestInfo.md)|  | [optional] |

### Return type

[**AppDataGoogleAppSearchesTaskPostResponseInfo**](AppDataGoogleAppSearchesTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppSearchesTasksReady"></a>
# **googleAppSearchesTasksReady**
> AppDataGoogleAppSearchesTasksReadyResponseInfo googleAppSearchesTasksReady()



‌ The ‘Tasks Ready’ endpoint is designed to provide you with a list of completed tasks that haven’t been collected yet. If you use the Standard method without specifying the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/app_searches/tasks_ready/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataGoogleAppSearchesTasksReadyResponseInfo result = apiInstance.googleAppSearchesTasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleAppSearchesTasksReady");
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

[**AppDataGoogleAppSearchesTasksReadyResponseInfo**](AppDataGoogleAppSearchesTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleCategories"></a>
# **googleCategories**
> AppDataGoogleCategoriesResponseInfo googleCategories()



This endpoint will provide you with a full list of app categories available on Google Play. for more info please visit &#39;https://docs.dataforseo.com/v3/app_data/google/categories/?bash&#39;

### Example
```java
// Import classes:
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.models.*;
import io.github.dataforseo.client.api.AppDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppDataApi apiInstance = new AppDataApi(defaultClient);
    try {
      AppDataGoogleCategoriesResponseInfo result = apiInstance.googleCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#googleCategories");
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

[**AppDataGoogleCategoriesResponseInfo**](AppDataGoogleCategoriesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


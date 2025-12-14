# AppDataApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appDataIdList**](AppDataApi.md#appDataIdList) | **POST**  /v3/app_data/id_list  |
| [**appDataErrors**](AppDataApi.md#appDataErrors) | **POST**  /v3/app_data/errors  |
| [**googleCategories**](AppDataApi.md#googleCategories) | **GET**  /v3/app_data/google/categories  |
| [**appDataGoogleLocations**](AppDataApi.md#appDataGoogleLocations) | **GET**  /v3/app_data/google/locations  |
| [**appDataGoogleLocationsCountry**](AppDataApi.md#appDataGoogleLocationsCountry) | **GET**  /v3/app_data/google/locations/{country}  |
| [**appDataGoogleLanguages**](AppDataApi.md#appDataGoogleLanguages) | **GET**  /v3/app_data/google/languages  |
| [**googleAppSearchesTaskPost**](AppDataApi.md#googleAppSearchesTaskPost) | **POST**  /v3/app_data/google/app_searches/task_post  |
| [**googleAppSearchesTasksReady**](AppDataApi.md#googleAppSearchesTasksReady) | **GET**  /v3/app_data/google/app_searches/tasks_ready  |
| [**appDataTasksReady**](AppDataApi.md#appDataTasksReady) | **GET**  /v3/app_data/tasks_ready  |
| [**googleAppSearchesTaskGetAdvanced**](AppDataApi.md#googleAppSearchesTaskGetAdvanced) | **GET**  /v3/app_data/google/app_searches/task_get/advanced/{id}  |
| [**googleAppSearchesTaskGetHtml**](AppDataApi.md#googleAppSearchesTaskGetHtml) | **GET**  /v3/app_data/google/app_searches/task_get/html/{id}  |
| [**googleAppListTaskPost**](AppDataApi.md#googleAppListTaskPost) | **POST**  /v3/app_data/google/app_list/task_post  |
| [**googleAppListTasksReady**](AppDataApi.md#googleAppListTasksReady) | **GET**  /v3/app_data/google/app_list/tasks_ready  |
| [**googleAppListTaskGetAdvanced**](AppDataApi.md#googleAppListTaskGetAdvanced) | **GET**  /v3/app_data/google/app_list/task_get/advanced/{id}  |
| [**googleAppListTaskGetHtml**](AppDataApi.md#googleAppListTaskGetHtml) | **GET**  /v3/app_data/google/app_list/task_get/html/{id}  |
| [**googleAppInfoTaskPost**](AppDataApi.md#googleAppInfoTaskPost) | **POST**  /v3/app_data/google/app_info/task_post  |
| [**googleAppInfoTasksReady**](AppDataApi.md#googleAppInfoTasksReady) | **GET**  /v3/app_data/google/app_info/tasks_ready  |
| [**googleAppInfoTaskGetAdvanced**](AppDataApi.md#googleAppInfoTaskGetAdvanced) | **GET**  /v3/app_data/google/app_info/task_get/advanced/{id}  |
| [**googleAppInfoTaskGetHtml**](AppDataApi.md#googleAppInfoTaskGetHtml) | **GET**  /v3/app_data/google/app_info/task_get/html/{id}  |
| [**googleAppReviewsTaskPost**](AppDataApi.md#googleAppReviewsTaskPost) | **POST**  /v3/app_data/google/app_reviews/task_post  |
| [**googleAppReviewsTasksReady**](AppDataApi.md#googleAppReviewsTasksReady) | **GET**  /v3/app_data/google/app_reviews/tasks_ready  |
| [**googleAppReviewsTaskGetAdvanced**](AppDataApi.md#googleAppReviewsTaskGetAdvanced) | **GET**  /v3/app_data/google/app_reviews/task_get/advanced/{id}  |
| [**googleAppReviewsTaskGetHtml**](AppDataApi.md#googleAppReviewsTaskGetHtml) | **GET**  /v3/app_data/google/app_reviews/task_get/html/{id}  |
| [**googleAppListingsCategories**](AppDataApi.md#googleAppListingsCategories) | **GET**  /v3/app_data/google/app_listings/categories  |
| [**googleAppListingsSearchLive**](AppDataApi.md#googleAppListingsSearchLive) | **POST**  /v3/app_data/google/app_listings/search/live  |
| [**appleCategories**](AppDataApi.md#appleCategories) | **GET**  /v3/app_data/apple/categories  |
| [**appleLocations**](AppDataApi.md#appleLocations) | **GET**  /v3/app_data/apple/locations  |
| [**appleLanguages**](AppDataApi.md#appleLanguages) | **GET**  /v3/app_data/apple/languages  |
| [**appleAppSearchesTaskPost**](AppDataApi.md#appleAppSearchesTaskPost) | **POST**  /v3/app_data/apple/app_searches/task_post  |
| [**appleAppSearchesTasksReady**](AppDataApi.md#appleAppSearchesTasksReady) | **GET**  /v3/app_data/apple/app_searches/tasks_ready  |
| [**appleAppSearchesTaskGetAdvanced**](AppDataApi.md#appleAppSearchesTaskGetAdvanced) | **GET**  /v3/app_data/apple/app_searches/task_get/advanced/{id}  |
| [**appleAppInfoTaskPost**](AppDataApi.md#appleAppInfoTaskPost) | **POST**  /v3/app_data/apple/app_info/task_post  |
| [**appleAppInfoTasksReady**](AppDataApi.md#appleAppInfoTasksReady) | **GET**  /v3/app_data/apple/app_info/tasks_ready  |
| [**appleAppInfoTaskGetAdvanced**](AppDataApi.md#appleAppInfoTaskGetAdvanced) | **GET**  /v3/app_data/apple/app_info/task_get/advanced/{id}  |
| [**appleAppListTaskPost**](AppDataApi.md#appleAppListTaskPost) | **POST**  /v3/app_data/apple/app_list/task_post  |
| [**appleAppListTasksReady**](AppDataApi.md#appleAppListTasksReady) | **GET**  /v3/app_data/apple/app_list/tasks_ready  |
| [**appleAppListTaskGetAdvanced**](AppDataApi.md#appleAppListTaskGetAdvanced) | **GET**  /v3/app_data/apple/app_list/task_get/advanced/{id}  |
| [**appleAppReviewsTaskPost**](AppDataApi.md#appleAppReviewsTaskPost) | **POST**  /v3/app_data/apple/app_reviews/task_post  |
| [**appleAppReviewsTasksReady**](AppDataApi.md#appleAppReviewsTasksReady) | **GET**  /v3/app_data/apple/app_reviews/tasks_ready  |
| [**appleAppReviewsTaskGetAdvanced**](AppDataApi.md#appleAppReviewsTaskGetAdvanced) | **GET**  /v3/app_data/apple/app_reviews/task_get/advanced/{id}  |
| [**appleAppListingsCategories**](AppDataApi.md#appleAppListingsCategories) | **GET**  /v3/app_data/apple/app_listings/categories  |
| [**appleAppListingsSearchLive**](AppDataApi.md#appleAppListingsSearchLive) | **POST**  /v3/app_data/apple/app_listings/search/live  |

<a id="appDataIdList"></a>
# **appDataIdList**
> AppDataIdListResponseInfo appDataIdList()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataIdListResponseInfo response = apiInstance.appDataIdList(
       List.of(
    
           new AppDataIdListRequestInfo()
        
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
    | **** | [**List&lt;List<AppDataIdListRequestInfo>&gt;**](List<AppDataIdListRequestInfo>.md)|  | [optional] |



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

<a id="appDataErrors"></a>
# **appDataErrors**
> AppDataErrorsResponseInfo appDataErrors()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataErrorsResponseInfo response = apiInstance.appDataErrors(
       List.of(
    
           new AppDataErrorsRequestInfo()
        
           .limit(10)
        
        
           .offset(0)
        
        
           .filteredFunction("pingback_url")
    
       )
    );
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
    | **** | [**List&lt;List<AppDataErrorsRequestInfo>&gt;**](List<AppDataErrorsRequestInfo>.md)|  | [optional] |



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

<a id="googleCategories"></a>
# **googleCategories**
> AppDataGoogleCategoriesResponseInfo googleCategories()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataGoogleCategoriesResponseInfo response = apiInstance.googleCategories();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appDataGoogleLocations"></a>
# **appDataGoogleLocations**
> AppDataGoogleLocationsResponseInfo appDataGoogleLocations()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataGoogleLocationsResponseInfo response = apiInstance.appDataGoogleLocations();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appDataGoogleLocationsCountry"></a>
# **appDataGoogleLocationsCountry**
> AppDataGoogleLocationsCountryResponseInfo appDataGoogleLocationsCountry()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String country = ;
    AppDataGoogleLocationsCountryResponseInfo response = apiInstance.appDataGoogleLocationsCountry(country);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataGoogleLocationsCountryResponseInfo**](AppDataGoogleLocationsCountryResponseInfo.md)

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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataGoogleLanguagesResponseInfo response = apiInstance.appDataGoogleLanguages();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppSearchesTaskPost"></a>
# **googleAppSearchesTaskPost**
> AppDataGoogleAppSearchesTaskPostResponseInfo googleAppSearchesTaskPost()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataGoogleAppSearchesTaskPostResponseInfo response = apiInstance.googleAppSearchesTaskPost(
       List.of(
    
           new AppDataGoogleAppSearchesTaskPostRequestInfo()
        
           .keyword("vpn")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .depth(30)
    
       )
    );
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
    | **** | [**List&lt;List<AppDataGoogleAppSearchesTaskPostRequestInfo>&gt;**](List<AppDataGoogleAppSearchesTaskPostRequestInfo>.md)|  | [optional] |



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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataGoogleAppSearchesTasksReadyResponseInfo response = apiInstance.googleAppSearchesTasksReady();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appDataTasksReady"></a>
# **appDataTasksReady**
> AppDataTasksReadyResponseInfo appDataTasksReady()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataTasksReadyResponseInfo response = apiInstance.appDataTasksReady();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppSearchesTaskGetAdvanced"></a>
# **googleAppSearchesTaskGetAdvanced**
> AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo googleAppSearchesTaskGetAdvanced()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo response = apiInstance.googleAppSearchesTaskGetAdvanced(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo**](AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppSearchesTaskGetHtml"></a>
# **googleAppSearchesTaskGetHtml**
> AppDataGoogleAppSearchesTaskGetHtmlResponseInfo googleAppSearchesTaskGetHtml()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataGoogleAppSearchesTaskGetHtmlResponseInfo response = apiInstance.googleAppSearchesTaskGetHtml(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataGoogleAppSearchesTaskGetHtmlResponseInfo**](AppDataGoogleAppSearchesTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListTaskPost"></a>
# **googleAppListTaskPost**
> AppDataGoogleAppListTaskPostResponseInfo googleAppListTaskPost()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataGoogleAppListTaskPostResponseInfo response = apiInstance.googleAppListTaskPost(
       List.of(
    
           new AppDataGoogleAppListTaskPostRequestInfo()
        
           .appCollection("topselling_free")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .depth(100)
    
       )
    );
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
    | **** | [**List&lt;List<AppDataGoogleAppListTaskPostRequestInfo>&gt;**](List<AppDataGoogleAppListTaskPostRequestInfo>.md)|  | [optional] |



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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataGoogleAppListTasksReadyResponseInfo response = apiInstance.googleAppListTasksReady();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListTaskGetAdvanced"></a>
# **googleAppListTaskGetAdvanced**
> AppDataGoogleAppListTaskGetAdvancedResponseInfo googleAppListTaskGetAdvanced()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataGoogleAppListTaskGetAdvancedResponseInfo response = apiInstance.googleAppListTaskGetAdvanced(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataGoogleAppListTaskGetAdvancedResponseInfo**](AppDataGoogleAppListTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListTaskGetHtml"></a>
# **googleAppListTaskGetHtml**
> AppDataGoogleAppListTaskGetHtmlResponseInfo googleAppListTaskGetHtml()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataGoogleAppListTaskGetHtmlResponseInfo response = apiInstance.googleAppListTaskGetHtml(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataGoogleAppListTaskGetHtmlResponseInfo**](AppDataGoogleAppListTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppInfoTaskPost"></a>
# **googleAppInfoTaskPost**
> AppDataGoogleAppInfoTaskPostResponseInfo googleAppInfoTaskPost()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataGoogleAppInfoTaskPostResponseInfo response = apiInstance.googleAppInfoTaskPost(
       List.of(
    
           new AppDataGoogleAppInfoTaskPostRequestInfo()
        
           .appId("org.telegram.messenger")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
    
       )
    );
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
    | **** | [**List&lt;List<AppDataGoogleAppInfoTaskPostRequestInfo>&gt;**](List<AppDataGoogleAppInfoTaskPostRequestInfo>.md)|  | [optional] |



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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataGoogleAppInfoTasksReadyResponseInfo response = apiInstance.googleAppInfoTasksReady();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppInfoTaskGetAdvanced"></a>
# **googleAppInfoTaskGetAdvanced**
> AppDataGoogleAppInfoTaskGetAdvancedResponseInfo googleAppInfoTaskGetAdvanced()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataGoogleAppInfoTaskGetAdvancedResponseInfo response = apiInstance.googleAppInfoTaskGetAdvanced(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataGoogleAppInfoTaskGetAdvancedResponseInfo**](AppDataGoogleAppInfoTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppInfoTaskGetHtml"></a>
# **googleAppInfoTaskGetHtml**
> AppDataGoogleAppInfoTaskGetHtmlResponseInfo googleAppInfoTaskGetHtml()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataGoogleAppInfoTaskGetHtmlResponseInfo response = apiInstance.googleAppInfoTaskGetHtml(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataGoogleAppInfoTaskGetHtmlResponseInfo**](AppDataGoogleAppInfoTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppReviewsTaskPost"></a>
# **googleAppReviewsTaskPost**
> AppDataGoogleAppReviewsTaskPostResponseInfo googleAppReviewsTaskPost()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataGoogleAppReviewsTaskPostResponseInfo response = apiInstance.googleAppReviewsTaskPost(
       List.of(
    
           new AppDataGoogleAppReviewsTaskPostRequestInfo()
        
           .appId("org.telegram.messenger")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .depth(150)
    
       )
    );
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
    | **** | [**List&lt;List<AppDataGoogleAppReviewsTaskPostRequestInfo>&gt;**](List<AppDataGoogleAppReviewsTaskPostRequestInfo>.md)|  | [optional] |



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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataGoogleAppReviewsTasksReadyResponseInfo response = apiInstance.googleAppReviewsTasksReady();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppReviewsTaskGetAdvanced"></a>
# **googleAppReviewsTaskGetAdvanced**
> AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo googleAppReviewsTaskGetAdvanced()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo response = apiInstance.googleAppReviewsTaskGetAdvanced(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo**](AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppReviewsTaskGetHtml"></a>
# **googleAppReviewsTaskGetHtml**
> AppDataGoogleAppReviewsTaskGetHtmlResponseInfo googleAppReviewsTaskGetHtml()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataGoogleAppReviewsTaskGetHtmlResponseInfo response = apiInstance.googleAppReviewsTaskGetHtml(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataGoogleAppReviewsTaskGetHtmlResponseInfo**](AppDataGoogleAppReviewsTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListingsCategories"></a>
# **googleAppListingsCategories**
> AppDataGoogleAppListingsCategoriesResponseInfo googleAppListingsCategories()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataGoogleAppListingsCategoriesResponseInfo response = apiInstance.googleAppListingsCategories();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAppListingsSearchLive"></a>
# **googleAppListingsSearchLive**
> AppDataGoogleAppListingsSearchLiveResponseInfo googleAppListingsSearchLive()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataGoogleAppListingsSearchLiveResponseInfo response = apiInstance.googleAppListingsSearchLive(
       List.of(
    
           new AppDataGoogleAppListingsSearchLiveRequestInfo()
        
           .title("vpn")
        
        
           .description("vpn")
        
        
           .categories(List.of(
    
           "Tools"
    
       ))
        
        
           .orderBy(List.of(
    
           "item.installs_count,asc"
    
       ))
        
        
           .filters(List.of(
    
           List.of(
    
           "item.rating.value",
    
           ">",
    
           4.5d
    
       )
    
       ))
        
        
           .limit(10)
    
       )
    );
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
    | **** | [**List&lt;List<AppDataGoogleAppListingsSearchLiveRequestInfo>&gt;**](List<AppDataGoogleAppListingsSearchLiveRequestInfo>.md)|  | [optional] |



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

<a id="appleCategories"></a>
# **appleCategories**
> AppDataAppleCategoriesResponseInfo appleCategories()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataAppleCategoriesResponseInfo response = apiInstance.appleCategories();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleLocations"></a>
# **appleLocations**
> AppDataAppleLocationsResponseInfo appleLocations()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataAppleLocationsResponseInfo response = apiInstance.appleLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleLocations");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleLanguages"></a>
# **appleLanguages**
> AppDataAppleLanguagesResponseInfo appleLanguages()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataAppleLanguagesResponseInfo response = apiInstance.appleLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling AppDataApi#appleLanguages");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppSearchesTaskPost"></a>
# **appleAppSearchesTaskPost**
> AppDataAppleAppSearchesTaskPostResponseInfo appleAppSearchesTaskPost()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataAppleAppSearchesTaskPostResponseInfo response = apiInstance.appleAppSearchesTaskPost(
       List.of(
    
           new AppDataAppleAppSearchesTaskPostRequestInfo()
        
           .keyword("vpn")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .depth(200)
    
       )
    );
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
    | **** | [**List&lt;List<AppDataAppleAppSearchesTaskPostRequestInfo>&gt;**](List<AppDataAppleAppSearchesTaskPostRequestInfo>.md)|  | [optional] |



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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataAppleAppSearchesTasksReadyResponseInfo response = apiInstance.appleAppSearchesTasksReady();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppSearchesTaskGetAdvanced"></a>
# **appleAppSearchesTaskGetAdvanced**
> AppDataAppleAppSearchesTaskGetAdvancedResponseInfo appleAppSearchesTaskGetAdvanced()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataAppleAppSearchesTaskGetAdvancedResponseInfo response = apiInstance.appleAppSearchesTaskGetAdvanced(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataAppleAppSearchesTaskGetAdvancedResponseInfo**](AppDataAppleAppSearchesTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppInfoTaskPost"></a>
# **appleAppInfoTaskPost**
> AppDataAppleAppInfoTaskPostResponseInfo appleAppInfoTaskPost()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataAppleAppInfoTaskPostResponseInfo response = apiInstance.appleAppInfoTaskPost(
       List.of(
    
           new AppDataAppleAppInfoTaskPostRequestInfo()
        
           .appId("835599320")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
    
       )
    );
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
    | **** | [**List&lt;List<AppDataAppleAppInfoTaskPostRequestInfo>&gt;**](List<AppDataAppleAppInfoTaskPostRequestInfo>.md)|  | [optional] |



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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataAppleAppInfoTasksReadyResponseInfo response = apiInstance.appleAppInfoTasksReady();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppInfoTaskGetAdvanced"></a>
# **appleAppInfoTaskGetAdvanced**
> AppDataAppleAppInfoTaskGetAdvancedResponseInfo appleAppInfoTaskGetAdvanced()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataAppleAppInfoTaskGetAdvancedResponseInfo response = apiInstance.appleAppInfoTaskGetAdvanced(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataAppleAppInfoTaskGetAdvancedResponseInfo**](AppDataAppleAppInfoTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppListTaskPost"></a>
# **appleAppListTaskPost**
> AppDataAppleAppListTaskPostResponseInfo appleAppListTaskPost()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataAppleAppListTaskPostResponseInfo response = apiInstance.appleAppListTaskPost(
       List.of(
    
           new AppDataAppleAppListTaskPostRequestInfo()
        
           .appCollection("top_free_ios")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .depth(200)
        
        
           .appCategory("games")
    
       )
    );
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
    | **** | [**List&lt;List<AppDataAppleAppListTaskPostRequestInfo>&gt;**](List<AppDataAppleAppListTaskPostRequestInfo>.md)|  | [optional] |



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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataAppleAppListTasksReadyResponseInfo response = apiInstance.appleAppListTasksReady();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppListTaskGetAdvanced"></a>
# **appleAppListTaskGetAdvanced**
> AppDataAppleAppListTaskGetAdvancedResponseInfo appleAppListTaskGetAdvanced()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataAppleAppListTaskGetAdvancedResponseInfo response = apiInstance.appleAppListTaskGetAdvanced(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataAppleAppListTaskGetAdvancedResponseInfo**](AppDataAppleAppListTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppReviewsTaskPost"></a>
# **appleAppReviewsTaskPost**
> AppDataAppleAppReviewsTaskPostResponseInfo appleAppReviewsTaskPost()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataAppleAppReviewsTaskPostResponseInfo response = apiInstance.appleAppReviewsTaskPost(
       List.of(
    
           new AppDataAppleAppReviewsTaskPostRequestInfo()
        
           .appId("835599320")
        
        
           .locationCode(2840)
        
        
           .languageCode("en")
        
        
           .depth(200)
    
       )
    );
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
    | **** | [**List&lt;List<AppDataAppleAppReviewsTaskPostRequestInfo>&gt;**](List<AppDataAppleAppReviewsTaskPostRequestInfo>.md)|  | [optional] |



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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataAppleAppReviewsTasksReadyResponseInfo response = apiInstance.appleAppReviewsTasksReady();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppReviewsTaskGetAdvanced"></a>
# **appleAppReviewsTaskGetAdvanced**
> AppDataAppleAppReviewsTaskGetAdvancedResponseInfo appleAppReviewsTaskGetAdvanced()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    String id = ;
    AppDataAppleAppReviewsTaskGetAdvancedResponseInfo response = apiInstance.appleAppReviewsTaskGetAdvanced(id);
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


    
This endpoint does not need any parameter.
    


### Return type

[**AppDataAppleAppReviewsTaskGetAdvancedResponseInfo**](AppDataAppleAppReviewsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppListingsCategories"></a>
# **appleAppListingsCategories**
> AppDataAppleAppListingsCategoriesResponseInfo appleAppListingsCategories()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);

    AppDataAppleAppListingsCategoriesResponseInfo response = apiInstance.appleAppListingsCategories();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appleAppListingsSearchLive"></a>
# **appleAppListingsSearchLive**
> AppDataAppleAppListingsSearchLiveResponseInfo appleAppListingsSearchLive()


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
    AppDataApi apiInstance = new AppDataApi(defaultClient);
    AppDataAppleAppListingsSearchLiveResponseInfo response = apiInstance.appleAppListingsSearchLive(
       List.of(
    
           new AppDataAppleAppListingsSearchLiveRequestInfo()
        
           .title("vpn")
        
        
           .description("vpn")
        
        
           .categories(List.of(
    
           "Tools"
    
       ))
        
        
           .orderBy(List.of(
    
           "item.rating.value,desc"
    
       ))
        
        
           .filters(List.of(
    
           List.of(
    
           "item.rating.value",
    
           ">",
    
           4.5d
    
       )
    
       ))
        
        
           .limit(10)
    
       )
    );
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
    | **** | [**List&lt;List<AppDataAppleAppListingsSearchLiveRequestInfo>&gt;**](List<AppDataAppleAppListingsSearchLiveRequestInfo>.md)|  | [optional] |



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
# MerchantApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**merchantIdList**](MerchantApi.md#merchantIdList) | **POST**  /v3/merchant/id_list  |
| [**merchantErrors**](MerchantApi.md#merchantErrors) | **POST**  /v3/merchant/errors  |
| [**merchantGoogleLanguages**](MerchantApi.md#merchantGoogleLanguages) | **GET**  /v3/merchant/google/languages  |
| [**merchantGoogleLocations**](MerchantApi.md#merchantGoogleLocations) | **GET**  /v3/merchant/google/locations  |
| [**merchantGoogleLocationsCountry**](MerchantApi.md#merchantGoogleLocationsCountry) | **GET**  /v3/merchant/google/locations/{country}  |
| [**googleProductsTaskPost**](MerchantApi.md#googleProductsTaskPost) | **POST**  /v3/merchant/google/products/task_post  |
| [**googleProductsTasksReady**](MerchantApi.md#googleProductsTasksReady) | **GET**  /v3/merchant/google/products/tasks_ready  |
| [**merchantTasksReady**](MerchantApi.md#merchantTasksReady) | **GET**  /v3/merchant/tasks_ready  |
| [**googleProductsTaskGetAdvanced**](MerchantApi.md#googleProductsTaskGetAdvanced) | **GET**  /v3/merchant/google/products/task_get/advanced/{id}  |
| [**googleProductsTaskGetHtml**](MerchantApi.md#googleProductsTaskGetHtml) | **GET**  /v3/merchant/google/products/task_get/html/{id}  |
| [**googleSellersTaskPost**](MerchantApi.md#googleSellersTaskPost) | **POST**  /v3/merchant/google/sellers/task_post  |
| [**googleSellersTasksReady**](MerchantApi.md#googleSellersTasksReady) | **GET**  /v3/merchant/google/sellers/tasks_ready  |
| [**googleSellersTaskGetAdvanced**](MerchantApi.md#googleSellersTaskGetAdvanced) | **GET**  /v3/merchant/google/sellers/task_get/advanced/{id}  |
| [**googleProductSpecTaskGetAdvanced**](MerchantApi.md#googleProductSpecTaskGetAdvanced) | **GET**  /v3/merchant/google/product_spec/task_get/advanced/{id}  |
| [**googleProductInfoTaskPost**](MerchantApi.md#googleProductInfoTaskPost) | **POST**  /v3/merchant/google/product_info/task_post  |
| [**googleProductInfoTasksReady**](MerchantApi.md#googleProductInfoTasksReady) | **GET**  /v3/merchant/google/product_info/tasks_ready  |
| [**googleProductInfoTaskGetAdvanced**](MerchantApi.md#googleProductInfoTaskGetAdvanced) | **GET**  /v3/merchant/google/product_info/task_get/advanced/{id}  |
| [**googleSellersAdUrl**](MerchantApi.md#googleSellersAdUrl) | **GET**  /v3/merchant/google/sellers/ad_url/{shop_ad_aclk}  |
| [**merchantAmazonLocations**](MerchantApi.md#merchantAmazonLocations) | **GET**  /v3/merchant/amazon/locations  |
| [**merchantAmazonLocationsCountry**](MerchantApi.md#merchantAmazonLocationsCountry) | **GET**  /v3/merchant/amazon/locations/{country}  |
| [**merchantAmazonLanguages**](MerchantApi.md#merchantAmazonLanguages) | **GET**  /v3/merchant/amazon/languages  |
| [**amazonProductsTaskPost**](MerchantApi.md#amazonProductsTaskPost) | **POST**  /v3/merchant/amazon/products/task_post  |
| [**amazonProductsTasksReady**](MerchantApi.md#amazonProductsTasksReady) | **GET**  /v3/merchant/amazon/products/tasks_ready  |
| [**amazonProductsTaskGetAdvanced**](MerchantApi.md#amazonProductsTaskGetAdvanced) | **GET**  /v3/merchant/amazon/products/task_get/advanced/{id}  |
| [**amazonProductsTaskGetHtml**](MerchantApi.md#amazonProductsTaskGetHtml) | **GET**  /v3/merchant/amazon/products/task_get/html/{id}  |
| [**amazonAsinTaskPost**](MerchantApi.md#amazonAsinTaskPost) | **POST**  /v3/merchant/amazon/asin/task_post  |
| [**amazonAsinTasksReady**](MerchantApi.md#amazonAsinTasksReady) | **GET**  /v3/merchant/amazon/asin/tasks_ready  |
| [**amazonAsinTaskGetAdvanced**](MerchantApi.md#amazonAsinTaskGetAdvanced) | **GET**  /v3/merchant/amazon/asin/task_get/advanced/{id}  |
| [**amazonAsinTaskGetHtml**](MerchantApi.md#amazonAsinTaskGetHtml) | **GET**  /v3/merchant/amazon/asin/task_get/html/{id}  |
| [**amazonSellersTaskPost**](MerchantApi.md#amazonSellersTaskPost) | **POST**  /v3/merchant/amazon/sellers/task_post  |
| [**amazonSellersTasksReady**](MerchantApi.md#amazonSellersTasksReady) | **GET**  /v3/merchant/amazon/sellers/tasks_ready  |
| [**amazonSellersTaskGetAdvanced**](MerchantApi.md#amazonSellersTaskGetAdvanced) | **GET**  /v3/merchant/amazon/sellers/task_get/advanced/{id}  |
| [**amazonSellersTaskGetHtml**](MerchantApi.md#amazonSellersTaskGetHtml) | **GET**  /v3/merchant/amazon/sellers/task_get/html/{id}  |
| [**amazonReviewsTaskPost**](MerchantApi.md#amazonReviewsTaskPost) | **POST**  /v3/merchant/amazon/reviews/task_post  |
| [**amazonReviewsTasksReady**](MerchantApi.md#amazonReviewsTasksReady) | **GET**  /v3/merchant/amazon/reviews/tasks_ready  |
| [**amazonReviewsTaskGetAdvanced**](MerchantApi.md#amazonReviewsTaskGetAdvanced) | **GET**  /v3/merchant/amazon/reviews/task_get/advanced/{id}  |
| [**amazonReviewsTaskGetHtml**](MerchantApi.md#amazonReviewsTaskGetHtml) | **GET**  /v3/merchant/amazon/reviews/task_get/html/{id}  |

<a id="merchantIdList"></a>
# **merchantIdList**
> MerchantIdListResponseInfo merchantIdList()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    MerchantIdListRequestInfo model = new MerchantIdListRequestInfo()
           .datetimeFrom("2025-07-24 12:05:35 +00:00")
           .datetimeTo("2025-09-24 12:05:35 +00:00")
           .limit(100)
           .offset(0)
           .sort("desc");
    MerchantIdListResponseInfo response = apiInstance.merchantIdList(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantIdList");
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
    | **** | [**List&lt;List<MerchantIdListRequestInfo>&gt;**](List<MerchantIdListRequestInfo>.md)|  | [optional] |



### Return type

[**MerchantIdListResponseInfo**](MerchantIdListResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="merchantErrors"></a>
# **merchantErrors**
> MerchantErrorsResponseInfo merchantErrors()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    MerchantErrorsRequestInfo model = new MerchantErrorsRequestInfo()
           .limit(10)
           .offset(0)
           .filteredFunction("pingback_url");
    MerchantErrorsResponseInfo response = apiInstance.merchantErrors(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantErrors");
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
    | **** | [**List&lt;List<MerchantErrorsRequestInfo>&gt;**](List<MerchantErrorsRequestInfo>.md)|  | [optional] |



### Return type

[**MerchantErrorsResponseInfo**](MerchantErrorsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="merchantGoogleLanguages"></a>
# **merchantGoogleLanguages**
> MerchantGoogleLanguagesResponseInfo merchantGoogleLanguages()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantGoogleLanguagesResponseInfo response = apiInstance.merchantGoogleLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantGoogleLanguages");
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

[**MerchantGoogleLanguagesResponseInfo**](MerchantGoogleLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="merchantGoogleLocations"></a>
# **merchantGoogleLocations**
> MerchantGoogleLocationsResponseInfo merchantGoogleLocations()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantGoogleLocationsResponseInfo response = apiInstance.merchantGoogleLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantGoogleLocations");
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

[**MerchantGoogleLocationsResponseInfo**](MerchantGoogleLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="merchantGoogleLocationsCountry"></a>
# **merchantGoogleLocationsCountry**
> MerchantGoogleLocationsCountryResponseInfo merchantGoogleLocationsCountry()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String country = "us";
    MerchantGoogleLocationsCountryResponseInfo response = apiInstance.merchantGoogleLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantGoogleLocationsCountry");
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

[**MerchantGoogleLocationsCountryResponseInfo**](MerchantGoogleLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleProductsTaskPost"></a>
# **googleProductsTaskPost**
> MerchantGoogleProductsTaskPostResponseInfo googleProductsTaskPost()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    MerchantGoogleProductsTaskPostRequestInfo model = new MerchantGoogleProductsTaskPostRequestInfo()
           .keyword("iphone")
           .locationCode(2840)
           .languageCode("en")
           .priceMin(5);
    MerchantGoogleProductsTaskPostResponseInfo response = apiInstance.googleProductsTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleProductsTaskPost");
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
    | **** | [**List&lt;List<MerchantGoogleProductsTaskPostRequestInfo>&gt;**](List<MerchantGoogleProductsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**MerchantGoogleProductsTaskPostResponseInfo**](MerchantGoogleProductsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleProductsTasksReady"></a>
# **googleProductsTasksReady**
> MerchantGoogleProductsTasksReadyResponseInfo googleProductsTasksReady()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantGoogleProductsTasksReadyResponseInfo response = apiInstance.googleProductsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleProductsTasksReady");
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

[**MerchantGoogleProductsTasksReadyResponseInfo**](MerchantGoogleProductsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="merchantTasksReady"></a>
# **merchantTasksReady**
> MerchantTasksReadyResponseInfo merchantTasksReady()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantTasksReadyResponseInfo response = apiInstance.merchantTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantTasksReady");
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

[**MerchantTasksReadyResponseInfo**](MerchantTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleProductsTaskGetAdvanced"></a>
# **googleProductsTaskGetAdvanced**
> MerchantGoogleProductsTaskGetAdvancedResponseInfo googleProductsTaskGetAdvanced()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantGoogleProductsTaskGetAdvancedResponseInfo response = apiInstance.googleProductsTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleProductsTaskGetAdvanced");
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

[**MerchantGoogleProductsTaskGetAdvancedResponseInfo**](MerchantGoogleProductsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleProductsTaskGetHtml"></a>
# **googleProductsTaskGetHtml**
> MerchantGoogleProductsTaskGetHtmlResponseInfo googleProductsTaskGetHtml()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantGoogleProductsTaskGetHtmlResponseInfo response = apiInstance.googleProductsTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleProductsTaskGetHtml");
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

[**MerchantGoogleProductsTaskGetHtmlResponseInfo**](MerchantGoogleProductsTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSellersTaskPost"></a>
# **googleSellersTaskPost**
> MerchantGoogleSellersTaskPostResponseInfo googleSellersTaskPost()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    MerchantGoogleSellersTaskPostRequestInfo model = new MerchantGoogleSellersTaskPostRequestInfo()
           .productId("1113158713975221117")
           .locationCode(2840)
           .languageCode("en");
    MerchantGoogleSellersTaskPostResponseInfo response = apiInstance.googleSellersTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleSellersTaskPost");
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
    | **** | [**List&lt;List<MerchantGoogleSellersTaskPostRequestInfo>&gt;**](List<MerchantGoogleSellersTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**MerchantGoogleSellersTaskPostResponseInfo**](MerchantGoogleSellersTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSellersTasksReady"></a>
# **googleSellersTasksReady**
> MerchantGoogleSellersTasksReadyResponseInfo googleSellersTasksReady()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantGoogleSellersTasksReadyResponseInfo response = apiInstance.googleSellersTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleSellersTasksReady");
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

[**MerchantGoogleSellersTasksReadyResponseInfo**](MerchantGoogleSellersTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSellersTaskGetAdvanced"></a>
# **googleSellersTaskGetAdvanced**
> MerchantGoogleSellersTaskGetAdvancedResponseInfo googleSellersTaskGetAdvanced()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantGoogleSellersTaskGetAdvancedResponseInfo response = apiInstance.googleSellersTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleSellersTaskGetAdvanced");
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

[**MerchantGoogleSellersTaskGetAdvancedResponseInfo**](MerchantGoogleSellersTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleProductSpecTaskGetAdvanced"></a>
# **googleProductSpecTaskGetAdvanced**
> MerchantGoogleProductSpecTaskGetAdvancedResponseInfo googleProductSpecTaskGetAdvanced()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantGoogleProductSpecTaskGetAdvancedResponseInfo response = apiInstance.googleProductSpecTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleProductSpecTaskGetAdvanced");
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

[**MerchantGoogleProductSpecTaskGetAdvancedResponseInfo**](MerchantGoogleProductSpecTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleProductInfoTaskPost"></a>
# **googleProductInfoTaskPost**
> MerchantGoogleProductInfoTaskPostResponseInfo googleProductInfoTaskPost()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    MerchantGoogleProductInfoTaskPostRequestInfo model = new MerchantGoogleProductInfoTaskPostRequestInfo()
           .productId("1113158713975221117")
           .locationCode(2840)
           .languageCode("en");
    MerchantGoogleProductInfoTaskPostResponseInfo response = apiInstance.googleProductInfoTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleProductInfoTaskPost");
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
    | **** | [**List&lt;List<MerchantGoogleProductInfoTaskPostRequestInfo>&gt;**](List<MerchantGoogleProductInfoTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**MerchantGoogleProductInfoTaskPostResponseInfo**](MerchantGoogleProductInfoTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleProductInfoTasksReady"></a>
# **googleProductInfoTasksReady**
> MerchantGoogleProductInfoTasksReadyResponseInfo googleProductInfoTasksReady()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantGoogleProductInfoTasksReadyResponseInfo response = apiInstance.googleProductInfoTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleProductInfoTasksReady");
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

[**MerchantGoogleProductInfoTasksReadyResponseInfo**](MerchantGoogleProductInfoTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleProductInfoTaskGetAdvanced"></a>
# **googleProductInfoTaskGetAdvanced**
> MerchantGoogleProductInfoTaskGetAdvancedResponseInfo googleProductInfoTaskGetAdvanced()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantGoogleProductInfoTaskGetAdvancedResponseInfo response = apiInstance.googleProductInfoTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleProductInfoTaskGetAdvanced");
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

[**MerchantGoogleProductInfoTaskGetAdvancedResponseInfo**](MerchantGoogleProductInfoTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSellersAdUrl"></a>
# **googleSellersAdUrl**
> MerchantGoogleSellersAdUrlResponseInfo googleSellersAdUrl()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String shop_ad_aclk = "DChcSEwiSl5TKpbPoAhVFmdUKHfa_B_wYABADGgJ3cw&sig";
    MerchantGoogleSellersAdUrlResponseInfo response = apiInstance.googleSellersAdUrl(shop_ad_aclk);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#googleSellersAdUrl");
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

[**MerchantGoogleSellersAdUrlResponseInfo**](MerchantGoogleSellersAdUrlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="merchantAmazonLocations"></a>
# **merchantAmazonLocations**
> MerchantAmazonLocationsResponseInfo merchantAmazonLocations()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantAmazonLocationsResponseInfo response = apiInstance.merchantAmazonLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantAmazonLocations");
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

[**MerchantAmazonLocationsResponseInfo**](MerchantAmazonLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="merchantAmazonLocationsCountry"></a>
# **merchantAmazonLocationsCountry**
> MerchantAmazonLocationsCountryResponseInfo merchantAmazonLocationsCountry()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String country = "us";
    MerchantAmazonLocationsCountryResponseInfo response = apiInstance.merchantAmazonLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantAmazonLocationsCountry");
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

[**MerchantAmazonLocationsCountryResponseInfo**](MerchantAmazonLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="merchantAmazonLanguages"></a>
# **merchantAmazonLanguages**
> MerchantAmazonLanguagesResponseInfo merchantAmazonLanguages()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantAmazonLanguagesResponseInfo response = apiInstance.merchantAmazonLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantAmazonLanguages");
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

[**MerchantAmazonLanguagesResponseInfo**](MerchantAmazonLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonProductsTaskPost"></a>
# **amazonProductsTaskPost**
> MerchantAmazonProductsTaskPostResponseInfo amazonProductsTaskPost()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    MerchantAmazonProductsTaskPostRequestInfo model = new MerchantAmazonProductsTaskPostRequestInfo()
           .keyword("shoes")
           .locationCode(2840)
           .languageCode("en_US");
    MerchantAmazonProductsTaskPostResponseInfo response = apiInstance.amazonProductsTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonProductsTaskPost");
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
    | **** | [**List&lt;List<MerchantAmazonProductsTaskPostRequestInfo>&gt;**](List<MerchantAmazonProductsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**MerchantAmazonProductsTaskPostResponseInfo**](MerchantAmazonProductsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonProductsTasksReady"></a>
# **amazonProductsTasksReady**
> MerchantAmazonProductsTasksReadyResponseInfo amazonProductsTasksReady()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantAmazonProductsTasksReadyResponseInfo response = apiInstance.amazonProductsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonProductsTasksReady");
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

[**MerchantAmazonProductsTasksReadyResponseInfo**](MerchantAmazonProductsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonProductsTaskGetAdvanced"></a>
# **amazonProductsTaskGetAdvanced**
> MerchantAmazonProductsTaskGetAdvancedResponseInfo amazonProductsTaskGetAdvanced()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantAmazonProductsTaskGetAdvancedResponseInfo response = apiInstance.amazonProductsTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonProductsTaskGetAdvanced");
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

[**MerchantAmazonProductsTaskGetAdvancedResponseInfo**](MerchantAmazonProductsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonProductsTaskGetHtml"></a>
# **amazonProductsTaskGetHtml**
> MerchantAmazonProductsTaskGetHtmlResponseInfo amazonProductsTaskGetHtml()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantAmazonProductsTaskGetHtmlResponseInfo response = apiInstance.amazonProductsTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonProductsTaskGetHtml");
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

[**MerchantAmazonProductsTaskGetHtmlResponseInfo**](MerchantAmazonProductsTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonAsinTaskPost"></a>
# **amazonAsinTaskPost**
> MerchantAmazonAsinTaskPostResponseInfo amazonAsinTaskPost()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    MerchantAmazonAsinTaskPostRequestInfo model = new MerchantAmazonAsinTaskPostRequestInfo()
           .asin("B0756FCPPN")
           .locationCode(2840)
           .languageCode("en_US");
    MerchantAmazonAsinTaskPostResponseInfo response = apiInstance.amazonAsinTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonAsinTaskPost");
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
    | **** | [**List&lt;List<MerchantAmazonAsinTaskPostRequestInfo>&gt;**](List<MerchantAmazonAsinTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**MerchantAmazonAsinTaskPostResponseInfo**](MerchantAmazonAsinTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonAsinTasksReady"></a>
# **amazonAsinTasksReady**
> MerchantAmazonAsinTasksReadyResponseInfo amazonAsinTasksReady()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantAmazonAsinTasksReadyResponseInfo response = apiInstance.amazonAsinTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonAsinTasksReady");
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

[**MerchantAmazonAsinTasksReadyResponseInfo**](MerchantAmazonAsinTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonAsinTaskGetAdvanced"></a>
# **amazonAsinTaskGetAdvanced**
> MerchantAmazonAsinTaskGetAdvancedResponseInfo amazonAsinTaskGetAdvanced()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantAmazonAsinTaskGetAdvancedResponseInfo response = apiInstance.amazonAsinTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonAsinTaskGetAdvanced");
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

[**MerchantAmazonAsinTaskGetAdvancedResponseInfo**](MerchantAmazonAsinTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonAsinTaskGetHtml"></a>
# **amazonAsinTaskGetHtml**
> MerchantAmazonAsinTaskGetHtmlResponseInfo amazonAsinTaskGetHtml()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantAmazonAsinTaskGetHtmlResponseInfo response = apiInstance.amazonAsinTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonAsinTaskGetHtml");
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

[**MerchantAmazonAsinTaskGetHtmlResponseInfo**](MerchantAmazonAsinTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonSellersTaskPost"></a>
# **amazonSellersTaskPost**
> MerchantAmazonSellersTaskPostResponseInfo amazonSellersTaskPost()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    MerchantAmazonSellersTaskPostRequestInfo model = new MerchantAmazonSellersTaskPostRequestInfo()
           .asin("B085RFFC9Q")
           .locationCode(2840)
           .languageCode("en_US");
    MerchantAmazonSellersTaskPostResponseInfo response = apiInstance.amazonSellersTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonSellersTaskPost");
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
    | **** | [**List&lt;List<MerchantAmazonSellersTaskPostRequestInfo>&gt;**](List<MerchantAmazonSellersTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**MerchantAmazonSellersTaskPostResponseInfo**](MerchantAmazonSellersTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonSellersTasksReady"></a>
# **amazonSellersTasksReady**
> MerchantAmazonSellersTasksReadyResponseInfo amazonSellersTasksReady()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantAmazonSellersTasksReadyResponseInfo response = apiInstance.amazonSellersTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonSellersTasksReady");
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

[**MerchantAmazonSellersTasksReadyResponseInfo**](MerchantAmazonSellersTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonSellersTaskGetAdvanced"></a>
# **amazonSellersTaskGetAdvanced**
> MerchantAmazonSellersTaskGetAdvancedResponseInfo amazonSellersTaskGetAdvanced()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantAmazonSellersTaskGetAdvancedResponseInfo response = apiInstance.amazonSellersTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonSellersTaskGetAdvanced");
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

[**MerchantAmazonSellersTaskGetAdvancedResponseInfo**](MerchantAmazonSellersTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonSellersTaskGetHtml"></a>
# **amazonSellersTaskGetHtml**
> MerchantAmazonSellersTaskGetHtmlResponseInfo amazonSellersTaskGetHtml()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantAmazonSellersTaskGetHtmlResponseInfo response = apiInstance.amazonSellersTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonSellersTaskGetHtml");
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

[**MerchantAmazonSellersTaskGetHtmlResponseInfo**](MerchantAmazonSellersTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonReviewsTaskPost"></a>
# **amazonReviewsTaskPost**
> MerchantAmazonReviewsTaskPostResponseInfo amazonReviewsTaskPost()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    MerchantAmazonReviewsTaskPostRequestInfo model = new MerchantAmazonReviewsTaskPostRequestInfo()
           .asin("B0773ZY26F")
           .locationCode(2840)
           .languageCode("en_US");
    MerchantAmazonReviewsTaskPostResponseInfo response = apiInstance.amazonReviewsTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonReviewsTaskPost");
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
    | **** | [**List&lt;List<MerchantAmazonReviewsTaskPostRequestInfo>&gt;**](List<MerchantAmazonReviewsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**MerchantAmazonReviewsTaskPostResponseInfo**](MerchantAmazonReviewsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonReviewsTasksReady"></a>
# **amazonReviewsTasksReady**
> MerchantAmazonReviewsTasksReadyResponseInfo amazonReviewsTasksReady()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);

    MerchantAmazonReviewsTasksReadyResponseInfo response = apiInstance.amazonReviewsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonReviewsTasksReady");
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

[**MerchantAmazonReviewsTasksReadyResponseInfo**](MerchantAmazonReviewsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonReviewsTaskGetAdvanced"></a>
# **amazonReviewsTaskGetAdvanced**
> MerchantAmazonReviewsTaskGetAdvancedResponseInfo amazonReviewsTaskGetAdvanced()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantAmazonReviewsTaskGetAdvancedResponseInfo response = apiInstance.amazonReviewsTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonReviewsTaskGetAdvanced");
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

[**MerchantAmazonReviewsTaskGetAdvancedResponseInfo**](MerchantAmazonReviewsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="amazonReviewsTaskGetHtml"></a>
# **amazonReviewsTaskGetHtml**
> MerchantAmazonReviewsTaskGetHtmlResponseInfo amazonReviewsTaskGetHtml()


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
    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    MerchantAmazonReviewsTaskGetHtmlResponseInfo response = apiInstance.amazonReviewsTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#amazonReviewsTaskGetHtml");
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

[**MerchantAmazonReviewsTaskGetHtmlResponseInfo**](MerchantAmazonReviewsTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
# AppendixApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appendixErrors**](AppendixApi.md#appendixErrors) | **GET** /v3/appendix/errors |  |
| [**appendixStatus**](AppendixApi.md#appendixStatus) | **GET** /v3/appendix/status |  |
| [**userData**](AppendixApi.md#userData) | **GET** /v3/appendix/user_data |  |
| [**webhookResend**](AppendixApi.md#webhookResend) | **POST** /v3/appendix/webhook_resend |  |


<a id="appendixErrors"></a>
# **appendixErrors**
> AppendixErrorsResponseInfo appendixErrors()



This endpoint returns a list of possible DataForSEO API errors and general status codes. Below you will find a list of HTTP response codes and internal messages. We recommend storing the data connected to error codes in your application log and designing a necessary system for handling related exceptional or error conditions. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/errors/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.AppendixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppendixApi apiInstance = new AppendixApi(defaultClient);
    try {
      AppendixErrorsResponseInfo result = apiInstance.appendixErrors();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppendixApi#appendixErrors");
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

[**AppendixErrorsResponseInfo**](AppendixErrorsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="appendixStatus"></a>
# **appendixStatus**
> AppendixStatusResponseInfo appendixStatus()



By calling this API you will receive detailed information about the current status of all our APIs and endpoints. You will also get a full issue description if a problem occurs. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/status/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.AppendixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppendixApi apiInstance = new AppendixApi(defaultClient);
    try {
      AppendixStatusResponseInfo result = apiInstance.appendixStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppendixApi#appendixStatus");
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

[**AppendixStatusResponseInfo**](AppendixStatusResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="userData"></a>
# **userData**
> AppendixUserDataResponseInfo userData()



You will receive detailed information about your API usage, prices, spending and other account details by calling this API. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/user_data/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.AppendixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppendixApi apiInstance = new AppendixApi(defaultClient);
    try {
      AppendixUserDataResponseInfo result = apiInstance.userData();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppendixApi#userData");
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

[**AppendixUserDataResponseInfo**](AppendixUserDataResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="webhookResend"></a>
# **webhookResend**
> AppendixWebhookResendResponseInfo webhookResend(appendixWebhookResendRequestInfo)



Using this endpoint you can resend webhooks (pingbacks and postbacks) for up to 100 specified tasks. Note: Your account will not be double-charged for resending a webhook. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/webhook_resend/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.AppendixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppendixApi apiInstance = new AppendixApi(defaultClient);
    List<AppendixWebhookResendRequestInfo> appendixWebhookResendRequestInfo = Arrays.asList(); // List<AppendixWebhookResendRequestInfo> | 
    try {
      AppendixWebhookResendResponseInfo result = apiInstance.webhookResend(appendixWebhookResendRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppendixApi#webhookResend");
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
| **appendixWebhookResendRequestInfo** | [**List&lt;AppendixWebhookResendRequestInfo&gt;**](AppendixWebhookResendRequestInfo.md)|  | [optional] |

### Return type

[**AppendixWebhookResendResponseInfo**](AppendixWebhookResendResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


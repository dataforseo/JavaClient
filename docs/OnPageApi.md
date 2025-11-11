# OnPageApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**onPageIdList**](OnPageApi.md#onPageIdList) | **POST**  /v3/on_page/id_list  |
| [**onPageErrors**](OnPageApi.md#onPageErrors) | **POST**  /v3/on_page/errors  |
| [**forceStop**](OnPageApi.md#forceStop) | **POST**  /v3/on_page/force_stop  |
| [**onPageAvailableFilters**](OnPageApi.md#onPageAvailableFilters) | **GET**  /v3/on_page/available_filters  |
| [**taskPost**](OnPageApi.md#taskPost) | **POST**  /v3/on_page/task_post  |
| [**onPageTasksReady**](OnPageApi.md#onPageTasksReady) | **GET**  /v3/on_page/tasks_ready  |
| [**summary**](OnPageApi.md#summary) | **GET**  /v3/on_page/summary/{id}  |
| [**pages**](OnPageApi.md#pages) | **POST**  /v3/on_page/pages  |
| [**pagesByResource**](OnPageApi.md#pagesByResource) | **POST**  /v3/on_page/pages_by_resource  |
| [**resources**](OnPageApi.md#resources) | **POST**  /v3/on_page/resources  |
| [**duplicateTags**](OnPageApi.md#duplicateTags) | **POST**  /v3/on_page/duplicate_tags  |
| [**duplicateContent**](OnPageApi.md#duplicateContent) | **POST**  /v3/on_page/duplicate_content  |
| [**links**](OnPageApi.md#links) | **POST**  /v3/on_page/links  |
| [**redirectChains**](OnPageApi.md#redirectChains) | **POST**  /v3/on_page/redirect_chains  |
| [**nonIndexable**](OnPageApi.md#nonIndexable) | **POST**  /v3/on_page/non_indexable  |
| [**waterfall**](OnPageApi.md#waterfall) | **POST**  /v3/on_page/waterfall  |
| [**keywordDensity**](OnPageApi.md#keywordDensity) | **POST**  /v3/on_page/keyword_density  |
| [**microdata**](OnPageApi.md#microdata) | **POST**  /v3/on_page/microdata  |
| [**rawHtml**](OnPageApi.md#rawHtml) | **POST**  /v3/on_page/raw_html  |
| [**pageScreenshot**](OnPageApi.md#pageScreenshot) | **POST**  /v3/on_page/page_screenshot  |
| [**contentParsing**](OnPageApi.md#contentParsing) | **POST**  /v3/on_page/content_parsing  |
| [**contentParsingLive**](OnPageApi.md#contentParsingLive) | **POST**  /v3/on_page/content_parsing/live  |
| [**instantPages**](OnPageApi.md#instantPages) | **POST**  /v3/on_page/instant_pages  |
| [**onPageLighthouseLanguages**](OnPageApi.md#onPageLighthouseLanguages) | **GET**  /v3/on_page/lighthouse/languages  |
| [**lighthouseAudits**](OnPageApi.md#lighthouseAudits) | **GET**  /v3/on_page/lighthouse/audits  |
| [**lighthouseVersions**](OnPageApi.md#lighthouseVersions) | **GET**  /v3/on_page/lighthouse/versions  |
| [**lighthouseTaskPost**](OnPageApi.md#lighthouseTaskPost) | **POST**  /v3/on_page/lighthouse/task_post  |
| [**lighthouseTasksReady**](OnPageApi.md#lighthouseTasksReady) | **GET**  /v3/on_page/lighthouse/tasks_ready  |
| [**lighthouseTaskGetJson**](OnPageApi.md#lighthouseTaskGetJson) | **GET**  /v3/on_page/lighthouse/task_get/json/{id}  |
| [**lighthouseLiveJson**](OnPageApi.md#lighthouseLiveJson) | **POST**  /v3/on_page/lighthouse/live/json  |

<a id="onPageIdList"></a>
# **onPageIdList**
> OnPageIdListResponseInfo onPageIdList()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageIdListRequestInfo model = new OnPageIdListRequestInfo()
           .datetimeFrom("2025-08-10 11:02:46 +00:00")
           .datetimeTo("2025-10-10 11:02:46 +00:00")
           .limit(100)
           .offset(0)
           .sort("desc");
    OnPageIdListResponseInfo response = apiInstance.onPageIdList(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#onPageIdList");
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
    | **** | [**List&lt;List<OnPageIdListRequestInfo>&gt;**](List<OnPageIdListRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageIdListResponseInfo**](OnPageIdListResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="onPageErrors"></a>
# **onPageErrors**
> OnPageErrorsResponseInfo onPageErrors()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageErrorsRequestInfo model = new OnPageErrorsRequestInfo()
           .limit(10)
           .offset(0)
           .filteredFunction("pingback_url");
    OnPageErrorsResponseInfo response = apiInstance.onPageErrors(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#onPageErrors");
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
    | **** | [**List&lt;List<OnPageErrorsRequestInfo>&gt;**](List<OnPageErrorsRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageErrorsResponseInfo**](OnPageErrorsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="forceStop"></a>
# **forceStop**
> OnPageForceStopResponseInfo forceStop()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageForceStopRequestInfo model = new OnPageForceStopRequestInfo()
           .id("08121600-1535-0216-0000-37b4c7a34453");
    OnPageForceStopResponseInfo response = apiInstance.forceStop(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#forceStop");
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
    | **** | [**List&lt;List<OnPageForceStopRequestInfo>&gt;**](List<OnPageForceStopRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageForceStopResponseInfo**](OnPageForceStopResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="onPageAvailableFilters"></a>
# **onPageAvailableFilters**
> OnPageAvailableFiltersResponseInfo onPageAvailableFilters()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);

    OnPageAvailableFiltersResponseInfo response = apiInstance.onPageAvailableFilters();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#onPageAvailableFilters");
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

[**OnPageAvailableFiltersResponseInfo**](OnPageAvailableFiltersResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="taskPost"></a>
# **taskPost**
> OnPageTaskPostResponseInfo taskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageTaskPostRequestInfo model = new OnPageTaskPostRequestInfo()
           .target("dataforseo.com")
           .maxCrawlPages(10)
           .loadResources(true)
           .enableJavascript(true)
           .customJs("meta = {}; meta.url = document.URL; meta;")
           .tag("some_string_123")
           .pingbackUrl("https://your-server.com/pingscript?id=$id&tag=$tag");
    OnPageTaskPostResponseInfo response = apiInstance.taskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#taskPost");
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
    | **** | [**List&lt;List<OnPageTaskPostRequestInfo>&gt;**](List<OnPageTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageTaskPostResponseInfo**](OnPageTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="onPageTasksReady"></a>
# **onPageTasksReady**
> OnPageTasksReadyResponseInfo onPageTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);

    OnPageTasksReadyResponseInfo response = apiInstance.onPageTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#onPageTasksReady");
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

[**OnPageTasksReadyResponseInfo**](OnPageTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="summary"></a>
# **summary**
> OnPageSummaryResponseInfo summary()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    OnPageSummaryResponseInfo response = apiInstance.summary(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#summary");
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

[**OnPageSummaryResponseInfo**](OnPageSummaryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="pages"></a>
# **pages**
> OnPagePagesResponseInfo pages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPagePagesRequestInfo model = new OnPagePagesRequestInfo()
           .id("07281559-0695-0216-0000-c269be8b7592")
           .limit(10);
    OnPagePagesResponseInfo response = apiInstance.pages(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#pages");
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
    | **** | [**List&lt;List<OnPagePagesRequestInfo>&gt;**](List<OnPagePagesRequestInfo>.md)|  | [optional] |



### Return type

[**OnPagePagesResponseInfo**](OnPagePagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="pagesByResource"></a>
# **pagesByResource**
> OnPagePagesByResourceResponseInfo pagesByResource()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPagePagesByResourceRequestInfo model = new OnPagePagesByResourceRequestInfo()
           .id("02241700-1535-0216-0000-034137259bc1")
           .url("https://www.etsy.com/about/jobs.workco2018.js?");
    OnPagePagesByResourceResponseInfo response = apiInstance.pagesByResource(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#pagesByResource");
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
    | **** | [**List&lt;List<OnPagePagesByResourceRequestInfo>&gt;**](List<OnPagePagesByResourceRequestInfo>.md)|  | [optional] |



### Return type

[**OnPagePagesByResourceResponseInfo**](OnPagePagesByResourceResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="resources"></a>
# **resources**
> OnPageResourcesResponseInfo resources()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageResourcesRequestInfo model = new OnPageResourcesRequestInfo()
           .id("07281559-0695-0216-0000-c269be8b7592")
           .limit(10);
    OnPageResourcesResponseInfo response = apiInstance.resources(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#resources");
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
    | **** | [**List&lt;List<OnPageResourcesRequestInfo>&gt;**](List<OnPageResourcesRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageResourcesResponseInfo**](OnPageResourcesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="duplicateTags"></a>
# **duplicateTags**
> OnPageDuplicateTagsResponseInfo duplicateTags()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageDuplicateTagsRequestInfo model = new OnPageDuplicateTagsRequestInfo()
           .id("07281559-0695-0216-0000-c269be8b7592")
           .type("duplicate_description")
           .limit(10);
    OnPageDuplicateTagsResponseInfo response = apiInstance.duplicateTags(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#duplicateTags");
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
    | **** | [**List&lt;List<OnPageDuplicateTagsRequestInfo>&gt;**](List<OnPageDuplicateTagsRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageDuplicateTagsResponseInfo**](OnPageDuplicateTagsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="duplicateContent"></a>
# **duplicateContent**
> OnPageDuplicateContentResponseInfo duplicateContent()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageDuplicateContentRequestInfo model = new OnPageDuplicateContentRequestInfo()
           .id("07281559-0695-0216-0000-c269be8b7592")
           .url("https://www.etsy.com/");
    OnPageDuplicateContentResponseInfo response = apiInstance.duplicateContent(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#duplicateContent");
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
    | **** | [**List&lt;List<OnPageDuplicateContentRequestInfo>&gt;**](List<OnPageDuplicateContentRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageDuplicateContentResponseInfo**](OnPageDuplicateContentResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="links"></a>
# **links**
> OnPageLinksResponseInfo links()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageLinksRequestInfo model = new OnPageLinksRequestInfo()
           .id("07281559-0695-0216-0000-c269be8b7592")
           .pageFrom("/apis/google-trends-api")
           .limit(10);
    OnPageLinksResponseInfo response = apiInstance.links(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#links");
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
    | **** | [**List&lt;List<OnPageLinksRequestInfo>&gt;**](List<OnPageLinksRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageLinksResponseInfo**](OnPageLinksResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="redirectChains"></a>
# **redirectChains**
> OnPageRedirectChainsResponseInfo redirectChains()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageRedirectChainsRequestInfo model = new OnPageRedirectChainsRequestInfo()
           .id("03051327-4536-0216-1000-3b458a2cfcca")
           .url("https://test_rdr.dataforseo.com/a/");
    OnPageRedirectChainsResponseInfo response = apiInstance.redirectChains(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#redirectChains");
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
    | **** | [**List&lt;List<OnPageRedirectChainsRequestInfo>&gt;**](List<OnPageRedirectChainsRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageRedirectChainsResponseInfo**](OnPageRedirectChainsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="nonIndexable"></a>
# **nonIndexable**
> OnPageNonIndexableResponseInfo nonIndexable()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageNonIndexableRequestInfo model = new OnPageNonIndexableRequestInfo()
           .id("07281559-0695-0216-0000-c269be8b7592")
           .limit(10);
    OnPageNonIndexableResponseInfo response = apiInstance.nonIndexable(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#nonIndexable");
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
    | **** | [**List&lt;List<OnPageNonIndexableRequestInfo>&gt;**](List<OnPageNonIndexableRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageNonIndexableResponseInfo**](OnPageNonIndexableResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="waterfall"></a>
# **waterfall**
> OnPageWaterfallResponseInfo waterfall()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageWaterfallRequestInfo model = new OnPageWaterfallRequestInfo()
           .id("08101204-0696-0216-0000-644a7b21a48a")
           .url("https://dataforseo.com/tag/broken-links");
    OnPageWaterfallResponseInfo response = apiInstance.waterfall(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#waterfall");
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
    | **** | [**List&lt;List<OnPageWaterfallRequestInfo>&gt;**](List<OnPageWaterfallRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageWaterfallResponseInfo**](OnPageWaterfallResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="keywordDensity"></a>
# **keywordDensity**
> OnPageKeywordDensityResponseInfo keywordDensity()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageKeywordDensityRequestInfo model = new OnPageKeywordDensityRequestInfo()
           .id("09101923-1535-0216-0000-2389a8854b70")
           .keywordLength(2)
           .url("https://dataforseo.com/");
    OnPageKeywordDensityResponseInfo response = apiInstance.keywordDensity(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#keywordDensity");
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
    | **** | [**List&lt;List<OnPageKeywordDensityRequestInfo>&gt;**](List<OnPageKeywordDensityRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageKeywordDensityResponseInfo**](OnPageKeywordDensityResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="microdata"></a>
# **microdata**
> OnPageMicrodataResponseInfo microdata()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageMicrodataRequestInfo model = new OnPageMicrodataRequestInfo()
           .id("02241700-1535-0216-0000-034137259bc1")
           .url("https://dataforseo.com/apis");
    OnPageMicrodataResponseInfo response = apiInstance.microdata(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#microdata");
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
    | **** | [**List&lt;List<OnPageMicrodataRequestInfo>&gt;**](List<OnPageMicrodataRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageMicrodataResponseInfo**](OnPageMicrodataResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="rawHtml"></a>
# **rawHtml**
> OnPageRawHtmlResponseInfo rawHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageRawHtmlRequestInfo model = new OnPageRawHtmlRequestInfo()
           .id("07281559-0695-0216-0000-c269be8b7592")
           .url("https://dataforseo.com/apis");
    OnPageRawHtmlResponseInfo response = apiInstance.rawHtml(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#rawHtml");
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
    | **** | [**List&lt;List<OnPageRawHtmlRequestInfo>&gt;**](List<OnPageRawHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageRawHtmlResponseInfo**](OnPageRawHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="pageScreenshot"></a>
# **pageScreenshot**
> OnPagePageScreenshotResponseInfo pageScreenshot()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPagePageScreenshotRequestInfo model = new OnPagePageScreenshotRequestInfo()
           .url("https://dataforseo.com/apis");
    OnPagePageScreenshotResponseInfo response = apiInstance.pageScreenshot(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#pageScreenshot");
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
    | **** | [**List&lt;List<OnPagePageScreenshotRequestInfo>&gt;**](List<OnPagePageScreenshotRequestInfo>.md)|  | [optional] |



### Return type

[**OnPagePageScreenshotResponseInfo**](OnPagePageScreenshotResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentParsing"></a>
# **contentParsing**
> OnPageContentParsingResponseInfo contentParsing()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageContentParsingRequestInfo model = new OnPageContentParsingRequestInfo()
           .url("https://dataforseo.com/blog/a-versatile-alternative-to-google-trends-exploring-the-power-of-dataforseo-trends-api")
           .id("11161551-1535-0216-0000-500b3f307f92");
    OnPageContentParsingResponseInfo response = apiInstance.contentParsing(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#contentParsing");
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
    | **** | [**List&lt;List<OnPageContentParsingRequestInfo>&gt;**](List<OnPageContentParsingRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageContentParsingResponseInfo**](OnPageContentParsingResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="contentParsingLive"></a>
# **contentParsingLive**
> OnPageContentParsingLiveResponseInfo contentParsingLive()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageContentParsingLiveRequestInfo model = new OnPageContentParsingLiveRequestInfo()
           .url("https://dataforseo.com/blog/a-versatile-alternative-to-google-trends-exploring-the-power-of-dataforseo-trends-api");
    OnPageContentParsingLiveResponseInfo response = apiInstance.contentParsingLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#contentParsingLive");
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
    | **** | [**List&lt;List<OnPageContentParsingLiveRequestInfo>&gt;**](List<OnPageContentParsingLiveRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageContentParsingLiveResponseInfo**](OnPageContentParsingLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="instantPages"></a>
# **instantPages**
> OnPageInstantPagesResponseInfo instantPages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageInstantPagesRequestInfo model = new OnPageInstantPagesRequestInfo()
           .url("https://dataforseo.com/blog")
           .enableJavascript(true)
           .customJs("meta = {}; meta.url = document.URL; meta;");
    OnPageInstantPagesResponseInfo response = apiInstance.instantPages(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#instantPages");
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
    | **** | [**List&lt;List<OnPageInstantPagesRequestInfo>&gt;**](List<OnPageInstantPagesRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageInstantPagesResponseInfo**](OnPageInstantPagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="onPageLighthouseLanguages"></a>
# **onPageLighthouseLanguages**
> OnPageLighthouseLanguagesResponseInfo onPageLighthouseLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);

    OnPageLighthouseLanguagesResponseInfo response = apiInstance.onPageLighthouseLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#onPageLighthouseLanguages");
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

[**OnPageLighthouseLanguagesResponseInfo**](OnPageLighthouseLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="lighthouseAudits"></a>
# **lighthouseAudits**
> OnPageLighthouseAuditsResponseInfo lighthouseAudits()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);

    OnPageLighthouseAuditsResponseInfo response = apiInstance.lighthouseAudits();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#lighthouseAudits");
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

[**OnPageLighthouseAuditsResponseInfo**](OnPageLighthouseAuditsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="lighthouseVersions"></a>
# **lighthouseVersions**
> OnPageLighthouseVersionsResponseInfo lighthouseVersions()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);

    OnPageLighthouseVersionsResponseInfo response = apiInstance.lighthouseVersions();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#lighthouseVersions");
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

[**OnPageLighthouseVersionsResponseInfo**](OnPageLighthouseVersionsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="lighthouseTaskPost"></a>
# **lighthouseTaskPost**
> OnPageLighthouseTaskPostResponseInfo lighthouseTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageLighthouseTaskPostRequestInfo model = new OnPageLighthouseTaskPostRequestInfo()
           .url("https://dataforseo.com")
           .forMobile(true)
           .tag("some_string_123")
           .pingbackUrl("https://your-server.com/pingscript?id=$id&tag=$tag");
    OnPageLighthouseTaskPostResponseInfo response = apiInstance.lighthouseTaskPost(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#lighthouseTaskPost");
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
    | **** | [**List&lt;List<OnPageLighthouseTaskPostRequestInfo>&gt;**](List<OnPageLighthouseTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageLighthouseTaskPostResponseInfo**](OnPageLighthouseTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="lighthouseTasksReady"></a>
# **lighthouseTasksReady**
> OnPageLighthouseTasksReadyResponseInfo lighthouseTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);

    OnPageLighthouseTasksReadyResponseInfo response = apiInstance.lighthouseTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#lighthouseTasksReady");
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

[**OnPageLighthouseTasksReadyResponseInfo**](OnPageLighthouseTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="lighthouseTaskGetJson"></a>
# **lighthouseTaskGetJson**
> OnPageLighthouseTaskGetJsonResponseInfo lighthouseTaskGetJson()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000";
    OnPageLighthouseTaskGetJsonResponseInfo response = apiInstance.lighthouseTaskGetJson(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#lighthouseTaskGetJson");
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

[**OnPageLighthouseTaskGetJsonResponseInfo**](OnPageLighthouseTaskGetJsonResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="lighthouseLiveJson"></a>
# **lighthouseLiveJson**
> OnPageLighthouseLiveJsonResponseInfo lighthouseLiveJson()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    OnPageApi apiInstance = new OnPageApi(defaultClient);
    OnPageLighthouseLiveJsonRequestInfo model = new OnPageLighthouseLiveJsonRequestInfo()
           .url("https://dataforseo.com")
           .forMobile(true)
           .tag("some_string_123");
    OnPageLighthouseLiveJsonResponseInfo response = apiInstance.lighthouseLiveJson(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#lighthouseLiveJson");
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
    | **** | [**List&lt;List<OnPageLighthouseLiveJsonRequestInfo>&gt;**](List<OnPageLighthouseLiveJsonRequestInfo>.md)|  | [optional] |



### Return type

[**OnPageLighthouseLiveJsonResponseInfo**](OnPageLighthouseLiveJsonResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
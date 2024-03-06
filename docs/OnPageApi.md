[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# OnPageApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contentParsing**](OnPageApi.md#contentParsing) | **POST** /v3/on_page/content_parsing |  |
| [**contentParsingLive**](OnPageApi.md#contentParsingLive) | **POST** /v3/on_page/content_parsing/live |  |
| [**duplicateContent**](OnPageApi.md#duplicateContent) | **POST** /v3/on_page/duplicate_content |  |
| [**duplicateTags**](OnPageApi.md#duplicateTags) | **POST** /v3/on_page/duplicate_tags |  |
| [**forceStop**](OnPageApi.md#forceStop) | **POST** /v3/on_page/force_stop |  |
| [**instantPages**](OnPageApi.md#instantPages) | **POST** /v3/on_page/instant_pages |  |
| [**keywordDensity**](OnPageApi.md#keywordDensity) | **POST** /v3/on_page/keyword_density |  |
| [**lighthouseAudits**](OnPageApi.md#lighthouseAudits) | **GET** /v3/on_page/lighthouse/audits |  |
| [**lighthouseLiveJson**](OnPageApi.md#lighthouseLiveJson) | **POST** /v3/on_page/lighthouse/live/json |  |
| [**lighthouseTaskGetJson**](OnPageApi.md#lighthouseTaskGetJson) | **GET** /v3/on_page/lighthouse/task_get/json/{id} |  |
| [**lighthouseTaskPost**](OnPageApi.md#lighthouseTaskPost) | **POST** /v3/on_page/lighthouse/task_post |  |
| [**lighthouseTasksReady**](OnPageApi.md#lighthouseTasksReady) | **GET** /v3/on_page/lighthouse/tasks_ready |  |
| [**lighthouseVersions**](OnPageApi.md#lighthouseVersions) | **GET** /v3/on_page/lighthouse/versions |  |
| [**links**](OnPageApi.md#links) | **POST** /v3/on_page/links |  |
| [**microdata**](OnPageApi.md#microdata) | **POST** /v3/on_page/microdata |  |
| [**nonIndexable**](OnPageApi.md#nonIndexable) | **POST** /v3/on_page/non_indexable |  |
| [**onPageAvailableFilters**](OnPageApi.md#onPageAvailableFilters) | **GET** /v3/on_page/available_filters |  |
| [**onPageErrors**](OnPageApi.md#onPageErrors) | **POST** /v3/on_page/errors |  |
| [**onPageIdList**](OnPageApi.md#onPageIdList) | **POST** /v3/on_page/id_list |  |
| [**onPageLighthouseLanguages**](OnPageApi.md#onPageLighthouseLanguages) | **GET** /v3/on_page/lighthouse/languages |  |
| [**pageScreenshot**](OnPageApi.md#pageScreenshot) | **POST** /v3/on_page/page_screenshot |  |
| [**pages**](OnPageApi.md#pages) | **POST** /v3/on_page/pages |  |
| [**pagesByResource**](OnPageApi.md#pagesByResource) | **POST** /v3/on_page/pages_by_resource |  |
| [**rawHtml**](OnPageApi.md#rawHtml) | **POST** /v3/on_page/raw_html |  |
| [**redirectChains**](OnPageApi.md#redirectChains) | **POST** /v3/on_page/redirect_chains |  |
| [**resources**](OnPageApi.md#resources) | **POST** /v3/on_page/resources |  |
| [**summary**](OnPageApi.md#summary) | **GET** /v3/on_page/summary/{id} |  |
| [**taskPost**](OnPageApi.md#taskPost) | **POST** /v3/on_page/task_post |  |
| [**tasksReady**](OnPageApi.md#tasksReady) | **GET** /v3/on_page/tasks_ready |  |
| [**waterfall**](OnPageApi.md#waterfall) | **POST** /v3/on_page/waterfall |  |

<a id="contentParsing"></a>

# **contentParsing**

> OnPageContentParsingResponseInfo contentParsing(onPageContentParsingRequestInfo)

‌‌ This endpoint allows parsing the content on any page you specify and will return the structured content of the target page, including link URLs, anchors, headings, and textual content. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/content_parsing/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageContentParsingRequestInfo> onPageContentParsingRequestInfo = Arrays.asList(); // List<OnPageContentParsingRequestInfo> | 
    try {
      OnPageContentParsingResponseInfo result = apiInstance.contentParsing(onPageContentParsingRequestInfo);
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
| **onPageContentParsingRequestInfo** | [**List&lt;OnPageContentParsingRequestInfo&gt;**](OnPageContentParsingRequestInfo.md)|  | [optional] |

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

> OnPageContentParsingLiveResponseInfo contentParsingLive(onPageContentParsingLiveRequestInfo)

‌‌ This endpoint allows parsing the content on any page you specify and will return the structured content of the target page, including link URLs, anchors, headings, and textual content. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/content_parsing/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageContentParsingLiveRequestInfo> onPageContentParsingLiveRequestInfo = Arrays.asList(); // List<OnPageContentParsingLiveRequestInfo> | 
    try {
      OnPageContentParsingLiveResponseInfo result = apiInstance.contentParsingLive(onPageContentParsingLiveRequestInfo);
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
| **onPageContentParsingLiveRequestInfo** | [**List&lt;OnPageContentParsingLiveRequestInfo&gt;**](OnPageContentParsingLiveRequestInfo.md)|  | [optional] |

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

<a id="duplicateContent"></a>

# **duplicateContent**

> OnPageDuplicateContentResponseInfo duplicateContent(onPageDuplicateContentRequestInfo)

‌‌ This endpoint returns a list of pages that have content similar to the page specified in the request. The response also contains data related to page performance and the similarity index that indicates how similar the compared pages are. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/duplicate_content/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageDuplicateContentRequestInfo> onPageDuplicateContentRequestInfo = Arrays.asList(); // List<OnPageDuplicateContentRequestInfo> | 
    try {
      OnPageDuplicateContentResponseInfo result = apiInstance.duplicateContent(onPageDuplicateContentRequestInfo);
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
| **onPageDuplicateContentRequestInfo** | [**List&lt;OnPageDuplicateContentRequestInfo&gt;**](OnPageDuplicateContentRequestInfo.md)|  | [optional] |

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

<a id="duplicateTags"></a>

# **duplicateTags**

> OnPageDuplicateTagsResponseInfo duplicateTags(onPageDuplicateTagsRequestInfo)

‌‌ This endpoint returns a list of pages that contain duplicate title or description tags. The response also contains data related to page performance. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/duplicate_tags/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageDuplicateTagsRequestInfo> onPageDuplicateTagsRequestInfo = Arrays.asList(); // List<OnPageDuplicateTagsRequestInfo> | 
    try {
      OnPageDuplicateTagsResponseInfo result = apiInstance.duplicateTags(onPageDuplicateTagsRequestInfo);
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
| **onPageDuplicateTagsRequestInfo** | [**List&lt;OnPageDuplicateTagsRequestInfo&gt;**](OnPageDuplicateTagsRequestInfo.md)|  | [optional] |

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

<a id="forceStop"></a>

# **forceStop**

> OnPageForceStopResponseInfo forceStop(onPageForceStopRequestInfo)

‌‌ This endpoint is designed to force stop the crawl process of websites you specified in a task. The execution of all the tasks associated with the IDs indicated in your request to this endpoint will be stopped. You will still be able to obtain the data on pages that have been scanned until the crawling process was stopped. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/force_stop/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageForceStopRequestInfo> onPageForceStopRequestInfo = Arrays.asList(); // List<OnPageForceStopRequestInfo> | 
    try {
      OnPageForceStopResponseInfo result = apiInstance.forceStop(onPageForceStopRequestInfo);
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
| **onPageForceStopRequestInfo** | [**List&lt;OnPageForceStopRequestInfo&gt;**](OnPageForceStopRequestInfo.md)|  | [optional] |

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

<a id="instantPages"></a>

# **instantPages**

> OnPageInstantPagesResponseInfo instantPages(onPageInstantPagesRequestInfo)

‌‌ Using this function you will get page-specific data with detailed information on how well a particular page is optimized for organic search. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/instant_pages/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageInstantPagesRequestInfo> onPageInstantPagesRequestInfo = Arrays.asList(); // List<OnPageInstantPagesRequestInfo> | 
    try {
      OnPageInstantPagesResponseInfo result = apiInstance.instantPages(onPageInstantPagesRequestInfo);
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
| **onPageInstantPagesRequestInfo** | [**List&lt;OnPageInstantPagesRequestInfo&gt;**](OnPageInstantPagesRequestInfo.md)|  | [optional] |

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

<a id="keywordDensity"></a>

# **keywordDensity**

> OnPageKeywordDensityResponseInfo keywordDensity(onPageKeywordDensityRequestInfo)

‌‌ This endpoint will provide you with keyword density and keyword frequency data for terms appearing on the specified website or web page. You can filter and sort the data that will be retrieved with this API call. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/keyword_density/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageKeywordDensityRequestInfo> onPageKeywordDensityRequestInfo = Arrays.asList(); // List<OnPageKeywordDensityRequestInfo> | 
    try {
      OnPageKeywordDensityResponseInfo result = apiInstance.keywordDensity(onPageKeywordDensityRequestInfo);
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
| **onPageKeywordDensityRequestInfo** | [**List&lt;OnPageKeywordDensityRequestInfo&gt;**](OnPageKeywordDensityRequestInfo.md)|  | [optional] |

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

<a id="lighthouseAudits"></a>

# **lighthouseAudits**

> OnPageLighthouseAuditsResponseInfo lighthouseAudits()

The OnPage Lighthouse API is based on Google’s open-source Lighthouse project and provides data on the quality of web pages. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/lighthouse/audits/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    try {
      OnPageLighthouseAuditsResponseInfo result = apiInstance.lighthouseAudits();
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

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="lighthouseLiveJson"></a>

# **lighthouseLiveJson**

> OnPageLighthouseLiveJsonResponseInfo lighthouseLiveJson(onPageLighthouseLiveJsonRequestInfo)

‌The OnPage Lighthouse API is based on Google’s open-source Lighthouse project for measuring the quality of web pages and web apps. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/lighthouse/live/json/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageLighthouseLiveJsonRequestInfo> onPageLighthouseLiveJsonRequestInfo = Arrays.asList(); // List<OnPageLighthouseLiveJsonRequestInfo> | 
    try {
      OnPageLighthouseLiveJsonResponseInfo result = apiInstance.lighthouseLiveJson(onPageLighthouseLiveJsonRequestInfo);
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
| **onPageLighthouseLiveJsonRequestInfo** | [**List&lt;OnPageLighthouseLiveJsonRequestInfo&gt;**](OnPageLighthouseLiveJsonRequestInfo.md)|  | [optional] |

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

<a id="lighthouseTaskGetJson"></a>

# **lighthouseTaskGetJson**

> OnPageLighthouseTaskGetJsonResponseInfo lighthouseTaskGetJson(id)

‌ The OnPage Lighthouse API is based on Google’s open-source Lighthouse project for measuring the quality of web pages and web apps. This endpoint will provide you with the results of Lighthouse Audit. Use the id received in the response of your Task POST request to get the results. The response will include data about all categories and audits specified in the Task POST. By default, the response will include all available data about the webpage including its performance, accessibility, progressive web apps, SEO, and compliance with best practices. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/lighthouse/task_get/json/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier required field you can get this ID in the response of the Task POST endpoint example: “07131248-1535-0216-1000-17384017ad04”
    try {
      OnPageLighthouseTaskGetJsonResponseInfo result = apiInstance.lighthouseTaskGetJson(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier required field you can get this ID in the response of the Task POST endpoint example: “07131248-1535-0216-1000-17384017ad04” | |

### Return type

[**OnPageLighthouseTaskGetJsonResponseInfo**](OnPageLighthouseTaskGetJsonResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="lighthouseTaskPost"></a>

# **lighthouseTaskPost**

> OnPageLighthouseTaskPostResponseInfo lighthouseTaskPost(onPageLighthouseTaskPostRequestInfo)

‌The OnPage Lighthouse API is based on Google’s open-source Lighthouse project for measuring the quality of web pages and web apps. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/lighthouse/task_post/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageLighthouseTaskPostRequestInfo> onPageLighthouseTaskPostRequestInfo = Arrays.asList(); // List<OnPageLighthouseTaskPostRequestInfo> | 
    try {
      OnPageLighthouseTaskPostResponseInfo result = apiInstance.lighthouseTaskPost(onPageLighthouseTaskPostRequestInfo);
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
| **onPageLighthouseTaskPostRequestInfo** | [**List&lt;OnPageLighthouseTaskPostRequestInfo&gt;**](OnPageLighthouseTaskPostRequestInfo.md)|  | [optional] |

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

‌ The ‘Tasks Ready’ endpoint is designed to provide you with the list of completed tasks, which haven’t been collected yet. If you use the Standard method without specifying the postback_url, you can receive the list of id for all completed tasks using this endpoint. Then, you can collect the results using the ‘Task GET’ endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/lighthouse/tasks_ready/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    try {
      OnPageLighthouseTasksReadyResponseInfo result = apiInstance.lighthouseTasksReady();
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

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="lighthouseVersions"></a>

# **lighthouseVersions**

> OnPageLighthouseVersionsResponseInfo lighthouseVersions()

OnPage Lighthouse API is based on Google’s open-source Lighthouse project and provides data on the quality of web pages. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/lighthouse/versions/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    try {
      OnPageLighthouseVersionsResponseInfo result = apiInstance.lighthouseVersions();
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

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="links"></a>

# **links**

> OnPageLinksResponseInfo links(onPageLinksRequestInfo)

‌‌ This endpoint will provide you with a list of internal and external links detected on a target website. The following link types are supported: anchor, image, link, canonical, meta, alternate, redirect. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/links/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageLinksRequestInfo> onPageLinksRequestInfo = Arrays.asList(); // List<OnPageLinksRequestInfo> | 
    try {
      OnPageLinksResponseInfo result = apiInstance.links(onPageLinksRequestInfo);
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
| **onPageLinksRequestInfo** | [**List&lt;OnPageLinksRequestInfo&gt;**](OnPageLinksRequestInfo.md)|  | [optional] |

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

<a id="microdata"></a>

# **microdata**

> OnPageMicrodataResponseInfo microdata(onPageMicrodataRequestInfo)

‌‌ This endpoint is designed to validate structured JSON-LD data and Microdata. Using this function you will obtain microdata available on the specified page of the target website and detailed results of its validation. To use this endpoint, set the validate_micromarkup parameter to true in the POST request to OnPage API. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/microdata/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageMicrodataRequestInfo> onPageMicrodataRequestInfo = Arrays.asList(); // List<OnPageMicrodataRequestInfo> | 
    try {
      OnPageMicrodataResponseInfo result = apiInstance.microdata(onPageMicrodataRequestInfo);
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
| **onPageMicrodataRequestInfo** | [**List&lt;OnPageMicrodataRequestInfo&gt;**](OnPageMicrodataRequestInfo.md)|  | [optional] |

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

<a id="nonIndexable"></a>

# **nonIndexable**

> OnPageNonIndexableResponseInfo nonIndexable(onPageNonIndexableRequestInfo)

‌‌ This endpoint returns a list of pages that are blocked from being indexed by Google and other search engines by robots.txt, HTTP headers, or meta tags settings. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/non_indexable/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageNonIndexableRequestInfo> onPageNonIndexableRequestInfo = Arrays.asList(); // List<OnPageNonIndexableRequestInfo> | 
    try {
      OnPageNonIndexableResponseInfo result = apiInstance.nonIndexable(onPageNonIndexableRequestInfo);
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
| **onPageNonIndexableRequestInfo** | [**List&lt;OnPageNonIndexableRequestInfo&gt;**](OnPageNonIndexableRequestInfo.md)|  | [optional] |

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

<a id="onPageAvailableFilters"></a>

# **onPageAvailableFilters**

> OnPageAvailableFiltersResponseInfo onPageAvailableFilters()

OnPage API supports plenty of customizable crawling parameters that allow you to adapt the extraction of website data to your requirements and modify the thresholds for various performance indicators. ‌‌ Here you will find all the necessary information about filters and thresholds that can be used with DataForSEO OnPage API endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/filters_and_thresholds/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    try {
      OnPageAvailableFiltersResponseInfo result = apiInstance.onPageAvailableFilters();
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

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="onPageErrors"></a>

# **onPageErrors**

> OnPageErrorsResponseInfo onPageErrors(onPageErrorsRequestInfo)

By calling this endpoint you will receive information about the OnPage API tasks that returned an error within the past 24 hours. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/errors/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageErrorsRequestInfo> onPageErrorsRequestInfo = Arrays.asList(); // List<OnPageErrorsRequestInfo> | 
    try {
      OnPageErrorsResponseInfo result = apiInstance.onPageErrors(onPageErrorsRequestInfo);
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
| **onPageErrorsRequestInfo** | [**List&lt;OnPageErrorsRequestInfo&gt;**](OnPageErrorsRequestInfo.md)|  | [optional] |

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

<a id="onPageIdList"></a>

# **onPageIdList**

> OnPageIdListResponseInfo onPageIdList(onPageIdListRequestInfo)

This endpoint is designed to provide you with the list of IDs and metadata of the completed On Page tasks during the specified period. You will get all task IDs that were made including successful, uncompleted, and tasks that responded as errors. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/id_list/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageIdListRequestInfo> onPageIdListRequestInfo = Arrays.asList(); // List<OnPageIdListRequestInfo> | 
    try {
      OnPageIdListResponseInfo result = apiInstance.onPageIdList(onPageIdListRequestInfo);
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
| **onPageIdListRequestInfo** | [**List&lt;OnPageIdListRequestInfo&gt;**](OnPageIdListRequestInfo.md)|  | [optional] |

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

<a id="onPageLighthouseLanguages"></a>

# **onPageLighthouseLanguages**

> OnPageLighthouseLanguagesResponseInfo onPageLighthouseLanguages()

You will receive the list of languages by calling this API.   As a response of the API server, you will receive JSON-encoded data containing a tasks array with the information specific to the set tasks. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/lighthouse/languages/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    try {
      OnPageLighthouseLanguagesResponseInfo result = apiInstance.onPageLighthouseLanguages();
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

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="pageScreenshot"></a>

# **pageScreenshot**

> OnPagePageScreenshotResponseInfo pageScreenshot(onPagePageScreenshotRequestInfo)

‌‌ Using this endpoint, you can capture a full high-quality screenshot of any webpage. In this way, you can review the target page as the DataForSEO crawler and Googlebot see it. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/page_screenshot/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPagePageScreenshotRequestInfo> onPagePageScreenshotRequestInfo = Arrays.asList(); // List<OnPagePageScreenshotRequestInfo> | 
    try {
      OnPagePageScreenshotResponseInfo result = apiInstance.pageScreenshot(onPagePageScreenshotRequestInfo);
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
| **onPagePageScreenshotRequestInfo** | [**List&lt;OnPagePageScreenshotRequestInfo&gt;**](OnPagePageScreenshotRequestInfo.md)|  | [optional] |

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

<a id="pages"></a>

# **pages**

> OnPagePagesResponseInfo pages(onPagePagesRequestInfo)

‌‌ This endpoint returns a list of crawled pages with on-page check-ups and other metrics related to the page performance. Using this function you will get page-specific data with detailed information on how well your pages are optimized for search. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/pages/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPagePagesRequestInfo> onPagePagesRequestInfo = Arrays.asList(); // List<OnPagePagesRequestInfo> | 
    try {
      OnPagePagesResponseInfo result = apiInstance.pages(onPagePagesRequestInfo);
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
| **onPagePagesRequestInfo** | [**List&lt;OnPagePagesRequestInfo&gt;**](OnPagePagesRequestInfo.md)|  | [optional] |

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

> OnPagePagesByResourceResponseInfo pagesByResource(onPagePagesByResourceRequestInfo)

‌‌ This endpoint will return the list of pages where a specific resource is located. Using this function you will also get the data related to the pages that contain a specified resource. You can get the URL of a resource using the Resources endpoint. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/page_by_resource/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPagePagesByResourceRequestInfo> onPagePagesByResourceRequestInfo = Arrays.asList(); // List<OnPagePagesByResourceRequestInfo> | 
    try {
      OnPagePagesByResourceResponseInfo result = apiInstance.pagesByResource(onPagePagesByResourceRequestInfo);
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
| **onPagePagesByResourceRequestInfo** | [**List&lt;OnPagePagesByResourceRequestInfo&gt;**](OnPagePagesByResourceRequestInfo.md)|  | [optional] |

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

<a id="rawHtml"></a>

# **rawHtml**

> OnPageRawHtmlResponseInfo rawHtml(onPageRawHtmlRequestInfo)

‌‌ This endpoint returns the HTML of a page you indicate in the request. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/raw_html/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageRawHtmlRequestInfo> onPageRawHtmlRequestInfo = Arrays.asList(); // List<OnPageRawHtmlRequestInfo> | 
    try {
      OnPageRawHtmlResponseInfo result = apiInstance.rawHtml(onPageRawHtmlRequestInfo);
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
| **onPageRawHtmlRequestInfo** | [**List&lt;OnPageRawHtmlRequestInfo&gt;**](OnPageRawHtmlRequestInfo.md)|  | [optional] |

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

<a id="redirectChains"></a>

# **redirectChains**

> OnPageRedirectChainsResponseInfo redirectChains(onPageRedirectChainsRequestInfo)

‌‌ Redirect chains occur when there are at least two redirects between the initial URL and the destination URL. For example, if page A redirects to page B which redirects to page C, such a series of redirects is considered a redirect chain. Sometimes, if page B redirects back to page A, the redirect chain becomes closed and is considered a redirect loop. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/redirect_chains/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageRedirectChainsRequestInfo> onPageRedirectChainsRequestInfo = Arrays.asList(); // List<OnPageRedirectChainsRequestInfo> | 
    try {
      OnPageRedirectChainsResponseInfo result = apiInstance.redirectChains(onPageRedirectChainsRequestInfo);
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
| **onPageRedirectChainsRequestInfo** | [**List&lt;OnPageRedirectChainsRequestInfo&gt;**](OnPageRedirectChainsRequestInfo.md)|  | [optional] |

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

<a id="resources"></a>

# **resources**

> OnPageResourcesResponseInfo resources(onPageResourcesRequestInfo)

‌‌ This endpoint will provide you with a list of resources, including images, scripts, stylesheets, and broken elements. You will get a detailed overview of every resource found on the crawled pages. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/resources/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageResourcesRequestInfo> onPageResourcesRequestInfo = Arrays.asList(); // List<OnPageResourcesRequestInfo> | 
    try {
      OnPageResourcesResponseInfo result = apiInstance.resources(onPageResourcesRequestInfo);
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
| **onPageResourcesRequestInfo** | [**List&lt;OnPageResourcesRequestInfo&gt;**](OnPageResourcesRequestInfo.md)|  | [optional] |

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

<a id="summary"></a>

# **summary**

> OnPageSummaryResponseInfo summary(id)

‌ Using this function, you can get the overall information on a website as well as drill down into exact on-page issues of a website that has been scanned. As a result, you will know what functions to use for receiving detailed data for each of the found issues. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/summary/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    String id = "00000000-0000-0000-0000-000000000000"; // String | task identifier required field you can get this ID in the response of the Task POST endpoint example: “07131248-1535-0216-1000-17384017ad04”
    try {
      OnPageSummaryResponseInfo result = apiInstance.summary(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| task identifier required field you can get this ID in the response of the Task POST endpoint example: “07131248-1535-0216-1000-17384017ad04” | |

### Return type

[**OnPageSummaryResponseInfo**](OnPageSummaryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="taskPost"></a>

# **taskPost**

> OnPageTaskPostResponseInfo taskPost(onPageTaskRequestInfo)

‌ OnPage API checks websites for 60+ customizable on-page parameters defines and displays all found flaws and opportunities for optimization so that you can easily fix them. It checks meta tags, duplicate content, image tags, response codes, and other parameters on every page. You can find the full list of OnPage API check-up parameters in the Pages section. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/task_post/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageTaskRequestInfo> onPageTaskRequestInfo = Arrays.asList(); // List<OnPageTaskRequestInfo> | 
    try {
      OnPageTaskPostResponseInfo result = apiInstance.taskPost(onPageTaskRequestInfo);
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
| **onPageTaskRequestInfo** | [**List&lt;OnPageTaskRequestInfo&gt;**](OnPageTaskRequestInfo.md)|  | [optional] |

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

<a id="tasksReady"></a>

# **tasksReady**

> OnPageTasksReadyResponseInfo tasksReady()

‌ The ‘Tasks Ready’ endpoint is designed to provide you with a list of completed tasks, which results haven’t been collected yet. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page-tasks_ready/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    try {
      OnPageTasksReadyResponseInfo result = apiInstance.tasksReady();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnPageApi#tasksReady");
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

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="waterfall"></a>

# **waterfall**

> OnPageWaterfallResponseInfo waterfall(onPageWaterfallRequestInfo)

‌‌ This endpoint is designed to provide you with the page speed insights. Using this function you can get detailed information about the page loading time, time to secure connection, the time it takes to load page resources, and so on. for more info please visit &#39;https://docs.dataforseo.com/v3/on_page/waterfall/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.OnPageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    OnPageApi apiInstance = new OnPageApi(defaultClient);
    List<OnPageWaterfallRequestInfo> onPageWaterfallRequestInfo = Arrays.asList(); // List<OnPageWaterfallRequestInfo> | 
    try {
      OnPageWaterfallResponseInfo result = apiInstance.waterfall(onPageWaterfallRequestInfo);
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
| **onPageWaterfallRequestInfo** | [**List&lt;OnPageWaterfallRequestInfo&gt;**](OnPageWaterfallRequestInfo.md)|  | [optional] |

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

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
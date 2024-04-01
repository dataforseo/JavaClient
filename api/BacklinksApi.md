# BacklinksApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**anchorsLive**](BacklinksApi.md#anchorsLive) | **POST** /v3/backlinks/anchors/live |  |
| [**backlinksAvailableFilters**](BacklinksApi.md#backlinksAvailableFilters) | **GET** /v3/backlinks/available_filters |  |
| [**backlinksErrors**](BacklinksApi.md#backlinksErrors) | **POST** /v3/backlinks/errors |  |
| [**backlinksIdList**](BacklinksApi.md#backlinksIdList) | **POST** /v3/backlinks/id_list |  |
| [**backlinksLive**](BacklinksApi.md#backlinksLive) | **POST** /v3/backlinks/backlinks/live |  |
| [**bulkBacklinksLive**](BacklinksApi.md#bulkBacklinksLive) | **POST** /v3/backlinks/bulk_backlinks/live |  |
| [**bulkNewLostBacklinksLive**](BacklinksApi.md#bulkNewLostBacklinksLive) | **POST** /v3/backlinks/bulk_new_lost_backlinks/live |  |
| [**bulkNewLostReferringDomainsLive**](BacklinksApi.md#bulkNewLostReferringDomainsLive) | **POST** /v3/backlinks/bulk_new_lost_referring_domains/live |  |
| [**bulkRanksLive**](BacklinksApi.md#bulkRanksLive) | **POST** /v3/backlinks/bulk_ranks/live |  |
| [**bulkReferringDomainsLive**](BacklinksApi.md#bulkReferringDomainsLive) | **POST** /v3/backlinks/bulk_referring_domains/live |  |
| [**bulkSpamScoreLive**](BacklinksApi.md#bulkSpamScoreLive) | **POST** /v3/backlinks/bulk_spam_score/live |  |
| [**competitorsLive**](BacklinksApi.md#competitorsLive) | **POST** /v3/backlinks/competitors/live |  |
| [**domainIntersectionLive**](BacklinksApi.md#domainIntersectionLive) | **POST** /v3/backlinks/domain_intersection/live |  |
| [**domainPagesLive**](BacklinksApi.md#domainPagesLive) | **POST** /v3/backlinks/domain_pages/live |  |
| [**domainPagesSummaryLive**](BacklinksApi.md#domainPagesSummaryLive) | **POST** /v3/backlinks/domain_pages_summary/live |  |
| [**historyLive**](BacklinksApi.md#historyLive) | **POST** /v3/backlinks/history/live |  |
| [**index**](BacklinksApi.md#index) | **GET** /v3/backlinks/index |  |
| [**pageIntersectionLive**](BacklinksApi.md#pageIntersectionLive) | **POST** /v3/backlinks/page_intersection/live |  |
| [**referringDomainsLive**](BacklinksApi.md#referringDomainsLive) | **POST** /v3/backlinks/referring_domains/live |  |
| [**referringNetworksLive**](BacklinksApi.md#referringNetworksLive) | **POST** /v3/backlinks/referring_networks/live |  |
| [**summaryLive**](BacklinksApi.md#summaryLive) | **POST** /v3/backlinks/summary/live |  |
| [**timeseriesNewLostSummaryLive**](BacklinksApi.md#timeseriesNewLostSummaryLive) | **POST** /v3/backlinks/timeseries_new_lost_summary/live |  |
| [**timeseriesSummaryLive**](BacklinksApi.md#timeseriesSummaryLive) | **POST** /v3/backlinks/timeseries_summary/live |  |


<a id="anchorsLive"></a>
# **anchorsLive**
> BacklinksAnchorsLiveResponseInfo anchorsLive(backlinksAnchorsLiveRequestInfo)



‌‌ This endpoint will provide you with a detailed overview of anchors used when linking to the specified website with relevant backlink data for each of them. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/anchors/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksAnchorsLiveRequestInfo> backlinksAnchorsLiveRequestInfo = Arrays.asList(); // List<BacklinksAnchorsLiveRequestInfo> | 
    try {
      BacklinksAnchorsLiveResponseInfo result = apiInstance.anchorsLive(backlinksAnchorsLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#anchorsLive");
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
| **backlinksAnchorsLiveRequestInfo** | [**List&lt;BacklinksAnchorsLiveRequestInfo&gt;**](BacklinksAnchorsLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksAnchorsLiveResponseInfo**](BacklinksAnchorsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="backlinksAvailableFilters"></a>
# **backlinksAvailableFilters**
> BacklinksAvailableFiltersResponseInfo backlinksAvailableFilters()



Backlinks API features plenty of parameters that support custom filtration. By applying filters to your POST requests, you will be able to effortlessly extract data that matches your requirements. Note that we do not charge any fees for using data filtering or sorting rules. ‌‌ Here you will find all the necessary information about filters that can be used with DataForSEO Backlinks API endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/filters/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    try {
      BacklinksAvailableFiltersResponseInfo result = apiInstance.backlinksAvailableFilters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#backlinksAvailableFilters");
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

[**BacklinksAvailableFiltersResponseInfo**](BacklinksAvailableFiltersResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="backlinksErrors"></a>
# **backlinksErrors**
> BacklinksErrorsResponseInfo backlinksErrors(backlinksErrorsRequestInfo)



By calling this endpoint you will receive information about the Backlinks API tasks that returned an error within the past 24 hours. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/errors/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksErrorsRequestInfo> backlinksErrorsRequestInfo = Arrays.asList(); // List<BacklinksErrorsRequestInfo> | 
    try {
      BacklinksErrorsResponseInfo result = apiInstance.backlinksErrors(backlinksErrorsRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#backlinksErrors");
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
| **backlinksErrorsRequestInfo** | [**List&lt;BacklinksErrorsRequestInfo&gt;**](BacklinksErrorsRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksErrorsResponseInfo**](BacklinksErrorsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="backlinksIdList"></a>
# **backlinksIdList**
> BacklinksIdListResponseInfo backlinksIdList(backlinksIdListRequestInfo)



This endpoint is designed to provide you with the list of IDs and metadata of the completed Backlinks tasks during the specified period. You will get all task IDs that were made including successful, uncompleted, and tasks that responded as errors. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/id_list/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksIdListRequestInfo> backlinksIdListRequestInfo = Arrays.asList(); // List<BacklinksIdListRequestInfo> | 
    try {
      BacklinksIdListResponseInfo result = apiInstance.backlinksIdList(backlinksIdListRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#backlinksIdList");
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
| **backlinksIdListRequestInfo** | [**List&lt;BacklinksIdListRequestInfo&gt;**](BacklinksIdListRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksIdListResponseInfo**](BacklinksIdListResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="backlinksLive"></a>
# **backlinksLive**
> BacklinksBacklinksLiveResponseInfo backlinksLive(backlinksBacklinksLiveRequestInfo)



‌ This endpoint will provide you with a list of backlinks and relevant data for the specified domain, subdomain, or webpage. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/backlinks/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksBacklinksLiveRequestInfo> backlinksBacklinksLiveRequestInfo = Arrays.asList(); // List<BacklinksBacklinksLiveRequestInfo> | 
    try {
      BacklinksBacklinksLiveResponseInfo result = apiInstance.backlinksLive(backlinksBacklinksLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#backlinksLive");
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
| **backlinksBacklinksLiveRequestInfo** | [**List&lt;BacklinksBacklinksLiveRequestInfo&gt;**](BacklinksBacklinksLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksBacklinksLiveResponseInfo**](BacklinksBacklinksLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bulkBacklinksLive"></a>
# **bulkBacklinksLive**
> BacklinksBulkBacklinksLiveResponseInfo bulkBacklinksLive(backlinksBulkBacklinksLiveRequestInfo)



‌ This endpoint will provide you with the number of backlinks pointing to domains, subdomains, and pages specified in the targets array. The returned numbers correspond to all live backlinks, that is, total number of referring links with all attributes (e.g., nofollow, noreferrer, ugc, sponsored etc) that were found during the latest check. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_backlinks/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksBulkBacklinksLiveRequestInfo> backlinksBulkBacklinksLiveRequestInfo = Arrays.asList(); // List<BacklinksBulkBacklinksLiveRequestInfo> | 
    try {
      BacklinksBulkBacklinksLiveResponseInfo result = apiInstance.bulkBacklinksLive(backlinksBulkBacklinksLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#bulkBacklinksLive");
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
| **backlinksBulkBacklinksLiveRequestInfo** | [**List&lt;BacklinksBulkBacklinksLiveRequestInfo&gt;**](BacklinksBulkBacklinksLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksBulkBacklinksLiveResponseInfo**](BacklinksBulkBacklinksLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bulkNewLostBacklinksLive"></a>
# **bulkNewLostBacklinksLive**
> BacklinksBulkNewLostBacklinksLiveResponseInfo bulkNewLostBacklinksLive(backlinksBulkNewLostBacklinksLiveRequestInfo)



‌ This endpoint will provide you with the number of new and lost backlinks for the domains, subdomains, and pages specified in the targets array. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_new_lost_backlinks/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksBulkNewLostBacklinksLiveRequestInfo> backlinksBulkNewLostBacklinksLiveRequestInfo = Arrays.asList(); // List<BacklinksBulkNewLostBacklinksLiveRequestInfo> | 
    try {
      BacklinksBulkNewLostBacklinksLiveResponseInfo result = apiInstance.bulkNewLostBacklinksLive(backlinksBulkNewLostBacklinksLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#bulkNewLostBacklinksLive");
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
| **backlinksBulkNewLostBacklinksLiveRequestInfo** | [**List&lt;BacklinksBulkNewLostBacklinksLiveRequestInfo&gt;**](BacklinksBulkNewLostBacklinksLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksBulkNewLostBacklinksLiveResponseInfo**](BacklinksBulkNewLostBacklinksLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bulkNewLostReferringDomainsLive"></a>
# **bulkNewLostReferringDomainsLive**
> BacklinksBulkNewLostReferringDomainsLiveResponseInfo bulkNewLostReferringDomainsLive(backlinksBulkNewLostReferringDomainsLiveRequestInfo)



‌ This endpoint will provide you with the number of referring domains pointing to the domains, subdomains and pages specified in the targets array. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_new_lost_referring_domains/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksBulkNewLostReferringDomainsLiveRequestInfo> backlinksBulkNewLostReferringDomainsLiveRequestInfo = Arrays.asList(); // List<BacklinksBulkNewLostReferringDomainsLiveRequestInfo> | 
    try {
      BacklinksBulkNewLostReferringDomainsLiveResponseInfo result = apiInstance.bulkNewLostReferringDomainsLive(backlinksBulkNewLostReferringDomainsLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#bulkNewLostReferringDomainsLive");
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
| **backlinksBulkNewLostReferringDomainsLiveRequestInfo** | [**List&lt;BacklinksBulkNewLostReferringDomainsLiveRequestInfo&gt;**](BacklinksBulkNewLostReferringDomainsLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksBulkNewLostReferringDomainsLiveResponseInfo**](BacklinksBulkNewLostReferringDomainsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bulkRanksLive"></a>
# **bulkRanksLive**
> BacklinksBulkRanksLiveResponseInfo bulkRanksLive(backlinksBulkRanksLiveRequestInfo)



‌ This endpoint will provide you with rank scores of the domains, subdomains, and pages specified in the targets array. The score is based on the number of referring domains pointing to the specified domains, subdomains, or pages. rank values range from 0 (no backlinks detected) to 1,000 (highest rank). A similar scoring system is used in Google’s Page Rank algorithm. You can learn more about rank scores in this help center article for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_ranks/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksBulkRanksLiveRequestInfo> backlinksBulkRanksLiveRequestInfo = Arrays.asList(); // List<BacklinksBulkRanksLiveRequestInfo> | 
    try {
      BacklinksBulkRanksLiveResponseInfo result = apiInstance.bulkRanksLive(backlinksBulkRanksLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#bulkRanksLive");
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
| **backlinksBulkRanksLiveRequestInfo** | [**List&lt;BacklinksBulkRanksLiveRequestInfo&gt;**](BacklinksBulkRanksLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksBulkRanksLiveResponseInfo**](BacklinksBulkRanksLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bulkReferringDomainsLive"></a>
# **bulkReferringDomainsLive**
> BacklinksBulkReferringDomainsLiveResponseInfo bulkReferringDomainsLive(backlinksBulkReferringDomainsLiveRequestInfo)



‌ This endpoint will provide you with the number of referring domains pointing to domains, subdomains, and pages specified in the targets array. The returned numbers are based on all live referring domains, that is, total number of domains pointing to the target with any type of backlinks (e.g., nofollow, noreferrer, ugc, sponsored etc) that were found during the latest check. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_referring_domains/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksBulkReferringDomainsLiveRequestInfo> backlinksBulkReferringDomainsLiveRequestInfo = Arrays.asList(); // List<BacklinksBulkReferringDomainsLiveRequestInfo> | 
    try {
      BacklinksBulkReferringDomainsLiveResponseInfo result = apiInstance.bulkReferringDomainsLive(backlinksBulkReferringDomainsLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#bulkReferringDomainsLive");
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
| **backlinksBulkReferringDomainsLiveRequestInfo** | [**List&lt;BacklinksBulkReferringDomainsLiveRequestInfo&gt;**](BacklinksBulkReferringDomainsLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksBulkReferringDomainsLiveResponseInfo**](BacklinksBulkReferringDomainsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bulkSpamScoreLive"></a>
# **bulkSpamScoreLive**
> BacklinksBulkSpamScoreLiveResponseInfo bulkSpamScoreLive(backlinksBulkSpamScoreLiveRequestInfo)



‌ This endpoint will provide you with spam scores of the domains, subdomains, and pages you specified in the targets array. Spam Score is DataForSEO’s proprietary metric that indicates how “spammy” your target is on a scale from 0 to 100. You can learn more about Spam Score, how it is calculated, and signals it takes into account in this help center article for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/bulk_spam_score/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksBulkSpamScoreLiveRequestInfo> backlinksBulkSpamScoreLiveRequestInfo = Arrays.asList(); // List<BacklinksBulkSpamScoreLiveRequestInfo> | 
    try {
      BacklinksBulkSpamScoreLiveResponseInfo result = apiInstance.bulkSpamScoreLive(backlinksBulkSpamScoreLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#bulkSpamScoreLive");
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
| **backlinksBulkSpamScoreLiveRequestInfo** | [**List&lt;BacklinksBulkSpamScoreLiveRequestInfo&gt;**](BacklinksBulkSpamScoreLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksBulkSpamScoreLiveResponseInfo**](BacklinksBulkSpamScoreLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="competitorsLive"></a>
# **competitorsLive**
> BacklinksCompetitorsLiveResponseInfo competitorsLive(backlinksCompetitorsLiveRequestInfo)



‌‌ This endpoint will provide you with a list of competitors that share some part of the backlink profile with a target website, along with a number of backlink intersections and the rank of every competing website. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/competitors/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksCompetitorsLiveRequestInfo> backlinksCompetitorsLiveRequestInfo = Arrays.asList(); // List<BacklinksCompetitorsLiveRequestInfo> | 
    try {
      BacklinksCompetitorsLiveResponseInfo result = apiInstance.competitorsLive(backlinksCompetitorsLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#competitorsLive");
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
| **backlinksCompetitorsLiveRequestInfo** | [**List&lt;BacklinksCompetitorsLiveRequestInfo&gt;**](BacklinksCompetitorsLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksCompetitorsLiveResponseInfo**](BacklinksCompetitorsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="domainIntersectionLive"></a>
# **domainIntersectionLive**
> BacklinksDomainIntersectionLiveResponseInfo domainIntersectionLive(backlinksDomainIntersectionLiveRequestInfo)



‌ This endpoint will provide you with the list of domains pointing to the specified websites. This endpoint is especially useful for creating a Link Gap feature that shows what domains link to your competitors but do not link out to your website. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/domain_intersection/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksDomainIntersectionLiveRequestInfo> backlinksDomainIntersectionLiveRequestInfo = Arrays.asList(); // List<BacklinksDomainIntersectionLiveRequestInfo> | 
    try {
      BacklinksDomainIntersectionLiveResponseInfo result = apiInstance.domainIntersectionLive(backlinksDomainIntersectionLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#domainIntersectionLive");
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
| **backlinksDomainIntersectionLiveRequestInfo** | [**List&lt;BacklinksDomainIntersectionLiveRequestInfo&gt;**](BacklinksDomainIntersectionLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksDomainIntersectionLiveResponseInfo**](BacklinksDomainIntersectionLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="domainPagesLive"></a>
# **domainPagesLive**
> BacklinksDomainPagesLiveResponseInfo domainPagesLive(backlinksDomainPagesLiveRequestInfo)



‌‌ This endpoint will provide you with a detailed overview of domain pages with backlink data for each page. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/domain_pages/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksDomainPagesLiveRequestInfo> backlinksDomainPagesLiveRequestInfo = Arrays.asList(); // List<BacklinksDomainPagesLiveRequestInfo> | 
    try {
      BacklinksDomainPagesLiveResponseInfo result = apiInstance.domainPagesLive(backlinksDomainPagesLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#domainPagesLive");
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
| **backlinksDomainPagesLiveRequestInfo** | [**List&lt;BacklinksDomainPagesLiveRequestInfo&gt;**](BacklinksDomainPagesLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksDomainPagesLiveResponseInfo**](BacklinksDomainPagesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="domainPagesSummaryLive"></a>
# **domainPagesSummaryLive**
> BacklinksDomainPagesSummaryLiveResponseInfo domainPagesSummaryLive(backlinksDomainPagesSummaryLiveRequestInfo)



This endpoint will provide you with detailed summary data on all backlinks and related metrics for each page of the target domain or subdomain you specify. If you indicate a single page as a target, you will get comprehensive summary data on all backlinks for that page. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/domain_pages_summary/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksDomainPagesSummaryLiveRequestInfo> backlinksDomainPagesSummaryLiveRequestInfo = Arrays.asList(); // List<BacklinksDomainPagesSummaryLiveRequestInfo> | 
    try {
      BacklinksDomainPagesSummaryLiveResponseInfo result = apiInstance.domainPagesSummaryLive(backlinksDomainPagesSummaryLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#domainPagesSummaryLive");
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
| **backlinksDomainPagesSummaryLiveRequestInfo** | [**List&lt;BacklinksDomainPagesSummaryLiveRequestInfo&gt;**](BacklinksDomainPagesSummaryLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksDomainPagesSummaryLiveResponseInfo**](BacklinksDomainPagesSummaryLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="historyLive"></a>
# **historyLive**
> BacklinksHistoryLiveResponseInfo historyLive(backlinksHistoryLiveRequestInfo)



‌ This endpoint will provide you with historical backlinks data back to the beginning of 2019. You can receive the number of backlinks a given domain had in a specific time period, the number of new &amp; lost backlinks, referring domains, and more. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/history/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksHistoryLiveRequestInfo> backlinksHistoryLiveRequestInfo = Arrays.asList(); // List<BacklinksHistoryLiveRequestInfo> | 
    try {
      BacklinksHistoryLiveResponseInfo result = apiInstance.historyLive(backlinksHistoryLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#historyLive");
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
| **backlinksHistoryLiveRequestInfo** | [**List&lt;BacklinksHistoryLiveRequestInfo&gt;**](BacklinksHistoryLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksHistoryLiveResponseInfo**](BacklinksHistoryLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="index"></a>
# **index**
> BacklinksIndexResponseInfo index()



‌ This endpoint will provide you with the total number of backlinks, domains, and pages our database contains for the moment when you make a request. You will also get stats for the last 12 months. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/index/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    try {
      BacklinksIndexResponseInfo result = apiInstance.index();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#index");
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

[**BacklinksIndexResponseInfo**](BacklinksIndexResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="pageIntersectionLive"></a>
# **pageIntersectionLive**
> BacklinksPageIntersectionLiveResponseInfo pageIntersectionLive(backlinksPageIntersectionLiveRequestInfo)



‌ This endpoint will provide you with the list of referring pages pointing to the specified targets. It is especially useful for finding the backlinks that point to your competitors but don’t point to your website. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/page_intersection/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksPageIntersectionLiveRequestInfo> backlinksPageIntersectionLiveRequestInfo = Arrays.asList(); // List<BacklinksPageIntersectionLiveRequestInfo> | 
    try {
      BacklinksPageIntersectionLiveResponseInfo result = apiInstance.pageIntersectionLive(backlinksPageIntersectionLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#pageIntersectionLive");
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
| **backlinksPageIntersectionLiveRequestInfo** | [**List&lt;BacklinksPageIntersectionLiveRequestInfo&gt;**](BacklinksPageIntersectionLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksPageIntersectionLiveResponseInfo**](BacklinksPageIntersectionLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="referringDomainsLive"></a>
# **referringDomainsLive**
> BacklinksReferringDomainsLiveResponseInfo referringDomainsLive(backlinksReferringDomainsLiveRequestInfo)



‌‌ This endpoint will provide you with a detailed overview of referring domains pointing to the target domain you specify. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/referring_domains/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksReferringDomainsLiveRequestInfo> backlinksReferringDomainsLiveRequestInfo = Arrays.asList(); // List<BacklinksReferringDomainsLiveRequestInfo> | 
    try {
      BacklinksReferringDomainsLiveResponseInfo result = apiInstance.referringDomainsLive(backlinksReferringDomainsLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#referringDomainsLive");
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
| **backlinksReferringDomainsLiveRequestInfo** | [**List&lt;BacklinksReferringDomainsLiveRequestInfo&gt;**](BacklinksReferringDomainsLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksReferringDomainsLiveResponseInfo**](BacklinksReferringDomainsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="referringNetworksLive"></a>
# **referringNetworksLive**
> BacklinksReferringNetworksLiveResponseInfo referringNetworksLive(backlinksReferringNetworksLiveRequestInfo)



‌‌ This endpoint will provide you with a detailed overview of referring IPs and subnets pointing to the target you specify. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/referring_networks/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksReferringNetworksLiveRequestInfo> backlinksReferringNetworksLiveRequestInfo = Arrays.asList(); // List<BacklinksReferringNetworksLiveRequestInfo> | 
    try {
      BacklinksReferringNetworksLiveResponseInfo result = apiInstance.referringNetworksLive(backlinksReferringNetworksLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#referringNetworksLive");
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
| **backlinksReferringNetworksLiveRequestInfo** | [**List&lt;BacklinksReferringNetworksLiveRequestInfo&gt;**](BacklinksReferringNetworksLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksReferringNetworksLiveResponseInfo**](BacklinksReferringNetworksLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="summaryLive"></a>
# **summaryLive**
> BacklinksSummaryLiveResponseInfo summaryLive(backlinksSummaryLiveRequestInfo)



‌ This endpoint will provide you with an overview of backlinks data available for a given domain, subdomain, or webpage. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/summary/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksSummaryLiveRequestInfo> backlinksSummaryLiveRequestInfo = Arrays.asList(); // List<BacklinksSummaryLiveRequestInfo> | 
    try {
      BacklinksSummaryLiveResponseInfo result = apiInstance.summaryLive(backlinksSummaryLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#summaryLive");
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
| **backlinksSummaryLiveRequestInfo** | [**List&lt;BacklinksSummaryLiveRequestInfo&gt;**](BacklinksSummaryLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksSummaryLiveResponseInfo**](BacklinksSummaryLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="timeseriesNewLostSummaryLive"></a>
# **timeseriesNewLostSummaryLive**
> BacklinksTimeseriesNewLostSummaryLiveResponseInfo timeseriesNewLostSummaryLive(backlinksTimeseriesNewLostSummaryLiveRequestInfo)



‌ This endpoint will provide you with the number of new and lost backlinks and referring domains for the domain specified in the target field. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/timeseries_new_lost_summary/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksTimeseriesNewLostSummaryLiveRequestInfo> backlinksTimeseriesNewLostSummaryLiveRequestInfo = Arrays.asList(); // List<BacklinksTimeseriesNewLostSummaryLiveRequestInfo> | 
    try {
      BacklinksTimeseriesNewLostSummaryLiveResponseInfo result = apiInstance.timeseriesNewLostSummaryLive(backlinksTimeseriesNewLostSummaryLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#timeseriesNewLostSummaryLive");
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
| **backlinksTimeseriesNewLostSummaryLiveRequestInfo** | [**List&lt;BacklinksTimeseriesNewLostSummaryLiveRequestInfo&gt;**](BacklinksTimeseriesNewLostSummaryLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksTimeseriesNewLostSummaryLiveResponseInfo**](BacklinksTimeseriesNewLostSummaryLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="timeseriesSummaryLive"></a>
# **timeseriesSummaryLive**
> BacklinksTimeseriesSummaryLiveResponseInfo timeseriesSummaryLive(backlinksTimeseriesSummaryLiveRequestInfo)



‌ This endpoint will provide you with an overview of backlink data for the target domain available during a period between the two indicated dates. Backlink metrics will be grouped by the time range that you define: day, week, month, or year. for more info please visit &#39;https://docs.dataforseo.com/v3/backlinks/timeseries_summary/live/?bash&#39;

### Example
```java
// Import classes:
import org.dataforseo.client.ApiClient;
import org.dataforseo.client.ApiException;
import org.dataforseo.client.Configuration;
import org.dataforseo.client.auth.*;
import org.dataforseo.client.models.*;
import org.dataforseo.client.api.BacklinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    List<BacklinksTimeseriesSummaryLiveRequestInfo> backlinksTimeseriesSummaryLiveRequestInfo = Arrays.asList(); // List<BacklinksTimeseriesSummaryLiveRequestInfo> | 
    try {
      BacklinksTimeseriesSummaryLiveResponseInfo result = apiInstance.timeseriesSummaryLive(backlinksTimeseriesSummaryLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#timeseriesSummaryLive");
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
| **backlinksTimeseriesSummaryLiveRequestInfo** | [**List&lt;BacklinksTimeseriesSummaryLiveRequestInfo&gt;**](BacklinksTimeseriesSummaryLiveRequestInfo.md)|  | [optional] |

### Return type

[**BacklinksTimeseriesSummaryLiveResponseInfo**](BacklinksTimeseriesSummaryLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


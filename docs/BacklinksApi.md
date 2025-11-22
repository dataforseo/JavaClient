# BacklinksApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**backlinksIdList**](BacklinksApi.md#backlinksIdList) | **POST**  /v3/backlinks/id_list  |
| [**backlinksErrors**](BacklinksApi.md#backlinksErrors) | **POST**  /v3/backlinks/errors  |
| [**backlinksAvailableFilters**](BacklinksApi.md#backlinksAvailableFilters) | **GET**  /v3/backlinks/available_filters  |
| [**index**](BacklinksApi.md#index) | **GET**  /v3/backlinks/index  |
| [**summaryLive**](BacklinksApi.md#summaryLive) | **POST**  /v3/backlinks/summary/live  |
| [**historyLive**](BacklinksApi.md#historyLive) | **POST**  /v3/backlinks/history/live  |
| [**backlinksLive**](BacklinksApi.md#backlinksLive) | **POST**  /v3/backlinks/backlinks/live  |
| [**anchorsLive**](BacklinksApi.md#anchorsLive) | **POST**  /v3/backlinks/anchors/live  |
| [**domainPagesLive**](BacklinksApi.md#domainPagesLive) | **POST**  /v3/backlinks/domain_pages/live  |
| [**domainPagesSummaryLive**](BacklinksApi.md#domainPagesSummaryLive) | **POST**  /v3/backlinks/domain_pages_summary/live  |
| [**referringDomainsLive**](BacklinksApi.md#referringDomainsLive) | **POST**  /v3/backlinks/referring_domains/live  |
| [**referringNetworksLive**](BacklinksApi.md#referringNetworksLive) | **POST**  /v3/backlinks/referring_networks/live  |
| [**competitorsLive**](BacklinksApi.md#competitorsLive) | **POST**  /v3/backlinks/competitors/live  |
| [**domainIntersectionLive**](BacklinksApi.md#domainIntersectionLive) | **POST**  /v3/backlinks/domain_intersection/live  |
| [**pageIntersectionLive**](BacklinksApi.md#pageIntersectionLive) | **POST**  /v3/backlinks/page_intersection/live  |
| [**timeseriesSummaryLive**](BacklinksApi.md#timeseriesSummaryLive) | **POST**  /v3/backlinks/timeseries_summary/live  |
| [**timeseriesNewLostSummaryLive**](BacklinksApi.md#timeseriesNewLostSummaryLive) | **POST**  /v3/backlinks/timeseries_new_lost_summary/live  |
| [**bulkRanksLive**](BacklinksApi.md#bulkRanksLive) | **POST**  /v3/backlinks/bulk_ranks/live  |
| [**bulkBacklinksLive**](BacklinksApi.md#bulkBacklinksLive) | **POST**  /v3/backlinks/bulk_backlinks/live  |
| [**bulkSpamScoreLive**](BacklinksApi.md#bulkSpamScoreLive) | **POST**  /v3/backlinks/bulk_spam_score/live  |
| [**bulkReferringDomainsLive**](BacklinksApi.md#bulkReferringDomainsLive) | **POST**  /v3/backlinks/bulk_referring_domains/live  |
| [**bulkNewLostBacklinksLive**](BacklinksApi.md#bulkNewLostBacklinksLive) | **POST**  /v3/backlinks/bulk_new_lost_backlinks/live  |
| [**bulkNewLostReferringDomainsLive**](BacklinksApi.md#bulkNewLostReferringDomainsLive) | **POST**  /v3/backlinks/bulk_new_lost_referring_domains/live  |
| [**bulkPagesSummaryLive**](BacklinksApi.md#bulkPagesSummaryLive) | **POST**  /v3/backlinks/bulk_pages_summary/live  |

<a id="backlinksIdList"></a>
# **backlinksIdList**
> BacklinksIdListResponseInfo backlinksIdList()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksIdListRequestInfo model = new BacklinksIdListRequestInfo()
           .datetimeFrom("2025-08-22 08:09:01 +00:00")
           .datetimeTo("2025-10-22 08:09:01 +00:00")
           .limit(100)
           .offset(0)
           .sort("desc");
    BacklinksIdListResponseInfo response = apiInstance.backlinksIdList(List.of(model));
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
    | **** | [**List&lt;List<BacklinksIdListRequestInfo>&gt;**](List<BacklinksIdListRequestInfo>.md)|  | [optional] |



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

<a id="backlinksErrors"></a>
# **backlinksErrors**
> BacklinksErrorsResponseInfo backlinksErrors()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksErrorsRequestInfo model = new BacklinksErrorsRequestInfo()
           .limit(10)
           .offset(0)
           .filteredFunction("backlinks/content_duplicates");
    BacklinksErrorsResponseInfo response = apiInstance.backlinksErrors(List.of(model));
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
    | **** | [**List&lt;List<BacklinksErrorsRequestInfo>&gt;**](List<BacklinksErrorsRequestInfo>.md)|  | [optional] |



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

<a id="backlinksAvailableFilters"></a>
# **backlinksAvailableFilters**
> BacklinksAvailableFiltersResponseInfo backlinksAvailableFilters()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);

    BacklinksAvailableFiltersResponseInfo response = apiInstance.backlinksAvailableFilters();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="index"></a>
# **index**
> BacklinksIndexResponseInfo index()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);

    BacklinksIndexResponseInfo response = apiInstance.index();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="summaryLive"></a>
# **summaryLive**
> BacklinksSummaryLiveResponseInfo summaryLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksSummaryLiveRequestInfo model = new BacklinksSummaryLiveRequestInfo()
           .target("explodingtopics.com")
           .includeSubdomains(true)
           .internalListLimit(10)
           .backlinksStatusType("all");
    BacklinksSummaryLiveResponseInfo response = apiInstance.summaryLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksSummaryLiveRequestInfo>&gt;**](List<BacklinksSummaryLiveRequestInfo>.md)|  | [optional] |



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

<a id="historyLive"></a>
# **historyLive**
> BacklinksHistoryLiveResponseInfo historyLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksHistoryLiveRequestInfo model = new BacklinksHistoryLiveRequestInfo()
           .target("cnn.com")
           .dateFrom("2025-08-22")
           .dateTo("2025-10-22");
    BacklinksHistoryLiveResponseInfo response = apiInstance.historyLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksHistoryLiveRequestInfo>&gt;**](List<BacklinksHistoryLiveRequestInfo>.md)|  | [optional] |



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

<a id="backlinksLive"></a>
# **backlinksLive**
> BacklinksBacklinksLiveResponseInfo backlinksLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksBacklinksLiveRequestInfo model = new BacklinksBacklinksLiveRequestInfo()
           .target("forbes.com")
           .mode("as_is")
           .limit(5);
    BacklinksBacklinksLiveResponseInfo response = apiInstance.backlinksLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksBacklinksLiveRequestInfo>&gt;**](List<BacklinksBacklinksLiveRequestInfo>.md)|  | [optional] |



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

<a id="anchorsLive"></a>
# **anchorsLive**
> BacklinksAnchorsLiveResponseInfo anchorsLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksAnchorsLiveRequestInfo model = new BacklinksAnchorsLiveRequestInfo()
           .target("forbes.com")
           .limit(4);
    BacklinksAnchorsLiveResponseInfo response = apiInstance.anchorsLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksAnchorsLiveRequestInfo>&gt;**](List<BacklinksAnchorsLiveRequestInfo>.md)|  | [optional] |



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

<a id="domainPagesLive"></a>
# **domainPagesLive**
> BacklinksDomainPagesLiveResponseInfo domainPagesLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksDomainPagesLiveRequestInfo model = new BacklinksDomainPagesLiveRequestInfo()
           .target("forbes.com")
           .limit(5);
    BacklinksDomainPagesLiveResponseInfo response = apiInstance.domainPagesLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksDomainPagesLiveRequestInfo>&gt;**](List<BacklinksDomainPagesLiveRequestInfo>.md)|  | [optional] |



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
> BacklinksDomainPagesSummaryLiveResponseInfo domainPagesSummaryLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksDomainPagesSummaryLiveRequestInfo model = new BacklinksDomainPagesSummaryLiveRequestInfo()
           .target("forbes.com")
           .limit(4);
    BacklinksDomainPagesSummaryLiveResponseInfo response = apiInstance.domainPagesSummaryLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksDomainPagesSummaryLiveRequestInfo>&gt;**](List<BacklinksDomainPagesSummaryLiveRequestInfo>.md)|  | [optional] |



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

<a id="referringDomainsLive"></a>
# **referringDomainsLive**
> BacklinksReferringDomainsLiveResponseInfo referringDomainsLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksReferringDomainsLiveRequestInfo model = new BacklinksReferringDomainsLiveRequestInfo()
           .target("backlinko.com")
           .limit(5)
           .excludeInternalBacklinks(true);
    BacklinksReferringDomainsLiveResponseInfo response = apiInstance.referringDomainsLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksReferringDomainsLiveRequestInfo>&gt;**](List<BacklinksReferringDomainsLiveRequestInfo>.md)|  | [optional] |



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
> BacklinksReferringNetworksLiveResponseInfo referringNetworksLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksReferringNetworksLiveRequestInfo model = new BacklinksReferringNetworksLiveRequestInfo()
           .target("backlinko.com")
           .networkAddressType("subnet")
           .limit(5)
           .excludeInternalBacklinks(true);
    BacklinksReferringNetworksLiveResponseInfo response = apiInstance.referringNetworksLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksReferringNetworksLiveRequestInfo>&gt;**](List<BacklinksReferringNetworksLiveRequestInfo>.md)|  | [optional] |



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

<a id="competitorsLive"></a>
# **competitorsLive**
> BacklinksCompetitorsLiveResponseInfo competitorsLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksCompetitorsLiveRequestInfo model = new BacklinksCompetitorsLiveRequestInfo()
           .target("dataforseo.com")
           .limit(5);
    BacklinksCompetitorsLiveResponseInfo response = apiInstance.competitorsLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksCompetitorsLiveRequestInfo>&gt;**](List<BacklinksCompetitorsLiveRequestInfo>.md)|  | [optional] |



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
> BacklinksDomainIntersectionLiveResponseInfo domainIntersectionLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksDomainIntersectionLiveRequestInfo model = new BacklinksDomainIntersectionLiveRequestInfo()
       .targets(
           Map.ofEntries(
               ))
           .excludeTargets(
               List.of(
                   "semrush.com"
                ))
           .limit(5)
           .includeSubdomains(false)
           .excludeInternalBacklinks(true);
    BacklinksDomainIntersectionLiveResponseInfo response = apiInstance.domainIntersectionLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksDomainIntersectionLiveRequestInfo>&gt;**](List<BacklinksDomainIntersectionLiveRequestInfo>.md)|  | [optional] |



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

<a id="pageIntersectionLive"></a>
# **pageIntersectionLive**
> BacklinksPageIntersectionLiveResponseInfo pageIntersectionLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksPageIntersectionLiveRequestInfo model = new BacklinksPageIntersectionLiveRequestInfo()
       .targets(
           Map.ofEntries(
               ))
           .excludeTargets(
               List.of(
                   "skysports.com"
                ))
           .limit(5);
    BacklinksPageIntersectionLiveResponseInfo response = apiInstance.pageIntersectionLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksPageIntersectionLiveRequestInfo>&gt;**](List<BacklinksPageIntersectionLiveRequestInfo>.md)|  | [optional] |



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

<a id="timeseriesSummaryLive"></a>
# **timeseriesSummaryLive**
> BacklinksTimeseriesSummaryLiveResponseInfo timeseriesSummaryLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksTimeseriesSummaryLiveRequestInfo model = new BacklinksTimeseriesSummaryLiveRequestInfo()
           .target("dataforseo.com")
           .dateFrom("2025-08-22")
           .dateTo("2025-10-22")
           .groupRange("month");
    BacklinksTimeseriesSummaryLiveResponseInfo response = apiInstance.timeseriesSummaryLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksTimeseriesSummaryLiveRequestInfo>&gt;**](List<BacklinksTimeseriesSummaryLiveRequestInfo>.md)|  | [optional] |



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

<a id="timeseriesNewLostSummaryLive"></a>
# **timeseriesNewLostSummaryLive**
> BacklinksTimeseriesNewLostSummaryLiveResponseInfo timeseriesNewLostSummaryLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksTimeseriesNewLostSummaryLiveRequestInfo model = new BacklinksTimeseriesNewLostSummaryLiveRequestInfo()
           .target("dataforseo.com")
           .dateFrom("2025-08-22")
           .dateTo("2025-10-22")
           .groupRange("month");
    BacklinksTimeseriesNewLostSummaryLiveResponseInfo response = apiInstance.timeseriesNewLostSummaryLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksTimeseriesNewLostSummaryLiveRequestInfo>&gt;**](List<BacklinksTimeseriesNewLostSummaryLiveRequestInfo>.md)|  | [optional] |



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

<a id="bulkRanksLive"></a>
# **bulkRanksLive**
> BacklinksBulkRanksLiveResponseInfo bulkRanksLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksBulkRanksLiveRequestInfo model = new BacklinksBulkRanksLiveRequestInfo()
           .targets(
               List.of(
                   "forbes.com",
                   "cnn.com",
                   "bbc.com",
                   "yelp.com",
                   "https://www.apple.com/iphone/",
                   "https://ahrefs.com/blog/",
                   "ibm.com",
                   "https://variety.com/",
                   "https://stackoverflow.com/",
                   "www.trustpilot.com"
                ));
    BacklinksBulkRanksLiveResponseInfo response = apiInstance.bulkRanksLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksBulkRanksLiveRequestInfo>&gt;**](List<BacklinksBulkRanksLiveRequestInfo>.md)|  | [optional] |



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

<a id="bulkBacklinksLive"></a>
# **bulkBacklinksLive**
> BacklinksBulkBacklinksLiveResponseInfo bulkBacklinksLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksBulkBacklinksLiveRequestInfo model = new BacklinksBulkBacklinksLiveRequestInfo()
           .targets(
               List.of(
                   "forbes.com",
                   "cnn.com",
                   "bbc.com",
                   "yelp.com",
                   "https://www.apple.com/iphone/",
                   "https://ahrefs.com/blog/",
                   "ibm.com",
                   "https://variety.com/",
                   "https://stackoverflow.com/",
                   "www.trustpilot.com"
                ));
    BacklinksBulkBacklinksLiveResponseInfo response = apiInstance.bulkBacklinksLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksBulkBacklinksLiveRequestInfo>&gt;**](List<BacklinksBulkBacklinksLiveRequestInfo>.md)|  | [optional] |



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

<a id="bulkSpamScoreLive"></a>
# **bulkSpamScoreLive**
> BacklinksBulkSpamScoreLiveResponseInfo bulkSpamScoreLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksBulkSpamScoreLiveRequestInfo model = new BacklinksBulkSpamScoreLiveRequestInfo()
           .targets(
               List.of(
                   "forbes.com",
                   "cnn.com",
                   "bbc.com",
                   "yelp.com",
                   "https://www.apple.com/iphone/",
                   "https://ahrefs.com/blog/",
                   "ibm.com",
                   "https://variety.com/",
                   "https://stackoverflow.com/",
                   "www.trustpilot.com"
                ));
    BacklinksBulkSpamScoreLiveResponseInfo response = apiInstance.bulkSpamScoreLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksBulkSpamScoreLiveRequestInfo>&gt;**](List<BacklinksBulkSpamScoreLiveRequestInfo>.md)|  | [optional] |



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

<a id="bulkReferringDomainsLive"></a>
# **bulkReferringDomainsLive**
> BacklinksBulkReferringDomainsLiveResponseInfo bulkReferringDomainsLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksBulkReferringDomainsLiveRequestInfo model = new BacklinksBulkReferringDomainsLiveRequestInfo()
           .targets(
               List.of(
                   "forbes.com",
                   "cnn.com",
                   "bbc.com",
                   "yelp.com",
                   "https://www.apple.com/iphone/",
                   "https://ahrefs.com/blog/",
                   "ibm.com",
                   "https://variety.com/",
                   "https://stackoverflow.com/",
                   "www.trustpilot.com"
                ));
    BacklinksBulkReferringDomainsLiveResponseInfo response = apiInstance.bulkReferringDomainsLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksBulkReferringDomainsLiveRequestInfo>&gt;**](List<BacklinksBulkReferringDomainsLiveRequestInfo>.md)|  | [optional] |



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

<a id="bulkNewLostBacklinksLive"></a>
# **bulkNewLostBacklinksLive**
> BacklinksBulkNewLostBacklinksLiveResponseInfo bulkNewLostBacklinksLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksBulkNewLostBacklinksLiveRequestInfo model = new BacklinksBulkNewLostBacklinksLiveRequestInfo()
           .targets(
               List.of(
                   "forbes.com",
                   "cnn.com",
                   "bbc.com",
                   "yelp.com",
                   "https://www.apple.com/iphone/",
                   "https://ahrefs.com/blog/",
                   "ibm.com",
                   "https://variety.com/",
                   "https://stackoverflow.com/",
                   "www.trustpilot.com"
                ))
           .dateFrom("2025-08-22");
    BacklinksBulkNewLostBacklinksLiveResponseInfo response = apiInstance.bulkNewLostBacklinksLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksBulkNewLostBacklinksLiveRequestInfo>&gt;**](List<BacklinksBulkNewLostBacklinksLiveRequestInfo>.md)|  | [optional] |



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
> BacklinksBulkNewLostReferringDomainsLiveResponseInfo bulkNewLostReferringDomainsLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksBulkNewLostReferringDomainsLiveRequestInfo model = new BacklinksBulkNewLostReferringDomainsLiveRequestInfo()
           .targets(
               List.of(
                   "forbes.com",
                   "cnn.com",
                   "bbc.com",
                   "yelp.com",
                   "https://www.apple.com/iphone/",
                   "https://ahrefs.com/blog/",
                   "ibm.com",
                   "https://variety.com/",
                   "https://stackoverflow.com/",
                   "www.trustpilot.com"
                ))
           .dateFrom("2025-08-22");
    BacklinksBulkNewLostReferringDomainsLiveResponseInfo response = apiInstance.bulkNewLostReferringDomainsLive(List.of(model));
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
    | **** | [**List&lt;List<BacklinksBulkNewLostReferringDomainsLiveRequestInfo>&gt;**](List<BacklinksBulkNewLostReferringDomainsLiveRequestInfo>.md)|  | [optional] |



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

<a id="bulkPagesSummaryLive"></a>
# **bulkPagesSummaryLive**
> BacklinksBulkPagesSummaryLiveResponseInfo bulkPagesSummaryLive()


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
    BacklinksApi apiInstance = new BacklinksApi(defaultClient);
    BacklinksBulkPagesSummaryLiveRequestInfo model = new BacklinksBulkPagesSummaryLiveRequestInfo()
           .targets(
               List.of(
                   "https://dataforseo.com/solutions",
                   "https://dataforseo.com/about-us"
                ));
    BacklinksBulkPagesSummaryLiveResponseInfo response = apiInstance.bulkPagesSummaryLive(List.of(model));
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling BacklinksApi#bulkPagesSummaryLive");
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
    | **** | [**List&lt;List<BacklinksBulkPagesSummaryLiveRequestInfo>&gt;**](List<BacklinksBulkPagesSummaryLiveRequestInfo>.md)|  | [optional] |



### Return type

[**BacklinksBulkPagesSummaryLiveResponseInfo**](BacklinksBulkPagesSummaryLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
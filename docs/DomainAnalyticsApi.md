[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# DomainAnalyticsApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**domainAnalyticsErrors**](DomainAnalyticsApi.md#domainAnalyticsErrors) | **POST** /v3/domain_analytics/errors |  |
| [**domainAnalyticsIdList**](DomainAnalyticsApi.md#domainAnalyticsIdList) | **POST** /v3/domain_analytics/id_list |  |
| [**domainAnalyticsTechnologiesLanguages**](DomainAnalyticsApi.md#domainAnalyticsTechnologiesLanguages) | **GET** /v3/domain_analytics/technologies/languages |  |
| [**domainAnalyticsTechnologiesLocations**](DomainAnalyticsApi.md#domainAnalyticsTechnologiesLocations) | **GET** /v3/domain_analytics/technologies/locations |  |
| [**technologiesAggregationTechnologiesLive**](DomainAnalyticsApi.md#technologiesAggregationTechnologiesLive) | **POST** /v3/domain_analytics/technologies/aggregation_technologies/live |  |
| [**technologiesAvailableFilters**](DomainAnalyticsApi.md#technologiesAvailableFilters) | **GET** /v3/domain_analytics/technologies/available_filters |  |
| [**technologiesDomainTechnologiesLive**](DomainAnalyticsApi.md#technologiesDomainTechnologiesLive) | **POST** /v3/domain_analytics/technologies/domain_technologies/live |  |
| [**technologiesDomainsByHtmlTermsLive**](DomainAnalyticsApi.md#technologiesDomainsByHtmlTermsLive) | **POST** /v3/domain_analytics/technologies/domains_by_html_terms/live |  |
| [**technologiesDomainsByTechnologyLive**](DomainAnalyticsApi.md#technologiesDomainsByTechnologyLive) | **POST** /v3/domain_analytics/technologies/domains_by_technology/live |  |
| [**technologiesTechnologies**](DomainAnalyticsApi.md#technologiesTechnologies) | **GET** /v3/domain_analytics/technologies/technologies |  |
| [**technologiesTechnologiesSummaryLive**](DomainAnalyticsApi.md#technologiesTechnologiesSummaryLive) | **POST** /v3/domain_analytics/technologies/technologies_summary/live |  |
| [**technologiesTechnologyStatsLive**](DomainAnalyticsApi.md#technologiesTechnologyStatsLive) | **POST** /v3/domain_analytics/technologies/technology_stats/live |  |
| [**whoisAvailableFilters**](DomainAnalyticsApi.md#whoisAvailableFilters) | **GET** /v3/domain_analytics/whois/available_filters |  |
| [**whoisOverviewLive**](DomainAnalyticsApi.md#whoisOverviewLive) | **POST** /v3/domain_analytics/whois/overview/live |  |

<a id="domainAnalyticsErrors"></a>

# **domainAnalyticsErrors**

> DomainAnalyticsErrorsResponseInfo domainAnalyticsErrors(domainAnalyticsErrorsRequestInfo)

By calling this endpoint you will receive information about the Domain Analytics API tasks that returned an error within the past 24 hours. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/errors/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    List<DomainAnalyticsErrorsRequestInfo> domainAnalyticsErrorsRequestInfo = Arrays.asList(); // List<DomainAnalyticsErrorsRequestInfo> | 
    try {
      DomainAnalyticsErrorsResponseInfo result = apiInstance.domainAnalyticsErrors(domainAnalyticsErrorsRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#domainAnalyticsErrors");
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
| **domainAnalyticsErrorsRequestInfo** | [**List&lt;DomainAnalyticsErrorsRequestInfo&gt;**](DomainAnalyticsErrorsRequestInfo.md)|  | [optional] |

### Return type

[**DomainAnalyticsErrorsResponseInfo**](DomainAnalyticsErrorsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="domainAnalyticsIdList"></a>

# **domainAnalyticsIdList**

> DomainAnalyticsIdListResponseInfo domainAnalyticsIdList(domainAnalyticsIdListRequestInfo)

This endpoint is designed to provide you with the list of IDs and metadata of the completed Domain Analytics tasks during the specified period. You will get all task IDs that were made including successful, uncompleted, and tasks that responded as errors. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/id_list/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    List<DomainAnalyticsIdListRequestInfo> domainAnalyticsIdListRequestInfo = Arrays.asList(); // List<DomainAnalyticsIdListRequestInfo> | 
    try {
      DomainAnalyticsIdListResponseInfo result = apiInstance.domainAnalyticsIdList(domainAnalyticsIdListRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#domainAnalyticsIdList");
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
| **domainAnalyticsIdListRequestInfo** | [**List&lt;DomainAnalyticsIdListRequestInfo&gt;**](DomainAnalyticsIdListRequestInfo.md)|  | [optional] |

### Return type

[**DomainAnalyticsIdListResponseInfo**](DomainAnalyticsIdListResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="domainAnalyticsTechnologiesLanguages"></a>

# **domainAnalyticsTechnologiesLanguages**

> DomainAnalyticsTechnologiesLanguagesResponseInfo domainAnalyticsTechnologiesLanguages()

You will receive the list of languages by calling this API.   As a response of the API server, you will receive JSON-encoded data containing a tasks array with the information specific to the set tasks. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/languages/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    try {
      DomainAnalyticsTechnologiesLanguagesResponseInfo result = apiInstance.domainAnalyticsTechnologiesLanguages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#domainAnalyticsTechnologiesLanguages");
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

[**DomainAnalyticsTechnologiesLanguagesResponseInfo**](DomainAnalyticsTechnologiesLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="domainAnalyticsTechnologiesLocations"></a>

# **domainAnalyticsTechnologiesLocations**

> DomainAnalyticsTechnologiesLocationsResponseInfo domainAnalyticsTechnologiesLocations()

You will receive the list of locations by this API call. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/locations/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    try {
      DomainAnalyticsTechnologiesLocationsResponseInfo result = apiInstance.domainAnalyticsTechnologiesLocations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#domainAnalyticsTechnologiesLocations");
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

[**DomainAnalyticsTechnologiesLocationsResponseInfo**](DomainAnalyticsTechnologiesLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="technologiesAggregationTechnologiesLive"></a>

# **technologiesAggregationTechnologiesLive**

> DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo technologiesAggregationTechnologiesLive(domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo)

‌‌ The Aggregation Technologies endpoint will provide you with a list of the most popular technologies websites use alongside the technologies you specify. Alternatively, you can specify technology categories or groups to obtain wider stats. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/aggregation_technologies/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    List<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo> domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo = Arrays.asList(); // List<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo> | 
    try {
      DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo result = apiInstance.technologiesAggregationTechnologiesLive(domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#technologiesAggregationTechnologiesLive");
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
| **domainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo** | [**List&lt;DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo&gt;**](DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.md)|  | [optional] |

### Return type

[**DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo**](DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="technologiesAvailableFilters"></a>

# **technologiesAvailableFilters**

> DomainAnalyticsTechnologiesAvailableFiltersResponseInfo technologiesAvailableFilters()

‌‌ Here you will find all the necessary information about filters that can be used with Domain Analytics Technologies API endpoints. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/filters/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    try {
      DomainAnalyticsTechnologiesAvailableFiltersResponseInfo result = apiInstance.technologiesAvailableFilters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#technologiesAvailableFilters");
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

[**DomainAnalyticsTechnologiesAvailableFiltersResponseInfo**](DomainAnalyticsTechnologiesAvailableFiltersResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="technologiesDomainTechnologiesLive"></a>

# **technologiesDomainTechnologiesLive**

> DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo technologiesDomainTechnologiesLive(domainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo)

‌‌ Using this endpoint you will get a list of technologies used in a particular domain. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/domain_technologies/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    List<DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo> domainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo = Arrays.asList(); // List<DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo> | 
    try {
      DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo result = apiInstance.technologiesDomainTechnologiesLive(domainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#technologiesDomainTechnologiesLive");
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
| **domainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo** | [**List&lt;DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo&gt;**](DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo.md)|  | [optional] |

### Return type

[**DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo**](DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="technologiesDomainsByHtmlTermsLive"></a>

# **technologiesDomainsByHtmlTermsLive**

> DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo technologiesDomainsByHtmlTermsLive(domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo)

‌‌ This endpoint provides domains based on the HTML terms they use on their homepage. In addition to the list of domains, you will also get their technology profiles, the country and language they belong to, and other related data. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/domains_by_html_terms/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    List<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo> domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo = Arrays.asList(); // List<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo> | 
    try {
      DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo result = apiInstance.technologiesDomainsByHtmlTermsLive(domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#technologiesDomainsByHtmlTermsLive");
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
| **domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo** | [**List&lt;DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo&gt;**](DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.md)|  | [optional] |

### Return type

[**DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo**](DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="technologiesDomainsByTechnologyLive"></a>

# **technologiesDomainsByTechnologyLive**

> DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo technologiesDomainsByTechnologyLive(domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo)

‌‌ This endpoint provides domains based on the technology they use. In addition to the list of domains, you will also get their technology profiles, the country and language they belong to, and other related data. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/domains_by_technology/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    List<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo> domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo = Arrays.asList(); // List<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo> | 
    try {
      DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo result = apiInstance.technologiesDomainsByTechnologyLive(domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#technologiesDomainsByTechnologyLive");
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
| **domainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo** | [**List&lt;DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo&gt;**](DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.md)|  | [optional] |

### Return type

[**DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo**](DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="technologiesTechnologies"></a>

# **technologiesTechnologies**

> DomainAnalyticsTechnologiesTechnologiesResponseInfo technologiesTechnologies()

This endpoint will provide you with the full list of available technologies structured by technology groups and categories each particular technology belongs to. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/technologies/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    try {
      DomainAnalyticsTechnologiesTechnologiesResponseInfo result = apiInstance.technologiesTechnologies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#technologiesTechnologies");
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

[**DomainAnalyticsTechnologiesTechnologiesResponseInfo**](DomainAnalyticsTechnologiesTechnologiesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="technologiesTechnologiesSummaryLive"></a>

# **technologiesTechnologiesSummaryLive**

> DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo technologiesTechnologiesSummaryLive(domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo)

‌‌ The Technologies Summary endpoint will provide you with the number of domains across different countries and languages that use the specified technology names, technology groups, or technology categories. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/technologies_summary/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    List<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo> domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo = Arrays.asList(); // List<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo> | 
    try {
      DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo result = apiInstance.technologiesTechnologiesSummaryLive(domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#technologiesTechnologiesSummaryLive");
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
| **domainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo** | [**List&lt;DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo&gt;**](DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.md)|  | [optional] |

### Return type

[**DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo**](DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="technologiesTechnologyStatsLive"></a>

# **technologiesTechnologyStatsLive**

> DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo technologiesTechnologyStatsLive(domainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo)

‌‌ The Technology Stats endpoint will provide you with historical data on the number of domains across different countries and languages that use the specified technology. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/technologies/technology_stats/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    List<DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo> domainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo = Arrays.asList(); // List<DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo> | 
    try {
      DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo result = apiInstance.technologiesTechnologyStatsLive(domainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#technologiesTechnologyStatsLive");
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
| **domainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo** | [**List&lt;DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo&gt;**](DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo.md)|  | [optional] |

### Return type

[**DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo**](DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="whoisAvailableFilters"></a>

# **whoisAvailableFilters**

> DomainAnalyticsWhoisAvailableFiltersResponseInfo whoisAvailableFilters()

‌‌ Here you will find all the necessary information about filters that can be used with Domain Analytics Whois API. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/whois/filters/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    try {
      DomainAnalyticsWhoisAvailableFiltersResponseInfo result = apiInstance.whoisAvailableFilters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#whoisAvailableFilters");
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

[**DomainAnalyticsWhoisAvailableFiltersResponseInfo**](DomainAnalyticsWhoisAvailableFiltersResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="whoisOverviewLive"></a>

# **whoisOverviewLive**

> DomainAnalyticsWhoisOverviewLiveResponseInfo whoisOverviewLive(domainAnalyticsWhoisOverviewLiveRequestInfo)

‌ This endpoint will provide you with Whois data enriched with backlink stats, and ranking and traffic info from organic and paid search results. Using this endpoint you will be able to get all these data for the domains matching the parameters you specify in the request. for more info please visit &#39;https://docs.dataforseo.com/v3/domain_analytics/whois/overview/live/?bash&#39;

### Example

```java
// Import classes:
import io.github.dataforseo.dataforseo_client.ApiClient;
import io.github.dataforseo.dataforseo_client.ApiException;
import io.github.dataforseo.dataforseo_client.Configuration;
import io.github.dataforseo.dataforseo_client.auth.*;
import io.github.dataforseo.dataforseo_client.models.*;
import io.github.dataforseo.dataforseo_client.api.DomainAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    List<DomainAnalyticsWhoisOverviewLiveRequestInfo> domainAnalyticsWhoisOverviewLiveRequestInfo = Arrays.asList(); // List<DomainAnalyticsWhoisOverviewLiveRequestInfo> | 
    try {
      DomainAnalyticsWhoisOverviewLiveResponseInfo result = apiInstance.whoisOverviewLive(domainAnalyticsWhoisOverviewLiveRequestInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainAnalyticsApi#whoisOverviewLive");
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
| **domainAnalyticsWhoisOverviewLiveRequestInfo** | [**List&lt;DomainAnalyticsWhoisOverviewLiveRequestInfo&gt;**](DomainAnalyticsWhoisOverviewLiveRequestInfo.md)|  | [optional] |

### Return type

[**DomainAnalyticsWhoisOverviewLiveResponseInfo**](DomainAnalyticsWhoisOverviewLiveResponseInfo.md)

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
# DomainAnalyticsApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**domainAnalyticsIdList**](DomainAnalyticsApi.md#domainAnalyticsIdList) | **POST**  /v3/domain_analytics/id_list  |
| [**domainAnalyticsErrors**](DomainAnalyticsApi.md#domainAnalyticsErrors) | **POST**  /v3/domain_analytics/errors  |
| [**technologiesAvailableFilters**](DomainAnalyticsApi.md#technologiesAvailableFilters) | **GET**  /v3/domain_analytics/technologies/available_filters  |
| [**domainAnalyticsTechnologiesLocations**](DomainAnalyticsApi.md#domainAnalyticsTechnologiesLocations) | **GET**  /v3/domain_analytics/technologies/locations  |
| [**domainAnalyticsTechnologiesLanguages**](DomainAnalyticsApi.md#domainAnalyticsTechnologiesLanguages) | **GET**  /v3/domain_analytics/technologies/languages  |
| [**technologiesTechnologies**](DomainAnalyticsApi.md#technologiesTechnologies) | **GET**  /v3/domain_analytics/technologies/technologies  |
| [**technologiesAggregationTechnologiesLive**](DomainAnalyticsApi.md#technologiesAggregationTechnologiesLive) | **POST**  /v3/domain_analytics/technologies/aggregation_technologies/live  |
| [**technologiesTechnologiesSummaryLive**](DomainAnalyticsApi.md#technologiesTechnologiesSummaryLive) | **POST**  /v3/domain_analytics/technologies/technologies_summary/live  |
| [**technologiesTechnologyStatsLive**](DomainAnalyticsApi.md#technologiesTechnologyStatsLive) | **POST**  /v3/domain_analytics/technologies/technology_stats/live  |
| [**technologiesDomainsByTechnologyLive**](DomainAnalyticsApi.md#technologiesDomainsByTechnologyLive) | **POST**  /v3/domain_analytics/technologies/domains_by_technology/live  |
| [**technologiesDomainsByHtmlTermsLive**](DomainAnalyticsApi.md#technologiesDomainsByHtmlTermsLive) | **POST**  /v3/domain_analytics/technologies/domains_by_html_terms/live  |
| [**technologiesDomainTechnologiesLive**](DomainAnalyticsApi.md#technologiesDomainTechnologiesLive) | **POST**  /v3/domain_analytics/technologies/domain_technologies/live  |
| [**whoisAvailableFilters**](DomainAnalyticsApi.md#whoisAvailableFilters) | **GET**  /v3/domain_analytics/whois/available_filters  |
| [**whoisOverviewLive**](DomainAnalyticsApi.md#whoisOverviewLive) | **POST**  /v3/domain_analytics/whois/overview/live  |

<a id="domainAnalyticsIdList"></a>
# **domainAnalyticsIdList**
> DomainAnalyticsIdListResponseInfo domainAnalyticsIdList()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    DomainAnalyticsIdListRequestInfo model = new DomainAnalyticsIdListRequestInfo()
           .datetimeFrom("2025-08-10 11:01:41 +00:00")
           .datetimeTo("2025-10-10 11:01:41 +00:00")
           .limit(100)
           .offset(0)
           .sort("desc");
    DomainAnalyticsIdListResponseInfo response = apiInstance.domainAnalyticsIdList(List.of(model));
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
    | **** | [**List&lt;List<DomainAnalyticsIdListRequestInfo>&gt;**](List<DomainAnalyticsIdListRequestInfo>.md)|  | [optional] |



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

<a id="domainAnalyticsErrors"></a>
# **domainAnalyticsErrors**
> DomainAnalyticsErrorsResponseInfo domainAnalyticsErrors()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    DomainAnalyticsErrorsRequestInfo model = new DomainAnalyticsErrorsRequestInfo()
           .limit(10)
           .offset(0)
           .filteredFunction("pingback_url");
    DomainAnalyticsErrorsResponseInfo response = apiInstance.domainAnalyticsErrors(List.of(model));
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
    | **** | [**List&lt;List<DomainAnalyticsErrorsRequestInfo>&gt;**](List<DomainAnalyticsErrorsRequestInfo>.md)|  | [optional] |



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

<a id="technologiesAvailableFilters"></a>
# **technologiesAvailableFilters**
> DomainAnalyticsTechnologiesAvailableFiltersResponseInfo technologiesAvailableFilters()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);

    DomainAnalyticsTechnologiesAvailableFiltersResponseInfo response = apiInstance.technologiesAvailableFilters();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="domainAnalyticsTechnologiesLocations"></a>
# **domainAnalyticsTechnologiesLocations**
> DomainAnalyticsTechnologiesLocationsResponseInfo domainAnalyticsTechnologiesLocations()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);

    DomainAnalyticsTechnologiesLocationsResponseInfo response = apiInstance.domainAnalyticsTechnologiesLocations();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="domainAnalyticsTechnologiesLanguages"></a>
# **domainAnalyticsTechnologiesLanguages**
> DomainAnalyticsTechnologiesLanguagesResponseInfo domainAnalyticsTechnologiesLanguages()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);

    DomainAnalyticsTechnologiesLanguagesResponseInfo response = apiInstance.domainAnalyticsTechnologiesLanguages();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="technologiesTechnologies"></a>
# **technologiesTechnologies**
> DomainAnalyticsTechnologiesTechnologiesResponseInfo technologiesTechnologies()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);

    DomainAnalyticsTechnologiesTechnologiesResponseInfo response = apiInstance.technologiesTechnologies();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="technologiesAggregationTechnologiesLive"></a>
# **technologiesAggregationTechnologiesLive**
> DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo technologiesAggregationTechnologiesLive()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo model = new DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo()
           .technology("Nginx")
           .keyword("WordPress")
           .mode("entry")
           .limit(10);
    DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo response = apiInstance.technologiesAggregationTechnologiesLive(List.of(model));
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
    | **** | [**List&lt;List<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo>&gt;**](List<DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo>.md)|  | [optional] |



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

<a id="technologiesTechnologiesSummaryLive"></a>
# **technologiesTechnologiesSummaryLive**
> DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo technologiesTechnologiesSummaryLive()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo model = new DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo()
           .technologies(
               List.of(
                   "Ngi"
                ))
           .keywords(
               List.of(
                   "WordPress"
                ))
           .mode("entry");
    DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo response = apiInstance.technologiesTechnologiesSummaryLive(List.of(model));
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
    | **** | [**List&lt;List<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo>&gt;**](List<DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo>.md)|  | [optional] |



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
> DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo technologiesTechnologyStatsLive()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo model = new DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo()
           .technology("jQuery")
           .dateFrom("2025-08-10")
           .dateTo("2025-10-10");
    DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo response = apiInstance.technologiesTechnologyStatsLive(List.of(model));
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
    | **** | [**List&lt;List<DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo>&gt;**](List<DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo>.md)|  | [optional] |



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

<a id="technologiesDomainsByTechnologyLive"></a>
# **technologiesDomainsByTechnologyLive**
> DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo technologiesDomainsByTechnologyLive()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo model = new DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo()
           .technologies(
               List.of(
                   "Nginx"
                ))
           .limit(10);
    DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo response = apiInstance.technologiesDomainsByTechnologyLive(List.of(model));
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
    | **** | [**List&lt;List<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo>&gt;**](List<DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo>.md)|  | [optional] |



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

<a id="technologiesDomainsByHtmlTermsLive"></a>
# **technologiesDomainsByHtmlTermsLive**
> DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo technologiesDomainsByHtmlTermsLive()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo model = new DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo()
           .searchTerms(
               List.of(
                   "data-attrid"
                ))
           .limit(10)
           .offset(0);
    DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo response = apiInstance.technologiesDomainsByHtmlTermsLive(List.of(model));
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
    | **** | [**List&lt;List<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo>&gt;**](List<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo>.md)|  | [optional] |



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

<a id="technologiesDomainTechnologiesLive"></a>
# **technologiesDomainTechnologiesLive**
> DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo technologiesDomainTechnologiesLive()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo model = new DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo()
           .target("dataforseo.com");
    DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo response = apiInstance.technologiesDomainTechnologiesLive(List.of(model));
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
    | **** | [**List&lt;List<DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo>&gt;**](List<DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo>.md)|  | [optional] |



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

<a id="whoisAvailableFilters"></a>
# **whoisAvailableFilters**
> DomainAnalyticsWhoisAvailableFiltersResponseInfo whoisAvailableFilters()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);

    DomainAnalyticsWhoisAvailableFiltersResponseInfo response = apiInstance.whoisAvailableFilters();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="whoisOverviewLive"></a>
# **whoisOverviewLive**
> DomainAnalyticsWhoisOverviewLiveResponseInfo whoisOverviewLive()


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
    DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
    DomainAnalyticsWhoisOverviewLiveRequestInfo model = new DomainAnalyticsWhoisOverviewLiveRequestInfo()
           .limit(2);
    DomainAnalyticsWhoisOverviewLiveResponseInfo response = apiInstance.whoisOverviewLive(List.of(model));
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
    | **** | [**List&lt;List<DomainAnalyticsWhoisOverviewLiveRequestInfo>&gt;**](List<DomainAnalyticsWhoisOverviewLiveRequestInfo>.md)|  | [optional] |



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
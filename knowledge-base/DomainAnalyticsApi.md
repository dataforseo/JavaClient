# DomainAnalyticsApi

Knowledge base for `io.github.dataforseo.client.api.DomainAnalyticsApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

Information about websites as such: the technologies a site is built with (CMS, analytics, frameworks, advertising and other tools), which sites use a given technology, statistics of technology usage, and domain registration (Whois) data enriched with search and backlink metrics.

## Use it when you need

- The technology profile of a website.
- Lists of websites that use a technology or contain certain terms in their HTML, for lead generation or market research, filtered by country, language or popularity.
- Market share and adoption trends of technologies.
- Domain registration details (registrar, creation, update and expiration dates), for example to find expiring domains, together with traffic and backlink indicators.

## Use another API when

- You need the content, technical SEO health or performance of a website's pages: `OnPageApi`.
- You need a website's backlinks: `BacklinksApi`; its keywords, rankings or traffic estimates: `DataforseoLabsApi`.

## Examples

Generated from the API specification in the same way as the client tests. Replace `USERNAME` / `PASSWORD` with your API login and password. Every example is a method body that throws `ApiException` and needs:

```java
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.HttpBasicAuth;
import io.github.dataforseo.client.api.*;
import io.github.dataforseo.client.model.*;
import java.util.List;
import java.util.Map;
```

### technologiesDomainTechnologiesLive

`POST /v3/domain_analytics/technologies/domain_technologies/live`

```java
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
```

### whoisOverviewLive

`POST /v3/domain_analytics/whois/overview/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
DomainAnalyticsWhoisOverviewLiveRequestInfo model = new DomainAnalyticsWhoisOverviewLiveRequestInfo()
    .limit(2)
    .filters(List.of(
        List.of(
            "epp_status_codes",
            "in",
            List.of(
                "client_transfer_prohibited",
                "client_update_prohibited"
            )
        )
    ));
DomainAnalyticsWhoisOverviewLiveResponseInfo response = apiInstance.whoisOverviewLive(List.of(model));
```

### technologiesDomainsByTechnologyLive

`POST /v3/domain_analytics/technologies/domains_by_technology/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo model = new DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo()
    .technologies(List.of(
        "Nginx"
    ))
    .filters(List.of(
        List.of(
            "country_iso_code",
            "=",
            "US"
        ),
        "and",
        List.of(
            "domain_rank",
            ">",
            800
        )
    ))
    .orderBy(List.of(
        "last_visited,desc"
    ))
    .limit(10);
DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo response = apiInstance.technologiesDomainsByTechnologyLive(List.of(model));
```

### domainAnalyticsIdList

`POST /v3/domain_analytics/id_list`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
DomainAnalyticsIdListRequestInfo model = new DomainAnalyticsIdListRequestInfo()
    .limit(10)
    .includeMetadata(true);
DomainAnalyticsIdListResponseInfo response = apiInstance.domainAnalyticsIdList(List.of(model));
```

### technologiesDomainsByHtmlTermsLive

`POST /v3/domain_analytics/technologies/domains_by_html_terms/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo model = new DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo()
    .searchTerms(List.of(
        "data-attrid"
    ))
    .orderBy(List.of(
        "last_visited,desc"
    ))
    .limit(10)
    .offset(0);
DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo response = apiInstance.technologiesDomainsByHtmlTermsLive(List.of(model));
```

### technologiesTechnologies

`GET /v3/domain_analytics/technologies/technologies`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);

DomainAnalyticsTechnologiesTechnologiesResponseInfo response = apiInstance.technologiesTechnologies();
```

### technologiesAggregationTechnologiesLive

`POST /v3/domain_analytics/technologies/aggregation_technologies/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo model = new DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo()
    .mode("entry")
    .technology("Nginx")
    .keyword("WordPress")
    .filters(List.of(
        List.of(
            "country_iso_code",
            "=",
            "US"
        ),
        "and",
        List.of(
            "domain_rank",
            ">",
            800
        )
    ))
    .orderBy(List.of(
        "groups_count,desc"
    ))
    .limit(10);
DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo response = apiInstance.technologiesAggregationTechnologiesLive(List.of(model));
```

### technologiesTechnologiesSummaryLive

`POST /v3/domain_analytics/technologies/technologies_summary/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo model = new DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo()
    .mode("entry")
    .technologies(List.of(
        "Ngi"
    ))
    .keywords(List.of(
        "WordPress"
    ))
    .filters(List.of(
        List.of(
            "country_iso_code",
            "=",
            "US"
        ),
        "and",
        List.of(
            "domain_rank",
            ">",
            800
        )
    ));
DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo response = apiInstance.technologiesTechnologiesSummaryLive(List.of(model));
```

### technologiesLocations

`GET /v3/domain_analytics/technologies/locations`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);

DomainAnalyticsTechnologiesLocationsResponseInfo response = apiInstance.technologiesLocations();
```

### technologiesTechnologyStatsLive

`POST /v3/domain_analytics/technologies/technology_stats/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DomainAnalyticsApi apiInstance = new DomainAnalyticsApi(defaultClient);
DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo model = new DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo()
    .technology("jQuery");
DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo response = apiInstance.technologiesTechnologyStatsLive(List.of(model));
```

## Endpoints

All methods of `DomainAnalyticsApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `domainAnalyticsIdList` | POST | `/v3/domain_analytics/id_list` |
| `domainAnalyticsErrors` | POST | `/v3/domain_analytics/errors` |
| `technologiesAvailableFilters` | GET | `/v3/domain_analytics/technologies/available_filters` |
| `technologiesLocations` | GET | `/v3/domain_analytics/technologies/locations` |
| `technologiesLanguages` | GET | `/v3/domain_analytics/technologies/languages` |
| `technologiesTechnologies` | GET | `/v3/domain_analytics/technologies/technologies` |
| `technologiesAggregationTechnologiesLive` | POST | `/v3/domain_analytics/technologies/aggregation_technologies/live` |
| `technologiesTechnologiesSummaryLive` | POST | `/v3/domain_analytics/technologies/technologies_summary/live` |
| `technologiesTechnologyStatsLive` | POST | `/v3/domain_analytics/technologies/technology_stats/live` |
| `technologiesDomainsByTechnologyLive` | POST | `/v3/domain_analytics/technologies/domains_by_technology/live` |
| `technologiesDomainsByHtmlTermsLive` | POST | `/v3/domain_analytics/technologies/domains_by_html_terms/live` |
| `technologiesDomainTechnologiesLive` | POST | `/v3/domain_analytics/technologies/domain_technologies/live` |
| `whoisAvailableFilters` | GET | `/v3/domain_analytics/whois/available_filters` |
| `whoisOverviewLive` | POST | `/v3/domain_analytics/whois/overview/live` |
# BacklinksApi

Knowledge base for `io.github.dataforseo.client.api.BacklinksApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

Backlink data for any domain, subdomain or web page from DataForSEO's continuously updated link index: inbound links, referring domains, pages and networks, anchor texts, link-based authority (rank) and spam score, how the link profile changes over time, and how it compares with other sites.

Data is returned immediately from the index and can be filtered, sorted and paged. Many metrics are also available in bulk for large lists of targets.

## Use it when you need

- An overview of a site's link profile and authority.
- Detailed lists of backlinks, referring domains or anchors of a target, filtered by attributes such as dofollow, first seen date or authority.
- New and lost links over time, or the history of a link profile.
- Link building and competitive research: sites with similar link profiles, or domains that link to competitors but not to you.
- Quick authority or spam checks for many domains or URLs at once.

## Use another API when

- You need search rankings, keywords or traffic of a site: `DataforseoLabsApi` or `SerpApi`.
- You need a technical audit of a site, including its internal and outgoing links: `OnPageApi`.
- You need mentions of a brand without a link: `ContentAnalysisApi` (web) or `AiOptimizationApi` (AI answers).

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

### backlinksLive

`POST /v3/backlinks/backlinks/live`

```java
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
    .filters(List.of(
        "dofollow",
        "=",
        true
    ))
    .limit(5);
BacklinksBacklinksLiveResponseInfo response = apiInstance.backlinksLive(List.of(model));
```

### summaryLive

`POST /v3/backlinks/summary/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BacklinksApi apiInstance = new BacklinksApi(defaultClient);
BacklinksSummaryLiveRequestInfo model = new BacklinksSummaryLiveRequestInfo()
    .target("explodingtopics.com")
    .internalListLimit(10)
    .includeSubdomains(true)
    .backlinksFilters(List.of(
        "dofollow",
        "=",
        true
    ))
    .backlinksStatusType("all");
BacklinksSummaryLiveResponseInfo response = apiInstance.summaryLive(List.of(model));
```

### referringDomainsLive

`POST /v3/backlinks/referring_domains/live`

```java
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
    .orderBy(List.of(
        "rank,desc"
    ))
    .excludeInternalBacklinks(true)
    .backlinksFilters(List.of(
        "dofollow",
        "=",
        true
    ))
    .filters(List.of(
        "backlinks",
        ">",
        100
    ));
BacklinksReferringDomainsLiveResponseInfo response = apiInstance.referringDomainsLive(List.of(model));
```

### bulkRanksLive

`POST /v3/backlinks/bulk_ranks/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BacklinksApi apiInstance = new BacklinksApi(defaultClient);
BacklinksBulkRanksLiveRequestInfo model = new BacklinksBulkRanksLiveRequestInfo()
    .targets(List.of(
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
```

### anchorsLive

`POST /v3/backlinks/anchors/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BacklinksApi apiInstance = new BacklinksApi(defaultClient);
BacklinksAnchorsLiveRequestInfo model = new BacklinksAnchorsLiveRequestInfo()
    .target("forbes.com")
    .limit(4)
    .orderBy(List.of(
        "backlinks,desc"
    ))
    .filters(List.of(
        "anchor",
        "like",
        "%news%"
    ));
BacklinksAnchorsLiveResponseInfo response = apiInstance.anchorsLive(List.of(model));
```

### bulkReferringDomainsLive

`POST /v3/backlinks/bulk_referring_domains/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BacklinksApi apiInstance = new BacklinksApi(defaultClient);
BacklinksBulkReferringDomainsLiveRequestInfo model = new BacklinksBulkReferringDomainsLiveRequestInfo()
    .targets(List.of(
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
```

### bulkPagesSummaryLive

`POST /v3/backlinks/bulk_pages_summary/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BacklinksApi apiInstance = new BacklinksApi(defaultClient);
BacklinksBulkPagesSummaryLiveRequestInfo model = new BacklinksBulkPagesSummaryLiveRequestInfo()
    .targets(List.of(
        "https://dataforseo.com/solutions",
        "https://dataforseo.com/about-us"
    ));
BacklinksBulkPagesSummaryLiveResponseInfo response = apiInstance.bulkPagesSummaryLive(List.of(model));
```

### historyLive

`POST /v3/backlinks/history/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BacklinksApi apiInstance = new BacklinksApi(defaultClient);
BacklinksHistoryLiveRequestInfo model = new BacklinksHistoryLiveRequestInfo()
    .target("cnn.com");
BacklinksHistoryLiveResponseInfo response = apiInstance.historyLive(List.of(model));
```

### bulkBacklinksLive

`POST /v3/backlinks/bulk_backlinks/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BacklinksApi apiInstance = new BacklinksApi(defaultClient);
BacklinksBulkBacklinksLiveRequestInfo model = new BacklinksBulkBacklinksLiveRequestInfo()
    .targets(List.of(
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
```

## Endpoints

All methods of `BacklinksApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `backlinksIdList` | POST | `/v3/backlinks/id_list` |
| `backlinksErrors` | POST | `/v3/backlinks/errors` |
| `backlinksAvailableFilters` | GET | `/v3/backlinks/available_filters` |
| `index` | GET | `/v3/backlinks/index` |
| `summaryLive` | POST | `/v3/backlinks/summary/live` |
| `historyLive` | POST | `/v3/backlinks/history/live` |
| `backlinksLive` | POST | `/v3/backlinks/backlinks/live` |
| `anchorsLive` | POST | `/v3/backlinks/anchors/live` |
| `domainPagesLive` | POST | `/v3/backlinks/domain_pages/live` |
| `domainPagesSummaryLive` | POST | `/v3/backlinks/domain_pages_summary/live` |
| `referringDomainsLive` | POST | `/v3/backlinks/referring_domains/live` |
| `referringNetworksLive` | POST | `/v3/backlinks/referring_networks/live` |
| `competitorsLive` | POST | `/v3/backlinks/competitors/live` |
| `domainIntersectionLive` | POST | `/v3/backlinks/domain_intersection/live` |
| `pageIntersectionLive` | POST | `/v3/backlinks/page_intersection/live` |
| `timeseriesSummaryLive` | POST | `/v3/backlinks/timeseries_summary/live` |
| `timeseriesNewLostSummaryLive` | POST | `/v3/backlinks/timeseries_new_lost_summary/live` |
| `bulkRanksLive` | POST | `/v3/backlinks/bulk_ranks/live` |
| `bulkBacklinksLive` | POST | `/v3/backlinks/bulk_backlinks/live` |
| `bulkSpamScoreLive` | POST | `/v3/backlinks/bulk_spam_score/live` |
| `bulkReferringDomainsLive` | POST | `/v3/backlinks/bulk_referring_domains/live` |
| `bulkNewLostBacklinksLive` | POST | `/v3/backlinks/bulk_new_lost_backlinks/live` |
| `bulkNewLostReferringDomainsLive` | POST | `/v3/backlinks/bulk_new_lost_referring_domains/live` |
| `bulkPagesSummaryLive` | POST | `/v3/backlinks/bulk_pages_summary/live` |
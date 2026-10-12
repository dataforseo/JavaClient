# DataforseoLabsApi

Knowledge base for `io.github.dataforseo.client.api.DataforseoLabsApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

Keyword research, competitor analysis and search analytics from DataForSEO's own databases of keywords, search results and rankings, for search engines and platforms such as Google, Amazon, Google Play and the App Store.

Because the data is precomputed, one request can cover many keywords or domains, return historical data and combine metrics (search volume, keyword difficulty, search intent, rankings, estimated traffic) without crawling search results on demand.

## Use it when you need

- Keyword research: ideas, suggestions and related keywords for a topic, with their search volume, difficulty and intent.
- The keywords a domain, page, product or app ranks for, its positions and estimated traffic, now and in the past.
- Competitors of a domain, product or app in search, and the keywords they share or do not share (keyword gap).
- Market-level views: top searches, keyword categories, rankings across many domains at once.

## Use another API when

- You need live, exact search results for a specific query right now: `SerpApi`.
- You need search volume and CPC as reported by an advertising platform, ad traffic forecasts or trends: `KeywordsDataApi`.
- You need backlinks and link-based authority: `BacklinksApi`.
- You need AI search visibility rather than classic search: `AiOptimizationApi`.

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

### googleRankedKeywordsLive

`POST /v3/dataforseo_labs/google/ranked_keywords/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
DataforseoLabsGoogleRankedKeywordsLiveRequestInfo model = new DataforseoLabsGoogleRankedKeywordsLiveRequestInfo()
    .target("dataforseo.com")
    .languageName("English")
    .locationName("United States")
    .loadRankAbsolute(true)
    .limit(3);
DataforseoLabsGoogleRankedKeywordsLiveResponseInfo response = apiInstance.googleRankedKeywordsLive(List.of(model));
```

### googleKeywordSuggestionsLive

`POST /v3/dataforseo_labs/google/keyword_suggestions/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo model = new DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo()
    .keyword("phone")
    .locationCode(2840)
    .languageCode("en")
    .includeSerpInfo(true)
    .includeSeedKeyword(true)
    .limit(1);
DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo response = apiInstance.googleKeywordSuggestionsLive(List.of(model));
```

### googleDomainIntersectionLive

`POST /v3/dataforseo_labs/google/domain_intersection/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
DataforseoLabsGoogleDomainIntersectionLiveRequestInfo model = new DataforseoLabsGoogleDomainIntersectionLiveRequestInfo()
    .target1("mom.com")
    .target2("quora.com")
    .languageCode("en")
    .locationCode(2840)
    .includeSerpInfo(true)
    .limit(3);
DataforseoLabsGoogleDomainIntersectionLiveResponseInfo response = apiInstance.googleDomainIntersectionLive(List.of(model));
```

### googleKeywordOverviewLive

`POST /v3/dataforseo_labs/google/keyword_overview/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
DataforseoLabsGoogleKeywordOverviewLiveRequestInfo model = new DataforseoLabsGoogleKeywordOverviewLiveRequestInfo()
    .languageCode("en")
    .locationCode(2840)
    .includeClickstreamData(true)
    .includeSerpInfo(true)
    .keywords(List.of(
        "iphone"
    ));
DataforseoLabsGoogleKeywordOverviewLiveResponseInfo response = apiInstance.googleKeywordOverviewLive(List.of(model));
```

### googleHistoricalSerpsLive

`POST /v3/dataforseo_labs/google/historical_serps/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo model = new DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo()
    .keyword("albert einstein")
    .locationCode(2840)
    .languageCode("en");
DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo response = apiInstance.googleHistoricalSerpsLive(List.of(model));
```

### googleRelatedKeywordsLive

`POST /v3/dataforseo_labs/google/related_keywords/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo model = new DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo()
    .keyword("phone")
    .languageName("English")
    .locationCode(2840)
    .limit(3);
DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo response = apiInstance.googleRelatedKeywordsLive(List.of(model));
```

### googleDomainRankOverviewLive

`POST /v3/dataforseo_labs/google/domain_rank_overview/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo model = new DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo()
    .target("dataforseo.com")
    .languageName("English")
    .locationCode(2840);
DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo response = apiInstance.googleDomainRankOverviewLive(List.of(model));
```

### googleSearchIntentLive

`POST /v3/dataforseo_labs/google/search_intent/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
DataforseoLabsGoogleSearchIntentLiveRequestInfo model = new DataforseoLabsGoogleSearchIntentLiveRequestInfo()
    .keywords(List.of(
        "login page",
        "audi a7",
        "elon musk",
        "milk store new york"
    ));
DataforseoLabsGoogleSearchIntentLiveResponseInfo response = apiInstance.googleSearchIntentLive(List.of(model));
```

### googleCategoriesForDomainLive

`POST /v3/dataforseo_labs/google/categories_for_domain/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
DataforseoLabsApi apiInstance = new DataforseoLabsApi(defaultClient);
DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo model = new DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo()
    .target("dataforseo.com")
    .languageCode("en")
    .locationName("United States")
    .itemTypes(List.of(
        "paid",
        "organic",
        "featured_snippet",
        "local_pack"
    ))
    .limit(3);
DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo response = apiInstance.googleCategoriesForDomainLive(List.of(model));
```

## Endpoints

All methods of `DataforseoLabsApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `dataforseoLabsIdList` | POST | `/v3/dataforseo_labs/id_list` |
| `status` | GET | `/v3/dataforseo_labs/status` |
| `dataforseoLabsErrors` | POST | `/v3/dataforseo_labs/errors` |
| `availableFilters` | GET | `/v3/dataforseo_labs/available_filters` |
| `locationsAndLanguages` | GET | `/v3/dataforseo_labs/locations_and_languages` |
| `categories` | GET | `/v3/dataforseo_labs/categories` |
| `googleAvailableHistory` | GET | `/v3/dataforseo_labs/google/available_history` |
| `googleKeywordsForSiteLive` | POST | `/v3/dataforseo_labs/google/keywords_for_site/live` |
| `googleRelatedKeywordsLive` | POST | `/v3/dataforseo_labs/google/related_keywords/live` |
| `googleKeywordSuggestionsLive` | POST | `/v3/dataforseo_labs/google/keyword_suggestions/live` |
| `googleKeywordIdeasLive` | POST | `/v3/dataforseo_labs/google/keyword_ideas/live` |
| `googleBulkKeywordDifficultyLive` | POST | `/v3/dataforseo_labs/google/bulk_keyword_difficulty/live` |
| `googleSearchIntentLive` | POST | `/v3/dataforseo_labs/google/search_intent/live` |
| `googleCategoriesForKeywordsLanguages` | GET | `/v3/dataforseo_labs/google/categories_for_keywords/languages` |
| `googleCategoriesForDomainLive` | POST | `/v3/dataforseo_labs/google/categories_for_domain/live` |
| `googleCategoriesForKeywordsLive` | POST | `/v3/dataforseo_labs/google/categories_for_keywords/live` |
| `googleKeywordsForCategoriesLive` | POST | `/v3/dataforseo_labs/google/keywords_for_categories/live` |
| `googleDomainMetricsByCategoriesLive` | POST | `/v3/dataforseo_labs/google/domain_metrics_by_categories/live` |
| `googleTopSearchesLive` | POST | `/v3/dataforseo_labs/google/top_searches/live` |
| `googleRankedKeywordsLive` | POST | `/v3/dataforseo_labs/google/ranked_keywords/live` |
| `googleSerpCompetitorsLive` | POST | `/v3/dataforseo_labs/google/serp_competitors/live` |
| `googleCompetitorsDomainLive` | POST | `/v3/dataforseo_labs/google/competitors_domain/live` |
| `googleDomainIntersectionLive` | POST | `/v3/dataforseo_labs/google/domain_intersection/live` |
| `googleSubdomainsLive` | POST | `/v3/dataforseo_labs/google/subdomains/live` |
| `googleRelevantPagesLive` | POST | `/v3/dataforseo_labs/google/relevant_pages/live` |
| `googleDomainRankOverviewLive` | POST | `/v3/dataforseo_labs/google/domain_rank_overview/live` |
| `googleHistoricalSerpsLive` | POST | `/v3/dataforseo_labs/google/historical_serps/live` |
| `googleHistoricalRankOverviewLive` | POST | `/v3/dataforseo_labs/google/historical_rank_overview/live` |
| `googlePageIntersectionLive` | POST | `/v3/dataforseo_labs/google/page_intersection/live` |
| `googleHistoricalSearchVolumeLive` | POST | `/v3/dataforseo_labs/google/historical_search_volume/live` |
| `googleBulkTrafficEstimationLive` | POST | `/v3/dataforseo_labs/google/bulk_traffic_estimation/live` |
| `googleHistoricalBulkTrafficEstimationLive` | POST | `/v3/dataforseo_labs/google/historical_bulk_traffic_estimation/live` |
| `googleHistoricalKeywordDataLive` | POST | `/v3/dataforseo_labs/google/historical_keyword_data/live` |
| `googleKeywordOverviewLive` | POST | `/v3/dataforseo_labs/google/keyword_overview/live` |
| `amazonBulkSearchVolumeLive` | POST | `/v3/dataforseo_labs/amazon/bulk_search_volume/live` |
| `amazonRelatedKeywordsLive` | POST | `/v3/dataforseo_labs/amazon/related_keywords/live` |
| `amazonRankedKeywordsLive` | POST | `/v3/dataforseo_labs/amazon/ranked_keywords/live` |
| `amazonProductRankOverviewLive` | POST | `/v3/dataforseo_labs/amazon/product_rank_overview/live` |
| `amazonProductCompetitorsLive` | POST | `/v3/dataforseo_labs/amazon/product_competitors/live` |
| `amazonProductKeywordIntersectionsLive` | POST | `/v3/dataforseo_labs/amazon/product_keyword_intersections/live` |
| `googleBulkAppMetricsLive` | POST | `/v3/dataforseo_labs/google/bulk_app_metrics/live` |
| `googleKeywordsForAppLive` | POST | `/v3/dataforseo_labs/google/keywords_for_app/live` |
| `googleAppCompetitorsLive` | POST | `/v3/dataforseo_labs/google/app_competitors/live` |
| `googleAppIntersectionLive` | POST | `/v3/dataforseo_labs/google/app_intersection/live` |
| `appleBulkAppMetricsLive` | POST | `/v3/dataforseo_labs/apple/bulk_app_metrics/live` |
| `appleKeywordsForAppLive` | POST | `/v3/dataforseo_labs/apple/keywords_for_app/live` |
| `appleAppCompetitorsLive` | POST | `/v3/dataforseo_labs/apple/app_competitors/live` |
| `appleAppIntersectionLive` | POST | `/v3/dataforseo_labs/apple/app_intersection/live` |
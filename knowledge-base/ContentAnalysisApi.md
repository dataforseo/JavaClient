# ContentAnalysisApi

Knowledge base for `io.github.dataforseo.client.api.ContentAnalysisApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

Brand monitoring and sentiment analysis across the web: pages that mention (cite) a keyword or brand, with the sentiment polarity and emotional connotations of each mention, content ratings and categories, and aggregated trends of mentions over time.

## Use it when you need

- Where and how a brand, product, person or topic is mentioned on the web: news, blogs, forums, reviews and other pages.
- Whether mentions are positive, negative or neutral, and which emotions they carry.
- An aggregated picture of mentions: top sources, countries, languages, page types and content categories.
- How the volume and sentiment of mentions change over time for a keyword or a content category.

## Use another API when

- You need links pointing to a site rather than text mentions: `BacklinksApi`.
- You need mentions in AI assistant answers: `AiOptimizationApi`.
- You need reviews of a specific business on review platforms: `BusinessDataApi`.

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

### searchLive

`POST /v3/content_analysis/search/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
ContentAnalysisSearchLiveRequestInfo model = new ContentAnalysisSearchLiveRequestInfo()
    .keywordFields(Map.ofEntries(
        Map.entry("snippet", "logitech")
    ))
    .keyword("logitech")
    .pageType(List.of(
        "ecommerce",
        "news",
        "blogs",
        "message-boards",
        "organization"
    ))
    .searchMode("as_is")
    .filters(List.of(
        "main_domain",
        "=",
        "reviewfinder.ca"
    ))
    .orderBy(List.of(
        "content_info.sentiment_connotations.anger,desc"
    ))
    .limit(10);
ContentAnalysisSearchLiveResponseInfo response = apiInstance.searchLive(List.of(model));
```

### contentAnalysisSummaryLive

`POST /v3/content_analysis/summary/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
ContentAnalysisSummaryLiveRequestInfo model = new ContentAnalysisSummaryLiveRequestInfo()
    .keyword("logitech")
    .pageType(List.of(
        "ecommerce",
        "news",
        "blogs",
        "message-boards",
        "organization"
    ))
    .internalListLimit(8)
    .positiveConnotationThreshold(0.5d);
ContentAnalysisSummaryLiveResponseInfo response = apiInstance.contentAnalysisSummaryLive(List.of(model));
```

### phraseTrendsLive

`POST /v3/content_analysis/phrase_trends/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
ContentAnalysisPhraseTrendsLiveRequestInfo model = new ContentAnalysisPhraseTrendsLiveRequestInfo()
    .keyword("logitech")
    .searchMode("as_is")
    .dateGroup("month");
ContentAnalysisPhraseTrendsLiveResponseInfo response = apiInstance.phraseTrendsLive(List.of(model));
```

### contentAnalysisIdList

`POST /v3/content_analysis/id_list`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
ContentAnalysisIdListRequestInfo model = new ContentAnalysisIdListRequestInfo()
    .limit(10)
    .includeMetadata(true);
ContentAnalysisIdListResponseInfo response = apiInstance.contentAnalysisIdList(List.of(model));
```

### sentimentAnalysisLive

`POST /v3/content_analysis/sentiment_analysis/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
ContentAnalysisSentimentAnalysisLiveRequestInfo model = new ContentAnalysisSentimentAnalysisLiveRequestInfo()
    .keyword("logitech")
    .internalListLimit(1);
ContentAnalysisSentimentAnalysisLiveResponseInfo response = apiInstance.sentimentAnalysisLive(List.of(model));
```

### ratingDistributionLive

`POST /v3/content_analysis/rating_distribution/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
ContentAnalysisRatingDistributionLiveRequestInfo model = new ContentAnalysisRatingDistributionLiveRequestInfo()
    .keyword("logitech")
    .searchMode("as_is")
    .internalListLimit(10);
ContentAnalysisRatingDistributionLiveResponseInfo response = apiInstance.ratingDistributionLive(List.of(model));
```

### languages

`GET /v3/content_analysis/languages`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);

ContentAnalysisLanguagesResponseInfo response = apiInstance.languages();
```

### contentAnalysisCategories

`GET /v3/content_analysis/categories`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);

ContentAnalysisCategoriesResponseInfo response = apiInstance.contentAnalysisCategories();
```

### locations

`GET /v3/content_analysis/locations`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);

ContentAnalysisLocationsResponseInfo response = apiInstance.locations();
```

### categoryTrendsLive

`POST /v3/content_analysis/category_trends/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
ContentAnalysisApi apiInstance = new ContentAnalysisApi(defaultClient);
ContentAnalysisCategoryTrendsLiveRequestInfo model = new ContentAnalysisCategoryTrendsLiveRequestInfo()
    .categoryCode(10994)
    .searchMode("as_is")
    .dateGroup("month");
ContentAnalysisCategoryTrendsLiveResponseInfo response = apiInstance.categoryTrendsLive(List.of(model));
```

## Endpoints

All methods of `ContentAnalysisApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `contentAnalysisIdList` | POST | `/v3/content_analysis/id_list` |
| `contentAnalysisAvailableFilters` | GET | `/v3/content_analysis/available_filters` |
| `locations` | GET | `/v3/content_analysis/locations` |
| `languages` | GET | `/v3/content_analysis/languages` |
| `contentAnalysisCategories` | GET | `/v3/content_analysis/categories` |
| `searchLive` | POST | `/v3/content_analysis/search/live` |
| `contentAnalysisSummaryLive` | POST | `/v3/content_analysis/summary/live` |
| `sentimentAnalysisLive` | POST | `/v3/content_analysis/sentiment_analysis/live` |
| `ratingDistributionLive` | POST | `/v3/content_analysis/rating_distribution/live` |
| `phraseTrendsLive` | POST | `/v3/content_analysis/phrase_trends/live` |
| `categoryTrendsLive` | POST | `/v3/content_analysis/category_trends/live` |
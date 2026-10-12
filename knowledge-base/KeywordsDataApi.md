# KeywordsDataApi

Knowledge base for `io.github.dataforseo.client.api.KeywordsDataApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

Keyword metrics from advertising platforms and trend services: search volume, cost per click, competition and their monthly dynamics, keyword ideas, ad traffic forecasts and keyword popularity trends, from sources such as Google Ads, Bing Ads, Google Trends, DataForSEO Trends and clickstream data.

The data comes from the original sources, so it follows their rules: advertising platforms do not return data for restricted topics, and trend services return relative popularity rather than absolute numbers.

## Use it when you need

- Search volume, CPC and competition for a known list of keywords, as reported by an advertising platform.
- Keyword ideas suggested by an advertising platform for a website or for seed keywords.
- A forecast of impressions, clicks and cost for a planned advertising campaign.
- How interest in a keyword or topic changes over time and across regions, or which related topics and queries are rising.

## Use another API when

- You do SEO-oriented keyword research (difficulty, search intent, keywords a domain ranks for, competitors) or need large volumes of keywords from a database: `DataforseoLabsApi`.
- You need how often keywords are asked in AI assistants: `AiOptimizationApi`.
- You need what the search results look like for a keyword: `SerpApi`.

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

### googleTrendsExploreTaskGet

`GET /v3/keywords_data/google_trends/explore/task_get/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
KeywordsDataGoogleTrendsExploreTaskGetResponseInfo response = apiInstance.googleTrendsExploreTaskGet(id);
```

### googleTrendsExploreTaskPost

`POST /v3/keywords_data/google_trends/explore/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
KeywordsDataGoogleTrendsExploreTaskPostRequestInfo model = new KeywordsDataGoogleTrendsExploreTaskPostRequestInfo()
    .type("youtube")
    .categoryCode(3)
    .keywords(List.of(
        "seo api",
        "rank api"
    ));
KeywordsDataGoogleTrendsExploreTaskPostResponseInfo response = apiInstance.googleTrendsExploreTaskPost(List.of(model));
```

### googleAdsSearchVolumeLive

`POST /v3/keywords_data/google_ads/search_volume/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo model = new KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo()
    .locationCode(2840)
    .keywords(List.of(
        "buy laptop",
        "cheap laptops for sale",
        "purchase laptop"
    ))
    .searchPartners(true);
KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo response = apiInstance.googleAdsSearchVolumeLive(List.of(model));
```

### bingSearchVolumeLive

`POST /v3/keywords_data/bing/search_volume/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
KeywordsDataBingSearchVolumeLiveRequestInfo model = new KeywordsDataBingSearchVolumeLiveRequestInfo()
    .locationName("United States")
    .languageCode("en")
    .keywords(List.of(
        "tom and jerry",
        "silicon valley",
        "spider man"
    ));
KeywordsDataBingSearchVolumeLiveResponseInfo response = apiInstance.bingSearchVolumeLive(List.of(model));
```

### googleTrendsExploreLive

`POST /v3/keywords_data/google_trends/explore/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
KeywordsDataGoogleTrendsExploreLiveRequestInfo model = new KeywordsDataGoogleTrendsExploreLiveRequestInfo()
    .locationName("United States")
    .type("youtube")
    .categoryCode(3)
    .keywords(List.of(
        "rugby",
        "cricket"
    ));
KeywordsDataGoogleTrendsExploreLiveResponseInfo response = apiInstance.googleTrendsExploreLive(List.of(model));
```

### googleAdsSearchVolumeTaskGet

`GET /v3/keywords_data/google_ads/search_volume/task_get/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo response = apiInstance.googleAdsSearchVolumeTaskGet(id);
```

### googleAdsSearchVolumeTaskPost

`POST /v3/keywords_data/google_ads/search_volume/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);
KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo model = new KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo()
    .locationName("United States")
    .keywords(List.of(
        "buy laptop",
        "cheap laptops for sale",
        "purchase laptop"
    ));
KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo response = apiInstance.googleAdsSearchVolumeTaskPost(List.of(model));
```

### googleAdsSearchVolumeTasksReady

`GET /v3/keywords_data/google_ads/search_volume/tasks_ready`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
KeywordsDataApi apiInstance = new KeywordsDataApi(defaultClient);

KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo response = apiInstance.googleAdsSearchVolumeTasksReady();
```

## Endpoints

All methods of `KeywordsDataApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `keywordsDataIdList` | POST | `/v3/keywords_data/id_list` |
| `keywordsDataErrors` | POST | `/v3/keywords_data/errors` |
| `googleAdsStatus` | GET | `/v3/keywords_data/google_ads/status` |
| `googleAdsLocations` | GET | `/v3/keywords_data/google_ads/locations` |
| `googleAdsLocationsCountry` | GET | `/v3/keywords_data/google_ads/locations/{country}` |
| `googleAdsLanguages` | GET | `/v3/keywords_data/google_ads/languages` |
| `googleAdsSearchVolumeTaskPost` | POST | `/v3/keywords_data/google_ads/search_volume/task_post` |
| `googleAdsSearchVolumeTasksReady` | GET | `/v3/keywords_data/google_ads/search_volume/tasks_ready` |
| `googleAdsSearchVolumeTaskGet` | GET | `/v3/keywords_data/google_ads/search_volume/task_get/{id}` |
| `googleAdsSearchVolumeLive` | POST | `/v3/keywords_data/google_ads/search_volume/live` |
| `googleAdsKeywordsForSiteTaskPost` | POST | `/v3/keywords_data/google_ads/keywords_for_site/task_post` |
| `googleAdsKeywordsForSiteTasksReady` | GET | `/v3/keywords_data/google_ads/keywords_for_site/tasks_ready` |
| `googleAdsKeywordsForSiteTaskGet` | GET | `/v3/keywords_data/google_ads/keywords_for_site/task_get/{id}` |
| `googleAdsKeywordsForSiteLive` | POST | `/v3/keywords_data/google_ads/keywords_for_site/live` |
| `googleAdsKeywordsForKeywordsTaskPost` | POST | `/v3/keywords_data/google_ads/keywords_for_keywords/task_post` |
| `googleAdsKeywordsForKeywordsTasksReady` | GET | `/v3/keywords_data/google_ads/keywords_for_keywords/tasks_ready` |
| `googleAdsKeywordsForKeywordsTaskGet` | GET | `/v3/keywords_data/google_ads/keywords_for_keywords/task_get/{id}` |
| `googleAdsKeywordsForKeywordsLive` | POST | `/v3/keywords_data/google_ads/keywords_for_keywords/live` |
| `googleAdsAdTrafficByKeywordsTaskPost` | POST | `/v3/keywords_data/google_ads/ad_traffic_by_keywords/task_post` |
| `googleAdsAdTrafficByKeywordsTasksReady` | GET | `/v3/keywords_data/google_ads/ad_traffic_by_keywords/tasks_ready` |
| `googleAdsAdTrafficByKeywordsTaskGet` | GET | `/v3/keywords_data/google_ads/ad_traffic_by_keywords/task_get/{id}` |
| `googleAdsAdTrafficByKeywordsLive` | POST | `/v3/keywords_data/google_ads/ad_traffic_by_keywords/live` |
| `googleTrendsLocations` | GET | `/v3/keywords_data/google_trends/locations` |
| `googleTrendsLocationsCountry` | GET | `/v3/keywords_data/google_trends/locations/{country}` |
| `googleTrendsLanguages` | GET | `/v3/keywords_data/google_trends/languages` |
| `googleTrendsCategories` | GET | `/v3/keywords_data/google_trends/categories` |
| `googleTrendsExploreTaskPost` | POST | `/v3/keywords_data/google_trends/explore/task_post` |
| `googleTrendsExploreTasksReady` | GET | `/v3/keywords_data/google_trends/explore/tasks_ready` |
| `googleTrendsExploreTaskGet` | GET | `/v3/keywords_data/google_trends/explore/task_get/{id}` |
| `googleTrendsExploreLive` | POST | `/v3/keywords_data/google_trends/explore/live` |
| `dataforseoTrendsLocations` | GET | `/v3/keywords_data/dataforseo_trends/locations` |
| `dataforseoTrendsLocationsCountry` | GET | `/v3/keywords_data/dataforseo_trends/locations/{country}` |
| `dataforseoTrendsExploreLive` | POST | `/v3/keywords_data/dataforseo_trends/explore/live` |
| `dataforseoTrendsSubregionInterestsLive` | POST | `/v3/keywords_data/dataforseo_trends/subregion_interests/live` |
| `dataforseoTrendsDemographyLive` | POST | `/v3/keywords_data/dataforseo_trends/demography/live` |
| `dataforseoTrendsMergedDataLive` | POST | `/v3/keywords_data/dataforseo_trends/merged_data/live` |
| `keywordsDataBingLocations` | GET | `/v3/keywords_data/bing/locations` |
| `keywordsDataBingLanguages` | GET | `/v3/keywords_data/bing/languages` |
| `bingSearchVolumeTaskPost` | POST | `/v3/keywords_data/bing/search_volume/task_post` |
| `bingSearchVolumeTasksReady` | GET | `/v3/keywords_data/bing/search_volume/tasks_ready` |
| `bingSearchVolumeTaskGet` | GET | `/v3/keywords_data/bing/search_volume/task_get/{id}` |
| `bingSearchVolumeLive` | POST | `/v3/keywords_data/bing/search_volume/live` |
| `bingAudienceEstimationJobFunctions` | GET | `/v3/keywords_data/bing/audience_estimation/job_functions` |
| `bingAudienceEstimationIndustries` | GET | `/v3/keywords_data/bing/audience_estimation/industries` |
| `bingAudienceEstimationTaskPost` | POST | `/v3/keywords_data/bing/audience_estimation/task_post` |
| `bingAudienceEstimationTasksReady` | GET | `/v3/keywords_data/bing/audience_estimation/tasks_ready` |
| `bingAudienceEstimationTaskGet` | GET | `/v3/keywords_data/bing/audience_estimation/task_get/{id}` |
| `bingAudienceEstimationLive` | POST | `/v3/keywords_data/bing/audience_estimation/live` |
| `bingKeywordsForSiteTaskPost` | POST | `/v3/keywords_data/bing/keywords_for_site/task_post` |
| `bingKeywordsForSiteTasksReady` | GET | `/v3/keywords_data/bing/keywords_for_site/tasks_ready` |
| `bingKeywordsForSiteTaskGet` | GET | `/v3/keywords_data/bing/keywords_for_site/task_get/{id}` |
| `bingKeywordsForSiteLive` | POST | `/v3/keywords_data/bing/keywords_for_site/live` |
| `bingKeywordsForKeywordsTaskPost` | POST | `/v3/keywords_data/bing/keywords_for_keywords/task_post` |
| `bingKeywordsForKeywordsTasksReady` | GET | `/v3/keywords_data/bing/keywords_for_keywords/tasks_ready` |
| `bingKeywordsForKeywordsTaskGet` | GET | `/v3/keywords_data/bing/keywords_for_keywords/task_get/{id}` |
| `bingKeywordsForKeywordsLive` | POST | `/v3/keywords_data/bing/keywords_for_keywords/live` |
| `bingKeywordPerformanceLocationsAndLanguages` | GET | `/v3/keywords_data/bing/keyword_performance/locations_and_languages` |
| `bingKeywordPerformanceTaskPost` | POST | `/v3/keywords_data/bing/keyword_performance/task_post` |
| `bingKeywordPerformanceTasksReady` | GET | `/v3/keywords_data/bing/keyword_performance/tasks_ready` |
| `bingKeywordPerformanceTaskGet` | GET | `/v3/keywords_data/bing/keyword_performance/task_get/{id}` |
| `bingKeywordPerformanceLive` | POST | `/v3/keywords_data/bing/keyword_performance/live` |
| `bingSearchVolumeHistoryLocationsAndLanguages` | GET | `/v3/keywords_data/bing/search_volume_history/locations_and_languages` |
| `bingSearchVolumeHistoryTaskPost` | POST | `/v3/keywords_data/bing/search_volume_history/task_post` |
| `bingSearchVolumeHistoryTasksReady` | GET | `/v3/keywords_data/bing/search_volume_history/tasks_ready` |
| `bingSearchVolumeHistoryTaskGet` | GET | `/v3/keywords_data/bing/search_volume_history/task_get/{id}` |
| `bingSearchVolumeHistoryLive` | POST | `/v3/keywords_data/bing/search_volume_history/live` |
| `clickstreamDataLocationsAndLanguages` | GET | `/v3/keywords_data/clickstream_data/locations_and_languages` |
| `clickstreamDataDataforseoSearchVolumeLive` | POST | `/v3/keywords_data/clickstream_data/dataforseo_search_volume/live` |
| `clickstreamDataGlobalSearchVolumeLive` | POST | `/v3/keywords_data/clickstream_data/global_search_volume/live` |
| `clickstreamDataBulkSearchVolumeLive` | POST | `/v3/keywords_data/clickstream_data/bulk_search_volume/live` |
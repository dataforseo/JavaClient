# BusinessDataApi

Knowledge base for `io.github.dataforseo.client.api.BusinessDataApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

Publicly available data about businesses and local places: business profiles, reviews, questions and answers, hotel data and a database of business listings, from sources such as Google, Trustpilot and Tripadvisor.

## Use it when you need

- Details of a business profile: address, phone, website, hours, categories, rating, attributes and posts.
- Reviews of a business on Google or review platforms, for reputation monitoring and sentiment analysis.
- Questions and answers about a place, or hotel search results with prices and hotel details.
- Lists of businesses by category, location, rating and other attributes (lead generation, local market research).

## Use another API when

- You need local rankings in search or maps results for a query: `SerpApi`.
- You need web-wide brand mentions rather than reviews: `ContentAnalysisApi`.
- You need products and sellers on marketplaces: `MerchantApi`.

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

### googleMyBusinessInfoTaskGet

`GET /v3/business_data/google/my_business_info/task_get/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo response = apiInstance.googleMyBusinessInfoTaskGet(id);
```

### googleMyBusinessInfoTaskPost

`POST /v3/business_data/google/my_business_info/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo model = new BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo()
    .languageCode("en")
    .locationName("New York,New York,United States")
    .keyword("RustyBrick, Inc.");
BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo response = apiInstance.googleMyBusinessInfoTaskPost(List.of(model));
```

### googleReviewsTasksReady

`GET /v3/business_data/google/reviews/tasks_ready`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

BusinessDataGoogleReviewsTasksReadyResponseInfo response = apiInstance.googleReviewsTasksReady();
```

### googleReviewsTaskGet

`GET /v3/business_data/google/reviews/task_get/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
BusinessDataGoogleReviewsTaskGetResponseInfo response = apiInstance.googleReviewsTaskGet(id);
```

### googleReviewsTaskPost

`POST /v3/business_data/google/reviews/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
BusinessDataGoogleReviewsTaskPostRequestInfo model = new BusinessDataGoogleReviewsTaskPostRequestInfo()
    .locationName("London,England,United Kingdom")
    .languageName("English")
    .keyword("hedonism wines")
    .depth(50)
    .sortBy("highest_rating");
BusinessDataGoogleReviewsTaskPostResponseInfo response = apiInstance.googleReviewsTaskPost(List.of(model));
```

### googleHotelInfoTaskGetAdvanced

`GET /v3/business_data/google/hotel_info/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo response = apiInstance.googleHotelInfoTaskGetAdvanced(id);
```

### googleHotelInfoTaskPost

`POST /v3/business_data/google/hotel_info/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
BusinessDataGoogleHotelInfoTaskPostRequestInfo model = new BusinessDataGoogleHotelInfoTaskPostRequestInfo()
    .languageCode("en")
    .locationName("New York,New York,United States")
    .hotelIdentifier("ChYIq6SB--i6p6cpGgovbS8wN2s5ODZfEAE")
    .tag("some_string_123")
    .postbackUrl("https://your-server.com/postbackscript.php")
    .postbackData("advanced");
BusinessDataGoogleHotelInfoTaskPostResponseInfo response = apiInstance.googleHotelInfoTaskPost(List.of(model));
```

### googleMyBusinessInfoLive

`POST /v3/business_data/google/my_business_info/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);
BusinessDataGoogleMyBusinessInfoLiveRequestInfo model = new BusinessDataGoogleMyBusinessInfoLiveRequestInfo()
    .languageCode("en")
    .locationName("New York,New York,United States")
    .keyword("RustyBrick, Inc.");
BusinessDataGoogleMyBusinessInfoLiveResponseInfo response = apiInstance.googleMyBusinessInfoLive(List.of(model));
```

### googleMyBusinessInfoTasksReady

`GET /v3/business_data/google/my_business_info/tasks_ready`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
BusinessDataApi apiInstance = new BusinessDataApi(defaultClient);

BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo response = apiInstance.googleMyBusinessInfoTasksReady();
```

## Endpoints

All methods of `BusinessDataApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `businessDataIdList` | POST | `/v3/business_data/id_list` |
| `businessDataErrors` | POST | `/v3/business_data/errors` |
| `businessListingsLocations` | GET | `/v3/business_data/business_listings/locations` |
| `businessListingsCategories` | GET | `/v3/business_data/business_listings/categories` |
| `businessListingsAvailableFilters` | GET | `/v3/business_data/business_listings/available_filters` |
| `businessListingsSearchLive` | POST | `/v3/business_data/business_listings/search/live` |
| `businessListingsCategoriesAggregationLive` | POST | `/v3/business_data/business_listings/categories_aggregation/live` |
| `businessDataGoogleLocations` | GET | `/v3/business_data/google/locations` |
| `businessDataGoogleLocationsCountry` | GET | `/v3/business_data/google/locations/{country}` |
| `businessDataGoogleLanguages` | GET | `/v3/business_data/google/languages` |
| `googleMyBusinessInfoTaskPost` | POST | `/v3/business_data/google/my_business_info/task_post` |
| `googleMyBusinessInfoTasksReady` | GET | `/v3/business_data/google/my_business_info/tasks_ready` |
| `businessDataTasksReady` | GET | `/v3/business_data/tasks_ready` |
| `googleMyBusinessInfoTaskGet` | GET | `/v3/business_data/google/my_business_info/task_get/{id}` |
| `googleMyBusinessInfoLive` | POST | `/v3/business_data/google/my_business_info/live` |
| `googleMyBusinessUpdatesTaskPost` | POST | `/v3/business_data/google/my_business_updates/task_post` |
| `googleMyBusinessUpdatesTasksReady` | GET | `/v3/business_data/google/my_business_updates/tasks_ready` |
| `googleMyBusinessUpdatesTaskGet` | GET | `/v3/business_data/google/my_business_updates/task_get/{id}` |
| `googleHotelSearchesTaskPost` | POST | `/v3/business_data/google/hotel_searches/task_post` |
| `googleHotelSearchesTasksReady` | GET | `/v3/business_data/google/hotel_searches/tasks_ready` |
| `googleHotelSearchesTaskGet` | GET | `/v3/business_data/google/hotel_searches/task_get/{id}` |
| `googleHotelSearchesLive` | POST | `/v3/business_data/google/hotel_searches/live` |
| `googleHotelInfoTaskPost` | POST | `/v3/business_data/google/hotel_info/task_post` |
| `googleHotelInfoTasksReady` | GET | `/v3/business_data/google/hotel_info/tasks_ready` |
| `googleHotelInfoTaskGetAdvanced` | GET | `/v3/business_data/google/hotel_info/task_get/advanced/{id}` |
| `googleHotelInfoTaskGetHtml` | GET | `/v3/business_data/google/hotel_info/task_get/html/{id}` |
| `googleHotelInfoLiveAdvanced` | POST | `/v3/business_data/google/hotel_info/live/advanced` |
| `googleHotelInfoLiveHtml` | POST | `/v3/business_data/google/hotel_info/live/html` |
| `googleReviewsTaskPost` | POST | `/v3/business_data/google/reviews/task_post` |
| `googleReviewsTasksReady` | GET | `/v3/business_data/google/reviews/tasks_ready` |
| `googleReviewsTaskGet` | GET | `/v3/business_data/google/reviews/task_get/{id}` |
| `googleExtendedReviewsTaskPost` | POST | `/v3/business_data/google/extended_reviews/task_post` |
| `googleExtendedReviewsTasksReady` | GET | `/v3/business_data/google/extended_reviews/tasks_ready` |
| `googleExtendedReviewsTaskGet` | GET | `/v3/business_data/google/extended_reviews/task_get/{id}` |
| `googleQuestionsAndAnswersTaskPost` | POST | `/v3/business_data/google/questions_and_answers/task_post` |
| `googleQuestionsAndAnswersTasksReady` | GET | `/v3/business_data/google/questions_and_answers/tasks_ready` |
| `googleQuestionsAndAnswersTaskGet` | GET | `/v3/business_data/google/questions_and_answers/task_get/{id}` |
| `googleQuestionsAndAnswersLive` | POST | `/v3/business_data/google/questions_and_answers/live` |
| `trustpilotSearchTaskPost` | POST | `/v3/business_data/trustpilot/search/task_post` |
| `trustpilotSearchTasksReady` | GET | `/v3/business_data/trustpilot/search/tasks_ready` |
| `trustpilotSearchTaskGet` | GET | `/v3/business_data/trustpilot/search/task_get/{id}` |
| `trustpilotReviewsTaskPost` | POST | `/v3/business_data/trustpilot/reviews/task_post` |
| `trustpilotReviewsTasksReady` | GET | `/v3/business_data/trustpilot/reviews/tasks_ready` |
| `trustpilotReviewsTaskGet` | GET | `/v3/business_data/trustpilot/reviews/task_get/{id}` |
| `tripadvisorLocations` | GET | `/v3/business_data/tripadvisor/locations` |
| `tripadvisorLocationsCountry` | GET | `/v3/business_data/tripadvisor/locations/{country}` |
| `tripadvisorLanguages` | GET | `/v3/business_data/tripadvisor/languages` |
| `tripadvisorSearchTaskPost` | POST | `/v3/business_data/tripadvisor/search/task_post` |
| `tripadvisorSearchTasksReady` | GET | `/v3/business_data/tripadvisor/search/tasks_ready` |
| `tripadvisorSearchTaskGet` | GET | `/v3/business_data/tripadvisor/search/task_get/{id}` |
| `tripadvisorReviewsTaskPost` | POST | `/v3/business_data/tripadvisor/reviews/task_post` |
| `tripadvisorReviewsTasksReady` | GET | `/v3/business_data/tripadvisor/reviews/tasks_ready` |
| `tripadvisorReviewsTaskGet` | GET | `/v3/business_data/tripadvisor/reviews/task_get/{id}` |
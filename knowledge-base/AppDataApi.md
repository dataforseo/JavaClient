# AppDataApi

Knowledge base for `io.github.dataforseo.client.api.AppDataApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

Mobile application data from app stores such as Google Play and the App Store: app search results, top charts and collections, detailed app information and user reviews, plus a searchable database of app listings.

Results are collected for the requested location and language, the same way a store user would see them.

## Use it when you need

- Which apps rank in a store for a search query (app store optimization, competitor discovery).
- Which apps are in top charts or collections of a category.
- Details of a specific app: description, rating, installs, price, developer, versions.
- User reviews of an app for review monitoring, sentiment or product feedback analysis.
- Apps that match a category or text, found in a database without querying the store.

## Use another API when

- You need keywords an app ranks for, app competitors or app keyword gaps: `DataforseoLabsApi`.
- You need physical products on marketplaces: `MerchantApi`.

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

### googleAppSearchesTaskPost

`POST /v3/app_data/google/app_searches/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppDataApi apiInstance = new AppDataApi(defaultClient);
AppDataGoogleAppSearchesTaskPostRequestInfo model = new AppDataGoogleAppSearchesTaskPostRequestInfo()
    .keyword("vpn")
    .locationCode(2840)
    .languageCode("en")
    .depth(30);
AppDataGoogleAppSearchesTaskPostResponseInfo response = apiInstance.googleAppSearchesTaskPost(List.of(model));
```

### googleAppSearchesTaskGetAdvanced

`GET /v3/app_data/google/app_searches/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppDataApi apiInstance = new AppDataApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo response = apiInstance.googleAppSearchesTaskGetAdvanced(id);
```

### appleAppSearchesTaskGetAdvanced

`GET /v3/app_data/apple/app_searches/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppDataApi apiInstance = new AppDataApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
AppDataAppleAppSearchesTaskGetAdvancedResponseInfo response = apiInstance.appleAppSearchesTaskGetAdvanced(id);
```

### appleAppSearchesTaskPost

`POST /v3/app_data/apple/app_searches/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppDataApi apiInstance = new AppDataApi(defaultClient);
AppDataAppleAppSearchesTaskPostRequestInfo model = new AppDataAppleAppSearchesTaskPostRequestInfo()
    .keyword("vpn")
    .locationCode(2840)
    .languageCode("en")
    .depth(200);
AppDataAppleAppSearchesTaskPostResponseInfo response = apiInstance.appleAppSearchesTaskPost(List.of(model));
```

### googleAppInfoTaskGetAdvanced

`GET /v3/app_data/google/app_info/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppDataApi apiInstance = new AppDataApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
AppDataGoogleAppInfoTaskGetAdvancedResponseInfo response = apiInstance.googleAppInfoTaskGetAdvanced(id);
```

### googleAppInfoTaskPost

`POST /v3/app_data/google/app_info/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppDataApi apiInstance = new AppDataApi(defaultClient);
AppDataGoogleAppInfoTaskPostRequestInfo model = new AppDataGoogleAppInfoTaskPostRequestInfo()
    .appId("org.telegram.messenger")
    .locationCode(2840)
    .languageCode("en");
AppDataGoogleAppInfoTaskPostResponseInfo response = apiInstance.googleAppInfoTaskPost(List.of(model));
```

### appleAppInfoTaskGetAdvanced

`GET /v3/app_data/apple/app_info/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppDataApi apiInstance = new AppDataApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
AppDataAppleAppInfoTaskGetAdvancedResponseInfo response = apiInstance.appleAppInfoTaskGetAdvanced(id);
```

### appleAppInfoTaskPost

`POST /v3/app_data/apple/app_info/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppDataApi apiInstance = new AppDataApi(defaultClient);
AppDataAppleAppInfoTaskPostRequestInfo model = new AppDataAppleAppInfoTaskPostRequestInfo()
    .appId("835599320")
    .locationCode(2840)
    .languageCode("en");
AppDataAppleAppInfoTaskPostResponseInfo response = apiInstance.appleAppInfoTaskPost(List.of(model));
```

### googleAppReviewsTaskPost

`POST /v3/app_data/google/app_reviews/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppDataApi apiInstance = new AppDataApi(defaultClient);
AppDataGoogleAppReviewsTaskPostRequestInfo model = new AppDataGoogleAppReviewsTaskPostRequestInfo()
    .appId("org.telegram.messenger")
    .locationCode(2840)
    .languageCode("en")
    .depth(150);
AppDataGoogleAppReviewsTaskPostResponseInfo response = apiInstance.googleAppReviewsTaskPost(List.of(model));
```

### googleAppReviewsTaskGetAdvanced

`GET /v3/app_data/google/app_reviews/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppDataApi apiInstance = new AppDataApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo response = apiInstance.googleAppReviewsTaskGetAdvanced(id);
```

## Endpoints

All methods of `AppDataApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `appDataIdList` | POST | `/v3/app_data/id_list` |
| `appDataErrors` | POST | `/v3/app_data/errors` |
| `googleCategories` | GET | `/v3/app_data/google/categories` |
| `appDataGoogleLocations` | GET | `/v3/app_data/google/locations` |
| `appDataGoogleLocationsCountry` | GET | `/v3/app_data/google/locations/{country}` |
| `appDataGoogleLanguages` | GET | `/v3/app_data/google/languages` |
| `googleAppSearchesTaskPost` | POST | `/v3/app_data/google/app_searches/task_post` |
| `googleAppSearchesTasksReady` | GET | `/v3/app_data/google/app_searches/tasks_ready` |
| `appDataTasksReady` | GET | `/v3/app_data/tasks_ready` |
| `googleAppSearchesTaskGetAdvanced` | GET | `/v3/app_data/google/app_searches/task_get/advanced/{id}` |
| `googleAppSearchesTaskGetHtml` | GET | `/v3/app_data/google/app_searches/task_get/html/{id}` |
| `googleAppListTaskPost` | POST | `/v3/app_data/google/app_list/task_post` |
| `googleAppListTasksReady` | GET | `/v3/app_data/google/app_list/tasks_ready` |
| `googleAppListTaskGetAdvanced` | GET | `/v3/app_data/google/app_list/task_get/advanced/{id}` |
| `googleAppListTaskGetHtml` | GET | `/v3/app_data/google/app_list/task_get/html/{id}` |
| `googleAppInfoTaskPost` | POST | `/v3/app_data/google/app_info/task_post` |
| `googleAppInfoTasksReady` | GET | `/v3/app_data/google/app_info/tasks_ready` |
| `googleAppInfoTaskGetAdvanced` | GET | `/v3/app_data/google/app_info/task_get/advanced/{id}` |
| `googleAppInfoTaskGetHtml` | GET | `/v3/app_data/google/app_info/task_get/html/{id}` |
| `googleAppReviewsTaskPost` | POST | `/v3/app_data/google/app_reviews/task_post` |
| `googleAppReviewsTasksReady` | GET | `/v3/app_data/google/app_reviews/tasks_ready` |
| `googleAppReviewsTaskGetAdvanced` | GET | `/v3/app_data/google/app_reviews/task_get/advanced/{id}` |
| `googleAppReviewsTaskGetHtml` | GET | `/v3/app_data/google/app_reviews/task_get/html/{id}` |
| `googleAppListingsCategories` | GET | `/v3/app_data/google/app_listings/categories` |
| `googleAppListingsSearchLive` | POST | `/v3/app_data/google/app_listings/search/live` |
| `appleCategories` | GET | `/v3/app_data/apple/categories` |
| `appleLocations` | GET | `/v3/app_data/apple/locations` |
| `appleLanguages` | GET | `/v3/app_data/apple/languages` |
| `appleAppSearchesTaskPost` | POST | `/v3/app_data/apple/app_searches/task_post` |
| `appleAppSearchesTasksReady` | GET | `/v3/app_data/apple/app_searches/tasks_ready` |
| `appleAppSearchesTaskGetAdvanced` | GET | `/v3/app_data/apple/app_searches/task_get/advanced/{id}` |
| `appleAppInfoTaskPost` | POST | `/v3/app_data/apple/app_info/task_post` |
| `appleAppInfoTasksReady` | GET | `/v3/app_data/apple/app_info/tasks_ready` |
| `appleAppInfoTaskGetAdvanced` | GET | `/v3/app_data/apple/app_info/task_get/advanced/{id}` |
| `appleAppListTaskPost` | POST | `/v3/app_data/apple/app_list/task_post` |
| `appleAppListTasksReady` | GET | `/v3/app_data/apple/app_list/tasks_ready` |
| `appleAppListTaskGetAdvanced` | GET | `/v3/app_data/apple/app_list/task_get/advanced/{id}` |
| `appleAppReviewsTaskPost` | POST | `/v3/app_data/apple/app_reviews/task_post` |
| `appleAppReviewsTasksReady` | GET | `/v3/app_data/apple/app_reviews/tasks_ready` |
| `appleAppReviewsTaskGetAdvanced` | GET | `/v3/app_data/apple/app_reviews/task_get/advanced/{id}` |
| `appleAppListingsCategories` | GET | `/v3/app_data/apple/app_listings/categories` |
| `appleAppListingsSearchLive` | POST | `/v3/app_data/apple/app_listings/search/live` |
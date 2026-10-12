# MerchantApi

Knowledge base for `io.github.dataforseo.client.api.MerchantApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

E-commerce data from marketplaces and shopping search engines such as Amazon and Google Shopping: product listings for a search query, product details, product variations, sellers and their offers, with prices, ratings, reviews count and paid placements.

Results are collected for the requested location and language, the same way a real shopper would see them, and are returned as parsed data or raw HTML.

## Use it when you need

- Which products appear for a search query on a marketplace, in which order, and which of them are sponsored.
- Details of a specific product: description, specifications, price, rating, variations.
- Who sells a product and at what price and conditions, for price monitoring and competitor analysis.

## Use another API when

- You need keyword metrics or ranked keywords for marketplace products: `DataforseoLabsApi`.
- You need shopping elements that appear inside regular search results: `SerpApi`.
- You need mobile apps rather than products: `AppDataApi`.

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

### googleSellersTaskGetAdvanced

`GET /v3/merchant/google/sellers/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
MerchantApi apiInstance = new MerchantApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
MerchantGoogleSellersTaskGetAdvancedResponseInfo response = apiInstance.googleSellersTaskGetAdvanced(id);
```

### googleSellersTaskPost

`POST /v3/merchant/google/sellers/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
MerchantApi apiInstance = new MerchantApi(defaultClient);
MerchantGoogleSellersTaskPostRequestInfo model = new MerchantGoogleSellersTaskPostRequestInfo()
    .languageCode("en")
    .locationCode(2840)
    .productId("1113158713975221117");
MerchantGoogleSellersTaskPostResponseInfo response = apiInstance.googleSellersTaskPost(List.of(model));
```

### googleProductsTaskGetAdvanced

`GET /v3/merchant/google/products/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
MerchantApi apiInstance = new MerchantApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
MerchantGoogleProductsTaskGetAdvancedResponseInfo response = apiInstance.googleProductsTaskGetAdvanced(id);
```

### googleProductsTaskPost

`POST /v3/merchant/google/products/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
MerchantApi apiInstance = new MerchantApi(defaultClient);
MerchantGoogleProductsTaskPostRequestInfo model = new MerchantGoogleProductsTaskPostRequestInfo()
    .languageCode("en")
    .locationCode(2840)
    .keyword("iphone")
    .priceMin(5);
MerchantGoogleProductsTaskPostResponseInfo response = apiInstance.googleProductsTaskPost(List.of(model));
```

### amazonProductsTaskGetAdvanced

`GET /v3/merchant/amazon/products/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
MerchantApi apiInstance = new MerchantApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
MerchantAmazonProductsTaskGetAdvancedResponseInfo response = apiInstance.amazonProductsTaskGetAdvanced(id);
```

### amazonProductsTaskPost

`POST /v3/merchant/amazon/products/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
MerchantApi apiInstance = new MerchantApi(defaultClient);
MerchantAmazonProductsTaskPostRequestInfo model = new MerchantAmazonProductsTaskPostRequestInfo()
    .languageCode("en_US")
    .locationCode(2840)
    .keyword("shoes");
MerchantAmazonProductsTaskPostResponseInfo response = apiInstance.amazonProductsTaskPost(List.of(model));
```

### googleProductInfoTaskGetAdvanced

`GET /v3/merchant/google/product_info/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
MerchantApi apiInstance = new MerchantApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
MerchantGoogleProductInfoTaskGetAdvancedResponseInfo response = apiInstance.googleProductInfoTaskGetAdvanced(id);
```

### googleProductInfoTaskPost

`POST /v3/merchant/google/product_info/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
MerchantApi apiInstance = new MerchantApi(defaultClient);
MerchantGoogleProductInfoTaskPostRequestInfo model = new MerchantGoogleProductInfoTaskPostRequestInfo()
    .languageCode("en")
    .locationCode(2840)
    .productId("1113158713975221117");
MerchantGoogleProductInfoTaskPostResponseInfo response = apiInstance.googleProductInfoTaskPost(List.of(model));
```

### amazonSellersTaskGetAdvanced

`GET /v3/merchant/amazon/sellers/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
MerchantApi apiInstance = new MerchantApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
MerchantAmazonSellersTaskGetAdvancedResponseInfo response = apiInstance.amazonSellersTaskGetAdvanced(id);
```

## Endpoints

All methods of `MerchantApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `merchantIdList` | POST | `/v3/merchant/id_list` |
| `merchantErrors` | POST | `/v3/merchant/errors` |
| `merchantGoogleLanguages` | GET | `/v3/merchant/google/languages` |
| `merchantGoogleLocations` | GET | `/v3/merchant/google/locations` |
| `merchantGoogleLocationsCountry` | GET | `/v3/merchant/google/locations/{country}` |
| `googleProductsTaskPost` | POST | `/v3/merchant/google/products/task_post` |
| `googleProductsTasksReady` | GET | `/v3/merchant/google/products/tasks_ready` |
| `merchantTasksReady` | GET | `/v3/merchant/tasks_ready` |
| `googleProductsTaskGetAdvanced` | GET | `/v3/merchant/google/products/task_get/advanced/{id}` |
| `googleProductsTaskGetHtml` | GET | `/v3/merchant/google/products/task_get/html/{id}` |
| `googleSellersTaskPost` | POST | `/v3/merchant/google/sellers/task_post` |
| `googleSellersTasksReady` | GET | `/v3/merchant/google/sellers/tasks_ready` |
| `googleSellersTaskGetAdvanced` | GET | `/v3/merchant/google/sellers/task_get/advanced/{id}` |
| `googleProductInfoTaskPost` | POST | `/v3/merchant/google/product_info/task_post` |
| `googleProductInfoTasksReady` | GET | `/v3/merchant/google/product_info/tasks_ready` |
| `googleProductInfoTaskGetAdvanced` | GET | `/v3/merchant/google/product_info/task_get/advanced/{id}` |
| `googleSellersAdUrl` | GET | `/v3/merchant/google/sellers/ad_url/{shop_ad_aclk}` |
| `amazonLocations` | GET | `/v3/merchant/amazon/locations` |
| `amazonLocationsCountry` | GET | `/v3/merchant/amazon/locations/{country}` |
| `amazonLanguages` | GET | `/v3/merchant/amazon/languages` |
| `amazonProductsTaskPost` | POST | `/v3/merchant/amazon/products/task_post` |
| `amazonProductsTasksReady` | GET | `/v3/merchant/amazon/products/tasks_ready` |
| `amazonProductsTaskGetAdvanced` | GET | `/v3/merchant/amazon/products/task_get/advanced/{id}` |
| `amazonProductsLiveAdvanced` | POST | `/v3/merchant/amazon/products/live/advanced` |
| `amazonProductsTaskGetHtml` | GET | `/v3/merchant/amazon/products/task_get/html/{id}` |
| `amazonProductsLiveHtml` | POST | `/v3/merchant/amazon/products/live/html` |
| `amazonAsinTaskPost` | POST | `/v3/merchant/amazon/asin/task_post` |
| `amazonAsinTasksReady` | GET | `/v3/merchant/amazon/asin/tasks_ready` |
| `amazonAsinTaskGetAdvanced` | GET | `/v3/merchant/amazon/asin/task_get/advanced/{id}` |
| `amazonAsinLiveAdvanced` | POST | `/v3/merchant/amazon/asin/live/advanced` |
| `amazonAsinTaskGetHtml` | GET | `/v3/merchant/amazon/asin/task_get/html/{id}` |
| `amazonAsinLiveHtml` | POST | `/v3/merchant/amazon/asin/live/html` |
| `amazonSellersTaskPost` | POST | `/v3/merchant/amazon/sellers/task_post` |
| `amazonSellersTasksReady` | GET | `/v3/merchant/amazon/sellers/tasks_ready` |
| `amazonSellersTaskGetAdvanced` | GET | `/v3/merchant/amazon/sellers/task_get/advanced/{id}` |
| `amazonSellersLiveAdvanced` | POST | `/v3/merchant/amazon/sellers/live/advanced` |
| `amazonSellersTaskGetHtml` | GET | `/v3/merchant/amazon/sellers/task_get/html/{id}` |
| `amazonSellersLiveHtml` | POST | `/v3/merchant/amazon/sellers/live/html` |
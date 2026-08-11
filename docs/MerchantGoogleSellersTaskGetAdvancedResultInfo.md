# MerchantGoogleSellersTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**productId** | **String** | <em><code>product_id</code> received in a POST array</em><br>learn more about the parameter in <a href='https://dataforseo.com/help-center/product-id-google-shopping' rel='noopener noreferrer' target='_blank'>this help center guide</a> |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to Google Shopping results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**title** | **String** | <em>title of the product</em> |[optional]|
**url** | **String** | <em>URL to the product page</em> |[optional]|
**imageUrl** | **String** | <em>URL to the product image</em> |[optional]|
**rating** | **RatingInfo** | <em>product rating</em><br>the product popularity rate based on product reviews |[optional]|
**itemTypes** | **List<String>** | <em>types of search results found in Google Shopping SERP</em><br>contains types of all search results (<code>items</code>) found in the returned SERP<br>possible item types:<br><code>shops_list</code>, <code>buy_on_google</code> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <strong><code>items</code></strong> array</em> |[optional]|
**items** | **List<BaseMerchantGoogleShoppingSellersElementItem>** | <em>items in SERP</em> |[optional]|
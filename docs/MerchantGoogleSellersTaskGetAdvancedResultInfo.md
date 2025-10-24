# MerchantGoogleSellersTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**productId** | **String** | product_id received in a POST array<br>learn more about the parameter in this help center guide |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to Google Shopping results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**title** | **String** | title of the product |[optional]|
**url** | **String** | URL to the product page |[optional]|
**imageUrl** | **String** | URL to the product image |[optional]|
**rating** | **RatingInfo** | product rating<br>the product popularity rate based on product reviews |[optional]|
**itemTypes** | **List<String>** | types of search results found in Google Shopping SERP<br>contains types of all search results (items) found in the returned SERP<br>possible item types:<br>shops_list, buy_on_google |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BaseMerchantGoogleShoppingSellersElementItem>** | items in SERP |[optional]|
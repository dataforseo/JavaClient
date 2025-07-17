# MerchantAmazonAsinTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**asin** | **String** | ASIN received in a POST array<br>the unique product identifier in Amazon (ASIN) received in a POST array<br>learn more about the identified in this help center guide |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | Amazon domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to Amazon results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**itemTypes** | **List<String>** | types of search results found on Amazon<br>contains types of all search results (items) found in the returned SERP<br>possible item types:<br>amazon_product_info |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<AmazonProductInfo>** | Amazon product info items |[optional]|
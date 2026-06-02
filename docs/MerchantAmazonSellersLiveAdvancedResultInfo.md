# MerchantAmazonSellersLiveAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**asin** | **String** | asin received in a POST arraylearn more about ASINs in this help center guide |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain received in a POST array |[optional]|
**locationCode** | **Integer** | location code received in a POST array |[optional]|
**languageCode** | **String** | language code received in a POST array |[optional]|
**checkUrl** | **String** | direct URL to Amazon resultsyou can use it to make sure the provided results are accurate |[optional]|
**datetime** | **String** | date and time when the result was receivedin the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”example:2019-11-15 12:57:46 +00:00 |[optional]|
**title** | **String** | product titletitle of the product relevant to the asin received in a POST array |[optional]|
**image** | **String** | product image urlimage URL of the product relevant to the asin received in a POST array |[optional]|
**itemTypes** | **List<String>** | types of search results found in Amazon Sellers SERPcontains types of all search results (items) found in the returned SERPpossible item types:amazon_seller_main_item, amazon_seller_item |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BaseMerchantAmazonSellersElementItem>** | items in SERP |[optional]|
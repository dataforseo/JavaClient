

# MerchantAmazonProductsTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword received in a POST array keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **BigDecimal** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to Amazon results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**spell** | [**SpellInfo**](SpellInfo.md) |  |  [optional] |
|**itemTypes** | **List&lt;String&gt;** | types of search results found in Amazon SERP contains types of all search results (items) found in the returned SERP possible item types: amazon_serp, amazon_paid, editorial_recommendations, top_rated_from_our_brands, related_searches |  [optional] |
|**seResultsCount** | **BigDecimal** | search engine results count |  [optional] |
|**categories** | **List&lt;String&gt;** | amazon product departments and subcategories |  [optional] |
|**itemsCount** | **BigDecimal** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;BaseAmazonSerpElementItem&gt;**](BaseAmazonSerpElementItem.md) | Amazon product items within the editorial_recommendations element |  [optional] |




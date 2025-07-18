# MerchantAmazonProductsTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword received in a POST array<br>keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to Amazon results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**spell** | **SpellInfo** | autocorrection of the search engine<br>if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**itemTypes** | **List<String>** | types of search results found in Amazon SERP<br>contains types of all search results (items) found in the returned SERP<br>possible item types:<br>amazon_serp, amazon_paid, editorial_recommendations, top_rated_from_our_brands, related_searches |[optional]|
**seResultsCount** | **Long** | search engine results count |[optional]|
**categories** | **List<String>** | amazon product departments and subcategories |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BaseMerchantAmazonElementItem>** | Amazon product items within the editorial_recommendations element |[optional]|
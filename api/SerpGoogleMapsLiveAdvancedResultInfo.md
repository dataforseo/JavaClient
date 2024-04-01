

# SerpGoogleMapsLiveAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword received in a POST array the keyword is returned with decoded %## (plus symbol ‘+’ will be decoded to a space character) |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided exact results Note: to check location-specific results, follow the provided check url, scroll up and down, then click the “Search this area” button |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**spell** | [**SpellInfo**](SpellInfo.md) |  |  [optional] |
|**itemTypes** | **List&lt;String&gt;** | types of search results in SERP contains types of search results (items) found in SERP. possible item types: maps_search, maps_paid_item |  [optional] |
|**seResultsCount** | **Long** | total number of results in SERP |  [optional] |
|**itemsCount** | **Long** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;BaseSerpElementItem&gt;**](BaseSerpElementItem.md) | elements of search results found in SERP |  [optional] |




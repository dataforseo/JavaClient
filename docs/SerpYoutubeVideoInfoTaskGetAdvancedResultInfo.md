

# SerpYoutubeVideoInfoTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**videoId** | **String** | ID of the video received in a POST array |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **BigDecimal** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**spell** | [**SpellInfo**](SpellInfo.md) |  |  [optional] |
|**itemTypes** | **List&lt;String&gt;** | types of search results in SERP contains types of search results (items) found in SERP. possible item: youtube_video_info |  [optional] |
|**itemsCount** | **BigDecimal** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;BaseYoutubeSerpElementItem&gt;**](BaseYoutubeSerpElementItem.md) | elements of search results found in SERP |  [optional] |




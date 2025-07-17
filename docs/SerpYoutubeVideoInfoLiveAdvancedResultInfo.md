# SerpYoutubeVideoInfoLiveAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**videoId** | **String** | ID of the video received in a POST array |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**spell** | **SpellInfo** | autocorrection of the search engine<br>if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**itemTypes** | **List<String>** | types of search results in SERP<br>contains types of search results (items) found in SERP.<br>possible item:<br>youtube_video_info |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<YoutubeVideoInfo>** | elements of search results found in SERP |[optional]|
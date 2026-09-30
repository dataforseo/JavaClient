# SerpYoutubeOrganicLiveAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword received in a POST array        the keyword is returned with decoded %## (plus character '+' will be decoded to a space character) |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results        you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received            in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”            example:            2019-11-15 12:57:46 +00:00 |[optional]|
**spell** | **SpellInfo** | autocorrection of the search engine            if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**itemTypes** | **List<String>** | types of search results in SERP            contains types of search results (items) found in SERP.            possible item types:            youtube_channel, youtube_video, youtube_video_paid, youtube_playlist |[optional]|
**seResultsCount** | **Long** | total number of results in SERP |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BaseSerpApiYoutubeOrganicElementItem>** | elements of search results found in SERP |[optional]|
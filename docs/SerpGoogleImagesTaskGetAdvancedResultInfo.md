# SerpGoogleImagesTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword received in a POST array<br>the keyword is returned with decoded %## (plus symbol ‘+’ will be decoded to a space character) |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**spell** | **SpellInfo** | autocorrection of the search engine<br>if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**refinementChips** | **RefinementChipsInfo** | search refinement chips |[optional]|
**itemTypes** | **List<String>** | types of search results in SERP<br>contains types of search results (items) found in SERP.<br>possible item types:<br>carousel, images_search, related_searches |[optional]|
**seResultsCount** | **Long** | total number of results in SERP |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BaseSerpApiGoogleImagesElementItem>** | elements of search results found in SERP |[optional]|
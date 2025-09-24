# SerpNaverOrganicTaskGetRegularResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword received in a POST array<br>keyword is returned with decoded %## (plus symbol ‘+’ will be decoded to a space character) |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**spell** | **SpellInfo** | autocorrection of the search engine<br>if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**refinementChips** | **RefinementChipsInfo** | search refinement chips<br>equals null |[optional]|
**itemTypes** | **List<String>** | types of search results found in SERP<br>contains types of all search results (items) found in the returned SERP<br>possible item types:<br>images, local_pack, map, organic, paid, related_searches, video<br>note that this array contains all types of search results found in the returned SERP;<br>however, this endpoint provides data for organic and paid types only<br>to get all items (inlcuding SERP features and rich snippets) found in the returned SERP, please refer to the Naver Organiс Advanced SERP endpoint |[optional]|
**seResultsCount** | **Long** | total number of results in SERP |[optional]|
**pagesCount** | **Long** | total pages retrieved<br>total number of retrieved SERPs in the result |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BaseSerpApiElementItem>** | items in SERP |[optional]|
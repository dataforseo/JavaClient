# SerpGoogleEventsTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword received in a POST array<br>keyword is returned with decoded %## (plus symbol ‘+’ will be decoded to a space character) |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code<br>in this case, the value will be null |[optional]|
**checkUrl** | **String** | direct URL to search engine results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**spell** | **SpellInfo** | autocorrection of the search engine<br>if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**refinementChips** | **RefinementChipsInfo** | search refinement chips |[optional]|
**itemTypes** | **List<String>** | types of search results found in SERP<br>possible item types:<br>event_item |[optional]|
**seResultsCount** | **Long** | total number of results in SERP<br>in this case, the value will be 0<br>this search engine does not indicate the total number of results |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<EventItem>** | items of the element |[optional]|
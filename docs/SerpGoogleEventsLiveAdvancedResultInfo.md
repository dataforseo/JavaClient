# SerpGoogleEventsLiveAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword received in a POST array</em><br><strong>keyword is returned with decoded %## (plus character '+' will be decoded to a space character)</strong> |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code</em><br>in this case, the value will be <code>null</code> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em> |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: 'yyyy-mm-dd hh-mm-ss +00:00'<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**spell** | **SpellInfo** | <em>autocorrection of the search engine</em><br>if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**refinementChips** | **RefinementChipsInfo** | <em>search refinement chips</em> |[optional]|
**itemTypes** | **List<String>** | <em>types of search results found in SERP</em><br>possible item types:<br><code>event_item</code> |[optional]|
**seResultsCount** | **Long** | <em>total number of results in SERP</em><br>in this case, the value will be <code>0</code> <br>this search engine does not indicate the total number of results |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <strong><code>items</code></strong> array</em> |[optional]|
**items** | **List<EventItem>** | <em>items of the element</em> |[optional]|
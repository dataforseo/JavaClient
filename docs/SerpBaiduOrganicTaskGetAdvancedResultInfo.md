# SerpBaiduOrganicTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword received in a POST array<br><br>        </em><strong>the keyword is returned with decoded %## (plus symbol ‘+’ will be decoded to a space character)</strong> |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em><br><br>            you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br><br>            in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br><br>            example:<br><br>            <code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**spell** | **SpellInfo** | <em>autocorrection of the search engine</em><br><br>            if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**refinementChips** | **RefinementChipsInfo** | <em>search refinement chips</em><br><br>            equals <code>null</code> |[optional]|
**itemTypes** | **List<String>** | <em>types of search results in SERP</em><br><br>            contains types of search results (<code>items</code>) found in SERP.<br><br>            possible item types:<br><br>            <code>images</code>, <code>local_pack</code>, <code>map</code>, <code>organic</code>, <code>paid</code>, <code>related_searches</code>, <code>video</code>, <code>stocks_box</code>, <code>dictionary</code>, <code>shopping</code> |[optional]|
**seResultsCount** | **Long** | <em> total number of results in SERP</em> |[optional]|
**pagesCount** | **Long** | <em>total pages retrieved</em><br><br>            total number of retrieved SERPs in the result |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <strong><code>items</code></strong> array</em> |[optional]|
**items** | **List<BaseSerpApiElementItem>** | <em>additional items present in the element</em><br><br>            if there are none, equals <code>null</code> |[optional]|
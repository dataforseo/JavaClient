# SerpGoogleSearchByImageTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**imageUrl** | **String** | <em>URL specified in a POST array</em> |[optional]|
**keyword** | **String** | <em>keyword Google associated with the specified image</em> |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em><br>            you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>            in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>            example:<br>            <code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**spell** | **SpellInfo** | <em>autocorrection of the search engine</em><br>            if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**refinementChips** | **RefinementChipsInfo** | <em>search refinement chips</em><br> |[optional]|
**itemTypes** | **List<String>** | <em>types of search results in SERP</em><br>            contains types of search results (<code>items</code>) found in SERP.<br>            possible item types:<br>            <code>organic</code>,<br>            <code>images</code> |[optional]|
**seResultsCount** | **Long** | <em> total number of results in SERP</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <strong><code>items</code></strong> array</em> |[optional]|
**items** | **List<BaseSerpApiGoogleSearchByImagesElementItem>** | <em>items featured in the faq_box</em> |[optional]|
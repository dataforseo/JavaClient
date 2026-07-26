# MerchantGoogleProductsTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword received in a POST array</em><br><strong>keyword is returned with decoded %## (plus character '+' will be decoded to a space character)</strong> |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to Google Shopping results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**spell** | **SpellInfo** | <em>autocorrection of the search engine</em><br>if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**itemTypes** | **List<String>** | <em>types of search results found in Google Shopping SERP</em><br>contains types of all search results (<code>items</code>) found in the returned SERP<br>possible item types:<br><code>google_shopping_sponsored_carousel</code>, <code>google_shopping_paid</code>, <code>google_shopping_serp</code>, <code>google_shopping_carousel</code>, <code>related_searches</code> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <strong><code>items</code></strong> array</em> |[optional]|
**items** | **List<BaseMerchantGoogleShoppingProductsElementItem>** | <em>additional items present in the element</em><br>contains a list of related keywords;<br>if there are none, equals <code>null</code> |[optional]|
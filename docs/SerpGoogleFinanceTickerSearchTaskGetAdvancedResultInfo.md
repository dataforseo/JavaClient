# SerpGoogleFinanceTickerSearchTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword received in a POST array</em><br><strong>the keyword is returned with decoded %## (plus character '+' will be decoded to a space character)</strong> |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**spell** | **SpellInfo** | <em>autocorrection of the search engine</em><br>if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**refinementChips** | **RefinementChipsInfo** | <em>search refinement chips</em><br>in this case, the value will be <code>null</code> |[optional]|
**itemTypes** | **List<String>** | <em>types of search results in SERP</em><br>contains types of search results (<code>items</code>) found in SERP;<br>possible item types: <a href='#google_finance_market_index'><code>google_finance_market_index</code></a>, <a href='#google_finance_asset_pair'><code>google_finance_asset_pair</code></a>, <a href='#google_finance_market_instrument'><code>google_finance_market_instrument</code></a> |[optional]|
**seResultsCount** | **Long** | <em> total number of results in SERP</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <strong><code>items</code></strong> array</em> |[optional]|
**items** | **List<BaseSerpApiGoogleFinanceTickerSearchElementItem>** | <em>items of search results found in SERP</em><br>array of items containing market indexes data;<br>possible <code>type</code> of items: <code>google_finance_market_index</code>, <code>google_finance_asset_pair</code>, <code>google_finance_market_instrument</code> |[optional]|
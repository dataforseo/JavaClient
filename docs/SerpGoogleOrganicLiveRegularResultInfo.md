# SerpGoogleOrganicLiveRegularResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword received in a POST array</em><br><strong>keyword is returned with decoded %## (plus character '+' will be decoded to a space character)</strong> |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results<br></em>you can use it to make sure that we provided exact results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**spell** | **SpellInfo** | <em>autocorrection of the search engine</em><br>if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection |[optional]|
**refinementChips** | **RefinementChipsInfo** | <em>search refinement chips</em> |[optional]|
**itemTypes** | **List<String>** | <em>types of search results found in SERP</em><br>contains types of all search results (<code>items</code>) found in the returned SERP<br>possible item types:<br><code>answer_box</code>, <code>app</code>, <code>carousel</code>, <code>multi_carousel</code>, <code>featured_snippet</code>, <code>google_flights</code>, <code>google_reviews</code>, <code>third_party_reviews</code>,  <code>images</code>, <code>jobs</code>, <code>knowledge_graph</code>, <code>local_pack</code>, <code>hotels_pack</code>, <code>map</code>, <code>organic</code>, <code>paid</code>, <code>people_also_ask</code>, <code>related_searches</code>, <code>people_also_search</code>, <code>shopping</code>, <code>top_stories</code>, <code>twitter</code>, <code>video</code>, <code>events</code>, <code>recipes</code>, <code>top_sights</code>, <code>scholarly_articles</code>, <code>popular_products</code>, <code>questions_and_answers</code>, <code>find_results_on</code>, <code>stocks_box</code>, <code>commercial_units</code>, <code>local_services</code>, <code>google_hotels</code>, <code>math_solver</code>, <code>currency_box</code>, <code>product_considerations</code>, <code>short_videos</code>, <code>refine_products</code>, <code>perspectives</code>, <code>discussions_and_forums</code>, <code>compare_sites</code>, <code>ai_overview</code><p><strong>note</strong> that this array contains all types of search results found in the returned SERP;<br>however, this endpoint provides data for <code>featured_snippet</code>, <code>organic</code> and <code>paid</code> types only<br>to get all items (inlcuding SERP features and rich snippets) found in the returned SERP, please refer to the <a href='https://docs.dataforseo.com/v3/serp/google/organic/live/advanced/?php'>Google Organiс Advanced SERP</a> endpoint |[optional]|
**seResultsCount** | **Long** | <em>total number of results in SERP</em> |[optional]|
**pagesCount** | **Long** | <em>total search results pages retrieved</em><br>total number of retrieved SERPs in the result |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <strong><code>items</code></strong> array</em> |[optional]|
**items** | **List<BaseSerpApiElementItem>** | <em>items of the element</em> |[optional]|
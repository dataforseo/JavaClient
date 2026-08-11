# SerpBingOrganicLiveAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword received in a POST array<br>        </em><strong>the keyword is returned with decoded %## (plus character '+' will be decoded to a space character)</strong> |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em><br>            you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>            in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>            example:<br>            <code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**spell** | **SpellInfo** | <em>autocorrection of the search engine</em><br>            if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection<br>            equals <code>null</code> |[optional]|
**refinementChips** | **RefinementChipsInfo** | <em>search refinement chips</em><br>            equals <code>null</code> |[optional]|
**itemTypes** | **List<String>** | <em>types of search results in SERP</em><br>            contains types of search results (<code>items</code>) found in SERP.<br>            possible item types:<br>            <span><a href='#answer_box'><code>answer_box</code></a>, <a href='#carousel'><code>carousel</code></a>, <a href='#events'><code>events</code></a>, <a href='#featured_snippet'><code>featured_snippet</code></a>, <a href='#hotels'><code>hotels_pack</code></a>, <a href='#images'><code>images</code></a>, <a href='#jobs'><code>jobs</code></a>, <a href='#local_pack'><code>local_pack</code></a>, <a href='#map'><code>map</code></a>, <a href='#organic'><code>organic</code></a>, <a href='#paid'><code>paid</code></a>, <a href='#people_also_ask'><code>people_also_ask</code></a>, <a href='#people_also_search'><code>people_also_search</code></a>, <a href='#questions_and_answers'><code>questions_and_answers</code></a>,<a href='#recipes'><code>recipes</code></a>, <a href='#related_searches'><code>related_searches</code></a>, <a href='#shopping'><code>shopping</code></a>, <a href='#top_stories'><code>top_stories</code></a>, <a href='#video'><code>video</code></a></span>, <a href='#ai_overview'><code>ai_overview</code></a> |[optional]|
**seResultsCount** | **Long** | <em> total number of results in SERP</em> |[optional]|
**pagesCount** | **Long** | <em>total pages retrieved</em><br>            total number of retrieved SERPs in the result |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <strong><code>items</code></strong> array</em> |[optional]|
**items** | **List<BaseBingSerpApiElementItem>** | <em>elements of search results found in SERP</em> |[optional]|
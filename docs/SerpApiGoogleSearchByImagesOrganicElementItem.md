# SerpApiGoogleSearchByImagesOrganicElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | <em>domain in SERP</em> |[optional]|
**cacheUrl** | **String** | <em>cached version of the page</em> |[optional]|
**relatedSearchUrl** | **String** | <em>URL to a similar search</em><br>            URL to a new search for the same keyword(s) <a href='https://support.google.com/websearch/answer/2466433?hl=en#:~:text=Search%20for%20related%20sites'>on related sites</a> |[optional]|
**breadcrumb** | **String** | <em>breadcrumb in SERP</em> |[optional]|
**websiteName** | **String** | <em>name of the website in SERP</em> |[optional]|
**isImage** | **Boolean** | <em>indicates whether the element contains an <code class='prettyprint'>image</code></em> |[optional]|
**isVideo** | **Boolean** | <em>indicates whether the element contains a <code class='prettyprint'>video</code></em> |[optional]|
**isFeaturedSnippet** | **Boolean** | <em>indicates whether the element is a <code class='prettyprint'>featured_snippet</code></em> |[optional]|
**isMalicious** | **Boolean** | <em>indicates whether the element is marked as malicious</em> |[optional]|
**isWebStory** | **Boolean** | <em>indicates whether the element is marked as Google web story</em> |[optional]|
**checks** | **List<String>** |  |[optional]|
**description** | **String** | <em>description of the results element in SERP</em> |[optional]|
**preSnippet** | **String** | <em>includes additional information appended before the result description in SERP</em> |[optional]|
**extendedSnippet** | **String** | <em>includes additional information appended after the result description in SERP</em> |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images of the element</em> |[optional]|
**ampVersion** | **Boolean** | <em>Accelerated Mobile Pages</em><br>            indicates whether an item has the Accelerated Mobile Page (AMP) version |[optional]|
**rating** | **RatingInfo** | <em>the item's rating </em><br>            the popularity rate based on reviews and displayed in SERP |[optional]|
**price** | **PriceInfo** | <em>pricing details</em><br>            contains the pricing details of the product or service featured in the result |[optional]|
**highlighted** | **List<String>** | <em>words highlighted in bold within the results <code>description</code></em> |[optional]|
**links** | **List<LinkElement>** | <em>sitelinks</em><br>            the links shown below some of Google's search results<br>            if there are none, equals <code>null</code> |[optional]|
**faq** | **FaqBox** | <em>frequently asked questions</em><br>            questions and answers extension shown below some of Google's search results<br>            if there are none, equals <code>null</code> |[optional]|
**extendedPeopleAlsoSearch** | **List<String>** | <em>extension of the organic element</em><br>            extension of the organic result containing related search queries<br>            <strong>Note:</strong> extension appears in SERP upon clicking on the result and then bouncing back to search results |[optional]|
**aboutThisResult** | **AboutThisResultElement** | <em>contains information from the 'About this result' panel</em><br>            <a href='https://blog.google/products/search/learn-more-and-get-more-from-search/'>'About this result' panel</a> provides additional context about why Google returned this result for the given query;<br>            this feature appears after clicking on the three dots next to most results |[optional]|
**relatedResult** | **List<RelatedResult>** | <em>related result from the same domain</em><br>            related result from the same domain appears as a part of the main result snippet;<br>            you can derive the <code>related_result</code> snippets as <code>'type': 'organic'</code> results by setting the <code>group_organic_results</code> parameter to <code>false</code> in the POST request |[optional]|
**timestamp** | **String** | <em>date and time when the result was published</em><br>            in the UTC format: 'yyyy-mm-dd hh-mm-ss +00:00'<br>            example:<br>            <code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
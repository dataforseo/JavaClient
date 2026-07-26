# OrganicSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em> absolute rank in SERP</em><br>absolute position among all the elements found in SERP<strong>note</strong> values are returned in the ascending order, with values corresponding to advanced SERP features omitted from the results;<br>to get all items (including SERP features and rich snippets) with their positions, please refer to the <a href='https://docs.dataforseo.com/v3/serp/google/organic/live/advanced/?php'>Google Organiс Advanced SERP</a> endpoint |[optional]|
**domain** | **String** | <em>domain in SERP</em> |[optional]|
**title** | **String** | <em>title of the results element in SERP</em> |[optional]|
**description** | **String** | <em>description of the results element in SERP</em> |[optional]|
**url** | **String** | <em> relevant URL in SERP</em> |[optional]|
**breadcrumb** | **String** | <em>breadcrumb in SERP</em> |[optional]|
**cacheUrl** | **String** | cached version of the page |[optional]|
**relatedSearchUrl** | **String** | URL to a similar search<br>URL to a new search for the same keyword(s) on related sites |[optional]|
**websiteName** | **String** | name of the website in SERP |[optional]|
**isImage** | **Boolean** | indicates whether the element contains an image |[optional]|
**isVideo** | **Boolean** | indicates whether the element contains a video |[optional]|
**isFeaturedSnippet** | **Boolean** | indicates whether the element is a featured_snippet |[optional]|
**isMalicious** | **Boolean** | indicates whether the element is marked as malicious |[optional]|
**isWebStory** | **Boolean** | indicates whether the element is marked as Google web story |[optional]|
**preSnippet** | **String** | includes additional information appended before the result description in SERP |[optional]|
**extendedSnippet** | **String** | includes additional information appended after the result description in SERP |[optional]|
**images** | **List<AiModeImagesElementInfo>** | images of the element<br>if there are none, equals null |[optional]|
**ampVersion** | **Boolean** | Accelerated Mobile Pages<br>indicates whether an item has the Accelerated Mobile Page (AMP) version |[optional]|
**rating** | **RatingInfo** | the item’s rating <br>the popularity rate based on reviews and displayed in SERP<br>if there is none, equals null |[optional]|
**price** | **PriceInfo** | pricing details<br>contains the pricing details of the product or service featured in the result;<br>if there is none, equals null |[optional]|
**highlighted** | **List<String>** | words highlighted in bold within the results description |[optional]|
**links** | **List<LinkElement>** | link of the element |[optional]|
**faq** | **FaqBox** | frequently asked questions<br>questions and answers extension shown below some of Google’s search results<br>Note: this object is deprecated and always returns null |[optional]|
**extendedPeopleAlsoSearch** | **List<String>** | extension of the organic element<br>extension of the organic result containing related search queries<br>Note: extension appears in SERP upon clicking on the result and then bouncing back to search results |[optional]|
**aboutThisResult** | **AboutThisResultElement** | contains information from the ‘About this result’ panel<br>Note: this object is deprecated and always returns null |[optional]|
**relatedResult** | **List<RelatedResult>** | related result from the same domain<br>related result from the same domain appears as a part of the main result snippet;<br>you can derive the related_result snippets as 'type': 'organic' results by setting the group_organic_results parameter to false in the POST request |[optional]|
**timestamp** | **String** | date and time when the result was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
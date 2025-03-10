

# OrganicSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**domain** | **String** | domain name of the reference |  [optional] |
|**title** | **String** | title of the result in SERP |  [optional] |
|**url** | **String** | relevant URL in SERP |  [optional] |
|**cacheUrl** | **String** | cached version of the page |  [optional] |
|**relatedSearchUrl** | **String** | URL to a similar search URL to a new search for the same keyword(s) on related sites |  [optional] |
|**breadcrumb** | **String** | breadcrumb in SERP |  [optional] |
|**websiteName** | **String** | name of the website in SERP |  [optional] |
|**isImage** | **Boolean** | indicates whether the element contains an image |  [optional] |
|**isVideo** | **Boolean** | indicates whether the element contains a video |  [optional] |
|**isFeaturedSnippet** | **Boolean** | indicates whether the element is a featured_snippet |  [optional] |
|**isMalicious** | **Boolean** | indicates whether the element is marked as malicious |  [optional] |
|**isWebStory** | **Boolean** | indicates whether the element is marked as Google web story |  [optional] |
|**description** | **String** | description of the results element in SERP |  [optional] |
|**preSnippet** | **String** | includes additional information appended before the result description in SERP |  [optional] |
|**extendedSnippet** | **String** | includes additional information appended after the result description in SERP |  [optional] |
|**images** | [**List&lt;ImagesElement&gt;**](ImagesElement.md) | images of the element |  [optional] |
|**ampVersion** | **Boolean** | Accelerated Mobile Pages indicates whether an item has the Accelerated Mobile Page (AMP) version |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**price** | [**PriceInfo**](PriceInfo.md) |  |  [optional] |
|**highlighted** | **List&lt;String&gt;** | words highlighted in bold within the results description |  [optional] |
|**links** | [**List&lt;LinkElement&gt;**](LinkElement.md) | sitelinks the links shown below some of Google’s search results if there are none, equals null |  [optional] |
|**faq** | [**FaqBox**](FaqBox.md) |  |  [optional] |
|**extendedPeopleAlsoSearch** | **List&lt;String&gt;** | extension of the organic element extension of the organic result containing related search queries Note: extension appears in SERP upon clicking on the result and then bouncing back to search results |  [optional] |
|**aboutThisResult** | [**AboutThisResultElement**](AboutThisResultElement.md) |  |  [optional] |
|**relatedResult** | [**List&lt;RelatedResult&gt;**](RelatedResult.md) | related result from the same domain related result from the same domain appears as a part of the main result snippet; you can derive the related_result snippets as \&quot;type\&quot;: \&quot;organic\&quot; results by setting the group_organic_results parameter to false in the POST request |  [optional] |
|**timestamp** | **String** | date and time when the result was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**rectangle** | [**Rectangle**](Rectangle.md) |  |  [optional] |




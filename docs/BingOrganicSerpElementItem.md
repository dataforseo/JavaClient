# BingOrganicSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | domain in SERP |[optional]|
**title** | **String** | title of the results element in SERP |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**url** | **String** | relevant URL in SERP |[optional]|
**breadcrumb** | **String** | breadcrumb in SERP |[optional]|
**cacheUrl** | **String** | cached version of the page |[optional]|
**relatedSearchUrl** | **String** | URL to a similar search<br>URL to a new search for the same keyword(s) on related sites |[optional]|
**websiteName** | **String** | name of the source website |[optional]|
**isImage** | **Boolean** | indicates whether the element contains an image |[optional]|
**isVideo** | **Boolean** | indicates whether the element contains a video |[optional]|
**isFeaturedSnippet** | **Boolean** | indicates whether the element is a featured_snippet |[optional]|
**isMalicious** | **Boolean** | indicates whether the element is marked as malicious |[optional]|
**isWebStory** | **Boolean** | indicates whether the element is marked as a web story |[optional]|
**preSnippet** | **String** | includes additional information appended before the result description in SERP |[optional]|
**extendedSnippet** | **String** | includes additional information appended after the result description in SERP |[optional]|
**images** | **List<AiModeImagesElementInfo>** | images of the element |[optional]|
**ampVersion** | **Boolean** | Accelerated Mobile Pages<br>indicates whether an item has the Accelerated Mobile Page (AMP) version |[optional]|
**rating** | **RatingElement** | the item’s rating <br>the popularity rate based on reviews and displayed in SERP |[optional]|
**price** | **PriceInfo** | pricing details<br>contains the pricing details of the product or service featured in the result |[optional]|
**highlighted** | **List<String>** | words highlighted in bold within the results description |[optional]|
**links** | **List<LinkElement>** | sitelinks<br>the links shown below some search results<br>if there are none, equals null |[optional]|
**faq** | **FaqBox** | frequently asked questions<br>questions and answers extension shown below some search results<br>if there are none, equals null |[optional]|
**extendedPeopleAlsoSearch** | **List<String>** | extension of the organic element<br>extension of the organic result containing related search queries<br>Note: extension appears in SERP upon clicking on the result and then bouncing back to search results |[optional]|
**aboutThisResult** | **AboutThisResultElement** | contains information from the ‘About this result’ panel<br>note: about_this_result feature is not available in Bing search engine, that’s why it always equals null |[optional]|
**relatedResult** | **List<RelatedResult>** | related result from the same domain<br>related result from the same domain appears as a part of the main result snippet;<br>note: related_result feature is not available in Bing search engine, that’s why it always equals null |[optional]|
**timestamp** | **String** | date and time when the result was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
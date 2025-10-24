# RelatedResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**page** | **Integer** | search results page number<br>indicates the number of the SERP page on which the element is located |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**domain** | **String** | website domain |[optional]|
**title** | **String** | reference page title |[optional]|
**url** | **String** | URL |[optional]|
**cacheUrl** | **String** | cached version of the page |[optional]|
**relatedSearchUrl** | **String** | URL to a similar search<br>URL to a new search for the same keyword(s) on related sites |[optional]|
**breadcrumb** | **String** | breadcrumb in SERP |[optional]|
**websiteName** | **String** | name of the website in the ad element |[optional]|
**isImage** | **Boolean** | indicates whether the element contains an image |[optional]|
**isVideo** | **Boolean** | indicates whether the element contains a video |[optional]|
**description** | **String** | description of the hotel booking element |[optional]|
**preSnippet** | **String** | includes additional information appended before the result description in SERP |[optional]|
**extendedSnippet** | **String** | includes additional information appended after the result description in SERP |[optional]|
**images** | **List<AiModeImagesElementInfo>** | images of the component<br>if there are none, equals null |[optional]|
**ampVersion** | **Boolean** | Accelerated Mobile Pages<br>indicates whether an item has the Accelerated Mobile Page (AMP) version |[optional]|
**rating** | **RatingInfo** | the element’s rating<br>the popularity rate based on reviews and displayed in SERP |[optional]|
**price** | **PriceInfo** | price indicated in the element |[optional]|
**highlighted** | **List<String>** | words highlighted in bold within the results description |[optional]|
**aboutThisResult** | **AboutThisResultElement** | contains information from the ‘About this result’ panel<br>‘About this result’ panel provides additional context about why Google returned this result for the given query;<br>this feature appears after clicking on the three dots next to most results |[optional]|
**timestamp** | **String** | date and time when the video was published or indexed<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
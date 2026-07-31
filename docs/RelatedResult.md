# RelatedResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**page** | **Integer** | search results page number<br>indicates the number of the SERP page on which the element is located |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**domain** | **String** | website domain |[optional]|
**title** | **String** | title of a given link element |[optional]|
**url** | **String** | URL |[optional]|
**cacheUrl** | **String** | cached version of the page |[optional]|
**relatedSearchUrl** | **String** | URL to a similar search<br>URL to a new search for the same keyword(s) on related sites |[optional]|
**breadcrumb** | **String** | breadcrumb in SERP |[optional]|
**websiteName** | **String** | name of the website in the ad element |[optional]|
**isImage** | **Boolean** | indicates whether the element contains an image<br>Note: this check no longer appears in SERP |[optional]|
**isVideo** | **Boolean** | indicates whether the element contains a video<br>Note: this check no longer appears in SERP |[optional]|
**checks** | **List<String>** | array of properties detected for the SERP element<br>lists the properties that are true for this element<br>each value in the array represents a detected property<br>example:<br>if is_image is present in the array, the element contains an image<br>possible values in the array:<br>is_image, is_video, is_featured_snippet, amp_version, is_malicious, is_web_story, is_highly_cited<br>equals null if none of the properties are detected for the element<br>learn more about the checks array in this Help Center article |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**preSnippet** | **String** | includes additional information appended before the result description in SERP |[optional]|
**extendedSnippet** | **String** | includes additional information appended after the result description in SERP |[optional]|
**images** | **List<AiModeImagesElementInfo>** | images of the component<br>if there are none, equals null |[optional]|
**ampVersion** | **Boolean** | Accelerated Mobile Pages<br>indicates whether an item has the Accelerated Mobile Page (AMP) version |[optional]|
**rating** | **RatingInfo** | the item’s rating <br>the popularity rate based on reviews and displayed in SERP;<br>if there is none, equals null |[optional]|
**price** | **PriceInfo** | price of booking a place for the specified dates of stay |[optional]|
**highlighted** | **List<String>** | words highlighted in bold within the results description |[optional]|
**aboutThisResult** | **AboutThisResultElement** | contains information from the ‘About this result’ panel<br>Note: this object is deprecated and always returns null |[optional]|
**timestamp** | **String** | date and time when the result was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
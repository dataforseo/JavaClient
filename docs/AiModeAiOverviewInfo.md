# AiModeAiOverviewInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**page** | **Integer** |  |[optional]|
**position** | **String** | the alignment of the element in SERP<br>can take the following values:<br>left, right |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**markdown** | **String** | content of the element in markdown format<br>the text of the ai_overview formatted in the markdown markup language |[optional]|
**items** | **List<BaseSerpApiAiModeAiOverviewElementItem>** | elements of search results found in SERP |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | additional references relevant to the item<br>includes references to webpages that may have been used to generate the ai_overview |[optional]|
**rectangle** | **AiModeRectangleInfo** | rectangle parameters<br>contains cartesian coordinates and pixel dimensions of the result’s snippet in SERP<br>equals null if calculate_rectangles in the POST request is not set to true |[optional]|
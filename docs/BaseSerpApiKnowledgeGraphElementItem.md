# BaseSerpApiKnowledgeGraphElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**page** | **Integer** | search results page number<br>indicates the number of the SERP page on which the element is located |[optional]|
**position** | **String** | the alignment of the element in SERP<br>can take the following values:<br>left, right |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**rectangle** | **AiModeRectangleInfo** | rectangle parameters<br>contains cartesian coordinates and pixel dimensions of the result’s snippet in SERP<br>equals null if calculate_rectangles in the POST request is not set to true |[optional]|
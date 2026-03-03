# AiModeAiOverviewInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | group rank in SERPposition within a group of elements with identical type valuespositions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERPabsolute position among all the elements in SERP |[optional]|
**page** | **Integer** | SERP pageSERP page on which the element ranks |[optional]|
**position** | **String** | the alignment of the element in SERPcan take the following values:left, right |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**markdown** | **String** | content of the element in markdown formatthe text of the ai_overview formatted in the markdown markup language |[optional]|
**items** | **List<BaseSerpApiAiModeAiOverviewElementItem>** | elements of search results found in SERP |[optional]|
**references** | **List<AiModeAiOverviewReferenceInfo>** | additional references relevant to the itemincludes references to webpages that may have been used to generate the ai_overview |[optional]|
**rectangle** | **AiModeRectangleInfo** | rectangle parameterscontains cartesian coordinates and pixel dimensions of the result's snippet in SERPequals null if calculate_rectangles in the POST request is not set to true |[optional]|
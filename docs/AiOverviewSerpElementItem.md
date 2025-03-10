

# AiOverviewSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**asynchronousAiOverview** | **Boolean** | indicates whether the element is loaded asynchronically if true, the ai_overview element is loaded asynchronically; if false, the ai_overview element is loaded from cache; |  [optional] |
|**items** | [**List&lt;AiOverviewElement&gt;**](AiOverviewElement.md) | contains arrays of specific images |  [optional] |
|**references** | [**List&lt;AiOverviewReference&gt;**](AiOverviewReference.md) | additional references relevant to the item includes references to webpages that may have been used to generate the ai_overview |  [optional] |
|**rectangle** | [**Rectangle**](Rectangle.md) |  |  [optional] |




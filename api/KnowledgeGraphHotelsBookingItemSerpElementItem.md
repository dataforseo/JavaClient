

# KnowledgeGraphHotelsBookingItemSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**title** | **String** | title of a given link element |  [optional] |
|**dateFrom** | **String** | starting date of stay in the format “year-month-date” example: 2019-11-15 |  [optional] |
|**dateTo** | **String** | ending date of stay in the format “year-month-date” example: 2019-11-17 |  [optional] |
|**dataAttrid** | **String** | google defined data attribute ID example: kc:/local:hotel booking |  [optional] |
|**items** | [**List&lt;KnowledgeGraphHotelsBookingElement&gt;**](KnowledgeGraphHotelsBookingElement.md) | additional items present in the element if there are none, equals null |  [optional] |
|**rectangle** | [**Rectangle**](Rectangle.md) |  |  [optional] |




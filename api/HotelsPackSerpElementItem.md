

# HotelsPackSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | group rank in SERP position within a group of elements with identical type values; positions of elements with different type values are omitted from rank_group; always equals 0 for desktop |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP always equals 0 for desktop |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**title** | **String** | title of the row |  [optional] |
|**dateFrom** | **String** | starting date of stay in the format “year-month-date” example: 2019-11-15 |  [optional] |
|**dateTo** | **String** | ending date of stay in the format “year-month-date” example: 2019-11-17 |  [optional] |
|**items** | [**List&lt;HotelsPackElement&gt;**](HotelsPackElement.md) | additional items present in the element if there are none, equals null |  [optional] |
|**rectangle** | [**Rectangle**](Rectangle.md) |  |  [optional] |




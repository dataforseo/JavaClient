

# EventItemSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**title** | **String** | title of the result in SERP |  [optional] |
|**description** | **String** | description of the results element in SERP |  [optional] |
|**url** | **String** | relevant URL |  [optional] |
|**imageUrl** | **String** | URL of the image featured in the element |  [optional] |
|**eventDates** | [**EventDates**](EventDates.md) |  |  [optional] |
|**locationInfo** | [**LocationInfo**](LocationInfo.md) |  |  [optional] |
|**informationAndTickets** | [**List&lt;InformationAndTicketsElement&gt;**](InformationAndTicketsElement.md) | additional information and ticket purchase options if there is none, equals null |  [optional] |




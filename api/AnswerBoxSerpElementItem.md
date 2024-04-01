

# AnswerBoxSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | group rank in SERP position within a group of elements with identical type values; positions of elements with different type values are omitted from rank_group; always equals 0 for desktop |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP always equals 0 for desktop |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**text** | **List&lt;String&gt;** | text if there is none, equals null |  [optional] |
|**links** | [**List&lt;LinkElement&gt;**](LinkElement.md) | link of the element |  [optional] |
|**rectangle** | [**Rectangle**](Rectangle.md) |  |  [optional] |






# CompareSitesSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | group rank in SERP position within a group of elements with identical type values; positions of elements with different type values are omitted from rank_group; always equals 0 for desktop |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP always equals 0 for desktop |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**title** | **String** | title of the row |  [optional] |
|**items** | [**List&lt;CompareSitesElement&gt;**](CompareSitesElement.md) | additional items present in the element if there are none, equals null |  [optional] |
|**rectangle** | [**Rectangle**](Rectangle.md) |  |  [optional] |




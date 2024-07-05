

# DataforseoLabsBingPageIntersectionLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type search engine type specified in a POST request; for this endpoint, the field equals bing |  [optional] |
|**keywordData** | [**KeywordData**](KeywordData.md) |  |  [optional] |
|**intersectionResult** | [**Map&lt;String, BaseDataforseoLabsSerpElementItem&gt;**](BaseDataforseoLabsSerpElementItem.md) | contains data on the SERP elements found for the returned keyword data will be provided in separate arrays for each URL you specified in the pages object when setting a task; depending on the number of specified URLs, it can contain from 1 to 20 arrays named respectively |  [optional] |




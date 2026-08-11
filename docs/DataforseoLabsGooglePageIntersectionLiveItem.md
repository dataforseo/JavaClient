# DataforseoLabsGooglePageIntersectionLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**keywordData** | **KeywordDataInfo** | <em>keyword data for the returned keyword</em> |[optional]|
**intersectionResult** | **Map<String, BaseDataforseoLabsApiElementItem>** | <em>contains data on the SERP elements found for the returned <code>keyword</code></em><br>data will be provided in separate arrays for each URL you specified in the <code>pages</code> object when setting a task;<br>depending on the number of specified URLs, it can contain from 1 to 20 arrays named respectively |[optional]|
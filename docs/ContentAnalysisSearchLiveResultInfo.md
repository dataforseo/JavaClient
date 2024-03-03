

# ContentAnalysisSearchLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offsetToken** | **String** | offset token for subsequent requests you can use the string provided in this field to get the subsequent results of the initial task; note: offset_token values are unique for each subsequent task |  [optional] |
|**totalCount** | **Long** | total amount of results in our database relevant to your request |  [optional] |
|**itemsCount** | **Long** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;ContentAnalysisSearchLiveItem&gt;**](ContentAnalysisSearchLiveItem.md) | contains citations and related data |  [optional] |




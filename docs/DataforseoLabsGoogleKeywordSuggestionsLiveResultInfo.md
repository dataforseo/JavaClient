

# DataforseoLabsGoogleKeywordSuggestionsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**seedKeyword** | **String** | keyword in a POST array |  [optional] |
|**seedKeywordData** | [**KeywordDataInfo**](KeywordDataInfo.md) |  |  [optional] |
|**locationCode** | **Integer** | location code in a POST array if there is no data, then the value is null |  [optional] |
|**languageCode** | **String** | language code in a POST array if there is no data, then the value is null |  [optional] |
|**totalCount** | **Long** | total amount of results in our database relevant to your request |  [optional] |
|**itemsCount** | **Long** | the number of results returned in the items array |  [optional] |
|**offset** | **Integer** | current offset value |  [optional] |
|**offsetToken** | **String** | offset token for subsequent requests you can use the string provided in this field to get the subsequent results of the initial task; note: offset_token values are unique for each subsequent task |  [optional] |
|**items** | [**List&lt;KeywordDataInfo&gt;**](KeywordDataInfo.md) | contains keywords and related data |  [optional] |




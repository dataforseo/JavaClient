

# DataforseoLabsGoogleKeywordSuggestionsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**seedKeyword** | **String** | keyword in a POST array |  [optional] |
|**seedKeywordData** | [**KeywordDataInfo**](KeywordDataInfo.md) |  |  [optional] |
|**locationCode** | **BigDecimal** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**totalCount** | **BigDecimal** | total amount of results in our database relevant to your request |  [optional] |
|**itemsCount** | **BigDecimal** | the number of results returned in the items array |  [optional] |
|**offset** | **BigDecimal** | current offset value |  [optional] |
|**offsetToken** | **String** | offset token for subsequent requests you can use the string provided in this field to get the subsequent results of the initial task; note: offset_token values are unique for each subsequent task |  [optional] |
|**items** | [**List&lt;KeywordDataInfo&gt;**](KeywordDataInfo.md) | contains keywords and related data |  [optional] |




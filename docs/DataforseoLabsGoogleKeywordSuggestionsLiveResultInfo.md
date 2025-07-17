# DataforseoLabsGoogleKeywordSuggestionsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**seedKeyword** | **String** | keyword in a POST array |[optional]|
**seedKeywordData** | **KeywordDataInfo** | keyword data for the seed keyword<br>fields in this object are identical to those of the items array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**totalCount** | **Long** | total amount of results in our database relevant to your request |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**offset** | **Integer** | current offset value |[optional]|
**offsetToken** | **String** | offset token for subsequent requests<br>you can use the string provided in this field to get the subsequent results of the initial task;<br>note: offset_token values are unique for each subsequent task |[optional]|
**items** | **List<KeywordDataInfo>** | contains keywords and related data |[optional]|
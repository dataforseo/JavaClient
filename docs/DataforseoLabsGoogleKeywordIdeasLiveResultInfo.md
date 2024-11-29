

# DataforseoLabsGoogleKeywordIdeasLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**seedKeywords** | **List&lt;String&gt;** | keywords in a POST array keywords are returned with decoded %## (plus character ‘+’ will be decoded to a space character) |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**totalCount** | **Long** | total number of results relevant to your request in our database |  [optional] |
|**itemsCount** | **Long** | number of results returned in the items array |  [optional] |
|**offset** | **Integer** | current offset value |  [optional] |
|**offsetToken** | **String** | offset token for subsequent requests you can use the string provided in this field to get the subsequent results of the initial task; note: offset_token values are unique for each subsequent task |  [optional] |
|**items** | [**List&lt;KeywordDataInfo&gt;**](KeywordDataInfo.md) | contains keyword ideas and related data |  [optional] |




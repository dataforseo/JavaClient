# DataforseoLabsGoogleKeywordSuggestionsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**seedKeyword** | **String** | <em>keyword in a POST array</em> |[optional]|
**seedKeywordData** | **KeywordDataInfo** | <em>keyword data for the seed keyword</em><br>fields in this object are identical to those of the <code>items</code> array |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em><br>if there is no data, then the value is_<code>null</code>n |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em><br>if there is no data, then the value is_<code>null</code>n |[optional]|
**totalCount** | **Long** | <em>total amount of results in our database relevant to your request</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <code>items</code> array</em> |[optional]|
**offset** | **Integer** | <em>current offset value</em> |[optional]|
**offsetToken** | **String** | <em>offset token for subsequent requests</em><br>you can use the string provided in this field to get the subsequent results of the initial task;<br><strong>note:</strong> <code>offset_token</code> values are unique for each subsequent task |[optional]|
**items** | **List<KeywordDataInfo>** | <em>contains keywords and related data</em> |[optional]|
# DataforseoLabsGoogleKeywordIdeasLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**seedKeywords** | **List<String>** | <em>keywords in a POST array</em><br><strong>keywords are returned with decoded %## (plus character '+' will be decoded to a space character)</strong> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**totalCount** | **Long** | <em>total number of results relevant to your request in our database </em> |[optional]|
**itemsCount** | **Long** | <em>number of results returned in the <code>items</code> array</em> |[optional]|
**offset** | **Integer** | <em>current offset value</em> |[optional]|
**offsetToken** | **String** | <em>offset token for subsequent requests</em><br>you can use the string provided in this field to get the subsequent results of the initial task;<br><strong>note:</strong> <code>offset_token</code> values are unique for each subsequent task |[optional]|
**items** | **List<KeywordDataInfo>** | <em>contains keyword ideas and related data</em> |[optional]|
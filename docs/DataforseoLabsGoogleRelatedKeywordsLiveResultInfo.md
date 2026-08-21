# DataforseoLabsGoogleRelatedKeywordsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**seedKeyword** | **String** | <em>keyword in a POST array</em> |[optional]|
**seedKeywordData** | **KeywordDataInfo** | <em>keyword data for the seed keyword</em><br>fields in the array are identical to that of <code>keyword_data</code> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**totalCount** | **Long** | <em>total amount of results in our database relevant to your request</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <code>items</code> array</em> |[optional]|
**items** | **List<DataforseoLabsGoogleRelatedKeywordsLiveItem>** | <em>contains keywords and related data</em> |[optional]|
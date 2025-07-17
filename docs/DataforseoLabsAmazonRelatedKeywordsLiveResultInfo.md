# DataforseoLabsAmazonRelatedKeywordsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**seedKeyword** | **String** | keyword in a POST array |[optional]|
**seedKeywordData** | **AmazonKeywordData** | keyword data for the seed keyword<br>fields in the object are identical to that of keyword_data |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**totalCount** | **Long** | total amount of results in our database relevant to your request |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<DataforseoLabsAmazonRelatedKeywordsLiveItem>** | contains objects with keywords and related data |[optional]|
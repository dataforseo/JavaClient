# DataforseoLabsBingPageIntersectionLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type<br>search engine type specified in a POST request;<br>for this endpoint, the field equals bing |[optional]|
**pages** | **Map<String, String>** | URLs you specified a POST array |[optional]|
**excludePages** | **List<String>** | URLs you specified in a POST array that will be excluded from the results |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**totalCount** | **Long** | total amount of results in our database relevant to your request |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<DataforseoLabsPageIntersectionLiveItem>** | contains keywords, relevant SERP elements and related data |[optional]|
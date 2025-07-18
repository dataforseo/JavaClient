# DataforseoLabsGoogleRankedKeywordsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**target** | **String** | target domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array<br>if there is no data, then the value is null |[optional]|
**languageCode** | **String** | language code in a POST array<br>if there is no data, then the value is null |[optional]|
**totalCount** | **Long** | total number of results in our database relevant to your request |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**metrics** | **Map<String, DataforseoLabsMetricsInfo>** | ranking data relevant to the specified domain<br>ranking data is provided by the rank_group parameters that show the result’s rank considering only equivalent SERP elements |[optional]|
**metricsAbsolute** | **Map<String, DataforseoLabsMetricsInfo>** | ranking data relevant to the specified domain<br>ranking data is provided by the rank_absolute parameters that indicate the result’s position among all SERP elements |[optional]|
**items** | **List<DataforseoLabsRankedKeywordsLiveItem>** | contains ranked keywords and related data |[optional]|
# DataforseoLabsGoogleRankedKeywordsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**target** | **String** | <em>target domain or webpage in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em><br>            if there is no data, then the value is <code>null</code> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em><br>            if there is no data, then the value is <code>null</code> |[optional]|
**totalCount** | **Long** | <em>total number of results in our database relevant to your request</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <code>items</code> array</em> |[optional]|
**metrics** | **Map<String, DataforseoLabsMetricsInfo>** | <em>ranking data relevant to the specified domain or webpage </em><br>            ranking data is provided by the <code>rank_group</code> parameters that show the result’s rank considering only equivalent SERP elements |[optional]|
**metricsAbsolute** | **Map<String, DataforseoLabsMetricsInfo>** | <em>ranking data relevant to the specified domain or webpage</em><br>            ranking data is provided by the <code>rank_absolute</code> parameters that indicate the result’s position among all SERP elements |[optional]|
**items** | **List<DataforseoLabsGoogleRankedKeywordsLiveItem>** | <em>contains ranked keywords and related data</em> |[optional]|
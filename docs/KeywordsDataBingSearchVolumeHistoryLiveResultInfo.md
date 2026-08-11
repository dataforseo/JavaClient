# KeywordsDataBingSearchVolumeHistoryLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em><br>if there is no data, then the value is_<code>null</code>n |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em><br>if there is no data, then the value is_<code>null</code>n |[optional]|
**device** | **List<String>** |  |[optional]|
**period** | **String** | <em>time period</em><br>indicates if returned data is aggregated to a certain time period<br>default value <code>monthly</code> |[optional]|
**searches** | **SearchVolumeHistorySearchInfo** | <em>contains results distributed by device type</em><br>if the <code>device</code> parameter is not specified, the data will be returned for all available device types |[optional]|
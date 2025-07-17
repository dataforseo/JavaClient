# DataforseoLabsGoogleHistoricalKeywordDataLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**keyword** | **String** | keyword<br>keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |[optional]|
**locationCode** | **Integer** | location code in a POST array<br>if there is no data, then the value is null |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**history** | **List<History>** | array of objects with historical data for the keyword |[optional]|
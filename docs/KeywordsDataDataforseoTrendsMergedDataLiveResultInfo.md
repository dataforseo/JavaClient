# KeywordsDataDataforseoTrendsMergedDataLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keywords** | **List<String>** | keywords in a POST array |[optional]|
**type** | **String** | type of element |[optional]|
**locationCode** | **Integer** | location code in a POST array<br>if there is no data, then the value is null |[optional]|
**languageCode** | **String** | language code in a POST array<br>if there is no data, then the value is null |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BaseKeywordDataDataforseoTrendsItem>** | keyword popularity values per location<br>values in this array represent percentages relative to the maximum value within each region |[optional]|
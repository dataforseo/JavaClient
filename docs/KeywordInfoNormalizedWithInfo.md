# KeywordInfoNormalizedWithInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**lastUpdatedTime** | **String** | date and time when the dataset was updated<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**searchVolume** | **Integer** | current search volume rate of a keyword |[optional]|
**isNormalized** | **Boolean** | keyword info is normalized<br>if true, values are normalized with Bing data |[optional]|
**monthlySearches** | **List<MonthlySearchesInfo>** | monthly search volume rates<br>array of objects with search volume rates in a certain month of a year |[optional]|
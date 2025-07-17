# ClickstreamKeywordInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**searchVolume** | **Long** | current search volume rate of a keyword |[optional]|
**lastUpdatedTime** | **String** | date and time when backlink data was updated<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**genderDistribution** | **Map<String, Long>** | distribution of estimated clickstream-based metrics by gender<br>learn more about how the metric is calculated in this help center article |[optional]|
**ageDistribution** | **Map<String, Long>** | distribution of clickstream-based metrics by age<br>learn more about how the metric is calculated in this help center article |[optional]|
**monthlySearches** | **List<MonthlySearchesInfo>** | monthly searches<br>represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations |[optional]|
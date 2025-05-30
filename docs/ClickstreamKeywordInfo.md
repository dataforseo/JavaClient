

# ClickstreamKeywordInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**searchVolume** | **BigDecimal** | current search volume rate of a keyword |  [optional] |
|**lastUpdatedTime** | **String** | date and time when backlink data was updated in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**genderDistribution** | **Map&lt;String, Long&gt;** | distribution of estimated clickstream-based metrics by gender learn more about how the metric is calculated in this help center article |  [optional] |
|**ageDistribution** | **Map&lt;String, Long&gt;** | distribution of clickstream-based metrics by age learn more about how the metric is calculated in this help center article |  [optional] |
|**monthlySearches** | [**List&lt;MonthlySearches&gt;**](MonthlySearches.md) | monthly searches represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations |  [optional] |




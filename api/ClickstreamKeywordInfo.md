

# ClickstreamKeywordInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**searchVolume** | **Long** | monthly average clickstream search volume rate |  [optional] |
|**lastUpdatedTime** | **String** | date and time when the clickstream dataset was updated in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” |  [optional] |
|**genderDistribution** | **Map&lt;String, Long&gt;** | distribution of estimated clickstream-based metrics by gender |  [optional] |
|**ageDistribution** | **Map&lt;String, Long&gt;** | distribution of clickstream-based metrics by age |  [optional] |
|**monthlySearches** | [**List&lt;MonthlySearches&gt;**](MonthlySearches.md) | monthly clickstream search volume rates array of objects with clickstream search volume rates in a certain month of a year |  [optional] |




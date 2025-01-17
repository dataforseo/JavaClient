

# KeywordInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**lastUpdatedTime** | **String** | date and time when keyword data was updated in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**competition** | **Float** | competition represents the relative amount of competition associated with the given keyword. This value is based on Google Ads data and can be between 0 and 1 (inclusive) |  [optional] |
|**competitionLevel** | **String** | competition level represents the relative level of competition associated with the given keyword in paid SERP only; possible values: LOW, MEDIUM, HIGH if competition level is unknown, the value is null; learn more about the metric in this help center article |  [optional] |
|**cpc** | **Float** | cost-per-click represents the average cost per click (USD) historically paid for the keyword |  [optional] |
|**searchVolume** | **Long** | average monthly search volume rate represents the (approximate) number of searches for the given keyword idea on google.com |  [optional] |
|**lowTopOfPageBid** | **Float** | minimum bid for the ad to be displayed at the top of the first page indicates the value greater than about 20% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers) the value may differ depending on the location specified in a POST request |  [optional] |
|**highTopOfPageBid** | **Float** | maximum bid for the ad to be displayed at the top of the first page indicates the value greater than about 80% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers) the value may differ depending on the location specified in a POST request |  [optional] |
|**categories** | **List&lt;Integer&gt;** | product and service categories you can download the full list of possible categories |  [optional] |
|**monthlySearches** | [**List&lt;MonthlySearches&gt;**](MonthlySearches.md) | monthly searches represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations |  [optional] |
|**searchVolumeTrend** | [**SearchVolumeTrendInfo**](SearchVolumeTrendInfo.md) |  |  [optional] |




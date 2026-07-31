# KeywordInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**lastUpdatedTime** | **String** | date and time when keyword data was updatedin the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”example:2019-11-15 12:57:46 +00:00 |[optional]|
**competition** | **Double** | competitionrepresents the relative amount of competition associated with the given keyword. This value is based on Google Ads data and can be between 0 and 1 (inclusive) |[optional]|
**competitionLevel** | **String** | competition levelrepresents the relative level of competition associated with the given keyword in paid SERP only;possible values: LOW, MEDIUM, HIGHif competition level is unknown, the value is null;learn more about the metric in this help center article |[optional]|
**cpc** | **Double** | cost-per-clickrepresents the average cost per click (USD) historically paid for the keyword |[optional]|
**searchVolume** | **Long** | average monthly search volume raterepresents the (approximate) number of searches for the given keyword idea on google.com |[optional]|
**lowTopOfPageBid** | **Double** | minimum bid for the ad to be displayed at the top of the first pageindicates the value greater than about 20% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers)the value may differ depending on the location specified in a POST request |[optional]|
**highTopOfPageBid** | **Double** | maximum bid for the ad to be displayed at the top of the first pageindicates the value greater than about 80% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers)the value may differ depending on the location specified in a POST request |[optional]|
**categories** | **List<Integer>** | product and service categoriesyou can download the_full list of possible categoriesn |[optional]|
**monthlySearches** | **List<MonthlySearchesInfo>** | monthly searchesrepresents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations |[optional]|
**searchVolumeTrend** | **SearchVolumeTrend** | search volume trend changesrepresents search volume change in percent compared to the previous period |[optional]|
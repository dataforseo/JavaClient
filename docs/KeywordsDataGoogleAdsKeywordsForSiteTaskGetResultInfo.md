

# KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword in a POST array |  [optional] |
|**spell** | **String** |  |  [optional] |
|**locationCode** | **BigDecimal** | location code in a POST array if there is no data, the value is null |  [optional] |
|**languageCode** | **String** | language code in a POST array if there is no data, the value is null |  [optional] |
|**searchPartners** | **Boolean** | include Google search partners the value you specified when setting the task if true, the results are returned for owned, operated, and syndicated networks across Google and partner sites that host Google search; if false, the results are returned for Google search sites only |  [optional] |
|**competition** | **String** | competition represents the relative level of competition associated with the given keyword in paid SERP only possible values: LOW, MEDIUM, HIGH if competition level is unknown, the value is null; learn more about the metric in this help center article |  [optional] |
|**competitionIndex** | **BigDecimal** | competition index the competition index for the query indicating how competitive ad placement is for the keyword can take values from 0 to 100 the level of competition from 0 to 100 is determined by the number of ad slots filled divided by the total number of ad slots available if not enough data is available, the value is null; learn more about the metric in this help center article |  [optional] |
|**searchVolume** | **BigDecimal** | monthly average search volume rate represents the (approximate) number of searches for the given keyword idea either on google.com or google.com and partners, depending on the user’s targeting if there is no data, the value is null |  [optional] |
|**lowTopOfPageBid** | **Float** | minimum bid for the ad to be displayed at the top of the first page indicates the value greater than about 20% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers) the value may differ depending on the location specified in a POST request |  [optional] |
|**highTopOfPageBid** | **Float** | maximum bid for the ad to be displayed at the top of the first page indicates the value greater than about 80% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers) the value may differ depending on the location specified in a POST request |  [optional] |
|**cpc** | **Float** | cost per click indicates the amount paid for each click on the ad displayed for a given keyword |  [optional] |
|**monthlySearches** | [**List&lt;MonthlySearches&gt;**](MonthlySearches.md) | monthly searches represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations if there is no data, the value is null |  [optional] |




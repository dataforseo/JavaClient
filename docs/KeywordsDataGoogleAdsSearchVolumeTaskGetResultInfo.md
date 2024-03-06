[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# KeywordsDataGoogleAdsSearchVolumeTaskGetResultInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword keyword is returned with decoded %## (plus symbol ‘+’ will be decoded to a space character) |  [optional] |
|**spell** | [**SpellInfo**](SpellInfo.md) |  |  [optional] |
|**locationCode** | **Integer** | location code in a POST array if there is no data, then the value is null |  [optional] |
|**languageCode** | **String** | language code in a POST array if there is no data, then the value is null |  [optional] |
|**searchPartners** | **Boolean** | indicates whether data from partner networks included in the response |  [optional] |
|**competition** | **String** | competition represents the relative amount of competition associated with the given keyword in paid SERP only; this value is based on Google Ads data and can take the following values: HIGH, MEDIUM, LOW; if there is no data the value is null; learn more about the metric in this help center article |  [optional] |
|**competitionIndex** | **Integer** | competition represents the relative amount of competition associated with the given keyword in paid SERP only; this value is based on Google Ads data and can be between 0 and 100 (inclusive); if there is no data the value is null; learn more about the metric in this help center article |  [optional] |
|**searchVolume** | **Long** | monthly average search volume rate; represents either the (approximate) number of searches for the given keyword idea on google.com or google.com and partners, depending on the user’s targeting; if there is no data then the value is null |  [optional] |
|**lowTopOfPageBid** | **Float** | minimum bid for the ad to be displayed at the top of the first page indicates the value greater than about 20% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers); the value may differ depending on the location specified in a POST request |  [optional] |
|**highTopOfPageBid** | **Float** | maximum bid for the ad to be displayed at the top of the first page indicates the value greater than about 80% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers); the value may differ depending on the location specified in a POST request |  [optional] |
|**cpc** | **Float** | cost per click indicates the amount paid for each click on the ad displayed for a given keyword |  [optional] |
|**monthlySearches** | [**List&lt;MonthlySearches&gt;**](MonthlySearches.md) | monthly searches represents the (approximate) number of searches on this keyword idea (as available for the past twelve months by default), targeted to the specified geographic locations; if there is no data then the value is null |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
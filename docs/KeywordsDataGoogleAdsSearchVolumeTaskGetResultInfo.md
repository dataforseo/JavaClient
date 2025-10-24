# KeywordsDataGoogleAdsSearchVolumeTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword<br>keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |[optional]|
**spell** | **String** | correct spelling of the keyword<br>Note:if the keyword in the POST array appears to be misspelled, data will be returned for the correctly spelled keyword;<br>we use the functionality of Google Ads API to check and validate the spelling of keywords, learn more by this link |[optional]|
**locationCode** | **Integer** | location code in a POST array<br>if there is no data, then the value is null |[optional]|
**languageCode** | **String** | language code in a POST array<br>if there is no data, then the value is null |[optional]|
**searchPartners** | **Boolean** | indicates whether data from partner networks included in the response |[optional]|
**competition** | **String** | competition<br>represents the relative amount of competition associated with the given keyword in paid SERP only;<br>this value is based on Google Ads data and can take the following values: HIGH, MEDIUM, LOW;<br>if there is no data the value is null;<br>learn more about the metric in this help center article |[optional]|
**competitionIndex** | **Integer** | competition<br>represents the relative amount of competition associated with the given keyword in paid SERP only;<br>this value is based on Google Ads data and can be between 0 and 100 (inclusive);<br>if there is no data the value is null;<br>learn more about the metric in this help center article |[optional]|
**searchVolume** | **Long** | monthly average search volume rate |[optional]|
**lowTopOfPageBid** | **Double** | minimum bid for the ad to be displayed at the top of the first page<br>indicates the value greater than about 20% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers);<br>the value may differ depending on the location specified in a POST request |[optional]|
**highTopOfPageBid** | **Double** | maximum bid for the ad to be displayed at the top of the first page<br>indicates the value greater than about 80% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers);<br>the value may differ depending on the location specified in a POST request |[optional]|
**cpc** | **Integer** | cost per click<br>indicates the amount paid for each click on the ad displayed for a given keyword |[optional]|
**monthlySearches** | **List<MonthlySearchesInfo>** | monthly searches<br>represents the (approximate) number of searches on this keyword idea (as available for the past twelve months by default), targeted to the specified geographic locations;<br>if there is no data then the value is null |[optional]|
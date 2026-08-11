# KeywordsDataGoogleAdsSearchVolumeTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword<br></em><strong>keyword is returned with decoded %## (plus character '+' will be decoded to a space character)</strong> |[optional]|
**spell** | **String** | <em>correct spelling of the keyword</em><br><strong>Note:</strong>if the keyword in the POST array appears to be misspelled, data will be returned for the correctly spelled keyword;<br>we use the functionality of Google Ads API to check and validate the spelling of keywords, <a href='https://support.google.com/google-ads/answer/7476658' target='_blank' rel='noopener noreferrer'>learn more by this link</a> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em><br>if there is no data, then the value is_<code>null</code>n |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em><br>if there is no data, then the value is_<code>null</code>n |[optional]|
**searchPartners** | **Boolean** | <em>indicates whether data from partner networks included in the response</em> |[optional]|
**competition** | **String** | <em>competition</em><br>represents the relative amount of competition associated with the given keyword in paid SERP only;<br>this value is based on Google Ads data and can take the following values: <code>HIGH</code>, <code>MEDIUM</code>, <code>LOW</code>;<br>if there is no data the value is <code>null</code>;<br>learn more about the metric in <a href='https://dataforseo.com/help-center/what-is-competition' target='_blank' rel='noopener noreferrer'>this help center article</a> |[optional]|
**competitionIndex** | **Integer** | <em>competition</em><br>represents the relative amount of competition associated with the given keyword in paid SERP only;<br>this value is based on Google Ads data and can be between 0 and 100 (inclusive);<br>if there is no data the value is <code>null</code>;<br>learn more about the metric in <a href='https://dataforseo.com/help-center/what-is-competition' target='_blank' rel='noopener noreferrer'>this help center article</a> |[optional]|
**searchVolume** | **Long** | <em>monthly average search volume rate</em> |[optional]|
**lowTopOfPageBid** | **Double** | <em>minimum bid for the ad to be displayed at the top of the first page</em><br>indicates the value greater than about 20% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers);<br>the value may differ depending on the location specified in a POST request |[optional]|
**highTopOfPageBid** | **Double** | <em>maximum bid for the ad to be displayed at the top of the first page</em><br>indicates the value greater than about 80% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers);<br>the value may differ depending on the location specified in a POST request |[optional]|
**cpc** | **Double** | <em>cost per click</em><br>indicates the amount paid (USD) for each click on the ad displayed for a given keyword |[optional]|
**monthlySearches** | **List<MonthlySearchesInfo>** | <em>monthly searches</em><br>represents the (approximate) number of searches on this keyword idea (as available for the past twelve months by default), targeted to the specified geographic locations;<br>if there is no data then the value is_<code>null</code>n |[optional]|
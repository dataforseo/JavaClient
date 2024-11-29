

# KeywordsDataBingKeywordsForKeywordsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword in a POST array |  [optional] |
|**locationCode** | **Integer** | location code in a POST array if there is no data, then the value is null |  [optional] |
|**languageCode** | **String** | language code in a POST array if there is no data, then the value is null |  [optional] |
|**searchPartners** | **Boolean** | indicates whether data from partner networks is included in the response |  [optional] |
|**device** | **String** | device type indicates for what device type the data is provided; possible values: all, mobile, desktop, tablet |  [optional] |
|**competition** | **Float** | competition represents the relative amount of competition associated with the given keyword in paid SERP only. This value is based on Bing Ads data. Possible values: 0.1, 0.5,0.90.1 – low competition, 0.5 – medium competition, 0.9 – high competition; if there is no data the value is null |  [optional] |
|**cpc** | **Float** | cost-per-click represents the average cost per click (USD) historically paid for the keyword. if there is no data, then the value is null |  [optional] |
|**searchVolume** | **Long** | monthly average search volume rate represents the (approximate) number of searches for the keyword on the Bing search engine, depending on the user’s targetingsearch volume is rounded to the closest decimal values if there is no data, then the value is null |  [optional] |
|**categories** | **List&lt;String&gt;** | product and service categories legacy field, the value will always be null |  [optional] |
|**monthlySearches** | [**List&lt;MonthlySearches&gt;**](MonthlySearches.md) | monthly searches represents the (approximate) number of searches on this keyword (as available for the past twelve months), targeted to the specified geographic locations. if there is no data, then the value is null |  [optional] |




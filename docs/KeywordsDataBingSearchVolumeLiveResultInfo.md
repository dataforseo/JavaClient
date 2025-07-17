# KeywordsDataBingSearchVolumeLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array<br>if there is no data, then the value is null |[optional]|
**languageCode** | **String** | language code in a POST array<br>if there is no data, then the value is null |[optional]|
**searchPartners** | **Boolean** | indicates whether data from partner networks included in the response |[optional]|
**device** | **String** | device type in a POST array<br>if there is no data, then the value is null |[optional]|
**competition** | **Double** | competition<br>represents the relative amount of competition associated with the given keyword in paid SERP only. This value is based on Bing Ads data.<br>Possible values: 0.1, 0.5,0.90.1 – low competition,<br>0.5 – medium competition,<br>0.9 – high competition;<br>if there is no data the value is null |[optional]|
**cpc** | **Double** | cost-per-click<br>represents the average cost per click (USD) historically paid for the keyword.<br>if there is no data then the value is null |[optional]|
**searchVolume** | **Long** | monthly average search volume rate<br>search volume is rounded to the nearest tens |[optional]|
**categories** | **List<String>** | product and service categories<br>our API doesn’t return categories for this endpoint: the parameter will always equal null |[optional]|
**monthlySearches** | **List<MonthlySearchesInfo>** | monthly searches<br>represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations<br>if there is no data then the value is null |[optional]|
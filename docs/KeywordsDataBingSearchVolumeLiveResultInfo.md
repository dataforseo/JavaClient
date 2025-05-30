

# KeywordsDataBingSearchVolumeLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword in a POST array |  [optional] |
|**locationCode** | **BigDecimal** | location code in a POST array if there is no data, then the value is null |  [optional] |
|**languageCode** | **String** | language code in a POST array if there is no data, then the value is null |  [optional] |
|**searchPartners** | **Boolean** | indicates whether data from partner networks included in the response |  [optional] |
|**device** | **String** | device type in a POST array if there is no data, then the value is null |  [optional] |
|**competition** | **Float** | competition represents the relative amount of competition associated with the given keyword in paid SERP only. This value is based on Bing Ads data. Possible values: 0.1, 0.5,0.90.1 – low competition, 0.5 – medium competition, 0.9 – high competition; if there is no data the value is null |  [optional] |
|**cpc** | **Float** | cost-per-click represents the average cost per click (USD) historically paid for the keyword. if there is no data then the value is null |  [optional] |
|**searchVolume** | **BigDecimal** | monthly average search volume rate search volume is rounded to the nearest tens |  [optional] |
|**categories** | **List&lt;String&gt;** | product and service categories our API doesn’t return categories for this endpoint: the parameter will always equal null |  [optional] |
|**monthlySearches** | [**List&lt;MonthlySearches&gt;**](MonthlySearches.md) | monthly searches represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations if there is no data then the value is null |  [optional] |




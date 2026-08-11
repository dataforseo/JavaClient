# KeywordsDataBingKeywordsForSiteTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em><br>if there is no data the value is <code>null</code> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em><br>if there is no data the value is <code>null</code> |[optional]|
**searchPartners** | **Boolean** | <em>indicates whether data from partner networks included in the response</em> |[optional]|
**device** | **String** | <em>device type in a POST array</em><br>if there is no data, then the value is_<code>null</code>n |[optional]|
**competition** | **Double** | <em>competition</em><br>represents the relative amount of competition associated with the given keyword in paid SERP only. This value is based on Bing Ads data.<br>Possible values: <code>0.1</code>, <code>0.5</code>,<code>0.9</code> <p><code>0.1</code> - low competition,<br><code>0.5</code> - medium competition, <br><code>0.9</code> - high competition;<br>if there is no data the value is <code>null</code> |[optional]|
**cpc** | **Double** | <em>cost-per-click</em><br>represents the average cost per click (USD) historically paid for the keyword.<br>if there is no data the value is <code>null</code> |[optional]|
**searchVolume** | **Long** | <em>monthly average search volume rate<br></em>represents the (approximate) number of searches for the given keyword idea on Bing search engine depending on the user’s targeting<br>if there is no data then the value is_<code>null</code>n |[optional]|
**categories** | **List<String>** | <em>product and service categories</em><br>legacy field, the value will always be <code>null</code> |[optional]|
**monthlySearches** | **List<MonthlySearchesInfo>** | <em>monthly searches</em><br>represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations<p>search volume is rounded to the closest decimal values<p>if there is no data the value is <code>null</code> |[optional]|
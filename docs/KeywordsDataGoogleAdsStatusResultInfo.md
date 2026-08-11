# KeywordsDataGoogleAdsStatusResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**actualData** | **Boolean** | <em>indicates whether Google updated keyword data for the previous month</em><br>generally, Google updates keyword data in the middle of the month<br>if the value is <code>true</code>, Google currently provides up-to-date data for the previous month<br>if the value is <code>false</code>, we are not able to provide data for the previous month |[optional]|
**dateUpdate** | **String** | <em>date of the latest update of Google Ads data</em><br>indicates the latest date when Google updated search volume, CPC, and other keyword metrics<br>example:<br><code>2020-05-15</code> |[optional]|
**lastYearInMonthlySearches** | **Integer** | <em>the latest year for which search volume data is available</em> |[optional]|
**lastMonthInMonthlySearches** | **Integer** | <em>the latest month for which search volume data is available</em> |[optional]|
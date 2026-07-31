# Advertiser


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**advertiserId** | **String** | <em>unique identifier of the advertiser account</em><br>can be used to obtain data on advertising campaigns from the <a href='/v3/serp/google/ads_search/task_post/' rel='noopener noreferrer' target='_blank'>Google Ads Search endpoint</a> |[optional]|
**location** | **String** | <em>location of the advertiser account</em><br>country code associated with the advertiser account |[optional]|
**verified** | **Boolean** | <em>verified advertiser account</em><br>equals <code>true</code> if advertiser account is verified by Google Ads |[optional]|
**approxAdsCount** | **Long** | <em>ads count</em><br>the approximate number of ads that are run by the advertiser account across all available Google Ads platforms |[optional]|
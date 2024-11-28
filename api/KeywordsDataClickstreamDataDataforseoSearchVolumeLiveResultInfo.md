

# KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locationCode** | **String** | location code in a POST array if there is no data, then the value is null |  [optional] |
|**languageCode** | **String** | language code in a POST array  Note:if the keyword in the POST array appears to be misspelled, data will be returned for the correctly spelled keyword; we use the functionality of Google Ads API to check and validate the spelling of keywords, learn more by this link |  [optional] |
|**useClickstream** | **Boolean** | indicates if the use_clickstream parameter is active possible values: true, false |  [optional] |
|**itemsCount** | **String** | ithe number of results returned in the items array |  [optional] |
|**items** | [**List&lt;KeywordsDataClickstreamDataSearchVolumeLiveItem&gt;**](KeywordsDataClickstreamDataSearchVolumeLiveItem.md) | array of keywords contains keywords and their search volume rates |  [optional] |




# KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**locationCode** | **Integer** | location code in a POST array<br>if there is no data, then the value is null |[optional]|
**languageCode** | **String** | language code in a POST array<br><br>Note:if the keyword in the POST array appears to be misspelled, data will be returned for the correctly spelled keyword;<br>we use the functionality of Google Ads API to check and validate the spelling of keywords, learn more by this link |[optional]|
**useClickstream** | **Boolean** | indicates if the use_clickstream parameter is active<br>possible values: true, false |[optional]|
**itemsCount** | **Integer** | ithe number of results returned in the items array |[optional]|
**items** | **List<KeywordsDataClickstreamDataSearchVolumeLiveItem>** | array of keywords<br>contains keywords and their search volume rates |[optional]|
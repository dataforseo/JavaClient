# AppleRankedSerpElementInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**serpItem** | **AppStoreSearchOrganic** | contains data on the SERP element<br>the list of supported SERP elements can be found below |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**seResultsCount** | **Long** | number of search results for the returned keyword |[optional]|
**lastUpdatedTime** | **String** | date and time when SERP data was updated<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**previousUpdatedTime** | **String** | previous to the most recent date and time when SERP data was updated<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-10-15 12:57:46 +00:00;<br>in this case, will equal null |[optional]|
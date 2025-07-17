# BusinessDataTrustpilotSearchTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword in a POST array |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**itemsCount** | **Long** | the number of items in the results array<br>you can get more results by using the depth parameter when setting a task |[optional]|
**items** | **List<TrustpilotSearchOrganic>** | found reviews<br>you can get more results by using the depth parameter when setting a task |[optional]|
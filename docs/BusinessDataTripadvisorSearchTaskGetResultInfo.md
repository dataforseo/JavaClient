# BusinessDataTripadvisorSearchTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | keyword received in a POST array<br>this field will contain the alias parameter if it was specified in a POST array |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to Tripadvisor results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**itemTypes** | **List<String>** | item types encountered in the result<br>possible item types: tripadvisor_search_organic |[optional]|
**seResultsCount** | **Long** | the total number of results |[optional]|
**itemsCount** | **Long** | the number of items in the results array<br>you can get more results by using the depth parameter when setting a task |[optional]|
**items** | **List<TripadvisorSearchOrganic>** | Tripadvisor search listing results<br>you can get more results by using the depth parameter when setting a task |[optional]|
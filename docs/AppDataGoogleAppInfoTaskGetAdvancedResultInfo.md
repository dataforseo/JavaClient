# AppDataGoogleAppInfoTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**appId** | **String** | <em>application id received in a POST request</em> |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**seResultsCount** | **Long** | <em>the total number of results</em> |[optional]|
**itemsCount** | **Long** | <em>the number of items in the results array</em> |[optional]|
**items** | **List<GooglePlayInfoOrganic>** | <em>found app info</em> |[optional]|
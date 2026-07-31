# BusinessDataTripadvisorSearchTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keyword** | **String** | <em>keyword received in a POST array</em><br>this field will contain the <code>alias</code> parameter if it was specified in a POST array |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to Tripadvisor results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**itemTypes** | **List<String>** | <em>item types encountered in the result</em><br>possible item types: <code>tripadvisor_search_organic</code> |[optional]|
**seResultsCount** | **Long** | <em>the total number of results</em> |[optional]|
**itemsCount** | **Long** | <em>the number of items in the results array</em><br>you can get more results by using the <code>depth</code> parameter when setting a task |[optional]|
**items** | **List<TripadvisorSearchOrganic>** | <em>Tripadvisor search listing results</em><br>you can get more results by using the <code>depth</code> parameter when setting a task |[optional]|
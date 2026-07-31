# GooglePlayRankedSerpElementInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**serpItem** | **GooglePlaySearchOrganic** | <em>contains data on the SERP element</em><br>the list of supported SERP elements can be found below |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**seResultsCount** | **Integer** | <em>number of search results for the returned keyword</em> |[optional]|
**lastUpdatedTime** | **String** | <em>date and time when keyword data was updated</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**previousUpdatedTime** | **String** | <em>previous to the most recent date and time when SERP data was updated</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-10-15 12:57:46 +00:00</code>;<br>in this case, will equal null |[optional]|
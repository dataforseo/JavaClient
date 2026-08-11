# AmazonRankedSerpElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**serpItem** | **AmazonInfo** | <em>contains data on the SERP element</em><br>the list of supported SERP elements can be found below |[optional]|
**checkUrl** | **String** | <em>direct URL to Amazon results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**serpItemTypes** | **List<String>** | <em>direct URL to Amazon results</em><br>contains types of all search results (<code>items</code>) found in the returned SERP;<br>possible item types:<br><code>amazon_serp</code>, <code>amazon_paid</code>, <code>editorial_recommendations</code>, <code>top_rated_from_our_brands</code>, <code>related_searches</code> |[optional]|
**seResultsCount** | **Long** | <em>total number of results in Amazon SERP</em> |[optional]|
**lastUpdatedTime** | **String** | <em>date and time when keyword data was updated</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**previousUpdatedTime** | **String** | <em>previous to the most recent update of SERP data</em><br>in the <a href='https://en.wikipedia.org/wiki/ISO_8601'>ISO 860</a>1 format: “YYYY-MM-DDThh:mm:ss.sssssssZ”<br>example:<br><code class='long-string'>2020-09-12T00:07:43.0733218Z</code> |[optional]|
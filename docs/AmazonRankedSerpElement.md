# AmazonRankedSerpElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**serpItem** | **AmazonInfo** | contains data on the SERP element<br>the list of supported SERP elements can be found below |[optional]|
**checkUrl** | **String** | direct URL to Amazon results<br>you can use it to make sure that we provided accurate results |[optional]|
**serpItemTypes** | **List<String>** | direct URL to Amazon results<br>contains types of all search results (items) found in the returned SERP;<br>possible item types:<br>amazon_serp, amazon_paid, editorial_recommendations, top_rated_from_our_brands, related_searches |[optional]|
**seResultsCount** | **Long** | total number of results in Amazon SERP |[optional]|
**lastUpdatedTime** | **String** | date and time when SERP data was last updated<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**previousUpdatedTime** | **String** | previous to the most recent update of SERP data<br>in the ISO 8601 format: “YYYY-MM-DDThh:mm:ss.sssssssZ”<br>example:<br>2020-09-12T00:07:43.0733218Z |[optional]|
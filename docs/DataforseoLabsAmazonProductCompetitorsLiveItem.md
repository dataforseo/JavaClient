# DataforseoLabsAmazonProductCompetitorsLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**asin** | **String** | ASIN of the product<br>unique product identifier on Amazon;<br>for more information, refer to this help center guide |[optional]|
**avgPosition** | **Float** | average position of the product in Amazon SERP<br>Note: average position is calculated for intersected keywords only;<br>the value for a given product may differ when combined with different target products |[optional]|
**sumPosition** | **Integer** | sum of all product positions in Amazon SERP<br>Note: average position is calculated for intersected keywords only;<br>the value for a given product may differ when combined with different target products |[optional]|
**intersections** | **Integer** | number of intersecting keywords |[optional]|
**competitorMetrics** | **AmazonMetricsBundleInfo** | metrics for intersecting keywords<br>ranking data relevant to the keywords that the provided asin shares with the target asin;<br>Note: in this object ranking data is provided for the returned competitor’s asin |[optional]|
**fullMetrics** | **AmazonMetricsBundleInfo** | metrics for all keywords of the product<br>full overview of ranking data relevant to all keywords that the provided asin is ranking for |[optional]|
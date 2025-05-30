

# DataforseoLabsCompetitorsDomainLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**domain** | **String** | domain name |  [optional] |
|**avgPosition** | **Float** | average position of the domain in SERP Note: average position is calculated for intersected keywords only; the value for a given domain may differ when combined with different target websites |  [optional] |
|**sumPosition** | **BigDecimal** | sum of all domain positions in SERP Note: average position is calculated for intersected keywords only; the value for a given domain may differ when combined with different target websites |  [optional] |
|**intersections** | **BigDecimal** | number of intersecting keywords |  [optional] |
|**fullDomainMetrics** | [**Map&lt;String, DataforseoLabsMetricsInfo&gt;**](DataforseoLabsMetricsInfo.md) | metrics for all keywords of the domain full overview of ranking and traffic data relevant to all keywords that the provided domain is ranking for |  [optional] |
|**metrics** | [**Map&lt;String, DataforseoLabsMetricsInfo&gt;**](DataforseoLabsMetricsInfo.md) | metrics for intersecting keywords ranking and traffic data relevant to the keywords that the provided domain shares with the target domain note: in this array ranking and traffic data is provided for the target considering the keywords target shares in search with the competitor’s domain |  [optional] |
|**competitorMetrics** | [**Map&lt;String, DataforseoLabsMetricsInfo&gt;**](DataforseoLabsMetricsInfo.md) | metrics for intersecting keywords ranking and traffic data relevant to the keywords that the provided domain shares with the target domain note: in this array ranking and traffic data is provided for the returned competitor’s domain |  [optional] |




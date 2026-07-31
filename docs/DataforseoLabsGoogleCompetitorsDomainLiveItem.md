# DataforseoLabsGoogleCompetitorsDomainLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**domain** | **String** | <em>domain name</em> |[optional]|
**avgPosition** | **Float** | <em>average position of the domain in SERP</em><br><strong>Note:</strong> average position is calculated for intersected keywords only;<br>the value for a given domain may differ when combined with different target websites |[optional]|
**sumPosition** | **Integer** | <em>sum of all domain positions in SERP</em><br><strong>Note:</strong> average position is calculated for intersected keywords only;<br>the value for a given domain may differ when combined with different target websites |[optional]|
**intersections** | **Integer** | <em>number of intersecting keywords</em> |[optional]|
**fullDomainMetrics** | **Map<String, DataforseoLabsMetricsInfo>** | <em>metrics for all keywords of the domain</em><br>full overview of ranking and traffic data relevant to all keywords that the provided <code>domain</code> is ranking for |[optional]|
**metrics** | **Map<String, DataforseoLabsMetricsInfo>** | <em>metrics for intersecting keywords</em><br>ranking and traffic data relevant to the keywords that the provided <code>domain</code> shares with the <code>target</code> domain<br><strong>note:</strong> in this array ranking and traffic data is provided for the <code>target</code> considering the keywords <code>target</code> shares in search with the competitor's <code>domain</code> |[optional]|
**competitorMetrics** | **Map<String, DataforseoLabsMetricsInfo>** | <em>metrics for intersecting keywords</em><br>ranking and traffic data relevant to the keywords that the provided <code>domain</code> shares with the <code>target</code> domain<br><strong>note:</strong> in this array ranking and traffic data is provided for the returned competitor's <code>domain</code> |[optional]|
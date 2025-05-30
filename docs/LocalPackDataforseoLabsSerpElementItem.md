

# LocalPackDataforseoLabsSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**title** | **String** | title of the result in SERP |  [optional] |
|**description** | **String** | description of the results element in SERP |  [optional] |
|**domain** | **String** | subdomain in SERP |  [optional] |
|**phone** | **String** | phone number |  [optional] |
|**url** | **String** | relevant URL in SERP |  [optional] |
|**isPaid** | **Boolean** | indicates whether the element is an ad |  [optional] |
|**rating** | [**BusinessDataRatingInfo**](BusinessDataRatingInfo.md) |  |  [optional] |
|**mainDomain** | **String** | primary domain name in SERP |  [optional] |
|**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |  [optional] |
|**etv** | **Float** | estimated traffic volume estimated paid monthly traffic to the domain calculated as the product of CTR (click-through-rate) and search volume values of all keywords in the category that the domain ranks for learn more about how the metric is calculated in this help center article |  [optional] |
|**estimatedPaidTrafficCost** | **Float** | estimated cost of monthly search traffic represents the estimated cost of paid monthly traffic (USD) based on etv and cpc values of all keywords in the category that the domain ranks for learn more about how the metric is calculated in this help center article |  [optional] |
|**clickstreamEtv** | **Double** | estimated traffic volume based on clickstream data calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for to retrieve results for this field, the parameter include_clickstream_data must be set to true learn more about how the metric is calculated in this help center article |  [optional] |
|**rankChanges** | [**RankChanges**](RankChanges.md) |  |  [optional] |
|**backlinksInfo** | [**BacklinksInfo**](BacklinksInfo.md) |  |  [optional] |
|**rankInfo** | [**RankInfo**](RankInfo.md) |  |  [optional] |




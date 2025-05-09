

# LocalPackDataforseoLabsSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | title of the result in SERP |  [optional] |
|**description** | **String** | description of the results element in SERP |  [optional] |
|**domain** | **String** | domain where a link points |  [optional] |
|**phone** | **String** | phone number |  [optional] |
|**url** | **String** | relevant URL |  [optional] |
|**isPaid** | **Boolean** | indicates whether the element is an ad |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**mainDomain** | **String** | primary domain name in SERP |  [optional] |
|**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |  [optional] |
|**etv** | **Float** | estimated traffic volume estimated organic monthly traffic to the domain calculated as the product of CTR (click-through-rate) and search volume values of the returned keyword learn more about how the metric is calculated in this help center article |  [optional] |
|**impressionsEtv** | **Float** | estimated traffic volume based on impressions estimated organic monthly traffic to the domain calculated as the product of CTR (click-through-rate) and impressions values of the returned keyword learn more about how the metric is calculated in this help center article |  [optional] |
|**estimatedPaidTrafficCost** | **Float** | estimated cost of converting organic search traffic into paid represents the estimated monthly cost of running ads for the returned keyword the metric is calculated as the product of organic etv and paid cpc values and indicates the cost of driving the estimated volume of monthly organic traffic through PPC advertising in Google Search learn more about how the metric is calculated in this help center article |  [optional] |
|**rankChanges** | [**RankChanges**](RankChanges.md) |  |  [optional] |
|**clickstreamEtv** | **Integer** | estimated traffic volume based on clickstream data calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for to retrieve results for this field, the parameter include_clickstream_data must be set to true learn more about how the metric is calculated in this help center article https://dataforseo.com/help-center/whats-clickstream-estimated-traffic-volume-and-how-is-it-calculated |  [optional] |




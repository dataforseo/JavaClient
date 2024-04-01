

# PaidDataforseoLabsSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**title** | **String** | title of the result in SERP |  [optional] |
|**domain** | **String** | domain where a link points |  [optional] |
|**description** | **String** | description of the results element in SERP |  [optional] |
|**breadcrumb** | **String** | breadcrumb of the Ad element in SERP |  [optional] |
|**url** | **String** | relevant URL of the Ad element in SERP |  [optional] |
|**highlighted** | **List&lt;String&gt;** | words highlighted in bold within the results description |  [optional] |
|**extra** | **Map&lt;String, String&gt;** | additional information about the result |  [optional] |
|**descriptionRows** | **List&lt;String&gt;** | extended description if there is none, equals null |  [optional] |
|**links** | [**List&lt;AdLinkElement&gt;**](AdLinkElement.md) | link of the element |  [optional] |
|**mainDomain** | **String** | primary domain name in SERP |  [optional] |
|**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |  [optional] |
|**etv** | **Float** | estimated traffic volume estimated organic monthly traffic to the domain calculated as the product of CTR (click-through-rate) and search volume values of the returned keyword learn more about how the metric is calculated in this help center article |  [optional] |
|**impressionsEtv** | **Float** | estimated traffic volume based on impressions estimated organic monthly traffic to the domain calculated as the product of CTR (click-through-rate) and impressions values of the returned keyword learn more about how the metric is calculated in this help center article |  [optional] |
|**estimatedPaidTrafficCost** | **Float** | estimated cost of converting organic search traffic into paid represents the estimated monthly cost of running ads for the returned keyword the metric is calculated as the product of organic etv and paid cpc values and indicates the cost of driving the estimated volume of monthly organic traffic through PPC advertising in Google Search learn more about how the metric is calculated in this help center article |  [optional] |
|**rankChanges** | [**RankChanges**](RankChanges.md) |  |  [optional] |
|**seType** | **String** | search engine type |  [optional] |
|**backlinksInfo** | [**BacklinksInfo**](BacklinksInfo.md) |  |  [optional] |
|**rankInfo** | [**RankInfo**](RankInfo.md) |  |  [optional] |




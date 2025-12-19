# DataLabsPaidSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | title of the result in SERP |[optional]|
**domain** | **String** | subdomain in SERP |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**breadcrumb** | **String** | breadcrumb in SERP |[optional]|
**url** | **String** | relevant URL in SERP |[optional]|
**highlighted** | **List<String>** | words highlighted in bold within the results description |[optional]|
**extra** | **Map<String, String>** |  |[optional]|
**descriptionRows** | **List<String>** | extended description<br>if there is none, equals null |[optional]|
**links** | **List<AdLinkElement>** | sitelinks<br>the links shown below some of Google’s search results<br>if there are none, equals null |[optional]|
**mainDomain** | **String** | primary domain name in SERP |[optional]|
**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |[optional]|
**etv** | **Double** | estimated traffic volume<br>estimated paid monthly traffic to the target<br>calculated as the product of CTR (click-through-rate) and search volume values of all keywords in the category that the target ranks for<br>learn more about how the metric is calculated in this help center article |[optional]|
**estimatedPaidTrafficCost** | **Double** | estimated cost of monthly search traffic<br>represents the estimated cost of paid monthly traffic (USD) based on etv and cpc values of all keywords in the category that the target ranks for<br>learn more about how the metric is calculated in this help center article |[optional]|
**clickstreamEtv** | **Double** | estimated traffic volume based on clickstream data<br>calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for<br>to retrieve results for this field, the parameter include_clickstream_data must be set to true<br>learn more about how the metric is calculated in this help center article |[optional]|
**rankChanges** | **RankChanges** | changes in rankings<br>contains information about the ranking changes of the SERP element since the previous_updated_time |[optional]|
**backlinksInfo** | **BacklinksInfo** | backlinks information for the relevant page URL |[optional]|
**rankInfo** | **RankInfo** | page and domain rank information |[optional]|
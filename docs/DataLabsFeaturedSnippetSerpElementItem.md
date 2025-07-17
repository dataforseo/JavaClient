# DataLabsFeaturedSnippetSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | subdomain in SERP |[optional]|
**title** | **String** | title of the result in SERP |[optional]|
**featuredTitle** | **String** | the title of the featured snippets source page |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**url** | **String** | relevant URL in SERP |[optional]|
**table** | **Table** | results table<br>if there are none, equals null |[optional]|
**mainDomain** | **String** | primary domain name in SERP |[optional]|
**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |[optional]|
**etv** | **Double** | estimated traffic volume<br>estimated paid monthly traffic to the domain<br>calculated as the product of CTR (click-through-rate) and search volume values of all keywords in the category that the domain ranks for<br>learn more about how the metric is calculated in this help center article |[optional]|
**estimatedPaidTrafficCost** | **Double** | estimated cost of monthly search traffic<br>represents the estimated cost of paid monthly traffic (USD) based on etv and cpc values of all keywords in the category that the domain ranks for<br>learn more about how the metric is calculated in this help center article |[optional]|
**clickstreamEtv** | **Double** | estimated traffic volume based on clickstream data<br>calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for<br>to retrieve results for this field, the parameter include_clickstream_data must be set to true<br>learn more about how the metric is calculated in this help center article |[optional]|
**rankChanges** | **RankChanges** | changes in rankings<br>contains information about the ranking changes of the SERP element since the previous_updated_time |[optional]|
**backlinksInfo** | **BacklinksInfo** | backlinks information for the target website |[optional]|
**rankInfo** | **RankInfo** | page and domain rank information |[optional]|
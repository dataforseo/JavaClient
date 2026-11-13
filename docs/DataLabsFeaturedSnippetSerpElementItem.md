# DataLabsFeaturedSnippetSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | subdomain in SERP |[optional]|
**title** | **String** | title of the result in SERP |[optional]|
**featuredTitle** | **String** | the title of the featured snippets source page |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**url** | **String** | relevant URL in SERP |[optional]|
**table** | **Table** | results table            if there are none, equals null |[optional]|
**mainDomain** | **String** | primary domain name in SERP |[optional]|
**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |[optional]|
**etv** | **Double** | estimated traffic volume            estimated organic monthly traffic to the domain            calculated as the product of CTR (click-through-rate) and search volume values of the returned keyword            learn more about how the metric is calculated in this help center article |[optional]|
**estimatedPaidTrafficCost** | **Double** | estimated cost of paid monthly search traffic            represents the estimated cost of paid monthly traffic (USD) based on etv and cpc values            learn more about how the metric is calculated in this help center article |[optional]|
**clickstreamEtv** | **Double** | estimated traffic volume based on clickstream data            calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for            to retrieve results for this field, the parameter include_clickstream_data must be set to true            learn more about how the metric is calculated in this help center article |[optional]|
**rankChanges** | **RankChanges** | changes in rankings            contains information about the ranking changes of the SERP element since the previous_updated_time |[optional]|
**backlinksInfo** | **BacklinksInfo** | backlinks information for the ranked website |[optional]|
**rankInfo** | **RankInfo** | page and domain rank information |[optional]|
# DataLabsFeaturedSnippetSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | domain in SERP |[optional]|
**title** | **String** | title of the result in SERP |[optional]|
**featuredTitle** | **String** | title of a given element |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**url** | **String** | sitelink URL |[optional]|
**table** | **Table** | table element |[optional]|
**mainDomain** | **String** | primary domain name in SERP |[optional]|
**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |[optional]|
**etv** | **Double** | estimated traffic volume<br>estimated organic monthly traffic a featured URL delivers to the domain<br>calculated as the product of CTR (click-through-rate) and search volume values of the returned keyword<br>learn more about how the metric is calculated in this help center article |[optional]|
**estimatedPaidTrafficCost** | **Double** | estimated cost of converting organic search traffic into paid<br>represents the estimated monthly cost of running ads for the returned keyword<br>the metric is calculated as the product of organic etv and paid cpc values and indicates the cost of driving the estimated volume of monthly organic traffic through PPC advertising in Google Search<br>learn more about how the metric is calculated in this help center article |[optional]|
**clickstreamEtv** | **Double** |  |[optional]|
**rankChanges** | **RankChanges** | changes in rankings<br>ranking changes of the SERP element compared to the preceding month;<br>Note: the changes are calculated even if the preceding month is not included in a POST request |[optional]|
**backlinksInfo** | **BacklinksInfo** | backlinks information for the ranked website |[optional]|
**rankInfo** | **RankInfo** | page and domain rank information |[optional]|
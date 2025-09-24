# DataLabsLocalPackSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | title of the result in SERP |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**domain** | **String** | domain in SERP of the Ad element |[optional]|
**phone** | **String** | phone number |[optional]|
**url** | **String** | result’s URL |[optional]|
**isPaid** | **Boolean** | indicates whether the element is an ad |[optional]|
**rating** | **RatingElement** | the item’s rating <br>the popularity rate based on reviews and displayed in SERP |[optional]|
**mainDomain** | **String** | primary domain name in SERP |[optional]|
**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |[optional]|
**etv** | **Double** | estimated traffic volume<br>estimated organic monthly traffic to the domain<br>calculated as the product of CTR (click-through-rate) and search volume values of the returned keyword<br>learn more about how the metric is calculated in this help center article |[optional]|
**estimatedPaidTrafficCost** | **Double** | estimated cost of paid monthly search traffic<br>represents the estimated cost of paid monthly traffic (USD) based on etv and cpc values<br>learn more about how the metric is calculated in this help center article |[optional]|
**clickstreamEtv** | **Double** | estimated traffic volume based on clickstream data<br>calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for<br>to retrieve results for this field, the parameter include_clickstream_data must be set to true<br>learn more about how the metric is calculated in this help center article |[optional]|
**rankChanges** | **RankChanges** | changes in rankings<br>contains information about the ranking changes of the SERP element since the previous_updated_time |[optional]|
**backlinksInfo** | **BacklinksInfo** | backlinks information for the ranked website |[optional]|
**rankInfo** | **RankInfo** | page and domain rank information |[optional]|
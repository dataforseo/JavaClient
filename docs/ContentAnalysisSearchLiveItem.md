[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# ContentAnalysisSearchLiveItem

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**url** | **String** | URL where the citation was found |  [optional] |
|**domain** | **String** | domain name |  [optional] |
|**mainDomain** | **String** | main domain |  [optional] |
|**urlRank** | **Integer** | rank of the url this value is based on backlink data for the given URL from DataForSEO Backlink Index; url_rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm learn more about the metric and how it is calculated in this help center article |  [optional] |
|**spamScore** | **String** | backlink spam score of the url this value is based on backlink data for the given URL from DataForSEO Backlink Index; learn more about how the metric is calculated on this help center page |  [optional] |
|**domainRank** | **String** | rank of the domain this value is based on backlink data for the given domain from DataForSEO Backlink Index; domain_rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm learn more about the metric and how it is calculated in this help center article |  [optional] |
|**fetchTime** | **String** | date and time when our crawler visited the page in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2017-01-24 13:20:59 +00:00 |  [optional] |
|**country** | **String** | country code of the domain registration to obtain a full list of available countries, refer to the Locations endpoint |  [optional] |
|**language** | **String** | main language of the domain to obtain a full list of available languages, refer to the Languages endpoint |  [optional] |
|**score** | **String** | citation prominence score this value is based on url_rank, domain_rank, keyword presence in title, main_title, url, snippet the higher the score, the more value the related citation has |  [optional] |
|**pageCategory** | **List&lt;Integer&gt;** | contains all relevant page categories product and service categories relevant for the page to obtain a full list of available categories, refer to the Categories endpoint |  [optional] |
|**pageTypes** | **List&lt;String&gt;** | page types |  [optional] |
|**ratings** | **Object** | ratings found on the page all ratings found on the page based on microdata |  [optional] |
|**socialMetrics** | [**List&lt;SocialMetricsInfo&gt;**](SocialMetricsInfo.md) | social media engagement metrics data on social media interactions associated with the content based on website embeds developed and supported by social media platforms |  [optional] |
|**contentInfo** | [**AnalysisContentInfo**](AnalysisContentInfo.md) |  |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
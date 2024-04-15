

# OrganicDataforseoLabsSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**rankGroup** | **Integer** | position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**domain** | **String** | subdomain in SERP |  [optional] |
|**title** | **String** | title of the result in SERP |  [optional] |
|**url** | **String** | relevant URL in SERP |  [optional] |
|**breadcrumb** | **String** | breadcrumb in SERP |  [optional] |
|**websiteName** | **String** | relevant website name in SERP |  [optional] |
|**isImage** | **Boolean** | indicates whether the element contains an image |  [optional] |
|**isVideo** | **Boolean** | indicates whether the element contains a video |  [optional] |
|**isFeaturedSnippet** | **Boolean** | indicates whether the element is a featured_snippet |  [optional] |
|**isMalicious** | **Boolean** | indicates whether the element is marked as malicious |  [optional] |
|**description** | **String** | description of the results element in SERP |  [optional] |
|**preSnippet** | **String** | includes additional information appended before the result description in SERP |  [optional] |
|**extendedSnippet** | **String** | includes additional information appended after the result description in SERP |  [optional] |
|**ampVersion** | **Boolean** | Accelerated Mobile Pages indicates whether an item has the Accelerated Mobile Page (AMP) version |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**highlighted** | **List&lt;String&gt;** | words highlighted in bold within the results description |  [optional] |
|**links** | **Object** | sitelinks the links shown below some of Google’s search results if there are none, equals null |  [optional] |
|**aboutThisResult** | **Object** | contains information from the ‘About this result’ panel ‘About this result’ panel provides additional context about why Google returned this result for the given query; this feature appears after clicking on the three dots next to most results |  [optional] |
|**mainDomain** | **String** | primary domain name in SERP |  [optional] |
|**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |  [optional] |
|**etv** | **Float** | estimated traffic volume estimated paid monthly traffic to the domain calculated as the product of CTR (click-through-rate) and search volume values of all keywords in the category that the domain ranks for learn more about how the metric is calculated in this help center article |  [optional] |
|**impressionsEtv** | **Float** | estimated traffic volume based on impressions estimated paid monthly traffic to the domain calculated as the product of CTR (click-through-rate) and impressions values of all keywords in the category that the domain ranks for learn more about how the metric is calculated in this help center article |  [optional] |
|**estimatedPaidTrafficCost** | **Float** | estimated cost of monthly search traffic represents the estimated cost of paid monthly traffic (USD) based on etv and cpc values of all keywords in the category that the domain ranks for learn more about how the metric is calculated in this help center article |  [optional] |
|**rankChanges** | [**RankChanges**](RankChanges.md) |  |  [optional] |
|**backlinksInfo** | [**BacklinksInfo**](BacklinksInfo.md) |  |  [optional] |
|**rankInfo** | [**RankInfo**](RankInfo.md) |  |  [optional] |




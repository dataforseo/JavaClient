# DataLabsPaidSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | title of the result in SERP |[optional]|
**domain** | **String** | subdomain in SERP |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**breadcrumb** | **String** | breadcrumb in SERP |[optional]|
**url** | **String** | relevant URL in SERP |[optional]|
**checks** | **List<String>** | array of properties detected for the SERP elementlists the properties that are true for this elementeach value in the array represents a detected property example:if is_image is present in the array, the element contains an imagepossible values in the array:is_image, is_video, is_featured_snippet, amp_version, is_malicious, is_web_story, is_highly_citedequals null if none of the properties are detected for the elementlearn more about the checks array in this Help Center article |[optional]|
**highlighted** | **List<String>** | words highlighted in bold within the results description |[optional]|
**extra** | **Map<String, String>** |  |[optional]|
**descriptionRows** | **List<String>** | extended description            if there is none, equals null |[optional]|
**links** | **List<AdLinkElement>** | sitelinks            the links shown below some of Google's search results            if there are none, equals null |[optional]|
**mainDomain** | **String** | primary domain name in SERP |[optional]|
**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |[optional]|
**etv** | **Double** | estimated traffic volume            estimated organic monthly traffic to the domain            calculated as the product of CTR (click-through-rate) and search volume values of the returned keyword            learn more about how the metric is calculated in this help center article |[optional]|
**estimatedPaidTrafficCost** | **Double** | estimated cost of paid monthly search traffic            represents the estimated cost of paid monthly traffic (USD) based on etv and cpc values            learn more about how the metric is calculated in this help center article |[optional]|
**clickstreamEtv** | **Double** | estimated traffic volume based on clickstream data            calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for            to retrieve results for this field, the parameter include_clickstream_data must be set to true            learn more about how the metric is calculated in this help center article |[optional]|
**rankChanges** | **RankChanges** | changes in rankings            contains information about the ranking changes of the SERP element since the previous_updated_time |[optional]|
**backlinksInfo** | **BacklinksInfo** | backlinks information for the ranked website |[optional]|
**rankInfo** | **RankInfo** | page and domain rank information |[optional]|
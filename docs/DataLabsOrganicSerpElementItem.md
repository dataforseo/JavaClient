# DataLabsOrganicSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | domain in SERP |[optional]|
**title** | **String** | title of the result in SERP |[optional]|
**url** | **String** | sitelink URL |[optional]|
**breadcrumb** | **String** | breadcrumb in SERP |[optional]|
**websiteName** | **String** | name of the website in SERP |[optional]|
**isImage** | **Boolean** | indicates whether the element contains an image |[optional]|
**isVideo** | **Boolean** | indicates whether the element contains a video |[optional]|
**isFeaturedSnippet** | **Boolean** | indicates whether the element is a featured_snippet |[optional]|
**isMalicious** | **Boolean** | indicates whether the element is marked as malicious |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**preSnippet** | **String** | includes additional information appended before the result description in SERP |[optional]|
**extendedSnippet** | **String** | includes additional information appended after the result description in SERP |[optional]|
**ampVersion** | **Boolean** | Accelerated Mobile Pages<br>indicates whether an item has the Accelerated Mobile Page (AMP) version |[optional]|
**rating** | **RatingElement** | the item’s rating <br>the popularity rate based on reviews and displayed in SERP |[optional]|
**highlighted** | **List<String>** | words highlighted in bold within the results description |[optional]|
**links** | **List<LinkElement>** | sitelinks<br>the links shown below some of Google’s search results<br>if there are none, equals null |[optional]|
**aboutThisResult** | **AboutThisResultElement** | contains information from the ‘About this result’ panel<br>‘About this result’ panel provides additional context about why Google returned this result for the given query;<br>this feature appears after clicking on the three dots next to most results |[optional]|
**mainDomain** | **String** | primary domain name in SERP |[optional]|
**relativeUrl** | **String** | URL in SERP that does not specify the HTTPs protocol and domain name |[optional]|
**etv** | **Double** | estimated traffic volume<br>estimated organic monthly traffic a featured URL delivers to the domain<br>calculated as the product of CTR (click-through-rate) and search volume values of the returned keyword<br>learn more about how the metric is calculated in this help center article |[optional]|
**estimatedPaidTrafficCost** | **Double** | estimated cost of converting organic search traffic into paid<br>represents the estimated monthly cost of running ads for the returned keyword<br>the metric is calculated as the product of organic etv and paid cpc values and indicates the cost of driving the estimated volume of monthly organic traffic through PPC advertising in Google Search<br>learn more about how the metric is calculated in this help center article |[optional]|
**clickstreamEtv** | **Double** |  |[optional]|
**rankChanges** | **RankChanges** | changes in rankings<br>ranking changes of the SERP element compared to the preceding month;<br>Note: the changes are calculated even if the preceding month is not included in a POST request |[optional]|
**backlinksInfo** | **BacklinksInfo** | backlinks information for the ranked website |[optional]|
**rankInfo** | **RankInfo** | page and domain rank information |[optional]|
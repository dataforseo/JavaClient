

# BacklinksBulkPagesSummaryLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**url** | **String** | page URL |  [optional] |
|**rank** | **Integer** | page rank rank of the page on the target website rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm learn more about the metric and how it is calculated in this help center article |  [optional] |
|**mainDomainRank** | **Integer** | rank of the main domain rank of the main domain is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm learn more about the metric and how it is calculated in this help center article |  [optional] |
|**backlinks** | **Long** | number of backlinks |  [optional] |
|**firstSeen** | **String** | date and time when our crawler found a backlink to this page for the first time in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**lostDate** | **String** | date and time when the last backlink to this page was lost indicates the date and time when our crawler visited the page and it responded with 4xx or 5xx status code or the last backlink was removed in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2017-01-24 13:20:59 +00:00 |  [optional] |
|**backlinksSpamScore** | **Long** | average spam score of the backlinks pointing to the page learn more about how the metric is calculated on this help center page |  [optional] |
|**brokenBacklinks** | **Long** | number of broken backlinks number of broken backlinks pointing to the page |  [optional] |
|**brokenPages** | **Integer** | number of broken pages number of pages that respond with 4xx or 5xx status codes where backlinks are pointing to |  [optional] |
|**referringDomains** | **Long** | indicates the number domains referring to the page |  [optional] |
|**referringDomainsNofollow** | **Long** | number of domains pointing at least one nofollow link to the target |  [optional] |
|**referringMainDomains** | **Long** | indicates the number of referring main domains |  [optional] |
|**referringMainDomainsNofollow** | **Long** | number of main domains pointing at least one nofollow link to the target |  [optional] |
|**referringIps** | **Long** | number of referring IP addresses number of IP addresses pointing to this page |  [optional] |
|**referringSubnets** | **Long** | number of referring subnetworks |  [optional] |
|**referringPages** | **Long** | indicates the number of pages pointing to the relevant url |  [optional] |
|**referringPagesNofollow** | **Long** | number of referring pages pointing at least one nofollow link to the target |  [optional] |
|**referringLinksTld** | **Map&lt;String, Long&gt;** |  |  [optional] |
|**referringLinksTypes** | **Map&lt;String, Long&gt;** |  |  [optional] |
|**referringLinksAttributes** | **Map&lt;String, Long&gt;** |  |  [optional] |
|**referringLinksPlatformTypes** | **Map&lt;String, Long&gt;** |  |  [optional] |
|**referringLinksSemanticLocations** | **Map&lt;String, Long&gt;** |  |  [optional] |
|**referringLinksCountries** | **Map&lt;String, Long&gt;** |  |  [optional] |



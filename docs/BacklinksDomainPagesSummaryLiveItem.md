

# BacklinksDomainPagesSummaryLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**url** | **String** | page URL |  [optional] |
|**rank** | **BigDecimal** | page rank rank of the page rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm learn more about the metric and how it is calculated in this help center article |  [optional] |
|**backlinks** | **BigDecimal** | number of backlinks |  [optional] |
|**firstSeen** | **String** | date and time when our crawler found a backlink to this page for the first time in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**lostDate** | **String** | date and time when the last backlink to this page was lost indicates the date and time when our crawler visited the page and it responded with 4xx or 5xx status code or the last backlink was removed in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2017-01-24 13:20:59 +00:00 |  [optional] |
|**backlinksSpamScore** | **BigDecimal** | average spam score of the backlinks pointing to the page learn more about how the metric is calculated on this help center page |  [optional] |
|**brokenBacklinks** | **BigDecimal** | number of broken backlinks number of broken backlinks pointing to the page |  [optional] |
|**brokenPages** | **BigDecimal** | number of broken pages number of pages that respond with 4xx or 5xx status codes where backlinks are pointing to |  [optional] |
|**referringDomains** | **BigDecimal** | indicates the number domains referring to the page |  [optional] |
|**referringDomainsNofollow** | **BigDecimal** | number of domains pointing at least one nofollow link to the page |  [optional] |
|**referringMainDomains** | **BigDecimal** | indicates the number of referring main domains |  [optional] |
|**referringMainDomainsNofollow** | **Long** | number of main domains pointing at least one nofollow link to the page |  [optional] |
|**referringIps** | **BigDecimal** | number of referring IP addresses number of IP addresses pointing to this page |  [optional] |
|**referringSubnets** | **BigDecimal** | number of referring subnetworks |  [optional] |
|**referringPages** | **BigDecimal** | indicates the number of pages pointing to the relevant url |  [optional] |
|**referringPagesNofollow** | **BigDecimal** | number of referring pages pointing at least one nofollow link to the page |  [optional] |
|**referringLinksTld** | **Map&lt;String, Long&gt;** | top-level domains of the referring links contains top level domains and referring link count per each |  [optional] |
|**referringLinksTypes** | **Map&lt;String, Long&gt;** | types of referring links indicates the types of the referring links and link count per each type possible values: anchor, image, link, meta, canonical, alternate, redirect |  [optional] |
|**referringLinksAttributes** | **Map&lt;String, Long&gt;** | link attributes of the referring links indicates link attributes of the referring links and link count per each attribute |  [optional] |
|**referringLinksPlatformTypes** | **Map&lt;String, Long&gt;** | types of referring platforms indicates referring platform types and and link count per each platform possible values: cms, blogs, ecommerce, message-boards, wikis, news, organization |  [optional] |
|**referringLinksSemanticLocations** | **Map&lt;String, Long&gt;** | semantic locations of the referring links indicates semantic elements in HTML where the referring links are located and link count per each semantic location you can get the full list of semantic elements here examples: article, section, footer |  [optional] |
|**referringLinksCountries** | **Map&lt;String, Long&gt;** | ISO country codes of the referring links indicates ISO country codes of the domains where the referring links are located and the link count per each country |  [optional] |




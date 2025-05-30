

# BacklinksSummaryLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **String** | target in a POST array |  [optional] |
|**firstSeen** | **String** | date and time when our crawler found the backlink for the target for the first time in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**lostDate** | **String** | date and time when the backlink was lost indicates the date and time when our crawler visited the target and it responded with a 4xx or 5xx status code or when its last backlink was removed in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**rank** | **BigDecimal** | target rank learn more about the metric and how it is calculated in this help center article |  [optional] |
|**backlinks** | **BigDecimal** | indicates the number of backlinks |  [optional] |
|**backlinksSpamScore** | **BigDecimal** | spam score of the backlinks displays the total spam score of all backlinks pointing to the target domain, subdomain, or webpage; to learn more about how the metric is calculated, refer to this Help Center page |  [optional] |
|**crawledPages** | **BigDecimal** | number of crawled pages for the target |  [optional] |
|**info** | [**TargetInfo**](TargetInfo.md) |  |  [optional] |
|**internalLinksCount** | **BigDecimal** | number of internal links calculated as the sum of internal links on the pages of the specified target |  [optional] |
|**externalLinksCount** | **BigDecimal** | number of external links on the page calculated as the sum of external links on the pages of the specified target |  [optional] |
|**brokenBacklinks** | **BigDecimal** | number of broken backlinks number of broken backlinks pointing to the target |  [optional] |
|**brokenPages** | **BigDecimal** | number of broken pages number of pages on the target that respond with 4xx or 5xx status codes note that the number of broken pages includes pages on the target discovered by following external links, but it may also include pages discovered by following the target’s sitemap |  [optional] |
|**referringDomains** | **BigDecimal** | indicates the number of referring domains referring domains include subdomains that are counted as separate domains for this metric |  [optional] |
|**referringDomainsNofollow** | **BigDecimal** | number of domains pointing at least one nofollow link to the target |  [optional] |
|**referringMainDomains** | **BigDecimal** | indicates the number of referring main domains |  [optional] |
|**referringMainDomainsNofollow** | **Long** | number of main domains pointing at least one nofollow link to the target |  [optional] |
|**referringIps** | **BigDecimal** | number of referring IP addresses number of IP addresses pointing to this page |  [optional] |
|**referringSubnets** | **BigDecimal** | number of referring subnetworks |  [optional] |
|**referringPages** | **BigDecimal** | indicates the number of pages pointing to the target |  [optional] |
|**referringPagesNofollow** | **BigDecimal** | number of referring pages pointing at least one nofollow link to the target |  [optional] |
|**referringLinksTld** | **Map&lt;String, Long&gt;** | top-level domains of the referring links contains top level domains and referring link count per each |  [optional] |
|**referringLinksTypes** | **Map&lt;String, Long&gt;** | types of referring links indicates the types of the referring links and link count per each type possible values: anchor, image, link, meta, canonical, alternate, redirect |  [optional] |
|**referringLinksAttributes** | **Map&lt;String, Long&gt;** | link attributes of the referring links indicates link attributes of the referring links and link count per each attribute example values: nofollow, noopener, noreferrer, external, ugc, sponsored |  [optional] |
|**referringLinksPlatformTypes** | **Map&lt;String, Long&gt;** | types of referring platforms indicates referring platform types and and link count per each platform possible values: cms, blogs, ecommerce, message-boards, wikis, news, organization |  [optional] |
|**referringLinksSemanticLocations** | **Map&lt;String, Long&gt;** | semantic locations of the referring links indicates semantic elements in HTML where the referring links are located and link count per each semantic location you can get the full list of semantic elements here example values: article, section, summary, \&quot;\&quot; |  [optional] |
|**referringLinksCountries** | **Map&lt;String, Long&gt;** | ISO country codes of the referring links indicates ISO country codes of the domains where the referring links are located and the link count per each country |  [optional] |




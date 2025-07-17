# BacklinksSummaryLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**target** | **String** | target in a POST array |[optional]|
**firstSeen** | **String** | date and time when our crawler found the backlink for the target for the first time<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**lostDate** | **String** | date and time when the backlink was lost<br>indicates the date and time when our crawler visited the target and it responded with a 4xx or 5xx status code or when its last backlink was removed<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**rank** | **Integer** | target rank<br>learn more about the metric and how it is calculated in this help center article |[optional]|
**backlinks** | **Long** | indicates the number of backlinks |[optional]|
**backlinksSpamScore** | **Long** | spam score of the backlinks<br>displays the total spam score of all backlinks pointing to the target domain, subdomain, or webpage;<br>to learn more about how the metric is calculated, refer to this Help Center page |[optional]|
**crawledPages** | **Integer** | number of crawled pages for the target |[optional]|
**info** | **TargetInfo** | information about the target |[optional]|
**internalLinksCount** | **Long** | number of internal links<br>calculated as the sum of internal links on the pages of the specified target |[optional]|
**externalLinksCount** | **Long** | number of external links on the page<br>calculated as the sum of external links on the pages of the specified target |[optional]|
**brokenBacklinks** | **Long** | number of broken backlinks<br>number of broken backlinks pointing to the target |[optional]|
**brokenPages** | **Integer** | number of broken pages<br>number of pages on the target that respond with 4xx or 5xx status codes<br>note that the number of broken pages includes pages on the target discovered by following external links, but it may also include pages discovered by following the target’s sitemap |[optional]|
**referringDomains** | **Long** | indicates the number of referring domains<br>referring domains include subdomains that are counted as separate domains for this metric |[optional]|
**referringDomainsNofollow** | **Long** | number of domains pointing at least one nofollow link to the target |[optional]|
**referringMainDomains** | **Long** | indicates the number of referring main domains |[optional]|
**referringMainDomainsNofollow** | **Long** | number of main domains pointing at least one nofollow link to the target |[optional]|
**referringIps** | **Long** | number of referring IP addresses<br>number of IP addresses pointing to this page |[optional]|
**referringSubnets** | **Long** | number of referring subnetworks |[optional]|
**referringPages** | **Long** | indicates the number of pages pointing to the target |[optional]|
**referringPagesNofollow** | **Long** | number of referring pages pointing at least one nofollow link to the target |[optional]|
**referringLinksTld** | **Map<String, Long>** | top-level domains of the referring links<br>contains top level domains and referring link count per each |[optional]|
**referringLinksTypes** | **Map<String, Long>** | types of referring links<br>indicates the types of the referring links and link count per each type<br>possible values:<br>anchor, image, link, meta, canonical, alternate, redirect |[optional]|
**referringLinksAttributes** | **Map<String, Long>** | link attributes of the referring links<br>indicates link attributes of the referring links and link count per each attribute<br>example values:<br>nofollow, noopener, noreferrer, external, ugc, sponsored |[optional]|
**referringLinksPlatformTypes** | **Map<String, Long>** | types of referring platforms<br>indicates referring platform types and and link count per each platform<br>possible values: cms, blogs, ecommerce, message-boards, wikis, news, organization |[optional]|
**referringLinksSemanticLocations** | **Map<String, Long>** | semantic locations of the referring links<br>indicates semantic elements in HTML where the referring links are located and link count per each semantic location<br>you can get the full list of semantic elements here<br>example values:<br>article, section, summary, '' |[optional]|
**referringLinksCountries** | **Map<String, Long>** | ISO country codes of the referring links<br>indicates ISO country codes of the domains where the referring links are located and the link count per each country |[optional]|
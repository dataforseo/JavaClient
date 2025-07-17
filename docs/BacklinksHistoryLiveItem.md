# BacklinksHistoryLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**date** | **String** | date and time when the data for the target was stored<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**rank** | **Integer** | domain rank on the given date<br>learn more about the metric and how it is calculated in this help center article |[optional]|
**backlinks** | **Long** | number of backlinks |[optional]|
**newBacklinks** | **Long** | number of new backlinks for the target<br>data is provided based in a comparison with the previous period<br>Note: this data is available from May 2021;<br>if the date range specified in the POST request precedes May 2021, the field will equal 0 |[optional]|
**lostBacklinks** | **Long** | number of lost backlinks for the target<br>data is provided based in a comparison with the previous period<br>Note: this data is available from May 2021;<br>if the date range specified in the POST request precedes May 2021, the field will equal 0 |[optional]|
**newReferringDomains** | **Long** | number of new referring domains for the target<br>data is provided based in a comparison with the previous period<br>Note: this data is available from May 2021;<br>if the date range specified in the POST request precedes May 2021, the field will equal 0 |[optional]|
**lostReferringDomains** | **Long** | number of lost referring domains for the target<br>data is provided based in a comparison with the previous period<br>Note: this data is available from May 2021;<br>if the date range specified in the POST request precedes May 2021, the field will equal 0 |[optional]|
**crawledPages** | **Integer** | number of crawled pages for the target |[optional]|
**info** | **TargetInfo** | information about the target |[optional]|
**internalLinksCount** | **Long** | number of internal links<br>calculated as the sum of internal links on the pages of the specified target |[optional]|
**externalLinksCount** | **Long** | number of external links on the page<br>calculated as the sum of external links on the pages of the specified target |[optional]|
**brokenBacklinks** | **Long** | number of broken backlinks<br>number of broken backlinks pointing to the target |[optional]|
**brokenPages** | **Integer** | number of broken pages<br>number of pages that receive backlinks but respond with 4xx or 5xx status codes |[optional]|
**referringDomains** | **Long** | number of referring domains<br>referring domains include subdomains that are counted as separate domains for this metric |[optional]|
**referringDomainsNofollow** | **Long** | number of domains pointing at least one nofollow link to the target |[optional]|
**referringMainDomains** | **Long** | number of referring main domains |[optional]|
**referringMainDomainsNofollow** | **Long** | number of main domains pointing at least one nofollow link to the target |[optional]|
**referringIps** | **Long** | number of referring IP addresses<br>number of IP addresses pointing to this page |[optional]|
**referringSubnets** | **Long** | number of referring subnetworks |[optional]|
**referringPages** | **Long** | number of pages pointing to the target |[optional]|
**referringPagesNofollow** | **Long** | number of referring pages pointing at least one nofollow link to the target |[optional]|
**referringLinksTld** | **Map<String, Long>** | top-level domains of the referring links<br>contains top-level domains and referring link count per each |[optional]|
**referringLinksTypes** | **Map<String, Long>** | types of referring links<br>indicates the types of the referring links and link count per each type<br>possible values:<br>anchor, image, link, meta, canonical, alternate, redirect |[optional]|
**referringLinksAttributes** | **Map<String, Long>** | link attributes of the referring links<br>indicates link attributes of the referring links and link count per each attribute |[optional]|
**referringLinksPlatformTypes** | **Map<String, Long>** | types of referring platforms<br>indicates referring platform types and and link count per each platform<br>possible values: cms, blogs, ecommerce, message-boards, wikis, news, organization |[optional]|
**referringLinksSemanticLocations** | **Map<String, Long>** | semantic locations of the referring links<br>indicates semantic elements in HTML where the referring links are located and link count per each semantic location<br>you can get the full list of semantic elements here<br>examples:<br>article, section, summary |[optional]|
**referringLinksCountries** | **Map<String, Long>** | ISO country codes of the referring links<br>indicates ISO country codes of the domains where the referring links are located and the link count per each country |[optional]|
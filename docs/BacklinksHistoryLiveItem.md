

# BacklinksHistoryLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**date** | **String** | date and time when the data for the target was stored in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**rank** | **Integer** | domain rank on the given date learn more about the metric and how it is calculated in this help center article |  [optional] |
|**backlinks** | **Long** | number of backlinks |  [optional] |
|**newBacklinks** | **Long** | number of new backlinks for the target data is provided based in a comparison with the previous period Note: this data is available from May 2021; if the date range specified in the POST request precedes May 2021, the field will equal 0 |  [optional] |
|**lostBacklinks** | **Long** | number of lost backlinks for the target data is provided based in a comparison with the previous period Note: this data is available from May 2021; if the date range specified in the POST request precedes May 2021, the field will equal 0 |  [optional] |
|**newReferringDomains** | **Long** | number of new referring domains for the target data is provided based in a comparison with the previous period Note: this data is available from May 2021; if the date range specified in the POST request precedes May 2021, the field will equal 0 |  [optional] |
|**lostReferringDomains** | **Long** | number of lost referring domains for the target data is provided based in a comparison with the previous period Note: this data is available from May 2021; if the date range specified in the POST request precedes May 2021, the field will equal 0 |  [optional] |
|**crawledPages** | **Integer** | number of crawled pages for the target |  [optional] |
|**info** | [**TargetInfo**](TargetInfo.md) |  |  [optional] |
|**internalLinksCount** | **Long** | number of internal links calculated as the sum of internal links on the pages of the specified target |  [optional] |
|**externalLinksCount** | **Long** | number of external links on the page calculated as the sum of external links on the pages of the specified target |  [optional] |
|**brokenBacklinks** | **Long** | number of broken backlinks number of broken backlinks pointing to the target |  [optional] |
|**brokenPages** | **Integer** | number of broken pages number of pages that receive backlinks but respond with 4xx or 5xx status codes |  [optional] |
|**referringDomains** | **Long** | number of referring domains referring domains include subdomains that are counted as separate domains for this metric |  [optional] |
|**referringDomainsNofollow** | **Long** | number of domains pointing at least one nofollow link to the target |  [optional] |
|**referringMainDomains** | **Long** | number of referring main domains |  [optional] |
|**referringMainDomainsNofollow** | **Long** | number of main domains pointing at least one nofollow link to the target |  [optional] |
|**referringIps** | **Long** | number of referring IP addresses number of IP addresses pointing to this page |  [optional] |
|**referringSubnets** | **Long** | number of referring subnetworks |  [optional] |
|**referringPages** | **Long** | number of pages pointing to the target |  [optional] |
|**referringPagesNofollow** | **Long** | number of referring pages pointing at least one nofollow link to the target |  [optional] |
|**referringLinksTld** | **Map&lt;String, Long&gt;** | top-level domains of the referring links contains top-level domains and referring link count per each |  [optional] |
|**referringLinksTypes** | **Map&lt;String, Long&gt;** | types of referring links indicates the types of the referring links and link count per each type possible values: anchor, image, link, meta, canonical, alternate, redirect |  [optional] |
|**referringLinksAttributes** | **Map&lt;String, Long&gt;** | link attributes of the referring links indicates link attributes of the referring links and link count per each attribute |  [optional] |
|**referringLinksPlatformTypes** | **Map&lt;String, Long&gt;** | types of referring platforms indicates referring platform types and and link count per each platform |  [optional] |
|**referringLinksSemanticLocations** | **Map&lt;String, Long&gt;** | semantic locations of the referring links indicates semantic elements in HTML where the referring links are located and link count per each semantic location you can get the full list of semantic elements here examples: article, section, summary |  [optional] |
|**referringLinksCountries** | **Map&lt;String, Long&gt;** | ISO country codes of the referring links indicates ISO country codes of the domains where the referring links are located and the link count per each country |  [optional] |




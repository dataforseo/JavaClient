

# BacklinksDomainIntersection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**target** | **String** | domain that links to the corresponding target from the POST array |  [optional] |
|**rank** | **BigDecimal** | rank referred to the target from the POST array indicates the rank that the referring domain (target above) refers to your target from the POST array; rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm learn more about the metric and how it is calculated in this help center article |  [optional] |
|**backlinks** | **BigDecimal** | indicates the number of backlinks |  [optional] |
|**firstSeen** | **String** | date and time when our crawler found the backlink from this target for the first time in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**lostDate** | **String** | date and time when the last backlink from this target was lost indicates the date and time when our crawler visited the page and it responded with 4xx or 5xx status code or the last backlink was removed in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**backlinksSpamScore** | **BigDecimal** | average spam score of the backlinks pointing to the target learn more about how the metric is calculated on this help center page |  [optional] |
|**brokenBacklinks** | **BigDecimal** | number of broken backlinks |  [optional] |
|**brokenPages** | **BigDecimal** | number of broken pages |  [optional] |
|**referringDomains** | **BigDecimal** | number of referring domains |  [optional] |
|**referringDomainsNofollow** | **BigDecimal** | number of domains pointing at least one nofollow link to the corresponding target |  [optional] |
|**referringMainDomains** | **BigDecimal** | number of referring main domains |  [optional] |
|**referringMainDomainsNofollow** | **BigDecimal** | number of main domains pointing at least one nofollow link to the target |  [optional] |
|**referringIps** | **BigDecimal** | number of referring IP addresses |  [optional] |
|**referringSubnets** | **BigDecimal** | number of referring subnetworks |  [optional] |
|**referringPages** | **BigDecimal** | indicates the number of pages pointing to the target |  [optional] |
|**referringPagesNofollow** | **BigDecimal** | number of referring pages pointing at least one nofollow link to the target |  [optional] |
|**referringLinksTld** | **Map&lt;String, BigDecimal&gt;** | top level domains of the referring links contains top-level domains and referring link count per each |  [optional] |
|**referringLinksTypes** | **Map&lt;String, BigDecimal&gt;** | types of the referring links indicates the types of referring links and link count per each type possible values: anchor, image, link, meta, canonical, alternate, redirect |  [optional] |
|**referringLinksAttributes** | **Map&lt;String, BigDecimal&gt;** | link attributes of the referring links indicates link attributes of the referring links and the link count per each attribute |  [optional] |
|**referringLinksPlatformTypes** | **Map&lt;String, BigDecimal&gt;** | types of referring platforms indicates referring platform types and link count per each platform possible values: cms, blogs, ecommerce, message-boards, wikis, news, organization |  [optional] |
|**referringLinksSemanticLocations** | **Map&lt;String, BigDecimal&gt;** | semantic locations of the referring links indicates semantic elements in HTML where the referring links are located and the link count per each semantic location you can get the full list of semantic elements here |  [optional] |
|**referringLinksCountries** | **Object** | ISO country codes of the referring links indicates ISO country codes of the domains where the referring links are located and the link count per each country |  [optional] |




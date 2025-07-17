# BacklinksDomainIntersection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**target** | **String** | domain that links to the corresponding target from the POST array |[optional]|
**rank** | **Integer** | rank referred to the target from the POST array<br>indicates the rank that the referring domain (target above) refers to your target from the POST array;<br>rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm<br>learn more about the metric and how it is calculated in this help center article |[optional]|
**backlinks** | **Long** | indicates the number of backlinks |[optional]|
**firstSeen** | **String** | date and time when our crawler found the backlink from this target for the first time<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**lostDate** | **String** | date and time when the last backlink from this target was lost<br>indicates the date and time when our crawler visited the page and it responded with 4xx or 5xx status code or the last backlink was removed<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**backlinksSpamScore** | **Long** | average spam score of the backlinks pointing to the target<br>learn more about how the metric is calculated on this help center page |[optional]|
**brokenBacklinks** | **Long** | number of broken backlinks |[optional]|
**brokenPages** | **Integer** | number of broken pages |[optional]|
**referringDomains** | **Long** | number of referring domains |[optional]|
**referringDomainsNofollow** | **Long** | number of domains pointing at least one nofollow link to the corresponding target |[optional]|
**referringMainDomains** | **Long** | number of referring main domains |[optional]|
**referringMainDomainsNofollow** | **Long** | number of main domains pointing at least one nofollow link to the target |[optional]|
**referringIps** | **Long** | number of referring IP addresses |[optional]|
**referringSubnets** | **Long** | number of referring subnetworks |[optional]|
**referringPages** | **Long** | indicates the number of pages pointing to the target |[optional]|
**referringPagesNofollow** | **Long** | number of referring pages pointing at least one nofollow link to the target |[optional]|
**referringLinksTld** | **Map<String, Integer>** | top level domains of the referring links<br>contains top-level domains and referring link count per each |[optional]|
**referringLinksTypes** | **Map<String, Integer>** | types of the referring links<br>indicates the types of referring links and link count per each type<br>possible values:<br>anchor, image, link, meta, canonical, alternate, redirect |[optional]|
**referringLinksAttributes** | **Map<String, Integer>** | link attributes of the referring links<br>indicates link attributes of the referring links and the link count per each attribute |[optional]|
**referringLinksPlatformTypes** | **Map<String, Integer>** | types of referring platforms<br>indicates referring platform types and link count per each platform<br>possible values: cms, blogs, ecommerce, message-boards, wikis, news, organization |[optional]|
**referringLinksSemanticLocations** | **Map<String, Integer>** | semantic locations of the referring links<br>indicates semantic elements in HTML where the referring links are located and the link count per each semantic location<br>you can get the full list of semantic elements here |[optional]|
**referringLinksCountries** | **Object** | ISO country codes of the referring links<br>indicates ISO country codes of the domains where the referring links are located and the link count per each country |[optional]|
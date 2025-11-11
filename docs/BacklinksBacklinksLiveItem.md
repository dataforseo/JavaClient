# BacklinksBacklinksLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**domainFrom** | **String** | domain referring to the target domain or webpage |[optional]|
**urlFrom** | **String** | URL of the page where the backlink is found |[optional]|
**urlFromHttps** | **Boolean** | indicates whether the referring URL is secured with HTTPS<br>if true, the referring URL is secured with HTTPS |[optional]|
**domainTo** | **String** | domain the backlink is pointing to |[optional]|
**urlTo** | **String** | URL the backlink is pointing to |[optional]|
**urlToHttps** | **Boolean** | indicates if the URL the backlink is pointing to is secured with HTTPS<br>if true, the URL is secured with HTTPS |[optional]|
**tldFrom** | **String** | top-level domain of the referring URL |[optional]|
**isNew** | **Boolean** | indicates whether the backlink is new<br>if true, the backlink was found on the page last time our crawler visited it |[optional]|
**isLost** | **Boolean** | indicates whether the backlink was removed<br>if true, the backlink or the entire page was removed |[optional]|
**backlinkSpamScore** | **Integer** | spam score of the backlink<br>learn more about how the metric is calculated on this help center page |[optional]|
**rank** | **Integer** | backlink rank<br>rank that the given backlink passes to the target<br>rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm<br>learn more about the metric and how it is calculated in this help center article |[optional]|
**pageFromRank** | **Integer** | page rank of the referring page<br>page_from_rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm<br>learn more about the metric and how it is calculated in this help center article |[optional]|
**domainFromRank** | **Integer** | domain rank of the referring domain<br>domain_from_rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm<br>learn more about the metric and how it is calculated in this help center article |[optional]|
**domainFromPlatformType** | **List<String>** | platform types of the referring domain<br>possible values: cms, blogs, ecommerce, message-boards, wikis, news, organization |[optional]|
**domainFromIsIp** | **Boolean** | indicates if the domain is IP<br>if true, the domain functions as an IP address and does not have a domain name |[optional]|
**domainFromIp** | **String** | IP address of the referring domain |[optional]|
**domainFromCountry** | **String** | ISO country code of the referring domain |[optional]|
**pageFromExternalLinks** | **Integer** | number of external links found on the referring page |[optional]|
**pageFromInternalLinks** | **Integer** | number of internal links found on the referring page |[optional]|
**pageFromSize** | **Integer** | size of the referring page, in bytes<br>example:<br>63357 |[optional]|
**pageFromEncoding** | **String** | character encoding of the referring page<br>example:<br>utf-8 |[optional]|
**pageFromLanguage** | **String** | language of the referring page<br>in ISO 639-1 format<br>example:<br>en |[optional]|
**pageFromTitle** | **String** | title of the referring page |[optional]|
**pageFromStatusCode** | **Integer** | HTTP status code returned by the referring page<br>example:<br>200 |[optional]|
**firstSeen** | **String** | date and time when our crawler found the backlink for the first time<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**prevSeen** | **String** | previous to the most recent date when our crawler visited the backlink<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**lastSeen** | **String** | most recent date when our crawler visited the backlink<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**itemType** | **String** | link type<br>possible values:<br>anchor, image, meta, canonical, alternate, redirect |[optional]|
**attributes** | **List<String>** | link attributes of the referring links<br>example:<br>nofollow |[optional]|
**dofollow** | **Boolean** | indicates whether the backlink is dofollow<br>if false, the backlink is nofollow |[optional]|
**original** | **Boolean** | indicates whether the backlink was present on the referring page when our crawler first visited it |[optional]|
**alt** | **String** | alternative text of the image<br>this field will be null if backlink type is not image |[optional]|
**imageUrl** | **String** | URL of the image<br>the URL leading to the image on the original resource or DataForSEO storage (in case the original source is not available) |[optional]|
**anchor** | **String** | anchor text of the backlink |[optional]|
**textPre** | **String** | snippet before the anchor text |[optional]|
**textPost** | **String** | snippet after the anchor text |[optional]|
**semanticLocation** | **String** | indicates semantic element in HTML where the backlink is found<br>you can get the full list of semantic elements here<br>examples:<br>article, section, summary |[optional]|
**linksCount** | **Long** | number of identical backlinks found on the referring page |[optional]|
**groupCount** | **Long** | indicates total number of backlinks from this domain<br>for example, if mode is set to one_per_domain, this field will indicate the total number of backlinks coming from this domain |[optional]|
**isBroken** | **Boolean** | indicates whether the backlink is broken<br>if true, the backlink is pointing to a page responding with a 4xx or 5xx status code |[optional]|
**urlToStatusCode** | **Integer** | status code of the referenced page<br>if the value is null, our crawler hasn’t yet visited the webpage the link is pointing to<br>example:<br>200 |[optional]|
**urlToSpamScore** | **Integer** | spam score of the referenced page<br>if the value is null, our crawler hasn’t yet visited the webpage the link is pointing to;<br>learn more about how the metric is calculated on this help center page |[optional]|
**urlToRedirectTarget** | **String** | target url of the redirect<br>target page the redirect is pointing to |[optional]|
**rankedKeywordsInfo** | **RankedKeywordsInfo** | number of keywords for which the page is ranked in top search results |[optional]|
**isIndirectLink** | **Boolean** | indicates whether the backlink is an indirect link<br>if true, the backlink is an indirect link pointing to a page that either redirects to url_to, or points to a canonical page |[optional]|
**indirectLinkPath** | **List<BacklinksRedirectInfo>** | indirect link path<br>indicates a URL or a sequence of URLs that lead to url_to |[optional]|
# BacklinksBacklinksLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**domainFrom** | **String** | <em>domain referring to the target domain or webpage</em> |[optional]|
**urlFrom** | **String** | <em>URL of the page where the backlink is found</em> |[optional]|
**urlFromHttps** | **Boolean** | <em>indicates whether the referring URL is secured with HTTPS</em><br>if <code>true</code>, the referring URL is secured with HTTPS |[optional]|
**domainTo** | **String** | <em>domain the backlink is pointing to</em> |[optional]|
**urlTo** | **String** | <em>URL the backlink is pointing to</em> |[optional]|
**urlToHttps** | **Boolean** | <em>indicates if the URL the backlink is pointing to is secured with HTTPS</em><br>if <code>true</code>, the URL is secured with HTTPS |[optional]|
**tldFrom** | **String** | <em>top-level domain of the referring URL</em> |[optional]|
**isNew** | **Boolean** | <em>indicates whether the backlink is new</em><br>if <code>true</code>, the backlink was found on the page last time our crawler visited it |[optional]|
**isLost** | **Boolean** | <em>indicates whether the backlink was removed</em><br>if <code>true</code>, the backlink or the entire page was removed |[optional]|
**backlinkSpamScore** | **Integer** | <em>spam score of the backlink</em><br>learn more about how the metric is calculated on <a href='https://dataforseo.com/help-center/what-is-spam-score-and-how-is-it-calculated' rel='noopener noreferrer' target='_blank'>this help center page</a> |[optional]|
**rank** | **Integer** | <em>backlink rank</em><br>rank that the given backlink passes to the <code>target</code><br><code>rank</code> is calculated based on the method for node ranking in a linked database - a principle used in the original Google PageRank algorithm<br>learn more about the metric and how it is calculated in <a href='https://dataforseo.com/help-center/what_is_rank_in_backlinks_api' rel='noopener noreferrer' target='_blank'>this help center article</a> |[optional]|
**pageFromRank** | **Integer** | <em>page rank of the referring page</em><br><code>page_from_rank</code> is calculated based on the method for node ranking in a linked database - a principle used in the original Google PageRank algorithm<br>learn more about the metric and how it is calculated in <a href='https://dataforseo.com/help-center/what_is_rank_in_backlinks_api' rel='noopener noreferrer' target='_blank'>this help center article</a> |[optional]|
**domainFromRank** | **Integer** | <em>domain rank of the referring domain</em><br><code>domain_from_rank</code> is calculated based on the method for node ranking in a linked database - a principle used in the original Google PageRank algorithm<br>learn more about the metric and how it is calculated in <a href='https://dataforseo.com/help-center/what_is_rank_in_backlinks_api' rel='noopener noreferrer' target='_blank'>this help center article</a> |[optional]|
**domainFromPlatformType** | **List<String>** | <em>platform types of the referring domain</em><p>possible values: <code>cms</code>, <code>blogs</code>, <code>ecommerce</code>, <code>message-boards</code>, <code>wikis</code>, <code>news</code>, <code>organization</code> |[optional]|
**domainFromIsIp** | **Boolean** | <em>indicates if the domain is IP</em><br>if <code>true</code>, the domain functions as an IP address and does not have a domain name |[optional]|
**domainFromIp** | **String** | <em>IP address of the referring domain</em> |[optional]|
**domainFromCountry** | **String** | <em>ISO country code of the referring domain</em> |[optional]|
**pageFromExternalLinks** | **Integer** | <em>number of external links found on the referring page</em> |[optional]|
**pageFromInternalLinks** | **Integer** | <em>number of internal links found on the referring page</em> |[optional]|
**pageFromSize** | **Integer** | <em>size of the referring page, in bytes</em><br>example:<br><code>63357</code> |[optional]|
**pageFromEncoding** | **String** | <em>character encoding of the referring page</em><br>example:<br><code>utf-8</code> |[optional]|
**pageFromLanguage** | **String** | <em>language of the referring page</em><br>in ISO 639-1 format<br>example:<br><code>en</code> |[optional]|
**pageFromTitle** | **String** | <em>title of the referring page</em> |[optional]|
**pageFromStatusCode** | **Integer** | <em>HTTP status code returned by the referring page</em><br>example:<br><code>200</code> |[optional]|
**firstSeen** | **String** | <em>date and time when our crawler found the backlink for the first time</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**prevSeen** | **String** | <em>previous to the most recent date when our crawler visited the backlink</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**lastSeen** | **String** | <em>most recent date when our crawler visited the backlink</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**itemType** | **String** | <em>link type</em><br>possible values:<br><code>anchor</code>, <code>image</code>, <code>meta</code>, <code>canonical</code>, <code>alternate</code>, <code>redirect</code> |[optional]|
**attributes** | **List<String>** | <em>link attributes of the referring links</em><br>example:<br><code>nofollow</code> |[optional]|
**dofollow** | **Boolean** | <em>indicates whether the backlink is dofollow</em><br>if <code>false</code>, the backlink is nofollow |[optional]|
**original** | **Boolean** | <em>indicates whether the backlink was present on the referring page when our crawler first visited it</em> |[optional]|
**alt** | **String** | <em>alternative text of the image</em><br>this field will be <code>null</code> if backlink <code>type</code> is not image |[optional]|
**imageUrl** | **String** | <em>URL of the image</em><br>the URL leading to the image on the original resource or DataForSEO storage (in case the original source is not available) |[optional]|
**anchor** | **String** | <em>anchor text of the backlink</em> |[optional]|
**textPre** | **String** | <em>snippet before the anchor text</em> |[optional]|
**textPost** | **String** | <em>snippet after the anchor text</em> |[optional]|
**semanticLocation** | **String** | <em>indicates semantic element in HTML where the backlink is found</em><br>you can get the full list of semantic elements <a href='https://www.w3schools.com/html/html5_semantic_elements.asp' target='_blank' rel='noopener noreferrer'>here</a><br>examples:<br><code>article</code>, <code>section</code>, <code>summary</code> |[optional]|
**linksCount** | **Long** | <em>number of identical backlinks found on the referring page</em> |[optional]|
**groupCount** | **Long** | <em>indicates total number of backlinks from this domain</em><br>for example, if <code>mode</code> is set to <code>one_per_domain</code>, this field will indicate the total number of backlinks coming from this domain |[optional]|
**isBroken** | **Boolean** | <em>indicates whether the backlink is broken</em><br>if <code>true</code>, the backlink is pointing to a page responding with a 4xx or 5xx status code |[optional]|
**urlToStatusCode** | **Integer** | <em>status code of the referenced page</em><br>if the value is <code>null</code>, our crawler hasn't yet visited the webpage the link is pointing to<br>example:<br><code>200</code> |[optional]|
**urlToSpamScore** | **Integer** | <em>spam score of the referenced page</em><br>if the value is <code>null</code>, our crawler hasn't yet visited the webpage the link is pointing to;<br>learn more about how the metric is calculated on <a href='https://dataforseo.com/help-center/what-is-spam-score-and-how-is-it-calculated' rel='noopener noreferrer' target='_blank'>this help center page</a> |[optional]|
**urlToRedirectTarget** | **String** | <em>target url of the redirect</em><br>target page the redirect is pointing to |[optional]|
**rankedKeywordsInfo** | **RankedKeywordsInfo** |  |[optional]|
**isIndirectLink** | **Boolean** | <em>indicates whether the backlink is an indirect link</em><br>if <code>true</code>, the backlink is an indirect link pointing to a page that either redirects to <code>url_to</code>, or points to a canonical page |[optional]|
**indirectLinkPath** | **List<BacklinksRedirectInfo>** | <em>indirect link path</em><br>indicates a URL or a sequence of URLs that lead to <code>url_to</code> |[optional]|
# BacklinksDomainPagesLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**mainDomain** | **String** | <em>main website domain</em><br>main website domain does not include subdomains |[optional]|
**domain** | **String** | <em>domain</em><br>domain where the page was found |[optional]|
**tld** | **String** | <em>top-level domain</em><br>top-level domain in the <a href='https://www.iana.org/domains/root/db' rel='noopener noreferrer' target='_blank'>DNS root zone</a> |[optional]|
**page** | **String** | <em>page URL</em><br>relevant page URL |[optional]|
**ip** | **String** | <em>Internet Protocol address</em> |[optional]|
**firstVisited** | **String** | <em>date and time of the first page visit</em><br>date and time when our crawler visited this page for the first time<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2017-01-24 13:20:59 +00:00</code> |[optional]|
**prevVisited** | **String** | <em>previous to the most recent date when our crawler visited the page</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2017-01-24 13:20:59 +00:00</code> |[optional]|
**fetchTime** | **String** | <em>most recent date and time when our crawler visited the page</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2017-01-24 13:20:59 +00:00</code> |[optional]|
**statusCode** | **Integer** | <i>general status code</i><br>you can find the full list of the response codes <a href='/v3/appendix/errors'>here</a><br><strong>Note:</strong> we strongly recommend designing a necessary system for handling related exceptional or error conditions |[optional]|
**location** | **String** | <em>location header</em><br>indicates the URL to redirect a page to if exists |[optional]|
**size** | **Integer** | <em>indicates the page size, in bytes</em> |[optional]|
**encodedSize** | **Integer** | <em>page size after encoding</em><br>indicates the size of the encoded page, in bytes |[optional]|
**contentEncoding** | **String** | <em>type of encoding</em> |[optional]|
**mediaType** | **String** | <em>types of media used to display a page</em> |[optional]|
**server** | **String** | <em>server version</em> |[optional]|
**meta** | **BacklinksPageMeta** | <em>page meta data</em> |[optional]|
**pageSummary** | **PageSummary** | <em>contains backlink data for this page</em> |[optional]|
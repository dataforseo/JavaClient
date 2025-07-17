# BacklinksDomainPagesLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**mainDomain** | **String** | main website domain<br>main website domain does not include subdomains |[optional]|
**domain** | **String** | domain<br>domain where the page was found |[optional]|
**tld** | **String** | top-level domain<br>top-level domain in the DNS root zone |[optional]|
**page** | **String** | page URL<br>relevant page URL |[optional]|
**ip** | **String** | Internet Protocol address |[optional]|
**firstVisited** | **String** | date and time of the first page visit<br>date and time when our crawler visited this page for the first time<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2017-01-24 13:20:59 +00:00 |[optional]|
**prevVisited** | **String** | previous to the most recent date when our crawler visited the page<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2017-01-24 13:20:59 +00:00 |[optional]|
**fetchTime** | **String** | most recent date and time when our crawler visited the page<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2017-01-24 13:20:59 +00:00 |[optional]|
**statusCode** | **Integer** | HTTP status code of the page |[optional]|
**location** | **String** | location header<br>indicates the URL to redirect a page to if exists |[optional]|
**size** | **Integer** | indicates the page size, in bytes |[optional]|
**encodedSize** | **Integer** | page size after encoding<br>indicates the size of the encoded page, in bytes |[optional]|
**contentEncoding** | **String** | type of encoding |[optional]|
**mediaType** | **String** | types of media used to display a page |[optional]|
**server** | **String** | server version |[optional]|
**meta** | **BacklinksPageMeta** | page meta data |[optional]|
**pageSummary** | **PageSummary** | contains backlink data for this page |[optional]|
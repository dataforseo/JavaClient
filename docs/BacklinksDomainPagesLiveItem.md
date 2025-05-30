

# BacklinksDomainPagesLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**mainDomain** | **String** | main website domain main website domain does not include subdomains |  [optional] |
|**domain** | **String** | domain domain where the page was found |  [optional] |
|**tld** | **String** | top-level domain top-level domain in the DNS root zone |  [optional] |
|**page** | **String** | page URL relevant page URL |  [optional] |
|**ip** | **String** | Internet Protocol address |  [optional] |
|**firstVisited** | **String** | date and time of the first page visit date and time when our crawler visited this page for the first time in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2017-01-24 13:20:59 +00:00 |  [optional] |
|**prevVisited** | **String** | previous to the most recent date when our crawler visited the page in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2017-01-24 13:20:59 +00:00 |  [optional] |
|**fetchTime** | **String** | most recent date and time when our crawler visited the page in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2017-01-24 13:20:59 +00:00 |  [optional] |
|**statusCode** | **BigDecimal** | HTTP status code of the page |  [optional] |
|**location** | **String** | location header indicates the URL to redirect a page to if exists |  [optional] |
|**size** | **BigDecimal** | indicates the page size, in bytes |  [optional] |
|**encodedSize** | **BigDecimal** | page size after encoding indicates the size of the encoded page, in bytes |  [optional] |
|**contentEncoding** | **String** | type of encoding |  [optional] |
|**mediaType** | **String** | types of media used to display a page |  [optional] |
|**server** | **String** | server version |  [optional] |
|**meta** | [**BacklinksPageMeta**](BacklinksPageMeta.md) |  |  [optional] |
|**pageSummary** | [**PageSummary**](PageSummary.md) |  |  [optional] |




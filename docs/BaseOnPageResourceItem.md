# BaseOnPageResourceItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**resourceType** | **String** | type of element |[optional]|
**statusCode** | **Integer** | general status codeyou can find the full list of the response codes hereNote: we strongly recommend designing a necessary system for handling related exceptional or error conditions |[optional]|
**location** | **String** | location headerindicates the URL to redirect a page to |[optional]|
**url** | **String** | page URL |[optional]|
**resourceErrors** | **OnPageResourceIssueInfo** | resource errors and warnings |[optional]|
**size** | **Integer** | resource sizeindicates the size of a given page measured in bytes |[optional]|
**encodedSize** | **Integer** | page size after encodingindicates the size of the encoded page measured in bytes |[optional]|
**totalTransferSize** | **Long** | compressed page sizeindicates the compressed size of a given page |[optional]|
**fetchTime** | **String** | date and time when a resource was fetchedin the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”example:2019-11-15 12:57:46 +00:00 |[optional]|
**cacheControl** | **CacheControl** | instructions for caching |[optional]|
**checks** | **Map<String, Boolean>** | website checkson-page check-ups related to the page |[optional]|
**contentEncoding** | **String** | type of encoding |[optional]|
**mediaType** | **String** | types of media used to display a page |[optional]|
**server** | **String** | server version |[optional]|
**lastModified** | **LastModified** | contains data on changes related to the resourceif there is no data, the value will be null |[optional]|
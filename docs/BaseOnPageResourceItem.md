# BaseOnPageResourceItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**resourceType** | **String** | type of element |[optional]|
**statusCode** | **Integer** | status code of the page |[optional]|
**location** | **String** | location header<br>indicates the URL to redirect a page to |[optional]|
**url** | **String** | page URL |[optional]|
**resourceErrors** | **OnPageResourceIssueInfo** | resource errors and warnings |[optional]|
**size** | **Integer** | resource size<br>indicates the size of a given page measured in bytes |[optional]|
**encodedSize** | **Integer** | page size after encoding<br>indicates the size of the encoded page measured in bytes |[optional]|
**totalTransferSize** | **Long** | compressed page size<br>indicates the compressed size of a given page |[optional]|
**fetchTime** | **String** | date and time when a resource was fetched<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**cacheControl** | **CacheControl** | instructions for caching |[optional]|
**checks** | **Map<String, Boolean>** | website checks<br>on-page check-ups related to the page |[optional]|
**contentEncoding** | **String** | type of encoding |[optional]|
**mediaType** | **String** | types of media used to display a page |[optional]|
**server** | **String** | server version |[optional]|
**lastModified** | **LastModified** | contains data on changes related to the resource<br>if there is no data, the value will be null |[optional]|
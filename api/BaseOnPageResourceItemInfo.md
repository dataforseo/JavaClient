

# BaseOnPageResourceItemInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceType** | **String** | type of the returned resource |  [optional] |
|**statusCode** | **Integer** | status code of the page |  [optional] |
|**location** | **String** | location header indicates the URL to redirect a page to |  [optional] |
|**url** | **String** | page URL |  [optional] |
|**resourceErrors** | [**OnPageResourceIssueInfo**](OnPageResourceIssueInfo.md) |  |  [optional] |
|**size** | **Integer** | resource size indicates the size of a given page measured in bytes |  [optional] |
|**encodedSize** | **Integer** | page size after encoding indicates the size of the encoded page measured in bytes |  [optional] |
|**totalTransferSize** | **Long** | compressed page size indicates the compressed size of a given page |  [optional] |
|**fetchTime** | **String** | date and time when a resource was fetched in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**cacheControl** | [**CacheControl**](CacheControl.md) |  |  [optional] |
|**checks** | **Map&lt;String, Boolean&gt;** | website checks on-page check-ups related to the page |  [optional] |
|**contentEncoding** | **String** | type of encoding |  [optional] |
|**mediaType** | **String** | types of media used to display a page |  [optional] |
|**server** | **String** | server version |  [optional] |
|**lastModified** | [**LastModified**](LastModified.md) |  |  [optional] |




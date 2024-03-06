[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# BrokenResourceElementItem

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**meta** | [**PageMetaInfo**](PageMetaInfo.md) |  |  [optional] |
|**statusCode** | **Integer** | status code of the page where a given resource is located |  [optional] |
|**location** | **String** | location header indicates the URL to redirect a page to |  [optional] |
|**url** | **String** | resource URL |  [optional] |
|**size** | **Integer** | resource size indicates the size of a given resource measured in bytes |  [optional] |
|**encodedSize** | **Integer** | resource size after encoding indicates the size of the encoded resource measured in bytes |  [optional] |
|**totalTransferSize** | **Long** | compressed resource size indicates the compressed size of a given resource in bytes |  [optional] |
|**fetchTime** | **String** | date and time when a resource was fetched in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2021-02-17 13:54:15 +00:00 |  [optional] |
|**fetchTiming** | [**FetchTiming**](FetchTiming.md) |  |  [optional] |
|**cacheControl** | [**CacheControl**](CacheControl.md) |  |  [optional] |
|**checks** | **Map&lt;String, Boolean&gt;** | resource check-ups contents of the array depend on the resource_type |  [optional] |
|**contentEncoding** | **String** | type of encoding |  [optional] |
|**mediaType** | **String** | types of media used to display a resource |  [optional] |
|**acceptType** | **String** | indicates the expected type of resource for example, if \&quot;resource_type\&quot;: \&quot;broken\&quot;, accept_type will indicate the type of the broken resource possible values: any, none, image, sitemap, robots, script, stylesheet, redirect, html, text, other, font |  [optional] |
|**server** | **String** | server version |  [optional] |
|**lastModified** | [**LastModified**](LastModified.md) |  |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
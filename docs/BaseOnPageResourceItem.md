# BaseOnPageResourceItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**resourceType** | **String** | <em>type of the returned resource = <strong>'html'</strong></em> |[optional]|
**statusCode** | **Integer** | <i>general status code</i><br>you can find the full list of the response codes <a href='/v3/appendix/errors'>here</a><br><strong>Note:</strong> we strongly recommend designing a necessary system for handling related exceptional or error conditions |[optional]|
**location** | **String** | <em>location header</em><br>indicates the URL to redirect a page to |[optional]|
**url** | **String** | <em>page URL</em> |[optional]|
**resourceErrors** | **OnPageResourceIssueInfo** | <em>resource errors and warnings</em> |[optional]|
**size** | **Integer** | <em>resource size</em><br>indicates the size of a given page measured in bytes |[optional]|
**encodedSize** | **Integer** | <em>page size after encoding</em><br>indicates the size of the encoded page measured in bytes |[optional]|
**totalTransferSize** | **Long** | <em>compressed page size</em><br>indicates the compressed size of a given page |[optional]|
**fetchTime** | **String** | <em>date and time when a resource was fetched</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**cacheControl** | **CacheControl** | <em>instructions for caching</em> |[optional]|
**checks** | **Map<String, Boolean>** | <em>website checks</em><br>on-page check-ups related to the page |[optional]|
**contentEncoding** | **String** | <em>type of encoding</em> |[optional]|
**mediaType** | **String** | <em>types of media used to display a page</em> |[optional]|
**server** | **String** | <em>server version</em> |[optional]|
**lastModified** | **LastModified** | <em>contains data on changes related to the resource</em><br>if there is no data, the value will be <code>null</code> |[optional]|
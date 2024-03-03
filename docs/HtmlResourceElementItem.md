

# HtmlResourceElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**statusCode** | **Integer** | status code of the page |  [optional] |
|**location** | **String** | location header indicates the URL to redirect a page to |  [optional] |
|**url** | **String** | page URL |  [optional] |
|**meta** | [**PageMetaInfo**](PageMetaInfo.md) |  |  [optional] |
|**pageTiming** | [**PageTiming**](PageTiming.md) |  |  [optional] |
|**onpageScore** | **Float** | shows how page is optimized on a 100-point scale this field shows how page is optimized considering critical on-page issues and warnings detected; 100 is the highest possible score that means the page does not have any critical on-page issues and important warnings; learn more about how the metric is calculated in this help center article |  [optional] |
|**totalDomSize** | **Long** | total DOM size of a page |  [optional] |
|**customJsResponse** | **Object** | the result of executing a specified JS script note that you should specify a custom_js field when setting a task to receive this data and the field type and its value will totally depend on the script you specified;you can also filter the results by this value specifying filters in the following way: [\&quot;custom_js_response.url\&quot;, \&quot;like\&quot;, \&quot;pixel\&quot;] |  [optional] |
|**resourceErrors** | [**OnPageResourceIssueInfo**](OnPageResourceIssueInfo.md) |  |  [optional] |
|**brokenResources** | **Boolean** | indicates whether a page contains broken resources |  [optional] |
|**brokenLinks** | **Boolean** | indicates whether a page contains broken links |  [optional] |
|**duplicateTitle** | **Boolean** | indicates whether a page has duplicate title tags |  [optional] |
|**duplicateDescription** | **Boolean** | indicates whether a page has a duplicate description |  [optional] |
|**duplicateContent** | **Boolean** | indicates whether a page has duplicate content |  [optional] |
|**clickDepth** | **Integer** | number of clicks it takes to get to the page indicates the number of clicks from the homepage needed before landing at the target page |  [optional] |
|**size** | **Integer** | resource size indicates the size of a given page measured in bytes |  [optional] |
|**encodedSize** | **Integer** | page size after encoding indicates the size of the encoded page measured in bytes |  [optional] |
|**totalTransferSize** | **Long** | compressed page size indicates the compressed size of a given page |  [optional] |
|**fetchTime** | **String** | date and time when a resource was fetched in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**cacheControl** | [**CacheControl**](CacheControl.md) |  |  [optional] |
|**checks** | **Map&lt;String, Boolean&gt;** | website checks on-page check-ups related to the page |  [optional] |
|**contentEncoding** | **String** | type of encoding |  [optional] |
|**mediaType** | **String** | types of media used to display a page |  [optional] |
|**server** | **String** | server version |  [optional] |
|**isResource** | **Boolean** | indicates whether a page is a single resource |  [optional] |
|**urlLength** | **Integer** | page URL length in characters |  [optional] |
|**relativeUrlLength** | **Integer** | relative URL length in characters |  [optional] |
|**lastModified** | [**LastModified**](LastModified.md) |  |  [optional] |




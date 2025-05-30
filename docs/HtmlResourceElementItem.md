

# HtmlResourceElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**meta** | [**PageMetaInfo**](PageMetaInfo.md) |  |  [optional] |
|**pageTiming** | [**PageTiming**](PageTiming.md) |  |  [optional] |
|**onpageScore** | **Float** | shows how page is optimized on a 100-point scale this field shows how page is optimized considering critical on-page issues and warnings detected; 100 is the highest possible score that means the page does not have any critical on-page issues and important warnings; learn more about how the metric is calculated in this help center article |  [optional] |
|**totalDomSize** | **BigDecimal** | total DOM size of a page |  [optional] |
|**customJsResponse** | **Object** | the result of executing a specified JS script note that you should specify a custom_js field when setting a task to receive this data and the field type and its value will totally depend on the script you specified; you can also filter the results by this value specifying filters in the following way: [\&quot;custom_js_response.url\&quot;, \&quot;like\&quot;, \&quot;pixel\&quot;] |  [optional] |
|**customJsClientException** | **String** | error when executing a custom js if the error occurred when executing the script you specified in the custom_js field, the error message would be displayed here |  [optional] |
|**brokenResources** | **Boolean** | indicates whether a page contains broken resources |  [optional] |
|**brokenLinks** | **Boolean** | indicates whether a page contains broken links |  [optional] |
|**duplicateTitle** | **Boolean** | indicates whether a page has duplicate title tags |  [optional] |
|**duplicateDescription** | **Boolean** | indicates whether a page has a duplicate description |  [optional] |
|**duplicateContent** | **Boolean** | indicates whether a page has duplicate content |  [optional] |
|**clickDepth** | **BigDecimal** | number of clicks it takes to get to the page indicates the number of clicks from the homepage needed before landing at the target page |  [optional] |
|**isResource** | **Boolean** | indicates whether a page is a single resource |  [optional] |
|**urlLength** | **BigDecimal** | page URL length in characters |  [optional] |
|**relativeUrlLength** | **BigDecimal** | relative URL length in characters |  [optional] |




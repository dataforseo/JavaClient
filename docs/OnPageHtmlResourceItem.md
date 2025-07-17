# OnPageHtmlResourceItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**meta** | **PageMetaInfo** | page properties<br>the value depends on the resource_type |[optional]|
**pageTiming** | **PageTiming** | object of page load metrics |[optional]|
**onpageScore** | **Double** | shows how page is optimized on a 100-point scale<br>this field shows how page is optimized considering critical on-page issues and warnings detected;<br>100 is the highest possible score that means the page does not have any critical on-page issues and important warnings;<br>learn more about how the metric is calculated in this help center article |[optional]|
**totalDomSize** | **Long** | total DOM size of a page |[optional]|
**customJsResponse** | **Object** | the result of executing a specified JS script<br>note that you should specify a custom_js field when setting a task to receive this data and the field type and its value will totally depend on the script you specified;<br>you can also filter the results by this value specifying filters in the following way:<br>['custom_js_response.url', 'like', 'pixel'] |[optional]|
**customJsClientException** | **String** | error when executing a custom js<br>if the error occurred when executing the script you specified in the custom_js field, the error message would be displayed here |[optional]|
**brokenResources** | **Boolean** | indicates whether a page contains broken resources |[optional]|
**brokenLinks** | **Boolean** | indicates whether a page contains broken links |[optional]|
**duplicateTitle** | **Boolean** | indicates whether a page has duplicate title tags |[optional]|
**duplicateDescription** | **Boolean** | indicates whether a page has a duplicate description |[optional]|
**duplicateContent** | **Boolean** | indicates whether a page has duplicate content |[optional]|
**clickDepth** | **Integer** | number of clicks it takes to get to the page<br>indicates the number of clicks from the homepage needed before landing at the target page |[optional]|
**isResource** | **Boolean** | indicates whether a page is a single resource |[optional]|
**urlLength** | **Integer** | page URL length in characters |[optional]|
**relativeUrlLength** | **Integer** | relative URL length in characters |[optional]|
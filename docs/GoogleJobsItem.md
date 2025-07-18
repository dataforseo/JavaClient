# GoogleJobsItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**position** | **String** | the alignment of the element in SERP<br>can take the following values:<br>left, right |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**jobId** | **String** | ID of the job on Google Jobs |[optional]|
**title** | **String** | title of the element |[optional]|
**employerName** | **String** | name of the employer |[optional]|
**employerUrl** | **String** | URL to the employer’s website |[optional]|
**employerImageUrl** | **String** | URL to the image used in the job posting |[optional]|
**location** | **String** | location for which the job vacancy is posted |[optional]|
**sourceName** | **String** | original source of the job vacancy |[optional]|
**sourceUrl** | **String** | URL to the original source of the job vacancy |[optional]|
**salary** | **String** | the salary indicated in the job vacancy<br>if the salary isn’t indicated, this field will equal null |[optional]|
**contractType** | **String** | employment contract type |[optional]|
**timestamp** | **String** | date and time when the result was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**timeAgo** | **String** | indicates how long ago the job vacancy was posted |[optional]|
**rectangle** | **RectangleInfo** | rectangle parameters<br>contains cartesian coordinates and pixel dimensions of the result’s snippet in SERP;<br>in this case, will equal null |[optional]|
# GoogleJobsItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP |[optional]|
**position** | **String** | <em>the alignment of the element in SERP</em><br>can take the following values:<br><code>left</code>, <code>right</code> |[optional]|
**xpath** | **String** | <em>the <a href='https://en.wikipedia.org/wiki/XPath' rel='noopener noreferrer' target='_blank'>XPath</a> of the element</em> |[optional]|
**jobId** | **String** | <em>ID of the job on Google Jobs</em> |[optional]|
**title** | **String** | <em>title of the element</em> |[optional]|
**employerName** | **String** | <em>name of the employer</em> |[optional]|
**employerUrl** | **String** | <em>URL to the employer's website</em> |[optional]|
**employerImageUrl** | **String** | <em>URL to the image used in the job posting</em> |[optional]|
**location** | **String** | <em>location for which the job vacancy is posted</em> |[optional]|
**sourceName** | **String** | <em>original source of the job vacancy</em> |[optional]|
**sourceUrl** | **String** | <em>URL to the original source of the job vacancy</em> |[optional]|
**salary** | **String** | <em>the salary indicated in the job vacancy</em><br>if the salary isn't indicated, this field will equal <code>null</code> |[optional]|
**contractType** | **String** | <em>employment contract type</em> |[optional]|
**timestamp** | **String** | <em>date and time when the result was published</em><br>in the UTC format: 'yyyy-mm-dd hh-mm-ss +00:00'<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**timeAgo** | **String** | <em>indicates how long ago the job vacancy was posted</em> |[optional]|
**rectangle** | **AiModeRectangleInfo** | <em>rectangle parameters</em><br>contains cartesian coordinates and pixel dimensions of the result's snippet in SERP;<br>in this case, will equal <code>null</code> |[optional]|
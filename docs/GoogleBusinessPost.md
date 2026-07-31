# GoogleBusinessPost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank among all the listed updates</em><br>absolute position among all present elements |[optional]|
**position** | **String** | <em>the alignment of the element in SERP</em><br>can take the following values: <code>right</code> |[optional]|
**xpath** | **String** | <em>the <a href='https://en.wikipedia.org/wiki/XPath'>XPath</a> of the element</em> |[optional]|
**author** | **String** | <em>author of the post</em> |[optional]|
**snippet** | **String** | <em>additional content of a post</em> |[optional]|
**postText** | **String** | <em>main content of a post</em> |[optional]|
**url** | **String** | <em>url of a post</em> |[optional]|
**imagesUrl** | **String** | <em>url of an image included in the post</em> |[optional]|
**postDate** | **String** | <em>date when a post was published</em><br>in the following format:<br><code>'mm/dd/yyyy hh:mm:ss'</code> |[optional]|
**timestamp** | **String** | <em>time when a post was published</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**links** | **List<LinkElement>** | <em>links included in the post</em> |[optional]|
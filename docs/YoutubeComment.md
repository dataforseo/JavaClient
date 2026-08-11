# YoutubeComment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em> absolute rank in SERP for the target domain</em><br>absolute position among all the elements in SERP |[optional]|
**authorName** | **String** | <em>name of the author of the comment</em> |[optional]|
**authorThumbnail** | **String** | <em>the URL of the page where the author's channel logo is hosted</em> |[optional]|
**authorUrl** | **String** | <em>URL of the author's channel</em> |[optional]|
**text** | **String** | <em>text of the comment</em> |[optional]|
**publicationDate** | **String** | <em>displayed publication date</em> |[optional]|
**timestamp** | **String** | <em>date and time when the result was published</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2022-11-15 12:57:46 +00:00</code> |[optional]|
**likesCount** | **Long** | <em>number of likes on the comment</em> |[optional]|
**replyCount** | **Long** | <em>number of replies on the comment</em> |[optional]|
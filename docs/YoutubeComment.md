# YoutubeComment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP for the target domain<br>absolute position among all the elements in SERP |[optional]|
**authorName** | **String** | name of the author of the comment |[optional]|
**authorThumbnail** | **String** | the URL of the page where the author’s channel logo is hosted |[optional]|
**authorUrl** | **String** | URL of the author’s channel |[optional]|
**text** | **String** | text of the comment |[optional]|
**publicationDate** | **String** | displayed publication date |[optional]|
**timestamp** | **String** | date and time when the result was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2022-11-15 12:57:46 +00:00 |[optional]|
**likesCount** | **Long** | number of likes on the comment |[optional]|
**replyCount** | **Long** | number of replies on the comment |[optional]|
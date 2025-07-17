# GoogleBusinessPost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank among all the listed updates<br>absolute position among all present elements |[optional]|
**position** | **String** | the alignment of the element in SERP<br>can take the following values: right |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**author** | **String** | author of the post |[optional]|
**snippet** | **String** | additional content of a post |[optional]|
**postText** | **String** | main content of a post |[optional]|
**url** | **String** | url of a post |[optional]|
**imagesUrl** | **String** | url of an image included in the post |[optional]|
**postDate** | **String** | date when a post was published<br>in the following format:<br>'mm/dd/yyyy hh:mm:ss' |[optional]|
**timestamp** | **String** | time when a post was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**links** | **List<LinkElement>** | links included in the post |[optional]|
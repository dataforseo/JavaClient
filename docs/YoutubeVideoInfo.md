# YoutubeVideoInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP for the target domain<br>absolute position among all the elements in SERP |[optional]|
**videoId** | **String** | ID of the video received in a POST array |[optional]|
**title** | **String** | title of the video |[optional]|
**url** | **String** | URL of the video |[optional]|
**thumbnailUrl** | **String** | the URL of the page where the thumbnail is hosted |[optional]|
**channelId** | **String** | the ID of the channel where the video is published |[optional]|
**channelName** | **String** | the name of the channel where the video is published |[optional]|
**channelUrl** | **String** | the URL of the channel where the video is published |[optional]|
**channelLogo** | **String** | the URL of the page where the logo image of the channel is hosted |[optional]|
**description** | **String** | description of the video |[optional]|
**viewsCount** | **Long** | number of views of the video |[optional]|
**likesCount** | **Long** | number of likes on the video |[optional]|
**commentsCount** | **Long** | number of comments on the video |[optional]|
**channelSubscribersCount** | **ChannelSubscribersCount** | number of subscribers of the channel |[optional]|
**publicationDate** | **String** | the date when the video is published |[optional]|
**timestamp** | **String** | date and time when the result is published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2022-11-15 12:57:46 +00:00 |[optional]|
**keywords** | **List<String>** | keywords relevant to the video |[optional]|
**category** | **String** | the category the video belongs to |[optional]|
**isLive** | **Boolean** | indicates whether the video is on live |[optional]|
**isEmbeddable** | **Boolean** | indicates whether the video is embeddable |[optional]|
**durationTime** | **String** | duration of the video |[optional]|
**durationTimeSeconds** | **Integer** | duration of the video in seconds |[optional]|
**subtitles** | **List<Subtitles>** | array of elements describing properties of subtitles in the video |[optional]|
**streamingQuality** | **List<StreamingQualityElement>** | array of elements that contain information about all possible streaming qualities of the video |[optional]|
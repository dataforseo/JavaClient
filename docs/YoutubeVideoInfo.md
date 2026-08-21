# YoutubeVideoInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>            position within a group of elements with identical <code>type</code> values<br>            positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em> absolute rank in SERP for the target domain</em><br>            absolute position among all the elements in SERP |[optional]|
**videoId** | **String** | <em>ID of the video received in a POST array</em> |[optional]|
**title** | **String** | <em>title of the video</em> |[optional]|
**url** | **String** | <em>URL of the video</em> |[optional]|
**thumbnailUrl** | **String** | <em>the URL of the page where the thumbnail is hosted</em> |[optional]|
**channelId** | **String** | <em>the ID of the channel where the video is published</em> |[optional]|
**channelName** | **String** | <em>the name of the channel where the video is published</em> |[optional]|
**channelUrl** | **String** | <em>the URL of the channel where the video is published</em> |[optional]|
**channelLogo** | **String** | <em>the URL of the page where the logo image of the channel is hosted</em> |[optional]|
**description** | **String** | <em>description of the video</em> |[optional]|
**viewsCount** | **Long** | <em>number of views of the video</em> |[optional]|
**likesCount** | **Long** | <em>number of likes on the video</em> |[optional]|
**commentsCount** | **Long** | <em>number of comments on the video</em> |[optional]|
**channelSubscribersCount** | **ChannelSubscribersCount** | <em>number of subscribers of the channel</em> |[optional]|
**publicationDate** | **String** | <em>the date when the video is published</em> |[optional]|
**timestamp** | **String** | <em>date and time when the result is published</em><br>            in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>            example:<br>            <code>2022-11-15 12:57:46 +00:00</code> |[optional]|
**keywords** | **List<String>** | <em>keywords relevant to the video</em><br>            also known as 'YouTube tags' |[optional]|
**category** | **String** | <em>the category the video belongs to</em> |[optional]|
**isLive** | **Boolean** | <em>indicates whether the video is on live</em> |[optional]|
**isEmbeddable** | **Boolean** | <em>indicates whether the video is embeddable</em> |[optional]|
**durationTime** | **String** | <em>duration of the video</em> |[optional]|
**durationTimeSeconds** | **Integer** | <em>duration of the video in seconds</em> |[optional]|
**subtitles** | **List<Subtitles>** | <em>array of elements describing properties of subtitles in the video</em> |[optional]|
**streamingQuality** | **List<StreamingQualityElement>** | <em>array of elements that contain information about all possible streaming qualities of the video</em> |[optional]|
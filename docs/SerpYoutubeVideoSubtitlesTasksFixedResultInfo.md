# SerpYoutubeVideoSubtitlesTasksFixedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | task identifier of the completed task<br>unique task identifier in our system in the UUID format |[optional]|
**se** | **String** | search engine specified when setting the task |[optional]|
**seType** | **String** | type of search engine<br>can take the following values: video_subtitles |[optional]|
**datePosted** | **String** |  |[optional]|
**tag** | **String** | user-defined task identifier |[optional]|
**endpointRegular** | **String** | URL for collecting the results of the SERP Regular task<br>if SERP Regular is not supported in the specified endpoint, the value will be null |[optional]|
**endpointAdvanced** | **String** | URL for collecting the results of the SERP Advanced task<br>if SERP Advanced is not supported in the specified endpoint, the value will be null |[optional]|
**endpointHtml** | **String** | URL for collecting the results of the SERP HTML task<br>if SERP HTML is not supported in the specified endpoint, the value will be null |[optional]|
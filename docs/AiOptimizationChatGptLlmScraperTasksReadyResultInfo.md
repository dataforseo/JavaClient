# AiOptimizationChatGptLlmScraperTasksReadyResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | task identifier of the completed task<br>unique task identifier in our system in the UUID format |[optional]|
**se** | **String** | search engine specified when setting the task |[optional]|
**seType** | **String** | type of search engine<br>example: llm_scraper |[optional]|
**datePosted** | **String** | date when the task was posted (in the UTC format) |[optional]|
**tag** | **String** | user-defined task identifier |[optional]|
**endpointRegular** | **String** | URL for collecting the results of the Regular task<br>if the Regular function is not supported in the specified endpoint, the value will be null |[optional]|
**endpointAdvanced** | **String** | URL for collecting the results of the Advanced task<br>if the Advanced function is not supported in the specified endpoint, the value will be null |[optional]|
**endpointHtml** | **String** | URL for collecting the results of the HTML task<br>if the HTML function is not supported in the specified endpoint, the value will be null |[optional]|
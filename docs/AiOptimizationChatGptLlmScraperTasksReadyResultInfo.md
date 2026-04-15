# AiOptimizationChatGptLlmScraperTasksReadyResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | task identifier of the completed taskunique task identifier in our system in the UUID format |[optional]|
**se** | **String** | search engine specified when setting the task |[optional]|
**seType** | **String** | type of search engineexample: llm_scraper |[optional]|
**datePosted** | **String** | date when the task was posted (in the UTC format) |[optional]|
**tag** | **String** | user-defined task identifier |[optional]|
**endpointRegular** | **String** | URL for collecting the results of the Regular taskif the Regular function is not supported in the specified endpoint, the value will be null |[optional]|
**endpointAdvanced** | **String** | URL for collecting the results of the Advanced taskif the Advanced function is not supported in the specified endpoint, the value will be null |[optional]|
**endpointHtml** | **String** | URL for collecting the results of the HTML taskif the HTML function is not supported in the specified endpoint, the value will be null |[optional]|
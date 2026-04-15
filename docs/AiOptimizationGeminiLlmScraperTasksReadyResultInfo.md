# AiOptimizationGeminiLlmScraperTasksReadyResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | task identifier of the completed taskunique task identifier in our system in the UUID format |[optional]|
**se** | **String** | search engine specified when setting the task |[optional]|
**function** | **String** | search engine functionexample: llm_scraper |[optional]|
**datePosted** | **String** | date when the task was posted (in the UTC format) |[optional]|
**tag** | **String** | user-defined task identifier |[optional]|
**endpointAdvanced** | **String** | URL for collecting the results of the Advanced taskif the Advanced function is not supported in the specified endpoint, the value will be null |[optional]|
**endpointHtml** | **String** | URL for collecting the results of the HTML taskif the HTML function is not supported in the specified endpoint, the value will be null |[optional]|
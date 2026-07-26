# AiOptimizationGeminiLlmScraperTasksReadyResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | <em>task identifier of the completed task</em><br><strong>unique task identifier in our system in the <a href='https://en.wikipedia.org/wiki/Universally_unique_identifier'>UUID</a> format</strong> |[optional]|
**se** | **String** | <em>search engine specified when setting the task</em> |[optional]|
**function** | **String** | <em>search engine function</em><br>example: <code>llm_scraper</code> |[optional]|
**datePosted** | **String** | <em>date when the task was posted (in the UTC format)</em> |[optional]|
**tag** | **String** | <em>user-defined task identifier</em> |[optional]|
**endpointAdvanced** | **String** | <em>URL for collecting the results of the Advanced task</em><br>if the Advanced function is not supported in the specified endpoint, the value will be <code>null</code> |[optional]|
**endpointHtml** | **String** | <em>URL for collecting the results of the HTML task</em><br>if the HTML function is not supported in the specified endpoint, the value will be <code>null</code> |[optional]|
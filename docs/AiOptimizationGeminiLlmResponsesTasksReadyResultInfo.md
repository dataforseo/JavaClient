# AiOptimizationGeminiLlmResponsesTasksReadyResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | <em>task identifier of the completed task</em><br><strong>unique task identifier in our system in the <a href='https://en.wikipedia.org/wiki/Universally_unique_identifier'>UUID</a> format</strong> |[optional]|
**se** | **String** | <em>LLM model specified when setting the task</em> |[optional]|
**seType** | **String** |  |[optional]|
**datePosted** | **String** | <em>date when the task was posted (in the UTC format)</em> |[optional]|
**tag** | **String** | <em>user-defined task identifier</em> |[optional]|
**endpoint** | **String** | <em>URL for collecting the results of the task</em> |[optional]|
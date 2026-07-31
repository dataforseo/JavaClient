# AppDataGoogleAppSearchesTasksReadyResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | <em>task identifier of the completed task</em><br><strong>unique task identifier in our system in the <a href='https://en.wikipedia.org/wiki/Universally_unique_identifier'>UUID</a> format</strong> |[optional]|
**se** | **String** | <em>search engine specified when setting the task</em> |[optional]|
**seType** | **String** | <em>search engine type</em> |[optional]|
**datePosted** | **String** | <em>date when the task was posted (in the UTC format)</em> |[optional]|
**tag** | **String** |  |[optional]|
**endpointAdvanced** | **String** | <em>URL for collecting the results of the {{up_se_name}} {{normal_se_type}} task</em> |[optional]|
**endpointHtml** | **String** | <em>URL for collecting the results of the {{up_se_name}} {{normal_se_type}} HTML task</em><br>if HTML tasks are not supported in the specified endpoint, the value will be <code>null</code> |[optional]|
# SerpGoogleAutocompleteTasksReadyResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | <em>task identifier of the completed task</em><br><strong>unique task identifier in our system in the <a href='https://en.wikipedia.org/wiki/Universally_unique_identifier'>UUID</a> format</strong> |[optional]|
**se** | **String** | <em>search engine specified when setting the task</em> |[optional]|
**seType** | **String** | <em>type of search engine</em><br>example: <code>{{low_se_type_under}}</code> |[optional]|
**datePosted** | **String** | <em>date when the task was posted (in the UTC format)</em> |[optional]|
**tag** | **String** | <em>user-defined task identifier</em> |[optional]|
**endpointRegular** | **String** | <em>URL for collecting the results of the SERP Regular task</em><br>if SERP Regular is not supported in the specified endpoint, the value will be <code>null</code> |[optional]|
**endpointAdvanced** | **String** | <em>URL for collecting the results of the SERP Advanced task</em><br>if SERP Advanced is not supported in the specified endpoint, the value will be <code>null</code> |[optional]|
**endpointHtml** | **String** | <em>URL for collecting the results of the SERP HTML task</em><br>if SERP HTML is not supported in the specified endpoint, the value will be <code>null</code> |[optional]|
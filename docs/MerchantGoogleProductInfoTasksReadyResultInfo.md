# MerchantGoogleProductInfoTasksReadyResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | <em>task identifier of the completed task</em><br><strong>unique task identifier in our system in the <a href='https://en.wikipedia.org/wiki/Universally_unique_identifier'>UUID</a> format</strong> |[optional]|
**se** | **String** | <em>search engine specified when setting the task</em> |[optional]|
**seType** | **String** | <em>type of search engine</em><br>can take the following values: <code>shopping_specifications</code> |[optional]|
**datePosted** | **String** | <em>date when the task was posted (in the UTC format)</em> |[optional]|
**tag** | **String** |  |[optional]|
**endpointAdvanced** | **String** | <em>URL for collecting the results of the Google Shopping Product Specifications Advanced task</em> |[optional]|
**endpointHtml** | **String** | <em>URL for collecting the results of the Google Shopping Product Specifications HTML task</em><br><strong>note:</strong> HTML is not available for this endpoint, the value will be <code>null</code> |[optional]|
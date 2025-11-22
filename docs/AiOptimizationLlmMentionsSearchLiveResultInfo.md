# AiOptimizationLlmMentionsSearchLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | total amount of results relevant the request |[optional]|
**currentOffset** | **Integer** | the number of mentions objects that are omitted in the items array |[optional]|
**searchAfterToken** | **String** | token for subsequent requests<br>by specifying the unique search_after_token when setting a new task, you will get the subsequent results of the initial task;<br>search_after_token values are unique for each subsequent task |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<AiOptimizationLlmMentionsSearchLiveItem>** | contains relevant mentions data |[optional]|
# DomainAnalyticsTechnologiesDomainsByTechnologyLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | <em>total number of relevant items in the database</em> |[optional]|
**itemsCount** | **Long** | <em>number of items in the results array</em> |[optional]|
**offset** | **Integer** | <em>specified offset value</em> |[optional]|
**offsetToken** | **String** | <em>token for subsequent requests</em><br>by specifying the unique <code>offset_token</code> when setting a new task, you will get the subsequent results of the initial task;<br><code>offset_token</code> values are unique for each subsequent task |[optional]|
**items** | **List<DomainAnalyticsTechnologiesDomainsByLiveItem>** | <em>items array</em> |[optional]|
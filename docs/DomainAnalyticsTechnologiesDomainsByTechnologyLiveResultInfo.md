# DomainAnalyticsTechnologiesDomainsByTechnologyLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | total number of relevant items in the database |[optional]|
**itemsCount** | **Long** | number of items in the results array |[optional]|
**offset** | **Integer** | specified offset value |[optional]|
**offsetToken** | **String** | token for subsequent requests<br>by specifying the unique offset_token when setting a new task, you will get the subsequent results of the initial task;<br>offset_token values are unique for each subsequent task |[optional]|
**items** | **List<DomainAnalyticsTechnologiesDomainsByLiveItem>** | items array |[optional]|
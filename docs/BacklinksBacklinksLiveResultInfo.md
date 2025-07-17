# BacklinksBacklinksLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**target** | **String** | target domain in a POST array |[optional]|
**mode** | **String** | mode specified in a POST array |[optional]|
**customMode** | **Map<String, Object>** | custom mode specified in a POST array |[optional]|
**totalCount** | **Long** | total amount of results relevant the request |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BacklinksBacklinksLiveItem>** | contains relevant backlinks and referring domains data |[optional]|
**searchAfterToken** | **String** | token for subsequent requests<br>by specifying the unique search_after_token when setting a new task, you will get the subsequent results of the initial task;<br>search_after_token values are unique for each subsequent task |[optional]|
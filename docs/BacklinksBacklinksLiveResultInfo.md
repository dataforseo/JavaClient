# BacklinksBacklinksLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**target** | **String** | <em>target domain in a POST array</em> |[optional]|
**mode** | **String** | <em>mode specified in a POST array</em> |[optional]|
**customMode** | **Map<String, Object>** | <em>custom mode specified in a POST array</em> |[optional]|
**totalCount** | **Long** | <em>total amount of results relevant the request</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <code>items</code> array</em> |[optional]|
**items** | **List<BacklinksBacklinksLiveItem>** | <em>contains relevant backlinks and referring domains data</em> |[optional]|
**searchAfterToken** | **String** | <em>token for subsequent requests</em><br>by specifying the unique <code>search_after_token</code> when setting a new task, you will get the subsequent results of the initial task;<br><code>search_after_token</code> values are unique for each subsequent task |[optional]|
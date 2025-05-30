

# BacklinksBacklinksLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **String** | target domain in a POST array |  [optional] |
|**mode** | **String** | mode specified in a POST array |  [optional] |
|**customMode** | **Map&lt;String, Object&gt;** | custom mode specified in a POST array |  [optional] |
|**totalCount** | **BigDecimal** | total amount of results relevant the request |  [optional] |
|**itemsCount** | **BigDecimal** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;BacklinksBacklinksLiveItem&gt;**](BacklinksBacklinksLiveItem.md) | contains relevant backlinks and referring domains data |  [optional] |
|**searchAfterToken** | **String** | token for subsequent requests by specifying the unique search_after_token when setting a new task, you will get the subsequent results of the initial task; search_after_token values are unique for each subsequent task |  [optional] |




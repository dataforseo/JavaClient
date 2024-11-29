

# BusinessDataBusinessListingsSearchLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalCount** | **Long** | total number of results in our database relevant to your request |  [optional] |
|**count** | **Long** | item types the number of items in the items array |  [optional] |
|**offset** | **Long** | offset in the results array of returned businesses |  [optional] |
|**offsetToken** | **String** | token for subsequent requests by specifying the unique offset_token when setting a new task, you will get the subsequent results of the initial task; offset_token values are unique for each subsequent task |  [optional] |
|**items** | [**List&lt;BusinessDataBusinessListingsSearchLiveItem&gt;**](BusinessDataBusinessListingsSearchLiveItem.md) | encountered item types types of search engine results encountered in the items array; possible item types: business_listing |  [optional] |




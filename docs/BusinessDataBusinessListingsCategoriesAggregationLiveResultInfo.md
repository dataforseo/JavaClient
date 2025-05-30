

# BusinessDataBusinessListingsCategoriesAggregationLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalCount** | **BigDecimal** | total number of results in our database relevant to your request |  [optional] |
|**count** | **BigDecimal** | item types the number of items in the items array |  [optional] |
|**offset** | **String** | offset in the results array of returned categories |  [optional] |
|**offsetToken** | **String** | token for subsequent requests by specifying the unique offset_token when setting a new task, you will get the subsequent results of the initial task; offset_token values are unique for each subsequent task |  [optional] |
|**items** | [**List&lt;BusinessDataBusinessListingsCategoriesAggregationLiveItem&gt;**](BusinessDataBusinessListingsCategoriesAggregationLiveItem.md) | encountered item types types of search engine results encountered in the items array; possible item types: business_category |  [optional] |




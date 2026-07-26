# BusinessDataBusinessListingsSearchLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | <em>total number of results in our database relevant to your request</em> |[optional]|
**count** | **Long** | <em>item types</em><br>the number of items in the <code>items</code> array |[optional]|
**offset** | **Long** |  |[optional]|
**offsetToken** | **String** |  |[optional]|
**items** | **List<BusinessDataBusinessListingsSearchLiveItem>** | <em>encountered item types</em><br>types of search engine results encountered in the <code>items</code> array;<br>possible item types: <code>business_listing</code> |[optional]|
# MerchantGoogleProductSpecTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**productId** | **String** | product ID in a POST array<br>learn more about the parameter in this help center guide |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**title** | **String** | title of the product |[optional]|
**description** | **String** | description of the product |[optional]|
**imageUrl** | **String** | URL of the product image |[optional]|
**tags** | **List<String>** | tags of the product |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the format: “year-month-date:minutes:UTC_difference_hours:UTC_difference_minutes”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**itemTypes** | **List<String>** | types of items found on the product specification page<br>possible item types:<br>shopping_specification |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<ShoppingSpecification>** | items on the product specification page<br>contains all product attributes and related data listed on the product specification page |[optional]|
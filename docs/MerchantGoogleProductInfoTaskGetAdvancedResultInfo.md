# MerchantGoogleProductInfoTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**productId** | **String** | product ID in a POST array<br>learn more about the parameter in this help center guide |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the format: “year-month-date:minutes:UTC_difference_hours:UTC_difference_minutes”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**itemTypes** | **List<String>** | types of items found on the product specification page<br>possible item types:<br>product_info_element |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<ProductInfoElement>** | items on the product page<br>contains all product attributes and related data listed on the product page |[optional]|
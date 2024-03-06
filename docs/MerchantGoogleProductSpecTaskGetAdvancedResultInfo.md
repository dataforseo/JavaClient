[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# MerchantGoogleProductSpecTaskGetAdvancedResultInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productId** | **String** | product ID in a POST array learn more about the parameter in this help center guide |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**title** | **String** | title of the product |  [optional] |
|**description** | **String** | description of the product |  [optional] |
|**imageUrl** | **String** | URL of the product image |  [optional] |
|**tags** | **List&lt;String&gt;** | tags of the product |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the format: “year-month-date:minutes:UTC_difference_hours:UTC_difference_minutes” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**itemTypes** | **List&lt;String&gt;** | types of items found on the product specification page possible item types: shopping_specification |  [optional] |
|**itemsCount** | **Long** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;BaseMerchantSerpElementItem&gt;**](BaseMerchantSerpElementItem.md) | items on the product specification page contains all product attributes and related data listed on the product specification page |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
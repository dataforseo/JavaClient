[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# HotelPriceInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**price** | **Integer** | price per night |  [optional] |
|**priceWithoutDiscount** | **Long** | full price per night without a discount applied |  [optional] |
|**currency** | **String** | price currency USD is applied by default, unless specified in the POST array |  [optional] |
|**discountText** | **String** | text about a discount applied |  [optional] |
|**checkIn** | **String** | check-in date and time in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**checkOut** | **String** | check-out date and time in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**visitors** | **Integer** | number of hotel visitors for this price |  [optional] |
|**items** | [**List&lt;HotelPriceItemInfo&gt;**](HotelPriceItemInfo.md) | encountered item types types of search engine results encountered in the items array; possible item types: hotel_search_item |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# HotelPriceItemInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**title** | **String** | title of the hotel |  [optional] |
|**price** | **Integer** | price per night |  [optional] |
|**currency** | **String** | price currency USD is applied by default, unless specified in the POST array |  [optional] |
|**url** | **String** | third-party page url URL to the third-party website page with pricing information |  [optional] |
|**domain** | **String** | third-party domain domain of the third-party website page with pricing information |  [optional] |
|**isPaid** | **Boolean** | indicates a paid hotel listing if true, related hotel_search_item is a paid ad if false, related hotel_search_item is an organic hotel listing |  [optional] |
|**freeCancellationUntil** | **String** | date until which free cancellation is available in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” equals null if free cancellation is not available for the selected dates |  [optional] |
|**offers** | [**List&lt;HotelInfoPriceOffer&gt;**](HotelInfoPriceOffer.md) | featured price offers |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
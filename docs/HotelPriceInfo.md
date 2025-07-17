# HotelPriceInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**price** | **Double** | price per night |[optional]|
**priceWithoutDiscount** | **Double** | full price per night without a discount applied |[optional]|
**currency** | **String** | price currency<br>USD is applied by default, unless specified in the POST array |[optional]|
**discountText** | **String** | text about a discount applied |[optional]|
**checkIn** | **String** | check-in date and time<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**checkOut** | **String** | check-out date and time<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**visitors** | **Integer** | number of hotel visitors for this price |[optional]|
**items** | **List<HotelPriceItemInfo>** | encountered item types<br>types of search engine results encountered in the items array;<br>possible item types: hotel_search_item |[optional]|
**pricesByDates** | **List<PricesByDates>** |  |[optional]|
# HotelPriceInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**price** | **Double** | <em>price per night</em> |[optional]|
**priceWithoutDiscount** | **Double** | <em>full price per night without a discount applied</em> |[optional]|
**currency** | **String** | <em>price currency</em><br><code>USD</code> is applied by default, unless specified in the POST array |[optional]|
**discountText** | **String** | <em>text about a discount applied</em> |[optional]|
**checkIn** | **String** | <em>check-in date and time</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**checkOut** | **String** | <em>check-out date and time</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**visitors** | **Integer** | <em>number of hotel visitors for this price</em> |[optional]|
**items** | **List<HotelPriceItemInfo>** | <em>encountered item types</em><br>types of search engine results encountered in the <code>items</code> array;<br>possible item types: <code>hotel_search_item</code> |[optional]|
**pricesByDates** | **List<PricesByDates>** |  |[optional]|
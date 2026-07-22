# DeliveryInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**deliveryDateFrom** | **String** | earliest delivery date<br>the earliest date when the product can be shipped, in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example: 2019-11-15 12:57:46 +00:00 |[optional]|
**deliveryDateTo** | **String** | latest delivery date<br>the latest date when the product can be delivered, in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example: 2019-11-15 12:57:46 +00:00 |[optional]|
**fastestDeliveryDateFrom** | **String** | earliest free delivery date<br>the earliest date when the product can be delivered with a fast delivery option, in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example: 2019-11-15 12:57:46 +00:00 |[optional]|
**fastestDeliveryDateTo** | **String** | latest free delivery date<br>the latest date when the product can be delivered with a fast delivery option, in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example: 2019-11-15 12:57:46 +00:00 |[optional]|
**deliveryMessage** | **String** | delivery information<br>message accompanying the delivery information as posted by the seller |[optional]|
**deliveryPrice** | **PriceInfo** | price for the delivery<br>price of the delivery based on the location you specified in the POST request;<br>if free delivery is available, the value is null |[optional]|
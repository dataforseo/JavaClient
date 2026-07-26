# DeliveryInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**deliveryDateFrom** | **String** | <em>earliest delivery date</em><br>the earliest date when the product can be shipped, in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example: <code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**deliveryDateTo** | **String** | <em>latest delivery date</em><br>the latest date when the product can be delivered, in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example: <code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**fastestDeliveryDateFrom** | **String** | <em>earliest free delivery date</em><br>the earliest date when the product can be delivered with a fast delivery option, in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example: <code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**fastestDeliveryDateTo** | **String** | <em>latest free delivery date</em><br>the latest date when the product can be delivered with a fast delivery option, in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example: <code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**deliveryMessage** | **String** | <em>delivery information</em><br>message accompanying the delivery information as posted by the seller |[optional]|
**deliveryPrice** | **PriceInfo** | <em>price for the delivery</em><br>price of the delivery based on the location you specified in the POST request;<br>if free delivery is available, the value is <code>null</code> |[optional]|
# AmazonDeliveryInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**deliveryMessage** | **String** | message accompanying the delivery information as posted by the seller |[optional]|
**deliveryDateFrom** | **String** | the earliest date when the product can be shipped |[optional]|
**deliveryDateTo** | **String** | the latest date when the product can be delivered |[optional]|
**fastestDeliveryDateFrom** | **String** | the earliest date when the product can be delivered with a fast delivery option |[optional]|
**fastestDeliveryDateTo** | **String** | the latest date when the product can be delivered with a fast delivery option |[optional]|
**deliveryPrice** | **PriceInfo** | price for the delivery<br>price of the delivery based on the location you specified in the POST request;<br>if free delivery is available, the value is null |[optional]|
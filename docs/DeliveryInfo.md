# DeliveryInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**deliveryDateFrom** | **String** | earliest delivery datethe earliest date when the product can be shipped |[optional]|
**deliveryDateTo** | **String** | latest delivery datethe latest date when the product can be delivered |[optional]|
**fastestDeliveryDateFrom** | **String** | earliest free delivery datethe earliest date when the product can be delivered with a fast delivery option |[optional]|
**fastestDeliveryDateTo** | **String** | latest free delivery datethe latest date when the product can be delivered with a fast delivery option |[optional]|
**deliveryMessage** | **String** | delivery informationmessage accompanying the delivery information as posted by the seller |[optional]|
**deliveryPrice** | **PriceInfo** | price for the deliveryprice of the delivery based on the location you specified in the POST request;if free delivery is available, the value is null |[optional]|
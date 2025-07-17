# BaseMerchantAmazonSellersElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements found in Amazon Sellers SERP |[optional]|
**position** | **String** | alignment of the element in SERP<br>possible values:<br>left, right |[optional]|
**xpath** | **String** | XPath of the element |[optional]|
**sellerName** | **String** | business name of the seller |[optional]|
**sellerUrl** | **String** | url forwarding to the seller’s page on Amazon |[optional]|
**shipsFrom** | **String** | sender company name |[optional]|
**price** | **PriceInfo** | product pricing details<br>if there are no details, the value will be null |[optional]|
**rating** | **RatingElement** | seller rating details<br>seller popularity rate based on customer reviews |[optional]|
**condition** | **String** | product condition<br>condition of the product offered by the seller |[optional]|
**conditionDescription** | **String** | product condition details<br>expanded details on the condition of the product offered by the seller |[optional]|
**deliveryInfo** | **AmazonDeliveryInfo** | delivery information<br>delivery information including free and fast delivery date ranges |[optional]|
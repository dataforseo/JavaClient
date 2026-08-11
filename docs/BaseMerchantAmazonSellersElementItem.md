# BaseMerchantAmazonSellersElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em> absolute rank in SERP</em><br>absolute position among all the elements found in Amazon Sellers SERP |[optional]|
**position** | **String** | <em>alignment of the element in SERP</em><br>possible values:<br><code>left</code>, <code>right</code> |[optional]|
**xpath** | **String** | <em><a href='https://en.wikipedia.org/wiki/XPath'>XPath</a> of the element</em> |[optional]|
**sellerName** | **String** | <em>business name of the seller</em> |[optional]|
**sellerUrl** | **String** | <em>url forwarding to the seller's page on Amazon</em> |[optional]|
**shipsFrom** | **String** | <em>sender company name</em> |[optional]|
**price** | **PriceInfo** | <em>product pricing details</em><br>if there are no details, the value will be <code>null</code> |[optional]|
**percentageDiscount** | **Double** | <em>value of the percentage discount</em> |[optional]|
**applicableVouchers** | **List<AmazonApplicableVouchersItem>** | <em>array of objects containing information about applicable vouchers</em> |[optional]|
**rating** | **RatingElement** | <em>seller rating details</em><br>seller popularity rate based on customer reviews |[optional]|
**condition** | **String** | <em>product condition</em><br>condition of the product offered by the seller |[optional]|
**conditionDescription** | **String** | <em>product condition details</em><br>expanded details on the condition of the product offered by the seller |[optional]|
**deliveryInfo** | **AmazonDeliveryInfo** | <em>delivery information</em><br>delivery information including free and fast delivery date ranges |[optional]|
# ProductSeller


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | <em>product title</em> |[optional]|
**url** | **String** | <em>seller url</em><br>url of the page where the product is sold |[optional]|
**sellerRating** | **RatingElement** | <em>rating of the seller</em> |[optional]|
**sellerReviewCount** | **Integer** | number of seller reviews<br>number of reviews on the product seller’s account |[optional]|
**price** | **PriceInfo** | <em>product price</em><br>product price details on the seller's website |[optional]|
**deliveryInfo** | **DeliveryInfo** | <em>delivery information</em><br>product delivery information |[optional]|
**productAvailability** | **String** | <em>product availability information</em><br>can take the following values: <code>in_stock</code>, <code>limited_stock</code>, <code>out_of_stock</code>, <code>backordered</code>, <code>pre_order_available</code>, <code>on_display_to_order</code> |[optional]|
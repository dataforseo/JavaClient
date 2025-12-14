# GoogleShoppingCarouselElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**xpath** | **String** | XPath of the element |[optional]|
**title** | **String** | product title |[optional]|
**tags** | **List<String>** | tags assigned to the product |[optional]|
**seller** | **String** | name of the seller<br>the name of the company that placed a corresponding product on Google Shopping |[optional]|
**price** | **Double** | product price<br>example:<br>384.99 |[optional]|
**currency** | **String** | currency in the ISO format<br>example:<br>USD |[optional]|
**productRating** | **RatingElement** | product rating<br>the product popularity rate based on product reviews |[optional]|
**productImages** | **List<String>** | URLs to the images of the product<br>the first URL in the array is the featured image of the product |[optional]|
**shoppingUrl** | **String** | URL to the product page on Google Shopping |[optional]|
**productId** | **String** | unique product identifier on Google Shopping<br>note that there is no full list of possible values as the product_id is a dynamic value assigned by Google<br>if there are no values, you will get null<br>example:<br>4485466949985702538<br>learn more about the parameter in this help center guide |[optional]|
**dataDocid** | **String** | unique identifier of the SERP data element<br>note that there is no full list of possible values as the data_docid is a dynamic value assigned by Google<br>example:<br>17363035694596624076 |[optional]|
**gid** | **String** | global product identifier on Google Shopping<br>note that there is no full list of possible values as the gid is a dynamic value assigned by Google<br>if there are no values, you will get null<br>example:<br>4702526954592161872<br>learn more about gid parameter in this help center guide |[optional]|
**deliveryInfo** | **DeliveryInfo** | delivery information<br>delivery information including free and fast delivery date ranges |[optional]|
**specialOfferInfo** | **SpecialOfferInfo** | special offer from the seller<br>information on the special offer from the seller, including discount and coupon info |[optional]|
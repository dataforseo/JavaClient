# GoogleShoppingCarouselElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**xpath** | **String** | XPath of the element |[optional]|
**title** | **String** | product title |[optional]|
**tags** | **List<String>** | tags assigned to the product |[optional]|
**seller** | **String** | name of the sellerthe name of the company that placed a corresponding product on Google Shopping |[optional]|
**price** | **Double** | product priceexample:384.99 |[optional]|
**currency** | **String** | currency in the ISO formatexample:USD |[optional]|
**productRating** | **RatingElement** | product ratingthe product popularity rate based on product reviews |[optional]|
**productImages** | **List<String>** | URLs to the images of the productthe first URL in the array is the featured image of the product |[optional]|
**shoppingUrl** | **String** | URL to the product page on Google Shopping |[optional]|
**productId** | **String** | unique product identifier on Google Shoppingnote that there is no full list of possible values as the product_id is a dynamic value assigned by Googleif there are no values, you will get nullexample:4485466949985702538learn more about the parameter in this help center guide |[optional]|
**dataDocid** | **String** | unique identifier of the SERP data elementnote that there is no full list of possible values as the data_docid is a dynamic value assigned by Googleexample:17363035694596624076 |[optional]|
**gid** | **String** | global product identifier on Google Shoppingnote that there is no full list of possible values as the gid is a dynamic value assigned by Googleif there are no values, you will get nullexample:4702526954592161872learn more about gid parameter in this help center guide |[optional]|
**deliveryInfo** | **DeliveryInfo** | delivery informationdelivery information including free and fast delivery date ranges |[optional]|
**specialOfferInfo** | **SpecialOfferInfo** | special offer from the sellerinformation on the special offer from the seller, including discount and coupon info |[optional]|
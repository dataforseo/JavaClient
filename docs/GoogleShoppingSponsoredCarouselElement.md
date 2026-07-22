# GoogleShoppingSponsoredCarouselElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**xpath** | **String** | XPath of the element |[optional]|
**title** | **String** | title of the element |[optional]|
**tags** | **List<String>** | tags assigned to the product |[optional]|
**seller** | **String** | name of the sellerthe name of the company that placed a corresponding product on Google Shopping |[optional]|
**price** | **Double** | product priceexample:384.99 |[optional]|
**currency** | **String** | currency in the ISO formatexample:USD |[optional]|
**productRating** | **RatingElement** | product ratingthe product popularity rate based on product reviews |[optional]|
**productImages** | **List<String>** | URLs to the images of the productthe first URL in the array is the featured image of the product |[optional]|
**shopAdAclk** | **String** | unique ad click referral parameterusing this parameter you can get a URL of the advertisement in Google Shopping Sellers Ad URL |[optional]|
**deliveryInfo** | **DeliveryInfo** | delivery informationdelivery information including free and fast delivery date ranges |[optional]|
**specialOfferInfo** | **SpecialOfferInfo** | special offer from the sellerinformation on the special offer from the seller, including discount and coupon info |[optional]|
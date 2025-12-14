# GoogleShoppingSponsoredCarouselElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**xpath** | **String** | XPath of the element |[optional]|
**title** | **String** | title of the element |[optional]|
**tags** | **List<String>** | tags assigned to the product |[optional]|
**seller** | **String** | name of the seller<br>the name of the company that placed a corresponding product on Google Shopping |[optional]|
**price** | **Double** | product price<br>example:<br>384.99 |[optional]|
**currency** | **String** | currency in the ISO format<br>example:<br>USD |[optional]|
**productRating** | **RatingElement** | product rating<br>the product popularity rate based on product reviews |[optional]|
**productImages** | **List<String>** | URLs to the images of the product<br>the first URL in the array is the featured image of the product |[optional]|
**shopAdAclk** | **String** | unique ad click referral parameter<br>using this parameter you can get a URL of the advertisement in Google Shopping Sellers Ad URL |[optional]|
**deliveryInfo** | **DeliveryInfo** | delivery information<br>delivery information including free and fast delivery date ranges |[optional]|
**specialOfferInfo** | **SpecialOfferInfo** | special offer from the seller<br>information on the special offer from the seller, including discount and coupon info |[optional]|
# GoogleShoppingSponsoredCarouselElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**xpath** | **String** | <em><a href='https://en.wikipedia.org/wiki/XPath'>XPath</a> of the element</em> |[optional]|
**title** | **String** | <em>title of the element</em> |[optional]|
**tags** | **List<String>** | <em>tags assigned to the product</em> |[optional]|
**seller** | **String** | <em>name of the seller</em><br>the name of the company that placed a corresponding product on Google Shopping |[optional]|
**price** | **Double** | <em>product price</em><br>example:<br><code>384.99</code> |[optional]|
**currency** | **String** | <em>currency in the <a href='https://en.wikipedia.org/wiki/ISO_4217'>ISO</a> format</em><br>example:<br><code>USD</code> |[optional]|
**productRating** | **RatingElement** | <em>product rating</em><br>the product popularity rate based on product reviews |[optional]|
**productImages** | **List<String>** | <em>URLs to the images of the product</em><br>the first URL in the array is the featured image of the product |[optional]|
**shopAdAclk** | **String** | <em>unique ad click referral parameter</em><br>using this parameter you can get a URL of the advertisement in <a href='/v3/merchant/google/sellers/ad_url/'>Google Shopping Sellers Ad URL</a> |[optional]|
**deliveryInfo** | **DeliveryInfo** | <em>delivery information</em><br>delivery information including free and fast delivery date ranges |[optional]|
**specialOfferInfo** | **SpecialOfferInfo** | <em>special offer from the seller</em><br>information on the special offer from the seller, including discount and coupon info |[optional]|
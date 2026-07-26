# GoogleShoppingCarouselElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**xpath** | **String** | <em><a href='https://en.wikipedia.org/wiki/XPath'>XPath</a> of the element</em> |[optional]|
**title** | **String** | <em>product title</em> |[optional]|
**tags** | **List<String>** | <em>tags assigned to the product</em> |[optional]|
**seller** | **String** | <em>name of the seller</em><br>the name of the company that placed a corresponding product on Google Shopping |[optional]|
**price** | **Double** | <em>product price</em><br>example:<br><code>384.99</code> |[optional]|
**currency** | **String** | <em>currency in the <a href='https://en.wikipedia.org/wiki/ISO_4217'>ISO</a> format</em><br>example:<br><code>USD</code> |[optional]|
**productRating** | **RatingElement** | <em>product rating</em><br>the product popularity rate based on product reviews |[optional]|
**productImages** | **List<String>** | <em>URLs to the images of the product</em><br>the first URL in the array is the featured image of the product |[optional]|
**shoppingUrl** | **String** | <em>URL to the product page on Google Shopping</em> |[optional]|
**productId** | **String** | <em>unique product identifier on Google Shopping</em><br>note that there is no full list of possible values as the <code>product_id</code> is a dynamic value assigned by Google<br>if there are no values, you will get <code>null</code><br>example:<br><code>4485466949985702538</code><br>learn more about the parameter in <a href='https://dataforseo.com/help-center/product-id-google-shopping' rel='noopener noreferrer' target='_blank'>this help center guide</a> |[optional]|
**dataDocid** | **String** | <em>unique identifier of the SERP data element</em><br>note that there is no full list of possible values as the <code>data_docid</code> is a dynamic value assigned by Google<br>example:<br><code>17363035694596624076</code> |[optional]|
**gid** | **String** | <em>global product identifier on Google Shopping</em><br>note that there is no full list of possible values as the <code>gid</code> is a dynamic value assigned by Google<br>if there are no values, you will get <code>null</code><br>example:<br><code>4702526954592161872</code><br>learn more about <code>gid</code> parameter in <a href='https://dataforseo.com/help-center/whats-a-gid-in-google-shopping-api' target='_blank'>this help center guide</a> |[optional]|
**deliveryInfo** | **DeliveryInfo** | <em>delivery information</em><br>delivery information including free and fast delivery date ranges |[optional]|
**specialOfferInfo** | **SpecialOfferInfo** | <em>special offer from the seller</em><br>information on the special offer from the seller, including discount and coupon info |[optional]|
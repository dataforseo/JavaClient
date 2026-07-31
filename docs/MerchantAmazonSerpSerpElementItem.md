# MerchantAmazonSerpSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | <em>Amazon domain</em> |[optional]|
**title** | **String** | <em>product title</em> |[optional]|
**url** | **String** | <em>the URL of the product page</em> |[optional]|
**imageUrl** | **String** | <em>URL of the product image featured in the results</em> |[optional]|
**boughtPastMonth** | **Integer** | <em>number of product purchases in the past month</em> |[optional]|
**priceFrom** | **Double** | <em>the regular price of a product</em><br>example:<br><code>49.98</code> |[optional]|
**priceTo** | **Double** | <em>the upper limit of the product price range</em><br>example:<br><code>384.99</code> |[optional]|
**currency** | **String** | <em>currency in the <a href='https://en.wikipedia.org/wiki/ISO_4217'>ISO</a> format</em><br>example:<br><code>USD</code> |[optional]|
**specialOffers** | **List<String>** | <em>special offer details</em><br>contains special offer details, including coupon and Subscribe & Save discounts |[optional]|
**dataAsin** | **String** | <em>unique product identifier on Amazon</em><br>note that there is no full list of possible values as the <code>data_asin</code> is a dynamic value assigned by Amazon<br>example:<br><code>B07G82D89J</code> |[optional]|
**rating** | **RatingElement** | <em>product rating info</em> |[optional]|
**isAmazonChoice** | **Boolean** | <em>'Amazon's choice' label</em><br>if the value is <code>true</code>, the product is marked with the 'Amazon's choice' label |[optional]|
**isBestSeller** | **Boolean** | <em>'Best Seller' label</em><br>if the value is <code>true</code>, the product is marked with the 'Best Seller' label |[optional]|
**deliveryInfo** | **AmazonDeliveryInfo** | <em>delivery information</em><br>delivery information including free and fast delivery date ranges |[optional]|
**labels** | **List<AmazonLabelElement>** | <em>product labels</em><br>array containing an object with main Amazon labels’ information<br>if the product contains no labels, the value will be <code>null</code> |[optional]|
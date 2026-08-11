# AmazonInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in Amazon SERP</em><br>absolute position among all the elements in SERP |[optional]|
**position** | **String** | <em>the alignment of the element in Amazon SERP</em><br>can take the following values:<br><code>left</code>, <code>right</code> |[optional]|
**xpath** | **String** | <em>the <a href='https://en.wikipedia.org/wiki/XPath'>XPath</a> of the element</em> |[optional]|
**domain** | **String** | <em>Amazon domain</em> |[optional]|
**title** | **String** | <em>product title</em> |[optional]|
**url** | **String** | <em>URL of the product page</em> |[optional]|
**asin** | **String** | <em>ASIN in a POST array</em> |[optional]|
**imageUrl** | **String** | <em>URL of the product image featured in the results</em> |[optional]|
**priceFrom** | **Double** | <em>the regular price of a product</em><br>example:<br><code>49.98</code> |[optional]|
**priceTo** | **Double** | <em>the upper limit of the product price range</em><br>example:<br><code>384.99</code> |[optional]|
**currency** | **String** | <em>currency in the <a href='https://en.wikipedia.org/wiki/ISO_4217'>ISO</a> format</em><br>example:<br><code>USD</code> |[optional]|
**specialOffers** | **List<String>** | <em>special offer details</em><br>contains special offer details, including coupon and Subscribe & Save discounts |[optional]|
**isBestSeller** | **Boolean** | <em>'Best Seller' label</em><br>if the value is <code>true</code>, the product is marked with the 'Best Seller' label |[optional]|
**isAmazonChoice** | **Boolean** | <em>'Amazon's choice' label</em><br>if the value is <code>true</code>, the product is marked with the 'Amazon's choice' label |[optional]|
**rating** | **RatingInfo** | <em>the item's rating </em><br>the popularity rate based on reviews and displayed in SERP |[optional]|
**deliveryInfo** | **AmazonDeliveryInfo** | <em>delivery information</em><br>delivery information including free and fast delivery date ranges |[optional]|
**boughtPastMonth** | **Integer** |  |[optional]|
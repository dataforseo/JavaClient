# AmazonInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in Amazon SERP<br>absolute position among all the elements in SERP |[optional]|
**position** | **String** | the alignment of the element in Amazon SERP<br>can take the following values:<br>left, right |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**domain** | **String** | Amazon domain |[optional]|
**title** | **String** | product title |[optional]|
**url** | **String** | URL of the product page |[optional]|
**asin** | **String** | ASIN of the product<br>learn more about ASIN in this help center guide |[optional]|
**imageUrl** | **String** | URL of the product image featured in the results |[optional]|
**priceFrom** | **Double** | the regular price of a product<br>example:<br>49.98 |[optional]|
**priceTo** | **Double** | the upper limit of the product price range<br>example:<br>384.99 |[optional]|
**currency** | **String** | currency in the ISO format<br>example:<br>USD |[optional]|
**specialOffers** | **List<String>** | special offer details<br>contains special offer details, including coupon and Subscribe & Save discounts |[optional]|
**isBestSeller** | **Boolean** | “Best Seller” label<br>if the value is true, the product is marked with the “Best Seller” label |[optional]|
**isAmazonChoice** | **Boolean** | “Amazon’s choice” label<br>if the value is true, the product is marked with the “Amazon’s choice” label |[optional]|
**rating** | **RatingInfo** | the item’s rating <br>the popularity rate based on reviews and displayed in SERP |[optional]|
**deliveryInfo** | **AmazonDeliveryInfo** | delivery information<br>delivery information including free and fast delivery date ranges |[optional]|
**boughtPastMonth** | **Integer** |  |[optional]|
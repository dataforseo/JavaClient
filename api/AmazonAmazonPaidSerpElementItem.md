

# AmazonAmazonPaidSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**rankGroup** | **Integer** | position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in Amazon SERP absolute position among all the elements in SERP |  [optional] |
|**position** | **String** | the alignment of the element in Amazon SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**domain** | **String** | Amazon domain |  [optional] |
|**title** | **String** | product title |  [optional] |
|**url** | **String** | URL of the product page |  [optional] |
|**asin** | **String** | ASIN of the product learn more about ASIN in this help center guide |  [optional] |
|**imageUrl** | **String** | URL of the product image featured in the results |  [optional] |
|**priceFrom** | **Float** | the regular price of a product example: 49.98 |  [optional] |
|**priceTo** | **Float** | the upper limit of the product price range example: 384.99 |  [optional] |
|**currency** | **String** | currency in the ISO format example: USD |  [optional] |
|**specialOffers** | **List&lt;String&gt;** | special offer details contains special offer details, including coupon and Subscribe &amp; Save discounts |  [optional] |
|**isBestSeller** | **Boolean** | “Best Seller” label if the value is true, the product is marked with the “Best Seller” label |  [optional] |
|**isAmazonChoice** | **Boolean** | “Amazon’s choice” label if the value is true, the product is marked with the “Amazon’s choice” label |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**deliveryInfo** | [**AmazonDeliveryInfo**](AmazonDeliveryInfo.md) |  |  [optional] |
|**boughtPastMonth** | **Integer** | number of product purchases in the past month |  [optional] |
|**dataAsin** | **String** | unique product identifier on Amazon note that there is no full list of possible values as the data_asin is a dynamic value assigned by Amazon example: B07G82D89J |  [optional] |




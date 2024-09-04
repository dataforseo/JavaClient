

# AmazonAmazonPaidSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** | Amazon domain |  [optional] |
|**title** | **String** | product title |  [optional] |
|**url** | **String** | the URL of the product page |  [optional] |
|**imageUrl** | **String** | URL of the product image featured in the results |  [optional] |
|**boughtPastMonth** | **Integer** | number of product purchases in the past month |  [optional] |
|**priceFrom** | **Float** | the regular price of a product example: 49.98 |  [optional] |
|**priceTo** | **Float** | the upper limit of the product price range example: 384.99 |  [optional] |
|**currency** | **String** | currency in the ISO format example: USD |  [optional] |
|**specialOffers** | **List&lt;String&gt;** | special offer details contains special offer details, including coupon and Subscribe &amp; Save discounts |  [optional] |
|**dataAsin** | **String** | unique product identifier on Amazon note that there is no full list of possible values as the data_asin is a dynamic value assigned by Amazon example: B07G82D89J |  [optional] |
|**rating** | [**RatingElement**](RatingElement.md) |  |  [optional] |
|**isAmazonChoice** | **Boolean** | “Amazon’s choice” label if the value is true, the product is marked with the “Amazon’s choice” label |  [optional] |
|**isBestSeller** | **Boolean** | “Best Seller” label if the value is true, the product is marked with the “Best Seller” label |  [optional] |
|**deliveryInfo** | [**AmazonDeliveryInfo**](AmazonDeliveryInfo.md) |  |  [optional] |




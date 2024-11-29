

# AmazonAmazonProductInfoSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**position** | **String** | the alignment of the element in Amazon SERP possible values: left, right |  [optional] |
|**title** | **String** | product title |  [optional] |
|**details** | **String** | product specs and other details |  [optional] |
|**imageUrl** | **String** | the URL of the product image |  [optional] |
|**author** | **String** | product brand name |  [optional] |
|**dataAsin** | **String** | ASIN of the product received in a POST array |  [optional] |
|**parentAsin** | **String** | parent ASIN of the product |  [optional] |
|**productAsins** | **List&lt;String&gt;** | ASINs of all found product modifications |  [optional] |
|**priceFrom** | **Float** | the lower limit of the product price range example: 49.98 |  [optional] |
|**priceTo** | **Float** | the upper limit of the product price range example: 384.99 |  [optional] |
|**currency** | **String** | currency in the ISO format example: USD |  [optional] |
|**isAmazonChoice** | **Boolean** | “Amazon’s choice” label if the value is true, the product is marked with the “Amazon’s choice” label |  [optional] |
|**rating** | [**RatingElement**](RatingElement.md) |  |  [optional] |
|**isNewerModelAvailable** | **Boolean** | indicates whether the newer model of the product is available |  [optional] |
|**newerModel** | [**AmazonProductNewerModelInfo**](AmazonProductNewerModelInfo.md) |  |  [optional] |
|**categories** | [**List&lt;ProductCategoryInfo&gt;**](ProductCategoryInfo.md) | contains related product categories |  [optional] |
|**productInformation** | [**List&lt;BaseProductInformationItem&gt;**](BaseProductInformationItem.md) | contains related product information |  [optional] |
|**productImagesList** | **List&lt;String&gt;** | contains URLs for all images of the product displayed on the left side of the main image |  [optional] |
|**productVideosList** | **List&lt;String&gt;** | contains URLs for all videos of the product displayed on the right side of the main video |  [optional] |
|**description** | **String** | contains description of the product |  [optional] |
|**isAvailable** | **Boolean** | indicates whether the product is available for ordering if the value is true, the product can be ordered |  [optional] |
|**topLocalReviews** | [**List&lt;BaseAmazonSerpElementItem&gt;**](BaseAmazonSerpElementItem.md) | array of objects with top reviews from target location to obtain additional local reviews, you can specify the load_more_local_reviews parameter in Task POST |  [optional] |
|**topGlobalReviews** | [**List&lt;BaseAmazonSerpElementItem&gt;**](BaseAmazonSerpElementItem.md) | array of objects with top reviews from around the world |  [optional] |




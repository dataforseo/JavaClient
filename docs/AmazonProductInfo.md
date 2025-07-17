# AmazonProductInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank<br>absolute position among all the elements in the response array |[optional]|
**position** | **String** | the alignment of the element in Amazon SERP<br>possible values:<br>left, right |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**title** | **String** | product title |[optional]|
**details** | **String** | product specs and other details |[optional]|
**imageUrl** | **String** | the URL of the product image |[optional]|
**author** | **String** | product brand name |[optional]|
**dataAsin** | **String** | ASIN of the product received in a POST array |[optional]|
**parentAsin** | **String** | parent ASIN of the product |[optional]|
**productAsins** | **List<String>** | ASINs of all found product modifications |[optional]|
**priceFrom** | **Double** | the lower limit of the product price range<br>example:<br>49.98 |[optional]|
**priceTo** | **Double** | the upper limit of the product price range<br>example:<br>384.99 |[optional]|
**currency** | **String** | currency in the ISO format<br>example:<br>USD |[optional]|
**isAmazonChoice** | **Boolean** | “Amazon’s choice” label<br>if the value is true, the product is marked with the “Amazon’s choice” label |[optional]|
**rating** | **RatingElement** | product rating info |[optional]|
**isNewerModelAvailable** | **Boolean** | indicates whether the newer model of the product is available |[optional]|
**applicableVouchers** | **List<AmazonApplicableVouchersItem>** | array of objects containing information about applicable vouchers |[optional]|
**newerModel** | **AmazonProductNewerModelInfo** | information about the newer model of the product |[optional]|
**categories** | **List<ProductCategoryInfo>** | contains related product categories |[optional]|
**productInformation** | **List<BaseMerchantAmazonProductInformationElementItem>** | contains related product information |[optional]|
**productImagesList** | **List<String>** | contains URLs for all images of the product displayed on the left side of the main image |[optional]|
**productVideosList** | **List<String>** | contains URLs for all videos of the product displayed on the right side of the main video |[optional]|
**description** | **String** | contains description of the product |[optional]|
**isAvailable** | **Boolean** | indicates whether the product is available for ordering<br>if the value is true, the product can be ordered |[optional]|
**topLocalReviews** | **List<AmazonReviewItem>** | array of objects with top reviews from target location<br>to obtain additional local reviews, you can specify the load_more_local_reviews parameter in Task POST |[optional]|
**topGlobalReviews** | **List<AmazonReviewItem>** | array of objects with top reviews from around the world |[optional]|
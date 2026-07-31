# AmazonProductInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em> absolute rank</em><br>absolute position among all the elements in the response array |[optional]|
**position** | **String** | <em>the alignment of the element in Amazon SERP</em><br>possible values:<br><code>left</code>, <code>right</code> |[optional]|
**xpath** | **String** | <em>the <a href='https://en.wikipedia.org/wiki/XPath'>XPath</a> of the element</em> |[optional]|
**title** | **String** | <em>product title</em> |[optional]|
**details** | **String** | <em>product specs and other details</em> |[optional]|
**imageUrl** | **String** | <em>the URL of the product image</em> |[optional]|
**author** | **String** | <em>product brand name</em> |[optional]|
**dataAsin** | **String** | <em>ASIN of the product received in a POST array</em> |[optional]|
**parentAsin** | **String** | <em><a href='https://sellercentral.amazon.com/gp/help/external/help.html?itemID=8831&amp;language=en-US&amp;ref=mpbc_200779220_cont_8831&amp;' target='_blank' rel='noopener noreferrer'>parent ASIN</a> of the product</em> |[optional]|
**productAsins** | **List<String>** | <em>ASINs of all found product modifications</em> |[optional]|
**priceFrom** | **Double** | <em>the lower limit of the product price range</em><br>example:<br><code>49.98</code> |[optional]|
**priceTo** | **Double** | <em>the upper limit of the product price range</em><br>example:<br><code>384.99</code> |[optional]|
**percentageDiscount** | **String** | <em>value of the percentage discount</em> |[optional]|
**currency** | **String** | <em>currency in the <a href='https://en.wikipedia.org/wiki/ISO_4217'>ISO</a> format</em><br>example:<br><code>USD</code> |[optional]|
**isAmazonChoice** | **Boolean** | <em>'Amazon's choice' label</em><br>if the value is <code>true</code>, the product is marked with the 'Amazon's choice' label |[optional]|
**rating** | **RatingElement** | <em>product rating info</em> |[optional]|
**isNewerModelAvailable** | **Boolean** | <em>indicates whether the newer model of the product is available</em> |[optional]|
**isPrimeVideo** | **Boolean** | <em>indicates whether a product has an Amazon Prime Video label</em><br>if <code>true</code>, specified product is a part of Amazon Prime Video service |[optional]|
**applicableVouchers** | **List<AmazonApplicableVouchersItem>** | <em>array of objects containing information about applicable vouchers</em> |[optional]|
**newerModel** | **NewerModel** | <em>information about the newer model of the product</em> |[optional]|
**categories** | **List<Categories>** | <em>contains related product categories</em> |[optional]|
**productInformation** | **List<BaseMerchantAmazonProductInformationElementItem>** | <em>contains related product information</em> |[optional]|
**productImagesList** | **List<String>** | <em>contains URLs for all images of the product displayed on the left side of the main image</em> |[optional]|
**productVideosList** | **List<String>** | <em>contains URLs for all videos of the product displayed on the right side of the main video</em> |[optional]|
**description** | **String** | <em>contains description of the product</em> |[optional]|
**isAvailable** | **Boolean** | <em>indicates whether the product is <a href='https://www.amazon.com/gp/help/customer/display.html?nodeId=201910280' rel='noopener noreferrer' target='_blank'>available for ordering</a></em><br>if the value is <code>true</code>, the product can be ordered |[optional]|
**topLocalReviews** | **List<AmazonReviewItem>** | <em>array of objects with top reviews from target location</em> |[optional]|
**topGlobalReviews** | **List<AmazonReviewItem>** | <em>array of objects with top reviews from around the world</em> |[optional]|
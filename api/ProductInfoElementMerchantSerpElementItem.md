

# ProductInfoElementMerchantSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank on the product specification page absolute position among all the elements found on the product specification page |  [optional] |
|**position** | **String** | alignment of the element on the product specification page can take the following values: right, left |  [optional] |
|**productId** | **String** | product_id received in a POST array ilearn more about the parameter in this help center guide |  [optional] |
|**title** | **String** | title of the product |  [optional] |
|**description** | **String** | description of the product |  [optional] |
|**url** | **String** | product url url of the product on Google Shopping |  [optional] |
|**images** | **List&lt;String&gt;** | product images contains urls to product images |  [optional] |
|**features** | **List&lt;String&gt;** | product features contains snippets with the description of product features |  [optional] |
|**rating** | [**RatingElement**](RatingElement.md) |  |  [optional] |
|**sellerReviewsCount** | **Long** | number of seller reviews number of reviews on the product seller’s account |  [optional] |
|**sellers** | [**List&lt;ProductSeller&gt;**](ProductSeller.md) | sellers of the product number of reviews on the product seller’s account |  [optional] |
|**variations** | [**List&lt;ProductVariation&gt;**](ProductVariation.md) | variations of the product contains brief information about different product variations |  [optional] |




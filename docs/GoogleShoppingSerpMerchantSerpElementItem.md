

# GoogleShoppingSerpMerchantSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**xpath** | **String** | XPath of the element |  [optional] |
|**domain** | **String** | domain in SERP |  [optional] |
|**title** | **String** | title of the element |  [optional] |
|**description** | **String** | description of the product in Google Shopping SERP |  [optional] |
|**url** | **String** | URL to the product page on the seller’s website |  [optional] |
|**shoppingUrl** | **String** | URL to the product page on Google Shopping |  [optional] |
|**tags** | **List&lt;String&gt;** | tags assigned to the product |  [optional] |
|**price** | **Float** | product price example: 384.99 |  [optional] |
|**priceMultiplier** | **BigDecimal** | price multiplier for instalment plan indicates the number of months covered by the monthly payment for the product |  [optional] |
|**oldPrice** | **Float** | product old price displayed if the product price has been changed example: 499 |  [optional] |
|**currency** | **String** | currency in the ISO format example: USD |  [optional] |
|**productId** | **String** | unique product identifier on Google Shopping note that there is no full list of possible values as the product_id is a dynamic value assigned by Google if there are no values, you will get null example: 4485466949985702538 learn more about the parameter in this help center guide |  [optional] |
|**dataDocid** | **String** | unique identifier of the SERP data element note that there is no full list of possible values as the data_docid is a dynamic value assigned by Google example: 17363035694596624076 |  [optional] |
|**seller** | **String** | name of the seller the name of the company that placed a corresponding product on Google Shopping |  [optional] |
|**additionalSpecifications** | **Map&lt;String, String&gt;** | object containing additional url parameters you can get more details about the product by using this object in the POST request to the Google Shopping Product Specification and Google Shopping Sellers endpoint |  [optional] |
|**reviewsCount** | **BigDecimal** | number of product reviews indicates the number of reviews left by users on Google Shopping if there are no values, you will get null |  [optional] |
|**isBestMatch** | **Boolean** | “best match” label if the value is true, the product is marked with the “best match” label if there are no values, you will get null |  [optional] |
|**productRating** | [**RatingElement**](RatingElement.md) |  |  [optional] |
|**shopRating** | [**RatingElement**](RatingElement.md) |  |  [optional] |
|**productImages** | **List&lt;String&gt;** | URLs to the images of the product the first URL in the array is the featured image of the product |  [optional] |
|**shopAdAclk** | **String** | unique ad click referral parameter using this parameter you can get a URL of the advertisement in Google Shopping Sellers Ad URL |  [optional] |
|**deliveryInfo** | [**DeliveryInfo**](DeliveryInfo.md) |  |  [optional] |
|**storesCountInfo** | [**StoresCountInfo**](StoresCountInfo.md) |  |  [optional] |




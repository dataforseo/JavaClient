

# ShopsListMerchantSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**xpath** | **String** | XPath of the element |  [optional] |
|**domain** | **String** | domain in SERP |  [optional] |
|**title** | **String** | product title |  [optional] |
|**url** | **String** | Google Shopping URL forwarding to the product page on the seller’s website if you want to obtain a URL of the advertisement forwarding to the product page on the seller’s website, please refer to the Google Shopping Sellers Ad URL endpoint |  [optional] |
|**details** | **String** | details and special offers if there are no details, the value will be null |  [optional] |
|**basePrice** | **BigDecimal** | product price without tax and shipping |  [optional] |
|**tax** | **BigDecimal** | the amount of tax tax is specified as the actual amount of money, not as the percentage |  [optional] |
|**shippingPrice** | **BigDecimal** | product shipping price |  [optional] |
|**totalPrice** | **BigDecimal** | product price including tax and shipping |  [optional] |
|**currency** | **String** | currency in the ISO format example: USD |  [optional] |
|**priceMultiplier** | **BigDecimal** | monthly price multiplier indicates the number of months covered by the monthly payment for the product |  [optional] |
|**sellerName** | **String** | name of the seller the name of the company that placed a corresponding product on Google Shopping |  [optional] |
|**rating** | [**RatingElement**](RatingElement.md) |  |  [optional] |
|**shopAdAclk** | **String** | unique ad click referral parameter using this parameter you can get a URL of the advertisement in Google Shopping Sellers Ad URL |  [optional] |
|**productCondition** | **String** | indicated condition of the product possible values: Used, Refurbished, New, null |  [optional] |
|**productAnnotation** | **String** | data from annotations and badges with special offers if there is no annotation for this product, the value will be null examples: LOW PRICE, SPECIAL OFFER, SALE, PRICE DROP |  [optional] |




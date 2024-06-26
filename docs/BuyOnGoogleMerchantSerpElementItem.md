[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# BuyOnGoogleMerchantSerpElementItem

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements found in Google Shopping SERP |  [optional] |
|**position** | **String** | the alignment of the element in Google Shopping SERP possible values: left, right |  [optional] |
|**xpath** | **String** | XPath of the element |  [optional] |
|**domain** | **String** | domain in SERP |  [optional] |
|**title** | **String** | product title |  [optional] |
|**url** | **String** | Google Shopping URL forwarding to the product page |  [optional] |
|**details** | **String** | details and special offers if there are no details, the value will be null |  [optional] |
|**basePrice** | **Integer** | product price without tax and shipping |  [optional] |
|**tax** | **Integer** | the amount of tax tax is specified as the actual amount of money, not as the percentage |  [optional] |
|**shippingPrice** | **Integer** | product shipping price |  [optional] |
|**totalPrice** | **Long** | product price including tax and shipping |  [optional] |
|**currency** | **String** | currency in the ISO format example: USD |  [optional] |
|**sellerName** | **String** | name of the seller the name of the company that placed a corresponding product on Google Shopping |  [optional] |
|**rating** | [**RatingElement**](RatingElement.md) |  |  [optional] |
|**shopAdAclk** | **String** | unique ad click referral parameter using this parameter you can get a URL of the advertisement in Google Shopping Sellers Ad URL in this case, the value equals null |  [optional] |
|**productCondition** | **String** | indicated condition of the product possible values: Used, Refurbished, New, null |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
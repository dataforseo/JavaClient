# BaseMerchantGoogleShoppingSellersElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements found in Google Shopping SERP |[optional]|
**position** | **String** | the alignment of the element in Google Shopping SERP<br>possible values:<br>left, right |[optional]|
**xpath** | **String** | XPath of the element |[optional]|
**domain** | **String** | domain in SERP |[optional]|
**title** | **String** | product title |[optional]|
**url** | **String** | Google Shopping URL forwarding to the product page on the seller’s website<br>if you want to obtain a URL of the advertisement forwarding to the product page on the seller’s website, please refer to the Google Shopping Sellers Ad URL endpoint |[optional]|
**details** | **String** | details and special offers<br>if there are no details, the value will be null |[optional]|
**basePrice** | **Double** | product price without tax and shipping |[optional]|
**tax** | **Double** | the amount of tax<br>tax is specified as the actual amount of money, not as the percentage |[optional]|
**shippingPrice** | **Double** | product shipping price |[optional]|
**totalPrice** | **Double** | product price including tax and shipping |[optional]|
**currency** | **String** | currency in the ISO format<br>example:<br>USD |[optional]|
**sellerName** | **String** | name of the seller<br>the name of the company that placed a corresponding product on Google Shopping |[optional]|
**shopAdAclk** | **String** | unique ad click referral parameter<br>using this parameter you can get a URL of the advertisement in Google Shopping Sellers Ad URL |[optional]|
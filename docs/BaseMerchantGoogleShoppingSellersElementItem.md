# BaseMerchantGoogleShoppingSellersElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em> absolute rank in SERP</em><br>absolute position among all the elements found in Google Shopping SERP |[optional]|
**position** | **String** | <em>the alignment of the element in Google Shopping SERP</em><br>possible values:<br><code>left</code>, <code>right</code> |[optional]|
**xpath** | **String** | <em><a href='https://en.wikipedia.org/wiki/XPath'>XPath</a> of the element</em> |[optional]|
**domain** | **String** | <em>domain in SERP</em> |[optional]|
**title** | **String** | <em>product title</em> |[optional]|
**url** | **String** | <em>Google Shopping URL forwarding to the product page on the seller’s website</em><br>if you want to obtain a URL of the advertisement forwarding to the product page on the seller's website, please refer to the <a href='/v3/merchant/google/sellers/ad_url/'>Google Shopping Sellers Ad URL</a> endpoint |[optional]|
**details** | **String** | <em>details and special offers</em><br>if there are no details, the value will be <code>null</code> |[optional]|
**basePrice** | **Double** | <em>product price without tax and shipping</em> |[optional]|
**tax** | **Double** | <em>the amount of tax</em><br>tax is specified as the actual amount of money, not as the percentage |[optional]|
**shippingPrice** | **Double** | <em>product shipping price</em> |[optional]|
**totalPrice** | **Double** | <em>product price including tax and shipping</em> |[optional]|
**currency** | **String** | <em>currency in the <a href='https://en.wikipedia.org/wiki/ISO_4217'>ISO</a> format</em><br>example:<br><code>USD</code> |[optional]|
**sellerName** | **String** | <em>name of the seller</em><br>the name of the company that placed a corresponding product on Google Shopping |[optional]|
**shopAdAclk** | **String** | <em>unique ad click referral parameter</em><br>using this parameter you can get a URL of the advertisement in <a href='/v3/merchant/google/sellers/ad_url/'>Google Shopping Sellers Ad URL</a> |[optional]|
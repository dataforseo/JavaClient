# ChatGptGoogleShoppingProduct


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**ei** | **String** | <em>event identifier</em><br>internal event identifier used by Google |[optional]|
**productId** | **String** | <em>product identifier</em><br>can be used as a <code>data_docid</code> in <a href='https://docs.dataforseo.com/v3/merchant/google/overview/' target='_blank'>Google Shopping API endpoints |[optional]|
**catalogId** | **String** | <em>Google Shopping catalog identifier of the product</em><br>can be used as a <code>product_id</code> in <a href='https://docs.dataforseo.com/v3/merchant/google/overview/' target='_blank'>Google Shopping API endpoints</a> |[optional]|
**gpcid** | **String** | <em>Google product cluster identifier</em><br>can be used as a <code>gid</code> in <a href='https://docs.dataforseo.com/v3/merchant/google/overview/' target='_blank'>Google Shopping API endpoints</a> |[optional]|
**headlineOfferDocid** | **String** | <em>document identifier of the main offer in the headline</em><br>can be used as a <code>data_docid</code> in <a href='https://docs.dataforseo.com/v3/merchant/google/overview/' target='_blank'>Google Shopping API endpoints</a> |[optional]|
**imageDocid** | **String** | <em>identifier for the displayed product’s image</em> |[optional]|
**rds** | **String** | <em>resource descriptor string </em><br>internal Google resource descriptor string that identifies the product within Google's Shopping index |[optional]|
**query** | **String** | <em>search query</em><br>search query used by ChatGPT to retrieve the product from Google Shopping |[optional]|
**mid** | **String** | <em>merchant identifier</em><br>identifier of the seller or merchant account in Google Shopping |[optional]|
**pvt** | **String** | <em>product view type</em><br>internal Google parameter that specifies the product view type used when rendering the product item |[optional]|
**uule** | **String** | <em>encoded location parameter</em><br>indicates the location for a search |[optional]|
**gl** | **String** | <em>country code</em><br>indicates the location for which search results are displayed |[optional]|
**hl** | **String** | <em>host language code</em><br>indicates the language in which search results are displayed |[optional]|
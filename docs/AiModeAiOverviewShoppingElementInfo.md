# AiModeAiOverviewShoppingElementInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**productId** | **String** | <em>unique product identifier on Google Shopping</em><br>learn more about the parameter in <a href='https://dataforseo.com/help-center/product-id-google-shopping' rel='noopener noreferrer' target='_blank'>this help center guide</a> |[optional]|
**dataDocid** | **String** | <em>unique identifier of the SERP data element</em> |[optional]|
**gid** | **String** | <em>global product identifier on Google Shopping</em><br>learn more about the parameter in <a href='https://dataforseo.com/help-center/whats-a-gid-in-google-shopping-api' rel='noopener noreferrer' target='_blank'>this help center guide</a> |[optional]|
**title** | **String** | <em>reference page title</em> |[optional]|
**url** | **String** | <em>URL in link</em> |[optional]|
**domain** | **String** | <em>domain in link</em> |[optional]|
**rating** | **RatingInfo** | <em>product rating </em><br>the popularity rate based on reviews<br> if there is none, the value will be <code>null</code> |[optional]|
**price** | **AiModePriceInfo** | <em>product price</em><br>product price details on the seller's website;<br> if there is none, the value will be <code>null</code> |[optional]|
**seller** | **String** | <em>product seller</em><br>name of the product's seller as displayed in search results |[optional]|
**snippet** | **String** | <em>additional information about the result</em> |[optional]|
**marketplace** | **String** | <em>merchant account provider</em><br>e-commerce site that hosts products or websites of individual sellers under the same merchant account<br>example:<br><code>by Google</code> |[optional]|
**marketplaceUrl** | **String** | <em>URL to the merchant account provider</em><br>e-commerce site that hosts products or websites of individual sellers under the same merchant account |[optional]|
**imageUrl** | **String** | <em>URL of the image</em><br>the URL leading to the image on the original resource or DataForSEO storage (in case the original source is not available) |[optional]|
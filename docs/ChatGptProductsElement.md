# ChatGptProductsElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**productId** | **String** | <em>product id</em> |[optional]|
**merchants** | **String** | <em>merchant(s) offering the product</em> |[optional]|
**idToTokenMap** | **String** | <em>product identifier token</em><br>Base64-encoded token containing Google Shopping product IDs associated with the product |[optional]|
**title** | **String** | <em>title of the element</em> |[optional]|
**rating** | **RatingInfo** | <em>rating of the corresponding local business</em><br>popularity rate based on reviews as displayed in the results |[optional]|
**price** | **Double** | <em>product price</em> |[optional]|
**currency** | **String** | <em>currency of the listed price</em><br>ISO code of the currency applied to the price |[optional]|
**tag** | **String** | <em>tag text</em> |[optional]|
**url** | **String** | <em>URL</em> |[optional]|
**domain** | **String** | <em>domain</em> |[optional]|
**images** | **List<String>** | <em>image URLs of the element</em><br>contains URLs leading to the images on the original resource or DataForSEO storage (in case the original source is not available) |[optional]|
**productIds** | **List<ChatGptGoogleShoppingProduct>** | <em>Google Shopping product identifiers</em><br>array of Google Shopping product IDs associated with the product |[optional]|
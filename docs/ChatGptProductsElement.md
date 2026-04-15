# ChatGptProductsElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**productId** | **String** | product id |[optional]|
**merchants** | **String** | merchant(s) offering the product |[optional]|
**idToTokenMap** | **String** | product identifier tokenBase64-encoded token containing Google Shopping product IDs associated with the product |[optional]|
**title** | **String** | title of the element |[optional]|
**rating** | **RatingInfo** | rating of the corresponding local businesspopularity rate based on reviews as displayed in the results |[optional]|
**price** | **Double** | product price |[optional]|
**currency** | **String** | currency of the listed priceISO code of the currency applied to the price |[optional]|
**tag** | **String** | tag text |[optional]|
**url** | **String** | URL |[optional]|
**domain** | **String** | domain |[optional]|
**images** | **List<String>** | image URLs of the elementcontains URLs leading to the images on the original resource or DataForSEO storage (in case the original source is not available) |[optional]|
**productIds** | **List<ChatGptGoogleShoppingProduct>** | Google Shopping product identifiersarray of Google Shopping product IDs associated with the product |[optional]|
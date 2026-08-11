# PopularProductsElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | <em>title of a given link element</em> |[optional]|
**url** | **String** | <em>source URL</em> |[optional]|
**domain** | **String** | <em>domain where a link points</em> |[optional]|
**description** | **String** | <em>link description</em> |[optional]|
**moreSellers** | **Boolean** | <em>indicates whether the product is sold by multiple sellers</em> |[optional]|
**seller** | **String** | <em>seller of the product</em> |[optional]|
**imageUrl** | **String** | <em>URL of the image</em><br>the URL leading to the image on the original resource or DataForSEO storage (in case the original source is not available) |[optional]|
**price** | **PriceInfo** | <em>price indicated in the element</em> |[optional]|
**rating** | **RatingInfo** | <em>the item's rating </em><br>the popularity rate based on reviews and displayed in SERP;<br>if there is none, equals <code>null</code> |[optional]|
**productIdentifiers** | **ProductIdentifiers** | <em>identifiers of the product</em><br>can include the following identifiers: <code>product_id</code>, <code>data_docid</code>, <code>gid</code> |[optional]|
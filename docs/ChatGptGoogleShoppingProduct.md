# ChatGptGoogleShoppingProduct


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**ei** | **String** | event identifierinternal event identifier used by Google |[optional]|
**productId** | **String** | product identifiercan be used as a data_docid in Google Shopping API endpoints |[optional]|
**catalogId** | **String** | Google Shopping catalog identifier of the productcan be used as a product_id in Google Shopping API endpoints |[optional]|
**gpcid** | **String** | Google product cluster identifiercan be used as a gid in Google Shopping API endpoints |[optional]|
**headlineOfferDocid** | **String** | document identifier of the main offer in the headlinecan be used as a data_docid in Google Shopping API endpoints |[optional]|
**imageDocid** | **String** | identifier for the displayed product’s image |[optional]|
**rds** | **String** | resource descriptor string internal Google resource descriptor string that identifies the product within Google's Shopping index |[optional]|
**query** | **String** | search querysearch query used by ChatGPT to retrieve the product from Google Shopping |[optional]|
**mid** | **String** | merchant identifieridentifier of the seller or merchant account in Google Shopping |[optional]|
**pvt** | **String** | product view typeinternal Google parameter that specifies the product view type used when rendering the product item |[optional]|
**uule** | **String** | encoded location parameterindicates the location for a search |[optional]|
**gl** | **String** | country codeindicates the location for which search results are displayed |[optional]|
**hl** | **String** | host language codeindicates the language in which search results are displayed |[optional]|
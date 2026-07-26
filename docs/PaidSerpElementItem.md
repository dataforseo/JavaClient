# PaidSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em> absolute rank in SERP</em><br>absolute position among all the elements found in SERP<strong>note</strong> values are returned in the ascending order, with values corresponding to advanced SERP features omitted from the results;<br>to get all items (including SERP features and rich snippets) with their positions, please refer to the <a href='https://docs.dataforseo.com/v3/serp/google/organic/live/advanced/?php'>Google Organiс Advanced SERP</a> endpoint |[optional]|
**domain** | **String** | <em>domain in SERP</em> |[optional]|
**title** | **String** | <em>title of the results element in SERP</em> |[optional]|
**description** | **String** | <em>description of the results element in SERP</em> |[optional]|
**url** | **String** | <em> relevant URL in SERP</em> |[optional]|
**breadcrumb** | **String** | <em>breadcrumb in SERP</em> |[optional]|
**websiteName** | **String** | name of the website in SERP |[optional]|
**isImage** | **Boolean** | indicates whether the element contains an image |[optional]|
**isVideo** | **Boolean** | indicates whether the element contains a video |[optional]|
**images** | **List<AiModeImagesElementInfo>** | images of the element<br>if there are none, equals null |[optional]|
**highlighted** | **List<String>** | words highlighted in bold within the results description |[optional]|
**extra** | **Map<String, String>** | additional information about the result |[optional]|
**descriptionRows** | **List<String>** | extended description<br>if there is none, equals null |[optional]|
**links** | **List<AdLinkElement>** | link of the element |[optional]|
**price** | **PriceInfo** | pricing details<br>contains the pricing details of the product or service featured in the result;<br>if there is none, equals null |[optional]|
**rating** | **RatingInfo** | the item’s rating <br>the popularity rate based on reviews and displayed in SERP<br>if there is none, equals null |[optional]|
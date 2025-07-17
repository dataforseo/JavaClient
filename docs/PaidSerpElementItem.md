# PaidSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements found in SERP<br>note values are returned in the ascending order, with values corresponding to advanced SERP features omitted from the results;<br>to get all items (including SERP features and rich snippets) with their positions, please refer to the Google Organiс Advanced SERP endpoint |[optional]|
**domain** | **String** | domain in SERP |[optional]|
**title** | **String** | title of the results element in SERP |[optional]|
**description** | **String** | description of the results element in SERP |[optional]|
**url** | **String** | relevant URL in SERP |[optional]|
**breadcrumb** | **String** | breadcrumb in SERP |[optional]|
**websiteName** | **String** | name of the website in SERP |[optional]|
**isImage** | **Boolean** | indicates whether the element contains an image |[optional]|
**isVideo** | **Boolean** | indicates whether the element contains a video |[optional]|
**images** | **List<AiModeImagesElement>** | images of the element<br>if there are none, equals null |[optional]|
**highlighted** | **List<String>** | words highlighted in bold within the results description |[optional]|
**extra** | **Map<String, String>** | additional information about the result |[optional]|
**descriptionRows** | **List<String>** | extended description<br>if there is none, equals null |[optional]|
**links** | **List<AdLinkElement>** | sitelinks<br>the links shown below some of Google’s search results<br>if there are none, equals null |[optional]|
**price** | **PriceInfo** | pricing details<br>contains the pricing details of the product or service featured in the result |[optional]|
**rating** | **RatingElement** | the item’s rating <br>the popularity rate based on reviews and displayed in SERP |[optional]|
# BingPaidSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | domain of the ad element in SERP |[optional]|
**title** | **String** | title of the ad element in SERP |[optional]|
**description** | **String** | description of the ad element in SERP |[optional]|
**url** | **String** | relevant URL of the ad element in SERP |[optional]|
**breadcrumb** | **String** | breadcrumb of the ad element in SERP |[optional]|
**websiteName** | **String** | website name in SERP |[optional]|
**isImage** | **Boolean** | indicates whether the element contains an image |[optional]|
**isVideo** | **Boolean** | indicates whether the element contains a video |[optional]|
**images** | **List<AiModeImagesElementInfo>** | images of the element |[optional]|
**highlighted** | **List<String>** | words highlighted in bold within the results description |[optional]|
**extra** | **Map<String, String>** | additional information about the result |[optional]|
**descriptionRows** | **List<String>** | extended description<br>if there is none, equals null |[optional]|
**links** | **List<AdLinkElement>** | links featured in the organic result |[optional]|
**price** | **PriceInfo** | price of the shopping element |[optional]|
**rating** | **RatingInfo** | the item’s rating<br>the popularity rate based on reviews and displayed in SERP |[optional]|
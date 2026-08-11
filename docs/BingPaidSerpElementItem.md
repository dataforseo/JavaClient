# BingPaidSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**domain** | **String** | <em>domain of the ad element in SERP</em> |[optional]|
**title** | **String** | <em>title of the ad element in SERP</em> |[optional]|
**description** | **String** | <em>description of the ad element in SERP</em> |[optional]|
**url** | **String** | <em>relevant URL of the ad element in SERP</em> |[optional]|
**breadcrumb** | **String** | <em>breadcrumb of the ad element in SERP</em> |[optional]|
**websiteName** | **String** | <em>website name in SERP</em> |[optional]|
**isImage** | **Boolean** | <em>indicates whether the element contains an <code class='prettyprint'>image</code></em> |[optional]|
**isVideo** | **Boolean** | <em>indicates whether the element contains a <code class='prettyprint'>video</code></em> |[optional]|
**checks** | **List<String>** |  |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images of the element</em><br>            if there are none, equals <code>null</code> |[optional]|
**highlighted** | **List<String>** | <em>words highlighted in bold within the results <code>description</code></em> |[optional]|
**extra** | **Map<String, String>** | <em>additional information about the result</em> |[optional]|
**descriptionRows** | **List<String>** | <em>extended description</em><br>            if there is none, equals <code>null</code> |[optional]|
**links** | **List<AdLinkElement>** | <em>links featured in the organic result</em> |[optional]|
**price** | **PriceInfo** | <em>price of booking a place for the specified dates of stay</em> |[optional]|
**rating** | **RatingInfo** | <em>the item's rating </em><br>            the popularity rate based on reviews and displayed in SERP |[optional]|
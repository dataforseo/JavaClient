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
**websiteName** | **String** | <em>name of the website in SERP</em> |[optional]|
**isImage** | **Boolean** | <em>indicates whether the element contains an_<code class='prettyprint'>image</code></em><br><strong>Note:</strong> this check no longer appears in SERPn |[optional]|
**isVideo** | **Boolean** | <em>indicates whether the element contains a <code class='prettyprint'>video</code></em><br><strong>Note:</strong> this check no longer appears in SERP |[optional]|
**checks** | **List<String>** | <em>array of properties detected for the SERP element</em><br>lists the properties that are true for this element<br>each value in the array represents a detected property <br>example:<br>if <code>is_image</code> is present in the array, the element contains an image<br>possible values in the array:<br><code>is_image</code>, <code>is_video</code>, <code>is_featured_snippet</code>, <code>amp_version</code>, <code>is_malicious</code>, <code>is_web_story</code>, <code>is_highly_cited</code><br>equals <code>null</code> if none of the properties are detected for the element<br>learn more about the <code>checks</code> array in <a href='https://dataforseo.com/help-center/whats-a-checks-array-in-the-google-organic-serp-api' target='_blank'>this Help Center article</a> |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images of the element</em><br>if there are none, equals <code>null</code> |[optional]|
**highlighted** | **List<String>** | <em>words highlighted in bold within the results <code>description</code></em> |[optional]|
**extra** | **Map<String, String>** | <em>additional information about the result</em> |[optional]|
**descriptionRows** | **List<String>** | <em>extended description</em><br>if there is none, equals <code>null</code> |[optional]|
**links** | **List<AdLinkElement>** | <em>link of the element</em> |[optional]|
**price** | **PriceInfo** | <em>pricing details</em><br>contains the pricing details of the product or service featured in the result;<br>if there is none, equals <code>null</code> |[optional]|
**rating** | **RatingInfo** | <em>the item's rating </em><br>the popularity rate based on reviews and displayed in SERP<br>if there is none, equals <code>null</code> |[optional]|
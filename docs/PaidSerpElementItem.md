[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# PaidSerpElementItem

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**title** | **String** | title of the result in SERP |  [optional] |
|**domain** | **String** | domain where a link points |  [optional] |
|**breadcrumb** | **String** | breadcrumb in SERP |  [optional] |
|**isImage** | **Boolean** | indicates whether the element contains an image |  [optional] |
|**isVideo** | **Boolean** | indicates whether the element contains a video |  [optional] |
|**images** | [**List&lt;ImagesElement&gt;**](ImagesElement.md) | images of the element |  [optional] |
|**url** | **String** | relevant URL in SERP |  [optional] |
|**highlighted** | **List&lt;String&gt;** | words highlighted in bold within the results description |  [optional] |
|**extra** | **Map&lt;String, String&gt;** | additional information about the result |  [optional] |
|**description** | **String** | description of the results element in SERP |  [optional] |
|**descriptionRows** | **List&lt;String&gt;** | extended description if there is none, equals null |  [optional] |
|**links** | [**List&lt;AdLinkElement&gt;**](AdLinkElement.md) | sitelinks the links shown below some of Google’s search results if there are none, equals null |  [optional] |
|**price** | [**PriceInfo**](PriceInfo.md) |  |  [optional] |
|**rectangle** | [**Rectangle**](Rectangle.md) |  |  [optional] |
|**websiteName** | **String** | website name in SERP |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
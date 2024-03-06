[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# MerchantAmazonReviewsTaskGetAdvancedResultInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asin** | **String** | asin received in a POST array |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**spell** | [**SpellInfo**](SpellInfo.md) |  |  [optional] |
|**title** | **String** | title of the product on Amazon the title of the product for which the reviews are collected |  [optional] |
|**image** | [**ImagesElement**](ImagesElement.md) |  |  [optional] |
|**rating** | [**RatingElement**](RatingElement.md) |  |  [optional] |
|**reviewsCount** | **Long** | the total number of reviews |  [optional] |
|**itemTypes** | **List&lt;String&gt;** | type of search results in Amazon SERP contains types of search results (items) found in Amazon SERP; possible item types: amazon_review_item |  [optional] |
|**itemsCount** | **Long** | the number of reviews items in the results array you can get more results by using the depth parameter when setting a task |  [optional] |
|**items** | [**List&lt;BaseAmazonSerpElementItem&gt;**](BaseAmazonSerpElementItem.md) | found reviews you can get more results by using the depth parameter when setting a task |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
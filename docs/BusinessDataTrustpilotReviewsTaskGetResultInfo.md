[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# BusinessDataTrustpilotReviewsTaskGetResultInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** | domain of the business entity |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**title** | **String** | title of the ‘reviews’ element on Trustpilot the name of the business entity for which the reviews are collected |  [optional] |
|**location** | **String** | location of the business entity as specified on Trustpilot address of the business entity for which the reviews are collected |  [optional] |
|**reviewsCount** | **Long** | the total number of reviews |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**itemsCount** | **Long** | the number of items in the results array you can get more results by using the depth parameter when setting a task |  [optional] |
|**items** | [**List&lt;BaseBusinessDataSerpElementItem&gt;**](BaseBusinessDataSerpElementItem.md) | found reviews you can get more results by using the depth parameter when setting a task |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# TripadvisorReviewSearchBusinessDataSerpElementItem

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank among all the listed reviews absolute position among all reviews on the list |  [optional] |
|**position** | **String** | the alignment of the review in SERP can take the following values: right |  [optional] |
|**url** | **String** | URL of the review |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**dateOfVisit** | **String** | date of the reviewer’s visit to the local establishment in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**timestamp** | **String** | date and time when the review was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**title** | **String** | title of the review |  [optional] |
|**reviewText** | **String** | content of the review |  [optional] |
|**reviewImages** | [**List&lt;ImageUrlInfo&gt;**](ImageUrlInfo.md) | contains URLs of the images used in the review |  [optional] |
|**userProfile** | [**BusinessDataUserProfileInfo**](BusinessDataUserProfileInfo.md) |  |  [optional] |
|**responses** | [**List&lt;ReviewResponseItemInfo&gt;**](ReviewResponseItemInfo.md) | contains information about the owner’s response |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
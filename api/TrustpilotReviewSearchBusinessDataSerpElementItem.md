

# TrustpilotReviewSearchBusinessDataSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**position** | **String** | the alignment of the review in SERP can take the following values: right |  [optional] |
|**url** | **String** | the URL of the review |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**verified** | **Boolean** | indicates whether the review has the “Verified” mark |  [optional] |
|**language** | **String** | the language of the review |  [optional] |
|**timestamp** | **String** | date and time when a review was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**title** | **String** | the title of the review |  [optional] |
|**reviewText** | **String** | the content of the review |  [optional] |
|**reviewImages** | **List&lt;String&gt;** | images submitted by the reviewer displays URLs to the images provided by the author of the review; please note that Trustpilot doesn’t allow adding images to reviews, so the review_images parameter will always equal null |  [optional] |
|**userProfile** | [**BusinessDataUserProfileInfo**](BusinessDataUserProfileInfo.md) |  |  [optional] |
|**responses** | [**List&lt;ReviewResponseItemInfo&gt;**](ReviewResponseItemInfo.md) | owner’s response to the submitted review |  [optional] |




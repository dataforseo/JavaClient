

# YelpReviewsSearchBusinessDataSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank among all the listed reviews absolute position among all reviews on the list |  [optional] |
|**position** | **String** | the alignment of the review in SERP can take the following values: left |  [optional] |
|**reviewId** | **String** | the unique identifier of a review received from Yelp example: WvjNtncj8PDZytbofWlC5A |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**timestamp** | **String** | the time of publication indicates timestamp of when the review was listed |  [optional] |
|**reviewText** | **String** | the content of the review |  [optional] |
|**reviewImages** | **List&lt;String&gt;** | images submitted by the reviewer you will find URLs to the images provided by the author of this review |  [optional] |
|**userProfile** | [**BusinessDataUserProfileInfo**](BusinessDataUserProfileInfo.md) |  |  [optional] |
|**responses** | [**List&lt;ReviewResponseItemInfo&gt;**](ReviewResponseItemInfo.md) | text of the owner’s response |  [optional] |




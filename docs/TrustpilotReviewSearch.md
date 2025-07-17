# TrustpilotReviewSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank among all the listed reviews<br>absolute position among all reviews on the list |[optional]|
**position** | **String** | the alignment of the review in SERP<br>can take the following values: right |[optional]|
**url** | **String** | the URL of the review |[optional]|
**rating** | **RatingElement** | the rating score submitted by the reviewer |[optional]|
**verified** | **Boolean** | indicates whether the review has the “Verified” mark |[optional]|
**language** | **String** | the language of the review |[optional]|
**timestamp** | **String** | date and time when a review was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**title** | **String** | the title of the review |[optional]|
**reviewText** | **String** | the content of the review |[optional]|
**reviewImages** | **List<String>** | images submitted by the reviewer<br>displays URLs to the images provided by the author of the review;<br>please note that Trustpilot doesn’t allow adding images to reviews, so the review_images parameter will always equal null |[optional]|
**userProfile** | **BusinessDataUserProfileInfo** | user profile of the reviewer |[optional]|
**responses** | **List<ReviewResponseItemInfo>** | owner’s response to the submitted review |[optional]|
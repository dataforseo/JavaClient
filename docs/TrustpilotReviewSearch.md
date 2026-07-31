# TrustpilotReviewSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank among all the listed reviews</em><br>absolute position among all reviews on the list |[optional]|
**position** | **String** | <em>the alignment of the review in SERP</em><br>can take the following values: <code>right</code> |[optional]|
**url** | **String** | <em>the URL of the review</em> |[optional]|
**rating** | **RatingInfo** | <em>the rating score submitted by the reviewer</em> |[optional]|
**verified** | **Boolean** | <em>indicates whether the review has the 'Verified' mark</em> |[optional]|
**language** | **String** | <em>the language of the review</em> |[optional]|
**timestamp** | **String** | <em>date and time when a review was published</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**title** | **String** | <em>the title of the review</em> |[optional]|
**reviewText** | **String** | <em>the content of the review</em> |[optional]|
**reviewImages** | **List<String>** | <em>images submitted by the reviewer</em><br>displays URLs to the images provided by the author of the review;<br><strong>please note</strong> that Trustpilot doesn't allow adding images to reviews, so the <code>review_images</code> parameter will always equal <code>null</code> |[optional]|
**userProfile** | **BusinessDataUserProfileInfo** | <em>user profile of the reviewer</em> |[optional]|
**responses** | **List<ReviewResponseItemInfo>** | <em>owner's response to the submitted review</em> |[optional]|
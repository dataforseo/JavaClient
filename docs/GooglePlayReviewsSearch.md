# GooglePlayReviewsSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank among all the listed reviews<br>absolute position among all reviews on the list |[optional]|
**position** | **String** | the alignment of the review in SERP<br>can take the following values: left |[optional]|
**version** | **String** | version of the app<br>version of the app for which the review is submitted |[optional]|
**rating** | **RatingElement** | the rating score submitted by the reviewer |[optional]|
**timestamp** | **String** | date and time when the review was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**id** | **String** | id of the review |[optional]|
**helpfulCount** | **Long** | number of helpful votes<br>indicates how many users considered the review helpful and voted with the thumbs up icon |[optional]|
**title** | **String** | title of the review<br>Google Play doesn’t provide an option to title reviews, so this parameter will always equal null |[optional]|
**reviewText** | **String** | content of the review |[optional]|
**userProfile** | **AppUserProfileInfo** | user profile of the reviewer |[optional]|
**responses** | **List<ResponseDataInfo>** | response from the developer |[optional]|
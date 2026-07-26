# GoogleExtendedReviewsSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank among all the listed reviews</em><br>absolute position among all reviews on the list |[optional]|
**position** | **String** | <em>the alignment of the review in SERP</em><br>can take the following values: <code>right</code> |[optional]|
**xpath** | **String** | <em>the <a href='https://en.wikipedia.org/wiki/XPath' rel='noopener noreferrer' target='_blank'>XPath</a> of the review</em> |[optional]|
**reviewText** | **String** | <em>the content of the review</em> |[optional]|
**originalReviewText** | **String** | <em>original content of the review</em><br>the original content of the review, no auto-translate applied |[optional]|
**timeAgo** | **String** | <em>the time of publication</em><br>indicates the time (in the 'time ago' format) when the review was listed |[optional]|
**timestamp** | **String** | <em>date and time when a review was published</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**rating** | **RatingInfo** | <em>the rating score submitted by the reviewer</em> |[optional]|
**reviewsCount** | **Long** | <em>total number of reviews submitted by the reviewer</em> |[optional]|
**photosCount** | **Long** | <em>total number of photos submitted by the reviewer</em> |[optional]|
**localGuide** | **Boolean** | <em>indicates whether the reviewer has a 'local guide' status</em> |[optional]|
**profileName** | **String** | <em>profile name of the reviewer</em> |[optional]|
**profileUrl** | **String** | <em>URL of the reviewer's profile</em> |[optional]|
**reviewUrl** | **String** | <em>the URL of the review</em> |[optional]|
**profileImageUrl** | **String** | <em>URL of the reviewer's profile image</em> |[optional]|
**ownerAnswer** | **String** | <em>text of the owner's response</em><br>the owner's response to the review |[optional]|
**originalOwnerAnswer** | **String** | <em>original text of the owner's response</em><br>the original response to the review, no auto-translate applied |[optional]|
**ownerTimeAgo** | **String** | <em>publication time</em><br>indicates the time (in the 'time ago' format) when the owner submitted the response to the review |[optional]|
**ownerTimestamp** | **String** | <em>date and time of the owner's reply to the review</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**reviewId** | **String** | <em>the unique identifier of a review on Google</em><br>example:<br><code>ChZDSUhNMG9nS0VJQ0FnSUMxbHFyMFlnEAE</code> |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images submitted by the reviewer</em> |[optional]|
**reviewHighlights** | **List<ReviewHighlights>** | <em>review highlights</em><br>contains highlighted review criteria and assessments |[optional]|
**source** | **Source** | <em>source of the review</em><br>contains information about the source where the review was posted |[optional]|
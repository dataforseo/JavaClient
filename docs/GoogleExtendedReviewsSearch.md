# GoogleExtendedReviewsSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank among all the listed reviews<br>absolute position among all reviews on the list |[optional]|
**position** | **String** | the alignment of the review in SERP<br>can take the following values: right |[optional]|
**xpath** | **String** | the XPath of the review |[optional]|
**reviewText** | **String** | the content of the review |[optional]|
**originalReviewText** | **String** | original content of the review<br>the original content of the review, no auto-translate applied |[optional]|
**timeAgo** | **String** | the time of publication<br>indicates the time (in the ‘time ago’ format) when the review was listed |[optional]|
**timestamp** | **String** | date and time when a review was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**rating** | **RatingElement** | the rating score submitted by the reviewer |[optional]|
**reviewsCount** | **Long** | total number of reviews submitted by the reviewer |[optional]|
**photosCount** | **Long** | total number of photos submitted by the reviewer |[optional]|
**localGuide** | **Boolean** | indicates whether the reviewer has a ‘local guide’ status |[optional]|
**profileName** | **String** | profile name of the reviewer |[optional]|
**profileUrl** | **String** | URL of the reviewer’s profile |[optional]|
**reviewUrl** | **String** | the URL of the review |[optional]|
**profileImageUrl** | **String** | URL of the reviewer’s profile image |[optional]|
**ownerAnswer** | **String** | text of the owner’s response<br>the owner’s response to the review |[optional]|
**originalOwnerAnswer** | **String** | original text of the owner’s response<br>the original response to the review, no auto-translate applied |[optional]|
**ownerTimeAgo** | **String** | publication time<br>indicates the time (in the ‘time ago’ format) when the owner submitted the response to the review |[optional]|
**ownerTimestamp** | **String** | date and time of the owner’s reply to the review<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**reviewId** | **String** | the unique identifier of a review on Google<br>example:<br>ChZDSUhNMG9nS0VJQ0FnSUMxbHFyMFlnEAE |[optional]|
**images** | **List<AiModeImagesElement>** | images submitted by the reviewer |[optional]|
**reviewHighlights** | **List<ReviewHighlights>** | review highlights<br>contains highlighted review criteria and assessments |[optional]|
**source** | **Source** | source of the review<br>contains information about the source where the review was posted |[optional]|
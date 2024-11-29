

# GoogleReviewsSearchBusinessDataSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**position** | **String** | the alignment of the review in SERP can take the following values: right |  [optional] |
|**xpath** | **String** | the XPath of the review |  [optional] |
|**reviewText** | **String** | the content of the review |  [optional] |
|**originalReviewText** | **String** | original content of the review the original content of the review, no auto-translate applied |  [optional] |
|**timeAgo** | **String** | the time of publication indicates the time (in the ‘time ago’ format) when the review was listed |  [optional] |
|**timestamp** | **String** | date and time when a review was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**reviewsCount** | **Long** | total number of reviews submitted by the reviewer |  [optional] |
|**photosCount** | **Long** | total number of photos submitted by the reviewer |  [optional] |
|**localGuide** | **Boolean** | indicates whether the reviewer has a ‘local guide’ status |  [optional] |
|**profileName** | **String** | profile name of the reviewer |  [optional] |
|**profileUrl** | **String** | URL of the reviewer’s profile |  [optional] |
|**reviewUrl** | **String** | the URL of the review |  [optional] |
|**profileImageUrl** | **String** | URL of the reviewer’s profile image |  [optional] |
|**ownerAnswer** | **String** | text of the owner’s response the owner’s response to the review |  [optional] |
|**originalOwnerAnswer** | **String** | original text of the owner’s response the original response to the review, no auto-translate applied |  [optional] |
|**ownerTimeAgo** | **String** | publication time indicates the time (in the ‘time ago’ format) when the owner submitted the response to the review |  [optional] |
|**ownerTimestamp** | **String** | date and time of the owner’s reply to the review in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**reviewId** | **String** | the unique identifier of a review on Google example: ChZDSUhNMG9nS0VJQ0FnSUMxbHFyMFlnEAE |  [optional] |
|**images** | [**List&lt;ImagesElement&gt;**](ImagesElement.md) | images submitted by the reviewer |  [optional] |
|**reviewHighlights** | [**List&lt;ReviewHighlights&gt;**](ReviewHighlights.md) | review highlights contains highlighted review criteria and assessments |  [optional] |




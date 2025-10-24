# TripadvisorReviewSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank among all the listed reviews<br>absolute position among all reviews on the list |[optional]|
**position** | **String** | the alignment of the review in SERP<br>can take the following values: right |[optional]|
**url** | **String** | URL of the review |[optional]|
**rating** | **RatingInfo** | the rating score submitted by the reviewer |[optional]|
**dateOfVisit** | **String** | date of the reviewer’s visit to the local establishment<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**timestamp** | **String** | date and time when the review was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**reviewId** | **String** | ID of the review |[optional]|
**title** | **String** | title of the review |[optional]|
**reviewText** | **String** | content of the review |[optional]|
**language** | **String** | language of the review text |[optional]|
**originalLanguage** | **String** | language of the untranslated review text |[optional]|
**reviewImages** | **List<ImageUrlInfo>** | contains URLs of the images used in the review |[optional]|
**userProfile** | **BusinessDataUserProfileInfo** | information from the reviewer’s profile |[optional]|
**responses** | **List<ReviewResponseItemInfo>** | contains information about the owner’s response |[optional]|
**reviewHighlights** | **Object** | review highlights<br>contains highlighted review criteria and assessments |[optional]|
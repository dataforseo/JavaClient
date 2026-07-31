# TripadvisorReviewSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank among all the listed reviews</em><br>absolute position among all reviews on the list |[optional]|
**position** | **String** | <em>the alignment of the review in SERP</em><br>can take the following values: <code>right</code> |[optional]|
**url** | **String** | <em>URL of the review</em> |[optional]|
**rating** | **RatingInfo** | <em>the rating score submitted by the reviewer</em> |[optional]|
**dateOfVisit** | **String** | <em>date of the reviewer's visit to the local establishment</em><br>in the UTC format: 'yyyy-mm-dd hh-mm-ss +00:00'<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**timestamp** | **String** | <em>date and time when the review was published</em><br>in the UTC format: 'yyyy-mm-dd hh-mm-ss +00:00'<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**reviewId** | **String** | <em>ID of the review</em> |[optional]|
**title** | **String** | <em>title of the review</em> |[optional]|
**reviewText** | **String** | <em>content of the review</em> |[optional]|
**language** | **String** | <em>language of the review text</em> |[optional]|
**originalLanguage** | **String** | <em>language of the untranslated review text</em> |[optional]|
**reviewImages** | **List<ImageUrlInfo>** | <em>contains URLs of the images used in the review</em> |[optional]|
**userProfile** | **BusinessDataUserProfileInfo** | <em>information from the reviewer's profile</em> |[optional]|
**responses** | **List<ReviewResponseItemInfo>** | <em>contains information about the owner's response</em> |[optional]|
**reviewHighlights** | **Object** | <em>review highlights</em><br>contains highlighted review criteria and assessments |[optional]|
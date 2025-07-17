# AmazonReviewItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank among all the listed reviews<br>absolute position among all reviews on the list |[optional]|
**position** | **String** | the alignment of the review in SERP<br>can take the following values: right |[optional]|
**xpath** | **String** | the XPath of the element |[optional]|
**verified** | **Boolean** | indicates whether the review has the “Verified Purchase” mark |[optional]|
**subtitle** | **String** | subtitle of the review |[optional]|
**helpfulVotes** | **String** | helpful votes count<br>number of users who clicked on the ‘Helpful” button under the review text |[optional]|
**images** | **List<AiModeImagesElement>** | images of the product submitted by the reviewer |[optional]|
**videos** | **List<VideoElement>** | videos of the product submitted by the reviewer |[optional]|
**userProfile** | **UserProfileInfo** | user profile of the reviewer |[optional]|
**title** | **String** | title of the review |[optional]|
**url** | **String** | URL to the reviewer’s profile |[optional]|
**reviewText** | **String** | content of the review |[optional]|
**publicationDate** | **String** | date and time when the review was published<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**rating** | **RatingElement** | the rating score submitted by the reviewer |[optional]|
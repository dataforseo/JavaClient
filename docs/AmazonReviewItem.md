# AmazonReviewItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank among all the listed reviews</em><br>absolute position among all reviews on the list |[optional]|
**position** | **String** | <em>the alignment of the review in SERP</em><br>can take the following values: <code>right</code> |[optional]|
**xpath** | **String** | <em>the <a href='https://en.wikipedia.org/wiki/XPath'>XPath</a> of the element</em> |[optional]|
**verified** | **Boolean** | <em>indicates whether the review has the 'Verified Purchase' mark</em> |[optional]|
**subtitle** | **String** | <em>subtitle of the review</em> |[optional]|
**helpfulVotes** | **String** | <em>helpful votes count</em><br>number of users who clicked on the 'Helpful' button under the review text |[optional]|
**images** | **List<AiModeImagesElementInfo>** | <em>images of the product submitted by the reviewer</em> |[optional]|
**videos** | **List<VideoElement>** | <em>videos of the product submitted by the reviewer</em> |[optional]|
**userProfile** | **UserProfileInfo** | <em>user profile of the reviewer</em> |[optional]|
**title** | **String** | <em>title of the review</em> |[optional]|
**url** | **String** |  |[optional]|
**reviewText** | **String** | <em>content of the review</em> |[optional]|
**publicationDate** | **String** | <em>date and time when the review was published</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**rating** | **RatingInfo** | <em>the rating score submitted by the reviewer</em> |[optional]|
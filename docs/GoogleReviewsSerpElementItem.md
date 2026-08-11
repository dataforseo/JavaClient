# GoogleReviewsSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values;<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code>;<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**reviewsCount** | **Long** | <i>the number of reviews</i> |[optional]|
**rating** | **RatingInfo** | <em>the element's rating</em><br>the popularity rate based on reviews and displayed in SERP;<br>if there is none, equals <code>null</code> |[optional]|
**placeId** | **String** | <em>the identifier of a place</em> |[optional]|
**feature** | **String** | <i>the additional feature of the review</i> |[optional]|
**cid** | **String** | <em>google-defined client id</em> |[optional]|
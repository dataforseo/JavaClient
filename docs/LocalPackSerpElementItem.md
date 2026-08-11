# LocalPackSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values;<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code>;<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP<br>always equals <code>0</code> for <code>desktop</code> |[optional]|
**title** | **String** | <em>title of the row</em> |[optional]|
**description** | **String** | <em>description of the link</em> |[optional]|
**domain** | **String** | <em>domain of the website hosting the video</em> |[optional]|
**phone** | **String** | <em>phone number</em> |[optional]|
**bookingUrl** | **String** | <em>URL of the booking page</em> |[optional]|
**url** | **String** | <i>URL of the third-party review source</i> |[optional]|
**isPaid** | **Boolean** | <em>indicates whether the element is an ad</em> |[optional]|
**rating** | **RatingInfo** | <em>the element's rating</em><br>the popularity rate based on reviews and displayed in SERP;<br>if there is none, equals <code>null</code> |[optional]|
**cid** | **String** | <em>google-defined client id</em> |[optional]|
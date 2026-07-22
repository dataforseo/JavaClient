# LocalPackSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values;<br>positions of elements with different type values are omitted from rank_group;<br>always equals 0 for desktop |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP<br>always equals 0 for desktop |[optional]|
**title** | **String** | title of the row |[optional]|
**description** | **String** | description of the link |[optional]|
**domain** | **String** | domain of the website hosting the video |[optional]|
**phone** | **String** | phone number |[optional]|
**bookingUrl** | **String** | URL of the booking page |[optional]|
**url** | **String** | URL of the third-party review source |[optional]|
**isPaid** | **Boolean** | indicates whether the element is an ad |[optional]|
**rating** | **RatingInfo** | the element’s rating<br>the popularity rate based on reviews and displayed in SERP;<br>if there is none, equals null |[optional]|
**cid** | **String** | google-defined client id |[optional]|
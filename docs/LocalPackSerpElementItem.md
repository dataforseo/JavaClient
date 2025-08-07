# LocalPackSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values;<br>positions of elements with different type values are omitted from rank_group;<br>always equals 0 for desktop |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP<br>always equals 0 for desktop |[optional]|
**title** | **String** | reference page title |[optional]|
**description** | **String** | link description |[optional]|
**domain** | **String** | domain name of the reference |[optional]|
**phone** | **String** | phone number |[optional]|
**url** | **String** | URL |[optional]|
**isPaid** | **Boolean** | indicates whether the element is an ad |[optional]|
**rating** | **RatingElement** | the element’s rating<br>the popularity rate based on reviews and displayed in SERP |[optional]|
**cid** | **String** | google-defined client id |[optional]|
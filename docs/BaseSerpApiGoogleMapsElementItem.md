# BaseSerpApiGoogleMapsElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**domain** | **String** | domain in SERP |[optional]|
**title** | **String** | title of the element |[optional]|
**url** | **String** | search URL with refinement parameters |[optional]|
**rating** | **RatingElement** | the element’s rating <br>the popularity rate based on reviews and displayed in SERP |[optional]|
**ratingDistribution** | **Map<String, Integer>** | the distribution of ratings of the business entity<br>the object displays the number of 1-star to 5-star ratings, as reviewed by users |[optional]|
# BusinessDataTripadvisorReviewsTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**urlPath** | **String** | URL path received in a POST array |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | search engine domain in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**title** | **String** | title of the ‘reviews’ element in SERP<br>the name of the local establishment for which the reviews are collected |[optional]|
**location** | **String** | location of the local establishment<br>address of the local establishment for which the reviews are collected |[optional]|
**reviewsCount** | **Long** | the total number of reviews |[optional]|
**rating** | **RatingElement** | rating of the corresponding local establishment<br>popularity rate based on reviews and displayed in SERP |[optional]|
**ratingDistribution** | **Map<String, Integer>** | rating distribution by votes<br>the distribution of votes across the rating in the range from 1 to 5 |[optional]|
**itemsCount** | **Long** | the number of reviews items in the results array<br>you can get more results by using the depth parameter when setting a task |[optional]|
**items** | **List<TripadvisorReviewSearch>** | found reviews<br>you can get more results by using the depth parameter when setting a task |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
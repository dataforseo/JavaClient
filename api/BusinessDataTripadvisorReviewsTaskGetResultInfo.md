

# BusinessDataTripadvisorReviewsTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**urlPath** | **String** | URL path received in a POST array |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**title** | **String** | title of the ‘reviews’ element in SERP the name of the local establishment for which the reviews are collected |  [optional] |
|**location** | **String** | location of the local establishment address of the local establishment for which the reviews are collected |  [optional] |
|**reviewsCount** | **Long** | the total number of reviews |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**ratingDistribution** | **Map&lt;String, Integer&gt;** | rating distribution by votes the distribution of votes across the rating in the range from 1 to 5 |  [optional] |
|**itemsCount** | **Long** | the number of reviews items in the results array you can get more results by using the depth parameter when setting a task |  [optional] |
|**items** | [**List&lt;BaseBusinessDataSerpElementItem&gt;**](BaseBusinessDataSerpElementItem.md) | found reviews you can get more results by using the depth parameter when setting a task |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |






# BusinessDataYelpReviewsTaskGetResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword received in a POST array this field will contain the alias parameter if it was specified in a POST array |  [optional] |
|**alias** | **String** | Yelp business identifier |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **String** | location code in a POST array if location_code was not specified in a POST array, the value equals null |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to Yelp results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**title** | **String** | title of the reviews from Yelp the name of the local establishment for which the reviews are collected |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**reviewsCount** | **Long** | the total number of reviews |  [optional] |
|**itemsCount** | **Long** | the number of reviews items in the results array you can get more results by using the depth parameter when setting a task |  [optional] |
|**items** | [**List&lt;BaseBusinessDataSerpElementItem&gt;**](BaseBusinessDataSerpElementItem.md) | found reviews you can get more results by using the depth parameter when setting a task |  [optional] |




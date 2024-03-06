[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# AppDataAppleAppReviewsTaskGetAdvancedResultInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | application id received in a POST array |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**title** | **String** | title of the app title of the application for which the reviews are collected |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**reviewsCount** | **Long** | the total number of reviews in this case, the value will be null as App Store does not indicate the total number of app reviews |  [optional] |
|**itemsCount** | **Long** | the number of reviews items in the results array you can get more results by using the depth parameter when setting a task |  [optional] |
|**items** | [**List&lt;BaseAppDataSerpElementItem&gt;**](BaseAppDataSerpElementItem.md) | found reviews |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
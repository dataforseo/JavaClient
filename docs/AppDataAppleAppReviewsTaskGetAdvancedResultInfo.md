# AppDataAppleAppReviewsTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**appId** | **String** | <em>application id received in a POST array</em> |[optional]|
**type** | **String** | type of element |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**title** | **String** | <em>title of the app</em><br>title of the application for which the reviews are collected |[optional]|
**rating** | **RatingInfo** | <em>rating of the app</em><br>rating of the application for which the reviews are collected |[optional]|
**reviewsCount** | **Long** | <em>the total number of reviews</em><br>in this case, the value will be <code>null</code> as App Store does not indicate the total number of app reviews |[optional]|
**itemsCount** | **Long** | <em>the number of reviews items in the results array</em><br>you can get more results by using the <code>depth</code> parameter when setting a task |[optional]|
**items** | **List<AppStoreReviewsSearch>** | <em>found reviews</em> |[optional]|
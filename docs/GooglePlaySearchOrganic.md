# GooglePlaySearchOrganic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP |[optional]|
**position** | **String** | <em>the alignment of the element in SERP</em><br>can take the following values:<br><code>left</code>, <code>right</code> |[optional]|
**appId** | **String** | <em>id of the app in a POST array</em> |[optional]|
**title** | **String** | <em>title of the app</em> |[optional]|
**url** | **String** | <em>URL to the app page on Google Play</em> |[optional]|
**icon** | **String** | <em>URL to the app icon</em> |[optional]|
**reviewsCount** | **Long** | <em>the total number of reviews of the app</em> |[optional]|
**rating** | **RatingInfo** | <em>average rating of the app</em> |[optional]|
**isFree** | **Boolean** |  |[optional]|
**price** | **PriceInfo** |  |[optional]|
**developer** | **String** | <em>name of the app developer</em> |[optional]|
**developerUrl** | **String** | <em>URL to the developer page on Google Play</em> |[optional]|
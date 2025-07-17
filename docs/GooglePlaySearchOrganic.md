# GooglePlaySearchOrganic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**position** | **String** | the alignment of the element in SERP<br>can take the following values:<br>left, right |[optional]|
**appId** | **String** | id of the app |[optional]|
**title** | **String** | title of the app |[optional]|
**url** | **String** | URL to the app page on Google Play |[optional]|
**icon** | **String** | URL to the app icon |[optional]|
**reviewsCount** | **Long** | the total number of reviews of the app |[optional]|
**rating** | **RatingElement** | average rating of the app |[optional]|
**isFree** | **Boolean** | indicates whether the app is free |[optional]|
**price** | **PriceInfo** | price of the app |[optional]|
**developer** | **String** | name of the app developer |[optional]|
**developerUrl** | **String** | URL to the developer page on Google Play |[optional]|
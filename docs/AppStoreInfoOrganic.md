# AppStoreInfoOrganic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank among all the listed apps<br>absolute position among all apps on the list |[optional]|
**position** | **String** | the alignment of the element in SERP<br>can take the following values: left |[optional]|
**appId** | **String** | ID of the app |[optional]|
**title** | **String** | title of the app |[optional]|
**url** | **String** | URL to the app page on App Store |[optional]|
**icon** | **String** | URL to the app icon |[optional]|
**description** | **String** | description of the app |[optional]|
**reviewsCount** | **Long** | the total number of reviews of the app |[optional]|
**rating** | **RatingElement** | average rating of the app |[optional]|
**price** | **PriceInfo** | price of the app |[optional]|
**isFree** | **Boolean** | indicates whether the app is free |[optional]|
**mainCategory** | **String** | main category/genre of the app |[optional]|
**categories** | **List<String>** | all relevant categories/genres of the app |[optional]|
**languages** | **List<String>** | languages supported in the app |[optional]|
**advisories** | **List<String>** | age rating and age-based content advisories |[optional]|
**developer** | **String** | name of the app developer |[optional]|
**developerId** | **String** | ID of the app developer |[optional]|
**developerUrl** | **String** | URL to the developer page on App Store |[optional]|
**version** | **String** | current version of the app |[optional]|
**minimumOsVersion** | **String** | minimum OS version required to install the app |[optional]|
**size** | **String** | size of the app |[optional]|
**releasedDate** | **String** | date and time when the app was released<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**lastUpdateDate** | **String** | date and time when the app was last updated<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**updateNotes** | **String** | update notes<br>contains the latest update notes from the developer |[optional]|
**images** | **List<String>** | app images<br>contains URLs to the images used on the app page on App Store |[optional]|
**similarApps** | **List<AppsInfo>** | similar apps<br>displays apps similar to the app in a POST request |[optional]|
**moreAppsByDeveloper** | **List<AppsInfo>** | similar apps<br>information about apps built by the same developer |[optional]|
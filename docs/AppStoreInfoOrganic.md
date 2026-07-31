# AppStoreInfoOrganic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank among all the listed apps</em><br>absolute position among all apps on the list |[optional]|
**position** | **String** | <em>the alignment of the element in SERP</em><br>can take the following values: <code>left</code> |[optional]|
**appId** | **String** | <em>ID of the app</em> |[optional]|
**title** | **String** | <em>title of the app</em> |[optional]|
**subtitle** | **String** | <em>subtitle of the app</em> |[optional]|
**url** | **String** | <em>URL to the app page on App Store</em> |[optional]|
**icon** | **String** | <em>URL to the app icon</em> |[optional]|
**description** | **String** | <em>description of the app</em> |[optional]|
**reviewsCount** | **Long** | <em>the total number of reviews of the app</em> |[optional]|
**rating** | **RatingInfo** | <em>average rating of the app</em> |[optional]|
**price** | **PriceInfo** | <em>price of the app</em> |[optional]|
**isFree** | **Boolean** | <em>indicates whether the app is free</em> |[optional]|
**mainCategory** | **String** | <em>main category/genre of the app</em> |[optional]|
**categories** | **List<String>** | <em>all relevant categories/genres of the app</em><br><strong>Note:</strong> this field returns only one relevant category in the array |[optional]|
**languages** | **List<String>** | <em>languages supported in the app</em><br><strong>Note:</strong> this field returns only one supported language in the array |[optional]|
**advisories** | **List<String>** | <em>age rating and age-based content advisories</em> |[optional]|
**developer** | **String** | <em>name of the app developer</em> |[optional]|
**developerId** | **String** | <em>ID of the app developer</em> |[optional]|
**developerUrl** | **String** | <em>URL to the developer page on App Store</em> |[optional]|
**version** | **String** | <em>current version of the app</em> |[optional]|
**minimumOsVersion** | **String** | <em>minimum OS version required to install the app</em> |[optional]|
**size** | **String** | <em>size of the app</em> |[optional]|
**releasedDate** | **String** | <em>date and time when the app was released</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br><code>2019-11-15 12:57:46 +00:00</code><br><strong>Note:</strong> this field is deprecated and always returns <code>null</code> |[optional]|
**lastUpdateDate** | **String** | <em>date and time when the app was last updated</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**updateNotes** | **String** | <em>update notes</em><br>contains the latest update notes from the developer |[optional]|
**images** | **List<String>** | <em>app images</em><br>contains URLs to the images used on the app page on App Store |[optional]|
**similarApps** | **List<AppsInfo>** | <em>similar apps</em><br>displays apps similar to the app in a POST request |[optional]|
**moreAppsByDeveloper** | **List<AppsInfo>** | <em>similar apps</em><br>information about apps built by the same developer |[optional]|
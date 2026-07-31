# GooglePlayInfoOrganic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank among all the listed apps</em><br>absolute position among all apps on the list |[optional]|
**position** | **String** | <em>the alignment of the element in SERP</em><br>can take the following values: <code>left</code> |[optional]|
**appId** | **String** | <em>ID of the app</em> |[optional]|
**title** | **String** | <em>title of the app</em> |[optional]|
**url** | **String** | <em>URL to the app page on Google Play</em> |[optional]|
**icon** | **String** | <em>URL to the app icon</em> |[optional]|
**description** | **String** | <em>description of the app</em> |[optional]|
**reviewsCount** | **Long** | <em>the total number of reviews the app has</em> |[optional]|
**rating** | **RatingInfo** | <em>average rating of the app</em> |[optional]|
**price** | **PriceInfo** | <em>price of the app</em> |[optional]|
**isFree** | **Boolean** | <em>indicates whether the app is free</em> |[optional]|
**mainCategory** | **String** | <em>main category of the app</em> |[optional]|
**installs** | **String** | <em>number of installs of the app</em><br>approximate number of installs as displayed on the app page |[optional]|
**installsCount** | **Long** | <em>number of installs of the app</em><br>the exact number of installs of the app |[optional]|
**developer** | **String** | <em>name of the app developer</em> |[optional]|
**developerId** | **String** | <em>ID of the app developer</em> |[optional]|
**developerUrl** | **String** | <em>URL to the developer page on Google Play</em> |[optional]|
**developerEmail** | **String** | <em>email address of the developer</em> |[optional]|
**developerAddress** | **String** | <em>physical address of the developer</em> |[optional]|
**developerWebsite** | **String** | <em>official website of the developer</em> |[optional]|
**version** | **String** | <em>current version of the app</em> |[optional]|
**minimumOsVersion** | **String** | <em>minimum OS version required to install the app</em> |[optional]|
**size** | **String** | <em>size of the app</em> |[optional]|
**releasedDate** | **String** | <em>date and time when the app was released</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**lastUpdateDate** | **String** | <em>date and time when the app was last updated</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**updateNotes** | **String** | <em>update notes</em><br>contains the latest update notes from the developer |[optional]|
**images** | **List<String>** | <em>app images</em><br>contains URLs to the images published on the app page on Google Play |[optional]|
**videos** | **List<String>** | <em>app videos</em><br>contains URLs to the video published on the app page on Google Play |[optional]|
**similarApps** | **List<AppsInfo>** | <em>similar apps</em><br>displays apps similar to the app in a POST request |[optional]|
**moreAppsByDeveloper** | **List<AppsInfo>** | <em>similar apps</em><br>information about apps built by the same developer |[optional]|
**genres** | **List<String>** | <em>app genres</em><br>contains relevant app categories |[optional]|
**tags** | **List<String>** | <em>app tags</em><br>contains relevant app tags |[optional]|
[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# BusinessDataBusinessListingsSearchLiveItem

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**title** | **String** | title of the element in SERP the name of the business entity for which the results are collected |  [optional] |
|**description** | **String** | description of the element in SERP the description of the business entity for which the results are collected |  [optional] |
|**category** | **String** | business category Google My Business general category that best describes the services provided by the business entity |  [optional] |
|**categoryIds** | **List&lt;String&gt;** | global category IDs universal category IDs that do not change based on the selected country |  [optional] |
|**additionalCategories** | **List&lt;String&gt;** | additional business categories additional Google My Business categories that describe the services provided by the business entity in more detail |  [optional] |
|**cid** | **String** | google-defined client id unique id of a local establishment learn more about the identifier in this help center article |  [optional] |
|**featureId** | **String** | the unique identifier of the element in SERP learn more about the identifier in this help center article |  [optional] |
|**address** | **String** | address of the business entity |  [optional] |
|**addressInfo** | [**AddressInfo**](AddressInfo.md) |  |  [optional] |
|**placeId** | **String** | unique place identifier place id of the local establishment featured in the element learn more about the identifier in this help center article |  [optional] |
|**phone** | **String** | phone number of the business entity |  [optional] |
|**url** | **String** | absolute url of the business entity |  [optional] |
|**domain** | **String** | domain of the business entity |  [optional] |
|**logo** | **String** | URL of the logo featured in Google My Business profile |  [optional] |
|**mainImage** | **String** | URL of the main image featured in Google My Business profile |  [optional] |
|**totalPhotos** | **Long** | total count of images featured in Google My Business profile |  [optional] |
|**snippet** | **String** | additional information on the business entity |  [optional] |
|**latitude** | **Float** | latitude coordinate of the local establishments in google maps example: \&quot;latitude\&quot;: 51.584091 |  [optional] |
|**longitude** | **Float** | longitude coordinate of the local establishment in google maps example: \&quot;longitude\&quot;: -0.31365919999999997 |  [optional] |
|**isClaimed** | **Boolean** | shows whether the entity is verified by its owner on Google Maps |  [optional] |
|**attributes** | [**BusinessDataAttributesInfo**](BusinessDataAttributesInfo.md) |  |  [optional] |
|**placeTopics** | **Map&lt;String, Long&gt;** | keywords mentioned in customer reviews contains most popular keywords related to products/services mentioned in customer reviews of a business entity and the number of reviews mentioning each keyword example:  \&quot;place_topics\&quot;: { \&quot;egg roll\&quot;: 48, \&quot;birthday\&quot;: 33 } |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**ratingDistribution** | **Map&lt;String, Integer&gt;** | the distribution of ratings of the business entity the object displays the number of 1-star to 5-star ratings, as reviewed by users |  [optional] |
|**peopleAlsoSearch** | [**List&lt;PeopleAlsoSearch&gt;**](PeopleAlsoSearch.md) | related business entities |  [optional] |
|**workTime** | [**WorkInfo**](WorkInfo.md) |  |  [optional] |
|**popularTimes** | [**PopularTimes**](PopularTimes.md) |  |  [optional] |
|**localBusinessLinks** | [**List&lt;BaseLocalBusinessLink&gt;**](BaseLocalBusinessLink.md) | available interactions with the business list of options to interact with the business directly from search results |  [optional] |
|**contactInfo** | [**List&lt;BusinessDataContactInfo&gt;**](BusinessDataContactInfo.md) | available contacts of the business list of contacts to interact with the business |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**lastUpdatedTime** | **String** | date and time when the data was last updated in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2023-01-26 09:03:15 +00:00 |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
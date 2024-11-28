

# GoogleBusinessInfoBusinessDataSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**position** | **String** | the alignment in SERP |  [optional] |
|**title** | **String** | title of the element in SERP the name of the business entity for which the results are collected |  [optional] |
|**description** | **String** | description of the element in SERP the description of the business entity for which the results are collected |  [optional] |
|**category** | **String** | business category Google My Business general category that best describes the services provided by the business entity |  [optional] |
|**categoryIds** | **List&lt;String&gt;** | global category IDs universal category IDs that do not change based on the selected country |  [optional] |
|**additionalCategories** | **List&lt;String&gt;** | additional business categories additional Google My Business categories that describe the services provided by the business entity in more detail |  [optional] |
|**cid** | **String** | google-defined client id unique id of a local establishment; can be used with Google Reviews API to get a full list of reviews learn more about the identifier in this help center article |  [optional] |
|**featureId** | **String** | the unique identifier of the element in SERP learn more about the identifier in this help center article |  [optional] |
|**address** | **String** | address of the business entity |  [optional] |
|**addressInfo** | [**AddressInfo**](AddressInfo.md) |  |  [optional] |
|**placeId** | **String** | unique place identifier place id of the local establishment featured in the element learn more about the identifier in this help center article |  [optional] |
|**phone** | **String** | phone number of the business entity |  [optional] |
|**url** | **String** | absolute url of the business entity |  [optional] |
|**contactUrl** | **String** | URL of the preferred contact page |  [optional] |
|**contributorUrl** | **String** | URL of the user’s or entity’s Local Guides profile, if available |  [optional] |
|**bookOnlineUrl** | **String** | URL in the ‘book online’ button of the element URL directing users to the online booking or order page of the business entity |  [optional] |
|**domain** | **String** | domain of the business entity |  [optional] |
|**logo** | **String** | URL of the logo featured in Google My Business profile |  [optional] |
|**mainImage** | **String** | URL of the main image featured in Google My Business profile |  [optional] |
|**totalPhotos** | **Long** | total count of images featured in Google My Business profile |  [optional] |
|**snippet** | **String** | additional information on the business entity |  [optional] |
|**latitude** | **Float** | latitude coordinate of the local establishments in google maps example: \&quot;latitude\&quot;: 51.584091 |  [optional] |
|**longitude** | **Float** | longitude coordinate of the local establishment in google maps example: \&quot;longitude\&quot;: -0.31365919999999997 |  [optional] |
|**isClaimed** | **Boolean** | shows whether the entity is verified by its owner on Google Maps |  [optional] |
|**questionsAndAnswersCount** | **Integer** |  |  [optional] |
|**attributes** | [**BusinessDataAttributesInfo**](BusinessDataAttributesInfo.md) |  |  [optional] |
|**placeTopics** | **Map&lt;String, Long&gt;** | keywords mentioned in customer reviews contains most popular keywords related to products/services mentioned in customer reviews of a business entity and the number of reviews mentioning each keyword example:  \&quot;place_topics\&quot;: { \&quot;egg roll\&quot;: 48, \&quot;birthday\&quot;: 33 } |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**hotelRating** | **Integer** | hotel class rating class ratings range between 1-5 stars, learn more if there is no hotel class rating information, the value will be null |  [optional] |
|**priceLevel** | **String** | property price level can take values: inexpensive, moderate, expensive, very_expensive if there is no price level information, the value will be null |  [optional] |
|**ratingDistribution** | **Map&lt;String, Integer&gt;** | the distribution of ratings of the business entity the object displays the number of 1-star to 5-star ratings, as reviewed by users |  [optional] |
|**peopleAlsoSearch** | [**List&lt;PeopleAlsoSearch&gt;**](PeopleAlsoSearch.md) | related business entities |  [optional] |
|**workTime** | [**WorkTime**](WorkTime.md) |  |  [optional] |
|**popularTimes** | [**PopularTimes**](PopularTimes.md) |  |  [optional] |
|**localBusinessLinks** | [**List&lt;BaseLocalBusinessLink&gt;**](BaseLocalBusinessLink.md) | available interactions with the business list of options to interact with the business directly from search results |  [optional] |
|**isDirectoryItem** | **Boolean** | business establishment is a part of the directory indicates whether the business establishment is a part of the directory; if true, the item is a part of the larger directory of businesses with the same address (e.g., a mall or a business centre); note: if the business establishment is a parent item in the directory, the value will be null |  [optional] |
|**directory** | [**BusinessDirectoryInfo**](BusinessDirectoryInfo.md) |  |  [optional] |




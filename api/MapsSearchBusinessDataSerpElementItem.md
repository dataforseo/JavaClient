

# MapsSearchBusinessDataSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | position within a group of elements with identical type values positions of elements with different type values are omitted from the rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank among all the elements |  [optional] |
|**domain** | **String** | domain of the business entity |  [optional] |
|**title** | **String** | directory title can take the following values: At this place, Directory |  [optional] |
|**url** | **String** | URL to view the menu |  [optional] |
|**rating** | [**RatingInfo**](RatingInfo.md) |  |  [optional] |
|**ratingDistribution** | **Map&lt;String, Integer&gt;** | the distribution of ratings of the business entity the object displays the number of 1-star to 5-star ratings, as reviewed by users |  [optional] |
|**snippet** | **String** | additional information about the business entity |  [optional] |
|**address** | **String** | address of the business entity |  [optional] |
|**addressInfo** | [**AddressInfo**](AddressInfo.md) |  |  [optional] |
|**placeId** | **String** | unique place identifier place id of the local establishment featured in the element learn more about the identifier in this help center article |  [optional] |
|**phone** | **String** | phone number of the business entity |  [optional] |
|**mainImage** | **String** | URL of the main image featured in Google My Business profile |  [optional] |
|**totalPhotos** | **Long** | total count of images featured in Google My Business profile |  [optional] |
|**category** | **String** | business category Google My Business general category that best describes the services provided by the business entity |  [optional] |
|**additionalCategories** | **List&lt;String&gt;** | additional business categories additional Google My Business categories that describe the services provided by the business entity in more detail |  [optional] |
|**priceLevel** | **String** | property price level can take values: inexpensive, moderate, expensive, very_expensive if there is no price level information, the value will be null |  [optional] |
|**hotelRating** | **Integer** | hotel class rating class ratings range between 1-5 stars, learn more if there is no hotel class rating information, the value will be null |  [optional] |
|**categoryIds** | **List&lt;String&gt;** | global category IDs universal category IDs that do not change based on the selected country |  [optional] |
|**workHours** | [**WorkInfo**](WorkInfo.md) |  |  [optional] |
|**featureId** | **String** | the unique identifier of the element in SERP learn more about the identifier in this help center article |  [optional] |
|**cid** | **String** | google-defined client id unique id of a local establishment; can be used with Google Reviews API to get a full list of reviews learn more about the identifier in this help center article |  [optional] |
|**latitude** | **Float** | latitude coordinate of the local establishments in google maps example: \&quot;latitude\&quot;: 51.584091 |  [optional] |
|**longitude** | **Float** | longitude coordinate of the local establishment in google maps example: \&quot;longitude\&quot;: -0.31365919999999997 |  [optional] |
|**isClaimed** | **Boolean** | shows whether the entity is verified by its owner on Google Maps |  [optional] |
|**localJustifications** | **List&lt;String&gt;** | Google local justifications snippets of text that “justify” why the business is showing up for search query |  [optional] |
|**isDirectoryItem** | **Boolean** | business establishment is a part of the directory indicates whether the business establishment is a part of the directory; if true, the item is a part of the larger directory of businesses with the same address (e.g., a mall or a business centre); note: if the business establishment is a parent item in the directory, the value will be null |  [optional] |




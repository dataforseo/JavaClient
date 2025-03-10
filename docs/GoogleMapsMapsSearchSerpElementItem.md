

# GoogleMapsMapsSearchSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originalTitle** | **String** | original title of the element original title not translated by Google |  [optional] |
|**contactUrl** | **String** | URL of the preferred contact page |  [optional] |
|**contributorUrl** | **String** | URL of the user’s or entity’s Local Guides profile, if available |  [optional] |
|**bookOnlineUrl** | **String** | URL in the ‘book online’ button of the element URL directing users to the online booking or order page of the business entity |  [optional] |
|**hotelRating** | **Integer** | hotel class rating class ratings range between 1-5 stars, learn more if there is no hotel class rating information, the value will be null |  [optional] |
|**priceLevel** | **String** | property price level can take values: inexpensive, moderate, expensive, very_expensive if there is no price level information, the value will be null |  [optional] |
|**snippet** | **String** | element snippet contains the address and other information about the local establishment featured in the element |  [optional] |
|**address** | **String** | address line address of the local establishment featured in the element |  [optional] |
|**addressInfo** | [**AddressInfo**](AddressInfo.md) |  |  [optional] |
|**placeId** | **String** | unique place identifier place id of the local establishment featured in the element |  [optional] |
|**phone** | **String** | phone number phone number of the local establishment featured in the element |  [optional] |
|**mainImage** | **String** | URL of the main image featured in Google My Business profile |  [optional] |
|**totalPhotos** | **Long** | total count of images featured in Google My Business profile |  [optional] |
|**category** | **String** | business category Google My Business general category that best describes the services provided by the business entity |  [optional] |
|**additionalCategories** | **List&lt;String&gt;** | additional business categories additional Google My Business categories that describe the services provided by the business entity in more detail |  [optional] |
|**categoryIds** | **List&lt;String&gt;** | global category IDs universal category IDs that do not change based on the selected country |  [optional] |
|**workHours** | [**WorkHours**](WorkHours.md) |  |  [optional] |
|**featureId** | **String** | the unique identifier of the element in SERP |  [optional] |
|**cid** | **String** | google-defined client id unique id of a local establishment; can be used with Google Reviews API to get a full list of reviews |  [optional] |
|**latitude** | **Float** | latitude coordinate of the local establishments in google maps example: \&quot;latitude\&quot;: 51.584091 |  [optional] |
|**longitude** | **Float** | longitude coordinate of the local establishment in google maps example: \&quot;longitude\&quot;: -0.31365919999999997 |  [optional] |
|**isClaimed** | **Boolean** | indicates whether ownership of this local establishment is claimed |  [optional] |
|**localJustifications** | [**List&lt;LocalJustificationInfo&gt;**](LocalJustificationInfo.md) | Google local justifications snippets of text that “justify” why the business is showing up for search query |  [optional] |
|**isDirectoryItem** | **Boolean** | indicates whether this local establishment is a directory |  [optional] |




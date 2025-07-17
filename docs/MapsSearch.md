# MapsSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | position within a group of elements with identical type values<br>positions of elements with different type values are omitted from the rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank among all the elements |[optional]|
**domain** | **String** | domain of the business entity |[optional]|
**title** | **String** | directory title<br>can take the following values: At this place, Directory |[optional]|
**url** | **String** | URL to view the menu |[optional]|
**rating** | **RatingElement** | the element’s rating <br>the popularity rate based on reviews and displayed in SERP |[optional]|
**ratingDistribution** | **Map<String, Integer>** | the distribution of ratings of the business entity<br>the object displays the number of 1-star to 5-star ratings, as reviewed by users |[optional]|
**snippet** | **String** | additional information about the business entity |[optional]|
**address** | **String** | address of the business entity |[optional]|
**addressInfo** | **AddressInfo** | object containing address components of the business entity |[optional]|
**placeId** | **String** | unique place identifier<br>place id of the local establishment featured in the element<br>learn more about the identifier in this help center article |[optional]|
**phone** | **String** | phone number of the business entity |[optional]|
**mainImage** | **String** | URL of the main image featured in Google My Business profile |[optional]|
**totalPhotos** | **String** | total count of images featured in Google My Business profile |[optional]|
**category** | **String** | business category<br>Google My Business general category that best describes the services provided by the business entity |[optional]|
**additionalCategories** | **List<String>** | additional business categories<br>additional Google My Business categories that describe the services provided by the business entity in more detail |[optional]|
**priceLevel** | **String** | property price level<br>can take values: inexpensive, moderate, expensive, very_expensive<br>if there is no price level information, the value will be null |[optional]|
**hotelRating** | **String** | hotel class rating<br>class ratings range between 1-5 stars, learn more<br>if there is no hotel class rating information, the value will be null |[optional]|
**categoryIds** | **List<String>** | global category IDs<br>universal category IDs that do not change based on the selected country |[optional]|
**workHours** | **BusinessWorkHoursInfo** | open hours<br>information about work hours of the local establishment |[optional]|
**featureId** | **String** | the unique identifier of the element in SERP<br>learn more about the identifier in this help center article |[optional]|
**cid** | **String** | google-defined client id<br>unique id of a local establishment;<br>can be used with Google Reviews API to get a full list of reviews<br>learn more about the identifier in this help center article |[optional]|
**latitude** | **Double** | latitude coordinate of the local establishments in google maps<br>example:<br>'latitude': 51.584091 |[optional]|
**longitude** | **Double** | longitude coordinate of the local establishment in google maps<br>example:<br>'longitude': -0.31365919999999997 |[optional]|
**isClaimed** | **Boolean** | shows whether the entity is verified by its owner on Google Maps |[optional]|
**localJustifications** | **List<String>** | Google local justifications<br>snippets of text that “justify” why the business is showing up for search query |[optional]|
**isDirectoryItem** | **Boolean** | business establishment is a part of the directory<br>indicates whether the business establishment is a part of the directory;<br>if true, the item is a part of the larger directory of businesses with the same address (e.g., a mall or a business centre);<br>note: if the business establishment is a parent item in the directory, the value will be null |[optional]|
# ItemsGoogleBusinessInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**rankGroup** | **Integer** | <em>position within a group of elements with identical <code>type</code> values</em><br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank among all the elements</em> |[optional]|
**position** | **String** | <em>the alignment in SERP</em> |[optional]|
**title** | **String** | <em>title of the element in SERP</em><br>the name of the business entity for which the results are collected |[optional]|
**originalTitle** | **String** | <em>original title of the element</em><br>original title not translated by Google |[optional]|
**description** | **String** | <em>description of the element in SERP</em><br>the description of the business entity for which the results are collected |[optional]|
**category** | **String** | <em>business category</em><br>Google My Business general category that best describes the services provided by the business entity |[optional]|
**categoryIds** | **List<String>** | <em>global category IDs</em><br>universal category IDs that do not change based on the selected country |[optional]|
**additionalCategories** | **List<String>** | <em>additional business categories</em><br>additional Google My Business categories that describe the services provided by the business entity in more detail |[optional]|
**cid** | **String** | <em>google-defined client id</em><br>unique id of a local establishment;<br>can be used with <a href='/v3/reviews/google/overview/?php' target='_blank' rel='noopener noreferrer'>Google Reviews API</a> to get a full list of reviews<br>learn more about the identifier in <a href='https://dataforseo.com/help-center/what-is-cid-place-id-feature-id' target='_blank' rel='noopener noreferrer'>this help center article</a> |[optional]|
**featureId** | **String** | <em>the unique identifier of the element in SERP</em><br>learn more about the identifier in <a href='https://dataforseo.com/help-center/what-is-cid-place-id-feature-id' target='_blank' rel='noopener noreferrer'>this help center article</a> |[optional]|
**address** | **String** | <em>address of the business entity</em> |[optional]|
**addressInfo** | **AddressInfo** | <em>object containing address components of the business entity</em> |[optional]|
**placeId** | **String** | <em>unique place identifier</em><br><a href='https://developers.google.com/places/place-id'>place id</a> of the local establishment featured in the element<br>learn more about the identifier in <a href='https://dataforseo.com/help-center/what-is-cid-place-id-feature-id' target='_blank' rel='noopener noreferrer'>this help center article</a> |[optional]|
**phone** | **String** | <em>phone number of the business entity</em> |[optional]|
**url** | **String** | <em>absolute url of the business entity</em> |[optional]|
**contactUrl** | **String** | <em>URL of the preferred contact page</em> |[optional]|
**contributorUrl** | **String** | <em>URL of the user's or entity's Local Guides profile, if available</em> |[optional]|
**bookOnlineUrl** | **String** | <em>URL in the 'book online' button of the element</em><br>URL directing users to the online booking or order page of the business entity |[optional]|
**domain** | **String** | <em>domain of the business entity</em> |[optional]|
**logo** | **String** | <em>URL of the logo featured in Google My Business profile</em> |[optional]|
**mainImage** | **String** | <em>URL of the main image featured in Google My Business profile</em> |[optional]|
**totalPhotos** | **Long** | <em>total count of images featured in Google My Business profile</em> |[optional]|
**snippet** | **String** | <em>additional information on the business entity</em> |[optional]|
**latitude** | **Double** | <i>latitude coordinate of the local establishments in google maps</i><br>example:<br><code>'latitude': 51.584091</code> |[optional]|
**longitude** | **Double** | <i>longitude coordinate of the local establishment in google maps</i><br>example:<br><code>'longitude': -0.31365919999999997</code> |[optional]|
**isClaimed** | **Boolean** | <i>shows whether the entity is verified by its owner on Google Maps</i> |[optional]|
**attributes** | **BusinessDataAttributesInfo** | <em>service details in a form of user-reviewed checks;</em><br>service details of a business entity displayed in a form of checks and based on user feedback and business <code>category</code> |[optional]|
**placeTopics** | **Map<String, Long>** | <em>keywords mentioned in customer reviews</em><br>contains most popular keywords related to products/services mentioned in customer reviews of a business entity and the number of reviews mentioning each keyword<br>example:<br> <code><br>'place_topics': {<br>'egg roll': 48,<br>'birthday': 33<br>}</code> |[optional]|
**rating** | **RatingInfo** | <em>the element's rating </em><br>the popularity rate based on reviews and displayed in SERP |[optional]|
**hotelRating** | **String** | <em>hotel class rating</em><br>class ratings range between 1-5 stars, <a href='https://support.google.com/business/answer/7660515?hl=en' rel='noopener noreferrer' target='_blank'>learn more</a><br>if there is no hotel class rating information, the value will be <code>null</code> |[optional]|
**priceLevel** | **String** | <em>property price level</em><br>can take values: <code>inexpensive</code>, <code>moderate</code>, <code>expensive</code>, <code>very_expensive</code><br>if there is no price level information, the value will be <code>null</code> |[optional]|
**ratingDistribution** | **Map<String, Integer>** | <em>the distribution of ratings of the business entity</em><br>the object displays the number of 1-star to 5-star ratings, as reviewed by users |[optional]|
**peopleAlsoSearch** | **List<PeopleAlsoSearch>** | <em>related business entities</em> |[optional]|
**workTime** | **BusinessWorkHoursInfo** | <em>work time details</em><br>information related to operational hours of the business entity |[optional]|
**popularTimes** | **Object** | <em>popular times</em><br>information related to busy hours of the business entity |[optional]|
**localBusinessLinks** | **Object** | <em>available interactions with the business</em><br>list of options to interact with the business directly from search results |[optional]|
**isDirectoryItem** | **Boolean** | <em>business establishment is a part of the directory</em><br>indicates whether the business establishment is a part of the directory;<br>if <code>true</code>, the item is a part of the larger directory of businesses with the same address (e.g., a mall or a business centre);<br><strong>note:</strong> if the business establishment is a parent item in the directory, the value will be <code>null</code> |[optional]|
**directory** | **Object** | <em>items of the directory</em><br>includes information about businesses that are located within the target business establishment and have the same address |[optional]|
**services** | **List<BusinessDataServiceInfo>** | <em>list of services offered by the business</em> |[optional]|
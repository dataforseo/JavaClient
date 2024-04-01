

# BusinessDataGoogleHotelInfoLiveHtmlRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hotelIdentifier** | **String** | unique hotel identifier required field unique identifier of a hotel entity in Google search; you can obtain the value by making a request to Advanced Google SERP API (enclosed in the hotels element of the response), or the Hotel Searches endpoint of Business Data API example: ChYIq6SB--i6p6cpGgovbS8wN2s5ODZfEAE |  [optional] |
|**priority** | **Integer** | task priority optional field can take the following values: 1 – normal execution priority (set by default) 2 – high execution priority You will be additionally charged for the tasks with high execution priority. The cost can be calculated on the Pricing page. |  [optional] |
|**locationName** | **String** | full name of search engine location required field if you don’t specify location_code or location_coordinate if you use this field, you don’t need to specify location_code or location_coordinate you can receive the list of available locations with location_name by making a separate request to https://api.dataforseo.com/v3/business_data/google/locations example: London,England,United Kingdom |  [optional] |
|**locationCode** | **Integer** | search engine location code required field if you don’t specify location_name or location_coordinate if you use this field, you don’t need to specify location_name or location_coordinate you can receive the list of available locations with location_code by making a separate request to the https://api.dataforseo.com/v3/business_data/google/locations example: 2840 |  [optional] |
|**locationCoordinate** | **String** | GPS coordinates of a location required field if you don’t specify location_name or location_code if you use this field, you don’t need to specify location_name or location_code location_coordinate parameter should be specified in the “latitude,longitude” format the maximum number of decimal digits for “latitude” and “longitude”: 7 Note: if the coordinates are used to set a location, the search will occur in the nearest settlement; example: 53.476225,-2.243572 |  [optional] |
|**languageName** | **String** | full name of search engine language required field if you don’t specify language_code if you use this field, you don’t need to specify language_code you can receive the list of available languages with language_name by making a separate request to https://api.dataforseo.com/v3/business_data/google/languages example: English |  [optional] |
|**languageCode** | **String** | search engine language code required field if you don’t specify language_name if you use this field, you don’t need to specify language_name you can receive the list of available languages with their language_code by making a separate request to https://api.dataforseo.com/v3/business_data/google/languages example: en |  [optional] |
|**checkIn** | **String** | check-in date optional field if you don’t specify this field, tomorrow’s date will be used by default; date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2019-01-15\&quot; |  [optional] |
|**checkOut** | **String** | check-out date optional field if you don’t specify this field, our system will apply the date of two days from now by default; date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2019-01-15\&quot; |  [optional] |
|**currency** | **String** | currency optional field example: \&quot;USD\&quot; |  [optional] |
|**adults** | **Integer** | number of adults optional field if you don’t specify this field, two adults will be used by default example: 1 |  [optional] |
|**children** | **List&lt;String&gt;** | number and age of children optional field if you don’t specify this field, no children will be included in the search; set the following value if you want to include one 14-years-old child: [14] set the following value if you want to include one 13-years-old child and one 8-years-old child: [13,8] |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data array of the response |  [optional] |




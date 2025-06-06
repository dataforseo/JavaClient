

# AppDataGoogleAppReviewsTaskPostRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | id of the app required field ID of the mobile application on Google Play; you can find the ID in the URL of every app listed on Google Play; example: https://play.google.com/store/apps/details?id&#x3D;org.telegram.messenger |  [optional] |
|**locationName** | **String** | full name of search engine location required field if you don’t specify location_code if you use this field, you don’t need to specify location_code you can receive the list of available locations of the search engine with their location_name by making a separate request to https://api.dataforseo.com/v3/app_data/google/locations example: West Los Angeles,California,United States |  [optional] |
|**locationCode** | **Integer** | search engine location code required field if you don’t specify location_name if you use this field, you don’t need to specify location_name you can receive the list of available locations of the search engine with their location_code by making a separate request to https://api.dataforseo.com/v3/app_data/google/locations example: 9061121 |  [optional] |
|**languageName** | **String** | full name of search engine language required field if you don’t specify language_code if you use this field, you don’t need to specify language_code you can receive the list of available languages with language_name by making a separate request to https://api.dataforseo.com/v3/app_data/google/languages example: English |  [optional] |
|**languageCode** | **String** | search engine language code required field if you don’t specify language_name if you use this field, you don’t need to specify language_name you can receive the list of available languages with their language_code by making a separate request to https://api.dataforseo.com/v3/app_data/google/languages example: en |  [optional] |
|**priority** | **Integer** | task priority optional field can take the following values: 1 – normal execution priority (set by default) 2 – high execution priority You will be additionally charged for the tasks with high execution priority. The cost can be calculated on the Pricing page. |  [optional] |
|**depth** | **Integer** | parsing depth optional field number of reviews to be returned in the API response; we strongly recommend setting the parsing depth in the multiples of 150, because our system processes 150 reviews in a row; default value: 150; maximum value: 100000 |  [optional] |
|**rating** | **Integer** | filter reviews by rating optional field you can use this field to filter the results; possible types of filtering: 5 — return reviews with five-star rating only; 4 — return reviews with four-star rating only; 3 — return reviews with three-star rating only; 2 — return reviews with two-star rating only; 1 — return reviews with one-star rating only; by default, the API returns all reviews regardless of the number of stars |  [optional] |
|**sortBy** | **String** | results sorting parameters optional field you can use this field to sort the results; possible types of sorting: newest — sort by the most recent reviews; most_relevant — sort by the most relevant reviews; default rule: most_relevant |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |
|**postbackUrl** | **String** | return URL for sending task results optional field once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/postbackscript?id&#x3D;$id http://your-server.com/postbackscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in postback_url will be urlencoded; i.a., the # character will be encoded into %23 |  [optional] |
|**postbackData** | **String** | postback_url datatype required field if you specify postback_url corresponds to the datatype that will be sent to your server possible values: advanced, html |  [optional] |
|**pingbackUrl** | **String** | notification URL of a completed task optional field when a task is completed we will notify you by GET request sent to the URL you have specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/pingscript?id&#x3D;$id http://your-server.com/pingscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in pingback_url will be urlencoded; i.a., the # character will be encoded into %23 |  [optional] |




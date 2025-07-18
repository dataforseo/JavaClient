# SerpYoutubeVideoCommentsLiveAdvancedRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**videoId** | **String** | ID of the video<br>required field<br>you can find video ID in the URL or ‘youtube_video’ item of YouTube Organic result<br>example:<br>vQXvyV0zIP4 |[optional]|
**locationName** | **String** | full name of search engine location<br>required field if you don’t specify location_code<br>if you use this field, you don’t need to specify location_code<br>you can receive the list of available locations of the search engine with their location_name by making a separate request to the https://api.dataforseo.com/v3/serp/youtube/locations<br>example:<br>United States |[optional]|
**locationCode** | **Integer** | search engine location code<br>required field if you don’t specify location_name <br>if you use this field, you don’t need to specify location_name<br>you can receive the list of available locations of the search engines with their location_code by making a separate request to the https://api.dataforseo.com/v3/serp/youtube/locations<br>example:<br>2840 |[optional]|
**languageName** | **String** | full name of search engine language<br>required field if you don’t specify language_code<br>if you use this field, you don’t need to specify language_code<br>you can receive the list of available languages of the search engine with their language_name by making a separate request to the https://api.dataforseo.com/v3/serp/youtube/languages<br>example:<br>English |[optional]|
**languageCode** | **String** | search engine language code<br>required field if you don’t specify language_name<br>if you use this field, you don’t need to specify language_name<br>you can receive the list of available languages of the search engine with their language_code by making a separate request to the https://api.dataforseo.com/v3/serp/youtube/languages<br>example:<br>en |[optional]|
**device** | **String** | device type<br>optional field<br>only value: desktop |[optional]|
**os** | **String** | device operating system<br>optional field<br>choose from the following values: windows, macos<br>default value: windows |[optional]|
**depth** | **Integer** | parsing depth<br>optional field<br>number of results in SERP<br>default value: 20<br>max value: 700<br>Note: your account will be billed per each SERP containing up to 20 results;<br>thus, setting a depth above 20 may result in additional charges if the search engine returns more than 20 results;<br>if the specified depth is higher than the number of results in the response, the difference will be refunded automatically to your account balance |[optional]|
**tag** | **String** | user-defined task identifier<br>optional field<br>the character limit is 255<br>you can use this parameter to identify the task and match it with the result<br>you will find the specified tag value in the data object of the response |[optional]|
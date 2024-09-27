

# KeywordsDataBingKeywordPerformanceLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keywords** | **List&lt;String&gt;** | keywords required field The maximum number of keywords you can specify: 1000 The maximum number of characters for each keyword: 80 The maximum number of words for each keyword phrase: 10 the specified keywords will be converted to lowercase, data will be provided in a separate array learn more about rules and limitations of keyword and keywords fields in DataForSEO APIs in this Help Center article |  [optional] |
|**device** | **String** | device type optional field specify this field if you want to get the data for a particular device typepossible values: desktop, mobile, tablet, all default value: all |  [optional] |
|**match** | **String** | keywords match type optional field can take the following values: aggregate returns data across all match types; broad returns data for all user queries containing the specified keyword with varying word order; phrase returns data for all user queries containing the specified keyword with identical word order; exact returns data for user query that matches the specified keyword;Note: the aggregate match type is applied by default |  [optional] |
|**locationName** | **String** | full name of search engine location required field if you don’t specify location_code or location_coordinate if you use this field, you don’t need to specify location_code or location_coordinate you can receive the list of available locations and languages by making a separate request to https://api.dataforseo.com/v3/keywords_data/bing/keyword_performance/locations_and_languages example: \&quot;United States\&quot; |  [optional] |
|**locationCode** | **Integer** | search engine location code required field if you don’t specify location_name or location_coordinate if you use this field, you don’t need to specify location_name or location_coordinate you can receive the list of available locations and languages by making a separate request to https://api.dataforseo.com/v3/keywords_data/bing/keyword_performance/locations_and_languages example: 2840 |  [optional] |
|**locationCoordinate** | **String** | GPS coordinates of a location required field if you don’t specify location_name or location_code if you use this field, you don’t need to specify location_name or location_code location_coordinate parameter should be specified in the “latitude,longitude” format the data will be provided for the country the specified coordinates belong to example: 52.6178549,-155.352142 |  [optional] |
|**languageName** | **String** | full name of search engine language required field if you don’t specify language_code if you use this field, you don’t need to specify language_code you can receive the list of available locations and languages by making a separate request to https://api.dataforseo.com/v3/keywords_data/bing/keyword_performance/locations_and_languages example: English |  [optional] |
|**languageCode** | **String** | search engine language code required field if you don’t specify language_name you can receive the list of available locations and languages by making a separate request to https://api.dataforseo.com/v3/keywords_data/bing/keyword_performance/locations_and_languages example: \&quot;en\&quot; |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




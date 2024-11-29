

# DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword required field UTF-8 encoding the keywords should be specified in the lowercase format learn more about rules and limitations of keyword and keywords fields in DataForSEO APIs in this Help Center article |  [optional] |
|**locationName** | **String** | full name of the location required field if you don’t specify location_code Note: it is required to specify either location_name or location_code you can receive the list of available locations with their location_name by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages; Note: this endpoint currently supports the US, Egypt, Saudi Arabia, and the United Arab Emirates locations only; example: United States |  [optional] |
|**locationCode** | **Integer** | location code required field if you don’t specify location_name Note: it is required to specify either location_name or location_code you can receive the list of available locations with their location_code by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages; Note: this endpoint currently supports the US, Egypt, Saudi Arabia, and the United Arab Emirates locations only; example: 2840 |  [optional] |
|**languageName** | **String** | full name of the language required field if you don’t specify language_code Note: it is required to specify either language_name or language_code you can receive the list of available locations with their language_name by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: English |  [optional] |
|**languageCode** | **String** | language code required field if you don’t specify language_name Note: it is required to specify either language_name or language_code you can receive the list of available locations with their language_code by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: en |  [optional] |
|**depth** | **Integer** | keyword search depth optional field default value: 1; number of the returned results depends on the value you set in this field; you can specify a level from 0 to 4; estimated number of keywords for each level (maximum): 0 – the keyword set in the keyword field 1 – 6 keywords 2 – 42 keywords 3 – 258 keywords 4 – 1554 keywords |  [optional] |
|**includeSeedKeyword** | **Boolean** | include data for the seed keyword optional field if set to true, data for the seed keyword specified in the keyword field will be provided in the seed_keyword_data array of the response default value: false |  [optional] |
|**ignoreSynonyms** | **Boolean** | ignore highly similar keywords optional field if set to true only core keywords will be returned, all highly similar keywords will be excluded; default value: false |  [optional] |
|**limit** | **Integer** | the maximum number of returned keywords optional field default value: 100 maximum value: 1000 |  [optional] |
|**offset** | **Integer** | offset in the results array of returned keywords optional field default value: 0 if you specify the 10 value, the first ten keywords in the results array will be omitted and the data will be provided for the successive keywords |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




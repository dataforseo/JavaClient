

# DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword required field you can specify up to 700 symbols in the keyword field; all %## will be decoded (plus symbol ‘+’ will be decoded to a space character); if you need to use the “%” symbol for your keyword, please specify it as “%25”; if you need to use the “+” symbol for your keyword, please specify it as “%2B” |  [optional] |
|**dateFrom** | **String** | starting date of the time range optional field if you don’t specify this field, the API will return all SERPs collected for 365 days starting from the current datetime value; minimal possible value: 365 days from the current datetime value; date format: \&quot;yyyy-mm-dd\&quot; |  [optional] |
|**dateTo** | **String** | ending date of the time range optional field if you don’t specify this field, the today’s date will be used by default; date format: \&quot;yyyy-mm-dd\&quot;; example: \&quot;2021-09-01\&quot; |  [optional] |
|**locationName** | **String** | full name of the location required field if you don’t specify location_code Note: it is required to specify either location_name or location_code you can receive the list of available locations with their location_name by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: United Kingdom |  [optional] |
|**locationCode** | **Integer** | unique location identifier required field if you don’t specify location_name Note: it is required to specify either location_name or location_code you can receive the list of available locations with their location_code by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: 2840 |  [optional] |
|**languageName** | **String** | full name of the language optional field if you use this field, you don’t need to specify language_code you can receive the list of available languages with their language_name by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages ignore this field to get the results for all available languages example: English |  [optional] |
|**languageCode** | **String** | language code optional field if you use this field, you don’t need to specify language_name you can receive the list of available languages with their language_code by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages ignore this field to get the results for all available languages example: en |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |






# DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword required field you can specify up to 700 characters in the keyword field; all %## will be decoded (plus character ‘+’ will be decoded to a space character); if you need to use the “%” character for your keyword, please specify it as “%25”; if you need to use the “+” character for your keyword, please specify it as “%2B” |  [optional] |
|**dateFrom** | **String** | starting date of the time range optional field if you don’t specify this field, the API will return all SERPs collected for 365 days starting from the current datetime value; minimal possible value: 365 days from the current datetime value; date format: \&quot;yyyy-mm-dd\&quot; |  [optional] |
|**dateTo** | **String** | ending date of the time range optional field if you don’t specify this field, the today’s date will be used by default; date format: \&quot;yyyy-mm-dd\&quot;; example: \&quot;2021-09-01\&quot; |  [optional] |
|**locationName** | **String** | full name of the location required field if you don’t specify location_code Note: it is required to specify either location_name or location_code you can receive the list of available locations with their location_name by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: United Kingdom |  [optional] |
|**locationCode** | **Integer** | unique location identifier required field if you don’t specify location_name Note: it is required to specify either location_name or location_code you can receive the list of available locations with their location_code by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: 2840 |  [optional] |
|**languageName** | **String** | full name of the language required field if you don’t specify language_code Note: it is required to specify either language_name or language_code you can receive the list of available languages with their language_name parameters by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: English |  [optional] |
|**languageCode** | **String** | unique language identifier required field if you don’t specify language_name Note: it is required to specify either language_name or language_code you can receive the list of available languages with their language_code parameters by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: en |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




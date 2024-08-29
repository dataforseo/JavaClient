

# DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **String** | domain required field the domain name of the target website the domain should be specified without https:// and www. |  [optional] |
|**locationName** | **String** | full name of the location required field if you don’t specify location_code Note: it is required to specify either location_name or location_code you can receive the list of available locations with their location_name by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: United Kingdom |  [optional] |
|**locationCode** | **Integer** | location code required field if you don’t specify location_name Note: it is required to specify either location_name or location_code you can receive the list of available locations with their location_code by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: 2840 |  [optional] |
|**languageName** | **String** | full name of the language required field if you don’t specify language_code Note: it is required to specify either language_name or language_code you can receive the list of available locations with their language_name by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: English |  [optional] |
|**languageCode** | **String** | language code required field if you don’t specify language_name Note: it is required to specify either language_name or language_code you can receive the list of available locations with their language_code by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: en |  [optional] |
|**dateFrom** | **String** | starting date of the time range optional field if you don’t specify this field, the data will be provided for the previous 6 months minimal possible value: 2020-10-01 date format: \&quot;yyyy-mm-dd\&quot; |  [optional] |
|**dateTo** | **String** | ending date of the time range optional field if you don’t specify this field, the today’s date will be used by default date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2021-04-01\&quot; |  [optional] |
|**correlate** | **Boolean** | correlate data with previously obtained datasets optional field default value: true if you use this parameter, our system will correlate data you obtain now with previously obtained datasets this parameter is intended to mitigate any inconsistencies that may result from changes to our database we recommend always setting correlate to true |  [optional] |
|**ignoreSynonyms** | **Boolean** | ignore highly similar keywords optional field if set to true, only data based on core keywords will be returned, data for all highly similar keywords will be excluded; default value: false |  [optional] |
|**includeClickstreamData** | **Boolean** | include or exclude data from clickstream-based metrics in the result optional field if the parameter is set to true, you will receive clickstream_etv, clickstream_gender_distribution, and clickstream_age_distribution fields with clickstream data in the response default value: false with this parameter enabled, you will be charged double the price for the request learn more about how clickstream-based metrics are calculated in this help center article |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




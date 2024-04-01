

# DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keywords** | **List&lt;String&gt;** | target keywords required field UTF-8 encoding maximum number of keywords you can specify in this array: 1000; each keyword should be at least 3 characters long; the keywords will be converted to lowercase format |  [optional] |
|**locationName** | **String** | full name of the location required field if don’t specify location_code you can receive the list of available locations with their location_name by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages;  Note: this endpoint currently supports the following locations and languages only: Australia – 2036, en Austria – 2040, de Canada – 2124, en Egypt – 2818, ar France – 2250, fr Germany – 2276, de India – 2356, en Italy – 2380, it Mexico – 2484, es Netherlands – 2528, nl Saudi Arabia – 2682, ar Singapore – 2702, en Spain – 2724, es United Arab Emirates – 2784, ar United Kingdom – 2826, en United States – 2840, en example: United States |  [optional] |
|**locationCode** | **Integer** | location code required field if don’t specify location_name you can receive the list of available locations with their location_code by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages; Note: this endpoint currently supports these locations and languages only; example: 2840 |  [optional] |
|**languageName** | **String** | full name of the language required field if don’t specify language_code you can receive the list of available languages with their language_name by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages Note: this endpoint currently supports these locations and languages only; example: English |  [optional] |
|**languageCode** | **String** | language code required field if don’t specify language_name you can receive the list of available languages with their language_code by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages Note: this endpoint currently supports these locations and languages only; example: en |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# MerchantAmazonAsinTaskPostRequestInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asin** | **String** | product ID required field unique product identifier (ASIN) in Amazon you can receive the asin parameter by making a separate request to the Amazon Products endpoint |  [optional] |
|**priority** | **Integer** | task priority optional field can take the following values: 1 – normal execution priority (set by default) 2 – high execution priority You will be additionally charged for the tasks with high execution priority. The cost can be calculated on the Pricing page. |  [optional] |
|**locationName** | **String** | full name of search engine location required field if you don’t specify location_code or location_coordinate if you use this field, you don’t need to specify location_code or location_coordinate you can receive the list of available locations with their location_name parameters by making a separate request to the https://api.dataforseo.com/v3/merchant/amazon/locations example: HA1,England,United Kingdom |  [optional] |
|**locationCode** | **Integer** | search engine location code required field if you don’t specify location_name or location_coordinate if you use this field, you don’t need to specify location_name or location_coordinate you can receive the list of available locations with their location_code parameters by making a separate request to the https://api.dataforseo.com/v3/merchant/amazon/locations example: 9045969 |  [optional] |
|**locationCoordinate** | **String** | GPS coordinates of a location required field if you don’t specify location_name or location_code if you use this field, you don’t need to specify location_name or location_code location_coordinate parameter should be specified in the “latitude,longitude,radius” format the maximum number of decimal digits for “latitude” and “longitude”: 7 the minimum value for “radius”: 199.9 example: 53.476225,-2.243572,200 |  [optional] |
|**languageName** | **String** | full name of search engine language required field if you don’t specify language_code if you use this field, you don’t need to specify language_code you can receive the list of available languages with their language_name parameters by making a separate request to the https://api.dataforseo.com/v3/merchant/amazon/languages example: English (United Kingdom) |  [optional] |
|**languageCode** | **String** | search engine language code required field if you don’t specify language_name if you use this field, you don’t need to specify language_name you can receive the list of available languages with their language_code parameters by making a separate request to the https://api.dataforseo.com/v3/merchant/amazon/languages example: en_GB |  [optional] |
|**seDomain** | **String** | search engine domain optional field we choose the relevant search engine domain automatically according to the location and language you specify however, you can set a custom search engine domain in this field example: amazon.com, amazon.co.uk, amazon.fr, etc. |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |
|**postbackUrl** | **String** | return URL for sending task results optional field once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/postbackscript?id&#x3D;$id http://your-server.com/postbackscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special symbols in postback_url will be urlencoded; i.a., the # symbol will be encoded into %23 |  [optional] |
|**postbackData** | **String** | postback_url datatype required field if you specify postback_url corresponds to the datatype that will be sent to your server possible values: advanced, html |  [optional] |
|**pingbackUrl** | **String** | notification URL of a completed task optional field when a task is completed we will notify you by GET request sent to the URL you have specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/pingscript?id&#x3D;$id http://your-server.com/pingscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special symbols in pingback_url will be urlencoded; i.a., the # symbol will be encoded into %23 |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
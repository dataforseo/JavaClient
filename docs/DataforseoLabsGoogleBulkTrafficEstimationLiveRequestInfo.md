

# DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targets** | **List&lt;String&gt;** | target domains, subdomains, and webpages required field you can specify domains, subdomains, and webpages in this field; domains and subdomains should be specified without https:// and www.; pages should be specified with absolute URL, including https:// and www.; you can set up to 1000 domains, subdomains or webpages |  [optional] |
|**locationName** | **String** | full name of the location if you use this field, you don’t have to specify location_code you can receive the list of available locations with their location_name by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages ignore this field to get the results for all available locations example: United Kingdom |  [optional] |
|**locationCode** | **Integer** | location code if you use this field, you don’t have to specify location_name you can receive the list of available locations with their location_code by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages ignore this field to get the results for all available locations example: 2840 |  [optional] |
|**languageName** | **String** | full name of the language if you use this field, you don’t need to specify language_code you can receive the list of available languages with their language_name by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages ignore this field to get the results for all available languages example: English |  [optional] |
|**languageCode** | **String** | language code if you use this field, you don’t need to specify language_name you can receive the list of available languages with their language_code by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages ignore this field to get the results for all available languages example: en |  [optional] |
|**itemTypes** | **List&lt;String&gt;** | display results by item type optional field indicates the type of search results included in the response Note: if the item_types array contains item types that are different from organic, the results will be ordered by the first item type in the array possible values: [\&quot;organic\&quot;, \&quot;paid\&quot;, \&quot;featured_snippet\&quot;, \&quot;local_pack\&quot;] default value: [\&quot;organic\&quot;, \&quot;paid\&quot;] |  [optional] |
|**ignoreSynonyms** | **Boolean** | ignore highly similar keywords optional field if set to true, only core keywords will be returned, all highly similar keywords will be excluded; default value: false |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




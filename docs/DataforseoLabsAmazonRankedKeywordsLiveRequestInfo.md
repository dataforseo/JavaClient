

# DataforseoLabsAmazonRankedKeywordsLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asin** | **String** | product ID required field unique product identifier (ASIN) on Amazon; you can receive the asin parameter by making a separate request to the Amazon Products endpoint |  [optional] |
|**locationName** | **String** | full name of the location required field if don’t specify location_code you can receive the list of available locations with their location_name by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages; Note: this endpoint currently supports the US, Egypt, Saudi Arabia, and the United Arab Emirates locations only; example: United States |  [optional] |
|**locationCode** | **Integer** | location code required field if don’t specify location_name you can receive the list of available locations with their location_code by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages; Note: this endpoint currently supports the US, Egypt, Saudi Arabia, and the United Arab Emirates locations only; example: 2840 |  [optional] |
|**languageName** | **String** | full name of the language required field if don’t specify language_code you can receive the list of available languages with their language_name by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: English |  [optional] |
|**languageCode** | **String** | language code required field if don’t specify language_name you can receive the list of available languages with their language_code by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: en |  [optional] |
|**limit** | **Integer** | the maximum number of products in the results array optional field default value: 100; maximum value: 1000 |  [optional] |
|**ignoreSynonyms** | **Boolean** | ignore highly similar keywords optional field if set to true only core keywords will be returned, all highly similar keywords will be excluded; default value: false |  [optional] |
|**filters** | **List&lt;Object&gt;** | array of results filtering parameters optional field you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: regex, not_regex, &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;, &lt;&gt;, in, not_in, like, not_like, match, not_match you can use the % operator with like and not_like to match any string of zero or more characters example: [\&quot;keyword_data.keyword_info.search_volume\&quot;,\&quot;in\&quot;,[100,1000]]; for more information about filters, please refer to Dataforseo Labs – Filters or this help center guide |  [optional] |
|**orderBy** | **List&lt;String&gt;** | results sorting rules optional field you can use the same values as in the filters array to sort the results possible sorting types: asc – results will be sorted in the ascending order desc – results will be sorted in the descending order you should use a comma to set up a sorting parameter example: [\&quot;keyword_data.keyword_info.competition,desc\&quot;] default rule: [\&quot;ranked_serp_element.serp_item.rank_group,asc\&quot;] note that you can set no more than three sorting rules in a single request you should use a comma to separate several sorting rules example: [\&quot;keyword_data.keyword_info.search_volume,desc\&quot;,\&quot;keyword_data.keyword_info.cpc,desc\&quot;] |  [optional] |
|**offset** | **Integer** | offset in the results array of returned keywords optional field default value: 0 if you specify the 10 value, the first ten keywords in the results array will be omitted and the data will be provided for the successive keywords |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




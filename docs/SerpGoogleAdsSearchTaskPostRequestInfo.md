

# SerpGoogleAdsSearchTaskPostRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **String** | domain name required field if advertiser_ids is not specified domain name associated with an advertiser account |  [optional] |
|**advertiserIds** | **List&lt;String&gt;** | advertiser identifiers required field if target is not specified you can specify the maximum of 25 values in this array; advertiser_ids values for this parameter can be found in the Google Ads Advertisers endpoint; |  [optional] |
|**locationName** | **String** | full name of search engine location optional field if you use this field, you don’t need to specify location_code or location_coordinate you can receive the list of available locations of the search engine with their location_name by making a separate request to the https://api.dataforseo.com/v3/serp/google/ads_search/locations example: London,England,United Kingdom Note: if you don’t specify location_name, location_code, or location_coordinate, the ads will be searched across all the available locations |  [optional] |
|**locationCode** | **Integer** | search engine location code optional field if you use this field, you don’t need to specify location_name or location_coordinate you can receive the list of available locations of the search engines with their location_code by making a separate request to the https://api.dataforseo.com/v3/serp/google/ads_search/locations example: 2840 Note: if you don’t specify location_name, location_code, or location_coordinate, the ads will be searched across all the available locations |  [optional] |
|**locationCoordinate** | **String** | GPS coordinates of a location optional field if you use this field, you don’t need to specify location_name or location_code example: 52.6178549,-155.352142 Note: if you don’t specify location_name, location_code, or location_coordinate, the ads will be searched across all the available locations |  [optional] |
|**platform** | **String** | advertising platform optional field possible values: all, google_play, google_maps, google_search, google_shopping, youtube default value: all |  [optional] |
|**format** | **String** | ad format optional field possible values: all, text, image, video |  [optional] |
|**dateFrom** | **String** | starting date of the time range optional field required field if date_to is specified;  date format: \&quot;yyyy-mm-dd\&quot; minimum value: 2018-05-31 maximum value: today’s date example: \&quot;2020-01-01\&quot; |  [optional] |
|**dateTo** | **String** | ending date of the time range optional field required field if date_from is specified;  date format: \&quot;yyyy-mm-dd\&quot; minimum value: 2018-05-31 maximum value: today’s date example: \&quot;2020-01-01\&quot; |  [optional] |
|**depth** | **Integer** | parsing depth optional field number of results in SERP default value: 40 max value: 700 Note: your account will be billed per each SERP containing up to 40 results; thus, setting a depth above 40 may result in additional charges if the search engine returns more than 40 results; if the specified depth is higher than the number of results in the response, the difference will be refunded automatically to your account balance |  [optional] |
|**priority** | **Integer** | task priority optional field can take the following values: 1 – normal execution priority (set by default) 2 – high execution priority You will be additionally charged for the tasks with high execution priority. The cost can be calculated on the Pricing page. |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |
|**postbackUrl** | **String** | return URL for sending task results optional field once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/postbackscript?id&#x3D;$id http://your-server.com/postbackscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in postback_url will be urlencoded; i.a., the # character will be encoded into %23 learn more on our Help Center |  [optional] |
|**postbackData** | **String** | postback_url datatype required field if you specify postback_url corresponds to the function you used for setting a task possible values: advanced |  [optional] |
|**pingbackUrl** | **String** | notification URL of a completed task optional field when a task is completed we will notify you by GET request sent to the URL you have specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/pingscript?id&#x3D;$id http://your-server.com/pingscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in pingback_url will be urlencoded; i.a., the # character will be encoded into %23 learn more on our Help Center |  [optional] |




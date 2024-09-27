

# SerpGoogleDatasetInfoTaskPostRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**datasetId** | **String** | ID of the dataset required field you can find dataset ID in the dataset URL or dataset item of Google Dataset Search result example: L2cvMTFqbl85ZHN6MQ&#x3D;&#x3D; |  [optional] |
|**priority** | **Integer** | task priority optional field can take the following values: 1 – normal execution priority (set by default) 2 – high execution priority You will be additionally charged for the tasks with high execution priority. The cost can be calculated on the Pricing page. |  [optional] |
|**languageName** | **String** | full name of search engine language optional field if you use this field, you don’t need to specify language_code possible value: English |  [optional] |
|**languageCode** | **String** | search engine language code optional field if you use this field, you don’t need to specify language_name possible value: en |  [optional] |
|**device** | **String** | device type optional field possible value: desktop |  [optional] |
|**os** | **String** | device operating system optional field choose from the following values: windows, macos default value: windows |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |
|**postbackUrl** | **String** | return URL for sending task results optional field once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request example: http://your-server.com/postbackscript?id&#x3D;$id http://your-server.com/postbackscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special symbols in postback_url will be urlencoded; i.a., the # symbol will be encoded into %23 learn more on our Help Center |  [optional] |
|**postbackData** | **String** | postback_url datatype required field if you specify postback_url corresponds to the datatype that will be sent to your server possible value: advanced |  [optional] |
|**pingbackUrl** | **String** | notification URL of a completed task optional field when a task is completed we will notify you by GET request sent to the URL you have specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/pingscript?id&#x3D;$id http://your-server.com/pingscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special symbols in pingback_url will be urlencoded; i.a., the # symbol will be encoded into %23 learn more on our Help Center |  [optional] |




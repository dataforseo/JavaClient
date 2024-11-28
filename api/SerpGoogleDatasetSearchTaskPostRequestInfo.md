

# SerpGoogleDatasetSearchTaskPostRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword required field you can specify up to 700 characters in the keyword field all %## will be decoded (plus character ‘+’ will be decoded to a space character) if you need to use the “%” character for your keyword, please specify it as “%25”; if you need to use the “+” character for your keyword, please specify it as “%2B”. learn more about rules and limitations of keyword and keywords fields in DataForSEO APIs in this Help Center article |  [optional] |
|**priority** | **Integer** | task priority optional field can take the following values: 1 – normal execution priority (set by default) 2 – high execution priority You will be additionally charged for the tasks with high execution priority. The cost can be calculated on the Pricing page. |  [optional] |
|**depth** | **Integer** | parsing depth optional field number of results in SERP default value: 20 max value: 700 Note: your account will be billed per each SERP containing up to 20 results; thus, setting a depth above 20 may result in additional charges if the search engine returns more than 20 results; if the specified depth is higher than the number of results in the response, the difference will be refunded automatically to your account balance |  [optional] |
|**languageName** | **String** | full name of search engine language optional field if you use this field, you don’t need to specify language_code possible value: English |  [optional] |
|**languageCode** | **String** | search engine language code optional field possible value: en |  [optional] |
|**device** | **String** | device type optional field possible value: desktop |  [optional] |
|**os** | **String** | device operating system optional field possible values: windows, macos default value: windows |  [optional] |
|**lastUpdated** | **String** | last time the dataset was updated optional field possible values: 1m, 1y, 3y |  [optional] |
|**fileFormats** | **List&lt;String&gt;** | file formats of the dataset optional field possible values: other, archive, text, image, document, tabular |  [optional] |
|**usageRights** | **String** | usage rights of the dataset optional field possible values: commercial, noncommercial |  [optional] |
|**isFree** | **Boolean** | indicates whether displayed datasets are free optional field possible values: true, false |  [optional] |
|**topics** | **List&lt;String&gt;** | dataset topics optional field possible values: humanities, social_sciences, life_sciences, agriculture, natural_sciences, geo, computer, architecture_and_urban_planning, engineering |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |
|**postbackUrl** | **String** | return URL for sending task results optional field once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request example: http://your-server.com/postbackscript?id&#x3D;$id http://your-server.com/postbackscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in postback_url will be urlencoded; i.a., the # character will be encoded into %23 learn more on our Help Center |  [optional] |
|**postbackData** | **String** | postback_url datatype required field if you specify postback_url corresponds to the datatype that will be sent to your server only value: advanced |  [optional] |
|**pingbackUrl** | **String** | notification URL of a completed task optional field when a task is completed we will notify you by GET request sent to the URL you have specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/pingscript?id&#x3D;$id http://your-server.com/pingscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in pingback_url will be urlencoded; i.a., the # character will be encoded into %23 learn more on our Help Center |  [optional] |




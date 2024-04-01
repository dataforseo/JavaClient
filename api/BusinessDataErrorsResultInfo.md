

# BusinessDataErrorsResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | id of the task |  [optional] |
|**datetime** | **String** | date and time when an error occurred in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**function** | **String** | corresponding API function |  [optional] |
|**errorCode** | **Integer** | error code |  [optional] |
|**errorMessage** | **String** | error message or error URL error message (see full list) or URL that caused an error |  [optional] |
|**httpUrl** | **String** | URL that caused an error URL you used for making an API call or pingback/postback URL |  [optional] |
|**httpMethod** | **String** | HTTP method |  [optional] |
|**httpCode** | **Integer** | HTTP status code |  [optional] |
|**httpTime** | **Float** | time taken by HTTP request for tasks set with a pingback/postback, this field will show the time it took your server to respond |  [optional] |
|**httpResponse** | **String** | HTTP response server response |  [optional] |




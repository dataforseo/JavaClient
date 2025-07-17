# MerchantIdListResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | id of the task |[optional]|
**url** | **String** | URL of the task<br>URL you used for making an API call |[optional]|
**datetimePosted** | **String** | date and time when the task was made<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2023-01-15 12:57:46 +00:00 |[optional]|
**datetimeDone** | **String** | date and time when the task was completed<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2023-01-15 12:57:46 +00:00 |[optional]|
**status** | **String** | informational message of the task<br>you can find the full list of general informational messages here |[optional]|
**cost** | **Double** | cost of the task, USD |[optional]|
**metadata** | **Map<String, Object>** | contains parameters you specified in the POST request |[optional]|
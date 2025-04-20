

# BacklinksHistoryLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **String** | domain required field a domain should be specified without https:// and www. |  [optional] |
|**dateFrom** | **String** | starting date of the time range optional field minimum value 2019-01-01 if you don’t specify this field, the minimum value will be used by default date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2019-01-15\&quot; |  [optional] |
|**dateTo** | **String** | ending date of the time range optional field if you don’t specify this field, the today’s date will be used by default date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2019-01-15\&quot; |  [optional] |
|**rankScale** | **String** | defines the scale used for calculating and displaying the rank, domain_from_rank, and page_from_rank values optional field you can use this parameter to choose whether rank values are presented on a 0–100 or 0–1000 scale possible values: one_hundred — rank values are displayed on a 0–100 scale one_thousand — rank values are displayed on a 0–1000 scale default value: one_thousand learn more about how this parameter works and how ranking metrics are calculated in this Help Center article |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




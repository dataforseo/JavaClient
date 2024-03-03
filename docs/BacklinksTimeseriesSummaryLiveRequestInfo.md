

# BacklinksTimeseriesSummaryLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **String** | domain to get data for required field a domain should be specified without https:// and www. example: \&quot;forbes.com\&quot; |  [optional] |
|**dateFrom** | **String** | starting date of the time range optional field this field indicates the date which will be used as a threshold for summary data; minimum value: 2019-01-30 maximum value shouldn’t exceed the date specified in the date_to date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2021-01-01\&quot; |  [optional] |
|**dateTo** | **String** | ending date of the time range optional field if you don’t specify this field, the today’s date will be used by default minimum value shouldn’t preceed the date specified in the date_from maximum value: today’s date date format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2021-01-15\&quot; |  [optional] |
|**groupRange** | **String** | time range which will be used to group the results optional field default value: month possible values: day, week, month, year note: for day, we will return items corresponding to all dates between and including date_from and date_to; for week/month/year, we will return items corresponding to full weeks/months/years, where each item will indicate the last day of the week/month/year for example, if you specify: \&quot;group_range\&quot;: \&quot;month\&quot;, \&quot;date_from\&quot;: \&quot;2022-03-23\&quot;, \&quot;date_to\&quot;: \&quot;2022-05-13\&quot; we will return items falling between 2022-03-01 and 2022-05-31, namely, three items corresponding to the following dates: 2022-03-31, 2022-04-30, 2022-05-31 if there is no data for a certain  day/week/month/year, we will return 0 |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




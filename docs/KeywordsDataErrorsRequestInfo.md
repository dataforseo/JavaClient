[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# KeywordsDataErrorsRequestInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Integer** | the maximum number of returned tasks that responded with an error optional field default value: 1000 maximum value: 1000 |  [optional] |
|**offset** | **Integer** | offset in the results array of returned tasks optional field default value: 0 if you specify the 10 value, the first ten tasks in the results array will be omitted and the data will be provided for the successive tasks |  [optional] |
|**filteredFunction** | **String** | return tasks with a certain function use this field to obtain a list of tasks that returned an error filtered by a certain function you can filter the results by the values you receive in the function fields of the API response i.e., once you receive unfiltered results, you can call this API again to filter them by function example: keywords_data/keywords_for_site/task_post, postback_url, pingback_url |  [optional] |
|**datetimeFrom** | **String** | start time for filtering results optional field allows filtering results by the datetime parameter within the range of the last 24 hours; must be specified in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2021-11-15 12:57:46 +00:00 |  [optional] |
|**datetimeTo** | **String** | finish time for filtering results optional field allows filtering results by the datetime parameter within the range of the last 24 hours; must be specified in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2021-11-15 13:57:46 +00:00 |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
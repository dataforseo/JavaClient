[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# KeywordsDataIdListRequestInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**datetimeFrom** | **String** | start time for filtering results required field if include_metadata is set to true, maximum value: a month from current datetime; if include_metadata is set to false, maximum value: six months from current datetime; must be specified in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2023-01-15 12:57:46 +00:00 |  [optional] |
|**datetimeTo** | **String** | finish time for filtering results required field maximum value: current datetime; must be specified in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2023-01-31 13:57:46 +00:00 |  [optional] |
|**limit** | **Integer** | the maximum number of returned task IDs optional field default value: 1000 maximum value: 1000 |  [optional] |
|**offset** | **Integer** | offset in the results array of returned task IDs optional field default value: 0 if you specify the 10 value, the first ten tasks in the results array will be omitted |  [optional] |
|**sort** | **String** | sorting by task execution time optional field possible values: \&quot;asc\&quot;, \&quot;desc\&quot; default value: \&quot;asc\&quot; |  [optional] |
|**includeMetadata** | **Boolean** | include task metadata in the respond optional field default value: false |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
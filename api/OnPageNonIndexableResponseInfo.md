

# OnPageNonIndexableResponseInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | the current version of the API |  [optional] |
|**statusCode** | **Integer** | general status code you can find the full list of the response codes here |  [optional] |
|**statusMessage** | **String** | general informational message you can find the full list of general informational messages here |  [optional] |
|**time** | **String** | total execution time, seconds |  [optional] |
|**cost** | **Double** | total tasks cost, USD |  [optional] |
|**tasksCount** | **Long** | the number of tasks in the tasks array |  [optional] |
|**tasksError** | **Long** | the number of tasks in the tasks array returned with an error |  [optional] |
|**tasks** | [**List&lt;OnPageNonIndexableTaskInfo&gt;**](OnPageNonIndexableTaskInfo.md) | array of tasks |  [optional] |




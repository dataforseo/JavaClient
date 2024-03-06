[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# BacklinksHistoryLiveResultInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **String** | target from the POST array |  [optional] |
|**dateFrom** | **String** | starting date of the time range in the UTC format: “yyyy-mm-dd” example: 2019-01-01 |  [optional] |
|**dateTo** | **String** | ending date of the time range in the UTC format: \&quot;yyyy-mm-dd\&quot; example: \&quot;2019-01-15\&quot; |  [optional] |
|**itemsCount** | **Long** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;BacklinksHistoryLiveItem&gt;**](BacklinksHistoryLiveItem.md) | contains historical backlink data for the specified domain the data is provided month-by-month; the metrics are aggregated according to the backlinks the specified domain had on the first day of each given month |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
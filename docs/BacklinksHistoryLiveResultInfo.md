# BacklinksHistoryLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**target** | **String** | <em><code>target</code> from the POST array</em> |[optional]|
**dateFrom** | **String** | <em>starting date of the time range</em><br>in the UTC format: “yyyy-mm-dd”<br>example:<br><code>2019-01-01</code> |[optional]|
**dateTo** | **String** | <em>ending date of the time range</em><br>in the UTC format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2019-01-15'</code> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <code>items</code> array</em> |[optional]|
**items** | **List<BacklinksHistoryLiveItem>** | <em>contains historical backlink data for the specified domain</em><br>the data is provided month-by-month;<br>the metrics are aggregated according to the backlinks the specified domain had on the first day of each given month |[optional]|
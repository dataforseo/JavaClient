# BacklinksTimeseriesNewLostSummaryLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**target** | **String** | <em><code>target</code> from a POST array</em> |[optional]|
**dateFrom** | **String** | <em>starting date of the time range</em><br>in the UTC format: “yyyy-mm-dd”<br>example:<br><code>2019-01-01</code> |[optional]|
**dateTo** | **String** | <em>ending date of the time range</em><br>in the UTC format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2019-01-15'</code> |[optional]|
**groupRange** | **String** | <em><code>group_range</code> from the POST array</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <code>items</code> array</em> |[optional]|
**items** | **List<BacklinksTimeseriesNewLostSummaryLiveItem>** | <em>contains relevant backlinks and referring domains data</em> |[optional]|
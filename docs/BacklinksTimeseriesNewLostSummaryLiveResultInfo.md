# BacklinksTimeseriesNewLostSummaryLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**target** | **String** | target from a POST array |[optional]|
**dateFrom** | **String** | starting date of the time range<br>in the UTC format: “yyyy-mm-dd”<br>example:<br>2019-01-01 |[optional]|
**dateTo** | **String** | ending date of the time range<br>in the UTC format: 'yyyy-mm-dd'<br>example:<br>'2019-01-15' |[optional]|
**groupRange** | **String** | group_range from the POST array |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BacklinksTimeseriesNewLostSummaryLiveItem>** | contains relevant backlinks and referring domains data |[optional]|
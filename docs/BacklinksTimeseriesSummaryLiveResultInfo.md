# BacklinksTimeseriesSummaryLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**target** | **String** | target from a POST array |[optional]|
**dateFrom** | **String** | starting date of the time range<br>in the UTC format: “yyyy-mm-dd”<br>example:<br>2019-01-01 |[optional]|
**dateTo** | **String** | ending date of the time range<br>in the UTC format: 'yyyy-mm-dd'<br>example:<br>'2019-01-15' |[optional]|
**groupRange** | **String** | group_range from a POST array |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<BacklinksTimeseriesSummaryLiveItem>** | contains relevant summary data |[optional]|
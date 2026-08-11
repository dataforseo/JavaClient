# KeywordsDataDataforseoTrendsDemographyLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**keywords** | **List<String>** | <em>keywords in a POST array</em> |[optional]|
**type** | **String** | type of element |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em><br>if there is no data, then the value is_<code>null</code>n |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em><br>if there is no data, then the value is_<code>null</code>n |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <strong><code>items</code></strong> array</em> |[optional]|
**items** | **List<DataforseoTrendsDemographyElementItem>** | <em>contains keyword popularity and related data</em> |[optional]|
# SerpApiGoogleFinanceDetailsElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP |[optional]|
**badges** | **List<String>** | <em>google finance badges relevant to the element</em><br>example: <code>Futures Contract</code> |[optional]|
**previousClose** | **Double** | <em>value of the previous close</em> |[optional]|
**startDayRange** | **Double** | <em>value of the start day range</em> |[optional]|
**endDayRange** | **Double** | <em>value of the end day range</em> |[optional]|
**startYearRange** | **Double** | <em>value of the start year range</em> |[optional]|
**endYearRange** | **Double** | <em>value of the end year range</em> |[optional]|
**marketCap** | **Double** | <em>market cap value</em> |[optional]|
**volume** | **Double** | <em>total volume value</em> |[optional]|
**avgVolume** | **Double** | <em>average volume value</em> |[optional]|
**peRatio** | **Double** | <em>price-earnings ratio</em> |[optional]|
**dividendYield** | **Double** | <em>dividend yield value</em> |[optional]|
**primaryExchange** | **String** | <em>primary exchange value</em> |[optional]|
**ytdReturn** | **Double** | <em>year-to-date return value</em> |[optional]|
**expenseRatio** | **Double** | <em>expense ratio value</em> |[optional]|
**category** | **String** | <em>category name</em> |[optional]|
**netAssets** | **Double** |  |[optional]|
**yield** | **Double** | <em>yield value</em> |[optional]|
**frontLoad** | **Double** | <em>front load value</em> |[optional]|
**marketSegment** | **String** | <em>name of the relevant market segment</em> |[optional]|
**openInterest** | **Double** | <em>open interest value</em> |[optional]|
**settlementPrice** | **Double** | <em>settlement price value</em> |[optional]|
**cdpClimateChangeScore** | **String** | <em>climate change score by carbon disclosure project methodology</em> |[optional]|
**metricsCurrency** | **String** | <em>currency of the metrics</em> |[optional]|
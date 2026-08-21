# GoogleFinanceFuturesChainElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**expirationTimestamp** | **String** | <em>futures' date and time of expiration</em><br>in the UTC format: 'yyyy-mm-dd hh-mm-ss +00:00'<br>example:<br><code class='long-string'>2025-02-10 09:40:00 +00:00</code> |[optional]|
**symbol** | **String** | <em>futures' symbol</em> |[optional]|
**price** | **Double** | <em>price of the market instrument</em><br>price of the market instrument at a given <code>timestamp</code> |[optional]|
**priceCurrency** | **String** | <em>currency of the price value</em> |[optional]|
**priceDelta** | **Double** | <em>change in price of the market instrument</em><br>change in <code>price</code> at a given <code>timestamp</code> |[optional]|
**percentageDelta** | **Double** | <em>percentage of change in value of the market index</em> |[optional]|
**trend** | **String** | <em>growth trend of the market index</em><br>possible values: <code>up</code>, <code>down</code>, <code>stable</code> |[optional]|
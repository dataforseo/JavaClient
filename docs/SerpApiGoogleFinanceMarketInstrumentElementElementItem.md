# SerpApiGoogleFinanceMarketInstrumentElementElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**ticker** | **String** | ticker of the market index<br>example: DAX |[optional]|
**price** | **Double** | value of the base asset compared to the quote asset |[optional]|
**priceDelta** | **Double** | change in price<br>change in price at a given timestamp |[optional]|
**priceCurrency** | **String** | price currency<br>example: USD |[optional]|
**identifier** | **String** | identifier of the element<br>full identifier of the element that consists from ticker and market_identifier<br>example: PX1:INDEXDB |[optional]|
**displayedName** | **String** | name of the market index as displayed on Google Finance<br>example: CAC 40 |[optional]|
**url** | **String** | URL to the page of the market index on Google Finance |[optional]|
**location** | **String** | location of the market index<br>example: Europe/Paris |[optional]|
**trend** | **String** | growth trend of the market index<br>possible values: up, down, stable |[optional]|
**timestamp** | **String** | date and time of the value readout<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2025-02-10 09:40:00 +00:00 |[optional]|
**percentageDelta** | **Double** | percentage of change in value of the market index |[optional]|
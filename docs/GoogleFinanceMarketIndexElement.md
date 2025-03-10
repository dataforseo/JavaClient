

# GoogleFinanceMarketIndexElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**ticker** | **String** | ticker of the market index example: DAX |  [optional] |
|**marketIdentifier** | **String** | market identifier example: INDEXDB |  [optional] |
|**indexValue** | **Float** | value of the market index numerical value of the index at a given timestamp |  [optional] |
|**indexValueDelta** | **Float** | change in value of the market index change in the index_value at a given timestamp |  [optional] |
|**identifier** | **String** | identifier of the element full identifier of the element that consists from ticker and market_identifier example: PX1:INDEXDB |  [optional] |
|**displayedName** | **String** | name of the market index as displayed on Google Finance example: CAC 40 |  [optional] |
|**url** | **String** | URL to the page of the market index on Google Finance |  [optional] |
|**location** | **String** | location of the market index example: Europe/Paris |  [optional] |
|**trend** | **String** | growth trend of the market index possible values: up, down, stable |  [optional] |
|**timestamp** | **String** | date and time of the value readout in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2025-02-10 09:40:00 +00:00 |  [optional] |
|**percentageDelta** | **Float** | percentage of change in value of the market index |  [optional] |




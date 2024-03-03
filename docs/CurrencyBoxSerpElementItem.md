

# CurrencyBoxSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**value** | **Float** | the value of the rating |  [optional] |
|**convertedValue** | **Float** | value converted to a requested currency indicates the exact value based on Google Fincance data at the time when our API pulled the results note that exchange rates displayed in the currency_box element may be delayed according to the Google Finance disclaimer |  [optional] |
|**currency** | **String** | currency of the listed price ISO code of the currency applied to the price |  [optional] |
|**convertedCurrency** | **String** | converted currency |  [optional] |
|**timestamp** | **String** | date and time when the result was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**table** | [**Table**](Table.md) |  |  [optional] |
|**graph** | [**Graph**](Graph.md) |  |  [optional] |
|**rectangle** | [**Rectangle**](Rectangle.md) |  |  [optional] |




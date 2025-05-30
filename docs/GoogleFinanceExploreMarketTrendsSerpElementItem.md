

# GoogleFinanceExploreMarketTrendsSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **BigDecimal** | group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **BigDecimal** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**title** | **String** | title of the market trends element example: Europe, Middle East, and Africa |  [optional] |
|**subTitle** | **String** | sub-title of the market trends element |  [optional] |
|**url** | **String** | URL to finance pair on Google Finance |  [optional] |
|**items** | [**List&lt;BaseGoogleFinanceSerpElementItem&gt;**](BaseGoogleFinanceSerpElementItem.md) | market indexes data array of items containing market indexes data; possible type of items: google_finance_asset_pair_element, google_finance_market_instrument_element, google_finance_market_index_element |  [optional] |






# GoogleFinanceNewsSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **BigDecimal** | group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **BigDecimal** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**title** | **String** | title of the news element example: In the news |  [optional] |
|**subTitle** | **String** | sub-title of the news element example: Based on Europe, Middle East, and Africa |  [optional] |
|**items** | [**List&lt;News&gt;**](News.md) | market indexes data array of items containing market indexes data; possible type of items: google_finance_asset_pair_element, google_finance_market_instrument_element, google_finance_market_index_element |  [optional] |




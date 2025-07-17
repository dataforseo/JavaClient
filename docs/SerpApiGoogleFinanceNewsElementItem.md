# SerpApiGoogleFinanceNewsElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values<br>positions of elements with different type values are omitted from rank_group |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP |[optional]|
**title** | **String** | title of the news element<br>example: In the news |[optional]|
**subTitle** | **String** | sub-title of the news element<br>example: Based on Europe, Middle East, and Africa |[optional]|
**items** | **List<GoogleFinanceNewsElement>** | market indexes data<br>array of items containing market indexes data;<br>possible type of items: google_finance_asset_pair_element, google_finance_market_instrument_element, google_finance_market_index_element |[optional]|
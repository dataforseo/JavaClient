# SerpApiGoogleFinanceMostFollowedElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | <em>group rank in SERP</em><br>position within a group of elements with identical <code>type</code> values<br>positions of elements with different <code>type</code> values are omitted from <code>rank_group</code> |[optional]|
**rankAbsolute** | **Integer** | <em>absolute rank in SERP</em><br>absolute position among all the elements in SERP |[optional]|
**items** | **List<BaseSerpApiGoogleFinanceElementItem>** | <em>market indexes data</em><br>array of items containing market indexes data;<br>possible <code>type</code> of items: <code>google_finance_asset_pair_element</code>, <code>google_finance_market_instrument_element</code>, <code>google_finance_market_index_element</code> |[optional]|
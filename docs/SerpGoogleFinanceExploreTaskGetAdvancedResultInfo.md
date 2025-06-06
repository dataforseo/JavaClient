

# SerpGoogleFinanceExploreTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword received in a POST array the keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |  [optional] |
|**type** | **String** | type of element |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **BigDecimal** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**spell** | [**SpellInfo**](SpellInfo.md) |  |  [optional] |
|**refinementChips** | [**RefinementChipsInfo**](RefinementChipsInfo.md) |  |  [optional] |
|**itemTypes** | **List&lt;String&gt;** | types of search results in SERP contains types of search results (items) found in SERP; possible item types: google_finance_hero_groups, google_finance_interested, google_finance_news, google_finance_earnings_calendar, google_finance_most_followed, google_finance_market_trends, google_finance_people_also_search |  [optional] |
|**seResultsCount** | **BigDecimal** | total number of results in SERP |  [optional] |
|**itemsCount** | **BigDecimal** | the number of results returned in the items array |  [optional] |
|**items** | [**List&lt;BaseGoogleFinanceSerpElementItem&gt;**](BaseGoogleFinanceSerpElementItem.md) | market indexes related to the market trends element possible type of items: google_finance_asset_pair_element, google_finance_market_instrument_element, google_finance_market_index_element |  [optional] |




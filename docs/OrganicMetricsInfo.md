

# OrganicMetricsInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**timestamp** | **String** | date and time of the value readout in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2025-02-10 09:40:00 +00:00 |  [optional] |
|**revenue** | **Float** | revenue value |  [optional] |
|**revenueDelta** | **Float** | change in revenue |  [optional] |
|**operatingExpense** | **Float** | operating expense value |  [optional] |
|**operatingExpenseDelta** | **Float** | change in operating expense |  [optional] |
|**netIncome** | **Float** | net income value |  [optional] |
|**netIncomeDelta** | **Float** | change in net income |  [optional] |
|**netProfitMargin** | **Float** | net profit margin value |  [optional] |
|**netProfitMarginDelta** | **Float** | change in net profit margin |  [optional] |
|**earningsPerShare** | **Float** | earnings per share value |  [optional] |
|**earningsPerShareDelta** | **Float** | change in earnings per share |  [optional] |
|**ebitda** | **Float** | earnings before interest, taxes, deprecation, amortisation |  [optional] |
|**ebitdaDelta** | **Float** | change in ebitda |  [optional] |
|**effectiveTaxRate** | **Float** | effective tax rate value |  [optional] |
|**cashAndShortTermInvestments** | **Float** | cash and short-term investments value |  [optional] |
|**cashAndShortTermInvestmentsDelta** | **Float** | change in cash and short-term investments |  [optional] |
|**totalAssets** | **Float** | total assets value |  [optional] |
|**totalAssetsDelta** | **Float** | change in total assets |  [optional] |
|**totalLiabilities** | **Float** | total liabilities value |  [optional] |
|**totalLiabilitiesDelta** | **Float** | change in total liabilities |  [optional] |
|**totalEquity** | **Float** | total equity value |  [optional] |
|**sharesOutstanding** | **Float** | outstanding shares value |  [optional] |
|**priceToBook** | **Float** | price to book |  [optional] |
|**returnOnAssets** | **Float** | return on assets |  [optional] |
|**returnOnCapital** | **Float** | return on capital |  [optional] |
|**cashFromOperations** | **Float** | cash from operations |  [optional] |
|**cashFromOperationsDelta** | **Float** | change in cash from operations |  [optional] |
|**cashFromInvesting** | **Float** | cash from investing |  [optional] |
|**cashFromInvestingDelta** | **Float** | change in cash from investing |  [optional] |
|**cashFromFinancing** | **Float** | cash from financing/em&gt; |  [optional] |
|**cashFromFinancingDelta** | **Float** | change in cash from financing |  [optional] |
|**netChangeInCash** | **Float** | net change in cash |  [optional] |
|**netChangeInCashDelta** | **Float** | change in net change in cash |  [optional] |
|**freeCashFlow** | **Float** | free cash flow value |  [optional] |
|**freeCashFlowDelta** | **Float** | change in free cash flow |  [optional] |
|**pos1** | **BigDecimal** | number of organic SERPs where the domain ranks #1 |  [optional] |
|**pos23** | **BigDecimal** | number of organic SERPs where the domain ranks #2-3 |  [optional] |
|**pos410** | **BigDecimal** | number of organic SERPs where the domain ranks #4-10 |  [optional] |
|**pos1120** | **BigDecimal** | number of organic SERPs where the domain ranks #11-20 |  [optional] |
|**pos2130** | **BigDecimal** | number of organic SERPs where the domain ranks #21-30 |  [optional] |
|**pos3140** | **BigDecimal** | number of organic SERPs where the domain ranks #31-40 |  [optional] |
|**pos4150** | **BigDecimal** | number of organic SERPs where the domain ranks #41-50 |  [optional] |
|**pos5160** | **BigDecimal** | number of organic SERPs where the domain ranks #51-60 |  [optional] |
|**pos6170** | **BigDecimal** | number of organic SERPs where the domain ranks #61-70 |  [optional] |
|**pos7180** | **BigDecimal** | number of organic SERPs where the domain ranks #71-80 |  [optional] |
|**pos8190** | **BigDecimal** | number of organic SERPs where the domain ranks #81-90 |  [optional] |
|**pos91100** | **BigDecimal** | number of organic SERPs where the domain ranks #91-100 |  [optional] |
|**etv** | **Float** | estimated traffic volume estimated organic monthly traffic to the domain calculated as the product of CTR (click-through-rate) and search volume values of all keywords the domain ranks for learn more about how the metric is calculated in this help center article |  [optional] |
|**count** | **BigDecimal** | total count of organic SERPs that contain the domain |  [optional] |
|**estimatedPaidTrafficCost** | **Float** | estimated cost of converting organic search traffic into paid represents the estimated monthly cost of running ads (USD) for all keywords a domain ranks for the metric is calculated as the product of organic etv and paid cpc values and indicates the cost of driving the estimated volume of monthly organic traffic through PPC advertising in Google Search learn more about how the metric is calculated in this help center article |  [optional] |
|**isNew** | **Long** | number of new ranked elements indicates how many new ranked elements were found for this domain |  [optional] |
|**isUp** | **Long** | rank went up indicates how many ranked elements of this domain went up in Google Search |  [optional] |
|**isDown** | **Long** | rank went down indicates how many ranked elements of this domain went down in Google Search |  [optional] |
|**isLost** | **Long** | lost ranked elements indicates how many ranked elements of this domain were previously presented in SERPs, but weren’t found during the last check |  [optional] |




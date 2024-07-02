

# DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seType** | **String** | search engine type |  [optional] |
|**topCategories** | **List&lt;Integer&gt;** | categories for which domains are collected |  [optional] |
|**organicEtv** | **Float** | current organic ETV of the domain |  [optional] |
|**organicCount** | **Long** | current total count of organic SERPs that contain the domain |  [optional] |
|**organicIsLost** | **Integer** | current number of lost ranked elements indicates how many ranked elements of the domain were previously presented in SERPs, but weren’t found during the last check |  [optional] |
|**organicIsNew** | **Integer** | current number of new ranked elements indicates how many new ranked elements were found for the domain |  [optional] |
|**domain** | **String** | domain found for the specified category |  [optional] |
|**mainDomain** | **String** | primary domain |  [optional] |
|**metricsHistory** | **Map&lt;String, Map&lt;String, DataforseoLabsMetricsInfo&gt;&gt;** | historical ranking and traffic data of the domain |  [optional] |
|**metricsDifference** | [**Map&lt;String, DataforseoLabsMetricsInfo&gt;**](DataforseoLabsMetricsInfo.md) | metrics difference between first_date and second_date calculated by subtracting domain metrics as of the greater date from domain metrics as of the smaller date |  [optional] |




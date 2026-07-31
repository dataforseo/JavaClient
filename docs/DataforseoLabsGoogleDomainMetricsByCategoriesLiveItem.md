# DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**topCategories** | **List<Integer>** | <em>categories for which domains are collected</em> |[optional]|
**organicEtv** | **Double** | <em>current organic ETV of the domain</em> |[optional]|
**organicCount** | **Long** | <em>current total count of organic SERPs that contain the domain</em> |[optional]|
**organicIsLost** | **Integer** | <em>current number of lost ranked elements</em><br>indicates how many ranked elements of the domain were previously presented in SERPs, but weren’t found during the last check |[optional]|
**organicIsNew** | **Integer** | <em>current number of new ranked elements</em><br>indicates how many new ranked elements were found for the domain |[optional]|
**domain** | **String** | <em>domain found for the specified category</em> |[optional]|
**mainDomain** | **String** | <em>primary domain</em> |[optional]|
**metricsHistory** | **Map<String, Map<String, DataforseoLabsMetricsInfo>>** | <em>historical ranking and traffic data of the domain</em> |[optional]|
**metricsDifference** | **Map<String, DataforseoLabsMetricsInfo>** | <em>metrics difference between <code>first_date</code> and <code>second_date</code></em><br>calculated by subtracting domain metrics as of the greater date from domain metrics as of the smaller date |[optional]|
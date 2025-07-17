# BusinessListingAggregationInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**topCategories** | **Map<String, Long>** | the most mentioned related categories<br>top categories displayed with the number of businesses in each category |[optional]|
**topCountries** | **Map<String, Long>** | the most mentioned counties<br>country codes with the biggest number of businesses in the category |[optional]|
**websitesCount** | **Long** | number of unique websites |[optional]|
**count** | **Long** | number of unique entities |[optional]|
**topAttributes** | **Map<String, Long>** | the most mentioned service details<br>service details of a business entity displayed in a form of checks and the number of entities mentioning each attribute |[optional]|
**topPlaceTopics** | **Map<String, Long>** | top keywords mentioned in customer reviews<br>contains most popular keywords related to products/services mentioned in customer reviews of a business entity and the number of reviews mentioning each keyword |[optional]|
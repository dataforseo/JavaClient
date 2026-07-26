# BusinessListingAggregationInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**topCategories** | **Map<String, Long>** | <em>the most mentioned related categories</em><br>top categories displayed with the number of businesses in each category |[optional]|
**topCountries** | **Map<String, Long>** | <em>the most mentioned counties</em><br>country codes with the biggest number of businesses in the category |[optional]|
**websitesCount** | **Long** | <em>number of unique websites</em> |[optional]|
**count** | **Long** | <em>item types</em><br>the number of items in the <code>items</code> array |[optional]|
**topAttributes** | **Map<String, Long>** | <em>the most mentioned service details</em><br>service details of a business entity displayed in a form of checks and the number of entities mentioning each attribute |[optional]|
**topPlaceTopics** | **Map<String, Long>** | <em>top keywords mentioned in customer reviews</em><br>contains most popular keywords related to products/services mentioned in customer reviews of a business entity and the number of reviews mentioning each keyword |[optional]|
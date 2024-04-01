

# BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categories** | **List&lt;String&gt;** | business categories optional field the categories you specify are used to search for business listings; if you don’t use this field, we will return business listings found in the specified location; you can specify up to 10 categories |  [optional] |
|**description** | **String** | description of the element in SERP optional field the description of the business entity for which the results are collected; can contain up to 200 symbols |  [optional] |
|**title** | **String** | title of the element in SERP optional field the name of the business entity for which the results are collected; can contain up to 200 symbols |  [optional] |
|**isClaimed** | **Boolean** | indicates whether the business is verified by its owner on Google Maps optional field |  [optional] |
|**locationCoordinate** | **String** | GPS coordinates of a location optional field location_coordinate parameter should be specified in the “latitude,longitude,radius” format the maximum number of decimal digits for “latitude” and “longitude”: 7 the minimum value for “radius”: 1 the maximum value for “radius”: 100000 example: 53.476225,-2.243572,200 |  [optional] |
|**initialDatasetFilters** | **List&lt;Object&gt;** | array of results filtering parameters optional field you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: regex, &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;, &lt;&gt;, in, not_in, like, not_like you can use the % operator with like and not_like to match any string of zero or more characters example: [\&quot;rating.value\&quot;,\&quot;&gt;\&quot;,3] you can receive the list of available filters by making a separate request to https://api.dataforseo.com/v3/business_data/business_listings/available_filters |  [optional] |
|**internalListLimit** | **Integer** | maximum number of elements within internal arrays optional field you can use this field to limit the number of elements within the aggregated categories default value: 10 |  [optional] |
|**limit** | **Integer** | the maximum number of returned businesses optional field default value: 100 maximum value: 1000 |  [optional] |
|**offset** | **Integer** | the maximum number of returned businesses optional field |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




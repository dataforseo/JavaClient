# SerpBaiduLocationsResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**locationCode** | **Integer** | <em>location code</em> |[optional]|
**locationName** | **String** | <em>full name of the location</em> |[optional]|
**locationCodeParent** | **Integer** | <em>the code of the superordinate location</em><br>only <code>City</code> <code>location_type</code> is supported for all countries except China (where <code>Country</code> is also supported);<br>don't match locations by <code>location_code_parent</code> because the results for <code>Region</code> and <code>Country</code>-level results for most countries are not supported by Baidu SERP API |[optional]|
**countryIsoCode** | **String** | <em>ISO country code of the location</em> |[optional]|
**locationType** | **String** | <em>location type</em><br>only <code>City</code> is supported for all countries except China (where <code>Country</code> is also supported) |[optional]|
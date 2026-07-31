# SerpGoogleLocationsCountryResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**locationCode** | **Integer** | <em>location code</em> |[optional]|
**locationName** | **String** | <em>full name of the location</em> |[optional]|
**locationCodeParent** | **Integer** | <em>the code of the superordinate location</em><br>example:<br>`'location_code': 9041134`,<br>`'location_name': 'Vienna International Airport,Lower Austria,Austria'`,<br>`'location_code_parent': 20044`<p>where `location_code_parent` corresponds to:<p>`'location_code': 20044`,<br>`'location_name': 'Lower Austria,Austria'` |[optional]|
**countryIsoCode** | **String** | <em>ISO country code of the location</em> |[optional]|
**locationType** | **String** | <em>location type</em><br>indicates the geographic classification of the location<br>example:<br>`'location_type': 'Country'`, or `'location_type': 'State'` |[optional]|
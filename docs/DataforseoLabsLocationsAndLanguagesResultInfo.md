# DataforseoLabsLocationsAndLanguagesResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**locationCode** | **Integer** | <em>location code</em> |[optional]|
**locationName** | **String** | <em>full name of the location</em> |[optional]|
**locationCodeParent** | **Integer** | <em>the code of the superordinate location</em><br>the value will be <code>null</code> as <code>Country</code> is the only supported <code>location_type</code> for this API |[optional]|
**countryIsoCode** | **String** | <em>ISO country code of the location</em> |[optional]|
**locationType** | **String** | <em>location type</em><br>possible values:<br><code>Country</code> |[optional]|
**availableLanguages** | **List<AvailableLanguages>** | <em>supported languages</em><br>contains the languages which are supported for a specific location |[optional]|
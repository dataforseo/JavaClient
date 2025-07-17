# DataforseoLabsLocationsAndLanguagesResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**locationCode** | **Integer** | location code |[optional]|
**locationName** | **String** | full name of the location |[optional]|
**locationCodeParent** | **Integer** | the code of the superordinate location<br>the value will be null as Country is the only supported location_type for this API |[optional]|
**countryIsoCode** | **String** | ISO country code of the location |[optional]|
**locationType** | **String** | location type<br>possible values:<br>Country |[optional]|
**availableLanguages** | **List<AvailableLanguages>** | supported languages<br>contains the languages which are supported for a specific location |[optional]|
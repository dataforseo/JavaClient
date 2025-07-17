# HotelAboutInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**description** | **String** | description of the hotel<br>the description of the hotel entity for which the results are collected |[optional]|
**subDescriptions** | **List<String>** | additional description of the hotel<br>details about the hotel provided in addition to the description |[optional]|
**checkInTime** | **TimeInfo** | hotel check-in time<br>check-in time indicated in the hotel listing |[optional]|
**checkOutTime** | **TimeInfo** | hotel check-out time<br>check-out time indicated in the hotel listing |[optional]|
**fullAddress** | **String** | full address of the hotel<br>address of the hotel indicated in the standardised format |[optional]|
**domain** | **String** | hotel domain<br>domain of the hotel’s website |[optional]|
**url** | **String** | hotel url<br>URL to the hotel’s website indicated in the listing |[optional]|
**amenities** | **List<HotelAmenityInfo>** | hotel amenities<br>information about hotel amenities |[optional]|
**popularAmenities** | **List<HotelAmenityItemInfo>** | hotel amenities<br>information about hotel amenities labelled as “popular” |[optional]|
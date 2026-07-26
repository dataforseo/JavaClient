# HotelAboutInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**description** | **String** | <em>description of the hotel</em><br>the description of the hotel entity for which the results are collected |[optional]|
**subDescriptions** | **List<String>** | <em>additional description of the hotel</em><br>details about the hotel provided in addition to the description |[optional]|
**checkInTime** | **TimeInfo** | <em>hotel check-in time</em><br>check-in time indicated in the hotel listing |[optional]|
**checkOutTime** | **TimeInfo** | <em>hotel check-out time</em><br>check-out time indicated in the hotel listing |[optional]|
**fullAddress** | **String** | <em>full address of the hotel</em><br>address of the hotel indicated in the standardised format |[optional]|
**domain** | **String** | <em>hotel domain</em><br>domain of the hotel's website |[optional]|
**url** | **String** | <em>hotel url</em><br>URL to the hotel's website indicated in the listing |[optional]|
**amenities** | **List<HotelAmenityInfo>** | <em>hotel amenities</em><br>information about hotel amenities |[optional]|
**popularAmenities** | **List<HotelAmenityItemInfo>** | <em>hotel amenities</em><br>information about hotel amenities labelled as 'popular' |[optional]|
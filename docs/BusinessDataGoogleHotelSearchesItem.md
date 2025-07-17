# BusinessDataGoogleHotelSearchesItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**hotelIdentifier** | **String** | unique identifier of a hotel entity in Google search<br>example:<br>CgoI-KWyzenM_MV3EAE |[optional]|
**title** | **String** | title of the hotel |[optional]|
**stars** | **Integer** | hotel class rating<br>class rating that ranges between 1-5 stars |[optional]|
**isPaid** | **Boolean** | indicates a paid hotel listing<br>if true, related hotel_search_item is a paid ad<br>if false, related hotel_search_item is an organic hotel listing |[optional]|
**location** | **GpsCoordinatesLocationInfo** | GPS coordinates of the hotel’s location |[optional]|
**reviews** | **HotelReviewInfo** | hotel reviews and rating information |[optional]|
**overviewImages** | **List<String>** | featured images for a hotel |[optional]|
**prices** | **HotelPriceInfo** | hotel price |[optional]|
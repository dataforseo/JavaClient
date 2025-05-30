

# BusinessDataGoogleHotelSearchesItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**hotelIdentifier** | **String** | unique identifier of a hotel entity in Google search example: CgoI-KWyzenM_MV3EAE |  [optional] |
|**title** | **String** | title of the hotel |  [optional] |
|**stars** | **BigDecimal** | hotel class rating class rating that ranges between 1-5 stars |  [optional] |
|**isPaid** | **Boolean** | indicates a paid hotel listing if true, related hotel_search_item is a paid ad if false, related hotel_search_item is an organic hotel listing |  [optional] |
|**location** | [**GpsCoordinatesLocationInfo**](GpsCoordinatesLocationInfo.md) |  |  [optional] |
|**reviews** | [**HotelReviewInfo**](HotelReviewInfo.md) |  |  [optional] |
|**overviewImages** | **List&lt;String&gt;** | featured images for a hotel |  [optional] |
|**prices** | [**HotelPriceInfo**](HotelPriceInfo.md) |  |  [optional] |




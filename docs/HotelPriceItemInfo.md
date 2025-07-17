# HotelPriceItemInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | title of the hotel |[optional]|
**price** | **Double** | price per night |[optional]|
**currency** | **String** | price currency<br>USD is applied by default, unless specified in the POST array |[optional]|
**url** | **String** | third-party page url<br>URL to the third-party website page with pricing information |[optional]|
**domain** | **String** | third-party domain<br>domain of the third-party website page with pricing information |[optional]|
**isPaid** | **Boolean** | indicates a paid hotel listing<br>if true, related hotel_search_item is a paid ad<br>if false, related hotel_search_item is an organic hotel listing |[optional]|
**freeCancellationUntil** | **String** | date until which free cancellation is available<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>equals null if free cancellation is not available for the selected dates |[optional]|
**offers** | **List<HotelInfoPriceOffer>** | featured price offers |[optional]|
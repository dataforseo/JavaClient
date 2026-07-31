# HotelPriceItemInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | <em>title of the hotel</em> |[optional]|
**price** | **Double** | <em>price per night</em> |[optional]|
**currency** | **String** | <em>price currency</em><br><code>USD</code> is applied by default, unless specified in the POST array |[optional]|
**url** | **String** | third-party page url<br>URL to the third-party website page with pricing information |[optional]|
**domain** | **String** | third-party domain<br>domain of the third-party website page with pricing information |[optional]|
**isPaid** | **Boolean** | <em>indicates a paid hotel listing</strong></em><br>if <code>true</code>, related <code>hotel_search_item</code> is a paid ad<br>if <code>false</code>, related <code>hotel_search_item</code> is an organic hotel listing |[optional]|
**officialSite** | **Boolean** |  |[optional]|
**freeCancellationUntil** | **String** | date until which free cancellation is available<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>equals null if free cancellation is not available for the selected dates |[optional]|
**offers** | **List<HotelInfoPriceOffer>** |  |[optional]|
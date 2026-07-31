# HotelInfoPriceOffer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | <em>title of the hotel</em> |[optional]|
**price** | **Double** | <em>price per night</em> |[optional]|
**currency** | **String** | <em>price currency</em><br><code>USD</code> is applied by default, unless specified in the POST array |[optional]|
**url** | **String** | url of the price offer<br>URL to the page of the website where price offer appears |[optional]|
**maxVisitors** | **Integer** | the maximal number of visitors<br>the maximum number of visitors for which the price offer is valid |[optional]|
**offerImages** | **List<String>** | price offer images<br>URLs of the images featured in the price offer |[optional]|
**freeCancellationUntil** | **String** | date until free cancellation is available<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>equals null if free cancellation is not available for the selected dates |[optional]|
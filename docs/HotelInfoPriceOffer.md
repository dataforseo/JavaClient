# HotelInfoPriceOffer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | title of the hotel |[optional]|
**price** | **Double** | price per night |[optional]|
**currency** | **String** | price currency<br>USD is applied by default, unless specified in the POST array |[optional]|
**url** | **String** | url of the price offer<br>URL to the page of the website where price offer appears |[optional]|
**maxVisitors** | **Integer** | the maximal number of visitors<br>the maximum number of visitors for which the price offer is valid |[optional]|
**offerImages** | **List<String>** | price offer images<br>URLs of the images featured in the price offer |[optional]|
**freeCancellationUntil** | **String** | date until free cancellation is available<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>equals null if free cancellation is not available for the selected dates |[optional]|
# HotelLocationInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**neighborhood** | **String** | name of the neighborhood where the hotel is located |[optional]|
**neighborhoodDescription** | **String** | description of the neighborhood where the hotel is located |[optional]|
**mapsUrl** | **String** | url to the location of the hotel in google maps |[optional]|
**overallScore** | **Double** | overall score of the hotel location<br>indicates the overall score of the hotel’s location in the range from 1 to 5;<br>calculated based on data from the hotel’s proximity to nearby things to do and restaurants, transportation, and airports;<br>note that the criteria are not weighted equally in the overall score |[optional]|
**scoreByCategories** | **Map<String, Double>** | category scores of the hotel location<br>the scores of the hotel’s location tied to the categories that indicate the proximity to nearby things to do, restaurants, transportation, and airports; |[optional]|
**latitude** | **Double** | hotel latitude<br>latitude coordinates of the hotel’s location<br>example:<br>39.4806397 |[optional]|
**longitude** | **Double** | hotel longitude<br>latitude coordinates of the hotel’s location<br>example:<br>-106.0512973 |[optional]|
**locationChain** | **List<LocationChain>** | elements of the location chain<br>additional parameters of each element of the location chain |[optional]|
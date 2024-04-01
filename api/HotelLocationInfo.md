

# HotelLocationInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**neighborhood** | **String** | name of the neighborhood where the hotel is located |  [optional] |
|**neighborhoodDescription** | **String** | description of the neighborhood where the hotel is located |  [optional] |
|**mapsUrl** | **String** | url to the location of the hotel in google maps |  [optional] |
|**overallScore** | **Float** | overall score of the hotel location indicates the overall score of the hotel’s location in the range from 1 to 5; calculated based on data from the hotel’s proximity to nearby things to do and restaurants, transportation, and airports; note that the criteria are not weighted equally in the overall score |  [optional] |
|**scoreByCategories** | **Map&lt;String, Double&gt;** | category scores of the hotel location the scores of the hotel’s location tied to the categories that indicate the proximity to nearby things to do, restaurants, transportation, and airports; |  [optional] |
|**latitude** | **Float** | hotel latitude latitude coordinates of the hotel’s location example: 39.4806397 |  [optional] |
|**longitude** | **Float** | hotel longitude latitude coordinates of the hotel’s location example: -106.0512973 |  [optional] |
|**locationChain** | [**List&lt;LocationChain&gt;**](LocationChain.md) | elements of the location chain additional parameters of each element of the location chain |  [optional] |




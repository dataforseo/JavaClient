

# BusinessDataGoogleHotelInfoTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hotelIdentifier** | **String** | unique hotel identifier this field will contain the hotel_identifier parameter; example: CgoI-KWyzenM_MV3EAE |  [optional] |
|**locationCode** | **BigDecimal** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**title** | **String** | hotel title the title of the hotel entity for which the results are collected |  [optional] |
|**stars** | **BigDecimal** | hotel class rating class rating that ranges between 1-5 stars and displayed after review ratings in hotel summary |  [optional] |
|**starsDescription** | **String** | hotel class rating class rating that ranges between 1-5 stars and displayed after review ratings in the hotel summary |  [optional] |
|**address** | **String** | hotel address physical address of the hotel |  [optional] |
|**phone** | **String** | hotel phone number contact phone number of the hotel |  [optional] |
|**about** | [**HotelAboutInfo**](HotelAboutInfo.md) |  |  [optional] |
|**location** | [**HotelLocationInfo**](HotelLocationInfo.md) |  |  [optional] |
|**reviews** | [**HotelReviewInfo**](HotelReviewInfo.md) |  |  [optional] |
|**overviewImages** | **List&lt;String&gt;** | images displayed in the hotel overview array containing URLs to images displayed in the hotel overview |  [optional] |
|**prices** | [**HotelPriceInfo**](HotelPriceInfo.md) |  |  [optional] |




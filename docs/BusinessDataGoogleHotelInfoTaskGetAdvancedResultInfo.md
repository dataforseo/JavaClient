# BusinessDataGoogleHotelInfoTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**hotelIdentifier** | **String** | unique hotel identifier<br>this field will contain the hotel_identifier parameter;<br>example:<br>CgoI-KWyzenM_MV3EAE |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**checkUrl** | **String** | direct URL to search engine results<br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**title** | **String** | hotel title<br>the title of the hotel entity for which the results are collected |[optional]|
**stars** | **Integer** | hotel class rating<br>class rating that ranges between 1-5 stars and displayed after review ratings in hotel summary |[optional]|
**starsDescription** | **String** | hotel class rating<br>class rating that ranges between 1-5 stars and displayed after review ratings in the hotel summary |[optional]|
**address** | **String** | hotel address<br>physical address of the hotel |[optional]|
**phone** | **String** | hotel phone number<br>contact phone number of the hotel |[optional]|
**about** | **HotelAboutInfo** | information about the hotel |[optional]|
**location** | **HotelLocationInfo** | information about the hotel location<br>information about the location where the hotel is located |[optional]|
**reviews** | **HotelReviewInfo** | hotel reviews by criteria<br>information about reviews of the hotel entity |[optional]|
**overviewImages** | **List<String>** | images displayed in the hotel overview<br>array containing URLs to images displayed in the hotel overview |[optional]|
**prices** | **HotelPriceInfo** | pricing details of the hotel entity<br>contains information about the hotel’s prices |[optional]|
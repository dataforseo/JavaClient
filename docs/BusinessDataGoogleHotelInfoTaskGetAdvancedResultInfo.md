# BusinessDataGoogleHotelInfoTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**hotelIdentifier** | **String** | <em>unique hotel identifier</em><br>this field will contain the <code>hotel_identifier</code> parameter;<br>example:<br><code>CgoI-KWyzenM_MV3EAE</code> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**title** | **String** | <em>hotel title</em><br>the title of the hotel entity for which the results are collected |[optional]|
**stars** | **Integer** | <em>hotel class rating</em><br>class rating that ranges between 1-5 stars and displayed after review ratings in hotel summary |[optional]|
**starsDescription** | **String** | <em>hotel class rating</em><br>class rating that ranges between 1-5 stars and displayed after review ratings in the hotel summary |[optional]|
**address** | **String** | <em>hotel address</em><br>physical address of the hotel |[optional]|
**phone** | **String** | <em>hotel phone number</em><br>contact phone number of the hotel |[optional]|
**about** | **HotelAboutInfo** | <em>information about the hotel</em> |[optional]|
**location** | **HotelLocationInfo** | <em>information about the hotel location</em><br>information about the location where the hotel is located |[optional]|
**reviews** | **HotelReviewInfo** | <em>hotel reviews by criteria</em><br>information about reviews of the hotel entity |[optional]|
**overviewImages** | **List<String>** | <em>images displayed in the hotel overview</em><br>array containing URLs to images displayed in the hotel overview |[optional]|
**prices** | **HotelPriceInfo** | <em>pricing details of the hotel entity</em><br>contains information about the hotel's prices |[optional]|
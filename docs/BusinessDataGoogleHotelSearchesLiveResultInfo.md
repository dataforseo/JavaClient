

# BusinessDataGoogleHotelSearchesLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword received in a POST array keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results you can use it to make sure that we provided accurate results |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**itemsCount** | **Long** | item types the number of items in the items array |  [optional] |
|**items** | [**List&lt;BusinessDataGoogleHotelSearchesItem&gt;**](BusinessDataGoogleHotelSearchesItem.md) | array of items note: this field always equals null; use it to facilitate integration and ensure interoperability with the Hotel Info endpoint |  [optional] |




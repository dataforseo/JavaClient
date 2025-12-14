# DataforseoLabsGoogleHistoricalSerpsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type in a POST array |[optional]|
**keyword** | **String** | keyword received in a POST array<br>the keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**totalCount** | **Long** | the total amount of results in our database relevant to your request |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<DataforseoLabsGoogleHistoricalSerpsLiveItem>** | additional items present in the element<br>if there are none, equals null |[optional]|
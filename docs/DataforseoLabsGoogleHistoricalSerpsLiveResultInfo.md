# DataforseoLabsGoogleHistoricalSerpsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**keyword** | **String** | keyword received in a POST array<br>the keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |[optional]|
**locationCode** | **Integer** | location code in a POST array |[optional]|
**languageCode** | **String** | language code in a POST array |[optional]|
**totalCount** | **Integer** | the number of results returned in the items array |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<DataforseoLabsGoogleHistoricalSerpsLiveItem>** | contains arrays of specific images |[optional]|
# DataforseoLabsBingSerpCompetitorsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | search engine type |[optional]|
**seedKeywords** | **List<String>** | keywords specified in the request<br>keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character) |[optional]|
**locationCode** | **Integer** | location code in a POST array<br>if there is no data, then the value is null |[optional]|
**languageCode** | **String** | language code in a POST array<br>if there is no data, then the value is null |[optional]|
**totalCount** | **Long** | the total amount of results in our database relevant to your request |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<DataforseoLabsSerpCompetitorsLiveItem>** | contains detected SERP competitors and related data |[optional]|
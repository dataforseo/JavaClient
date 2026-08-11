# DataforseoLabsGoogleHistoricalSerpsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type in a POST array</em> |[optional]|
**keyword** | **String** | <em>keyword received in a POST array</em><br>            <strong>the keyword is returned with decoded %## (plus character ‘+’ will be decoded to a space character)</strong> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**totalCount** | **Long** | <em>the total amount of results in our database relevant to your request</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <code>items</code> array</em> |[optional]|
**items** | **List<DataforseoLabsGoogleHistoricalSerpsLiveItem>** | <em>historical SERPs and related data found in the database</em> |[optional]|
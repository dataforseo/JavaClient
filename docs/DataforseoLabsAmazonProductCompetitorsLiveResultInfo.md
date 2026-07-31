# DataforseoLabsAmazonProductCompetitorsLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**asin** | **String** | <em>ASIN in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em><br>if there is no data, then the value is_<code>null</code> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em><br>if there is no data, then the value is_<code>null</code> |[optional]|
**totalCount** | **Long** | <em>total amount of results in our database relevant to your request</em> |[optional]|
**itemsCount** | **Long** | <em>the number of results returned in the <code>items</code> array</em> |[optional]|
**items** | **List<DataforseoLabsAmazonProductCompetitorsLiveItem>** | <em>contains detected Amazon product competitors and related data</em> |[optional]|
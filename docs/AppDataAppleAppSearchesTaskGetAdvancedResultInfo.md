

# AppDataAppleAppSearchesTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | keyword received in a POST request |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **BigDecimal** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results in this case, the value will be null |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**seResultsCount** | **BigDecimal** | the total number of results |  [optional] |
|**itemsCount** | **BigDecimal** | the number of items in the results array |  [optional] |
|**items** | [**List&lt;BaseAppDataSerpElementItem&gt;**](BaseAppDataSerpElementItem.md) | found apps |  [optional] |




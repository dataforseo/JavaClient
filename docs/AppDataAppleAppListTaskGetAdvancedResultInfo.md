

# AppDataAppleAppListTaskGetAdvancedResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyword** | **String** | app collection received in a POST array |  [optional] |
|**seDomain** | **String** | search engine domain in a POST array |  [optional] |
|**locationCode** | **Integer** | location code in a POST array |  [optional] |
|**languageCode** | **String** | language code in a POST array |  [optional] |
|**checkUrl** | **String** | direct URL to search engine results in this case, the value will be null |  [optional] |
|**datetime** | **String** | date and time when the result was received in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00 |  [optional] |
|**seResultsCount** | **Long** | the total number of results |  [optional] |
|**itemsCount** | **Long** | the number of app items in the results array you can get more results by using the depth parameter when setting a task |  [optional] |
|**items** | [**List&lt;BaseAppDataSerpElementItem&gt;**](BaseAppDataSerpElementItem.md) | found apps you can get more results by using the depth parameter when setting a task |  [optional] |




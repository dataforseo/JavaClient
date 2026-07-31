# AppDataAppleAppListingsSearchLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**totalCount** | **Long** | <em>the total number of relevant results in the database</em> |[optional]|
**count** | **Long** | <em>the number of items in the results array</em> |[optional]|
**offset** | **Integer** | <em>offset in the results array of returned apps</em> |[optional]|
**offsetToken** | **String** | <em>token for subsequent requests</em><br>you can use this parameter in the POST request to avoid timeouts while trying to obtain over 100,000 results in a single request |[optional]|
**items** | **List<AppDataAppleAppListingsSearchLiveItem>** | <em>array of apps and related data</em> |[optional]|
# AppDataAppleAppListingsSearchLiveItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**appId** | **String** | <em>ID of the returned app</em> |[optional]|
**seDomain** | **String** | <em>search engine domain in a POST array</em> |[optional]|
**locationCode** | **Integer** | <em>location code in a POST array</em> |[optional]|
**languageCode** | **String** | <em>language code in a POST array</em> |[optional]|
**checkUrl** | **String** | <em>direct URL to search engine results</em><br>you can use it to make sure that we provided accurate results |[optional]|
**timeUpdate** | **String** | <em>date and time when SERP data was last updated</em><br>in the <a href='https://en.wikipedia.org/wiki/ISO_8601'>ISO 8601</a> format: “YYYY-MM-DDThh:mm:ss.sssssssZ”<br>example:<br><code class='long-string'>2023-05-23 10:16:19 +00:00</code> |[optional]|
**item** | **AppStoreInfoOrganic** | <em>detailed information about the app</em> |[optional]|
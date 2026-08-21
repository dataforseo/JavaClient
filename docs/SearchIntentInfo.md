# SearchIntentInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**seType** | **String** | <em>search engine type</em> |[optional]|
**mainIntent** | **String** | <em>main search intent</em><br>possible values: <code>informational</code>, <code>navigational</code>, <code>commercial</code>, <code>transactional</code> |[optional]|
**foreignIntent** | **List<String>** | <em>supplementary search intents</em><br>possible values: <code>informational</code>, <code>navigational</code>, <code>commercial</code>, <code>transactional</code> |[optional]|
**lastUpdatedTime** | **String** | <em>date and time when keyword data was updated</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
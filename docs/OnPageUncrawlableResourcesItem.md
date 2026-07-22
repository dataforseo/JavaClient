# OnPageUncrawlableResourcesItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**url** | **String** | URL of the uncrawlable resource |[optional]|
**reason** | **String** | reason the resource is uncrawlable<br>can take the following values: content_type_inconsistency |[optional]|
**statusCode** | **Integer** | general status code<br>you can find the full list of the response codes here<br>Note: we strongly recommend designing a necessary system for handling related exceptional or error conditions |[optional]|
**fetchTime** | **String** | date and time when the resource was fetched<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2026-03-09 18:20:32 +00:00 |[optional]|
**meta** | **UncrawlableResourcesMeta** | metadata of the uncrawlable resource |[optional]|
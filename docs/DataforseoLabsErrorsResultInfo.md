# DataforseoLabsErrorsResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**id** | **String** | <em>task identifier</em><br><strong>unique task identifier in our system in the <a href='https://en.wikipedia.org/wiki/Universally_unique_identifier'>UUID</a> format</strong> |[optional]|
**datetime** | **String** | <em>date and time when an error occurred</em><br>in the UTC format: 'yyyy-mm-dd hh-mm-ss +00:00'<br>example:<br><code>2019-11-15 12:57:46 +00:00</code> |[optional]|
**function** | **String** | <em>corresponding API function</em> |[optional]|
**errorCode** | **Integer** | <em>error code</em> |[optional]|
**errorMessage** | **String** | <em>error message or error URL</em><br>error message <a href='https://docs.dataforseo.com/v3/appendix/errors/' rel='noopener noreferrer' target='_blank'>(see full list)</a> or URL that caused an error |[optional]|
**httpUrl** | **String** | <em>URL that caused an error</em><br>URL you used for making an API call |[optional]|
**httpMethod** | **String** | <em>HTTP method</em> |[optional]|
**httpCode** | **Integer** | <em>HTTP status code</em> |[optional]|
**httpTime** | **Double** | <em>time taken by HTTP request</em> |[optional]|
**httpResponse** | **String** | <em>HTTP response</em><br>server response |[optional]|
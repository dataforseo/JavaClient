# AppendixApi

Knowledge base for `io.github.dataforseo.client.api.AppendixApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

Account and service information that applies to the whole DataForSEO API rather than to a data source: account balance, spending, limits and prices, the current status of the APIs, the list of error codes, and re-sending webhooks (pingbacks and postbacks) of completed tasks.

## Use it when you need

- To check credentials and connectivity, or the remaining balance and limits before running a job.
- To find out whether a problem is on DataForSEO's side.
- The meaning of an error code returned in a response.
- To receive webhooks of finished tasks again, for example after your receiving endpoint was unavailable.

This section returns no SEO or marketing data; for that use the other API classes listed in SKILL.md.

## Examples

Generated from the API specification in the same way as the client tests. Replace `USERNAME` / `PASSWORD` with your API login and password. Every example is a method body that throws `ApiException` and needs:

```java
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.HttpBasicAuth;
import io.github.dataforseo.client.api.*;
import io.github.dataforseo.client.model.*;
import java.util.List;
import java.util.Map;
```

### userData

`GET /v3/appendix/user_data`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppendixApi apiInstance = new AppendixApi(defaultClient);

AppendixUserDataResponseInfo response = apiInstance.userData();
```

### appendixStatus

`GET /v3/appendix/status`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppendixApi apiInstance = new AppendixApi(defaultClient);

AppendixStatusResponseInfo response = apiInstance.appendixStatus();
```

### errors

`GET /v3/appendix/errors`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AppendixApi apiInstance = new AppendixApi(defaultClient);

AppendixErrorsResponseInfo response = apiInstance.errors();
```

## Endpoints

All methods of `AppendixApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `userData` | GET | `/v3/appendix/user_data` |
| `errors` | GET | `/v3/appendix/errors` |
| `webhookResend` | POST | `/v3/appendix/webhook_resend` |
| `appendixStatus` | GET | `/v3/appendix/status` |
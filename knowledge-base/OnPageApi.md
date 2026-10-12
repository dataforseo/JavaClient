# OnPageApi

Knowledge base for `io.github.dataforseo.client.api.OnPageApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

Technical SEO audit of websites with a configurable crawler: crawl a site and get per-page checks, resources, internal and external links, duplicates, redirects, indexability issues, keyword density and page speed data; or analyze individual pages instantly, extract their content, take screenshots and run Google Lighthouse.

A full site audit is a crawl task: it is started once and its reports can be read while the crawl is running or after it finishes. Single-page analysis returns results immediately.

## Use it when you need

- A site health check: broken pages and resources, duplicate titles, descriptions or content, redirect chains, pages blocked from indexing and other on-page issues.
- The structure of a site: its pages, resources and the links between them.
- On-page data of a single URL: meta tags, headings, checks, parsed main content or the raw HTML.
- Performance, accessibility and best-practice scores of a page.

## Use another API when

- You need inbound links from other sites: `BacklinksApi`.
- You need how pages rank in search: `SerpApi` or `DataforseoLabsApi`.
- You need which technologies a site uses: `DomainAnalyticsApi`.

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

### instantPages

`POST /v3/on_page/instant_pages`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
OnPageApi apiInstance = new OnPageApi(defaultClient);
OnPageInstantPagesRequestInfo model = new OnPageInstantPagesRequestInfo()
    .url("https://dataforseo.com/blog")
    .enableJavascript(true)
    .customJs("meta = {}; meta.url = document.URL; meta;");
OnPageInstantPagesResponseInfo response = apiInstance.instantPages(List.of(model));
```

### rawHtml

`POST /v3/on_page/raw_html`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
OnPageApi apiInstance = new OnPageApi(defaultClient);
OnPageRawHtmlRequestInfo model = new OnPageRawHtmlRequestInfo()
    .id("07281559-0695-0216-0000-c269be8b7592")
    .url("https://dataforseo.com/apis");
OnPageRawHtmlResponseInfo response = apiInstance.rawHtml(List.of(model));
```

### summary

`GET /v3/on_page/summary/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
OnPageApi apiInstance = new OnPageApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
OnPageSummaryResponseInfo response = apiInstance.summary(id);
```

### pages

`POST /v3/on_page/pages`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
OnPageApi apiInstance = new OnPageApi(defaultClient);
OnPagePagesRequestInfo model = new OnPagePagesRequestInfo()
    .id("07281559-0695-0216-0000-c269be8b7592")
    .filters(List.of(
        List.of(
            "resource_type",
            "=",
            "html"
        ),
        "and",
        List.of(
            "meta.scripts_count",
            ">",
            40
        )
    ))
    .orderBy(List.of(
        "meta.content.plain_text_word_count,desc"
    ))
    .limit(10);
OnPagePagesResponseInfo response = apiInstance.pages(List.of(model));
```

### contentParsingLive

`POST /v3/on_page/content_parsing/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
OnPageApi apiInstance = new OnPageApi(defaultClient);
OnPageContentParsingLiveRequestInfo model = new OnPageContentParsingLiveRequestInfo()
    .url("https://dataforseo.com/blog/a-versatile-alternative-to-google-trends-exploring-the-power-of-dataforseo-trends-api");
OnPageContentParsingLiveResponseInfo response = apiInstance.contentParsingLive(List.of(model));
```

### taskPost

`POST /v3/on_page/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
OnPageApi apiInstance = new OnPageApi(defaultClient);
OnPageTaskPostRequestInfo model = new OnPageTaskPostRequestInfo()
    .target("dataforseo.com")
    .maxCrawlPages(10)
    .loadResources(true)
    .enableJavascript(true)
    .customJs("meta = {}; meta.url = document.URL; meta;")
    .tag("some_string_123")
    .pingbackUrl("https://your-server.com/pingscript?id=$id&tag=$tag");
OnPageTaskPostResponseInfo response = apiInstance.taskPost(List.of(model));
```

### links

`POST /v3/on_page/links`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
OnPageApi apiInstance = new OnPageApi(defaultClient);
OnPageLinksRequestInfo model = new OnPageLinksRequestInfo()
    .id("07281559-0695-0216-0000-c269be8b7592")
    .pageFrom("/apis/google-trends-api")
    .filters(List.of(
        List.of(
            "dofollow",
            "=",
            true
        ),
        "and",
        List.of(
            "direction",
            "=",
            "external"
        )
    ))
    .limit(10);
OnPageLinksResponseInfo response = apiInstance.links(List.of(model));
```

### microdata

`POST /v3/on_page/microdata`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
OnPageApi apiInstance = new OnPageApi(defaultClient);
OnPageMicrodataRequestInfo model = new OnPageMicrodataRequestInfo()
    .id("02241700-1535-0216-0000-034137259bc1")
    .url("https://dataforseo.com/apis");
OnPageMicrodataResponseInfo response = apiInstance.microdata(List.of(model));
```

### onPageTasksReady

`GET /v3/on_page/tasks_ready`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
OnPageApi apiInstance = new OnPageApi(defaultClient);

OnPageTasksReadyResponseInfo response = apiInstance.onPageTasksReady();
```

## Endpoints

All methods of `OnPageApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `onPageIdList` | POST | `/v3/on_page/id_list` |
| `onPageErrors` | POST | `/v3/on_page/errors` |
| `forceStop` | POST | `/v3/on_page/force_stop` |
| `onPageAvailableFilters` | GET | `/v3/on_page/available_filters` |
| `taskPost` | POST | `/v3/on_page/task_post` |
| `onPageTasksReady` | GET | `/v3/on_page/tasks_ready` |
| `summary` | GET | `/v3/on_page/summary/{id}` |
| `pages` | POST | `/v3/on_page/pages` |
| `pagesByResource` | POST | `/v3/on_page/pages_by_resource` |
| `resources` | POST | `/v3/on_page/resources` |
| `duplicateTags` | POST | `/v3/on_page/duplicate_tags` |
| `duplicateContent` | POST | `/v3/on_page/duplicate_content` |
| `links` | POST | `/v3/on_page/links` |
| `redirectChains` | POST | `/v3/on_page/redirect_chains` |
| `nonIndexable` | POST | `/v3/on_page/non_indexable` |
| `waterfall` | POST | `/v3/on_page/waterfall` |
| `keywordDensity` | POST | `/v3/on_page/keyword_density` |
| `microdata` | POST | `/v3/on_page/microdata` |
| `uncrawlableResources` | POST | `/v3/on_page/uncrawlable_resources` |
| `rawHtml` | POST | `/v3/on_page/raw_html` |
| `pageScreenshot` | POST | `/v3/on_page/page_screenshot` |
| `contentParsing` | POST | `/v3/on_page/content_parsing` |
| `contentParsingLive` | POST | `/v3/on_page/content_parsing/live` |
| `instantPages` | POST | `/v3/on_page/instant_pages` |
| `lighthouseLanguages` | GET | `/v3/on_page/lighthouse/languages` |
| `lighthouseAudits` | GET | `/v3/on_page/lighthouse/audits` |
| `lighthouseVersions` | GET | `/v3/on_page/lighthouse/versions` |
| `lighthouseTaskPost` | POST | `/v3/on_page/lighthouse/task_post` |
| `lighthouseTasksReady` | GET | `/v3/on_page/lighthouse/tasks_ready` |
| `lighthouseTaskGetJson` | GET | `/v3/on_page/lighthouse/task_get/json/{id}` |
| `lighthouseLiveJson` | POST | `/v3/on_page/lighthouse/live/json` |
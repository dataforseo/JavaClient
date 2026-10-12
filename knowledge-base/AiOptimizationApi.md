# AiOptimizationApi

Knowledge base for `io.github.dataforseo.client.api.AiOptimizationApi` of the DataForSEO Java client. Naming rules, the response envelope, polymorphic items and errors are described in [SKILL.md](../SKILL.md).

Data for AI search optimization (GEO): answers of large language models such as ChatGPT, Claude, Gemini and Perplexity to your prompts, results scraped from the web interfaces of AI assistants, search volume of keywords in AI tools, and how often brands, domains and pages are mentioned in AI-generated answers.

## Use it when you need

- To send a prompt to an LLM through one API and get its answer, the sources it cites and the usage cost, for example to benchmark several models.
- What end users actually see in an AI assistant for a query, including cited sources and mentioned brands.
- How popular a keyword or topic is among AI assistant users.
- Brand visibility in AI answers: where a brand or domain is mentioned, for which queries, how often, compared with competitors and over time.

## Use another API when

- You need classic search engine results, including AI answers embedded in search results pages: `SerpApi`.
- You need keyword metrics for classic search: `KeywordsDataApi` or `DataforseoLabsApi`.
- You need brand mentions on regular web pages: `ContentAnalysisApi`.

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

### geminiLlmScraperTaskGetAdvanced

`GET /v3/ai_optimization/gemini/llm_scraper/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
AiOptimizationGeminiLlmScraperTaskGetAdvancedResponseInfo response = apiInstance.geminiLlmScraperTaskGetAdvanced(id);
```

### chatGptLlmScraperTaskGetAdvanced

`GET /v3/ai_optimization/chat_gpt/llm_scraper/task_get/advanced/{id}`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
String id = "00000000-0000-0000-0000-000000000000";
AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo response = apiInstance.chatGptLlmScraperTaskGetAdvanced(id);
```

### chatGptLlmScraperTaskPost

`POST /v3/ai_optimization/chat_gpt/llm_scraper/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
AiOptimizationChatGptLlmScraperTaskPostRequestInfo model = new AiOptimizationChatGptLlmScraperTaskPostRequestInfo()
    .languageCode("en")
    .locationCode(2840)
    .keyword("what is chatgpt");
AiOptimizationChatGptLlmScraperTaskPostResponseInfo response = apiInstance.chatGptLlmScraperTaskPost(List.of(model));
```

### geminiLlmScraperTaskPost

`POST /v3/ai_optimization/gemini/llm_scraper/task_post`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
AiOptimizationGeminiLlmScraperTaskPostRequestInfo model = new AiOptimizationGeminiLlmScraperTaskPostRequestInfo()
    .languageCode("en")
    .locationCode(2840)
    .keyword("albert einstein");
AiOptimizationGeminiLlmScraperTaskPostResponseInfo response = apiInstance.geminiLlmScraperTaskPost(List.of(model));
```

### chatGptLlmScraperTasksReady

`GET /v3/ai_optimization/chat_gpt/llm_scraper/tasks_ready`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);

AiOptimizationChatGptLlmScraperTasksReadyResponseInfo response = apiInstance.chatGptLlmScraperTasksReady();
```

### chatGptLlmScraperLiveAdvanced

`POST /v3/ai_optimization/chat_gpt/llm_scraper/live/advanced`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo model = new AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo()
    .languageCode("en")
    .locationCode(2840)
    .keyword("albert einstein");
AiOptimizationChatGptLlmScraperLiveAdvancedResponseInfo response = apiInstance.chatGptLlmScraperLiveAdvanced(List.of(model));
```

### perplexityLlmResponsesLive

`POST /v3/ai_optimization/perplexity/llm_responses/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
AiOptimizationPerplexityLlmResponsesLiveRequestInfo model = new AiOptimizationPerplexityLlmResponsesLiveRequestInfo()
    .systemMessage("communicate as if we are in a business meeting")
    .messageChain(List.of(
        new LlmMessageChainItem()
            .role("user")
            .message("Hello, what’s up?"),
        new LlmMessageChainItem()
            .role("ai")
            .message("Hello! I’m doing well, thank you. How can I assist you today? Are there any specific topics or projects you’d like to discuss in our meeting?")
    ))
    .maxOutputTokens(200)
    .temperature(0.3d)
    .topP(0.5d)
    .webSearchCountryIsoCode("FR")
    .modelName("sonar")
    .userPrompt("provide information on how relevant the amusement park business is in France now");
AiOptimizationPerplexityLlmResponsesLiveResponseInfo response = apiInstance.perplexityLlmResponsesLive(List.of(model));
```

### geminiLlmScraperLiveAdvanced

`POST /v3/ai_optimization/gemini/llm_scraper/live/advanced`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
AiOptimizationGeminiLlmScraperLiveAdvancedRequestInfo model = new AiOptimizationGeminiLlmScraperLiveAdvancedRequestInfo()
    .languageCode("en")
    .locationCode(2840)
    .keyword("albert einstein");
AiOptimizationGeminiLlmScraperLiveAdvancedResponseInfo response = apiInstance.geminiLlmScraperLiveAdvanced(List.of(model));
```

### chatGptLlmResponsesLive

`POST /v3/ai_optimization/chat_gpt/llm_responses/live`

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setBasePath("https://api.dataforseo.com");


// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("USERNAME");
basicAuth.setPassword("PASSWORD");
AiOptimizationApi apiInstance = new AiOptimizationApi(defaultClient);
AiOptimizationChatGptLlmResponsesLiveRequestInfo model = new AiOptimizationChatGptLlmResponsesLiveRequestInfo()
    .systemMessage("communicate as if we are in a business meeting")
    .messageChain(List.of(
        new LlmMessageChainItem()
            .role("user")
            .message("Hello, what’s up?"),
        new LlmMessageChainItem()
            .role("ai")
            .message("Hello! I’m doing well, thank you. How can I assist you today? Are there any specific topics or projects you’d like to discuss in our meeting?")
    ))
    .maxOutputTokens(200)
    .temperature(0.3d)
    .topP(0.5d)
    .modelName("gpt-4.1-mini")
    .webSearch(true)
    .webSearchCountryIsoCode("FR")
    .webSearchCity("Paris")
    .userPrompt("provide information on how relevant the amusement park business is in France now");
AiOptimizationChatGptLlmResponsesLiveResponseInfo response = apiInstance.chatGptLlmResponsesLive(List.of(model));
```

## Endpoints

All methods of `AiOptimizationApi`. Request and response model names are derived from the path (see SKILL.md).

| Method | HTTP | Path |
|---|---|---|
| `chatGptLlmScraperLocations` | GET | `/v3/ai_optimization/chat_gpt/llm_scraper/locations` |
| `chatGptLlmScraperLocationsCountry` | GET | `/v3/ai_optimization/chat_gpt/llm_scraper/locations/{country}` |
| `chatGptLlmScraperLanguages` | GET | `/v3/ai_optimization/chat_gpt/llm_scraper/languages` |
| `chatGptLlmScraperTaskPost` | POST | `/v3/ai_optimization/chat_gpt/llm_scraper/task_post` |
| `chatGptLlmScraperTasksReady` | GET | `/v3/ai_optimization/chat_gpt/llm_scraper/tasks_ready` |
| `chatGptLlmScraperTaskGetAdvanced` | GET | `/v3/ai_optimization/chat_gpt/llm_scraper/task_get/advanced/{id}` |
| `chatGptLlmScraperTaskGetHtml` | GET | `/v3/ai_optimization/chat_gpt/llm_scraper/task_get/html/{id}` |
| `chatGptLlmScraperLiveAdvanced` | POST | `/v3/ai_optimization/chat_gpt/llm_scraper/live/advanced` |
| `chatGptLlmScraperLiveHtml` | POST | `/v3/ai_optimization/chat_gpt/llm_scraper/live/html` |
| `chatGptLlmResponsesModels` | GET | `/v3/ai_optimization/chat_gpt/llm_responses/models` |
| `chatGptLlmResponsesLive` | POST | `/v3/ai_optimization/chat_gpt/llm_responses/live` |
| `chatGptLlmResponsesTaskPost` | POST | `/v3/ai_optimization/chat_gpt/llm_responses/task_post` |
| `chatGptLlmResponsesTasksReady` | GET | `/v3/ai_optimization/chat_gpt/llm_responses/tasks_ready` |
| `chatGptLlmResponsesTaskGet` | GET | `/v3/ai_optimization/chat_gpt/llm_responses/task_get/{id}` |
| `claudeLlmResponsesModels` | GET | `/v3/ai_optimization/claude/llm_responses/models` |
| `claudeLlmResponsesLive` | POST | `/v3/ai_optimization/claude/llm_responses/live` |
| `claudeLlmResponsesTaskPost` | POST | `/v3/ai_optimization/claude/llm_responses/task_post` |
| `claudeLlmResponsesTasksReady` | GET | `/v3/ai_optimization/claude/llm_responses/tasks_ready` |
| `claudeLlmResponsesTaskGet` | GET | `/v3/ai_optimization/claude/llm_responses/task_get/{id}` |
| `geminiLlmResponsesModels` | GET | `/v3/ai_optimization/gemini/llm_responses/models` |
| `geminiLlmResponsesTaskPost` | POST | `/v3/ai_optimization/gemini/llm_responses/task_post` |
| `geminiLlmResponsesTasksReady` | GET | `/v3/ai_optimization/gemini/llm_responses/tasks_ready` |
| `geminiLlmResponsesTaskGet` | GET | `/v3/ai_optimization/gemini/llm_responses/task_get/{id}` |
| `geminiLlmResponsesLive` | POST | `/v3/ai_optimization/gemini/llm_responses/live` |
| `perplexityLlmResponsesModels` | GET | `/v3/ai_optimization/perplexity/llm_responses/models` |
| `perplexityLlmResponsesLive` | POST | `/v3/ai_optimization/perplexity/llm_responses/live` |
| `geminiLlmScraperLocations` | GET | `/v3/ai_optimization/gemini/llm_scraper/locations` |
| `geminiLlmScraperLanguages` | GET | `/v3/ai_optimization/gemini/llm_scraper/languages` |
| `geminiLlmScraperTaskPost` | POST | `/v3/ai_optimization/gemini/llm_scraper/task_post` |
| `geminiLlmScraperTasksReady` | GET | `/v3/ai_optimization/gemini/llm_scraper/tasks_ready` |
| `geminiLlmScraperTaskGetAdvanced` | GET | `/v3/ai_optimization/gemini/llm_scraper/task_get/advanced/{id}` |
| `geminiLlmScraperTaskGetHtml` | GET | `/v3/ai_optimization/gemini/llm_scraper/task_get/html/{id}` |
| `geminiLlmScraperLiveAdvanced` | POST | `/v3/ai_optimization/gemini/llm_scraper/live/advanced` |
| `geminiLlmScraperLiveHtml` | POST | `/v3/ai_optimization/gemini/llm_scraper/live/html` |
| `aiKeywordDataAvailableFilters` | GET | `/v3/ai_optimization/ai_keyword_data/available_filters` |
| `aiKeywordDataLocationsAndLanguages` | GET | `/v3/ai_optimization/ai_keyword_data/locations_and_languages` |
| `aiKeywordDataKeywordsSearchVolumeLive` | POST | `/v3/ai_optimization/ai_keyword_data/keywords_search_volume/live` |
| `llmMentionsAvailableFilters` | GET | `/v3/ai_optimization/llm_mentions/available_filters` |
| `llmMentionsLocationsAndLanguages` | GET | `/v3/ai_optimization/llm_mentions/locations_and_languages` |
| `llmMentionsSearchMentionsLive` | POST | `/v3/ai_optimization/llm_mentions/search_mentions/live` |
| `llmMentionsTargetMetricsLive` | POST | `/v3/ai_optimization/llm_mentions/target_metrics/live` |
| `llmMentionsMultiTargetMetricsLive` | POST | `/v3/ai_optimization/llm_mentions/multi_target_metrics/live` |
| `llmMentionsTopMentionedDomainsLive` | POST | `/v3/ai_optimization/llm_mentions/top_mentioned_domains/live` |
| `llmMentionsTopMentionedPagesLive` | POST | `/v3/ai_optimization/llm_mentions/top_mentioned_pages/live` |
| `llmMentionsTopMentionedBrandsLive` | POST | `/v3/ai_optimization/llm_mentions/top_mentioned_brands/live` |
| `llmMentionsTopMentionedBrandCategoriesLive` | POST | `/v3/ai_optimization/llm_mentions/top_mentioned_brand_categories/live` |
| `llmMentionsTargetMetricsLiteLive` | POST | `/v3/ai_optimization/llm_mentions/target_metrics_lite/live` |
| `llmMentionsTopMentionedDomainsLiteLive` | POST | `/v3/ai_optimization/llm_mentions/top_mentioned_domains_lite/live` |
| `llmMentionsTopMentionedPagesLiteLive` | POST | `/v3/ai_optimization/llm_mentions/top_mentioned_pages_lite/live` |
| `llmMentionsTopMentionedBrandsLiteLive` | POST | `/v3/ai_optimization/llm_mentions/top_mentioned_brands_lite/live` |
| `llmMentionsTopMentionedBrandCategoriesLiteLive` | POST | `/v3/ai_optimization/llm_mentions/top_mentioned_brand_categories_lite/live` |
| `llmMentionsHistoricalLive` | POST | `/v3/ai_optimization/llm_mentions/historical/live` |
| `llmMentionsTimeseriesDeltaLive` | POST | `/v3/ai_optimization/llm_mentions/timeseries_delta/live` |
| `llmMentionsTimeseriesNewLostLive` | POST | `/v3/ai_optimization/llm_mentions/timeseries_new_lost/live` |
# AiOptimizationChatGptLlmResponsesLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**modelName** | **String** | <em>name of the AI model used</em> |[optional]|
**inputTokens** | **Integer** | <em>number of tokens in the input</em><br>total count of tokens processed |[optional]|
**outputTokens** | **Integer** | <em>number of tokens in the output</em><br>total count of tokens generated in the AI response |[optional]|
**reasoningTokens** | **Integer** | <em>number of reasoning tokens</em><br>total count of tokens used to generate reasoning content |[optional]|
**webSearch** | **Boolean** | <em>indicates if web search was used</em> |[optional]|
**moneySpent** | **Double** | <em>cost of AI tokens, USD</em><br>the price charged by the third-party AI model provider for according to its <a href='https://platform.openai.com/docs/pricing' target='_blank'>Pricing</a> |[optional]|
**datetime** | **String** | <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code> |[optional]|
**items** | **List<BaseAiOptimizationLlmResponseElementItem>** | <em>array of response items</em><br>contains structured AI response data |[optional]|
**fanOutQueries** | **List<String>** | <em>array of fan-out queries</em><br>contains related search queries derived from the main query to provide a more comprehensive response |[optional]|
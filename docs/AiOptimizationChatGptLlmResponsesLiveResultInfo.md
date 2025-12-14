# AiOptimizationChatGptLlmResponsesLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**modelName** | **String** | name of the AI model used |[optional]|
**inputTokens** | **Integer** | number of tokens in the input<br>total count of tokens processed |[optional]|
**outputTokens** | **Integer** | number of tokens in the output<br>total count of tokens generated in the AI response |[optional]|
**webSearch** | **Boolean** | indicates if web search was used |[optional]|
**moneySpent** | **Double** | cost of AI tokens, USD<br>the price charged by the third-party AI model provider for according to its Pricing |[optional]|
**datetime** | **String** | date and time when the result was received<br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br>2019-11-15 12:57:46 +00:00 |[optional]|
**items** | **List<AiOptimizationItem>** | array of response items<br>contains structured AI response data |[optional]|
**fanOutQueries** | **List<String>** | array of fan-out queries<br>contains related search queries derived from the main query to provide a more comprehensive response |[optional]|
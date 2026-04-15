# AiOptimizationChatGptLlmResponsesLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**modelName** | **String** | name of the AI model used |[optional]|
**inputTokens** | **Integer** | number of tokens in the inputtotal count of tokens processed |[optional]|
**outputTokens** | **Integer** | number of tokens in the outputtotal count of tokens generated in the AI response |[optional]|
**reasoningTokens** | **Integer** | number of reasoning tokenstotal count of tokens used to generate reasoning content |[optional]|
**webSearch** | **Boolean** | indicates if web search was used |[optional]|
**moneySpent** | **Double** | cost of AI tokens, USDthe price charged by the third-party AI model provider for according to its Pricing |[optional]|
**datetime** | **String** | date and time when the result was receivedin the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”example:2019-11-15 12:57:46 +00:00 |[optional]|
**items** | **List<BaseAiOptimizationLlmResponseElementItem>** | array of response itemscontains structured AI response data |[optional]|
**fanOutQueries** | **List<String>** | array of fan-out queriescontains related search queries derived from the main query to provide a more comprehensive response |[optional]|
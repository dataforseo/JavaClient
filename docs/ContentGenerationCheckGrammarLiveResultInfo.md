# ContentGenerationCheckGrammarLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**inputTokens** | **Integer** | number of input tokens in the POST request |[optional]|
**outputTokens** | **Integer** | number of output tokens in the response |[optional]|
**newTokens** | **Integer** | number of new tokens in the response |[optional]|
**initialText** | **String** | initial text in the POST request |[optional]|
**languageCode** | **String** | language code in the POST request |[optional]|
**itemsCount** | **Long** | the number of results returned in the items array |[optional]|
**items** | **List<ContentGenerationCheckGrammarLiveItem>** | contains grammar or spelling errors and related data |[optional]|


# ContentGenerationGenerateLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | initial target text required field text input for content generation; can contain from 1 to 500 tokens learn more about tokens on our help center |  [optional] |
|**maxNewTokens** | **Integer** | generation limit for new tokens required field if max_tokens is not specified the maximum number of new tokens for generated content; maximum value: 300; Note: the number does not include tokens specified in the text field; learn more about this parameter on our help center |  [optional] |
|**maxTokens** | **Integer** | generation limit for all tokens required field if max_new_tokens is not specified the maximum total number of tokens for generated content; maximum value: 1024; Note: the number includes tokens specified in the text field learn more about this parameter on our help center |  [optional] |
|**creativityIndex** | **Float** | creativity of content generation optional field if you use this field, you don’t need to use top_k / top_p / temperature the randomness of the selection of equally probable subsequent tokens; can take values from 0 to 1 default value: 0.8 learn more about this parameter on our help center |  [optional] |
|**tokenRepetitionPenalty** | **Float** | token repetition optional field limits the repetition of the same tokens in the generated content; can take values from 0.5 to 2; default value: 1 |  [optional] |
|**topK** | **Integer** | the number of initial tokens in each iteration for choosing a subsequent word optional field if you use creativity_index, this field will be ignored the higher the number, the more high-probability tokens will be shortlisted for generation; can take values from 1 to 100; default value: 40 learn more about this parameter on our help center |  [optional] |
|**topP** | **Float** | excludes initial tokens with probability lower than one optional field if you use creativity_index, this field will be ignored the higher the value, the less low-probability tokens may be shortlisted for generation; can take values from 0 to 1 default value: 0.9 Note:if both top_k and top_p are used, top_k acts first; learn more about this parameter on our help center |  [optional] |
|**temperature** | **Float** | controls the randomness in the output optional field if you use creativity_index, this field will be ignored the lower the temperature, the more likely the model will choose words with a higher probability of occurrence; can take values from 0 to 1; default value: 0.7 learn more about this parameter on our help center |  [optional] |
|**avoidWords** | **List&lt;String&gt;** | words or phrases to avoid when generating a text optional field you can specify up to 50 terms; example: [\&quot;term\&quot;, \&quot;optimization\&quot;] |  [optional] |
|**avoidStartingWords** | **List&lt;String&gt;** | words or phrases to avoid in the beginning of the generated text optional field you can specify up to 50 terms; example: [\&quot;SEO\&quot;, \&quot;search engine optimization\&quot;] |  [optional] |
|**stopWords** | **List&lt;String&gt;** | words or phrases to end the text optional field you can specify up to 50 terms; example: [\&quot;now\&quot;,\&quot;subscribe\&quot;] |  [optional] |
|**supplementToken** | **String** | token for generating subsequent results optional field provided in the identical filed of the response to each request; you can use this parameter to continue the generation of text from the initial response supplement_token values are unique for each subsequent task |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |




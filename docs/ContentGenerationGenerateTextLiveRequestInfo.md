[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# ContentGenerationGenerateTextLiveRequestInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**topic** | **String** | main topic of the content to generate required field main topic for generating content; can contain from 1 to 50 tokens |  [optional] |
|**wordCount** | **Long** | number of words in content required field the number of tokens in the generated text; can take values from 1 to 1000 |  [optional] |
|**subTopics** | **List&lt;String&gt;** | secondary topics of the content to generate optional field secondary topics for generating content; can contain up to 10 terms; example: \&quot;sub_topics\&quot;: [\&quot;Apple\&quot;,\&quot;Pixar\&quot;,\&quot;Amazing Products\&quot;] |  [optional] |
|**description** | **String** | meta description of the content to generate optional field can contain from 1 to 1000 tokens learn more about this parameter on our help center |  [optional] |
|**metaKeywords** | **List&lt;String&gt;** | keywords for the content to generate optional field can contain up to 10 terms; learn more about this parameter on our help center example: \&quot;meta_keywords\&quot;: [\&quot;iPhone\&quot;,\&quot;sell\&quot;,\&quot;CEO\&quot;] |  [optional] |
|**creativityIndex** | **Float** | creativity of content generation optional field the randomness of the selection of equally probable subsequent tokens; can take values from 0 to 1 default value: 0.8 learn more about this parameter on our help center |  [optional] |
|**includeConclusion** | **Boolean** | include conclusion in generated text optional field if set to true, generated content will include a logical conclusion |  [optional] |
|**supplementToken** | **String** | token for generating subsequent results optional field provided in the identical filed of the response to each request; you can use this parameter to continue the generation of text from the initial response supplement_token values are unique for each subsequent task |  [optional] |
|**tag** | **String** | user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
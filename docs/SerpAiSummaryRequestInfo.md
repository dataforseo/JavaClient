[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# SerpAiSummaryRequestInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taskId** | **String** | task identifier required field unique identifier of the associated task in the UUID format you will be able to use it within 30 days to request the results of the task at any time |  [optional] |
|**prompt** | **String** | AI prompt optional field additional task for AI summarizer, also referred to as any form of text, question or information that communicates to AI what response you’re looking for; note: your prompt has to be relevant to the keyword specified in the POST request to SERP API |  [optional] |
|**supportExtra** | **Boolean** | support extra SERP features optional field if set to true, the AI model will consider the following extra SERP features, in addition to organic results: answer_box, knowledge_graph, featured_snippet; default value: true |  [optional] |
|**fetchContent** | **Boolean** | fetch content from pages in SERPs optional field if set to true, the API will fetch the content from pages featured in SERP results, and the AI model will consider this content when generating the summary in the result; default value: false |  [optional] |
|**includeLinks** | **Boolean** | include source links in the summary optional field if set to true, the summary field in the API response will contain links to sources of the generated summary; default value: false |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
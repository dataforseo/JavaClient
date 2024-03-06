[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# KnowledgeGraphListItemDataforseoLabsSerpElementItem

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rankGroup** | **Integer** | group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group |  [optional] |
|**rankAbsolute** | **Integer** | absolute rank in SERP absolute position among all the elements in SERP |  [optional] |
|**position** | **String** | the alignment of the element in SERP can take the following values: left, right |  [optional] |
|**xpath** | **String** | the XPath of the element |  [optional] |
|**title** | **String** | title of a given link element |  [optional] |
|**dataAttrid** | **String** | google defined data attribute ID example: kc:/common/topic:social media presence |  [optional] |
|**link** | [**LinkElement**](LinkElement.md) |  |  [optional] |
|**items** | [**List&lt;KnowledgeGraphListElement&gt;**](KnowledgeGraphListElement.md) | additional items present in the element if there are none, equals null |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")
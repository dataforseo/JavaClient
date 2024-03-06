[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")

# ContentAnalysisSummaryInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | type of element |  [optional] |
|**totalCount** | **Long** | total amount of results in our database relevant to your request |  [optional] |
|**rank** | **Integer** | rank of all URLs citing the keyword normalized sum of ranks of all URLs citing the target keyword |  [optional] |
|**topDomains** | [**List&lt;TopDomainInfo&gt;**](TopDomainInfo.md) | top domains citing the target keyword contains objects with top domains citing the target keword and citation count per each domain |  [optional] |
|**sentimentConnotations** | **Map&lt;String, Long&gt;** | sentiment connotations contains sentiments (emotional reactions) related to the target keyword citation and the number of citations per each sentiment possible sentiment connotations: anger, happiness, love, sadness, share, fun |  [optional] |
|**connotationTypes** | **Map&lt;String, Long&gt;** | connotation types contains types of sentiments (sentiment polarity) related to the keyword citation and citation count per each sentiment type possible sentiment connotation types: positive, negative, neutral |  [optional] |
|**textCategories** | [**List&lt;ContentAnalysisCategoriesInfo&gt;**](ContentAnalysisCategoriesInfo.md) | text categories contains objects with text categories and citation count in each text category to obtain a full list of available categories, refer to the Categories endpoint |  [optional] |
|**pageCategories** | [**List&lt;ContentAnalysisCategoriesInfo&gt;**](ContentAnalysisCategoriesInfo.md) | page categories contains objects with page categories and citation count in each page category to obtain a full list of available categories, refer to the Categories endpoint |  [optional] |
|**pageTypes** | **Map&lt;String, Long&gt;** | page types contains page types and citation count per each page type |  [optional] |
|**countries** | **Map&lt;String, Long&gt;** | countries contains countries and citation count in each country to obtain a full list of available countries, refer to the Locations endpoint |  [optional] |
|**languages** | **Map&lt;String, Long&gt;** | languages contains languages and citation count in each language to obtain a full list of available languages, refer to the Languages endpoint |  [optional] |

[root](./../ "root") / [docs](./ "docs")

[[Back to README.md]](./../README.md "[Back to README.md]")


# AnalysisContentInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentType** | **String** | type of content example: page_content, comment |  [optional] |
|**title** | **String** | title of the result |  [optional] |
|**mainTitle** | **String** | page title |  [optional] |
|**previousTitle** | **String** | title of the previous content block |  [optional] |
|**level** | **BigDecimal** | title heading level indicates h-tag level from 1 (top) to 6 (bottom) |  [optional] |
|**author** | **String** | author of the content |  [optional] |
|**snippet** | **String** | content snippet |  [optional] |
|**snippetLength** | **BigDecimal** | character length of the snippet |  [optional] |
|**socialMetrics** | [**List&lt;Facebook&gt;**](Facebook.md) | social media engagement metrics data on social media interactions associated with the content based on website embeds developed and supported by social media platforms |  [optional] |
|**highlightedText** | **String** | highlighted text from the snippet |  [optional] |
|**language** | **String** | content language to obtain a full list of available languages, refer to the Languages endpoint |  [optional] |
|**sentimentConnotations** | **Map&lt;String, Long&gt;** | sentiment connotations contains sentiments (emotional reactions) related to the given citation and probability index per each sentiment possible sentiment connotations: anger, happiness, love, sadness, share, fun |  [optional] |
|**connotationTypes** | **Map&lt;String, Long&gt;** | connotation types contains types of sentiments (sentiment polarity) related to the given citation and probability index per each sentiment type possible sentiment connotation types: positive, negative, neutral |  [optional] |
|**textCategory** | **List&lt;BigDecimal&gt;** | text category to obtain a full list of available categories, refer to the Categories endpoint |  [optional] |
|**datePublished** | **String** | date and time when the content was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2017-01-24 13:20:59 +00:00 |  [optional] |
|**contentQualityScore** | **BigDecimal** | content quality score this value is calculated based on the number of words, sentences and characters the content contains |  [optional] |
|**semanticLocation** | **String** | semantic location indicates semantic element in HTML where the target keyword citation is located example: article, header |  [optional] |
|**rating** | [**ContentRatingInfo**](ContentRatingInfo.md) |  |  [optional] |
|**groupDate** | **String** | citation group date and time indicates content publication date or date and time when our crawler visited the page for the first time; this field can be used to group citations by date and display citation trends; date and time are provided in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2017-01-24 13:20:59 +00:00 |  [optional] |




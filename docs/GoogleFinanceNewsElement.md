# GoogleFinanceNewsElement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**type** | **String** | type of element |[optional]|
**title** | **String** | <em>title of the news article</em> |[optional]|
**url** | **String** | <em>URL to the page of the market index on Google Finance</em> |[optional]|
**source** | **String** | <em>name of the news source</em><br>name of the website where the news article is published |[optional]|
**imageUrl** | **String** | <em>featured image URL</em><br>URL of the news article's featured image |[optional]|
**timestamp** | **String** | <em>date and time of the value readout</em><br>in the UTC format: 'yyyy-mm-dd hh-mm-ss +00:00'<br>example:<br><code class='long-string'>2025-02-10 09:40:00 +00:00</code> |[optional]|
**quotes** | **List<BaseSerpApiGoogleFinanceElementItem>** | <em>market indexes quoted in the news article</em><br>information about market indexes quoted in the <code>google_finance_news_element</code> |[optional]|
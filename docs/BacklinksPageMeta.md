# BacklinksPageMeta


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | <em>page title</em> |[optional]|
**canonical** | **String** | <em>canonical page</em> |[optional]|
**internalLinksCount** | **Long** | <em>number of internal links on the page</em> |[optional]|
**externalLinksCount** | **Long** | <em>number of external links on the page</em> |[optional]|
**imagesCount** | **Long** | <em>number of images on the page</em> |[optional]|
**wordsCount** | **Long** | <em>number of words on the page</em> |[optional]|
**pageSpamScore** | **Integer** | <em>spam score of the page</em><br>learn more about how the metric is calculated on <a href='https://dataforseo.com/help-center/what-is-spam-score-and-how-is-it-calculated' rel='noopener noreferrer' target='_blank'>this help center page</a> |[optional]|
**socialMediaTags** | **Map<String, String>** | <em>array of social media tags found on the page</em><br>contains social media tags and their content<br>supported tags include but are not limited to <a href='https://ogp.me/'>Open Graph</a> and <a href='https://developer.twitter.com/en/docs/twitter-for-websites/cards/guides/getting-started'>Twitter card</a> |[optional]|
**h1** | **List<String>** | <em>h1 tag</em><br>content of <code>h1</code> tags |[optional]|
**h2** | **List<String>** | <em>h2 tag</em><br>content of <code>h2</code> tags |[optional]|
**h3** | **List<String>** | <em>h3 tag</em><br>content of <code>h3</code> tags |[optional]|
**imagesAlt** | **List<String>** | <em>content of <code>alt</code> tags</em> |[optional]|
**poweredBy** | **List<String>** | <em>CMS details</em> |[optional]|
**language** | **String** | <em>page content language</em><br>example:<br><code>en</code> |[optional]|
**charset** | **String** | <em>character encoding</em><br>examples:<br><code>utf-8</code> |[optional]|
**platformType** | **List<String>** | <em>type of a platform</em> |[optional]|
**technologies** | **Map<String, String>** | <em>website technologies</em> |[optional]|
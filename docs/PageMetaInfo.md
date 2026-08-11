# PageMetaInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | <em>page title</em> |[optional]|
**charset** | **Integer** | <em><a href='https://en.wikipedia.org/wiki/Code_page' target='_blank' rel='noopener noreferrer'>code page</a></em><br>example: <code>65001</code> |[optional]|
**follow** | **Boolean** | <em>indicates whether a page's 'meta robots' allows crawlers to follow the links on the page</em><br>if <code>false</code>, the page's 'meta robots' tag contains 'nofollow' parameter instructing crawlers not to follow the links on the page |[optional]|
**generator** | **String** | <em>meta tag generator</em> |[optional]|
**htags** | **Map<String, List<String>>** | <em>HTML header tags</em> |[optional]|
**description** | **String** | <em>content of the meta description tag</em> |[optional]|
**favicon** | **String** | <em>favicon of the page</em> |[optional]|
**metaKeywords** | **String** | <em>content of the <code>keywords</code> meta tag</em> |[optional]|
**canonical** | **String** | <em>canonical page</em> |[optional]|
**internalLinksCount** | **Long** | <em>number of internal links on the page</em> |[optional]|
**externalLinksCount** | **Long** | <em>number of external links on the page</em> |[optional]|
**inboundLinksCount** | **Long** | <em>number of internal links pointing at the page</em> |[optional]|
**imagesCount** | **Long** | <em>number of images on the page</em> |[optional]|
**imagesSize** | **Integer** | <em>total size of images on the page measured in bytes</em> |[optional]|
**scriptsCount** | **Long** | <em>number of scripts on the page</em> |[optional]|
**scriptsSize** | **Integer** | <em>total size of scripts on the page measured in bytes</em> |[optional]|
**stylesheetsCount** | **Long** | <em>number of stylesheets on the page</em> |[optional]|
**stylesheetsSize** | **Integer** | <em>total size of stylesheets on the page measured in bytes</em> |[optional]|
**titleLength** | **Integer** | <em>length of the <code>title</code> tag in characters</em> |[optional]|
**descriptionLength** | **Integer** | <em>length of the <code>description</code> tag in characters</em> |[optional]|
**renderBlockingScriptsCount** | **Long** | <em>number of scripts on the page that block page rendering</em> |[optional]|
**renderBlockingStylesheetsCount** | **Long** | <em>number of CSS styles on the page that block page rendering</em> |[optional]|
**cumulativeLayoutShift** | **Double** | <em>Core Web Vitals metric measuring the layout stability of the page</em><br>measures the sum total of all individual layout shift scores for every unexpected layout shift that occurs during the entire lifespan of the page. <a href='https://web.dev/cls/'>Learn more.</a> |[optional]|
**metaTitle** | **String** | <em>meta title of the page</em><br>meta tag in the head section of an HTML document that defines the title of a page |[optional]|
**content** | **HtmlContentInfo** | <em>overall information about content of the page</em> |[optional]|
**deprecatedTags** | **List<String>** | <em>deprecated tags on the page</em> |[optional]|
**duplicateMetaTags** | **List<String>** | <em>duplicate meta tags on the page</em> |[optional]|
**spell** | **HunspellInfo** | <em>spellcheck</em><br><a href='http://hunspell.github.io/' target='_blank' rel='noopener noreferrer'>hunspell</a> spellcheck errors |[optional]|
**socialMediaTags** | **Map<String, String>** | <em>object of social media tags found on the page</em><br>contains social media tags and their content<br>supported tags include but are not limited to <a href='https://ogp.me/'>Open Graph</a> and <a href='https://developer.twitter.com/en/docs/twitter-for-websites/cards/guides/getting-started'>Twitter card</a> |[optional]|
**brokenHtml** | **OnPageResourceIssueInfo** | resource errors and warnings |[optional]|
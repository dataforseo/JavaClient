# PageMetaInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**title** | **String** | page title |[optional]|
**charset** | **Integer** | code page<br>example: 65001 |[optional]|
**follow** | **Boolean** | indicates whether a page’s ‘meta robots’ allows crawlers to follow the links on the page<br>if false, the page’s ‘meta robots’ tag contains “nofollow” parameter instructing crawlers not to follow the links on the page |[optional]|
**generator** | **String** | meta tag generator |[optional]|
**htags** | **Map<String, List<String>>** | HTML header tags |[optional]|
**description** | **String** | content of the meta description tag |[optional]|
**favicon** | **String** | favicon of the page |[optional]|
**metaKeywords** | **String** | content of the keywords meta tag |[optional]|
**canonical** | **String** | canonical page |[optional]|
**internalLinksCount** | **Long** | number of internal links on the page |[optional]|
**externalLinksCount** | **Long** | number of external links on the page |[optional]|
**inboundLinksCount** | **Long** | number of internal links pointing at the page |[optional]|
**imagesCount** | **Long** | number of images on the page |[optional]|
**imagesSize** | **Integer** | total size of images on the page measured in bytes |[optional]|
**scriptsCount** | **Long** | number of scripts on the page |[optional]|
**scriptsSize** | **Integer** | total size of scripts on the page measured in bytes |[optional]|
**stylesheetsCount** | **Long** | number of stylesheets on the page |[optional]|
**stylesheetsSize** | **Integer** | total size of stylesheets on the page measured in bytes |[optional]|
**titleLength** | **Integer** | length of the title tag in characters |[optional]|
**descriptionLength** | **Integer** | length of the description tag in characters |[optional]|
**renderBlockingScriptsCount** | **Long** | number of scripts on the page that block page rendering |[optional]|
**renderBlockingStylesheetsCount** | **Long** | number of CSS styles on the page that block page rendering |[optional]|
**cumulativeLayoutShift** | **Double** | Core Web Vitals metric measuring the layout stability of the page<br>measures the sum total of all individual layout shift scores for every unexpected layout shift that occurs during the entire lifespan of the page. Learn more. |[optional]|
**metaTitle** | **String** | meta title of the page<br>meta tag in the head section of an HTML document that defines the title of a page |[optional]|
**content** | **HtmlContentInfo** | overall information about content of the page |[optional]|
**deprecatedTags** | **List<String>** | deprecated tags on the page |[optional]|
**duplicateMetaTags** | **List<String>** | duplicate meta tags on the page |[optional]|
**spell** | **HunspellInfo** | spellcheck<br>hunspell spellcheck errors |[optional]|
**socialMediaTags** | **Map<String, String>** | object of social media tags found on the page<br>contains social media tags and their content<br>supported tags include but are not limited to Open Graph and Twitter card |[optional]|
**brokenHtml** | **OnPageResourceIssueInfo** | resource errors and warnings |[optional]|
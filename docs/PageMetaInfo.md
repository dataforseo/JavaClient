

# PageMetaInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | page title |  [optional] |
|**charset** | **BigDecimal** | code page example: 65001 |  [optional] |
|**follow** | **Boolean** | indicates whether a page’s ‘meta robots’ allows crawlers to follow the links on the page if false, the page’s ‘meta robots’ tag contains “nofollow” parameter instructing crawlers not to follow the links on the page |  [optional] |
|**generator** | **String** | meta tag generator |  [optional] |
|**htags** | **Map&lt;String, List&lt;String&gt;&gt;** | HTML header tags |  [optional] |
|**description** | **String** | content of the meta description tag |  [optional] |
|**favicon** | **String** | favicon of the page |  [optional] |
|**metaKeywords** | **String** | content of the keywords meta tag |  [optional] |
|**canonical** | **String** | canonical page |  [optional] |
|**internalLinksCount** | **BigDecimal** | number of internal links on the page |  [optional] |
|**externalLinksCount** | **BigDecimal** | number of external links on the page |  [optional] |
|**inboundLinksCount** | **BigDecimal** | number of internal links pointing at the page |  [optional] |
|**imagesCount** | **BigDecimal** | number of images on the page |  [optional] |
|**imagesSize** | **BigDecimal** | total size of images on the page measured in bytes |  [optional] |
|**scriptsCount** | **BigDecimal** | number of scripts on the page |  [optional] |
|**scriptsSize** | **BigDecimal** | total size of scripts on the page measured in bytes |  [optional] |
|**stylesheetsCount** | **BigDecimal** | number of stylesheets on the page |  [optional] |
|**stylesheetsSize** | **BigDecimal** | total size of stylesheets on the page measured in bytes |  [optional] |
|**titleLength** | **BigDecimal** | length of the title tag in characters |  [optional] |
|**descriptionLength** | **BigDecimal** | length of the description tag in characters |  [optional] |
|**renderBlockingScriptsCount** | **BigDecimal** | number of scripts on the page that block page rendering |  [optional] |
|**renderBlockingStylesheetsCount** | **BigDecimal** | number of CSS styles on the page that block page rendering |  [optional] |
|**cumulativeLayoutShift** | **Float** | Core Web Vitals metric measuring the layout stability of the page measures the sum total of all individual layout shift scores for every unexpected layout shift that occurs during the entire lifespan of the page. Learn more. |  [optional] |
|**metaTitle** | **String** | meta title of the page meta tag in the head section of an HTML document that defines the title of a page |  [optional] |
|**content** | [**HtmlContentInfo**](HtmlContentInfo.md) |  |  [optional] |
|**deprecatedTags** | **List&lt;String&gt;** | deprecated tags on the page |  [optional] |
|**duplicateMetaTags** | **List&lt;String&gt;** | duplicate meta tags on the page |  [optional] |
|**spell** | [**HunspellInfo**](HunspellInfo.md) |  |  [optional] |
|**socialMediaTags** | **Map&lt;String, String&gt;** | object of social media tags found on the page contains social media tags and their content supported tags include but are not limited to Open Graph and Twitter card |  [optional] |
|**brokenHtml** | [**OnPageResourceIssueInfo**](OnPageResourceIssueInfo.md) |  |  [optional] |




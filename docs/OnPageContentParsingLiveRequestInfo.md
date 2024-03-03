

# OnPageContentParsingLiveRequestInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | URL of the content to parse required field URL of the page to parse example: https://www.fujielectric.com/ |  [optional] |
|**customUserAgent** | **String** | custom user agent optional field custom user agent for crawling a website example: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36  default value: Mozilla/5.0 (compatible; RSiteAuditor) |  [optional] |
|**browserPreset** | **String** | preset for browser screen parameters optional field if you use this field, you don’t need to indicate browser_screen_width, browser_screen_height, browser_screen_scale_factor possible values: desktop, mobile, tablet desktop preset will apply the following values: browser_screen_width: 1920 browser_screen_height: 1080 browser_screen_scale_factor: 1 mobile preset will apply the following values: browser_screen_width: 390 browser_screen_height: 844 browser_screen_scale_factor: 3 tablet preset will apply the following values: browser_screen_width: 1024 browser_screen_height: 1366 browser_screen_scale_factor: 2 Note: to use this parameter, set enable_javascript or enable_browser_rendering to true |  [optional] |
|**browserScreenWidth** | **Long** | browser screen width optional field you can set a custom browser screen width to perform audit for a particular device; if you use this field, you don’t need to indicate browser_preset as it will be ignored; Note: to use this parameter, set enable_javascript or enable_browser_rendering to true minimum value, in pixels: 240 maximum value, in pixels: 9999 |  [optional] |
|**browserScreenHeight** | **Integer** | browser screen height optional field you can set a custom browser screen height to perform audit for a particular device; if you use this field, you don’t need to indicate browser_preset as it will be ignored; Note: to use this parameter, set enable_javascript or enable_browser_rendering to true minimum value, in pixels: 240 maximum value, in pixels: 9999 |  [optional] |
|**browserScreenScaleFactor** | **Float** | browser screen scale factor optional field you can set a custom browser screen resolution ratio to perform audit for a particular device; if you use this field, you don’t need to indicate browser_preset as it will be ignored; Note: to use this parameter, set enable_javascript or enable_browser_rendering to true minimum value: 0.5 maximum value: 3 |  [optional] |
|**storeRawHtml** | **Boolean** | store HTML of a crawled page optional field set to true if you want to get the HTML of the page using the OnPage Raw HTML endpoint default value: false |  [optional] |
|**disableCookiePopup** | **Boolean** | disable the cookie popup  optional field set to true if you want to disable the popup requesting cookie consent from the user; default value: false |  [optional] |
|**acceptLanguage** | **String** | language header for accessing the website optional field all locale formats are supported (xx, xx-XX, xxx-XX, etc.) Note: if you do not specify this parameter, some websites may deny access; in this case, pages will be returned with the \&quot;type\&quot;:\&quot;broken in the response array |  [optional] |
|**enableJavascript** | **Boolean** | load javascript on a page optional field set to true if you want to load the scripts available on a page default value: false Note: if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter in our help article; the cost can be calculated on the Pricing Page |  [optional] |
|**enableBrowserRendering** | **Boolean** | emulate browser rendering to measure Core Web Vitals optional field by using this parameter you will be able to emulate a browser when loading a web page; enable_browser_rendering loads styles, images, fonts, animations, videos, and other resources on a page; default value: false set to true to obtain Core Web Vitals (FID, CLS, LCP) metrics in the response; if you use this field, enable_javascript, and load_resources parameters must be set to true Note: if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter in our help article; the cost can be calculated on the Pricing Page |  [optional] |
|**enableXhr** | **Boolean** | enable XMLHttpRequest on a page optional field set to true if you want our crawler to request data from a web server using the XMLHttpRequest object default value: false if you use this field, enable_javascript must be set to true; |  [optional] |




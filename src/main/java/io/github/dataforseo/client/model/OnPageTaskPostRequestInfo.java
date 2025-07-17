package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.dataforseo.client.JSON;



public class OnPageTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public OnPageTaskPostRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * target domain
* required field
* domain name should be specified without https:// and www.
* if you specify the page URL, the results will be returned for the domain included in the URL
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_MAX_CRAWL_PAGES = "max_crawl_pages";
  @SerializedName(SERIALIZED_NAME_MAX_CRAWL_PAGES)
  private Integer maxCrawlPages;

  public OnPageTaskPostRequestInfo maxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
    return this;
  }

  /**
   * crawled pages limit
* required field
* the number of pages to crawl on the specified domain
* Note:
* if you set max_crawl_pages to 1 and do not specify start_url or set a homepage in it, the following sitewide checks will be disabled:
* test_canonicalization, enable_www_redirect_check, test_hidden_server_signature, test_page_not_found, test_directory_browsing, test_https_redirect
* to enable them anyway, set force_sitewide_checks to trueif you set max_crawl_pages to 1 and specify start_url other than a homepage, all sitewide checks will be disabled;
* to enable them anyway, set force_sitewide_checks to true
   * @return maxCrawlPages
   */
  @javax.annotation.Nullable
  public Integer getMaxCrawlPages() {
    return maxCrawlPages;
  }

  public void setMaxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
  }


  public static final String SERIALIZED_NAME_START_URL = "start_url";
  @SerializedName(SERIALIZED_NAME_START_URL)
  private String startUrl;

  public OnPageTaskPostRequestInfo startUrl(String startUrl) {
    this.startUrl = startUrl;
    return this;
  }

  /**
   * the first url to crawl 
* optional field
* Note: you should specify an absolute URL
* if you want to crawl a single page, specify its URL in this field and additionally set the max_crawl_pages parameter to 1
* you can also use the live Instant Pages endpoint to get page-specific data
   * @return startUrl
   */
  @javax.annotation.Nullable
  public String getStartUrl() {
    return startUrl;
  }

  public void setStartUrl(String startUrl) {
    this.startUrl = startUrl;
  }


  public static final String SERIALIZED_NAME_FORCE_SITEWIDE_CHECKS = "force_sitewide_checks";
  @SerializedName(SERIALIZED_NAME_FORCE_SITEWIDE_CHECKS)
  private Boolean forceSitewideChecks;

  public OnPageTaskPostRequestInfo forceSitewideChecks(Boolean forceSitewideChecks) {
    this.forceSitewideChecks = forceSitewideChecks;
    return this;
  }

  /**
   * enable sitewide checks when crawling a single page
* optional field
* set to true to get data on sitewide checks when crawling a single page;
* default value: false
   * @return forceSitewideChecks
   */
  @javax.annotation.Nullable
  public Boolean getForceSitewideChecks() {
    return forceSitewideChecks;
  }

  public void setForceSitewideChecks(Boolean forceSitewideChecks) {
    this.forceSitewideChecks = forceSitewideChecks;
  }


  public static final String SERIALIZED_NAME_PRIORITY_URLS = "priority_urls";
  @SerializedName(SERIALIZED_NAME_PRIORITY_URLS)
  private List<String> priorityUrls;

  public OnPageTaskPostRequestInfo priorityUrls(List<String> priorityUrls) {
    this.priorityUrls = priorityUrls;
    return this;
  }

  /**
   * urls to be crawled bypassing the queue
* optional field
* URLs specified in this array will be crawled in the first instance, bypassing the crawling queue;
* Note: you should specify the absolute URL;
* you can specify up to 20 URLs;
* all URLs in the array must belong to the target domain;
* subdomains will be ignored unless the allow_subdomains parameter is set to trueexample:
* 'priority_urls': [
* 'https://dataforseo.com/apis/serp-api',
* 'https://dataforseo.com/contact'
* ]
   * @return priorityUrls
   */
  @javax.annotation.Nullable
  public List<String> getPriorityUrls() {
    return priorityUrls;
  }

  public void setPriorityUrls(List<String> priorityUrls) {
    this.priorityUrls = priorityUrls;
  }


  public static final String SERIALIZED_NAME_MAX_CRAWL_DEPTH = "max_crawl_depth";
  @SerializedName(SERIALIZED_NAME_MAX_CRAWL_DEPTH)
  private Integer maxCrawlDepth;

  public OnPageTaskPostRequestInfo maxCrawlDepth(Integer maxCrawlDepth) {
    this.maxCrawlDepth = maxCrawlDepth;
    return this;
  }

  /**
   * crawl depth
* optional field
* the linking depth of the pages to crawl;
* for example, starting page of the crawl is level 0, pages that have links from that page are level 1, etc.
   * @return maxCrawlDepth
   */
  @javax.annotation.Nullable
  public Integer getMaxCrawlDepth() {
    return maxCrawlDepth;
  }

  public void setMaxCrawlDepth(Integer maxCrawlDepth) {
    this.maxCrawlDepth = maxCrawlDepth;
  }


  public static final String SERIALIZED_NAME_CRAWL_DELAY = "crawl_delay";
  @SerializedName(SERIALIZED_NAME_CRAWL_DELAY)
  private Integer crawlDelay;

  public OnPageTaskPostRequestInfo crawlDelay(Integer crawlDelay) {
    this.crawlDelay = crawlDelay;
    return this;
  }

  /**
   * delay between hits, ms
* optional field
* the custom delay between crawler hits to the server
* default value: 2000
   * @return crawlDelay
   */
  @javax.annotation.Nullable
  public Integer getCrawlDelay() {
    return crawlDelay;
  }

  public void setCrawlDelay(Integer crawlDelay) {
    this.crawlDelay = crawlDelay;
  }


  public static final String SERIALIZED_NAME_STORE_RAW_HTML = "store_raw_html";
  @SerializedName(SERIALIZED_NAME_STORE_RAW_HTML)
  private Boolean storeRawHtml;

  public OnPageTaskPostRequestInfo storeRawHtml(Boolean storeRawHtml) {
    this.storeRawHtml = storeRawHtml;
    return this;
  }

  /**
   * store HTML of crawled pages
* optional field
* set to true if you want to get the HTML of the page using the OnPage Raw HTML endpoint
* default value: false
   * @return storeRawHtml
   */
  @javax.annotation.Nullable
  public Boolean getStoreRawHtml() {
    return storeRawHtml;
  }

  public void setStoreRawHtml(Boolean storeRawHtml) {
    this.storeRawHtml = storeRawHtml;
  }


  public static final String SERIALIZED_NAME_ENABLE_CONTENT_PARSING = "enable_content_parsing";
  @SerializedName(SERIALIZED_NAME_ENABLE_CONTENT_PARSING)
  private Boolean enableContentParsing;

  public OnPageTaskPostRequestInfo enableContentParsing(Boolean enableContentParsing) {
    this.enableContentParsing = enableContentParsing;
    return this;
  }

  /**
   * parse content on crawled pages
* optional field
* set to true to use the OnPage Content Parsing endpoint
* default value: false
   * @return enableContentParsing
   */
  @javax.annotation.Nullable
  public Boolean getEnableContentParsing() {
    return enableContentParsing;
  }

  public void setEnableContentParsing(Boolean enableContentParsing) {
    this.enableContentParsing = enableContentParsing;
  }


  public static final String SERIALIZED_NAME_SUPPORT_COOKIES = "support_cookies";
  @SerializedName(SERIALIZED_NAME_SUPPORT_COOKIES)
  private Boolean supportCookies;

  public OnPageTaskPostRequestInfo supportCookies(Boolean supportCookies) {
    this.supportCookies = supportCookies;
    return this;
  }

  /**
   * support cookies on crawled pages
* optional field
* set to true to support cookies when crawling the pages
* default value: false
   * @return supportCookies
   */
  @javax.annotation.Nullable
  public Boolean getSupportCookies() {
    return supportCookies;
  }

  public void setSupportCookies(Boolean supportCookies) {
    this.supportCookies = supportCookies;
  }


  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "accept_language";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public OnPageTaskPostRequestInfo acceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
    return this;
  }

  /**
   * language header for accessing the website
* optional field
* all locale formats are supported (xx, xx-XX, xxx-XX, etc.)
* Note: if you do not specify this parameter, some websites may deny access; in this case, pages will be returned with the 'type':'broken in the response array
   * @return acceptLanguage
   */
  @javax.annotation.Nullable
  public String getAcceptLanguage() {
    return acceptLanguage;
  }

  public void setAcceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
  }


  public static final String SERIALIZED_NAME_CUSTOM_ROBOTS_TXT = "custom_robots_txt";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ROBOTS_TXT)
  private String customRobotsTxt;

  public OnPageTaskPostRequestInfo customRobotsTxt(String customRobotsTxt) {
    this.customRobotsTxt = customRobotsTxt;
    return this;
  }

  /**
   * custom robots.txt settings
* optional field
* example: Disallow: /directory1/
   * @return customRobotsTxt
   */
  @javax.annotation.Nullable
  public String getCustomRobotsTxt() {
    return customRobotsTxt;
  }

  public void setCustomRobotsTxt(String customRobotsTxt) {
    this.customRobotsTxt = customRobotsTxt;
  }


  public static final String SERIALIZED_NAME_ROBOTS_TXT_MERGE_MODE = "robots_txt_merge_mode";
  @SerializedName(SERIALIZED_NAME_ROBOTS_TXT_MERGE_MODE)
  private String robotsTxtMergeMode;

  public OnPageTaskPostRequestInfo robotsTxtMergeMode(String robotsTxtMergeMode) {
    this.robotsTxtMergeMode = robotsTxtMergeMode;
    return this;
  }

  /**
   * merge with or override robots.txt settings
* optional field
* possible values: merge, override;
* set to override if you want to ignore website crawling restrictions and other robots.txt settings
* default value: merge;
* Note: if set to override, specify the custom_robots_txt parameter
   * @return robotsTxtMergeMode
   */
  @javax.annotation.Nullable
  public String getRobotsTxtMergeMode() {
    return robotsTxtMergeMode;
  }

  public void setRobotsTxtMergeMode(String robotsTxtMergeMode) {
    this.robotsTxtMergeMode = robotsTxtMergeMode;
  }


  public static final String SERIALIZED_NAME_CUSTOM_USER_AGENT = "custom_user_agent";
  @SerializedName(SERIALIZED_NAME_CUSTOM_USER_AGENT)
  private String customUserAgent;

  public OnPageTaskPostRequestInfo customUserAgent(String customUserAgent) {
    this.customUserAgent = customUserAgent;
    return this;
  }

  /**
   * custom user agent
* optional field
* custom user agent for crawling a website
* example: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36
* 
* default value: Mozilla/5.0 (compatible; RSiteAuditor)
   * @return customUserAgent
   */
  @javax.annotation.Nullable
  public String getCustomUserAgent() {
    return customUserAgent;
  }

  public void setCustomUserAgent(String customUserAgent) {
    this.customUserAgent = customUserAgent;
  }


  public static final String SERIALIZED_NAME_BROWSER_PRESET = "browser_preset";
  @SerializedName(SERIALIZED_NAME_BROWSER_PRESET)
  private String browserPreset;

  public OnPageTaskPostRequestInfo browserPreset(String browserPreset) {
    this.browserPreset = browserPreset;
    return this;
  }

  /**
   * preset for browser screen parameters
* optional field
* if you use this field, you don’t need to indicate browser_screen_width, browser_screen_height, browser_screen_scale_factorpossible values:
* desktop, mobile, tabletdesktop preset will apply the following values:browser_screen_width: 1920
* browser_screen_height: 1080
* browser_screen_scale_factor: 1mobile preset will apply the following values:browser_screen_width: 390
* browser_screen_height: 844
* browser_screen_scale_factor: 3tablet preset will apply the following values:browser_screen_width: 1024
* browser_screen_height: 1366
* browser_screen_scale_factor: 2
* Note: to use this parameter, set enable_javascript or enable_browser_rendering to true
   * @return browserPreset
   */
  @javax.annotation.Nullable
  public String getBrowserPreset() {
    return browserPreset;
  }

  public void setBrowserPreset(String browserPreset) {
    this.browserPreset = browserPreset;
  }


  public static final String SERIALIZED_NAME_BROWSER_SCREEN_WIDTH = "browser_screen_width";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_WIDTH)
  private Long browserScreenWidth;

  public OnPageTaskPostRequestInfo browserScreenWidth(Long browserScreenWidth) {
    this.browserScreenWidth = browserScreenWidth;
    return this;
  }

  /**
   * browser screen width
* optional field
* you can set a custom browser screen width to perform audit for a particular device;
* if you use this field, you don’t need to indicate browser_preset as it will be ignored;
* Note: to use this parameter, set enable_javascript or enable_browser_rendering to trueminimum value, in pixels: 240
* maximum value, in pixels: 9999
   * @return browserScreenWidth
   */
  @javax.annotation.Nullable
  public Long getBrowserScreenWidth() {
    return browserScreenWidth;
  }

  public void setBrowserScreenWidth(Long browserScreenWidth) {
    this.browserScreenWidth = browserScreenWidth;
  }


  public static final String SERIALIZED_NAME_BROWSER_SCREEN_HEIGHT = "browser_screen_height";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_HEIGHT)
  private Integer browserScreenHeight;

  public OnPageTaskPostRequestInfo browserScreenHeight(Integer browserScreenHeight) {
    this.browserScreenHeight = browserScreenHeight;
    return this;
  }

  /**
   * browser screen height
* optional field
* you can set a custom browser screen height to perform an audit for a particular device;
* if you use this field, you don’t need to indicate browser_preset as it will be ignored;
* Note: to use this parameter, set enable_javascript or enable_browser_rendering to trueminimum value, in pixels: 240
* maximum value, in pixels: 9999
   * @return browserScreenHeight
   */
  @javax.annotation.Nullable
  public Integer getBrowserScreenHeight() {
    return browserScreenHeight;
  }

  public void setBrowserScreenHeight(Integer browserScreenHeight) {
    this.browserScreenHeight = browserScreenHeight;
  }


  public static final String SERIALIZED_NAME_BROWSER_SCREEN_SCALE_FACTOR = "browser_screen_scale_factor";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_SCALE_FACTOR)
  private Double browserScreenScaleFactor;

  public OnPageTaskPostRequestInfo browserScreenScaleFactor(Double browserScreenScaleFactor) {
    this.browserScreenScaleFactor = browserScreenScaleFactor;
    return this;
  }

  /**
   * browser screen scale factor
* optional field
* you can set a custom browser screen resolution ratio to perform audit for a particular device;
* if you use this field, you don’t need to indicate browser_preset as it will be ignored;
* Note: to use this parameter, set enable_javascript or enable_browser_rendering to trueminimum value: 0.5
* maximum value: 3
   * @return browserScreenScaleFactor
   */
  @javax.annotation.Nullable
  public Double getBrowserScreenScaleFactor() {
    return browserScreenScaleFactor;
  }

  public void setBrowserScreenScaleFactor(Double browserScreenScaleFactor) {
    this.browserScreenScaleFactor = browserScreenScaleFactor;
  }


  public static final String SERIALIZED_NAME_RESPECT_SITEMAP = "respect_sitemap";
  @SerializedName(SERIALIZED_NAME_RESPECT_SITEMAP)
  private Boolean respectSitemap;

  public OnPageTaskPostRequestInfo respectSitemap(Boolean respectSitemap) {
    this.respectSitemap = respectSitemap;
    return this;
  }

  /**
   * respect sitemap when crawling
* optional field
* set to true if you want to follow the order of pages indicated in the primary sitemap when crawling;
* default value: false
* Note: if set to true, the click_depth value in the API response will equal 0;
* the max_crawl_depth field of the request will be ignored, you can specify the number of pages to crawl using the max_crawl_pages parameter
   * @return respectSitemap
   */
  @javax.annotation.Nullable
  public Boolean getRespectSitemap() {
    return respectSitemap;
  }

  public void setRespectSitemap(Boolean respectSitemap) {
    this.respectSitemap = respectSitemap;
  }


  public static final String SERIALIZED_NAME_CUSTOM_SITEMAP = "custom_sitemap";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SITEMAP)
  private String customSitemap;

  public OnPageTaskPostRequestInfo customSitemap(String customSitemap) {
    this.customSitemap = customSitemap;
    return this;
  }

  /**
   * custom sitemap url
* optional field
* the URL of the page where the alternative sitemap is located
* Note: if you want to use this parameter, respect_sitemap should be true
   * @return customSitemap
   */
  @javax.annotation.Nullable
  public String getCustomSitemap() {
    return customSitemap;
  }

  public void setCustomSitemap(String customSitemap) {
    this.customSitemap = customSitemap;
  }


  public static final String SERIALIZED_NAME_CRAWL_SITEMAP_ONLY = "crawl_sitemap_only";
  @SerializedName(SERIALIZED_NAME_CRAWL_SITEMAP_ONLY)
  private Boolean crawlSitemapOnly;

  public OnPageTaskPostRequestInfo crawlSitemapOnly(Boolean crawlSitemapOnly) {
    this.crawlSitemapOnly = crawlSitemapOnly;
    return this;
  }

  /**
   * crawl only pages indicated in the sitemap
* optional field
* set to true if you want to crawl only the pages indicated in the sitemap
* if you set this parameter to true and do not specify custom_sitemap, we will crawl the default sitemap
* default value: false
* Note: if you want to use this parameter, respect_sitemap should be true
   * @return crawlSitemapOnly
   */
  @javax.annotation.Nullable
  public Boolean getCrawlSitemapOnly() {
    return crawlSitemapOnly;
  }

  public void setCrawlSitemapOnly(Boolean crawlSitemapOnly) {
    this.crawlSitemapOnly = crawlSitemapOnly;
  }


  public static final String SERIALIZED_NAME_LOAD_RESOURCES = "load_resources";
  @SerializedName(SERIALIZED_NAME_LOAD_RESOURCES)
  private Boolean loadResources;

  public OnPageTaskPostRequestInfo loadResources(Boolean loadResources) {
    this.loadResources = loadResources;
    return this;
  }

  /**
   * load resources
* optional field
* set to true if you want to load image, stylesheets, scripts, and broken resources
* default value: false
* Note: if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter in our help article; the cost can be calculated on the Pricing Page
   * @return loadResources
   */
  @javax.annotation.Nullable
  public Boolean getLoadResources() {
    return loadResources;
  }

  public void setLoadResources(Boolean loadResources) {
    this.loadResources = loadResources;
  }


  public static final String SERIALIZED_NAME_ENABLE_WWW_REDIRECT_CHECK = "enable_www_redirect_check";
  @SerializedName(SERIALIZED_NAME_ENABLE_WWW_REDIRECT_CHECK)
  private Boolean enableWwwRedirectCheck;

  public OnPageTaskPostRequestInfo enableWwwRedirectCheck(Boolean enableWwwRedirectCheck) {
    this.enableWwwRedirectCheck = enableWwwRedirectCheck;
    return this;
  }

  /**
   * check if the domain implemented the www redirection
* optional field
* set to true if you want to check if the requested domain implemented the www to non-www or non-www to www redirect;
* default value: false
   * @return enableWwwRedirectCheck
   */
  @javax.annotation.Nullable
  public Boolean getEnableWwwRedirectCheck() {
    return enableWwwRedirectCheck;
  }

  public void setEnableWwwRedirectCheck(Boolean enableWwwRedirectCheck) {
    this.enableWwwRedirectCheck = enableWwwRedirectCheck;
  }


  public static final String SERIALIZED_NAME_ENABLE_JAVASCRIPT = "enable_javascript";
  @SerializedName(SERIALIZED_NAME_ENABLE_JAVASCRIPT)
  private Boolean enableJavascript;

  public OnPageTaskPostRequestInfo enableJavascript(Boolean enableJavascript) {
    this.enableJavascript = enableJavascript;
    return this;
  }

  /**
   * load javascript on a page
* optional field
* set to true if you want to load the scripts available on a page
* default value: false
* Note: if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter in our help article; the cost can be calculated on the Pricing Page
   * @return enableJavascript
   */
  @javax.annotation.Nullable
  public Boolean getEnableJavascript() {
    return enableJavascript;
  }

  public void setEnableJavascript(Boolean enableJavascript) {
    this.enableJavascript = enableJavascript;
  }


  public static final String SERIALIZED_NAME_ENABLE_XHR = "enable_xhr";
  @SerializedName(SERIALIZED_NAME_ENABLE_XHR)
  private Boolean enableXhr;

  public OnPageTaskPostRequestInfo enableXhr(Boolean enableXhr) {
    this.enableXhr = enableXhr;
    return this;
  }

  /**
   * enable XMLHttpRequest on a page
* optional field
* set to true if you want our crawler to request data from a web server using the XMLHttpRequest object
* default value: false;if you use this field, enable_javascript must be set to true;
   * @return enableXhr
   */
  @javax.annotation.Nullable
  public Boolean getEnableXhr() {
    return enableXhr;
  }

  public void setEnableXhr(Boolean enableXhr) {
    this.enableXhr = enableXhr;
  }


  public static final String SERIALIZED_NAME_ENABLE_BROWSER_RENDERING = "enable_browser_rendering";
  @SerializedName(SERIALIZED_NAME_ENABLE_BROWSER_RENDERING)
  private Boolean enableBrowserRendering;

  public OnPageTaskPostRequestInfo enableBrowserRendering(Boolean enableBrowserRendering) {
    this.enableBrowserRendering = enableBrowserRendering;
    return this;
  }

  /**
   * emulate browser rendering to measure Core Web Vitals
* optional field
* by using this parameter you will be able to emulate a browser when loading a web page;
* enable_browser_rendering loads styles, images, fonts, animations, videos, and other resources on a page;
* default value: false
* set to true to obtain Core Web Vitals (FID, CLS, LCP) metrics in the response;
* if you use this field, enable_javascript, and load_resources parameters must be set to true
* Note: if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter in our help article; the cost can be calculated on the Pricing Page
   * @return enableBrowserRendering
   */
  @javax.annotation.Nullable
  public Boolean getEnableBrowserRendering() {
    return enableBrowserRendering;
  }

  public void setEnableBrowserRendering(Boolean enableBrowserRendering) {
    this.enableBrowserRendering = enableBrowserRendering;
  }


  public static final String SERIALIZED_NAME_DISABLE_COOKIE_POPUP = "disable_cookie_popup";
  @SerializedName(SERIALIZED_NAME_DISABLE_COOKIE_POPUP)
  private Boolean disableCookiePopup;

  public OnPageTaskPostRequestInfo disableCookiePopup(Boolean disableCookiePopup) {
    this.disableCookiePopup = disableCookiePopup;
    return this;
  }

  /**
   * disable the cookie popup
* optional field
* set to true if you want to disable the popup requesting cookie consent from the user;
* default value:
* false
   * @return disableCookiePopup
   */
  @javax.annotation.Nullable
  public Boolean getDisableCookiePopup() {
    return disableCookiePopup;
  }

  public void setDisableCookiePopup(Boolean disableCookiePopup) {
    this.disableCookiePopup = disableCookiePopup;
  }


  public static final String SERIALIZED_NAME_CUSTOM_JS = "custom_js";
  @SerializedName(SERIALIZED_NAME_CUSTOM_JS)
  private String customJs;

  public OnPageTaskPostRequestInfo customJs(String customJs) {
    this.customJs = customJs;
    return this;
  }

  /**
   * custom javascript
* optional field
* Note that the execution time for the script you enter here should be 700 ms maximum, for example, you can use the following JS snippet to check if the website contains Google Tag Manager as a scr attribute:
* let meta = { haveGoogleAnalytics: false, haveTagManager: false };\r\nfor (var i = 0; i < document.scripts.length; i++) {\r\n let src = document.scripts[i].getAttribute(\'src\');\r\n if (src != undefined) {\r\n if (src.indexOf(\'analytics.js\') >= 0)\r\n      meta.haveGoogleAnalytics = true;\r\n\tif (src.indexOf(\'gtm.js\') >= 0)\r\n      meta.haveTagManager = true;\r\n  }\r\n}\r\nmeta;the returned value depends on what you specified in this field. For instance, if you specify the following script:
* meta = {}; meta.url = document.URL; meta.test = 'test'; meta;
* as a response you will receive the following data:
* 'custom_js_response': {
* 'url': 'https://dataforseo.com/',
* 'test': 'test'
* }
* Note: the length of the script you enter must be no more than 2000 characters
* Note: if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter in our help article; the cost can be calculated on the Pricing Page
   * @return customJs
   */
  @javax.annotation.Nullable
  public String getCustomJs() {
    return customJs;
  }

  public void setCustomJs(String customJs) {
    this.customJs = customJs;
  }


  public static final String SERIALIZED_NAME_VALIDATE_MICROMARKUP = "validate_micromarkup";
  @SerializedName(SERIALIZED_NAME_VALIDATE_MICROMARKUP)
  private Boolean validateMicromarkup;

  public OnPageTaskPostRequestInfo validateMicromarkup(Boolean validateMicromarkup) {
    this.validateMicromarkup = validateMicromarkup;
    return this;
  }

  /**
   * enable microdata validation
* optional field
* set to true if you want to use the OnPage API Microdata endpoint
* default value: false
   * @return validateMicromarkup
   */
  @javax.annotation.Nullable
  public Boolean getValidateMicromarkup() {
    return validateMicromarkup;
  }

  public void setValidateMicromarkup(Boolean validateMicromarkup) {
    this.validateMicromarkup = validateMicromarkup;
  }


  public static final String SERIALIZED_NAME_ALLOW_SUBDOMAINS = "allow_subdomains";
  @SerializedName(SERIALIZED_NAME_ALLOW_SUBDOMAINS)
  private Boolean allowSubdomains;

  public OnPageTaskPostRequestInfo allowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
    return this;
  }

  /**
   * include pages on subdomains
* optional field
* set to true if you want to crawl all subdomains of a target website
* default value: false
   * @return allowSubdomains
   */
  @javax.annotation.Nullable
  public Boolean getAllowSubdomains() {
    return allowSubdomains;
  }

  public void setAllowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
  }


  public static final String SERIALIZED_NAME_ALLOWED_SUBDOMAINS = "allowed_subdomains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_SUBDOMAINS)
  private List<String> allowedSubdomains;

  public OnPageTaskPostRequestInfo allowedSubdomains(List<String> allowedSubdomains) {
    this.allowedSubdomains = allowedSubdomains;
    return this;
  }

  /**
   * subdomains to crawl
* optional field
* specify subdomains that you want to crawl
* example: ['blog.site.com', 'my.site.com', 'shop.site.com']
* Note: to use this parameter, the allow_subdomains parameter should be set to false;
* otherwise, the content of allowed_subdomains field will be ignored and the results will be returned for all subdomains
   * @return allowedSubdomains
   */
  @javax.annotation.Nullable
  public List<String> getAllowedSubdomains() {
    return allowedSubdomains;
  }

  public void setAllowedSubdomains(List<String> allowedSubdomains) {
    this.allowedSubdomains = allowedSubdomains;
  }


  public static final String SERIALIZED_NAME_DISALLOWED_SUBDOMAINS = "disallowed_subdomains";
  @SerializedName(SERIALIZED_NAME_DISALLOWED_SUBDOMAINS)
  private List<String> disallowedSubdomains;

  public OnPageTaskPostRequestInfo disallowedSubdomains(List<String> disallowedSubdomains) {
    this.disallowedSubdomains = disallowedSubdomains;
    return this;
  }

  /**
   * subdomains not to crawl
* optional field
* specify subdomains that you don’t want to crawl
* example: ['status.site.com', 'docs.site.com']
* Note: to use this parameter, the allow_subdomains parameter should be set to true
   * @return disallowedSubdomains
   */
  @javax.annotation.Nullable
  public List<String> getDisallowedSubdomains() {
    return disallowedSubdomains;
  }

  public void setDisallowedSubdomains(List<String> disallowedSubdomains) {
    this.disallowedSubdomains = disallowedSubdomains;
  }


  public static final String SERIALIZED_NAME_CHECK_SPELL = "check_spell";
  @SerializedName(SERIALIZED_NAME_CHECK_SPELL)
  private Boolean checkSpell;

  public OnPageTaskPostRequestInfo checkSpell(Boolean checkSpell) {
    this.checkSpell = checkSpell;
    return this;
  }

  /**
   * check spelling
* optional field
* set to true to check spelling on a website using Hunspell library
* default value: false
   * @return checkSpell
   */
  @javax.annotation.Nullable
  public Boolean getCheckSpell() {
    return checkSpell;
  }

  public void setCheckSpell(Boolean checkSpell) {
    this.checkSpell = checkSpell;
  }


  public static final String SERIALIZED_NAME_CHECK_SPELL_LANGUAGE = "check_spell_language";
  @SerializedName(SERIALIZED_NAME_CHECK_SPELL_LANGUAGE)
  private String checkSpellLanguage;

  public OnPageTaskPostRequestInfo checkSpellLanguage(String checkSpellLanguage) {
    this.checkSpellLanguage = checkSpellLanguage;
    return this;
  }

  /**
   * language of the spell check
* optional field
* supported languages: ‘hy’, ‘eu’, ‘bg’, ‘ca’, ‘hr’, ‘cs’, ‘da’, ‘nl’, ‘en’, ‘eo’, ‘et’, ‘fo’, ‘fa’, ‘fr’, ‘fy’, ‘gl’, ‘ka’, ‘de’, ‘el’, ‘he’, ‘hu’, ‘is’, ‘ia’, ‘ga’, ‘it’, ‘rw’, ‘la’, ‘lv’, ‘lt’, ‘mk’, ‘mn’, ‘ne’, ‘nb’, ‘nn’, ‘pl’, ‘pt’, ‘ro’, ‘gd’, ‘sr’, ‘sk’, ‘sl’, ‘es’, ‘sv’, ‘tr’, ‘tk’, ‘uk’, ‘vi’
* Note: if no language is specified, it will be set automatically based on page content
   * @return checkSpellLanguage
   */
  @javax.annotation.Nullable
  public String getCheckSpellLanguage() {
    return checkSpellLanguage;
  }

  public void setCheckSpellLanguage(String checkSpellLanguage) {
    this.checkSpellLanguage = checkSpellLanguage;
  }


  public static final String SERIALIZED_NAME_CHECK_SPELL_EXCEPTIONS = "check_spell_exceptions";
  @SerializedName(SERIALIZED_NAME_CHECK_SPELL_EXCEPTIONS)
  private List<String> checkSpellExceptions;

  public OnPageTaskPostRequestInfo checkSpellExceptions(List<String> checkSpellExceptions) {
    this.checkSpellExceptions = checkSpellExceptions;
    return this;
  }

  /**
   * words excluded from spell check
* optional field
* specify the words that you want to exclude from spell check
* maximum word length: 100 characters
* maximum amount of words: 1000
* example: 'SERP', 'minifiers', 'JavaScript'
   * @return checkSpellExceptions
   */
  @javax.annotation.Nullable
  public List<String> getCheckSpellExceptions() {
    return checkSpellExceptions;
  }

  public void setCheckSpellExceptions(List<String> checkSpellExceptions) {
    this.checkSpellExceptions = checkSpellExceptions;
  }


  public static final String SERIALIZED_NAME_CALCULATE_KEYWORD_DENSITY = "calculate_keyword_density";
  @SerializedName(SERIALIZED_NAME_CALCULATE_KEYWORD_DENSITY)
  private Boolean calculateKeywordDensity;

  public OnPageTaskPostRequestInfo calculateKeywordDensity(Boolean calculateKeywordDensity) {
    this.calculateKeywordDensity = calculateKeywordDensity;
    return this;
  }

  /**
   * calculate keyword density for the target domain
* optional field
* set to true if you want to calculate keyword density for website pages
* default value: false
* Note: if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter in our help article
* once the crawl is completed, you can obtain keyword density values with the Keyword Density endpoint
   * @return calculateKeywordDensity
   */
  @javax.annotation.Nullable
  public Boolean getCalculateKeywordDensity() {
    return calculateKeywordDensity;
  }

  public void setCalculateKeywordDensity(Boolean calculateKeywordDensity) {
    this.calculateKeywordDensity = calculateKeywordDensity;
  }


  public static final String SERIALIZED_NAME_CHECKS_THRESHOLD = "checks_threshold";
  @SerializedName(SERIALIZED_NAME_CHECKS_THRESHOLD)
  private Map<String, Long> checksThreshold;

  public OnPageTaskPostRequestInfo checksThreshold(Map<String, Long> checksThreshold) {
    this.checksThreshold = checksThreshold;
    return this;
  }

  /**
   * custom threshold values for checks
* optional field
* you can specify custom threshold values for the parameters included in the checks object of OnPage API responses;
* Note: only integer threshold values can be modified;
* for example, the high_loading_time and large_page_size parameters are set to 3 seconds and 1 megabyte respectively by default;
* if you want to change these thresholds to 1 second and 1000 kbytes, use the following snippet:
* 'checks_threshold': {
* 'high_loading_time': 1,
* 'large_page_size': 1000
* }available customizable parameters with default values:
* 'title_too_short', default value: 30, type: 'int'
* 'title_too_long', default value: 65, type: 'int'
* 'small_page_size', default value: 1024, type: 'int'
* 'large_page_size', default value: 1048576 (1024 * 1024), type: 'int'
* 'low_character_count', default value: 1024, type: 'int'
* 'high_character_count', default value: 256000 (250 * 1024), type: 'int'
* 'low_content_rate', default value: 0.1, type: 'float'
* 'high_content_rate', default value: 0.9, type: 'float'
* 'high_loading_time', default value: 3000, type: 'int'
* 'high_waiting_time', default value: 1500, type: 'int'
* 'low_readability_rate', default value: 15.0, type: 'float'
* 'irrelevant_description', default value: 0.2, type: 'float'
* 'irrelevant_title', default value: 0.3, type: 'float'
* 'irrelevant_meta_keywords', default value: 0.6, type: 'float'
   * @return checksThreshold
   */
  @javax.annotation.Nullable
  public Map<String, Long> getChecksThreshold() {
    return checksThreshold;
  }

  public void setChecksThreshold(Map<String, Long> checksThreshold) {
    this.checksThreshold = checksThreshold;
  }


  public static final String SERIALIZED_NAME_DISABLE_SITEWIDE_CHECKS = "disable_sitewide_checks";
  @SerializedName(SERIALIZED_NAME_DISABLE_SITEWIDE_CHECKS)
  private List<String> disableSitewideChecks;

  public OnPageTaskPostRequestInfo disableSitewideChecks(List<String> disableSitewideChecks) {
    this.disableSitewideChecks = disableSitewideChecks;
    return this;
  }

  /**
   * prevent certain sitewide checks from running
* optional field
* specify the following checks to prevent them from running on the target website:
* 'test_page_not_found'
* 'test_canonicalization'
* 'test_https_redirect'
* 'test_directory_browsing'example:
* 'disable_sitewide_checks': ['test_directory_browsing', 'test_page_not_found']learn more on our help center
   * @return disableSitewideChecks
   */
  @javax.annotation.Nullable
  public List<String> getDisableSitewideChecks() {
    return disableSitewideChecks;
  }

  public void setDisableSitewideChecks(List<String> disableSitewideChecks) {
    this.disableSitewideChecks = disableSitewideChecks;
  }


  public static final String SERIALIZED_NAME_DISABLE_PAGE_CHECKS = "disable_page_checks";
  @SerializedName(SERIALIZED_NAME_DISABLE_PAGE_CHECKS)
  private List<String> disablePageChecks;

  public OnPageTaskPostRequestInfo disablePageChecks(List<String> disablePageChecks) {
    this.disablePageChecks = disablePageChecks;
    return this;
  }

  /**
   * prevent certain page checks from running
* optional field
* specify certain checks to prevent them from running and impacting the onpage_scoreexample:
* 'disable_page_checks': ['is_5xx_code', 'is_4xx_code']
   * @return disablePageChecks
   */
  @javax.annotation.Nullable
  public List<String> getDisablePageChecks() {
    return disablePageChecks;
  }

  public void setDisablePageChecks(List<String> disablePageChecks) {
    this.disablePageChecks = disablePageChecks;
  }


  public static final String SERIALIZED_NAME_SWITCH_POOL = "switch_pool";
  @SerializedName(SERIALIZED_NAME_SWITCH_POOL)
  private Boolean switchPool;

  public OnPageTaskPostRequestInfo switchPool(Boolean switchPool) {
    this.switchPool = switchPool;
    return this;
  }

  /**
   * switch proxy pool
* optional field
* if true, additional proxy pools will be used to obtain the requested data;
* the parameter can be used if a multitude of tasks is set simultaneously, resulting in occasional rate-limit and/or site_unreachable errors
   * @return switchPool
   */
  @javax.annotation.Nullable
  public Boolean getSwitchPool() {
    return switchPool;
  }

  public void setSwitchPool(Boolean switchPool) {
    this.switchPool = switchPool;
  }


  public static final String SERIALIZED_NAME_RETURN_DESPITE_TIMEOUT = "return_despite_timeout";
  @SerializedName(SERIALIZED_NAME_RETURN_DESPITE_TIMEOUT)
  private Boolean returnDespiteTimeout;

  public OnPageTaskPostRequestInfo returnDespiteTimeout(Boolean returnDespiteTimeout) {
    this.returnDespiteTimeout = returnDespiteTimeout;
    return this;
  }

  /**
   * return data on pages despite the timeout error
* optional field
* if true, the data will be provided on pages that failed to load within 120 seconds and responded with a timeout error;
* default value: false
   * @return returnDespiteTimeout
   */
  @javax.annotation.Nullable
  public Boolean getReturnDespiteTimeout() {
    return returnDespiteTimeout;
  }

  public void setReturnDespiteTimeout(Boolean returnDespiteTimeout) {
    this.returnDespiteTimeout = returnDespiteTimeout;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public OnPageTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier
* optional field
* the character limit is 255
* you can use this parameter to identify the task and match it with the result
* you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public OnPageTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * notification URL of a completed task
* optional field
* when a task is completed we will notify you by GET request sent to the URL you have specified
* you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request.
* example:
* http://your-server.com/pingscript?id=$id
* http://your-server.com/pingscript?id=$id&tag=$tag
* Note: special characters in pingback_url will be urlencoded;
* i.a., the # character will be encoded into %23
* learn more on our Help Center
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }



  public OnPageTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }


    
    OnPageTaskPostRequestInfo onPageTaskPostRequestInfo = (OnPageTaskPostRequestInfo) o;
    return

        Objects.equals(this.target, onPageTaskPostRequestInfo.target) &&
        Objects.equals(this.maxCrawlPages, onPageTaskPostRequestInfo.maxCrawlPages) &&
        Objects.equals(this.startUrl, onPageTaskPostRequestInfo.startUrl) &&
        Objects.equals(this.forceSitewideChecks, onPageTaskPostRequestInfo.forceSitewideChecks) &&
        Objects.equals(this.priorityUrls, onPageTaskPostRequestInfo.priorityUrls) &&
        Objects.equals(this.maxCrawlDepth, onPageTaskPostRequestInfo.maxCrawlDepth) &&
        Objects.equals(this.crawlDelay, onPageTaskPostRequestInfo.crawlDelay) &&
        Objects.equals(this.storeRawHtml, onPageTaskPostRequestInfo.storeRawHtml) &&
        Objects.equals(this.enableContentParsing, onPageTaskPostRequestInfo.enableContentParsing) &&
        Objects.equals(this.supportCookies, onPageTaskPostRequestInfo.supportCookies) &&
        Objects.equals(this.acceptLanguage, onPageTaskPostRequestInfo.acceptLanguage) &&
        Objects.equals(this.customRobotsTxt, onPageTaskPostRequestInfo.customRobotsTxt) &&
        Objects.equals(this.robotsTxtMergeMode, onPageTaskPostRequestInfo.robotsTxtMergeMode) &&
        Objects.equals(this.customUserAgent, onPageTaskPostRequestInfo.customUserAgent) &&
        Objects.equals(this.browserPreset, onPageTaskPostRequestInfo.browserPreset) &&
        Objects.equals(this.browserScreenWidth, onPageTaskPostRequestInfo.browserScreenWidth) &&
        Objects.equals(this.browserScreenHeight, onPageTaskPostRequestInfo.browserScreenHeight) &&
        Objects.equals(this.browserScreenScaleFactor, onPageTaskPostRequestInfo.browserScreenScaleFactor) &&
        Objects.equals(this.respectSitemap, onPageTaskPostRequestInfo.respectSitemap) &&
        Objects.equals(this.customSitemap, onPageTaskPostRequestInfo.customSitemap) &&
        Objects.equals(this.crawlSitemapOnly, onPageTaskPostRequestInfo.crawlSitemapOnly) &&
        Objects.equals(this.loadResources, onPageTaskPostRequestInfo.loadResources) &&
        Objects.equals(this.enableWwwRedirectCheck, onPageTaskPostRequestInfo.enableWwwRedirectCheck) &&
        Objects.equals(this.enableJavascript, onPageTaskPostRequestInfo.enableJavascript) &&
        Objects.equals(this.enableXhr, onPageTaskPostRequestInfo.enableXhr) &&
        Objects.equals(this.enableBrowserRendering, onPageTaskPostRequestInfo.enableBrowserRendering) &&
        Objects.equals(this.disableCookiePopup, onPageTaskPostRequestInfo.disableCookiePopup) &&
        Objects.equals(this.customJs, onPageTaskPostRequestInfo.customJs) &&
        Objects.equals(this.validateMicromarkup, onPageTaskPostRequestInfo.validateMicromarkup) &&
        Objects.equals(this.allowSubdomains, onPageTaskPostRequestInfo.allowSubdomains) &&
        Objects.equals(this.allowedSubdomains, onPageTaskPostRequestInfo.allowedSubdomains) &&
        Objects.equals(this.disallowedSubdomains, onPageTaskPostRequestInfo.disallowedSubdomains) &&
        Objects.equals(this.checkSpell, onPageTaskPostRequestInfo.checkSpell) &&
        Objects.equals(this.checkSpellLanguage, onPageTaskPostRequestInfo.checkSpellLanguage) &&
        Objects.equals(this.checkSpellExceptions, onPageTaskPostRequestInfo.checkSpellExceptions) &&
        Objects.equals(this.calculateKeywordDensity, onPageTaskPostRequestInfo.calculateKeywordDensity) &&
        Objects.equals(this.checksThreshold, onPageTaskPostRequestInfo.checksThreshold) &&
        Objects.equals(this.disableSitewideChecks, onPageTaskPostRequestInfo.disableSitewideChecks) &&
        Objects.equals(this.disablePageChecks, onPageTaskPostRequestInfo.disablePageChecks) &&
        Objects.equals(this.switchPool, onPageTaskPostRequestInfo.switchPool) &&
        Objects.equals(this.returnDespiteTimeout, onPageTaskPostRequestInfo.returnDespiteTimeout) &&
        Objects.equals(this.tag, onPageTaskPostRequestInfo.tag) &&
        Objects.equals(this.pingbackUrl, onPageTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, maxCrawlPages, startUrl, forceSitewideChecks, priorityUrls, maxCrawlDepth, crawlDelay, storeRawHtml, enableContentParsing, supportCookies, acceptLanguage, customRobotsTxt, robotsTxtMergeMode, customUserAgent, browserPreset, browserScreenWidth, browserScreenHeight, browserScreenScaleFactor, respectSitemap, customSitemap, crawlSitemapOnly, loadResources, enableWwwRedirectCheck, enableJavascript, enableXhr, enableBrowserRendering, disableCookiePopup, customJs, validateMicromarkup, allowSubdomains, allowedSubdomains, disallowedSubdomains, checkSpell, checkSpellLanguage, checkSpellExceptions, calculateKeywordDensity, checksThreshold, disableSitewideChecks, disablePageChecks, switchPool, returnDespiteTimeout, tag, pingbackUrl);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnPageTaskPostRequestInfo {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    maxCrawlPages: ").append(toIndentedString(maxCrawlPages)).append("\n");
    sb.append("    startUrl: ").append(toIndentedString(startUrl)).append("\n");
    sb.append("    forceSitewideChecks: ").append(toIndentedString(forceSitewideChecks)).append("\n");
    sb.append("    priorityUrls: ").append(toIndentedString(priorityUrls)).append("\n");
    sb.append("    maxCrawlDepth: ").append(toIndentedString(maxCrawlDepth)).append("\n");
    sb.append("    crawlDelay: ").append(toIndentedString(crawlDelay)).append("\n");
    sb.append("    storeRawHtml: ").append(toIndentedString(storeRawHtml)).append("\n");
    sb.append("    enableContentParsing: ").append(toIndentedString(enableContentParsing)).append("\n");
    sb.append("    supportCookies: ").append(toIndentedString(supportCookies)).append("\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    customRobotsTxt: ").append(toIndentedString(customRobotsTxt)).append("\n");
    sb.append("    robotsTxtMergeMode: ").append(toIndentedString(robotsTxtMergeMode)).append("\n");
    sb.append("    customUserAgent: ").append(toIndentedString(customUserAgent)).append("\n");
    sb.append("    browserPreset: ").append(toIndentedString(browserPreset)).append("\n");
    sb.append("    browserScreenWidth: ").append(toIndentedString(browserScreenWidth)).append("\n");
    sb.append("    browserScreenHeight: ").append(toIndentedString(browserScreenHeight)).append("\n");
    sb.append("    browserScreenScaleFactor: ").append(toIndentedString(browserScreenScaleFactor)).append("\n");
    sb.append("    respectSitemap: ").append(toIndentedString(respectSitemap)).append("\n");
    sb.append("    customSitemap: ").append(toIndentedString(customSitemap)).append("\n");
    sb.append("    crawlSitemapOnly: ").append(toIndentedString(crawlSitemapOnly)).append("\n");
    sb.append("    loadResources: ").append(toIndentedString(loadResources)).append("\n");
    sb.append("    enableWwwRedirectCheck: ").append(toIndentedString(enableWwwRedirectCheck)).append("\n");
    sb.append("    enableJavascript: ").append(toIndentedString(enableJavascript)).append("\n");
    sb.append("    enableXhr: ").append(toIndentedString(enableXhr)).append("\n");
    sb.append("    enableBrowserRendering: ").append(toIndentedString(enableBrowserRendering)).append("\n");
    sb.append("    disableCookiePopup: ").append(toIndentedString(disableCookiePopup)).append("\n");
    sb.append("    customJs: ").append(toIndentedString(customJs)).append("\n");
    sb.append("    validateMicromarkup: ").append(toIndentedString(validateMicromarkup)).append("\n");
    sb.append("    allowSubdomains: ").append(toIndentedString(allowSubdomains)).append("\n");
    sb.append("    allowedSubdomains: ").append(toIndentedString(allowedSubdomains)).append("\n");
    sb.append("    disallowedSubdomains: ").append(toIndentedString(disallowedSubdomains)).append("\n");
    sb.append("    checkSpell: ").append(toIndentedString(checkSpell)).append("\n");
    sb.append("    checkSpellLanguage: ").append(toIndentedString(checkSpellLanguage)).append("\n");
    sb.append("    checkSpellExceptions: ").append(toIndentedString(checkSpellExceptions)).append("\n");
    sb.append("    calculateKeywordDensity: ").append(toIndentedString(calculateKeywordDensity)).append("\n");
    sb.append("    checksThreshold: ").append(toIndentedString(checksThreshold)).append("\n");
    sb.append("    disableSitewideChecks: ").append(toIndentedString(disableSitewideChecks)).append("\n");
    sb.append("    disablePageChecks: ").append(toIndentedString(disablePageChecks)).append("\n");
    sb.append("    switchPool: ").append(toIndentedString(switchPool)).append("\n");
    sb.append("    returnDespiteTimeout: ").append(toIndentedString(returnDespiteTimeout)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    
    openapiFields.add("target");
    
    openapiFields.add("max_crawl_pages");
    
    openapiFields.add("start_url");
    
    openapiFields.add("force_sitewide_checks");
    
    openapiFields.add("priority_urls");
    
    openapiFields.add("max_crawl_depth");
    
    openapiFields.add("crawl_delay");
    
    openapiFields.add("store_raw_html");
    
    openapiFields.add("enable_content_parsing");
    
    openapiFields.add("support_cookies");
    
    openapiFields.add("accept_language");
    
    openapiFields.add("custom_robots_txt");
    
    openapiFields.add("robots_txt_merge_mode");
    
    openapiFields.add("custom_user_agent");
    
    openapiFields.add("browser_preset");
    
    openapiFields.add("browser_screen_width");
    
    openapiFields.add("browser_screen_height");
    
    openapiFields.add("browser_screen_scale_factor");
    
    openapiFields.add("respect_sitemap");
    
    openapiFields.add("custom_sitemap");
    
    openapiFields.add("crawl_sitemap_only");
    
    openapiFields.add("load_resources");
    
    openapiFields.add("enable_www_redirect_check");
    
    openapiFields.add("enable_javascript");
    
    openapiFields.add("enable_xhr");
    
    openapiFields.add("enable_browser_rendering");
    
    openapiFields.add("disable_cookie_popup");
    
    openapiFields.add("custom_js");
    
    openapiFields.add("validate_micromarkup");
    
    openapiFields.add("allow_subdomains");
    
    openapiFields.add("allowed_subdomains");
    
    openapiFields.add("disallowed_subdomains");
    
    openapiFields.add("check_spell");
    
    openapiFields.add("check_spell_language");
    
    openapiFields.add("check_spell_exceptions");
    
    openapiFields.add("calculate_keyword_density");
    
    openapiFields.add("checks_threshold");
    
    openapiFields.add("disable_sitewide_checks");
    
    openapiFields.add("disable_page_checks");
    
    openapiFields.add("switch_pool");
    
    openapiFields.add("return_despite_timeout");
    
    openapiFields.add("tag");
    
    openapiFields.add("pingback_url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPageTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, OnPageTaskPostRequestInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public OnPageTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }


  public static OnPageTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
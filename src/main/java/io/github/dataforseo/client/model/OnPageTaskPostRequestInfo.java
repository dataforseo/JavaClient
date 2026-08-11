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
   * <em>target domain</em><br><strong>required field</strong><br>domain name should be specified without <code>https://</code> and <code>www.</code><br>if you specify the page URL, the results will be returned for the domain included in the URL
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
   * <em>crawled pages limit</em><br><strong>required field</strong><br>the number of pages to crawl on the specified domain<br><strong>Note:</strong><br>if you set <code>max_crawl_pages</code> to 1 and do not specify <code>start_url</code> or set a homepage in it, the following sitewide checks will be disabled:<br><code>test_canonicalization</code>, <code>enable_www_redirect_check</code>, <code>test_hidden_server_signature</code>, <code>test_page_not_found</code>, <code>test_directory_browsing</code>, <code>test_https_redirect</code><br>to enable them anyway, set <code>force_sitewide_checks</code> to <code>true</code>if you set <code>max_crawl_pages</code> to 1 and specify <code>start_url</code> other than a homepage, all sitewide checks will be disabled;<br>to enable them anyway, set <code>force_sitewide_checks</code> to <code>true</code>
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
   * <em>the first url to crawl </em><br>optional field<br><strong>Note:</strong> you should specify an absolute URL<br>if you want to crawl a single page, specify its URL in this field and additionally set the <code>max_crawl_pages</code> parameter to <code>1</code><br>you can also use the <a href='/v3/on_page/instant_pages/?bash' target='_blank' rel='noopener noreferrer'>live Instant Pages endpoint</a> to get page-specific data
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
   * <em>enable sitewide checks when crawling a single page</em><br>optional field<br>set to <code>true</code> to get data on sitewide checks when crawling a single page;<br>default value: <code>false</code>
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
   * <em>urls to be crawled bypassing the queue</em><br>optional field<br>URLs specified in this array will be crawled in the first instance, bypassing the crawling queue;<br><strong>Note:</strong> you should specify the absolute URL;<br>you can specify up to <strong>20 URLs</strong>;<br>all URLs in the array must belong to the <code>target</code> domain;<br>subdomains will be ignored unless the <code>allow_subdomains</code> parameter is set to <code>true</code>example:<br>`'priority_urls': [<br>'https://dataforseo.com/apis/serp-api',<br>'https://dataforseo.com/contact'<br>]`
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
   * <em>crawl depth</em><br>optional field<br>the linking depth of the pages to crawl;<br>for example, starting page of the crawl is level 0, pages that have links from that page are level 1, etc.
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
   * <em>delay between hits, ms</em><br>optional field<br>the custom delay between crawler hits to the server<br>default value: <code>2000</code>
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
   * <em>store HTML of crawled pages</em><br>optional field<br>set to <code>true</code> if you want to get the HTML of the page using the <a href='/v3/on_page/raw_html/' target='_blank' rel='noopener noreferrer'>OnPage Raw HTML endpoint</a><br>default value: <code>false</code>
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
   * <em>parse content on crawled pages</em><br>optional field<br>set to <code>true</code> to use the <a href='/v3/on_page/content_parsing/live/' target='_blank' rel='noopener noreferrer'>OnPage Content Parsing endpoint</a><br>default value: <code>false</code>
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
   * <em>support cookies on crawled pages</em><br>optional field<br>set to <code>true</code> to support cookies when crawling the pages<br>default value: <code>false</code>
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
   * <em>language header for accessing the website</em><br>optional field<br>all locale formats are supported (xx, xx-XX, xxx-XX, etc.)<br><strong>Note:</strong> if you do not specify this parameter, some websites may deny access; in this case, pages will be returned with the <code>'type':'broken</code> in the response array
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
   * <em>custom robots.txt settings</em><br>optional field<br>example: <code>Disallow: /directory1/</code>
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
   * <em>merge with or override robots.txt settings</em><br>optional field<br>possible values: <code>merge</code>, <code>override</code>;<br>set to <code>override</code> if you want to ignore website crawling restrictions and other robots.txt settings<br>default value: <code>merge</code>;<br><strong>Note:</strong> if set to <code>override</code>, specify the <code>custom_robots_txt</code> parameter
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
   * <em>custom user agent</em><br>optional field<br>custom user agent for crawling a website<br>example: <code>Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36<br></code><br>default value: <code>Mozilla/5.0 (compatible; RSiteAuditor)</code>
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
   * <em>preset for browser screen parameters</em><br>optional field<br>if you use this field, you don't need to indicate <code>browser_screen_width</code>, <code>browser_screen_height</code>, <code>browser_screen_scale_factor</code>possible values:<br><code>desktop</code>, <code>mobile</code>, <code>tablet</code><code>desktop</code> preset will apply the following values:<code>browser_screen_width: 1920</code><br><code>browser_screen_height: 1080</code><br><code>browser_screen_scale_factor: 1</code><code>mobile</code> preset will apply the following values:<code>browser_screen_width: 390</code><br><code>browser_screen_height: 844</code><br><code>browser_screen_scale_factor: 3</code><code>tablet</code> preset will apply the following values:<code>browser_screen_width: 1024</code><br><code>browser_screen_height: 1366</code><br><code>browser_screen_scale_factor: 2</code><br><strong>Note:</strong> to use this parameter, set <code>enable_javascript</code> or <code>enable_browser_rendering</code> to <code>true</code>
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
   * <em>browser screen width</em><br>optional field<br>you can set a custom browser screen width to perform audit for a particular device;<br>if you use this field, you don't need to indicate <code>browser_preset</code> as it will be ignored;<br><strong>Note:</strong> to use this parameter, set <code>enable_javascript</code> or <code>enable_browser_rendering</code> to <code>true</code>minimum value, in pixels: <code>240</code><br>maximum value, in pixels: <code>9999</code>
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
   * <em>browser screen height</em><br>optional field<br>you can set a custom browser screen height to perform an audit for a particular device;<br>if you use this field, you don't need to indicate <code>browser_preset</code> as it will be ignored;<br><strong>Note:</strong> to use this parameter, set <code>enable_javascript</code> or <code>enable_browser_rendering</code> to <code>true</code>minimum value, in pixels: <code>240</code><br>maximum value, in pixels: <code>9999</code>
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
   * <em>browser screen scale factor</em><br>optional field<br>you can set a custom browser screen resolution ratio to perform audit for a particular device;<br>if you use this field, you don't need to indicate <code>browser_preset</code> as it will be ignored;<br><strong>Note:</strong> to use this parameter, set <code>enable_javascript</code> or <code>enable_browser_rendering</code> to <code>true</code>minimum value: <code>0.5</code><br>maximum value: <code>3</code>
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
   * <em>respect sitemap when crawling</em><br>optional field<br>set to <code>true</code> if you want to follow the order of pages indicated in the primary sitemap when crawling;<br>default value: <code>false</code><br><strong>Note:</strong> if set to <code>true</code>, the <code>click_depth</code> value in the API response will equal <code>0</code>;<br>the <code>max_crawl_depth</code> field of the request will be ignored, you can specify the number of pages to crawl using the <code>max_crawl_pages</code> parameter
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
   * <em>custom sitemap url</em><br>optional field<br>the URL of the page where the alternative sitemap is located<br><strong>Note:</strong> if you want to use this parameter, <code>respect_sitemap</code> should be <code>true</code>
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
   * <em>crawl only pages indicated in the sitemap</em><br>optional field<br>set to <code>true</code> if you want to crawl only the pages indicated in the sitemap<br>if you set this parameter to <code>true</code> and do not specify <code>custom_sitemap</code>, we will crawl the default sitemap<br>default value: <code>false</code><br><strong>Note:</strong> if you want to use this parameter, <code>respect_sitemap</code> should be <code>true</code>
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
   * <em>load resources</em><br>optional field<br>set to <code>true</code> if you want to load image, stylesheets, scripts, and broken resources<br>default value: <code>false</code><br><strong>Note:</strong> if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter <a href='https://dataforseo.com/help-center/cost-of-onpage-api-parameters' target='_blank' rel='noopener noreferrer'>in our help article</a>; the cost can be calculated on the <a href='https://dataforseo.com/pricing/on-page/onpage-api' target='_blank' rel='noopener noreferrer'>Pricing Page</a>
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
   * <em>check if the domain implemented the www redirection</em><br>optional field<br>set to <code>true</code> if you want to check if the requested domain implemented the www to non-www or non-www to www redirect;<br>default value: <code>false</code>
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
   * <em>load javascript on a page</em><br>optional field<br>set to <code>true</code> if you want to load the scripts available on a page<br>default value: <code>false</code><br><strong>Note:</strong> if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter <a href='https://dataforseo.com/help-center/cost-of-onpage-api-parameters' target='_blank' rel='noopener noreferrer'>in our help article</a>; the cost can be calculated on the <a href='https://dataforseo.com/pricing/on-page/onpage-api' target='_blank' rel='noopener noreferrer'>Pricing Page</a>
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
   * <em>enable XMLHttpRequest on a page</em><br>optional field<br>set to <code>true</code> if you want our crawler to request data from a web server using the XMLHttpRequest object<br>default value: <code>false</code>;if you use this field, <code>enable_javascript</code> must be set to <code>true</code>;
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
   * <em>emulate browser rendering to measure Core Web Vitals</em><br>optional field<br>by using this parameter you will be able to emulate a browser when loading a web page;<br><code>enable_browser_rendering</code> loads styles, images, fonts, animations, videos, and other resources on a page;<br>default value: <code>false</code><br>set to <code>true</code> to obtain Core Web Vitals (FID, CLS, LCP) metrics in the response;<br><strong>if you use this field, <code>enable_javascript</code>, and <code>load_resources</code> parameters must be set to <code>true</code></strong><br><strong>Note:</strong> if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter <a href='https://dataforseo.com/help-center/cost-of-onpage-api-parameters' target='_blank' rel='noopener noreferrer'>in our help article</a>; the cost can be calculated on the <a href='https://dataforseo.com/pricing/on-page/onpage-api' target='_blank' rel='noopener noreferrer'>Pricing Page</a>
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
   * <em>disable the cookie popup</em><br>optional field<br>set to <code>true</code> if you want to disable the popup requesting cookie consent from the user;<br>default value:<br><code>false</code>
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
   * <em>custom javascript</em><br>optional field<br><strong>Note</strong> that the execution time for the script you enter here should be 700 ms maximum, for example, you can use the following JS snippet to check if the website contains Google Tag Manager as a <code>scr</code> attribute:<br><code>let meta = { haveGoogleAnalytics: false, haveTagManager: false };rnfor (var i = 0; i < document.scripts.length; i++) {rn let src = document.scripts[i].getAttribute('src');rn if (src != undefined) {rn if (src.indexOf('analytics.js') >= 0)rn      meta.haveGoogleAnalytics = true;rntif (src.indexOf('gtm.js') >= 0)rn      meta.haveTagManager = true;rn  }rn}rnmeta;</code>the returned value depends on what you specified in this field. For instance, if you specify the following script:<br>`meta = {}; meta.url = document.URL; meta.test = 'test'; meta;`<br>as a response you will receive the following data:<br>`'custom_js_response': {<br>'url': 'https://dataforseo.com/',<br>'test': 'test'<br>}`<br><strong>Note:</strong> the length of the script you enter must be no more than 2000 characters
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
   * <em>enable microdata validation</em><br>optional field<br>set to <code>true</code> if you want to use the <a href='/v3/on_page/microdata/' target='_blank' rel='noopener noreferrer'>OnPage API Microdata endpoint</a><br>default value: <code>false</code>
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
   * <em>include pages on subdomains</em><br>optional field<br>set to <code>true</code> if you want to crawl all subdomains of a target website<br>default value: <code>false</code>
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
   * <em>subdomains to crawl</em><br>optional field<br>specify subdomains that you want to crawl<br>example: <code>['blog.site.com', 'my.site.com', 'shop.site.com']</code><br><strong>Note:</strong> to use this parameter, the <code>allow_subdomains</code> parameter should be set to <code>false</code>;<br>otherwise, the content of <code>allowed_subdomains</code> field will be ignored and the results will be returned for all subdomains
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
   * <em>subdomains not to crawl</em><br>optional field<br>specify subdomains that you don't want to crawl<br>example: <code>['status.site.com', 'docs.site.com']</code><br><strong>Note:</strong> to use this parameter, the <code>allow_subdomains</code> parameter should be set to <code>true</code>
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
   * <em>check spelling</em><br>optional field<br>set to <code>true</code> to check spelling on a website using <a href='http://hunspell.github.io/' target='_blank' rel='noopener noreferrer'>Hunspell</a> library<br>default value: <code>false</code>
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
   * <em>language of the spell check</em><br>optional field<br>supported languages: 'hy', 'eu', 'bg', 'ca', 'hr', 'cs', 'da', 'nl', 'en', 'eo', 'et', 'fo', 'fa', 'fr', 'fy', 'gl', 'ka', 'de', 'el', 'he', 'hu', 'is', 'ia', 'ga', 'it', 'rw', 'la', 'lv', 'lt', 'mk', 'mn', 'ne', 'nb', 'nn', 'pl', 'pt', 'ro', 'gd', 'sr', 'sk', 'sl', 'es', 'sv', 'tr', 'tk', 'uk', 'vi'<br><strong>Note:</strong> if no language is specified, it will be set automatically based on page content
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
   * <em>words excluded from spell check</em><br>optional field<br>specify the words that you want to exclude from spell check<br>maximum word length: 100 characters<br>maximum amount of words: 1000<br>example: <code>'SERP', 'minifiers', 'JavaScript'</code>
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
   * <em>calculate keyword density for the target domain</em><br>optional field<br>set to <code>true</code> if you want to calculate keyword density for website pages<br>default value: <code>false</code><br><strong>Note:</strong> if you use this parameter, additional charges will apply; learn more about the cost of tasks with this parameter <a href='https://dataforseo.com/help-center/cost-of-onpage-api-parameters' target='_blank' rel='noopener noreferrer'>in our help article</a><br>once the crawl is completed, you can obtain keyword density values with <a href='/v3/on_page/keyword_density?bash' target='_blank' rel='noopener noreferrer'>the Keyword Density endpoint</a>
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
   * <em>custom threshold values for checks</em><br>optional field<br>you can specify custom threshold values for the parameters included in the <code>checks</code> object of OnPage API responses;<br><strong>Note:</strong> only integer threshold values can be modified;<br>for example, the <code>high_loading_time</code> and <code>large_page_size</code> parameters are set to 3 seconds and 1 megabyte respectively by default;<br>if you want to change these thresholds to 1 second and 1000 kbytes, use the following snippet:<br>`'checks_threshold': {<br>'high_loading_time': 1,<br>'large_page_size': 1000<br>}`<br>available customizable parameters with default values:<br>`'title_too_short', default value: 30, type: 'int'<br>'title_too_long', default value: 65, type: 'int'<br>'small_page_size', default value: 1024, type: 'int'<br>'large_page_size', default value: 1048576 (1024 * 1024), type: 'int'<br>'low_character_count', default value: 1024, type: 'int'<br>'high_character_count', default value: 256000 (250 * 1024), type: 'int'<br>'low_content_rate', default value: 0.1, type: 'float'<br>'high_content_rate', default value: 0.9, type: 'float'<br>'high_loading_time', default value: 3000, type: 'int'<br>'high_waiting_time', default value: 1500, type: 'int'<br>'low_readability_rate', default value: 15.0, type: 'float'<br>'irrelevant_description', default value: 0.2, type: 'float'<br>'irrelevant_title', default value: 0.3, type: 'float'<br>'irrelevant_meta_keywords', default value: 0.6, type: 'float'`
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
   * <em>prevent certain sitewide checks from running</em><br>optional field<br>specify the following <code>checks</code> to prevent them from running on the <code>target</code> website:<br><code>'test_page_not_found'</code><br><code>'test_canonicalization'</code><br><code>'test_https_redirect'</code><br><code>'test_directory_browsing'</code>example:<br><code>'disable_sitewide_checks': ['test_directory_browsing', 'test_page_not_found']</code>learn more on <a href='https://dataforseo.com/help-center/how-to-disable-sitewide-checks-in-onpage-api' target='_blank' rel='noopener noreferrer'>our help center</a>
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
   * <em>prevent certain page checks from running</em><br>optional field<br>specify certain <code>checks</code> to prevent them from running and impacting the <code>onpage_score</code>example:<br><code>'disable_page_checks': ['is_5xx_code', 'is_4xx_code']</code>
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
   * <em>switch proxy pool</em><br>optional field<br>if <code>true</code>, additional proxy pools will be used to obtain the requested data;<br>the parameter can be used if a multitude of tasks is set simultaneously, resulting in occasional <code>rate-limit</code> and/or <code>site_unreachable</code> errors
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
   * <em>return data on pages despite the timeout error</em><br>optional field<br>if <code>true</code>, the data will be provided on pages that failed to load within 120 seconds and responded with a timeout error;<br>default value: <code>false</code>
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
   * <em>user-defined task identifier</em><br>optional field<br><em>the character limit is 255</em><br>you can use this parameter to identify the task and match it with the result<br>you will find the specified <code>tag</code> value in the <code>data</code> object of the response
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
   * <em>notification URL of a completed task</em><br>optional field<br>when a task is completed we will notify you by GET request sent to the URL you have specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/pingscript?id=$id</code><br><code>http://your-server.com/pingscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>pingback_url</code> will be urlencoded;<br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
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
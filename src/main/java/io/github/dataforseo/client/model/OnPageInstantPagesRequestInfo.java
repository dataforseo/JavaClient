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



public class OnPageInstantPagesRequestInfo  {


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public OnPageInstantPagesRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * target page url
* required field
* absolute URL of the target page;
* Note #1: results will be returned for the specified URL only;
* Note #2: to prevent denial-of-service events, tasks that contain a duplicate crawl host will be returned with a 40501 error;
* to prevent this error from occurring, avoid setting tasks with the same domain if at least one of your previous tasks with this domain (including a page URL on the domain) is still in a crawling queue
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_CUSTOM_USER_AGENT = "custom_user_agent";
  @SerializedName(SERIALIZED_NAME_CUSTOM_USER_AGENT)
  private String customUserAgent;

  public OnPageInstantPagesRequestInfo customUserAgent(String customUserAgent) {
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

  public OnPageInstantPagesRequestInfo browserPreset(String browserPreset) {
    this.browserPreset = browserPreset;
    return this;
  }

  /**
   * preset for browser screen parameters
* optional field
* if you use this field, you don’t need to indicate browser_screen_width, browser_screen_height, browser_screen_scale_factorpossible values:
* desktop, mobile, tabletdesktop preset will apply the following values:
* browser_screen_width: 1920
* browser_screen_height: 1080
* browser_screen_scale_factor: 1
* mobile preset will apply the following values:
* browser_screen_width: 390
* browser_screen_height: 844
* browser_screen_scale_factor: 3
* tablet preset will apply the following values:
* browser_screen_width: 1024
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

  public OnPageInstantPagesRequestInfo browserScreenWidth(Long browserScreenWidth) {
    this.browserScreenWidth = browserScreenWidth;
    return this;
  }

  /**
   * browser screen width
* optional field
* you can set a custom browser screen width to perform audit for a particular device;
* if you use this field, you don’t need to indicate browser_preset as it will be ignored;Note: to use this parameter, set enable_javascript or enable_browser_rendering to trueminimum value, in pixels: 240
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

  public OnPageInstantPagesRequestInfo browserScreenHeight(Integer browserScreenHeight) {
    this.browserScreenHeight = browserScreenHeight;
    return this;
  }

  /**
   * browser screen height
* optional field
* you can set a custom browser screen height to perform audit for a particular device;
* if you use this field, you don’t need to indicate browser_preset as it will be ignored;Note: to use this parameter, set enable_javascript or enable_browser_rendering to trueminimum value, in pixels: 240
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

  public OnPageInstantPagesRequestInfo browserScreenScaleFactor(Double browserScreenScaleFactor) {
    this.browserScreenScaleFactor = browserScreenScaleFactor;
    return this;
  }

  /**
   * browser screen scale factor
* optional field
* you can set a custom browser screen resolution ratio to perform audit for a particular device;
* if you use this field, you don’t need to indicate browser_preset as it will be ignored;Note: to use this parameter, set enable_javascript or enable_browser_rendering to trueminimum value: 0.5
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


  public static final String SERIALIZED_NAME_STORE_RAW_HTML = "store_raw_html";
  @SerializedName(SERIALIZED_NAME_STORE_RAW_HTML)
  private Boolean storeRawHtml;

  public OnPageInstantPagesRequestInfo storeRawHtml(Boolean storeRawHtml) {
    this.storeRawHtml = storeRawHtml;
    return this;
  }

  /**
   * store HTML of a crawled page
* optional field
* set to true if you want get the HTML of the page using the OnPage Raw HTML endpoint
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


  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "accept_language";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public OnPageInstantPagesRequestInfo acceptLanguage(String acceptLanguage) {
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


  public static final String SERIALIZED_NAME_LOAD_RESOURCES = "load_resources";
  @SerializedName(SERIALIZED_NAME_LOAD_RESOURCES)
  private Boolean loadResources;

  public OnPageInstantPagesRequestInfo loadResources(Boolean loadResources) {
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


  public static final String SERIALIZED_NAME_ENABLE_JAVASCRIPT = "enable_javascript";
  @SerializedName(SERIALIZED_NAME_ENABLE_JAVASCRIPT)
  private Boolean enableJavascript;

  public OnPageInstantPagesRequestInfo enableJavascript(Boolean enableJavascript) {
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


  public static final String SERIALIZED_NAME_ENABLE_BROWSER_RENDERING = "enable_browser_rendering";
  @SerializedName(SERIALIZED_NAME_ENABLE_BROWSER_RENDERING)
  private Boolean enableBrowserRendering;

  public OnPageInstantPagesRequestInfo enableBrowserRendering(Boolean enableBrowserRendering) {
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
* if you use this field, parameters enable_javascript, and load_resources are enabled automatically;
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

  public OnPageInstantPagesRequestInfo disableCookiePopup(Boolean disableCookiePopup) {
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


  public static final String SERIALIZED_NAME_RETURN_DESPITE_TIMEOUT = "return_despite_timeout";
  @SerializedName(SERIALIZED_NAME_RETURN_DESPITE_TIMEOUT)
  private Boolean returnDespiteTimeout;

  public OnPageInstantPagesRequestInfo returnDespiteTimeout(Boolean returnDespiteTimeout) {
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


  public static final String SERIALIZED_NAME_ENABLE_XHR = "enable_xhr";
  @SerializedName(SERIALIZED_NAME_ENABLE_XHR)
  private Boolean enableXhr;

  public OnPageInstantPagesRequestInfo enableXhr(Boolean enableXhr) {
    this.enableXhr = enableXhr;
    return this;
  }

  /**
   * enable XMLHttpRequest on a page
* optional field
* set to true if you want our crawler to request data from a web server using the XMLHttpRequest object
* default value:
* falseif you use this field, enable_javascript must be set to true;
   * @return enableXhr
   */
  @javax.annotation.Nullable
  public Boolean getEnableXhr() {
    return enableXhr;
  }

  public void setEnableXhr(Boolean enableXhr) {
    this.enableXhr = enableXhr;
  }


  public static final String SERIALIZED_NAME_CUSTOM_JS = "custom_js";
  @SerializedName(SERIALIZED_NAME_CUSTOM_JS)
  private String customJs;

  public OnPageInstantPagesRequestInfo customJs(String customJs) {
    this.customJs = customJs;
    return this;
  }

  /**
   * custom javascript
* optional fieldNote that the execution time for the script you enter here should be 700 ms maximum;
* for example, you can use the following JS snippet to check if the website contains Google Tag Manager as a scr attribute:
* let meta = { haveGoogleAnalytics: false, haveTagManager: false };\r\nfor (var i = 0; i < document.scripts.length; i++) {\r\n let src = document.scripts[i].getAttribute(\'src\');\r\n if (src != undefined) {\r\n if (src.indexOf(\'analytics.js\') >= 0)\r\n      meta.haveGoogleAnalytics = true;\r\n\tif (src.indexOf(\'gtm.js\') >= 0)\r\n      meta.haveTagManager = true;\r\n  }\r\n}\r\nmeta;the returned value depends on what you specified in this field. For instance, if you specify the following script:
* meta = {}; meta.url = document.URL; meta.test = 'test'; meta;
* as a response you will receive the following data:
* 'custom_js_response': {
* 'url': 'https://dataforseo.com/',
* 'test': 'test'
* }
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

  public OnPageInstantPagesRequestInfo validateMicromarkup(Boolean validateMicromarkup) {
    this.validateMicromarkup = validateMicromarkup;
    return this;
  }

  /**
   * enable microdata validation
* optional field
* if set to true, you can use the OnPage API Microdata endpoint with the id of the task;
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


  public static final String SERIALIZED_NAME_CHECK_SPELL = "check_spell";
  @SerializedName(SERIALIZED_NAME_CHECK_SPELL)
  private Boolean checkSpell;

  public OnPageInstantPagesRequestInfo checkSpell(Boolean checkSpell) {
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


  public static final String SERIALIZED_NAME_CHECKS_THRESHOLD = "checks_threshold";
  @SerializedName(SERIALIZED_NAME_CHECKS_THRESHOLD)
  private Map<String, Long> checksThreshold;

  public OnPageInstantPagesRequestInfo checksThreshold(Map<String, Long> checksThreshold) {
    this.checksThreshold = checksThreshold;
    return this;
  }

  /**
   * custom threshold values for checks
* optional field
* you can specify custom threshold values for the parameters included in the checks array of OnPage API responses;
* Note: only integer threshold values can be modified;
   * @return checksThreshold
   */
  @javax.annotation.Nullable
  public Map<String, Long> getChecksThreshold() {
    return checksThreshold;
  }

  public void setChecksThreshold(Map<String, Long> checksThreshold) {
    this.checksThreshold = checksThreshold;
  }


  public static final String SERIALIZED_NAME_SWITCH_POOL = "switch_pool";
  @SerializedName(SERIALIZED_NAME_SWITCH_POOL)
  private Boolean switchPool;

  public OnPageInstantPagesRequestInfo switchPool(Boolean switchPool) {
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


  public static final String SERIALIZED_NAME_IP_POOL_FOR_SCAN = "ip_pool_for_scan";
  @SerializedName(SERIALIZED_NAME_IP_POOL_FOR_SCAN)
  private String ipPoolForScan;

  public OnPageInstantPagesRequestInfo ipPoolForScan(String ipPoolForScan) {
    this.ipPoolForScan = ipPoolForScan;
    return this;
  }

  /**
   * proxy pool
* optional field
* you can choose a location of the proxy pool that will be used to obtain the requested data;
* the parameter can be used if page content is inaccessible in one of the locations, resulting in occasional site_unreachable errors
* possible values: us, de
   * @return ipPoolForScan
   */
  @javax.annotation.Nullable
  public String getIpPoolForScan() {
    return ipPoolForScan;
  }

  public void setIpPoolForScan(String ipPoolForScan) {
    this.ipPoolForScan = ipPoolForScan;
  }



  public OnPageInstantPagesRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageInstantPagesRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    OnPageInstantPagesRequestInfo onPageInstantPagesRequestInfo = (OnPageInstantPagesRequestInfo) o;
    return

        Objects.equals(this.url, onPageInstantPagesRequestInfo.url) &&
        Objects.equals(this.customUserAgent, onPageInstantPagesRequestInfo.customUserAgent) &&
        Objects.equals(this.browserPreset, onPageInstantPagesRequestInfo.browserPreset) &&
        Objects.equals(this.browserScreenWidth, onPageInstantPagesRequestInfo.browserScreenWidth) &&
        Objects.equals(this.browserScreenHeight, onPageInstantPagesRequestInfo.browserScreenHeight) &&
        Objects.equals(this.browserScreenScaleFactor, onPageInstantPagesRequestInfo.browserScreenScaleFactor) &&
        Objects.equals(this.storeRawHtml, onPageInstantPagesRequestInfo.storeRawHtml) &&
        Objects.equals(this.acceptLanguage, onPageInstantPagesRequestInfo.acceptLanguage) &&
        Objects.equals(this.loadResources, onPageInstantPagesRequestInfo.loadResources) &&
        Objects.equals(this.enableJavascript, onPageInstantPagesRequestInfo.enableJavascript) &&
        Objects.equals(this.enableBrowserRendering, onPageInstantPagesRequestInfo.enableBrowserRendering) &&
        Objects.equals(this.disableCookiePopup, onPageInstantPagesRequestInfo.disableCookiePopup) &&
        Objects.equals(this.returnDespiteTimeout, onPageInstantPagesRequestInfo.returnDespiteTimeout) &&
        Objects.equals(this.enableXhr, onPageInstantPagesRequestInfo.enableXhr) &&
        Objects.equals(this.customJs, onPageInstantPagesRequestInfo.customJs) &&
        Objects.equals(this.validateMicromarkup, onPageInstantPagesRequestInfo.validateMicromarkup) &&
        Objects.equals(this.checkSpell, onPageInstantPagesRequestInfo.checkSpell) &&
        Objects.equals(this.checksThreshold, onPageInstantPagesRequestInfo.checksThreshold) &&
        Objects.equals(this.switchPool, onPageInstantPagesRequestInfo.switchPool) &&
        Objects.equals(this.ipPoolForScan, onPageInstantPagesRequestInfo.ipPoolForScan);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(url, customUserAgent, browserPreset, browserScreenWidth, browserScreenHeight, browserScreenScaleFactor, storeRawHtml, acceptLanguage, loadResources, enableJavascript, enableBrowserRendering, disableCookiePopup, returnDespiteTimeout, enableXhr, customJs, validateMicromarkup, checkSpell, checksThreshold, switchPool, ipPoolForScan);
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
    sb.append("class OnPageInstantPagesRequestInfo {\n");

    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    customUserAgent: ").append(toIndentedString(customUserAgent)).append("\n");
    sb.append("    browserPreset: ").append(toIndentedString(browserPreset)).append("\n");
    sb.append("    browserScreenWidth: ").append(toIndentedString(browserScreenWidth)).append("\n");
    sb.append("    browserScreenHeight: ").append(toIndentedString(browserScreenHeight)).append("\n");
    sb.append("    browserScreenScaleFactor: ").append(toIndentedString(browserScreenScaleFactor)).append("\n");
    sb.append("    storeRawHtml: ").append(toIndentedString(storeRawHtml)).append("\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    loadResources: ").append(toIndentedString(loadResources)).append("\n");
    sb.append("    enableJavascript: ").append(toIndentedString(enableJavascript)).append("\n");
    sb.append("    enableBrowserRendering: ").append(toIndentedString(enableBrowserRendering)).append("\n");
    sb.append("    disableCookiePopup: ").append(toIndentedString(disableCookiePopup)).append("\n");
    sb.append("    returnDespiteTimeout: ").append(toIndentedString(returnDespiteTimeout)).append("\n");
    sb.append("    enableXhr: ").append(toIndentedString(enableXhr)).append("\n");
    sb.append("    customJs: ").append(toIndentedString(customJs)).append("\n");
    sb.append("    validateMicromarkup: ").append(toIndentedString(validateMicromarkup)).append("\n");
    sb.append("    checkSpell: ").append(toIndentedString(checkSpell)).append("\n");
    sb.append("    checksThreshold: ").append(toIndentedString(checksThreshold)).append("\n");
    sb.append("    switchPool: ").append(toIndentedString(switchPool)).append("\n");
    sb.append("    ipPoolForScan: ").append(toIndentedString(ipPoolForScan)).append("\n");
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
    
    openapiFields.add("url");
    
    openapiFields.add("custom_user_agent");
    
    openapiFields.add("browser_preset");
    
    openapiFields.add("browser_screen_width");
    
    openapiFields.add("browser_screen_height");
    
    openapiFields.add("browser_screen_scale_factor");
    
    openapiFields.add("store_raw_html");
    
    openapiFields.add("accept_language");
    
    openapiFields.add("load_resources");
    
    openapiFields.add("enable_javascript");
    
    openapiFields.add("enable_browser_rendering");
    
    openapiFields.add("disable_cookie_popup");
    
    openapiFields.add("return_despite_timeout");
    
    openapiFields.add("enable_xhr");
    
    openapiFields.add("custom_js");
    
    openapiFields.add("validate_micromarkup");
    
    openapiFields.add("check_spell");
    
    openapiFields.add("checks_threshold");
    
    openapiFields.add("switch_pool");
    
    openapiFields.add("ip_pool_for_scan");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPageInstantPagesRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageInstantPagesRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageInstantPagesRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageInstantPagesRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageInstantPagesRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageInstantPagesRequestInfo>() {
           @Override
           public void write(JsonWriter out, OnPageInstantPagesRequestInfo value) throws IOException {
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
           public OnPageInstantPagesRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageInstantPagesRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPageInstantPagesRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageInstantPagesRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
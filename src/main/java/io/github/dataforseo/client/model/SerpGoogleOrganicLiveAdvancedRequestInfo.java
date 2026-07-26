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


public class SerpGoogleOrganicLiveAdvancedRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public SerpGoogleOrganicLiveAdvancedRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <p><em>keyword</em><p><strong>required field</strong><p>you can specify <strong>up to 700 characters</strong> in the <code>keyword</code> field<p>all %## will be decoded (plus character ‘+’ will be decoded to a space character)<p>if you need to use the “%” character for your <code>keyword</code>, please specify it as “%25”;<p>if you need to use the “+” character for your <code>keyword</code>, please specify it as “%2B”;<p>if this field contains such parameters as <em>‘allinanchor:’, ‘allintext:’, ‘allintitle:’, ‘allinurl:’, ‘cache:’, ‘define:’, ‘definition:’, ‘filetype:’, ‘id:’, ‘inanchor:’, ‘info:’, ‘intext:’, ‘intitle:’, ‘inurl:’, ‘link:’, ‘site:’</em>, <strong>the charge per task will be multiplied by 5</strong><br>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' target='_blank' rel='noopener noreferrer'>Help Center article</a></p>
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public SerpGoogleOrganicLiveAdvancedRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <p><em>search engine location code</em><p><strong>required field if you don't specify</strong> <code>location_name</code> or <code>location_coordinate</code><p><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_coordinate</code></strong><p>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/locations</code><p>example:<p><code class='long-string'>2840</code></p>
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public SerpGoogleOrganicLiveAdvancedRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <p><em>search engine language code</em><p>optional field if you specify <code>language_name</code><p><strong>if you use this field, you don't need to specify <code>language_name</code></strong><p>you can receive the list of available languages of the search engine with their <code>language_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/languages</code><em><p></em>example:<em><p></em><code class='long-string'>en</code></p>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public SerpGoogleOrganicLiveAdvancedRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * <p><em>parsing depth</em><p>optional field<p>number of results in SERP<p><strong>default value: <code>10</code></strong><p>max value: <code>200</code></p><br><strong>Your account will be billed per each SERP containing up to 10 results;</strong><p>Setting depth above 10 may result in additional charges <a href='https://dataforseo.com/help-center/how-many-results-scraped' target='_blank' rel='noopener noreferrer'>if the search engine returns more than 10 results</a>;<p>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/serp/google-organic-serp-api' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public SerpGoogleOrganicLiveAdvancedRequestInfo device(String device) {
    this.device = device;
    return this;
  }

  /**
   * <p><em>device type</em><p>optional field<p>return results for a specific device type<p>can take the values:<code>desktop</code>, <code>mobile</code><p>default value: <code>desktop</code></p>
   * @return device
   */
  @javax.annotation.Nullable
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }


  public static final String SERIALIZED_NAME_LOAD_ASYNC_AI_OVERVIEW = "load_async_ai_overview";
  @SerializedName(SERIALIZED_NAME_LOAD_ASYNC_AI_OVERVIEW)
  private Boolean loadAsyncAiOverview;

  public SerpGoogleOrganicLiveAdvancedRequestInfo loadAsyncAiOverview(Boolean loadAsyncAiOverview) {
    this.loadAsyncAiOverview = loadAsyncAiOverview;
    return this;
  }

  /**
   * <p><em>load asynchronous ai overview</em><p>optional field<p>set to <code>true</code> to obtain <code>ai_overview</code> items is SERPs even if they are loaded asynchronously;<p>if set to <code>false</code>, you will only obtain <code>ai_overview</code> items from cache;<p>default value: <code>false</code><p><strong>Note:</strong> you will be charged extra $0.002 for using this parameter;<p>if the element is absent or contains <code>'asynchronous_ai_overview': false</code>, all extra charges will be returned to your account balance</p>
   * @return loadAsyncAiOverview
   */
  @javax.annotation.Nullable
  public Boolean getLoadAsyncAiOverview() {
    return loadAsyncAiOverview;
  }

  public void setLoadAsyncAiOverview(Boolean loadAsyncAiOverview) {
    this.loadAsyncAiOverview = loadAsyncAiOverview;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public SerpGoogleOrganicLiveAdvancedRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <p><em>full name of search engine location</em><p><strong>required field if you don't specify</strong> <code>location_code</code> or <code>location_coordinate</code><p><strong>if you use this field, you don't need to specify <code>location_code</code> or <code>location_coordinate</code></strong><p>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/locations</code><p>example:<p><code class='long-string'>London,England,United Kingdom</code></p>
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public SerpGoogleOrganicLiveAdvancedRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <p><em>full name of search engine language</em><p>optional field if you specify <code>language_code</code><p><strong>if you use this field, you don't need to specify <code>language_code</code></strong><p>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/languages</code><p>example:<p><code class='long-string'>English</code></p>
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public SerpGoogleOrganicLiveAdvancedRequestInfo os(String os) {
    this.os = os;
    return this;
  }

  /**
   * <p><em>device operating system</em><p>optional field<p>if you specify <code>desktop</code> in the <code>device</code> field, choose from the following values: <code>windows</code>, <code>macos</code><p>default value: <code>windows</code><p>if you specify <code>mobile</code> in the <code>device</code> field, choose from the following values: <code>android</code>, <code>ios</code><p>default value: <code>android</code></p>
   * @return os
   */
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public SerpGoogleOrganicLiveAdvancedRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * <p><em>user-defined task identifier</em><p>optional field<p><em>the character limit is 255</em><p>you can use this parameter to identify the task and match it with the result<p>you will find the specified <code>tag</code> value in the <code>data</code> object of the response</p>
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public static final String SERIALIZED_NAME_STOP_CRAWL_ON_MATCH = "stop_crawl_on_match";
  @SerializedName(SERIALIZED_NAME_STOP_CRAWL_ON_MATCH)
  private List<SerpApiStopCrawlOnMatchInfo> stopCrawlOnMatch;

  public SerpGoogleOrganicLiveAdvancedRequestInfo stopCrawlOnMatch(List<SerpApiStopCrawlOnMatchInfo> stopCrawlOnMatch) {
    this.stopCrawlOnMatch = stopCrawlOnMatch;
    return this;
  }

  /**
   * array of targets to stop crawling
* optional field
* if specified, the response will contain SERP results up to and including the specified match_value;
* you can specify up to 10 target values in this array
* example:
* 'stop_crawl_on_match':[{'match_value':'dataforseo.com','match_type':'with_subdomains'}]
* learn more about this parameter on our Help Center - https://dataforseo.com/help-center/using-the-stop_crawl_on_match-parameter-in-serp-api
* Your account will be billed per each SERP crawled through the specified targets
   * @return stopCrawlOnMatch
   */
  @javax.annotation.Nullable
  public List<SerpApiStopCrawlOnMatchInfo> getStopCrawlOnMatch() {
    return stopCrawlOnMatch;
  }

  public void setStopCrawlOnMatch(List<SerpApiStopCrawlOnMatchInfo> stopCrawlOnMatch) {
    this.stopCrawlOnMatch = stopCrawlOnMatch;
  }


  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private String matchType;

  public SerpGoogleOrganicLiveAdvancedRequestInfo matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * <p><em>target match type</em><p><strong>required field if <code>stop_crawl_on_match</code> is specified</strong><p>type of match for the <code>match_value</code><p>possible values:<p><code>domain</code> – specific domain or subdomain<p><code>with_subdomains</code> – main domain and subdomains<p><code>wildcard</code> –  wildcard pattern</p>
   * @return matchType
   */
  @javax.annotation.Nullable
  public String getMatchType() {
    return matchType;
  }

  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }


  public static final String SERIALIZED_NAME_MATCH_VALUE = "match_value";
  @SerializedName(SERIALIZED_NAME_MATCH_VALUE)
  private String matchValue;

  public SerpGoogleOrganicLiveAdvancedRequestInfo matchValue(String matchValue) {
    this.matchValue = matchValue;
    return this;
  }

  /**
   * <p><em>target domain, subdomain, or wildcard value</em><p><strong>required field if <code>stop_crawl_on_match</code> is specified</strong><p>specify a target domain, subdomain, or wildcard value;<p><strong>Note:</strong> domain or subdomain must be specified without a request protocol;<p>example: <code>'match_value': 'dataforseo.com'</code>,<p><code>'match_value': '/blog/post-*'</code></p>
   * @return matchValue
   */
  @javax.annotation.Nullable
  public String getMatchValue() {
    return matchValue;
  }

  public void setMatchValue(String matchValue) {
    this.matchValue = matchValue;
  }


  public static final String SERIALIZED_NAME_MAX_CRAWL_PAGES = "max_crawl_pages";
  @SerializedName(SERIALIZED_NAME_MAX_CRAWL_PAGES)
  private Integer maxCrawlPages;

  public SerpGoogleOrganicLiveAdvancedRequestInfo maxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
    return this;
  }

  /**
   * <p><em>page crawl limit</em><p>optional field<p>number of search results pages to crawl<p>max value: <code>100</code><p><strong>Note:</strong> you will be charged for each page crawled (10 organic results per page);<p>learn more about pricing on our <a href='https://dataforseo.com/pricing/serp/google-organic-serp-api' target='_blank' rel='noopener'>Pricing</a> page;<p><strong>Note#2:</strong> the <code>max_crawl_pages</code> and <code>depth</code> parameters complement each other;<p>learn more at <a href='https://dataforseo.com/help-center/what-is-max-crawl-pages-and-how-does-it-work' target='_blank' rel='noopener noreferrer'>our help center</a></p>
   * @return maxCrawlPages
   */
  @javax.annotation.Nullable
  public Integer getMaxCrawlPages() {
    return maxCrawlPages;
  }

  public void setMaxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
  }


  public static final String SERIALIZED_NAME_SEARCH_PARAM = "search_param";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARAM)
  private String searchParam;

  public SerpGoogleOrganicLiveAdvancedRequestInfo searchParam(String searchParam) {
    this.searchParam = searchParam;
    return this;
  }

  /**
   * <p><em>additional parameters of the search query</em><p>optional field<p><a href='https://dataforseo.com/help-center/google-search-engine-parameters-and-how-to-use-them'>get the list of available parameters and additional details here</a></p><br><strong>Note:</strong> the following search engine parameters are not supported and will be automatically unset if specified: <code>lr</code>, <code>cr</code>, <code>as_qdr</code>, <code>as_sitesearch</code>, <code>as_occt</code>, <code>as_filetype</code>.
   * @return searchParam
   */
  @javax.annotation.Nullable
  public String getSearchParam() {
    return searchParam;
  }

  public void setSearchParam(String searchParam) {
    this.searchParam = searchParam;
  }


  public static final String SERIALIZED_NAME_REMOVE_FROM_URL = "remove_from_url";
  @SerializedName(SERIALIZED_NAME_REMOVE_FROM_URL)
  private List<String> removeFromUrl;

  public SerpGoogleOrganicLiveAdvancedRequestInfo removeFromUrl(List<String> removeFromUrl) {
    this.removeFromUrl = removeFromUrl;
    return this;
  }

  /**
   * <p><em>remove specific parameters from URLs</em><p>optional field<p>using this field, you can specify up to 10 parameters to remove from URLs in the result<p>example:<p><code>'remove_from_url': ['srsltid']</code><p><strong>Note:</strong> if the <code>target</code> field is specified, the specified URL parameters will be removed before the search</p>
   * @return removeFromUrl
   */
  @javax.annotation.Nullable
  public List<String> getRemoveFromUrl() {
    return removeFromUrl;
  }

  public void setRemoveFromUrl(List<String> removeFromUrl) {
    this.removeFromUrl = removeFromUrl;
  }


  public static final String SERIALIZED_NAME_PEOPLE_ALSO_ASK_CLICK_DEPTH = "people_also_ask_click_depth";
  @SerializedName(SERIALIZED_NAME_PEOPLE_ALSO_ASK_CLICK_DEPTH)
  private Integer peopleAlsoAskClickDepth;

  public SerpGoogleOrganicLiveAdvancedRequestInfo peopleAlsoAskClickDepth(Integer peopleAlsoAskClickDepth) {
    this.peopleAlsoAskClickDepth = peopleAlsoAskClickDepth;
    return this;
  }

  /**
   * <p><em>clicks on the corresponding element</em><p>optional field<p>specify the click depth on the <code>people_also_ask</code> element to get additional <code>people_also_ask_element</code> items;<p><strong>Note</strong> your account will be billed $0.00015 extra for each click;<p>if the element is absent or we perform fewer clicks than you specified, all extra charges will be returned to your account balance<p>possible values: from <code>1</code> to <code>4</code></p>
   * @return peopleAlsoAskClickDepth
   */
  @javax.annotation.Nullable
  public Integer getPeopleAlsoAskClickDepth() {
    return peopleAlsoAskClickDepth;
  }

  public void setPeopleAlsoAskClickDepth(Integer peopleAlsoAskClickDepth) {
    this.peopleAlsoAskClickDepth = peopleAlsoAskClickDepth;
  }


  public static final String SERIALIZED_NAME_GROUP_ORGANIC_RESULTS = "group_organic_results";
  @SerializedName(SERIALIZED_NAME_GROUP_ORGANIC_RESULTS)
  private Boolean groupOrganicResults;

  public SerpGoogleOrganicLiveAdvancedRequestInfo groupOrganicResults(Boolean groupOrganicResults) {
    this.groupOrganicResults = groupOrganicResults;
    return this;
  }

  /**
   * <p><em>display related results</em><p>optional field<p>if set to <code>true</code>, the <code>related_result</code> element in the response will be provided as a snippet of its parent organic result;<p>if set to <code>false</code>, the <code>related_result</code> element will be provided as a separate organic result;<p>default value: <code>true</code></p>
   * @return groupOrganicResults
   */
  @javax.annotation.Nullable
  public Boolean getGroupOrganicResults() {
    return groupOrganicResults;
  }

  public void setGroupOrganicResults(Boolean groupOrganicResults) {
    this.groupOrganicResults = groupOrganicResults;
  }


  public static final String SERIALIZED_NAME_CALCULATE_RECTANGLES = "calculate_rectangles";
  @SerializedName(SERIALIZED_NAME_CALCULATE_RECTANGLES)
  private Boolean calculateRectangles;

  public SerpGoogleOrganicLiveAdvancedRequestInfo calculateRectangles(Boolean calculateRectangles) {
    this.calculateRectangles = calculateRectangles;
    return this;
  }

  /**
   * <p><em>calcualte pixel rankings for SERP elements in advanced results</em><p>optional field<p>pixel ranking refers to the distance between the result snippet and top left corner of the screen;<p><a href='https://dataforseo.com/help-center/pixel-ranking-in-serp-api'>Visit Help Center to learn more>></a><p>by default, the parameter is set to <code>false</code>;<p><strong>Note:</strong> you will be charged extra $0.002 for using this parameter</p>
   * @return calculateRectangles
   */
  @javax.annotation.Nullable
  public Boolean getCalculateRectangles() {
    return calculateRectangles;
  }

  public void setCalculateRectangles(Boolean calculateRectangles) {
    this.calculateRectangles = calculateRectangles;
  }


  public static final String SERIALIZED_NAME_BROWSER_SCREEN_WIDTH = "browser_screen_width";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_WIDTH)
  private Long browserScreenWidth;

  public SerpGoogleOrganicLiveAdvancedRequestInfo browserScreenWidth(Long browserScreenWidth) {
    this.browserScreenWidth = browserScreenWidth;
    return this;
  }

  /**
   * <p><em>browser screen width</em><p>optional field<p>you can set a custom browser screen width to calculate pixel rankings for a particular device;<p>can be specified within the following range: <code>240-9999</code>;<p>by default, the parameter is set to:<p><code>1920</code> for <code>desktop</code>;<p><code>360</code> for <code>mobile</code> on <code>android</code>;<p><code>375</code> for <code>mobile</code> on <code>iOS</code>;<p><strong>Note:</strong> to use this parameter, set <code>calculate_rectangles</code> to <code>true</code></p>
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

  public SerpGoogleOrganicLiveAdvancedRequestInfo browserScreenHeight(Integer browserScreenHeight) {
    this.browserScreenHeight = browserScreenHeight;
    return this;
  }

  /**
   * <p><em>browser screen height</em><p>optional field<p>you can set a custom browser screen height to calculate pixel rankings for a particular device;<p>can be specified within the following range: <code>240-9999</code>;<p>by default, the parameter is set to:<p><code>1080</code> for <code>desktop</code>;<p><code>640</code> for <code>mobile</code> on <code>android</code>;<p><code>812</code> for <code>mobile</code> on <code>iOS</code>;<p><strong>Note:</strong> to use this parameter, set <code>calculate_rectangles</code> to <code>true</code></p>
   * @return browserScreenHeight
   */
  @javax.annotation.Nullable
  public Integer getBrowserScreenHeight() {
    return browserScreenHeight;
  }

  public void setBrowserScreenHeight(Integer browserScreenHeight) {
    this.browserScreenHeight = browserScreenHeight;
  }


  public static final String SERIALIZED_NAME_BROWSER_SCREEN_RESOLUTION_RATIO = "browser_screen_resolution_ratio";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_RESOLUTION_RATIO)
  private Integer browserScreenResolutionRatio;

  public SerpGoogleOrganicLiveAdvancedRequestInfo browserScreenResolutionRatio(Integer browserScreenResolutionRatio) {
    this.browserScreenResolutionRatio = browserScreenResolutionRatio;
    return this;
  }

  /**
   * <p><em>browser screen resolution ratio</em><p>optional field<p>you can set a custom browser screen resolution ratio to calculate pixel rankings for a particular device;<p>can be specified within the following range: <code>0.5-3</code>;<p>by default, the parameter is set to:<p><code>1</code> for <code>desktop</code>;<p><code>3</code> for <code>mobile</code> on <code>android</code>;<p><code>3</code> for <code>mobile</code> on <code>iOS</code>;<p><strong>Note:</strong> to use this parameter, set <code>calculate_rectangles</code> to <code>true</code></p>
   * @return browserScreenResolutionRatio
   */
  @javax.annotation.Nullable
  public Integer getBrowserScreenResolutionRatio() {
    return browserScreenResolutionRatio;
  }

  public void setBrowserScreenResolutionRatio(Integer browserScreenResolutionRatio) {
    this.browserScreenResolutionRatio = browserScreenResolutionRatio;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public SerpGoogleOrganicLiveAdvancedRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p><em>direct URL of the search query</em><p>optional field<p>you can specify a direct URL and we will sort it out to the necessary fields. Note that this method is the most difficult for our API to process and also requires you to specify the exact language and location in the URL. In most cases, we wouldn’t recommend using this method.<p>example:<p><code class='long-string'>https://www.google.co.uk/search?q=%20rank%20tracker%20api&hl=en&gl=GB&uule=w+CAIQIFISCXXeIa8LoNhHEZkq1d1aOpZS</code></p><br><strong>Note:</strong> the following search engine parameters are not supported and will be automatically unset if specified in the URL: <code>lr</code>, <code>cr</code>, <code>as_qdr</code>, <code>as_sitesearch</code>, <code>as_occt</code>, <code>as_filetype</code>.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_LOCATION_COORDINATE = "location_coordinate";
  @SerializedName(SERIALIZED_NAME_LOCATION_COORDINATE)
  private String locationCoordinate;

  public SerpGoogleOrganicLiveAdvancedRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <p><em>GPS coordinates of a location</em><p>optional field if you specify <code>location_name</code> or <code>location_code</code><p><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_code</code></strong><p><code>location_coordinate</code> parameter should be specified in the <em>'latitude,longitude,radius'</em> format<p>the maximum number of decimal digits for <em>'latitude'</em> and <em>'longitude'</em>: 7<p>the minimum value for <em>'radius'</em>: 199 (mm)<p>the maximum value for <em>'radius'</em>: 199999 (mm)<p>example:<p><code class='long-string'>53.476225,-2.243572,200</code></p>
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }


  public static final String SERIALIZED_NAME_SE_DOMAIN = "se_domain";
  @SerializedName(SERIALIZED_NAME_SE_DOMAIN)
  private String seDomain;

  public SerpGoogleOrganicLiveAdvancedRequestInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * <p><em>search engine domain</em><p>optional field<p>we choose the relevant search engine domain automatically according to the location and language you specify<p>however, you can set a custom search engine domain in this field<p>example:<p><em>google.co.uk</em>, <code><code></code></code><em>google.com.au</em>, <code><code></code></code><em>google.de</em>, etc.</p>
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public SerpGoogleOrganicLiveAdvancedRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <p><em>target domain, subdomain, or webpage to get results for</em><p>optional field<p>a domain or a subdomain should be specified without <code>https://</code> and <code>www.</code><p>note that the results of <code>target</code>-specific tasks will only include SERP elements that contain a <code>url</code> string;<p>you can also use a wildcard (‘*’) character to specify the search pattern in SERP and narrow down the results;<p>examples:<p><strong><code class='long-string'>example.com</code></strong> - returns results for the website's home page with URLs, such as <code class='long-string'>https://example.com</code>, or <code class='long-string'>https://www.example.com/</code>, or <code class='long-string'>https://example.com/</code>;<p><strong><code class='long-string'>example.com*</code></strong> - returns results for the domain, including all its pages;<p><strong><code class='long-string'>*example.com*</code></strong> - returns results for the entire domain, including all its pages and subdomains;<p><strong><code class='long-string'>*example.com</code></strong> - returns results for the home page regardless of the subdomain, such as <code class='long-string'>https://en.example.com</code>;<p><strong><code class='long-string'>example.com/example-page</code></strong> - returns results for the exact URL;<p><strong><code class='long-string'>example.com/example-page*</code></strong> - returns results for all domain's URLs that start with the specified string</p>
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_TARGET_SEARCH_MODE = "target_search_mode";
  @SerializedName(SERIALIZED_NAME_TARGET_SEARCH_MODE)
  private String targetSearchMode;

  public SerpGoogleOrganicLiveAdvancedRequestInfo targetSearchMode(String targetSearchMode) {
    this.targetSearchMode = targetSearchMode;
    return this;
  }

  /**
   * <p><em>target matching mode</em><p>optional field<p>to enable this parameter, <code>stop_crawl_on_match</code> must also be enabled<p>defines how the crawl should stop when multiple targets are specified in <code>stop_crawl_on_match</code><p>possible values: <code>all</code>, <code>any</code><p><code>all</code> – the crawl stops only when all specified targets are found<p><code>any</code> – the crawl stops when any single target is found<p>default value: <code>any</code><p>learn more about this parameter on our <a href='https://dataforseo.com/help-center/how-to-use-new-crawl-control-parameters-in-google-organic-serp-api' target='_blank'>Help Center</a></p>
   * @return targetSearchMode
   */
  @javax.annotation.Nullable
  public String getTargetSearchMode() {
    return targetSearchMode;
  }

  public void setTargetSearchMode(String targetSearchMode) {
    this.targetSearchMode = targetSearchMode;
  }


  public static final String SERIALIZED_NAME_FIND_TARGETS_IN = "find_targets_in";
  @SerializedName(SERIALIZED_NAME_FIND_TARGETS_IN)
  private List<String> findTargetsIn;

  public SerpGoogleOrganicLiveAdvancedRequestInfo findTargetsIn(List<String> findTargetsIn) {
    this.findTargetsIn = findTargetsIn;
    return this;
  }

  /**
   * <p><em>SERP element types to check for targets</em><p>optional field<p>to enable this parameter, <code>stop_crawl_on_match</code> must also be enabled<p>specifies which SERP element types should be checked for target matches<p>if not specified, all first-level elements with <code>url</code> and <code>domain</code> fields are checked for targets<p>possible values: <code>organic</code>, <code>paid</code>, <code>local_pack</code>, <code>featured_snippet</code>, <code>events</code>, <code>google_flights</code>, <code>images</code>, <code>jobs</code>, <code>knowledge_graph</code>, <code>local_service</code>, <code>map</code>, <code>scholarly_articles</code>, <code>third_party_reviews</code>, <code>twitter</code><p><strong>Note:</strong> cannot contain the same element types as <code>ignore_targets_in</code><p>example:<p><code>'find_targets_in': ['organic', 'featured_snippet']</code><p>learn more about this parameter on our <a href='https://dataforseo.com/help-center/how-to-use-new-crawl-control-parameters-in-google-organic-serp-api' target='_blank'>Help Center</a></p>
   * @return findTargetsIn
   */
  @javax.annotation.Nullable
  public List<String> getFindTargetsIn() {
    return findTargetsIn;
  }

  public void setFindTargetsIn(List<String> findTargetsIn) {
    this.findTargetsIn = findTargetsIn;
  }


  public static final String SERIALIZED_NAME_IGNORE_TARGETS_IN = "ignore_targets_in";
  @SerializedName(SERIALIZED_NAME_IGNORE_TARGETS_IN)
  private List<String> ignoreTargetsIn;

  public SerpGoogleOrganicLiveAdvancedRequestInfo ignoreTargetsIn(List<String> ignoreTargetsIn) {
    this.ignoreTargetsIn = ignoreTargetsIn;
    return this;
  }

  /**
   * <p><em>SERP element types to exclude from target search</em><p>optional field<p>to enable this parameter, <code>stop_crawl_on_match</code> must also be enabled<p>specifies which SERP element types should be excluded when searching for target matches<p>possible values: <code>organic</code>, <code>paid</code>, <code>local_pack</code>, <code>featured_snippet</code>, <code>events</code>, <code>google_flights</code>, <code>images</code>, <code>jobs</code>, <code>knowledge_graph</code>, <code>local_service</code>, <code>map</code>, <code>scholarly_articles</code>, <code>third_party_reviews</code>, <code>twitter</code><p><strong>Note:</strong> cannot contain the same element types as <code>find_targets_in</code><p>example:<p><code>'ignore_targets_in': ['paid', 'images']</code><p>learn more about this parameter on our <a href='https://dataforseo.com/help-center/how-to-use-new-crawl-control-parameters-in-google-organic-serp-api' target='_blank'>Help Center</a></p>
   * @return ignoreTargetsIn
   */
  @javax.annotation.Nullable
  public List<String> getIgnoreTargetsIn() {
    return ignoreTargetsIn;
  }

  public void setIgnoreTargetsIn(List<String> ignoreTargetsIn) {
    this.ignoreTargetsIn = ignoreTargetsIn;
  }



  public SerpGoogleOrganicLiveAdvancedRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpGoogleOrganicLiveAdvancedRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpGoogleOrganicLiveAdvancedRequestInfo serpGoogleOrganicLiveAdvancedRequestInfo = (SerpGoogleOrganicLiveAdvancedRequestInfo) o;
    return

        Objects.equals(this.keyword, serpGoogleOrganicLiveAdvancedRequestInfo.keyword) &&
        Objects.equals(this.locationCode, serpGoogleOrganicLiveAdvancedRequestInfo.locationCode) &&
        Objects.equals(this.languageCode, serpGoogleOrganicLiveAdvancedRequestInfo.languageCode) &&
        Objects.equals(this.depth, serpGoogleOrganicLiveAdvancedRequestInfo.depth) &&
        Objects.equals(this.device, serpGoogleOrganicLiveAdvancedRequestInfo.device) &&
        Objects.equals(this.loadAsyncAiOverview, serpGoogleOrganicLiveAdvancedRequestInfo.loadAsyncAiOverview) &&
        Objects.equals(this.locationName, serpGoogleOrganicLiveAdvancedRequestInfo.locationName) &&
        Objects.equals(this.languageName, serpGoogleOrganicLiveAdvancedRequestInfo.languageName) &&
        Objects.equals(this.os, serpGoogleOrganicLiveAdvancedRequestInfo.os) &&
        Objects.equals(this.tag, serpGoogleOrganicLiveAdvancedRequestInfo.tag) &&
        Objects.equals(this.stopCrawlOnMatch, serpGoogleOrganicLiveAdvancedRequestInfo.stopCrawlOnMatch) &&
        Objects.equals(this.matchType, serpGoogleOrganicLiveAdvancedRequestInfo.matchType) &&
        Objects.equals(this.matchValue, serpGoogleOrganicLiveAdvancedRequestInfo.matchValue) &&
        Objects.equals(this.maxCrawlPages, serpGoogleOrganicLiveAdvancedRequestInfo.maxCrawlPages) &&
        Objects.equals(this.searchParam, serpGoogleOrganicLiveAdvancedRequestInfo.searchParam) &&
        Objects.equals(this.removeFromUrl, serpGoogleOrganicLiveAdvancedRequestInfo.removeFromUrl) &&
        Objects.equals(this.peopleAlsoAskClickDepth, serpGoogleOrganicLiveAdvancedRequestInfo.peopleAlsoAskClickDepth) &&
        Objects.equals(this.groupOrganicResults, serpGoogleOrganicLiveAdvancedRequestInfo.groupOrganicResults) &&
        Objects.equals(this.calculateRectangles, serpGoogleOrganicLiveAdvancedRequestInfo.calculateRectangles) &&
        Objects.equals(this.browserScreenWidth, serpGoogleOrganicLiveAdvancedRequestInfo.browserScreenWidth) &&
        Objects.equals(this.browserScreenHeight, serpGoogleOrganicLiveAdvancedRequestInfo.browserScreenHeight) &&
        Objects.equals(this.browserScreenResolutionRatio, serpGoogleOrganicLiveAdvancedRequestInfo.browserScreenResolutionRatio) &&
        Objects.equals(this.url, serpGoogleOrganicLiveAdvancedRequestInfo.url) &&
        Objects.equals(this.locationCoordinate, serpGoogleOrganicLiveAdvancedRequestInfo.locationCoordinate) &&
        Objects.equals(this.seDomain, serpGoogleOrganicLiveAdvancedRequestInfo.seDomain) &&
        Objects.equals(this.target, serpGoogleOrganicLiveAdvancedRequestInfo.target) &&
        Objects.equals(this.targetSearchMode, serpGoogleOrganicLiveAdvancedRequestInfo.targetSearchMode) &&
        Objects.equals(this.findTargetsIn, serpGoogleOrganicLiveAdvancedRequestInfo.findTargetsIn) &&
        Objects.equals(this.ignoreTargetsIn, serpGoogleOrganicLiveAdvancedRequestInfo.ignoreTargetsIn);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, locationCode, languageCode, depth, device, loadAsyncAiOverview, locationName, languageName, os, tag, stopCrawlOnMatch, matchType, matchValue, maxCrawlPages, searchParam, removeFromUrl, peopleAlsoAskClickDepth, groupOrganicResults, calculateRectangles, browserScreenWidth, browserScreenHeight, browserScreenResolutionRatio, url, locationCoordinate, seDomain, target, targetSearchMode, findTargetsIn, ignoreTargetsIn);
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
    sb.append("class SerpGoogleOrganicLiveAdvancedRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    loadAsyncAiOverview: ").append(toIndentedString(loadAsyncAiOverview)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    stopCrawlOnMatch: ").append(toIndentedString(stopCrawlOnMatch)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
    sb.append("    maxCrawlPages: ").append(toIndentedString(maxCrawlPages)).append("\n");
    sb.append("    searchParam: ").append(toIndentedString(searchParam)).append("\n");
    sb.append("    removeFromUrl: ").append(toIndentedString(removeFromUrl)).append("\n");
    sb.append("    peopleAlsoAskClickDepth: ").append(toIndentedString(peopleAlsoAskClickDepth)).append("\n");
    sb.append("    groupOrganicResults: ").append(toIndentedString(groupOrganicResults)).append("\n");
    sb.append("    calculateRectangles: ").append(toIndentedString(calculateRectangles)).append("\n");
    sb.append("    browserScreenWidth: ").append(toIndentedString(browserScreenWidth)).append("\n");
    sb.append("    browserScreenHeight: ").append(toIndentedString(browserScreenHeight)).append("\n");
    sb.append("    browserScreenResolutionRatio: ").append(toIndentedString(browserScreenResolutionRatio)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetSearchMode: ").append(toIndentedString(targetSearchMode)).append("\n");
    sb.append("    findTargetsIn: ").append(toIndentedString(findTargetsIn)).append("\n");
    sb.append("    ignoreTargetsIn: ").append(toIndentedString(ignoreTargetsIn)).append("\n");
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
    
    openapiFields.add("keyword");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_code");
    
    openapiFields.add("depth");
    
    openapiFields.add("device");
    
    openapiFields.add("load_async_ai_overview");
    
    openapiFields.add("location_name");
    
    openapiFields.add("language_name");
    
    openapiFields.add("os");
    
    openapiFields.add("tag");
    
    openapiFields.add("stop_crawl_on_match");
    
    openapiFields.add("match_type");
    
    openapiFields.add("match_value");
    
    openapiFields.add("max_crawl_pages");
    
    openapiFields.add("search_param");
    
    openapiFields.add("remove_from_url");
    
    openapiFields.add("people_also_ask_click_depth");
    
    openapiFields.add("group_organic_results");
    
    openapiFields.add("calculate_rectangles");
    
    openapiFields.add("browser_screen_width");
    
    openapiFields.add("browser_screen_height");
    
    openapiFields.add("browser_screen_resolution_ratio");
    
    openapiFields.add("url");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("target");
    
    openapiFields.add("target_search_mode");
    
    openapiFields.add("find_targets_in");
    
    openapiFields.add("ignore_targets_in");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpGoogleOrganicLiveAdvancedRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpGoogleOrganicLiveAdvancedRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpGoogleOrganicLiveAdvancedRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpGoogleOrganicLiveAdvancedRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpGoogleOrganicLiveAdvancedRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpGoogleOrganicLiveAdvancedRequestInfo>() {
           @Override
           public void write(JsonWriter out, SerpGoogleOrganicLiveAdvancedRequestInfo value) throws IOException {
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
           public SerpGoogleOrganicLiveAdvancedRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpGoogleOrganicLiveAdvancedRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpGoogleOrganicLiveAdvancedRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpGoogleOrganicLiveAdvancedRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
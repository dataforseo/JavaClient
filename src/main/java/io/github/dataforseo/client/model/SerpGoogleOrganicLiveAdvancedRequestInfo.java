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
   * keyword
* required field
* you can specify up to 700 characters in the keyword field
* all %## will be decoded (plus character ‘+’ will be decoded to a space character)
* if you need to use the “%” character for your keyword, please specify it as “%25”;
* if you need to use the “+” character for your keyword, please specify it as “%2B”;
* if this field contains such parameters as ‘allinanchor:’, ‘allintext:’, ‘allintitle:’, ‘allinurl:’, ‘define:’, ‘definition:’, ‘filetype:’, ‘id:’, ‘inanchor:’, ‘info:’, ‘intext:’, ‘intitle:’, ‘inurl:’, ‘link:’, ‘site:’, the charge per task will be multiplied by 5
* Note: queries containing the ‘cache:’ parameter are not supported and will return a validation errorlearn more about rules and limitations of keyword and keywords fields in DataForSEO APIs in this Help Center article
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public SerpGoogleOrganicLiveAdvancedRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * direct URL of the search query
* optional field
* you can specify a direct URL and we will sort it out to the necessary fields. Note that this method is the most difficult for our API to process and also requires you to specify the exact language and location in the URL. In most cases, we wouldn’t recommend using this method.
* example:
* https://www.google.co.uk/search?q=%20rank%20tracker%20api&hl=en&gl=GB&uule=w+CAIQIFISCXXeIa8LoNhHEZkq1d1aOpZS
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public SerpGoogleOrganicLiveAdvancedRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * parsing depth
* optional field
* number of results in SERP
* default value: 10
* max value: 200
* Your account will be billed per each SERP containing up to 10 results;
* Setting depth above 10 may result in additional charges if the search engine returns more than 10 results;
* The cost can be calculated on the Pricing page.
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_MAX_CRAWL_PAGES = "max_crawl_pages";
  @SerializedName(SERIALIZED_NAME_MAX_CRAWL_PAGES)
  private Integer maxCrawlPages;

  public SerpGoogleOrganicLiveAdvancedRequestInfo maxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
    return this;
  }

  /**
   * page crawl limit
* optional field
* number of search results pages to crawl
* max value: 100
* Note: you will be charged for each page crawled (10 organic results per page);
* learn more about pricing on our Pricing page;
* Note#2: the max_crawl_pages and depth parameters complement each other;
* learn more at our help center
   * @return maxCrawlPages
   */
  @javax.annotation.Nullable
  public Integer getMaxCrawlPages() {
    return maxCrawlPages;
  }

  public void setMaxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public SerpGoogleOrganicLiveAdvancedRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of search engine location
* required field if you don’t specify location_code or location_coordinate
* if you use this field, you don’t need to specify location_code or location_coordinate
* you can receive the list of available locations of the search engine with their location_name by making a separate request to the https://api.dataforseo.com/v3/serp/google/locations
* example:
* London,England,United Kingdom
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public SerpGoogleOrganicLiveAdvancedRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * search engine location code
* required field if you don’t specify location_name or location_coordinate
* if you use this field, you don’t need to specify location_name or location_coordinate
* you can receive the list of available locations of the search engines with their location_code by making a separate request to the https://api.dataforseo.com/v3/serp/google/locations
* example:
* 2840
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LOCATION_COORDINATE = "location_coordinate";
  @SerializedName(SERIALIZED_NAME_LOCATION_COORDINATE)
  private String locationCoordinate;

  public SerpGoogleOrganicLiveAdvancedRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * GPS coordinates of a location
* optional field if you specify location_name or location_code
* if you use this field, you don’t need to specify location_name or location_code
* location_coordinate parameter should be specified in the “latitude,longitude,radius” format
* the maximum number of decimal digits for “latitude” and “longitude”: 7
* the minimum value for “radius”: 199.9 (mm)
* the maximum value for “radius”: 199999 (mm)
* example:
* 53.476225,-2.243572,200
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public SerpGoogleOrganicLiveAdvancedRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of search engine language
* optional field if you specify language_code
* if you use this field, you don’t need to specify language_code
* you can receive the list of available languages of the search engine with their language_name by making a separate request to the https://api.dataforseo.com/v3/serp/google/languages
* example:
* English
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public SerpGoogleOrganicLiveAdvancedRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * search engine language code
* optional field if you specify language_name
* if you use this field, you don’t need to specify language_name
* you can receive the list of available languages of the search engine with their language_code by making a separate request to the https://api.dataforseo.com/v3/serp/google/languages
* example:
* en
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_SE_DOMAIN = "se_domain";
  @SerializedName(SERIALIZED_NAME_SE_DOMAIN)
  private String seDomain;

  public SerpGoogleOrganicLiveAdvancedRequestInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * search engine domain
* optional field
* we choose the relevant search engine domain automatically according to the location and language you specify
* however, you can set a custom search engine domain in this field
* example:
* google.co.uk, google.com.au, google.de, etc.
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public SerpGoogleOrganicLiveAdvancedRequestInfo device(String device) {
    this.device = device;
    return this;
  }

  /**
   * device type
* optional field
* can take the values:desktop, mobile
* default value: desktop
   * @return device
   */
  @javax.annotation.Nullable
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }


  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public SerpGoogleOrganicLiveAdvancedRequestInfo os(String os) {
    this.os = os;
    return this;
  }

  /**
   * device operating system
* optional field
* if you specify desktop in the device field, choose from the following values: windows, macos
* default value: windows
* if you specify mobile in the device field, choose from the following values: android, ios
* default value: android
   * @return os
   */
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public SerpGoogleOrganicLiveAdvancedRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * target domain, subdomain, or webpage to get results for
* optional field
* a domain or a subdomain should be specified without https:// and www.
* note that the results of target-specific tasks will only include SERP elements that contain a url string;
* you can also use a wildcard (‘*’) character to specify the search pattern in SERP and narrow down the results;
* examples:
* example.com – returns results for the website’s home page with URLs, such as https://example.com, or https://www.example.com/, or https://example.com/;
* example.com* – returns results for the domain, including all its pages;
* *example.com* – returns results for the entire domain, including all its pages and subdomains;
* *example.com – returns results for the home page regardless of the subdomain, such as https://en.example.com;
* example.com/example-page – returns results for the exact URL;
* example.com/example-page* – returns results for all domain’s URLs that start with the specified string
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
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


  public static final String SERIALIZED_NAME_MATCH_VALUE = "match_value";
  @SerializedName(SERIALIZED_NAME_MATCH_VALUE)
  private String matchValue;

  public SerpGoogleOrganicLiveAdvancedRequestInfo matchValue(String matchValue) {
    this.matchValue = matchValue;
    return this;
  }

  /**
   * array of targets to stop crawling
* required field if stop_crawl_on_match is specified;
* specify a target domain or wildcard value;
* Note: domain name must be specified without a request protocol;
* example: dataforseo.com
   * @return matchValue
   */
  @javax.annotation.Nullable
  public String getMatchValue() {
    return matchValue;
  }

  public void setMatchValue(String matchValue) {
    this.matchValue = matchValue;
  }


  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private List<String> matchType;

  public SerpGoogleOrganicLiveAdvancedRequestInfo matchType(List<String> matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * array of targets to stop crawling
* required field if stop_crawl_on_match is specified;
* type of match for the match_value
* possible values: domain, with_subdomains, wildcard
   * @return matchType
   */
  @javax.annotation.Nullable
  public List<String> getMatchType() {
    return matchType;
  }

  public void setMatchType(List<String> matchType) {
    this.matchType = matchType;
  }


  public static final String SERIALIZED_NAME_GROUP_ORGANIC_RESULTS = "group_organic_results";
  @SerializedName(SERIALIZED_NAME_GROUP_ORGANIC_RESULTS)
  private Boolean groupOrganicResults;

  public SerpGoogleOrganicLiveAdvancedRequestInfo groupOrganicResults(Boolean groupOrganicResults) {
    this.groupOrganicResults = groupOrganicResults;
    return this;
  }

  /**
   * display related results
* optional field
* if set to true, the related_result element in the response will be provided as a snippet of its parent organic result;
* if set to false, the related_result element will be provided as a separate organic result;
* default value: true
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
   * calcualte pixel rankings for SERP elements in advanced results
* optional field
* pixel ranking refers to the distance between the result snippet and top left corner of the screen;
* Visit Help Center to learn more>>
* by default, the parameter is set to false;
* Note: you will be charged extra $0.002 for using this parameter
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
   * browser screen width
* optional field
* you can set a custom browser screen width to calculate pixel rankings for a particular device;
* by default, the parameter is set to:
* 1920 for desktop;
* 360 for mobile on android;
* 375 for mobile on iOS;
* Note: to use this parameter, set calculate_rectangles to true
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
   * browser screen height
* optional field
* you can set a custom browser screen height to calculate pixel rankings for a particular device;
* by default, the parameter is set to:
* 1080 for desktop;
* 640 for mobile on android;
* 812 for mobile on iOS;
* Note: to use this parameter, set calculate_rectangles to true
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
   * browser screen resolution ratio
* optional field
* you can set a custom browser screen resolution ratio to calculate pixel rankings for a particular device;
* possible values: from 1 to 3;
* by default, the parameter is set to:
* 1 for desktop;
* 3 for mobile on android;
* 3 for mobile on iOS;
* Note: to use this parameter, set calculate_rectangles to true
   * @return browserScreenResolutionRatio
   */
  @javax.annotation.Nullable
  public Integer getBrowserScreenResolutionRatio() {
    return browserScreenResolutionRatio;
  }

  public void setBrowserScreenResolutionRatio(Integer browserScreenResolutionRatio) {
    this.browserScreenResolutionRatio = browserScreenResolutionRatio;
  }


  public static final String SERIALIZED_NAME_PEOPLE_ALSO_ASK_CLICK_DEPTH = "people_also_ask_click_depth";
  @SerializedName(SERIALIZED_NAME_PEOPLE_ALSO_ASK_CLICK_DEPTH)
  private Integer peopleAlsoAskClickDepth;

  public SerpGoogleOrganicLiveAdvancedRequestInfo peopleAlsoAskClickDepth(Integer peopleAlsoAskClickDepth) {
    this.peopleAlsoAskClickDepth = peopleAlsoAskClickDepth;
    return this;
  }

  /**
   * clicks on the corresponding element
* optional field
* specify the click depth on the people_also_ask element to get additional people_also_ask_element items;
* Note your account will be billed $0.00015 extra for each click;
* if the element is absent or we perform fewer clicks than you specified, all extra charges will be returned to your account balance
* possible values: from 1 to 4
   * @return peopleAlsoAskClickDepth
   */
  @javax.annotation.Nullable
  public Integer getPeopleAlsoAskClickDepth() {
    return peopleAlsoAskClickDepth;
  }

  public void setPeopleAlsoAskClickDepth(Integer peopleAlsoAskClickDepth) {
    this.peopleAlsoAskClickDepth = peopleAlsoAskClickDepth;
  }


  public static final String SERIALIZED_NAME_LOAD_ASYNC_AI_OVERVIEW = "load_async_ai_overview";
  @SerializedName(SERIALIZED_NAME_LOAD_ASYNC_AI_OVERVIEW)
  private Boolean loadAsyncAiOverview;

  public SerpGoogleOrganicLiveAdvancedRequestInfo loadAsyncAiOverview(Boolean loadAsyncAiOverview) {
    this.loadAsyncAiOverview = loadAsyncAiOverview;
    return this;
  }

  /**
   * load asynchronous ai overview
* optional field
* set to true to obtain ai_overview items is SERPs even if they are loaded asynchronously;
* if set to false, you will only obtain ai_overview items from cache;
* default value: false
* Note: you will be charged extra $0.002 for using this parameter;
* if the element is absent or contains 'asynchronous_ai_overview': false, all extra charges will be returned to your account balance
   * @return loadAsyncAiOverview
   */
  @javax.annotation.Nullable
  public Boolean getLoadAsyncAiOverview() {
    return loadAsyncAiOverview;
  }

  public void setLoadAsyncAiOverview(Boolean loadAsyncAiOverview) {
    this.loadAsyncAiOverview = loadAsyncAiOverview;
  }


  public static final String SERIALIZED_NAME_SEARCH_PARAM = "search_param";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARAM)
  private String searchParam;

  public SerpGoogleOrganicLiveAdvancedRequestInfo searchParam(String searchParam) {
    this.searchParam = searchParam;
    return this;
  }

  /**
   * additional parameters of the search query
* optional field
* get the list of available parameters and additional details here
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
   * remove specific parameters from URLs
* optional field
* using this field, you can specify up to 10 parameters to remove from URLs in the result
* example:
* 'remove_from_url': ['srsltid']
* Note: if the target field is specified, the specified URL parameters will be removed before the search
   * @return removeFromUrl
   */
  @javax.annotation.Nullable
  public List<String> getRemoveFromUrl() {
    return removeFromUrl;
  }

  public void setRemoveFromUrl(List<String> removeFromUrl) {
    this.removeFromUrl = removeFromUrl;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public SerpGoogleOrganicLiveAdvancedRequestInfo tag(String tag) {
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
        Objects.equals(this.url, serpGoogleOrganicLiveAdvancedRequestInfo.url) &&
        Objects.equals(this.depth, serpGoogleOrganicLiveAdvancedRequestInfo.depth) &&
        Objects.equals(this.maxCrawlPages, serpGoogleOrganicLiveAdvancedRequestInfo.maxCrawlPages) &&
        Objects.equals(this.locationName, serpGoogleOrganicLiveAdvancedRequestInfo.locationName) &&
        Objects.equals(this.locationCode, serpGoogleOrganicLiveAdvancedRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, serpGoogleOrganicLiveAdvancedRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, serpGoogleOrganicLiveAdvancedRequestInfo.languageName) &&
        Objects.equals(this.languageCode, serpGoogleOrganicLiveAdvancedRequestInfo.languageCode) &&
        Objects.equals(this.seDomain, serpGoogleOrganicLiveAdvancedRequestInfo.seDomain) &&
        Objects.equals(this.device, serpGoogleOrganicLiveAdvancedRequestInfo.device) &&
        Objects.equals(this.os, serpGoogleOrganicLiveAdvancedRequestInfo.os) &&
        Objects.equals(this.target, serpGoogleOrganicLiveAdvancedRequestInfo.target) &&
        Objects.equals(this.stopCrawlOnMatch, serpGoogleOrganicLiveAdvancedRequestInfo.stopCrawlOnMatch) &&
        Objects.equals(this.matchValue, serpGoogleOrganicLiveAdvancedRequestInfo.matchValue) &&
        Objects.equals(this.matchType, serpGoogleOrganicLiveAdvancedRequestInfo.matchType) &&
        Objects.equals(this.groupOrganicResults, serpGoogleOrganicLiveAdvancedRequestInfo.groupOrganicResults) &&
        Objects.equals(this.calculateRectangles, serpGoogleOrganicLiveAdvancedRequestInfo.calculateRectangles) &&
        Objects.equals(this.browserScreenWidth, serpGoogleOrganicLiveAdvancedRequestInfo.browserScreenWidth) &&
        Objects.equals(this.browserScreenHeight, serpGoogleOrganicLiveAdvancedRequestInfo.browserScreenHeight) &&
        Objects.equals(this.browserScreenResolutionRatio, serpGoogleOrganicLiveAdvancedRequestInfo.browserScreenResolutionRatio) &&
        Objects.equals(this.peopleAlsoAskClickDepth, serpGoogleOrganicLiveAdvancedRequestInfo.peopleAlsoAskClickDepth) &&
        Objects.equals(this.loadAsyncAiOverview, serpGoogleOrganicLiveAdvancedRequestInfo.loadAsyncAiOverview) &&
        Objects.equals(this.searchParam, serpGoogleOrganicLiveAdvancedRequestInfo.searchParam) &&
        Objects.equals(this.removeFromUrl, serpGoogleOrganicLiveAdvancedRequestInfo.removeFromUrl) &&
        Objects.equals(this.tag, serpGoogleOrganicLiveAdvancedRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, url, depth, maxCrawlPages, locationName, locationCode, locationCoordinate, languageName, languageCode, seDomain, device, os, target, stopCrawlOnMatch, matchValue, matchType, groupOrganicResults, calculateRectangles, browserScreenWidth, browserScreenHeight, browserScreenResolutionRatio, peopleAlsoAskClickDepth, loadAsyncAiOverview, searchParam, removeFromUrl, tag);
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
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    maxCrawlPages: ").append(toIndentedString(maxCrawlPages)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    stopCrawlOnMatch: ").append(toIndentedString(stopCrawlOnMatch)).append("\n");
    sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    groupOrganicResults: ").append(toIndentedString(groupOrganicResults)).append("\n");
    sb.append("    calculateRectangles: ").append(toIndentedString(calculateRectangles)).append("\n");
    sb.append("    browserScreenWidth: ").append(toIndentedString(browserScreenWidth)).append("\n");
    sb.append("    browserScreenHeight: ").append(toIndentedString(browserScreenHeight)).append("\n");
    sb.append("    browserScreenResolutionRatio: ").append(toIndentedString(browserScreenResolutionRatio)).append("\n");
    sb.append("    peopleAlsoAskClickDepth: ").append(toIndentedString(peopleAlsoAskClickDepth)).append("\n");
    sb.append("    loadAsyncAiOverview: ").append(toIndentedString(loadAsyncAiOverview)).append("\n");
    sb.append("    searchParam: ").append(toIndentedString(searchParam)).append("\n");
    sb.append("    removeFromUrl: ").append(toIndentedString(removeFromUrl)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    
    openapiFields.add("url");
    
    openapiFields.add("depth");
    
    openapiFields.add("max_crawl_pages");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("device");
    
    openapiFields.add("os");
    
    openapiFields.add("target");
    
    openapiFields.add("stop_crawl_on_match");
    
    openapiFields.add("match_value");
    
    openapiFields.add("match_type");
    
    openapiFields.add("group_organic_results");
    
    openapiFields.add("calculate_rectangles");
    
    openapiFields.add("browser_screen_width");
    
    openapiFields.add("browser_screen_height");
    
    openapiFields.add("browser_screen_resolution_ratio");
    
    openapiFields.add("people_also_ask_click_depth");
    
    openapiFields.add("load_async_ai_overview");
    
    openapiFields.add("search_param");
    
    openapiFields.add("remove_from_url");
    
    openapiFields.add("tag");
    

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
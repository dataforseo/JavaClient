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


public class SerpYahooOrganicLiveAdvancedRequestInfo  {


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public SerpYahooOrganicLiveAdvancedRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <em>direct URL of the search query</em><br>optional field<br>you can specify a direct URL and we will sort it out to the necessary fields. Note that this method is the most difficult for our API to process and also requires you to specify the exact language and location in the URL. In most cases, we wouldn’t recommend using this method.<br>example:<br><code class='long-string'>https://search.yahoo.com/search?p=rank+checker&n=100&vl=lang_en&vc=us&ei=UTF-8</code>
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public SerpYahooOrganicLiveAdvancedRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <em>keyword</em><br><strong>required field</strong><br>you can specify <strong>up to 700 characters</strong> in the <code>keyword</code> field<br><strong>all %## will be decoded (plus character '+' will be decoded to a space character)</strong><br>if you need to use the '%' character for your <code>keyword</code>, please specify it as '%25';<br>if you need to use the “+” character for your <code>keyword</code>, please specify it as “%2B”<p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a>
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public SerpYahooOrganicLiveAdvancedRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of search engine location</em><br><strong>required field if you don't specify</strong> <code>location_code</code> or <code>location_coordinate</code><br><strong>if you use this field, you don't need to specify <code>location_code</code> or <code>location_coordinate</code></strong><br>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/{{low_se_name}}/locations</code><br>example:<br><code class='long-string'>London,England,United Kingdom</code>
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

  public SerpYahooOrganicLiveAdvancedRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>search engine location code</em><br><strong>required field if you don't specify</strong> <code>location_name</code>_or <code>location_coordinate</code><br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_coordinate</code></strong><br>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/{{low_se_name}}/locations</code><br>example:<br><code class='long-string'>2840</code>n
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

  public SerpYahooOrganicLiveAdvancedRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <em>GPS coordinates of a location</em><br><strong>required field if you don't specify</strong> <code>location_name</code>_or <code>location_code</code><br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_code</code></strong><br><code>location_coordinate</code> parameter should be specified in the <em>'latitude,longitude,radius'</em> format<br>the maximum number of decimal digits for <em>'latitude'</em> and <em>'longitude'</em>: 7<br>the minimum value for <em>'radius'</em>: 199.9 (mm)<br>the maximum value for <em>'radius'</em>: 199999 (mm)<br>example:<br><code class='long-string'>53.476225,-2.243572,200</code>n
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

  public SerpYahooOrganicLiveAdvancedRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search engine language</em><br><strong>required field if you don't specify</strong> <code>language_code</code><br><strong>if you use this field, you don't need to specify <code>language_code</code></strong><br>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/{{low_se_name}}/languages</code><br>example:<br><code class='long-string'>English</code>
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

  public SerpYahooOrganicLiveAdvancedRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search engine language code</em><br><strong>required field if you don't specify</strong> <code>language_name</code><br><strong>if you use this field, you don't need to specify <code>language_name</code></strong><br>you can receive the list of available languages of the search engine with their <code>language_code</code>_by making a separate request to the <code>https://api.dataforseo.com/v3/serp/{{low_se_name}}/languages</code><em><br></em>example:<em><br></em><code class='long-string'>en</code>n
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public SerpYahooOrganicLiveAdvancedRequestInfo device(String device) {
    this.device = device;
    return this;
  }

  /**
   * <em>device type</em><br>optional field<br>return results for a specific device type<br>can take the values:<code>desktop</code>, <code>mobile</code><br>default value: <code>desktop</code>
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

  public SerpYahooOrganicLiveAdvancedRequestInfo os(String os) {
    this.os = os;
    return this;
  }

  /**
   * <em>device operating system</em><br>optional field<br>if you specify <code>desktop</code> in the <code>device</code> field, choose from the following values: <code>windows</code>, <code>macos</code><br>default value: <code>windows</code><br>if you specify <code>mobile</code> in the <code>device</code> field, choose from the following values: <code>android</code>, <code>ios</code><br>default value: <code>android</code>
   * @return os
   */
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public static final String SERIALIZED_NAME_SE_DOMAIN = "se_domain";
  @SerializedName(SERIALIZED_NAME_SE_DOMAIN)
  private String seDomain;

  public SerpYahooOrganicLiveAdvancedRequestInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * <em>search engine domain</em><br>optional field<br>we choose the relevant search engine domain automatically according to the location and language you specify<br>however, you can set a custom search engine domain in this field<br>example:<br><code>au.search.yahoo.com</code>, <code>uk.search.yahoo.com</code>, <code>ca.search.yahoo.com</code>, etc.
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public SerpYahooOrganicLiveAdvancedRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * <em>parsing depth</em><br>optional field<br>number of results in SERP<br>default value: <code>6</code><br>max value: <code>200</code><br><strong>Your account will be billed per each SERP;</strong> <br>Each Yahoo SERP can contain fewer than 10 results, so setting depth above the default value may result in additional charges <a href='https://dataforseo.com/help-center/how-many-results-scraped' rel='noopener noreferrer' target='_blank'></a>;<br>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/serp/yahoo-serp-api' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
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

  public SerpYahooOrganicLiveAdvancedRequestInfo maxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
    return this;
  }

  /**
   * <em>page crawl limit</em><br>optional field<br>number of search results pages to crawl<br>default value: <code>1</code><br>max value: <code>100</code><br><strong>Note:</strong> the <code>max_crawl_pages</code> and <code>depth</code> parameters complement each other;<br>learn more at <a href='https://dataforseo.com/help-center/what-is-max-crawl-pages-and-how-does-it-work' rel='noopener noreferrer' target='_blank'>our help center</a>
   * @return maxCrawlPages
   */
  @javax.annotation.Nullable
  public Integer getMaxCrawlPages() {
    return maxCrawlPages;
  }

  public void setMaxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
  }


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public SerpYahooOrganicLiveAdvancedRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <em>target domain, subdomain, or webpage to get results for</em><br>optional field<br>a domain or a subdomain should be specified without <code>https://</code> and <code>www.</code><br>note that the results of <code>target</code>-specific tasks will only include SERP elements that contain a <code>url</code> string;<br>you can also use a wildcard (‘*’) character to specify the search pattern in SERP and narrow down the results;<br>examples:<br><strong><code class='long-string'>example.com</code></strong>  - returns results for the website's home page with URLs, such as <code class='long-string'>https://example.com</code>, or <code class='long-string'>https://www.example.com/</code>, or <code class='long-string'>https://example.com/</code>;<br><strong><code class='long-string'>example.com*</code></strong> - returns results for the domain, including all its pages;<br><strong><code class='long-string'>*example.com*</code></strong> - returns results for the entire domain, including all its pages and subdomains;<br><strong><code class='long-string'>*example.com</code></strong>  - returns results for the home page regardless of the subdomain, such as <code class='long-string'>https://en.example.com</code>; <br><strong><code class='long-string'>example.com/example-page</code></strong>  - returns results for the exact URL;<br><strong><code class='long-string'>example.com/example-page*</code></strong>  - returns results for all domain's URLs that start with the specified string
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_SEARCH_PARAM = "search_param";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARAM)
  private String searchParam;

  public SerpYahooOrganicLiveAdvancedRequestInfo searchParam(String searchParam) {
    this.searchParam = searchParam;
    return this;
  }

  /**
   * <em>additional parameters of the search query</em><br>optional field<br><a href='https://dataforseo.com/help-center/yahoo-search-engine-parameters-and-how-to-use-them'>get the list of available parameters and additional details here</a>
   * @return searchParam
   */
  @javax.annotation.Nullable
  public String getSearchParam() {
    return searchParam;
  }

  public void setSearchParam(String searchParam) {
    this.searchParam = searchParam;
  }


  public static final String SERIALIZED_NAME_STOP_CRAWL_ON_MATCH = "stop_crawl_on_match";
  @SerializedName(SERIALIZED_NAME_STOP_CRAWL_ON_MATCH)
  private List<SerpApiStopCrawlOnMatchInfo> stopCrawlOnMatch;

  public SerpYahooOrganicLiveAdvancedRequestInfo stopCrawlOnMatch(List<SerpApiStopCrawlOnMatchInfo> stopCrawlOnMatch) {
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


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public SerpYahooOrganicLiveAdvancedRequestInfo tag(String tag) {
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



  public SerpYahooOrganicLiveAdvancedRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpYahooOrganicLiveAdvancedRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpYahooOrganicLiveAdvancedRequestInfo serpYahooOrganicLiveAdvancedRequestInfo = (SerpYahooOrganicLiveAdvancedRequestInfo) o;
    return

        Objects.equals(this.url, serpYahooOrganicLiveAdvancedRequestInfo.url) &&
        Objects.equals(this.keyword, serpYahooOrganicLiveAdvancedRequestInfo.keyword) &&
        Objects.equals(this.locationName, serpYahooOrganicLiveAdvancedRequestInfo.locationName) &&
        Objects.equals(this.locationCode, serpYahooOrganicLiveAdvancedRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, serpYahooOrganicLiveAdvancedRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, serpYahooOrganicLiveAdvancedRequestInfo.languageName) &&
        Objects.equals(this.languageCode, serpYahooOrganicLiveAdvancedRequestInfo.languageCode) &&
        Objects.equals(this.device, serpYahooOrganicLiveAdvancedRequestInfo.device) &&
        Objects.equals(this.os, serpYahooOrganicLiveAdvancedRequestInfo.os) &&
        Objects.equals(this.seDomain, serpYahooOrganicLiveAdvancedRequestInfo.seDomain) &&
        Objects.equals(this.depth, serpYahooOrganicLiveAdvancedRequestInfo.depth) &&
        Objects.equals(this.maxCrawlPages, serpYahooOrganicLiveAdvancedRequestInfo.maxCrawlPages) &&
        Objects.equals(this.target, serpYahooOrganicLiveAdvancedRequestInfo.target) &&
        Objects.equals(this.searchParam, serpYahooOrganicLiveAdvancedRequestInfo.searchParam) &&
        Objects.equals(this.stopCrawlOnMatch, serpYahooOrganicLiveAdvancedRequestInfo.stopCrawlOnMatch) &&
        Objects.equals(this.tag, serpYahooOrganicLiveAdvancedRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(url, keyword, locationName, locationCode, locationCoordinate, languageName, languageCode, device, os, seDomain, depth, maxCrawlPages, target, searchParam, stopCrawlOnMatch, tag);
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
    sb.append("class SerpYahooOrganicLiveAdvancedRequestInfo {\n");

    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    maxCrawlPages: ").append(toIndentedString(maxCrawlPages)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    searchParam: ").append(toIndentedString(searchParam)).append("\n");
    sb.append("    stopCrawlOnMatch: ").append(toIndentedString(stopCrawlOnMatch)).append("\n");
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
    
    openapiFields.add("url");
    
    openapiFields.add("keyword");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("device");
    
    openapiFields.add("os");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("depth");
    
    openapiFields.add("max_crawl_pages");
    
    openapiFields.add("target");
    
    openapiFields.add("search_param");
    
    openapiFields.add("stop_crawl_on_match");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpYahooOrganicLiveAdvancedRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpYahooOrganicLiveAdvancedRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpYahooOrganicLiveAdvancedRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpYahooOrganicLiveAdvancedRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpYahooOrganicLiveAdvancedRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpYahooOrganicLiveAdvancedRequestInfo>() {
           @Override
           public void write(JsonWriter out, SerpYahooOrganicLiveAdvancedRequestInfo value) throws IOException {
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
           public SerpYahooOrganicLiveAdvancedRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpYahooOrganicLiveAdvancedRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpYahooOrganicLiveAdvancedRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpYahooOrganicLiveAdvancedRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
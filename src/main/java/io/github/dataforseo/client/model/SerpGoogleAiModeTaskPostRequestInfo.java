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


public class SerpGoogleAiModeTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public SerpGoogleAiModeTaskPostRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <p><em>keyword</em><p><strong>required field</strong><p>you can specify <strong>up to 700 characters</strong> in the <code>keyword</code> field<p>all %## will be decoded (plus character ‘+’ will be decoded to a space character)<p>if you need to use the “%” character for your <code>keyword</code>, please specify it as “%25”;<p>if you need to use the “+” character for your <code>keyword</code>, please specify it as “%2B”</p><br><p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a></p>
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

  public SerpGoogleAiModeTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <p><em>search engine location code</em><p><strong>required field if you don't specify</strong> <code>location_name</code> or <code>location_coordinate</code><p><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_coordinate</code></strong><p>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/locations</code><p><strong>Note:</strong> check <a href='https://support.google.com/websearch/answer/16011537?hl=en&co=GENIE.Platform%3DAndroid#' target='_blank'> Google Search Help</a> for the list of countries where AI Mode is currently available</p>
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

  public SerpGoogleAiModeTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <p><em>search engine language code</em><p>required field if you don't specify <code>language_name</code>;<p>if you use this field, you don't need to specify <code>language_name</code>;<p>you can receive the list of available languages of the search engine with their <code>language_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/ai_mode/languages</code></p>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public SerpGoogleAiModeTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <p><em>task priority</em><p>optional field<p>can take the following values:<p>1 – normal execution priority (set by default)<p>2 – high execution priority</p><br>You will be additionally charged for the tasks with high execution priority.<p>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/serp/google-ai-mode-serp-api' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public SerpGoogleAiModeTaskPostRequestInfo device(String device) {
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


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public SerpGoogleAiModeTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * <p><em>notification URL of a completed task</em><p>optional field<p>when a task is completed we will notify you by GET request sent to the URL you have specified<p>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<p>example:<p><code>http://your-server.com/pingscript?id=$id</code><p><code>http://your-server.com/pingscript?id=$id&tag=$tag</code><p><strong>Note:</strong> special characters in <code>pingback_url</code> will be urlencoded;<p>i.a., the <code>#</code> character will be encoded into <code>%23</code></p><br><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a></p>
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public SerpGoogleAiModeTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * <p><em>URL for sending task results</em><p>optional field<p>once the task is completed, we will send a POST request with its results compressed in the <code>gzip</code> format to the <code>postback_url</code> you specified<p>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<p>example:<p><code>http://your-server.com/postbackscript?id=$id</code><p><code>http://your-server.com/postbackscript?id=$id&tag=$tag</code><p><strong>Note:</strong> special characters in <code>postback_url</code> will be urlencoded;<p>i.a., the <code>#</code> character will be encoded into <code>%23</code></p><br><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a></p>
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
  }


  public static final String SERIALIZED_NAME_POSTBACK_DATA = "postback_data";
  @SerializedName(SERIALIZED_NAME_POSTBACK_DATA)
  private String postbackData;

  public SerpGoogleAiModeTaskPostRequestInfo postbackData(String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * <p><em>postback_url datatype</em><p><strong>required field if you specify <code>postback_url</code></strong><p>corresponds to the function you used for setting a task<p>possible values:<p><code>advanced</code>, <code>html</code></p>
   * @return postbackData
   */
  @javax.annotation.Nullable
  public String getPostbackData() {
    return postbackData;
  }

  public void setPostbackData(String postbackData) {
    this.postbackData = postbackData;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public SerpGoogleAiModeTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <p><em>full name of search engine location</em><p><strong>required field if you don't specify</strong> <code>location_code</code> or <code>location_coordinate</code><p><strong>if you use this field, you don't need to specify <code>location_code</code> or <code>location_coordinate</code></strong><p>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/locations</code><p><strong>Note:</strong> check <a href='https://support.google.com/websearch/answer/16011537?hl=en&co=GENIE.Platform%3DAndroid#' target='_blank'> Google Search Help</a> for the list of countries where AI Mode is currently available</p>
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

  public SerpGoogleAiModeTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <p><em>full name of search engine language</em><p>required field if you don't specify <code>language_code</code>;<p>if you use this field, you don't need to specify <code>language_code</code>;<p>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/google/ai_mode/languages</code>;</p>
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

  public SerpGoogleAiModeTaskPostRequestInfo os(String os) {
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

  public SerpGoogleAiModeTaskPostRequestInfo tag(String tag) {
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


  public static final String SERIALIZED_NAME_CALCULATE_RECTANGLES = "calculate_rectangles";
  @SerializedName(SERIALIZED_NAME_CALCULATE_RECTANGLES)
  private Boolean calculateRectangles;

  public SerpGoogleAiModeTaskPostRequestInfo calculateRectangles(Boolean calculateRectangles) {
    this.calculateRectangles = calculateRectangles;
    return this;
  }

  /**
   * <p><em>calculate pixel rankings for SERP elements in advanced results</em><p>optional field<p>pixel ranking refers to the distance between the result snippet and top left corner of the screen;<p><a href='https://dataforseo.com/help-center/pixel-ranking-in-serp-api'>Visit Help Center to learn more>></a><p>by default, the parameter is set to <code>false</code><p><strong>Note:</strong> if set to <code>true</code>, the charge per task will be multiplied by 2</p>
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

  public SerpGoogleAiModeTaskPostRequestInfo browserScreenWidth(Long browserScreenWidth) {
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

  public SerpGoogleAiModeTaskPostRequestInfo browserScreenHeight(Integer browserScreenHeight) {
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

  public SerpGoogleAiModeTaskPostRequestInfo browserScreenResolutionRatio(Integer browserScreenResolutionRatio) {
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


  public static final String SERIALIZED_NAME_LOCATION_COORDINATE = "location_coordinate";
  @SerializedName(SERIALIZED_NAME_LOCATION_COORDINATE)
  private String locationCoordinate;

  public SerpGoogleAiModeTaskPostRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <p><em>GPS coordinates of a location</em><p><strong>required field if you don't specify</strong> <code>location_name</code> or <code>location_code</code><p><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_code</code></strong><p><code>location_coordinate</code> parameter should be specified in the <em>'latitude,longitude,zoom'</em> format<p>if <em>'zoom'</em> is not specified, <em>9z</em> will be applied as a default value<p>the maximum number of decimal digits for <em>'latitude'</em> and <em>'longitude'</em>: 7<p>the minimum value for <em>'zoom'</em>: 4z<p>the maximum value for <em>'zoom'</em>: 18z<p>example:<p><code class='long-string'>52.6178549,-155.352142,18z</code></p>
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }



  public SerpGoogleAiModeTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpGoogleAiModeTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpGoogleAiModeTaskPostRequestInfo serpGoogleAiModeTaskPostRequestInfo = (SerpGoogleAiModeTaskPostRequestInfo) o;
    return

        Objects.equals(this.keyword, serpGoogleAiModeTaskPostRequestInfo.keyword) &&
        Objects.equals(this.locationCode, serpGoogleAiModeTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.languageCode, serpGoogleAiModeTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.priority, serpGoogleAiModeTaskPostRequestInfo.priority) &&
        Objects.equals(this.device, serpGoogleAiModeTaskPostRequestInfo.device) &&
        Objects.equals(this.pingbackUrl, serpGoogleAiModeTaskPostRequestInfo.pingbackUrl) &&
        Objects.equals(this.postbackUrl, serpGoogleAiModeTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.postbackData, serpGoogleAiModeTaskPostRequestInfo.postbackData) &&
        Objects.equals(this.locationName, serpGoogleAiModeTaskPostRequestInfo.locationName) &&
        Objects.equals(this.languageName, serpGoogleAiModeTaskPostRequestInfo.languageName) &&
        Objects.equals(this.os, serpGoogleAiModeTaskPostRequestInfo.os) &&
        Objects.equals(this.tag, serpGoogleAiModeTaskPostRequestInfo.tag) &&
        Objects.equals(this.calculateRectangles, serpGoogleAiModeTaskPostRequestInfo.calculateRectangles) &&
        Objects.equals(this.browserScreenWidth, serpGoogleAiModeTaskPostRequestInfo.browserScreenWidth) &&
        Objects.equals(this.browserScreenHeight, serpGoogleAiModeTaskPostRequestInfo.browserScreenHeight) &&
        Objects.equals(this.browserScreenResolutionRatio, serpGoogleAiModeTaskPostRequestInfo.browserScreenResolutionRatio) &&
        Objects.equals(this.locationCoordinate, serpGoogleAiModeTaskPostRequestInfo.locationCoordinate);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, locationCode, languageCode, priority, device, pingbackUrl, postbackUrl, postbackData, locationName, languageName, os, tag, calculateRectangles, browserScreenWidth, browserScreenHeight, browserScreenResolutionRatio, locationCoordinate);
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
    sb.append("class SerpGoogleAiModeTaskPostRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    postbackData: ").append(toIndentedString(postbackData)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    calculateRectangles: ").append(toIndentedString(calculateRectangles)).append("\n");
    sb.append("    browserScreenWidth: ").append(toIndentedString(browserScreenWidth)).append("\n");
    sb.append("    browserScreenHeight: ").append(toIndentedString(browserScreenHeight)).append("\n");
    sb.append("    browserScreenResolutionRatio: ").append(toIndentedString(browserScreenResolutionRatio)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
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
    
    openapiFields.add("priority");
    
    openapiFields.add("device");
    
    openapiFields.add("pingback_url");
    
    openapiFields.add("postback_url");
    
    openapiFields.add("postback_data");
    
    openapiFields.add("location_name");
    
    openapiFields.add("language_name");
    
    openapiFields.add("os");
    
    openapiFields.add("tag");
    
    openapiFields.add("calculate_rectangles");
    
    openapiFields.add("browser_screen_width");
    
    openapiFields.add("browser_screen_height");
    
    openapiFields.add("browser_screen_resolution_ratio");
    
    openapiFields.add("location_coordinate");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpGoogleAiModeTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpGoogleAiModeTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpGoogleAiModeTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpGoogleAiModeTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpGoogleAiModeTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpGoogleAiModeTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, SerpGoogleAiModeTaskPostRequestInfo value) throws IOException {
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
           public SerpGoogleAiModeTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpGoogleAiModeTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpGoogleAiModeTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpGoogleAiModeTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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

/**
 * SerpYoutubeVideoSubtitlesTaskPostRequestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class SerpYoutubeVideoSubtitlesTaskPostRequestInfo {
  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_SUBTITLES_LANGUAGE = "subtitles_language";
  @SerializedName(SERIALIZED_NAME_SUBTITLES_LANGUAGE)
  private String subtitlesLanguage;

  public static final String SERIALIZED_NAME_SUBTITLES_TRANSLATE_LANGUAGE = "subtitles_translate_language";
  @SerializedName(SERIALIZED_NAME_SUBTITLES_TRANSLATE_LANGUAGE)
  private String subtitlesTranslateLanguage;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public static final String SERIALIZED_NAME_POSTBACK_DATA = "postback_data";
  @SerializedName(SERIALIZED_NAME_POSTBACK_DATA)
  private String postbackData;

  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo() {
  }

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * ID of the video required field you can find video ID in the URL or ‘youtube_video’ item of YouTube Organic result example: Y8Wu4rSNJms
   * @return videoId
   */
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * task priority optional field can take the following values: 1 – normal execution priority (set by default) 2 – high execution priority You will be additionally charged for the tasks with high execution priority. The cost can be calculated on the Pricing page.
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo subtitlesLanguage(String subtitlesLanguage) {
    this.subtitlesLanguage = subtitlesLanguage;
    return this;
  }

  /**
   * language code of original text you can get the language code from YouTube Video Info result
   * @return subtitlesLanguage
   */
  @javax.annotation.Nullable
  public String getSubtitlesLanguage() {
    return subtitlesLanguage;
  }

  public void setSubtitlesLanguage(String subtitlesLanguage) {
    this.subtitlesLanguage = subtitlesLanguage;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo subtitlesTranslateLanguage(String subtitlesTranslateLanguage) {
    this.subtitlesTranslateLanguage = subtitlesTranslateLanguage;
    return this;
  }

  /**
   * language code of translated text possible values: \&quot;az\&quot;, \&quot;ay\&quot;, \&quot;ak\&quot;, \&quot;sq\&quot;, \&quot;am\&quot;, \&quot;en\&quot;, \&quot;ar\&quot;, \&quot;hy\&quot;, \&quot;as\&quot;, \&quot;af\&quot;, \&quot;eu\&quot;, \&quot;be\&quot;, \&quot;bn\&quot;, \&quot;my\&quot;, \&quot;bg\&quot;, \&quot;bs\&quot;, \&quot;bho\&quot;, \&quot;cy\&quot;, \&quot;hu\&quot;, \&quot;vi\&quot;, \&quot;haw\&quot;, \&quot;ht\&quot;, \&quot;gl\&quot;, \&quot;lg\&quot;, \&quot;el\&quot;, \&quot;ka\&quot;, \&quot;gn\&quot;, \&quot;gu\&quot;, \&quot;gd\&quot;, \&quot;da\&quot;, \&quot;fy\&quot;, \&quot;zu\&quot;, \&quot;iw\&quot;, \&quot;ig\&quot;, \&quot;yi\&quot;, \&quot;id\&quot;, \&quot;ga\&quot;, \&quot;is\&quot;, \&quot;es\&quot;, \&quot;it\&quot;, \&quot;yo\&quot;, \&quot;kk\&quot;, \&quot;kn\&quot;, \&quot;ca\&quot;, \&quot;qu\&quot;, \&quot;rw\&quot;, \&quot;ky\&quot;, \&quot;zh-Hant\&quot;, \&quot;zh-Hans\&quot;, \&quot;ko\&quot;, \&quot;co\&quot;, \&quot;xh\&quot;, \&quot;ku\&quot;, \&quot;km\&quot;, \&quot;lo\&quot;, \&quot;la\&quot;, \&quot;lv\&quot;, \&quot;ln\&quot;, \&quot;lt\&quot;, \&quot;lb\&quot;, \&quot;mk\&quot;, \&quot;mg\&quot;, \&quot;ms\&quot;, \&quot;ml\&quot;, \&quot;dv\&quot;, \&quot;mt\&quot;, \&quot;mi\&quot;, \&quot;mr\&quot;, \&quot;mn\&quot;, \&quot;und\&quot;, \&quot;de\&quot;, \&quot;ne\&quot;, \&quot;nl\&quot;, \&quot;no\&quot;, \&quot;ny\&quot;, \&quot;or\&quot;, \&quot;om\&quot;, \&quot;pa\&quot;, \&quot;fa\&quot;, \&quot;pl\&quot;, \&quot;pt\&quot;, \&quot;ps\&quot;, \&quot;ro\&quot;, \&quot;ru\&quot;, \&quot;sm\&quot;, \&quot;sa\&quot;, \&quot;ceb\&quot;, \&quot;nso\&quot;, \&quot;sr\&quot;, \&quot;si\&quot;, \&quot;sd\&quot;, \&quot;sk\&quot;, \&quot;sl\&quot;, \&quot;so\&quot;, \&quot;sw\&quot;, \&quot;su\&quot;, \&quot;tg\&quot;, \&quot;th\&quot;, \&quot;ta\&quot;, \&quot;tt\&quot;, \&quot;te\&quot;, \&quot;ti\&quot;, \&quot;ts\&quot;, \&quot;tr\&quot;, \&quot;tk\&quot;, \&quot;uz\&quot;, \&quot;ug\&quot;, \&quot;uk\&quot;, \&quot;ur\&quot;, \&quot;fil\&quot;, \&quot;fi\&quot;, \&quot;fr\&quot;, \&quot;ha\&quot;, \&quot;hi\&quot;, \&quot;hmn\&quot;, \&quot;hr\&quot;, \&quot;cs\&quot;, \&quot;sv\&quot;, \&quot;sn\&quot;, \&quot;ee\&quot;, \&quot;eo\&quot;, \&quot;et\&quot;, \&quot;st\&quot;, \&quot;jv\&quot;, \&quot;ja\&quot;, \&quot;kri\&quot;
   * @return subtitlesTranslateLanguage
   */
  @javax.annotation.Nullable
  public String getSubtitlesTranslateLanguage() {
    return subtitlesTranslateLanguage;
  }

  public void setSubtitlesTranslateLanguage(String subtitlesTranslateLanguage) {
    this.subtitlesTranslateLanguage = subtitlesTranslateLanguage;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of search engine location required field if you don’t specify location_code if you use this field, you don’t need to specify location_code you can receive the list of available locations of the search engine with their location_name by making a separate request to the https://api.dataforseo.com/v3/serp/youtube/locations example: United States
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * search engine location code required field if you don’t specify location_name if you use this field, you don’t need to specify location_name you can receive the list of available locations of the search engines with their location_code by making a separate request to the https://api.dataforseo.com/v3/serp/youtube/locations example: 2840
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of search engine language required field if you don’t specify language_code if you use this field, you don’t need to specify language_code you can receive the list of available languages of the search engine with their language_name by making a separate request to the https://api.dataforseo.com/v3/serp/youtube/languages example: English
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * search engine language code required field if you don’t specify language_name if you use this field, you don’t need to specify language_name you can receive the list of available languages of the search engine with their language_code by making a separate request to the https://api.dataforseo.com/v3/serp/youtube/languages example: en
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo device(String device) {
    this.device = device;
    return this;
  }

  /**
   * device type optional field only value: desktop
   * @return device
   */
  @javax.annotation.Nullable
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo os(String os) {
    this.os = os;
    return this;
  }

  /**
   * device operating system optional field choose from the following values: windows, macos default value: windows
   * @return os
   */
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * return URL for sending task results optional field once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/postbackscript?id&#x3D;$id http://your-server.com/postbackscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in postback_url will be urlencoded; i.a., the # character will be encoded into %23 learn more on our Help Center
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo postbackData(String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * postback_url datatype required field if you specify postback_url corresponds to the datatype that will be sent to your server possible value: advanced
   * @return postbackData
   */
  @javax.annotation.Nullable
  public String getPostbackData() {
    return postbackData;
  }

  public void setPostbackData(String postbackData) {
    this.postbackData = postbackData;
  }


  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * notification URL of a completed task optional field when a task is completed we will notify you by GET request sent to the URL you have specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/pingscript?id&#x3D;$id http://your-server.com/pingscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in pingback_url will be urlencoded; i.a., the # character will be encoded into %23 learn more on our Help Center
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SerpYoutubeVideoSubtitlesTaskPostRequestInfo instance itself
   */
  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    SerpYoutubeVideoSubtitlesTaskPostRequestInfo serpYoutubeVideoSubtitlesTaskPostRequestInfo = (SerpYoutubeVideoSubtitlesTaskPostRequestInfo) o;
    return Objects.equals(this.videoId, serpYoutubeVideoSubtitlesTaskPostRequestInfo.videoId) &&
        Objects.equals(this.priority, serpYoutubeVideoSubtitlesTaskPostRequestInfo.priority) &&
        Objects.equals(this.subtitlesLanguage, serpYoutubeVideoSubtitlesTaskPostRequestInfo.subtitlesLanguage) &&
        Objects.equals(this.subtitlesTranslateLanguage, serpYoutubeVideoSubtitlesTaskPostRequestInfo.subtitlesTranslateLanguage) &&
        Objects.equals(this.locationName, serpYoutubeVideoSubtitlesTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, serpYoutubeVideoSubtitlesTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.languageName, serpYoutubeVideoSubtitlesTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, serpYoutubeVideoSubtitlesTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.device, serpYoutubeVideoSubtitlesTaskPostRequestInfo.device) &&
        Objects.equals(this.os, serpYoutubeVideoSubtitlesTaskPostRequestInfo.os) &&
        Objects.equals(this.tag, serpYoutubeVideoSubtitlesTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, serpYoutubeVideoSubtitlesTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.postbackData, serpYoutubeVideoSubtitlesTaskPostRequestInfo.postbackData) &&
        Objects.equals(this.pingbackUrl, serpYoutubeVideoSubtitlesTaskPostRequestInfo.pingbackUrl)&&
        Objects.equals(this.additionalProperties, serpYoutubeVideoSubtitlesTaskPostRequestInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, priority, subtitlesLanguage, subtitlesTranslateLanguage, locationName, locationCode, languageName, languageCode, device, os, tag, postbackUrl, postbackData, pingbackUrl, additionalProperties);
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
    sb.append("class SerpYoutubeVideoSubtitlesTaskPostRequestInfo {\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    subtitlesLanguage: ").append(toIndentedString(subtitlesLanguage)).append("\n");
    sb.append("    subtitlesTranslateLanguage: ").append(toIndentedString(subtitlesTranslateLanguage)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    postbackData: ").append(toIndentedString(postbackData)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("video_id");
    openapiFields.add("priority");
    openapiFields.add("subtitles_language");
    openapiFields.add("subtitles_translate_language");
    openapiFields.add("location_name");
    openapiFields.add("location_code");
    openapiFields.add("language_name");
    openapiFields.add("language_code");
    openapiFields.add("device");
    openapiFields.add("os");
    openapiFields.add("tag");
    openapiFields.add("postback_url");
    openapiFields.add("postback_data");
    openapiFields.add("pingback_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpYoutubeVideoSubtitlesTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SerpYoutubeVideoSubtitlesTaskPostRequestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SerpYoutubeVideoSubtitlesTaskPostRequestInfo is not found in the empty JSON string", SerpYoutubeVideoSubtitlesTaskPostRequestInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("video_id") != null && !jsonObj.get("video_id").isJsonNull()) && !jsonObj.get("video_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_id").toString()));
      }
      if ((jsonObj.get("subtitles_language") != null && !jsonObj.get("subtitles_language").isJsonNull()) && !jsonObj.get("subtitles_language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtitles_language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtitles_language").toString()));
      }
      if ((jsonObj.get("subtitles_translate_language") != null && !jsonObj.get("subtitles_translate_language").isJsonNull()) && !jsonObj.get("subtitles_translate_language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtitles_translate_language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtitles_translate_language").toString()));
      }
      if ((jsonObj.get("location_name") != null && !jsonObj.get("location_name").isJsonNull()) && !jsonObj.get("location_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location_name").toString()));
      }
      if ((jsonObj.get("language_name") != null && !jsonObj.get("language_name").isJsonNull()) && !jsonObj.get("language_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_name").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      if ((jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) && !jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      if ((jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull()) && !jsonObj.get("os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("postback_url") != null && !jsonObj.get("postback_url").isJsonNull()) && !jsonObj.get("postback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postback_url").toString()));
      }
      if ((jsonObj.get("postback_data") != null && !jsonObj.get("postback_data").isJsonNull()) && !jsonObj.get("postback_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postback_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postback_data").toString()));
      }
      if ((jsonObj.get("pingback_url") != null && !jsonObj.get("pingback_url").isJsonNull()) && !jsonObj.get("pingback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pingback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pingback_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpYoutubeVideoSubtitlesTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpYoutubeVideoSubtitlesTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpYoutubeVideoSubtitlesTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpYoutubeVideoSubtitlesTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpYoutubeVideoSubtitlesTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, SerpYoutubeVideoSubtitlesTaskPostRequestInfo value) throws IOException {
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
           public SerpYoutubeVideoSubtitlesTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpYoutubeVideoSubtitlesTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of SerpYoutubeVideoSubtitlesTaskPostRequestInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SerpYoutubeVideoSubtitlesTaskPostRequestInfo
   * @throws IOException if the JSON string is invalid with respect to SerpYoutubeVideoSubtitlesTaskPostRequestInfo
   */
  public static SerpYoutubeVideoSubtitlesTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpYoutubeVideoSubtitlesTaskPostRequestInfo.class);
  }

  /**
   * Convert an instance of SerpYoutubeVideoSubtitlesTaskPostRequestInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


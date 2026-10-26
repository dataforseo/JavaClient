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


public class SerpYoutubeVideoSubtitlesTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId;

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * <p><em>ID of the video</em><p><strong>required field</strong><p>you can find video ID in the URL or 'youtube_video' item of <a href='/v3/serp/youtube/organic/live/advanced/' target='_blank' rel='noopener noreferrer'>YouTube Organic</a> result<p>example:<p><code>Y8Wu4rSNJms</code></p>
   * @return videoId
   */
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <p><em>search engine location code</em><p><strong>required field if you don't specify</strong> <code>location_name</code><p><strong>if you use this field, you don't need to specify <code>location_name</code></strong><p>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/youtube/locations</code><p>example:<p><code class='long-string'>2840</code></p>
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

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <p><em>search engine language code</em><p><strong>required field if you don't specify</strong> <code>language_name</code><p><strong>if you use this field, you don't need to specify <code>language_name</code></strong><p>you can receive the list of available languages of the search engine with their <code>language_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/youtube/languages</code><em><p></em>example:<em><p></em><code class='long-string'>en</code></p>
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

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <p><em>task priority</em><p>optional field<p>can take the following values:<p>1 – normal execution priority (set by default)<p>2 – high execution priority</p><br>You will be additionally charged for the tasks with high execution priority.<p>The cost can be calculated on the <a href='https://dataforseo.com/pricing/serp/youtube-serp-api' target='_blank'>Pricing</a> page.
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

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo device(String device) {
    this.device = device;
    return this;
  }

  /**
   * <p><em>device type</em><p>optional field<p>only value: <code>desktop</code></p>
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

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
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

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * <p><em>return URL for sending task results</em><p>optional field<p>once the task is completed, we will send a POST request with its results compressed in the <code>gzip</code> format to the <code>postback_url</code> you specified<p>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<p>example:<p><code>http://your-server.com/postbackscript?id=$id</code><p><code>http://your-server.com/postbackscript?id=$id&tag=$tag</code><p><strong>Note:</strong> special characters in <code>postback_url</code> will be urlencoded;<p>i.a., the <code>#</code> character will be encoded into <code>%23</code></p><br><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a></p>
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

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo postbackData(String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * <p><em>postback_url datatype</em><p><strong>required field if you specify <code>postback_url</code></strong><p>corresponds to the datatype that will be sent to your server<p>possible value:<p><code>advanced</code></p>
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

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <p><em>full name of search engine location</em><p><strong>required field if you don't specify</strong> <code>location_code</code><p><strong>if you use this field, you don't need to specify <code>location_code</code></strong><p>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/youtube/locations</code><p>example:<p><code class='long-string'>United States</code></p>
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

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <p><em>full name of search engine language</em><p><strong>required field if you don't specify</strong> <code>language_code</code><p><strong>if you use this field, you don't need to specify <code>language_code</code></strong><p>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/youtube/languages</code><p>example:<p><code class='long-string'>English</code></p>
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

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo os(String os) {
    this.os = os;
    return this;
  }

  /**
   * <p><em>device operating system</em><p>optional field<p>choose from the following values: <code>windows</code>, <code>macos</code><p>default value: <code>windows</code></p>
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

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo tag(String tag) {
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


  public static final String SERIALIZED_NAME_SUBTITLES_LANGUAGE = "subtitles_language";
  @SerializedName(SERIALIZED_NAME_SUBTITLES_LANGUAGE)
  private String subtitlesLanguage;

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo subtitlesLanguage(String subtitlesLanguage) {
    this.subtitlesLanguage = subtitlesLanguage;
    return this;
  }

  /**
   * <p><em>language code of original text</em><p>you can get the language code from <a href='https://docs.dataforseo.com/v3/serp/youtube/video_info/live/advanced/' target='_blank' rel='noopener noreferrer'>YouTube Video Info</a> result</p>
   * @return subtitlesLanguage
   */
  @javax.annotation.Nullable
  public String getSubtitlesLanguage() {
    return subtitlesLanguage;
  }

  public void setSubtitlesLanguage(String subtitlesLanguage) {
    this.subtitlesLanguage = subtitlesLanguage;
  }


  public static final String SERIALIZED_NAME_SUBTITLES_TRANSLATE_LANGUAGE = "subtitles_translate_language";
  @SerializedName(SERIALIZED_NAME_SUBTITLES_TRANSLATE_LANGUAGE)
  private String subtitlesTranslateLanguage;

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo subtitlesTranslateLanguage(String subtitlesTranslateLanguage) {
    this.subtitlesTranslateLanguage = subtitlesTranslateLanguage;
    return this;
  }

  /**
   * <p><em>language code of translated text</em><p>possible values:<p><code>'az'</code>, <code>'ay'</code>, <code>'ak'</code>, <code>'sq'</code>, <code>'am'</code>, <code>'en'</code>, <code>'ar'</code>, <code>'hy'</code>, <code>'as'</code>, <code>'af'</code>, <code>'eu'</code>, <code>'be'</code>, <code>'bn'</code>, <code>'my'</code>, <code>'bg'</code>, <code>'bs'</code>, <code>'bho'</code>, <code>'cy'</code>, <code>'hu'</code>, <code>'vi'</code>, <code>'haw'</code>, <code>'ht'</code>, <code>'gl'</code>, <code>'lg'</code>, <code>'el'</code>, <code>'ka'</code>, <code>'gn'</code>, <code>'gu'</code>, <code>'gd'</code>, <code>'da'</code>, <code>'fy'</code>, <code>'zu'</code>, <code>'iw'</code>, <code>'ig'</code>, <code>'yi'</code>, <code>'id'</code>, <code>'ga'</code>, <code>'is'</code>, <code>'es'</code>, <code>'it'</code>, <code>'yo'</code>, <code>'kk'</code>, <code>'kn'</code>, <code>'ca'</code>, <code>'qu'</code>, <code>'rw'</code>, <code>'ky'</code>, <code>'zh-Hant'</code>, <code>'zh-Hans'</code>, <code>'ko'</code>, <code>'co'</code>, <code>'xh'</code>, <code>'ku'</code>, <code>'km'</code>, <code>'lo'</code>, <code>'la'</code>, <code>'lv'</code>, <code>'ln'</code>, <code>'lt'</code>, <code>'lb'</code>, <code>'mk'</code>, <code>'mg'</code>, <code>'ms'</code>, <code>'ml'</code>, <code>'dv'</code>, <code>'mt'</code>, <code>'mi'</code>, <code>'mr'</code>, <code>'mn'</code>, <code>'und'</code>, <code>'de'</code>, <code>'ne'</code>, <code>'nl'</code>, <code>'no'</code>, <code>'ny'</code>, <code>'or'</code>, <code>'om'</code>, <code>'pa'</code>, <code>'fa'</code>, <code>'pl'</code>, <code>'pt'</code>, <code>'ps'</code>, <code>'ro'</code>, <code>'ru'</code>, <code>'sm'</code>, <code>'sa'</code>, <code>'ceb'</code>, <code>'nso'</code>, <code>'sr'</code>, <code>'si'</code>, <code>'sd'</code>, <code>'sk'</code>, <code>'sl'</code>, <code>'so'</code>, <code>'sw'</code>, <code>'su'</code>, <code>'tg'</code>, <code>'th'</code>, <code>'ta'</code>, <code>'tt'</code>, <code>'te'</code>, <code>'ti'</code>, <code>'ts'</code>, <code>'tr'</code>, <code>'tk'</code>, <code>'uz'</code>, <code>'ug'</code>, <code>'uk'</code>, <code>'ur'</code>, <code>'fil'</code>, <code>'fi'</code>, <code>'fr'</code>, <code>'ha'</code>, <code>'hi'</code>, <code>'hmn'</code>, <code>'hr'</code>, <code>'cs'</code>, <code>'sv'</code>, <code>'sn'</code>, <code>'ee'</code>, <code>'eo'</code>, <code>'et'</code>, <code>'st'</code>, <code>'jv'</code>, <code>'ja'</code>, <code>'kri'</code></p>
   * @return subtitlesTranslateLanguage
   */
  @javax.annotation.Nullable
  public String getSubtitlesTranslateLanguage() {
    return subtitlesTranslateLanguage;
  }

  public void setSubtitlesTranslateLanguage(String subtitlesTranslateLanguage) {
    this.subtitlesTranslateLanguage = subtitlesTranslateLanguage;
  }



  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpYoutubeVideoSubtitlesTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpYoutubeVideoSubtitlesTaskPostRequestInfo serpYoutubeVideoSubtitlesTaskPostRequestInfo = (SerpYoutubeVideoSubtitlesTaskPostRequestInfo) o;
    return

        Objects.equals(this.videoId, serpYoutubeVideoSubtitlesTaskPostRequestInfo.videoId) &&
        Objects.equals(this.locationCode, serpYoutubeVideoSubtitlesTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.languageCode, serpYoutubeVideoSubtitlesTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.priority, serpYoutubeVideoSubtitlesTaskPostRequestInfo.priority) &&
        Objects.equals(this.device, serpYoutubeVideoSubtitlesTaskPostRequestInfo.device) &&
        Objects.equals(this.pingbackUrl, serpYoutubeVideoSubtitlesTaskPostRequestInfo.pingbackUrl) &&
        Objects.equals(this.postbackUrl, serpYoutubeVideoSubtitlesTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.postbackData, serpYoutubeVideoSubtitlesTaskPostRequestInfo.postbackData) &&
        Objects.equals(this.locationName, serpYoutubeVideoSubtitlesTaskPostRequestInfo.locationName) &&
        Objects.equals(this.languageName, serpYoutubeVideoSubtitlesTaskPostRequestInfo.languageName) &&
        Objects.equals(this.os, serpYoutubeVideoSubtitlesTaskPostRequestInfo.os) &&
        Objects.equals(this.tag, serpYoutubeVideoSubtitlesTaskPostRequestInfo.tag) &&
        Objects.equals(this.subtitlesLanguage, serpYoutubeVideoSubtitlesTaskPostRequestInfo.subtitlesLanguage) &&
        Objects.equals(this.subtitlesTranslateLanguage, serpYoutubeVideoSubtitlesTaskPostRequestInfo.subtitlesTranslateLanguage);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(videoId, locationCode, languageCode, priority, device, pingbackUrl, postbackUrl, postbackData, locationName, languageName, os, tag, subtitlesLanguage, subtitlesTranslateLanguage);
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
    sb.append("    subtitlesLanguage: ").append(toIndentedString(subtitlesLanguage)).append("\n");
    sb.append("    subtitlesTranslateLanguage: ").append(toIndentedString(subtitlesTranslateLanguage)).append("\n");
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
    
    openapiFields.add("subtitles_language");
    
    openapiFields.add("subtitles_translate_language");
    

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


  public static SerpYoutubeVideoSubtitlesTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpYoutubeVideoSubtitlesTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
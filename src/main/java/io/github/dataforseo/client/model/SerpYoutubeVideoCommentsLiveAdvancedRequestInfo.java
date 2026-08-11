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


public class SerpYoutubeVideoCommentsLiveAdvancedRequestInfo  {


  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId;

  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * <em>ID of the video</em><br><strong>required field</strong><br>you can find video ID in the URL or 'youtube_video' item of <a href='/v3/serp/youtube/organic/live/advanced/' rel='noopener noreferrer' target='_blank'>YouTube Organic</a> result<br>example:<br><code>vQXvyV0zIP4</code>
   * @return videoId
   */
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of search engine location</em><br><strong>required field if you don't specify</strong> <code>location_code</code><br><strong>if you use this field, you don't need to specify <code>location_code</code></strong><br>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/youtube/locations</code><br>example:<br><code class='long-string'>United States</code>
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

  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>search engine location code</em><br><strong>required field if you don't specify</strong> <code>location_name</code>_<br><strong>if you use this field, you don't need to specify <code>location_name</code></strong><br>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/youtube/locations</code><br>example:<br><code class='long-string'>2840</code>n
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search engine language</em><br><strong>required field if you don't specify</strong> <code>language_code</code><br><strong>if you use this field, you don't need to specify <code>language_code</code></strong><br>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/serp/youtube/languages</code><br>example:<br><code class='long-string'>English</code>
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

  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search engine language code</em><br><strong>required field if you don't specify</strong> <code>language_name</code><br><strong>if you use this field, you don't need to specify <code>language_name</code></strong><br>you can receive the list of available languages of the search engine with their <code>language_code</code>_by making a separate request to the <code>https://api.dataforseo.com/v3/serp/youtube/languages</code><em><br></em>example:<em><br></em><code class='long-string'>en</code>n
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

  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo device(String device) {
    this.device = device;
    return this;
  }

  /**
   * <em>device type</em><br>optional field<br>only value: <code>desktop</code>
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

  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo os(String os) {
    this.os = os;
    return this;
  }

  /**
   * 
   * @return os
   */
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * <em>parsing depth</em><br>optional field<br>number of results in SERP<br>default value: <code>20</code><br>max value: <code>200</code><br><strong>Note:</strong> your account will be billed per each SERP containing up to 20 results;<br>thus, setting a depth above <code>20</code> may result in additional charges if the search engine returns more than 20 results;<br>if the specified depth is higher than the number of results in the response, the difference will be refunded automatically to your account balance
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo tag(String tag) {
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



  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpYoutubeVideoCommentsLiveAdvancedRequestInfo serpYoutubeVideoCommentsLiveAdvancedRequestInfo = (SerpYoutubeVideoCommentsLiveAdvancedRequestInfo) o;
    return

        Objects.equals(this.videoId, serpYoutubeVideoCommentsLiveAdvancedRequestInfo.videoId) &&
        Objects.equals(this.locationName, serpYoutubeVideoCommentsLiveAdvancedRequestInfo.locationName) &&
        Objects.equals(this.locationCode, serpYoutubeVideoCommentsLiveAdvancedRequestInfo.locationCode) &&
        Objects.equals(this.languageName, serpYoutubeVideoCommentsLiveAdvancedRequestInfo.languageName) &&
        Objects.equals(this.languageCode, serpYoutubeVideoCommentsLiveAdvancedRequestInfo.languageCode) &&
        Objects.equals(this.device, serpYoutubeVideoCommentsLiveAdvancedRequestInfo.device) &&
        Objects.equals(this.os, serpYoutubeVideoCommentsLiveAdvancedRequestInfo.os) &&
        Objects.equals(this.depth, serpYoutubeVideoCommentsLiveAdvancedRequestInfo.depth) &&
        Objects.equals(this.tag, serpYoutubeVideoCommentsLiveAdvancedRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(videoId, locationName, locationCode, languageName, languageCode, device, os, depth, tag);
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
    sb.append("class SerpYoutubeVideoCommentsLiveAdvancedRequestInfo {\n");

    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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
    
    openapiFields.add("video_id");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("device");
    
    openapiFields.add("os");
    
    openapiFields.add("depth");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpYoutubeVideoCommentsLiveAdvancedRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpYoutubeVideoCommentsLiveAdvancedRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpYoutubeVideoCommentsLiveAdvancedRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpYoutubeVideoCommentsLiveAdvancedRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpYoutubeVideoCommentsLiveAdvancedRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpYoutubeVideoCommentsLiveAdvancedRequestInfo>() {
           @Override
           public void write(JsonWriter out, SerpYoutubeVideoCommentsLiveAdvancedRequestInfo value) throws IOException {
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
           public SerpYoutubeVideoCommentsLiveAdvancedRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpYoutubeVideoCommentsLiveAdvancedRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpYoutubeVideoCommentsLiveAdvancedRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpYoutubeVideoCommentsLiveAdvancedRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
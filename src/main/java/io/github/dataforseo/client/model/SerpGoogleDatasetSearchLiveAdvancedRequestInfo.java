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


public class SerpGoogleDatasetSearchLiveAdvancedRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <p><em>keyword</em><p><strong>required field</strong><p>you can specify <strong>up to 700 characters</strong> in the <code>keyword</code> field<p>all %## will be decoded (plus character ‘+’ will be decoded to a space character)<p>if you need to use the “%” character for your <code>keyword</code>, please specify it as “%25”;<p>if you need to use the “+” character for your <code>keyword</code>, please specify it as “%2B”;</p><br><p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a></p>
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <p><em>search engine language code</em><p>optional field if you don't specify <code>language_name</code><p>if you use this field, you don't need to specify <code>language_name</code><p>possible value:<p><code class='long-string'>en</code></p>
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

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * <p><em>parsing depth</em><p>optional field<p>number of results in SERP<p>default value: <code>20</code><p>max value: <code>200</code></p><br><strong>Your account will be billed per each SERP containing up to 20 results;</strong><p>Setting depth above 20 may result in additional charges if the search engine returns more than 20 results;<p>If the specified depth is higher than the number of results in the response, the difference will be refunded to your account balance automatically.
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

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo device(String device) {
    this.device = device;
    return this;
  }

  /**
   * <p><em>device type</em><p>optional field<p>return results for a specific device type<p>possible value: <code>desktop</code></p>
   * @return device
   */
  @javax.annotation.Nullable
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <p><em>full name of search engine language</em><p>optional field<p>if you use this field, you don't need to specify <code>language_code</code><p>possible value:<p><code class='long-string'>English</code></p>
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

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo os(String os) {
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

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo tag(String tag) {
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


  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private String lastUpdated;

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * <p><em>last time the dataset was updated</em><p>optional field<p>possible values: <code>1m</code>, <code>1y</code>, <code>3y</code></p>
   * @return lastUpdated
   */
  @javax.annotation.Nullable
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public static final String SERIALIZED_NAME_FILE_FORMATS = "file_formats";
  @SerializedName(SERIALIZED_NAME_FILE_FORMATS)
  private List<String> fileFormats;

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo fileFormats(List<String> fileFormats) {
    this.fileFormats = fileFormats;
    return this;
  }

  /**
   * <p><em>file formats of the dataset</em><p>optional field<p>possible values: <code>other</code>, <code>archive</code>, <code>text</code>, <code>image</code>, <code>document</code>, <code>tabular</code></p>
   * @return fileFormats
   */
  @javax.annotation.Nullable
  public List<String> getFileFormats() {
    return fileFormats;
  }

  public void setFileFormats(List<String> fileFormats) {
    this.fileFormats = fileFormats;
  }


  public static final String SERIALIZED_NAME_USAGE_RIGHTS = "usage_rights";
  @SerializedName(SERIALIZED_NAME_USAGE_RIGHTS)
  private String usageRights;

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo usageRights(String usageRights) {
    this.usageRights = usageRights;
    return this;
  }

  /**
   * <p><em>usage rights of the dataset</em><p>optional field<p>possible values: <code>commercial</code>, <code>noncommercial</code></p>
   * @return usageRights
   */
  @javax.annotation.Nullable
  public String getUsageRights() {
    return usageRights;
  }

  public void setUsageRights(String usageRights) {
    this.usageRights = usageRights;
  }


  public static final String SERIALIZED_NAME_IS_FREE = "is_free";
  @SerializedName(SERIALIZED_NAME_IS_FREE)
  private Boolean isFree;

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo isFree(Boolean isFree) {
    this.isFree = isFree;
    return this;
  }

  /**
   * <p><em>indicates whether displayed datasets are free</em><p>optional field<p>possible values: <code>true</code>, <code>false</code></p>
   * @return isFree
   */
  @javax.annotation.Nullable
  public Boolean getIsFree() {
    return isFree;
  }

  public void setIsFree(Boolean isFree) {
    this.isFree = isFree;
  }


  public static final String SERIALIZED_NAME_TOPICS = "topics";
  @SerializedName(SERIALIZED_NAME_TOPICS)
  private List<String> topics;

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  /**
   * <p><em>dataset topics</em><p>optional field<p>possible values: <code>humanities</code>, <code>social_sciences</code>, <code>life_sciences</code>, <code>agriculture</code>, <code>natural_sciences</code>, <code>geo</code>, <code>computer</code>, <code>architecture_and_urban_planning</code>, <code>engineering</code></p>
   * @return topics
   */
  @javax.annotation.Nullable
  public List<String> getTopics() {
    return topics;
  }

  public void setTopics(List<String> topics) {
    this.topics = topics;
  }



  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpGoogleDatasetSearchLiveAdvancedRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpGoogleDatasetSearchLiveAdvancedRequestInfo serpGoogleDatasetSearchLiveAdvancedRequestInfo = (SerpGoogleDatasetSearchLiveAdvancedRequestInfo) o;
    return

        Objects.equals(this.keyword, serpGoogleDatasetSearchLiveAdvancedRequestInfo.keyword) &&
        Objects.equals(this.languageCode, serpGoogleDatasetSearchLiveAdvancedRequestInfo.languageCode) &&
        Objects.equals(this.depth, serpGoogleDatasetSearchLiveAdvancedRequestInfo.depth) &&
        Objects.equals(this.device, serpGoogleDatasetSearchLiveAdvancedRequestInfo.device) &&
        Objects.equals(this.languageName, serpGoogleDatasetSearchLiveAdvancedRequestInfo.languageName) &&
        Objects.equals(this.os, serpGoogleDatasetSearchLiveAdvancedRequestInfo.os) &&
        Objects.equals(this.tag, serpGoogleDatasetSearchLiveAdvancedRequestInfo.tag) &&
        Objects.equals(this.lastUpdated, serpGoogleDatasetSearchLiveAdvancedRequestInfo.lastUpdated) &&
        Objects.equals(this.fileFormats, serpGoogleDatasetSearchLiveAdvancedRequestInfo.fileFormats) &&
        Objects.equals(this.usageRights, serpGoogleDatasetSearchLiveAdvancedRequestInfo.usageRights) &&
        Objects.equals(this.isFree, serpGoogleDatasetSearchLiveAdvancedRequestInfo.isFree) &&
        Objects.equals(this.topics, serpGoogleDatasetSearchLiveAdvancedRequestInfo.topics);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, languageCode, depth, device, languageName, os, tag, lastUpdated, fileFormats, usageRights, isFree, topics);
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
    sb.append("class SerpGoogleDatasetSearchLiveAdvancedRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    fileFormats: ").append(toIndentedString(fileFormats)).append("\n");
    sb.append("    usageRights: ").append(toIndentedString(usageRights)).append("\n");
    sb.append("    isFree: ").append(toIndentedString(isFree)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
    
    openapiFields.add("language_code");
    
    openapiFields.add("depth");
    
    openapiFields.add("device");
    
    openapiFields.add("language_name");
    
    openapiFields.add("os");
    
    openapiFields.add("tag");
    
    openapiFields.add("last_updated");
    
    openapiFields.add("file_formats");
    
    openapiFields.add("usage_rights");
    
    openapiFields.add("is_free");
    
    openapiFields.add("topics");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpGoogleDatasetSearchLiveAdvancedRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpGoogleDatasetSearchLiveAdvancedRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpGoogleDatasetSearchLiveAdvancedRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpGoogleDatasetSearchLiveAdvancedRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpGoogleDatasetSearchLiveAdvancedRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpGoogleDatasetSearchLiveAdvancedRequestInfo>() {
           @Override
           public void write(JsonWriter out, SerpGoogleDatasetSearchLiveAdvancedRequestInfo value) throws IOException {
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
           public SerpGoogleDatasetSearchLiveAdvancedRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpGoogleDatasetSearchLiveAdvancedRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpGoogleDatasetSearchLiveAdvancedRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpGoogleDatasetSearchLiveAdvancedRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
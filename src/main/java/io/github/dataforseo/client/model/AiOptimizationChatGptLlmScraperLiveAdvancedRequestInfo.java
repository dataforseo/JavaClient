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


public class AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <em>keyword</em><br><strong>required field</strong><br>you can specify <strong>up to 2000 characters</strong> in the <code>keyword</code> field<br>all %## will be decoded (plus character ‘+’ will be decoded to a space character)<br>if you need to use the “%” character for your <code>keyword</code>, please specify it as “%25”;<br>if you need to use the “+” character for your <code>keyword</code>, please specify it as “%2B”<p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a>
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

  public AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of search engine location</em><br><strong>required field if you don't specify</strong> <code>location_code</code><br><strong>if you use this field, you don't need to specify <code>location_code</code></strong><br>you can receive the list of available locations of the search engine with their <code>location_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/chat_gpt/llm_scraper/locations</code><br>example:<br><code class='long-string'>United States</code>
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

  public AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>search engine location code</em><br><strong>required field if you don't specify</strong> <code>location_name</code><br><strong>if you use this field, you don't need to specify <code>location_name</code></strong><br>you can receive the list of available locations of the search engines with their <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/chat_gpt/llm_scraper/locations</code><br>example:<br><code class='long-string'>2840</code>
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

  public AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search engine language</em><br><strong>required field if you don't specify <code>language_code</code>;</strong><br>if you use this field, you don't need to specify <code>language_code</code>;<br>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/chat_gpt/llm_scraper/languages</code>
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

  public AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search engine language code</em><br><strong>required field if you don't specify <code>language_name</code>;</strong><br>if you use this field, you don't need to specify <code>language_name</code>;<br>you can receive the list of available languages of the search engine with their <code>language_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/chat_gpt/llm_scraper/languages</code>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_FORCE_WEB_SEARCH = "force_web_search";
  @SerializedName(SERIALIZED_NAME_FORCE_WEB_SEARCH)
  private Boolean forceWebSearch;

  public AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo forceWebSearch(Boolean forceWebSearch) {
    this.forceWebSearch = forceWebSearch;
    return this;
  }

  /**
   * <em>force AI agent to use web search</em><br>optional field<br>when enabled, the AI model is forced to access and cite current web information;<br>default value: <code>false</code>;<br><strong>Note:</strong> even if the parameter is set to <code>true</code>, there is no guarantee web sources will be cited in the response
   * @return forceWebSearch
   */
  @javax.annotation.Nullable
  public Boolean getForceWebSearch() {
    return forceWebSearch;
  }

  public void setForceWebSearch(Boolean forceWebSearch) {
    this.forceWebSearch = forceWebSearch;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo tag(String tag) {
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



  public AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo aiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo = (AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo) o;
    return

        Objects.equals(this.keyword, aiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo.keyword) &&
        Objects.equals(this.locationName, aiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo.locationName) &&
        Objects.equals(this.locationCode, aiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo.locationCode) &&
        Objects.equals(this.languageName, aiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo.languageName) &&
        Objects.equals(this.languageCode, aiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo.languageCode) &&
        Objects.equals(this.forceWebSearch, aiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo.forceWebSearch) &&
        Objects.equals(this.tag, aiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, locationName, locationCode, languageName, languageCode, forceWebSearch, tag);
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
    sb.append("class AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    forceWebSearch: ").append(toIndentedString(forceWebSearch)).append("\n");
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
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("force_web_search");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo value) throws IOException {
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
           public AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationChatGptLlmScraperLiveAdvancedRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
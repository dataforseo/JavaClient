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


public class AiOptimizationChatGptLlmScraperTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo keyword(String keyword) {
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


  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <em>task priority</em><br>optional field<br>can take the following values:<br>1 – normal execution priority (set by default)<br>2 – high execution priorityYou will be additionally charged for the tasks with high execution priority.<br>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/ai-optimization/llm-scraper' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo locationName(String locationName) {
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

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo locationCode(Integer locationCode) {
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

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search engine language</em><br>required field if you don't specify <code>language_code</code>;<br>if you use this field, you don't need to specify <code>language_code</code>;<br>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/chat_gpt/llm_scraper/languages</code>
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

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search engine language code</em><br>required field if you don't specify <code>language_name</code>;<br>if you use this field, you don't need to specify <code>language_name</code>;<br>you can receive the list of available languages of the search engine with their <code>language_code</code>_by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/chat_gpt/llm_scraper/languages</code>n
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

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo forceWebSearch(Boolean forceWebSearch) {
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


  public static final String SERIALIZED_NAME_EXPAND_CITATIONS = "expand_citations";
  @SerializedName(SERIALIZED_NAME_EXPAND_CITATIONS)
  private Boolean expandCitations;

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo expandCitations(Boolean expandCitations) {
    this.expandCitations = expandCitations;
    return this;
  }

  /**
   * <em>return expanded citation bar in HTML results</em><br>optional field<br>to enable this parameter, <code>force_web_search</code> must also be enabled;<br>when enabled, the HTML endpoint will return data from the expanded citation bar;<br>default value: <code>false</code>
   * @return expandCitations
   */
  @javax.annotation.Nullable
  public Boolean getExpandCitations() {
    return expandCitations;
  }

  public void setExpandCitations(Boolean expandCitations) {
    this.expandCitations = expandCitations;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo tag(String tag) {
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


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * <em>URL for sending task results</em><br>optional field<br>once the task is completed, we will send a POST request with its results compressed in the <code>gzip</code> format to the <code>postback_url</code> you specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/postbackscript?id=$id</code><br><code>http://your-server.com/postbackscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>postback_url</code> will be urlencoded;<br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
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

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo postbackData(String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * <em>postback_url datatype</em><br><strong>required field if you specify <code>postback_url</code></strong><br>corresponds to the function you used for setting a task<br>possible values:<br><code>advanced</code>, <code>html</code>
   * @return postbackData
   */
  @javax.annotation.Nullable
  public String getPostbackData() {
    return postbackData;
  }

  public void setPostbackData(String postbackData) {
    this.postbackData = postbackData;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * <em>notification URL of a completed task</em><br>optional field<br>when a task is completed we will notify you by GET request sent to the URL you have specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/pingscript?id=$id</code><br><code>http://your-server.com/pingscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>pingback_url</code> will be urlencoded;<br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }



  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationChatGptLlmScraperTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationChatGptLlmScraperTaskPostRequestInfo aiOptimizationChatGptLlmScraperTaskPostRequestInfo = (AiOptimizationChatGptLlmScraperTaskPostRequestInfo) o;
    return

        Objects.equals(this.keyword, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.keyword) &&
        Objects.equals(this.priority, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.priority) &&
        Objects.equals(this.locationName, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.languageName, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.forceWebSearch, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.forceWebSearch) &&
        Objects.equals(this.expandCitations, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.expandCitations) &&
        Objects.equals(this.tag, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.postbackData, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.postbackData) &&
        Objects.equals(this.pingbackUrl, aiOptimizationChatGptLlmScraperTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, priority, locationName, locationCode, languageName, languageCode, forceWebSearch, expandCitations, tag, postbackUrl, postbackData, pingbackUrl);
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
    sb.append("class AiOptimizationChatGptLlmScraperTaskPostRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    forceWebSearch: ").append(toIndentedString(forceWebSearch)).append("\n");
    sb.append("    expandCitations: ").append(toIndentedString(expandCitations)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    postbackData: ").append(toIndentedString(postbackData)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
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
    
    openapiFields.add("priority");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("force_web_search");
    
    openapiFields.add("expand_citations");
    
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
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationChatGptLlmScraperTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationChatGptLlmScraperTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationChatGptLlmScraperTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationChatGptLlmScraperTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationChatGptLlmScraperTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationChatGptLlmScraperTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationChatGptLlmScraperTaskPostRequestInfo value) throws IOException {
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
           public AiOptimizationChatGptLlmScraperTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationChatGptLlmScraperTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationChatGptLlmScraperTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationChatGptLlmScraperTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
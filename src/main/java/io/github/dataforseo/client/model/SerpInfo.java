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


public class SerpInfo  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public SerpInfo seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * <em>search engine type</em>
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public static final String SERIALIZED_NAME_CHECK_URL = "check_url";
  @SerializedName(SERIALIZED_NAME_CHECK_URL)
  private String checkUrl;

  public SerpInfo checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * <em>direct URL to search engine results</em><br>you can use it to make sure that we provided accurate results
   * @return checkUrl
   */
  @javax.annotation.Nullable
  public String getCheckUrl() {
    return checkUrl;
  }

  public void setCheckUrl(String checkUrl) {
    this.checkUrl = checkUrl;
  }


  public static final String SERIALIZED_NAME_SERP_ITEM_TYPES = "serp_item_types";
  @SerializedName(SERIALIZED_NAME_SERP_ITEM_TYPES)
  private List<String> serpItemTypes;

  public SerpInfo serpItemTypes(List<String> serpItemTypes) {
    this.serpItemTypes = serpItemTypes;
    return this;
  }

  /**
   * <em>types of search results in SERP</em><br>contains types of search results (items) found in SERP<br>possible item types:<br><code>answer_box</code>, <code>app</code>, <code>carousel</code>, <code>multi_carousel</code>, <code>featured_snippet</code>, <code>google_flights</code>, <code>google_reviews</code>, <code>third_party_reviews</code>, <code>google_posts</code>, <code>images</code>, <code>jobs</code>, <code>knowledge_graph</code>, <code>local_pack</code>, <code>hotels_pack</code>, <code>map</code>, <code>organic</code>, <code>paid</code>, <code>people_also_ask</code>, <code>related_searches</code>, <code>people_also_search</code>, <code>shopping</code>, <code>top_stories</code>, <code>twitter</code>, <code>video</code>, <code>events</code>, <code>mention_carousel</code>, <code>recipes</code>, <code>top_sights</code>, <code>scholarly_articles</code>, <code>popular_products</code>, <code>podcasts</code>, <code>questions_and_answers</code>, <code>find_results_on</code>, <code>stocks_box</code>, <code>visual_stories</code>, <code>commercial_units</code>, <code>local_services</code>, <code>google_hotels</code>, <code>math_solver</code>, <code>currency_box</code>, <code>product_considerations</code>, <code>found_on_web</code>, <code>short_videos</code>, <code>refine_products</code>, <code>explore_brands</code>, <code>perspectives</code>, <code>discussions_and_forums</code>, <code>compare_sites</code>, <code>courses</code>, <code>ai_overview</code>;<br><strong>note</strong> that the actual results will be returned only for <code>organic</code>, <code>paid</code>, <code>featured_snippet</code>, and <code>local_pack</code> elements
   * @return serpItemTypes
   */
  @javax.annotation.Nullable
  public List<String> getSerpItemTypes() {
    return serpItemTypes;
  }

  public void setSerpItemTypes(List<String> serpItemTypes) {
    this.serpItemTypes = serpItemTypes;
  }


  public static final String SERIALIZED_NAME_SE_RESULTS_COUNT = "se_results_count";
  @SerializedName(SERIALIZED_NAME_SE_RESULTS_COUNT)
  private Long seResultsCount;

  public SerpInfo seResultsCount(Long seResultsCount) {
    this.seResultsCount = seResultsCount;
    return this;
  }

  /**
   * <em>number of search results for the returned keyword</em>
   * @return seResultsCount
   */
  @javax.annotation.Nullable
  public Long getSeResultsCount() {
    return seResultsCount;
  }

  public void setSeResultsCount(Long seResultsCount) {
    this.seResultsCount = seResultsCount;
  }


  public static final String SERIALIZED_NAME_LAST_UPDATED_TIME = "last_updated_time";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_TIME)
  private String lastUpdatedTime;

  public SerpInfo lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * <em>date and time when keyword data was updated</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code>
   * @return lastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_PREVIOUS_UPDATED_TIME = "previous_updated_time";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_UPDATED_TIME)
  private String previousUpdatedTime;

  public SerpInfo previousUpdatedTime(String previousUpdatedTime) {
    this.previousUpdatedTime = previousUpdatedTime;
    return this;
  }

  /**
   * <em>previous to the most recent date and time when SERP data was updated</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-10-15 12:57:46 +00:00</code>
   * @return previousUpdatedTime
   */
  @javax.annotation.Nullable
  public String getPreviousUpdatedTime() {
    return previousUpdatedTime;
  }

  public void setPreviousUpdatedTime(String previousUpdatedTime) {
    this.previousUpdatedTime = previousUpdatedTime;
  }



  public SerpInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpInfo serpInfo = (SerpInfo) o;
    return

        Objects.equals(this.seType, serpInfo.seType) &&
        Objects.equals(this.checkUrl, serpInfo.checkUrl) &&
        Objects.equals(this.serpItemTypes, serpInfo.serpItemTypes) &&
        Objects.equals(this.seResultsCount, serpInfo.seResultsCount) &&
        Objects.equals(this.lastUpdatedTime, serpInfo.lastUpdatedTime) &&
        Objects.equals(this.previousUpdatedTime, serpInfo.previousUpdatedTime);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, checkUrl, serpItemTypes, seResultsCount, lastUpdatedTime, previousUpdatedTime);
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
    sb.append("class SerpInfo {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    serpItemTypes: ").append(toIndentedString(serpItemTypes)).append("\n");
    sb.append("    seResultsCount: ").append(toIndentedString(seResultsCount)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    previousUpdatedTime: ").append(toIndentedString(previousUpdatedTime)).append("\n");
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
    
    openapiFields.add("se_type");
    
    openapiFields.add("check_url");
    
    openapiFields.add("serp_item_types");
    
    openapiFields.add("se_results_count");
    
    openapiFields.add("last_updated_time");
    
    openapiFields.add("previous_updated_time");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpInfo>() {
           @Override
           public void write(JsonWriter out, SerpInfo value) throws IOException {
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
           public SerpInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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



public class RankedSerpElement  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public RankedSerpElement seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * search engine type
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public static final String SERIALIZED_NAME_SERP_ITEM = "serp_item";
  @SerializedName(SERIALIZED_NAME_SERP_ITEM)
  private BaseDataforseoLabsApiElementItem serpItem;

  public RankedSerpElement serpItem(BaseDataforseoLabsApiElementItem serpItem) {
    this.serpItem = serpItem;
    return this;
  }

  /**
   * contains data on the SERP element
* the list of supported SERP elements can be found below
   * @return serpItem
   */
  @javax.annotation.Nullable
  public BaseDataforseoLabsApiElementItem getSerpItem() {
    return serpItem;
  }

  public void setSerpItem(BaseDataforseoLabsApiElementItem serpItem) {
    this.serpItem = serpItem;
  }


  public static final String SERIALIZED_NAME_CHECK_URL = "check_url";
  @SerializedName(SERIALIZED_NAME_CHECK_URL)
  private String checkUrl;

  public RankedSerpElement checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * direct URL to search engine results
* you can use it to make sure that we provided accurate results
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

  public RankedSerpElement serpItemTypes(List<String> serpItemTypes) {
    this.serpItemTypes = serpItemTypes;
    return this;
  }

  /**
   * types of search results in SERP
* contains types of search results (items) found in SERP
* all possible item types can be found here, they include:
* answer_box, app, carousel, multi_carousel, featured_snippet, google_flights, google_reviews, images, jobs, knowledge_graph, local_pack, map, organic, paid, people_also_ask, related_searches, people_also_search, shopping, top_stories, twitter, video, events, mention_carousel, recipes, top_sights, scholarly_articles, popular_products, podcasts, questions_and_answers, find_results_on, stocks_box;
* note that the actual results will be returned only for organic, paid, featured_snippet, local_pack, and ai_overview_reference elements
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

  public RankedSerpElement seResultsCount(Long seResultsCount) {
    this.seResultsCount = seResultsCount;
    return this;
  }

  /**
   * number of search results for the returned keyword
   * @return seResultsCount
   */
  @javax.annotation.Nullable
  public Long getSeResultsCount() {
    return seResultsCount;
  }

  public void setSeResultsCount(Long seResultsCount) {
    this.seResultsCount = seResultsCount;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DIFFICULTY = "keyword_difficulty";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DIFFICULTY)
  private Integer keywordDifficulty;

  public RankedSerpElement keywordDifficulty(Integer keywordDifficulty) {
    this.keywordDifficulty = keywordDifficulty;
    return this;
  }

  /**
   * difficulty of ranking in the first top-10 organic results for a keyword
* indicates the chance of getting in top-10 organic results for a keyword on a logarithmic scale from 0 to 100;
* calculated by analysing, among other parameters, link profiles of the first 10 pages in SERP;
* learn more about the metric in this help center guide
   * @return keywordDifficulty
   */
  @javax.annotation.Nullable
  public Integer getKeywordDifficulty() {
    return keywordDifficulty;
  }

  public void setKeywordDifficulty(Integer keywordDifficulty) {
    this.keywordDifficulty = keywordDifficulty;
  }


  public static final String SERIALIZED_NAME_IS_LOST = "is_lost";
  @SerializedName(SERIALIZED_NAME_IS_LOST)
  private Boolean isLost;

  public RankedSerpElement isLost(Boolean isLost) {
    this.isLost = isLost;
    return this;
  }

  /**
   * lost ranked elements
* indicates how many ranked elements of this target were previously presented in SERPs, but weren’t found during the last check
   * @return isLost
   */
  @javax.annotation.Nullable
  public Boolean getIsLost() {
    return isLost;
  }

  public void setIsLost(Boolean isLost) {
    this.isLost = isLost;
  }


  public static final String SERIALIZED_NAME_LAST_UPDATED_TIME = "last_updated_time";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_TIME)
  private String lastUpdatedTime;

  public RankedSerpElement lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * date and time when SERP data was updated
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
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

  public RankedSerpElement previousUpdatedTime(String previousUpdatedTime) {
    this.previousUpdatedTime = previousUpdatedTime;
    return this;
  }

  /**
   * previous to the most recent date and time when SERP data was updated
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-10-15 12:57:46 +00:00
   * @return previousUpdatedTime
   */
  @javax.annotation.Nullable
  public String getPreviousUpdatedTime() {
    return previousUpdatedTime;
  }

  public void setPreviousUpdatedTime(String previousUpdatedTime) {
    this.previousUpdatedTime = previousUpdatedTime;
  }



  public RankedSerpElement() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public RankedSerpElement putAdditionalProperty(String key, Object value) {
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


    
    RankedSerpElement rankedSerpElement = (RankedSerpElement) o;
    return

        Objects.equals(this.seType, rankedSerpElement.seType) &&
        Objects.equals(this.serpItem, rankedSerpElement.serpItem) &&
        Objects.equals(this.checkUrl, rankedSerpElement.checkUrl) &&
        Objects.equals(this.serpItemTypes, rankedSerpElement.serpItemTypes) &&
        Objects.equals(this.seResultsCount, rankedSerpElement.seResultsCount) &&
        Objects.equals(this.keywordDifficulty, rankedSerpElement.keywordDifficulty) &&
        Objects.equals(this.isLost, rankedSerpElement.isLost) &&
        Objects.equals(this.lastUpdatedTime, rankedSerpElement.lastUpdatedTime) &&
        Objects.equals(this.previousUpdatedTime, rankedSerpElement.previousUpdatedTime);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, serpItem, checkUrl, serpItemTypes, seResultsCount, keywordDifficulty, isLost, lastUpdatedTime, previousUpdatedTime);
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
    sb.append("class RankedSerpElement {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    serpItem: ").append(toIndentedString(serpItem)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    serpItemTypes: ").append(toIndentedString(serpItemTypes)).append("\n");
    sb.append("    seResultsCount: ").append(toIndentedString(seResultsCount)).append("\n");
    sb.append("    keywordDifficulty: ").append(toIndentedString(keywordDifficulty)).append("\n");
    sb.append("    isLost: ").append(toIndentedString(isLost)).append("\n");
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
    
    openapiFields.add("serp_item");
    
    openapiFields.add("check_url");
    
    openapiFields.add("serp_item_types");
    
    openapiFields.add("se_results_count");
    
    openapiFields.add("keyword_difficulty");
    
    openapiFields.add("is_lost");
    
    openapiFields.add("last_updated_time");
    
    openapiFields.add("previous_updated_time");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RankedSerpElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RankedSerpElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RankedSerpElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RankedSerpElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RankedSerpElement.class));

       return (TypeAdapter<T>) new TypeAdapter<RankedSerpElement>() {
           @Override
           public void write(JsonWriter out, RankedSerpElement value) throws IOException {
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
           public RankedSerpElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RankedSerpElement instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static RankedSerpElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RankedSerpElement.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
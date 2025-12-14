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



public class AiOptimizationLlmMentionsSearchLiveItem  {


  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public AiOptimizationLlmMentionsSearchLiveItem platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * platform received in a POST array
   * @return platform
   */
  @javax.annotation.Nullable
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public AiOptimizationLlmMentionsSearchLiveItem locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code in a POST array
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

  public AiOptimizationLlmMentionsSearchLiveItem languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code in a POST array
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_QUESTION = "question";
  @SerializedName(SERIALIZED_NAME_QUESTION)
  private String question;

  public AiOptimizationLlmMentionsSearchLiveItem question(String question) {
    this.question = question;
    return this;
  }

  /**
   * relevant question
   * @return question
   */
  @javax.annotation.Nullable
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }


  public static final String SERIALIZED_NAME_ANSWER = "answer";
  @SerializedName(SERIALIZED_NAME_ANSWER)
  private String answer;

  public AiOptimizationLlmMentionsSearchLiveItem answer(String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * relevant answer in markdown format
* content of the result formatted in the markdown markup language
   * @return answer
   */
  @javax.annotation.Nullable
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }


  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<Sources> sources;

  public AiOptimizationLlmMentionsSearchLiveItem sources(List<Sources> sources) {
    this.sources = sources;
    return this;
  }

  /**
   * array of sources
* the sources the model cited or relied on in its final answer
   * @return sources
   */
  @javax.annotation.Nullable
  public List<Sources> getSources() {
    return sources;
  }

  public void setSources(List<Sources> sources) {
    this.sources = sources;
  }


  public static final String SERIALIZED_NAME_SEARCH_RESULTS = "search_results";
  @SerializedName(SERIALIZED_NAME_SEARCH_RESULTS)
  private List<SearchResults> searchResults;

  public AiOptimizationLlmMentionsSearchLiveItem searchResults(List<SearchResults> searchResults) {
    this.searchResults = searchResults;
    return this;
  }

  /**
   * array of search results
* all web search outputs the model retrieved when looking up information, including duplicates and unused entries
   * @return searchResults
   */
  @javax.annotation.Nullable
  public List<SearchResults> getSearchResults() {
    return searchResults;
  }

  public void setSearchResults(List<SearchResults> searchResults) {
    this.searchResults = searchResults;
  }


  public static final String SERIALIZED_NAME_AI_SEARCH_VOLUME = "ai_search_volume";
  @SerializedName(SERIALIZED_NAME_AI_SEARCH_VOLUME)
  private Long aiSearchVolume;

  public AiOptimizationLlmMentionsSearchLiveItem aiSearchVolume(Long aiSearchVolume) {
    this.aiSearchVolume = aiSearchVolume;
    return this;
  }

  /**
   * current AI search volume rate of a keyword
* learn more about this metric here
   * @return aiSearchVolume
   */
  @javax.annotation.Nullable
  public Long getAiSearchVolume() {
    return aiSearchVolume;
  }

  public void setAiSearchVolume(Long aiSearchVolume) {
    this.aiSearchVolume = aiSearchVolume;
  }


  public static final String SERIALIZED_NAME_MONTHLY_SEARCHES = "monthly_searches";
  @SerializedName(SERIALIZED_NAME_MONTHLY_SEARCHES)
  private List<MonthlySearchesInfo> monthlySearches;

  public AiOptimizationLlmMentionsSearchLiveItem monthlySearches(List<MonthlySearchesInfo> monthlySearches) {
    this.monthlySearches = monthlySearches;
    return this;
  }

  /**
   * 
   * @return monthlySearches
   */
  @javax.annotation.Nullable
  public List<MonthlySearchesInfo> getMonthlySearches() {
    return monthlySearches;
  }

  public void setMonthlySearches(List<MonthlySearchesInfo> monthlySearches) {
    this.monthlySearches = monthlySearches;
  }


  public static final String SERIALIZED_NAME_FIRST_RESPONSE_AT = "first_response_at";
  @SerializedName(SERIALIZED_NAME_FIRST_RESPONSE_AT)
  private String firstResponseAt;

  public AiOptimizationLlmMentionsSearchLiveItem firstResponseAt(String firstResponseAt) {
    this.firstResponseAt = firstResponseAt;
    return this;
  }

  /**
   * date and time when the response data was first recorded
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2025-10-21 06:25:30 +00:00
   * @return firstResponseAt
   */
  @javax.annotation.Nullable
  public String getFirstResponseAt() {
    return firstResponseAt;
  }

  public void setFirstResponseAt(String firstResponseAt) {
    this.firstResponseAt = firstResponseAt;
  }


  public static final String SERIALIZED_NAME_LAST_RESPONSE_AT = "last_response_at";
  @SerializedName(SERIALIZED_NAME_LAST_RESPONSE_AT)
  private String lastResponseAt;

  public AiOptimizationLlmMentionsSearchLiveItem lastResponseAt(String lastResponseAt) {
    this.lastResponseAt = lastResponseAt;
    return this;
  }

  /**
   * date and time when the response data was last updated
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2025-10-21 06:25:30 +00:00
   * @return lastResponseAt
   */
  @javax.annotation.Nullable
  public String getLastResponseAt() {
    return lastResponseAt;
  }

  public void setLastResponseAt(String lastResponseAt) {
    this.lastResponseAt = lastResponseAt;
  }


  public static final String SERIALIZED_NAME_BRAND_ENTITIES = "brand_entities";
  @SerializedName(SERIALIZED_NAME_BRAND_ENTITIES)
  private List<BrandEntities> brandEntities;

  public AiOptimizationLlmMentionsSearchLiveItem brandEntities(List<BrandEntities> brandEntities) {
    this.brandEntities = brandEntities;
    return this;
  }

  /**
   * array of brand entities
* contains information on brands mentioned in the response
   * @return brandEntities
   */
  @javax.annotation.Nullable
  public List<BrandEntities> getBrandEntities() {
    return brandEntities;
  }

  public void setBrandEntities(List<BrandEntities> brandEntities) {
    this.brandEntities = brandEntities;
  }


  public static final String SERIALIZED_NAME_FAN_OUT_QUERIES = "fan_out_queries";
  @SerializedName(SERIALIZED_NAME_FAN_OUT_QUERIES)
  private List<String> fanOutQueries;

  public AiOptimizationLlmMentionsSearchLiveItem fanOutQueries(List<String> fanOutQueries) {
    this.fanOutQueries = fanOutQueries;
    return this;
  }

  /**
   * array of fan-out queries
* contains related search queries derived from the main query to provide a more comprehensive response
   * @return fanOutQueries
   */
  @javax.annotation.Nullable
  public List<String> getFanOutQueries() {
    return fanOutQueries;
  }

  public void setFanOutQueries(List<String> fanOutQueries) {
    this.fanOutQueries = fanOutQueries;
  }



  public AiOptimizationLlmMentionsSearchLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationLlmMentionsSearchLiveItem putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationLlmMentionsSearchLiveItem aiOptimizationLlmMentionsSearchLiveItem = (AiOptimizationLlmMentionsSearchLiveItem) o;
    return

        Objects.equals(this.platform, aiOptimizationLlmMentionsSearchLiveItem.platform) &&
        Objects.equals(this.locationCode, aiOptimizationLlmMentionsSearchLiveItem.locationCode) &&
        Objects.equals(this.languageCode, aiOptimizationLlmMentionsSearchLiveItem.languageCode) &&
        Objects.equals(this.question, aiOptimizationLlmMentionsSearchLiveItem.question) &&
        Objects.equals(this.answer, aiOptimizationLlmMentionsSearchLiveItem.answer) &&
        Objects.equals(this.sources, aiOptimizationLlmMentionsSearchLiveItem.sources) &&
        Objects.equals(this.searchResults, aiOptimizationLlmMentionsSearchLiveItem.searchResults) &&
        Objects.equals(this.aiSearchVolume, aiOptimizationLlmMentionsSearchLiveItem.aiSearchVolume) &&
        Objects.equals(this.monthlySearches, aiOptimizationLlmMentionsSearchLiveItem.monthlySearches) &&
        Objects.equals(this.firstResponseAt, aiOptimizationLlmMentionsSearchLiveItem.firstResponseAt) &&
        Objects.equals(this.lastResponseAt, aiOptimizationLlmMentionsSearchLiveItem.lastResponseAt) &&
        Objects.equals(this.brandEntities, aiOptimizationLlmMentionsSearchLiveItem.brandEntities) &&
        Objects.equals(this.fanOutQueries, aiOptimizationLlmMentionsSearchLiveItem.fanOutQueries);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(platform, locationCode, languageCode, question, answer, sources, searchResults, aiSearchVolume, monthlySearches, firstResponseAt, lastResponseAt, brandEntities, fanOutQueries);
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
    sb.append("class AiOptimizationLlmMentionsSearchLiveItem {\n");

    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    searchResults: ").append(toIndentedString(searchResults)).append("\n");
    sb.append("    aiSearchVolume: ").append(toIndentedString(aiSearchVolume)).append("\n");
    sb.append("    monthlySearches: ").append(toIndentedString(monthlySearches)).append("\n");
    sb.append("    firstResponseAt: ").append(toIndentedString(firstResponseAt)).append("\n");
    sb.append("    lastResponseAt: ").append(toIndentedString(lastResponseAt)).append("\n");
    sb.append("    brandEntities: ").append(toIndentedString(brandEntities)).append("\n");
    sb.append("    fanOutQueries: ").append(toIndentedString(fanOutQueries)).append("\n");
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
    
    openapiFields.add("platform");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_code");
    
    openapiFields.add("question");
    
    openapiFields.add("answer");
    
    openapiFields.add("sources");
    
    openapiFields.add("search_results");
    
    openapiFields.add("ai_search_volume");
    
    openapiFields.add("monthly_searches");
    
    openapiFields.add("first_response_at");
    
    openapiFields.add("last_response_at");
    
    openapiFields.add("brand_entities");
    
    openapiFields.add("fan_out_queries");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationLlmMentionsSearchLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationLlmMentionsSearchLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationLlmMentionsSearchLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationLlmMentionsSearchLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationLlmMentionsSearchLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationLlmMentionsSearchLiveItem>() {
           @Override
           public void write(JsonWriter out, AiOptimizationLlmMentionsSearchLiveItem value) throws IOException {
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
           public AiOptimizationLlmMentionsSearchLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationLlmMentionsSearchLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationLlmMentionsSearchLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationLlmMentionsSearchLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
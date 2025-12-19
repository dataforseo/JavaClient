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



public class AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword received in a POST array
* the keyword is returned with decoded %## (plus symbol ‘+’ will be decoded to a space character)
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

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo locationCode(Integer locationCode) {
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

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo languageCode(String languageCode) {
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


  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo model(String model) {
    this.model = model;
    return this;
  }

  /**
   * indicates the model version
   * @return model
   */
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public static final String SERIALIZED_NAME_CHECK_URL = "check_url";
  @SerializedName(SERIALIZED_NAME_CHECK_URL)
  private String checkUrl;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * direct URL to search engine results
* you can use it to make sure that we provided exact results
   * @return checkUrl
   */
  @javax.annotation.Nullable
  public String getCheckUrl() {
    return checkUrl;
  }

  public void setCheckUrl(String checkUrl) {
    this.checkUrl = checkUrl;
  }


  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private String datetime;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * date and time when the result was received
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return datetime
   */
  @javax.annotation.Nullable
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }


  public static final String SERIALIZED_NAME_MARKDOWN = "markdown";
  @SerializedName(SERIALIZED_NAME_MARKDOWN)
  private String markdown;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo markdown(String markdown) {
    this.markdown = markdown;
    return this;
  }

  /**
   * content of the element in markdown format
* content of the result formatted in the markdown markup language
   * @return markdown
   */
  @javax.annotation.Nullable
  public String getMarkdown() {
    return markdown;
  }

  public void setMarkdown(String markdown) {
    this.markdown = markdown;
  }


  public static final String SERIALIZED_NAME_SEARCH_RESULTS = "search_results";
  @SerializedName(SERIALIZED_NAME_SEARCH_RESULTS)
  private List<ChatgptSearchResult> searchResults;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo searchResults(List<ChatgptSearchResult> searchResults) {
    this.searchResults = searchResults;
    return this;
  }

  /**
   * array of search results
* all web search outputs the model retrieved when looking up information, including duplicates and unused entries
   * @return searchResults
   */
  @javax.annotation.Nullable
  public List<ChatgptSearchResult> getSearchResults() {
    return searchResults;
  }

  public void setSearchResults(List<ChatgptSearchResult> searchResults) {
    this.searchResults = searchResults;
  }


  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<ChatGptSource> sources;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo sources(List<ChatGptSource> sources) {
    this.sources = sources;
    return this;
  }

  /**
   * array of sources
* the sources the model actually cited or relied on in its final answer
   * @return sources
   */
  @javax.annotation.Nullable
  public List<ChatGptSource> getSources() {
    return sources;
  }

  public void setSources(List<ChatGptSource> sources) {
    this.sources = sources;
  }


  public static final String SERIALIZED_NAME_FAN_OUT_QUERIES = "fan_out_queries";
  @SerializedName(SERIALIZED_NAME_FAN_OUT_QUERIES)
  private List<String> fanOutQueries;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo fanOutQueries(List<String> fanOutQueries) {
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


  public static final String SERIALIZED_NAME_BRAND_ENTITIES = "brand_entities";
  @SerializedName(SERIALIZED_NAME_BRAND_ENTITIES)
  private List<ChatGptBrandEntity> brandEntities;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo brandEntities(List<ChatGptBrandEntity> brandEntities) {
    this.brandEntities = brandEntities;
    return this;
  }

  /**
   * array of brand entities
* contains information on brands mentioned in the response
   * @return brandEntities
   */
  @javax.annotation.Nullable
  public List<ChatGptBrandEntity> getBrandEntities() {
    return brandEntities;
  }

  public void setBrandEntities(List<ChatGptBrandEntity> brandEntities) {
    this.brandEntities = brandEntities;
  }


  public static final String SERIALIZED_NAME_SE_RESULTS_COUNT = "se_results_count";
  @SerializedName(SERIALIZED_NAME_SE_RESULTS_COUNT)
  private Long seResultsCount;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo seResultsCount(Long seResultsCount) {
    this.seResultsCount = seResultsCount;
    return this;
  }

  /**
   * total number of results
   * @return seResultsCount
   */
  @javax.annotation.Nullable
  public Long getSeResultsCount() {
    return seResultsCount;
  }

  public void setSeResultsCount(Long seResultsCount) {
    this.seResultsCount = seResultsCount;
  }


  public static final String SERIALIZED_NAME_ITEM_TYPES = "item_types";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPES)
  private List<String> itemTypes;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  /**
   * types of search results
* contains types of search results (items) found in SERP.
* possible item types:
* chat_gpt_text, chat_gpt_table, chat_gpt_navigation_list, chat_gpt_images, chat_gpt_local_businesses, chat_gpt_products
   * @return itemTypes
   */
  @javax.annotation.Nullable
  public List<String> getItemTypes() {
    return itemTypes;
  }

  public void setItemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  /**
   * the number of results returned in the items array
   * @return itemsCount
   */
  @javax.annotation.Nullable
  public Long getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
  }


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<BaseChatGptLlmScraperElementItem> items;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo items(List<BaseChatGptLlmScraperElementItem> items) {
    this.items = items;
    return this;
  }

  /**
   * items present in the element
   * @return items
   */
  @javax.annotation.Nullable
  public List<BaseChatGptLlmScraperElementItem> getItems() {
    return items;
  }

  public void setItems(List<BaseChatGptLlmScraperElementItem> items) {
    this.items = items;
  }



  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo = (AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo) o;
    return

        Objects.equals(this.keyword, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.keyword) &&
        Objects.equals(this.locationCode, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.locationCode) &&
        Objects.equals(this.languageCode, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.languageCode) &&
        Objects.equals(this.model, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.model) &&
        Objects.equals(this.checkUrl, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.checkUrl) &&
        Objects.equals(this.datetime, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.datetime) &&
        Objects.equals(this.markdown, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.markdown) &&
        Objects.equals(this.searchResults, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.searchResults) &&
        Objects.equals(this.sources, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.sources) &&
        Objects.equals(this.fanOutQueries, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.fanOutQueries) &&
        Objects.equals(this.brandEntities, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.brandEntities) &&
        Objects.equals(this.seResultsCount, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.seResultsCount) &&
        Objects.equals(this.itemTypes, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.itemTypes) &&
        Objects.equals(this.itemsCount, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.itemsCount) &&
        Objects.equals(this.items, aiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, locationCode, languageCode, model, checkUrl, datetime, markdown, searchResults, sources, fanOutQueries, brandEntities, seResultsCount, itemTypes, itemsCount, items);
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
    sb.append("class AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    markdown: ").append(toIndentedString(markdown)).append("\n");
    sb.append("    searchResults: ").append(toIndentedString(searchResults)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    fanOutQueries: ").append(toIndentedString(fanOutQueries)).append("\n");
    sb.append("    brandEntities: ").append(toIndentedString(brandEntities)).append("\n");
    sb.append("    seResultsCount: ").append(toIndentedString(seResultsCount)).append("\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    
    openapiFields.add("model");
    
    openapiFields.add("check_url");
    
    openapiFields.add("datetime");
    
    openapiFields.add("markdown");
    
    openapiFields.add("search_results");
    
    openapiFields.add("sources");
    
    openapiFields.add("fan_out_queries");
    
    openapiFields.add("brand_entities");
    
    openapiFields.add("se_results_count");
    
    openapiFields.add("item_types");
    
    openapiFields.add("items_count");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo value) throws IOException {
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
           public AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationChatGptLlmScraperLiveAdvancedResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
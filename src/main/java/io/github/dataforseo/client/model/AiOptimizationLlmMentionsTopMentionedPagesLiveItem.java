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


public class AiOptimizationLlmMentionsTopMentionedPagesLiveItem  {


  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private String page;

  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem page(String page) {
    this.page = page;
    return this;
  }

  /**
   * <em>URL of a found page</em><br>the URL of a page found in LLM mentions for the specified target
   * @return page
   */
  @javax.annotation.Nullable
  public String getPage() {
    return page;
  }

  public void setPage(String page) {
    this.page = page;
  }


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private List<AggregatedMetricsItemInfo> location;

  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem location(List<AggregatedMetricsItemInfo> location) {
    this.location = location;
    return this;
  }

  /**
   * <em>location-based grouping</em><br>array of objects containing mention metrics segmented by geographical location
   * @return location
   */
  @javax.annotation.Nullable
  public List<AggregatedMetricsItemInfo> getLocation() {
    return location;
  }

  public void setLocation(List<AggregatedMetricsItemInfo> location) {
    this.location = location;
  }


  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private List<AggregatedMetricsItemInfo> language;

  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem language(List<AggregatedMetricsItemInfo> language) {
    this.language = language;
    return this;
  }

  /**
   * <em>language-based grouping</em><br>array of objects containing mention metrics segmented by content language
   * @return language
   */
  @javax.annotation.Nullable
  public List<AggregatedMetricsItemInfo> getLanguage() {
    return language;
  }

  public void setLanguage(List<AggregatedMetricsItemInfo> language) {
    this.language = language;
  }


  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<AggregatedMetricsItemInfo> platform;

  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem platform(List<AggregatedMetricsItemInfo> platform) {
    this.platform = platform;
    return this;
  }

  /**
   * <em>platform-based grouping</em><br>array of group elements containing mention metrics segmented by AI platform
   * @return platform
   */
  @javax.annotation.Nullable
  public List<AggregatedMetricsItemInfo> getPlatform() {
    return platform;
  }

  public void setPlatform(List<AggregatedMetricsItemInfo> platform) {
    this.platform = platform;
  }


  public static final String SERIALIZED_NAME_SOURCES_DOMAIN = "sources_domain";
  @SerializedName(SERIALIZED_NAME_SOURCES_DOMAIN)
  private List<AggregatedMetricsItemInfo> sourcesDomain;

  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem sourcesDomain(List<AggregatedMetricsItemInfo> sourcesDomain) {
    this.sourcesDomain = sourcesDomain;
    return this;
  }

  /**
   * <em>found top source domains relevant to the target</em><br>array of objects containing data on top domains that are cited as sources in LLM responses<br>learn more about the sources and how to retrieve LLM citation data at our <a href='https://dataforseo.com/help-center/how-to-get-llm-citation-data-with-llm-mentions-api' target='_blank'>Help Center</a>
   * @return sourcesDomain
   */
  @javax.annotation.Nullable
  public List<AggregatedMetricsItemInfo> getSourcesDomain() {
    return sourcesDomain;
  }

  public void setSourcesDomain(List<AggregatedMetricsItemInfo> sourcesDomain) {
    this.sourcesDomain = sourcesDomain;
  }


  public static final String SERIALIZED_NAME_SEARCH_RESULTS_DOMAIN = "search_results_domain";
  @SerializedName(SERIALIZED_NAME_SEARCH_RESULTS_DOMAIN)
  private List<AggregatedMetricsItemInfo> searchResultsDomain;

  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem searchResultsDomain(List<AggregatedMetricsItemInfo> searchResultsDomain) {
    this.searchResultsDomain = searchResultsDomain;
    return this;
  }

  /**
   * <em>found top search results domains relevant to the target</em><br>array of objects containing data on top domains that appear in search results related to LLM queries
   * @return searchResultsDomain
   */
  @javax.annotation.Nullable
  public List<AggregatedMetricsItemInfo> getSearchResultsDomain() {
    return searchResultsDomain;
  }

  public void setSearchResultsDomain(List<AggregatedMetricsItemInfo> searchResultsDomain) {
    this.searchResultsDomain = searchResultsDomain;
  }


  public static final String SERIALIZED_NAME_BRAND_ENTITIES_TITLE = "brand_entities_title";
  @SerializedName(SERIALIZED_NAME_BRAND_ENTITIES_TITLE)
  private List<AggregatedMetricsItemInfo> brandEntitiesTitle;

  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem brandEntitiesTitle(List<AggregatedMetricsItemInfo> brandEntitiesTitle) {
    this.brandEntitiesTitle = brandEntitiesTitle;
    return this;
  }

  /**
   * <em>data on brand entities relevant to the target</em><br>array of objects containing data on brand entity titles that appear in search results related to LLM queries
   * @return brandEntitiesTitle
   */
  @javax.annotation.Nullable
  public List<AggregatedMetricsItemInfo> getBrandEntitiesTitle() {
    return brandEntitiesTitle;
  }

  public void setBrandEntitiesTitle(List<AggregatedMetricsItemInfo> brandEntitiesTitle) {
    this.brandEntitiesTitle = brandEntitiesTitle;
  }


  public static final String SERIALIZED_NAME_BRAND_ENTITIES_CATEGORY = "brand_entities_category";
  @SerializedName(SERIALIZED_NAME_BRAND_ENTITIES_CATEGORY)
  private List<AggregatedMetricsItemInfo> brandEntitiesCategory;

  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem brandEntitiesCategory(List<AggregatedMetricsItemInfo> brandEntitiesCategory) {
    this.brandEntitiesCategory = brandEntitiesCategory;
    return this;
  }

  /**
   * <em>data on brand entities relevant to the target</em><br>array of objects containing data on brand entity categories that appear in search results related to LLM queries
   * @return brandEntitiesCategory
   */
  @javax.annotation.Nullable
  public List<AggregatedMetricsItemInfo> getBrandEntitiesCategory() {
    return brandEntitiesCategory;
  }

  public void setBrandEntitiesCategory(List<AggregatedMetricsItemInfo> brandEntitiesCategory) {
    this.brandEntitiesCategory = brandEntitiesCategory;
  }


  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private AggregatedMetricsInfoTotalInfo total;

  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem total(AggregatedMetricsInfoTotalInfo total) {
    this.total = total;
    return this;
  }

  /**
   * <em>aggregated mentions metrics summary</em><br>contains overall aggregated LLM mention metrics across all dimensions
   * @return total
   */
  @javax.annotation.Nullable
  public AggregatedMetricsInfoTotalInfo getTotal() {
    return total;
  }

  public void setTotal(AggregatedMetricsInfoTotalInfo total) {
    this.total = total;
  }



  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationLlmMentionsTopMentionedPagesLiveItem putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationLlmMentionsTopMentionedPagesLiveItem aiOptimizationLlmMentionsTopMentionedPagesLiveItem = (AiOptimizationLlmMentionsTopMentionedPagesLiveItem) o;
    return

        Objects.equals(this.page, aiOptimizationLlmMentionsTopMentionedPagesLiveItem.page) &&
        Objects.equals(this.location, aiOptimizationLlmMentionsTopMentionedPagesLiveItem.location) &&
        Objects.equals(this.language, aiOptimizationLlmMentionsTopMentionedPagesLiveItem.language) &&
        Objects.equals(this.platform, aiOptimizationLlmMentionsTopMentionedPagesLiveItem.platform) &&
        Objects.equals(this.sourcesDomain, aiOptimizationLlmMentionsTopMentionedPagesLiveItem.sourcesDomain) &&
        Objects.equals(this.searchResultsDomain, aiOptimizationLlmMentionsTopMentionedPagesLiveItem.searchResultsDomain) &&
        Objects.equals(this.brandEntitiesTitle, aiOptimizationLlmMentionsTopMentionedPagesLiveItem.brandEntitiesTitle) &&
        Objects.equals(this.brandEntitiesCategory, aiOptimizationLlmMentionsTopMentionedPagesLiveItem.brandEntitiesCategory) &&
        Objects.equals(this.total, aiOptimizationLlmMentionsTopMentionedPagesLiveItem.total);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(page, location, language, platform, sourcesDomain, searchResultsDomain, brandEntitiesTitle, brandEntitiesCategory, total);
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
    sb.append("class AiOptimizationLlmMentionsTopMentionedPagesLiveItem {\n");

    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    sourcesDomain: ").append(toIndentedString(sourcesDomain)).append("\n");
    sb.append("    searchResultsDomain: ").append(toIndentedString(searchResultsDomain)).append("\n");
    sb.append("    brandEntitiesTitle: ").append(toIndentedString(brandEntitiesTitle)).append("\n");
    sb.append("    brandEntitiesCategory: ").append(toIndentedString(brandEntitiesCategory)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    
    openapiFields.add("page");
    
    openapiFields.add("location");
    
    openapiFields.add("language");
    
    openapiFields.add("platform");
    
    openapiFields.add("sources_domain");
    
    openapiFields.add("search_results_domain");
    
    openapiFields.add("brand_entities_title");
    
    openapiFields.add("brand_entities_category");
    
    openapiFields.add("total");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationLlmMentionsTopMentionedPagesLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationLlmMentionsTopMentionedPagesLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationLlmMentionsTopMentionedPagesLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationLlmMentionsTopMentionedPagesLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationLlmMentionsTopMentionedPagesLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationLlmMentionsTopMentionedPagesLiveItem>() {
           @Override
           public void write(JsonWriter out, AiOptimizationLlmMentionsTopMentionedPagesLiveItem value) throws IOException {
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
           public AiOptimizationLlmMentionsTopMentionedPagesLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationLlmMentionsTopMentionedPagesLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationLlmMentionsTopMentionedPagesLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationLlmMentionsTopMentionedPagesLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
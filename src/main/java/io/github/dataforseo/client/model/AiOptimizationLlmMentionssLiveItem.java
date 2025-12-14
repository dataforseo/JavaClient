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



public class AiOptimizationLlmMentionssLiveItem  {


  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public AiOptimizationLlmMentionssLiveItem key(String key) {
    this.key = key;
    return this;
  }

  /**
   * URL of a found page
* the URL of a page found in LLM mentions for the specified target
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private List<GroupElement> location;

  public AiOptimizationLlmMentionssLiveItem location(List<GroupElement> location) {
    this.location = location;
    return this;
  }

  /**
   * location-based grouping
* array of objects containing page mention metrics segmented by geographical location
   * @return location
   */
  @javax.annotation.Nullable
  public List<GroupElement> getLocation() {
    return location;
  }

  public void setLocation(List<GroupElement> location) {
    this.location = location;
  }


  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private List<GroupElement> language;

  public AiOptimizationLlmMentionssLiveItem language(List<GroupElement> language) {
    this.language = language;
    return this;
  }

  /**
   * language-based grouping
* array of objects containing page mention metrics segmented by content language
   * @return language
   */
  @javax.annotation.Nullable
  public List<GroupElement> getLanguage() {
    return language;
  }

  public void setLanguage(List<GroupElement> language) {
    this.language = language;
  }


  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<GroupElement> platform;

  public AiOptimizationLlmMentionssLiveItem platform(List<GroupElement> platform) {
    this.platform = platform;
    return this;
  }

  /**
   * platform-based grouping
* array of group elements containing page mention metrics segmented by AI platform
   * @return platform
   */
  @javax.annotation.Nullable
  public List<GroupElement> getPlatform() {
    return platform;
  }

  public void setPlatform(List<GroupElement> platform) {
    this.platform = platform;
  }


  public static final String SERIALIZED_NAME_SOURCES_DOMAIN = "sources_domain";
  @SerializedName(SERIALIZED_NAME_SOURCES_DOMAIN)
  private List<GroupElement> sourcesDomain;

  public AiOptimizationLlmMentionssLiveItem sourcesDomain(List<GroupElement> sourcesDomain) {
    this.sourcesDomain = sourcesDomain;
    return this;
  }

  /**
   * source domains relevant to the specific page
* array of objects containing data on domains that are cited as sources in LLM responses
   * @return sourcesDomain
   */
  @javax.annotation.Nullable
  public List<GroupElement> getSourcesDomain() {
    return sourcesDomain;
  }

  public void setSourcesDomain(List<GroupElement> sourcesDomain) {
    this.sourcesDomain = sourcesDomain;
  }


  public static final String SERIALIZED_NAME_SEARCH_RESULTS_DOMAIN = "search_results_domain";
  @SerializedName(SERIALIZED_NAME_SEARCH_RESULTS_DOMAIN)
  private List<GroupElement> searchResultsDomain;

  public AiOptimizationLlmMentionssLiveItem searchResultsDomain(List<GroupElement> searchResultsDomain) {
    this.searchResultsDomain = searchResultsDomain;
    return this;
  }

  /**
   * search results domains relevant to the specific page
* array of objects containing data on domains that appear in search results related to LLM queries
   * @return searchResultsDomain
   */
  @javax.annotation.Nullable
  public List<GroupElement> getSearchResultsDomain() {
    return searchResultsDomain;
  }

  public void setSearchResultsDomain(List<GroupElement> searchResultsDomain) {
    this.searchResultsDomain = searchResultsDomain;
  }


  public static final String SERIALIZED_NAME_BRAND_ENTITIES_TITLE = "brand_entities_title";
  @SerializedName(SERIALIZED_NAME_BRAND_ENTITIES_TITLE)
  private List<GroupElement> brandEntitiesTitle;

  public AiOptimizationLlmMentionssLiveItem brandEntitiesTitle(List<GroupElement> brandEntitiesTitle) {
    this.brandEntitiesTitle = brandEntitiesTitle;
    return this;
  }

  /**
   * data on brand entities relevant to the target
* array of objects containing data on brand entity titles that appear in search results related to LLM queries
   * @return brandEntitiesTitle
   */
  @javax.annotation.Nullable
  public List<GroupElement> getBrandEntitiesTitle() {
    return brandEntitiesTitle;
  }

  public void setBrandEntitiesTitle(List<GroupElement> brandEntitiesTitle) {
    this.brandEntitiesTitle = brandEntitiesTitle;
  }


  public static final String SERIALIZED_NAME_BRAND_ENTITIES_CATEGORY = "brand_entities_category";
  @SerializedName(SERIALIZED_NAME_BRAND_ENTITIES_CATEGORY)
  private List<GroupElement> brandEntitiesCategory;

  public AiOptimizationLlmMentionssLiveItem brandEntitiesCategory(List<GroupElement> brandEntitiesCategory) {
    this.brandEntitiesCategory = brandEntitiesCategory;
    return this;
  }

  /**
   * data on brand entities relevant to the target
* array of objects containing data on brand entity categories that appear in search results related to LLM queries
   * @return brandEntitiesCategory
   */
  @javax.annotation.Nullable
  public List<GroupElement> getBrandEntitiesCategory() {
    return brandEntitiesCategory;
  }

  public void setBrandEntitiesCategory(List<GroupElement> brandEntitiesCategory) {
    this.brandEntitiesCategory = brandEntitiesCategory;
  }



  public AiOptimizationLlmMentionssLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationLlmMentionssLiveItem putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationLlmMentionssLiveItem aiOptimizationLlmMentionssLiveItem = (AiOptimizationLlmMentionssLiveItem) o;
    return

        Objects.equals(this.key, aiOptimizationLlmMentionssLiveItem.key) &&
        Objects.equals(this.location, aiOptimizationLlmMentionssLiveItem.location) &&
        Objects.equals(this.language, aiOptimizationLlmMentionssLiveItem.language) &&
        Objects.equals(this.platform, aiOptimizationLlmMentionssLiveItem.platform) &&
        Objects.equals(this.sourcesDomain, aiOptimizationLlmMentionssLiveItem.sourcesDomain) &&
        Objects.equals(this.searchResultsDomain, aiOptimizationLlmMentionssLiveItem.searchResultsDomain) &&
        Objects.equals(this.brandEntitiesTitle, aiOptimizationLlmMentionssLiveItem.brandEntitiesTitle) &&
        Objects.equals(this.brandEntitiesCategory, aiOptimizationLlmMentionssLiveItem.brandEntitiesCategory);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(key, location, language, platform, sourcesDomain, searchResultsDomain, brandEntitiesTitle, brandEntitiesCategory);
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
    sb.append("class AiOptimizationLlmMentionssLiveItem {\n");

    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    sourcesDomain: ").append(toIndentedString(sourcesDomain)).append("\n");
    sb.append("    searchResultsDomain: ").append(toIndentedString(searchResultsDomain)).append("\n");
    sb.append("    brandEntitiesTitle: ").append(toIndentedString(brandEntitiesTitle)).append("\n");
    sb.append("    brandEntitiesCategory: ").append(toIndentedString(brandEntitiesCategory)).append("\n");
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
    
    openapiFields.add("key");
    
    openapiFields.add("location");
    
    openapiFields.add("language");
    
    openapiFields.add("platform");
    
    openapiFields.add("sources_domain");
    
    openapiFields.add("search_results_domain");
    
    openapiFields.add("brand_entities_title");
    
    openapiFields.add("brand_entities_category");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationLlmMentionssLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationLlmMentionssLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationLlmMentionssLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationLlmMentionssLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationLlmMentionssLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationLlmMentionssLiveItem>() {
           @Override
           public void write(JsonWriter out, AiOptimizationLlmMentionssLiveItem value) throws IOException {
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
           public AiOptimizationLlmMentionssLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationLlmMentionssLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationLlmMentionssLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationLlmMentionssLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
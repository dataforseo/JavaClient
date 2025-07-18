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



public class BusinessListingAggregationInfo  {


  public static final String SERIALIZED_NAME_TOP_CATEGORIES = "top_categories";
  @SerializedName(SERIALIZED_NAME_TOP_CATEGORIES)
  private Map<String, Long> topCategories;

  public BusinessListingAggregationInfo topCategories(Map<String, Long> topCategories) {
    this.topCategories = topCategories;
    return this;
  }

  /**
   * the most mentioned related categories
* top categories displayed with the number of businesses in each category
   * @return topCategories
   */
  @javax.annotation.Nullable
  public Map<String, Long> getTopCategories() {
    return topCategories;
  }

  public void setTopCategories(Map<String, Long> topCategories) {
    this.topCategories = topCategories;
  }


  public static final String SERIALIZED_NAME_TOP_COUNTRIES = "top_countries";
  @SerializedName(SERIALIZED_NAME_TOP_COUNTRIES)
  private Map<String, Long> topCountries;

  public BusinessListingAggregationInfo topCountries(Map<String, Long> topCountries) {
    this.topCountries = topCountries;
    return this;
  }

  /**
   * the most mentioned counties
* country codes with the biggest number of businesses in the category
   * @return topCountries
   */
  @javax.annotation.Nullable
  public Map<String, Long> getTopCountries() {
    return topCountries;
  }

  public void setTopCountries(Map<String, Long> topCountries) {
    this.topCountries = topCountries;
  }


  public static final String SERIALIZED_NAME_WEBSITES_COUNT = "websites_count";
  @SerializedName(SERIALIZED_NAME_WEBSITES_COUNT)
  private Long websitesCount;

  public BusinessListingAggregationInfo websitesCount(Long websitesCount) {
    this.websitesCount = websitesCount;
    return this;
  }

  /**
   * number of unique websites
   * @return websitesCount
   */
  @javax.annotation.Nullable
  public Long getWebsitesCount() {
    return websitesCount;
  }

  public void setWebsitesCount(Long websitesCount) {
    this.websitesCount = websitesCount;
  }


  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public BusinessListingAggregationInfo count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * number of unique entities
   * @return count
   */
  @javax.annotation.Nullable
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  public static final String SERIALIZED_NAME_TOP_ATTRIBUTES = "top_attributes";
  @SerializedName(SERIALIZED_NAME_TOP_ATTRIBUTES)
  private Map<String, Long> topAttributes;

  public BusinessListingAggregationInfo topAttributes(Map<String, Long> topAttributes) {
    this.topAttributes = topAttributes;
    return this;
  }

  /**
   * the most mentioned service details
* service details of a business entity displayed in a form of checks and the number of entities mentioning each attribute
   * @return topAttributes
   */
  @javax.annotation.Nullable
  public Map<String, Long> getTopAttributes() {
    return topAttributes;
  }

  public void setTopAttributes(Map<String, Long> topAttributes) {
    this.topAttributes = topAttributes;
  }


  public static final String SERIALIZED_NAME_TOP_PLACE_TOPICS = "top_place_topics";
  @SerializedName(SERIALIZED_NAME_TOP_PLACE_TOPICS)
  private Map<String, Long> topPlaceTopics;

  public BusinessListingAggregationInfo topPlaceTopics(Map<String, Long> topPlaceTopics) {
    this.topPlaceTopics = topPlaceTopics;
    return this;
  }

  /**
   * top keywords mentioned in customer reviews
* contains most popular keywords related to products/services mentioned in customer reviews of a business entity and the number of reviews mentioning each keyword
   * @return topPlaceTopics
   */
  @javax.annotation.Nullable
  public Map<String, Long> getTopPlaceTopics() {
    return topPlaceTopics;
  }

  public void setTopPlaceTopics(Map<String, Long> topPlaceTopics) {
    this.topPlaceTopics = topPlaceTopics;
  }



  public BusinessListingAggregationInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BusinessListingAggregationInfo putAdditionalProperty(String key, Object value) {
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


    
    BusinessListingAggregationInfo businessListingAggregationInfo = (BusinessListingAggregationInfo) o;
    return

        Objects.equals(this.topCategories, businessListingAggregationInfo.topCategories) &&
        Objects.equals(this.topCountries, businessListingAggregationInfo.topCountries) &&
        Objects.equals(this.websitesCount, businessListingAggregationInfo.websitesCount) &&
        Objects.equals(this.count, businessListingAggregationInfo.count) &&
        Objects.equals(this.topAttributes, businessListingAggregationInfo.topAttributes) &&
        Objects.equals(this.topPlaceTopics, businessListingAggregationInfo.topPlaceTopics);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(topCategories, topCountries, websitesCount, count, topAttributes, topPlaceTopics);
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
    sb.append("class BusinessListingAggregationInfo {\n");

    sb.append("    topCategories: ").append(toIndentedString(topCategories)).append("\n");
    sb.append("    topCountries: ").append(toIndentedString(topCountries)).append("\n");
    sb.append("    websitesCount: ").append(toIndentedString(websitesCount)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    topAttributes: ").append(toIndentedString(topAttributes)).append("\n");
    sb.append("    topPlaceTopics: ").append(toIndentedString(topPlaceTopics)).append("\n");
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
    
    openapiFields.add("top_categories");
    
    openapiFields.add("top_countries");
    
    openapiFields.add("websites_count");
    
    openapiFields.add("count");
    
    openapiFields.add("top_attributes");
    
    openapiFields.add("top_place_topics");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessListingAggregationInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessListingAggregationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessListingAggregationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessListingAggregationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessListingAggregationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessListingAggregationInfo>() {
           @Override
           public void write(JsonWriter out, BusinessListingAggregationInfo value) throws IOException {
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
           public BusinessListingAggregationInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessListingAggregationInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BusinessListingAggregationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessListingAggregationInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
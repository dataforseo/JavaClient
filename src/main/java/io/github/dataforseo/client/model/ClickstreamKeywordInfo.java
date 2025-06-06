/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.dataforseo.client.model.MonthlySearches;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

/**
 * ClickstreamKeywordInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class ClickstreamKeywordInfo {
  public static final String SERIALIZED_NAME_SEARCH_VOLUME = "search_volume";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME)
  private BigDecimal searchVolume;

  public static final String SERIALIZED_NAME_LAST_UPDATED_TIME = "last_updated_time";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_TIME)
  private String lastUpdatedTime;

  public static final String SERIALIZED_NAME_GENDER_DISTRIBUTION = "gender_distribution";
  @SerializedName(SERIALIZED_NAME_GENDER_DISTRIBUTION)
  private Map<String, Long> genderDistribution;

  public static final String SERIALIZED_NAME_AGE_DISTRIBUTION = "age_distribution";
  @SerializedName(SERIALIZED_NAME_AGE_DISTRIBUTION)
  private Map<String, Long> ageDistribution;

  public static final String SERIALIZED_NAME_MONTHLY_SEARCHES = "monthly_searches";
  @SerializedName(SERIALIZED_NAME_MONTHLY_SEARCHES)
  private List<MonthlySearches> monthlySearches;

  public ClickstreamKeywordInfo() {
  }

  public ClickstreamKeywordInfo searchVolume(BigDecimal searchVolume) {
    this.searchVolume = searchVolume;
    return this;
  }

  /**
   * current search volume rate of a keyword
   * @return searchVolume
   */
  @javax.annotation.Nullable
  public BigDecimal getSearchVolume() {
    return searchVolume;
  }

  public void setSearchVolume(BigDecimal searchVolume) {
    this.searchVolume = searchVolume;
  }


  public ClickstreamKeywordInfo lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * date and time when backlink data was updated in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return lastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }


  public ClickstreamKeywordInfo genderDistribution(Map<String, Long> genderDistribution) {
    this.genderDistribution = genderDistribution;
    return this;
  }

  public ClickstreamKeywordInfo putGenderDistributionItem(String key, Long genderDistributionItem) {
    if (this.genderDistribution == null) {
      this.genderDistribution = new HashMap<>();
    }
    this.genderDistribution.put(key, genderDistributionItem);
    return this;
  }

  /**
   * distribution of estimated clickstream-based metrics by gender learn more about how the metric is calculated in this help center article
   * @return genderDistribution
   */
  @javax.annotation.Nullable
  public Map<String, Long> getGenderDistribution() {
    return genderDistribution;
  }

  public void setGenderDistribution(Map<String, Long> genderDistribution) {
    this.genderDistribution = genderDistribution;
  }


  public ClickstreamKeywordInfo ageDistribution(Map<String, Long> ageDistribution) {
    this.ageDistribution = ageDistribution;
    return this;
  }

  public ClickstreamKeywordInfo putAgeDistributionItem(String key, Long ageDistributionItem) {
    if (this.ageDistribution == null) {
      this.ageDistribution = new HashMap<>();
    }
    this.ageDistribution.put(key, ageDistributionItem);
    return this;
  }

  /**
   * distribution of clickstream-based metrics by age learn more about how the metric is calculated in this help center article
   * @return ageDistribution
   */
  @javax.annotation.Nullable
  public Map<String, Long> getAgeDistribution() {
    return ageDistribution;
  }

  public void setAgeDistribution(Map<String, Long> ageDistribution) {
    this.ageDistribution = ageDistribution;
  }


  public ClickstreamKeywordInfo monthlySearches(List<MonthlySearches> monthlySearches) {
    this.monthlySearches = monthlySearches;
    return this;
  }

  public ClickstreamKeywordInfo addMonthlySearchesItem(MonthlySearches monthlySearchesItem) {
    if (this.monthlySearches == null) {
      this.monthlySearches = new ArrayList<>();
    }
    this.monthlySearches.add(monthlySearchesItem);
    return this;
  }

  /**
   * monthly searches represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations
   * @return monthlySearches
   */
  @javax.annotation.Nullable
  public List<MonthlySearches> getMonthlySearches() {
    return monthlySearches;
  }

  public void setMonthlySearches(List<MonthlySearches> monthlySearches) {
    this.monthlySearches = monthlySearches;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ClickstreamKeywordInfo instance itself
   */
  public ClickstreamKeywordInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    ClickstreamKeywordInfo clickstreamKeywordInfo = (ClickstreamKeywordInfo) o;
    return Objects.equals(this.searchVolume, clickstreamKeywordInfo.searchVolume) &&
        Objects.equals(this.lastUpdatedTime, clickstreamKeywordInfo.lastUpdatedTime) &&
        Objects.equals(this.genderDistribution, clickstreamKeywordInfo.genderDistribution) &&
        Objects.equals(this.ageDistribution, clickstreamKeywordInfo.ageDistribution) &&
        Objects.equals(this.monthlySearches, clickstreamKeywordInfo.monthlySearches)&&
        Objects.equals(this.additionalProperties, clickstreamKeywordInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchVolume, lastUpdatedTime, genderDistribution, ageDistribution, monthlySearches, additionalProperties);
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
    sb.append("class ClickstreamKeywordInfo {\n");
    sb.append("    searchVolume: ").append(toIndentedString(searchVolume)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    genderDistribution: ").append(toIndentedString(genderDistribution)).append("\n");
    sb.append("    ageDistribution: ").append(toIndentedString(ageDistribution)).append("\n");
    sb.append("    monthlySearches: ").append(toIndentedString(monthlySearches)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("search_volume");
    openapiFields.add("last_updated_time");
    openapiFields.add("gender_distribution");
    openapiFields.add("age_distribution");
    openapiFields.add("monthly_searches");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ClickstreamKeywordInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClickstreamKeywordInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClickstreamKeywordInfo is not found in the empty JSON string", ClickstreamKeywordInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("last_updated_time") != null && !jsonObj.get("last_updated_time").isJsonNull()) && !jsonObj.get("last_updated_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_updated_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_updated_time").toString()));
      }
      if (jsonObj.get("monthly_searches") != null && !jsonObj.get("monthly_searches").isJsonNull()) {
        JsonArray jsonArraymonthlySearches = jsonObj.getAsJsonArray("monthly_searches");
        if (jsonArraymonthlySearches != null) {
          // ensure the json data is an array
          if (!jsonObj.get("monthly_searches").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `monthly_searches` to be an array in the JSON string but got `%s`", jsonObj.get("monthly_searches").toString()));
          }

          // validate the optional field `monthly_searches` (array)
          for (int i = 0; i < jsonArraymonthlySearches.size(); i++) {
            MonthlySearches.validateJsonElement(jsonArraymonthlySearches.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClickstreamKeywordInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClickstreamKeywordInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClickstreamKeywordInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClickstreamKeywordInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ClickstreamKeywordInfo>() {
           @Override
           public void write(JsonWriter out, ClickstreamKeywordInfo value) throws IOException {
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
           public ClickstreamKeywordInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ClickstreamKeywordInfo instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of ClickstreamKeywordInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ClickstreamKeywordInfo
   * @throws IOException if the JSON string is invalid with respect to ClickstreamKeywordInfo
   */
  public static ClickstreamKeywordInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClickstreamKeywordInfo.class);
  }

  /**
   * Convert an instance of ClickstreamKeywordInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


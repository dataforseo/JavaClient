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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * KeywordsDataBingSearchVolumeLiveResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class KeywordsDataBingSearchVolumeLiveResultInfo {
  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_SEARCH_PARTNERS = "search_partners";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARTNERS)
  private Boolean searchPartners;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_COMPETITION = "competition";
  @SerializedName(SERIALIZED_NAME_COMPETITION)
  private Float competition;

  public static final String SERIALIZED_NAME_CPC = "cpc";
  @SerializedName(SERIALIZED_NAME_CPC)
  private Float cpc;

  public static final String SERIALIZED_NAME_SEARCH_VOLUME = "search_volume";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME)
  private Long searchVolume;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories;

  public static final String SERIALIZED_NAME_MONTHLY_SEARCHES = "monthly_searches";
  @SerializedName(SERIALIZED_NAME_MONTHLY_SEARCHES)
  private List<MonthlySearches> monthlySearches;

  public KeywordsDataBingSearchVolumeLiveResultInfo() {
  }

  public KeywordsDataBingSearchVolumeLiveResultInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword in a POST array
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public KeywordsDataBingSearchVolumeLiveResultInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code in a POST array if there is no data, then the value is null
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public KeywordsDataBingSearchVolumeLiveResultInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code in a POST array if there is no data, then the value is null
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public KeywordsDataBingSearchVolumeLiveResultInfo searchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
    return this;
  }

  /**
   * indicates whether data from partner networks included in the response
   * @return searchPartners
   */
  @javax.annotation.Nullable
  public Boolean getSearchPartners() {
    return searchPartners;
  }

  public void setSearchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
  }


  public KeywordsDataBingSearchVolumeLiveResultInfo device(String device) {
    this.device = device;
    return this;
  }

  /**
   * device type in a POST array if there is no data, then the value is null
   * @return device
   */
  @javax.annotation.Nullable
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }


  public KeywordsDataBingSearchVolumeLiveResultInfo competition(Float competition) {
    this.competition = competition;
    return this;
  }

  /**
   * competition represents the relative amount of competition associated with the given keyword in paid SERP only. This value is based on Bing Ads data. Possible values: 0.1, 0.5,0.90.1 – low competition, 0.5 – medium competition, 0.9 – high competition; if there is no data the value is null
   * @return competition
   */
  @javax.annotation.Nullable
  public Float getCompetition() {
    return competition;
  }

  public void setCompetition(Float competition) {
    this.competition = competition;
  }


  public KeywordsDataBingSearchVolumeLiveResultInfo cpc(Float cpc) {
    this.cpc = cpc;
    return this;
  }

  /**
   * cost-per-click represents the average cost per click (USD) historically paid for the keyword. if there is no data then the value is null
   * @return cpc
   */
  @javax.annotation.Nullable
  public Float getCpc() {
    return cpc;
  }

  public void setCpc(Float cpc) {
    this.cpc = cpc;
  }


  public KeywordsDataBingSearchVolumeLiveResultInfo searchVolume(Long searchVolume) {
    this.searchVolume = searchVolume;
    return this;
  }

  /**
   * monthly average search volume rate represents either the (approximate) number of searches for the given keyword idea on bing search engine depending on the user’s targeting; search volume is rounded to the nearest tens; if there is no data, the value is null
   * @return searchVolume
   */
  @javax.annotation.Nullable
  public Long getSearchVolume() {
    return searchVolume;
  }

  public void setSearchVolume(Long searchVolume) {
    this.searchVolume = searchVolume;
  }


  public KeywordsDataBingSearchVolumeLiveResultInfo categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public KeywordsDataBingSearchVolumeLiveResultInfo addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * product and service categories our API doesn’t return categories for this endpoint: the parameter will always equal null
   * @return categories
   */
  @javax.annotation.Nullable
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public KeywordsDataBingSearchVolumeLiveResultInfo monthlySearches(List<MonthlySearches> monthlySearches) {
    this.monthlySearches = monthlySearches;
    return this;
  }

  public KeywordsDataBingSearchVolumeLiveResultInfo addMonthlySearchesItem(MonthlySearches monthlySearchesItem) {
    if (this.monthlySearches == null) {
      this.monthlySearches = new ArrayList<>();
    }
    this.monthlySearches.add(monthlySearchesItem);
    return this;
  }

  /**
   * monthly searches represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations if there is no data then the value is null
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
   * @return the KeywordsDataBingSearchVolumeLiveResultInfo instance itself
   */
  public KeywordsDataBingSearchVolumeLiveResultInfo putAdditionalProperty(String key, Object value) {
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
    KeywordsDataBingSearchVolumeLiveResultInfo keywordsDataBingSearchVolumeLiveResultInfo = (KeywordsDataBingSearchVolumeLiveResultInfo) o;
    return Objects.equals(this.keyword, keywordsDataBingSearchVolumeLiveResultInfo.keyword) &&
        Objects.equals(this.locationCode, keywordsDataBingSearchVolumeLiveResultInfo.locationCode) &&
        Objects.equals(this.languageCode, keywordsDataBingSearchVolumeLiveResultInfo.languageCode) &&
        Objects.equals(this.searchPartners, keywordsDataBingSearchVolumeLiveResultInfo.searchPartners) &&
        Objects.equals(this.device, keywordsDataBingSearchVolumeLiveResultInfo.device) &&
        Objects.equals(this.competition, keywordsDataBingSearchVolumeLiveResultInfo.competition) &&
        Objects.equals(this.cpc, keywordsDataBingSearchVolumeLiveResultInfo.cpc) &&
        Objects.equals(this.searchVolume, keywordsDataBingSearchVolumeLiveResultInfo.searchVolume) &&
        Objects.equals(this.categories, keywordsDataBingSearchVolumeLiveResultInfo.categories) &&
        Objects.equals(this.monthlySearches, keywordsDataBingSearchVolumeLiveResultInfo.monthlySearches)&&
        Objects.equals(this.additionalProperties, keywordsDataBingSearchVolumeLiveResultInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, locationCode, languageCode, searchPartners, device, competition, cpc, searchVolume, categories, monthlySearches, additionalProperties);
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
    sb.append("class KeywordsDataBingSearchVolumeLiveResultInfo {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    searchPartners: ").append(toIndentedString(searchPartners)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    competition: ").append(toIndentedString(competition)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
    sb.append("    searchVolume: ").append(toIndentedString(searchVolume)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
    openapiFields.add("keyword");
    openapiFields.add("location_code");
    openapiFields.add("language_code");
    openapiFields.add("search_partners");
    openapiFields.add("device");
    openapiFields.add("competition");
    openapiFields.add("cpc");
    openapiFields.add("search_volume");
    openapiFields.add("categories");
    openapiFields.add("monthly_searches");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordsDataBingSearchVolumeLiveResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KeywordsDataBingSearchVolumeLiveResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeywordsDataBingSearchVolumeLiveResultInfo is not found in the empty JSON string", KeywordsDataBingSearchVolumeLiveResultInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      if ((jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) && !jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull() && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
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
       if (!KeywordsDataBingSearchVolumeLiveResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordsDataBingSearchVolumeLiveResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordsDataBingSearchVolumeLiveResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordsDataBingSearchVolumeLiveResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordsDataBingSearchVolumeLiveResultInfo>() {
           @Override
           public void write(JsonWriter out, KeywordsDataBingSearchVolumeLiveResultInfo value) throws IOException {
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
           public KeywordsDataBingSearchVolumeLiveResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordsDataBingSearchVolumeLiveResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of KeywordsDataBingSearchVolumeLiveResultInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KeywordsDataBingSearchVolumeLiveResultInfo
   * @throws IOException if the JSON string is invalid with respect to KeywordsDataBingSearchVolumeLiveResultInfo
   */
  public static KeywordsDataBingSearchVolumeLiveResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordsDataBingSearchVolumeLiveResultInfo.class);
  }

  /**
   * Convert an instance of KeywordsDataBingSearchVolumeLiveResultInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

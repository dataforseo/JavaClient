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


package org.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.dataforseo.client.model.AppendixBusinessListingsBusinessDataLimitsRatesDataInfo;
import org.dataforseo.client.model.AppendixSerpLimitsRatesDataInfo;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * AppendixAppDataDayStatisticsRatesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-28T19:49:11.515676700+03:00[Europe/Kiev]")
public class AppendixAppDataDayStatisticsRatesData {
  public static final String SERIALIZED_NAME_APP_INFO = "app_info";
  @SerializedName(SERIALIZED_NAME_APP_INFO)
  private AppendixSerpLimitsRatesDataInfo appInfo;

  public static final String SERIALIZED_NAME_APP_LIST = "app_list";
  @SerializedName(SERIALIZED_NAME_APP_LIST)
  private AppendixSerpLimitsRatesDataInfo appList;

  public static final String SERIALIZED_NAME_APP_REVIEWS = "app_reviews";
  @SerializedName(SERIALIZED_NAME_APP_REVIEWS)
  private AppendixSerpLimitsRatesDataInfo appReviews;

  public static final String SERIALIZED_NAME_APP_SEARCHES = "app_searches";
  @SerializedName(SERIALIZED_NAME_APP_SEARCHES)
  private AppendixSerpLimitsRatesDataInfo appSearches;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Double errors;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private Double languages;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private Double locations;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private Double categories;

  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private Double tasksReady;

  public static final String SERIALIZED_NAME_ID_LIST = "id_list";
  @SerializedName(SERIALIZED_NAME_ID_LIST)
  private Double idList;

  public static final String SERIALIZED_NAME_APP_LISTINGS = "app_listings";
  @SerializedName(SERIALIZED_NAME_APP_LISTINGS)
  private AppendixBusinessListingsBusinessDataLimitsRatesDataInfo appListings;

  public AppendixAppDataDayStatisticsRatesData() {
  }

  public AppendixAppDataDayStatisticsRatesData appInfo(AppendixSerpLimitsRatesDataInfo appInfo) {
    this.appInfo = appInfo;
    return this;
  }

   /**
   * Get appInfo
   * @return appInfo
  **/
  @javax.annotation.Nullable
  public AppendixSerpLimitsRatesDataInfo getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(AppendixSerpLimitsRatesDataInfo appInfo) {
    this.appInfo = appInfo;
  }


  public AppendixAppDataDayStatisticsRatesData appList(AppendixSerpLimitsRatesDataInfo appList) {
    this.appList = appList;
    return this;
  }

   /**
   * Get appList
   * @return appList
  **/
  @javax.annotation.Nullable
  public AppendixSerpLimitsRatesDataInfo getAppList() {
    return appList;
  }

  public void setAppList(AppendixSerpLimitsRatesDataInfo appList) {
    this.appList = appList;
  }


  public AppendixAppDataDayStatisticsRatesData appReviews(AppendixSerpLimitsRatesDataInfo appReviews) {
    this.appReviews = appReviews;
    return this;
  }

   /**
   * Get appReviews
   * @return appReviews
  **/
  @javax.annotation.Nullable
  public AppendixSerpLimitsRatesDataInfo getAppReviews() {
    return appReviews;
  }

  public void setAppReviews(AppendixSerpLimitsRatesDataInfo appReviews) {
    this.appReviews = appReviews;
  }


  public AppendixAppDataDayStatisticsRatesData appSearches(AppendixSerpLimitsRatesDataInfo appSearches) {
    this.appSearches = appSearches;
    return this;
  }

   /**
   * Get appSearches
   * @return appSearches
  **/
  @javax.annotation.Nullable
  public AppendixSerpLimitsRatesDataInfo getAppSearches() {
    return appSearches;
  }

  public void setAppSearches(AppendixSerpLimitsRatesDataInfo appSearches) {
    this.appSearches = appSearches;
  }


  public AppendixAppDataDayStatisticsRatesData errors(Double errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public Double getErrors() {
    return errors;
  }

  public void setErrors(Double errors) {
    this.errors = errors;
  }


  public AppendixAppDataDayStatisticsRatesData languages(Double languages) {
    this.languages = languages;
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @javax.annotation.Nullable
  public Double getLanguages() {
    return languages;
  }

  public void setLanguages(Double languages) {
    this.languages = languages;
  }


  public AppendixAppDataDayStatisticsRatesData locations(Double locations) {
    this.locations = locations;
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @javax.annotation.Nullable
  public Double getLocations() {
    return locations;
  }

  public void setLocations(Double locations) {
    this.locations = locations;
  }


  public AppendixAppDataDayStatisticsRatesData categories(Double categories) {
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  public Double getCategories() {
    return categories;
  }

  public void setCategories(Double categories) {
    this.categories = categories;
  }


  public AppendixAppDataDayStatisticsRatesData tasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

   /**
   * Get tasksReady
   * @return tasksReady
  **/
  @javax.annotation.Nullable
  public Double getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
  }


  public AppendixAppDataDayStatisticsRatesData idList(Double idList) {
    this.idList = idList;
    return this;
  }

   /**
   * Get idList
   * @return idList
  **/
  @javax.annotation.Nullable
  public Double getIdList() {
    return idList;
  }

  public void setIdList(Double idList) {
    this.idList = idList;
  }


  public AppendixAppDataDayStatisticsRatesData appListings(AppendixBusinessListingsBusinessDataLimitsRatesDataInfo appListings) {
    this.appListings = appListings;
    return this;
  }

   /**
   * Get appListings
   * @return appListings
  **/
  @javax.annotation.Nullable
  public AppendixBusinessListingsBusinessDataLimitsRatesDataInfo getAppListings() {
    return appListings;
  }

  public void setAppListings(AppendixBusinessListingsBusinessDataLimitsRatesDataInfo appListings) {
    this.appListings = appListings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendixAppDataDayStatisticsRatesData appendixAppDataDayStatisticsRatesData = (AppendixAppDataDayStatisticsRatesData) o;
    return Objects.equals(this.appInfo, appendixAppDataDayStatisticsRatesData.appInfo) &&
        Objects.equals(this.appList, appendixAppDataDayStatisticsRatesData.appList) &&
        Objects.equals(this.appReviews, appendixAppDataDayStatisticsRatesData.appReviews) &&
        Objects.equals(this.appSearches, appendixAppDataDayStatisticsRatesData.appSearches) &&
        Objects.equals(this.errors, appendixAppDataDayStatisticsRatesData.errors) &&
        Objects.equals(this.languages, appendixAppDataDayStatisticsRatesData.languages) &&
        Objects.equals(this.locations, appendixAppDataDayStatisticsRatesData.locations) &&
        Objects.equals(this.categories, appendixAppDataDayStatisticsRatesData.categories) &&
        Objects.equals(this.tasksReady, appendixAppDataDayStatisticsRatesData.tasksReady) &&
        Objects.equals(this.idList, appendixAppDataDayStatisticsRatesData.idList) &&
        Objects.equals(this.appListings, appendixAppDataDayStatisticsRatesData.appListings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInfo, appList, appReviews, appSearches, errors, languages, locations, categories, tasksReady, idList, appListings);
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
    sb.append("class AppendixAppDataDayStatisticsRatesData {\n");
    sb.append("    appInfo: ").append(toIndentedString(appInfo)).append("\n");
    sb.append("    appList: ").append(toIndentedString(appList)).append("\n");
    sb.append("    appReviews: ").append(toIndentedString(appReviews)).append("\n");
    sb.append("    appSearches: ").append(toIndentedString(appSearches)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
    sb.append("    appListings: ").append(toIndentedString(appListings)).append("\n");
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
    openapiFields.add("app_info");
    openapiFields.add("app_list");
    openapiFields.add("app_reviews");
    openapiFields.add("app_searches");
    openapiFields.add("errors");
    openapiFields.add("languages");
    openapiFields.add("locations");
    openapiFields.add("categories");
    openapiFields.add("tasks_ready");
    openapiFields.add("id_list");
    openapiFields.add("app_listings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendixAppDataDayStatisticsRatesData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixAppDataDayStatisticsRatesData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixAppDataDayStatisticsRatesData is not found in the empty JSON string", AppendixAppDataDayStatisticsRatesData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppendixAppDataDayStatisticsRatesData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendixAppDataDayStatisticsRatesData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `app_info`
      if (jsonObj.get("app_info") != null && !jsonObj.get("app_info").isJsonNull()) {
        AppendixSerpLimitsRatesDataInfo.validateJsonElement(jsonObj.get("app_info"));
      }
      // validate the optional field `app_list`
      if (jsonObj.get("app_list") != null && !jsonObj.get("app_list").isJsonNull()) {
        AppendixSerpLimitsRatesDataInfo.validateJsonElement(jsonObj.get("app_list"));
      }
      // validate the optional field `app_reviews`
      if (jsonObj.get("app_reviews") != null && !jsonObj.get("app_reviews").isJsonNull()) {
        AppendixSerpLimitsRatesDataInfo.validateJsonElement(jsonObj.get("app_reviews"));
      }
      // validate the optional field `app_searches`
      if (jsonObj.get("app_searches") != null && !jsonObj.get("app_searches").isJsonNull()) {
        AppendixSerpLimitsRatesDataInfo.validateJsonElement(jsonObj.get("app_searches"));
      }
      // validate the optional field `app_listings`
      if (jsonObj.get("app_listings") != null && !jsonObj.get("app_listings").isJsonNull()) {
        AppendixBusinessListingsBusinessDataLimitsRatesDataInfo.validateJsonElement(jsonObj.get("app_listings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixAppDataDayStatisticsRatesData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixAppDataDayStatisticsRatesData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixAppDataDayStatisticsRatesData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixAppDataDayStatisticsRatesData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixAppDataDayStatisticsRatesData>() {
           @Override
           public void write(JsonWriter out, AppendixAppDataDayStatisticsRatesData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendixAppDataDayStatisticsRatesData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendixAppDataDayStatisticsRatesData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendixAppDataDayStatisticsRatesData
  * @throws IOException if the JSON string is invalid with respect to AppendixAppDataDayStatisticsRatesData
  */
  public static AppendixAppDataDayStatisticsRatesData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixAppDataDayStatisticsRatesData.class);
  }

 /**
  * Convert an instance of AppendixAppDataDayStatisticsRatesData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

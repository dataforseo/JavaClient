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
import org.dataforseo.client.model.AppendixInfo;

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
 * AppendixBingKeywordsDataDayStatisticsDataInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-28T19:49:11.515676700+03:00[Europe/Kiev]")
public class AppendixBingKeywordsDataDayStatisticsDataInfo {
  public static final String SERIALIZED_NAME_KEYWORD_PERFORMANCE = "keyword_performance";
  @SerializedName(SERIALIZED_NAME_KEYWORD_PERFORMANCE)
  private AppendixInfo keywordPerformance;

  public static final String SERIALIZED_NAME_SEARCH_VOLUME = "search_volume";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME)
  private AppendixInfo searchVolume;

  public static final String SERIALIZED_NAME_KEYWORDS_FOR_SITE = "keywords_for_site";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_SITE)
  private AppendixInfo keywordsForSite;

  public static final String SERIALIZED_NAME_KEYWORDS_FOR_KEYWORDS = "keywords_for_keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_KEYWORDS)
  private AppendixInfo keywordsForKeywords;

  public static final String SERIALIZED_NAME_SEARCH_VOLUME_HISTORY = "search_volume_history";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME_HISTORY)
  private AppendixInfo searchVolumeHistory;

  public AppendixBingKeywordsDataDayStatisticsDataInfo() {
  }

  public AppendixBingKeywordsDataDayStatisticsDataInfo keywordPerformance(AppendixInfo keywordPerformance) {
    this.keywordPerformance = keywordPerformance;
    return this;
  }

   /**
   * Get keywordPerformance
   * @return keywordPerformance
  **/
  @javax.annotation.Nullable
  public AppendixInfo getKeywordPerformance() {
    return keywordPerformance;
  }

  public void setKeywordPerformance(AppendixInfo keywordPerformance) {
    this.keywordPerformance = keywordPerformance;
  }


  public AppendixBingKeywordsDataDayStatisticsDataInfo searchVolume(AppendixInfo searchVolume) {
    this.searchVolume = searchVolume;
    return this;
  }

   /**
   * Get searchVolume
   * @return searchVolume
  **/
  @javax.annotation.Nullable
  public AppendixInfo getSearchVolume() {
    return searchVolume;
  }

  public void setSearchVolume(AppendixInfo searchVolume) {
    this.searchVolume = searchVolume;
  }


  public AppendixBingKeywordsDataDayStatisticsDataInfo keywordsForSite(AppendixInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
    return this;
  }

   /**
   * Get keywordsForSite
   * @return keywordsForSite
  **/
  @javax.annotation.Nullable
  public AppendixInfo getKeywordsForSite() {
    return keywordsForSite;
  }

  public void setKeywordsForSite(AppendixInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
  }


  public AppendixBingKeywordsDataDayStatisticsDataInfo keywordsForKeywords(AppendixInfo keywordsForKeywords) {
    this.keywordsForKeywords = keywordsForKeywords;
    return this;
  }

   /**
   * Get keywordsForKeywords
   * @return keywordsForKeywords
  **/
  @javax.annotation.Nullable
  public AppendixInfo getKeywordsForKeywords() {
    return keywordsForKeywords;
  }

  public void setKeywordsForKeywords(AppendixInfo keywordsForKeywords) {
    this.keywordsForKeywords = keywordsForKeywords;
  }


  public AppendixBingKeywordsDataDayStatisticsDataInfo searchVolumeHistory(AppendixInfo searchVolumeHistory) {
    this.searchVolumeHistory = searchVolumeHistory;
    return this;
  }

   /**
   * Get searchVolumeHistory
   * @return searchVolumeHistory
  **/
  @javax.annotation.Nullable
  public AppendixInfo getSearchVolumeHistory() {
    return searchVolumeHistory;
  }

  public void setSearchVolumeHistory(AppendixInfo searchVolumeHistory) {
    this.searchVolumeHistory = searchVolumeHistory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendixBingKeywordsDataDayStatisticsDataInfo appendixBingKeywordsDataDayStatisticsDataInfo = (AppendixBingKeywordsDataDayStatisticsDataInfo) o;
    return Objects.equals(this.keywordPerformance, appendixBingKeywordsDataDayStatisticsDataInfo.keywordPerformance) &&
        Objects.equals(this.searchVolume, appendixBingKeywordsDataDayStatisticsDataInfo.searchVolume) &&
        Objects.equals(this.keywordsForSite, appendixBingKeywordsDataDayStatisticsDataInfo.keywordsForSite) &&
        Objects.equals(this.keywordsForKeywords, appendixBingKeywordsDataDayStatisticsDataInfo.keywordsForKeywords) &&
        Objects.equals(this.searchVolumeHistory, appendixBingKeywordsDataDayStatisticsDataInfo.searchVolumeHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordPerformance, searchVolume, keywordsForSite, keywordsForKeywords, searchVolumeHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendixBingKeywordsDataDayStatisticsDataInfo {\n");
    sb.append("    keywordPerformance: ").append(toIndentedString(keywordPerformance)).append("\n");
    sb.append("    searchVolume: ").append(toIndentedString(searchVolume)).append("\n");
    sb.append("    keywordsForSite: ").append(toIndentedString(keywordsForSite)).append("\n");
    sb.append("    keywordsForKeywords: ").append(toIndentedString(keywordsForKeywords)).append("\n");
    sb.append("    searchVolumeHistory: ").append(toIndentedString(searchVolumeHistory)).append("\n");
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
    openapiFields.add("keyword_performance");
    openapiFields.add("search_volume");
    openapiFields.add("keywords_for_site");
    openapiFields.add("keywords_for_keywords");
    openapiFields.add("search_volume_history");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendixBingKeywordsDataDayStatisticsDataInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixBingKeywordsDataDayStatisticsDataInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixBingKeywordsDataDayStatisticsDataInfo is not found in the empty JSON string", AppendixBingKeywordsDataDayStatisticsDataInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppendixBingKeywordsDataDayStatisticsDataInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendixBingKeywordsDataDayStatisticsDataInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `keyword_performance`
      if (jsonObj.get("keyword_performance") != null && !jsonObj.get("keyword_performance").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("keyword_performance"));
      }
      // validate the optional field `search_volume`
      if (jsonObj.get("search_volume") != null && !jsonObj.get("search_volume").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("search_volume"));
      }
      // validate the optional field `keywords_for_site`
      if (jsonObj.get("keywords_for_site") != null && !jsonObj.get("keywords_for_site").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("keywords_for_site"));
      }
      // validate the optional field `keywords_for_keywords`
      if (jsonObj.get("keywords_for_keywords") != null && !jsonObj.get("keywords_for_keywords").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("keywords_for_keywords"));
      }
      // validate the optional field `search_volume_history`
      if (jsonObj.get("search_volume_history") != null && !jsonObj.get("search_volume_history").isJsonNull()) {
        AppendixInfo.validateJsonElement(jsonObj.get("search_volume_history"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixBingKeywordsDataDayStatisticsDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixBingKeywordsDataDayStatisticsDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixBingKeywordsDataDayStatisticsDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixBingKeywordsDataDayStatisticsDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixBingKeywordsDataDayStatisticsDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixBingKeywordsDataDayStatisticsDataInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendixBingKeywordsDataDayStatisticsDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendixBingKeywordsDataDayStatisticsDataInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendixBingKeywordsDataDayStatisticsDataInfo
  * @throws IOException if the JSON string is invalid with respect to AppendixBingKeywordsDataDayStatisticsDataInfo
  */
  public static AppendixBingKeywordsDataDayStatisticsDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixBingKeywordsDataDayStatisticsDataInfo.class);
  }

 /**
  * Convert an instance of AppendixBingKeywordsDataDayStatisticsDataInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

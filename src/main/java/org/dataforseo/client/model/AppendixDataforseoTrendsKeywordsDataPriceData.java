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
import org.dataforseo.client.model.AppendixKeywordBingKeywordsDataPriceDataInfo;

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
 * AppendixDataforseoTrendsKeywordsDataPriceData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T15:18:23.103906100+03:00[Europe/Kiev]")
public class AppendixDataforseoTrendsKeywordsDataPriceData {
  public static final String SERIALIZED_NAME_DEMOGRAPHY = "demography";
  @SerializedName(SERIALIZED_NAME_DEMOGRAPHY)
  private AppendixKeywordBingKeywordsDataPriceDataInfo demography;

  public static final String SERIALIZED_NAME_EXPLORE = "explore";
  @SerializedName(SERIALIZED_NAME_EXPLORE)
  private AppendixKeywordBingKeywordsDataPriceDataInfo explore;

  public static final String SERIALIZED_NAME_MERGED_DATA = "merged_data";
  @SerializedName(SERIALIZED_NAME_MERGED_DATA)
  private AppendixKeywordBingKeywordsDataPriceDataInfo mergedData;

  public static final String SERIALIZED_NAME_SUBREGION_INTERESTS = "subregion_interests";
  @SerializedName(SERIALIZED_NAME_SUBREGION_INTERESTS)
  private AppendixKeywordBingKeywordsDataPriceDataInfo subregionInterests;

  public AppendixDataforseoTrendsKeywordsDataPriceData() {
  }

  public AppendixDataforseoTrendsKeywordsDataPriceData demography(AppendixKeywordBingKeywordsDataPriceDataInfo demography) {
    this.demography = demography;
    return this;
  }

   /**
   * Get demography
   * @return demography
  **/
  @javax.annotation.Nullable
  public AppendixKeywordBingKeywordsDataPriceDataInfo getDemography() {
    return demography;
  }

  public void setDemography(AppendixKeywordBingKeywordsDataPriceDataInfo demography) {
    this.demography = demography;
  }


  public AppendixDataforseoTrendsKeywordsDataPriceData explore(AppendixKeywordBingKeywordsDataPriceDataInfo explore) {
    this.explore = explore;
    return this;
  }

   /**
   * Get explore
   * @return explore
  **/
  @javax.annotation.Nullable
  public AppendixKeywordBingKeywordsDataPriceDataInfo getExplore() {
    return explore;
  }

  public void setExplore(AppendixKeywordBingKeywordsDataPriceDataInfo explore) {
    this.explore = explore;
  }


  public AppendixDataforseoTrendsKeywordsDataPriceData mergedData(AppendixKeywordBingKeywordsDataPriceDataInfo mergedData) {
    this.mergedData = mergedData;
    return this;
  }

   /**
   * Get mergedData
   * @return mergedData
  **/
  @javax.annotation.Nullable
  public AppendixKeywordBingKeywordsDataPriceDataInfo getMergedData() {
    return mergedData;
  }

  public void setMergedData(AppendixKeywordBingKeywordsDataPriceDataInfo mergedData) {
    this.mergedData = mergedData;
  }


  public AppendixDataforseoTrendsKeywordsDataPriceData subregionInterests(AppendixKeywordBingKeywordsDataPriceDataInfo subregionInterests) {
    this.subregionInterests = subregionInterests;
    return this;
  }

   /**
   * Get subregionInterests
   * @return subregionInterests
  **/
  @javax.annotation.Nullable
  public AppendixKeywordBingKeywordsDataPriceDataInfo getSubregionInterests() {
    return subregionInterests;
  }

  public void setSubregionInterests(AppendixKeywordBingKeywordsDataPriceDataInfo subregionInterests) {
    this.subregionInterests = subregionInterests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendixDataforseoTrendsKeywordsDataPriceData appendixDataforseoTrendsKeywordsDataPriceData = (AppendixDataforseoTrendsKeywordsDataPriceData) o;
    return Objects.equals(this.demography, appendixDataforseoTrendsKeywordsDataPriceData.demography) &&
        Objects.equals(this.explore, appendixDataforseoTrendsKeywordsDataPriceData.explore) &&
        Objects.equals(this.mergedData, appendixDataforseoTrendsKeywordsDataPriceData.mergedData) &&
        Objects.equals(this.subregionInterests, appendixDataforseoTrendsKeywordsDataPriceData.subregionInterests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demography, explore, mergedData, subregionInterests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendixDataforseoTrendsKeywordsDataPriceData {\n");
    sb.append("    demography: ").append(toIndentedString(demography)).append("\n");
    sb.append("    explore: ").append(toIndentedString(explore)).append("\n");
    sb.append("    mergedData: ").append(toIndentedString(mergedData)).append("\n");
    sb.append("    subregionInterests: ").append(toIndentedString(subregionInterests)).append("\n");
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
    openapiFields.add("demography");
    openapiFields.add("explore");
    openapiFields.add("merged_data");
    openapiFields.add("subregion_interests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendixDataforseoTrendsKeywordsDataPriceData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixDataforseoTrendsKeywordsDataPriceData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixDataforseoTrendsKeywordsDataPriceData is not found in the empty JSON string", AppendixDataforseoTrendsKeywordsDataPriceData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppendixDataforseoTrendsKeywordsDataPriceData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendixDataforseoTrendsKeywordsDataPriceData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `demography`
      if (jsonObj.get("demography") != null && !jsonObj.get("demography").isJsonNull()) {
        AppendixKeywordBingKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("demography"));
      }
      // validate the optional field `explore`
      if (jsonObj.get("explore") != null && !jsonObj.get("explore").isJsonNull()) {
        AppendixKeywordBingKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("explore"));
      }
      // validate the optional field `merged_data`
      if (jsonObj.get("merged_data") != null && !jsonObj.get("merged_data").isJsonNull()) {
        AppendixKeywordBingKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("merged_data"));
      }
      // validate the optional field `subregion_interests`
      if (jsonObj.get("subregion_interests") != null && !jsonObj.get("subregion_interests").isJsonNull()) {
        AppendixKeywordBingKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("subregion_interests"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixDataforseoTrendsKeywordsDataPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixDataforseoTrendsKeywordsDataPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixDataforseoTrendsKeywordsDataPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixDataforseoTrendsKeywordsDataPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixDataforseoTrendsKeywordsDataPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixDataforseoTrendsKeywordsDataPriceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendixDataforseoTrendsKeywordsDataPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendixDataforseoTrendsKeywordsDataPriceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendixDataforseoTrendsKeywordsDataPriceData
  * @throws IOException if the JSON string is invalid with respect to AppendixDataforseoTrendsKeywordsDataPriceData
  */
  public static AppendixDataforseoTrendsKeywordsDataPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixDataforseoTrendsKeywordsDataPriceData.class);
  }

 /**
  * Convert an instance of AppendixDataforseoTrendsKeywordsDataPriceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


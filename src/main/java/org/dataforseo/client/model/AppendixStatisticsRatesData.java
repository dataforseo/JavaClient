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
import org.dataforseo.client.model.AppendixDayStatisticsRatesData;
import org.dataforseo.client.model.AppendixMinuteStatisticsRatesData;

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
 * AppendixStatisticsRatesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-28T19:49:11.515676700+03:00[Europe/Kiev]")
public class AppendixStatisticsRatesData {
  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private AppendixDayStatisticsRatesData day;

  public static final String SERIALIZED_NAME_MINUTE = "minute";
  @SerializedName(SERIALIZED_NAME_MINUTE)
  private AppendixMinuteStatisticsRatesData minute;

  public AppendixStatisticsRatesData() {
  }

  public AppendixStatisticsRatesData day(AppendixDayStatisticsRatesData day) {
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @javax.annotation.Nullable
  public AppendixDayStatisticsRatesData getDay() {
    return day;
  }

  public void setDay(AppendixDayStatisticsRatesData day) {
    this.day = day;
  }


  public AppendixStatisticsRatesData minute(AppendixMinuteStatisticsRatesData minute) {
    this.minute = minute;
    return this;
  }

   /**
   * Get minute
   * @return minute
  **/
  @javax.annotation.Nullable
  public AppendixMinuteStatisticsRatesData getMinute() {
    return minute;
  }

  public void setMinute(AppendixMinuteStatisticsRatesData minute) {
    this.minute = minute;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendixStatisticsRatesData appendixStatisticsRatesData = (AppendixStatisticsRatesData) o;
    return Objects.equals(this.day, appendixStatisticsRatesData.day) &&
        Objects.equals(this.minute, appendixStatisticsRatesData.minute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, minute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendixStatisticsRatesData {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
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
    openapiFields.add("day");
    openapiFields.add("minute");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendixStatisticsRatesData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixStatisticsRatesData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixStatisticsRatesData is not found in the empty JSON string", AppendixStatisticsRatesData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppendixStatisticsRatesData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendixStatisticsRatesData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `day`
      if (jsonObj.get("day") != null && !jsonObj.get("day").isJsonNull()) {
        AppendixDayStatisticsRatesData.validateJsonElement(jsonObj.get("day"));
      }
      // validate the optional field `minute`
      if (jsonObj.get("minute") != null && !jsonObj.get("minute").isJsonNull()) {
        AppendixMinuteStatisticsRatesData.validateJsonElement(jsonObj.get("minute"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixStatisticsRatesData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixStatisticsRatesData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixStatisticsRatesData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixStatisticsRatesData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixStatisticsRatesData>() {
           @Override
           public void write(JsonWriter out, AppendixStatisticsRatesData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendixStatisticsRatesData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendixStatisticsRatesData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendixStatisticsRatesData
  * @throws IOException if the JSON string is invalid with respect to AppendixStatisticsRatesData
  */
  public static AppendixStatisticsRatesData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixStatisticsRatesData.class);
  }

 /**
  * Convert an instance of AppendixStatisticsRatesData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

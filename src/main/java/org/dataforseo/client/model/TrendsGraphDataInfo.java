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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * TrendsGraphDataInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T09:14:36.455142500+03:00[Europe/Kiev]")
public class TrendsGraphDataInfo {
  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private String dateFrom;

  public static final String SERIALIZED_NAME_DATE_TO = "date_to";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private String dateTo;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_MISSING_DATA = "missing_data";
  @SerializedName(SERIALIZED_NAME_MISSING_DATA)
  private Boolean missingData;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Integer> values;

  public TrendsGraphDataInfo() {
  }

  public TrendsGraphDataInfo dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * start date of the corresponding time range in the UTC format: “yyyy-mm-dd”
   * @return dateFrom
  **/
  @javax.annotation.Nullable
  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }


  public TrendsGraphDataInfo dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * end date of the corresponding time range in the UTC format: “yyyy-mm-dd”
   * @return dateTo
  **/
  @javax.annotation.Nullable
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }


  public TrendsGraphDataInfo timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * a point in time in the Unix time format
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public TrendsGraphDataInfo missingData(Boolean missingData) {
    this.missingData = missingData;
    return this;
  }

   /**
   * indicates whether the data is unavailable if true the data on the graph in the Google Trends interface is missing and thus labelled with a dotted line
   * @return missingData
  **/
  @javax.annotation.Nullable
  public Boolean getMissingData() {
    return missingData;
  }

  public void setMissingData(Boolean missingData) {
    this.missingData = missingData;
  }


  public TrendsGraphDataInfo values(List<Integer> values) {
    this.values = values;
    return this;
  }

  public TrendsGraphDataInfo addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * relative keyword popularity rate at a specific timestamp represents the keyword popularity rate over the given time range if you specify more than one keyword, the values will be averaged to the highest value across all specified keywords a value of 100 is the peak popularity for the term. A value of 50 means that the term is half as popular. A score of 0 means there was not enough data for this term
   * @return values
  **/
  @javax.annotation.Nullable
  public List<Integer> getValues() {
    return values;
  }

  public void setValues(List<Integer> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendsGraphDataInfo trendsGraphDataInfo = (TrendsGraphDataInfo) o;
    return Objects.equals(this.dateFrom, trendsGraphDataInfo.dateFrom) &&
        Objects.equals(this.dateTo, trendsGraphDataInfo.dateTo) &&
        Objects.equals(this.timestamp, trendsGraphDataInfo.timestamp) &&
        Objects.equals(this.missingData, trendsGraphDataInfo.missingData) &&
        Objects.equals(this.values, trendsGraphDataInfo.values);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, timestamp, missingData, values);
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
    sb.append("class TrendsGraphDataInfo {\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    missingData: ").append(toIndentedString(missingData)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("date_from");
    openapiFields.add("date_to");
    openapiFields.add("timestamp");
    openapiFields.add("missing_data");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TrendsGraphDataInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrendsGraphDataInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrendsGraphDataInfo is not found in the empty JSON string", TrendsGraphDataInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrendsGraphDataInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrendsGraphDataInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("date_from") != null && !jsonObj.get("date_from").isJsonNull()) && !jsonObj.get("date_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_from").toString()));
      }
      if ((jsonObj.get("date_to") != null && !jsonObj.get("date_to").isJsonNull()) && !jsonObj.get("date_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_to").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull() && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrendsGraphDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrendsGraphDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrendsGraphDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrendsGraphDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TrendsGraphDataInfo>() {
           @Override
           public void write(JsonWriter out, TrendsGraphDataInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrendsGraphDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrendsGraphDataInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrendsGraphDataInfo
  * @throws IOException if the JSON string is invalid with respect to TrendsGraphDataInfo
  */
  public static TrendsGraphDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrendsGraphDataInfo.class);
  }

 /**
  * Convert an instance of TrendsGraphDataInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


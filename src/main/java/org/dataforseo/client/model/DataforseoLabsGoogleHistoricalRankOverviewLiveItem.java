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
import java.util.HashMap;
import java.util.Map;
import org.dataforseo.client.model.MetricsInfo;
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
 * DataforseoLabsGoogleHistoricalRankOverviewLiveItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class DataforseoLabsGoogleHistoricalRankOverviewLiveItem {
  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Integer month;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private Map<String, MetricsInfo> metrics;

  public DataforseoLabsGoogleHistoricalRankOverviewLiveItem() {
  }

  public DataforseoLabsGoogleHistoricalRankOverviewLiveItem seType(String seType) {
    this.seType = seType;
    return this;
  }

   /**
   * search engine type
   * @return seType
  **/
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public DataforseoLabsGoogleHistoricalRankOverviewLiveItem year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * year for which the data is provided
   * @return year
  **/
  @javax.annotation.Nullable
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  public DataforseoLabsGoogleHistoricalRankOverviewLiveItem month(Integer month) {
    this.month = month;
    return this;
  }

   /**
   * month for which the data is provided
   * @return month
  **/
  @javax.annotation.Nullable
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }


  public DataforseoLabsGoogleHistoricalRankOverviewLiveItem metrics(Map<String, MetricsInfo> metrics) {
    this.metrics = metrics;
    return this;
  }

  public DataforseoLabsGoogleHistoricalRankOverviewLiveItem putMetricsItem(String key, MetricsInfo metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

   /**
   * ranking data relevant to the specified domain
   * @return metrics
  **/
  @javax.annotation.Nullable
  public Map<String, MetricsInfo> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, MetricsInfo> metrics) {
    this.metrics = metrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataforseoLabsGoogleHistoricalRankOverviewLiveItem dataforseoLabsGoogleHistoricalRankOverviewLiveItem = (DataforseoLabsGoogleHistoricalRankOverviewLiveItem) o;
    return Objects.equals(this.seType, dataforseoLabsGoogleHistoricalRankOverviewLiveItem.seType) &&
        Objects.equals(this.year, dataforseoLabsGoogleHistoricalRankOverviewLiveItem.year) &&
        Objects.equals(this.month, dataforseoLabsGoogleHistoricalRankOverviewLiveItem.month) &&
        Objects.equals(this.metrics, dataforseoLabsGoogleHistoricalRankOverviewLiveItem.metrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(seType, year, month, metrics);
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
    sb.append("class DataforseoLabsGoogleHistoricalRankOverviewLiveItem {\n");
    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
    openapiFields.add("se_type");
    openapiFields.add("year");
    openapiFields.add("month");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleHistoricalRankOverviewLiveItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataforseoLabsGoogleHistoricalRankOverviewLiveItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataforseoLabsGoogleHistoricalRankOverviewLiveItem is not found in the empty JSON string", DataforseoLabsGoogleHistoricalRankOverviewLiveItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataforseoLabsGoogleHistoricalRankOverviewLiveItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataforseoLabsGoogleHistoricalRankOverviewLiveItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("se_type") != null && !jsonObj.get("se_type").isJsonNull()) && !jsonObj.get("se_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `se_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("se_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleHistoricalRankOverviewLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleHistoricalRankOverviewLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleHistoricalRankOverviewLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleHistoricalRankOverviewLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleHistoricalRankOverviewLiveItem>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleHistoricalRankOverviewLiveItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataforseoLabsGoogleHistoricalRankOverviewLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataforseoLabsGoogleHistoricalRankOverviewLiveItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataforseoLabsGoogleHistoricalRankOverviewLiveItem
  * @throws IOException if the JSON string is invalid with respect to DataforseoLabsGoogleHistoricalRankOverviewLiveItem
  */
  public static DataforseoLabsGoogleHistoricalRankOverviewLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleHistoricalRankOverviewLiveItem.class);
  }

 /**
  * Convert an instance of DataforseoLabsGoogleHistoricalRankOverviewLiveItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
import io.github.dataforseo.client.model.GooglePlayMetricsBundleInfo;
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

/**
 * DataforseoLabsGoogleAppCompetitorsLiveItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class DataforseoLabsGoogleAppCompetitorsLiveItem {
  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_AVG_POSITION = "avg_position";
  @SerializedName(SERIALIZED_NAME_AVG_POSITION)
  private Float avgPosition;

  public static final String SERIALIZED_NAME_SUM_POSITION = "sum_position";
  @SerializedName(SERIALIZED_NAME_SUM_POSITION)
  private Integer sumPosition;

  public static final String SERIALIZED_NAME_INTERSECTIONS = "intersections";
  @SerializedName(SERIALIZED_NAME_INTERSECTIONS)
  private Integer intersections;

  public static final String SERIALIZED_NAME_COMPETITOR_METRICS = "competitor_metrics";
  @SerializedName(SERIALIZED_NAME_COMPETITOR_METRICS)
  private GooglePlayMetricsBundleInfo competitorMetrics;

  public static final String SERIALIZED_NAME_FULL_METRICS = "full_metrics";
  @SerializedName(SERIALIZED_NAME_FULL_METRICS)
  private GooglePlayMetricsBundleInfo fullMetrics;

  public DataforseoLabsGoogleAppCompetitorsLiveItem() {
  }

  public DataforseoLabsGoogleAppCompetitorsLiveItem seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * search engine type
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public DataforseoLabsGoogleAppCompetitorsLiveItem appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * id of the competitor app
   * @return appId
   */
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  public DataforseoLabsGoogleAppCompetitorsLiveItem avgPosition(Float avgPosition) {
    this.avgPosition = avgPosition;
    return this;
  }

  /**
   * average position of the app in Google Play SERP Note: average position is calculated for intersected keywords only; the value for a given application may differ when combined with different target applications
   * @return avgPosition
   */
  @javax.annotation.Nullable
  public Float getAvgPosition() {
    return avgPosition;
  }

  public void setAvgPosition(Float avgPosition) {
    this.avgPosition = avgPosition;
  }


  public DataforseoLabsGoogleAppCompetitorsLiveItem sumPosition(Integer sumPosition) {
    this.sumPosition = sumPosition;
    return this;
  }

  /**
   * sum of all app positions in Google Play SERP Note: sum position is calculated for intersected keywords only; the value for a given application may differ when combined with different target applications
   * @return sumPosition
   */
  @javax.annotation.Nullable
  public Integer getSumPosition() {
    return sumPosition;
  }

  public void setSumPosition(Integer sumPosition) {
    this.sumPosition = sumPosition;
  }


  public DataforseoLabsGoogleAppCompetitorsLiveItem intersections(Integer intersections) {
    this.intersections = intersections;
    return this;
  }

  /**
   * number of intersecting keywords
   * @return intersections
   */
  @javax.annotation.Nullable
  public Integer getIntersections() {
    return intersections;
  }

  public void setIntersections(Integer intersections) {
    this.intersections = intersections;
  }


  public DataforseoLabsGoogleAppCompetitorsLiveItem competitorMetrics(GooglePlayMetricsBundleInfo competitorMetrics) {
    this.competitorMetrics = competitorMetrics;
    return this;
  }

  /**
   * Get competitorMetrics
   * @return competitorMetrics
   */
  @javax.annotation.Nullable
  public GooglePlayMetricsBundleInfo getCompetitorMetrics() {
    return competitorMetrics;
  }

  public void setCompetitorMetrics(GooglePlayMetricsBundleInfo competitorMetrics) {
    this.competitorMetrics = competitorMetrics;
  }


  public DataforseoLabsGoogleAppCompetitorsLiveItem fullMetrics(GooglePlayMetricsBundleInfo fullMetrics) {
    this.fullMetrics = fullMetrics;
    return this;
  }

  /**
   * Get fullMetrics
   * @return fullMetrics
   */
  @javax.annotation.Nullable
  public GooglePlayMetricsBundleInfo getFullMetrics() {
    return fullMetrics;
  }

  public void setFullMetrics(GooglePlayMetricsBundleInfo fullMetrics) {
    this.fullMetrics = fullMetrics;
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
   * @return the DataforseoLabsGoogleAppCompetitorsLiveItem instance itself
   */
  public DataforseoLabsGoogleAppCompetitorsLiveItem putAdditionalProperty(String key, Object value) {
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
    DataforseoLabsGoogleAppCompetitorsLiveItem dataforseoLabsGoogleAppCompetitorsLiveItem = (DataforseoLabsGoogleAppCompetitorsLiveItem) o;
    return Objects.equals(this.seType, dataforseoLabsGoogleAppCompetitorsLiveItem.seType) &&
        Objects.equals(this.appId, dataforseoLabsGoogleAppCompetitorsLiveItem.appId) &&
        Objects.equals(this.avgPosition, dataforseoLabsGoogleAppCompetitorsLiveItem.avgPosition) &&
        Objects.equals(this.sumPosition, dataforseoLabsGoogleAppCompetitorsLiveItem.sumPosition) &&
        Objects.equals(this.intersections, dataforseoLabsGoogleAppCompetitorsLiveItem.intersections) &&
        Objects.equals(this.competitorMetrics, dataforseoLabsGoogleAppCompetitorsLiveItem.competitorMetrics) &&
        Objects.equals(this.fullMetrics, dataforseoLabsGoogleAppCompetitorsLiveItem.fullMetrics)&&
        Objects.equals(this.additionalProperties, dataforseoLabsGoogleAppCompetitorsLiveItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(seType, appId, avgPosition, sumPosition, intersections, competitorMetrics, fullMetrics, additionalProperties);
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
    sb.append("class DataforseoLabsGoogleAppCompetitorsLiveItem {\n");
    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    avgPosition: ").append(toIndentedString(avgPosition)).append("\n");
    sb.append("    sumPosition: ").append(toIndentedString(sumPosition)).append("\n");
    sb.append("    intersections: ").append(toIndentedString(intersections)).append("\n");
    sb.append("    competitorMetrics: ").append(toIndentedString(competitorMetrics)).append("\n");
    sb.append("    fullMetrics: ").append(toIndentedString(fullMetrics)).append("\n");
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
    openapiFields.add("se_type");
    openapiFields.add("app_id");
    openapiFields.add("avg_position");
    openapiFields.add("sum_position");
    openapiFields.add("intersections");
    openapiFields.add("competitor_metrics");
    openapiFields.add("full_metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleAppCompetitorsLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataforseoLabsGoogleAppCompetitorsLiveItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataforseoLabsGoogleAppCompetitorsLiveItem is not found in the empty JSON string", DataforseoLabsGoogleAppCompetitorsLiveItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("se_type") != null && !jsonObj.get("se_type").isJsonNull()) && !jsonObj.get("se_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `se_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("se_type").toString()));
      }
      if ((jsonObj.get("app_id") != null && !jsonObj.get("app_id").isJsonNull()) && !jsonObj.get("app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_id").toString()));
      }
      // validate the optional field `competitor_metrics`
      if (jsonObj.get("competitor_metrics") != null && !jsonObj.get("competitor_metrics").isJsonNull()) {
        GooglePlayMetricsBundleInfo.validateJsonElement(jsonObj.get("competitor_metrics"));
      }
      // validate the optional field `full_metrics`
      if (jsonObj.get("full_metrics") != null && !jsonObj.get("full_metrics").isJsonNull()) {
        GooglePlayMetricsBundleInfo.validateJsonElement(jsonObj.get("full_metrics"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleAppCompetitorsLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleAppCompetitorsLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleAppCompetitorsLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleAppCompetitorsLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleAppCompetitorsLiveItem>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleAppCompetitorsLiveItem value) throws IOException {
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
           public DataforseoLabsGoogleAppCompetitorsLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGoogleAppCompetitorsLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of DataforseoLabsGoogleAppCompetitorsLiveItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DataforseoLabsGoogleAppCompetitorsLiveItem
   * @throws IOException if the JSON string is invalid with respect to DataforseoLabsGoogleAppCompetitorsLiveItem
   */
  public static DataforseoLabsGoogleAppCompetitorsLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleAppCompetitorsLiveItem.class);
  }

  /**
   * Convert an instance of DataforseoLabsGoogleAppCompetitorsLiveItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

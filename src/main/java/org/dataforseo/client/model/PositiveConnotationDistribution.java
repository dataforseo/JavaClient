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
import org.dataforseo.client.model.ContentAnalysisSummaryInfo;

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
 * PositiveConnotationDistribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class PositiveConnotationDistribution {
  public static final String SERIALIZED_NAME_POSITIVE = "positive";
  @SerializedName(SERIALIZED_NAME_POSITIVE)
  private ContentAnalysisSummaryInfo positive;

  public static final String SERIALIZED_NAME_NEGATIVE = "negative";
  @SerializedName(SERIALIZED_NAME_NEGATIVE)
  private ContentAnalysisSummaryInfo negative;

  public static final String SERIALIZED_NAME_NEUTRAL = "neutral";
  @SerializedName(SERIALIZED_NAME_NEUTRAL)
  private ContentAnalysisSummaryInfo neutral;

  public PositiveConnotationDistribution() {
  }

  public PositiveConnotationDistribution positive(ContentAnalysisSummaryInfo positive) {
    this.positive = positive;
    return this;
  }

   /**
   * Get positive
   * @return positive
  **/
  @javax.annotation.Nullable
  public ContentAnalysisSummaryInfo getPositive() {
    return positive;
  }

  public void setPositive(ContentAnalysisSummaryInfo positive) {
    this.positive = positive;
  }


  public PositiveConnotationDistribution negative(ContentAnalysisSummaryInfo negative) {
    this.negative = negative;
    return this;
  }

   /**
   * Get negative
   * @return negative
  **/
  @javax.annotation.Nullable
  public ContentAnalysisSummaryInfo getNegative() {
    return negative;
  }

  public void setNegative(ContentAnalysisSummaryInfo negative) {
    this.negative = negative;
  }


  public PositiveConnotationDistribution neutral(ContentAnalysisSummaryInfo neutral) {
    this.neutral = neutral;
    return this;
  }

   /**
   * Get neutral
   * @return neutral
  **/
  @javax.annotation.Nullable
  public ContentAnalysisSummaryInfo getNeutral() {
    return neutral;
  }

  public void setNeutral(ContentAnalysisSummaryInfo neutral) {
    this.neutral = neutral;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositiveConnotationDistribution positiveConnotationDistribution = (PositiveConnotationDistribution) o;
    return Objects.equals(this.positive, positiveConnotationDistribution.positive) &&
        Objects.equals(this.negative, positiveConnotationDistribution.negative) &&
        Objects.equals(this.neutral, positiveConnotationDistribution.neutral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positive, negative, neutral);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositiveConnotationDistribution {\n");
    sb.append("    positive: ").append(toIndentedString(positive)).append("\n");
    sb.append("    negative: ").append(toIndentedString(negative)).append("\n");
    sb.append("    neutral: ").append(toIndentedString(neutral)).append("\n");
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
    openapiFields.add("positive");
    openapiFields.add("negative");
    openapiFields.add("neutral");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PositiveConnotationDistribution
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PositiveConnotationDistribution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PositiveConnotationDistribution is not found in the empty JSON string", PositiveConnotationDistribution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PositiveConnotationDistribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PositiveConnotationDistribution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `positive`
      if (jsonObj.get("positive") != null && !jsonObj.get("positive").isJsonNull()) {
        ContentAnalysisSummaryInfo.validateJsonElement(jsonObj.get("positive"));
      }
      // validate the optional field `negative`
      if (jsonObj.get("negative") != null && !jsonObj.get("negative").isJsonNull()) {
        ContentAnalysisSummaryInfo.validateJsonElement(jsonObj.get("negative"));
      }
      // validate the optional field `neutral`
      if (jsonObj.get("neutral") != null && !jsonObj.get("neutral").isJsonNull()) {
        ContentAnalysisSummaryInfo.validateJsonElement(jsonObj.get("neutral"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PositiveConnotationDistribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PositiveConnotationDistribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PositiveConnotationDistribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PositiveConnotationDistribution.class));

       return (TypeAdapter<T>) new TypeAdapter<PositiveConnotationDistribution>() {
           @Override
           public void write(JsonWriter out, PositiveConnotationDistribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PositiveConnotationDistribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PositiveConnotationDistribution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PositiveConnotationDistribution
  * @throws IOException if the JSON string is invalid with respect to PositiveConnotationDistribution
  */
  public static PositiveConnotationDistribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PositiveConnotationDistribution.class);
  }

 /**
  * Convert an instance of PositiveConnotationDistribution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

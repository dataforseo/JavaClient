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
 * AbsoluteItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class AbsoluteItems {
  public static final String SERIALIZED_NAME_GEO_ID = "geo_id";
  @SerializedName(SERIALIZED_NAME_GEO_ID)
  private String geoId;

  public static final String SERIALIZED_NAME_GEO_NAME = "geo_name";
  @SerializedName(SERIALIZED_NAME_GEO_NAME)
  private String geoName;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Integer> values;

  public AbsoluteItems() {
  }

  public AbsoluteItems geoId(String geoId) {
    this.geoId = geoId;
    return this;
  }

   /**
   * location identifier you can use this field for matching obtained results with location parameters specified in the request see the full list of available locations with their geo_id here or by making a separate request to https://api.dataforseo.com/v3/keywords_data/dataforseo_trends/locations example: US-NY
   * @return geoId
  **/
  @javax.annotation.Nullable
  public String getGeoId() {
    return geoId;
  }

  public void setGeoId(String geoId) {
    this.geoId = geoId;
  }


  public AbsoluteItems geoName(String geoName) {
    this.geoName = geoName;
    return this;
  }

   /**
   * location name you can use this field for matching obtained results with location parameters specified in the request see the full list of available locations with their geo_name here or by making a separate request to https://api.dataforseo.com/v3/keywords_data/dataforseo_trends/locations example: Andorra
   * @return geoName
  **/
  @javax.annotation.Nullable
  public String getGeoName() {
    return geoName;
  }

  public void setGeoName(String geoName) {
    this.geoName = geoName;
  }


  public AbsoluteItems values(List<Integer> values) {
    this.values = values;
    return this;
  }

  public AbsoluteItems addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * keyword popularity rates within a given location represents location-specific keyword popularity rate over the specified time range; using these values, you can understand which of the specified keywords is more popular in the related location; the first value in the array is provided for the first term from the keywords array, the second value is provided for the second keyword, and so on; calculation: we determine the highest popularity value across all specified keywords within a given location, and then express the popularity values of each keyword as a percentage of the highest value (100); a value of 100 is the peak popularity for the term a value of 50 means that the term is half as popular a value of 0 means there was not enough data for this term
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
    AbsoluteItems absoluteItems = (AbsoluteItems) o;
    return Objects.equals(this.geoId, absoluteItems.geoId) &&
        Objects.equals(this.geoName, absoluteItems.geoName) &&
        Objects.equals(this.values, absoluteItems.values);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoId, geoName, values);
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
    sb.append("class AbsoluteItems {\n");
    sb.append("    geoId: ").append(toIndentedString(geoId)).append("\n");
    sb.append("    geoName: ").append(toIndentedString(geoName)).append("\n");
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
    openapiFields.add("geo_id");
    openapiFields.add("geo_name");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AbsoluteItems
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AbsoluteItems.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbsoluteItems is not found in the empty JSON string", AbsoluteItems.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AbsoluteItems.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AbsoluteItems` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("geo_id") != null && !jsonObj.get("geo_id").isJsonNull()) && !jsonObj.get("geo_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `geo_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("geo_id").toString()));
      }
      if ((jsonObj.get("geo_name") != null && !jsonObj.get("geo_name").isJsonNull()) && !jsonObj.get("geo_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `geo_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("geo_name").toString()));
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
       if (!AbsoluteItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AbsoluteItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AbsoluteItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AbsoluteItems.class));

       return (TypeAdapter<T>) new TypeAdapter<AbsoluteItems>() {
           @Override
           public void write(JsonWriter out, AbsoluteItems value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AbsoluteItems read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AbsoluteItems given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbsoluteItems
  * @throws IOException if the JSON string is invalid with respect to AbsoluteItems
  */
  public static AbsoluteItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbsoluteItems.class);
  }

 /**
  * Convert an instance of AbsoluteItems to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

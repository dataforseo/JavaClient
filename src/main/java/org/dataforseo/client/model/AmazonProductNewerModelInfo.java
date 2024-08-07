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
 * AmazonProductNewerModelInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T15:18:23.103906100+03:00[Europe/Kiev]")
public class AmazonProductNewerModelInfo {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_NEWER_MODEL_ASIN = "newer_model_asin";
  @SerializedName(SERIALIZED_NAME_NEWER_MODEL_ASIN)
  private String newerModelAsin;

  public AmazonProductNewerModelInfo() {
  }

  public AmazonProductNewerModelInfo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * product title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public AmazonProductNewerModelInfo newerModelAsin(String newerModelAsin) {
    this.newerModelAsin = newerModelAsin;
    return this;
  }

   /**
   * ASIN of the newer product model
   * @return newerModelAsin
  **/
  @javax.annotation.Nullable
  public String getNewerModelAsin() {
    return newerModelAsin;
  }

  public void setNewerModelAsin(String newerModelAsin) {
    this.newerModelAsin = newerModelAsin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonProductNewerModelInfo amazonProductNewerModelInfo = (AmazonProductNewerModelInfo) o;
    return Objects.equals(this.title, amazonProductNewerModelInfo.title) &&
        Objects.equals(this.newerModelAsin, amazonProductNewerModelInfo.newerModelAsin);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, newerModelAsin);
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
    sb.append("class AmazonProductNewerModelInfo {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    newerModelAsin: ").append(toIndentedString(newerModelAsin)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("newer_model_asin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AmazonProductNewerModelInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AmazonProductNewerModelInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AmazonProductNewerModelInfo is not found in the empty JSON string", AmazonProductNewerModelInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AmazonProductNewerModelInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AmazonProductNewerModelInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("newer_model_asin") != null && !jsonObj.get("newer_model_asin").isJsonNull()) && !jsonObj.get("newer_model_asin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newer_model_asin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newer_model_asin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmazonProductNewerModelInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonProductNewerModelInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonProductNewerModelInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonProductNewerModelInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonProductNewerModelInfo>() {
           @Override
           public void write(JsonWriter out, AmazonProductNewerModelInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AmazonProductNewerModelInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AmazonProductNewerModelInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AmazonProductNewerModelInfo
  * @throws IOException if the JSON string is invalid with respect to AmazonProductNewerModelInfo
  */
  public static AmazonProductNewerModelInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonProductNewerModelInfo.class);
  }

 /**
  * Convert an instance of AmazonProductNewerModelInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


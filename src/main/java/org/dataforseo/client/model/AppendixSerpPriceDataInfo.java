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
import org.dataforseo.client.model.AppendixTaskKeywordsDataPriceDataInfo;

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
 * AppendixSerpPriceDataInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T09:14:36.455142500+03:00[Europe/Kiev]")
public class AppendixSerpPriceDataInfo {
  public static final String SERIALIZED_NAME_REGULAR = "regular";
  @SerializedName(SERIALIZED_NAME_REGULAR)
  private AppendixTaskKeywordsDataPriceDataInfo regular;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private AppendixTaskKeywordsDataPriceDataInfo html;

  public static final String SERIALIZED_NAME_ADVANCED = "advanced";
  @SerializedName(SERIALIZED_NAME_ADVANCED)
  private AppendixTaskKeywordsDataPriceDataInfo advanced;

  public AppendixSerpPriceDataInfo() {
  }

  public AppendixSerpPriceDataInfo regular(AppendixTaskKeywordsDataPriceDataInfo regular) {
    this.regular = regular;
    return this;
  }

   /**
   * Get regular
   * @return regular
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getRegular() {
    return regular;
  }

  public void setRegular(AppendixTaskKeywordsDataPriceDataInfo regular) {
    this.regular = regular;
  }


  public AppendixSerpPriceDataInfo html(AppendixTaskKeywordsDataPriceDataInfo html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getHtml() {
    return html;
  }

  public void setHtml(AppendixTaskKeywordsDataPriceDataInfo html) {
    this.html = html;
  }


  public AppendixSerpPriceDataInfo advanced(AppendixTaskKeywordsDataPriceDataInfo advanced) {
    this.advanced = advanced;
    return this;
  }

   /**
   * Get advanced
   * @return advanced
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getAdvanced() {
    return advanced;
  }

  public void setAdvanced(AppendixTaskKeywordsDataPriceDataInfo advanced) {
    this.advanced = advanced;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendixSerpPriceDataInfo appendixSerpPriceDataInfo = (AppendixSerpPriceDataInfo) o;
    return Objects.equals(this.regular, appendixSerpPriceDataInfo.regular) &&
        Objects.equals(this.html, appendixSerpPriceDataInfo.html) &&
        Objects.equals(this.advanced, appendixSerpPriceDataInfo.advanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regular, html, advanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendixSerpPriceDataInfo {\n");
    sb.append("    regular: ").append(toIndentedString(regular)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
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
    openapiFields.add("regular");
    openapiFields.add("html");
    openapiFields.add("advanced");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendixSerpPriceDataInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixSerpPriceDataInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixSerpPriceDataInfo is not found in the empty JSON string", AppendixSerpPriceDataInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppendixSerpPriceDataInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendixSerpPriceDataInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `regular`
      if (jsonObj.get("regular") != null && !jsonObj.get("regular").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("regular"));
      }
      // validate the optional field `html`
      if (jsonObj.get("html") != null && !jsonObj.get("html").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("html"));
      }
      // validate the optional field `advanced`
      if (jsonObj.get("advanced") != null && !jsonObj.get("advanced").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("advanced"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixSerpPriceDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixSerpPriceDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixSerpPriceDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixSerpPriceDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixSerpPriceDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixSerpPriceDataInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendixSerpPriceDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendixSerpPriceDataInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendixSerpPriceDataInfo
  * @throws IOException if the JSON string is invalid with respect to AppendixSerpPriceDataInfo
  */
  public static AppendixSerpPriceDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixSerpPriceDataInfo.class);
  }

 /**
  * Convert an instance of AppendixSerpPriceDataInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


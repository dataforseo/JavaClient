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
import org.dataforseo.client.model.AppendixFunctionInfo;

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
 * AppendixSocialMediaBusinessDataLimitsRatesDataInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class AppendixSocialMediaBusinessDataLimitsRatesDataInfo {
  public static final String SERIALIZED_NAME_FACEBOOK = "facebook";
  @SerializedName(SERIALIZED_NAME_FACEBOOK)
  private AppendixFunctionInfo facebook;

  public static final String SERIALIZED_NAME_PINTEREST = "pinterest";
  @SerializedName(SERIALIZED_NAME_PINTEREST)
  private AppendixFunctionInfo pinterest;

  public static final String SERIALIZED_NAME_REDDIT = "reddit";
  @SerializedName(SERIALIZED_NAME_REDDIT)
  private AppendixFunctionInfo reddit;

  public AppendixSocialMediaBusinessDataLimitsRatesDataInfo() {
  }

  public AppendixSocialMediaBusinessDataLimitsRatesDataInfo facebook(AppendixFunctionInfo facebook) {
    this.facebook = facebook;
    return this;
  }

   /**
   * Get facebook
   * @return facebook
  **/
  @javax.annotation.Nullable
  public AppendixFunctionInfo getFacebook() {
    return facebook;
  }

  public void setFacebook(AppendixFunctionInfo facebook) {
    this.facebook = facebook;
  }


  public AppendixSocialMediaBusinessDataLimitsRatesDataInfo pinterest(AppendixFunctionInfo pinterest) {
    this.pinterest = pinterest;
    return this;
  }

   /**
   * Get pinterest
   * @return pinterest
  **/
  @javax.annotation.Nullable
  public AppendixFunctionInfo getPinterest() {
    return pinterest;
  }

  public void setPinterest(AppendixFunctionInfo pinterest) {
    this.pinterest = pinterest;
  }


  public AppendixSocialMediaBusinessDataLimitsRatesDataInfo reddit(AppendixFunctionInfo reddit) {
    this.reddit = reddit;
    return this;
  }

   /**
   * Get reddit
   * @return reddit
  **/
  @javax.annotation.Nullable
  public AppendixFunctionInfo getReddit() {
    return reddit;
  }

  public void setReddit(AppendixFunctionInfo reddit) {
    this.reddit = reddit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendixSocialMediaBusinessDataLimitsRatesDataInfo appendixSocialMediaBusinessDataLimitsRatesDataInfo = (AppendixSocialMediaBusinessDataLimitsRatesDataInfo) o;
    return Objects.equals(this.facebook, appendixSocialMediaBusinessDataLimitsRatesDataInfo.facebook) &&
        Objects.equals(this.pinterest, appendixSocialMediaBusinessDataLimitsRatesDataInfo.pinterest) &&
        Objects.equals(this.reddit, appendixSocialMediaBusinessDataLimitsRatesDataInfo.reddit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facebook, pinterest, reddit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendixSocialMediaBusinessDataLimitsRatesDataInfo {\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    pinterest: ").append(toIndentedString(pinterest)).append("\n");
    sb.append("    reddit: ").append(toIndentedString(reddit)).append("\n");
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
    openapiFields.add("facebook");
    openapiFields.add("pinterest");
    openapiFields.add("reddit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendixSocialMediaBusinessDataLimitsRatesDataInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixSocialMediaBusinessDataLimitsRatesDataInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixSocialMediaBusinessDataLimitsRatesDataInfo is not found in the empty JSON string", AppendixSocialMediaBusinessDataLimitsRatesDataInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppendixSocialMediaBusinessDataLimitsRatesDataInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendixSocialMediaBusinessDataLimitsRatesDataInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `facebook`
      if (jsonObj.get("facebook") != null && !jsonObj.get("facebook").isJsonNull()) {
        AppendixFunctionInfo.validateJsonElement(jsonObj.get("facebook"));
      }
      // validate the optional field `pinterest`
      if (jsonObj.get("pinterest") != null && !jsonObj.get("pinterest").isJsonNull()) {
        AppendixFunctionInfo.validateJsonElement(jsonObj.get("pinterest"));
      }
      // validate the optional field `reddit`
      if (jsonObj.get("reddit") != null && !jsonObj.get("reddit").isJsonNull()) {
        AppendixFunctionInfo.validateJsonElement(jsonObj.get("reddit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixSocialMediaBusinessDataLimitsRatesDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixSocialMediaBusinessDataLimitsRatesDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixSocialMediaBusinessDataLimitsRatesDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixSocialMediaBusinessDataLimitsRatesDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixSocialMediaBusinessDataLimitsRatesDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixSocialMediaBusinessDataLimitsRatesDataInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendixSocialMediaBusinessDataLimitsRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendixSocialMediaBusinessDataLimitsRatesDataInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendixSocialMediaBusinessDataLimitsRatesDataInfo
  * @throws IOException if the JSON string is invalid with respect to AppendixSocialMediaBusinessDataLimitsRatesDataInfo
  */
  public static AppendixSocialMediaBusinessDataLimitsRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixSocialMediaBusinessDataLimitsRatesDataInfo.class);
  }

 /**
  * Convert an instance of AppendixSocialMediaBusinessDataLimitsRatesDataInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

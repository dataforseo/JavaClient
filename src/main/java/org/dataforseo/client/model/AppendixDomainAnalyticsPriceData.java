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
import org.dataforseo.client.model.AppendixTechnologiesDomainAnalyticsPriceData;
import org.dataforseo.client.model.AppendixWhoisDomainAnalyticsPriceData;

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
 * AppendixDomainAnalyticsPriceData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class AppendixDomainAnalyticsPriceData {
  public static final String SERIALIZED_NAME_WHOIS = "whois";
  @SerializedName(SERIALIZED_NAME_WHOIS)
  private AppendixWhoisDomainAnalyticsPriceData whois;

  public static final String SERIALIZED_NAME_TECHNOLOGIES = "technologies";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGIES)
  private AppendixTechnologiesDomainAnalyticsPriceData technologies;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private AppendixTaskKeywordsDataPriceDataInfo tasksReady;

  public AppendixDomainAnalyticsPriceData() {
  }

  public AppendixDomainAnalyticsPriceData whois(AppendixWhoisDomainAnalyticsPriceData whois) {
    this.whois = whois;
    return this;
  }

   /**
   * Get whois
   * @return whois
  **/
  @javax.annotation.Nullable
  public AppendixWhoisDomainAnalyticsPriceData getWhois() {
    return whois;
  }

  public void setWhois(AppendixWhoisDomainAnalyticsPriceData whois) {
    this.whois = whois;
  }


  public AppendixDomainAnalyticsPriceData technologies(AppendixTechnologiesDomainAnalyticsPriceData technologies) {
    this.technologies = technologies;
    return this;
  }

   /**
   * Get technologies
   * @return technologies
  **/
  @javax.annotation.Nullable
  public AppendixTechnologiesDomainAnalyticsPriceData getTechnologies() {
    return technologies;
  }

  public void setTechnologies(AppendixTechnologiesDomainAnalyticsPriceData technologies) {
    this.technologies = technologies;
  }


  public AppendixDomainAnalyticsPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getErrors() {
    return errors;
  }

  public void setErrors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
  }


  public AppendixDomainAnalyticsPriceData tasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

   /**
   * Get tasksReady
   * @return tasksReady
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendixDomainAnalyticsPriceData appendixDomainAnalyticsPriceData = (AppendixDomainAnalyticsPriceData) o;
    return Objects.equals(this.whois, appendixDomainAnalyticsPriceData.whois) &&
        Objects.equals(this.technologies, appendixDomainAnalyticsPriceData.technologies) &&
        Objects.equals(this.errors, appendixDomainAnalyticsPriceData.errors) &&
        Objects.equals(this.tasksReady, appendixDomainAnalyticsPriceData.tasksReady);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whois, technologies, errors, tasksReady);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendixDomainAnalyticsPriceData {\n");
    sb.append("    whois: ").append(toIndentedString(whois)).append("\n");
    sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
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
    openapiFields.add("whois");
    openapiFields.add("technologies");
    openapiFields.add("errors");
    openapiFields.add("tasks_ready");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendixDomainAnalyticsPriceData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixDomainAnalyticsPriceData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixDomainAnalyticsPriceData is not found in the empty JSON string", AppendixDomainAnalyticsPriceData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppendixDomainAnalyticsPriceData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendixDomainAnalyticsPriceData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `whois`
      if (jsonObj.get("whois") != null && !jsonObj.get("whois").isJsonNull()) {
        AppendixWhoisDomainAnalyticsPriceData.validateJsonElement(jsonObj.get("whois"));
      }
      // validate the optional field `technologies`
      if (jsonObj.get("technologies") != null && !jsonObj.get("technologies").isJsonNull()) {
        AppendixTechnologiesDomainAnalyticsPriceData.validateJsonElement(jsonObj.get("technologies"));
      }
      // validate the optional field `errors`
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("errors"));
      }
      // validate the optional field `tasks_ready`
      if (jsonObj.get("tasks_ready") != null && !jsonObj.get("tasks_ready").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("tasks_ready"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixDomainAnalyticsPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixDomainAnalyticsPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixDomainAnalyticsPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixDomainAnalyticsPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixDomainAnalyticsPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixDomainAnalyticsPriceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendixDomainAnalyticsPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendixDomainAnalyticsPriceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendixDomainAnalyticsPriceData
  * @throws IOException if the JSON string is invalid with respect to AppendixDomainAnalyticsPriceData
  */
  public static AppendixDomainAnalyticsPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixDomainAnalyticsPriceData.class);
  }

 /**
  * Convert an instance of AppendixDomainAnalyticsPriceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
import io.github.dataforseo.client.model.AppendixTechnologiesDomainAnalyticsLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixWhoisDomainAnalyticsLimitsRatesDataInfo;
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
 * AppendixDomainAnalyticsDayStatisticsRatesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class AppendixDomainAnalyticsDayStatisticsRatesData {
  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private Double tasksReady;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Double errors;

  public static final String SERIALIZED_NAME_WHOIS = "whois";
  @SerializedName(SERIALIZED_NAME_WHOIS)
  private AppendixWhoisDomainAnalyticsLimitsRatesDataInfo whois;

  public static final String SERIALIZED_NAME_TECHNOLOGIES = "technologies";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGIES)
  private AppendixTechnologiesDomainAnalyticsLimitsRatesDataInfo technologies;

  public static final String SERIALIZED_NAME_AVAILABLE_FILTERS = "available_filters";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_FILTERS)
  private Double availableFilters;

  public static final String SERIALIZED_NAME_ID_LIST = "id_list";
  @SerializedName(SERIALIZED_NAME_ID_LIST)
  private Double idList;

  public AppendixDomainAnalyticsDayStatisticsRatesData() {
  }

  public AppendixDomainAnalyticsDayStatisticsRatesData tasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

  /**
   * Get tasksReady
   * @return tasksReady
   */
  @javax.annotation.Nullable
  public Double getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
  }


  public AppendixDomainAnalyticsDayStatisticsRatesData errors(Double errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @javax.annotation.Nullable
  public Double getErrors() {
    return errors;
  }

  public void setErrors(Double errors) {
    this.errors = errors;
  }


  public AppendixDomainAnalyticsDayStatisticsRatesData whois(AppendixWhoisDomainAnalyticsLimitsRatesDataInfo whois) {
    this.whois = whois;
    return this;
  }

  /**
   * Get whois
   * @return whois
   */
  @javax.annotation.Nullable
  public AppendixWhoisDomainAnalyticsLimitsRatesDataInfo getWhois() {
    return whois;
  }

  public void setWhois(AppendixWhoisDomainAnalyticsLimitsRatesDataInfo whois) {
    this.whois = whois;
  }


  public AppendixDomainAnalyticsDayStatisticsRatesData technologies(AppendixTechnologiesDomainAnalyticsLimitsRatesDataInfo technologies) {
    this.technologies = technologies;
    return this;
  }

  /**
   * Get technologies
   * @return technologies
   */
  @javax.annotation.Nullable
  public AppendixTechnologiesDomainAnalyticsLimitsRatesDataInfo getTechnologies() {
    return technologies;
  }

  public void setTechnologies(AppendixTechnologiesDomainAnalyticsLimitsRatesDataInfo technologies) {
    this.technologies = technologies;
  }


  public AppendixDomainAnalyticsDayStatisticsRatesData availableFilters(Double availableFilters) {
    this.availableFilters = availableFilters;
    return this;
  }

  /**
   * Get availableFilters
   * @return availableFilters
   */
  @javax.annotation.Nullable
  public Double getAvailableFilters() {
    return availableFilters;
  }

  public void setAvailableFilters(Double availableFilters) {
    this.availableFilters = availableFilters;
  }


  public AppendixDomainAnalyticsDayStatisticsRatesData idList(Double idList) {
    this.idList = idList;
    return this;
  }

  /**
   * Get idList
   * @return idList
   */
  @javax.annotation.Nullable
  public Double getIdList() {
    return idList;
  }

  public void setIdList(Double idList) {
    this.idList = idList;
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
   * @return the AppendixDomainAnalyticsDayStatisticsRatesData instance itself
   */
  public AppendixDomainAnalyticsDayStatisticsRatesData putAdditionalProperty(String key, Object value) {
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
    AppendixDomainAnalyticsDayStatisticsRatesData appendixDomainAnalyticsDayStatisticsRatesData = (AppendixDomainAnalyticsDayStatisticsRatesData) o;
    return Objects.equals(this.tasksReady, appendixDomainAnalyticsDayStatisticsRatesData.tasksReady) &&
        Objects.equals(this.errors, appendixDomainAnalyticsDayStatisticsRatesData.errors) &&
        Objects.equals(this.whois, appendixDomainAnalyticsDayStatisticsRatesData.whois) &&
        Objects.equals(this.technologies, appendixDomainAnalyticsDayStatisticsRatesData.technologies) &&
        Objects.equals(this.availableFilters, appendixDomainAnalyticsDayStatisticsRatesData.availableFilters) &&
        Objects.equals(this.idList, appendixDomainAnalyticsDayStatisticsRatesData.idList)&&
        Objects.equals(this.additionalProperties, appendixDomainAnalyticsDayStatisticsRatesData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tasksReady, errors, whois, technologies, availableFilters, idList, additionalProperties);
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
    sb.append("class AppendixDomainAnalyticsDayStatisticsRatesData {\n");
    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    whois: ").append(toIndentedString(whois)).append("\n");
    sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
    sb.append("    availableFilters: ").append(toIndentedString(availableFilters)).append("\n");
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
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
    openapiFields.add("tasks_ready");
    openapiFields.add("errors");
    openapiFields.add("whois");
    openapiFields.add("technologies");
    openapiFields.add("available_filters");
    openapiFields.add("id_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixDomainAnalyticsDayStatisticsRatesData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixDomainAnalyticsDayStatisticsRatesData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixDomainAnalyticsDayStatisticsRatesData is not found in the empty JSON string", AppendixDomainAnalyticsDayStatisticsRatesData.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `whois`
      if (jsonObj.get("whois") != null && !jsonObj.get("whois").isJsonNull()) {
        AppendixWhoisDomainAnalyticsLimitsRatesDataInfo.validateJsonElement(jsonObj.get("whois"));
      }
      // validate the optional field `technologies`
      if (jsonObj.get("technologies") != null && !jsonObj.get("technologies").isJsonNull()) {
        AppendixTechnologiesDomainAnalyticsLimitsRatesDataInfo.validateJsonElement(jsonObj.get("technologies"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixDomainAnalyticsDayStatisticsRatesData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixDomainAnalyticsDayStatisticsRatesData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixDomainAnalyticsDayStatisticsRatesData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixDomainAnalyticsDayStatisticsRatesData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixDomainAnalyticsDayStatisticsRatesData>() {
           @Override
           public void write(JsonWriter out, AppendixDomainAnalyticsDayStatisticsRatesData value) throws IOException {
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
           public AppendixDomainAnalyticsDayStatisticsRatesData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixDomainAnalyticsDayStatisticsRatesData instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AppendixDomainAnalyticsDayStatisticsRatesData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppendixDomainAnalyticsDayStatisticsRatesData
   * @throws IOException if the JSON string is invalid with respect to AppendixDomainAnalyticsDayStatisticsRatesData
   */
  public static AppendixDomainAnalyticsDayStatisticsRatesData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixDomainAnalyticsDayStatisticsRatesData.class);
  }

  /**
   * Convert an instance of AppendixDomainAnalyticsDayStatisticsRatesData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

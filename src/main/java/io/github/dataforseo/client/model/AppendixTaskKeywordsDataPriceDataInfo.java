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
import io.github.dataforseo.client.model.AppendixPriorityTasksReadyKeywordsDataPriceDataInfo;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.dataforseo.client.JSON;

/**
 * AppendixTaskKeywordsDataPriceDataInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class AppendixTaskKeywordsDataPriceDataInfo {
  public static final String SERIALIZED_NAME_PRIORITY_LOW = "priority_low";
  @SerializedName(SERIALIZED_NAME_PRIORITY_LOW)
  private List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> priorityLow;

  public static final String SERIALIZED_NAME_PRIORITY_NORMAL = "priority_normal";
  @SerializedName(SERIALIZED_NAME_PRIORITY_NORMAL)
  private List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> priorityNormal;

  public static final String SERIALIZED_NAME_PRIORITY_HIGH = "priority_high";
  @SerializedName(SERIALIZED_NAME_PRIORITY_HIGH)
  private List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> priorityHigh;

  public AppendixTaskKeywordsDataPriceDataInfo() {
  }

  public AppendixTaskKeywordsDataPriceDataInfo priorityLow(List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> priorityLow) {
    this.priorityLow = priorityLow;
    return this;
  }

  public AppendixTaskKeywordsDataPriceDataInfo addPriorityLowItem(AppendixPriorityTasksReadyKeywordsDataPriceDataInfo priorityLowItem) {
    if (this.priorityLow == null) {
      this.priorityLow = new ArrayList<>();
    }
    this.priorityLow.add(priorityLowItem);
    return this;
  }

  /**
   * Get priorityLow
   * @return priorityLow
   */
  @javax.annotation.Nullable
  public List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> getPriorityLow() {
    return priorityLow;
  }

  public void setPriorityLow(List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> priorityLow) {
    this.priorityLow = priorityLow;
  }


  public AppendixTaskKeywordsDataPriceDataInfo priorityNormal(List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> priorityNormal) {
    this.priorityNormal = priorityNormal;
    return this;
  }

  public AppendixTaskKeywordsDataPriceDataInfo addPriorityNormalItem(AppendixPriorityTasksReadyKeywordsDataPriceDataInfo priorityNormalItem) {
    if (this.priorityNormal == null) {
      this.priorityNormal = new ArrayList<>();
    }
    this.priorityNormal.add(priorityNormalItem);
    return this;
  }

  /**
   * Get priorityNormal
   * @return priorityNormal
   */
  @javax.annotation.Nullable
  public List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> getPriorityNormal() {
    return priorityNormal;
  }

  public void setPriorityNormal(List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> priorityNormal) {
    this.priorityNormal = priorityNormal;
  }


  public AppendixTaskKeywordsDataPriceDataInfo priorityHigh(List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> priorityHigh) {
    this.priorityHigh = priorityHigh;
    return this;
  }

  public AppendixTaskKeywordsDataPriceDataInfo addPriorityHighItem(AppendixPriorityTasksReadyKeywordsDataPriceDataInfo priorityHighItem) {
    if (this.priorityHigh == null) {
      this.priorityHigh = new ArrayList<>();
    }
    this.priorityHigh.add(priorityHighItem);
    return this;
  }

  /**
   * Get priorityHigh
   * @return priorityHigh
   */
  @javax.annotation.Nullable
  public List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> getPriorityHigh() {
    return priorityHigh;
  }

  public void setPriorityHigh(List<AppendixPriorityTasksReadyKeywordsDataPriceDataInfo> priorityHigh) {
    this.priorityHigh = priorityHigh;
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
   * @return the AppendixTaskKeywordsDataPriceDataInfo instance itself
   */
  public AppendixTaskKeywordsDataPriceDataInfo putAdditionalProperty(String key, Object value) {
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
    AppendixTaskKeywordsDataPriceDataInfo appendixTaskKeywordsDataPriceDataInfo = (AppendixTaskKeywordsDataPriceDataInfo) o;
    return Objects.equals(this.priorityLow, appendixTaskKeywordsDataPriceDataInfo.priorityLow) &&
        Objects.equals(this.priorityNormal, appendixTaskKeywordsDataPriceDataInfo.priorityNormal) &&
        Objects.equals(this.priorityHigh, appendixTaskKeywordsDataPriceDataInfo.priorityHigh)&&
        Objects.equals(this.additionalProperties, appendixTaskKeywordsDataPriceDataInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityLow, priorityNormal, priorityHigh, additionalProperties);
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
    sb.append("class AppendixTaskKeywordsDataPriceDataInfo {\n");
    sb.append("    priorityLow: ").append(toIndentedString(priorityLow)).append("\n");
    sb.append("    priorityNormal: ").append(toIndentedString(priorityNormal)).append("\n");
    sb.append("    priorityHigh: ").append(toIndentedString(priorityHigh)).append("\n");
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
    openapiFields.add("priority_low");
    openapiFields.add("priority_normal");
    openapiFields.add("priority_high");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixTaskKeywordsDataPriceDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixTaskKeywordsDataPriceDataInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixTaskKeywordsDataPriceDataInfo is not found in the empty JSON string", AppendixTaskKeywordsDataPriceDataInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("priority_low") != null && !jsonObj.get("priority_low").isJsonNull()) {
        JsonArray jsonArraypriorityLow = jsonObj.getAsJsonArray("priority_low");
        if (jsonArraypriorityLow != null) {
          // ensure the json data is an array
          if (!jsonObj.get("priority_low").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `priority_low` to be an array in the JSON string but got `%s`", jsonObj.get("priority_low").toString()));
          }

          // validate the optional field `priority_low` (array)
          for (int i = 0; i < jsonArraypriorityLow.size(); i++) {
            AppendixPriorityTasksReadyKeywordsDataPriceDataInfo.validateJsonElement(jsonArraypriorityLow.get(i));
          };
        }
      }
      if (jsonObj.get("priority_normal") != null && !jsonObj.get("priority_normal").isJsonNull()) {
        JsonArray jsonArraypriorityNormal = jsonObj.getAsJsonArray("priority_normal");
        if (jsonArraypriorityNormal != null) {
          // ensure the json data is an array
          if (!jsonObj.get("priority_normal").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `priority_normal` to be an array in the JSON string but got `%s`", jsonObj.get("priority_normal").toString()));
          }

          // validate the optional field `priority_normal` (array)
          for (int i = 0; i < jsonArraypriorityNormal.size(); i++) {
            AppendixPriorityTasksReadyKeywordsDataPriceDataInfo.validateJsonElement(jsonArraypriorityNormal.get(i));
          };
        }
      }
      if (jsonObj.get("priority_high") != null && !jsonObj.get("priority_high").isJsonNull()) {
        JsonArray jsonArraypriorityHigh = jsonObj.getAsJsonArray("priority_high");
        if (jsonArraypriorityHigh != null) {
          // ensure the json data is an array
          if (!jsonObj.get("priority_high").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `priority_high` to be an array in the JSON string but got `%s`", jsonObj.get("priority_high").toString()));
          }

          // validate the optional field `priority_high` (array)
          for (int i = 0; i < jsonArraypriorityHigh.size(); i++) {
            AppendixPriorityTasksReadyKeywordsDataPriceDataInfo.validateJsonElement(jsonArraypriorityHigh.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixTaskKeywordsDataPriceDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixTaskKeywordsDataPriceDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixTaskKeywordsDataPriceDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixTaskKeywordsDataPriceDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixTaskKeywordsDataPriceDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixTaskKeywordsDataPriceDataInfo value) throws IOException {
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
           public AppendixTaskKeywordsDataPriceDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixTaskKeywordsDataPriceDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AppendixTaskKeywordsDataPriceDataInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppendixTaskKeywordsDataPriceDataInfo
   * @throws IOException if the JSON string is invalid with respect to AppendixTaskKeywordsDataPriceDataInfo
   */
  public static AppendixTaskKeywordsDataPriceDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixTaskKeywordsDataPriceDataInfo.class);
  }

  /**
   * Convert an instance of AppendixTaskKeywordsDataPriceDataInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

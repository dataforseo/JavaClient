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
 * AppendixGoogleBusinessDataPriceDataInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T10:30:03.431691300+03:00[Europe/Kiev]")
public class AppendixGoogleBusinessDataPriceDataInfo {
  public static final String SERIALIZED_NAME_LIVE = "live";
  @SerializedName(SERIALIZED_NAME_LIVE)
  private AppendixTaskKeywordsDataPriceDataInfo live;

  public static final String SERIALIZED_NAME_TASK_GET = "task_get";
  @SerializedName(SERIALIZED_NAME_TASK_GET)
  private AppendixTaskKeywordsDataPriceDataInfo taskGet;

  public static final String SERIALIZED_NAME_TASK_POST = "task_post";
  @SerializedName(SERIALIZED_NAME_TASK_POST)
  private AppendixTaskKeywordsDataPriceDataInfo taskPost;

  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private AppendixTaskKeywordsDataPriceDataInfo tasksReady;

  public AppendixGoogleBusinessDataPriceDataInfo() {
  }

  public AppendixGoogleBusinessDataPriceDataInfo live(AppendixTaskKeywordsDataPriceDataInfo live) {
    this.live = live;
    return this;
  }

   /**
   * Get live
   * @return live
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLive() {
    return live;
  }

  public void setLive(AppendixTaskKeywordsDataPriceDataInfo live) {
    this.live = live;
  }


  public AppendixGoogleBusinessDataPriceDataInfo taskGet(AppendixTaskKeywordsDataPriceDataInfo taskGet) {
    this.taskGet = taskGet;
    return this;
  }

   /**
   * Get taskGet
   * @return taskGet
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTaskGet() {
    return taskGet;
  }

  public void setTaskGet(AppendixTaskKeywordsDataPriceDataInfo taskGet) {
    this.taskGet = taskGet;
  }


  public AppendixGoogleBusinessDataPriceDataInfo taskPost(AppendixTaskKeywordsDataPriceDataInfo taskPost) {
    this.taskPost = taskPost;
    return this;
  }

   /**
   * Get taskPost
   * @return taskPost
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTaskPost() {
    return taskPost;
  }

  public void setTaskPost(AppendixTaskKeywordsDataPriceDataInfo taskPost) {
    this.taskPost = taskPost;
  }


  public AppendixGoogleBusinessDataPriceDataInfo tasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
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
    AppendixGoogleBusinessDataPriceDataInfo appendixGoogleBusinessDataPriceDataInfo = (AppendixGoogleBusinessDataPriceDataInfo) o;
    return Objects.equals(this.live, appendixGoogleBusinessDataPriceDataInfo.live) &&
        Objects.equals(this.taskGet, appendixGoogleBusinessDataPriceDataInfo.taskGet) &&
        Objects.equals(this.taskPost, appendixGoogleBusinessDataPriceDataInfo.taskPost) &&
        Objects.equals(this.tasksReady, appendixGoogleBusinessDataPriceDataInfo.tasksReady);
  }

  @Override
  public int hashCode() {
    return Objects.hash(live, taskGet, taskPost, tasksReady);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendixGoogleBusinessDataPriceDataInfo {\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    taskGet: ").append(toIndentedString(taskGet)).append("\n");
    sb.append("    taskPost: ").append(toIndentedString(taskPost)).append("\n");
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
    openapiFields.add("live");
    openapiFields.add("task_get");
    openapiFields.add("task_post");
    openapiFields.add("tasks_ready");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendixGoogleBusinessDataPriceDataInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixGoogleBusinessDataPriceDataInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixGoogleBusinessDataPriceDataInfo is not found in the empty JSON string", AppendixGoogleBusinessDataPriceDataInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppendixGoogleBusinessDataPriceDataInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendixGoogleBusinessDataPriceDataInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `live`
      if (jsonObj.get("live") != null && !jsonObj.get("live").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("live"));
      }
      // validate the optional field `task_get`
      if (jsonObj.get("task_get") != null && !jsonObj.get("task_get").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("task_get"));
      }
      // validate the optional field `task_post`
      if (jsonObj.get("task_post") != null && !jsonObj.get("task_post").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("task_post"));
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
       if (!AppendixGoogleBusinessDataPriceDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixGoogleBusinessDataPriceDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixGoogleBusinessDataPriceDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixGoogleBusinessDataPriceDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixGoogleBusinessDataPriceDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixGoogleBusinessDataPriceDataInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendixGoogleBusinessDataPriceDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendixGoogleBusinessDataPriceDataInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendixGoogleBusinessDataPriceDataInfo
  * @throws IOException if the JSON string is invalid with respect to AppendixGoogleBusinessDataPriceDataInfo
  */
  public static AppendixGoogleBusinessDataPriceDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixGoogleBusinessDataPriceDataInfo.class);
  }

 /**
  * Convert an instance of AppendixGoogleBusinessDataPriceDataInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

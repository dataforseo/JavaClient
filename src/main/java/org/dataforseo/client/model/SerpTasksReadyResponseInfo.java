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
import org.dataforseo.client.model.SerpTasksReadyTaskInfo;
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
 * SerpTasksReadyResponseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T10:30:03.431691300+03:00[Europe/Kiev]")
public class SerpTasksReadyResponseInfo {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "status_message";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost;

  public static final String SERIALIZED_NAME_TASKS_COUNT = "tasks_count";
  @SerializedName(SERIALIZED_NAME_TASKS_COUNT)
  private Long tasksCount;

  public static final String SERIALIZED_NAME_TASKS_ERROR = "tasks_error";
  @SerializedName(SERIALIZED_NAME_TASKS_ERROR)
  private Long tasksError;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<SerpTasksReadyTaskInfo> tasks;

  public SerpTasksReadyResponseInfo() {
  }

  public SerpTasksReadyResponseInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * the current version of the API
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public SerpTasksReadyResponseInfo statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * general status code you can find the full list of the response codes here
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public SerpTasksReadyResponseInfo statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * general informational message you can find the full list of general informational messages here
   * @return statusMessage
  **/
  @javax.annotation.Nullable
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  public SerpTasksReadyResponseInfo time(String time) {
    this.time = time;
    return this;
  }

   /**
   * total execution time, seconds
   * @return time
  **/
  @javax.annotation.Nullable
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  public SerpTasksReadyResponseInfo cost(Double cost) {
    this.cost = cost;
    return this;
  }

   /**
   * total tasks cost, USD
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }


  public SerpTasksReadyResponseInfo tasksCount(Long tasksCount) {
    this.tasksCount = tasksCount;
    return this;
  }

   /**
   * the number of tasks in the tasks array
   * @return tasksCount
  **/
  @javax.annotation.Nullable
  public Long getTasksCount() {
    return tasksCount;
  }

  public void setTasksCount(Long tasksCount) {
    this.tasksCount = tasksCount;
  }


  public SerpTasksReadyResponseInfo tasksError(Long tasksError) {
    this.tasksError = tasksError;
    return this;
  }

   /**
   * the number of tasks in the tasks array returned with an error
   * @return tasksError
  **/
  @javax.annotation.Nullable
  public Long getTasksError() {
    return tasksError;
  }

  public void setTasksError(Long tasksError) {
    this.tasksError = tasksError;
  }


  public SerpTasksReadyResponseInfo tasks(List<SerpTasksReadyTaskInfo> tasks) {
    this.tasks = tasks;
    return this;
  }

  public SerpTasksReadyResponseInfo addTasksItem(SerpTasksReadyTaskInfo tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * array of tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  public List<SerpTasksReadyTaskInfo> getTasks() {
    return tasks;
  }

  public void setTasks(List<SerpTasksReadyTaskInfo> tasks) {
    this.tasks = tasks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SerpTasksReadyResponseInfo serpTasksReadyResponseInfo = (SerpTasksReadyResponseInfo) o;
    return Objects.equals(this.version, serpTasksReadyResponseInfo.version) &&
        Objects.equals(this.statusCode, serpTasksReadyResponseInfo.statusCode) &&
        Objects.equals(this.statusMessage, serpTasksReadyResponseInfo.statusMessage) &&
        Objects.equals(this.time, serpTasksReadyResponseInfo.time) &&
        Objects.equals(this.cost, serpTasksReadyResponseInfo.cost) &&
        Objects.equals(this.tasksCount, serpTasksReadyResponseInfo.tasksCount) &&
        Objects.equals(this.tasksError, serpTasksReadyResponseInfo.tasksError) &&
        Objects.equals(this.tasks, serpTasksReadyResponseInfo.tasks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, statusCode, statusMessage, time, cost, tasksCount, tasksError, tasks);
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
    sb.append("class SerpTasksReadyResponseInfo {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    tasksCount: ").append(toIndentedString(tasksCount)).append("\n");
    sb.append("    tasksError: ").append(toIndentedString(tasksError)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("status_code");
    openapiFields.add("status_message");
    openapiFields.add("time");
    openapiFields.add("cost");
    openapiFields.add("tasks_count");
    openapiFields.add("tasks_error");
    openapiFields.add("tasks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SerpTasksReadyResponseInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SerpTasksReadyResponseInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SerpTasksReadyResponseInfo is not found in the empty JSON string", SerpTasksReadyResponseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SerpTasksReadyResponseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SerpTasksReadyResponseInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("status_message") != null && !jsonObj.get("status_message").isJsonNull()) && !jsonObj.get("status_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_message").toString()));
      }
      if ((jsonObj.get("time") != null && !jsonObj.get("time").isJsonNull()) && !jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
      }
      if (jsonObj.get("tasks") != null && !jsonObj.get("tasks").isJsonNull()) {
        JsonArray jsonArraytasks = jsonObj.getAsJsonArray("tasks");
        if (jsonArraytasks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tasks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tasks` to be an array in the JSON string but got `%s`", jsonObj.get("tasks").toString()));
          }

          // validate the optional field `tasks` (array)
          for (int i = 0; i < jsonArraytasks.size(); i++) {
            SerpTasksReadyTaskInfo.validateJsonElement(jsonArraytasks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpTasksReadyResponseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpTasksReadyResponseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpTasksReadyResponseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpTasksReadyResponseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpTasksReadyResponseInfo>() {
           @Override
           public void write(JsonWriter out, SerpTasksReadyResponseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SerpTasksReadyResponseInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SerpTasksReadyResponseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SerpTasksReadyResponseInfo
  * @throws IOException if the JSON string is invalid with respect to SerpTasksReadyResponseInfo
  */
  public static SerpTasksReadyResponseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpTasksReadyResponseInfo.class);
  }

 /**
  * Convert an instance of SerpTasksReadyResponseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

package io.github.dataforseo.client.model;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.dataforseo.client.JSON;



public class SerpGoogleFinanceMarketsTasksReadyResponseInfo  {

    
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;
    
  public SerpGoogleFinanceMarketsTasksReadyResponseInfo version(String version) {
    this.version = version;
    return this;
  }
    
  /**
   * the current version of the API
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }
    
  public void setVersion(String version) {
    this.version = version;
  }
    
    
  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;
    
  public SerpGoogleFinanceMarketsTasksReadyResponseInfo statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }
    
  /**
   * general status code
* you can find the full list of the response codes here
   * @return statusCode
   */
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }
    
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }
    
    
  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "status_message";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;
    
  public SerpGoogleFinanceMarketsTasksReadyResponseInfo statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }
    
  /**
   * general informational message
* you can find the full list of general informational messages here
   * @return statusMessage
   */
  @javax.annotation.Nullable
  public String getStatusMessage() {
    return statusMessage;
  }
    
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }
    
    
  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;
    
  public SerpGoogleFinanceMarketsTasksReadyResponseInfo time(String time) {
    this.time = time;
    return this;
  }
    
  /**
   * total execution time, seconds
   * @return time
   */
  @javax.annotation.Nullable
  public String getTime() {
    return time;
  }
    
  public void setTime(String time) {
    this.time = time;
  }
    
    
  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost;
    
  public SerpGoogleFinanceMarketsTasksReadyResponseInfo cost(Double cost) {
    this.cost = cost;
    return this;
  }
    
  /**
   * total tasks cost, USD
   * @return cost
   */
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }
    
  public void setCost(Double cost) {
    this.cost = cost;
  }
    
    
  public static final String SERIALIZED_NAME_TASKS_COUNT = "tasks_count";
  @SerializedName(SERIALIZED_NAME_TASKS_COUNT)
  private Long tasksCount;
    
  public SerpGoogleFinanceMarketsTasksReadyResponseInfo tasksCount(Long tasksCount) {
    this.tasksCount = tasksCount;
    return this;
  }
    
  /**
   * the number of tasks in the tasks array
   * @return tasksCount
   */
  @javax.annotation.Nullable
  public Long getTasksCount() {
    return tasksCount;
  }
    
  public void setTasksCount(Long tasksCount) {
    this.tasksCount = tasksCount;
  }
    
    
  public static final String SERIALIZED_NAME_TASKS_ERROR = "tasks_error";
  @SerializedName(SERIALIZED_NAME_TASKS_ERROR)
  private Long tasksError;
    
  public SerpGoogleFinanceMarketsTasksReadyResponseInfo tasksError(Long tasksError) {
    this.tasksError = tasksError;
    return this;
  }
    
  /**
   * the number of tasks in the tasks array returned with an error
   * @return tasksError
   */
  @javax.annotation.Nullable
  public Long getTasksError() {
    return tasksError;
  }
    
  public void setTasksError(Long tasksError) {
    this.tasksError = tasksError;
  }
    
    

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<SerpGoogleFinanceMarketsTasksReadyTaskInfo> tasks;

  public SerpGoogleFinanceMarketsTasksReadyResponseInfo tasks(List<SerpGoogleFinanceMarketsTasksReadyTaskInfo> tasks) {
    this.tasks = tasks;
    return this;
  }

  /**
   * array of tasks
   * @return tasks
   */
  @javax.annotation.Nullable
  public List<SerpGoogleFinanceMarketsTasksReadyTaskInfo> getTasks() {
    return tasks;
  }

  public void setTasks(List<SerpGoogleFinanceMarketsTasksReadyTaskInfo> tasks) {
    this.tasks = tasks;
  }



  public SerpGoogleFinanceMarketsTasksReadyResponseInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpGoogleFinanceMarketsTasksReadyResponseInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

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


    
    SerpGoogleFinanceMarketsTasksReadyResponseInfo serpGoogleFinanceMarketsTasksReadyResponseInfo = (SerpGoogleFinanceMarketsTasksReadyResponseInfo) o;
    return

        Objects.equals(this.version, serpGoogleFinanceMarketsTasksReadyResponseInfo.version) &&
        Objects.equals(this.statusCode, serpGoogleFinanceMarketsTasksReadyResponseInfo.statusCode) &&
        Objects.equals(this.statusMessage, serpGoogleFinanceMarketsTasksReadyResponseInfo.statusMessage) &&
        Objects.equals(this.time, serpGoogleFinanceMarketsTasksReadyResponseInfo.time) &&
        Objects.equals(this.cost, serpGoogleFinanceMarketsTasksReadyResponseInfo.cost) &&
        Objects.equals(this.tasksCount, serpGoogleFinanceMarketsTasksReadyResponseInfo.tasksCount) &&
        Objects.equals(this.tasksError, serpGoogleFinanceMarketsTasksReadyResponseInfo.tasksError) &&
        Objects.equals(this.tasks, serpGoogleFinanceMarketsTasksReadyResponseInfo.tasks);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(tasks,  version, statusCode, statusMessage, time, cost, tasksCount, tasksError);
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
    sb.append("class SerpGoogleFinanceMarketsTasksReadyResponseInfo {\n");

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
   * @throws IOException if the JSON Element is invalid with respect to SerpGoogleFinanceMarketsTasksReadyResponseInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpGoogleFinanceMarketsTasksReadyResponseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpGoogleFinanceMarketsTasksReadyResponseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpGoogleFinanceMarketsTasksReadyResponseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpGoogleFinanceMarketsTasksReadyResponseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpGoogleFinanceMarketsTasksReadyResponseInfo>() {
           @Override
           public void write(JsonWriter out, SerpGoogleFinanceMarketsTasksReadyResponseInfo value) throws IOException {
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
           public SerpGoogleFinanceMarketsTasksReadyResponseInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpGoogleFinanceMarketsTasksReadyResponseInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpGoogleFinanceMarketsTasksReadyResponseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpGoogleFinanceMarketsTasksReadyResponseInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
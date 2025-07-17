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



public class AppendixSerpDataInfo  {


  public static final String SERIALIZED_NAME_TASK_POST = "task_post";
  @SerializedName(SERIALIZED_NAME_TASK_POST)
  private Double taskPost;

  public AppendixSerpDataInfo taskPost(Double taskPost) {
    this.taskPost = taskPost;
    return this;
  }

  /**
   * 
   * @return taskPost
   */
  @javax.annotation.Nullable
  public Double getTaskPost() {
    return taskPost;
  }

  public void setTaskPost(Double taskPost) {
    this.taskPost = taskPost;
  }


  public static final String SERIALIZED_NAME_TASK_GET = "task_get";
  @SerializedName(SERIALIZED_NAME_TASK_GET)
  private AppendixFunctionTypeInfo taskGet;

  public AppendixSerpDataInfo taskGet(AppendixFunctionTypeInfo taskGet) {
    this.taskGet = taskGet;
    return this;
  }

  /**
   * 
   * @return taskGet
   */
  @javax.annotation.Nullable
  public AppendixFunctionTypeInfo getTaskGet() {
    return taskGet;
  }

  public void setTaskGet(AppendixFunctionTypeInfo taskGet) {
    this.taskGet = taskGet;
  }


  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private Double tasksReady;

  public AppendixSerpDataInfo tasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

  /**
   * 
   * @return tasksReady
   */
  @javax.annotation.Nullable
  public Double getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
  }


  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private Double locations;

  public AppendixSerpDataInfo locations(Double locations) {
    this.locations = locations;
    return this;
  }

  /**
   * 
   * @return locations
   */
  @javax.annotation.Nullable
  public Double getLocations() {
    return locations;
  }

  public void setLocations(Double locations) {
    this.locations = locations;
  }


  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private Double languages;

  public AppendixSerpDataInfo languages(Double languages) {
    this.languages = languages;
    return this;
  }

  /**
   * 
   * @return languages
   */
  @javax.annotation.Nullable
  public Double getLanguages() {
    return languages;
  }

  public void setLanguages(Double languages) {
    this.languages = languages;
  }


  public static final String SERIALIZED_NAME_LIVE = "live";
  @SerializedName(SERIALIZED_NAME_LIVE)
  private AppendixFunctionTypeInfo live;

  public AppendixSerpDataInfo live(AppendixFunctionTypeInfo live) {
    this.live = live;
    return this;
  }

  /**
   * 
   * @return live
   */
  @javax.annotation.Nullable
  public AppendixFunctionTypeInfo getLive() {
    return live;
  }

  public void setLive(AppendixFunctionTypeInfo live) {
    this.live = live;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Double errors;

  public AppendixSerpDataInfo errors(Double errors) {
    this.errors = errors;
    return this;
  }

  /**
   * 
   * @return errors
   */
  @javax.annotation.Nullable
  public Double getErrors() {
    return errors;
  }

  public void setErrors(Double errors) {
    this.errors = errors;
  }


  public static final String SERIALIZED_NAME_TASKS_FIXED = "tasks_fixed";
  @SerializedName(SERIALIZED_NAME_TASKS_FIXED)
  private Double tasksFixed;

  public AppendixSerpDataInfo tasksFixed(Double tasksFixed) {
    this.tasksFixed = tasksFixed;
    return this;
  }

  /**
   * 
   * @return tasksFixed
   */
  @javax.annotation.Nullable
  public Double getTasksFixed() {
    return tasksFixed;
  }

  public void setTasksFixed(Double tasksFixed) {
    this.tasksFixed = tasksFixed;
  }


  public static final String SERIALIZED_NAME_JOBS = "jobs";
  @SerializedName(SERIALIZED_NAME_JOBS)
  private AppendixJobsSerpLimitsRatesDataInfo jobs;

  public AppendixSerpDataInfo jobs(AppendixJobsSerpLimitsRatesDataInfo jobs) {
    this.jobs = jobs;
    return this;
  }

  /**
   * 
   * @return jobs
   */
  @javax.annotation.Nullable
  public AppendixJobsSerpLimitsRatesDataInfo getJobs() {
    return jobs;
  }

  public void setJobs(AppendixJobsSerpLimitsRatesDataInfo jobs) {
    this.jobs = jobs;
  }


  public static final String SERIALIZED_NAME_SCREENSHOT = "screenshot";
  @SerializedName(SERIALIZED_NAME_SCREENSHOT)
  private Double screenshot;

  public AppendixSerpDataInfo screenshot(Double screenshot) {
    this.screenshot = screenshot;
    return this;
  }

  /**
   * 
   * @return screenshot
   */
  @javax.annotation.Nullable
  public Double getScreenshot() {
    return screenshot;
  }

  public void setScreenshot(Double screenshot) {
    this.screenshot = screenshot;
  }


  public static final String SERIALIZED_NAME_TASKS_READY_QUEUE = "tasks_ready_queue";
  @SerializedName(SERIALIZED_NAME_TASKS_READY_QUEUE)
  private Double tasksReadyQueue;

  public AppendixSerpDataInfo tasksReadyQueue(Double tasksReadyQueue) {
    this.tasksReadyQueue = tasksReadyQueue;
    return this;
  }

  /**
   * 
   * @return tasksReadyQueue
   */
  @javax.annotation.Nullable
  public Double getTasksReadyQueue() {
    return tasksReadyQueue;
  }

  public void setTasksReadyQueue(Double tasksReadyQueue) {
    this.tasksReadyQueue = tasksReadyQueue;
  }



  public AppendixSerpDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixSerpDataInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixSerpDataInfo appendixSerpDataInfo = (AppendixSerpDataInfo) o;
    return

        Objects.equals(this.taskPost, appendixSerpDataInfo.taskPost) &&
        Objects.equals(this.taskGet, appendixSerpDataInfo.taskGet) &&
        Objects.equals(this.tasksReady, appendixSerpDataInfo.tasksReady) &&
        Objects.equals(this.locations, appendixSerpDataInfo.locations) &&
        Objects.equals(this.languages, appendixSerpDataInfo.languages) &&
        Objects.equals(this.live, appendixSerpDataInfo.live) &&
        Objects.equals(this.errors, appendixSerpDataInfo.errors) &&
        Objects.equals(this.tasksFixed, appendixSerpDataInfo.tasksFixed) &&
        Objects.equals(this.jobs, appendixSerpDataInfo.jobs) &&
        Objects.equals(this.screenshot, appendixSerpDataInfo.screenshot) &&
        Objects.equals(this.tasksReadyQueue, appendixSerpDataInfo.tasksReadyQueue);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(taskPost, taskGet, tasksReady, locations, languages, live, errors, tasksFixed, jobs, screenshot, tasksReadyQueue);
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
    sb.append("class AppendixSerpDataInfo {\n");

    sb.append("    taskPost: ").append(toIndentedString(taskPost)).append("\n");
    sb.append("    taskGet: ").append(toIndentedString(taskGet)).append("\n");
    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    tasksFixed: ").append(toIndentedString(tasksFixed)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    screenshot: ").append(toIndentedString(screenshot)).append("\n");
    sb.append("    tasksReadyQueue: ").append(toIndentedString(tasksReadyQueue)).append("\n");
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
    
    openapiFields.add("task_post");
    
    openapiFields.add("task_get");
    
    openapiFields.add("tasks_ready");
    
    openapiFields.add("locations");
    
    openapiFields.add("languages");
    
    openapiFields.add("live");
    
    openapiFields.add("errors");
    
    openapiFields.add("tasks_fixed");
    
    openapiFields.add("jobs");
    
    openapiFields.add("screenshot");
    
    openapiFields.add("tasks_ready_queue");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixSerpDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixSerpDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixSerpDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixSerpDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixSerpDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixSerpDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixSerpDataInfo value) throws IOException {
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
           public AppendixSerpDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixSerpDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixSerpDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixSerpDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
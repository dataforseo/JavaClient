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



public class AppendixSerpPriceData  {


  public static final String SERIALIZED_NAME_TASKS_FIXED = "tasks_fixed";
  @SerializedName(SERIALIZED_NAME_TASKS_FIXED)
  private AppendixTaskKeywordsDataPriceDataInfo tasksFixed;

  public AppendixSerpPriceData tasksFixed(AppendixTaskKeywordsDataPriceDataInfo tasksFixed) {
    this.tasksFixed = tasksFixed;
    return this;
  }

  /**
   * 
   * @return tasksFixed
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTasksFixed() {
    return tasksFixed;
  }

  public void setTasksFixed(AppendixTaskKeywordsDataPriceDataInfo tasksFixed) {
    this.tasksFixed = tasksFixed;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public AppendixSerpPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
    return this;
  }

  /**
   * 
   * @return errors
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getErrors() {
    return errors;
  }

  public void setErrors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
  }


  public static final String SERIALIZED_NAME_JOBS = "jobs";
  @SerializedName(SERIALIZED_NAME_JOBS)
  private AppendixAKeywordsDataPriceDataInfo jobs;

  public AppendixSerpPriceData jobs(AppendixAKeywordsDataPriceDataInfo jobs) {
    this.jobs = jobs;
    return this;
  }

  /**
   * 
   * @return jobs
   */
  @javax.annotation.Nullable
  public AppendixAKeywordsDataPriceDataInfo getJobs() {
    return jobs;
  }

  public void setJobs(AppendixAKeywordsDataPriceDataInfo jobs) {
    this.jobs = jobs;
  }


  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo languages;

  public AppendixSerpPriceData languages(AppendixTaskKeywordsDataPriceDataInfo languages) {
    this.languages = languages;
    return this;
  }

  /**
   * 
   * @return languages
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLanguages() {
    return languages;
  }

  public void setLanguages(AppendixTaskKeywordsDataPriceDataInfo languages) {
    this.languages = languages;
  }


  public static final String SERIALIZED_NAME_LIVE = "live";
  @SerializedName(SERIALIZED_NAME_LIVE)
  private AppendixSerpPriceDataInfo live;

  public AppendixSerpPriceData live(AppendixSerpPriceDataInfo live) {
    this.live = live;
    return this;
  }

  /**
   * 
   * @return live
   */
  @javax.annotation.Nullable
  public AppendixSerpPriceDataInfo getLive() {
    return live;
  }

  public void setLive(AppendixSerpPriceDataInfo live) {
    this.live = live;
  }


  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private AppendixTaskKeywordsDataPriceDataInfo locations;

  public AppendixSerpPriceData locations(AppendixTaskKeywordsDataPriceDataInfo locations) {
    this.locations = locations;
    return this;
  }

  /**
   * 
   * @return locations
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLocations() {
    return locations;
  }

  public void setLocations(AppendixTaskKeywordsDataPriceDataInfo locations) {
    this.locations = locations;
  }


  public static final String SERIALIZED_NAME_SCREENSHOT = "screenshot";
  @SerializedName(SERIALIZED_NAME_SCREENSHOT)
  private AppendixTaskKeywordsDataPriceDataInfo screenshot;

  public AppendixSerpPriceData screenshot(AppendixTaskKeywordsDataPriceDataInfo screenshot) {
    this.screenshot = screenshot;
    return this;
  }

  /**
   * 
   * @return screenshot
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getScreenshot() {
    return screenshot;
  }

  public void setScreenshot(AppendixTaskKeywordsDataPriceDataInfo screenshot) {
    this.screenshot = screenshot;
  }


  public static final String SERIALIZED_NAME_TASK_GET = "task_get";
  @SerializedName(SERIALIZED_NAME_TASK_GET)
  private AppendixSerpPriceDataInfo taskGet;

  public AppendixSerpPriceData taskGet(AppendixSerpPriceDataInfo taskGet) {
    this.taskGet = taskGet;
    return this;
  }

  /**
   * 
   * @return taskGet
   */
  @javax.annotation.Nullable
  public AppendixSerpPriceDataInfo getTaskGet() {
    return taskGet;
  }

  public void setTaskGet(AppendixSerpPriceDataInfo taskGet) {
    this.taskGet = taskGet;
  }


  public static final String SERIALIZED_NAME_TASK_POST = "task_post";
  @SerializedName(SERIALIZED_NAME_TASK_POST)
  private AppendixTaskKeywordsDataPriceDataInfo taskPost;

  public AppendixSerpPriceData taskPost(AppendixTaskKeywordsDataPriceDataInfo taskPost) {
    this.taskPost = taskPost;
    return this;
  }

  /**
   * 
   * @return taskPost
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTaskPost() {
    return taskPost;
  }

  public void setTaskPost(AppendixTaskKeywordsDataPriceDataInfo taskPost) {
    this.taskPost = taskPost;
  }


  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private AppendixTaskKeywordsDataPriceDataInfo tasksReady;

  public AppendixSerpPriceData tasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

  /**
   * 
   * @return tasksReady
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
  }



  public AppendixSerpPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixSerpPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixSerpPriceData appendixSerpPriceData = (AppendixSerpPriceData) o;
    return

        Objects.equals(this.tasksFixed, appendixSerpPriceData.tasksFixed) &&
        Objects.equals(this.errors, appendixSerpPriceData.errors) &&
        Objects.equals(this.jobs, appendixSerpPriceData.jobs) &&
        Objects.equals(this.languages, appendixSerpPriceData.languages) &&
        Objects.equals(this.live, appendixSerpPriceData.live) &&
        Objects.equals(this.locations, appendixSerpPriceData.locations) &&
        Objects.equals(this.screenshot, appendixSerpPriceData.screenshot) &&
        Objects.equals(this.taskGet, appendixSerpPriceData.taskGet) &&
        Objects.equals(this.taskPost, appendixSerpPriceData.taskPost) &&
        Objects.equals(this.tasksReady, appendixSerpPriceData.tasksReady);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(tasksFixed, errors, jobs, languages, live, locations, screenshot, taskGet, taskPost, tasksReady);
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
    sb.append("class AppendixSerpPriceData {\n");

    sb.append("    tasksFixed: ").append(toIndentedString(tasksFixed)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    screenshot: ").append(toIndentedString(screenshot)).append("\n");
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
    
    openapiFields.add("tasks_fixed");
    
    openapiFields.add("errors");
    
    openapiFields.add("jobs");
    
    openapiFields.add("languages");
    
    openapiFields.add("live");
    
    openapiFields.add("locations");
    
    openapiFields.add("screenshot");
    
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
   * @throws IOException if the JSON Element is invalid with respect to AppendixSerpPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixSerpPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixSerpPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixSerpPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixSerpPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixSerpPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixSerpPriceData value) throws IOException {
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
           public AppendixSerpPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixSerpPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixSerpPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixSerpPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
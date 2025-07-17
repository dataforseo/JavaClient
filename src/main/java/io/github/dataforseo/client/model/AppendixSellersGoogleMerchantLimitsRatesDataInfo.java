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



public class AppendixSellersGoogleMerchantLimitsRatesDataInfo  {


  public static final String SERIALIZED_NAME_TASK_POST = "task_post";
  @SerializedName(SERIALIZED_NAME_TASK_POST)
  private Double taskPost;

  public AppendixSellersGoogleMerchantLimitsRatesDataInfo taskPost(Double taskPost) {
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


  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private Double tasksReady;

  public AppendixSellersGoogleMerchantLimitsRatesDataInfo tasksReady(Double tasksReady) {
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


  public static final String SERIALIZED_NAME_TASK_GET = "task_get";
  @SerializedName(SERIALIZED_NAME_TASK_GET)
  private AppendixFunctionTypeInfo taskGet;

  public AppendixSellersGoogleMerchantLimitsRatesDataInfo taskGet(AppendixFunctionTypeInfo taskGet) {
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


  public static final String SERIALIZED_NAME_AD_URL = "ad_url";
  @SerializedName(SERIALIZED_NAME_AD_URL)
  private Double adUrl;

  public AppendixSellersGoogleMerchantLimitsRatesDataInfo adUrl(Double adUrl) {
    this.adUrl = adUrl;
    return this;
  }

  /**
   * 
   * @return adUrl
   */
  @javax.annotation.Nullable
  public Double getAdUrl() {
    return adUrl;
  }

  public void setAdUrl(Double adUrl) {
    this.adUrl = adUrl;
  }



  public AppendixSellersGoogleMerchantLimitsRatesDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixSellersGoogleMerchantLimitsRatesDataInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixSellersGoogleMerchantLimitsRatesDataInfo appendixSellersGoogleMerchantLimitsRatesDataInfo = (AppendixSellersGoogleMerchantLimitsRatesDataInfo) o;
    return

        Objects.equals(this.taskPost, appendixSellersGoogleMerchantLimitsRatesDataInfo.taskPost) &&
        Objects.equals(this.tasksReady, appendixSellersGoogleMerchantLimitsRatesDataInfo.tasksReady) &&
        Objects.equals(this.taskGet, appendixSellersGoogleMerchantLimitsRatesDataInfo.taskGet) &&
        Objects.equals(this.adUrl, appendixSellersGoogleMerchantLimitsRatesDataInfo.adUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(taskPost, tasksReady, taskGet, adUrl);
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
    sb.append("class AppendixSellersGoogleMerchantLimitsRatesDataInfo {\n");

    sb.append("    taskPost: ").append(toIndentedString(taskPost)).append("\n");
    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
    sb.append("    taskGet: ").append(toIndentedString(taskGet)).append("\n");
    sb.append("    adUrl: ").append(toIndentedString(adUrl)).append("\n");
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
    
    openapiFields.add("tasks_ready");
    
    openapiFields.add("task_get");
    
    openapiFields.add("ad_url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixSellersGoogleMerchantLimitsRatesDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixSellersGoogleMerchantLimitsRatesDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixSellersGoogleMerchantLimitsRatesDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixSellersGoogleMerchantLimitsRatesDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixSellersGoogleMerchantLimitsRatesDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixSellersGoogleMerchantLimitsRatesDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixSellersGoogleMerchantLimitsRatesDataInfo value) throws IOException {
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
           public AppendixSellersGoogleMerchantLimitsRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixSellersGoogleMerchantLimitsRatesDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixSellersGoogleMerchantLimitsRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixSellersGoogleMerchantLimitsRatesDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
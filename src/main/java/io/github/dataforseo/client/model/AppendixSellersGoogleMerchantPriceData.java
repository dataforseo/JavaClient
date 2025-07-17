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



public class AppendixSellersGoogleMerchantPriceData  {


  public static final String SERIALIZED_NAME_AD_URL = "ad_url";
  @SerializedName(SERIALIZED_NAME_AD_URL)
  private AppendixTaskKeywordsDataPriceDataInfo adUrl;

  public AppendixSellersGoogleMerchantPriceData adUrl(AppendixTaskKeywordsDataPriceDataInfo adUrl) {
    this.adUrl = adUrl;
    return this;
  }

  /**
   * 
   * @return adUrl
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getAdUrl() {
    return adUrl;
  }

  public void setAdUrl(AppendixTaskKeywordsDataPriceDataInfo adUrl) {
    this.adUrl = adUrl;
  }


  public static final String SERIALIZED_NAME_TASK_GET = "task_get";
  @SerializedName(SERIALIZED_NAME_TASK_GET)
  private AppendixTaskGetProductGoogleMerchantPriceDataInfo taskGet;

  public AppendixSellersGoogleMerchantPriceData taskGet(AppendixTaskGetProductGoogleMerchantPriceDataInfo taskGet) {
    this.taskGet = taskGet;
    return this;
  }

  /**
   * 
   * @return taskGet
   */
  @javax.annotation.Nullable
  public AppendixTaskGetProductGoogleMerchantPriceDataInfo getTaskGet() {
    return taskGet;
  }

  public void setTaskGet(AppendixTaskGetProductGoogleMerchantPriceDataInfo taskGet) {
    this.taskGet = taskGet;
  }


  public static final String SERIALIZED_NAME_TASK_POST = "task_post";
  @SerializedName(SERIALIZED_NAME_TASK_POST)
  private AppendixTaskKeywordsDataPriceDataInfo taskPost;

  public AppendixSellersGoogleMerchantPriceData taskPost(AppendixTaskKeywordsDataPriceDataInfo taskPost) {
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

  public AppendixSellersGoogleMerchantPriceData tasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
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



  public AppendixSellersGoogleMerchantPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixSellersGoogleMerchantPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixSellersGoogleMerchantPriceData appendixSellersGoogleMerchantPriceData = (AppendixSellersGoogleMerchantPriceData) o;
    return

        Objects.equals(this.adUrl, appendixSellersGoogleMerchantPriceData.adUrl) &&
        Objects.equals(this.taskGet, appendixSellersGoogleMerchantPriceData.taskGet) &&
        Objects.equals(this.taskPost, appendixSellersGoogleMerchantPriceData.taskPost) &&
        Objects.equals(this.tasksReady, appendixSellersGoogleMerchantPriceData.tasksReady);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(adUrl, taskGet, taskPost, tasksReady);
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
    sb.append("class AppendixSellersGoogleMerchantPriceData {\n");

    sb.append("    adUrl: ").append(toIndentedString(adUrl)).append("\n");
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
    
    openapiFields.add("ad_url");
    
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
   * @throws IOException if the JSON Element is invalid with respect to AppendixSellersGoogleMerchantPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixSellersGoogleMerchantPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixSellersGoogleMerchantPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixSellersGoogleMerchantPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixSellersGoogleMerchantPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixSellersGoogleMerchantPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixSellersGoogleMerchantPriceData value) throws IOException {
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
           public AppendixSellersGoogleMerchantPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixSellersGoogleMerchantPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixSellersGoogleMerchantPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixSellersGoogleMerchantPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
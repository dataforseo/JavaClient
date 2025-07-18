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



public class AppendixStatusResultInfo  {


  public static final String SERIALIZED_NAME_API = "api";
  @SerializedName(SERIALIZED_NAME_API)
  private String api;

  public AppendixStatusResultInfo api(String api) {
    this.api = api;
    return this;
  }

  /**
   * name of the API
* the list of APIs:
* serp
* keywords_data
* appendix
* dataforseo_labs
* domain_analytics
* merchant
* on_page
* business_data
* backlinks
* app_data
* content_analysis
* content_generation
   * @return api
   */
  @javax.annotation.Nullable
  public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }


  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AppendixStatusResultInfo status(String status) {
    this.status = status;
    return this;
  }

  /**
   * current status
* you can find all information about the statuses of our endpoints for the last 60 days here
* the list of possible current statuses:
* major_outage
* partial_outage
* long_response_time
* long_execution_time
* webhook_delay
* send_delay
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<AppendixStatusEndpointsInfo> endpoints;

  public AppendixStatusResultInfo endpoints(List<AppendixStatusEndpointsInfo> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * array of objects that contain status information for API endpoints
   * @return endpoints
   */
  @javax.annotation.Nullable
  public List<AppendixStatusEndpointsInfo> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<AppendixStatusEndpointsInfo> endpoints) {
    this.endpoints = endpoints;
  }



  public AppendixStatusResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixStatusResultInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixStatusResultInfo appendixStatusResultInfo = (AppendixStatusResultInfo) o;
    return

        Objects.equals(this.api, appendixStatusResultInfo.api) &&
        Objects.equals(this.status, appendixStatusResultInfo.status) &&
        Objects.equals(this.endpoints, appendixStatusResultInfo.endpoints);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(api, status, endpoints);
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
    sb.append("class AppendixStatusResultInfo {\n");

    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
    
    openapiFields.add("api");
    
    openapiFields.add("status");
    
    openapiFields.add("endpoints");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixStatusResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixStatusResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixStatusResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixStatusResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixStatusResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixStatusResultInfo>() {
           @Override
           public void write(JsonWriter out, AppendixStatusResultInfo value) throws IOException {
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
           public AppendixStatusResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixStatusResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixStatusResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixStatusResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
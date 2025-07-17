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



public class BacklinksIdListResultInfo  {


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public BacklinksIdListResultInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id of the task
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public BacklinksIdListResultInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the task
* URL you used for making an API call
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_DATETIME_POSTED = "datetime_posted";
  @SerializedName(SERIALIZED_NAME_DATETIME_POSTED)
  private String datetimePosted;

  public BacklinksIdListResultInfo datetimePosted(String datetimePosted) {
    this.datetimePosted = datetimePosted;
    return this;
  }

  /**
   * date and time when the task was made
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2023-01-15 12:57:46 +00:00
   * @return datetimePosted
   */
  @javax.annotation.Nullable
  public String getDatetimePosted() {
    return datetimePosted;
  }

  public void setDatetimePosted(String datetimePosted) {
    this.datetimePosted = datetimePosted;
  }


  public static final String SERIALIZED_NAME_DATETIME_DONE = "datetime_done";
  @SerializedName(SERIALIZED_NAME_DATETIME_DONE)
  private String datetimeDone;

  public BacklinksIdListResultInfo datetimeDone(String datetimeDone) {
    this.datetimeDone = datetimeDone;
    return this;
  }

  /**
   * date and time when the task was completed
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2023-01-15 12:57:46 +00:00
   * @return datetimeDone
   */
  @javax.annotation.Nullable
  public String getDatetimeDone() {
    return datetimeDone;
  }

  public void setDatetimeDone(String datetimeDone) {
    this.datetimeDone = datetimeDone;
  }


  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public BacklinksIdListResultInfo status(String status) {
    this.status = status;
    return this;
  }

  /**
   * informational message of the task
* you can find the full list of general informational messages here
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost;

  public BacklinksIdListResultInfo cost(Double cost) {
    this.cost = cost;
    return this;
  }

  /**
   * cost of the task, USD
   * @return cost
   */
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }


  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata;

  public BacklinksIdListResultInfo metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * contains parameters you specified in the POST request
   * @return metadata
   */
  @javax.annotation.Nullable
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }



  public BacklinksIdListResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksIdListResultInfo putAdditionalProperty(String key, Object value) {
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


    
    BacklinksIdListResultInfo backlinksIdListResultInfo = (BacklinksIdListResultInfo) o;
    return

        Objects.equals(this.id, backlinksIdListResultInfo.id) &&
        Objects.equals(this.url, backlinksIdListResultInfo.url) &&
        Objects.equals(this.datetimePosted, backlinksIdListResultInfo.datetimePosted) &&
        Objects.equals(this.datetimeDone, backlinksIdListResultInfo.datetimeDone) &&
        Objects.equals(this.status, backlinksIdListResultInfo.status) &&
        Objects.equals(this.cost, backlinksIdListResultInfo.cost) &&
        Objects.equals(this.metadata, backlinksIdListResultInfo.metadata);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(id, url, datetimePosted, datetimeDone, status, cost, metadata);
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
    sb.append("class BacklinksIdListResultInfo {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    datetimePosted: ").append(toIndentedString(datetimePosted)).append("\n");
    sb.append("    datetimeDone: ").append(toIndentedString(datetimeDone)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    
    openapiFields.add("id");
    
    openapiFields.add("url");
    
    openapiFields.add("datetime_posted");
    
    openapiFields.add("datetime_done");
    
    openapiFields.add("status");
    
    openapiFields.add("cost");
    
    openapiFields.add("metadata");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksIdListResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksIdListResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksIdListResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksIdListResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksIdListResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksIdListResultInfo>() {
           @Override
           public void write(JsonWriter out, BacklinksIdListResultInfo value) throws IOException {
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
           public BacklinksIdListResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksIdListResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksIdListResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksIdListResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
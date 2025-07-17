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



public class OnPageStylesheetResourceItem  extends BaseOnPageResourceItem  {


  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ResourceMetaInfo meta;

  public OnPageStylesheetResourceItem meta(ResourceMetaInfo meta) {
    this.meta = meta;
    return this;
  }

  /**
   * page properties
* the value depends on the resource_type
   * @return meta
   */
  @javax.annotation.Nullable
  public ResourceMetaInfo getMeta() {
    return meta;
  }

  public void setMeta(ResourceMetaInfo meta) {
    this.meta = meta;
  }


  public static final String SERIALIZED_NAME_FETCH_TIMING = "fetch_timing";
  @SerializedName(SERIALIZED_NAME_FETCH_TIMING)
  private FetchTiming fetchTiming;

  public OnPageStylesheetResourceItem fetchTiming(FetchTiming fetchTiming) {
    this.fetchTiming = fetchTiming;
    return this;
  }

  /**
   * time range within which a result was fetched
   * @return fetchTiming
   */
  @javax.annotation.Nullable
  public FetchTiming getFetchTiming() {
    return fetchTiming;
  }

  public void setFetchTiming(FetchTiming fetchTiming) {
    this.fetchTiming = fetchTiming;
  }


  public static final String SERIALIZED_NAME_ACCEPT_TYPE = "accept_type";
  @SerializedName(SERIALIZED_NAME_ACCEPT_TYPE)
  private String acceptType;

  public OnPageStylesheetResourceItem acceptType(String acceptType) {
    this.acceptType = acceptType;
    return this;
  }

  /**
   * indicates the expected type of resource
* for example, if 'resource_type': 'broken', accept_type will indicate the type of the broken resource
* possible values:
* any, none, image, sitemap, robots, script, stylesheet, redirect, html, text, other, font
   * @return acceptType
   */
  @javax.annotation.Nullable
  public String getAcceptType() {
    return acceptType;
  }

  public void setAcceptType(String acceptType) {
    this.acceptType = acceptType;
  }



  public OnPageStylesheetResourceItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageStylesheetResourceItem putAdditionalProperty(String key, Object value) {
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


    
    OnPageStylesheetResourceItem onPageStylesheetResourceItem = (OnPageStylesheetResourceItem) o;
    return

        Objects.equals(this.meta, onPageStylesheetResourceItem.meta) &&
        Objects.equals(this.fetchTiming, onPageStylesheetResourceItem.fetchTiming) &&
        Objects.equals(this.acceptType, onPageStylesheetResourceItem.acceptType) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(meta, fetchTiming, acceptType);
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
    sb.append("class OnPageStylesheetResourceItem {\n");

    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    fetchTiming: ").append(toIndentedString(fetchTiming)).append("\n");
    sb.append("    acceptType: ").append(toIndentedString(acceptType)).append("\n");
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
    openapiFields.add("resource_type");
    openapiFields.add("status_code");
    openapiFields.add("location");
    openapiFields.add("url");
    openapiFields.add("resource_errors");
    openapiFields.add("size");
    openapiFields.add("encoded_size");
    openapiFields.add("total_transfer_size");
    openapiFields.add("fetch_time");
    openapiFields.add("cache_control");
    openapiFields.add("checks");
    openapiFields.add("content_encoding");
    openapiFields.add("media_type");
    openapiFields.add("server");
    openapiFields.add("last_modified");
    
    openapiFields.add("meta");
    
    openapiFields.add("fetch_timing");
    
    openapiFields.add("accept_type");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPageStylesheetResourceItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageStylesheetResourceItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageStylesheetResourceItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageStylesheetResourceItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageStylesheetResourceItem.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageStylesheetResourceItem>() {
           @Override
           public void write(JsonWriter out, OnPageStylesheetResourceItem value) throws IOException {
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
           public OnPageStylesheetResourceItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageStylesheetResourceItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPageStylesheetResourceItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageStylesheetResourceItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
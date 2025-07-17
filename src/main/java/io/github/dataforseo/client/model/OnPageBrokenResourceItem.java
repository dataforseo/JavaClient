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



public class OnPageBrokenResourceItem  extends BaseOnPageResourceItem  {


  public static final String SERIALIZED_NAME_FETCH_TIMING = "fetch_timing";
  @SerializedName(SERIALIZED_NAME_FETCH_TIMING)
  private FetchTiming fetchTiming;

  public OnPageBrokenResourceItem fetchTiming(FetchTiming fetchTiming) {
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


  public static final String SERIALIZED_NAME_IS_RESOURCE = "is_resource";
  @SerializedName(SERIALIZED_NAME_IS_RESOURCE)
  private Boolean isResource;

  public OnPageBrokenResourceItem isResource(Boolean isResource) {
    this.isResource = isResource;
    return this;
  }

  /**
   * indicates whether a page is a single resource
   * @return isResource
   */
  @javax.annotation.Nullable
  public Boolean getIsResource() {
    return isResource;
  }

  public void setIsResource(Boolean isResource) {
    this.isResource = isResource;
  }


  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private PageMetaInfo meta;

  public OnPageBrokenResourceItem meta(PageMetaInfo meta) {
    this.meta = meta;
    return this;
  }

  /**
   * resource properties
* the value depends on the resource_type
* note that if you do not indicate a url when setting a task, resource’s meta is returned based on the data from the page where our crawler first saw the resource;
* to obtain resource’s meta from a particular url, specify that URL when setting a task
   * @return meta
   */
  @javax.annotation.Nullable
  public PageMetaInfo getMeta() {
    return meta;
  }

  public void setMeta(PageMetaInfo meta) {
    this.meta = meta;
  }


  public static final String SERIALIZED_NAME_ACCEPT_TYPE = "accept_type";
  @SerializedName(SERIALIZED_NAME_ACCEPT_TYPE)
  private String acceptType;

  public OnPageBrokenResourceItem acceptType(String acceptType) {
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



  public OnPageBrokenResourceItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageBrokenResourceItem putAdditionalProperty(String key, Object value) {
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


    
    OnPageBrokenResourceItem onPageBrokenResourceItem = (OnPageBrokenResourceItem) o;
    return

        Objects.equals(this.fetchTiming, onPageBrokenResourceItem.fetchTiming) &&
        Objects.equals(this.isResource, onPageBrokenResourceItem.isResource) &&
        Objects.equals(this.meta, onPageBrokenResourceItem.meta) &&
        Objects.equals(this.acceptType, onPageBrokenResourceItem.acceptType) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(fetchTiming, isResource, meta, acceptType);
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
    sb.append("class OnPageBrokenResourceItem {\n");

    sb.append("    fetchTiming: ").append(toIndentedString(fetchTiming)).append("\n");
    sb.append("    isResource: ").append(toIndentedString(isResource)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    
    openapiFields.add("fetch_timing");
    
    openapiFields.add("is_resource");
    
    openapiFields.add("meta");
    
    openapiFields.add("accept_type");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPageBrokenResourceItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageBrokenResourceItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageBrokenResourceItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageBrokenResourceItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageBrokenResourceItem.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageBrokenResourceItem>() {
           @Override
           public void write(JsonWriter out, OnPageBrokenResourceItem value) throws IOException {
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
           public OnPageBrokenResourceItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageBrokenResourceItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPageBrokenResourceItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageBrokenResourceItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
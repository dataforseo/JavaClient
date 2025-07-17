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



public class ContentAnalysisIdListRequestInfo  {


  public static final String SERIALIZED_NAME_DATETIME_FROM = "datetime_from";
  @SerializedName(SERIALIZED_NAME_DATETIME_FROM)
  private String datetimeFrom;

  public ContentAnalysisIdListRequestInfo datetimeFrom(String datetimeFrom) {
    this.datetimeFrom = datetimeFrom;
    return this;
  }

  /**
   * start time for filtering results
* required field
* if include_metadata is set to true, maximum value: a month from current datetime;
* if include_metadata is set to false, maximum value: six months from current datetime;
* must be specified in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2023-01-15 12:57:46 +00:00
   * @return datetimeFrom
   */
  @javax.annotation.Nullable
  public String getDatetimeFrom() {
    return datetimeFrom;
  }

  public void setDatetimeFrom(String datetimeFrom) {
    this.datetimeFrom = datetimeFrom;
  }


  public static final String SERIALIZED_NAME_DATETIME_TO = "datetime_to";
  @SerializedName(SERIALIZED_NAME_DATETIME_TO)
  private String datetimeTo;

  public ContentAnalysisIdListRequestInfo datetimeTo(String datetimeTo) {
    this.datetimeTo = datetimeTo;
    return this;
  }

  /**
   * finish time for filtering results
* required field
* maximum value: current datetime;
* must be specified in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2023-01-31 13:57:46 +00:00
   * @return datetimeTo
   */
  @javax.annotation.Nullable
  public String getDatetimeTo() {
    return datetimeTo;
  }

  public void setDatetimeTo(String datetimeTo) {
    this.datetimeTo = datetimeTo;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public ContentAnalysisIdListRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * the maximum number of returned task IDs
* optional field
* default value: 1000
* maximum value: 1000
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public ContentAnalysisIdListRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of returned task IDs
* optional field
* default value: 0
* if you specify the 10 value, the first ten tasks in the results array will be omitted
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort;

  public ContentAnalysisIdListRequestInfo sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * sorting by task execution time
* optional field
* possible values: 'asc', 'desc'
* default value: 'asc'
   * @return sort
   */
  @javax.annotation.Nullable
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }


  public static final String SERIALIZED_NAME_INCLUDE_METADATA = "include_metadata";
  @SerializedName(SERIALIZED_NAME_INCLUDE_METADATA)
  private Boolean includeMetadata;

  public ContentAnalysisIdListRequestInfo includeMetadata(Boolean includeMetadata) {
    this.includeMetadata = includeMetadata;
    return this;
  }

  /**
   * include task metadata in the respond
* optional field
* default value: false
   * @return includeMetadata
   */
  @javax.annotation.Nullable
  public Boolean getIncludeMetadata() {
    return includeMetadata;
  }

  public void setIncludeMetadata(Boolean includeMetadata) {
    this.includeMetadata = includeMetadata;
  }



  public ContentAnalysisIdListRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentAnalysisIdListRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentAnalysisIdListRequestInfo contentAnalysisIdListRequestInfo = (ContentAnalysisIdListRequestInfo) o;
    return

        Objects.equals(this.datetimeFrom, contentAnalysisIdListRequestInfo.datetimeFrom) &&
        Objects.equals(this.datetimeTo, contentAnalysisIdListRequestInfo.datetimeTo) &&
        Objects.equals(this.limit, contentAnalysisIdListRequestInfo.limit) &&
        Objects.equals(this.offset, contentAnalysisIdListRequestInfo.offset) &&
        Objects.equals(this.sort, contentAnalysisIdListRequestInfo.sort) &&
        Objects.equals(this.includeMetadata, contentAnalysisIdListRequestInfo.includeMetadata);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(datetimeFrom, datetimeTo, limit, offset, sort, includeMetadata);
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
    sb.append("class ContentAnalysisIdListRequestInfo {\n");

    sb.append("    datetimeFrom: ").append(toIndentedString(datetimeFrom)).append("\n");
    sb.append("    datetimeTo: ").append(toIndentedString(datetimeTo)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    includeMetadata: ").append(toIndentedString(includeMetadata)).append("\n");
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
    
    openapiFields.add("datetime_from");
    
    openapiFields.add("datetime_to");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("sort");
    
    openapiFields.add("include_metadata");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentAnalysisIdListRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentAnalysisIdListRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentAnalysisIdListRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentAnalysisIdListRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentAnalysisIdListRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentAnalysisIdListRequestInfo>() {
           @Override
           public void write(JsonWriter out, ContentAnalysisIdListRequestInfo value) throws IOException {
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
           public ContentAnalysisIdListRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentAnalysisIdListRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentAnalysisIdListRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentAnalysisIdListRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
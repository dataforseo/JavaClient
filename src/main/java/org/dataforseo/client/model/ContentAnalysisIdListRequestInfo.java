/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.dataforseo.client.model;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * ContentAnalysisIdListRequestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class ContentAnalysisIdListRequestInfo {
  public static final String SERIALIZED_NAME_DATETIME_FROM = "datetime_from";
  @SerializedName(SERIALIZED_NAME_DATETIME_FROM)
  private String datetimeFrom;

  public static final String SERIALIZED_NAME_DATETIME_TO = "datetime_to";
  @SerializedName(SERIALIZED_NAME_DATETIME_TO)
  private String datetimeTo;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort;

  public static final String SERIALIZED_NAME_INCLUDE_METADATA = "include_metadata";
  @SerializedName(SERIALIZED_NAME_INCLUDE_METADATA)
  private Boolean includeMetadata;

  public ContentAnalysisIdListRequestInfo() {
  }

  public ContentAnalysisIdListRequestInfo datetimeFrom(String datetimeFrom) {
    this.datetimeFrom = datetimeFrom;
    return this;
  }

   /**
   * start time for filtering results required field if include_metadata is set to true, maximum value: a month from current datetime; if include_metadata is set to false, maximum value: six months from current datetime; must be specified in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2023-01-15 12:57:46 +00:00
   * @return datetimeFrom
  **/
  @javax.annotation.Nullable
  public String getDatetimeFrom() {
    return datetimeFrom;
  }

  public void setDatetimeFrom(String datetimeFrom) {
    this.datetimeFrom = datetimeFrom;
  }


  public ContentAnalysisIdListRequestInfo datetimeTo(String datetimeTo) {
    this.datetimeTo = datetimeTo;
    return this;
  }

   /**
   * finish time for filtering results required field maximum value: current datetime; must be specified in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2023-01-31 13:57:46 +00:00
   * @return datetimeTo
  **/
  @javax.annotation.Nullable
  public String getDatetimeTo() {
    return datetimeTo;
  }

  public void setDatetimeTo(String datetimeTo) {
    this.datetimeTo = datetimeTo;
  }


  public ContentAnalysisIdListRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * the maximum number of returned task IDs optional field default value: 1000 maximum value: 1000
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ContentAnalysisIdListRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * offset in the results array of returned task IDs optional field default value: 0 if you specify the 10 value, the first ten tasks in the results array will be omitted
   * @return offset
  **/
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public ContentAnalysisIdListRequestInfo sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * sorting by task execution time optional field possible values: \&quot;asc\&quot;, \&quot;desc\&quot; default value: \&quot;asc\&quot;
   * @return sort
  **/
  @javax.annotation.Nullable
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }


  public ContentAnalysisIdListRequestInfo includeMetadata(Boolean includeMetadata) {
    this.includeMetadata = includeMetadata;
    return this;
  }

   /**
   * include task metadata in the respond optional field default value: false
   * @return includeMetadata
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeMetadata() {
    return includeMetadata;
  }

  public void setIncludeMetadata(Boolean includeMetadata) {
    this.includeMetadata = includeMetadata;
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
    return Objects.equals(this.datetimeFrom, contentAnalysisIdListRequestInfo.datetimeFrom) &&
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
      if (jsonElement == null) {
        if (!ContentAnalysisIdListRequestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContentAnalysisIdListRequestInfo is not found in the empty JSON string", ContentAnalysisIdListRequestInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContentAnalysisIdListRequestInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContentAnalysisIdListRequestInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("datetime_from") != null && !jsonObj.get("datetime_from").isJsonNull()) && !jsonObj.get("datetime_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datetime_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datetime_from").toString()));
      }
      if ((jsonObj.get("datetime_to") != null && !jsonObj.get("datetime_to").isJsonNull()) && !jsonObj.get("datetime_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datetime_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datetime_to").toString()));
      }
      if ((jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
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
             elementAdapter.write(out, obj);
           }

           @Override
           public ContentAnalysisIdListRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContentAnalysisIdListRequestInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContentAnalysisIdListRequestInfo
  * @throws IOException if the JSON string is invalid with respect to ContentAnalysisIdListRequestInfo
  */
  public static ContentAnalysisIdListRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentAnalysisIdListRequestInfo.class);
  }

 /**
  * Convert an instance of ContentAnalysisIdListRequestInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

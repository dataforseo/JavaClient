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


package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

/**
 * DataforseoLabsAmazonProductCompetitorsLiveRequestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class DataforseoLabsAmazonProductCompetitorsLiveRequestInfo {
  public static final String SERIALIZED_NAME_ASIN = "asin";
  @SerializedName(SERIALIZED_NAME_ASIN)
  private String asin;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public static final String SERIALIZED_NAME_ORDER_BY = "order_by";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private List<String> orderBy;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo() {
  }

  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo asin(String asin) {
    this.asin = asin;
    return this;
  }

  /**
   * product ID required field unique product identifier (ASIN) on Amazon; you can receive the asin parameter by making a separate request to the Amazon Products endpoint
   * @return asin
   */
  @javax.annotation.Nullable
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }


  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of the location required field if don’t specify location_code you can receive the list of available locations with their location_name by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages; Note: this endpoint currently supports the US, Egypt, Saudi Arabia, and the United Arab Emirates locations only; example: United States
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code required field if don’t specify location_name you can receive the list of available locations with their location_code by making a separate request to https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages; Note: this endpoint currently supports the US, Egypt, Saudi Arabia, and the United Arab Emirates locations only; example: 2840
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of the language required field if don’t specify language_code you can receive the list of available languages with their language_name by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: English
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code required field if don’t specify language_name you can receive the list of available languages with their language_code by making a separate request to the https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages example: en
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * the maximum number of products in the results array optional field default value: 100; maximum value: 1000
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo addFiltersItem(Object filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * array of results filtering parameters optional field you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: regex, not_regex, &lt;, &lt;&#x3D;, &gt;, &gt;&#x3D;, &#x3D;, &lt;&gt;, in, not_in, ilike, not_ilike, like, not_like, match, not_match you can use the % operator with like and not_like, as well as ilike and not_ilike to match any string of zero or more characters example: [\&quot;full_metrics.amazon_serp.pos_1\&quot;,\&quot;&gt;\&quot;, 20] for more information about filters, please refer to Dataforseo Labs – Filters or this help center guide
   * @return filters
   */
  @javax.annotation.Nullable
  public List<Object> getFilters() {
    return filters;
  }

  public void setFilters(List<Object> filters) {
    this.filters = filters;
  }


  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo addOrderByItem(String orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    return this;
  }

  /**
   * results sorting rules optional field you can use the same values as in the filters array to sort the results possible sorting types: asc – results will be sorted in the ascending order desc – results will be sorted in the descending order you should use a comma to set up a sorting parameter example: [\&quot;full_metrics.amazon_serp.pos_1,desc\&quot;] note that you can set no more than three sorting rules in a single request you should use a comma to separate several sorting rules example: [\&quot;full_metrics.amazon_serp.pos_1,desc\&quot;,\&quot;avg_position,desc\&quot;] default rule: [\&quot;ranked_serp_element.serp_item.rank_group,asc\&quot;]
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }


  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of returned product competitors optional field default value: 0 if you specify the 10 value, the first ten product competitors in the results array will be omitted and the data will be provided for the successive product competitors
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DataforseoLabsAmazonProductCompetitorsLiveRequestInfo instance itself
   */
  public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    DataforseoLabsAmazonProductCompetitorsLiveRequestInfo dataforseoLabsAmazonProductCompetitorsLiveRequestInfo = (DataforseoLabsAmazonProductCompetitorsLiveRequestInfo) o;
    return Objects.equals(this.asin, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.asin) &&
        Objects.equals(this.locationName, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.languageCode) &&
        Objects.equals(this.limit, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.limit) &&
        Objects.equals(this.filters, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.orderBy) &&
        Objects.equals(this.offset, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.offset) &&
        Objects.equals(this.tag, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.tag)&&
        Objects.equals(this.additionalProperties, dataforseoLabsAmazonProductCompetitorsLiveRequestInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(asin, locationName, locationCode, languageName, languageCode, limit, filters, orderBy, offset, tag, additionalProperties);
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
    sb.append("class DataforseoLabsAmazonProductCompetitorsLiveRequestInfo {\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("asin");
    openapiFields.add("location_name");
    openapiFields.add("location_code");
    openapiFields.add("language_name");
    openapiFields.add("language_code");
    openapiFields.add("limit");
    openapiFields.add("filters");
    openapiFields.add("order_by");
    openapiFields.add("offset");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsAmazonProductCompetitorsLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataforseoLabsAmazonProductCompetitorsLiveRequestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataforseoLabsAmazonProductCompetitorsLiveRequestInfo is not found in the empty JSON string", DataforseoLabsAmazonProductCompetitorsLiveRequestInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("asin") != null && !jsonObj.get("asin").isJsonNull()) && !jsonObj.get("asin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asin").toString()));
      }
      if ((jsonObj.get("location_name") != null && !jsonObj.get("location_name").isJsonNull()) && !jsonObj.get("location_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location_name").toString()));
      }
      if ((jsonObj.get("language_name") != null && !jsonObj.get("language_name").isJsonNull()) && !jsonObj.get("language_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_name").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull() && !jsonObj.get("filters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("order_by") != null && !jsonObj.get("order_by").isJsonNull() && !jsonObj.get("order_by").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_by` to be an array in the JSON string but got `%s`", jsonObj.get("order_by").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsAmazonProductCompetitorsLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsAmazonProductCompetitorsLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsAmazonProductCompetitorsLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsAmazonProductCompetitorsLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsAmazonProductCompetitorsLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsAmazonProductCompetitorsLiveRequestInfo value) throws IOException {
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
           public DataforseoLabsAmazonProductCompetitorsLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsAmazonProductCompetitorsLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of DataforseoLabsAmazonProductCompetitorsLiveRequestInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DataforseoLabsAmazonProductCompetitorsLiveRequestInfo
   * @throws IOException if the JSON string is invalid with respect to DataforseoLabsAmazonProductCompetitorsLiveRequestInfo
   */
  public static DataforseoLabsAmazonProductCompetitorsLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsAmazonProductCompetitorsLiveRequestInfo.class);
  }

  /**
   * Convert an instance of DataforseoLabsAmazonProductCompetitorsLiveRequestInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


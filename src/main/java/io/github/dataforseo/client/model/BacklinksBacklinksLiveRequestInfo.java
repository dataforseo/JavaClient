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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * BacklinksBacklinksLiveRequestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class BacklinksBacklinksLiveRequestInfo {
  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_CUSTOM_MODE = "custom_mode";
  @SerializedName(SERIALIZED_NAME_CUSTOM_MODE)
  private Map<String, Object> customMode;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public static final String SERIALIZED_NAME_ORDER_BY = "order_by";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private List<String> orderBy;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_SEARCH_AFTER_TOKEN = "search_after_token";
  @SerializedName(SERIALIZED_NAME_SEARCH_AFTER_TOKEN)
  private String searchAfterToken;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_BACKLINKS_STATUS_TYPE = "backlinks_status_type";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_STATUS_TYPE)
  private String backlinksStatusType;

  public static final String SERIALIZED_NAME_INCLUDE_SUBDOMAINS = "include_subdomains";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SUBDOMAINS)
  private Boolean includeSubdomains;

  public static final String SERIALIZED_NAME_INCLUDE_INDIRECT_LINKS = "include_indirect_links";
  @SerializedName(SERIALIZED_NAME_INCLUDE_INDIRECT_LINKS)
  private Boolean includeIndirectLinks;

  public static final String SERIALIZED_NAME_EXCLUDE_INTERNAL_BACKLINKS = "exclude_internal_backlinks";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_INTERNAL_BACKLINKS)
  private Boolean excludeInternalBacklinks;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public BacklinksBacklinksLiveRequestInfo() {
  }

  public BacklinksBacklinksLiveRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * domain, subdomain or webpage to get backlinks for required field a domain or a subdomain should be specified without https:// and www. a page should be specified with absolute URL (including http:// or https://)
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public BacklinksBacklinksLiveRequestInfo mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * results grouping type optional field possible grouping types: as_is – returns all backlinks one_per_domain – returns one backlink per domain one_per_anchor – returns one backlink per anchor default value: as_is
   * @return mode
   */
  @javax.annotation.Nullable
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  public BacklinksBacklinksLiveRequestInfo customMode(Map<String, Object> customMode) {
    this.customMode = customMode;
    return this;
  }

  public BacklinksBacklinksLiveRequestInfo putCustomModeItem(String key, Object customModeItem) {
    if (this.customMode == null) {
      this.customMode = new HashMap<>();
    }
    this.customMode.put(key, customModeItem);
    return this;
  }

  /**
   * detailed results grouping type optional field use this object to get a specific number of backlinks per field if you use custom_mode, then mode will be ignored example: \&quot;custom_mode\&quot;: {\&quot;field\&quot;: \&quot;domain\&quot;, \&quot;value\&quot;: 100}
   * @return customMode
   */
  @javax.annotation.Nullable
  public Map<String, Object> getCustomMode() {
    return customMode;
  }

  public void setCustomMode(Map<String, Object> customMode) {
    this.customMode = customMode;
  }


  public BacklinksBacklinksLiveRequestInfo field(String field) {
    this.field = field;
    return this;
  }

  /**
   * response field required field if you choose to specify custom_mode possible values: anchor domain_from domain_from_country tld_from page_from_encoding page_from_language item_type page_from_status_code semantic_location
   * @return field
   */
  @javax.annotation.Nullable
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }


  public BacklinksBacklinksLiveRequestInfo value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * number of backlinks to return per field required field if you choose to specify custom_mode can be set from 1 to 1000
   * @return value
   */
  @javax.annotation.Nullable
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  public BacklinksBacklinksLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  public BacklinksBacklinksLiveRequestInfo addFiltersItem(Object filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * array of results filtering parameters optional field you can add several filters at once (8 filters maximum) you should set a logical operator and, or between the conditions the following operators are supported: regex, &#x3D;, &lt;&gt;, in, not_in, like, not_like, ilike, not_ilike, regex, not_regex you can use the % operator with like and not_like to match any string of zero or more characters example: [\&quot;rank\&quot;,\&quot;&gt;\&quot;,\&quot;80\&quot;] [[\&quot;page_from_rank\&quot;,\&quot;&gt;\&quot;,\&quot;55\&quot;], \&quot;and\&quot;, [\&quot;dofollow\&quot;,\&quot;&#x3D;\&quot;,true]] [[\&quot;first_seen\&quot;,\&quot;&gt;\&quot;,\&quot;2017-10-23 11:31:45 +00:00\&quot;], \&quot;and\&quot;, [[\&quot;anchor\&quot;,\&quot;like\&quot;,\&quot;%seo%\&quot;],\&quot;or\&quot;,[\&quot;text_pre\&quot;,\&quot;like\&quot;,\&quot;%seo%\&quot;]]] The full list of possible filters is available here.
   * @return filters
   */
  @javax.annotation.Nullable
  public List<Object> getFilters() {
    return filters;
  }

  public void setFilters(List<Object> filters) {
    this.filters = filters;
  }


  public BacklinksBacklinksLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public BacklinksBacklinksLiveRequestInfo addOrderByItem(String orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    return this;
  }

  /**
   * results sorting rules optional field you can use the same values as in the filters array to sort the results possible sorting types: asc – results will be sorted in the ascending order desc – results will be sorted in the descending order you should use a comma to set up a sorting type example: [\&quot;rank,desc\&quot;] note that you can set no more than three sorting rules in a single request you should use a comma to separate several sorting rules example: [\&quot;domain_from_rank,desc\&quot;,\&quot;page_from_rank,asc\&quot;]
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }


  public BacklinksBacklinksLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of the returned backlinks optional field default value: 0 if you specify the 10 value, the first ten backlinks in the results array will be omitted and the data will be provided for the successive backlinks; Note: the maximum value is 20,000, use the search_after_token if you would like to offset more results
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public BacklinksBacklinksLiveRequestInfo searchAfterToken(String searchAfterToken) {
    this.searchAfterToken = searchAfterToken;
    return this;
  }

  /**
   * token for subsequent requests optional field provided in the identical filed of the response to each request; use this parameter to avoid timeouts while trying to obtain over 100,000 results in a single request; by specifying the unique search_after_token value from the response array, you will get the subsequent results of the initial task; search_after_token values are unique for each subsequent task Note: if the search_after_token is specified in the request, all other parameters should be identical to the previous request
   * @return searchAfterToken
   */
  @javax.annotation.Nullable
  public String getSearchAfterToken() {
    return searchAfterToken;
  }

  public void setSearchAfterToken(String searchAfterToken) {
    this.searchAfterToken = searchAfterToken;
  }


  public BacklinksBacklinksLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * the maximum number of returned backlinks optional field default value: 100 maximum value: 1000
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public BacklinksBacklinksLiveRequestInfo backlinksStatusType(String backlinksStatusType) {
    this.backlinksStatusType = backlinksStatusType;
    return this;
  }

  /**
   * set what backlinks to return and count optional field you can use this field to choose what backlinks will be returned and used for aggregated metrics for your target; possible values: all – all backlinks will be returned and counted; live – backlinks found during the last check will be returned and counted; lost – lost backlinks will be returned and counted; default value: live
   * @return backlinksStatusType
   */
  @javax.annotation.Nullable
  public String getBacklinksStatusType() {
    return backlinksStatusType;
  }

  public void setBacklinksStatusType(String backlinksStatusType) {
    this.backlinksStatusType = backlinksStatusType;
  }


  public BacklinksBacklinksLiveRequestInfo includeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
    return this;
  }

  /**
   * indicates if the subdomains of the target will be included in the search optional field if set to false, the subdomains will be ignored default value: true
   * @return includeSubdomains
   */
  @javax.annotation.Nullable
  public Boolean getIncludeSubdomains() {
    return includeSubdomains;
  }

  public void setIncludeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
  }


  public BacklinksBacklinksLiveRequestInfo includeIndirectLinks(Boolean includeIndirectLinks) {
    this.includeIndirectLinks = includeIndirectLinks;
    return this;
  }

  /**
   * indicates if indirect links to the target will be included in the results optional field if set to true, the results will include data on indirect links pointing to a page that either redirects to the target, or points to a canonical page if set to false, indirect links will be ignored default value: true
   * @return includeIndirectLinks
   */
  @javax.annotation.Nullable
  public Boolean getIncludeIndirectLinks() {
    return includeIndirectLinks;
  }

  public void setIncludeIndirectLinks(Boolean includeIndirectLinks) {
    this.includeIndirectLinks = includeIndirectLinks;
  }


  public BacklinksBacklinksLiveRequestInfo excludeInternalBacklinks(Boolean excludeInternalBacklinks) {
    this.excludeInternalBacklinks = excludeInternalBacklinks;
    return this;
  }

  /**
   * indicates if internal backlinks from subdomains to the target will be excluded from the results optional field if set to true, the results will not include data on internal backlinks from subdomains of the same domain as target if set to false, internal links will be included in the results default value: true
   * @return excludeInternalBacklinks
   */
  @javax.annotation.Nullable
  public Boolean getExcludeInternalBacklinks() {
    return excludeInternalBacklinks;
  }

  public void setExcludeInternalBacklinks(Boolean excludeInternalBacklinks) {
    this.excludeInternalBacklinks = excludeInternalBacklinks;
  }


  public BacklinksBacklinksLiveRequestInfo tag(String tag) {
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
   * @return the BacklinksBacklinksLiveRequestInfo instance itself
   */
  public BacklinksBacklinksLiveRequestInfo putAdditionalProperty(String key, Object value) {
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
    BacklinksBacklinksLiveRequestInfo backlinksBacklinksLiveRequestInfo = (BacklinksBacklinksLiveRequestInfo) o;
    return Objects.equals(this.target, backlinksBacklinksLiveRequestInfo.target) &&
        Objects.equals(this.mode, backlinksBacklinksLiveRequestInfo.mode) &&
        Objects.equals(this.customMode, backlinksBacklinksLiveRequestInfo.customMode) &&
        Objects.equals(this.field, backlinksBacklinksLiveRequestInfo.field) &&
        Objects.equals(this.value, backlinksBacklinksLiveRequestInfo.value) &&
        Objects.equals(this.filters, backlinksBacklinksLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, backlinksBacklinksLiveRequestInfo.orderBy) &&
        Objects.equals(this.offset, backlinksBacklinksLiveRequestInfo.offset) &&
        Objects.equals(this.searchAfterToken, backlinksBacklinksLiveRequestInfo.searchAfterToken) &&
        Objects.equals(this.limit, backlinksBacklinksLiveRequestInfo.limit) &&
        Objects.equals(this.backlinksStatusType, backlinksBacklinksLiveRequestInfo.backlinksStatusType) &&
        Objects.equals(this.includeSubdomains, backlinksBacklinksLiveRequestInfo.includeSubdomains) &&
        Objects.equals(this.includeIndirectLinks, backlinksBacklinksLiveRequestInfo.includeIndirectLinks) &&
        Objects.equals(this.excludeInternalBacklinks, backlinksBacklinksLiveRequestInfo.excludeInternalBacklinks) &&
        Objects.equals(this.tag, backlinksBacklinksLiveRequestInfo.tag)&&
        Objects.equals(this.additionalProperties, backlinksBacklinksLiveRequestInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, mode, customMode, field, value, filters, orderBy, offset, searchAfterToken, limit, backlinksStatusType, includeSubdomains, includeIndirectLinks, excludeInternalBacklinks, tag, additionalProperties);
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
    sb.append("class BacklinksBacklinksLiveRequestInfo {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    customMode: ").append(toIndentedString(customMode)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    searchAfterToken: ").append(toIndentedString(searchAfterToken)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    backlinksStatusType: ").append(toIndentedString(backlinksStatusType)).append("\n");
    sb.append("    includeSubdomains: ").append(toIndentedString(includeSubdomains)).append("\n");
    sb.append("    includeIndirectLinks: ").append(toIndentedString(includeIndirectLinks)).append("\n");
    sb.append("    excludeInternalBacklinks: ").append(toIndentedString(excludeInternalBacklinks)).append("\n");
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
    openapiFields.add("target");
    openapiFields.add("mode");
    openapiFields.add("custom_mode");
    openapiFields.add("field");
    openapiFields.add("value");
    openapiFields.add("filters");
    openapiFields.add("order_by");
    openapiFields.add("offset");
    openapiFields.add("search_after_token");
    openapiFields.add("limit");
    openapiFields.add("backlinks_status_type");
    openapiFields.add("include_subdomains");
    openapiFields.add("include_indirect_links");
    openapiFields.add("exclude_internal_backlinks");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksBacklinksLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BacklinksBacklinksLiveRequestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BacklinksBacklinksLiveRequestInfo is not found in the empty JSON string", BacklinksBacklinksLiveRequestInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) && !jsonObj.get("target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target").toString()));
      }
      if ((jsonObj.get("mode") != null && !jsonObj.get("mode").isJsonNull()) && !jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      if ((jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) && !jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull() && !jsonObj.get("filters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("order_by") != null && !jsonObj.get("order_by").isJsonNull() && !jsonObj.get("order_by").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_by` to be an array in the JSON string but got `%s`", jsonObj.get("order_by").toString()));
      }
      if ((jsonObj.get("search_after_token") != null && !jsonObj.get("search_after_token").isJsonNull()) && !jsonObj.get("search_after_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_after_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_after_token").toString()));
      }
      if ((jsonObj.get("backlinks_status_type") != null && !jsonObj.get("backlinks_status_type").isJsonNull()) && !jsonObj.get("backlinks_status_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backlinks_status_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backlinks_status_type").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksBacklinksLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksBacklinksLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksBacklinksLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksBacklinksLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksBacklinksLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, BacklinksBacklinksLiveRequestInfo value) throws IOException {
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
           public BacklinksBacklinksLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksBacklinksLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of BacklinksBacklinksLiveRequestInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BacklinksBacklinksLiveRequestInfo
   * @throws IOException if the JSON string is invalid with respect to BacklinksBacklinksLiveRequestInfo
   */
  public static BacklinksBacklinksLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksBacklinksLiveRequestInfo.class);
  }

  /**
   * Convert an instance of BacklinksBacklinksLiveRequestInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

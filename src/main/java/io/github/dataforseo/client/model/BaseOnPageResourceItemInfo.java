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
import io.github.dataforseo.client.model.CacheControl;
import io.github.dataforseo.client.model.LastModified;
import io.github.dataforseo.client.model.OnPageResourceIssueInfo;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
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
 * BaseOnPageResourceItemInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class BaseOnPageResourceItemInfo {
  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  protected String resourceType;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private BigDecimal statusCode;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_RESOURCE_ERRORS = "resource_errors";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ERRORS)
  private OnPageResourceIssueInfo resourceErrors;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  public static final String SERIALIZED_NAME_ENCODED_SIZE = "encoded_size";
  @SerializedName(SERIALIZED_NAME_ENCODED_SIZE)
  private BigDecimal encodedSize;

  public static final String SERIALIZED_NAME_TOTAL_TRANSFER_SIZE = "total_transfer_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRANSFER_SIZE)
  private BigDecimal totalTransferSize;

  public static final String SERIALIZED_NAME_FETCH_TIME = "fetch_time";
  @SerializedName(SERIALIZED_NAME_FETCH_TIME)
  private String fetchTime;

  public static final String SERIALIZED_NAME_CACHE_CONTROL = "cache_control";
  @SerializedName(SERIALIZED_NAME_CACHE_CONTROL)
  private CacheControl cacheControl;

  public static final String SERIALIZED_NAME_CHECKS = "checks";
  @SerializedName(SERIALIZED_NAME_CHECKS)
  private Map<String, Boolean> checks;

  public static final String SERIALIZED_NAME_CONTENT_ENCODING = "content_encoding";
  @SerializedName(SERIALIZED_NAME_CONTENT_ENCODING)
  private String contentEncoding;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "media_type";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "last_modified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private LastModified lastModified;

  public BaseOnPageResourceItemInfo() {
    this.resourceType = this.getClass().getSimpleName();
  }

  public BaseOnPageResourceItemInfo resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * type of the returned resource
   * @return resourceType
   */
  @javax.annotation.Nullable
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public BaseOnPageResourceItemInfo statusCode(BigDecimal statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * status code of the page
   * @return statusCode
   */
  @javax.annotation.Nullable
  public BigDecimal getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(BigDecimal statusCode) {
    this.statusCode = statusCode;
  }


  public BaseOnPageResourceItemInfo location(String location) {
    this.location = location;
    return this;
  }

  /**
   * location header indicates the URL to redirect a page to
   * @return location
   */
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public BaseOnPageResourceItemInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * page URL
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public BaseOnPageResourceItemInfo resourceErrors(OnPageResourceIssueInfo resourceErrors) {
    this.resourceErrors = resourceErrors;
    return this;
  }

  /**
   * Get resourceErrors
   * @return resourceErrors
   */
  @javax.annotation.Nullable
  public OnPageResourceIssueInfo getResourceErrors() {
    return resourceErrors;
  }

  public void setResourceErrors(OnPageResourceIssueInfo resourceErrors) {
    this.resourceErrors = resourceErrors;
  }


  public BaseOnPageResourceItemInfo size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * resource size indicates the size of a given page measured in bytes
   * @return size
   */
  @javax.annotation.Nullable
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }


  public BaseOnPageResourceItemInfo encodedSize(BigDecimal encodedSize) {
    this.encodedSize = encodedSize;
    return this;
  }

  /**
   * page size after encoding indicates the size of the encoded page measured in bytes
   * @return encodedSize
   */
  @javax.annotation.Nullable
  public BigDecimal getEncodedSize() {
    return encodedSize;
  }

  public void setEncodedSize(BigDecimal encodedSize) {
    this.encodedSize = encodedSize;
  }


  public BaseOnPageResourceItemInfo totalTransferSize(BigDecimal totalTransferSize) {
    this.totalTransferSize = totalTransferSize;
    return this;
  }

  /**
   * compressed page size indicates the compressed size of a given page
   * @return totalTransferSize
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalTransferSize() {
    return totalTransferSize;
  }

  public void setTotalTransferSize(BigDecimal totalTransferSize) {
    this.totalTransferSize = totalTransferSize;
  }


  public BaseOnPageResourceItemInfo fetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
    return this;
  }

  /**
   * date and time when a resource was fetched in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return fetchTime
   */
  @javax.annotation.Nullable
  public String getFetchTime() {
    return fetchTime;
  }

  public void setFetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
  }


  public BaseOnPageResourceItemInfo cacheControl(CacheControl cacheControl) {
    this.cacheControl = cacheControl;
    return this;
  }

  /**
   * Get cacheControl
   * @return cacheControl
   */
  @javax.annotation.Nullable
  public CacheControl getCacheControl() {
    return cacheControl;
  }

  public void setCacheControl(CacheControl cacheControl) {
    this.cacheControl = cacheControl;
  }


  public BaseOnPageResourceItemInfo checks(Map<String, Boolean> checks) {
    this.checks = checks;
    return this;
  }

  public BaseOnPageResourceItemInfo putChecksItem(String key, Boolean checksItem) {
    if (this.checks == null) {
      this.checks = new HashMap<>();
    }
    this.checks.put(key, checksItem);
    return this;
  }

  /**
   * website checks on-page check-ups related to the page
   * @return checks
   */
  @javax.annotation.Nullable
  public Map<String, Boolean> getChecks() {
    return checks;
  }

  public void setChecks(Map<String, Boolean> checks) {
    this.checks = checks;
  }


  public BaseOnPageResourceItemInfo contentEncoding(String contentEncoding) {
    this.contentEncoding = contentEncoding;
    return this;
  }

  /**
   * type of encoding
   * @return contentEncoding
   */
  @javax.annotation.Nullable
  public String getContentEncoding() {
    return contentEncoding;
  }

  public void setContentEncoding(String contentEncoding) {
    this.contentEncoding = contentEncoding;
  }


  public BaseOnPageResourceItemInfo mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * types of media used to display a page
   * @return mediaType
   */
  @javax.annotation.Nullable
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public BaseOnPageResourceItemInfo server(String server) {
    this.server = server;
    return this;
  }

  /**
   * server version
   * @return server
   */
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }


  public BaseOnPageResourceItemInfo lastModified(LastModified lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   */
  @javax.annotation.Nullable
  public LastModified getLastModified() {
    return lastModified;
  }

  public void setLastModified(LastModified lastModified) {
    this.lastModified = lastModified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseOnPageResourceItemInfo baseOnPageResourceItemInfo = (BaseOnPageResourceItemInfo) o;
    return Objects.equals(this.resourceType, baseOnPageResourceItemInfo.resourceType) &&
        Objects.equals(this.statusCode, baseOnPageResourceItemInfo.statusCode) &&
        Objects.equals(this.location, baseOnPageResourceItemInfo.location) &&
        Objects.equals(this.url, baseOnPageResourceItemInfo.url) &&
        Objects.equals(this.resourceErrors, baseOnPageResourceItemInfo.resourceErrors) &&
        Objects.equals(this.size, baseOnPageResourceItemInfo.size) &&
        Objects.equals(this.encodedSize, baseOnPageResourceItemInfo.encodedSize) &&
        Objects.equals(this.totalTransferSize, baseOnPageResourceItemInfo.totalTransferSize) &&
        Objects.equals(this.fetchTime, baseOnPageResourceItemInfo.fetchTime) &&
        Objects.equals(this.cacheControl, baseOnPageResourceItemInfo.cacheControl) &&
        Objects.equals(this.checks, baseOnPageResourceItemInfo.checks) &&
        Objects.equals(this.contentEncoding, baseOnPageResourceItemInfo.contentEncoding) &&
        Objects.equals(this.mediaType, baseOnPageResourceItemInfo.mediaType) &&
        Objects.equals(this.server, baseOnPageResourceItemInfo.server) &&
        Objects.equals(this.lastModified, baseOnPageResourceItemInfo.lastModified);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, statusCode, location, url, resourceErrors, size, encodedSize, totalTransferSize, fetchTime, cacheControl, checks, contentEncoding, mediaType, server, lastModified);
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
    sb.append("class BaseOnPageResourceItemInfo {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    resourceErrors: ").append(toIndentedString(resourceErrors)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    encodedSize: ").append(toIndentedString(encodedSize)).append("\n");
    sb.append("    totalTransferSize: ").append(toIndentedString(totalTransferSize)).append("\n");
    sb.append("    fetchTime: ").append(toIndentedString(fetchTime)).append("\n");
    sb.append("    cacheControl: ").append(toIndentedString(cacheControl)).append("\n");
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
    sb.append("    contentEncoding: ").append(toIndentedString(contentEncoding)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BaseOnPageResourceItemInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BaseOnPageResourceItemInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BaseOnPageResourceItemInfo is not found in the empty JSON string", BaseOnPageResourceItemInfo.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("resource_type").getAsString();
      switch (discriminatorValue) {
        case "broken":
          BrokenResourceElementItem.validateJsonElement(jsonElement);
          break;
        case "html":
          HtmlResourceElementItem.validateJsonElement(jsonElement);
          break;
        case "image":
          ImageResourceElementItem.validateJsonElement(jsonElement);
          break;
        case "redirect":
          RedirectResourceElementItem.validateJsonElement(jsonElement);
          break;
        case "script":
          ScriptResourceElementItem.validateJsonElement(jsonElement);
          break;
        case "stylesheet":
          StylesheetResourceElementItem.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `resource_type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


  /**
   * Create an instance of BaseOnPageResourceItemInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BaseOnPageResourceItemInfo
   * @throws IOException if the JSON string is invalid with respect to BaseOnPageResourceItemInfo
   */
  public static BaseOnPageResourceItemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseOnPageResourceItemInfo.class);
  }

  /**
   * Convert an instance of BaseOnPageResourceItemInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


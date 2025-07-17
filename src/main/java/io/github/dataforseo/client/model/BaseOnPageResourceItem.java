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



public class BaseOnPageResourceItem  {


  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public BaseOnPageResourceItem resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * type of element
   * @return resourceType
   */
  @javax.annotation.Nullable
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public BaseOnPageResourceItem statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * status code of the page
   * @return statusCode
   */
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public BaseOnPageResourceItem location(String location) {
    this.location = location;
    return this;
  }

  /**
   * location header
* indicates the URL to redirect a page to
   * @return location
   */
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public BaseOnPageResourceItem url(String url) {
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


  public static final String SERIALIZED_NAME_RESOURCE_ERRORS = "resource_errors";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ERRORS)
  private OnPageResourceIssueInfo resourceErrors;

  public BaseOnPageResourceItem resourceErrors(OnPageResourceIssueInfo resourceErrors) {
    this.resourceErrors = resourceErrors;
    return this;
  }

  /**
   * resource errors and warnings
   * @return resourceErrors
   */
  @javax.annotation.Nullable
  public OnPageResourceIssueInfo getResourceErrors() {
    return resourceErrors;
  }

  public void setResourceErrors(OnPageResourceIssueInfo resourceErrors) {
    this.resourceErrors = resourceErrors;
  }


  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public BaseOnPageResourceItem size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * resource size
* indicates the size of a given page measured in bytes
   * @return size
   */
  @javax.annotation.Nullable
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  public static final String SERIALIZED_NAME_ENCODED_SIZE = "encoded_size";
  @SerializedName(SERIALIZED_NAME_ENCODED_SIZE)
  private Integer encodedSize;

  public BaseOnPageResourceItem encodedSize(Integer encodedSize) {
    this.encodedSize = encodedSize;
    return this;
  }

  /**
   * page size after encoding
* indicates the size of the encoded page measured in bytes
   * @return encodedSize
   */
  @javax.annotation.Nullable
  public Integer getEncodedSize() {
    return encodedSize;
  }

  public void setEncodedSize(Integer encodedSize) {
    this.encodedSize = encodedSize;
  }


  public static final String SERIALIZED_NAME_TOTAL_TRANSFER_SIZE = "total_transfer_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRANSFER_SIZE)
  private Long totalTransferSize;

  public BaseOnPageResourceItem totalTransferSize(Long totalTransferSize) {
    this.totalTransferSize = totalTransferSize;
    return this;
  }

  /**
   * compressed page size
* indicates the compressed size of a given page
   * @return totalTransferSize
   */
  @javax.annotation.Nullable
  public Long getTotalTransferSize() {
    return totalTransferSize;
  }

  public void setTotalTransferSize(Long totalTransferSize) {
    this.totalTransferSize = totalTransferSize;
  }


  public static final String SERIALIZED_NAME_FETCH_TIME = "fetch_time";
  @SerializedName(SERIALIZED_NAME_FETCH_TIME)
  private String fetchTime;

  public BaseOnPageResourceItem fetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
    return this;
  }

  /**
   * date and time when a resource was fetched
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return fetchTime
   */
  @javax.annotation.Nullable
  public String getFetchTime() {
    return fetchTime;
  }

  public void setFetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
  }


  public static final String SERIALIZED_NAME_CACHE_CONTROL = "cache_control";
  @SerializedName(SERIALIZED_NAME_CACHE_CONTROL)
  private CacheControl cacheControl;

  public BaseOnPageResourceItem cacheControl(CacheControl cacheControl) {
    this.cacheControl = cacheControl;
    return this;
  }

  /**
   * instructions for caching
   * @return cacheControl
   */
  @javax.annotation.Nullable
  public CacheControl getCacheControl() {
    return cacheControl;
  }

  public void setCacheControl(CacheControl cacheControl) {
    this.cacheControl = cacheControl;
  }


  public static final String SERIALIZED_NAME_CHECKS = "checks";
  @SerializedName(SERIALIZED_NAME_CHECKS)
  private Map<String, Boolean> checks;

  public BaseOnPageResourceItem checks(Map<String, Boolean> checks) {
    this.checks = checks;
    return this;
  }

  /**
   * website checks
* on-page check-ups related to the page
   * @return checks
   */
  @javax.annotation.Nullable
  public Map<String, Boolean> getChecks() {
    return checks;
  }

  public void setChecks(Map<String, Boolean> checks) {
    this.checks = checks;
  }


  public static final String SERIALIZED_NAME_CONTENT_ENCODING = "content_encoding";
  @SerializedName(SERIALIZED_NAME_CONTENT_ENCODING)
  private String contentEncoding;

  public BaseOnPageResourceItem contentEncoding(String contentEncoding) {
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


  public static final String SERIALIZED_NAME_MEDIA_TYPE = "media_type";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public BaseOnPageResourceItem mediaType(String mediaType) {
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


  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public BaseOnPageResourceItem server(String server) {
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


  public static final String SERIALIZED_NAME_LAST_MODIFIED = "last_modified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private LastModified lastModified;

  public BaseOnPageResourceItem lastModified(LastModified lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * contains data on changes related to the resource
* if there is no data, the value will be null
   * @return lastModified
   */
  @javax.annotation.Nullable
  public LastModified getLastModified() {
    return lastModified;
  }

  public void setLastModified(LastModified lastModified) {
    this.lastModified = lastModified;
  }



  public BaseOnPageResourceItem() {
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }


    
    BaseOnPageResourceItem baseOnPageResourceItem = (BaseOnPageResourceItem) o;
    return

        Objects.equals(this.resourceType, baseOnPageResourceItem.resourceType) &&
        Objects.equals(this.statusCode, baseOnPageResourceItem.statusCode) &&
        Objects.equals(this.location, baseOnPageResourceItem.location) &&
        Objects.equals(this.url, baseOnPageResourceItem.url) &&
        Objects.equals(this.resourceErrors, baseOnPageResourceItem.resourceErrors) &&
        Objects.equals(this.size, baseOnPageResourceItem.size) &&
        Objects.equals(this.encodedSize, baseOnPageResourceItem.encodedSize) &&
        Objects.equals(this.totalTransferSize, baseOnPageResourceItem.totalTransferSize) &&
        Objects.equals(this.fetchTime, baseOnPageResourceItem.fetchTime) &&
        Objects.equals(this.cacheControl, baseOnPageResourceItem.cacheControl) &&
        Objects.equals(this.checks, baseOnPageResourceItem.checks) &&
        Objects.equals(this.contentEncoding, baseOnPageResourceItem.contentEncoding) &&
        Objects.equals(this.mediaType, baseOnPageResourceItem.mediaType) &&
        Objects.equals(this.server, baseOnPageResourceItem.server) &&
        Objects.equals(this.lastModified, baseOnPageResourceItem.lastModified);  
    
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
    sb.append("class BaseOnPageResourceItem {\n");

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


  
  public static BaseOnPageResourceItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseOnPageResourceItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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



public class BacklinksDomainPagesLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BacklinksDomainPagesLiveItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of element
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public static final String SERIALIZED_NAME_MAIN_DOMAIN = "main_domain";
  @SerializedName(SERIALIZED_NAME_MAIN_DOMAIN)
  private String mainDomain;

  public BacklinksDomainPagesLiveItem mainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
    return this;
  }

  /**
   * main website domain
* main website domain does not include subdomains
   * @return mainDomain
   */
  @javax.annotation.Nullable
  public String getMainDomain() {
    return mainDomain;
  }

  public void setMainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public BacklinksDomainPagesLiveItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain
* domain where the page was found
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_TLD = "tld";
  @SerializedName(SERIALIZED_NAME_TLD)
  private String tld;

  public BacklinksDomainPagesLiveItem tld(String tld) {
    this.tld = tld;
    return this;
  }

  /**
   * top-level domain
* top-level domain in the DNS root zone
   * @return tld
   */
  @javax.annotation.Nullable
  public String getTld() {
    return tld;
  }

  public void setTld(String tld) {
    this.tld = tld;
  }


  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private String page;

  public BacklinksDomainPagesLiveItem page(String page) {
    this.page = page;
    return this;
  }

  /**
   * page URL
* relevant page URL
   * @return page
   */
  @javax.annotation.Nullable
  public String getPage() {
    return page;
  }

  public void setPage(String page) {
    this.page = page;
  }


  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public BacklinksDomainPagesLiveItem ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Internet Protocol address
   * @return ip
   */
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public static final String SERIALIZED_NAME_FIRST_VISITED = "first_visited";
  @SerializedName(SERIALIZED_NAME_FIRST_VISITED)
  private String firstVisited;

  public BacklinksDomainPagesLiveItem firstVisited(String firstVisited) {
    this.firstVisited = firstVisited;
    return this;
  }

  /**
   * date and time of the first page visit
* date and time when our crawler visited this page for the first time
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2017-01-24 13:20:59 +00:00
   * @return firstVisited
   */
  @javax.annotation.Nullable
  public String getFirstVisited() {
    return firstVisited;
  }

  public void setFirstVisited(String firstVisited) {
    this.firstVisited = firstVisited;
  }


  public static final String SERIALIZED_NAME_PREV_VISITED = "prev_visited";
  @SerializedName(SERIALIZED_NAME_PREV_VISITED)
  private String prevVisited;

  public BacklinksDomainPagesLiveItem prevVisited(String prevVisited) {
    this.prevVisited = prevVisited;
    return this;
  }

  /**
   * previous to the most recent date when our crawler visited the page
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2017-01-24 13:20:59 +00:00
   * @return prevVisited
   */
  @javax.annotation.Nullable
  public String getPrevVisited() {
    return prevVisited;
  }

  public void setPrevVisited(String prevVisited) {
    this.prevVisited = prevVisited;
  }


  public static final String SERIALIZED_NAME_FETCH_TIME = "fetch_time";
  @SerializedName(SERIALIZED_NAME_FETCH_TIME)
  private String fetchTime;

  public BacklinksDomainPagesLiveItem fetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
    return this;
  }

  /**
   * most recent date and time when our crawler visited the page
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2017-01-24 13:20:59 +00:00
   * @return fetchTime
   */
  @javax.annotation.Nullable
  public String getFetchTime() {
    return fetchTime;
  }

  public void setFetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
  }


  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public BacklinksDomainPagesLiveItem statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * HTTP status code of the page
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

  public BacklinksDomainPagesLiveItem location(String location) {
    this.location = location;
    return this;
  }

  /**
   * location header
* indicates the URL to redirect a page to if exists
   * @return location
   */
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public BacklinksDomainPagesLiveItem size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * indicates the page size, in bytes
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

  public BacklinksDomainPagesLiveItem encodedSize(Integer encodedSize) {
    this.encodedSize = encodedSize;
    return this;
  }

  /**
   * page size after encoding
* indicates the size of the encoded page, in bytes
   * @return encodedSize
   */
  @javax.annotation.Nullable
  public Integer getEncodedSize() {
    return encodedSize;
  }

  public void setEncodedSize(Integer encodedSize) {
    this.encodedSize = encodedSize;
  }


  public static final String SERIALIZED_NAME_CONTENT_ENCODING = "content_encoding";
  @SerializedName(SERIALIZED_NAME_CONTENT_ENCODING)
  private String contentEncoding;

  public BacklinksDomainPagesLiveItem contentEncoding(String contentEncoding) {
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

  public BacklinksDomainPagesLiveItem mediaType(String mediaType) {
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

  public BacklinksDomainPagesLiveItem server(String server) {
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


  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private BacklinksPageMeta meta;

  public BacklinksDomainPagesLiveItem meta(BacklinksPageMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * page meta data
   * @return meta
   */
  @javax.annotation.Nullable
  public BacklinksPageMeta getMeta() {
    return meta;
  }

  public void setMeta(BacklinksPageMeta meta) {
    this.meta = meta;
  }


  public static final String SERIALIZED_NAME_PAGE_SUMMARY = "page_summary";
  @SerializedName(SERIALIZED_NAME_PAGE_SUMMARY)
  private PageSummary pageSummary;

  public BacklinksDomainPagesLiveItem pageSummary(PageSummary pageSummary) {
    this.pageSummary = pageSummary;
    return this;
  }

  /**
   * contains backlink data for this page
   * @return pageSummary
   */
  @javax.annotation.Nullable
  public PageSummary getPageSummary() {
    return pageSummary;
  }

  public void setPageSummary(PageSummary pageSummary) {
    this.pageSummary = pageSummary;
  }



  public BacklinksDomainPagesLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksDomainPagesLiveItem putAdditionalProperty(String key, Object value) {
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


    
    BacklinksDomainPagesLiveItem backlinksDomainPagesLiveItem = (BacklinksDomainPagesLiveItem) o;
    return

        Objects.equals(this.type, backlinksDomainPagesLiveItem.type) &&
        Objects.equals(this.mainDomain, backlinksDomainPagesLiveItem.mainDomain) &&
        Objects.equals(this.domain, backlinksDomainPagesLiveItem.domain) &&
        Objects.equals(this.tld, backlinksDomainPagesLiveItem.tld) &&
        Objects.equals(this.page, backlinksDomainPagesLiveItem.page) &&
        Objects.equals(this.ip, backlinksDomainPagesLiveItem.ip) &&
        Objects.equals(this.firstVisited, backlinksDomainPagesLiveItem.firstVisited) &&
        Objects.equals(this.prevVisited, backlinksDomainPagesLiveItem.prevVisited) &&
        Objects.equals(this.fetchTime, backlinksDomainPagesLiveItem.fetchTime) &&
        Objects.equals(this.statusCode, backlinksDomainPagesLiveItem.statusCode) &&
        Objects.equals(this.location, backlinksDomainPagesLiveItem.location) &&
        Objects.equals(this.size, backlinksDomainPagesLiveItem.size) &&
        Objects.equals(this.encodedSize, backlinksDomainPagesLiveItem.encodedSize) &&
        Objects.equals(this.contentEncoding, backlinksDomainPagesLiveItem.contentEncoding) &&
        Objects.equals(this.mediaType, backlinksDomainPagesLiveItem.mediaType) &&
        Objects.equals(this.server, backlinksDomainPagesLiveItem.server) &&
        Objects.equals(this.meta, backlinksDomainPagesLiveItem.meta) &&
        Objects.equals(this.pageSummary, backlinksDomainPagesLiveItem.pageSummary);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, mainDomain, domain, tld, page, ip, firstVisited, prevVisited, fetchTime, statusCode, location, size, encodedSize, contentEncoding, mediaType, server, meta, pageSummary);
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
    sb.append("class BacklinksDomainPagesLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mainDomain: ").append(toIndentedString(mainDomain)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    tld: ").append(toIndentedString(tld)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    firstVisited: ").append(toIndentedString(firstVisited)).append("\n");
    sb.append("    prevVisited: ").append(toIndentedString(prevVisited)).append("\n");
    sb.append("    fetchTime: ").append(toIndentedString(fetchTime)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    encodedSize: ").append(toIndentedString(encodedSize)).append("\n");
    sb.append("    contentEncoding: ").append(toIndentedString(contentEncoding)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    pageSummary: ").append(toIndentedString(pageSummary)).append("\n");
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
    
    openapiFields.add("type");
    
    openapiFields.add("main_domain");
    
    openapiFields.add("domain");
    
    openapiFields.add("tld");
    
    openapiFields.add("page");
    
    openapiFields.add("ip");
    
    openapiFields.add("first_visited");
    
    openapiFields.add("prev_visited");
    
    openapiFields.add("fetch_time");
    
    openapiFields.add("status_code");
    
    openapiFields.add("location");
    
    openapiFields.add("size");
    
    openapiFields.add("encoded_size");
    
    openapiFields.add("content_encoding");
    
    openapiFields.add("media_type");
    
    openapiFields.add("server");
    
    openapiFields.add("meta");
    
    openapiFields.add("page_summary");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksDomainPagesLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksDomainPagesLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksDomainPagesLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksDomainPagesLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksDomainPagesLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksDomainPagesLiveItem>() {
           @Override
           public void write(JsonWriter out, BacklinksDomainPagesLiveItem value) throws IOException {
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
           public BacklinksDomainPagesLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksDomainPagesLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksDomainPagesLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksDomainPagesLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
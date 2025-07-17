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



public class DomainInfo  {


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public DomainInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * domain name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public static final String SERIALIZED_NAME_CMS = "cms";
  @SerializedName(SERIALIZED_NAME_CMS)
  private String cms;

  public DomainInfo cms(String cms) {
    this.cms = cms;
    return this;
  }

  /**
   * content management system
* content management system identified on a website
* the content of the generator meta tag
* the data is taken from the first random page that returns the 200 response code
* if our crawler was unable to identify the cms, the value would be null
   * @return cms
   */
  @javax.annotation.Nullable
  public String getCms() {
    return cms;
  }

  public void setCms(String cms) {
    this.cms = cms;
  }


  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public DomainInfo ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * domain ip address
   * @return ip
   */
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public DomainInfo server(String server) {
    this.server = server;
    return this;
  }

  /**
   * website server
* the version of the server detected on a website
* the content of the server header
* the information is taken from the first page which response code is 200
   * @return server
   */
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }


  public static final String SERIALIZED_NAME_CRAWL_START = "crawl_start";
  @SerializedName(SERIALIZED_NAME_CRAWL_START)
  private String crawlStart;

  public DomainInfo crawlStart(String crawlStart) {
    this.crawlStart = crawlStart;
    return this;
  }

  /**
   * time when the crawling start
* date and time when the website was sent for crawling
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return crawlStart
   */
  @javax.annotation.Nullable
  public String getCrawlStart() {
    return crawlStart;
  }

  public void setCrawlStart(String crawlStart) {
    this.crawlStart = crawlStart;
  }


  public static final String SERIALIZED_NAME_CRAWL_END = "crawl_end";
  @SerializedName(SERIALIZED_NAME_CRAWL_END)
  private String crawlEnd;

  public DomainInfo crawlEnd(String crawlEnd) {
    this.crawlEnd = crawlEnd;
    return this;
  }

  /**
   * time when the crawling ended
* date and time when the crawling was finished
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
* Note: informative only if 'crawl_progress' is 'finished'
* if 'crawl_progress' is in_progress, the value will be null
   * @return crawlEnd
   */
  @javax.annotation.Nullable
  public String getCrawlEnd() {
    return crawlEnd;
  }

  public void setCrawlEnd(String crawlEnd) {
    this.crawlEnd = crawlEnd;
  }


  public static final String SERIALIZED_NAME_EXTENDED_CRAWL_STATUS = "extended_crawl_status";
  @SerializedName(SERIALIZED_NAME_EXTENDED_CRAWL_STATUS)
  private String extendedCrawlStatus;

  public DomainInfo extendedCrawlStatus(String extendedCrawlStatus) {
    this.extendedCrawlStatus = extendedCrawlStatus;
    return this;
  }

  /**
   * crawl status and errors
* indicates the reason why a website was not crawled;
* can take the following values:
* no_errors – no crawling errors were detected;
* site_unreachable – our crawler could not reach a website and thus was not able to obtain a status code;
* invalid_page_status_code – status code of the first crawled page >= 400;
* forbidden_meta_tag – the first crawled page contains the <meta robots=”noindex”> tag;
* forbidden_robots – robots.txt forbids crawling the page;
* forbidden_http_header – HTTP header of the page contains “X-Robots-Tag: noindex” ;
* too_many_redirects – the first crawled page has more than 10 redirects;
* unknown – the reason is unknown
   * @return extendedCrawlStatus
   */
  @javax.annotation.Nullable
  public String getExtendedCrawlStatus() {
    return extendedCrawlStatus;
  }

  public void setExtendedCrawlStatus(String extendedCrawlStatus) {
    this.extendedCrawlStatus = extendedCrawlStatus;
  }


  public static final String SERIALIZED_NAME_SSL_INFO = "ssl_info";
  @SerializedName(SERIALIZED_NAME_SSL_INFO)
  private SslInfo sslInfo;

  public DomainInfo sslInfo(SslInfo sslInfo) {
    this.sslInfo = sslInfo;
    return this;
  }

  /**
   * ssl certificate info
* information about the Secure Sockets Layer protocol detected on a website
   * @return sslInfo
   */
  @javax.annotation.Nullable
  public SslInfo getSslInfo() {
    return sslInfo;
  }

  public void setSslInfo(SslInfo sslInfo) {
    this.sslInfo = sslInfo;
  }


  public static final String SERIALIZED_NAME_CHECKS = "checks";
  @SerializedName(SERIALIZED_NAME_CHECKS)
  private Map<String, Boolean> checks;

  public DomainInfo checks(Map<String, Boolean> checks) {
    this.checks = checks;
    return this;
  }

  /**
   * website checks
* other on-page check-ups related to the website
   * @return checks
   */
  @javax.annotation.Nullable
  public Map<String, Boolean> getChecks() {
    return checks;
  }

  public void setChecks(Map<String, Boolean> checks) {
    this.checks = checks;
  }


  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Long totalPages;

  public DomainInfo totalPages(Long totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * total crawled pages
* the total number of crawled pages
   * @return totalPages
   */
  @javax.annotation.Nullable
  public Long getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
  }


  public static final String SERIALIZED_NAME_PAGE_NOT_FOUND_STATUS_CODE = "page_not_found_status_code";
  @SerializedName(SERIALIZED_NAME_PAGE_NOT_FOUND_STATUS_CODE)
  private Integer pageNotFoundStatusCode;

  public DomainInfo pageNotFoundStatusCode(Integer pageNotFoundStatusCode) {
    this.pageNotFoundStatusCode = pageNotFoundStatusCode;
    return this;
  }

  /**
   * status code returned by a non-existent page
* in most cases, it is recommended a server returns a 404 response code
   * @return pageNotFoundStatusCode
   */
  @javax.annotation.Nullable
  public Integer getPageNotFoundStatusCode() {
    return pageNotFoundStatusCode;
  }

  public void setPageNotFoundStatusCode(Integer pageNotFoundStatusCode) {
    this.pageNotFoundStatusCode = pageNotFoundStatusCode;
  }


  public static final String SERIALIZED_NAME_CANONICALIZATION_STATUS_CODE = "canonicalization_status_code";
  @SerializedName(SERIALIZED_NAME_CANONICALIZATION_STATUS_CODE)
  private Integer canonicalizationStatusCode;

  public DomainInfo canonicalizationStatusCode(Integer canonicalizationStatusCode) {
    this.canonicalizationStatusCode = canonicalizationStatusCode;
    return this;
  }

  /**
   * status code returned by a canonicalized page
* the checkup of the server behavior when our crawler tries to access the website via IP;
* in most cases, it is recommended that canonicalized pages respond with a 301 or 302 status code
   * @return canonicalizationStatusCode
   */
  @javax.annotation.Nullable
  public Integer getCanonicalizationStatusCode() {
    return canonicalizationStatusCode;
  }

  public void setCanonicalizationStatusCode(Integer canonicalizationStatusCode) {
    this.canonicalizationStatusCode = canonicalizationStatusCode;
  }


  public static final String SERIALIZED_NAME_DIRECTORY_BROWSING_STATUS_CODE = "directory_browsing_status_code";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_BROWSING_STATUS_CODE)
  private Integer directoryBrowsingStatusCode;

  public DomainInfo directoryBrowsingStatusCode(Integer directoryBrowsingStatusCode) {
    this.directoryBrowsingStatusCode = directoryBrowsingStatusCode;
    return this;
  }

  /**
   * status code returned by a directory
* the status code returned by a directory page on a target website
* in most cases, it is recommended that directories respond with a 403 or 401 status code
   * @return directoryBrowsingStatusCode
   */
  @javax.annotation.Nullable
  public Integer getDirectoryBrowsingStatusCode() {
    return directoryBrowsingStatusCode;
  }

  public void setDirectoryBrowsingStatusCode(Integer directoryBrowsingStatusCode) {
    this.directoryBrowsingStatusCode = directoryBrowsingStatusCode;
  }


  public static final String SERIALIZED_NAME_WWW_REDIRECT_STATUS_CODE = "www_redirect_status_code";
  @SerializedName(SERIALIZED_NAME_WWW_REDIRECT_STATUS_CODE)
  private Integer wwwRedirectStatusCode;

  public DomainInfo wwwRedirectStatusCode(Integer wwwRedirectStatusCode) {
    this.wwwRedirectStatusCode = wwwRedirectStatusCode;
    return this;
  }

  /**
   * redirect status code
* the status code of the www to non-www redirect
* in most cases, it is recommended that redirect returns a 301 status code
   * @return wwwRedirectStatusCode
   */
  @javax.annotation.Nullable
  public Integer getWwwRedirectStatusCode() {
    return wwwRedirectStatusCode;
  }

  public void setWwwRedirectStatusCode(Integer wwwRedirectStatusCode) {
    this.wwwRedirectStatusCode = wwwRedirectStatusCode;
  }


  public static final String SERIALIZED_NAME_MAIN_DOMAIN = "main_domain";
  @SerializedName(SERIALIZED_NAME_MAIN_DOMAIN)
  private String mainDomain;

  public DomainInfo mainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
    return this;
  }

  /**
   * root domain name
   * @return mainDomain
   */
  @javax.annotation.Nullable
  public String getMainDomain() {
    return mainDomain;
  }

  public void setMainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
  }



  public DomainInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DomainInfo putAdditionalProperty(String key, Object value) {
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


    
    DomainInfo domainInfo = (DomainInfo) o;
    return

        Objects.equals(this.name, domainInfo.name) &&
        Objects.equals(this.cms, domainInfo.cms) &&
        Objects.equals(this.ip, domainInfo.ip) &&
        Objects.equals(this.server, domainInfo.server) &&
        Objects.equals(this.crawlStart, domainInfo.crawlStart) &&
        Objects.equals(this.crawlEnd, domainInfo.crawlEnd) &&
        Objects.equals(this.extendedCrawlStatus, domainInfo.extendedCrawlStatus) &&
        Objects.equals(this.sslInfo, domainInfo.sslInfo) &&
        Objects.equals(this.checks, domainInfo.checks) &&
        Objects.equals(this.totalPages, domainInfo.totalPages) &&
        Objects.equals(this.pageNotFoundStatusCode, domainInfo.pageNotFoundStatusCode) &&
        Objects.equals(this.canonicalizationStatusCode, domainInfo.canonicalizationStatusCode) &&
        Objects.equals(this.directoryBrowsingStatusCode, domainInfo.directoryBrowsingStatusCode) &&
        Objects.equals(this.wwwRedirectStatusCode, domainInfo.wwwRedirectStatusCode) &&
        Objects.equals(this.mainDomain, domainInfo.mainDomain);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(name, cms, ip, server, crawlStart, crawlEnd, extendedCrawlStatus, sslInfo, checks, totalPages, pageNotFoundStatusCode, canonicalizationStatusCode, directoryBrowsingStatusCode, wwwRedirectStatusCode, mainDomain);
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
    sb.append("class DomainInfo {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cms: ").append(toIndentedString(cms)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    crawlStart: ").append(toIndentedString(crawlStart)).append("\n");
    sb.append("    crawlEnd: ").append(toIndentedString(crawlEnd)).append("\n");
    sb.append("    extendedCrawlStatus: ").append(toIndentedString(extendedCrawlStatus)).append("\n");
    sb.append("    sslInfo: ").append(toIndentedString(sslInfo)).append("\n");
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    pageNotFoundStatusCode: ").append(toIndentedString(pageNotFoundStatusCode)).append("\n");
    sb.append("    canonicalizationStatusCode: ").append(toIndentedString(canonicalizationStatusCode)).append("\n");
    sb.append("    directoryBrowsingStatusCode: ").append(toIndentedString(directoryBrowsingStatusCode)).append("\n");
    sb.append("    wwwRedirectStatusCode: ").append(toIndentedString(wwwRedirectStatusCode)).append("\n");
    sb.append("    mainDomain: ").append(toIndentedString(mainDomain)).append("\n");
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
    
    openapiFields.add("name");
    
    openapiFields.add("cms");
    
    openapiFields.add("ip");
    
    openapiFields.add("server");
    
    openapiFields.add("crawl_start");
    
    openapiFields.add("crawl_end");
    
    openapiFields.add("extended_crawl_status");
    
    openapiFields.add("ssl_info");
    
    openapiFields.add("checks");
    
    openapiFields.add("total_pages");
    
    openapiFields.add("page_not_found_status_code");
    
    openapiFields.add("canonicalization_status_code");
    
    openapiFields.add("directory_browsing_status_code");
    
    openapiFields.add("www_redirect_status_code");
    
    openapiFields.add("main_domain");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainInfo>() {
           @Override
           public void write(JsonWriter out, DomainInfo value) throws IOException {
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
           public DomainInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DomainInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
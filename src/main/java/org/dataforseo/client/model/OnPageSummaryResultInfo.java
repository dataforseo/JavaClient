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
import org.dataforseo.client.model.CrawlStatusInfo;
import org.dataforseo.client.model.DomainInfo;
import org.dataforseo.client.model.PageMetrics;
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
 * OnPageSummaryResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class OnPageSummaryResultInfo {
  public static final String SERIALIZED_NAME_CRAWL_PROGRESS = "crawl_progress";
  @SerializedName(SERIALIZED_NAME_CRAWL_PROGRESS)
  private String crawlProgress;

  public static final String SERIALIZED_NAME_CRAWL_STATUS = "crawl_status";
  @SerializedName(SERIALIZED_NAME_CRAWL_STATUS)
  private CrawlStatusInfo crawlStatus;

  public static final String SERIALIZED_NAME_CRAWL_GATEWAY_ADDRESS = "crawl_gateway_address";
  @SerializedName(SERIALIZED_NAME_CRAWL_GATEWAY_ADDRESS)
  private String crawlGatewayAddress;

  public static final String SERIALIZED_NAME_CRAWL_STOP_REASON = "crawl_stop_reason";
  @SerializedName(SERIALIZED_NAME_CRAWL_STOP_REASON)
  private String crawlStopReason;

  public static final String SERIALIZED_NAME_DOMAIN_INFO = "domain_info";
  @SerializedName(SERIALIZED_NAME_DOMAIN_INFO)
  private DomainInfo domainInfo;

  public static final String SERIALIZED_NAME_PAGE_METRICS = "page_metrics";
  @SerializedName(SERIALIZED_NAME_PAGE_METRICS)
  private PageMetrics pageMetrics;

  public OnPageSummaryResultInfo() {
  }

  public OnPageSummaryResultInfo crawlProgress(String crawlProgress) {
    this.crawlProgress = crawlProgress;
    return this;
  }

   /**
   * status of the crawling session possible values: in_progress, finished
   * @return crawlProgress
  **/
  @javax.annotation.Nullable
  public String getCrawlProgress() {
    return crawlProgress;
  }

  public void setCrawlProgress(String crawlProgress) {
    this.crawlProgress = crawlProgress;
  }


  public OnPageSummaryResultInfo crawlStatus(CrawlStatusInfo crawlStatus) {
    this.crawlStatus = crawlStatus;
    return this;
  }

   /**
   * Get crawlStatus
   * @return crawlStatus
  **/
  @javax.annotation.Nullable
  public CrawlStatusInfo getCrawlStatus() {
    return crawlStatus;
  }

  public void setCrawlStatus(CrawlStatusInfo crawlStatus) {
    this.crawlStatus = crawlStatus;
  }


  public OnPageSummaryResultInfo crawlGatewayAddress(String crawlGatewayAddress) {
    this.crawlGatewayAddress = crawlGatewayAddress;
    return this;
  }

   /**
   * crawler ip address displays the IP address used by the crawler to initiate the current crawling session you can find the full list of IPs used by our crawler in the Overview section
   * @return crawlGatewayAddress
  **/
  @javax.annotation.Nullable
  public String getCrawlGatewayAddress() {
    return crawlGatewayAddress;
  }

  public void setCrawlGatewayAddress(String crawlGatewayAddress) {
    this.crawlGatewayAddress = crawlGatewayAddress;
  }


  public OnPageSummaryResultInfo crawlStopReason(String crawlStopReason) {
    this.crawlStopReason = crawlStopReason;
    return this;
  }

   /**
   * reason why the crawling stopped information about the reason why the crawling process stopped; possible values: limit_exceeded – the limit set in the max_crawl_pages was exceeded; empty_queue – all URLs in the queue were crawled; force_stopped – the crawling process was halted using the On Page API Force Stop function; unexpected_exception – an internal error was encountered while crawling the target, contact support for more info
   * @return crawlStopReason
  **/
  @javax.annotation.Nullable
  public String getCrawlStopReason() {
    return crawlStopReason;
  }

  public void setCrawlStopReason(String crawlStopReason) {
    this.crawlStopReason = crawlStopReason;
  }


  public OnPageSummaryResultInfo domainInfo(DomainInfo domainInfo) {
    this.domainInfo = domainInfo;
    return this;
  }

   /**
   * Get domainInfo
   * @return domainInfo
  **/
  @javax.annotation.Nullable
  public DomainInfo getDomainInfo() {
    return domainInfo;
  }

  public void setDomainInfo(DomainInfo domainInfo) {
    this.domainInfo = domainInfo;
  }


  public OnPageSummaryResultInfo pageMetrics(PageMetrics pageMetrics) {
    this.pageMetrics = pageMetrics;
    return this;
  }

   /**
   * Get pageMetrics
   * @return pageMetrics
  **/
  @javax.annotation.Nullable
  public PageMetrics getPageMetrics() {
    return pageMetrics;
  }

  public void setPageMetrics(PageMetrics pageMetrics) {
    this.pageMetrics = pageMetrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnPageSummaryResultInfo onPageSummaryResultInfo = (OnPageSummaryResultInfo) o;
    return Objects.equals(this.crawlProgress, onPageSummaryResultInfo.crawlProgress) &&
        Objects.equals(this.crawlStatus, onPageSummaryResultInfo.crawlStatus) &&
        Objects.equals(this.crawlGatewayAddress, onPageSummaryResultInfo.crawlGatewayAddress) &&
        Objects.equals(this.crawlStopReason, onPageSummaryResultInfo.crawlStopReason) &&
        Objects.equals(this.domainInfo, onPageSummaryResultInfo.domainInfo) &&
        Objects.equals(this.pageMetrics, onPageSummaryResultInfo.pageMetrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(crawlProgress, crawlStatus, crawlGatewayAddress, crawlStopReason, domainInfo, pageMetrics);
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
    sb.append("class OnPageSummaryResultInfo {\n");
    sb.append("    crawlProgress: ").append(toIndentedString(crawlProgress)).append("\n");
    sb.append("    crawlStatus: ").append(toIndentedString(crawlStatus)).append("\n");
    sb.append("    crawlGatewayAddress: ").append(toIndentedString(crawlGatewayAddress)).append("\n");
    sb.append("    crawlStopReason: ").append(toIndentedString(crawlStopReason)).append("\n");
    sb.append("    domainInfo: ").append(toIndentedString(domainInfo)).append("\n");
    sb.append("    pageMetrics: ").append(toIndentedString(pageMetrics)).append("\n");
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
    openapiFields.add("crawl_progress");
    openapiFields.add("crawl_status");
    openapiFields.add("crawl_gateway_address");
    openapiFields.add("crawl_stop_reason");
    openapiFields.add("domain_info");
    openapiFields.add("page_metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OnPageSummaryResultInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnPageSummaryResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnPageSummaryResultInfo is not found in the empty JSON string", OnPageSummaryResultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnPageSummaryResultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnPageSummaryResultInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("crawl_progress") != null && !jsonObj.get("crawl_progress").isJsonNull()) && !jsonObj.get("crawl_progress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crawl_progress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crawl_progress").toString()));
      }
      // validate the optional field `crawl_status`
      if (jsonObj.get("crawl_status") != null && !jsonObj.get("crawl_status").isJsonNull()) {
        CrawlStatusInfo.validateJsonElement(jsonObj.get("crawl_status"));
      }
      if ((jsonObj.get("crawl_gateway_address") != null && !jsonObj.get("crawl_gateway_address").isJsonNull()) && !jsonObj.get("crawl_gateway_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crawl_gateway_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crawl_gateway_address").toString()));
      }
      if ((jsonObj.get("crawl_stop_reason") != null && !jsonObj.get("crawl_stop_reason").isJsonNull()) && !jsonObj.get("crawl_stop_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crawl_stop_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crawl_stop_reason").toString()));
      }
      // validate the optional field `domain_info`
      if (jsonObj.get("domain_info") != null && !jsonObj.get("domain_info").isJsonNull()) {
        DomainInfo.validateJsonElement(jsonObj.get("domain_info"));
      }
      // validate the optional field `page_metrics`
      if (jsonObj.get("page_metrics") != null && !jsonObj.get("page_metrics").isJsonNull()) {
        PageMetrics.validateJsonElement(jsonObj.get("page_metrics"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageSummaryResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageSummaryResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageSummaryResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageSummaryResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageSummaryResultInfo>() {
           @Override
           public void write(JsonWriter out, OnPageSummaryResultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnPageSummaryResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnPageSummaryResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnPageSummaryResultInfo
  * @throws IOException if the JSON string is invalid with respect to OnPageSummaryResultInfo
  */
  public static OnPageSummaryResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageSummaryResultInfo.class);
  }

 /**
  * Convert an instance of OnPageSummaryResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

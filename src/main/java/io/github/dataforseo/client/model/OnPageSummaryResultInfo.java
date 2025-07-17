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



public class OnPageSummaryResultInfo  {


  public static final String SERIALIZED_NAME_CRAWL_PROGRESS = "crawl_progress";
  @SerializedName(SERIALIZED_NAME_CRAWL_PROGRESS)
  private String crawlProgress;

  public OnPageSummaryResultInfo crawlProgress(String crawlProgress) {
    this.crawlProgress = crawlProgress;
    return this;
  }

  /**
   * status of the crawling session
* possible values: in_progress, finished
   * @return crawlProgress
   */
  @javax.annotation.Nullable
  public String getCrawlProgress() {
    return crawlProgress;
  }

  public void setCrawlProgress(String crawlProgress) {
    this.crawlProgress = crawlProgress;
  }


  public static final String SERIALIZED_NAME_CRAWL_STATUS = "crawl_status";
  @SerializedName(SERIALIZED_NAME_CRAWL_STATUS)
  private CrawlStatusInfo crawlStatus;

  public OnPageSummaryResultInfo crawlStatus(CrawlStatusInfo crawlStatus) {
    this.crawlStatus = crawlStatus;
    return this;
  }

  /**
   * details of the crawling session
   * @return crawlStatus
   */
  @javax.annotation.Nullable
  public CrawlStatusInfo getCrawlStatus() {
    return crawlStatus;
  }

  public void setCrawlStatus(CrawlStatusInfo crawlStatus) {
    this.crawlStatus = crawlStatus;
  }


  public static final String SERIALIZED_NAME_CRAWL_GATEWAY_ADDRESS = "crawl_gateway_address";
  @SerializedName(SERIALIZED_NAME_CRAWL_GATEWAY_ADDRESS)
  private String crawlGatewayAddress;

  public OnPageSummaryResultInfo crawlGatewayAddress(String crawlGatewayAddress) {
    this.crawlGatewayAddress = crawlGatewayAddress;
    return this;
  }

  /**
   * crawler ip address
* displays the IP address used by the crawler to initiate the current crawling session
* you can find the full list of IPs used by our crawler in the Overview section
   * @return crawlGatewayAddress
   */
  @javax.annotation.Nullable
  public String getCrawlGatewayAddress() {
    return crawlGatewayAddress;
  }

  public void setCrawlGatewayAddress(String crawlGatewayAddress) {
    this.crawlGatewayAddress = crawlGatewayAddress;
  }


  public static final String SERIALIZED_NAME_CRAWL_STOP_REASON = "crawl_stop_reason";
  @SerializedName(SERIALIZED_NAME_CRAWL_STOP_REASON)
  private String crawlStopReason;

  public OnPageSummaryResultInfo crawlStopReason(String crawlStopReason) {
    this.crawlStopReason = crawlStopReason;
    return this;
  }

  /**
   * reason why the crawling stopped
* information about the reason why the crawling process stopped;
* possible values:
* limit_exceeded – the limit set in the max_crawl_pages was exceeded;
* empty_queue – all URLs in the queue were crawled;
* force_stopped – the crawling process was halted using the On Page API Force Stop function;
* unexpected_exception – an internal error was encountered while crawling the target, contact support for more info
   * @return crawlStopReason
   */
  @javax.annotation.Nullable
  public String getCrawlStopReason() {
    return crawlStopReason;
  }

  public void setCrawlStopReason(String crawlStopReason) {
    this.crawlStopReason = crawlStopReason;
  }


  public static final String SERIALIZED_NAME_DOMAIN_INFO = "domain_info";
  @SerializedName(SERIALIZED_NAME_DOMAIN_INFO)
  private DomainInfo domainInfo;

  public OnPageSummaryResultInfo domainInfo(DomainInfo domainInfo) {
    this.domainInfo = domainInfo;
    return this;
  }

  /**
   * domain-wide info
* on-page information about the target domain and crawling process
   * @return domainInfo
   */
  @javax.annotation.Nullable
  public DomainInfo getDomainInfo() {
    return domainInfo;
  }

  public void setDomainInfo(DomainInfo domainInfo) {
    this.domainInfo = domainInfo;
  }


  public static final String SERIALIZED_NAME_PAGE_METRICS = "page_metrics";
  @SerializedName(SERIALIZED_NAME_PAGE_METRICS)
  private PageMetrics pageMetrics;

  public OnPageSummaryResultInfo pageMetrics(PageMetrics pageMetrics) {
    this.pageMetrics = pageMetrics;
    return this;
  }

  /**
   * page-specific info
* metrics information on the target website pages
   * @return pageMetrics
   */
  @javax.annotation.Nullable
  public PageMetrics getPageMetrics() {
    return pageMetrics;
  }

  public void setPageMetrics(PageMetrics pageMetrics) {
    this.pageMetrics = pageMetrics;
  }



  public OnPageSummaryResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageSummaryResultInfo putAdditionalProperty(String key, Object value) {
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


    
    OnPageSummaryResultInfo onPageSummaryResultInfo = (OnPageSummaryResultInfo) o;
    return

        Objects.equals(this.crawlProgress, onPageSummaryResultInfo.crawlProgress) &&
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
           public OnPageSummaryResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageSummaryResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPageSummaryResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageSummaryResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
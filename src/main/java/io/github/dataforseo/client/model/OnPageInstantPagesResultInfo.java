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



public class OnPageInstantPagesResultInfo  {


  public static final String SERIALIZED_NAME_CRAWL_PROGRESS = "crawl_progress";
  @SerializedName(SERIALIZED_NAME_CRAWL_PROGRESS)
  private String crawlProgress;

  public OnPageInstantPagesResultInfo crawlProgress(String crawlProgress) {
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

  public OnPageInstantPagesResultInfo crawlStatus(CrawlStatusInfo crawlStatus) {
    this.crawlStatus = crawlStatus;
    return this;
  }

  /**
   * details of the crawling session
* in this case the value will be null
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

  public OnPageInstantPagesResultInfo crawlGatewayAddress(String crawlGatewayAddress) {
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


  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public OnPageInstantPagesResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  /**
   * number of items in the results array
   * @return itemsCount
   */
  @javax.annotation.Nullable
  public Long getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
  }


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OnPageStylesheetResourceItem> items;

  public OnPageInstantPagesResultInfo items(List<OnPageStylesheetResourceItem> items) {
    this.items = items;
    return this;
  }

  /**
   * items array
   * @return items
   */
  @javax.annotation.Nullable
  public List<OnPageStylesheetResourceItem> getItems() {
    return items;
  }

  public void setItems(List<OnPageStylesheetResourceItem> items) {
    this.items = items;
  }



  public OnPageInstantPagesResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageInstantPagesResultInfo putAdditionalProperty(String key, Object value) {
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


    
    OnPageInstantPagesResultInfo onPageInstantPagesResultInfo = (OnPageInstantPagesResultInfo) o;
    return

        Objects.equals(this.crawlProgress, onPageInstantPagesResultInfo.crawlProgress) &&
        Objects.equals(this.crawlStatus, onPageInstantPagesResultInfo.crawlStatus) &&
        Objects.equals(this.crawlGatewayAddress, onPageInstantPagesResultInfo.crawlGatewayAddress) &&
        Objects.equals(this.itemsCount, onPageInstantPagesResultInfo.itemsCount) &&
        Objects.equals(this.items, onPageInstantPagesResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(crawlProgress, crawlStatus, crawlGatewayAddress, itemsCount, items);
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
    sb.append("class OnPageInstantPagesResultInfo {\n");

    sb.append("    crawlProgress: ").append(toIndentedString(crawlProgress)).append("\n");
    sb.append("    crawlStatus: ").append(toIndentedString(crawlStatus)).append("\n");
    sb.append("    crawlGatewayAddress: ").append(toIndentedString(crawlGatewayAddress)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    
    openapiFields.add("items_count");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPageInstantPagesResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageInstantPagesResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageInstantPagesResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageInstantPagesResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageInstantPagesResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageInstantPagesResultInfo>() {
           @Override
           public void write(JsonWriter out, OnPageInstantPagesResultInfo value) throws IOException {
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
           public OnPageInstantPagesResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageInstantPagesResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPageInstantPagesResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageInstantPagesResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
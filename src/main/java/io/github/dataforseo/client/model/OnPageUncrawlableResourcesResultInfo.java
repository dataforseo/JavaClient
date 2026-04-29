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



public class OnPageUncrawlableResourcesResultInfo  {


  public static final String SERIALIZED_NAME_CRAWL_PROGRESS = "crawl_progress";
  @SerializedName(SERIALIZED_NAME_CRAWL_PROGRESS)
  private String crawlProgress;

  public OnPageUncrawlableResourcesResultInfo crawlProgress(String crawlProgress) {
    this.crawlProgress = crawlProgress;
    return this;
  }

  /**
   * status of the crawling sessionpossible values: in_progress, finished
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

  public OnPageUncrawlableResourcesResultInfo crawlStatus(CrawlStatusInfo crawlStatus) {
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


  public static final String SERIALIZED_NAME_CURRENT_OFFSET = "current_offset";
  @SerializedName(SERIALIZED_NAME_CURRENT_OFFSET)
  private Integer currentOffset;

  public OnPageUncrawlableResourcesResultInfo currentOffset(Integer currentOffset) {
    this.currentOffset = currentOffset;
    return this;
  }

  /**
   * 
   * @return currentOffset
   */
  @javax.annotation.Nullable
  public Integer getCurrentOffset() {
    return currentOffset;
  }

  public void setCurrentOffset(Integer currentOffset) {
    this.currentOffset = currentOffset;
  }


  public static final String SERIALIZED_NAME_TOTAL_ITEMS_COUNT = "total_items_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS_COUNT)
  private Long totalItemsCount;

  public OnPageUncrawlableResourcesResultInfo totalItemsCount(Long totalItemsCount) {
    this.totalItemsCount = totalItemsCount;
    return this;
  }

  /**
   * total number of uncrawlable resources found total number of uncrawlable resources found during the crawl of the target domain
   * @return totalItemsCount
   */
  @javax.annotation.Nullable
  public Long getTotalItemsCount() {
    return totalItemsCount;
  }

  public void setTotalItemsCount(Long totalItemsCount) {
    this.totalItemsCount = totalItemsCount;
  }


  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public OnPageUncrawlableResourcesResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  /**
   * number of uncrawlable resources in the items array
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
  private List<OnPageUncrawlableResourcesItem> items;

  public OnPageUncrawlableResourcesResultInfo items(List<OnPageUncrawlableResourcesItem> items) {
    this.items = items;
    return this;
  }

  /**
   * array of uncrawlable resources
   * @return items
   */
  @javax.annotation.Nullable
  public List<OnPageUncrawlableResourcesItem> getItems() {
    return items;
  }

  public void setItems(List<OnPageUncrawlableResourcesItem> items) {
    this.items = items;
  }



  public OnPageUncrawlableResourcesResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageUncrawlableResourcesResultInfo putAdditionalProperty(String key, Object value) {
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


    
    OnPageUncrawlableResourcesResultInfo onPageUncrawlableResourcesResultInfo = (OnPageUncrawlableResourcesResultInfo) o;
    return

        Objects.equals(this.crawlProgress, onPageUncrawlableResourcesResultInfo.crawlProgress) &&
        Objects.equals(this.crawlStatus, onPageUncrawlableResourcesResultInfo.crawlStatus) &&
        Objects.equals(this.currentOffset, onPageUncrawlableResourcesResultInfo.currentOffset) &&
        Objects.equals(this.totalItemsCount, onPageUncrawlableResourcesResultInfo.totalItemsCount) &&
        Objects.equals(this.itemsCount, onPageUncrawlableResourcesResultInfo.itemsCount) &&
        Objects.equals(this.items, onPageUncrawlableResourcesResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(crawlProgress, crawlStatus, currentOffset, totalItemsCount, itemsCount, items);
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
    sb.append("class OnPageUncrawlableResourcesResultInfo {\n");

    sb.append("    crawlProgress: ").append(toIndentedString(crawlProgress)).append("\n");
    sb.append("    crawlStatus: ").append(toIndentedString(crawlStatus)).append("\n");
    sb.append("    currentOffset: ").append(toIndentedString(currentOffset)).append("\n");
    sb.append("    totalItemsCount: ").append(toIndentedString(totalItemsCount)).append("\n");
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
    
    openapiFields.add("current_offset");
    
    openapiFields.add("total_items_count");
    
    openapiFields.add("items_count");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPageUncrawlableResourcesResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageUncrawlableResourcesResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageUncrawlableResourcesResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageUncrawlableResourcesResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageUncrawlableResourcesResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageUncrawlableResourcesResultInfo>() {
           @Override
           public void write(JsonWriter out, OnPageUncrawlableResourcesResultInfo value) throws IOException {
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
           public OnPageUncrawlableResourcesResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageUncrawlableResourcesResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPageUncrawlableResourcesResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageUncrawlableResourcesResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
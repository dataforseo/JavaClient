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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.dataforseo.client.model.CrawlStatusInfo;
import org.dataforseo.client.model.OnPageRedirectChainsItem;
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
 * OnPageRedirectChainsResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class OnPageRedirectChainsResultInfo {
  public static final String SERIALIZED_NAME_CRAWL_PROGRESS = "crawl_progress";
  @SerializedName(SERIALIZED_NAME_CRAWL_PROGRESS)
  private String crawlProgress;

  public static final String SERIALIZED_NAME_CRAWL_STATUS = "crawl_status";
  @SerializedName(SERIALIZED_NAME_CRAWL_STATUS)
  private CrawlStatusInfo crawlStatus;

  public static final String SERIALIZED_NAME_TOTAL_ITEMS_COUNT = "total_items_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS_COUNT)
  private Long totalItemsCount;

  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OnPageRedirectChainsItem> items;

  public OnPageRedirectChainsResultInfo() {
  }

  public OnPageRedirectChainsResultInfo crawlProgress(String crawlProgress) {
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


  public OnPageRedirectChainsResultInfo crawlStatus(CrawlStatusInfo crawlStatus) {
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


  public OnPageRedirectChainsResultInfo totalItemsCount(Long totalItemsCount) {
    this.totalItemsCount = totalItemsCount;
    return this;
  }

   /**
   * total number of relevant items in the database
   * @return totalItemsCount
  **/
  @javax.annotation.Nullable
  public Long getTotalItemsCount() {
    return totalItemsCount;
  }

  public void setTotalItemsCount(Long totalItemsCount) {
    this.totalItemsCount = totalItemsCount;
  }


  public OnPageRedirectChainsResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

   /**
   * number of items in the results array
   * @return itemsCount
  **/
  @javax.annotation.Nullable
  public Long getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
  }


  public OnPageRedirectChainsResultInfo items(List<OnPageRedirectChainsItem> items) {
    this.items = items;
    return this;
  }

  public OnPageRedirectChainsResultInfo addItemsItem(OnPageRedirectChainsItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * items array
   * @return items
  **/
  @javax.annotation.Nullable
  public List<OnPageRedirectChainsItem> getItems() {
    return items;
  }

  public void setItems(List<OnPageRedirectChainsItem> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnPageRedirectChainsResultInfo onPageRedirectChainsResultInfo = (OnPageRedirectChainsResultInfo) o;
    return Objects.equals(this.crawlProgress, onPageRedirectChainsResultInfo.crawlProgress) &&
        Objects.equals(this.crawlStatus, onPageRedirectChainsResultInfo.crawlStatus) &&
        Objects.equals(this.totalItemsCount, onPageRedirectChainsResultInfo.totalItemsCount) &&
        Objects.equals(this.itemsCount, onPageRedirectChainsResultInfo.itemsCount) &&
        Objects.equals(this.items, onPageRedirectChainsResultInfo.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(crawlProgress, crawlStatus, totalItemsCount, itemsCount, items);
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
    sb.append("class OnPageRedirectChainsResultInfo {\n");
    sb.append("    crawlProgress: ").append(toIndentedString(crawlProgress)).append("\n");
    sb.append("    crawlStatus: ").append(toIndentedString(crawlStatus)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to OnPageRedirectChainsResultInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnPageRedirectChainsResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnPageRedirectChainsResultInfo is not found in the empty JSON string", OnPageRedirectChainsResultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnPageRedirectChainsResultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnPageRedirectChainsResultInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            OnPageRedirectChainsItem.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageRedirectChainsResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageRedirectChainsResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageRedirectChainsResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageRedirectChainsResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageRedirectChainsResultInfo>() {
           @Override
           public void write(JsonWriter out, OnPageRedirectChainsResultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnPageRedirectChainsResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnPageRedirectChainsResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnPageRedirectChainsResultInfo
  * @throws IOException if the JSON string is invalid with respect to OnPageRedirectChainsResultInfo
  */
  public static OnPageRedirectChainsResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageRedirectChainsResultInfo.class);
  }

 /**
  * Convert an instance of OnPageRedirectChainsResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

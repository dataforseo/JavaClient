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


package org.openapitools.client.model;

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
import org.openapitools.client.model.CrawlStatusInfo;
import org.openapitools.client.model.OnPageDuplicateTagsItem;
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

import org.openapitools.client.JSON;

/**
 * OnPageDuplicateTagsResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T15:03:59.388297468Z[Etc/UTC]")
public class OnPageDuplicateTagsResultInfo {
  public static final String SERIALIZED_NAME_CRAWL_PROGRESS = "crawl_progress";
  @SerializedName(SERIALIZED_NAME_CRAWL_PROGRESS)
  private String crawlProgress;

  public static final String SERIALIZED_NAME_CRAWL_STATUS = "crawl_status";
  @SerializedName(SERIALIZED_NAME_CRAWL_STATUS)
  private CrawlStatusInfo crawlStatus;

  public static final String SERIALIZED_NAME_TOTAL_PAGES_COUNT = "total_pages_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES_COUNT)
  private Long totalPagesCount;

  public static final String SERIALIZED_NAME_PAGES_COUNT = "pages_count";
  @SerializedName(SERIALIZED_NAME_PAGES_COUNT)
  private Long pagesCount;

  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OnPageDuplicateTagsItem> items;

  public OnPageDuplicateTagsResultInfo() {
  }

  public OnPageDuplicateTagsResultInfo crawlProgress(String crawlProgress) {
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


  public OnPageDuplicateTagsResultInfo crawlStatus(CrawlStatusInfo crawlStatus) {
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


  public OnPageDuplicateTagsResultInfo totalPagesCount(Long totalPagesCount) {
    this.totalPagesCount = totalPagesCount;
    return this;
  }

   /**
   * total number of pages with duplicate tags displays the total number of pages with duplicate tags of the target website
   * @return totalPagesCount
  **/
  @javax.annotation.Nullable
  public Long getTotalPagesCount() {
    return totalPagesCount;
  }

  public void setTotalPagesCount(Long totalPagesCount) {
    this.totalPagesCount = totalPagesCount;
  }


  public OnPageDuplicateTagsResultInfo pagesCount(Long pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

   /**
   * number of pages with duplicate tags in the response displays the number of pages with duplicate tags returned in the response
   * @return pagesCount
  **/
  @javax.annotation.Nullable
  public Long getPagesCount() {
    return pagesCount;
  }

  public void setPagesCount(Long pagesCount) {
    this.pagesCount = pagesCount;
  }


  public OnPageDuplicateTagsResultInfo itemsCount(Long itemsCount) {
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


  public OnPageDuplicateTagsResultInfo items(List<OnPageDuplicateTagsItem> items) {
    this.items = items;
    return this;
  }

  public OnPageDuplicateTagsResultInfo addItemsItem(OnPageDuplicateTagsItem itemsItem) {
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
  public List<OnPageDuplicateTagsItem> getItems() {
    return items;
  }

  public void setItems(List<OnPageDuplicateTagsItem> items) {
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
    OnPageDuplicateTagsResultInfo onPageDuplicateTagsResultInfo = (OnPageDuplicateTagsResultInfo) o;
    return Objects.equals(this.crawlProgress, onPageDuplicateTagsResultInfo.crawlProgress) &&
        Objects.equals(this.crawlStatus, onPageDuplicateTagsResultInfo.crawlStatus) &&
        Objects.equals(this.totalPagesCount, onPageDuplicateTagsResultInfo.totalPagesCount) &&
        Objects.equals(this.pagesCount, onPageDuplicateTagsResultInfo.pagesCount) &&
        Objects.equals(this.itemsCount, onPageDuplicateTagsResultInfo.itemsCount) &&
        Objects.equals(this.items, onPageDuplicateTagsResultInfo.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(crawlProgress, crawlStatus, totalPagesCount, pagesCount, itemsCount, items);
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
    sb.append("class OnPageDuplicateTagsResultInfo {\n");
    sb.append("    crawlProgress: ").append(toIndentedString(crawlProgress)).append("\n");
    sb.append("    crawlStatus: ").append(toIndentedString(crawlStatus)).append("\n");
    sb.append("    totalPagesCount: ").append(toIndentedString(totalPagesCount)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
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
    openapiFields.add("total_pages_count");
    openapiFields.add("pages_count");
    openapiFields.add("items_count");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OnPageDuplicateTagsResultInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnPageDuplicateTagsResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnPageDuplicateTagsResultInfo is not found in the empty JSON string", OnPageDuplicateTagsResultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnPageDuplicateTagsResultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnPageDuplicateTagsResultInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            OnPageDuplicateTagsItem.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageDuplicateTagsResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageDuplicateTagsResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageDuplicateTagsResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageDuplicateTagsResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageDuplicateTagsResultInfo>() {
           @Override
           public void write(JsonWriter out, OnPageDuplicateTagsResultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnPageDuplicateTagsResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnPageDuplicateTagsResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnPageDuplicateTagsResultInfo
  * @throws IOException if the JSON string is invalid with respect to OnPageDuplicateTagsResultInfo
  */
  public static OnPageDuplicateTagsResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageDuplicateTagsResultInfo.class);
  }

 /**
  * Convert an instance of OnPageDuplicateTagsResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


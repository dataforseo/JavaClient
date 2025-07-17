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



public class CrawlStatusInfo  {


  public static final String SERIALIZED_NAME_MAX_CRAWL_PAGES = "max_crawl_pages";
  @SerializedName(SERIALIZED_NAME_MAX_CRAWL_PAGES)
  private Long maxCrawlPages;

  public CrawlStatusInfo maxCrawlPages(Long maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
    return this;
  }

  /**
   * maximum number of pages to crawl
*  indicates the max_crawl_pages limit you specified when setting a task
   * @return maxCrawlPages
   */
  @javax.annotation.Nullable
  public Long getMaxCrawlPages() {
    return maxCrawlPages;
  }

  public void setMaxCrawlPages(Long maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
  }


  public static final String SERIALIZED_NAME_PAGES_IN_QUEUE = "pages_in_queue";
  @SerializedName(SERIALIZED_NAME_PAGES_IN_QUEUE)
  private Long pagesInQueue;

  public CrawlStatusInfo pagesInQueue(Long pagesInQueue) {
    this.pagesInQueue = pagesInQueue;
    return this;
  }

  /**
   * number of pages that are currently in the crawling queue
   * @return pagesInQueue
   */
  @javax.annotation.Nullable
  public Long getPagesInQueue() {
    return pagesInQueue;
  }

  public void setPagesInQueue(Long pagesInQueue) {
    this.pagesInQueue = pagesInQueue;
  }


  public static final String SERIALIZED_NAME_PAGES_CRAWLED = "pages_crawled";
  @SerializedName(SERIALIZED_NAME_PAGES_CRAWLED)
  private Long pagesCrawled;

  public CrawlStatusInfo pagesCrawled(Long pagesCrawled) {
    this.pagesCrawled = pagesCrawled;
    return this;
  }

  /**
   * number of crawled pages
   * @return pagesCrawled
   */
  @javax.annotation.Nullable
  public Long getPagesCrawled() {
    return pagesCrawled;
  }

  public void setPagesCrawled(Long pagesCrawled) {
    this.pagesCrawled = pagesCrawled;
  }



  public CrawlStatusInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public CrawlStatusInfo putAdditionalProperty(String key, Object value) {
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


    
    CrawlStatusInfo crawlStatusInfo = (CrawlStatusInfo) o;
    return

        Objects.equals(this.maxCrawlPages, crawlStatusInfo.maxCrawlPages) &&
        Objects.equals(this.pagesInQueue, crawlStatusInfo.pagesInQueue) &&
        Objects.equals(this.pagesCrawled, crawlStatusInfo.pagesCrawled);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(maxCrawlPages, pagesInQueue, pagesCrawled);
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
    sb.append("class CrawlStatusInfo {\n");

    sb.append("    maxCrawlPages: ").append(toIndentedString(maxCrawlPages)).append("\n");
    sb.append("    pagesInQueue: ").append(toIndentedString(pagesInQueue)).append("\n");
    sb.append("    pagesCrawled: ").append(toIndentedString(pagesCrawled)).append("\n");
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
    
    openapiFields.add("max_crawl_pages");
    
    openapiFields.add("pages_in_queue");
    
    openapiFields.add("pages_crawled");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CrawlStatusInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CrawlStatusInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CrawlStatusInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CrawlStatusInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CrawlStatusInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CrawlStatusInfo>() {
           @Override
           public void write(JsonWriter out, CrawlStatusInfo value) throws IOException {
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
           public CrawlStatusInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CrawlStatusInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static CrawlStatusInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CrawlStatusInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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


package io.github.dataforseo.dataforseo_client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.dataforseo.dataforseo_client.model.BaseSerpElementItem;
import io.github.dataforseo.dataforseo_client.model.KnowledgeGraphHotelsBookingElement;
import io.github.dataforseo.dataforseo_client.model.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import io.github.dataforseo.dataforseo_client.JSON;

/**
 * KnowledgeGraphHotelsBookingItemSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:39:13.468741042Z[Etc/UTC]")
public class KnowledgeGraphHotelsBookingItemSerpElementItem extends BaseSerpElementItem {
  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private String dateFrom;

  public static final String SERIALIZED_NAME_DATE_TO = "date_to";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private String dateTo;

  public static final String SERIALIZED_NAME_DATA_ATTRID = "data_attrid";
  @SerializedName(SERIALIZED_NAME_DATA_ATTRID)
  private String dataAttrid;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<KnowledgeGraphHotelsBookingElement> items;

  public static final String SERIALIZED_NAME_RECTANGLE = "rectangle";
  @SerializedName(SERIALIZED_NAME_RECTANGLE)
  private Rectangle rectangle;

  public KnowledgeGraphHotelsBookingItemSerpElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public KnowledgeGraphHotelsBookingItemSerpElementItem rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

   /**
   * group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group
   * @return rankGroup
  **/
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public KnowledgeGraphHotelsBookingItemSerpElementItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

   /**
   * absolute rank in SERP absolute position among all the elements in SERP
   * @return rankAbsolute
  **/
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public KnowledgeGraphHotelsBookingItemSerpElementItem position(String position) {
    this.position = position;
    return this;
  }

   /**
   * the alignment of the element in SERP can take the following values: left, right
   * @return position
  **/
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public KnowledgeGraphHotelsBookingItemSerpElementItem xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

   /**
   * the XPath of the element
   * @return xpath
  **/
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public KnowledgeGraphHotelsBookingItemSerpElementItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title of a given link element
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public KnowledgeGraphHotelsBookingItemSerpElementItem dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * starting date of stay in the format “year-month-date” example: 2019-11-15
   * @return dateFrom
  **/
  @javax.annotation.Nullable
  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }


  public KnowledgeGraphHotelsBookingItemSerpElementItem dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * ending date of stay in the format “year-month-date” example: 2019-11-17
   * @return dateTo
  **/
  @javax.annotation.Nullable
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }


  public KnowledgeGraphHotelsBookingItemSerpElementItem dataAttrid(String dataAttrid) {
    this.dataAttrid = dataAttrid;
    return this;
  }

   /**
   * google defined data attribute ID example: kc:/local:hotel booking
   * @return dataAttrid
  **/
  @javax.annotation.Nullable
  public String getDataAttrid() {
    return dataAttrid;
  }

  public void setDataAttrid(String dataAttrid) {
    this.dataAttrid = dataAttrid;
  }


  public KnowledgeGraphHotelsBookingItemSerpElementItem items(List<KnowledgeGraphHotelsBookingElement> items) {
    this.items = items;
    return this;
  }

  public KnowledgeGraphHotelsBookingItemSerpElementItem addItemsItem(KnowledgeGraphHotelsBookingElement itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * contains results featured in the ‘hotels_pack’ element of SERP
   * @return items
  **/
  @javax.annotation.Nullable
  public List<KnowledgeGraphHotelsBookingElement> getItems() {
    return items;
  }

  public void setItems(List<KnowledgeGraphHotelsBookingElement> items) {
    this.items = items;
  }


  public KnowledgeGraphHotelsBookingItemSerpElementItem rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

   /**
   * Get rectangle
   * @return rectangle
  **/
  @javax.annotation.Nullable
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGraphHotelsBookingItemSerpElementItem knowledgeGraphHotelsBookingItemSerpElementItem = (KnowledgeGraphHotelsBookingItemSerpElementItem) o;
    return Objects.equals(this.rankGroup, knowledgeGraphHotelsBookingItemSerpElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, knowledgeGraphHotelsBookingItemSerpElementItem.rankAbsolute) &&
        Objects.equals(this.position, knowledgeGraphHotelsBookingItemSerpElementItem.position) &&
        Objects.equals(this.xpath, knowledgeGraphHotelsBookingItemSerpElementItem.xpath) &&
        Objects.equals(this.title, knowledgeGraphHotelsBookingItemSerpElementItem.title) &&
        Objects.equals(this.dateFrom, knowledgeGraphHotelsBookingItemSerpElementItem.dateFrom) &&
        Objects.equals(this.dateTo, knowledgeGraphHotelsBookingItemSerpElementItem.dateTo) &&
        Objects.equals(this.dataAttrid, knowledgeGraphHotelsBookingItemSerpElementItem.dataAttrid) &&
        Objects.equals(this.items, knowledgeGraphHotelsBookingItemSerpElementItem.items) &&
        Objects.equals(this.rectangle, knowledgeGraphHotelsBookingItemSerpElementItem.rectangle) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankGroup, rankAbsolute, position, xpath, title, dateFrom, dateTo, dataAttrid, items, rectangle, super.hashCode());
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
    sb.append("class KnowledgeGraphHotelsBookingItemSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    dataAttrid: ").append(toIndentedString(dataAttrid)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
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
    openapiFields.add("rank_group");
    openapiFields.add("rank_absolute");
    openapiFields.add("position");
    openapiFields.add("xpath");
    openapiFields.add("title");
    openapiFields.add("date_from");
    openapiFields.add("date_to");
    openapiFields.add("data_attrid");
    openapiFields.add("items");
    openapiFields.add("rectangle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to KnowledgeGraphHotelsBookingItemSerpElementItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KnowledgeGraphHotelsBookingItemSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KnowledgeGraphHotelsBookingItemSerpElementItem is not found in the empty JSON string", KnowledgeGraphHotelsBookingItemSerpElementItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KnowledgeGraphHotelsBookingItemSerpElementItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KnowledgeGraphHotelsBookingItemSerpElementItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KnowledgeGraphHotelsBookingItemSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KnowledgeGraphHotelsBookingItemSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KnowledgeGraphHotelsBookingItemSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KnowledgeGraphHotelsBookingItemSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<KnowledgeGraphHotelsBookingItemSerpElementItem>() {
           @Override
           public void write(JsonWriter out, KnowledgeGraphHotelsBookingItemSerpElementItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KnowledgeGraphHotelsBookingItemSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KnowledgeGraphHotelsBookingItemSerpElementItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KnowledgeGraphHotelsBookingItemSerpElementItem
  * @throws IOException if the JSON string is invalid with respect to KnowledgeGraphHotelsBookingItemSerpElementItem
  */
  public static KnowledgeGraphHotelsBookingItemSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KnowledgeGraphHotelsBookingItemSerpElementItem.class);
  }

 /**
  * Convert an instance of KnowledgeGraphHotelsBookingItemSerpElementItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


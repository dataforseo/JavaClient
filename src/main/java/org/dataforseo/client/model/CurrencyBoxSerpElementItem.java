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
import org.dataforseo.client.model.BaseSerpElementItem;
import org.dataforseo.client.model.Graph;
import org.dataforseo.client.model.Rectangle;
import org.dataforseo.client.model.Table;
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
 * CurrencyBoxSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T15:18:23.103906100+03:00[Europe/Kiev]")
public class CurrencyBoxSerpElementItem extends BaseSerpElementItem {
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

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Float value;

  public static final String SERIALIZED_NAME_CONVERTED_VALUE = "converted_value";
  @SerializedName(SERIALIZED_NAME_CONVERTED_VALUE)
  private Float convertedValue;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_CONVERTED_CURRENCY = "converted_currency";
  @SerializedName(SERIALIZED_NAME_CONVERTED_CURRENCY)
  private String convertedCurrency;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_TABLE = "table";
  @SerializedName(SERIALIZED_NAME_TABLE)
  private Table table;

  public static final String SERIALIZED_NAME_GRAPH = "graph";
  @SerializedName(SERIALIZED_NAME_GRAPH)
  private Graph graph;

  public static final String SERIALIZED_NAME_RECTANGLE = "rectangle";
  @SerializedName(SERIALIZED_NAME_RECTANGLE)
  private Rectangle rectangle;

  public CurrencyBoxSerpElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public CurrencyBoxSerpElementItem rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

   /**
   * group rank in SERP position within a group of elements with identical type values; positions of elements with different type values are omitted from rank_group; always equals 0 for desktop
   * @return rankGroup
  **/
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public CurrencyBoxSerpElementItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

   /**
   * absolute rank in SERP absolute position among all the elements in SERP always equals 0 for desktop
   * @return rankAbsolute
  **/
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public CurrencyBoxSerpElementItem position(String position) {
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


  public CurrencyBoxSerpElementItem xpath(String xpath) {
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


  public CurrencyBoxSerpElementItem value(Float value) {
    this.value = value;
    return this;
  }

   /**
   * the value of the rating
   * @return value
  **/
  @javax.annotation.Nullable
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }


  public CurrencyBoxSerpElementItem convertedValue(Float convertedValue) {
    this.convertedValue = convertedValue;
    return this;
  }

   /**
   * value converted to a requested currency indicates the exact value based on Google Fincance data at the time when our API pulled the results note that exchange rates displayed in the currency_box element may be delayed according to the Google Finance disclaimer
   * @return convertedValue
  **/
  @javax.annotation.Nullable
  public Float getConvertedValue() {
    return convertedValue;
  }

  public void setConvertedValue(Float convertedValue) {
    this.convertedValue = convertedValue;
  }


  public CurrencyBoxSerpElementItem currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * currency of the listed price ISO code of the currency applied to the price
   * @return currency
  **/
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CurrencyBoxSerpElementItem convertedCurrency(String convertedCurrency) {
    this.convertedCurrency = convertedCurrency;
    return this;
  }

   /**
   * converted currency
   * @return convertedCurrency
  **/
  @javax.annotation.Nullable
  public String getConvertedCurrency() {
    return convertedCurrency;
  }

  public void setConvertedCurrency(String convertedCurrency) {
    this.convertedCurrency = convertedCurrency;
  }


  public CurrencyBoxSerpElementItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * date and time when the result was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public CurrencyBoxSerpElementItem table(Table table) {
    this.table = table;
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @javax.annotation.Nullable
  public Table getTable() {
    return table;
  }

  public void setTable(Table table) {
    this.table = table;
  }


  public CurrencyBoxSerpElementItem graph(Graph graph) {
    this.graph = graph;
    return this;
  }

   /**
   * Get graph
   * @return graph
  **/
  @javax.annotation.Nullable
  public Graph getGraph() {
    return graph;
  }

  public void setGraph(Graph graph) {
    this.graph = graph;
  }


  public CurrencyBoxSerpElementItem rectangle(Rectangle rectangle) {
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
    CurrencyBoxSerpElementItem currencyBoxSerpElementItem = (CurrencyBoxSerpElementItem) o;
    return Objects.equals(this.rankGroup, currencyBoxSerpElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, currencyBoxSerpElementItem.rankAbsolute) &&
        Objects.equals(this.position, currencyBoxSerpElementItem.position) &&
        Objects.equals(this.xpath, currencyBoxSerpElementItem.xpath) &&
        Objects.equals(this.value, currencyBoxSerpElementItem.value) &&
        Objects.equals(this.convertedValue, currencyBoxSerpElementItem.convertedValue) &&
        Objects.equals(this.currency, currencyBoxSerpElementItem.currency) &&
        Objects.equals(this.convertedCurrency, currencyBoxSerpElementItem.convertedCurrency) &&
        Objects.equals(this.timestamp, currencyBoxSerpElementItem.timestamp) &&
        Objects.equals(this.table, currencyBoxSerpElementItem.table) &&
        Objects.equals(this.graph, currencyBoxSerpElementItem.graph) &&
        Objects.equals(this.rectangle, currencyBoxSerpElementItem.rectangle) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankGroup, rankAbsolute, position, xpath, value, convertedValue, currency, convertedCurrency, timestamp, table, graph, rectangle, super.hashCode());
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
    sb.append("class CurrencyBoxSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    convertedValue: ").append(toIndentedString(convertedValue)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    convertedCurrency: ").append(toIndentedString(convertedCurrency)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("converted_value");
    openapiFields.add("currency");
    openapiFields.add("converted_currency");
    openapiFields.add("timestamp");
    openapiFields.add("table");
    openapiFields.add("graph");
    openapiFields.add("rectangle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CurrencyBoxSerpElementItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CurrencyBoxSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurrencyBoxSerpElementItem is not found in the empty JSON string", CurrencyBoxSerpElementItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CurrencyBoxSerpElementItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurrencyBoxSerpElementItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurrencyBoxSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurrencyBoxSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurrencyBoxSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurrencyBoxSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CurrencyBoxSerpElementItem>() {
           @Override
           public void write(JsonWriter out, CurrencyBoxSerpElementItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurrencyBoxSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurrencyBoxSerpElementItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurrencyBoxSerpElementItem
  * @throws IOException if the JSON string is invalid with respect to CurrencyBoxSerpElementItem
  */
  public static CurrencyBoxSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurrencyBoxSerpElementItem.class);
  }

 /**
  * Convert an instance of CurrencyBoxSerpElementItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


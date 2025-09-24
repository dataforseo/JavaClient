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



public class CurrencyBoxSerpElementItem  extends BaseSerpApiElementItem  {


  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public CurrencyBoxSerpElementItem rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * group rank in SERP
* position within a group of elements with identical type values;
* positions of elements with different type values are omitted from rank_group;
* always equals 0 for desktop
   * @return rankGroup
   */
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public CurrencyBoxSerpElementItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP
* absolute position among all the elements in SERP
* always equals 0 for desktop
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public CurrencyBoxSerpElementItem value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * the value of the rating
   * @return value
   */
  @javax.annotation.Nullable
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  public static final String SERIALIZED_NAME_CONVERTED_VALUE = "converted_value";
  @SerializedName(SERIALIZED_NAME_CONVERTED_VALUE)
  private Double convertedValue;

  public CurrencyBoxSerpElementItem convertedValue(Double convertedValue) {
    this.convertedValue = convertedValue;
    return this;
  }

  /**
   * value converted to a requested currency
* indicates the exact value based on Google Fincance data at the time when our API pulled the results
* note that exchange rates displayed in the currency_box element may be delayed according to the Google Finance disclaimer
   * @return convertedValue
   */
  @javax.annotation.Nullable
  public Double getConvertedValue() {
    return convertedValue;
  }

  public void setConvertedValue(Double convertedValue) {
    this.convertedValue = convertedValue;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public CurrencyBoxSerpElementItem currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * currency of the listed price
* ISO code of the currency applied to the price
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public static final String SERIALIZED_NAME_CONVERTED_CURRENCY = "converted_currency";
  @SerializedName(SERIALIZED_NAME_CONVERTED_CURRENCY)
  private String convertedCurrency;

  public CurrencyBoxSerpElementItem convertedCurrency(String convertedCurrency) {
    this.convertedCurrency = convertedCurrency;
    return this;
  }

  /**
   * converted currency
   * @return convertedCurrency
   */
  @javax.annotation.Nullable
  public String getConvertedCurrency() {
    return convertedCurrency;
  }

  public void setConvertedCurrency(String convertedCurrency) {
    this.convertedCurrency = convertedCurrency;
  }


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public CurrencyBoxSerpElementItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time when the result was published
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public static final String SERIALIZED_NAME_TABLE = "table";
  @SerializedName(SERIALIZED_NAME_TABLE)
  private Table table;

  public CurrencyBoxSerpElementItem table(Table table) {
    this.table = table;
    return this;
  }

  /**
   * table present in the element
* the header and content of the table present in the element
   * @return table
   */
  @javax.annotation.Nullable
  public Table getTable() {
    return table;
  }

  public void setTable(Table table) {
    this.table = table;
  }


  public static final String SERIALIZED_NAME_GRAPH = "graph";
  @SerializedName(SERIALIZED_NAME_GRAPH)
  private Graph graph;

  public CurrencyBoxSerpElementItem graph(Graph graph) {
    this.graph = graph;
    return this;
  }

  /**
   * contains data provided in the graph of the element
   * @return graph
   */
  @javax.annotation.Nullable
  public Graph getGraph() {
    return graph;
  }

  public void setGraph(Graph graph) {
    this.graph = graph;
  }



  public CurrencyBoxSerpElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public CurrencyBoxSerpElementItem putAdditionalProperty(String key, Object value) {
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


    
    CurrencyBoxSerpElementItem currencyBoxSerpElementItem = (CurrencyBoxSerpElementItem) o;
    return

        Objects.equals(this.rankGroup, currencyBoxSerpElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, currencyBoxSerpElementItem.rankAbsolute) &&
        Objects.equals(this.value, currencyBoxSerpElementItem.value) &&
        Objects.equals(this.convertedValue, currencyBoxSerpElementItem.convertedValue) &&
        Objects.equals(this.currency, currencyBoxSerpElementItem.currency) &&
        Objects.equals(this.convertedCurrency, currencyBoxSerpElementItem.convertedCurrency) &&
        Objects.equals(this.timestamp, currencyBoxSerpElementItem.timestamp) &&
        Objects.equals(this.table, currencyBoxSerpElementItem.table) &&
        Objects.equals(this.graph, currencyBoxSerpElementItem.graph) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(rankGroup, rankAbsolute, value, convertedValue, currency, convertedCurrency, timestamp, table, graph);
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

    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    convertedValue: ").append(toIndentedString(convertedValue)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    convertedCurrency: ").append(toIndentedString(convertedCurrency)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("position");
    openapiFields.add("xpath");
    openapiFields.add("rectangle");
    
    openapiFields.add("rank_group");
    
    openapiFields.add("rank_absolute");
    
    openapiFields.add("value");
    
    openapiFields.add("converted_value");
    
    openapiFields.add("currency");
    
    openapiFields.add("converted_currency");
    
    openapiFields.add("timestamp");
    
    openapiFields.add("table");
    
    openapiFields.add("graph");
    

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
           public CurrencyBoxSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CurrencyBoxSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static CurrencyBoxSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurrencyBoxSerpElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
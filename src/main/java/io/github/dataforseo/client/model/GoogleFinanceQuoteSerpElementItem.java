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


package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.dataforseo.client.model.BaseGoogleFinanceSerpElementItem;
import io.github.dataforseo.client.model.GraphItems;
import java.io.IOException;
import java.math.BigDecimal;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.dataforseo.client.JSON;

/**
 * GoogleFinanceQuoteSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class GoogleFinanceQuoteSerpElementItem extends BaseGoogleFinanceSerpElementItem {
  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private BigDecimal rankGroup;

  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private BigDecimal rankAbsolute;

  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  private BaseGoogleFinanceSerpElementItem quote;

  public static final String SERIALIZED_NAME_GRAPH_ITEMS = "graph_items";
  @SerializedName(SERIALIZED_NAME_GRAPH_ITEMS)
  private List<GraphItems> graphItems;

  public GoogleFinanceQuoteSerpElementItem() {
  }

  public GoogleFinanceQuoteSerpElementItem rankGroup(BigDecimal rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group
   * @return rankGroup
   */
  @javax.annotation.Nullable
  public BigDecimal getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(BigDecimal rankGroup) {
    this.rankGroup = rankGroup;
  }


  public GoogleFinanceQuoteSerpElementItem rankAbsolute(BigDecimal rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP absolute position among all the elements in SERP
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public BigDecimal getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(BigDecimal rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public GoogleFinanceQuoteSerpElementItem quote(BaseGoogleFinanceSerpElementItem quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
   */
  @javax.annotation.Nullable
  public BaseGoogleFinanceSerpElementItem getQuote() {
    return quote;
  }

  public void setQuote(BaseGoogleFinanceSerpElementItem quote) {
    this.quote = quote;
  }


  public GoogleFinanceQuoteSerpElementItem graphItems(List<GraphItems> graphItems) {
    this.graphItems = graphItems;
    return this;
  }

  public GoogleFinanceQuoteSerpElementItem addGraphItemsItem(GraphItems graphItemsItem) {
    if (this.graphItems == null) {
      this.graphItems = new ArrayList<>();
    }
    this.graphItems.add(graphItemsItem);
    return this;
  }

  /**
   * values on graph
   * @return graphItems
   */
  @javax.annotation.Nullable
  public List<GraphItems> getGraphItems() {
    return graphItems;
  }

  public void setGraphItems(List<GraphItems> graphItems) {
    this.graphItems = graphItems;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the GoogleFinanceQuoteSerpElementItem instance itself
   */
  public GoogleFinanceQuoteSerpElementItem putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    GoogleFinanceQuoteSerpElementItem googleFinanceQuoteSerpElementItem = (GoogleFinanceQuoteSerpElementItem) o;
    return Objects.equals(this.rankGroup, googleFinanceQuoteSerpElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, googleFinanceQuoteSerpElementItem.rankAbsolute) &&
        Objects.equals(this.quote, googleFinanceQuoteSerpElementItem.quote) &&
        Objects.equals(this.graphItems, googleFinanceQuoteSerpElementItem.graphItems)&&
        Objects.equals(this.additionalProperties, googleFinanceQuoteSerpElementItem.additionalProperties) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankGroup, rankAbsolute, quote, graphItems, super.hashCode(), additionalProperties);
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
    sb.append("class GoogleFinanceQuoteSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    graphItems: ").append(toIndentedString(graphItems)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("quote");
    openapiFields.add("graph_items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleFinanceQuoteSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleFinanceQuoteSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleFinanceQuoteSerpElementItem is not found in the empty JSON string", GoogleFinanceQuoteSerpElementItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `quote`
      if (jsonObj.get("quote") != null && !jsonObj.get("quote").isJsonNull()) {
        BaseGoogleFinanceSerpElementItem.validateJsonElement(jsonObj.get("quote"));
      }
      if (jsonObj.get("graph_items") != null && !jsonObj.get("graph_items").isJsonNull()) {
        JsonArray jsonArraygraphItems = jsonObj.getAsJsonArray("graph_items");
        if (jsonArraygraphItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("graph_items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `graph_items` to be an array in the JSON string but got `%s`", jsonObj.get("graph_items").toString()));
          }

          // validate the optional field `graph_items` (array)
          for (int i = 0; i < jsonArraygraphItems.size(); i++) {
            GraphItems.validateJsonElement(jsonArraygraphItems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleFinanceQuoteSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleFinanceQuoteSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleFinanceQuoteSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleFinanceQuoteSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleFinanceQuoteSerpElementItem>() {
           @Override
           public void write(JsonWriter out, GoogleFinanceQuoteSerpElementItem value) throws IOException {
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
           public GoogleFinanceQuoteSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleFinanceQuoteSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of GoogleFinanceQuoteSerpElementItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleFinanceQuoteSerpElementItem
   * @throws IOException if the JSON string is invalid with respect to GoogleFinanceQuoteSerpElementItem
   */
  public static GoogleFinanceQuoteSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleFinanceQuoteSerpElementItem.class);
  }

  /**
   * Convert an instance of GoogleFinanceQuoteSerpElementItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import io.github.dataforseo.client.model.HotelPriceItemInfo;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.dataforseo.client.JSON;

/**
 * HotelPriceInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class HotelPriceInfo {
  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_PRICE_WITHOUT_DISCOUNT = "price_without_discount";
  @SerializedName(SERIALIZED_NAME_PRICE_WITHOUT_DISCOUNT)
  private Long priceWithoutDiscount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DISCOUNT_TEXT = "discount_text";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TEXT)
  private String discountText;

  public static final String SERIALIZED_NAME_CHECK_IN = "check_in";
  @SerializedName(SERIALIZED_NAME_CHECK_IN)
  private String checkIn;

  public static final String SERIALIZED_NAME_CHECK_OUT = "check_out";
  @SerializedName(SERIALIZED_NAME_CHECK_OUT)
  private String checkOut;

  public static final String SERIALIZED_NAME_VISITORS = "visitors";
  @SerializedName(SERIALIZED_NAME_VISITORS)
  private Integer visitors;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<HotelPriceItemInfo> items;

  public HotelPriceInfo() {
  }

  public HotelPriceInfo price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * price per night
   * @return price
   */
  @javax.annotation.Nullable
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }


  public HotelPriceInfo priceWithoutDiscount(Long priceWithoutDiscount) {
    this.priceWithoutDiscount = priceWithoutDiscount;
    return this;
  }

  /**
   * full price per night without a discount applied
   * @return priceWithoutDiscount
   */
  @javax.annotation.Nullable
  public Long getPriceWithoutDiscount() {
    return priceWithoutDiscount;
  }

  public void setPriceWithoutDiscount(Long priceWithoutDiscount) {
    this.priceWithoutDiscount = priceWithoutDiscount;
  }


  public HotelPriceInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * price currency USD is applied by default, unless specified in the POST array
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public HotelPriceInfo discountText(String discountText) {
    this.discountText = discountText;
    return this;
  }

  /**
   * text about a discount applied
   * @return discountText
   */
  @javax.annotation.Nullable
  public String getDiscountText() {
    return discountText;
  }

  public void setDiscountText(String discountText) {
    this.discountText = discountText;
  }


  public HotelPriceInfo checkIn(String checkIn) {
    this.checkIn = checkIn;
    return this;
  }

  /**
   * check-in date and time in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return checkIn
   */
  @javax.annotation.Nullable
  public String getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(String checkIn) {
    this.checkIn = checkIn;
  }


  public HotelPriceInfo checkOut(String checkOut) {
    this.checkOut = checkOut;
    return this;
  }

  /**
   * check-out date and time in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return checkOut
   */
  @javax.annotation.Nullable
  public String getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(String checkOut) {
    this.checkOut = checkOut;
  }


  public HotelPriceInfo visitors(Integer visitors) {
    this.visitors = visitors;
    return this;
  }

  /**
   * number of hotel visitors for this price
   * @return visitors
   */
  @javax.annotation.Nullable
  public Integer getVisitors() {
    return visitors;
  }

  public void setVisitors(Integer visitors) {
    this.visitors = visitors;
  }


  public HotelPriceInfo items(List<HotelPriceItemInfo> items) {
    this.items = items;
    return this;
  }

  public HotelPriceInfo addItemsItem(HotelPriceItemInfo itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * encountered item types types of search engine results encountered in the items array; possible item types: hotel_search_item
   * @return items
   */
  @javax.annotation.Nullable
  public List<HotelPriceItemInfo> getItems() {
    return items;
  }

  public void setItems(List<HotelPriceItemInfo> items) {
    this.items = items;
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
   * @return the HotelPriceInfo instance itself
   */
  public HotelPriceInfo putAdditionalProperty(String key, Object value) {
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
    HotelPriceInfo hotelPriceInfo = (HotelPriceInfo) o;
    return Objects.equals(this.price, hotelPriceInfo.price) &&
        Objects.equals(this.priceWithoutDiscount, hotelPriceInfo.priceWithoutDiscount) &&
        Objects.equals(this.currency, hotelPriceInfo.currency) &&
        Objects.equals(this.discountText, hotelPriceInfo.discountText) &&
        Objects.equals(this.checkIn, hotelPriceInfo.checkIn) &&
        Objects.equals(this.checkOut, hotelPriceInfo.checkOut) &&
        Objects.equals(this.visitors, hotelPriceInfo.visitors) &&
        Objects.equals(this.items, hotelPriceInfo.items)&&
        Objects.equals(this.additionalProperties, hotelPriceInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, priceWithoutDiscount, currency, discountText, checkIn, checkOut, visitors, items, additionalProperties);
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
    sb.append("class HotelPriceInfo {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceWithoutDiscount: ").append(toIndentedString(priceWithoutDiscount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discountText: ").append(toIndentedString(discountText)).append("\n");
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
    sb.append("    checkOut: ").append(toIndentedString(checkOut)).append("\n");
    sb.append("    visitors: ").append(toIndentedString(visitors)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("price");
    openapiFields.add("price_without_discount");
    openapiFields.add("currency");
    openapiFields.add("discount_text");
    openapiFields.add("check_in");
    openapiFields.add("check_out");
    openapiFields.add("visitors");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HotelPriceInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HotelPriceInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HotelPriceInfo is not found in the empty JSON string", HotelPriceInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("discount_text") != null && !jsonObj.get("discount_text").isJsonNull()) && !jsonObj.get("discount_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_text").toString()));
      }
      if ((jsonObj.get("check_in") != null && !jsonObj.get("check_in").isJsonNull()) && !jsonObj.get("check_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_in").toString()));
      }
      if ((jsonObj.get("check_out") != null && !jsonObj.get("check_out").isJsonNull()) && !jsonObj.get("check_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_out").toString()));
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
            HotelPriceItemInfo.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelPriceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelPriceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelPriceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelPriceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelPriceInfo>() {
           @Override
           public void write(JsonWriter out, HotelPriceInfo value) throws IOException {
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
           public HotelPriceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             HotelPriceInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of HotelPriceInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HotelPriceInfo
   * @throws IOException if the JSON string is invalid with respect to HotelPriceInfo
   */
  public static HotelPriceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelPriceInfo.class);
  }

  /**
   * Convert an instance of HotelPriceInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

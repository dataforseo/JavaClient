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



public class HotelPriceInfo  {


  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public HotelPriceInfo price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * price per night
   * @return price
   */
  @javax.annotation.Nullable
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public static final String SERIALIZED_NAME_PRICE_WITHOUT_DISCOUNT = "price_without_discount";
  @SerializedName(SERIALIZED_NAME_PRICE_WITHOUT_DISCOUNT)
  private Double priceWithoutDiscount;

  public HotelPriceInfo priceWithoutDiscount(Double priceWithoutDiscount) {
    this.priceWithoutDiscount = priceWithoutDiscount;
    return this;
  }

  /**
   * full price per night without a discount applied
   * @return priceWithoutDiscount
   */
  @javax.annotation.Nullable
  public Double getPriceWithoutDiscount() {
    return priceWithoutDiscount;
  }

  public void setPriceWithoutDiscount(Double priceWithoutDiscount) {
    this.priceWithoutDiscount = priceWithoutDiscount;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public HotelPriceInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * price currency
* USD is applied by default, unless specified in the POST array
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public static final String SERIALIZED_NAME_DISCOUNT_TEXT = "discount_text";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TEXT)
  private String discountText;

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


  public static final String SERIALIZED_NAME_CHECK_IN = "check_in";
  @SerializedName(SERIALIZED_NAME_CHECK_IN)
  private String checkIn;

  public HotelPriceInfo checkIn(String checkIn) {
    this.checkIn = checkIn;
    return this;
  }

  /**
   * check-in date and time
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return checkIn
   */
  @javax.annotation.Nullable
  public String getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(String checkIn) {
    this.checkIn = checkIn;
  }


  public static final String SERIALIZED_NAME_CHECK_OUT = "check_out";
  @SerializedName(SERIALIZED_NAME_CHECK_OUT)
  private String checkOut;

  public HotelPriceInfo checkOut(String checkOut) {
    this.checkOut = checkOut;
    return this;
  }

  /**
   * check-out date and time
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return checkOut
   */
  @javax.annotation.Nullable
  public String getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(String checkOut) {
    this.checkOut = checkOut;
  }


  public static final String SERIALIZED_NAME_VISITORS = "visitors";
  @SerializedName(SERIALIZED_NAME_VISITORS)
  private Integer visitors;

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


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<HotelPriceItemInfo> items;

  public HotelPriceInfo items(List<HotelPriceItemInfo> items) {
    this.items = items;
    return this;
  }

  /**
   * encountered item types
* types of search engine results encountered in the items array;
* possible item types: hotel_search_item
   * @return items
   */
  @javax.annotation.Nullable
  public List<HotelPriceItemInfo> getItems() {
    return items;
  }

  public void setItems(List<HotelPriceItemInfo> items) {
    this.items = items;
  }


  public static final String SERIALIZED_NAME_PRICES_BY_DATES = "prices_by_dates";
  @SerializedName(SERIALIZED_NAME_PRICES_BY_DATES)
  private List<PricesByDates> pricesByDates;

  public HotelPriceInfo pricesByDates(List<PricesByDates> pricesByDates) {
    this.pricesByDates = pricesByDates;
    return this;
  }

  /**
   * 
   * @return pricesByDates
   */
  @javax.annotation.Nullable
  public List<PricesByDates> getPricesByDates() {
    return pricesByDates;
  }

  public void setPricesByDates(List<PricesByDates> pricesByDates) {
    this.pricesByDates = pricesByDates;
  }



  public HotelPriceInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public HotelPriceInfo putAdditionalProperty(String key, Object value) {
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


    
    HotelPriceInfo hotelPriceInfo = (HotelPriceInfo) o;
    return

        Objects.equals(this.price, hotelPriceInfo.price) &&
        Objects.equals(this.priceWithoutDiscount, hotelPriceInfo.priceWithoutDiscount) &&
        Objects.equals(this.currency, hotelPriceInfo.currency) &&
        Objects.equals(this.discountText, hotelPriceInfo.discountText) &&
        Objects.equals(this.checkIn, hotelPriceInfo.checkIn) &&
        Objects.equals(this.checkOut, hotelPriceInfo.checkOut) &&
        Objects.equals(this.visitors, hotelPriceInfo.visitors) &&
        Objects.equals(this.items, hotelPriceInfo.items) &&
        Objects.equals(this.pricesByDates, hotelPriceInfo.pricesByDates);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(price, priceWithoutDiscount, currency, discountText, checkIn, checkOut, visitors, items, pricesByDates);
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
    sb.append("    pricesByDates: ").append(toIndentedString(pricesByDates)).append("\n");
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
    
    openapiFields.add("prices_by_dates");
    

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


  public static HotelPriceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelPriceInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
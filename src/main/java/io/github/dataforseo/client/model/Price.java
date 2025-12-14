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



public class Price  {


  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private Double current;

  public Price current(Double current) {
    this.current = current;
    return this;
  }

  /**
   * current price
* indicates the current price of the product or service featured in the result
   * @return current
   */
  @javax.annotation.Nullable
  public Double getCurrent() {
    return current;
  }

  public void setCurrent(Double current) {
    this.current = current;
  }


  public static final String SERIALIZED_NAME_REGULAR = "regular";
  @SerializedName(SERIALIZED_NAME_REGULAR)
  private Double regular;

  public Price regular(Double regular) {
    this.regular = regular;
    return this;
  }

  /**
   * regular price
* indicates the regular price of the product or service with no discounts applied
   * @return regular
   */
  @javax.annotation.Nullable
  public Double getRegular() {
    return regular;
  }

  public void setRegular(Double regular) {
    this.regular = regular;
  }


  public static final String SERIALIZED_NAME_MAX_VALUE = "max_value";
  @SerializedName(SERIALIZED_NAME_MAX_VALUE)
  private Double maxValue;

  public Price maxValue(Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * the maximum price
* the maximum price of the product or service as indicated in the result
   * @return maxValue
   */
  @javax.annotation.Nullable
  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public Price currency(String currency) {
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


  public static final String SERIALIZED_NAME_IS_PRICE_RANGE = "is_price_range";
  @SerializedName(SERIALIZED_NAME_IS_PRICE_RANGE)
  private Boolean isPriceRange;

  public Price isPriceRange(Boolean isPriceRange) {
    this.isPriceRange = isPriceRange;
    return this;
  }

  /**
   * price is provided as a range
* indicates whether a price is provided in a range
   * @return isPriceRange
   */
  @javax.annotation.Nullable
  public Boolean getIsPriceRange() {
    return isPriceRange;
  }

  public void setIsPriceRange(Boolean isPriceRange) {
    this.isPriceRange = isPriceRange;
  }


  public static final String SERIALIZED_NAME_DISPLAYED_PRICE = "displayed_price";
  @SerializedName(SERIALIZED_NAME_DISPLAYED_PRICE)
  private String displayedPrice;

  public Price displayedPrice(String displayedPrice) {
    this.displayedPrice = displayedPrice;
    return this;
  }

  /**
   * price string in the result
* raw price string as provided in the result
   * @return displayedPrice
   */
  @javax.annotation.Nullable
  public String getDisplayedPrice() {
    return displayedPrice;
  }

  public void setDisplayedPrice(String displayedPrice) {
    this.displayedPrice = displayedPrice;
  }



  public Price() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public Price putAdditionalProperty(String key, Object value) {
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


    
    Price price = (Price) o;
    return

        Objects.equals(this.current, price.current) &&
        Objects.equals(this.regular, price.regular) &&
        Objects.equals(this.maxValue, price.maxValue) &&
        Objects.equals(this.currency, price.currency) &&
        Objects.equals(this.isPriceRange, price.isPriceRange) &&
        Objects.equals(this.displayedPrice, price.displayedPrice);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(current, regular, maxValue, currency, isPriceRange, displayedPrice);
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
    sb.append("class Price {\n");

    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    regular: ").append(toIndentedString(regular)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isPriceRange: ").append(toIndentedString(isPriceRange)).append("\n");
    sb.append("    displayedPrice: ").append(toIndentedString(displayedPrice)).append("\n");
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
    
    openapiFields.add("current");
    
    openapiFields.add("regular");
    
    openapiFields.add("max_value");
    
    openapiFields.add("currency");
    
    openapiFields.add("is_price_range");
    
    openapiFields.add("displayed_price");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Price
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Price.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Price' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Price> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Price.class));

       return (TypeAdapter<T>) new TypeAdapter<Price>() {
           @Override
           public void write(JsonWriter out, Price value) throws IOException {
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
           public Price read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Price instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static Price fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Price.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
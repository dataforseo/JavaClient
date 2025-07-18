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



public class GoogleFinanceFuturesChainElement  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GoogleFinanceFuturesChainElement type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of element
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public static final String SERIALIZED_NAME_EXPIRATION_TIMESTAMP = "expiration_timestamp";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIMESTAMP)
  private String expirationTimestamp;

  public GoogleFinanceFuturesChainElement expirationTimestamp(String expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
    return this;
  }

  /**
   * futures’ date and time of expiration
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2025-02-10 09:40:00 +00:00
   * @return expirationTimestamp
   */
  @javax.annotation.Nullable
  public String getExpirationTimestamp() {
    return expirationTimestamp;
  }

  public void setExpirationTimestamp(String expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
  }


  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public GoogleFinanceFuturesChainElement symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * futures’ symbol
   * @return symbol
   */
  @javax.annotation.Nullable
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public GoogleFinanceFuturesChainElement price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * price of the market instrument
* price of the market instrument at a given timestamp
   * @return price
   */
  @javax.annotation.Nullable
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public static final String SERIALIZED_NAME_PRICE_CURRENCY = "price_currency";
  @SerializedName(SERIALIZED_NAME_PRICE_CURRENCY)
  private String priceCurrency;

  public GoogleFinanceFuturesChainElement priceCurrency(String priceCurrency) {
    this.priceCurrency = priceCurrency;
    return this;
  }

  /**
   * currency of the price value
   * @return priceCurrency
   */
  @javax.annotation.Nullable
  public String getPriceCurrency() {
    return priceCurrency;
  }

  public void setPriceCurrency(String priceCurrency) {
    this.priceCurrency = priceCurrency;
  }


  public static final String SERIALIZED_NAME_PRICE_DELTA = "price_delta";
  @SerializedName(SERIALIZED_NAME_PRICE_DELTA)
  private Double priceDelta;

  public GoogleFinanceFuturesChainElement priceDelta(Double priceDelta) {
    this.priceDelta = priceDelta;
    return this;
  }

  /**
   * change in price of the market instrument
* change in price at a given timestamp
   * @return priceDelta
   */
  @javax.annotation.Nullable
  public Double getPriceDelta() {
    return priceDelta;
  }

  public void setPriceDelta(Double priceDelta) {
    this.priceDelta = priceDelta;
  }


  public static final String SERIALIZED_NAME_PERCENTAGE_DELTA = "percentage_delta";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_DELTA)
  private Double percentageDelta;

  public GoogleFinanceFuturesChainElement percentageDelta(Double percentageDelta) {
    this.percentageDelta = percentageDelta;
    return this;
  }

  /**
   * percentage of change in value of the market index
   * @return percentageDelta
   */
  @javax.annotation.Nullable
  public Double getPercentageDelta() {
    return percentageDelta;
  }

  public void setPercentageDelta(Double percentageDelta) {
    this.percentageDelta = percentageDelta;
  }


  public static final String SERIALIZED_NAME_TREND = "trend";
  @SerializedName(SERIALIZED_NAME_TREND)
  private String trend;

  public GoogleFinanceFuturesChainElement trend(String trend) {
    this.trend = trend;
    return this;
  }

  /**
   * growth trend of the market index
* possible values: up, down, stable
   * @return trend
   */
  @javax.annotation.Nullable
  public String getTrend() {
    return trend;
  }

  public void setTrend(String trend) {
    this.trend = trend;
  }



  public GoogleFinanceFuturesChainElement() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public GoogleFinanceFuturesChainElement putAdditionalProperty(String key, Object value) {
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


    
    GoogleFinanceFuturesChainElement googleFinanceFuturesChainElement = (GoogleFinanceFuturesChainElement) o;
    return

        Objects.equals(this.type, googleFinanceFuturesChainElement.type) &&
        Objects.equals(this.expirationTimestamp, googleFinanceFuturesChainElement.expirationTimestamp) &&
        Objects.equals(this.symbol, googleFinanceFuturesChainElement.symbol) &&
        Objects.equals(this.price, googleFinanceFuturesChainElement.price) &&
        Objects.equals(this.priceCurrency, googleFinanceFuturesChainElement.priceCurrency) &&
        Objects.equals(this.priceDelta, googleFinanceFuturesChainElement.priceDelta) &&
        Objects.equals(this.percentageDelta, googleFinanceFuturesChainElement.percentageDelta) &&
        Objects.equals(this.trend, googleFinanceFuturesChainElement.trend);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, expirationTimestamp, symbol, price, priceCurrency, priceDelta, percentageDelta, trend);
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
    sb.append("class GoogleFinanceFuturesChainElement {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceCurrency: ").append(toIndentedString(priceCurrency)).append("\n");
    sb.append("    priceDelta: ").append(toIndentedString(priceDelta)).append("\n");
    sb.append("    percentageDelta: ").append(toIndentedString(percentageDelta)).append("\n");
    sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
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
    
    openapiFields.add("expiration_timestamp");
    
    openapiFields.add("symbol");
    
    openapiFields.add("price");
    
    openapiFields.add("price_currency");
    
    openapiFields.add("price_delta");
    
    openapiFields.add("percentage_delta");
    
    openapiFields.add("trend");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleFinanceFuturesChainElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleFinanceFuturesChainElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleFinanceFuturesChainElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleFinanceFuturesChainElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleFinanceFuturesChainElement.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleFinanceFuturesChainElement>() {
           @Override
           public void write(JsonWriter out, GoogleFinanceFuturesChainElement value) throws IOException {
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
           public GoogleFinanceFuturesChainElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleFinanceFuturesChainElement instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static GoogleFinanceFuturesChainElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleFinanceFuturesChainElement.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
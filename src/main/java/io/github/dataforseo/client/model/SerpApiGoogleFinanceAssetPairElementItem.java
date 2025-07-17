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



public class SerpApiGoogleFinanceAssetPairElementItem  extends BaseSerpApiGoogleFinanceTickerSearchElementItem  {


  public static final String SERIALIZED_NAME_BASE_SYMBOL = "base_symbol";
  @SerializedName(SERIALIZED_NAME_BASE_SYMBOL)
  private String baseSymbol;

  public SerpApiGoogleFinanceAssetPairElementItem baseSymbol(String baseSymbol) {
    this.baseSymbol = baseSymbol;
    return this;
  }

  /**
   * identifier of the base asset in a pair
* example: EUR
   * @return baseSymbol
   */
  @javax.annotation.Nullable
  public String getBaseSymbol() {
    return baseSymbol;
  }

  public void setBaseSymbol(String baseSymbol) {
    this.baseSymbol = baseSymbol;
  }


  public static final String SERIALIZED_NAME_QUOTE_SYMBOL = "quote_symbol";
  @SerializedName(SERIALIZED_NAME_QUOTE_SYMBOL)
  private String quoteSymbol;

  public SerpApiGoogleFinanceAssetPairElementItem quoteSymbol(String quoteSymbol) {
    this.quoteSymbol = quoteSymbol;
    return this;
  }

  /**
   * identifier of the quote asset in a pair
* example: USD
   * @return quoteSymbol
   */
  @javax.annotation.Nullable
  public String getQuoteSymbol() {
    return quoteSymbol;
  }

  public void setQuoteSymbol(String quoteSymbol) {
    this.quoteSymbol = quoteSymbol;
  }


  public static final String SERIALIZED_NAME_BASE_DISPLAY_NAME = "base_display_name";
  @SerializedName(SERIALIZED_NAME_BASE_DISPLAY_NAME)
  private String baseDisplayName;

  public SerpApiGoogleFinanceAssetPairElementItem baseDisplayName(String baseDisplayName) {
    this.baseDisplayName = baseDisplayName;
    return this;
  }

  /**
   * full name of the base asset in a pair
* example: Euro
   * @return baseDisplayName
   */
  @javax.annotation.Nullable
  public String getBaseDisplayName() {
    return baseDisplayName;
  }

  public void setBaseDisplayName(String baseDisplayName) {
    this.baseDisplayName = baseDisplayName;
  }


  public static final String SERIALIZED_NAME_QUOTE_DISPLAY_NAME = "quote_display_name";
  @SerializedName(SERIALIZED_NAME_QUOTE_DISPLAY_NAME)
  private String quoteDisplayName;

  public SerpApiGoogleFinanceAssetPairElementItem quoteDisplayName(String quoteDisplayName) {
    this.quoteDisplayName = quoteDisplayName;
    return this;
  }

  /**
   * full name of the base asset in a pair
* example: Euro
   * @return quoteDisplayName
   */
  @javax.annotation.Nullable
  public String getQuoteDisplayName() {
    return quoteDisplayName;
  }

  public void setQuoteDisplayName(String quoteDisplayName) {
    this.quoteDisplayName = quoteDisplayName;
  }


  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public SerpApiGoogleFinanceAssetPairElementItem price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * value of the base asset compared to the quote asset
   * @return price
   */
  @javax.annotation.Nullable
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public static final String SERIALIZED_NAME_PRICE_DELTA = "price_delta";
  @SerializedName(SERIALIZED_NAME_PRICE_DELTA)
  private Double priceDelta;

  public SerpApiGoogleFinanceAssetPairElementItem priceDelta(Double priceDelta) {
    this.priceDelta = priceDelta;
    return this;
  }

  /**
   * change in price
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



  public SerpApiGoogleFinanceAssetPairElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpApiGoogleFinanceAssetPairElementItem putAdditionalProperty(String key, Object value) {
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


    
    SerpApiGoogleFinanceAssetPairElementItem serpApiGoogleFinanceAssetPairElementItem = (SerpApiGoogleFinanceAssetPairElementItem) o;
    return

        Objects.equals(this.baseSymbol, serpApiGoogleFinanceAssetPairElementItem.baseSymbol) &&
        Objects.equals(this.quoteSymbol, serpApiGoogleFinanceAssetPairElementItem.quoteSymbol) &&
        Objects.equals(this.baseDisplayName, serpApiGoogleFinanceAssetPairElementItem.baseDisplayName) &&
        Objects.equals(this.quoteDisplayName, serpApiGoogleFinanceAssetPairElementItem.quoteDisplayName) &&
        Objects.equals(this.price, serpApiGoogleFinanceAssetPairElementItem.price) &&
        Objects.equals(this.priceDelta, serpApiGoogleFinanceAssetPairElementItem.priceDelta) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(baseSymbol, quoteSymbol, baseDisplayName, quoteDisplayName, price, priceDelta);
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
    sb.append("class SerpApiGoogleFinanceAssetPairElementItem {\n");

    sb.append("    baseSymbol: ").append(toIndentedString(baseSymbol)).append("\n");
    sb.append("    quoteSymbol: ").append(toIndentedString(quoteSymbol)).append("\n");
    sb.append("    baseDisplayName: ").append(toIndentedString(baseDisplayName)).append("\n");
    sb.append("    quoteDisplayName: ").append(toIndentedString(quoteDisplayName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceDelta: ").append(toIndentedString(priceDelta)).append("\n");
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
    openapiFields.add("identifier");
    openapiFields.add("displayed_name");
    openapiFields.add("url");
    openapiFields.add("location");
    openapiFields.add("trend");
    openapiFields.add("timestamp");
    openapiFields.add("percentage_delta");
    
    openapiFields.add("base_symbol");
    
    openapiFields.add("quote_symbol");
    
    openapiFields.add("base_display_name");
    
    openapiFields.add("quote_display_name");
    
    openapiFields.add("price");
    
    openapiFields.add("price_delta");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpApiGoogleFinanceAssetPairElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpApiGoogleFinanceAssetPairElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpApiGoogleFinanceAssetPairElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpApiGoogleFinanceAssetPairElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpApiGoogleFinanceAssetPairElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpApiGoogleFinanceAssetPairElementItem>() {
           @Override
           public void write(JsonWriter out, SerpApiGoogleFinanceAssetPairElementItem value) throws IOException {
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
           public SerpApiGoogleFinanceAssetPairElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpApiGoogleFinanceAssetPairElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpApiGoogleFinanceAssetPairElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpApiGoogleFinanceAssetPairElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
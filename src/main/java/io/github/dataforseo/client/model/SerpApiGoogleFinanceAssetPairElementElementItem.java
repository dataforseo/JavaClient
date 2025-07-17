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



public class SerpApiGoogleFinanceAssetPairElementElementItem  extends BaseSerpApiGoogleFinanceElementItem  {


  public static final String SERIALIZED_NAME_BASE_SYMBOL = "base_symbol";
  @SerializedName(SERIALIZED_NAME_BASE_SYMBOL)
  private String baseSymbol;

  public SerpApiGoogleFinanceAssetPairElementElementItem baseSymbol(String baseSymbol) {
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

  public SerpApiGoogleFinanceAssetPairElementElementItem quoteSymbol(String quoteSymbol) {
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

  public SerpApiGoogleFinanceAssetPairElementElementItem baseDisplayName(String baseDisplayName) {
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

  public SerpApiGoogleFinanceAssetPairElementElementItem quoteDisplayName(String quoteDisplayName) {
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

  public SerpApiGoogleFinanceAssetPairElementElementItem price(Double price) {
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

  public SerpApiGoogleFinanceAssetPairElementElementItem priceDelta(Double priceDelta) {
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


  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public SerpApiGoogleFinanceAssetPairElementElementItem identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * identifier of the element
* full identifier of the element that consists from ticker and market_identifier
* example: PX1:INDEXDB
   * @return identifier
   */
  @javax.annotation.Nullable
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public static final String SERIALIZED_NAME_DISPLAYED_NAME = "displayed_name";
  @SerializedName(SERIALIZED_NAME_DISPLAYED_NAME)
  private String displayedName;

  public SerpApiGoogleFinanceAssetPairElementElementItem displayedName(String displayedName) {
    this.displayedName = displayedName;
    return this;
  }

  /**
   * name of the market index as displayed on Google Finance
* example: CAC 40
   * @return displayedName
   */
  @javax.annotation.Nullable
  public String getDisplayedName() {
    return displayedName;
  }

  public void setDisplayedName(String displayedName) {
    this.displayedName = displayedName;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public SerpApiGoogleFinanceAssetPairElementElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to the page of the market index on Google Finance
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public SerpApiGoogleFinanceAssetPairElementElementItem location(String location) {
    this.location = location;
    return this;
  }

  /**
   * location of the market index
* example: Europe/Paris
   * @return location
   */
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public static final String SERIALIZED_NAME_TREND = "trend";
  @SerializedName(SERIALIZED_NAME_TREND)
  private String trend;

  public SerpApiGoogleFinanceAssetPairElementElementItem trend(String trend) {
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


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public SerpApiGoogleFinanceAssetPairElementElementItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time of the value readout
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2025-02-10 09:40:00 +00:00
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public static final String SERIALIZED_NAME_PERCENTAGE_DELTA = "percentage_delta";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_DELTA)
  private Double percentageDelta;

  public SerpApiGoogleFinanceAssetPairElementElementItem percentageDelta(Double percentageDelta) {
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



  public SerpApiGoogleFinanceAssetPairElementElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpApiGoogleFinanceAssetPairElementElementItem putAdditionalProperty(String key, Object value) {
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


    
    SerpApiGoogleFinanceAssetPairElementElementItem serpApiGoogleFinanceAssetPairElementElementItem = (SerpApiGoogleFinanceAssetPairElementElementItem) o;
    return

        Objects.equals(this.baseSymbol, serpApiGoogleFinanceAssetPairElementElementItem.baseSymbol) &&
        Objects.equals(this.quoteSymbol, serpApiGoogleFinanceAssetPairElementElementItem.quoteSymbol) &&
        Objects.equals(this.baseDisplayName, serpApiGoogleFinanceAssetPairElementElementItem.baseDisplayName) &&
        Objects.equals(this.quoteDisplayName, serpApiGoogleFinanceAssetPairElementElementItem.quoteDisplayName) &&
        Objects.equals(this.price, serpApiGoogleFinanceAssetPairElementElementItem.price) &&
        Objects.equals(this.priceDelta, serpApiGoogleFinanceAssetPairElementElementItem.priceDelta) &&
        Objects.equals(this.identifier, serpApiGoogleFinanceAssetPairElementElementItem.identifier) &&
        Objects.equals(this.displayedName, serpApiGoogleFinanceAssetPairElementElementItem.displayedName) &&
        Objects.equals(this.url, serpApiGoogleFinanceAssetPairElementElementItem.url) &&
        Objects.equals(this.location, serpApiGoogleFinanceAssetPairElementElementItem.location) &&
        Objects.equals(this.trend, serpApiGoogleFinanceAssetPairElementElementItem.trend) &&
        Objects.equals(this.timestamp, serpApiGoogleFinanceAssetPairElementElementItem.timestamp) &&
        Objects.equals(this.percentageDelta, serpApiGoogleFinanceAssetPairElementElementItem.percentageDelta) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(baseSymbol, quoteSymbol, baseDisplayName, quoteDisplayName, price, priceDelta, identifier, displayedName, url, location, trend, timestamp, percentageDelta);
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
    sb.append("class SerpApiGoogleFinanceAssetPairElementElementItem {\n");

    sb.append("    baseSymbol: ").append(toIndentedString(baseSymbol)).append("\n");
    sb.append("    quoteSymbol: ").append(toIndentedString(quoteSymbol)).append("\n");
    sb.append("    baseDisplayName: ").append(toIndentedString(baseDisplayName)).append("\n");
    sb.append("    quoteDisplayName: ").append(toIndentedString(quoteDisplayName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceDelta: ").append(toIndentedString(priceDelta)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    displayedName: ").append(toIndentedString(displayedName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    percentageDelta: ").append(toIndentedString(percentageDelta)).append("\n");
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
    
    openapiFields.add("base_symbol");
    
    openapiFields.add("quote_symbol");
    
    openapiFields.add("base_display_name");
    
    openapiFields.add("quote_display_name");
    
    openapiFields.add("price");
    
    openapiFields.add("price_delta");
    
    openapiFields.add("identifier");
    
    openapiFields.add("displayed_name");
    
    openapiFields.add("url");
    
    openapiFields.add("location");
    
    openapiFields.add("trend");
    
    openapiFields.add("timestamp");
    
    openapiFields.add("percentage_delta");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpApiGoogleFinanceAssetPairElementElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpApiGoogleFinanceAssetPairElementElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpApiGoogleFinanceAssetPairElementElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpApiGoogleFinanceAssetPairElementElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpApiGoogleFinanceAssetPairElementElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpApiGoogleFinanceAssetPairElementElementItem>() {
           @Override
           public void write(JsonWriter out, SerpApiGoogleFinanceAssetPairElementElementItem value) throws IOException {
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
           public SerpApiGoogleFinanceAssetPairElementElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpApiGoogleFinanceAssetPairElementElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpApiGoogleFinanceAssetPairElementElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpApiGoogleFinanceAssetPairElementElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
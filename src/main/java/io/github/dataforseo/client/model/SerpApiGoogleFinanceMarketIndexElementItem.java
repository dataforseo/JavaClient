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



public class SerpApiGoogleFinanceMarketIndexElementItem  extends BaseSerpApiGoogleFinanceTickerSearchElementItem  {


  public static final String SERIALIZED_NAME_TICKER = "ticker";
  @SerializedName(SERIALIZED_NAME_TICKER)
  private String ticker;

  public SerpApiGoogleFinanceMarketIndexElementItem ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

  /**
   * ticker of the market index
* example: DAX
   * @return ticker
   */
  @javax.annotation.Nullable
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  public static final String SERIALIZED_NAME_MARKET_IDENTIFIER = "market_identifier";
  @SerializedName(SERIALIZED_NAME_MARKET_IDENTIFIER)
  private String marketIdentifier;

  public SerpApiGoogleFinanceMarketIndexElementItem marketIdentifier(String marketIdentifier) {
    this.marketIdentifier = marketIdentifier;
    return this;
  }

  /**
   * market identifier
* example: INDEXDB
   * @return marketIdentifier
   */
  @javax.annotation.Nullable
  public String getMarketIdentifier() {
    return marketIdentifier;
  }

  public void setMarketIdentifier(String marketIdentifier) {
    this.marketIdentifier = marketIdentifier;
  }


  public static final String SERIALIZED_NAME_INDEX_VALUE = "index_value";
  @SerializedName(SERIALIZED_NAME_INDEX_VALUE)
  private Double indexValue;

  public SerpApiGoogleFinanceMarketIndexElementItem indexValue(Double indexValue) {
    this.indexValue = indexValue;
    return this;
  }

  /**
   * value of the market index
* numerical value of the index at a given timestamp
   * @return indexValue
   */
  @javax.annotation.Nullable
  public Double getIndexValue() {
    return indexValue;
  }

  public void setIndexValue(Double indexValue) {
    this.indexValue = indexValue;
  }


  public static final String SERIALIZED_NAME_INDEX_VALUE_DELTA = "index_value_delta";
  @SerializedName(SERIALIZED_NAME_INDEX_VALUE_DELTA)
  private Double indexValueDelta;

  public SerpApiGoogleFinanceMarketIndexElementItem indexValueDelta(Double indexValueDelta) {
    this.indexValueDelta = indexValueDelta;
    return this;
  }

  /**
   * change in value of the market index
* change in the index_value at a given timestamp
   * @return indexValueDelta
   */
  @javax.annotation.Nullable
  public Double getIndexValueDelta() {
    return indexValueDelta;
  }

  public void setIndexValueDelta(Double indexValueDelta) {
    this.indexValueDelta = indexValueDelta;
  }



  public SerpApiGoogleFinanceMarketIndexElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpApiGoogleFinanceMarketIndexElementItem putAdditionalProperty(String key, Object value) {
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


    
    SerpApiGoogleFinanceMarketIndexElementItem serpApiGoogleFinanceMarketIndexElementItem = (SerpApiGoogleFinanceMarketIndexElementItem) o;
    return

        Objects.equals(this.ticker, serpApiGoogleFinanceMarketIndexElementItem.ticker) &&
        Objects.equals(this.marketIdentifier, serpApiGoogleFinanceMarketIndexElementItem.marketIdentifier) &&
        Objects.equals(this.indexValue, serpApiGoogleFinanceMarketIndexElementItem.indexValue) &&
        Objects.equals(this.indexValueDelta, serpApiGoogleFinanceMarketIndexElementItem.indexValueDelta) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(ticker, marketIdentifier, indexValue, indexValueDelta);
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
    sb.append("class SerpApiGoogleFinanceMarketIndexElementItem {\n");

    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    marketIdentifier: ").append(toIndentedString(marketIdentifier)).append("\n");
    sb.append("    indexValue: ").append(toIndentedString(indexValue)).append("\n");
    sb.append("    indexValueDelta: ").append(toIndentedString(indexValueDelta)).append("\n");
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
    
    openapiFields.add("ticker");
    
    openapiFields.add("market_identifier");
    
    openapiFields.add("index_value");
    
    openapiFields.add("index_value_delta");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpApiGoogleFinanceMarketIndexElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpApiGoogleFinanceMarketIndexElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpApiGoogleFinanceMarketIndexElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpApiGoogleFinanceMarketIndexElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpApiGoogleFinanceMarketIndexElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpApiGoogleFinanceMarketIndexElementItem>() {
           @Override
           public void write(JsonWriter out, SerpApiGoogleFinanceMarketIndexElementItem value) throws IOException {
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
           public SerpApiGoogleFinanceMarketIndexElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpApiGoogleFinanceMarketIndexElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpApiGoogleFinanceMarketIndexElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpApiGoogleFinanceMarketIndexElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
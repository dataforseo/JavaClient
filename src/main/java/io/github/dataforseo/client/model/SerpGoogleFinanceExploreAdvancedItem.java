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



public class SerpGoogleFinanceExploreAdvancedItem  {


  public static final String SERIALIZED_NAME_MOST_ACTIVE = "most_active";
  @SerializedName(SERIALIZED_NAME_MOST_ACTIVE)
  private List<GoogleFinanceMarketTrendsElement> mostActive;

  public SerpGoogleFinanceExploreAdvancedItem mostActive(List<GoogleFinanceMarketTrendsElement> mostActive) {
    this.mostActive = mostActive;
    return this;
  }

  /**
   * array of items
* this array can take the following names: most_active, gainers, losers
   * @return mostActive
   */
  @javax.annotation.Nullable
  public List<GoogleFinanceMarketTrendsElement> getMostActive() {
    return mostActive;
  }

  public void setMostActive(List<GoogleFinanceMarketTrendsElement> mostActive) {
    this.mostActive = mostActive;
  }


  public static final String SERIALIZED_NAME_GAINERS = "gainers";
  @SerializedName(SERIALIZED_NAME_GAINERS)
  private List<GoogleFinanceMarketTrendsElement> gainers;

  public SerpGoogleFinanceExploreAdvancedItem gainers(List<GoogleFinanceMarketTrendsElement> gainers) {
    this.gainers = gainers;
    return this;
  }

  /**
   * 
   * @return gainers
   */
  @javax.annotation.Nullable
  public List<GoogleFinanceMarketTrendsElement> getGainers() {
    return gainers;
  }

  public void setGainers(List<GoogleFinanceMarketTrendsElement> gainers) {
    this.gainers = gainers;
  }


  public static final String SERIALIZED_NAME_LOSERS = "losers";
  @SerializedName(SERIALIZED_NAME_LOSERS)
  private List<GoogleFinanceMarketTrendsElement> losers;

  public SerpGoogleFinanceExploreAdvancedItem losers(List<GoogleFinanceMarketTrendsElement> losers) {
    this.losers = losers;
    return this;
  }

  /**
   * 
   * @return losers
   */
  @javax.annotation.Nullable
  public List<GoogleFinanceMarketTrendsElement> getLosers() {
    return losers;
  }

  public void setLosers(List<GoogleFinanceMarketTrendsElement> losers) {
    this.losers = losers;
  }



  public SerpGoogleFinanceExploreAdvancedItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpGoogleFinanceExploreAdvancedItem putAdditionalProperty(String key, Object value) {
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


    
    SerpGoogleFinanceExploreAdvancedItem serpGoogleFinanceExploreAdvancedItem = (SerpGoogleFinanceExploreAdvancedItem) o;
    return

        Objects.equals(this.mostActive, serpGoogleFinanceExploreAdvancedItem.mostActive) &&
        Objects.equals(this.gainers, serpGoogleFinanceExploreAdvancedItem.gainers) &&
        Objects.equals(this.losers, serpGoogleFinanceExploreAdvancedItem.losers);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(mostActive, gainers, losers);
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
    sb.append("class SerpGoogleFinanceExploreAdvancedItem {\n");

    sb.append("    mostActive: ").append(toIndentedString(mostActive)).append("\n");
    sb.append("    gainers: ").append(toIndentedString(gainers)).append("\n");
    sb.append("    losers: ").append(toIndentedString(losers)).append("\n");
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
    
    openapiFields.add("most_active");
    
    openapiFields.add("gainers");
    
    openapiFields.add("losers");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpGoogleFinanceExploreAdvancedItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpGoogleFinanceExploreAdvancedItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpGoogleFinanceExploreAdvancedItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpGoogleFinanceExploreAdvancedItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpGoogleFinanceExploreAdvancedItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpGoogleFinanceExploreAdvancedItem>() {
           @Override
           public void write(JsonWriter out, SerpGoogleFinanceExploreAdvancedItem value) throws IOException {
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
           public SerpGoogleFinanceExploreAdvancedItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpGoogleFinanceExploreAdvancedItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpGoogleFinanceExploreAdvancedItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpGoogleFinanceExploreAdvancedItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
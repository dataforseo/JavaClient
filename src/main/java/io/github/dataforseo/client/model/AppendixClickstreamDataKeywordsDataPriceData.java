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



public class AppendixClickstreamDataKeywordsDataPriceData  {


  public static final String SERIALIZED_NAME_BULK_SEARCH_VOLUME = "bulk_search_volume";
  @SerializedName(SERIALIZED_NAME_BULK_SEARCH_VOLUME)
  private AppendixBingKeywordsDataPriceDataInfo bulkSearchVolume;

  public AppendixClickstreamDataKeywordsDataPriceData bulkSearchVolume(AppendixBingKeywordsDataPriceDataInfo bulkSearchVolume) {
    this.bulkSearchVolume = bulkSearchVolume;
    return this;
  }

  /**
   * 
   * @return bulkSearchVolume
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkSearchVolume() {
    return bulkSearchVolume;
  }

  public void setBulkSearchVolume(AppendixBingKeywordsDataPriceDataInfo bulkSearchVolume) {
    this.bulkSearchVolume = bulkSearchVolume;
  }


  public static final String SERIALIZED_NAME_DATAFORSEO_SEARCH_VOLUME = "dataforseo_search_volume";
  @SerializedName(SERIALIZED_NAME_DATAFORSEO_SEARCH_VOLUME)
  private AppendixBingKeywordsDataPriceDataInfo dataforseoSearchVolume;

  public AppendixClickstreamDataKeywordsDataPriceData dataforseoSearchVolume(AppendixBingKeywordsDataPriceDataInfo dataforseoSearchVolume) {
    this.dataforseoSearchVolume = dataforseoSearchVolume;
    return this;
  }

  /**
   * 
   * @return dataforseoSearchVolume
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getDataforseoSearchVolume() {
    return dataforseoSearchVolume;
  }

  public void setDataforseoSearchVolume(AppendixBingKeywordsDataPriceDataInfo dataforseoSearchVolume) {
    this.dataforseoSearchVolume = dataforseoSearchVolume;
  }


  public static final String SERIALIZED_NAME_GLOBAL_SEARCH_VOLUME = "global_search_volume";
  @SerializedName(SERIALIZED_NAME_GLOBAL_SEARCH_VOLUME)
  private AppendixBingKeywordsDataPriceDataInfo globalSearchVolume;

  public AppendixClickstreamDataKeywordsDataPriceData globalSearchVolume(AppendixBingKeywordsDataPriceDataInfo globalSearchVolume) {
    this.globalSearchVolume = globalSearchVolume;
    return this;
  }

  /**
   * 
   * @return globalSearchVolume
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getGlobalSearchVolume() {
    return globalSearchVolume;
  }

  public void setGlobalSearchVolume(AppendixBingKeywordsDataPriceDataInfo globalSearchVolume) {
    this.globalSearchVolume = globalSearchVolume;
  }


  public static final String SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES = "locations_and_languages";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo locationsAndLanguages;

  public AppendixClickstreamDataKeywordsDataPriceData locationsAndLanguages(AppendixTaskKeywordsDataPriceDataInfo locationsAndLanguages) {
    this.locationsAndLanguages = locationsAndLanguages;
    return this;
  }

  /**
   * 
   * @return locationsAndLanguages
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLocationsAndLanguages() {
    return locationsAndLanguages;
  }

  public void setLocationsAndLanguages(AppendixTaskKeywordsDataPriceDataInfo locationsAndLanguages) {
    this.locationsAndLanguages = locationsAndLanguages;
  }



  public AppendixClickstreamDataKeywordsDataPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixClickstreamDataKeywordsDataPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixClickstreamDataKeywordsDataPriceData appendixClickstreamDataKeywordsDataPriceData = (AppendixClickstreamDataKeywordsDataPriceData) o;
    return

        Objects.equals(this.bulkSearchVolume, appendixClickstreamDataKeywordsDataPriceData.bulkSearchVolume) &&
        Objects.equals(this.dataforseoSearchVolume, appendixClickstreamDataKeywordsDataPriceData.dataforseoSearchVolume) &&
        Objects.equals(this.globalSearchVolume, appendixClickstreamDataKeywordsDataPriceData.globalSearchVolume) &&
        Objects.equals(this.locationsAndLanguages, appendixClickstreamDataKeywordsDataPriceData.locationsAndLanguages);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(bulkSearchVolume, dataforseoSearchVolume, globalSearchVolume, locationsAndLanguages);
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
    sb.append("class AppendixClickstreamDataKeywordsDataPriceData {\n");

    sb.append("    bulkSearchVolume: ").append(toIndentedString(bulkSearchVolume)).append("\n");
    sb.append("    dataforseoSearchVolume: ").append(toIndentedString(dataforseoSearchVolume)).append("\n");
    sb.append("    globalSearchVolume: ").append(toIndentedString(globalSearchVolume)).append("\n");
    sb.append("    locationsAndLanguages: ").append(toIndentedString(locationsAndLanguages)).append("\n");
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
    
    openapiFields.add("bulk_search_volume");
    
    openapiFields.add("dataforseo_search_volume");
    
    openapiFields.add("global_search_volume");
    
    openapiFields.add("locations_and_languages");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixClickstreamDataKeywordsDataPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixClickstreamDataKeywordsDataPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixClickstreamDataKeywordsDataPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixClickstreamDataKeywordsDataPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixClickstreamDataKeywordsDataPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixClickstreamDataKeywordsDataPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixClickstreamDataKeywordsDataPriceData value) throws IOException {
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
           public AppendixClickstreamDataKeywordsDataPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixClickstreamDataKeywordsDataPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixClickstreamDataKeywordsDataPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixClickstreamDataKeywordsDataPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
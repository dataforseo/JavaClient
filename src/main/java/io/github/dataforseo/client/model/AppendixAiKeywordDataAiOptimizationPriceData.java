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


public class AppendixAiKeywordDataAiOptimizationPriceData  {


  public static final String SERIALIZED_NAME_AVAILABLE_FILTERS = "available_filters";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_FILTERS)
  private AppendixTaskKeywordsDataPriceDataInfo availableFilters;

  public AppendixAiKeywordDataAiOptimizationPriceData availableFilters(AppendixTaskKeywordsDataPriceDataInfo availableFilters) {
    this.availableFilters = availableFilters;
    return this;
  }

  /**
   * 
   * @return availableFilters
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getAvailableFilters() {
    return availableFilters;
  }

  public void setAvailableFilters(AppendixTaskKeywordsDataPriceDataInfo availableFilters) {
    this.availableFilters = availableFilters;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_SEARCH_VOLUME = "keywords_search_volume";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_SEARCH_VOLUME)
  private AppendixBingKeywordsDataPriceDataInfo keywordsSearchVolume;

  public AppendixAiKeywordDataAiOptimizationPriceData keywordsSearchVolume(AppendixBingKeywordsDataPriceDataInfo keywordsSearchVolume) {
    this.keywordsSearchVolume = keywordsSearchVolume;
    return this;
  }

  /**
   * 
   * @return keywordsSearchVolume
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordsSearchVolume() {
    return keywordsSearchVolume;
  }

  public void setKeywordsSearchVolume(AppendixBingKeywordsDataPriceDataInfo keywordsSearchVolume) {
    this.keywordsSearchVolume = keywordsSearchVolume;
  }


  public static final String SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES = "locations_and_languages";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo locationsAndLanguages;

  public AppendixAiKeywordDataAiOptimizationPriceData locationsAndLanguages(AppendixTaskKeywordsDataPriceDataInfo locationsAndLanguages) {
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



  public AppendixAiKeywordDataAiOptimizationPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixAiKeywordDataAiOptimizationPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixAiKeywordDataAiOptimizationPriceData appendixAiKeywordDataAiOptimizationPriceData = (AppendixAiKeywordDataAiOptimizationPriceData) o;
    return

        Objects.equals(this.availableFilters, appendixAiKeywordDataAiOptimizationPriceData.availableFilters) &&
        Objects.equals(this.keywordsSearchVolume, appendixAiKeywordDataAiOptimizationPriceData.keywordsSearchVolume) &&
        Objects.equals(this.locationsAndLanguages, appendixAiKeywordDataAiOptimizationPriceData.locationsAndLanguages);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(availableFilters, keywordsSearchVolume, locationsAndLanguages);
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
    sb.append("class AppendixAiKeywordDataAiOptimizationPriceData {\n");

    sb.append("    availableFilters: ").append(toIndentedString(availableFilters)).append("\n");
    sb.append("    keywordsSearchVolume: ").append(toIndentedString(keywordsSearchVolume)).append("\n");
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
    
    openapiFields.add("available_filters");
    
    openapiFields.add("keywords_search_volume");
    
    openapiFields.add("locations_and_languages");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixAiKeywordDataAiOptimizationPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixAiKeywordDataAiOptimizationPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixAiKeywordDataAiOptimizationPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixAiKeywordDataAiOptimizationPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixAiKeywordDataAiOptimizationPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixAiKeywordDataAiOptimizationPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixAiKeywordDataAiOptimizationPriceData value) throws IOException {
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
           public AppendixAiKeywordDataAiOptimizationPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixAiKeywordDataAiOptimizationPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixAiKeywordDataAiOptimizationPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixAiKeywordDataAiOptimizationPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
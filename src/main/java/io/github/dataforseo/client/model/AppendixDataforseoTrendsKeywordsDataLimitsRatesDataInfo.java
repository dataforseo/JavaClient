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



public class AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo  {


  public static final String SERIALIZED_NAME_EXPLORE = "explore";
  @SerializedName(SERIALIZED_NAME_EXPLORE)
  private AppendixInfo explore;

  public AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo explore(AppendixInfo explore) {
    this.explore = explore;
    return this;
  }

  /**
   * 
   * @return explore
   */
  @javax.annotation.Nullable
  public AppendixInfo getExplore() {
    return explore;
  }

  public void setExplore(AppendixInfo explore) {
    this.explore = explore;
  }


  public static final String SERIALIZED_NAME_SUBREGION_INTERESTS = "subregion_interests";
  @SerializedName(SERIALIZED_NAME_SUBREGION_INTERESTS)
  private AppendixInfo subregionInterests;

  public AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo subregionInterests(AppendixInfo subregionInterests) {
    this.subregionInterests = subregionInterests;
    return this;
  }

  /**
   * 
   * @return subregionInterests
   */
  @javax.annotation.Nullable
  public AppendixInfo getSubregionInterests() {
    return subregionInterests;
  }

  public void setSubregionInterests(AppendixInfo subregionInterests) {
    this.subregionInterests = subregionInterests;
  }


  public static final String SERIALIZED_NAME_DEMOGRAPHY = "demography";
  @SerializedName(SERIALIZED_NAME_DEMOGRAPHY)
  private AppendixInfo demography;

  public AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo demography(AppendixInfo demography) {
    this.demography = demography;
    return this;
  }

  /**
   * 
   * @return demography
   */
  @javax.annotation.Nullable
  public AppendixInfo getDemography() {
    return demography;
  }

  public void setDemography(AppendixInfo demography) {
    this.demography = demography;
  }


  public static final String SERIALIZED_NAME_MERGED_DATA = "merged_data";
  @SerializedName(SERIALIZED_NAME_MERGED_DATA)
  private AppendixInfo mergedData;

  public AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo mergedData(AppendixInfo mergedData) {
    this.mergedData = mergedData;
    return this;
  }

  /**
   * 
   * @return mergedData
   */
  @javax.annotation.Nullable
  public AppendixInfo getMergedData() {
    return mergedData;
  }

  public void setMergedData(AppendixInfo mergedData) {
    this.mergedData = mergedData;
  }



  public AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo appendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo = (AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo) o;
    return

        Objects.equals(this.explore, appendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo.explore) &&
        Objects.equals(this.subregionInterests, appendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo.subregionInterests) &&
        Objects.equals(this.demography, appendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo.demography) &&
        Objects.equals(this.mergedData, appendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo.mergedData);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(explore, subregionInterests, demography, mergedData);
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
    sb.append("class AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo {\n");

    sb.append("    explore: ").append(toIndentedString(explore)).append("\n");
    sb.append("    subregionInterests: ").append(toIndentedString(subregionInterests)).append("\n");
    sb.append("    demography: ").append(toIndentedString(demography)).append("\n");
    sb.append("    mergedData: ").append(toIndentedString(mergedData)).append("\n");
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
    
    openapiFields.add("explore");
    
    openapiFields.add("subregion_interests");
    
    openapiFields.add("demography");
    
    openapiFields.add("merged_data");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo value) throws IOException {
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
           public AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
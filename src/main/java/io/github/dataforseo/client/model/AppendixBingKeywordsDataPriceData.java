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



public class AppendixBingKeywordsDataPriceData  {


  public static final String SERIALIZED_NAME_AUDIENCE_ESTIMATION = "audience_estimation";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_ESTIMATION)
  private AppendixBingKeywordsDataPriceDataInfo audienceEstimation;

  public AppendixBingKeywordsDataPriceData audienceEstimation(AppendixBingKeywordsDataPriceDataInfo audienceEstimation) {
    this.audienceEstimation = audienceEstimation;
    return this;
  }

  /**
   * 
   * @return audienceEstimation
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getAudienceEstimation() {
    return audienceEstimation;
  }

  public void setAudienceEstimation(AppendixBingKeywordsDataPriceDataInfo audienceEstimation) {
    this.audienceEstimation = audienceEstimation;
  }


  public static final String SERIALIZED_NAME_KEYWORD_PERFORMANCE = "keyword_performance";
  @SerializedName(SERIALIZED_NAME_KEYWORD_PERFORMANCE)
  private AppendixBingKeywordsDataPriceDataInfo keywordPerformance;

  public AppendixBingKeywordsDataPriceData keywordPerformance(AppendixBingKeywordsDataPriceDataInfo keywordPerformance) {
    this.keywordPerformance = keywordPerformance;
    return this;
  }

  /**
   * 
   * @return keywordPerformance
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordPerformance() {
    return keywordPerformance;
  }

  public void setKeywordPerformance(AppendixBingKeywordsDataPriceDataInfo keywordPerformance) {
    this.keywordPerformance = keywordPerformance;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_KEYWORDS = "keywords_for_keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_KEYWORDS)
  private AppendixBingKeywordsDataPriceDataInfo keywordsForKeywords;

  public AppendixBingKeywordsDataPriceData keywordsForKeywords(AppendixBingKeywordsDataPriceDataInfo keywordsForKeywords) {
    this.keywordsForKeywords = keywordsForKeywords;
    return this;
  }

  /**
   * 
   * @return keywordsForKeywords
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordsForKeywords() {
    return keywordsForKeywords;
  }

  public void setKeywordsForKeywords(AppendixBingKeywordsDataPriceDataInfo keywordsForKeywords) {
    this.keywordsForKeywords = keywordsForKeywords;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_SITE = "keywords_for_site";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_SITE)
  private AppendixBingKeywordsDataPriceDataInfo keywordsForSite;

  public AppendixBingKeywordsDataPriceData keywordsForSite(AppendixBingKeywordsDataPriceDataInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
    return this;
  }

  /**
   * 
   * @return keywordsForSite
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordsForSite() {
    return keywordsForSite;
  }

  public void setKeywordsForSite(AppendixBingKeywordsDataPriceDataInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
  }


  public static final String SERIALIZED_NAME_KEYWORD_SUGGESTIONS_FOR_URL = "keyword_suggestions_for_url";
  @SerializedName(SERIALIZED_NAME_KEYWORD_SUGGESTIONS_FOR_URL)
  private AppendixBingKeywordsDataPriceDataInfo keywordSuggestionsForUrl;

  public AppendixBingKeywordsDataPriceData keywordSuggestionsForUrl(AppendixBingKeywordsDataPriceDataInfo keywordSuggestionsForUrl) {
    this.keywordSuggestionsForUrl = keywordSuggestionsForUrl;
    return this;
  }

  /**
   * 
   * @return keywordSuggestionsForUrl
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordSuggestionsForUrl() {
    return keywordSuggestionsForUrl;
  }

  public void setKeywordSuggestionsForUrl(AppendixBingKeywordsDataPriceDataInfo keywordSuggestionsForUrl) {
    this.keywordSuggestionsForUrl = keywordSuggestionsForUrl;
  }


  public static final String SERIALIZED_NAME_SEARCH_VOLUME = "search_volume";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME)
  private AppendixBingKeywordsDataPriceDataInfo searchVolume;

  public AppendixBingKeywordsDataPriceData searchVolume(AppendixBingKeywordsDataPriceDataInfo searchVolume) {
    this.searchVolume = searchVolume;
    return this;
  }

  /**
   * 
   * @return searchVolume
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getSearchVolume() {
    return searchVolume;
  }

  public void setSearchVolume(AppendixBingKeywordsDataPriceDataInfo searchVolume) {
    this.searchVolume = searchVolume;
  }



  public AppendixBingKeywordsDataPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixBingKeywordsDataPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixBingKeywordsDataPriceData appendixBingKeywordsDataPriceData = (AppendixBingKeywordsDataPriceData) o;
    return

        Objects.equals(this.audienceEstimation, appendixBingKeywordsDataPriceData.audienceEstimation) &&
        Objects.equals(this.keywordPerformance, appendixBingKeywordsDataPriceData.keywordPerformance) &&
        Objects.equals(this.keywordsForKeywords, appendixBingKeywordsDataPriceData.keywordsForKeywords) &&
        Objects.equals(this.keywordsForSite, appendixBingKeywordsDataPriceData.keywordsForSite) &&
        Objects.equals(this.keywordSuggestionsForUrl, appendixBingKeywordsDataPriceData.keywordSuggestionsForUrl) &&
        Objects.equals(this.searchVolume, appendixBingKeywordsDataPriceData.searchVolume);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(audienceEstimation, keywordPerformance, keywordsForKeywords, keywordsForSite, keywordSuggestionsForUrl, searchVolume);
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
    sb.append("class AppendixBingKeywordsDataPriceData {\n");

    sb.append("    audienceEstimation: ").append(toIndentedString(audienceEstimation)).append("\n");
    sb.append("    keywordPerformance: ").append(toIndentedString(keywordPerformance)).append("\n");
    sb.append("    keywordsForKeywords: ").append(toIndentedString(keywordsForKeywords)).append("\n");
    sb.append("    keywordsForSite: ").append(toIndentedString(keywordsForSite)).append("\n");
    sb.append("    keywordSuggestionsForUrl: ").append(toIndentedString(keywordSuggestionsForUrl)).append("\n");
    sb.append("    searchVolume: ").append(toIndentedString(searchVolume)).append("\n");
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
    
    openapiFields.add("audience_estimation");
    
    openapiFields.add("keyword_performance");
    
    openapiFields.add("keywords_for_keywords");
    
    openapiFields.add("keywords_for_site");
    
    openapiFields.add("keyword_suggestions_for_url");
    
    openapiFields.add("search_volume");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixBingKeywordsDataPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixBingKeywordsDataPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixBingKeywordsDataPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixBingKeywordsDataPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixBingKeywordsDataPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixBingKeywordsDataPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixBingKeywordsDataPriceData value) throws IOException {
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
           public AppendixBingKeywordsDataPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixBingKeywordsDataPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixBingKeywordsDataPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixBingKeywordsDataPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
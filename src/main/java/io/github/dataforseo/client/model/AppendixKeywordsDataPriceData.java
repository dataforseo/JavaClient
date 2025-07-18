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



public class AppendixKeywordsDataPriceData  {


  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private AppendixTaskKeywordsDataPriceDataInfo tasksReady;

  public AppendixKeywordsDataPriceData tasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

  /**
   * 
   * @return tasksReady
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
  }


  public static final String SERIALIZED_NAME_AD_TRAFFIC_BY_KEYWORDS = "ad_traffic_by_keywords";
  @SerializedName(SERIALIZED_NAME_AD_TRAFFIC_BY_KEYWORDS)
  private AppendixAKeywordsDataPriceDataInfo adTrafficByKeywords;

  public AppendixKeywordsDataPriceData adTrafficByKeywords(AppendixAKeywordsDataPriceDataInfo adTrafficByKeywords) {
    this.adTrafficByKeywords = adTrafficByKeywords;
    return this;
  }

  /**
   * 
   * @return adTrafficByKeywords
   */
  @javax.annotation.Nullable
  public AppendixAKeywordsDataPriceDataInfo getAdTrafficByKeywords() {
    return adTrafficByKeywords;
  }

  public void setAdTrafficByKeywords(AppendixAKeywordsDataPriceDataInfo adTrafficByKeywords) {
    this.adTrafficByKeywords = adTrafficByKeywords;
  }


  public static final String SERIALIZED_NAME_AUDIENCE_ESTIMATION = "audience_estimation";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_ESTIMATION)
  private AppendixAKeywordsDataPriceDataInfo audienceEstimation;

  public AppendixKeywordsDataPriceData audienceEstimation(AppendixAKeywordsDataPriceDataInfo audienceEstimation) {
    this.audienceEstimation = audienceEstimation;
    return this;
  }

  /**
   * 
   * @return audienceEstimation
   */
  @javax.annotation.Nullable
  public AppendixAKeywordsDataPriceDataInfo getAudienceEstimation() {
    return audienceEstimation;
  }

  public void setAudienceEstimation(AppendixAKeywordsDataPriceDataInfo audienceEstimation) {
    this.audienceEstimation = audienceEstimation;
  }


  public static final String SERIALIZED_NAME_BING = "bing";
  @SerializedName(SERIALIZED_NAME_BING)
  private AppendixBingKeywordsDataPriceData bing;

  public AppendixKeywordsDataPriceData bing(AppendixBingKeywordsDataPriceData bing) {
    this.bing = bing;
    return this;
  }

  /**
   * 
   * @return bing
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceData getBing() {
    return bing;
  }

  public void setBing(AppendixBingKeywordsDataPriceData bing) {
    this.bing = bing;
  }


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private AppendixTaskKeywordsDataPriceDataInfo categories;

  public AppendixKeywordsDataPriceData categories(AppendixTaskKeywordsDataPriceDataInfo categories) {
    this.categories = categories;
    return this;
  }

  /**
   * 
   * @return categories
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getCategories() {
    return categories;
  }

  public void setCategories(AppendixTaskKeywordsDataPriceDataInfo categories) {
    this.categories = categories;
  }


  public static final String SERIALIZED_NAME_CLICKSTREAM_DATA = "clickstream_data";
  @SerializedName(SERIALIZED_NAME_CLICKSTREAM_DATA)
  private AppendixClickstreamDataKeywordsDataPriceData clickstreamData;

  public AppendixKeywordsDataPriceData clickstreamData(AppendixClickstreamDataKeywordsDataPriceData clickstreamData) {
    this.clickstreamData = clickstreamData;
    return this;
  }

  /**
   * 
   * @return clickstreamData
   */
  @javax.annotation.Nullable
  public AppendixClickstreamDataKeywordsDataPriceData getClickstreamData() {
    return clickstreamData;
  }

  public void setClickstreamData(AppendixClickstreamDataKeywordsDataPriceData clickstreamData) {
    this.clickstreamData = clickstreamData;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public AppendixKeywordsDataPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
    return this;
  }

  /**
   * 
   * @return errors
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getErrors() {
    return errors;
  }

  public void setErrors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
  }


  public static final String SERIALIZED_NAME_GOOGLE_ADS = "google_ads";
  @SerializedName(SERIALIZED_NAME_GOOGLE_ADS)
  private AppendixGoogleAdsKeywordsDataPriceData googleAds;

  public AppendixKeywordsDataPriceData googleAds(AppendixGoogleAdsKeywordsDataPriceData googleAds) {
    this.googleAds = googleAds;
    return this;
  }

  /**
   * 
   * @return googleAds
   */
  @javax.annotation.Nullable
  public AppendixGoogleAdsKeywordsDataPriceData getGoogleAds() {
    return googleAds;
  }

  public void setGoogleAds(AppendixGoogleAdsKeywordsDataPriceData googleAds) {
    this.googleAds = googleAds;
  }


  public static final String SERIALIZED_NAME_KEYWORD_PERFORMANCE = "keyword_performance";
  @SerializedName(SERIALIZED_NAME_KEYWORD_PERFORMANCE)
  private AppendixAKeywordsDataPriceDataInfo keywordPerformance;

  public AppendixKeywordsDataPriceData keywordPerformance(AppendixAKeywordsDataPriceDataInfo keywordPerformance) {
    this.keywordPerformance = keywordPerformance;
    return this;
  }

  /**
   * 
   * @return keywordPerformance
   */
  @javax.annotation.Nullable
  public AppendixAKeywordsDataPriceDataInfo getKeywordPerformance() {
    return keywordPerformance;
  }

  public void setKeywordPerformance(AppendixAKeywordsDataPriceDataInfo keywordPerformance) {
    this.keywordPerformance = keywordPerformance;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_KEYWORDS = "keywords_for_keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_KEYWORDS)
  private AppendixAKeywordsDataPriceDataInfo keywordsForKeywords;

  public AppendixKeywordsDataPriceData keywordsForKeywords(AppendixAKeywordsDataPriceDataInfo keywordsForKeywords) {
    this.keywordsForKeywords = keywordsForKeywords;
    return this;
  }

  /**
   * 
   * @return keywordsForKeywords
   */
  @javax.annotation.Nullable
  public AppendixAKeywordsDataPriceDataInfo getKeywordsForKeywords() {
    return keywordsForKeywords;
  }

  public void setKeywordsForKeywords(AppendixAKeywordsDataPriceDataInfo keywordsForKeywords) {
    this.keywordsForKeywords = keywordsForKeywords;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_SITE = "keywords_for_site";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_SITE)
  private AppendixAKeywordsDataPriceDataInfo keywordsForSite;

  public AppendixKeywordsDataPriceData keywordsForSite(AppendixAKeywordsDataPriceDataInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
    return this;
  }

  /**
   * 
   * @return keywordsForSite
   */
  @javax.annotation.Nullable
  public AppendixAKeywordsDataPriceDataInfo getKeywordsForSite() {
    return keywordsForSite;
  }

  public void setKeywordsForSite(AppendixAKeywordsDataPriceDataInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
  }


  public static final String SERIALIZED_NAME_KEYWORD_SUGGESTIONS_FOR_URL = "keyword_suggestions_for_url";
  @SerializedName(SERIALIZED_NAME_KEYWORD_SUGGESTIONS_FOR_URL)
  private AppendixAKeywordsDataPriceDataInfo keywordSuggestionsForUrl;

  public AppendixKeywordsDataPriceData keywordSuggestionsForUrl(AppendixAKeywordsDataPriceDataInfo keywordSuggestionsForUrl) {
    this.keywordSuggestionsForUrl = keywordSuggestionsForUrl;
    return this;
  }

  /**
   * 
   * @return keywordSuggestionsForUrl
   */
  @javax.annotation.Nullable
  public AppendixAKeywordsDataPriceDataInfo getKeywordSuggestionsForUrl() {
    return keywordSuggestionsForUrl;
  }

  public void setKeywordSuggestionsForUrl(AppendixAKeywordsDataPriceDataInfo keywordSuggestionsForUrl) {
    this.keywordSuggestionsForUrl = keywordSuggestionsForUrl;
  }


  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo languages;

  public AppendixKeywordsDataPriceData languages(AppendixTaskKeywordsDataPriceDataInfo languages) {
    this.languages = languages;
    return this;
  }

  /**
   * 
   * @return languages
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLanguages() {
    return languages;
  }

  public void setLanguages(AppendixTaskKeywordsDataPriceDataInfo languages) {
    this.languages = languages;
  }


  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private AppendixTaskKeywordsDataPriceDataInfo locations;

  public AppendixKeywordsDataPriceData locations(AppendixTaskKeywordsDataPriceDataInfo locations) {
    this.locations = locations;
    return this;
  }

  /**
   * 
   * @return locations
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLocations() {
    return locations;
  }

  public void setLocations(AppendixTaskKeywordsDataPriceDataInfo locations) {
    this.locations = locations;
  }


  public static final String SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES = "locations_and_languages";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo locationsAndLanguages;

  public AppendixKeywordsDataPriceData locationsAndLanguages(AppendixTaskKeywordsDataPriceDataInfo locationsAndLanguages) {
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


  public static final String SERIALIZED_NAME_SEARCH_VOLUME = "search_volume";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME)
  private AppendixAKeywordsDataPriceDataInfo searchVolume;

  public AppendixKeywordsDataPriceData searchVolume(AppendixAKeywordsDataPriceDataInfo searchVolume) {
    this.searchVolume = searchVolume;
    return this;
  }

  /**
   * 
   * @return searchVolume
   */
  @javax.annotation.Nullable
  public AppendixAKeywordsDataPriceDataInfo getSearchVolume() {
    return searchVolume;
  }

  public void setSearchVolume(AppendixAKeywordsDataPriceDataInfo searchVolume) {
    this.searchVolume = searchVolume;
  }


  public static final String SERIALIZED_NAME_DATAFORSEO_TRENDS = "dataforseo_trends";
  @SerializedName(SERIALIZED_NAME_DATAFORSEO_TRENDS)
  private AppendixDataforseoTrendsKeywordsDataPriceData dataforseoTrends;

  public AppendixKeywordsDataPriceData dataforseoTrends(AppendixDataforseoTrendsKeywordsDataPriceData dataforseoTrends) {
    this.dataforseoTrends = dataforseoTrends;
    return this;
  }

  /**
   * 
   * @return dataforseoTrends
   */
  @javax.annotation.Nullable
  public AppendixDataforseoTrendsKeywordsDataPriceData getDataforseoTrends() {
    return dataforseoTrends;
  }

  public void setDataforseoTrends(AppendixDataforseoTrendsKeywordsDataPriceData dataforseoTrends) {
    this.dataforseoTrends = dataforseoTrends;
  }


  public static final String SERIALIZED_NAME_EXPLORE = "explore";
  @SerializedName(SERIALIZED_NAME_EXPLORE)
  private AppendixExploreKeywordsDataPriceData explore;

  public AppendixKeywordsDataPriceData explore(AppendixExploreKeywordsDataPriceData explore) {
    this.explore = explore;
    return this;
  }

  /**
   * 
   * @return explore
   */
  @javax.annotation.Nullable
  public AppendixExploreKeywordsDataPriceData getExplore() {
    return explore;
  }

  public void setExplore(AppendixExploreKeywordsDataPriceData explore) {
    this.explore = explore;
  }



  public AppendixKeywordsDataPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixKeywordsDataPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixKeywordsDataPriceData appendixKeywordsDataPriceData = (AppendixKeywordsDataPriceData) o;
    return

        Objects.equals(this.tasksReady, appendixKeywordsDataPriceData.tasksReady) &&
        Objects.equals(this.adTrafficByKeywords, appendixKeywordsDataPriceData.adTrafficByKeywords) &&
        Objects.equals(this.audienceEstimation, appendixKeywordsDataPriceData.audienceEstimation) &&
        Objects.equals(this.bing, appendixKeywordsDataPriceData.bing) &&
        Objects.equals(this.categories, appendixKeywordsDataPriceData.categories) &&
        Objects.equals(this.clickstreamData, appendixKeywordsDataPriceData.clickstreamData) &&
        Objects.equals(this.errors, appendixKeywordsDataPriceData.errors) &&
        Objects.equals(this.googleAds, appendixKeywordsDataPriceData.googleAds) &&
        Objects.equals(this.keywordPerformance, appendixKeywordsDataPriceData.keywordPerformance) &&
        Objects.equals(this.keywordsForKeywords, appendixKeywordsDataPriceData.keywordsForKeywords) &&
        Objects.equals(this.keywordsForSite, appendixKeywordsDataPriceData.keywordsForSite) &&
        Objects.equals(this.keywordSuggestionsForUrl, appendixKeywordsDataPriceData.keywordSuggestionsForUrl) &&
        Objects.equals(this.languages, appendixKeywordsDataPriceData.languages) &&
        Objects.equals(this.locations, appendixKeywordsDataPriceData.locations) &&
        Objects.equals(this.locationsAndLanguages, appendixKeywordsDataPriceData.locationsAndLanguages) &&
        Objects.equals(this.searchVolume, appendixKeywordsDataPriceData.searchVolume) &&
        Objects.equals(this.dataforseoTrends, appendixKeywordsDataPriceData.dataforseoTrends) &&
        Objects.equals(this.explore, appendixKeywordsDataPriceData.explore);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(tasksReady, adTrafficByKeywords, audienceEstimation, bing, categories, clickstreamData, errors, googleAds, keywordPerformance, keywordsForKeywords, keywordsForSite, keywordSuggestionsForUrl, languages, locations, locationsAndLanguages, searchVolume, dataforseoTrends, explore);
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
    sb.append("class AppendixKeywordsDataPriceData {\n");

    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
    sb.append("    adTrafficByKeywords: ").append(toIndentedString(adTrafficByKeywords)).append("\n");
    sb.append("    audienceEstimation: ").append(toIndentedString(audienceEstimation)).append("\n");
    sb.append("    bing: ").append(toIndentedString(bing)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    clickstreamData: ").append(toIndentedString(clickstreamData)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    googleAds: ").append(toIndentedString(googleAds)).append("\n");
    sb.append("    keywordPerformance: ").append(toIndentedString(keywordPerformance)).append("\n");
    sb.append("    keywordsForKeywords: ").append(toIndentedString(keywordsForKeywords)).append("\n");
    sb.append("    keywordsForSite: ").append(toIndentedString(keywordsForSite)).append("\n");
    sb.append("    keywordSuggestionsForUrl: ").append(toIndentedString(keywordSuggestionsForUrl)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    locationsAndLanguages: ").append(toIndentedString(locationsAndLanguages)).append("\n");
    sb.append("    searchVolume: ").append(toIndentedString(searchVolume)).append("\n");
    sb.append("    dataforseoTrends: ").append(toIndentedString(dataforseoTrends)).append("\n");
    sb.append("    explore: ").append(toIndentedString(explore)).append("\n");
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
    
    openapiFields.add("tasks_ready");
    
    openapiFields.add("ad_traffic_by_keywords");
    
    openapiFields.add("audience_estimation");
    
    openapiFields.add("bing");
    
    openapiFields.add("categories");
    
    openapiFields.add("clickstream_data");
    
    openapiFields.add("errors");
    
    openapiFields.add("google_ads");
    
    openapiFields.add("keyword_performance");
    
    openapiFields.add("keywords_for_keywords");
    
    openapiFields.add("keywords_for_site");
    
    openapiFields.add("keyword_suggestions_for_url");
    
    openapiFields.add("languages");
    
    openapiFields.add("locations");
    
    openapiFields.add("locations_and_languages");
    
    openapiFields.add("search_volume");
    
    openapiFields.add("dataforseo_trends");
    
    openapiFields.add("explore");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixKeywordsDataPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixKeywordsDataPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixKeywordsDataPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixKeywordsDataPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixKeywordsDataPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixKeywordsDataPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixKeywordsDataPriceData value) throws IOException {
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
           public AppendixKeywordsDataPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixKeywordsDataPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixKeywordsDataPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixKeywordsDataPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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



public class AppendixKeywordsDataDaysRatesDataInfo  {


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_KEYWORDS = "keywords_for_keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_KEYWORDS)
  private AppendixInfo keywordsForKeywords;

  public AppendixKeywordsDataDaysRatesDataInfo keywordsForKeywords(AppendixInfo keywordsForKeywords) {
    this.keywordsForKeywords = keywordsForKeywords;
    return this;
  }

  /**
   * 
   * @return keywordsForKeywords
   */
  @javax.annotation.Nullable
  public AppendixInfo getKeywordsForKeywords() {
    return keywordsForKeywords;
  }

  public void setKeywordsForKeywords(AppendixInfo keywordsForKeywords) {
    this.keywordsForKeywords = keywordsForKeywords;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_SITE = "keywords_for_site";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_SITE)
  private AppendixInfo keywordsForSite;

  public AppendixKeywordsDataDaysRatesDataInfo keywordsForSite(AppendixInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
    return this;
  }

  /**
   * 
   * @return keywordsForSite
   */
  @javax.annotation.Nullable
  public AppendixInfo getKeywordsForSite() {
    return keywordsForSite;
  }

  public void setKeywordsForSite(AppendixInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
  }


  public static final String SERIALIZED_NAME_SEARCH_VOLUME = "search_volume";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME)
  private AppendixInfo searchVolume;

  public AppendixKeywordsDataDaysRatesDataInfo searchVolume(AppendixInfo searchVolume) {
    this.searchVolume = searchVolume;
    return this;
  }

  /**
   * 
   * @return searchVolume
   */
  @javax.annotation.Nullable
  public AppendixInfo getSearchVolume() {
    return searchVolume;
  }

  public void setSearchVolume(AppendixInfo searchVolume) {
    this.searchVolume = searchVolume;
  }


  public static final String SERIALIZED_NAME_AD_TRAFFIC_BY_KEYWORDS = "ad_traffic_by_keywords";
  @SerializedName(SERIALIZED_NAME_AD_TRAFFIC_BY_KEYWORDS)
  private AppendixInfo adTrafficByKeywords;

  public AppendixKeywordsDataDaysRatesDataInfo adTrafficByKeywords(AppendixInfo adTrafficByKeywords) {
    this.adTrafficByKeywords = adTrafficByKeywords;
    return this;
  }

  /**
   * 
   * @return adTrafficByKeywords
   */
  @javax.annotation.Nullable
  public AppendixInfo getAdTrafficByKeywords() {
    return adTrafficByKeywords;
  }

  public void setAdTrafficByKeywords(AppendixInfo adTrafficByKeywords) {
    this.adTrafficByKeywords = adTrafficByKeywords;
  }


  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private Double languages;

  public AppendixKeywordsDataDaysRatesDataInfo languages(Double languages) {
    this.languages = languages;
    return this;
  }

  /**
   * 
   * @return languages
   */
  @javax.annotation.Nullable
  public Double getLanguages() {
    return languages;
  }

  public void setLanguages(Double languages) {
    this.languages = languages;
  }


  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private Double locations;

  public AppendixKeywordsDataDaysRatesDataInfo locations(Double locations) {
    this.locations = locations;
    return this;
  }

  /**
   * 
   * @return locations
   */
  @javax.annotation.Nullable
  public Double getLocations() {
    return locations;
  }

  public void setLocations(Double locations) {
    this.locations = locations;
  }


  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private Double tasksReady;

  public AppendixKeywordsDataDaysRatesDataInfo tasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

  /**
   * 
   * @return tasksReady
   */
  @javax.annotation.Nullable
  public Double getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
  }


  public static final String SERIALIZED_NAME_EXPLORE = "explore";
  @SerializedName(SERIALIZED_NAME_EXPLORE)
  private AppendixInfo explore;

  public AppendixKeywordsDataDaysRatesDataInfo explore(AppendixInfo explore) {
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


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private Double categories;

  public AppendixKeywordsDataDaysRatesDataInfo categories(Double categories) {
    this.categories = categories;
    return this;
  }

  /**
   * 
   * @return categories
   */
  @javax.annotation.Nullable
  public Double getCategories() {
    return categories;
  }

  public void setCategories(Double categories) {
    this.categories = categories;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Double errors;

  public AppendixKeywordsDataDaysRatesDataInfo errors(Double errors) {
    this.errors = errors;
    return this;
  }

  /**
   * 
   * @return errors
   */
  @javax.annotation.Nullable
  public Double getErrors() {
    return errors;
  }

  public void setErrors(Double errors) {
    this.errors = errors;
  }


  public static final String SERIALIZED_NAME_BING = "bing";
  @SerializedName(SERIALIZED_NAME_BING)
  private AppendixBingKeywordsDataLimitsRatesDataInfo bing;

  public AppendixKeywordsDataDaysRatesDataInfo bing(AppendixBingKeywordsDataLimitsRatesDataInfo bing) {
    this.bing = bing;
    return this;
  }

  /**
   * 
   * @return bing
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataLimitsRatesDataInfo getBing() {
    return bing;
  }

  public void setBing(AppendixBingKeywordsDataLimitsRatesDataInfo bing) {
    this.bing = bing;
  }


  public static final String SERIALIZED_NAME_KEYWORD_PERFORMANCE = "keyword_performance";
  @SerializedName(SERIALIZED_NAME_KEYWORD_PERFORMANCE)
  private AppendixInfo keywordPerformance;

  public AppendixKeywordsDataDaysRatesDataInfo keywordPerformance(AppendixInfo keywordPerformance) {
    this.keywordPerformance = keywordPerformance;
    return this;
  }

  /**
   * 
   * @return keywordPerformance
   */
  @javax.annotation.Nullable
  public AppendixInfo getKeywordPerformance() {
    return keywordPerformance;
  }

  public void setKeywordPerformance(AppendixInfo keywordPerformance) {
    this.keywordPerformance = keywordPerformance;
  }


  public static final String SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES = "locations_and_languages";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES)
  private Double locationsAndLanguages;

  public AppendixKeywordsDataDaysRatesDataInfo locationsAndLanguages(Double locationsAndLanguages) {
    this.locationsAndLanguages = locationsAndLanguages;
    return this;
  }

  /**
   * 
   * @return locationsAndLanguages
   */
  @javax.annotation.Nullable
  public Double getLocationsAndLanguages() {
    return locationsAndLanguages;
  }

  public void setLocationsAndLanguages(Double locationsAndLanguages) {
    this.locationsAndLanguages = locationsAndLanguages;
  }


  public static final String SERIALIZED_NAME_GOOGLE_ADS = "google_ads";
  @SerializedName(SERIALIZED_NAME_GOOGLE_ADS)
  private AppendixGoogleAdsKeywordsDataLimitsRatesDataInfo googleAds;

  public AppendixKeywordsDataDaysRatesDataInfo googleAds(AppendixGoogleAdsKeywordsDataLimitsRatesDataInfo googleAds) {
    this.googleAds = googleAds;
    return this;
  }

  /**
   * 
   * @return googleAds
   */
  @javax.annotation.Nullable
  public AppendixGoogleAdsKeywordsDataLimitsRatesDataInfo getGoogleAds() {
    return googleAds;
  }

  public void setGoogleAds(AppendixGoogleAdsKeywordsDataLimitsRatesDataInfo googleAds) {
    this.googleAds = googleAds;
  }


  public static final String SERIALIZED_NAME_DATAFORSEO_TRENDS = "dataforseo_trends";
  @SerializedName(SERIALIZED_NAME_DATAFORSEO_TRENDS)
  private AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo dataforseoTrends;

  public AppendixKeywordsDataDaysRatesDataInfo dataforseoTrends(AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo dataforseoTrends) {
    this.dataforseoTrends = dataforseoTrends;
    return this;
  }

  /**
   * 
   * @return dataforseoTrends
   */
  @javax.annotation.Nullable
  public AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo getDataforseoTrends() {
    return dataforseoTrends;
  }

  public void setDataforseoTrends(AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo dataforseoTrends) {
    this.dataforseoTrends = dataforseoTrends;
  }


  public static final String SERIALIZED_NAME_CLICKSTREAM_DATA = "clickstream_data";
  @SerializedName(SERIALIZED_NAME_CLICKSTREAM_DATA)
  private AppendixClickstreamDataKeywordsDataLimitsRatesDataInfo clickstreamData;

  public AppendixKeywordsDataDaysRatesDataInfo clickstreamData(AppendixClickstreamDataKeywordsDataLimitsRatesDataInfo clickstreamData) {
    this.clickstreamData = clickstreamData;
    return this;
  }

  /**
   * 
   * @return clickstreamData
   */
  @javax.annotation.Nullable
  public AppendixClickstreamDataKeywordsDataLimitsRatesDataInfo getClickstreamData() {
    return clickstreamData;
  }

  public void setClickstreamData(AppendixClickstreamDataKeywordsDataLimitsRatesDataInfo clickstreamData) {
    this.clickstreamData = clickstreamData;
  }


  public static final String SERIALIZED_NAME_AUDIENCE_ESTIMATION = "audience_estimation";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_ESTIMATION)
  private AppendixInfo audienceEstimation;

  public AppendixKeywordsDataDaysRatesDataInfo audienceEstimation(AppendixInfo audienceEstimation) {
    this.audienceEstimation = audienceEstimation;
    return this;
  }

  /**
   * 
   * @return audienceEstimation
   */
  @javax.annotation.Nullable
  public AppendixInfo getAudienceEstimation() {
    return audienceEstimation;
  }

  public void setAudienceEstimation(AppendixInfo audienceEstimation) {
    this.audienceEstimation = audienceEstimation;
  }


  public static final String SERIALIZED_NAME_KEYWORD_SUGGESTIONS_FOR_URL = "keyword_suggestions_for_url";
  @SerializedName(SERIALIZED_NAME_KEYWORD_SUGGESTIONS_FOR_URL)
  private AppendixInfo keywordSuggestionsForUrl;

  public AppendixKeywordsDataDaysRatesDataInfo keywordSuggestionsForUrl(AppendixInfo keywordSuggestionsForUrl) {
    this.keywordSuggestionsForUrl = keywordSuggestionsForUrl;
    return this;
  }

  /**
   * 
   * @return keywordSuggestionsForUrl
   */
  @javax.annotation.Nullable
  public AppendixInfo getKeywordSuggestionsForUrl() {
    return keywordSuggestionsForUrl;
  }

  public void setKeywordSuggestionsForUrl(AppendixInfo keywordSuggestionsForUrl) {
    this.keywordSuggestionsForUrl = keywordSuggestionsForUrl;
  }



  public AppendixKeywordsDataDaysRatesDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixKeywordsDataDaysRatesDataInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixKeywordsDataDaysRatesDataInfo appendixKeywordsDataDaysRatesDataInfo = (AppendixKeywordsDataDaysRatesDataInfo) o;
    return

        Objects.equals(this.keywordsForKeywords, appendixKeywordsDataDaysRatesDataInfo.keywordsForKeywords) &&
        Objects.equals(this.keywordsForSite, appendixKeywordsDataDaysRatesDataInfo.keywordsForSite) &&
        Objects.equals(this.searchVolume, appendixKeywordsDataDaysRatesDataInfo.searchVolume) &&
        Objects.equals(this.adTrafficByKeywords, appendixKeywordsDataDaysRatesDataInfo.adTrafficByKeywords) &&
        Objects.equals(this.languages, appendixKeywordsDataDaysRatesDataInfo.languages) &&
        Objects.equals(this.locations, appendixKeywordsDataDaysRatesDataInfo.locations) &&
        Objects.equals(this.tasksReady, appendixKeywordsDataDaysRatesDataInfo.tasksReady) &&
        Objects.equals(this.explore, appendixKeywordsDataDaysRatesDataInfo.explore) &&
        Objects.equals(this.categories, appendixKeywordsDataDaysRatesDataInfo.categories) &&
        Objects.equals(this.errors, appendixKeywordsDataDaysRatesDataInfo.errors) &&
        Objects.equals(this.bing, appendixKeywordsDataDaysRatesDataInfo.bing) &&
        Objects.equals(this.keywordPerformance, appendixKeywordsDataDaysRatesDataInfo.keywordPerformance) &&
        Objects.equals(this.locationsAndLanguages, appendixKeywordsDataDaysRatesDataInfo.locationsAndLanguages) &&
        Objects.equals(this.googleAds, appendixKeywordsDataDaysRatesDataInfo.googleAds) &&
        Objects.equals(this.dataforseoTrends, appendixKeywordsDataDaysRatesDataInfo.dataforseoTrends) &&
        Objects.equals(this.clickstreamData, appendixKeywordsDataDaysRatesDataInfo.clickstreamData) &&
        Objects.equals(this.audienceEstimation, appendixKeywordsDataDaysRatesDataInfo.audienceEstimation) &&
        Objects.equals(this.keywordSuggestionsForUrl, appendixKeywordsDataDaysRatesDataInfo.keywordSuggestionsForUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keywordsForKeywords, keywordsForSite, searchVolume, adTrafficByKeywords, languages, locations, tasksReady, explore, categories, errors, bing, keywordPerformance, locationsAndLanguages, googleAds, dataforseoTrends, clickstreamData, audienceEstimation, keywordSuggestionsForUrl);
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
    sb.append("class AppendixKeywordsDataDaysRatesDataInfo {\n");

    sb.append("    keywordsForKeywords: ").append(toIndentedString(keywordsForKeywords)).append("\n");
    sb.append("    keywordsForSite: ").append(toIndentedString(keywordsForSite)).append("\n");
    sb.append("    searchVolume: ").append(toIndentedString(searchVolume)).append("\n");
    sb.append("    adTrafficByKeywords: ").append(toIndentedString(adTrafficByKeywords)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
    sb.append("    explore: ").append(toIndentedString(explore)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    bing: ").append(toIndentedString(bing)).append("\n");
    sb.append("    keywordPerformance: ").append(toIndentedString(keywordPerformance)).append("\n");
    sb.append("    locationsAndLanguages: ").append(toIndentedString(locationsAndLanguages)).append("\n");
    sb.append("    googleAds: ").append(toIndentedString(googleAds)).append("\n");
    sb.append("    dataforseoTrends: ").append(toIndentedString(dataforseoTrends)).append("\n");
    sb.append("    clickstreamData: ").append(toIndentedString(clickstreamData)).append("\n");
    sb.append("    audienceEstimation: ").append(toIndentedString(audienceEstimation)).append("\n");
    sb.append("    keywordSuggestionsForUrl: ").append(toIndentedString(keywordSuggestionsForUrl)).append("\n");
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
    
    openapiFields.add("keywords_for_keywords");
    
    openapiFields.add("keywords_for_site");
    
    openapiFields.add("search_volume");
    
    openapiFields.add("ad_traffic_by_keywords");
    
    openapiFields.add("languages");
    
    openapiFields.add("locations");
    
    openapiFields.add("tasks_ready");
    
    openapiFields.add("explore");
    
    openapiFields.add("categories");
    
    openapiFields.add("errors");
    
    openapiFields.add("bing");
    
    openapiFields.add("keyword_performance");
    
    openapiFields.add("locations_and_languages");
    
    openapiFields.add("google_ads");
    
    openapiFields.add("dataforseo_trends");
    
    openapiFields.add("clickstream_data");
    
    openapiFields.add("audience_estimation");
    
    openapiFields.add("keyword_suggestions_for_url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixKeywordsDataDaysRatesDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixKeywordsDataDaysRatesDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixKeywordsDataDaysRatesDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixKeywordsDataDaysRatesDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixKeywordsDataDaysRatesDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixKeywordsDataDaysRatesDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixKeywordsDataDaysRatesDataInfo value) throws IOException {
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
           public AppendixKeywordsDataDaysRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixKeywordsDataDaysRatesDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixKeywordsDataDaysRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixKeywordsDataDaysRatesDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
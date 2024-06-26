/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.dataforseo.client.model.AppendixKeywordBingKeywordsDataPriceDataInfo;
import org.dataforseo.client.model.AppendixTaskKeywordsDataPriceDataInfo;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * AppendixContentAnalysisPriceData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T09:14:36.455142500+03:00[Europe/Kiev]")
public class AppendixContentAnalysisPriceData {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private AppendixTaskKeywordsDataPriceDataInfo categories;

  public static final String SERIALIZED_NAME_CATEGORY_TRENDS = "category_trends";
  @SerializedName(SERIALIZED_NAME_CATEGORY_TRENDS)
  private AppendixKeywordBingKeywordsDataPriceDataInfo categoryTrends;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo languages;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private AppendixTaskKeywordsDataPriceDataInfo locations;

  public static final String SERIALIZED_NAME_PHRASE_TRENDS = "phrase_trends";
  @SerializedName(SERIALIZED_NAME_PHRASE_TRENDS)
  private AppendixKeywordBingKeywordsDataPriceDataInfo phraseTrends;

  public static final String SERIALIZED_NAME_RATING_DISTRIBUTION = "rating_distribution";
  @SerializedName(SERIALIZED_NAME_RATING_DISTRIBUTION)
  private AppendixKeywordBingKeywordsDataPriceDataInfo ratingDistribution;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private AppendixKeywordBingKeywordsDataPriceDataInfo search;

  public static final String SERIALIZED_NAME_SENTIMENT_ANALYSIS = "sentiment_analysis";
  @SerializedName(SERIALIZED_NAME_SENTIMENT_ANALYSIS)
  private AppendixKeywordBingKeywordsDataPriceDataInfo sentimentAnalysis;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private AppendixKeywordBingKeywordsDataPriceDataInfo summary;

  public AppendixContentAnalysisPriceData() {
  }

  public AppendixContentAnalysisPriceData categories(AppendixTaskKeywordsDataPriceDataInfo categories) {
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getCategories() {
    return categories;
  }

  public void setCategories(AppendixTaskKeywordsDataPriceDataInfo categories) {
    this.categories = categories;
  }


  public AppendixContentAnalysisPriceData categoryTrends(AppendixKeywordBingKeywordsDataPriceDataInfo categoryTrends) {
    this.categoryTrends = categoryTrends;
    return this;
  }

   /**
   * Get categoryTrends
   * @return categoryTrends
  **/
  @javax.annotation.Nullable
  public AppendixKeywordBingKeywordsDataPriceDataInfo getCategoryTrends() {
    return categoryTrends;
  }

  public void setCategoryTrends(AppendixKeywordBingKeywordsDataPriceDataInfo categoryTrends) {
    this.categoryTrends = categoryTrends;
  }


  public AppendixContentAnalysisPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getErrors() {
    return errors;
  }

  public void setErrors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
  }


  public AppendixContentAnalysisPriceData languages(AppendixTaskKeywordsDataPriceDataInfo languages) {
    this.languages = languages;
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLanguages() {
    return languages;
  }

  public void setLanguages(AppendixTaskKeywordsDataPriceDataInfo languages) {
    this.languages = languages;
  }


  public AppendixContentAnalysisPriceData locations(AppendixTaskKeywordsDataPriceDataInfo locations) {
    this.locations = locations;
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLocations() {
    return locations;
  }

  public void setLocations(AppendixTaskKeywordsDataPriceDataInfo locations) {
    this.locations = locations;
  }


  public AppendixContentAnalysisPriceData phraseTrends(AppendixKeywordBingKeywordsDataPriceDataInfo phraseTrends) {
    this.phraseTrends = phraseTrends;
    return this;
  }

   /**
   * Get phraseTrends
   * @return phraseTrends
  **/
  @javax.annotation.Nullable
  public AppendixKeywordBingKeywordsDataPriceDataInfo getPhraseTrends() {
    return phraseTrends;
  }

  public void setPhraseTrends(AppendixKeywordBingKeywordsDataPriceDataInfo phraseTrends) {
    this.phraseTrends = phraseTrends;
  }


  public AppendixContentAnalysisPriceData ratingDistribution(AppendixKeywordBingKeywordsDataPriceDataInfo ratingDistribution) {
    this.ratingDistribution = ratingDistribution;
    return this;
  }

   /**
   * Get ratingDistribution
   * @return ratingDistribution
  **/
  @javax.annotation.Nullable
  public AppendixKeywordBingKeywordsDataPriceDataInfo getRatingDistribution() {
    return ratingDistribution;
  }

  public void setRatingDistribution(AppendixKeywordBingKeywordsDataPriceDataInfo ratingDistribution) {
    this.ratingDistribution = ratingDistribution;
  }


  public AppendixContentAnalysisPriceData search(AppendixKeywordBingKeywordsDataPriceDataInfo search) {
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @javax.annotation.Nullable
  public AppendixKeywordBingKeywordsDataPriceDataInfo getSearch() {
    return search;
  }

  public void setSearch(AppendixKeywordBingKeywordsDataPriceDataInfo search) {
    this.search = search;
  }


  public AppendixContentAnalysisPriceData sentimentAnalysis(AppendixKeywordBingKeywordsDataPriceDataInfo sentimentAnalysis) {
    this.sentimentAnalysis = sentimentAnalysis;
    return this;
  }

   /**
   * Get sentimentAnalysis
   * @return sentimentAnalysis
  **/
  @javax.annotation.Nullable
  public AppendixKeywordBingKeywordsDataPriceDataInfo getSentimentAnalysis() {
    return sentimentAnalysis;
  }

  public void setSentimentAnalysis(AppendixKeywordBingKeywordsDataPriceDataInfo sentimentAnalysis) {
    this.sentimentAnalysis = sentimentAnalysis;
  }


  public AppendixContentAnalysisPriceData summary(AppendixKeywordBingKeywordsDataPriceDataInfo summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  public AppendixKeywordBingKeywordsDataPriceDataInfo getSummary() {
    return summary;
  }

  public void setSummary(AppendixKeywordBingKeywordsDataPriceDataInfo summary) {
    this.summary = summary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendixContentAnalysisPriceData appendixContentAnalysisPriceData = (AppendixContentAnalysisPriceData) o;
    return Objects.equals(this.categories, appendixContentAnalysisPriceData.categories) &&
        Objects.equals(this.categoryTrends, appendixContentAnalysisPriceData.categoryTrends) &&
        Objects.equals(this.errors, appendixContentAnalysisPriceData.errors) &&
        Objects.equals(this.languages, appendixContentAnalysisPriceData.languages) &&
        Objects.equals(this.locations, appendixContentAnalysisPriceData.locations) &&
        Objects.equals(this.phraseTrends, appendixContentAnalysisPriceData.phraseTrends) &&
        Objects.equals(this.ratingDistribution, appendixContentAnalysisPriceData.ratingDistribution) &&
        Objects.equals(this.search, appendixContentAnalysisPriceData.search) &&
        Objects.equals(this.sentimentAnalysis, appendixContentAnalysisPriceData.sentimentAnalysis) &&
        Objects.equals(this.summary, appendixContentAnalysisPriceData.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, categoryTrends, errors, languages, locations, phraseTrends, ratingDistribution, search, sentimentAnalysis, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendixContentAnalysisPriceData {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoryTrends: ").append(toIndentedString(categoryTrends)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    phraseTrends: ").append(toIndentedString(phraseTrends)).append("\n");
    sb.append("    ratingDistribution: ").append(toIndentedString(ratingDistribution)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    sentimentAnalysis: ").append(toIndentedString(sentimentAnalysis)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
    openapiFields.add("categories");
    openapiFields.add("category_trends");
    openapiFields.add("errors");
    openapiFields.add("languages");
    openapiFields.add("locations");
    openapiFields.add("phrase_trends");
    openapiFields.add("rating_distribution");
    openapiFields.add("search");
    openapiFields.add("sentiment_analysis");
    openapiFields.add("summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendixContentAnalysisPriceData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixContentAnalysisPriceData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixContentAnalysisPriceData is not found in the empty JSON string", AppendixContentAnalysisPriceData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppendixContentAnalysisPriceData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppendixContentAnalysisPriceData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `categories`
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("categories"));
      }
      // validate the optional field `category_trends`
      if (jsonObj.get("category_trends") != null && !jsonObj.get("category_trends").isJsonNull()) {
        AppendixKeywordBingKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("category_trends"));
      }
      // validate the optional field `errors`
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("errors"));
      }
      // validate the optional field `languages`
      if (jsonObj.get("languages") != null && !jsonObj.get("languages").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("languages"));
      }
      // validate the optional field `locations`
      if (jsonObj.get("locations") != null && !jsonObj.get("locations").isJsonNull()) {
        AppendixTaskKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("locations"));
      }
      // validate the optional field `phrase_trends`
      if (jsonObj.get("phrase_trends") != null && !jsonObj.get("phrase_trends").isJsonNull()) {
        AppendixKeywordBingKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("phrase_trends"));
      }
      // validate the optional field `rating_distribution`
      if (jsonObj.get("rating_distribution") != null && !jsonObj.get("rating_distribution").isJsonNull()) {
        AppendixKeywordBingKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("rating_distribution"));
      }
      // validate the optional field `search`
      if (jsonObj.get("search") != null && !jsonObj.get("search").isJsonNull()) {
        AppendixKeywordBingKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("search"));
      }
      // validate the optional field `sentiment_analysis`
      if (jsonObj.get("sentiment_analysis") != null && !jsonObj.get("sentiment_analysis").isJsonNull()) {
        AppendixKeywordBingKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("sentiment_analysis"));
      }
      // validate the optional field `summary`
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        AppendixKeywordBingKeywordsDataPriceDataInfo.validateJsonElement(jsonObj.get("summary"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixContentAnalysisPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixContentAnalysisPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixContentAnalysisPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixContentAnalysisPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixContentAnalysisPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixContentAnalysisPriceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendixContentAnalysisPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendixContentAnalysisPriceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendixContentAnalysisPriceData
  * @throws IOException if the JSON string is invalid with respect to AppendixContentAnalysisPriceData
  */
  public static AppendixContentAnalysisPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixContentAnalysisPriceData.class);
  }

 /**
  * Convert an instance of AppendixContentAnalysisPriceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


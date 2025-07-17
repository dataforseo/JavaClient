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



public class AppendixContentAnalysisPriceData  {


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private AppendixTaskKeywordsDataPriceDataInfo categories;

  public AppendixContentAnalysisPriceData categories(AppendixTaskKeywordsDataPriceDataInfo categories) {
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


  public static final String SERIALIZED_NAME_CATEGORY_TRENDS = "category_trends";
  @SerializedName(SERIALIZED_NAME_CATEGORY_TRENDS)
  private AppendixBingKeywordsDataPriceDataInfo categoryTrends;

  public AppendixContentAnalysisPriceData categoryTrends(AppendixBingKeywordsDataPriceDataInfo categoryTrends) {
    this.categoryTrends = categoryTrends;
    return this;
  }

  /**
   * 
   * @return categoryTrends
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getCategoryTrends() {
    return categoryTrends;
  }

  public void setCategoryTrends(AppendixBingKeywordsDataPriceDataInfo categoryTrends) {
    this.categoryTrends = categoryTrends;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public AppendixContentAnalysisPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
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


  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo languages;

  public AppendixContentAnalysisPriceData languages(AppendixTaskKeywordsDataPriceDataInfo languages) {
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

  public AppendixContentAnalysisPriceData locations(AppendixTaskKeywordsDataPriceDataInfo locations) {
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


  public static final String SERIALIZED_NAME_PHRASE_TRENDS = "phrase_trends";
  @SerializedName(SERIALIZED_NAME_PHRASE_TRENDS)
  private AppendixBingKeywordsDataPriceDataInfo phraseTrends;

  public AppendixContentAnalysisPriceData phraseTrends(AppendixBingKeywordsDataPriceDataInfo phraseTrends) {
    this.phraseTrends = phraseTrends;
    return this;
  }

  /**
   * 
   * @return phraseTrends
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getPhraseTrends() {
    return phraseTrends;
  }

  public void setPhraseTrends(AppendixBingKeywordsDataPriceDataInfo phraseTrends) {
    this.phraseTrends = phraseTrends;
  }


  public static final String SERIALIZED_NAME_RATING_DISTRIBUTION = "rating_distribution";
  @SerializedName(SERIALIZED_NAME_RATING_DISTRIBUTION)
  private AppendixBingKeywordsDataPriceDataInfo ratingDistribution;

  public AppendixContentAnalysisPriceData ratingDistribution(AppendixBingKeywordsDataPriceDataInfo ratingDistribution) {
    this.ratingDistribution = ratingDistribution;
    return this;
  }

  /**
   * 
   * @return ratingDistribution
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getRatingDistribution() {
    return ratingDistribution;
  }

  public void setRatingDistribution(AppendixBingKeywordsDataPriceDataInfo ratingDistribution) {
    this.ratingDistribution = ratingDistribution;
  }


  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private AppendixBingKeywordsDataPriceDataInfo search;

  public AppendixContentAnalysisPriceData search(AppendixBingKeywordsDataPriceDataInfo search) {
    this.search = search;
    return this;
  }

  /**
   * 
   * @return search
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getSearch() {
    return search;
  }

  public void setSearch(AppendixBingKeywordsDataPriceDataInfo search) {
    this.search = search;
  }


  public static final String SERIALIZED_NAME_SENTIMENT_ANALYSIS = "sentiment_analysis";
  @SerializedName(SERIALIZED_NAME_SENTIMENT_ANALYSIS)
  private AppendixBingKeywordsDataPriceDataInfo sentimentAnalysis;

  public AppendixContentAnalysisPriceData sentimentAnalysis(AppendixBingKeywordsDataPriceDataInfo sentimentAnalysis) {
    this.sentimentAnalysis = sentimentAnalysis;
    return this;
  }

  /**
   * 
   * @return sentimentAnalysis
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getSentimentAnalysis() {
    return sentimentAnalysis;
  }

  public void setSentimentAnalysis(AppendixBingKeywordsDataPriceDataInfo sentimentAnalysis) {
    this.sentimentAnalysis = sentimentAnalysis;
  }


  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private AppendixBingKeywordsDataPriceDataInfo summary;

  public AppendixContentAnalysisPriceData summary(AppendixBingKeywordsDataPriceDataInfo summary) {
    this.summary = summary;
    return this;
  }

  /**
   * 
   * @return summary
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getSummary() {
    return summary;
  }

  public void setSummary(AppendixBingKeywordsDataPriceDataInfo summary) {
    this.summary = summary;
  }



  public AppendixContentAnalysisPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixContentAnalysisPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixContentAnalysisPriceData appendixContentAnalysisPriceData = (AppendixContentAnalysisPriceData) o;
    return

        Objects.equals(this.categories, appendixContentAnalysisPriceData.categories) &&
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(categories, categoryTrends, errors, languages, locations, phraseTrends, ratingDistribution, search, sentimentAnalysis, summary);
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
           public AppendixContentAnalysisPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixContentAnalysisPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixContentAnalysisPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixContentAnalysisPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
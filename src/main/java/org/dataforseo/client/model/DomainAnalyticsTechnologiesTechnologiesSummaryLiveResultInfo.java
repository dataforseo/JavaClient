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
import java.util.HashMap;
import java.util.Map;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo {
  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private Map<String, Long> countries;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private Map<String, Long> languages;

  public static final String SERIALIZED_NAME_CONTENT_LANGUAGES = "content_languages";
  @SerializedName(SERIALIZED_NAME_CONTENT_LANGUAGES)
  private Map<String, Long> contentLanguages;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private Map<String, Long> keywords;

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo() {
  }

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo countries(Map<String, Long> countries) {
    this.countries = countries;
    return this;
  }

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo putCountriesItem(String key, Long countriesItem) {
    if (this.countries == null) {
      this.countries = new HashMap<>();
    }
    this.countries.put(key, countriesItem);
    return this;
  }

   /**
   * distribution of websites by country contains country codes and number of websites per country
   * @return countries
  **/
  @javax.annotation.Nullable
  public Map<String, Long> getCountries() {
    return countries;
  }

  public void setCountries(Map<String, Long> countries) {
    this.countries = countries;
  }


  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo languages(Map<String, Long> languages) {
    this.languages = languages;
    return this;
  }

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo putLanguagesItem(String key, Long languagesItem) {
    if (this.languages == null) {
      this.languages = new HashMap<>();
    }
    this.languages.put(key, languagesItem);
    return this;
  }

   /**
   * distribution of websites by language contains language codes and number of websites per language
   * @return languages
  **/
  @javax.annotation.Nullable
  public Map<String, Long> getLanguages() {
    return languages;
  }

  public void setLanguages(Map<String, Long> languages) {
    this.languages = languages;
  }


  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo contentLanguages(Map<String, Long> contentLanguages) {
    this.contentLanguages = contentLanguages;
    return this;
  }

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo putContentLanguagesItem(String key, Long contentLanguagesItem) {
    if (this.contentLanguages == null) {
      this.contentLanguages = new HashMap<>();
    }
    this.contentLanguages.put(key, contentLanguagesItem);
    return this;
  }

   /**
   * distribution of websites by content language contains content language codes and number of websites per language
   * @return contentLanguages
  **/
  @javax.annotation.Nullable
  public Map<String, Long> getContentLanguages() {
    return contentLanguages;
  }

  public void setContentLanguages(Map<String, Long> contentLanguages) {
    this.contentLanguages = contentLanguages;
  }


  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo keywords(Map<String, Long> keywords) {
    this.keywords = keywords;
    return this;
  }

  public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo putKeywordsItem(String key, Long keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new HashMap<>();
    }
    this.keywords.put(key, keywordsItem);
    return this;
  }

   /**
   * distribution of websites by keywords contains keywords found in the websites’ titles, descriptions or meta keywords, and number of websites using each keyword
   * @return keywords
  **/
  @javax.annotation.Nullable
  public Map<String, Long> getKeywords() {
    return keywords;
  }

  public void setKeywords(Map<String, Long> keywords) {
    this.keywords = keywords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo domainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo = (DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo) o;
    return Objects.equals(this.countries, domainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.countries) &&
        Objects.equals(this.languages, domainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.languages) &&
        Objects.equals(this.contentLanguages, domainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.contentLanguages) &&
        Objects.equals(this.keywords, domainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.keywords);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, languages, contentLanguages, keywords);
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
    sb.append("class DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo {\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    contentLanguages: ").append(toIndentedString(contentLanguages)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
    openapiFields.add("countries");
    openapiFields.add("languages");
    openapiFields.add("content_languages");
    openapiFields.add("keywords");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo is not found in the empty JSON string", DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo>() {
           @Override
           public void write(JsonWriter out, DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo
  * @throws IOException if the JSON string is invalid with respect to DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo
  */
  public static DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.class);
  }

 /**
  * Convert an instance of DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

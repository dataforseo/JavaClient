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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.dataforseo.client.model.KeywordAnnotations;
import org.dataforseo.client.model.MonthlySearches;
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
 * KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo {
  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_SEARCH_PARTNERS = "search_partners";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARTNERS)
  private Boolean searchPartners;

  public static final String SERIALIZED_NAME_COMPETITION = "competition";
  @SerializedName(SERIALIZED_NAME_COMPETITION)
  private String competition;

  public static final String SERIALIZED_NAME_COMPETITION_INDEX = "competition_index";
  @SerializedName(SERIALIZED_NAME_COMPETITION_INDEX)
  private Integer competitionIndex;

  public static final String SERIALIZED_NAME_SEARCH_VOLUME = "search_volume";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME)
  private Long searchVolume;

  public static final String SERIALIZED_NAME_LOW_TOP_OF_PAGE_BID = "low_top_of_page_bid";
  @SerializedName(SERIALIZED_NAME_LOW_TOP_OF_PAGE_BID)
  private Float lowTopOfPageBid;

  public static final String SERIALIZED_NAME_HIGH_TOP_OF_PAGE_BID = "high_top_of_page_bid";
  @SerializedName(SERIALIZED_NAME_HIGH_TOP_OF_PAGE_BID)
  private Float highTopOfPageBid;

  public static final String SERIALIZED_NAME_CPC = "cpc";
  @SerializedName(SERIALIZED_NAME_CPC)
  private Float cpc;

  public static final String SERIALIZED_NAME_MONTHLY_SEARCHES = "monthly_searches";
  @SerializedName(SERIALIZED_NAME_MONTHLY_SEARCHES)
  private List<MonthlySearches> monthlySearches;

  public static final String SERIALIZED_NAME_KEYWORD_ANNOTATIONS = "keyword_annotations";
  @SerializedName(SERIALIZED_NAME_KEYWORD_ANNOTATIONS)
  private KeywordAnnotations keywordAnnotations;

  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo() {
  }

  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * keyword in a POST array
   * @return keyword
  **/
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * location code in a POST array if there is no data, the value is null
   * @return locationCode
  **/
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * language code in a POST array if there is no data, the value is null
   * @return languageCode
  **/
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo searchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
    return this;
  }

   /**
   * include Google search partners the value you specified when setting the task if true, the results are returned for owned, operated, and syndicated networks across Google and partner sites that host Google search; if false, the results are returned for Google search sites only
   * @return searchPartners
  **/
  @javax.annotation.Nullable
  public Boolean getSearchPartners() {
    return searchPartners;
  }

  public void setSearchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo competition(String competition) {
    this.competition = competition;
    return this;
  }

   /**
   * competition represents the relative level of competition associated with the given keyword in paid SERP only possible values: LOW, MEDIUM, HIGH if competition level is unknown, the value is null; learn more about the metric in this help center article
   * @return competition
  **/
  @javax.annotation.Nullable
  public String getCompetition() {
    return competition;
  }

  public void setCompetition(String competition) {
    this.competition = competition;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo competitionIndex(Integer competitionIndex) {
    this.competitionIndex = competitionIndex;
    return this;
  }

   /**
   * competition index the competition index for the query indicating how competitive ad placement is for the keyword can take values from 0 to 100 the level of competition from 0 to 100 is determined by the number of ad slots filled divided by the total number of ad slots available if not enough data is available, the value is null; learn more about the metric in this help center article
   * @return competitionIndex
  **/
  @javax.annotation.Nullable
  public Integer getCompetitionIndex() {
    return competitionIndex;
  }

  public void setCompetitionIndex(Integer competitionIndex) {
    this.competitionIndex = competitionIndex;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo searchVolume(Long searchVolume) {
    this.searchVolume = searchVolume;
    return this;
  }

   /**
   * monthly average search volume rate represents the (approximate) number of searches for the given keyword idea either on google.com or google.com and partners, depending on the user’s targeting if there is no data, the value is null
   * @return searchVolume
  **/
  @javax.annotation.Nullable
  public Long getSearchVolume() {
    return searchVolume;
  }

  public void setSearchVolume(Long searchVolume) {
    this.searchVolume = searchVolume;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo lowTopOfPageBid(Float lowTopOfPageBid) {
    this.lowTopOfPageBid = lowTopOfPageBid;
    return this;
  }

   /**
   * minimum bid for the ad to be displayed at the top of the first page indicates the value greater than about 20% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers) the value may differ depending on the location specified in a POST request
   * @return lowTopOfPageBid
  **/
  @javax.annotation.Nullable
  public Float getLowTopOfPageBid() {
    return lowTopOfPageBid;
  }

  public void setLowTopOfPageBid(Float lowTopOfPageBid) {
    this.lowTopOfPageBid = lowTopOfPageBid;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo highTopOfPageBid(Float highTopOfPageBid) {
    this.highTopOfPageBid = highTopOfPageBid;
    return this;
  }

   /**
   * maximum bid for the ad to be displayed at the top of the first page indicates the value greater than about 80% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers) the value may differ depending on the location specified in a POST request
   * @return highTopOfPageBid
  **/
  @javax.annotation.Nullable
  public Float getHighTopOfPageBid() {
    return highTopOfPageBid;
  }

  public void setHighTopOfPageBid(Float highTopOfPageBid) {
    this.highTopOfPageBid = highTopOfPageBid;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo cpc(Float cpc) {
    this.cpc = cpc;
    return this;
  }

   /**
   * cost per click indicates the amount paid for each click on the ad displayed for a given keyword
   * @return cpc
  **/
  @javax.annotation.Nullable
  public Float getCpc() {
    return cpc;
  }

  public void setCpc(Float cpc) {
    this.cpc = cpc;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo monthlySearches(List<MonthlySearches> monthlySearches) {
    this.monthlySearches = monthlySearches;
    return this;
  }

  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo addMonthlySearchesItem(MonthlySearches monthlySearchesItem) {
    if (this.monthlySearches == null) {
      this.monthlySearches = new ArrayList<>();
    }
    this.monthlySearches.add(monthlySearchesItem);
    return this;
  }

   /**
   * monthly searches represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations if there is no data, the value is null
   * @return monthlySearches
  **/
  @javax.annotation.Nullable
  public List<MonthlySearches> getMonthlySearches() {
    return monthlySearches;
  }

  public void setMonthlySearches(List<MonthlySearches> monthlySearches) {
    this.monthlySearches = monthlySearches;
  }


  public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo keywordAnnotations(KeywordAnnotations keywordAnnotations) {
    this.keywordAnnotations = keywordAnnotations;
    return this;
  }

   /**
   * Get keywordAnnotations
   * @return keywordAnnotations
  **/
  @javax.annotation.Nullable
  public KeywordAnnotations getKeywordAnnotations() {
    return keywordAnnotations;
  }

  public void setKeywordAnnotations(KeywordAnnotations keywordAnnotations) {
    this.keywordAnnotations = keywordAnnotations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo = (KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo) o;
    return Objects.equals(this.keyword, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.keyword) &&
        Objects.equals(this.locationCode, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.locationCode) &&
        Objects.equals(this.languageCode, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.languageCode) &&
        Objects.equals(this.searchPartners, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.searchPartners) &&
        Objects.equals(this.competition, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.competition) &&
        Objects.equals(this.competitionIndex, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.competitionIndex) &&
        Objects.equals(this.searchVolume, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.searchVolume) &&
        Objects.equals(this.lowTopOfPageBid, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.lowTopOfPageBid) &&
        Objects.equals(this.highTopOfPageBid, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.highTopOfPageBid) &&
        Objects.equals(this.cpc, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.cpc) &&
        Objects.equals(this.monthlySearches, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.monthlySearches) &&
        Objects.equals(this.keywordAnnotations, keywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.keywordAnnotations);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, locationCode, languageCode, searchPartners, competition, competitionIndex, searchVolume, lowTopOfPageBid, highTopOfPageBid, cpc, monthlySearches, keywordAnnotations);
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
    sb.append("class KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    searchPartners: ").append(toIndentedString(searchPartners)).append("\n");
    sb.append("    competition: ").append(toIndentedString(competition)).append("\n");
    sb.append("    competitionIndex: ").append(toIndentedString(competitionIndex)).append("\n");
    sb.append("    searchVolume: ").append(toIndentedString(searchVolume)).append("\n");
    sb.append("    lowTopOfPageBid: ").append(toIndentedString(lowTopOfPageBid)).append("\n");
    sb.append("    highTopOfPageBid: ").append(toIndentedString(highTopOfPageBid)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
    sb.append("    monthlySearches: ").append(toIndentedString(monthlySearches)).append("\n");
    sb.append("    keywordAnnotations: ").append(toIndentedString(keywordAnnotations)).append("\n");
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
    openapiFields.add("keyword");
    openapiFields.add("location_code");
    openapiFields.add("language_code");
    openapiFields.add("search_partners");
    openapiFields.add("competition");
    openapiFields.add("competition_index");
    openapiFields.add("search_volume");
    openapiFields.add("low_top_of_page_bid");
    openapiFields.add("high_top_of_page_bid");
    openapiFields.add("cpc");
    openapiFields.add("monthly_searches");
    openapiFields.add("keyword_annotations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo is not found in the empty JSON string", KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      if ((jsonObj.get("competition") != null && !jsonObj.get("competition").isJsonNull()) && !jsonObj.get("competition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `competition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("competition").toString()));
      }
      if (jsonObj.get("monthly_searches") != null && !jsonObj.get("monthly_searches").isJsonNull()) {
        JsonArray jsonArraymonthlySearches = jsonObj.getAsJsonArray("monthly_searches");
        if (jsonArraymonthlySearches != null) {
          // ensure the json data is an array
          if (!jsonObj.get("monthly_searches").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `monthly_searches` to be an array in the JSON string but got `%s`", jsonObj.get("monthly_searches").toString()));
          }

          // validate the optional field `monthly_searches` (array)
          for (int i = 0; i < jsonArraymonthlySearches.size(); i++) {
            MonthlySearches.validateJsonElement(jsonArraymonthlySearches.get(i));
          };
        }
      }
      // validate the optional field `keyword_annotations`
      if (jsonObj.get("keyword_annotations") != null && !jsonObj.get("keyword_annotations").isJsonNull()) {
        KeywordAnnotations.validateJsonElement(jsonObj.get("keyword_annotations"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo>() {
           @Override
           public void write(JsonWriter out, KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo
  * @throws IOException if the JSON string is invalid with respect to KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo
  */
  public static KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.class);
  }

 /**
  * Convert an instance of KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

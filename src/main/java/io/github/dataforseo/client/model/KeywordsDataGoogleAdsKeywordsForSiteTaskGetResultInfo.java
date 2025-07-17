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



public class KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword in a POST array
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_SPELL = "spell";
  @SerializedName(SERIALIZED_NAME_SPELL)
  private String spell;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo spell(String spell) {
    this.spell = spell;
    return this;
  }

  /**
   * 
   * @return spell
   */
  @javax.annotation.Nullable
  public String getSpell() {
    return spell;
  }

  public void setSpell(String spell) {
    this.spell = spell;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code in a POST array
* if there is no data, the value is null
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code in a POST array
* if there is no data, the value is null
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_SEARCH_PARTNERS = "search_partners";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARTNERS)
  private Boolean searchPartners;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo searchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
    return this;
  }

  /**
   * include Google search partners
* the value you specified when setting the task
* if true, the results are returned for owned, operated, and syndicated networks across Google and partner sites that host Google search;
* if false, the results are returned for Google search sites only
   * @return searchPartners
   */
  @javax.annotation.Nullable
  public Boolean getSearchPartners() {
    return searchPartners;
  }

  public void setSearchPartners(Boolean searchPartners) {
    this.searchPartners = searchPartners;
  }


  public static final String SERIALIZED_NAME_COMPETITION = "competition";
  @SerializedName(SERIALIZED_NAME_COMPETITION)
  private String competition;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo competition(String competition) {
    this.competition = competition;
    return this;
  }

  /**
   * competition
* represents the relative level of competition associated with the given keyword in paid SERP only
* possible values: LOW, MEDIUM, HIGH
* if competition level is unknown, the value is null;
* learn more about the metric in this help center article
   * @return competition
   */
  @javax.annotation.Nullable
  public String getCompetition() {
    return competition;
  }

  public void setCompetition(String competition) {
    this.competition = competition;
  }


  public static final String SERIALIZED_NAME_COMPETITION_INDEX = "competition_index";
  @SerializedName(SERIALIZED_NAME_COMPETITION_INDEX)
  private Integer competitionIndex;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo competitionIndex(Integer competitionIndex) {
    this.competitionIndex = competitionIndex;
    return this;
  }

  /**
   * competition index
* the competition index for the query indicating how competitive ad placement is for the keyword
* can take values from 0 to 100
* the level of competition from 0 to 100 is determined by the number of ad slots filled divided by the total number of ad slots available
* if not enough data is available, the value is null;
* learn more about the metric in this help center article
   * @return competitionIndex
   */
  @javax.annotation.Nullable
  public Integer getCompetitionIndex() {
    return competitionIndex;
  }

  public void setCompetitionIndex(Integer competitionIndex) {
    this.competitionIndex = competitionIndex;
  }


  public static final String SERIALIZED_NAME_SEARCH_VOLUME = "search_volume";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME)
  private Long searchVolume;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo searchVolume(Long searchVolume) {
    this.searchVolume = searchVolume;
    return this;
  }

  /**
   * monthly average search volume rate
* represents the (approximate) number of searches for the given keyword idea either on google.com or google.com and partners, depending on the user’s targeting
* if there is no data, the value is null
   * @return searchVolume
   */
  @javax.annotation.Nullable
  public Long getSearchVolume() {
    return searchVolume;
  }

  public void setSearchVolume(Long searchVolume) {
    this.searchVolume = searchVolume;
  }


  public static final String SERIALIZED_NAME_LOW_TOP_OF_PAGE_BID = "low_top_of_page_bid";
  @SerializedName(SERIALIZED_NAME_LOW_TOP_OF_PAGE_BID)
  private Double lowTopOfPageBid;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo lowTopOfPageBid(Double lowTopOfPageBid) {
    this.lowTopOfPageBid = lowTopOfPageBid;
    return this;
  }

  /**
   * minimum bid for the ad to be displayed at the top of the first page
* indicates the value greater than about 20% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers)
* the value may differ depending on the location specified in a POST request
   * @return lowTopOfPageBid
   */
  @javax.annotation.Nullable
  public Double getLowTopOfPageBid() {
    return lowTopOfPageBid;
  }

  public void setLowTopOfPageBid(Double lowTopOfPageBid) {
    this.lowTopOfPageBid = lowTopOfPageBid;
  }


  public static final String SERIALIZED_NAME_HIGH_TOP_OF_PAGE_BID = "high_top_of_page_bid";
  @SerializedName(SERIALIZED_NAME_HIGH_TOP_OF_PAGE_BID)
  private Double highTopOfPageBid;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo highTopOfPageBid(Double highTopOfPageBid) {
    this.highTopOfPageBid = highTopOfPageBid;
    return this;
  }

  /**
   * maximum bid for the ad to be displayed at the top of the first page
* indicates the value greater than about 80% of the lowest bids for which ads were displayed (based on Google Ads statistics for advertisers)
* the value may differ depending on the location specified in a POST request
   * @return highTopOfPageBid
   */
  @javax.annotation.Nullable
  public Double getHighTopOfPageBid() {
    return highTopOfPageBid;
  }

  public void setHighTopOfPageBid(Double highTopOfPageBid) {
    this.highTopOfPageBid = highTopOfPageBid;
  }


  public static final String SERIALIZED_NAME_CPC = "cpc";
  @SerializedName(SERIALIZED_NAME_CPC)
  private Double cpc;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo cpc(Double cpc) {
    this.cpc = cpc;
    return this;
  }

  /**
   * cost per click
* indicates the amount paid for each click on the ad displayed for a given keyword
   * @return cpc
   */
  @javax.annotation.Nullable
  public Double getCpc() {
    return cpc;
  }

  public void setCpc(Double cpc) {
    this.cpc = cpc;
  }


  public static final String SERIALIZED_NAME_MONTHLY_SEARCHES = "monthly_searches";
  @SerializedName(SERIALIZED_NAME_MONTHLY_SEARCHES)
  private List<MonthlySearchesInfo> monthlySearches;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo monthlySearches(List<MonthlySearchesInfo> monthlySearches) {
    this.monthlySearches = monthlySearches;
    return this;
  }

  /**
   * monthly searches
* represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations
* if there is no data, the value is null
   * @return monthlySearches
   */
  @javax.annotation.Nullable
  public List<MonthlySearchesInfo> getMonthlySearches() {
    return monthlySearches;
  }

  public void setMonthlySearches(List<MonthlySearchesInfo> monthlySearches) {
    this.monthlySearches = monthlySearches;
  }



  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo putAdditionalProperty(String key, Object value) {
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


    
    KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo = (KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo) o;
    return

        Objects.equals(this.keyword, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.keyword) &&
        Objects.equals(this.spell, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.spell) &&
        Objects.equals(this.locationCode, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.locationCode) &&
        Objects.equals(this.languageCode, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.languageCode) &&
        Objects.equals(this.searchPartners, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.searchPartners) &&
        Objects.equals(this.competition, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.competition) &&
        Objects.equals(this.competitionIndex, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.competitionIndex) &&
        Objects.equals(this.searchVolume, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.searchVolume) &&
        Objects.equals(this.lowTopOfPageBid, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.lowTopOfPageBid) &&
        Objects.equals(this.highTopOfPageBid, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.highTopOfPageBid) &&
        Objects.equals(this.cpc, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.cpc) &&
        Objects.equals(this.monthlySearches, keywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.monthlySearches);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, spell, locationCode, languageCode, searchPartners, competition, competitionIndex, searchVolume, lowTopOfPageBid, highTopOfPageBid, cpc, monthlySearches);
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
    sb.append("class KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    spell: ").append(toIndentedString(spell)).append("\n");
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
    
    openapiFields.add("spell");
    
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
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo>() {
           @Override
           public void write(JsonWriter out, KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo value) throws IOException {
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
           public KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
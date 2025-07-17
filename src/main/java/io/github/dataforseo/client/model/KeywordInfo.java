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



public class KeywordInfo  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public KeywordInfo seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * search engine type
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public static final String SERIALIZED_NAME_LAST_UPDATED_TIME = "last_updated_time";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_TIME)
  private String lastUpdatedTime;

  public KeywordInfo lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * date and time when keyword data was updated
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return lastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_COMPETITION = "competition";
  @SerializedName(SERIALIZED_NAME_COMPETITION)
  private Double competition;

  public KeywordInfo competition(Double competition) {
    this.competition = competition;
    return this;
  }

  /**
   * competition
* represents the relative amount of competition associated with the given keyword. This value is based on Google Ads data and can be between 0 and 1 (inclusive)
   * @return competition
   */
  @javax.annotation.Nullable
  public Double getCompetition() {
    return competition;
  }

  public void setCompetition(Double competition) {
    this.competition = competition;
  }


  public static final String SERIALIZED_NAME_COMPETITION_LEVEL = "competition_level";
  @SerializedName(SERIALIZED_NAME_COMPETITION_LEVEL)
  private String competitionLevel;

  public KeywordInfo competitionLevel(String competitionLevel) {
    this.competitionLevel = competitionLevel;
    return this;
  }

  /**
   * competition level
* represents the relative level of competition associated with the given keyword in paid SERP only;
* possible values: LOW, MEDIUM, HIGH
* if competition level is unknown, the value is null;
* learn more about the metric in this help center article
   * @return competitionLevel
   */
  @javax.annotation.Nullable
  public String getCompetitionLevel() {
    return competitionLevel;
  }

  public void setCompetitionLevel(String competitionLevel) {
    this.competitionLevel = competitionLevel;
  }


  public static final String SERIALIZED_NAME_CPC = "cpc";
  @SerializedName(SERIALIZED_NAME_CPC)
  private Double cpc;

  public KeywordInfo cpc(Double cpc) {
    this.cpc = cpc;
    return this;
  }

  /**
   * cost-per-click
* represents the average cost per click (USD) historically paid for the keyword
   * @return cpc
   */
  @javax.annotation.Nullable
  public Double getCpc() {
    return cpc;
  }

  public void setCpc(Double cpc) {
    this.cpc = cpc;
  }


  public static final String SERIALIZED_NAME_SEARCH_VOLUME = "search_volume";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME)
  private Long searchVolume;

  public KeywordInfo searchVolume(Long searchVolume) {
    this.searchVolume = searchVolume;
    return this;
  }

  /**
   * average monthly search volume rate
* represents the (approximate) number of searches for the given keyword idea on google.com
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

  public KeywordInfo lowTopOfPageBid(Double lowTopOfPageBid) {
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

  public KeywordInfo highTopOfPageBid(Double highTopOfPageBid) {
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


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Integer> categories;

  public KeywordInfo categories(List<Integer> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * product and service categories
* you can download the full list of possible categories
   * @return categories
   */
  @javax.annotation.Nullable
  public List<Integer> getCategories() {
    return categories;
  }

  public void setCategories(List<Integer> categories) {
    this.categories = categories;
  }


  public static final String SERIALIZED_NAME_MONTHLY_SEARCHES = "monthly_searches";
  @SerializedName(SERIALIZED_NAME_MONTHLY_SEARCHES)
  private List<MonthlySearchesInfo> monthlySearches;

  public KeywordInfo monthlySearches(List<MonthlySearchesInfo> monthlySearches) {
    this.monthlySearches = monthlySearches;
    return this;
  }

  /**
   * monthly searches
* represents the (approximate) number of searches on this keyword idea (as available for the past twelve months), targeted to the specified geographic locations
   * @return monthlySearches
   */
  @javax.annotation.Nullable
  public List<MonthlySearchesInfo> getMonthlySearches() {
    return monthlySearches;
  }

  public void setMonthlySearches(List<MonthlySearchesInfo> monthlySearches) {
    this.monthlySearches = monthlySearches;
  }


  public static final String SERIALIZED_NAME_SEARCH_VOLUME_TREND = "search_volume_trend";
  @SerializedName(SERIALIZED_NAME_SEARCH_VOLUME_TREND)
  private SearchVolumeTrend searchVolumeTrend;

  public KeywordInfo searchVolumeTrend(SearchVolumeTrend searchVolumeTrend) {
    this.searchVolumeTrend = searchVolumeTrend;
    return this;
  }

  /**
   * search volume trend changes
* represents search volume change in percent compared to the previous period
   * @return searchVolumeTrend
   */
  @javax.annotation.Nullable
  public SearchVolumeTrend getSearchVolumeTrend() {
    return searchVolumeTrend;
  }

  public void setSearchVolumeTrend(SearchVolumeTrend searchVolumeTrend) {
    this.searchVolumeTrend = searchVolumeTrend;
  }



  public KeywordInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordInfo putAdditionalProperty(String key, Object value) {
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


    
    KeywordInfo keywordInfo = (KeywordInfo) o;
    return

        Objects.equals(this.seType, keywordInfo.seType) &&
        Objects.equals(this.lastUpdatedTime, keywordInfo.lastUpdatedTime) &&
        Objects.equals(this.competition, keywordInfo.competition) &&
        Objects.equals(this.competitionLevel, keywordInfo.competitionLevel) &&
        Objects.equals(this.cpc, keywordInfo.cpc) &&
        Objects.equals(this.searchVolume, keywordInfo.searchVolume) &&
        Objects.equals(this.lowTopOfPageBid, keywordInfo.lowTopOfPageBid) &&
        Objects.equals(this.highTopOfPageBid, keywordInfo.highTopOfPageBid) &&
        Objects.equals(this.categories, keywordInfo.categories) &&
        Objects.equals(this.monthlySearches, keywordInfo.monthlySearches) &&
        Objects.equals(this.searchVolumeTrend, keywordInfo.searchVolumeTrend);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, lastUpdatedTime, competition, competitionLevel, cpc, searchVolume, lowTopOfPageBid, highTopOfPageBid, categories, monthlySearches, searchVolumeTrend);
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
    sb.append("class KeywordInfo {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    competition: ").append(toIndentedString(competition)).append("\n");
    sb.append("    competitionLevel: ").append(toIndentedString(competitionLevel)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
    sb.append("    searchVolume: ").append(toIndentedString(searchVolume)).append("\n");
    sb.append("    lowTopOfPageBid: ").append(toIndentedString(lowTopOfPageBid)).append("\n");
    sb.append("    highTopOfPageBid: ").append(toIndentedString(highTopOfPageBid)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    monthlySearches: ").append(toIndentedString(monthlySearches)).append("\n");
    sb.append("    searchVolumeTrend: ").append(toIndentedString(searchVolumeTrend)).append("\n");
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
    
    openapiFields.add("se_type");
    
    openapiFields.add("last_updated_time");
    
    openapiFields.add("competition");
    
    openapiFields.add("competition_level");
    
    openapiFields.add("cpc");
    
    openapiFields.add("search_volume");
    
    openapiFields.add("low_top_of_page_bid");
    
    openapiFields.add("high_top_of_page_bid");
    
    openapiFields.add("categories");
    
    openapiFields.add("monthly_searches");
    
    openapiFields.add("search_volume_trend");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordInfo>() {
           @Override
           public void write(JsonWriter out, KeywordInfo value) throws IOException {
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
           public KeywordInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
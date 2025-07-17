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



public class KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo keyword(String keyword) {
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


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code in a POST array
* if there is no data, then the value is null
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

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code in a POST array
* if there is no data, then the value is null
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_DATE_INTERVAL = "date_interval";
  @SerializedName(SERIALIZED_NAME_DATE_INTERVAL)
  private String dateInterval;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo dateInterval(String dateInterval) {
    this.dateInterval = dateInterval;
    return this;
  }

  /**
   * forecasting date interval in a POST array
   * @return dateInterval
   */
  @javax.annotation.Nullable
  public String getDateInterval() {
    return dateInterval;
  }

  public void setDateInterval(String dateInterval) {
    this.dateInterval = dateInterval;
  }


  public static final String SERIALIZED_NAME_SEARCH_PARTNERS = "search_partners";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARTNERS)
  private Boolean searchPartners;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo searchPartners(Boolean searchPartners) {
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


  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo bid(Double bid) {
    this.bid = bid;
    return this;
  }

  /**
   * the maximum custom bid
* the bid you have specified when setting the task
* represents the price you are willing to pay for an ad
* the higher value you have specified, the higher metrics and cost you receive in response
* learn more in this help center article
   * @return bid
   */
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }

  public void setBid(Double bid) {
    this.bid = bid;
  }


  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private String match;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo match(String match) {
    this.match = match;
    return this;
  }

  /**
   * keywords match-type
* can take the following values: exact, broad, phrase
   * @return match
   */
  @javax.annotation.Nullable
  public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }


  public static final String SERIALIZED_NAME_IMPRESSIONS = "impressions";
  @SerializedName(SERIALIZED_NAME_IMPRESSIONS)
  private Integer impressions;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo impressions(Integer impressions) {
    this.impressions = impressions;
    return this;
  }

  /**
   * projected number of ad impressions
* number of impressions an ad is projected to get within the specified time period
* if there is no data, then the value is null
* learn more about impressions in this help center article
   * @return impressions
   */
  @javax.annotation.Nullable
  public Integer getImpressions() {
    return impressions;
  }

  public void setImpressions(Integer impressions) {
    this.impressions = impressions;
  }


  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo ctr(Double ctr) {
    this.ctr = ctr;
    return this;
  }

  /**
   * projected click through rate (CTR) of the advertisement
* number of clicks an ad is projected to receive divided by the number of ad impressions; the CTR is projected for the specified time period
* if there is no data, then the value is null
   * @return ctr
   */
  @javax.annotation.Nullable
  public Double getCtr() {
    return ctr;
  }

  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public static final String SERIALIZED_NAME_AVERAGE_CPC = "average_cpc";
  @SerializedName(SERIALIZED_NAME_AVERAGE_CPC)
  private Double averageCpc;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo averageCpc(Double averageCpc) {
    this.averageCpc = averageCpc;
    return this;
  }

  /**
   * the average cost-per-click value
* represents the cost-per-click (USD) estimated for a keyword based on the specified time period and historical data;
* if there is no data, then the value is null
   * @return averageCpc
   */
  @javax.annotation.Nullable
  public Double getAverageCpc() {
    return averageCpc;
  }

  public void setAverageCpc(Double averageCpc) {
    this.averageCpc = averageCpc;
  }


  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo cost(Double cost) {
    this.cost = cost;
    return this;
  }

  /**
   * charge for an ad
* amount that will be charged for running an ad within the specified time period
* if there is no data, then the value is null
   * @return cost
   */
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }


  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Double clicks;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo clicks(Double clicks) {
    this.clicks = clicks;
    return this;
  }

  /**
   * number of clicks on an ad
* number of clicks an ad is projected to get within the specified time period
* if there is no data, then the value is null
   * @return clicks
   */
  @javax.annotation.Nullable
  public Double getClicks() {
    return clicks;
  }

  public void setClicks(Double clicks) {
    this.clicks = clicks;
  }



  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo putAdditionalProperty(String key, Object value) {
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


    
    KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo = (KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo) o;
    return

        Objects.equals(this.keyword, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.keyword) &&
        Objects.equals(this.locationCode, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.locationCode) &&
        Objects.equals(this.languageCode, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.languageCode) &&
        Objects.equals(this.dateInterval, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.dateInterval) &&
        Objects.equals(this.searchPartners, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.searchPartners) &&
        Objects.equals(this.bid, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.bid) &&
        Objects.equals(this.match, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.match) &&
        Objects.equals(this.impressions, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.impressions) &&
        Objects.equals(this.ctr, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.ctr) &&
        Objects.equals(this.averageCpc, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.averageCpc) &&
        Objects.equals(this.cost, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.cost) &&
        Objects.equals(this.clicks, keywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.clicks);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, locationCode, languageCode, dateInterval, searchPartners, bid, match, impressions, ctr, averageCpc, cost, clicks);
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
    sb.append("class KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    dateInterval: ").append(toIndentedString(dateInterval)).append("\n");
    sb.append("    searchPartners: ").append(toIndentedString(searchPartners)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    averageCpc: ").append(toIndentedString(averageCpc)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
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
    
    openapiFields.add("date_interval");
    
    openapiFields.add("search_partners");
    
    openapiFields.add("bid");
    
    openapiFields.add("match");
    
    openapiFields.add("impressions");
    
    openapiFields.add("ctr");
    
    openapiFields.add("average_cpc");
    
    openapiFields.add("cost");
    
    openapiFields.add("clicks");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo>() {
           @Override
           public void write(JsonWriter out, KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo value) throws IOException {
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
           public KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
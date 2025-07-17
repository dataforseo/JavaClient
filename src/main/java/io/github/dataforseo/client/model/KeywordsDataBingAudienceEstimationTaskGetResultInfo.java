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



public class KeywordsDataBingAudienceEstimationTaskGetResultInfo  {


  public static final String SERIALIZED_NAME_EST_IMPRESSIONS = "est_impressions";
  @SerializedName(SERIALIZED_NAME_EST_IMPRESSIONS)
  private AudienceEstimationInfo estImpressions;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo estImpressions(AudienceEstimationInfo estImpressions) {
    this.estImpressions = estImpressions;
    return this;
  }

  /**
   * monthly estimated impressions range
   * @return estImpressions
   */
  @javax.annotation.Nullable
  public AudienceEstimationInfo getEstImpressions() {
    return estImpressions;
  }

  public void setEstImpressions(AudienceEstimationInfo estImpressions) {
    this.estImpressions = estImpressions;
  }


  public static final String SERIALIZED_NAME_EST_AUDIENCE_SIZE = "est_audience_size";
  @SerializedName(SERIALIZED_NAME_EST_AUDIENCE_SIZE)
  private AudienceEstimationInfo estAudienceSize;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo estAudienceSize(AudienceEstimationInfo estAudienceSize) {
    this.estAudienceSize = estAudienceSize;
    return this;
  }

  /**
   * monthly estimated reach user count range
   * @return estAudienceSize
   */
  @javax.annotation.Nullable
  public AudienceEstimationInfo getEstAudienceSize() {
    return estAudienceSize;
  }

  public void setEstAudienceSize(AudienceEstimationInfo estAudienceSize) {
    this.estAudienceSize = estAudienceSize;
  }


  public static final String SERIALIZED_NAME_EST_CLICKS = "est_clicks";
  @SerializedName(SERIALIZED_NAME_EST_CLICKS)
  private AudienceEstimationInfo estClicks;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo estClicks(AudienceEstimationInfo estClicks) {
    this.estClicks = estClicks;
    return this;
  }

  /**
   * monthly estimated click count range
   * @return estClicks
   */
  @javax.annotation.Nullable
  public AudienceEstimationInfo getEstClicks() {
    return estClicks;
  }

  public void setEstClicks(AudienceEstimationInfo estClicks) {
    this.estClicks = estClicks;
  }


  public static final String SERIALIZED_NAME_EST_SPEND = "est_spend";
  @SerializedName(SERIALIZED_NAME_EST_SPEND)
  private AudienceEstimationInfo estSpend;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo estSpend(AudienceEstimationInfo estSpend) {
    this.estSpend = estSpend;
    return this;
  }

  /**
   * monthly estimated spending range
   * @return estSpend
   */
  @javax.annotation.Nullable
  public AudienceEstimationInfo getEstSpend() {
    return estSpend;
  }

  public void setEstSpend(AudienceEstimationInfo estSpend) {
    this.estSpend = estSpend;
  }


  public static final String SERIALIZED_NAME_EST_COST_PER_EVENT = "est_cost_per_event";
  @SerializedName(SERIALIZED_NAME_EST_COST_PER_EVENT)
  private AudienceEstimationInfo estCostPerEvent;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo estCostPerEvent(AudienceEstimationInfo estCostPerEvent) {
    this.estCostPerEvent = estCostPerEvent;
    return this;
  }

  /**
   * indicates the estimated cost per event with range result
   * @return estCostPerEvent
   */
  @javax.annotation.Nullable
  public AudienceEstimationInfo getEstCostPerEvent() {
    return estCostPerEvent;
  }

  public void setEstCostPerEvent(AudienceEstimationInfo estCostPerEvent) {
    this.estCostPerEvent = estCostPerEvent;
  }


  public static final String SERIALIZED_NAME_EST_CTR = "est_ctr";
  @SerializedName(SERIALIZED_NAME_EST_CTR)
  private AudienceEstimationInfo estCtr;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo estCtr(AudienceEstimationInfo estCtr) {
    this.estCtr = estCtr;
    return this;
  }

  /**
   * estimated click-through rate range
   * @return estCtr
   */
  @javax.annotation.Nullable
  public AudienceEstimationInfo getEstCtr() {
    return estCtr;
  }

  public void setEstCtr(AudienceEstimationInfo estCtr) {
    this.estCtr = estCtr;
  }


  public static final String SERIALIZED_NAME_SUGGESTED_BID = "suggested_bid";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_BID)
  private Double suggestedBid;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo suggestedBid(Double suggestedBid) {
    this.suggestedBid = suggestedBid;
    return this;
  }

  /**
   * suggested bid value under the current targeting
   * @return suggestedBid
   */
  @javax.annotation.Nullable
  public Double getSuggestedBid() {
    return suggestedBid;
  }

  public void setSuggestedBid(Double suggestedBid) {
    this.suggestedBid = suggestedBid;
  }


  public static final String SERIALIZED_NAME_SUGGESTED_BUDGET = "suggested_budget";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_BUDGET)
  private Double suggestedBudget;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo suggestedBudget(Double suggestedBudget) {
    this.suggestedBudget = suggestedBudget;
    return this;
  }

  /**
   * suggested daily budget value under the current targeting and bid
   * @return suggestedBudget
   */
  @javax.annotation.Nullable
  public Double getSuggestedBudget() {
    return suggestedBudget;
  }

  public void setSuggestedBudget(Double suggestedBudget) {
    this.suggestedBudget = suggestedBudget;
  }


  public static final String SERIALIZED_NAME_EVENTS_LOST_TO_BID = "events_lost_to_bid";
  @SerializedName(SERIALIZED_NAME_EVENTS_LOST_TO_BID)
  private Long eventsLostToBid;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo eventsLostToBid(Long eventsLostToBid) {
    this.eventsLostToBid = eventsLostToBid;
    return this;
  }

  /**
   * indicates event lost count due to insufficient input bid
   * @return eventsLostToBid
   */
  @javax.annotation.Nullable
  public Long getEventsLostToBid() {
    return eventsLostToBid;
  }

  public void setEventsLostToBid(Long eventsLostToBid) {
    this.eventsLostToBid = eventsLostToBid;
  }


  public static final String SERIALIZED_NAME_EVENTS_LOST_TO_BUDGET = "events_lost_to_budget";
  @SerializedName(SERIALIZED_NAME_EVENTS_LOST_TO_BUDGET)
  private Integer eventsLostToBudget;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo eventsLostToBudget(Integer eventsLostToBudget) {
    this.eventsLostToBudget = eventsLostToBudget;
    return this;
  }

  /**
   * indicates the event lost count due to insufficient input budget
   * @return eventsLostToBudget
   */
  @javax.annotation.Nullable
  public Integer getEventsLostToBudget() {
    return eventsLostToBudget;
  }

  public void setEventsLostToBudget(Integer eventsLostToBudget) {
    this.eventsLostToBudget = eventsLostToBudget;
  }


  public static final String SERIALIZED_NAME_EST_REACH_AUDIENCE_SIZE = "est_reach_audience_size";
  @SerializedName(SERIALIZED_NAME_EST_REACH_AUDIENCE_SIZE)
  private Long estReachAudienceSize;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo estReachAudienceSize(Long estReachAudienceSize) {
    this.estReachAudienceSize = estReachAudienceSize;
    return this;
  }

  /**
   * monthly estimated user count
   * @return estReachAudienceSize
   */
  @javax.annotation.Nullable
  public Long getEstReachAudienceSize() {
    return estReachAudienceSize;
  }

  public void setEstReachAudienceSize(Long estReachAudienceSize) {
    this.estReachAudienceSize = estReachAudienceSize;
  }


  public static final String SERIALIZED_NAME_EST_REACH_IMPRESSIONS = "est_reach_impressions";
  @SerializedName(SERIALIZED_NAME_EST_REACH_IMPRESSIONS)
  private Long estReachImpressions;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo estReachImpressions(Long estReachImpressions) {
    this.estReachImpressions = estReachImpressions;
    return this;
  }

  /**
   * monthly estimated impressions
   * @return estReachImpressions
   */
  @javax.annotation.Nullable
  public Long getEstReachImpressions() {
    return estReachImpressions;
  }

  public void setEstReachImpressions(Long estReachImpressions) {
    this.estReachImpressions = estReachImpressions;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * currency name
* example: USDollar
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }



  public KeywordsDataBingAudienceEstimationTaskGetResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordsDataBingAudienceEstimationTaskGetResultInfo putAdditionalProperty(String key, Object value) {
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


    
    KeywordsDataBingAudienceEstimationTaskGetResultInfo keywordsDataBingAudienceEstimationTaskGetResultInfo = (KeywordsDataBingAudienceEstimationTaskGetResultInfo) o;
    return

        Objects.equals(this.estImpressions, keywordsDataBingAudienceEstimationTaskGetResultInfo.estImpressions) &&
        Objects.equals(this.estAudienceSize, keywordsDataBingAudienceEstimationTaskGetResultInfo.estAudienceSize) &&
        Objects.equals(this.estClicks, keywordsDataBingAudienceEstimationTaskGetResultInfo.estClicks) &&
        Objects.equals(this.estSpend, keywordsDataBingAudienceEstimationTaskGetResultInfo.estSpend) &&
        Objects.equals(this.estCostPerEvent, keywordsDataBingAudienceEstimationTaskGetResultInfo.estCostPerEvent) &&
        Objects.equals(this.estCtr, keywordsDataBingAudienceEstimationTaskGetResultInfo.estCtr) &&
        Objects.equals(this.suggestedBid, keywordsDataBingAudienceEstimationTaskGetResultInfo.suggestedBid) &&
        Objects.equals(this.suggestedBudget, keywordsDataBingAudienceEstimationTaskGetResultInfo.suggestedBudget) &&
        Objects.equals(this.eventsLostToBid, keywordsDataBingAudienceEstimationTaskGetResultInfo.eventsLostToBid) &&
        Objects.equals(this.eventsLostToBudget, keywordsDataBingAudienceEstimationTaskGetResultInfo.eventsLostToBudget) &&
        Objects.equals(this.estReachAudienceSize, keywordsDataBingAudienceEstimationTaskGetResultInfo.estReachAudienceSize) &&
        Objects.equals(this.estReachImpressions, keywordsDataBingAudienceEstimationTaskGetResultInfo.estReachImpressions) &&
        Objects.equals(this.currency, keywordsDataBingAudienceEstimationTaskGetResultInfo.currency);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(estImpressions, estAudienceSize, estClicks, estSpend, estCostPerEvent, estCtr, suggestedBid, suggestedBudget, eventsLostToBid, eventsLostToBudget, estReachAudienceSize, estReachImpressions, currency);
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
    sb.append("class KeywordsDataBingAudienceEstimationTaskGetResultInfo {\n");

    sb.append("    estImpressions: ").append(toIndentedString(estImpressions)).append("\n");
    sb.append("    estAudienceSize: ").append(toIndentedString(estAudienceSize)).append("\n");
    sb.append("    estClicks: ").append(toIndentedString(estClicks)).append("\n");
    sb.append("    estSpend: ").append(toIndentedString(estSpend)).append("\n");
    sb.append("    estCostPerEvent: ").append(toIndentedString(estCostPerEvent)).append("\n");
    sb.append("    estCtr: ").append(toIndentedString(estCtr)).append("\n");
    sb.append("    suggestedBid: ").append(toIndentedString(suggestedBid)).append("\n");
    sb.append("    suggestedBudget: ").append(toIndentedString(suggestedBudget)).append("\n");
    sb.append("    eventsLostToBid: ").append(toIndentedString(eventsLostToBid)).append("\n");
    sb.append("    eventsLostToBudget: ").append(toIndentedString(eventsLostToBudget)).append("\n");
    sb.append("    estReachAudienceSize: ").append(toIndentedString(estReachAudienceSize)).append("\n");
    sb.append("    estReachImpressions: ").append(toIndentedString(estReachImpressions)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    
    openapiFields.add("est_impressions");
    
    openapiFields.add("est_audience_size");
    
    openapiFields.add("est_clicks");
    
    openapiFields.add("est_spend");
    
    openapiFields.add("est_cost_per_event");
    
    openapiFields.add("est_ctr");
    
    openapiFields.add("suggested_bid");
    
    openapiFields.add("suggested_budget");
    
    openapiFields.add("events_lost_to_bid");
    
    openapiFields.add("events_lost_to_budget");
    
    openapiFields.add("est_reach_audience_size");
    
    openapiFields.add("est_reach_impressions");
    
    openapiFields.add("currency");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordsDataBingAudienceEstimationTaskGetResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordsDataBingAudienceEstimationTaskGetResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordsDataBingAudienceEstimationTaskGetResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordsDataBingAudienceEstimationTaskGetResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordsDataBingAudienceEstimationTaskGetResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordsDataBingAudienceEstimationTaskGetResultInfo>() {
           @Override
           public void write(JsonWriter out, KeywordsDataBingAudienceEstimationTaskGetResultInfo value) throws IOException {
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
           public KeywordsDataBingAudienceEstimationTaskGetResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordsDataBingAudienceEstimationTaskGetResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordsDataBingAudienceEstimationTaskGetResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordsDataBingAudienceEstimationTaskGetResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
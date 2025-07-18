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



public class KeywordKpiInfo  {


  public static final String SERIALIZED_NAME_AD_POSITION = "ad_position";
  @SerializedName(SERIALIZED_NAME_AD_POSITION)
  private String adPosition;

  public KeywordKpiInfo adPosition(String adPosition) {
    this.adPosition = adPosition;
    return this;
  }

  /**
   * represents the position of the relevant ad in SERP
* can take the following values:
* FirstPage1: The first ad to appear on the right side of the first search results page
* FirstPage2: The second ad to appear on the right side of the first search results page
* FirstPage3: The third ad to appear on the right side of the first search results page
* FirstPage4: The fourth ad to appear on the right side of the first search results page
* FirstPage5: The fifth ad to appear on the right side of the first search results page
* FirstPage6: The sixth ad to appear on the right side of the first search results page
* FirstPage7: The seventh ad to appear on the right side of the first search results page
* FirstPage8: The eighth ad to appear on the right side of the first search results page
* FirstPage9: The ninth ad to appear on the right side of the first search results page
* FirstPage10: The tenth ad to appear on the right side of the first search results page
* MainLine1: The first ad to appear at the top of the search results page
* MainLine2: The second ad to appear at the top of the search results page
* MainLine3: The third ad to appear at the top of the search results page
* MainLine4: The fourth ad to appear at the top of the search results page
   * @return adPosition
   */
  @javax.annotation.Nullable
  public String getAdPosition() {
    return adPosition;
  }

  public void setAdPosition(String adPosition) {
    this.adPosition = adPosition;
  }


  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Integer clicks;

  public KeywordKpiInfo clicks(Integer clicks) {
    this.clicks = clicks;
    return this;
  }

  /**
   * ad clicks
* the number of clicks that the keyword and match type generated during the last month
   * @return clicks
   */
  @javax.annotation.Nullable
  public Integer getClicks() {
    return clicks;
  }

  public void setClicks(Integer clicks) {
    this.clicks = clicks;
  }


  public static final String SERIALIZED_NAME_IMPRESSIONS = "impressions";
  @SerializedName(SERIALIZED_NAME_IMPRESSIONS)
  private Integer impressions;

  public KeywordKpiInfo impressions(Integer impressions) {
    this.impressions = impressions;
    return this;
  }

  /**
   * ad impressions
* the number of impressions that the keyword and match type generated during the last month
   * @return impressions
   */
  @javax.annotation.Nullable
  public Integer getImpressions() {
    return impressions;
  }

  public void setImpressions(Integer impressions) {
    this.impressions = impressions;
  }


  public static final String SERIALIZED_NAME_AVERAGE_CPC = "average_cpc";
  @SerializedName(SERIALIZED_NAME_AVERAGE_CPC)
  private Double averageCpc;

  public KeywordKpiInfo averageCpc(Double averageCpc) {
    this.averageCpc = averageCpc;
    return this;
  }

  /**
   * average cost per click, USD
* calculated by dividing the cost of all clicks by the number of clicks
   * @return averageCpc
   */
  @javax.annotation.Nullable
  public Double getAverageCpc() {
    return averageCpc;
  }

  public void setAverageCpc(Double averageCpc) {
    this.averageCpc = averageCpc;
  }


  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr;

  public KeywordKpiInfo ctr(Double ctr) {
    this.ctr = ctr;
    return this;
  }

  /**
   * click-through rate as a percentage
* calculated by dividing the number of clicks by the number of impressions and multiplying the result by 100
   * @return ctr
   */
  @javax.annotation.Nullable
  public Double getCtr() {
    return ctr;
  }

  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public static final String SERIALIZED_NAME_TOTAL_COST = "total_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_COST)
  private Double totalCost;

  public KeywordKpiInfo totalCost(Double totalCost) {
    this.totalCost = totalCost;
    return this;
  }

  /**
   * total cost of an ad, USD
* the cost of using the specified keyword and match type during the last month
   * @return totalCost
   */
  @javax.annotation.Nullable
  public Double getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(Double totalCost) {
    this.totalCost = totalCost;
  }


  public static final String SERIALIZED_NAME_AVERAGE_BID = "average_bid";
  @SerializedName(SERIALIZED_NAME_AVERAGE_BID)
  private Double averageBid;

  public KeywordKpiInfo averageBid(Double averageBid) {
    this.averageBid = averageBid;
    return this;
  }

  /**
   * average bid of the keyword
   * @return averageBid
   */
  @javax.annotation.Nullable
  public Double getAverageBid() {
    return averageBid;
  }

  public void setAverageBid(Double averageBid) {
    this.averageBid = averageBid;
  }



  public KeywordKpiInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public KeywordKpiInfo putAdditionalProperty(String key, Object value) {
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


    
    KeywordKpiInfo keywordKpiInfo = (KeywordKpiInfo) o;
    return

        Objects.equals(this.adPosition, keywordKpiInfo.adPosition) &&
        Objects.equals(this.clicks, keywordKpiInfo.clicks) &&
        Objects.equals(this.impressions, keywordKpiInfo.impressions) &&
        Objects.equals(this.averageCpc, keywordKpiInfo.averageCpc) &&
        Objects.equals(this.ctr, keywordKpiInfo.ctr) &&
        Objects.equals(this.totalCost, keywordKpiInfo.totalCost) &&
        Objects.equals(this.averageBid, keywordKpiInfo.averageBid);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(adPosition, clicks, impressions, averageCpc, ctr, totalCost, averageBid);
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
    sb.append("class KeywordKpiInfo {\n");

    sb.append("    adPosition: ").append(toIndentedString(adPosition)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    averageCpc: ").append(toIndentedString(averageCpc)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    averageBid: ").append(toIndentedString(averageBid)).append("\n");
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
    
    openapiFields.add("ad_position");
    
    openapiFields.add("clicks");
    
    openapiFields.add("impressions");
    
    openapiFields.add("average_cpc");
    
    openapiFields.add("ctr");
    
    openapiFields.add("total_cost");
    
    openapiFields.add("average_bid");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KeywordKpiInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordKpiInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordKpiInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordKpiInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordKpiInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordKpiInfo>() {
           @Override
           public void write(JsonWriter out, KeywordKpiInfo value) throws IOException {
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
           public KeywordKpiInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeywordKpiInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static KeywordKpiInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordKpiInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
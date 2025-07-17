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



public class MetricsInfo  {


  public static final String SERIALIZED_NAME_POS_1 = "pos_1";
  @SerializedName(SERIALIZED_NAME_POS_1)
  private Integer pos1;

  public MetricsInfo pos1(Integer pos1) {
    this.pos1 = pos1;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #1
   * @return pos1
   */
  @javax.annotation.Nullable
  public Integer getPos1() {
    return pos1;
  }

  public void setPos1(Integer pos1) {
    this.pos1 = pos1;
  }


  public static final String SERIALIZED_NAME_POS_2_3 = "pos_2_3";
  @SerializedName(SERIALIZED_NAME_POS_2_3)
  private Integer pos23;

  public MetricsInfo pos23(Integer pos23) {
    this.pos23 = pos23;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #2-3
   * @return pos23
   */
  @javax.annotation.Nullable
  public Integer getPos23() {
    return pos23;
  }

  public void setPos23(Integer pos23) {
    this.pos23 = pos23;
  }


  public static final String SERIALIZED_NAME_POS_4_10 = "pos_4_10";
  @SerializedName(SERIALIZED_NAME_POS_4_10)
  private Integer pos410;

  public MetricsInfo pos410(Integer pos410) {
    this.pos410 = pos410;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #4-10
   * @return pos410
   */
  @javax.annotation.Nullable
  public Integer getPos410() {
    return pos410;
  }

  public void setPos410(Integer pos410) {
    this.pos410 = pos410;
  }


  public static final String SERIALIZED_NAME_POS_11_20 = "pos_11_20";
  @SerializedName(SERIALIZED_NAME_POS_11_20)
  private Integer pos1120;

  public MetricsInfo pos1120(Integer pos1120) {
    this.pos1120 = pos1120;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #11-20
   * @return pos1120
   */
  @javax.annotation.Nullable
  public Integer getPos1120() {
    return pos1120;
  }

  public void setPos1120(Integer pos1120) {
    this.pos1120 = pos1120;
  }


  public static final String SERIALIZED_NAME_POS_21_30 = "pos_21_30";
  @SerializedName(SERIALIZED_NAME_POS_21_30)
  private Integer pos2130;

  public MetricsInfo pos2130(Integer pos2130) {
    this.pos2130 = pos2130;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #21-30
   * @return pos2130
   */
  @javax.annotation.Nullable
  public Integer getPos2130() {
    return pos2130;
  }

  public void setPos2130(Integer pos2130) {
    this.pos2130 = pos2130;
  }


  public static final String SERIALIZED_NAME_POS_31_40 = "pos_31_40";
  @SerializedName(SERIALIZED_NAME_POS_31_40)
  private Integer pos3140;

  public MetricsInfo pos3140(Integer pos3140) {
    this.pos3140 = pos3140;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #31-40
   * @return pos3140
   */
  @javax.annotation.Nullable
  public Integer getPos3140() {
    return pos3140;
  }

  public void setPos3140(Integer pos3140) {
    this.pos3140 = pos3140;
  }


  public static final String SERIALIZED_NAME_POS_41_50 = "pos_41_50";
  @SerializedName(SERIALIZED_NAME_POS_41_50)
  private Integer pos4150;

  public MetricsInfo pos4150(Integer pos4150) {
    this.pos4150 = pos4150;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #41-50
   * @return pos4150
   */
  @javax.annotation.Nullable
  public Integer getPos4150() {
    return pos4150;
  }

  public void setPos4150(Integer pos4150) {
    this.pos4150 = pos4150;
  }


  public static final String SERIALIZED_NAME_POS_51_60 = "pos_51_60";
  @SerializedName(SERIALIZED_NAME_POS_51_60)
  private Integer pos5160;

  public MetricsInfo pos5160(Integer pos5160) {
    this.pos5160 = pos5160;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #51-60
   * @return pos5160
   */
  @javax.annotation.Nullable
  public Integer getPos5160() {
    return pos5160;
  }

  public void setPos5160(Integer pos5160) {
    this.pos5160 = pos5160;
  }


  public static final String SERIALIZED_NAME_POS_61_70 = "pos_61_70";
  @SerializedName(SERIALIZED_NAME_POS_61_70)
  private Integer pos6170;

  public MetricsInfo pos6170(Integer pos6170) {
    this.pos6170 = pos6170;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #61-70
   * @return pos6170
   */
  @javax.annotation.Nullable
  public Integer getPos6170() {
    return pos6170;
  }

  public void setPos6170(Integer pos6170) {
    this.pos6170 = pos6170;
  }


  public static final String SERIALIZED_NAME_POS_71_80 = "pos_71_80";
  @SerializedName(SERIALIZED_NAME_POS_71_80)
  private Integer pos7180;

  public MetricsInfo pos7180(Integer pos7180) {
    this.pos7180 = pos7180;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #71-80
   * @return pos7180
   */
  @javax.annotation.Nullable
  public Integer getPos7180() {
    return pos7180;
  }

  public void setPos7180(Integer pos7180) {
    this.pos7180 = pos7180;
  }


  public static final String SERIALIZED_NAME_POS_81_90 = "pos_81_90";
  @SerializedName(SERIALIZED_NAME_POS_81_90)
  private Integer pos8190;

  public MetricsInfo pos8190(Integer pos8190) {
    this.pos8190 = pos8190;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #81-90
   * @return pos8190
   */
  @javax.annotation.Nullable
  public Integer getPos8190() {
    return pos8190;
  }

  public void setPos8190(Integer pos8190) {
    this.pos8190 = pos8190;
  }


  public static final String SERIALIZED_NAME_POS_91_100 = "pos_91_100";
  @SerializedName(SERIALIZED_NAME_POS_91_100)
  private Integer pos91100;

  public MetricsInfo pos91100(Integer pos91100) {
    this.pos91100 = pos91100;
    return this;
  }

  /**
   * number of organic SERPs where the domain ranks #91-100
   * @return pos91100
   */
  @javax.annotation.Nullable
  public Integer getPos91100() {
    return pos91100;
  }

  public void setPos91100(Integer pos91100) {
    this.pos91100 = pos91100;
  }


  public static final String SERIALIZED_NAME_ETV = "etv";
  @SerializedName(SERIALIZED_NAME_ETV)
  private Double etv;

  public MetricsInfo etv(Double etv) {
    this.etv = etv;
    return this;
  }

  /**
   * estimated traffic volume
* estimated organic monthly traffic to the domain
* calculated as the product of CTR (click-through-rate) and search volume values of all keywords the domain ranks for
* learn more about how the metric is calculated in this help center article
   * @return etv
   */
  @javax.annotation.Nullable
  public Double getEtv() {
    return etv;
  }

  public void setEtv(Double etv) {
    this.etv = etv;
  }


  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public MetricsInfo count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * total count of organic SERPs that contain the domain
   * @return count
   */
  @javax.annotation.Nullable
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  public static final String SERIALIZED_NAME_ESTIMATED_PAID_TRAFFIC_COST = "estimated_paid_traffic_cost";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_PAID_TRAFFIC_COST)
  private Double estimatedPaidTrafficCost;

  public MetricsInfo estimatedPaidTrafficCost(Double estimatedPaidTrafficCost) {
    this.estimatedPaidTrafficCost = estimatedPaidTrafficCost;
    return this;
  }

  /**
   * estimated cost of converting organic search traffic into paid
* represents the estimated monthly cost of running ads (USD) for all keywords a domain ranks for
* the metric is calculated as the product of organic etv and paid cpc values and indicates the cost of driving the estimated volume of monthly organic traffic through PPC advertising in Google Search
* learn more about how the metric is calculated in this help center article
   * @return estimatedPaidTrafficCost
   */
  @javax.annotation.Nullable
  public Double getEstimatedPaidTrafficCost() {
    return estimatedPaidTrafficCost;
  }

  public void setEstimatedPaidTrafficCost(Double estimatedPaidTrafficCost) {
    this.estimatedPaidTrafficCost = estimatedPaidTrafficCost;
  }


  public static final String SERIALIZED_NAME_IS_NEW = "is_new";
  @SerializedName(SERIALIZED_NAME_IS_NEW)
  private Long isNew;

  public MetricsInfo isNew(Long isNew) {
    this.isNew = isNew;
    return this;
  }

  /**
   * number of new ranked elements
* indicates how many new ranked elements were found for this domain
   * @return isNew
   */
  @javax.annotation.Nullable
  public Long getIsNew() {
    return isNew;
  }

  public void setIsNew(Long isNew) {
    this.isNew = isNew;
  }


  public static final String SERIALIZED_NAME_IS_UP = "is_up";
  @SerializedName(SERIALIZED_NAME_IS_UP)
  private Long isUp;

  public MetricsInfo isUp(Long isUp) {
    this.isUp = isUp;
    return this;
  }

  /**
   * rank went up
* indicates how many ranked elements of this domain went up in Google Search
   * @return isUp
   */
  @javax.annotation.Nullable
  public Long getIsUp() {
    return isUp;
  }

  public void setIsUp(Long isUp) {
    this.isUp = isUp;
  }


  public static final String SERIALIZED_NAME_IS_DOWN = "is_down";
  @SerializedName(SERIALIZED_NAME_IS_DOWN)
  private Long isDown;

  public MetricsInfo isDown(Long isDown) {
    this.isDown = isDown;
    return this;
  }

  /**
   * rank went down
* indicates how many ranked elements of this domain went down in Google Search
   * @return isDown
   */
  @javax.annotation.Nullable
  public Long getIsDown() {
    return isDown;
  }

  public void setIsDown(Long isDown) {
    this.isDown = isDown;
  }


  public static final String SERIALIZED_NAME_IS_LOST = "is_lost";
  @SerializedName(SERIALIZED_NAME_IS_LOST)
  private Long isLost;

  public MetricsInfo isLost(Long isLost) {
    this.isLost = isLost;
    return this;
  }

  /**
   * lost ranked elements
* indicates how many ranked elements of this domain were previously presented in SERPs, but weren’t found during the last check
   * @return isLost
   */
  @javax.annotation.Nullable
  public Long getIsLost() {
    return isLost;
  }

  public void setIsLost(Long isLost) {
    this.isLost = isLost;
  }



  public MetricsInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public MetricsInfo putAdditionalProperty(String key, Object value) {
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


    
    MetricsInfo metricsInfo = (MetricsInfo) o;
    return

        Objects.equals(this.pos1, metricsInfo.pos1) &&
        Objects.equals(this.pos23, metricsInfo.pos23) &&
        Objects.equals(this.pos410, metricsInfo.pos410) &&
        Objects.equals(this.pos1120, metricsInfo.pos1120) &&
        Objects.equals(this.pos2130, metricsInfo.pos2130) &&
        Objects.equals(this.pos3140, metricsInfo.pos3140) &&
        Objects.equals(this.pos4150, metricsInfo.pos4150) &&
        Objects.equals(this.pos5160, metricsInfo.pos5160) &&
        Objects.equals(this.pos6170, metricsInfo.pos6170) &&
        Objects.equals(this.pos7180, metricsInfo.pos7180) &&
        Objects.equals(this.pos8190, metricsInfo.pos8190) &&
        Objects.equals(this.pos91100, metricsInfo.pos91100) &&
        Objects.equals(this.etv, metricsInfo.etv) &&
        Objects.equals(this.count, metricsInfo.count) &&
        Objects.equals(this.estimatedPaidTrafficCost, metricsInfo.estimatedPaidTrafficCost) &&
        Objects.equals(this.isNew, metricsInfo.isNew) &&
        Objects.equals(this.isUp, metricsInfo.isUp) &&
        Objects.equals(this.isDown, metricsInfo.isDown) &&
        Objects.equals(this.isLost, metricsInfo.isLost);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(pos1, pos23, pos410, pos1120, pos2130, pos3140, pos4150, pos5160, pos6170, pos7180, pos8190, pos91100, etv, count, estimatedPaidTrafficCost, isNew, isUp, isDown, isLost);
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
    sb.append("class MetricsInfo {\n");

    sb.append("    pos1: ").append(toIndentedString(pos1)).append("\n");
    sb.append("    pos23: ").append(toIndentedString(pos23)).append("\n");
    sb.append("    pos410: ").append(toIndentedString(pos410)).append("\n");
    sb.append("    pos1120: ").append(toIndentedString(pos1120)).append("\n");
    sb.append("    pos2130: ").append(toIndentedString(pos2130)).append("\n");
    sb.append("    pos3140: ").append(toIndentedString(pos3140)).append("\n");
    sb.append("    pos4150: ").append(toIndentedString(pos4150)).append("\n");
    sb.append("    pos5160: ").append(toIndentedString(pos5160)).append("\n");
    sb.append("    pos6170: ").append(toIndentedString(pos6170)).append("\n");
    sb.append("    pos7180: ").append(toIndentedString(pos7180)).append("\n");
    sb.append("    pos8190: ").append(toIndentedString(pos8190)).append("\n");
    sb.append("    pos91100: ").append(toIndentedString(pos91100)).append("\n");
    sb.append("    etv: ").append(toIndentedString(etv)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    estimatedPaidTrafficCost: ").append(toIndentedString(estimatedPaidTrafficCost)).append("\n");
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
    sb.append("    isUp: ").append(toIndentedString(isUp)).append("\n");
    sb.append("    isDown: ").append(toIndentedString(isDown)).append("\n");
    sb.append("    isLost: ").append(toIndentedString(isLost)).append("\n");
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
    
    openapiFields.add("pos_1");
    
    openapiFields.add("pos_2_3");
    
    openapiFields.add("pos_4_10");
    
    openapiFields.add("pos_11_20");
    
    openapiFields.add("pos_21_30");
    
    openapiFields.add("pos_31_40");
    
    openapiFields.add("pos_41_50");
    
    openapiFields.add("pos_51_60");
    
    openapiFields.add("pos_61_70");
    
    openapiFields.add("pos_71_80");
    
    openapiFields.add("pos_81_90");
    
    openapiFields.add("pos_91_100");
    
    openapiFields.add("etv");
    
    openapiFields.add("count");
    
    openapiFields.add("estimated_paid_traffic_cost");
    
    openapiFields.add("is_new");
    
    openapiFields.add("is_up");
    
    openapiFields.add("is_down");
    
    openapiFields.add("is_lost");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MetricsInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetricsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetricsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetricsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetricsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MetricsInfo>() {
           @Override
           public void write(JsonWriter out, MetricsInfo value) throws IOException {
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
           public MetricsInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MetricsInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static MetricsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetricsInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
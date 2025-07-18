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



public class DataforseoLabsBingRankedKeywordsLiveResultInfo  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public DataforseoLabsBingRankedKeywordsLiveResultInfo seType(String seType) {
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


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public DataforseoLabsBingRankedKeywordsLiveResultInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * target domain in a POST array
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public DataforseoLabsBingRankedKeywordsLiveResultInfo locationCode(Integer locationCode) {
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

  public DataforseoLabsBingRankedKeywordsLiveResultInfo languageCode(String languageCode) {
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


  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public DataforseoLabsBingRankedKeywordsLiveResultInfo totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of results in our database relevant to your request
   * @return totalCount
   */
  @javax.annotation.Nullable
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public DataforseoLabsBingRankedKeywordsLiveResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  /**
   * the number of results returned in the items array
   * @return itemsCount
   */
  @javax.annotation.Nullable
  public Long getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
  }


  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private Map<String, DataforseoLabsMetricsInfo> metrics;

  public DataforseoLabsBingRankedKeywordsLiveResultInfo metrics(Map<String, DataforseoLabsMetricsInfo> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * ranking data relevant to the specified domain
* ranking data is provided by the rank_group parameters that show the result’s rank considering only equivalent SERP elements
   * @return metrics
   */
  @javax.annotation.Nullable
  public Map<String, DataforseoLabsMetricsInfo> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, DataforseoLabsMetricsInfo> metrics) {
    this.metrics = metrics;
  }


  public static final String SERIALIZED_NAME_METRICS_ABSOLUTE = "metrics_absolute";
  @SerializedName(SERIALIZED_NAME_METRICS_ABSOLUTE)
  private Map<String, DataforseoLabsMetricsInfo> metricsAbsolute;

  public DataforseoLabsBingRankedKeywordsLiveResultInfo metricsAbsolute(Map<String, DataforseoLabsMetricsInfo> metricsAbsolute) {
    this.metricsAbsolute = metricsAbsolute;
    return this;
  }

  /**
   * ranking data relevant to the specified domain
* ranking data is provided by the rank_absolute parameters that indicate the result’s position among all SERP elements
   * @return metricsAbsolute
   */
  @javax.annotation.Nullable
  public Map<String, DataforseoLabsMetricsInfo> getMetricsAbsolute() {
    return metricsAbsolute;
  }

  public void setMetricsAbsolute(Map<String, DataforseoLabsMetricsInfo> metricsAbsolute) {
    this.metricsAbsolute = metricsAbsolute;
  }


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<DataforseoLabsRankedKeywordsLiveItem> items;

  public DataforseoLabsBingRankedKeywordsLiveResultInfo items(List<DataforseoLabsRankedKeywordsLiveItem> items) {
    this.items = items;
    return this;
  }

  /**
   * contains ranked keywords and related data
   * @return items
   */
  @javax.annotation.Nullable
  public List<DataforseoLabsRankedKeywordsLiveItem> getItems() {
    return items;
  }

  public void setItems(List<DataforseoLabsRankedKeywordsLiveItem> items) {
    this.items = items;
  }



  public DataforseoLabsBingRankedKeywordsLiveResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsBingRankedKeywordsLiveResultInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsBingRankedKeywordsLiveResultInfo dataforseoLabsBingRankedKeywordsLiveResultInfo = (DataforseoLabsBingRankedKeywordsLiveResultInfo) o;
    return

        Objects.equals(this.seType, dataforseoLabsBingRankedKeywordsLiveResultInfo.seType) &&
        Objects.equals(this.target, dataforseoLabsBingRankedKeywordsLiveResultInfo.target) &&
        Objects.equals(this.locationCode, dataforseoLabsBingRankedKeywordsLiveResultInfo.locationCode) &&
        Objects.equals(this.languageCode, dataforseoLabsBingRankedKeywordsLiveResultInfo.languageCode) &&
        Objects.equals(this.totalCount, dataforseoLabsBingRankedKeywordsLiveResultInfo.totalCount) &&
        Objects.equals(this.itemsCount, dataforseoLabsBingRankedKeywordsLiveResultInfo.itemsCount) &&
        Objects.equals(this.metrics, dataforseoLabsBingRankedKeywordsLiveResultInfo.metrics) &&
        Objects.equals(this.metricsAbsolute, dataforseoLabsBingRankedKeywordsLiveResultInfo.metricsAbsolute) &&
        Objects.equals(this.items, dataforseoLabsBingRankedKeywordsLiveResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, target, locationCode, languageCode, totalCount, itemsCount, metrics, metricsAbsolute, items);
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
    sb.append("class DataforseoLabsBingRankedKeywordsLiveResultInfo {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    metricsAbsolute: ").append(toIndentedString(metricsAbsolute)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    
    openapiFields.add("target");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_code");
    
    openapiFields.add("total_count");
    
    openapiFields.add("items_count");
    
    openapiFields.add("metrics");
    
    openapiFields.add("metrics_absolute");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsBingRankedKeywordsLiveResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsBingRankedKeywordsLiveResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsBingRankedKeywordsLiveResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsBingRankedKeywordsLiveResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsBingRankedKeywordsLiveResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsBingRankedKeywordsLiveResultInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsBingRankedKeywordsLiveResultInfo value) throws IOException {
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
           public DataforseoLabsBingRankedKeywordsLiveResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsBingRankedKeywordsLiveResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsBingRankedKeywordsLiveResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsBingRankedKeywordsLiveResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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



public class DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem seType(String seType) {
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


  public static final String SERIALIZED_NAME_TOP_CATEGORIES = "top_categories";
  @SerializedName(SERIALIZED_NAME_TOP_CATEGORIES)
  private List<Integer> topCategories;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem topCategories(List<Integer> topCategories) {
    this.topCategories = topCategories;
    return this;
  }

  /**
   * categories for which domains are collected
   * @return topCategories
   */
  @javax.annotation.Nullable
  public List<Integer> getTopCategories() {
    return topCategories;
  }

  public void setTopCategories(List<Integer> topCategories) {
    this.topCategories = topCategories;
  }


  public static final String SERIALIZED_NAME_ORGANIC_ETV = "organic_etv";
  @SerializedName(SERIALIZED_NAME_ORGANIC_ETV)
  private Double organicEtv;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem organicEtv(Double organicEtv) {
    this.organicEtv = organicEtv;
    return this;
  }

  /**
   * current organic ETV of the domain
   * @return organicEtv
   */
  @javax.annotation.Nullable
  public Double getOrganicEtv() {
    return organicEtv;
  }

  public void setOrganicEtv(Double organicEtv) {
    this.organicEtv = organicEtv;
  }


  public static final String SERIALIZED_NAME_ORGANIC_COUNT = "organic_count";
  @SerializedName(SERIALIZED_NAME_ORGANIC_COUNT)
  private Long organicCount;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem organicCount(Long organicCount) {
    this.organicCount = organicCount;
    return this;
  }

  /**
   * current total count of organic SERPs that contain the domain
   * @return organicCount
   */
  @javax.annotation.Nullable
  public Long getOrganicCount() {
    return organicCount;
  }

  public void setOrganicCount(Long organicCount) {
    this.organicCount = organicCount;
  }


  public static final String SERIALIZED_NAME_ORGANIC_IS_LOST = "organic_is_lost";
  @SerializedName(SERIALIZED_NAME_ORGANIC_IS_LOST)
  private Integer organicIsLost;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem organicIsLost(Integer organicIsLost) {
    this.organicIsLost = organicIsLost;
    return this;
  }

  /**
   * current number of lost ranked elements
* indicates how many ranked elements of the domain were previously presented in SERPs, but weren’t found during the last check
   * @return organicIsLost
   */
  @javax.annotation.Nullable
  public Integer getOrganicIsLost() {
    return organicIsLost;
  }

  public void setOrganicIsLost(Integer organicIsLost) {
    this.organicIsLost = organicIsLost;
  }


  public static final String SERIALIZED_NAME_ORGANIC_IS_NEW = "organic_is_new";
  @SerializedName(SERIALIZED_NAME_ORGANIC_IS_NEW)
  private Integer organicIsNew;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem organicIsNew(Integer organicIsNew) {
    this.organicIsNew = organicIsNew;
    return this;
  }

  /**
   * current number of new ranked elements
* indicates how many new ranked elements were found for the domain
   * @return organicIsNew
   */
  @javax.annotation.Nullable
  public Integer getOrganicIsNew() {
    return organicIsNew;
  }

  public void setOrganicIsNew(Integer organicIsNew) {
    this.organicIsNew = organicIsNew;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain found for the specified category
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_MAIN_DOMAIN = "main_domain";
  @SerializedName(SERIALIZED_NAME_MAIN_DOMAIN)
  private String mainDomain;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem mainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
    return this;
  }

  /**
   * primary domain
   * @return mainDomain
   */
  @javax.annotation.Nullable
  public String getMainDomain() {
    return mainDomain;
  }

  public void setMainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
  }


  public static final String SERIALIZED_NAME_METRICS_HISTORY = "metrics_history";
  @SerializedName(SERIALIZED_NAME_METRICS_HISTORY)
  private Map<String, Map<String, DataforseoLabsMetricsInfo>> metricsHistory;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem metricsHistory(Map<String, Map<String, DataforseoLabsMetricsInfo>> metricsHistory) {
    this.metricsHistory = metricsHistory;
    return this;
  }

  /**
   * historical ranking and traffic data of the domain
   * @return metricsHistory
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, DataforseoLabsMetricsInfo>> getMetricsHistory() {
    return metricsHistory;
  }

  public void setMetricsHistory(Map<String, Map<String, DataforseoLabsMetricsInfo>> metricsHistory) {
    this.metricsHistory = metricsHistory;
  }


  public static final String SERIALIZED_NAME_METRICS_DIFFERENCE = "metrics_difference";
  @SerializedName(SERIALIZED_NAME_METRICS_DIFFERENCE)
  private Map<String, DataforseoLabsMetricsInfo> metricsDifference;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem metricsDifference(Map<String, DataforseoLabsMetricsInfo> metricsDifference) {
    this.metricsDifference = metricsDifference;
    return this;
  }

  /**
   * metrics difference between first_date and second_date
* calculated by subtracting domain metrics as of the greater date from domain metrics as of the smaller date
   * @return metricsDifference
   */
  @javax.annotation.Nullable
  public Map<String, DataforseoLabsMetricsInfo> getMetricsDifference() {
    return metricsDifference;
  }

  public void setMetricsDifference(Map<String, DataforseoLabsMetricsInfo> metricsDifference) {
    this.metricsDifference = metricsDifference;
  }



  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem = (DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem) o;
    return

        Objects.equals(this.seType, dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.seType) &&
        Objects.equals(this.topCategories, dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.topCategories) &&
        Objects.equals(this.organicEtv, dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.organicEtv) &&
        Objects.equals(this.organicCount, dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.organicCount) &&
        Objects.equals(this.organicIsLost, dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.organicIsLost) &&
        Objects.equals(this.organicIsNew, dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.organicIsNew) &&
        Objects.equals(this.domain, dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.domain) &&
        Objects.equals(this.mainDomain, dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.mainDomain) &&
        Objects.equals(this.metricsHistory, dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.metricsHistory) &&
        Objects.equals(this.metricsDifference, dataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.metricsDifference);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, topCategories, organicEtv, organicCount, organicIsLost, organicIsNew, domain, mainDomain, metricsHistory, metricsDifference);
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
    sb.append("class DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    topCategories: ").append(toIndentedString(topCategories)).append("\n");
    sb.append("    organicEtv: ").append(toIndentedString(organicEtv)).append("\n");
    sb.append("    organicCount: ").append(toIndentedString(organicCount)).append("\n");
    sb.append("    organicIsLost: ").append(toIndentedString(organicIsLost)).append("\n");
    sb.append("    organicIsNew: ").append(toIndentedString(organicIsNew)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    mainDomain: ").append(toIndentedString(mainDomain)).append("\n");
    sb.append("    metricsHistory: ").append(toIndentedString(metricsHistory)).append("\n");
    sb.append("    metricsDifference: ").append(toIndentedString(metricsDifference)).append("\n");
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
    
    openapiFields.add("top_categories");
    
    openapiFields.add("organic_etv");
    
    openapiFields.add("organic_count");
    
    openapiFields.add("organic_is_lost");
    
    openapiFields.add("organic_is_new");
    
    openapiFields.add("domain");
    
    openapiFields.add("main_domain");
    
    openapiFields.add("metrics_history");
    
    openapiFields.add("metrics_difference");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem value) throws IOException {
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
           public DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
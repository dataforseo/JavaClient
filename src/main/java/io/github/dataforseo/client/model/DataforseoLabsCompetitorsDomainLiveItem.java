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



public class DataforseoLabsCompetitorsDomainLiveItem  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public DataforseoLabsCompetitorsDomainLiveItem seType(String seType) {
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


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public DataforseoLabsCompetitorsDomainLiveItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain name
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_AVG_POSITION = "avg_position";
  @SerializedName(SERIALIZED_NAME_AVG_POSITION)
  private Float avgPosition;

  public DataforseoLabsCompetitorsDomainLiveItem avgPosition(Float avgPosition) {
    this.avgPosition = avgPosition;
    return this;
  }

  /**
   * average position of the domain in SERP
* Note: average position is calculated for intersected keywords only;
* the value for a given domain may differ when combined with different target websites
   * @return avgPosition
   */
  @javax.annotation.Nullable
  public Float getAvgPosition() {
    return avgPosition;
  }

  public void setAvgPosition(Float avgPosition) {
    this.avgPosition = avgPosition;
  }


  public static final String SERIALIZED_NAME_SUM_POSITION = "sum_position";
  @SerializedName(SERIALIZED_NAME_SUM_POSITION)
  private Integer sumPosition;

  public DataforseoLabsCompetitorsDomainLiveItem sumPosition(Integer sumPosition) {
    this.sumPosition = sumPosition;
    return this;
  }

  /**
   * sum of all domain positions in SERP
* Note: average position is calculated for intersected keywords only;
* the value for a given domain may differ when combined with different target websites
   * @return sumPosition
   */
  @javax.annotation.Nullable
  public Integer getSumPosition() {
    return sumPosition;
  }

  public void setSumPosition(Integer sumPosition) {
    this.sumPosition = sumPosition;
  }


  public static final String SERIALIZED_NAME_INTERSECTIONS = "intersections";
  @SerializedName(SERIALIZED_NAME_INTERSECTIONS)
  private Integer intersections;

  public DataforseoLabsCompetitorsDomainLiveItem intersections(Integer intersections) {
    this.intersections = intersections;
    return this;
  }

  /**
   * number of intersecting keywords
   * @return intersections
   */
  @javax.annotation.Nullable
  public Integer getIntersections() {
    return intersections;
  }

  public void setIntersections(Integer intersections) {
    this.intersections = intersections;
  }


  public static final String SERIALIZED_NAME_FULL_DOMAIN_METRICS = "full_domain_metrics";
  @SerializedName(SERIALIZED_NAME_FULL_DOMAIN_METRICS)
  private Map<String, DataforseoLabsMetricsInfo> fullDomainMetrics;

  public DataforseoLabsCompetitorsDomainLiveItem fullDomainMetrics(Map<String, DataforseoLabsMetricsInfo> fullDomainMetrics) {
    this.fullDomainMetrics = fullDomainMetrics;
    return this;
  }

  /**
   * metrics for all keywords of the domain
* full overview of ranking and traffic data relevant to all keywords that the provided domain is ranking for
   * @return fullDomainMetrics
   */
  @javax.annotation.Nullable
  public Map<String, DataforseoLabsMetricsInfo> getFullDomainMetrics() {
    return fullDomainMetrics;
  }

  public void setFullDomainMetrics(Map<String, DataforseoLabsMetricsInfo> fullDomainMetrics) {
    this.fullDomainMetrics = fullDomainMetrics;
  }


  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private Map<String, DataforseoLabsMetricsInfo> metrics;

  public DataforseoLabsCompetitorsDomainLiveItem metrics(Map<String, DataforseoLabsMetricsInfo> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * metrics for intersecting keywords
* ranking and traffic data relevant to the keywords that the provided domain shares with the target domain
* note: in this array ranking and traffic data is provided for the target considering the keywords target shares in search with the competitor’s domain
   * @return metrics
   */
  @javax.annotation.Nullable
  public Map<String, DataforseoLabsMetricsInfo> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, DataforseoLabsMetricsInfo> metrics) {
    this.metrics = metrics;
  }


  public static final String SERIALIZED_NAME_COMPETITOR_METRICS = "competitor_metrics";
  @SerializedName(SERIALIZED_NAME_COMPETITOR_METRICS)
  private Map<String, DataforseoLabsMetricsInfo> competitorMetrics;

  public DataforseoLabsCompetitorsDomainLiveItem competitorMetrics(Map<String, DataforseoLabsMetricsInfo> competitorMetrics) {
    this.competitorMetrics = competitorMetrics;
    return this;
  }

  /**
   * metrics for intersecting keywords
* ranking and traffic data relevant to the keywords that the provided domain shares with the target domain
* note: in this array ranking and traffic data is provided for the returned competitor’s domain
   * @return competitorMetrics
   */
  @javax.annotation.Nullable
  public Map<String, DataforseoLabsMetricsInfo> getCompetitorMetrics() {
    return competitorMetrics;
  }

  public void setCompetitorMetrics(Map<String, DataforseoLabsMetricsInfo> competitorMetrics) {
    this.competitorMetrics = competitorMetrics;
  }



  public DataforseoLabsCompetitorsDomainLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsCompetitorsDomainLiveItem putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsCompetitorsDomainLiveItem dataforseoLabsCompetitorsDomainLiveItem = (DataforseoLabsCompetitorsDomainLiveItem) o;
    return

        Objects.equals(this.seType, dataforseoLabsCompetitorsDomainLiveItem.seType) &&
        Objects.equals(this.domain, dataforseoLabsCompetitorsDomainLiveItem.domain) &&
        Objects.equals(this.avgPosition, dataforseoLabsCompetitorsDomainLiveItem.avgPosition) &&
        Objects.equals(this.sumPosition, dataforseoLabsCompetitorsDomainLiveItem.sumPosition) &&
        Objects.equals(this.intersections, dataforseoLabsCompetitorsDomainLiveItem.intersections) &&
        Objects.equals(this.fullDomainMetrics, dataforseoLabsCompetitorsDomainLiveItem.fullDomainMetrics) &&
        Objects.equals(this.metrics, dataforseoLabsCompetitorsDomainLiveItem.metrics) &&
        Objects.equals(this.competitorMetrics, dataforseoLabsCompetitorsDomainLiveItem.competitorMetrics);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, domain, avgPosition, sumPosition, intersections, fullDomainMetrics, metrics, competitorMetrics);
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
    sb.append("class DataforseoLabsCompetitorsDomainLiveItem {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    avgPosition: ").append(toIndentedString(avgPosition)).append("\n");
    sb.append("    sumPosition: ").append(toIndentedString(sumPosition)).append("\n");
    sb.append("    intersections: ").append(toIndentedString(intersections)).append("\n");
    sb.append("    fullDomainMetrics: ").append(toIndentedString(fullDomainMetrics)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    competitorMetrics: ").append(toIndentedString(competitorMetrics)).append("\n");
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
    
    openapiFields.add("domain");
    
    openapiFields.add("avg_position");
    
    openapiFields.add("sum_position");
    
    openapiFields.add("intersections");
    
    openapiFields.add("full_domain_metrics");
    
    openapiFields.add("metrics");
    
    openapiFields.add("competitor_metrics");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsCompetitorsDomainLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsCompetitorsDomainLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsCompetitorsDomainLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsCompetitorsDomainLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsCompetitorsDomainLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsCompetitorsDomainLiveItem>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsCompetitorsDomainLiveItem value) throws IOException {
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
           public DataforseoLabsCompetitorsDomainLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsCompetitorsDomainLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsCompetitorsDomainLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsCompetitorsDomainLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
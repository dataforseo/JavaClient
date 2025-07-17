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



public class DataforseoLabsSerpCompetitorsLiveItem  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public DataforseoLabsSerpCompetitorsLiveItem seType(String seType) {
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

  public DataforseoLabsSerpCompetitorsLiveItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain name of the detected SERP competitor
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

  public DataforseoLabsSerpCompetitorsLiveItem avgPosition(Float avgPosition) {
    this.avgPosition = avgPosition;
    return this;
  }

  /**
   * the average position of the domain for the specified keywords
* the arithmetic mean of values in the keywords_positions array
   * @return avgPosition
   */
  @javax.annotation.Nullable
  public Float getAvgPosition() {
    return avgPosition;
  }

  public void setAvgPosition(Float avgPosition) {
    this.avgPosition = avgPosition;
  }


  public static final String SERIALIZED_NAME_MEDIAN_POSITION = "median_position";
  @SerializedName(SERIALIZED_NAME_MEDIAN_POSITION)
  private Double medianPosition;

  public DataforseoLabsSerpCompetitorsLiveItem medianPosition(Double medianPosition) {
    this.medianPosition = medianPosition;
    return this;
  }

  /**
   * the median position of the domain for the specified keywords
* the median of the values in the keywords_positions array
   * @return medianPosition
   */
  @javax.annotation.Nullable
  public Double getMedianPosition() {
    return medianPosition;
  }

  public void setMedianPosition(Double medianPosition) {
    this.medianPosition = medianPosition;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private Double rating;

  public DataforseoLabsSerpCompetitorsLiveItem rating(Double rating) {
    this.rating = rating;
    return this;
  }

  /**
   * the margin between the greatest possible and actual keyword positions
* represents the relative visibility rate of the domain in SERP for the specified keywords
* calculated as sum(100-keywords_positions)
   * @return rating
   */
  @javax.annotation.Nullable
  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_ETV = "etv";
  @SerializedName(SERIALIZED_NAME_ETV)
  private Double etv;

  public DataforseoLabsSerpCompetitorsLiveItem etv(Double etv) {
    this.etv = etv;
    return this;
  }

  /**
   * estimated traffic volume
* represents the estimated monthly traffic that specified keywords are driving to the website
* calculated as the sum of the products of the specified keywords’ search volume values and CTR (click-through-rate) rates at certain positions in SERP
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


  public static final String SERIALIZED_NAME_KEYWORDS_COUNT = "keywords_count";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_COUNT)
  private Long keywordsCount;

  public DataforseoLabsSerpCompetitorsLiveItem keywordsCount(Long keywordsCount) {
    this.keywordsCount = keywordsCount;
    return this;
  }

  /**
   * the number of specified keywords the domain has positions for in SERPs
   * @return keywordsCount
   */
  @javax.annotation.Nullable
  public Long getKeywordsCount() {
    return keywordsCount;
  }

  public void setKeywordsCount(Long keywordsCount) {
    this.keywordsCount = keywordsCount;
  }


  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private Double visibility;

  public DataforseoLabsSerpCompetitorsLiveItem visibility(Double visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * SERP visibility rate
* represents the website visibility rate based on the SERP positions of the specified keywords
* Keywords with positions in the range from 1 to 10 are assigned the visibility index from 1 to 0.1, respectively
* Keywords with positions in the range from 11 to 20 have the fixed visibility index of 0.05
* keywords with positions from 20 to 100 have the visibility index equal to 0
   * @return visibility
   */
  @javax.annotation.Nullable
  public Double getVisibility() {
    return visibility;
  }

  public void setVisibility(Double visibility) {
    this.visibility = visibility;
  }


  public static final String SERIALIZED_NAME_RELEVANT_SERP_ITEMS = "relevant_serp_items";
  @SerializedName(SERIALIZED_NAME_RELEVANT_SERP_ITEMS)
  private Integer relevantSerpItems;

  public DataforseoLabsSerpCompetitorsLiveItem relevantSerpItems(Integer relevantSerpItems) {
    this.relevantSerpItems = relevantSerpItems;
    return this;
  }

  /**
   * the number of SERP elements relevant to the domain
* represents the number of search results in SERP relevant to the domain for the specified keywords
   * @return relevantSerpItems
   */
  @javax.annotation.Nullable
  public Integer getRelevantSerpItems() {
    return relevantSerpItems;
  }

  public void setRelevantSerpItems(Integer relevantSerpItems) {
    this.relevantSerpItems = relevantSerpItems;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_POSITIONS = "keywords_positions";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_POSITIONS)
  private Map<String, List<Integer>> keywordsPositions;

  public DataforseoLabsSerpCompetitorsLiveItem keywordsPositions(Map<String, List<Integer>> keywordsPositions) {
    this.keywordsPositions = keywordsPositions;
    return this;
  }

  /**
   * keyword positions
* SERP positions the related domain holds in SERP for the specified keywords
   * @return keywordsPositions
   */
  @javax.annotation.Nullable
  public Map<String, List<Integer>> getKeywordsPositions() {
    return keywordsPositions;
  }

  public void setKeywordsPositions(Map<String, List<Integer>> keywordsPositions) {
    this.keywordsPositions = keywordsPositions;
  }



  public DataforseoLabsSerpCompetitorsLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsSerpCompetitorsLiveItem putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsSerpCompetitorsLiveItem dataforseoLabsSerpCompetitorsLiveItem = (DataforseoLabsSerpCompetitorsLiveItem) o;
    return

        Objects.equals(this.seType, dataforseoLabsSerpCompetitorsLiveItem.seType) &&
        Objects.equals(this.domain, dataforseoLabsSerpCompetitorsLiveItem.domain) &&
        Objects.equals(this.avgPosition, dataforseoLabsSerpCompetitorsLiveItem.avgPosition) &&
        Objects.equals(this.medianPosition, dataforseoLabsSerpCompetitorsLiveItem.medianPosition) &&
        Objects.equals(this.rating, dataforseoLabsSerpCompetitorsLiveItem.rating) &&
        Objects.equals(this.etv, dataforseoLabsSerpCompetitorsLiveItem.etv) &&
        Objects.equals(this.keywordsCount, dataforseoLabsSerpCompetitorsLiveItem.keywordsCount) &&
        Objects.equals(this.visibility, dataforseoLabsSerpCompetitorsLiveItem.visibility) &&
        Objects.equals(this.relevantSerpItems, dataforseoLabsSerpCompetitorsLiveItem.relevantSerpItems) &&
        Objects.equals(this.keywordsPositions, dataforseoLabsSerpCompetitorsLiveItem.keywordsPositions);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, domain, avgPosition, medianPosition, rating, etv, keywordsCount, visibility, relevantSerpItems, keywordsPositions);
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
    sb.append("class DataforseoLabsSerpCompetitorsLiveItem {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    avgPosition: ").append(toIndentedString(avgPosition)).append("\n");
    sb.append("    medianPosition: ").append(toIndentedString(medianPosition)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    etv: ").append(toIndentedString(etv)).append("\n");
    sb.append("    keywordsCount: ").append(toIndentedString(keywordsCount)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    relevantSerpItems: ").append(toIndentedString(relevantSerpItems)).append("\n");
    sb.append("    keywordsPositions: ").append(toIndentedString(keywordsPositions)).append("\n");
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
    
    openapiFields.add("median_position");
    
    openapiFields.add("rating");
    
    openapiFields.add("etv");
    
    openapiFields.add("keywords_count");
    
    openapiFields.add("visibility");
    
    openapiFields.add("relevant_serp_items");
    
    openapiFields.add("keywords_positions");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsSerpCompetitorsLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsSerpCompetitorsLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsSerpCompetitorsLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsSerpCompetitorsLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsSerpCompetitorsLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsSerpCompetitorsLiveItem>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsSerpCompetitorsLiveItem value) throws IOException {
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
           public DataforseoLabsSerpCompetitorsLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsSerpCompetitorsLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsSerpCompetitorsLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsSerpCompetitorsLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
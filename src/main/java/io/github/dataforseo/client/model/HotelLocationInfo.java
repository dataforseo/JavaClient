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



public class HotelLocationInfo  {


  public static final String SERIALIZED_NAME_NEIGHBORHOOD = "neighborhood";
  @SerializedName(SERIALIZED_NAME_NEIGHBORHOOD)
  private String neighborhood;

  public HotelLocationInfo neighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

  /**
   * name of the neighborhood where the hotel is located
   * @return neighborhood
   */
  @javax.annotation.Nullable
  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }


  public static final String SERIALIZED_NAME_NEIGHBORHOOD_DESCRIPTION = "neighborhood_description";
  @SerializedName(SERIALIZED_NAME_NEIGHBORHOOD_DESCRIPTION)
  private String neighborhoodDescription;

  public HotelLocationInfo neighborhoodDescription(String neighborhoodDescription) {
    this.neighborhoodDescription = neighborhoodDescription;
    return this;
  }

  /**
   * description of the neighborhood where the hotel is located
   * @return neighborhoodDescription
   */
  @javax.annotation.Nullable
  public String getNeighborhoodDescription() {
    return neighborhoodDescription;
  }

  public void setNeighborhoodDescription(String neighborhoodDescription) {
    this.neighborhoodDescription = neighborhoodDescription;
  }


  public static final String SERIALIZED_NAME_MAPS_URL = "maps_url";
  @SerializedName(SERIALIZED_NAME_MAPS_URL)
  private String mapsUrl;

  public HotelLocationInfo mapsUrl(String mapsUrl) {
    this.mapsUrl = mapsUrl;
    return this;
  }

  /**
   * url to the location of the hotel in google maps
   * @return mapsUrl
   */
  @javax.annotation.Nullable
  public String getMapsUrl() {
    return mapsUrl;
  }

  public void setMapsUrl(String mapsUrl) {
    this.mapsUrl = mapsUrl;
  }


  public static final String SERIALIZED_NAME_OVERALL_SCORE = "overall_score";
  @SerializedName(SERIALIZED_NAME_OVERALL_SCORE)
  private Double overallScore;

  public HotelLocationInfo overallScore(Double overallScore) {
    this.overallScore = overallScore;
    return this;
  }

  /**
   * overall score of the hotel location
* indicates the overall score of the hotel’s location in the range from 1 to 5;
* calculated based on data from the hotel’s proximity to nearby things to do and restaurants, transportation, and airports;
* note that the criteria are not weighted equally in the overall score
   * @return overallScore
   */
  @javax.annotation.Nullable
  public Double getOverallScore() {
    return overallScore;
  }

  public void setOverallScore(Double overallScore) {
    this.overallScore = overallScore;
  }


  public static final String SERIALIZED_NAME_SCORE_BY_CATEGORIES = "score_by_categories";
  @SerializedName(SERIALIZED_NAME_SCORE_BY_CATEGORIES)
  private Map<String, Double> scoreByCategories;

  public HotelLocationInfo scoreByCategories(Map<String, Double> scoreByCategories) {
    this.scoreByCategories = scoreByCategories;
    return this;
  }

  /**
   * category scores of the hotel location
* the scores of the hotel’s location tied to the categories that indicate the proximity to nearby things to do, restaurants, transportation, and airports;
   * @return scoreByCategories
   */
  @javax.annotation.Nullable
  public Map<String, Double> getScoreByCategories() {
    return scoreByCategories;
  }

  public void setScoreByCategories(Map<String, Double> scoreByCategories) {
    this.scoreByCategories = scoreByCategories;
  }


  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public HotelLocationInfo latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * hotel latitude
* latitude coordinates of the hotel’s location
* example:
* 39.4806397
   * @return latitude
   */
  @javax.annotation.Nullable
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public HotelLocationInfo longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * hotel longitude
* latitude coordinates of the hotel’s location
* example:
* -106.0512973
   * @return longitude
   */
  @javax.annotation.Nullable
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public static final String SERIALIZED_NAME_LOCATION_CHAIN = "location_chain";
  @SerializedName(SERIALIZED_NAME_LOCATION_CHAIN)
  private List<LocationChain> locationChain;

  public HotelLocationInfo locationChain(List<LocationChain> locationChain) {
    this.locationChain = locationChain;
    return this;
  }

  /**
   * elements of the location chain
* additional parameters of each element of the location chain
   * @return locationChain
   */
  @javax.annotation.Nullable
  public List<LocationChain> getLocationChain() {
    return locationChain;
  }

  public void setLocationChain(List<LocationChain> locationChain) {
    this.locationChain = locationChain;
  }



  public HotelLocationInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public HotelLocationInfo putAdditionalProperty(String key, Object value) {
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


    
    HotelLocationInfo hotelLocationInfo = (HotelLocationInfo) o;
    return

        Objects.equals(this.neighborhood, hotelLocationInfo.neighborhood) &&
        Objects.equals(this.neighborhoodDescription, hotelLocationInfo.neighborhoodDescription) &&
        Objects.equals(this.mapsUrl, hotelLocationInfo.mapsUrl) &&
        Objects.equals(this.overallScore, hotelLocationInfo.overallScore) &&
        Objects.equals(this.scoreByCategories, hotelLocationInfo.scoreByCategories) &&
        Objects.equals(this.latitude, hotelLocationInfo.latitude) &&
        Objects.equals(this.longitude, hotelLocationInfo.longitude) &&
        Objects.equals(this.locationChain, hotelLocationInfo.locationChain);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(neighborhood, neighborhoodDescription, mapsUrl, overallScore, scoreByCategories, latitude, longitude, locationChain);
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
    sb.append("class HotelLocationInfo {\n");

    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    neighborhoodDescription: ").append(toIndentedString(neighborhoodDescription)).append("\n");
    sb.append("    mapsUrl: ").append(toIndentedString(mapsUrl)).append("\n");
    sb.append("    overallScore: ").append(toIndentedString(overallScore)).append("\n");
    sb.append("    scoreByCategories: ").append(toIndentedString(scoreByCategories)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationChain: ").append(toIndentedString(locationChain)).append("\n");
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
    
    openapiFields.add("neighborhood");
    
    openapiFields.add("neighborhood_description");
    
    openapiFields.add("maps_url");
    
    openapiFields.add("overall_score");
    
    openapiFields.add("score_by_categories");
    
    openapiFields.add("latitude");
    
    openapiFields.add("longitude");
    
    openapiFields.add("location_chain");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HotelLocationInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelLocationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelLocationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelLocationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelLocationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelLocationInfo>() {
           @Override
           public void write(JsonWriter out, HotelLocationInfo value) throws IOException {
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
           public HotelLocationInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             HotelLocationInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static HotelLocationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelLocationInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
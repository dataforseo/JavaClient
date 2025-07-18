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



public class RatingInfo  {


  public static final String SERIALIZED_NAME_RATING_TYPE = "rating_type";
  @SerializedName(SERIALIZED_NAME_RATING_TYPE)
  private String ratingType;

  public RatingInfo ratingType(String ratingType) {
    this.ratingType = ratingType;
    return this;
  }

  /**
   * the type of rating
* here you can find the following elements: Max5, Percents, CustomMax
   * @return ratingType
   */
  @javax.annotation.Nullable
  public String getRatingType() {
    return ratingType;
  }

  public void setRatingType(String ratingType) {
    this.ratingType = ratingType;
  }


  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public RatingInfo value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * the value of the rating
   * @return value
   */
  @javax.annotation.Nullable
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  public static final String SERIALIZED_NAME_VOTES_COUNT = "votes_count";
  @SerializedName(SERIALIZED_NAME_VOTES_COUNT)
  private Long votesCount;

  public RatingInfo votesCount(Long votesCount) {
    this.votesCount = votesCount;
    return this;
  }

  /**
   * the amount of feedback
   * @return votesCount
   */
  @javax.annotation.Nullable
  public Long getVotesCount() {
    return votesCount;
  }

  public void setVotesCount(Long votesCount) {
    this.votesCount = votesCount;
  }


  public static final String SERIALIZED_NAME_RATING_MAX = "rating_max";
  @SerializedName(SERIALIZED_NAME_RATING_MAX)
  private Double ratingMax;

  public RatingInfo ratingMax(Double ratingMax) {
    this.ratingMax = ratingMax;
    return this;
  }

  /**
   * the maximum value for a rating_type
   * @return ratingMax
   */
  @javax.annotation.Nullable
  public Double getRatingMax() {
    return ratingMax;
  }

  public void setRatingMax(Double ratingMax) {
    this.ratingMax = ratingMax;
  }



  public RatingInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public RatingInfo putAdditionalProperty(String key, Object value) {
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


    
    RatingInfo ratingInfo = (RatingInfo) o;
    return

        Objects.equals(this.ratingType, ratingInfo.ratingType) &&
        Objects.equals(this.value, ratingInfo.value) &&
        Objects.equals(this.votesCount, ratingInfo.votesCount) &&
        Objects.equals(this.ratingMax, ratingInfo.ratingMax);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(ratingType, value, votesCount, ratingMax);
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
    sb.append("class RatingInfo {\n");

    sb.append("    ratingType: ").append(toIndentedString(ratingType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    votesCount: ").append(toIndentedString(votesCount)).append("\n");
    sb.append("    ratingMax: ").append(toIndentedString(ratingMax)).append("\n");
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
    
    openapiFields.add("rating_type");
    
    openapiFields.add("value");
    
    openapiFields.add("votes_count");
    
    openapiFields.add("rating_max");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RatingInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RatingInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RatingInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RatingInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RatingInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RatingInfo>() {
           @Override
           public void write(JsonWriter out, RatingInfo value) throws IOException {
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
           public RatingInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RatingInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static RatingInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RatingInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
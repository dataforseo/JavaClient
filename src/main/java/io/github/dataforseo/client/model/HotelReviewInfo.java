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



public class HotelReviewInfo  {


  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public HotelReviewInfo value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * overall hotel rating based on customer votes
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

  public HotelReviewInfo votesCount(Long votesCount) {
    this.votesCount = votesCount;
    return this;
  }

  /**
   * number of customer votes
* the number of customer votes included in the calculation of the hotel rating
   * @return votesCount
   */
  @javax.annotation.Nullable
  public Long getVotesCount() {
    return votesCount;
  }

  public void setVotesCount(Long votesCount) {
    this.votesCount = votesCount;
  }


  public static final String SERIALIZED_NAME_MENTIONS = "mentions";
  @SerializedName(SERIALIZED_NAME_MENTIONS)
  private List<ReviewMentionInfo> mentions;

  public HotelReviewInfo mentions(List<ReviewMentionInfo> mentions) {
    this.mentions = mentions;
    return this;
  }

  /**
   * hotel mentions
* information about hotel reviews by criteria
   * @return mentions
   */
  @javax.annotation.Nullable
  public List<ReviewMentionInfo> getMentions() {
    return mentions;
  }

  public void setMentions(List<ReviewMentionInfo> mentions) {
    this.mentions = mentions;
  }


  public static final String SERIALIZED_NAME_RATING_DISTRIBUTION = "rating_distribution";
  @SerializedName(SERIALIZED_NAME_RATING_DISTRIBUTION)
  private Map<String, Integer> ratingDistribution;

  public HotelReviewInfo ratingDistribution(Map<String, Integer> ratingDistribution) {
    this.ratingDistribution = ratingDistribution;
    return this;
  }

  /**
   * rating distribution by votes
* the distribution of votes across the rating in the range from 1 to 5
   * @return ratingDistribution
   */
  @javax.annotation.Nullable
  public Map<String, Integer> getRatingDistribution() {
    return ratingDistribution;
  }

  public void setRatingDistribution(Map<String, Integer> ratingDistribution) {
    this.ratingDistribution = ratingDistribution;
  }


  public static final String SERIALIZED_NAME_OTHER_SITES_REVIEWS = "other_sites_reviews";
  @SerializedName(SERIALIZED_NAME_OTHER_SITES_REVIEWS)
  private List<OtherSitesReviewsInfo> otherSitesReviews;

  public HotelReviewInfo otherSitesReviews(List<OtherSitesReviewsInfo> otherSitesReviews) {
    this.otherSitesReviews = otherSitesReviews;
    return this;
  }

  /**
   * reviews on third-party sites
* reviews from third-paty sites
   * @return otherSitesReviews
   */
  @javax.annotation.Nullable
  public List<OtherSitesReviewsInfo> getOtherSitesReviews() {
    return otherSitesReviews;
  }

  public void setOtherSitesReviews(List<OtherSitesReviewsInfo> otherSitesReviews) {
    this.otherSitesReviews = otherSitesReviews;
  }



  public HotelReviewInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public HotelReviewInfo putAdditionalProperty(String key, Object value) {
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


    
    HotelReviewInfo hotelReviewInfo = (HotelReviewInfo) o;
    return

        Objects.equals(this.value, hotelReviewInfo.value) &&
        Objects.equals(this.votesCount, hotelReviewInfo.votesCount) &&
        Objects.equals(this.mentions, hotelReviewInfo.mentions) &&
        Objects.equals(this.ratingDistribution, hotelReviewInfo.ratingDistribution) &&
        Objects.equals(this.otherSitesReviews, hotelReviewInfo.otherSitesReviews);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(value, votesCount, mentions, ratingDistribution, otherSitesReviews);
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
    sb.append("class HotelReviewInfo {\n");

    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    votesCount: ").append(toIndentedString(votesCount)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    ratingDistribution: ").append(toIndentedString(ratingDistribution)).append("\n");
    sb.append("    otherSitesReviews: ").append(toIndentedString(otherSitesReviews)).append("\n");
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
    
    openapiFields.add("value");
    
    openapiFields.add("votes_count");
    
    openapiFields.add("mentions");
    
    openapiFields.add("rating_distribution");
    
    openapiFields.add("other_sites_reviews");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HotelReviewInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelReviewInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelReviewInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelReviewInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelReviewInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelReviewInfo>() {
           @Override
           public void write(JsonWriter out, HotelReviewInfo value) throws IOException {
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
           public HotelReviewInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             HotelReviewInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static HotelReviewInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelReviewInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
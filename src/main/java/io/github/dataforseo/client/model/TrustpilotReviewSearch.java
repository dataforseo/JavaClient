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



public class TrustpilotReviewSearch  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public TrustpilotReviewSearch type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of element
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public TrustpilotReviewSearch rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * position within a group of elements with identical type values
* positions of elements with different type values are omitted from rank_group
   * @return rankGroup
   */
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public TrustpilotReviewSearch rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank among all the listed reviews
* absolute position among all reviews on the list
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public TrustpilotReviewSearch position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the review in SERP
* can take the following values: right
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public TrustpilotReviewSearch url(String url) {
    this.url = url;
    return this;
  }

  /**
   * the URL of the review
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public TrustpilotReviewSearch rating(RatingInfo rating) {
    this.rating = rating;
    return this;
  }

  /**
   * the rating score submitted by the reviewer
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingInfo getRating() {
    return rating;
  }

  public void setRating(RatingInfo rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public TrustpilotReviewSearch verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * indicates whether the review has the “Verified” mark
   * @return verified
   */
  @javax.annotation.Nullable
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public TrustpilotReviewSearch language(String language) {
    this.language = language;
    return this;
  }

  /**
   * the language of the review
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public TrustpilotReviewSearch timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time when a review was published
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public TrustpilotReviewSearch title(String title) {
    this.title = title;
    return this;
  }

  /**
   * the title of the review
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_REVIEW_TEXT = "review_text";
  @SerializedName(SERIALIZED_NAME_REVIEW_TEXT)
  private String reviewText;

  public TrustpilotReviewSearch reviewText(String reviewText) {
    this.reviewText = reviewText;
    return this;
  }

  /**
   * the content of the review
   * @return reviewText
   */
  @javax.annotation.Nullable
  public String getReviewText() {
    return reviewText;
  }

  public void setReviewText(String reviewText) {
    this.reviewText = reviewText;
  }


  public static final String SERIALIZED_NAME_REVIEW_IMAGES = "review_images";
  @SerializedName(SERIALIZED_NAME_REVIEW_IMAGES)
  private List<String> reviewImages;

  public TrustpilotReviewSearch reviewImages(List<String> reviewImages) {
    this.reviewImages = reviewImages;
    return this;
  }

  /**
   * images submitted by the reviewer
* displays URLs to the images provided by the author of the review;
* please note that Trustpilot doesn’t allow adding images to reviews, so the review_images parameter will always equal null
   * @return reviewImages
   */
  @javax.annotation.Nullable
  public List<String> getReviewImages() {
    return reviewImages;
  }

  public void setReviewImages(List<String> reviewImages) {
    this.reviewImages = reviewImages;
  }


  public static final String SERIALIZED_NAME_USER_PROFILE = "user_profile";
  @SerializedName(SERIALIZED_NAME_USER_PROFILE)
  private BusinessDataUserProfileInfo userProfile;

  public TrustpilotReviewSearch userProfile(BusinessDataUserProfileInfo userProfile) {
    this.userProfile = userProfile;
    return this;
  }

  /**
   * user profile of the reviewer
   * @return userProfile
   */
  @javax.annotation.Nullable
  public BusinessDataUserProfileInfo getUserProfile() {
    return userProfile;
  }

  public void setUserProfile(BusinessDataUserProfileInfo userProfile) {
    this.userProfile = userProfile;
  }


  public static final String SERIALIZED_NAME_RESPONSES = "responses";
  @SerializedName(SERIALIZED_NAME_RESPONSES)
  private List<ReviewResponseItemInfo> responses;

  public TrustpilotReviewSearch responses(List<ReviewResponseItemInfo> responses) {
    this.responses = responses;
    return this;
  }

  /**
   * owner’s response to the submitted review
   * @return responses
   */
  @javax.annotation.Nullable
  public List<ReviewResponseItemInfo> getResponses() {
    return responses;
  }

  public void setResponses(List<ReviewResponseItemInfo> responses) {
    this.responses = responses;
  }



  public TrustpilotReviewSearch() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public TrustpilotReviewSearch putAdditionalProperty(String key, Object value) {
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


    
    TrustpilotReviewSearch trustpilotReviewSearch = (TrustpilotReviewSearch) o;
    return

        Objects.equals(this.type, trustpilotReviewSearch.type) &&
        Objects.equals(this.rankGroup, trustpilotReviewSearch.rankGroup) &&
        Objects.equals(this.rankAbsolute, trustpilotReviewSearch.rankAbsolute) &&
        Objects.equals(this.position, trustpilotReviewSearch.position) &&
        Objects.equals(this.url, trustpilotReviewSearch.url) &&
        Objects.equals(this.rating, trustpilotReviewSearch.rating) &&
        Objects.equals(this.verified, trustpilotReviewSearch.verified) &&
        Objects.equals(this.language, trustpilotReviewSearch.language) &&
        Objects.equals(this.timestamp, trustpilotReviewSearch.timestamp) &&
        Objects.equals(this.title, trustpilotReviewSearch.title) &&
        Objects.equals(this.reviewText, trustpilotReviewSearch.reviewText) &&
        Objects.equals(this.reviewImages, trustpilotReviewSearch.reviewImages) &&
        Objects.equals(this.userProfile, trustpilotReviewSearch.userProfile) &&
        Objects.equals(this.responses, trustpilotReviewSearch.responses);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, position, url, rating, verified, language, timestamp, title, reviewText, reviewImages, userProfile, responses);
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
    sb.append("class TrustpilotReviewSearch {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    reviewText: ").append(toIndentedString(reviewText)).append("\n");
    sb.append("    reviewImages: ").append(toIndentedString(reviewImages)).append("\n");
    sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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
    
    openapiFields.add("type");
    
    openapiFields.add("rank_group");
    
    openapiFields.add("rank_absolute");
    
    openapiFields.add("position");
    
    openapiFields.add("url");
    
    openapiFields.add("rating");
    
    openapiFields.add("verified");
    
    openapiFields.add("language");
    
    openapiFields.add("timestamp");
    
    openapiFields.add("title");
    
    openapiFields.add("review_text");
    
    openapiFields.add("review_images");
    
    openapiFields.add("user_profile");
    
    openapiFields.add("responses");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TrustpilotReviewSearch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrustpilotReviewSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrustpilotReviewSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrustpilotReviewSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrustpilotReviewSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<TrustpilotReviewSearch>() {
           @Override
           public void write(JsonWriter out, TrustpilotReviewSearch value) throws IOException {
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
           public TrustpilotReviewSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TrustpilotReviewSearch instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static TrustpilotReviewSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrustpilotReviewSearch.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
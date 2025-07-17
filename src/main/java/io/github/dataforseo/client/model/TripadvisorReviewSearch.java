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



public class TripadvisorReviewSearch  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public TripadvisorReviewSearch type(String type) {
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

  public TripadvisorReviewSearch rankGroup(Integer rankGroup) {
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

  public TripadvisorReviewSearch rankAbsolute(Integer rankAbsolute) {
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

  public TripadvisorReviewSearch position(String position) {
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

  public TripadvisorReviewSearch url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the review
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
  private RatingElement rating;

  public TripadvisorReviewSearch rating(RatingElement rating) {
    this.rating = rating;
    return this;
  }

  /**
   * the rating score submitted by the reviewer
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingElement getRating() {
    return rating;
  }

  public void setRating(RatingElement rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_DATE_OF_VISIT = "date_of_visit";
  @SerializedName(SERIALIZED_NAME_DATE_OF_VISIT)
  private String dateOfVisit;

  public TripadvisorReviewSearch dateOfVisit(String dateOfVisit) {
    this.dateOfVisit = dateOfVisit;
    return this;
  }

  /**
   * date of the reviewer’s visit to the local establishment
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return dateOfVisit
   */
  @javax.annotation.Nullable
  public String getDateOfVisit() {
    return dateOfVisit;
  }

  public void setDateOfVisit(String dateOfVisit) {
    this.dateOfVisit = dateOfVisit;
  }


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public TripadvisorReviewSearch timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time when the review was published
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


  public static final String SERIALIZED_NAME_REVIEW_ID = "review_id";
  @SerializedName(SERIALIZED_NAME_REVIEW_ID)
  private String reviewId;

  public TripadvisorReviewSearch reviewId(String reviewId) {
    this.reviewId = reviewId;
    return this;
  }

  /**
   * ID of the review
   * @return reviewId
   */
  @javax.annotation.Nullable
  public String getReviewId() {
    return reviewId;
  }

  public void setReviewId(String reviewId) {
    this.reviewId = reviewId;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public TripadvisorReviewSearch title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the review
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

  public TripadvisorReviewSearch reviewText(String reviewText) {
    this.reviewText = reviewText;
    return this;
  }

  /**
   * content of the review
   * @return reviewText
   */
  @javax.annotation.Nullable
  public String getReviewText() {
    return reviewText;
  }

  public void setReviewText(String reviewText) {
    this.reviewText = reviewText;
  }


  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public TripadvisorReviewSearch language(String language) {
    this.language = language;
    return this;
  }

  /**
   * language of the review text
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public static final String SERIALIZED_NAME_ORIGINAL_LANGUAGE = "original_language";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_LANGUAGE)
  private String originalLanguage;

  public TripadvisorReviewSearch originalLanguage(String originalLanguage) {
    this.originalLanguage = originalLanguage;
    return this;
  }

  /**
   * language of the untranslated review text
   * @return originalLanguage
   */
  @javax.annotation.Nullable
  public String getOriginalLanguage() {
    return originalLanguage;
  }

  public void setOriginalLanguage(String originalLanguage) {
    this.originalLanguage = originalLanguage;
  }


  public static final String SERIALIZED_NAME_REVIEW_IMAGES = "review_images";
  @SerializedName(SERIALIZED_NAME_REVIEW_IMAGES)
  private List<ImageUrlInfo> reviewImages;

  public TripadvisorReviewSearch reviewImages(List<ImageUrlInfo> reviewImages) {
    this.reviewImages = reviewImages;
    return this;
  }

  /**
   * contains URLs of the images used in the review
   * @return reviewImages
   */
  @javax.annotation.Nullable
  public List<ImageUrlInfo> getReviewImages() {
    return reviewImages;
  }

  public void setReviewImages(List<ImageUrlInfo> reviewImages) {
    this.reviewImages = reviewImages;
  }


  public static final String SERIALIZED_NAME_USER_PROFILE = "user_profile";
  @SerializedName(SERIALIZED_NAME_USER_PROFILE)
  private BusinessDataUserProfileInfo userProfile;

  public TripadvisorReviewSearch userProfile(BusinessDataUserProfileInfo userProfile) {
    this.userProfile = userProfile;
    return this;
  }

  /**
   * information from the reviewer’s profile
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

  public TripadvisorReviewSearch responses(List<ReviewResponseItemInfo> responses) {
    this.responses = responses;
    return this;
  }

  /**
   * contains information about the owner’s response
   * @return responses
   */
  @javax.annotation.Nullable
  public List<ReviewResponseItemInfo> getResponses() {
    return responses;
  }

  public void setResponses(List<ReviewResponseItemInfo> responses) {
    this.responses = responses;
  }



  public TripadvisorReviewSearch() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public TripadvisorReviewSearch putAdditionalProperty(String key, Object value) {
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


    
    TripadvisorReviewSearch tripadvisorReviewSearch = (TripadvisorReviewSearch) o;
    return

        Objects.equals(this.type, tripadvisorReviewSearch.type) &&
        Objects.equals(this.rankGroup, tripadvisorReviewSearch.rankGroup) &&
        Objects.equals(this.rankAbsolute, tripadvisorReviewSearch.rankAbsolute) &&
        Objects.equals(this.position, tripadvisorReviewSearch.position) &&
        Objects.equals(this.url, tripadvisorReviewSearch.url) &&
        Objects.equals(this.rating, tripadvisorReviewSearch.rating) &&
        Objects.equals(this.dateOfVisit, tripadvisorReviewSearch.dateOfVisit) &&
        Objects.equals(this.timestamp, tripadvisorReviewSearch.timestamp) &&
        Objects.equals(this.reviewId, tripadvisorReviewSearch.reviewId) &&
        Objects.equals(this.title, tripadvisorReviewSearch.title) &&
        Objects.equals(this.reviewText, tripadvisorReviewSearch.reviewText) &&
        Objects.equals(this.language, tripadvisorReviewSearch.language) &&
        Objects.equals(this.originalLanguage, tripadvisorReviewSearch.originalLanguage) &&
        Objects.equals(this.reviewImages, tripadvisorReviewSearch.reviewImages) &&
        Objects.equals(this.userProfile, tripadvisorReviewSearch.userProfile) &&
        Objects.equals(this.responses, tripadvisorReviewSearch.responses);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, position, url, rating, dateOfVisit, timestamp, reviewId, title, reviewText, language, originalLanguage, reviewImages, userProfile, responses);
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
    sb.append("class TripadvisorReviewSearch {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    dateOfVisit: ").append(toIndentedString(dateOfVisit)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    reviewText: ").append(toIndentedString(reviewText)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
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
    
    openapiFields.add("date_of_visit");
    
    openapiFields.add("timestamp");
    
    openapiFields.add("review_id");
    
    openapiFields.add("title");
    
    openapiFields.add("review_text");
    
    openapiFields.add("language");
    
    openapiFields.add("original_language");
    
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
   * @throws IOException if the JSON Element is invalid with respect to TripadvisorReviewSearch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TripadvisorReviewSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TripadvisorReviewSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TripadvisorReviewSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TripadvisorReviewSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<TripadvisorReviewSearch>() {
           @Override
           public void write(JsonWriter out, TripadvisorReviewSearch value) throws IOException {
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
           public TripadvisorReviewSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TripadvisorReviewSearch instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static TripadvisorReviewSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TripadvisorReviewSearch.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
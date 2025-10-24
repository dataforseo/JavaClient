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



public class GoogleExtendedReviewsSearch  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GoogleExtendedReviewsSearch type(String type) {
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

  public GoogleExtendedReviewsSearch rankGroup(Integer rankGroup) {
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

  public GoogleExtendedReviewsSearch rankAbsolute(Integer rankAbsolute) {
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

  public GoogleExtendedReviewsSearch position(String position) {
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


  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public GoogleExtendedReviewsSearch xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  /**
   * the XPath of the review
   * @return xpath
   */
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public static final String SERIALIZED_NAME_REVIEW_TEXT = "review_text";
  @SerializedName(SERIALIZED_NAME_REVIEW_TEXT)
  private String reviewText;

  public GoogleExtendedReviewsSearch reviewText(String reviewText) {
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


  public static final String SERIALIZED_NAME_ORIGINAL_REVIEW_TEXT = "original_review_text";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_REVIEW_TEXT)
  private String originalReviewText;

  public GoogleExtendedReviewsSearch originalReviewText(String originalReviewText) {
    this.originalReviewText = originalReviewText;
    return this;
  }

  /**
   * original content of the review
* the original content of the review, no auto-translate applied
   * @return originalReviewText
   */
  @javax.annotation.Nullable
  public String getOriginalReviewText() {
    return originalReviewText;
  }

  public void setOriginalReviewText(String originalReviewText) {
    this.originalReviewText = originalReviewText;
  }


  public static final String SERIALIZED_NAME_TIME_AGO = "time_ago";
  @SerializedName(SERIALIZED_NAME_TIME_AGO)
  private String timeAgo;

  public GoogleExtendedReviewsSearch timeAgo(String timeAgo) {
    this.timeAgo = timeAgo;
    return this;
  }

  /**
   * the time of publication
* indicates the time (in the ‘time ago’ format) when the review was listed
   * @return timeAgo
   */
  @javax.annotation.Nullable
  public String getTimeAgo() {
    return timeAgo;
  }

  public void setTimeAgo(String timeAgo) {
    this.timeAgo = timeAgo;
  }


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public GoogleExtendedReviewsSearch timestamp(String timestamp) {
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


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public GoogleExtendedReviewsSearch rating(RatingInfo rating) {
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


  public static final String SERIALIZED_NAME_REVIEWS_COUNT = "reviews_count";
  @SerializedName(SERIALIZED_NAME_REVIEWS_COUNT)
  private Long reviewsCount;

  public GoogleExtendedReviewsSearch reviewsCount(Long reviewsCount) {
    this.reviewsCount = reviewsCount;
    return this;
  }

  /**
   * total number of reviews submitted by the reviewer
   * @return reviewsCount
   */
  @javax.annotation.Nullable
  public Long getReviewsCount() {
    return reviewsCount;
  }

  public void setReviewsCount(Long reviewsCount) {
    this.reviewsCount = reviewsCount;
  }


  public static final String SERIALIZED_NAME_PHOTOS_COUNT = "photos_count";
  @SerializedName(SERIALIZED_NAME_PHOTOS_COUNT)
  private Long photosCount;

  public GoogleExtendedReviewsSearch photosCount(Long photosCount) {
    this.photosCount = photosCount;
    return this;
  }

  /**
   * total number of photos submitted by the reviewer
   * @return photosCount
   */
  @javax.annotation.Nullable
  public Long getPhotosCount() {
    return photosCount;
  }

  public void setPhotosCount(Long photosCount) {
    this.photosCount = photosCount;
  }


  public static final String SERIALIZED_NAME_LOCAL_GUIDE = "local_guide";
  @SerializedName(SERIALIZED_NAME_LOCAL_GUIDE)
  private Boolean localGuide;

  public GoogleExtendedReviewsSearch localGuide(Boolean localGuide) {
    this.localGuide = localGuide;
    return this;
  }

  /**
   * indicates whether the reviewer has a ‘local guide’ status
   * @return localGuide
   */
  @javax.annotation.Nullable
  public Boolean getLocalGuide() {
    return localGuide;
  }

  public void setLocalGuide(Boolean localGuide) {
    this.localGuide = localGuide;
  }


  public static final String SERIALIZED_NAME_PROFILE_NAME = "profile_name";
  @SerializedName(SERIALIZED_NAME_PROFILE_NAME)
  private String profileName;

  public GoogleExtendedReviewsSearch profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

  /**
   * profile name of the reviewer
   * @return profileName
   */
  @javax.annotation.Nullable
  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }


  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public GoogleExtendedReviewsSearch profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

  /**
   * URL of the reviewer’s profile
   * @return profileUrl
   */
  @javax.annotation.Nullable
  public String getProfileUrl() {
    return profileUrl;
  }

  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public static final String SERIALIZED_NAME_REVIEW_URL = "review_url";
  @SerializedName(SERIALIZED_NAME_REVIEW_URL)
  private String reviewUrl;

  public GoogleExtendedReviewsSearch reviewUrl(String reviewUrl) {
    this.reviewUrl = reviewUrl;
    return this;
  }

  /**
   * the URL of the review
   * @return reviewUrl
   */
  @javax.annotation.Nullable
  public String getReviewUrl() {
    return reviewUrl;
  }

  public void setReviewUrl(String reviewUrl) {
    this.reviewUrl = reviewUrl;
  }


  public static final String SERIALIZED_NAME_PROFILE_IMAGE_URL = "profile_image_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_IMAGE_URL)
  private String profileImageUrl;

  public GoogleExtendedReviewsSearch profileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
    return this;
  }

  /**
   * URL of the reviewer’s profile image
   * @return profileImageUrl
   */
  @javax.annotation.Nullable
  public String getProfileImageUrl() {
    return profileImageUrl;
  }

  public void setProfileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
  }


  public static final String SERIALIZED_NAME_OWNER_ANSWER = "owner_answer";
  @SerializedName(SERIALIZED_NAME_OWNER_ANSWER)
  private String ownerAnswer;

  public GoogleExtendedReviewsSearch ownerAnswer(String ownerAnswer) {
    this.ownerAnswer = ownerAnswer;
    return this;
  }

  /**
   * text of the owner’s response
* the owner’s response to the review
   * @return ownerAnswer
   */
  @javax.annotation.Nullable
  public String getOwnerAnswer() {
    return ownerAnswer;
  }

  public void setOwnerAnswer(String ownerAnswer) {
    this.ownerAnswer = ownerAnswer;
  }


  public static final String SERIALIZED_NAME_ORIGINAL_OWNER_ANSWER = "original_owner_answer";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_OWNER_ANSWER)
  private String originalOwnerAnswer;

  public GoogleExtendedReviewsSearch originalOwnerAnswer(String originalOwnerAnswer) {
    this.originalOwnerAnswer = originalOwnerAnswer;
    return this;
  }

  /**
   * original text of the owner’s response
* the original response to the review, no auto-translate applied
   * @return originalOwnerAnswer
   */
  @javax.annotation.Nullable
  public String getOriginalOwnerAnswer() {
    return originalOwnerAnswer;
  }

  public void setOriginalOwnerAnswer(String originalOwnerAnswer) {
    this.originalOwnerAnswer = originalOwnerAnswer;
  }


  public static final String SERIALIZED_NAME_OWNER_TIME_AGO = "owner_time_ago";
  @SerializedName(SERIALIZED_NAME_OWNER_TIME_AGO)
  private String ownerTimeAgo;

  public GoogleExtendedReviewsSearch ownerTimeAgo(String ownerTimeAgo) {
    this.ownerTimeAgo = ownerTimeAgo;
    return this;
  }

  /**
   * publication time
* indicates the time (in the ‘time ago’ format) when the owner submitted the response to the review
   * @return ownerTimeAgo
   */
  @javax.annotation.Nullable
  public String getOwnerTimeAgo() {
    return ownerTimeAgo;
  }

  public void setOwnerTimeAgo(String ownerTimeAgo) {
    this.ownerTimeAgo = ownerTimeAgo;
  }


  public static final String SERIALIZED_NAME_OWNER_TIMESTAMP = "owner_timestamp";
  @SerializedName(SERIALIZED_NAME_OWNER_TIMESTAMP)
  private String ownerTimestamp;

  public GoogleExtendedReviewsSearch ownerTimestamp(String ownerTimestamp) {
    this.ownerTimestamp = ownerTimestamp;
    return this;
  }

  /**
   * date and time of the owner’s reply to the review
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return ownerTimestamp
   */
  @javax.annotation.Nullable
  public String getOwnerTimestamp() {
    return ownerTimestamp;
  }

  public void setOwnerTimestamp(String ownerTimestamp) {
    this.ownerTimestamp = ownerTimestamp;
  }


  public static final String SERIALIZED_NAME_REVIEW_ID = "review_id";
  @SerializedName(SERIALIZED_NAME_REVIEW_ID)
  private String reviewId;

  public GoogleExtendedReviewsSearch reviewId(String reviewId) {
    this.reviewId = reviewId;
    return this;
  }

  /**
   * the unique identifier of a review on Google
* example:
* ChZDSUhNMG9nS0VJQ0FnSUMxbHFyMFlnEAE
   * @return reviewId
   */
  @javax.annotation.Nullable
  public String getReviewId() {
    return reviewId;
  }

  public void setReviewId(String reviewId) {
    this.reviewId = reviewId;
  }


  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<AiModeImagesElementInfo> images;

  public GoogleExtendedReviewsSearch images(List<AiModeImagesElementInfo> images) {
    this.images = images;
    return this;
  }

  /**
   * images submitted by the reviewer
   * @return images
   */
  @javax.annotation.Nullable
  public List<AiModeImagesElementInfo> getImages() {
    return images;
  }

  public void setImages(List<AiModeImagesElementInfo> images) {
    this.images = images;
  }


  public static final String SERIALIZED_NAME_REVIEW_HIGHLIGHTS = "review_highlights";
  @SerializedName(SERIALIZED_NAME_REVIEW_HIGHLIGHTS)
  private List<ReviewHighlights> reviewHighlights;

  public GoogleExtendedReviewsSearch reviewHighlights(List<ReviewHighlights> reviewHighlights) {
    this.reviewHighlights = reviewHighlights;
    return this;
  }

  /**
   * review highlights
* contains highlighted review criteria and assessments
   * @return reviewHighlights
   */
  @javax.annotation.Nullable
  public List<ReviewHighlights> getReviewHighlights() {
    return reviewHighlights;
  }

  public void setReviewHighlights(List<ReviewHighlights> reviewHighlights) {
    this.reviewHighlights = reviewHighlights;
  }


  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Source source;

  public GoogleExtendedReviewsSearch source(Source source) {
    this.source = source;
    return this;
  }

  /**
   * source of the review
* contains information about the source where the review was posted
   * @return source
   */
  @javax.annotation.Nullable
  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }



  public GoogleExtendedReviewsSearch() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public GoogleExtendedReviewsSearch putAdditionalProperty(String key, Object value) {
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


    
    GoogleExtendedReviewsSearch googleExtendedReviewsSearch = (GoogleExtendedReviewsSearch) o;
    return

        Objects.equals(this.type, googleExtendedReviewsSearch.type) &&
        Objects.equals(this.rankGroup, googleExtendedReviewsSearch.rankGroup) &&
        Objects.equals(this.rankAbsolute, googleExtendedReviewsSearch.rankAbsolute) &&
        Objects.equals(this.position, googleExtendedReviewsSearch.position) &&
        Objects.equals(this.xpath, googleExtendedReviewsSearch.xpath) &&
        Objects.equals(this.reviewText, googleExtendedReviewsSearch.reviewText) &&
        Objects.equals(this.originalReviewText, googleExtendedReviewsSearch.originalReviewText) &&
        Objects.equals(this.timeAgo, googleExtendedReviewsSearch.timeAgo) &&
        Objects.equals(this.timestamp, googleExtendedReviewsSearch.timestamp) &&
        Objects.equals(this.rating, googleExtendedReviewsSearch.rating) &&
        Objects.equals(this.reviewsCount, googleExtendedReviewsSearch.reviewsCount) &&
        Objects.equals(this.photosCount, googleExtendedReviewsSearch.photosCount) &&
        Objects.equals(this.localGuide, googleExtendedReviewsSearch.localGuide) &&
        Objects.equals(this.profileName, googleExtendedReviewsSearch.profileName) &&
        Objects.equals(this.profileUrl, googleExtendedReviewsSearch.profileUrl) &&
        Objects.equals(this.reviewUrl, googleExtendedReviewsSearch.reviewUrl) &&
        Objects.equals(this.profileImageUrl, googleExtendedReviewsSearch.profileImageUrl) &&
        Objects.equals(this.ownerAnswer, googleExtendedReviewsSearch.ownerAnswer) &&
        Objects.equals(this.originalOwnerAnswer, googleExtendedReviewsSearch.originalOwnerAnswer) &&
        Objects.equals(this.ownerTimeAgo, googleExtendedReviewsSearch.ownerTimeAgo) &&
        Objects.equals(this.ownerTimestamp, googleExtendedReviewsSearch.ownerTimestamp) &&
        Objects.equals(this.reviewId, googleExtendedReviewsSearch.reviewId) &&
        Objects.equals(this.images, googleExtendedReviewsSearch.images) &&
        Objects.equals(this.reviewHighlights, googleExtendedReviewsSearch.reviewHighlights) &&
        Objects.equals(this.source, googleExtendedReviewsSearch.source);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, position, xpath, reviewText, originalReviewText, timeAgo, timestamp, rating, reviewsCount, photosCount, localGuide, profileName, profileUrl, reviewUrl, profileImageUrl, ownerAnswer, originalOwnerAnswer, ownerTimeAgo, ownerTimestamp, reviewId, images, reviewHighlights, source);
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
    sb.append("class GoogleExtendedReviewsSearch {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    reviewText: ").append(toIndentedString(reviewText)).append("\n");
    sb.append("    originalReviewText: ").append(toIndentedString(originalReviewText)).append("\n");
    sb.append("    timeAgo: ").append(toIndentedString(timeAgo)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    reviewsCount: ").append(toIndentedString(reviewsCount)).append("\n");
    sb.append("    photosCount: ").append(toIndentedString(photosCount)).append("\n");
    sb.append("    localGuide: ").append(toIndentedString(localGuide)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    reviewUrl: ").append(toIndentedString(reviewUrl)).append("\n");
    sb.append("    profileImageUrl: ").append(toIndentedString(profileImageUrl)).append("\n");
    sb.append("    ownerAnswer: ").append(toIndentedString(ownerAnswer)).append("\n");
    sb.append("    originalOwnerAnswer: ").append(toIndentedString(originalOwnerAnswer)).append("\n");
    sb.append("    ownerTimeAgo: ").append(toIndentedString(ownerTimeAgo)).append("\n");
    sb.append("    ownerTimestamp: ").append(toIndentedString(ownerTimestamp)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    reviewHighlights: ").append(toIndentedString(reviewHighlights)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    
    openapiFields.add("xpath");
    
    openapiFields.add("review_text");
    
    openapiFields.add("original_review_text");
    
    openapiFields.add("time_ago");
    
    openapiFields.add("timestamp");
    
    openapiFields.add("rating");
    
    openapiFields.add("reviews_count");
    
    openapiFields.add("photos_count");
    
    openapiFields.add("local_guide");
    
    openapiFields.add("profile_name");
    
    openapiFields.add("profile_url");
    
    openapiFields.add("review_url");
    
    openapiFields.add("profile_image_url");
    
    openapiFields.add("owner_answer");
    
    openapiFields.add("original_owner_answer");
    
    openapiFields.add("owner_time_ago");
    
    openapiFields.add("owner_timestamp");
    
    openapiFields.add("review_id");
    
    openapiFields.add("images");
    
    openapiFields.add("review_highlights");
    
    openapiFields.add("source");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleExtendedReviewsSearch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleExtendedReviewsSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleExtendedReviewsSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleExtendedReviewsSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleExtendedReviewsSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleExtendedReviewsSearch>() {
           @Override
           public void write(JsonWriter out, GoogleExtendedReviewsSearch value) throws IOException {
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
           public GoogleExtendedReviewsSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleExtendedReviewsSearch instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static GoogleExtendedReviewsSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleExtendedReviewsSearch.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
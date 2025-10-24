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



public class AmazonReviewItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AmazonReviewItem type(String type) {
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

  public AmazonReviewItem rankGroup(Integer rankGroup) {
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

  public AmazonReviewItem rankAbsolute(Integer rankAbsolute) {
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

  public AmazonReviewItem position(String position) {
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

  public AmazonReviewItem xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  /**
   * the XPath of the element
   * @return xpath
   */
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public AmazonReviewItem verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * indicates whether the review has the “Verified Purchase” mark
   * @return verified
   */
  @javax.annotation.Nullable
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public static final String SERIALIZED_NAME_SUBTITLE = "subtitle";
  @SerializedName(SERIALIZED_NAME_SUBTITLE)
  private String subtitle;

  public AmazonReviewItem subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * subtitle of the review
   * @return subtitle
   */
  @javax.annotation.Nullable
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  public static final String SERIALIZED_NAME_HELPFUL_VOTES = "helpful_votes";
  @SerializedName(SERIALIZED_NAME_HELPFUL_VOTES)
  private String helpfulVotes;

  public AmazonReviewItem helpfulVotes(String helpfulVotes) {
    this.helpfulVotes = helpfulVotes;
    return this;
  }

  /**
   * helpful votes count
* number of users who clicked on the ‘Helpful” button under the review text
   * @return helpfulVotes
   */
  @javax.annotation.Nullable
  public String getHelpfulVotes() {
    return helpfulVotes;
  }

  public void setHelpfulVotes(String helpfulVotes) {
    this.helpfulVotes = helpfulVotes;
  }


  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<AiModeImagesElementInfo> images;

  public AmazonReviewItem images(List<AiModeImagesElementInfo> images) {
    this.images = images;
    return this;
  }

  /**
   * images of the product submitted by the reviewer
   * @return images
   */
  @javax.annotation.Nullable
  public List<AiModeImagesElementInfo> getImages() {
    return images;
  }

  public void setImages(List<AiModeImagesElementInfo> images) {
    this.images = images;
  }


  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private List<VideoElement> videos;

  public AmazonReviewItem videos(List<VideoElement> videos) {
    this.videos = videos;
    return this;
  }

  /**
   * videos of the product submitted by the reviewer
   * @return videos
   */
  @javax.annotation.Nullable
  public List<VideoElement> getVideos() {
    return videos;
  }

  public void setVideos(List<VideoElement> videos) {
    this.videos = videos;
  }


  public static final String SERIALIZED_NAME_USER_PROFILE = "user_profile";
  @SerializedName(SERIALIZED_NAME_USER_PROFILE)
  private UserProfileInfo userProfile;

  public AmazonReviewItem userProfile(UserProfileInfo userProfile) {
    this.userProfile = userProfile;
    return this;
  }

  /**
   * user profile of the reviewer
   * @return userProfile
   */
  @javax.annotation.Nullable
  public UserProfileInfo getUserProfile() {
    return userProfile;
  }

  public void setUserProfile(UserProfileInfo userProfile) {
    this.userProfile = userProfile;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AmazonReviewItem title(String title) {
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


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public AmazonReviewItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to the reviewer’s profile
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_REVIEW_TEXT = "review_text";
  @SerializedName(SERIALIZED_NAME_REVIEW_TEXT)
  private String reviewText;

  public AmazonReviewItem reviewText(String reviewText) {
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


  public static final String SERIALIZED_NAME_PUBLICATION_DATE = "publication_date";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DATE)
  private String publicationDate;

  public AmazonReviewItem publicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

  /**
   * date and time when the review was published
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”;
* example:
* 2019-11-15 12:57:46 +00:00
   * @return publicationDate
   */
  @javax.annotation.Nullable
  public String getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public AmazonReviewItem rating(RatingInfo rating) {
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



  public AmazonReviewItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AmazonReviewItem putAdditionalProperty(String key, Object value) {
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


    
    AmazonReviewItem amazonReviewItem = (AmazonReviewItem) o;
    return

        Objects.equals(this.type, amazonReviewItem.type) &&
        Objects.equals(this.rankGroup, amazonReviewItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, amazonReviewItem.rankAbsolute) &&
        Objects.equals(this.position, amazonReviewItem.position) &&
        Objects.equals(this.xpath, amazonReviewItem.xpath) &&
        Objects.equals(this.verified, amazonReviewItem.verified) &&
        Objects.equals(this.subtitle, amazonReviewItem.subtitle) &&
        Objects.equals(this.helpfulVotes, amazonReviewItem.helpfulVotes) &&
        Objects.equals(this.images, amazonReviewItem.images) &&
        Objects.equals(this.videos, amazonReviewItem.videos) &&
        Objects.equals(this.userProfile, amazonReviewItem.userProfile) &&
        Objects.equals(this.title, amazonReviewItem.title) &&
        Objects.equals(this.url, amazonReviewItem.url) &&
        Objects.equals(this.reviewText, amazonReviewItem.reviewText) &&
        Objects.equals(this.publicationDate, amazonReviewItem.publicationDate) &&
        Objects.equals(this.rating, amazonReviewItem.rating);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, position, xpath, verified, subtitle, helpfulVotes, images, videos, userProfile, title, url, reviewText, publicationDate, rating);
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
    sb.append("class AmazonReviewItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    helpfulVotes: ").append(toIndentedString(helpfulVotes)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    reviewText: ").append(toIndentedString(reviewText)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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
    
    openapiFields.add("verified");
    
    openapiFields.add("subtitle");
    
    openapiFields.add("helpful_votes");
    
    openapiFields.add("images");
    
    openapiFields.add("videos");
    
    openapiFields.add("user_profile");
    
    openapiFields.add("title");
    
    openapiFields.add("url");
    
    openapiFields.add("review_text");
    
    openapiFields.add("publication_date");
    
    openapiFields.add("rating");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AmazonReviewItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmazonReviewItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonReviewItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonReviewItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonReviewItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonReviewItem>() {
           @Override
           public void write(JsonWriter out, AmazonReviewItem value) throws IOException {
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
           public AmazonReviewItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AmazonReviewItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AmazonReviewItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonReviewItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
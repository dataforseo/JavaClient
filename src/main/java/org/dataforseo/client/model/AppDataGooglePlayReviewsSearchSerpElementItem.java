/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.dataforseo.client.model.AppUserProfileInfo;
import org.dataforseo.client.model.BaseAppDataSerpElementItem;
import org.dataforseo.client.model.RatingInfo;
import org.dataforseo.client.model.ResponseDataInfo;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * AppDataGooglePlayReviewsSearchSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T15:18:23.103906100+03:00[Europe/Kiev]")
public class AppDataGooglePlayReviewsSearchSerpElementItem extends BaseAppDataSerpElementItem {
  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_HELPFUL_COUNT = "helpful_count";
  @SerializedName(SERIALIZED_NAME_HELPFUL_COUNT)
  private Long helpfulCount;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_REVIEW_TEXT = "review_text";
  @SerializedName(SERIALIZED_NAME_REVIEW_TEXT)
  private String reviewText;

  public static final String SERIALIZED_NAME_USER_PROFILE = "user_profile";
  @SerializedName(SERIALIZED_NAME_USER_PROFILE)
  private AppUserProfileInfo userProfile;

  public static final String SERIALIZED_NAME_RESPONSES = "responses";
  @SerializedName(SERIALIZED_NAME_RESPONSES)
  private List<ResponseDataInfo> responses;

  public AppDataGooglePlayReviewsSearchSerpElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public AppDataGooglePlayReviewsSearchSerpElementItem rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

   /**
   * position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group
   * @return rankGroup
  **/
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

   /**
   * absolute rank among all the listed reviews absolute position among all reviews on the list
   * @return rankAbsolute
  **/
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem position(String position) {
    this.position = position;
    return this;
  }

   /**
   * the alignment of the review in SERP can take the following values: left
   * @return position
  **/
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem version(String version) {
    this.version = version;
    return this;
  }

   /**
   * version of the app version of the app for which the review is submitted
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem rating(RatingInfo rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @javax.annotation.Nullable
  public RatingInfo getRating() {
    return rating;
  }

  public void setRating(RatingInfo rating) {
    this.rating = rating;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * date and time when the review was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”; example: 2019-11-15 12:57:46 +00:00
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * id of the review
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem helpfulCount(Long helpfulCount) {
    this.helpfulCount = helpfulCount;
    return this;
  }

   /**
   * number of helpful votes indicates how many users considered the review helpful and voted with the thumbs up icon
   * @return helpfulCount
  **/
  @javax.annotation.Nullable
  public Long getHelpfulCount() {
    return helpfulCount;
  }

  public void setHelpfulCount(Long helpfulCount) {
    this.helpfulCount = helpfulCount;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title of the review Google Play doesn’t provide an option to title reviews, so this parameter will always equal null
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem reviewText(String reviewText) {
    this.reviewText = reviewText;
    return this;
  }

   /**
   * content of the review
   * @return reviewText
  **/
  @javax.annotation.Nullable
  public String getReviewText() {
    return reviewText;
  }

  public void setReviewText(String reviewText) {
    this.reviewText = reviewText;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem userProfile(AppUserProfileInfo userProfile) {
    this.userProfile = userProfile;
    return this;
  }

   /**
   * Get userProfile
   * @return userProfile
  **/
  @javax.annotation.Nullable
  public AppUserProfileInfo getUserProfile() {
    return userProfile;
  }

  public void setUserProfile(AppUserProfileInfo userProfile) {
    this.userProfile = userProfile;
  }


  public AppDataGooglePlayReviewsSearchSerpElementItem responses(List<ResponseDataInfo> responses) {
    this.responses = responses;
    return this;
  }

  public AppDataGooglePlayReviewsSearchSerpElementItem addResponsesItem(ResponseDataInfo responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
    return this;
  }

   /**
   * response from the developer
   * @return responses
  **/
  @javax.annotation.Nullable
  public List<ResponseDataInfo> getResponses() {
    return responses;
  }

  public void setResponses(List<ResponseDataInfo> responses) {
    this.responses = responses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDataGooglePlayReviewsSearchSerpElementItem appDataGooglePlayReviewsSearchSerpElementItem = (AppDataGooglePlayReviewsSearchSerpElementItem) o;
    return Objects.equals(this.rankGroup, appDataGooglePlayReviewsSearchSerpElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, appDataGooglePlayReviewsSearchSerpElementItem.rankAbsolute) &&
        Objects.equals(this.position, appDataGooglePlayReviewsSearchSerpElementItem.position) &&
        Objects.equals(this.version, appDataGooglePlayReviewsSearchSerpElementItem.version) &&
        Objects.equals(this.rating, appDataGooglePlayReviewsSearchSerpElementItem.rating) &&
        Objects.equals(this.timestamp, appDataGooglePlayReviewsSearchSerpElementItem.timestamp) &&
        Objects.equals(this.id, appDataGooglePlayReviewsSearchSerpElementItem.id) &&
        Objects.equals(this.helpfulCount, appDataGooglePlayReviewsSearchSerpElementItem.helpfulCount) &&
        Objects.equals(this.title, appDataGooglePlayReviewsSearchSerpElementItem.title) &&
        Objects.equals(this.reviewText, appDataGooglePlayReviewsSearchSerpElementItem.reviewText) &&
        Objects.equals(this.userProfile, appDataGooglePlayReviewsSearchSerpElementItem.userProfile) &&
        Objects.equals(this.responses, appDataGooglePlayReviewsSearchSerpElementItem.responses) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankGroup, rankAbsolute, position, version, rating, timestamp, id, helpfulCount, title, reviewText, userProfile, responses, super.hashCode());
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
    sb.append("class AppDataGooglePlayReviewsSearchSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    helpfulCount: ").append(toIndentedString(helpfulCount)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    reviewText: ").append(toIndentedString(reviewText)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("rating");
    openapiFields.add("timestamp");
    openapiFields.add("id");
    openapiFields.add("helpful_count");
    openapiFields.add("title");
    openapiFields.add("review_text");
    openapiFields.add("user_profile");
    openapiFields.add("responses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppDataGooglePlayReviewsSearchSerpElementItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppDataGooglePlayReviewsSearchSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppDataGooglePlayReviewsSearchSerpElementItem is not found in the empty JSON string", AppDataGooglePlayReviewsSearchSerpElementItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppDataGooglePlayReviewsSearchSerpElementItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppDataGooglePlayReviewsSearchSerpElementItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppDataGooglePlayReviewsSearchSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppDataGooglePlayReviewsSearchSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppDataGooglePlayReviewsSearchSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppDataGooglePlayReviewsSearchSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AppDataGooglePlayReviewsSearchSerpElementItem>() {
           @Override
           public void write(JsonWriter out, AppDataGooglePlayReviewsSearchSerpElementItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppDataGooglePlayReviewsSearchSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppDataGooglePlayReviewsSearchSerpElementItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppDataGooglePlayReviewsSearchSerpElementItem
  * @throws IOException if the JSON string is invalid with respect to AppDataGooglePlayReviewsSearchSerpElementItem
  */
  public static AppDataGooglePlayReviewsSearchSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppDataGooglePlayReviewsSearchSerpElementItem.class);
  }

 /**
  * Convert an instance of AppDataGooglePlayReviewsSearchSerpElementItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


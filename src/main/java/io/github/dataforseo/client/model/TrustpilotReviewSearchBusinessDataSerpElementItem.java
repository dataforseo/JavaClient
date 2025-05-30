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


package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.dataforseo.client.model.BaseBusinessDataSerpElementItem;
import io.github.dataforseo.client.model.BusinessDataRatingInfo;
import io.github.dataforseo.client.model.BusinessDataUserProfileInfo;
import io.github.dataforseo.client.model.ReviewResponseItemInfo;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

/**
 * TrustpilotReviewSearchBusinessDataSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class TrustpilotReviewSearchBusinessDataSerpElementItem extends BaseBusinessDataSerpElementItem {
  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private BusinessDataRatingInfo rating;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_REVIEW_TEXT = "review_text";
  @SerializedName(SERIALIZED_NAME_REVIEW_TEXT)
  private String reviewText;

  public static final String SERIALIZED_NAME_REVIEW_IMAGES = "review_images";
  @SerializedName(SERIALIZED_NAME_REVIEW_IMAGES)
  private List<String> reviewImages;

  public static final String SERIALIZED_NAME_USER_PROFILE = "user_profile";
  @SerializedName(SERIALIZED_NAME_USER_PROFILE)
  private BusinessDataUserProfileInfo userProfile;

  public static final String SERIALIZED_NAME_RESPONSES = "responses";
  @SerializedName(SERIALIZED_NAME_RESPONSES)
  private List<ReviewResponseItemInfo> responses;

  public TrustpilotReviewSearchBusinessDataSerpElementItem() {
  }

  public TrustpilotReviewSearchBusinessDataSerpElementItem position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the review in SERP can take the following values: right
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public TrustpilotReviewSearchBusinessDataSerpElementItem url(String url) {
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


  public TrustpilotReviewSearchBusinessDataSerpElementItem rating(BusinessDataRatingInfo rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
   */
  @javax.annotation.Nullable
  public BusinessDataRatingInfo getRating() {
    return rating;
  }

  public void setRating(BusinessDataRatingInfo rating) {
    this.rating = rating;
  }


  public TrustpilotReviewSearchBusinessDataSerpElementItem verified(Boolean verified) {
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


  public TrustpilotReviewSearchBusinessDataSerpElementItem language(String language) {
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


  public TrustpilotReviewSearchBusinessDataSerpElementItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time when a review was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public TrustpilotReviewSearchBusinessDataSerpElementItem title(String title) {
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


  public TrustpilotReviewSearchBusinessDataSerpElementItem reviewText(String reviewText) {
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


  public TrustpilotReviewSearchBusinessDataSerpElementItem reviewImages(List<String> reviewImages) {
    this.reviewImages = reviewImages;
    return this;
  }

  public TrustpilotReviewSearchBusinessDataSerpElementItem addReviewImagesItem(String reviewImagesItem) {
    if (this.reviewImages == null) {
      this.reviewImages = new ArrayList<>();
    }
    this.reviewImages.add(reviewImagesItem);
    return this;
  }

  /**
   * images submitted by the reviewer displays URLs to the images provided by the author of the review; please note that Trustpilot doesn’t allow adding images to reviews, so the review_images parameter will always equal null
   * @return reviewImages
   */
  @javax.annotation.Nullable
  public List<String> getReviewImages() {
    return reviewImages;
  }

  public void setReviewImages(List<String> reviewImages) {
    this.reviewImages = reviewImages;
  }


  public TrustpilotReviewSearchBusinessDataSerpElementItem userProfile(BusinessDataUserProfileInfo userProfile) {
    this.userProfile = userProfile;
    return this;
  }

  /**
   * Get userProfile
   * @return userProfile
   */
  @javax.annotation.Nullable
  public BusinessDataUserProfileInfo getUserProfile() {
    return userProfile;
  }

  public void setUserProfile(BusinessDataUserProfileInfo userProfile) {
    this.userProfile = userProfile;
  }


  public TrustpilotReviewSearchBusinessDataSerpElementItem responses(List<ReviewResponseItemInfo> responses) {
    this.responses = responses;
    return this;
  }

  public TrustpilotReviewSearchBusinessDataSerpElementItem addResponsesItem(ReviewResponseItemInfo responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TrustpilotReviewSearchBusinessDataSerpElementItem instance itself
   */
  public TrustpilotReviewSearchBusinessDataSerpElementItem putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    TrustpilotReviewSearchBusinessDataSerpElementItem trustpilotReviewSearchBusinessDataSerpElementItem = (TrustpilotReviewSearchBusinessDataSerpElementItem) o;
    return Objects.equals(this.position, trustpilotReviewSearchBusinessDataSerpElementItem.position) &&
        Objects.equals(this.url, trustpilotReviewSearchBusinessDataSerpElementItem.url) &&
        Objects.equals(this.rating, trustpilotReviewSearchBusinessDataSerpElementItem.rating) &&
        Objects.equals(this.verified, trustpilotReviewSearchBusinessDataSerpElementItem.verified) &&
        Objects.equals(this.language, trustpilotReviewSearchBusinessDataSerpElementItem.language) &&
        Objects.equals(this.timestamp, trustpilotReviewSearchBusinessDataSerpElementItem.timestamp) &&
        Objects.equals(this.title, trustpilotReviewSearchBusinessDataSerpElementItem.title) &&
        Objects.equals(this.reviewText, trustpilotReviewSearchBusinessDataSerpElementItem.reviewText) &&
        Objects.equals(this.reviewImages, trustpilotReviewSearchBusinessDataSerpElementItem.reviewImages) &&
        Objects.equals(this.userProfile, trustpilotReviewSearchBusinessDataSerpElementItem.userProfile) &&
        Objects.equals(this.responses, trustpilotReviewSearchBusinessDataSerpElementItem.responses)&&
        Objects.equals(this.additionalProperties, trustpilotReviewSearchBusinessDataSerpElementItem.additionalProperties) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, url, rating, verified, language, timestamp, title, reviewText, reviewImages, userProfile, responses, super.hashCode(), additionalProperties);
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
    sb.append("class TrustpilotReviewSearchBusinessDataSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
   * @throws IOException if the JSON Element is invalid with respect to TrustpilotReviewSearchBusinessDataSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrustpilotReviewSearchBusinessDataSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrustpilotReviewSearchBusinessDataSerpElementItem is not found in the empty JSON string", TrustpilotReviewSearchBusinessDataSerpElementItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field `rating`
      if (jsonObj.get("rating") != null && !jsonObj.get("rating").isJsonNull()) {
        BusinessDataRatingInfo.validateJsonElement(jsonObj.get("rating"));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("review_text") != null && !jsonObj.get("review_text").isJsonNull()) && !jsonObj.get("review_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_text").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("review_images") != null && !jsonObj.get("review_images").isJsonNull() && !jsonObj.get("review_images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_images` to be an array in the JSON string but got `%s`", jsonObj.get("review_images").toString()));
      }
      // validate the optional field `user_profile`
      if (jsonObj.get("user_profile") != null && !jsonObj.get("user_profile").isJsonNull()) {
        BusinessDataUserProfileInfo.validateJsonElement(jsonObj.get("user_profile"));
      }
      if (jsonObj.get("responses") != null && !jsonObj.get("responses").isJsonNull()) {
        JsonArray jsonArrayresponses = jsonObj.getAsJsonArray("responses");
        if (jsonArrayresponses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("responses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `responses` to be an array in the JSON string but got `%s`", jsonObj.get("responses").toString()));
          }

          // validate the optional field `responses` (array)
          for (int i = 0; i < jsonArrayresponses.size(); i++) {
            ReviewResponseItemInfo.validateJsonElement(jsonArrayresponses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrustpilotReviewSearchBusinessDataSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrustpilotReviewSearchBusinessDataSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrustpilotReviewSearchBusinessDataSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrustpilotReviewSearchBusinessDataSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<TrustpilotReviewSearchBusinessDataSerpElementItem>() {
           @Override
           public void write(JsonWriter out, TrustpilotReviewSearchBusinessDataSerpElementItem value) throws IOException {
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
           public TrustpilotReviewSearchBusinessDataSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TrustpilotReviewSearchBusinessDataSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of TrustpilotReviewSearchBusinessDataSerpElementItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TrustpilotReviewSearchBusinessDataSerpElementItem
   * @throws IOException if the JSON string is invalid with respect to TrustpilotReviewSearchBusinessDataSerpElementItem
   */
  public static TrustpilotReviewSearchBusinessDataSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrustpilotReviewSearchBusinessDataSerpElementItem.class);
  }

  /**
   * Convert an instance of TrustpilotReviewSearchBusinessDataSerpElementItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


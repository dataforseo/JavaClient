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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * GoogleBusinessAnswerElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T15:18:23.103906100+03:00[Europe/Kiev]")
public class GoogleBusinessAnswerElement {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ANSWER_ID = "answer_id";
  @SerializedName(SERIALIZED_NAME_ANSWER_ID)
  private String answerId;

  public static final String SERIALIZED_NAME_PROFILE_IMAGE_URL = "profile_image_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_IMAGE_URL)
  private String profileImageUrl;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_PROFILE_NAME = "profile_name";
  @SerializedName(SERIALIZED_NAME_PROFILE_NAME)
  private String profileName;

  public static final String SERIALIZED_NAME_ANSWER_TEXT = "answer_text";
  @SerializedName(SERIALIZED_NAME_ANSWER_TEXT)
  private String answerText;

  public static final String SERIALIZED_NAME_ORIGINAL_ANSWER_TEXT = "original_answer_text";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_ANSWER_TEXT)
  private String originalAnswerText;

  public static final String SERIALIZED_NAME_TIME_AGO = "time_ago";
  @SerializedName(SERIALIZED_NAME_TIME_AGO)
  private String timeAgo;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public GoogleBusinessAnswerElement() {
  }

  public GoogleBusinessAnswerElement type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of element
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public GoogleBusinessAnswerElement answerId(String answerId) {
    this.answerId = answerId;
    return this;
  }

   /**
   * ID of the answer
   * @return answerId
  **/
  @javax.annotation.Nullable
  public String getAnswerId() {
    return answerId;
  }

  public void setAnswerId(String answerId) {
    this.answerId = answerId;
  }


  public GoogleBusinessAnswerElement profileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
    return this;
  }

   /**
   * URL of the user’s profile image
   * @return profileImageUrl
  **/
  @javax.annotation.Nullable
  public String getProfileImageUrl() {
    return profileImageUrl;
  }

  public void setProfileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
  }


  public GoogleBusinessAnswerElement profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * URL of the user’s profile
   * @return profileUrl
  **/
  @javax.annotation.Nullable
  public String getProfileUrl() {
    return profileUrl;
  }

  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public GoogleBusinessAnswerElement profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

   /**
   * displayed name of the user
   * @return profileName
  **/
  @javax.annotation.Nullable
  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }


  public GoogleBusinessAnswerElement answerText(String answerText) {
    this.answerText = answerText;
    return this;
  }

   /**
   * current text of the answer
   * @return answerText
  **/
  @javax.annotation.Nullable
  public String getAnswerText() {
    return answerText;
  }

  public void setAnswerText(String answerText) {
    this.answerText = answerText;
  }


  public GoogleBusinessAnswerElement originalAnswerText(String originalAnswerText) {
    this.originalAnswerText = originalAnswerText;
    return this;
  }

   /**
   * original text of the answer
   * @return originalAnswerText
  **/
  @javax.annotation.Nullable
  public String getOriginalAnswerText() {
    return originalAnswerText;
  }

  public void setOriginalAnswerText(String originalAnswerText) {
    this.originalAnswerText = originalAnswerText;
  }


  public GoogleBusinessAnswerElement timeAgo(String timeAgo) {
    this.timeAgo = timeAgo;
    return this;
  }

   /**
   * estimated time when the answer was posted
   * @return timeAgo
  **/
  @javax.annotation.Nullable
  public String getTimeAgo() {
    return timeAgo;
  }

  public void setTimeAgo(String timeAgo) {
    this.timeAgo = timeAgo;
  }


  public GoogleBusinessAnswerElement timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * exact time when the answer was posted
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleBusinessAnswerElement googleBusinessAnswerElement = (GoogleBusinessAnswerElement) o;
    return Objects.equals(this.type, googleBusinessAnswerElement.type) &&
        Objects.equals(this.answerId, googleBusinessAnswerElement.answerId) &&
        Objects.equals(this.profileImageUrl, googleBusinessAnswerElement.profileImageUrl) &&
        Objects.equals(this.profileUrl, googleBusinessAnswerElement.profileUrl) &&
        Objects.equals(this.profileName, googleBusinessAnswerElement.profileName) &&
        Objects.equals(this.answerText, googleBusinessAnswerElement.answerText) &&
        Objects.equals(this.originalAnswerText, googleBusinessAnswerElement.originalAnswerText) &&
        Objects.equals(this.timeAgo, googleBusinessAnswerElement.timeAgo) &&
        Objects.equals(this.timestamp, googleBusinessAnswerElement.timestamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, answerId, profileImageUrl, profileUrl, profileName, answerText, originalAnswerText, timeAgo, timestamp);
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
    sb.append("class GoogleBusinessAnswerElement {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    profileImageUrl: ").append(toIndentedString(profileImageUrl)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    answerText: ").append(toIndentedString(answerText)).append("\n");
    sb.append("    originalAnswerText: ").append(toIndentedString(originalAnswerText)).append("\n");
    sb.append("    timeAgo: ").append(toIndentedString(timeAgo)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("answer_id");
    openapiFields.add("profile_image_url");
    openapiFields.add("profile_url");
    openapiFields.add("profile_name");
    openapiFields.add("answer_text");
    openapiFields.add("original_answer_text");
    openapiFields.add("time_ago");
    openapiFields.add("timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GoogleBusinessAnswerElement
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleBusinessAnswerElement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleBusinessAnswerElement is not found in the empty JSON string", GoogleBusinessAnswerElement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleBusinessAnswerElement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleBusinessAnswerElement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("answer_id") != null && !jsonObj.get("answer_id").isJsonNull()) && !jsonObj.get("answer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answer_id").toString()));
      }
      if ((jsonObj.get("profile_image_url") != null && !jsonObj.get("profile_image_url").isJsonNull()) && !jsonObj.get("profile_image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_image_url").toString()));
      }
      if ((jsonObj.get("profile_url") != null && !jsonObj.get("profile_url").isJsonNull()) && !jsonObj.get("profile_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_url").toString()));
      }
      if ((jsonObj.get("profile_name") != null && !jsonObj.get("profile_name").isJsonNull()) && !jsonObj.get("profile_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_name").toString()));
      }
      if ((jsonObj.get("answer_text") != null && !jsonObj.get("answer_text").isJsonNull()) && !jsonObj.get("answer_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answer_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answer_text").toString()));
      }
      if ((jsonObj.get("original_answer_text") != null && !jsonObj.get("original_answer_text").isJsonNull()) && !jsonObj.get("original_answer_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_answer_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_answer_text").toString()));
      }
      if ((jsonObj.get("time_ago") != null && !jsonObj.get("time_ago").isJsonNull()) && !jsonObj.get("time_ago").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_ago` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_ago").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleBusinessAnswerElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleBusinessAnswerElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleBusinessAnswerElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleBusinessAnswerElement.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleBusinessAnswerElement>() {
           @Override
           public void write(JsonWriter out, GoogleBusinessAnswerElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleBusinessAnswerElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GoogleBusinessAnswerElement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoogleBusinessAnswerElement
  * @throws IOException if the JSON string is invalid with respect to GoogleBusinessAnswerElement
  */
  public static GoogleBusinessAnswerElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleBusinessAnswerElement.class);
  }

 /**
  * Convert an instance of GoogleBusinessAnswerElement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import io.github.dataforseo.client.model.BaseDataforseoLabsSerpElementItem;
import io.github.dataforseo.client.model.BusinessDataRatingInfo;
import java.io.IOException;
import java.math.BigDecimal;
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

/**
 * GoogleReviewsDataforseoLabsSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class GoogleReviewsDataforseoLabsSerpElementItem extends BaseDataforseoLabsSerpElementItem {
  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public static final String SERIALIZED_NAME_REVIEWS_COUNT = "reviews_count";
  @SerializedName(SERIALIZED_NAME_REVIEWS_COUNT)
  private BigDecimal reviewsCount;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private BusinessDataRatingInfo rating;

  public static final String SERIALIZED_NAME_PLACE_ID = "place_id";
  @SerializedName(SERIALIZED_NAME_PLACE_ID)
  private String placeId;

  public static final String SERIALIZED_NAME_FEATURE = "feature";
  @SerializedName(SERIALIZED_NAME_FEATURE)
  private String feature;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public GoogleReviewsDataforseoLabsSerpElementItem() {
  }

  public GoogleReviewsDataforseoLabsSerpElementItem seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * search engine type
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public GoogleReviewsDataforseoLabsSerpElementItem reviewsCount(BigDecimal reviewsCount) {
    this.reviewsCount = reviewsCount;
    return this;
  }

  /**
   * the number of reviews
   * @return reviewsCount
   */
  @javax.annotation.Nullable
  public BigDecimal getReviewsCount() {
    return reviewsCount;
  }

  public void setReviewsCount(BigDecimal reviewsCount) {
    this.reviewsCount = reviewsCount;
  }


  public GoogleReviewsDataforseoLabsSerpElementItem rating(BusinessDataRatingInfo rating) {
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


  public GoogleReviewsDataforseoLabsSerpElementItem placeId(String placeId) {
    this.placeId = placeId;
    return this;
  }

  /**
   * the identifier of a place
   * @return placeId
   */
  @javax.annotation.Nullable
  public String getPlaceId() {
    return placeId;
  }

  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }


  public GoogleReviewsDataforseoLabsSerpElementItem feature(String feature) {
    this.feature = feature;
    return this;
  }

  /**
   * the additional feature of the review
   * @return feature
   */
  @javax.annotation.Nullable
  public String getFeature() {
    return feature;
  }

  public void setFeature(String feature) {
    this.feature = feature;
  }


  public GoogleReviewsDataforseoLabsSerpElementItem cid(String cid) {
    this.cid = cid;
    return this;
  }

  /**
   * google-defined client id
   * @return cid
   */
  @javax.annotation.Nullable
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
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
   * @return the GoogleReviewsDataforseoLabsSerpElementItem instance itself
   */
  public GoogleReviewsDataforseoLabsSerpElementItem putAdditionalProperty(String key, Object value) {
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
    GoogleReviewsDataforseoLabsSerpElementItem googleReviewsDataforseoLabsSerpElementItem = (GoogleReviewsDataforseoLabsSerpElementItem) o;
    return Objects.equals(this.seType, googleReviewsDataforseoLabsSerpElementItem.seType) &&
        Objects.equals(this.reviewsCount, googleReviewsDataforseoLabsSerpElementItem.reviewsCount) &&
        Objects.equals(this.rating, googleReviewsDataforseoLabsSerpElementItem.rating) &&
        Objects.equals(this.placeId, googleReviewsDataforseoLabsSerpElementItem.placeId) &&
        Objects.equals(this.feature, googleReviewsDataforseoLabsSerpElementItem.feature) &&
        Objects.equals(this.cid, googleReviewsDataforseoLabsSerpElementItem.cid)&&
        Objects.equals(this.additionalProperties, googleReviewsDataforseoLabsSerpElementItem.additionalProperties) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(seType, reviewsCount, rating, placeId, feature, cid, super.hashCode(), additionalProperties);
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
    sb.append("class GoogleReviewsDataforseoLabsSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    reviewsCount: ").append(toIndentedString(reviewsCount)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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
    openapiFields.add("xpath");
    openapiFields.add("se_type");
    openapiFields.add("reviews_count");
    openapiFields.add("rating");
    openapiFields.add("place_id");
    openapiFields.add("feature");
    openapiFields.add("cid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleReviewsDataforseoLabsSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleReviewsDataforseoLabsSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleReviewsDataforseoLabsSerpElementItem is not found in the empty JSON string", GoogleReviewsDataforseoLabsSerpElementItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("se_type") != null && !jsonObj.get("se_type").isJsonNull()) && !jsonObj.get("se_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `se_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("se_type").toString()));
      }
      // validate the optional field `rating`
      if (jsonObj.get("rating") != null && !jsonObj.get("rating").isJsonNull()) {
        BusinessDataRatingInfo.validateJsonElement(jsonObj.get("rating"));
      }
      if ((jsonObj.get("place_id") != null && !jsonObj.get("place_id").isJsonNull()) && !jsonObj.get("place_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_id").toString()));
      }
      if ((jsonObj.get("feature") != null && !jsonObj.get("feature").isJsonNull()) && !jsonObj.get("feature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feature").toString()));
      }
      if ((jsonObj.get("cid") != null && !jsonObj.get("cid").isJsonNull()) && !jsonObj.get("cid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleReviewsDataforseoLabsSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleReviewsDataforseoLabsSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleReviewsDataforseoLabsSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleReviewsDataforseoLabsSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleReviewsDataforseoLabsSerpElementItem>() {
           @Override
           public void write(JsonWriter out, GoogleReviewsDataforseoLabsSerpElementItem value) throws IOException {
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
           public GoogleReviewsDataforseoLabsSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleReviewsDataforseoLabsSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of GoogleReviewsDataforseoLabsSerpElementItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleReviewsDataforseoLabsSerpElementItem
   * @throws IOException if the JSON string is invalid with respect to GoogleReviewsDataforseoLabsSerpElementItem
   */
  public static GoogleReviewsDataforseoLabsSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleReviewsDataforseoLabsSerpElementItem.class);
  }

  /**
   * Convert an instance of GoogleReviewsDataforseoLabsSerpElementItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


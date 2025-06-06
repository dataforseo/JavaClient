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
 * BaseAppDataSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class BaseAppDataSerpElementItem {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private BigDecimal rankGroup;

  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private BigDecimal rankAbsolute;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private BusinessDataRatingInfo rating;

  public BaseAppDataSerpElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public BaseAppDataSerpElementItem type(String type) {
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


  public BaseAppDataSerpElementItem rankGroup(BigDecimal rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group
   * @return rankGroup
   */
  @javax.annotation.Nullable
  public BigDecimal getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(BigDecimal rankGroup) {
    this.rankGroup = rankGroup;
  }


  public BaseAppDataSerpElementItem rankAbsolute(BigDecimal rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP absolute position among all the elements in SERP
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public BigDecimal getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(BigDecimal rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public BaseAppDataSerpElementItem position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the element in SERP can take the following values: left, right
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public BaseAppDataSerpElementItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the app
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public BaseAppDataSerpElementItem rating(BusinessDataRatingInfo rating) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseAppDataSerpElementItem baseAppDataSerpElementItem = (BaseAppDataSerpElementItem) o;
    return Objects.equals(this.type, baseAppDataSerpElementItem.type) &&
        Objects.equals(this.rankGroup, baseAppDataSerpElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, baseAppDataSerpElementItem.rankAbsolute) &&
        Objects.equals(this.position, baseAppDataSerpElementItem.position) &&
        Objects.equals(this.title, baseAppDataSerpElementItem.title) &&
        Objects.equals(this.rating, baseAppDataSerpElementItem.rating);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, rankGroup, rankAbsolute, position, title, rating);
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
    sb.append("class BaseAppDataSerpElementItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("rating");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BaseAppDataSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BaseAppDataSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BaseAppDataSerpElementItem is not found in the empty JSON string", BaseAppDataSerpElementItem.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("type").getAsString();
      switch (discriminatorValue) {
        case "app_store_info_organic":
          AppDataAppStoreInfoOrganicSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "app_store_reviews_search":
          AppDataAppStoreReviewsSearchSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "app_store_search_organic":
          AppDataAppStoreSearchOrganicSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "google_play_info_organic":
          AppDataGooglePlayInfoOrganicSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "google_play_reviews_search":
          AppDataGooglePlayReviewsSearchSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "google_play_search_organic":
          AppDataGooglePlaySearchOrganicSerpElementItem.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


  /**
   * Create an instance of BaseAppDataSerpElementItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BaseAppDataSerpElementItem
   * @throws IOException if the JSON string is invalid with respect to BaseAppDataSerpElementItem
   */
  public static BaseAppDataSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseAppDataSerpElementItem.class);
  }

  /**
   * Convert an instance of BaseAppDataSerpElementItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


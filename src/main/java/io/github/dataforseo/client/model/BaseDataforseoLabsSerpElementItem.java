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
 * BaseDataforseoLabsSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class BaseDataforseoLabsSerpElementItem {
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

  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public BaseDataforseoLabsSerpElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public BaseDataforseoLabsSerpElementItem type(String type) {
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


  public BaseDataforseoLabsSerpElementItem rankGroup(BigDecimal rankGroup) {
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


  public BaseDataforseoLabsSerpElementItem rankAbsolute(BigDecimal rankAbsolute) {
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


  public BaseDataforseoLabsSerpElementItem position(String position) {
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


  public BaseDataforseoLabsSerpElementItem xpath(String xpath) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseDataforseoLabsSerpElementItem baseDataforseoLabsSerpElementItem = (BaseDataforseoLabsSerpElementItem) o;
    return Objects.equals(this.type, baseDataforseoLabsSerpElementItem.type) &&
        Objects.equals(this.rankGroup, baseDataforseoLabsSerpElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, baseDataforseoLabsSerpElementItem.rankAbsolute) &&
        Objects.equals(this.position, baseDataforseoLabsSerpElementItem.position) &&
        Objects.equals(this.xpath, baseDataforseoLabsSerpElementItem.xpath);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, rankGroup, rankAbsolute, position, xpath);
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
    sb.append("class BaseDataforseoLabsSerpElementItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BaseDataforseoLabsSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BaseDataforseoLabsSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BaseDataforseoLabsSerpElementItem is not found in the empty JSON string", BaseDataforseoLabsSerpElementItem.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("type").getAsString();
      switch (discriminatorValue) {
        case "answer_box":
          AnswerBoxDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "carousel":
          CarouselDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "commercial_units":
          CommercialUnitsDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "events":
          EventsDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "featured_snippet":
          FeaturedSnippetDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "find_results_on":
          FindResultsOnDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "google_flights":
          GoogleFlightsDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "google_hotels":
          GoogleHotelsDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "google_posts":
          GooglePostsDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "google_reviews":
          GoogleReviewsDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "hotels_pack":
          HotelsPackDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "images":
          ImagesDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "jobs":
          JobsDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "knowledge_graph":
          KnowledgeGraphDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "knowledge_graph_description_item":
          KnowledgeGraphDescriptionItemDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "knowledge_graph_images_item":
          KnowledgeGraphImagesItemDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "knowledge_graph_row_item":
          KnowledgeGraphRowItemDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "local_pack":
          LocalPackDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "local_services":
          LocalServicesDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "map":
          MapDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "math_solver":
          MathSolverDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "mention_carousel":
          MentionCarouselDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "multi_carousel":
          MultiCarouselDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "organic":
          OrganicDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "paid":
          PaidDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "people_also_ask":
          PeopleAlsoAskDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "people_also_search":
          PeopleAlsoSearchDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "podcasts":
          PodcastsDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "popular_products":
          PopularProductsDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "questions_and_answers":
          QuestionsAndAnswersDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "recipes":
          RecipesDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "related_searches":
          RelatedSearchesDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "scholarly_articles":
          ScholarlyArticlesDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "shopping":
          ShoppingDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "stocks_box":
          StocksBoxDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "top_sights":
          TopSightsDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "top_stories":
          TopStoriesDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "twitter":
          TwitterDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        case "video":
          VideoDataforseoLabsSerpElementItem.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


  /**
   * Create an instance of BaseDataforseoLabsSerpElementItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BaseDataforseoLabsSerpElementItem
   * @throws IOException if the JSON string is invalid with respect to BaseDataforseoLabsSerpElementItem
   */
  public static BaseDataforseoLabsSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseDataforseoLabsSerpElementItem.class);
  }

  /**
   * Convert an instance of BaseDataforseoLabsSerpElementItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


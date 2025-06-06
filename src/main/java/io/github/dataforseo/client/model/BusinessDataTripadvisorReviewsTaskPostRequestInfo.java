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
 * BusinessDataTripadvisorReviewsTaskPostRequestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class BusinessDataTripadvisorReviewsTaskPostRequestInfo {
  public static final String SERIALIZED_NAME_URL_PATH = "url_path";
  @SerializedName(SERIALIZED_NAME_URL_PATH)
  private String urlPath;

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public static final String SERIALIZED_NAME_RATINGS = "ratings";
  @SerializedName(SERIALIZED_NAME_RATINGS)
  private List<String> ratings;

  public static final String SERIALIZED_NAME_VISIT_TYPE = "visit_type";
  @SerializedName(SERIALIZED_NAME_VISIT_TYPE)
  private List<String> visitType;

  public static final String SERIALIZED_NAME_MONTHS = "months";
  @SerializedName(SERIALIZED_NAME_MONTHS)
  private List<String> months;

  public static final String SERIALIZED_NAME_SEARCH_REVIEWS_KEYWORD = "search_reviews_keyword";
  @SerializedName(SERIALIZED_NAME_SEARCH_REVIEWS_KEYWORD)
  private String searchReviewsKeyword;

  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public static final String SERIALIZED_NAME_TRANSLATE_REVIEWS = "translate_reviews";
  @SerializedName(SERIALIZED_NAME_TRANSLATE_REVIEWS)
  private Boolean translateReviews;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo() {
  }

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo urlPath(String urlPath) {
    this.urlPath = urlPath;
    return this;
  }

  /**
   * URL path of the business entity required field if you do not specify keyword URL path to the Tripadvisor page of the business entity; examples: Hotel_Review-g60763-d23462501-Reviews-Margaritaville_Times_Square-New_York_City_New_York.html https://www.tripadvisor.com/Hotel_Review-g60763-d23462501-Reviews-Margaritaville_Times_Square-New_York_City_New_York.html
   * @return urlPath
   */
  @javax.annotation.Nullable
  public String getUrlPath() {
    return urlPath;
  }

  public void setUrlPath(String urlPath) {
    this.urlPath = urlPath;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword required field if you do not specify url_path the keyword you specify should indicate a name of an existing business or prominent place on Tripadvisor; you can specify up to 700 characters in the keyword filed; all %## will be decoded (plus character ‘+’ will be decoded to a space character); if you need to use the “%” character for your keyword, please specify it as “%25”
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of search engine location required field if you don’t specify location_code or url_path you can receive the list of available locations with location_name by making a separate request to the https://api.dataforseo.com/v3/business_data/tripadvisor/locations example: London,England,United Kingdom
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * search engine location code required field if you don’t specify location_name or url_path you can receive the list of available locations with location_code by making a separate request to the https://api.dataforseo.com/v3/business_data/tripadvisor/locations example: 1003854
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * task priority optional field can take the following values: 1 – normal execution priority (set by default) 2 – high execution priority You will be additionally charged for the tasks with high execution priority. The cost can be calculated on the Pricing page.
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of search engine language optional field if you use this field, your account will be charged for one extra request you can receive the list of available languages with language_name by making a separate request to the https://api.dataforseo.com/v3/business_data/tripadvisor/languages example: English You will be additionally charged for setting a language parameter in this endpoint. The cost can be calculated on the Pricing page.
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * search engine language code optional field if you use this field, your account will be charged for one extra request you can receive the list of available languages with language_code by making a separate request to the https://api.dataforseo.com/v3/business_data/tripadvisor/languages example: en You will be additionally charged for setting a language parameter in this endpoint. The cost can be calculated on the Pricing page.
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * parsing depth optional field number of reviews in SERP; we strongly recommend setting the parsing depth in the multiples of ten, because our systems processes ten reviews in a row; default value: 10; max value: 4490
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo ratings(List<String> ratings) {
    this.ratings = ratings;
    return this;
  }

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo addRatingsItem(String ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new ArrayList<>();
    }
    this.ratings.add(ratingsItem);
    return this;
  }

  /**
   * Tripadvisor traveler rating for a place of interest optional field rating based on the written reviews by a traveler after they visited a place. possible values: excellent, very_good, average, poor, terrible you can specify several values at once
   * @return ratings
   */
  @javax.annotation.Nullable
  public List<String> getRatings() {
    return ratings;
  }

  public void setRatings(List<String> ratings) {
    this.ratings = ratings;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo visitType(List<String> visitType) {
    this.visitType = visitType;
    return this;
  }

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo addVisitTypeItem(String visitTypeItem) {
    if (this.visitType == null) {
      this.visitType = new ArrayList<>();
    }
    this.visitType.add(visitTypeItem);
    return this;
  }

  /**
   * filter by type of travelers who left a review optional field possible values: families, couples, solo, business, friends you can specify several values at once
   * @return visitType
   */
  @javax.annotation.Nullable
  public List<String> getVisitType() {
    return visitType;
  }

  public void setVisitType(List<String> visitType) {
    this.visitType = visitType;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo months(List<String> months) {
    this.months = months;
    return this;
  }

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo addMonthsItem(String monthsItem) {
    if (this.months == null) {
      this.months = new ArrayList<>();
    }
    this.months.add(monthsItem);
    return this;
  }

  /**
   * filter by months when a traveler made a visit optional field possible values: january, february, march, april, may, april, june, july, august, september, october, november, december you can specify several values at once
   * @return months
   */
  @javax.annotation.Nullable
  public List<String> getMonths() {
    return months;
  }

  public void setMonths(List<String> months) {
    this.months = months;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo searchReviewsKeyword(String searchReviewsKeyword) {
    this.searchReviewsKeyword = searchReviewsKeyword;
    return this;
  }

  /**
   * search reviews containing a specified keyword example: dessert
   * @return searchReviewsKeyword
   */
  @javax.annotation.Nullable
  public String getSearchReviewsKeyword() {
    return searchReviewsKeyword;
  }

  public void setSearchReviewsKeyword(String searchReviewsKeyword) {
    this.searchReviewsKeyword = searchReviewsKeyword;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * results sorting parameters optional field you can use this field to sort the results; possible types of sorting: most_recent detailed_reviews
   * @return sortBy
   */
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo translateReviews(Boolean translateReviews) {
    this.translateReviews = translateReviews;
    return this;
  }

  /**
   * translate reviews according to the URL path optional field if set to true, returned reviews will be translated to the language matching the specified url_path; for example, if url_path contains tripadvisor.it and translate_reviews is true, reviews will be translated to the Italian language; default value: true you can learn more about how reviews are translated in this Help Center article
   * @return translateReviews
   */
  @javax.annotation.Nullable
  public Boolean getTranslateReviews() {
    return translateReviews;
  }

  public void setTranslateReviews(Boolean translateReviews) {
    this.translateReviews = translateReviews;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * return URL for sending task results optional field once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/postbackscript?id&#x3D;$id http://your-server.com/postbackscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in postback_url will be urlencoded; i.a., the # character will be encoded into %23 learn more on our Help Center
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
  }


  public BusinessDataTripadvisorReviewsTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * notification URL of a completed task optional field when a task is completed we will notify you by GET request sent to the URL you have specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/pingscript?id&#x3D;$id http://your-server.com/pingscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in pingback_url will be urlencoded; i.a., the # character will be encoded into %23 learn more on our Help Center
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
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
   * @return the BusinessDataTripadvisorReviewsTaskPostRequestInfo instance itself
   */
  public BusinessDataTripadvisorReviewsTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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
    BusinessDataTripadvisorReviewsTaskPostRequestInfo businessDataTripadvisorReviewsTaskPostRequestInfo = (BusinessDataTripadvisorReviewsTaskPostRequestInfo) o;
    return Objects.equals(this.urlPath, businessDataTripadvisorReviewsTaskPostRequestInfo.urlPath) &&
        Objects.equals(this.keyword, businessDataTripadvisorReviewsTaskPostRequestInfo.keyword) &&
        Objects.equals(this.locationName, businessDataTripadvisorReviewsTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, businessDataTripadvisorReviewsTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.priority, businessDataTripadvisorReviewsTaskPostRequestInfo.priority) &&
        Objects.equals(this.languageName, businessDataTripadvisorReviewsTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, businessDataTripadvisorReviewsTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.depth, businessDataTripadvisorReviewsTaskPostRequestInfo.depth) &&
        Objects.equals(this.ratings, businessDataTripadvisorReviewsTaskPostRequestInfo.ratings) &&
        Objects.equals(this.visitType, businessDataTripadvisorReviewsTaskPostRequestInfo.visitType) &&
        Objects.equals(this.months, businessDataTripadvisorReviewsTaskPostRequestInfo.months) &&
        Objects.equals(this.searchReviewsKeyword, businessDataTripadvisorReviewsTaskPostRequestInfo.searchReviewsKeyword) &&
        Objects.equals(this.sortBy, businessDataTripadvisorReviewsTaskPostRequestInfo.sortBy) &&
        Objects.equals(this.translateReviews, businessDataTripadvisorReviewsTaskPostRequestInfo.translateReviews) &&
        Objects.equals(this.tag, businessDataTripadvisorReviewsTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, businessDataTripadvisorReviewsTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.pingbackUrl, businessDataTripadvisorReviewsTaskPostRequestInfo.pingbackUrl)&&
        Objects.equals(this.additionalProperties, businessDataTripadvisorReviewsTaskPostRequestInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlPath, keyword, locationName, locationCode, priority, languageName, languageCode, depth, ratings, visitType, months, searchReviewsKeyword, sortBy, translateReviews, tag, postbackUrl, pingbackUrl, additionalProperties);
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
    sb.append("class BusinessDataTripadvisorReviewsTaskPostRequestInfo {\n");
    sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    visitType: ").append(toIndentedString(visitType)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    searchReviewsKeyword: ").append(toIndentedString(searchReviewsKeyword)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    translateReviews: ").append(toIndentedString(translateReviews)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
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
    openapiFields.add("url_path");
    openapiFields.add("keyword");
    openapiFields.add("location_name");
    openapiFields.add("location_code");
    openapiFields.add("priority");
    openapiFields.add("language_name");
    openapiFields.add("language_code");
    openapiFields.add("depth");
    openapiFields.add("ratings");
    openapiFields.add("visit_type");
    openapiFields.add("months");
    openapiFields.add("search_reviews_keyword");
    openapiFields.add("sort_by");
    openapiFields.add("translate_reviews");
    openapiFields.add("tag");
    openapiFields.add("postback_url");
    openapiFields.add("pingback_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessDataTripadvisorReviewsTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BusinessDataTripadvisorReviewsTaskPostRequestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessDataTripadvisorReviewsTaskPostRequestInfo is not found in the empty JSON string", BusinessDataTripadvisorReviewsTaskPostRequestInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("url_path") != null && !jsonObj.get("url_path").isJsonNull()) && !jsonObj.get("url_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_path").toString()));
      }
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
      if ((jsonObj.get("location_name") != null && !jsonObj.get("location_name").isJsonNull()) && !jsonObj.get("location_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location_name").toString()));
      }
      if ((jsonObj.get("language_name") != null && !jsonObj.get("language_name").isJsonNull()) && !jsonObj.get("language_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_name").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ratings") != null && !jsonObj.get("ratings").isJsonNull() && !jsonObj.get("ratings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratings` to be an array in the JSON string but got `%s`", jsonObj.get("ratings").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("visit_type") != null && !jsonObj.get("visit_type").isJsonNull() && !jsonObj.get("visit_type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `visit_type` to be an array in the JSON string but got `%s`", jsonObj.get("visit_type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("months") != null && !jsonObj.get("months").isJsonNull() && !jsonObj.get("months").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `months` to be an array in the JSON string but got `%s`", jsonObj.get("months").toString()));
      }
      if ((jsonObj.get("search_reviews_keyword") != null && !jsonObj.get("search_reviews_keyword").isJsonNull()) && !jsonObj.get("search_reviews_keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_reviews_keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_reviews_keyword").toString()));
      }
      if ((jsonObj.get("sort_by") != null && !jsonObj.get("sort_by").isJsonNull()) && !jsonObj.get("sort_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort_by").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("postback_url") != null && !jsonObj.get("postback_url").isJsonNull()) && !jsonObj.get("postback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postback_url").toString()));
      }
      if ((jsonObj.get("pingback_url") != null && !jsonObj.get("pingback_url").isJsonNull()) && !jsonObj.get("pingback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pingback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pingback_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataTripadvisorReviewsTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataTripadvisorReviewsTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataTripadvisorReviewsTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataTripadvisorReviewsTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataTripadvisorReviewsTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, BusinessDataTripadvisorReviewsTaskPostRequestInfo value) throws IOException {
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
           public BusinessDataTripadvisorReviewsTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessDataTripadvisorReviewsTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of BusinessDataTripadvisorReviewsTaskPostRequestInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BusinessDataTripadvisorReviewsTaskPostRequestInfo
   * @throws IOException if the JSON string is invalid with respect to BusinessDataTripadvisorReviewsTaskPostRequestInfo
   */
  public static BusinessDataTripadvisorReviewsTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataTripadvisorReviewsTaskPostRequestInfo.class);
  }

  /**
   * Convert an instance of BusinessDataTripadvisorReviewsTaskPostRequestInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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



public class BusinessDataTripadvisorReviewsTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_URL_PATH = "url_path";
  @SerializedName(SERIALIZED_NAME_URL_PATH)
  private String urlPath;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo urlPath(String urlPath) {
    this.urlPath = urlPath;
    return this;
  }

  /**
   * URL path of the business entity
* required field if you do not specify keyword
* URL path to the Tripadvisor page of the business entity;
* examples:
* Hotel_Review-g60763-d23462501-Reviews-Margaritaville_Times_Square-New_York_City_New_York.html
* https://www.tripadvisor.com/Hotel_Review-g60763-d23462501-Reviews-Margaritaville_Times_Square-New_York_City_New_York.html
   * @return urlPath
   */
  @javax.annotation.Nullable
  public String getUrlPath() {
    return urlPath;
  }

  public void setUrlPath(String urlPath) {
    this.urlPath = urlPath;
  }


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword
* required field if you do not specify url_path
* the keyword you specify should indicate a name of an existing business or prominent place on Tripadvisor;
* you can specify up to 700 characters in the keyword filed;
* all %## will be decoded (plus character ‘+’ will be decoded to a space character);
* if you need to use the “%” character for your keyword, please specify it as “%25”
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of search engine location
* required field if you don’t specify location_code or url_path
* you can receive the list of available locations with location_name by making a separate request to the https://api.dataforseo.com/v3/business_data/tripadvisor/locations
* example:
* London,England,United Kingdom
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * search engine location code
* required field if you don’t specify location_name or url_path
* you can receive the list of available locations with location_code by making a separate request to the https://api.dataforseo.com/v3/business_data/tripadvisor/locations
* example:
* 1003854
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * task priority
* optional field
* can take the following values:
* 1 – normal execution priority (set by default)
* 2 – high execution priority
* You will be additionally charged for the tasks with high execution priority.
* The cost can be calculated on the Pricing page.
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of search engine language
* optional field
* if you use this field, your account will be charged for one extra request
* you can receive the list of available languages with language_name by making a separate request to the https://api.dataforseo.com/v3/business_data/tripadvisor/languages
* example:
* English
* You will be additionally charged for setting a language parameter in this endpoint.
* The cost can be calculated on the Pricing page.
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * search engine language code
* optional field
* if you use this field, your account will be charged for one extra request
* you can receive the list of available languages with language_code by making a separate request to the https://api.dataforseo.com/v3/business_data/tripadvisor/languages
* example:
* en
* You will be additionally charged for setting a language parameter in this endpoint.
* The cost can be calculated on the Pricing page.
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * parsing depth
* optional field
* number of reviews in SERP;
* we strongly recommend setting the parsing depth in the multiples of ten, because our systems processes ten reviews in a row;
* default value: 10;
* max value: 4490
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_RATINGS = "ratings";
  @SerializedName(SERIALIZED_NAME_RATINGS)
  private List<String> ratings;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo ratings(List<String> ratings) {
    this.ratings = ratings;
    return this;
  }

  /**
   * Tripadvisor traveler rating for a place of interest
* optional field
* rating based on the written reviews by a traveler after they visited a place.
* possible values: excellent, very_good, average, poor, terrible
* you can specify several values at once
   * @return ratings
   */
  @javax.annotation.Nullable
  public List<String> getRatings() {
    return ratings;
  }

  public void setRatings(List<String> ratings) {
    this.ratings = ratings;
  }


  public static final String SERIALIZED_NAME_VISIT_TYPE = "visit_type";
  @SerializedName(SERIALIZED_NAME_VISIT_TYPE)
  private List<String> visitType;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo visitType(List<String> visitType) {
    this.visitType = visitType;
    return this;
  }

  /**
   * filter by type of travelers who left a review
* optional field
* possible values: families, couples, solo, business, friends
* you can specify several values at once
   * @return visitType
   */
  @javax.annotation.Nullable
  public List<String> getVisitType() {
    return visitType;
  }

  public void setVisitType(List<String> visitType) {
    this.visitType = visitType;
  }


  public static final String SERIALIZED_NAME_MONTHS = "months";
  @SerializedName(SERIALIZED_NAME_MONTHS)
  private List<String> months;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo months(List<String> months) {
    this.months = months;
    return this;
  }

  /**
   * filter by months when a traveler made a visit
* optional field
* possible values: january, february, march, april, may, april, june, july, august, september, october, november, december
* you can specify several values at once
   * @return months
   */
  @javax.annotation.Nullable
  public List<String> getMonths() {
    return months;
  }

  public void setMonths(List<String> months) {
    this.months = months;
  }


  public static final String SERIALIZED_NAME_SEARCH_REVIEWS_KEYWORD = "search_reviews_keyword";
  @SerializedName(SERIALIZED_NAME_SEARCH_REVIEWS_KEYWORD)
  private String searchReviewsKeyword;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo searchReviewsKeyword(String searchReviewsKeyword) {
    this.searchReviewsKeyword = searchReviewsKeyword;
    return this;
  }

  /**
   * search reviews containing a specified keyword
* example:
* dessert
   * @return searchReviewsKeyword
   */
  @javax.annotation.Nullable
  public String getSearchReviewsKeyword() {
    return searchReviewsKeyword;
  }

  public void setSearchReviewsKeyword(String searchReviewsKeyword) {
    this.searchReviewsKeyword = searchReviewsKeyword;
  }


  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * results sorting parameters
* optional field
* you can use this field to sort the results;
* possible types of sorting:
* most_recent
* detailed_reviews
   * @return sortBy
   */
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public static final String SERIALIZED_NAME_TRANSLATE_REVIEWS = "translate_reviews";
  @SerializedName(SERIALIZED_NAME_TRANSLATE_REVIEWS)
  private Boolean translateReviews;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo translateReviews(Boolean translateReviews) {
    this.translateReviews = translateReviews;
    return this;
  }

  /**
   * translate reviews according to the URL path
* optional field
* if set to true, returned reviews will be translated to the language matching the specified url_path;
* for example, if url_path contains tripadvisor.it and translate_reviews is true, reviews will be translated to the Italian language;
* default value: true
* you can learn more about how reviews are translated in this Help Center article
   * @return translateReviews
   */
  @javax.annotation.Nullable
  public Boolean getTranslateReviews() {
    return translateReviews;
  }

  public void setTranslateReviews(Boolean translateReviews) {
    this.translateReviews = translateReviews;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier
* optional field
* the character limit is 255
* you can use this parameter to identify the task and match it with the result
* you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * return URL for sending task results
* optional field
* once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified
* you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request.
* example:
* http://your-server.com/postbackscript?id=$id
* http://your-server.com/postbackscript?id=$id&tag=$tag
* Note: special characters in postback_url will be urlencoded;
* i.a., the # character will be encoded into %23
* learn more on our Help Center
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * notification URL of a completed task
* optional field
* when a task is completed we will notify you by GET request sent to the URL you have specified
* you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request.
* example:
* http://your-server.com/pingscript?id=$id
* http://your-server.com/pingscript?id=$id&tag=$tag
* Note: special characters in pingback_url will be urlencoded;
* i.a., the # character will be encoded into %23
* learn more on our Help Center
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }



  public BusinessDataTripadvisorReviewsTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BusinessDataTripadvisorReviewsTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    BusinessDataTripadvisorReviewsTaskPostRequestInfo businessDataTripadvisorReviewsTaskPostRequestInfo = (BusinessDataTripadvisorReviewsTaskPostRequestInfo) o;
    return

        Objects.equals(this.urlPath, businessDataTripadvisorReviewsTaskPostRequestInfo.urlPath) &&
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
        Objects.equals(this.pingbackUrl, businessDataTripadvisorReviewsTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(urlPath, keyword, locationName, locationCode, priority, languageName, languageCode, depth, ratings, visitType, months, searchReviewsKeyword, sortBy, translateReviews, tag, postbackUrl, pingbackUrl);
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


  public static BusinessDataTripadvisorReviewsTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataTripadvisorReviewsTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
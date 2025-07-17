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



public class MerchantAmazonReviewsTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_ASIN = "asin";
  @SerializedName(SERIALIZED_NAME_ASIN)
  private String asin;

  public MerchantAmazonReviewsTaskPostRequestInfo asin(String asin) {
    this.asin = asin;
    return this;
  }

  /**
   * product ID
* required field
* unique product identifier (ASIN) on Amazon
* you can receive the asin parameter by making a separate request to the Amazon Products endpoint
   * @return asin
   */
  @javax.annotation.Nullable
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }


  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public MerchantAmazonReviewsTaskPostRequestInfo priority(Integer priority) {
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


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public MerchantAmazonReviewsTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of search engine location
* required field if you don’t specify location_code or location_coordinate
* if you use this field, you don’t need to specify location_code or location_coordinate
* you can receive the list of available locations with their location_name parameters by making a separate request to https://api.dataforseo.com/v3/merchant/amazon/locations
* example:
* HA1,England,United Kingdom
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

  public MerchantAmazonReviewsTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * search engine location code
* required field if you don’t specify location_name or location_coordinate
* if you use this field, you don’t need to specify location_name or location_coordinate
* you can receive the list of available locations with their location_code parameters by making a separate request to
* https://api.dataforseo.com/v3/merchant/amazon/locations
* example:
* 9045969
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LOCATION_COORDINATE = "location_coordinate";
  @SerializedName(SERIALIZED_NAME_LOCATION_COORDINATE)
  private String locationCoordinate;

  public MerchantAmazonReviewsTaskPostRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * GPS coordinates of a location
* required field if you don’t specify location_name or location_code
* if you use this field, you don’t need to specify location_name or location_code
* location_coordinate parameter should be specified in the “latitude,longitude,radius” format
* the maximum number of decimal digits for “latitude” and “longitude”: 7
* the minimum value for “radius”: 199.9
* example:
* 53.476225,-2.243572,200
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public MerchantAmazonReviewsTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of search engine language
* required field if you don’t specify language_code
* if you use this field, you don’t need to specify language_code
* you can receive the list of available languages with their language_name parameters by making a separate request to
* https://api.dataforseo.com/v3/merchant/amazon/languages
* example:
* English (United Kingdom)
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

  public MerchantAmazonReviewsTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * search engine language code
* required field if you don’t specify language_name
* if you use this field, you don’t need to specify language_name
* you can receive the list of available languages with their language_code parameters by making a separate request to https://api.dataforseo.com/v3/merchant/amazon/languages
* example:
* en_GB
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_SE_DOMAIN = "se_domain";
  @SerializedName(SERIALIZED_NAME_SE_DOMAIN)
  private String seDomain;

  public MerchantAmazonReviewsTaskPostRequestInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * search engine domain
* optional field
* we choose the relevant search engine domain automatically according to the location and language you specify
* however, you can set a custom search engine domain in this field
* example:
* amazon.com, amazon.co.uk, amazon.fr, etc.
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public MerchantAmazonReviewsTaskPostRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * parsing depth
* optional field
* number of reviews in SERP;
* we strongly recommend setting the parsing depth in the multiples of ten, because our system processes ten reviews in a row;
* maximum value: 50
* default value: 10
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public MerchantAmazonReviewsTaskPostRequestInfo sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * results sorting parameters
* optional field
* possible types of sorting:
* helpful — for now, the only available sorting value;
* default rule: helpful
   * @return sortBy
   */
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public static final String SERIALIZED_NAME_REVIEWER_TYPE = "reviewer_type";
  @SerializedName(SERIALIZED_NAME_REVIEWER_TYPE)
  private String reviewerType;

  public MerchantAmazonReviewsTaskPostRequestInfo reviewerType(String reviewerType) {
    this.reviewerType = reviewerType;
    return this;
  }

  /**
   * filter reviews by reviewer type
* optional field
* you can use this field to filter the results;
* possible types of filtering:
* all_reviews — return reviews from all reviewers;
* avp_only_reviews — return reviews with the “Verified Purchase” mark only;
* default rule: all_reviews
   * @return reviewerType
   */
  @javax.annotation.Nullable
  public String getReviewerType() {
    return reviewerType;
  }

  public void setReviewerType(String reviewerType) {
    this.reviewerType = reviewerType;
  }


  public static final String SERIALIZED_NAME_FILTER_BY_STAR = "filter_by_star";
  @SerializedName(SERIALIZED_NAME_FILTER_BY_STAR)
  private String filterByStar;

  public MerchantAmazonReviewsTaskPostRequestInfo filterByStar(String filterByStar) {
    this.filterByStar = filterByStar;
    return this;
  }

  /**
   * filter reviews by stars
* optional field
* you can use this field to filter the results;
* possible types of filtering:
* all_stars — return reviews with any number of stars;
* five_star — return five-star reviews only;
* four_star — return four-star reviews only;
* three_star — return three-star reviews only;
* two_star — return two-star reviews only;
* one_star — return one-star reviews only;
* positive — return positive reviews only;
* critical — return critical reviews only;
* default rule: all_stars
   * @return filterByStar
   */
  @javax.annotation.Nullable
  public String getFilterByStar() {
    return filterByStar;
  }

  public void setFilterByStar(String filterByStar) {
    this.filterByStar = filterByStar;
  }


  public static final String SERIALIZED_NAME_FILTER_BY_KEYWORD = "filter_by_keyword";
  @SerializedName(SERIALIZED_NAME_FILTER_BY_KEYWORD)
  private String filterByKeyword;

  public MerchantAmazonReviewsTaskPostRequestInfo filterByKeyword(String filterByKeyword) {
    this.filterByKeyword = filterByKeyword;
    return this;
  }

  /**
   * filter reviews by specified keyword
* optional field
* you can specify up to 300 characters in this field;
* if you use this field, the response will only include reviews that contain the specified keyword
   * @return filterByKeyword
   */
  @javax.annotation.Nullable
  public String getFilterByKeyword() {
    return filterByKeyword;
  }

  public void setFilterByKeyword(String filterByKeyword) {
    this.filterByKeyword = filterByKeyword;
  }


  public static final String SERIALIZED_NAME_MEDIA_TYPE = "media_type";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public MerchantAmazonReviewsTaskPostRequestInfo mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * filter reviews by media type
* optional field
* you can use this field to filter the results;
* possible types of filtering:
* all_contents — return text, image, and video reviews;
* media_reviews_only — return image and video reviews only;
* default rule: all_contents
   * @return mediaType
   */
  @javax.annotation.Nullable
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public static final String SERIALIZED_NAME_FORMAT_TYPE = "format_type";
  @SerializedName(SERIALIZED_NAME_FORMAT_TYPE)
  private String formatType;

  public MerchantAmazonReviewsTaskPostRequestInfo formatType(String formatType) {
    this.formatType = formatType;
    return this;
  }

  /**
   * filter reviews by product modification
* optional field
* you can use this field to filter the results;
* possible types of filtering:
* all_format — return reviews for all product modifications;
* current_format — return reviews for the current product modification only;
* default rule: all_format;
* Note: ASINs vary depending on a product modification. Thus, two modifications of the same product will have two different ASINs. Make sure to specify the right ASIN when setting a task with the current_format parameter
   * @return formatType
   */
  @javax.annotation.Nullable
  public String getFormatType() {
    return formatType;
  }

  public void setFormatType(String formatType) {
    this.formatType = formatType;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public MerchantAmazonReviewsTaskPostRequestInfo tag(String tag) {
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

  public MerchantAmazonReviewsTaskPostRequestInfo postbackUrl(String postbackUrl) {
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


  public static final String SERIALIZED_NAME_POSTBACK_DATA = "postback_data";
  @SerializedName(SERIALIZED_NAME_POSTBACK_DATA)
  private String postbackData;

  public MerchantAmazonReviewsTaskPostRequestInfo postbackData(String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * postback_url datatype
* required field if you specify postback_url
* corresponds to the datatype that will be sent to your server
* possible values:
* advanced, html
   * @return postbackData
   */
  @javax.annotation.Nullable
  public String getPostbackData() {
    return postbackData;
  }

  public void setPostbackData(String postbackData) {
    this.postbackData = postbackData;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public MerchantAmazonReviewsTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
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



  public MerchantAmazonReviewsTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public MerchantAmazonReviewsTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    MerchantAmazonReviewsTaskPostRequestInfo merchantAmazonReviewsTaskPostRequestInfo = (MerchantAmazonReviewsTaskPostRequestInfo) o;
    return

        Objects.equals(this.asin, merchantAmazonReviewsTaskPostRequestInfo.asin) &&
        Objects.equals(this.priority, merchantAmazonReviewsTaskPostRequestInfo.priority) &&
        Objects.equals(this.locationName, merchantAmazonReviewsTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, merchantAmazonReviewsTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, merchantAmazonReviewsTaskPostRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, merchantAmazonReviewsTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, merchantAmazonReviewsTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.seDomain, merchantAmazonReviewsTaskPostRequestInfo.seDomain) &&
        Objects.equals(this.depth, merchantAmazonReviewsTaskPostRequestInfo.depth) &&
        Objects.equals(this.sortBy, merchantAmazonReviewsTaskPostRequestInfo.sortBy) &&
        Objects.equals(this.reviewerType, merchantAmazonReviewsTaskPostRequestInfo.reviewerType) &&
        Objects.equals(this.filterByStar, merchantAmazonReviewsTaskPostRequestInfo.filterByStar) &&
        Objects.equals(this.filterByKeyword, merchantAmazonReviewsTaskPostRequestInfo.filterByKeyword) &&
        Objects.equals(this.mediaType, merchantAmazonReviewsTaskPostRequestInfo.mediaType) &&
        Objects.equals(this.formatType, merchantAmazonReviewsTaskPostRequestInfo.formatType) &&
        Objects.equals(this.tag, merchantAmazonReviewsTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, merchantAmazonReviewsTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.postbackData, merchantAmazonReviewsTaskPostRequestInfo.postbackData) &&
        Objects.equals(this.pingbackUrl, merchantAmazonReviewsTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(asin, priority, locationName, locationCode, locationCoordinate, languageName, languageCode, seDomain, depth, sortBy, reviewerType, filterByStar, filterByKeyword, mediaType, formatType, tag, postbackUrl, postbackData, pingbackUrl);
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
    sb.append("class MerchantAmazonReviewsTaskPostRequestInfo {\n");

    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    reviewerType: ").append(toIndentedString(reviewerType)).append("\n");
    sb.append("    filterByStar: ").append(toIndentedString(filterByStar)).append("\n");
    sb.append("    filterByKeyword: ").append(toIndentedString(filterByKeyword)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    formatType: ").append(toIndentedString(formatType)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    postbackData: ").append(toIndentedString(postbackData)).append("\n");
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
    
    openapiFields.add("asin");
    
    openapiFields.add("priority");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("depth");
    
    openapiFields.add("sort_by");
    
    openapiFields.add("reviewer_type");
    
    openapiFields.add("filter_by_star");
    
    openapiFields.add("filter_by_keyword");
    
    openapiFields.add("media_type");
    
    openapiFields.add("format_type");
    
    openapiFields.add("tag");
    
    openapiFields.add("postback_url");
    
    openapiFields.add("postback_data");
    
    openapiFields.add("pingback_url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MerchantAmazonReviewsTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantAmazonReviewsTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantAmazonReviewsTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantAmazonReviewsTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantAmazonReviewsTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantAmazonReviewsTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, MerchantAmazonReviewsTaskPostRequestInfo value) throws IOException {
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
           public MerchantAmazonReviewsTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MerchantAmazonReviewsTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static MerchantAmazonReviewsTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantAmazonReviewsTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
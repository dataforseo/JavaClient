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



public class ContentAnalysisSearchLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ContentAnalysisSearchLiveItem type(String type) {
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


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ContentAnalysisSearchLiveItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL where the citation was found
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public ContentAnalysisSearchLiveItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain name
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_MAIN_DOMAIN = "main_domain";
  @SerializedName(SERIALIZED_NAME_MAIN_DOMAIN)
  private String mainDomain;

  public ContentAnalysisSearchLiveItem mainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
    return this;
  }

  /**
   * main domain
   * @return mainDomain
   */
  @javax.annotation.Nullable
  public String getMainDomain() {
    return mainDomain;
  }

  public void setMainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
  }


  public static final String SERIALIZED_NAME_URL_RANK = "url_rank";
  @SerializedName(SERIALIZED_NAME_URL_RANK)
  private Integer urlRank;

  public ContentAnalysisSearchLiveItem urlRank(Integer urlRank) {
    this.urlRank = urlRank;
    return this;
  }

  /**
   * rank of the url
* this value is based on backlink data for the given URL from DataForSEO Backlink Index;
* url_rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm
* learn more about the metric and how it is calculated in this help center article
   * @return urlRank
   */
  @javax.annotation.Nullable
  public Integer getUrlRank() {
    return urlRank;
  }

  public void setUrlRank(Integer urlRank) {
    this.urlRank = urlRank;
  }


  public static final String SERIALIZED_NAME_SPAM_SCORE = "spam_score";
  @SerializedName(SERIALIZED_NAME_SPAM_SCORE)
  private Integer spamScore;

  public ContentAnalysisSearchLiveItem spamScore(Integer spamScore) {
    this.spamScore = spamScore;
    return this;
  }

  /**
   * backlink spam score of the url
* this value is based on backlink data for the given URL from DataForSEO Backlink Index;
* learn more about how the metric is calculated on this help center page
   * @return spamScore
   */
  @javax.annotation.Nullable
  public Integer getSpamScore() {
    return spamScore;
  }

  public void setSpamScore(Integer spamScore) {
    this.spamScore = spamScore;
  }


  public static final String SERIALIZED_NAME_DOMAIN_RANK = "domain_rank";
  @SerializedName(SERIALIZED_NAME_DOMAIN_RANK)
  private Integer domainRank;

  public ContentAnalysisSearchLiveItem domainRank(Integer domainRank) {
    this.domainRank = domainRank;
    return this;
  }

  /**
   * rank of the domain
* this value is based on backlink data for the given domain from DataForSEO Backlink Index;
* domain_rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm
* learn more about the metric and how it is calculated in this help center article
   * @return domainRank
   */
  @javax.annotation.Nullable
  public Integer getDomainRank() {
    return domainRank;
  }

  public void setDomainRank(Integer domainRank) {
    this.domainRank = domainRank;
  }


  public static final String SERIALIZED_NAME_FETCH_TIME = "fetch_time";
  @SerializedName(SERIALIZED_NAME_FETCH_TIME)
  private String fetchTime;

  public ContentAnalysisSearchLiveItem fetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
    return this;
  }

  /**
   * date and time when our crawler visited the page
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2017-01-24 13:20:59 +00:00
   * @return fetchTime
   */
  @javax.annotation.Nullable
  public String getFetchTime() {
    return fetchTime;
  }

  public void setFetchTime(String fetchTime) {
    this.fetchTime = fetchTime;
  }


  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public ContentAnalysisSearchLiveItem country(String country) {
    this.country = country;
    return this;
  }

  /**
   * country code of the domain registration
* to obtain a full list of available countries, refer to the Locations endpoint
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public ContentAnalysisSearchLiveItem language(String language) {
    this.language = language;
    return this;
  }

  /**
   * main language of the domain
* to obtain a full list of available languages, refer to the Languages endpoint
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public ContentAnalysisSearchLiveItem score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * citation prominence score
* this value is based on url_rank, domain_rank, keyword presence in title, main_title, url, snippet
* the higher the score, the more value the related citation has
   * @return score
   */
  @javax.annotation.Nullable
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }


  public static final String SERIALIZED_NAME_PAGE_CATEGORY = "page_category";
  @SerializedName(SERIALIZED_NAME_PAGE_CATEGORY)
  private List<Integer> pageCategory;

  public ContentAnalysisSearchLiveItem pageCategory(List<Integer> pageCategory) {
    this.pageCategory = pageCategory;
    return this;
  }

  /**
   * contains all relevant page categories
* product and service categories relevant for the page
* to obtain a full list of available categories, refer to the Categories endpoint
   * @return pageCategory
   */
  @javax.annotation.Nullable
  public List<Integer> getPageCategory() {
    return pageCategory;
  }

  public void setPageCategory(List<Integer> pageCategory) {
    this.pageCategory = pageCategory;
  }


  public static final String SERIALIZED_NAME_PAGE_TYPES = "page_types";
  @SerializedName(SERIALIZED_NAME_PAGE_TYPES)
  private List<String> pageTypes;

  public ContentAnalysisSearchLiveItem pageTypes(List<String> pageTypes) {
    this.pageTypes = pageTypes;
    return this;
  }

  /**
   * page types
   * @return pageTypes
   */
  @javax.annotation.Nullable
  public List<String> getPageTypes() {
    return pageTypes;
  }

  public void setPageTypes(List<String> pageTypes) {
    this.pageTypes = pageTypes;
  }


  public static final String SERIALIZED_NAME_RATINGS = "ratings";
  @SerializedName(SERIALIZED_NAME_RATINGS)
  private List<ContentRatingInfo> ratings;

  public ContentAnalysisSearchLiveItem ratings(List<ContentRatingInfo> ratings) {
    this.ratings = ratings;
    return this;
  }

  /**
   * ratings found on the page
* all ratings found on the page based on microdata
   * @return ratings
   */
  @javax.annotation.Nullable
  public List<ContentRatingInfo> getRatings() {
    return ratings;
  }

  public void setRatings(List<ContentRatingInfo> ratings) {
    this.ratings = ratings;
  }


  public static final String SERIALIZED_NAME_SOCIAL_METRICS = "social_metrics";
  @SerializedName(SERIALIZED_NAME_SOCIAL_METRICS)
  private List<SocialMetricsInfo> socialMetrics;

  public ContentAnalysisSearchLiveItem socialMetrics(List<SocialMetricsInfo> socialMetrics) {
    this.socialMetrics = socialMetrics;
    return this;
  }

  /**
   * social media engagement metrics
* data on social media interactions associated with the content based on website embeds developed and supported by social media platforms
   * @return socialMetrics
   */
  @javax.annotation.Nullable
  public List<SocialMetricsInfo> getSocialMetrics() {
    return socialMetrics;
  }

  public void setSocialMetrics(List<SocialMetricsInfo> socialMetrics) {
    this.socialMetrics = socialMetrics;
  }


  public static final String SERIALIZED_NAME_CONTENT_INFO = "content_info";
  @SerializedName(SERIALIZED_NAME_CONTENT_INFO)
  private AnalysisContentInfo contentInfo;

  public ContentAnalysisSearchLiveItem contentInfo(AnalysisContentInfo contentInfo) {
    this.contentInfo = contentInfo;
    return this;
  }

  /**
   * contains data on citations from the given url
   * @return contentInfo
   */
  @javax.annotation.Nullable
  public AnalysisContentInfo getContentInfo() {
    return contentInfo;
  }

  public void setContentInfo(AnalysisContentInfo contentInfo) {
    this.contentInfo = contentInfo;
  }



  public ContentAnalysisSearchLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentAnalysisSearchLiveItem putAdditionalProperty(String key, Object value) {
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


    
    ContentAnalysisSearchLiveItem contentAnalysisSearchLiveItem = (ContentAnalysisSearchLiveItem) o;
    return

        Objects.equals(this.type, contentAnalysisSearchLiveItem.type) &&
        Objects.equals(this.url, contentAnalysisSearchLiveItem.url) &&
        Objects.equals(this.domain, contentAnalysisSearchLiveItem.domain) &&
        Objects.equals(this.mainDomain, contentAnalysisSearchLiveItem.mainDomain) &&
        Objects.equals(this.urlRank, contentAnalysisSearchLiveItem.urlRank) &&
        Objects.equals(this.spamScore, contentAnalysisSearchLiveItem.spamScore) &&
        Objects.equals(this.domainRank, contentAnalysisSearchLiveItem.domainRank) &&
        Objects.equals(this.fetchTime, contentAnalysisSearchLiveItem.fetchTime) &&
        Objects.equals(this.country, contentAnalysisSearchLiveItem.country) &&
        Objects.equals(this.language, contentAnalysisSearchLiveItem.language) &&
        Objects.equals(this.score, contentAnalysisSearchLiveItem.score) &&
        Objects.equals(this.pageCategory, contentAnalysisSearchLiveItem.pageCategory) &&
        Objects.equals(this.pageTypes, contentAnalysisSearchLiveItem.pageTypes) &&
        Objects.equals(this.ratings, contentAnalysisSearchLiveItem.ratings) &&
        Objects.equals(this.socialMetrics, contentAnalysisSearchLiveItem.socialMetrics) &&
        Objects.equals(this.contentInfo, contentAnalysisSearchLiveItem.contentInfo);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, url, domain, mainDomain, urlRank, spamScore, domainRank, fetchTime, country, language, score, pageCategory, pageTypes, ratings, socialMetrics, contentInfo);
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
    sb.append("class ContentAnalysisSearchLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    mainDomain: ").append(toIndentedString(mainDomain)).append("\n");
    sb.append("    urlRank: ").append(toIndentedString(urlRank)).append("\n");
    sb.append("    spamScore: ").append(toIndentedString(spamScore)).append("\n");
    sb.append("    domainRank: ").append(toIndentedString(domainRank)).append("\n");
    sb.append("    fetchTime: ").append(toIndentedString(fetchTime)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    pageCategory: ").append(toIndentedString(pageCategory)).append("\n");
    sb.append("    pageTypes: ").append(toIndentedString(pageTypes)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    socialMetrics: ").append(toIndentedString(socialMetrics)).append("\n");
    sb.append("    contentInfo: ").append(toIndentedString(contentInfo)).append("\n");
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
    
    openapiFields.add("url");
    
    openapiFields.add("domain");
    
    openapiFields.add("main_domain");
    
    openapiFields.add("url_rank");
    
    openapiFields.add("spam_score");
    
    openapiFields.add("domain_rank");
    
    openapiFields.add("fetch_time");
    
    openapiFields.add("country");
    
    openapiFields.add("language");
    
    openapiFields.add("score");
    
    openapiFields.add("page_category");
    
    openapiFields.add("page_types");
    
    openapiFields.add("ratings");
    
    openapiFields.add("social_metrics");
    
    openapiFields.add("content_info");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentAnalysisSearchLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentAnalysisSearchLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentAnalysisSearchLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentAnalysisSearchLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentAnalysisSearchLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentAnalysisSearchLiveItem>() {
           @Override
           public void write(JsonWriter out, ContentAnalysisSearchLiveItem value) throws IOException {
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
           public ContentAnalysisSearchLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentAnalysisSearchLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentAnalysisSearchLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentAnalysisSearchLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
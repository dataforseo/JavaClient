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



public class DataLabsOrganicSerpElementItem  extends BaseDataforseoLabsApiElementItem  {


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public DataLabsOrganicSerpElementItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * subdomain in SERP
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public DataLabsOrganicSerpElementItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the result in SERP
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public DataLabsOrganicSerpElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * relevant URL in SERP
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_BREADCRUMB = "breadcrumb";
  @SerializedName(SERIALIZED_NAME_BREADCRUMB)
  private String breadcrumb;

  public DataLabsOrganicSerpElementItem breadcrumb(String breadcrumb) {
    this.breadcrumb = breadcrumb;
    return this;
  }

  /**
   * breadcrumb in SERP
   * @return breadcrumb
   */
  @javax.annotation.Nullable
  public String getBreadcrumb() {
    return breadcrumb;
  }

  public void setBreadcrumb(String breadcrumb) {
    this.breadcrumb = breadcrumb;
  }


  public static final String SERIALIZED_NAME_WEBSITE_NAME = "website_name";
  @SerializedName(SERIALIZED_NAME_WEBSITE_NAME)
  private String websiteName;

  public DataLabsOrganicSerpElementItem websiteName(String websiteName) {
    this.websiteName = websiteName;
    return this;
  }

  /**
   * relevant website name in SERP
   * @return websiteName
   */
  @javax.annotation.Nullable
  public String getWebsiteName() {
    return websiteName;
  }

  public void setWebsiteName(String websiteName) {
    this.websiteName = websiteName;
  }


  public static final String SERIALIZED_NAME_IS_IMAGE = "is_image";
  @SerializedName(SERIALIZED_NAME_IS_IMAGE)
  private Boolean isImage;

  public DataLabsOrganicSerpElementItem isImage(Boolean isImage) {
    this.isImage = isImage;
    return this;
  }

  /**
   * indicates whether the element contains an image
   * @return isImage
   */
  @javax.annotation.Nullable
  public Boolean getIsImage() {
    return isImage;
  }

  public void setIsImage(Boolean isImage) {
    this.isImage = isImage;
  }


  public static final String SERIALIZED_NAME_IS_VIDEO = "is_video";
  @SerializedName(SERIALIZED_NAME_IS_VIDEO)
  private Boolean isVideo;

  public DataLabsOrganicSerpElementItem isVideo(Boolean isVideo) {
    this.isVideo = isVideo;
    return this;
  }

  /**
   * indicates whether the element contains a video
   * @return isVideo
   */
  @javax.annotation.Nullable
  public Boolean getIsVideo() {
    return isVideo;
  }

  public void setIsVideo(Boolean isVideo) {
    this.isVideo = isVideo;
  }


  public static final String SERIALIZED_NAME_IS_FEATURED_SNIPPET = "is_featured_snippet";
  @SerializedName(SERIALIZED_NAME_IS_FEATURED_SNIPPET)
  private Boolean isFeaturedSnippet;

  public DataLabsOrganicSerpElementItem isFeaturedSnippet(Boolean isFeaturedSnippet) {
    this.isFeaturedSnippet = isFeaturedSnippet;
    return this;
  }

  /**
   * indicates whether the element is a featured_snippet
   * @return isFeaturedSnippet
   */
  @javax.annotation.Nullable
  public Boolean getIsFeaturedSnippet() {
    return isFeaturedSnippet;
  }

  public void setIsFeaturedSnippet(Boolean isFeaturedSnippet) {
    this.isFeaturedSnippet = isFeaturedSnippet;
  }


  public static final String SERIALIZED_NAME_IS_MALICIOUS = "is_malicious";
  @SerializedName(SERIALIZED_NAME_IS_MALICIOUS)
  private Boolean isMalicious;

  public DataLabsOrganicSerpElementItem isMalicious(Boolean isMalicious) {
    this.isMalicious = isMalicious;
    return this;
  }

  /**
   * indicates whether the element is marked as malicious
   * @return isMalicious
   */
  @javax.annotation.Nullable
  public Boolean getIsMalicious() {
    return isMalicious;
  }

  public void setIsMalicious(Boolean isMalicious) {
    this.isMalicious = isMalicious;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public DataLabsOrganicSerpElementItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the results element in SERP
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_PRE_SNIPPET = "pre_snippet";
  @SerializedName(SERIALIZED_NAME_PRE_SNIPPET)
  private String preSnippet;

  public DataLabsOrganicSerpElementItem preSnippet(String preSnippet) {
    this.preSnippet = preSnippet;
    return this;
  }

  /**
   * includes additional information appended before the result description in SERP
   * @return preSnippet
   */
  @javax.annotation.Nullable
  public String getPreSnippet() {
    return preSnippet;
  }

  public void setPreSnippet(String preSnippet) {
    this.preSnippet = preSnippet;
  }


  public static final String SERIALIZED_NAME_EXTENDED_SNIPPET = "extended_snippet";
  @SerializedName(SERIALIZED_NAME_EXTENDED_SNIPPET)
  private String extendedSnippet;

  public DataLabsOrganicSerpElementItem extendedSnippet(String extendedSnippet) {
    this.extendedSnippet = extendedSnippet;
    return this;
  }

  /**
   * includes additional information appended after the result description in SERP
   * @return extendedSnippet
   */
  @javax.annotation.Nullable
  public String getExtendedSnippet() {
    return extendedSnippet;
  }

  public void setExtendedSnippet(String extendedSnippet) {
    this.extendedSnippet = extendedSnippet;
  }


  public static final String SERIALIZED_NAME_AMP_VERSION = "amp_version";
  @SerializedName(SERIALIZED_NAME_AMP_VERSION)
  private Boolean ampVersion;

  public DataLabsOrganicSerpElementItem ampVersion(Boolean ampVersion) {
    this.ampVersion = ampVersion;
    return this;
  }

  /**
   * Accelerated Mobile Pages
* indicates whether an item has the Accelerated Mobile Page (AMP) version
   * @return ampVersion
   */
  @javax.annotation.Nullable
  public Boolean getAmpVersion() {
    return ampVersion;
  }

  public void setAmpVersion(Boolean ampVersion) {
    this.ampVersion = ampVersion;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public DataLabsOrganicSerpElementItem rating(RatingInfo rating) {
    this.rating = rating;
    return this;
  }

  /**
   * the item’s rating 
* the popularity rate based on reviews and displayed in SERP
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingInfo getRating() {
    return rating;
  }

  public void setRating(RatingInfo rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_HIGHLIGHTED = "highlighted";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHTED)
  private List<String> highlighted;

  public DataLabsOrganicSerpElementItem highlighted(List<String> highlighted) {
    this.highlighted = highlighted;
    return this;
  }

  /**
   * words highlighted in bold within the results description
   * @return highlighted
   */
  @javax.annotation.Nullable
  public List<String> getHighlighted() {
    return highlighted;
  }

  public void setHighlighted(List<String> highlighted) {
    this.highlighted = highlighted;
  }


  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkElement> links;

  public DataLabsOrganicSerpElementItem links(List<LinkElement> links) {
    this.links = links;
    return this;
  }

  /**
   * sitelinks
* the links shown below some of Google’s search results
* if there are none, equals null
   * @return links
   */
  @javax.annotation.Nullable
  public List<LinkElement> getLinks() {
    return links;
  }

  public void setLinks(List<LinkElement> links) {
    this.links = links;
  }


  public static final String SERIALIZED_NAME_ABOUT_THIS_RESULT = "about_this_result";
  @SerializedName(SERIALIZED_NAME_ABOUT_THIS_RESULT)
  private AboutThisResultElement aboutThisResult;

  public DataLabsOrganicSerpElementItem aboutThisResult(AboutThisResultElement aboutThisResult) {
    this.aboutThisResult = aboutThisResult;
    return this;
  }

  /**
   * contains information from the ‘About this result’ panel
* ‘About this result’ panel provides additional context about why Google returned this result for the given query;
* this feature appears after clicking on the three dots next to most results
   * @return aboutThisResult
   */
  @javax.annotation.Nullable
  public AboutThisResultElement getAboutThisResult() {
    return aboutThisResult;
  }

  public void setAboutThisResult(AboutThisResultElement aboutThisResult) {
    this.aboutThisResult = aboutThisResult;
  }


  public static final String SERIALIZED_NAME_MAIN_DOMAIN = "main_domain";
  @SerializedName(SERIALIZED_NAME_MAIN_DOMAIN)
  private String mainDomain;

  public DataLabsOrganicSerpElementItem mainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
    return this;
  }

  /**
   * primary domain name in SERP
   * @return mainDomain
   */
  @javax.annotation.Nullable
  public String getMainDomain() {
    return mainDomain;
  }

  public void setMainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
  }


  public static final String SERIALIZED_NAME_RELATIVE_URL = "relative_url";
  @SerializedName(SERIALIZED_NAME_RELATIVE_URL)
  private String relativeUrl;

  public DataLabsOrganicSerpElementItem relativeUrl(String relativeUrl) {
    this.relativeUrl = relativeUrl;
    return this;
  }

  /**
   * URL in SERP that does not specify the HTTPs protocol and domain name
   * @return relativeUrl
   */
  @javax.annotation.Nullable
  public String getRelativeUrl() {
    return relativeUrl;
  }

  public void setRelativeUrl(String relativeUrl) {
    this.relativeUrl = relativeUrl;
  }


  public static final String SERIALIZED_NAME_ETV = "etv";
  @SerializedName(SERIALIZED_NAME_ETV)
  private Double etv;

  public DataLabsOrganicSerpElementItem etv(Double etv) {
    this.etv = etv;
    return this;
  }

  /**
   * estimated traffic volume
* estimated paid monthly traffic to the domain
* calculated as the product of CTR (click-through-rate) and search volume values of all keywords in the category that the domain ranks for
* learn more about how the metric is calculated in this help center article
   * @return etv
   */
  @javax.annotation.Nullable
  public Double getEtv() {
    return etv;
  }

  public void setEtv(Double etv) {
    this.etv = etv;
  }


  public static final String SERIALIZED_NAME_ESTIMATED_PAID_TRAFFIC_COST = "estimated_paid_traffic_cost";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_PAID_TRAFFIC_COST)
  private Double estimatedPaidTrafficCost;

  public DataLabsOrganicSerpElementItem estimatedPaidTrafficCost(Double estimatedPaidTrafficCost) {
    this.estimatedPaidTrafficCost = estimatedPaidTrafficCost;
    return this;
  }

  /**
   * estimated cost of monthly search traffic
* represents the estimated cost of paid monthly traffic (USD) based on etv and cpc values of all keywords in the category that the domain ranks for
* learn more about how the metric is calculated in this help center article
   * @return estimatedPaidTrafficCost
   */
  @javax.annotation.Nullable
  public Double getEstimatedPaidTrafficCost() {
    return estimatedPaidTrafficCost;
  }

  public void setEstimatedPaidTrafficCost(Double estimatedPaidTrafficCost) {
    this.estimatedPaidTrafficCost = estimatedPaidTrafficCost;
  }


  public static final String SERIALIZED_NAME_CLICKSTREAM_ETV = "clickstream_etv";
  @SerializedName(SERIALIZED_NAME_CLICKSTREAM_ETV)
  private Double clickstreamEtv;

  public DataLabsOrganicSerpElementItem clickstreamEtv(Double clickstreamEtv) {
    this.clickstreamEtv = clickstreamEtv;
    return this;
  }

  /**
   * estimated traffic volume based on clickstream data
* calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for
* to retrieve results for this field, the parameter include_clickstream_data must be set to true
* learn more about how the metric is calculated in this help center article
   * @return clickstreamEtv
   */
  @javax.annotation.Nullable
  public Double getClickstreamEtv() {
    return clickstreamEtv;
  }

  public void setClickstreamEtv(Double clickstreamEtv) {
    this.clickstreamEtv = clickstreamEtv;
  }


  public static final String SERIALIZED_NAME_RANK_CHANGES = "rank_changes";
  @SerializedName(SERIALIZED_NAME_RANK_CHANGES)
  private RankChanges rankChanges;

  public DataLabsOrganicSerpElementItem rankChanges(RankChanges rankChanges) {
    this.rankChanges = rankChanges;
    return this;
  }

  /**
   * changes in rankings
* contains information about the ranking changes of the SERP element since the previous_updated_time
   * @return rankChanges
   */
  @javax.annotation.Nullable
  public RankChanges getRankChanges() {
    return rankChanges;
  }

  public void setRankChanges(RankChanges rankChanges) {
    this.rankChanges = rankChanges;
  }


  public static final String SERIALIZED_NAME_BACKLINKS_INFO = "backlinks_info";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_INFO)
  private BacklinksInfo backlinksInfo;

  public DataLabsOrganicSerpElementItem backlinksInfo(BacklinksInfo backlinksInfo) {
    this.backlinksInfo = backlinksInfo;
    return this;
  }

  /**
   * backlinks information for the target website
   * @return backlinksInfo
   */
  @javax.annotation.Nullable
  public BacklinksInfo getBacklinksInfo() {
    return backlinksInfo;
  }

  public void setBacklinksInfo(BacklinksInfo backlinksInfo) {
    this.backlinksInfo = backlinksInfo;
  }


  public static final String SERIALIZED_NAME_RANK_INFO = "rank_info";
  @SerializedName(SERIALIZED_NAME_RANK_INFO)
  private RankInfo rankInfo;

  public DataLabsOrganicSerpElementItem rankInfo(RankInfo rankInfo) {
    this.rankInfo = rankInfo;
    return this;
  }

  /**
   * page and domain rank information
   * @return rankInfo
   */
  @javax.annotation.Nullable
  public RankInfo getRankInfo() {
    return rankInfo;
  }

  public void setRankInfo(RankInfo rankInfo) {
    this.rankInfo = rankInfo;
  }



  public DataLabsOrganicSerpElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataLabsOrganicSerpElementItem putAdditionalProperty(String key, Object value) {
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


    
    DataLabsOrganicSerpElementItem dataLabsOrganicSerpElementItem = (DataLabsOrganicSerpElementItem) o;
    return

        Objects.equals(this.domain, dataLabsOrganicSerpElementItem.domain) &&
        Objects.equals(this.title, dataLabsOrganicSerpElementItem.title) &&
        Objects.equals(this.url, dataLabsOrganicSerpElementItem.url) &&
        Objects.equals(this.breadcrumb, dataLabsOrganicSerpElementItem.breadcrumb) &&
        Objects.equals(this.websiteName, dataLabsOrganicSerpElementItem.websiteName) &&
        Objects.equals(this.isImage, dataLabsOrganicSerpElementItem.isImage) &&
        Objects.equals(this.isVideo, dataLabsOrganicSerpElementItem.isVideo) &&
        Objects.equals(this.isFeaturedSnippet, dataLabsOrganicSerpElementItem.isFeaturedSnippet) &&
        Objects.equals(this.isMalicious, dataLabsOrganicSerpElementItem.isMalicious) &&
        Objects.equals(this.description, dataLabsOrganicSerpElementItem.description) &&
        Objects.equals(this.preSnippet, dataLabsOrganicSerpElementItem.preSnippet) &&
        Objects.equals(this.extendedSnippet, dataLabsOrganicSerpElementItem.extendedSnippet) &&
        Objects.equals(this.ampVersion, dataLabsOrganicSerpElementItem.ampVersion) &&
        Objects.equals(this.rating, dataLabsOrganicSerpElementItem.rating) &&
        Objects.equals(this.highlighted, dataLabsOrganicSerpElementItem.highlighted) &&
        Objects.equals(this.links, dataLabsOrganicSerpElementItem.links) &&
        Objects.equals(this.aboutThisResult, dataLabsOrganicSerpElementItem.aboutThisResult) &&
        Objects.equals(this.mainDomain, dataLabsOrganicSerpElementItem.mainDomain) &&
        Objects.equals(this.relativeUrl, dataLabsOrganicSerpElementItem.relativeUrl) &&
        Objects.equals(this.etv, dataLabsOrganicSerpElementItem.etv) &&
        Objects.equals(this.estimatedPaidTrafficCost, dataLabsOrganicSerpElementItem.estimatedPaidTrafficCost) &&
        Objects.equals(this.clickstreamEtv, dataLabsOrganicSerpElementItem.clickstreamEtv) &&
        Objects.equals(this.rankChanges, dataLabsOrganicSerpElementItem.rankChanges) &&
        Objects.equals(this.backlinksInfo, dataLabsOrganicSerpElementItem.backlinksInfo) &&
        Objects.equals(this.rankInfo, dataLabsOrganicSerpElementItem.rankInfo) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(domain, title, url, breadcrumb, websiteName, isImage, isVideo, isFeaturedSnippet, isMalicious, description, preSnippet, extendedSnippet, ampVersion, rating, highlighted, links, aboutThisResult, mainDomain, relativeUrl, etv, estimatedPaidTrafficCost, clickstreamEtv, rankChanges, backlinksInfo, rankInfo);
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
    sb.append("class DataLabsOrganicSerpElementItem {\n");

    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
    sb.append("    websiteName: ").append(toIndentedString(websiteName)).append("\n");
    sb.append("    isImage: ").append(toIndentedString(isImage)).append("\n");
    sb.append("    isVideo: ").append(toIndentedString(isVideo)).append("\n");
    sb.append("    isFeaturedSnippet: ").append(toIndentedString(isFeaturedSnippet)).append("\n");
    sb.append("    isMalicious: ").append(toIndentedString(isMalicious)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    preSnippet: ").append(toIndentedString(preSnippet)).append("\n");
    sb.append("    extendedSnippet: ").append(toIndentedString(extendedSnippet)).append("\n");
    sb.append("    ampVersion: ").append(toIndentedString(ampVersion)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    highlighted: ").append(toIndentedString(highlighted)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    aboutThisResult: ").append(toIndentedString(aboutThisResult)).append("\n");
    sb.append("    mainDomain: ").append(toIndentedString(mainDomain)).append("\n");
    sb.append("    relativeUrl: ").append(toIndentedString(relativeUrl)).append("\n");
    sb.append("    etv: ").append(toIndentedString(etv)).append("\n");
    sb.append("    estimatedPaidTrafficCost: ").append(toIndentedString(estimatedPaidTrafficCost)).append("\n");
    sb.append("    clickstreamEtv: ").append(toIndentedString(clickstreamEtv)).append("\n");
    sb.append("    rankChanges: ").append(toIndentedString(rankChanges)).append("\n");
    sb.append("    backlinksInfo: ").append(toIndentedString(backlinksInfo)).append("\n");
    sb.append("    rankInfo: ").append(toIndentedString(rankInfo)).append("\n");
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
    openapiFields.add("se_type");
    openapiFields.add("rank_group");
    openapiFields.add("rank_absolute");
    openapiFields.add("position");
    openapiFields.add("xpath");
    
    openapiFields.add("domain");
    
    openapiFields.add("title");
    
    openapiFields.add("url");
    
    openapiFields.add("breadcrumb");
    
    openapiFields.add("website_name");
    
    openapiFields.add("is_image");
    
    openapiFields.add("is_video");
    
    openapiFields.add("is_featured_snippet");
    
    openapiFields.add("is_malicious");
    
    openapiFields.add("description");
    
    openapiFields.add("pre_snippet");
    
    openapiFields.add("extended_snippet");
    
    openapiFields.add("amp_version");
    
    openapiFields.add("rating");
    
    openapiFields.add("highlighted");
    
    openapiFields.add("links");
    
    openapiFields.add("about_this_result");
    
    openapiFields.add("main_domain");
    
    openapiFields.add("relative_url");
    
    openapiFields.add("etv");
    
    openapiFields.add("estimated_paid_traffic_cost");
    
    openapiFields.add("clickstream_etv");
    
    openapiFields.add("rank_changes");
    
    openapiFields.add("backlinks_info");
    
    openapiFields.add("rank_info");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataLabsOrganicSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataLabsOrganicSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataLabsOrganicSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataLabsOrganicSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataLabsOrganicSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataLabsOrganicSerpElementItem>() {
           @Override
           public void write(JsonWriter out, DataLabsOrganicSerpElementItem value) throws IOException {
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
           public DataLabsOrganicSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataLabsOrganicSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataLabsOrganicSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataLabsOrganicSerpElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
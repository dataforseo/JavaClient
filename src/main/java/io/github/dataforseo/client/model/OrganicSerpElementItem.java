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
import io.github.dataforseo.client.model.AboutThisResultElement;
import io.github.dataforseo.client.model.BaseSerpElementItem;
import io.github.dataforseo.client.model.FaqBox;
import io.github.dataforseo.client.model.ImagesElement;
import io.github.dataforseo.client.model.LinkElement;
import io.github.dataforseo.client.model.PriceInfo;
import io.github.dataforseo.client.model.RatingInfo;
import io.github.dataforseo.client.model.Rectangle;
import io.github.dataforseo.client.model.RelatedResult;
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
 * OrganicSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class OrganicSerpElementItem extends BaseSerpElementItem {
  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_CACHE_URL = "cache_url";
  @SerializedName(SERIALIZED_NAME_CACHE_URL)
  private String cacheUrl;

  public static final String SERIALIZED_NAME_RELATED_SEARCH_URL = "related_search_url";
  @SerializedName(SERIALIZED_NAME_RELATED_SEARCH_URL)
  private String relatedSearchUrl;

  public static final String SERIALIZED_NAME_BREADCRUMB = "breadcrumb";
  @SerializedName(SERIALIZED_NAME_BREADCRUMB)
  private String breadcrumb;

  public static final String SERIALIZED_NAME_WEBSITE_NAME = "website_name";
  @SerializedName(SERIALIZED_NAME_WEBSITE_NAME)
  private String websiteName;

  public static final String SERIALIZED_NAME_IS_IMAGE = "is_image";
  @SerializedName(SERIALIZED_NAME_IS_IMAGE)
  private Boolean isImage;

  public static final String SERIALIZED_NAME_IS_VIDEO = "is_video";
  @SerializedName(SERIALIZED_NAME_IS_VIDEO)
  private Boolean isVideo;

  public static final String SERIALIZED_NAME_IS_FEATURED_SNIPPET = "is_featured_snippet";
  @SerializedName(SERIALIZED_NAME_IS_FEATURED_SNIPPET)
  private Boolean isFeaturedSnippet;

  public static final String SERIALIZED_NAME_IS_MALICIOUS = "is_malicious";
  @SerializedName(SERIALIZED_NAME_IS_MALICIOUS)
  private Boolean isMalicious;

  public static final String SERIALIZED_NAME_IS_WEB_STORY = "is_web_story";
  @SerializedName(SERIALIZED_NAME_IS_WEB_STORY)
  private Boolean isWebStory;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRE_SNIPPET = "pre_snippet";
  @SerializedName(SERIALIZED_NAME_PRE_SNIPPET)
  private String preSnippet;

  public static final String SERIALIZED_NAME_EXTENDED_SNIPPET = "extended_snippet";
  @SerializedName(SERIALIZED_NAME_EXTENDED_SNIPPET)
  private String extendedSnippet;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<ImagesElement> images;

  public static final String SERIALIZED_NAME_AMP_VERSION = "amp_version";
  @SerializedName(SERIALIZED_NAME_AMP_VERSION)
  private Boolean ampVersion;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private PriceInfo price;

  public static final String SERIALIZED_NAME_HIGHLIGHTED = "highlighted";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHTED)
  private List<String> highlighted;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkElement> links;

  public static final String SERIALIZED_NAME_FAQ = "faq";
  @SerializedName(SERIALIZED_NAME_FAQ)
  private FaqBox faq;

  public static final String SERIALIZED_NAME_EXTENDED_PEOPLE_ALSO_SEARCH = "extended_people_also_search";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PEOPLE_ALSO_SEARCH)
  private List<String> extendedPeopleAlsoSearch;

  public static final String SERIALIZED_NAME_ABOUT_THIS_RESULT = "about_this_result";
  @SerializedName(SERIALIZED_NAME_ABOUT_THIS_RESULT)
  private AboutThisResultElement aboutThisResult;

  public static final String SERIALIZED_NAME_RELATED_RESULT = "related_result";
  @SerializedName(SERIALIZED_NAME_RELATED_RESULT)
  private List<RelatedResult> relatedResult;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_RECTANGLE = "rectangle";
  @SerializedName(SERIALIZED_NAME_RECTANGLE)
  private Rectangle rectangle;

  public OrganicSerpElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public OrganicSerpElementItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain name of the reference
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public OrganicSerpElementItem title(String title) {
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


  public OrganicSerpElementItem url(String url) {
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


  public OrganicSerpElementItem cacheUrl(String cacheUrl) {
    this.cacheUrl = cacheUrl;
    return this;
  }

  /**
   * cached version of the page
   * @return cacheUrl
   */
  @javax.annotation.Nullable
  public String getCacheUrl() {
    return cacheUrl;
  }

  public void setCacheUrl(String cacheUrl) {
    this.cacheUrl = cacheUrl;
  }


  public OrganicSerpElementItem relatedSearchUrl(String relatedSearchUrl) {
    this.relatedSearchUrl = relatedSearchUrl;
    return this;
  }

  /**
   * URL to a similar search URL to a new search for the same keyword(s) on related sites
   * @return relatedSearchUrl
   */
  @javax.annotation.Nullable
  public String getRelatedSearchUrl() {
    return relatedSearchUrl;
  }

  public void setRelatedSearchUrl(String relatedSearchUrl) {
    this.relatedSearchUrl = relatedSearchUrl;
  }


  public OrganicSerpElementItem breadcrumb(String breadcrumb) {
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


  public OrganicSerpElementItem websiteName(String websiteName) {
    this.websiteName = websiteName;
    return this;
  }

  /**
   * name of the website in SERP
   * @return websiteName
   */
  @javax.annotation.Nullable
  public String getWebsiteName() {
    return websiteName;
  }

  public void setWebsiteName(String websiteName) {
    this.websiteName = websiteName;
  }


  public OrganicSerpElementItem isImage(Boolean isImage) {
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


  public OrganicSerpElementItem isVideo(Boolean isVideo) {
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


  public OrganicSerpElementItem isFeaturedSnippet(Boolean isFeaturedSnippet) {
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


  public OrganicSerpElementItem isMalicious(Boolean isMalicious) {
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


  public OrganicSerpElementItem isWebStory(Boolean isWebStory) {
    this.isWebStory = isWebStory;
    return this;
  }

  /**
   * indicates whether the element is marked as Google web story
   * @return isWebStory
   */
  @javax.annotation.Nullable
  public Boolean getIsWebStory() {
    return isWebStory;
  }

  public void setIsWebStory(Boolean isWebStory) {
    this.isWebStory = isWebStory;
  }


  public OrganicSerpElementItem description(String description) {
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


  public OrganicSerpElementItem preSnippet(String preSnippet) {
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


  public OrganicSerpElementItem extendedSnippet(String extendedSnippet) {
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


  public OrganicSerpElementItem images(List<ImagesElement> images) {
    this.images = images;
    return this;
  }

  public OrganicSerpElementItem addImagesItem(ImagesElement imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * images of the element
   * @return images
   */
  @javax.annotation.Nullable
  public List<ImagesElement> getImages() {
    return images;
  }

  public void setImages(List<ImagesElement> images) {
    this.images = images;
  }


  public OrganicSerpElementItem ampVersion(Boolean ampVersion) {
    this.ampVersion = ampVersion;
    return this;
  }

  /**
   * Accelerated Mobile Pages indicates whether an item has the Accelerated Mobile Page (AMP) version
   * @return ampVersion
   */
  @javax.annotation.Nullable
  public Boolean getAmpVersion() {
    return ampVersion;
  }

  public void setAmpVersion(Boolean ampVersion) {
    this.ampVersion = ampVersion;
  }


  public OrganicSerpElementItem rating(RatingInfo rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingInfo getRating() {
    return rating;
  }

  public void setRating(RatingInfo rating) {
    this.rating = rating;
  }


  public OrganicSerpElementItem price(PriceInfo price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable
  public PriceInfo getPrice() {
    return price;
  }

  public void setPrice(PriceInfo price) {
    this.price = price;
  }


  public OrganicSerpElementItem highlighted(List<String> highlighted) {
    this.highlighted = highlighted;
    return this;
  }

  public OrganicSerpElementItem addHighlightedItem(String highlightedItem) {
    if (this.highlighted == null) {
      this.highlighted = new ArrayList<>();
    }
    this.highlighted.add(highlightedItem);
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


  public OrganicSerpElementItem links(List<LinkElement> links) {
    this.links = links;
    return this;
  }

  public OrganicSerpElementItem addLinksItem(LinkElement linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * sitelinks the links shown below some of Google’s search results if there are none, equals null
   * @return links
   */
  @javax.annotation.Nullable
  public List<LinkElement> getLinks() {
    return links;
  }

  public void setLinks(List<LinkElement> links) {
    this.links = links;
  }


  public OrganicSerpElementItem faq(FaqBox faq) {
    this.faq = faq;
    return this;
  }

  /**
   * Get faq
   * @return faq
   */
  @javax.annotation.Nullable
  public FaqBox getFaq() {
    return faq;
  }

  public void setFaq(FaqBox faq) {
    this.faq = faq;
  }


  public OrganicSerpElementItem extendedPeopleAlsoSearch(List<String> extendedPeopleAlsoSearch) {
    this.extendedPeopleAlsoSearch = extendedPeopleAlsoSearch;
    return this;
  }

  public OrganicSerpElementItem addExtendedPeopleAlsoSearchItem(String extendedPeopleAlsoSearchItem) {
    if (this.extendedPeopleAlsoSearch == null) {
      this.extendedPeopleAlsoSearch = new ArrayList<>();
    }
    this.extendedPeopleAlsoSearch.add(extendedPeopleAlsoSearchItem);
    return this;
  }

  /**
   * extension of the organic element extension of the organic result containing related search queries Note: extension appears in SERP upon clicking on the result and then bouncing back to search results
   * @return extendedPeopleAlsoSearch
   */
  @javax.annotation.Nullable
  public List<String> getExtendedPeopleAlsoSearch() {
    return extendedPeopleAlsoSearch;
  }

  public void setExtendedPeopleAlsoSearch(List<String> extendedPeopleAlsoSearch) {
    this.extendedPeopleAlsoSearch = extendedPeopleAlsoSearch;
  }


  public OrganicSerpElementItem aboutThisResult(AboutThisResultElement aboutThisResult) {
    this.aboutThisResult = aboutThisResult;
    return this;
  }

  /**
   * Get aboutThisResult
   * @return aboutThisResult
   */
  @javax.annotation.Nullable
  public AboutThisResultElement getAboutThisResult() {
    return aboutThisResult;
  }

  public void setAboutThisResult(AboutThisResultElement aboutThisResult) {
    this.aboutThisResult = aboutThisResult;
  }


  public OrganicSerpElementItem relatedResult(List<RelatedResult> relatedResult) {
    this.relatedResult = relatedResult;
    return this;
  }

  public OrganicSerpElementItem addRelatedResultItem(RelatedResult relatedResultItem) {
    if (this.relatedResult == null) {
      this.relatedResult = new ArrayList<>();
    }
    this.relatedResult.add(relatedResultItem);
    return this;
  }

  /**
   * related result from the same domain related result from the same domain appears as a part of the main result snippet; you can derive the related_result snippets as \&quot;type\&quot;: \&quot;organic\&quot; results by setting the group_organic_results parameter to false in the POST request
   * @return relatedResult
   */
  @javax.annotation.Nullable
  public List<RelatedResult> getRelatedResult() {
    return relatedResult;
  }

  public void setRelatedResult(List<RelatedResult> relatedResult) {
    this.relatedResult = relatedResult;
  }


  public OrganicSerpElementItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time when the result was published in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public OrganicSerpElementItem rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

  /**
   * Get rectangle
   * @return rectangle
   */
  @javax.annotation.Nullable
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
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
   * @return the OrganicSerpElementItem instance itself
   */
  public OrganicSerpElementItem putAdditionalProperty(String key, Object value) {
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
    OrganicSerpElementItem organicSerpElementItem = (OrganicSerpElementItem) o;
    return Objects.equals(this.domain, organicSerpElementItem.domain) &&
        Objects.equals(this.title, organicSerpElementItem.title) &&
        Objects.equals(this.url, organicSerpElementItem.url) &&
        Objects.equals(this.cacheUrl, organicSerpElementItem.cacheUrl) &&
        Objects.equals(this.relatedSearchUrl, organicSerpElementItem.relatedSearchUrl) &&
        Objects.equals(this.breadcrumb, organicSerpElementItem.breadcrumb) &&
        Objects.equals(this.websiteName, organicSerpElementItem.websiteName) &&
        Objects.equals(this.isImage, organicSerpElementItem.isImage) &&
        Objects.equals(this.isVideo, organicSerpElementItem.isVideo) &&
        Objects.equals(this.isFeaturedSnippet, organicSerpElementItem.isFeaturedSnippet) &&
        Objects.equals(this.isMalicious, organicSerpElementItem.isMalicious) &&
        Objects.equals(this.isWebStory, organicSerpElementItem.isWebStory) &&
        Objects.equals(this.description, organicSerpElementItem.description) &&
        Objects.equals(this.preSnippet, organicSerpElementItem.preSnippet) &&
        Objects.equals(this.extendedSnippet, organicSerpElementItem.extendedSnippet) &&
        Objects.equals(this.images, organicSerpElementItem.images) &&
        Objects.equals(this.ampVersion, organicSerpElementItem.ampVersion) &&
        Objects.equals(this.rating, organicSerpElementItem.rating) &&
        Objects.equals(this.price, organicSerpElementItem.price) &&
        Objects.equals(this.highlighted, organicSerpElementItem.highlighted) &&
        Objects.equals(this.links, organicSerpElementItem.links) &&
        Objects.equals(this.faq, organicSerpElementItem.faq) &&
        Objects.equals(this.extendedPeopleAlsoSearch, organicSerpElementItem.extendedPeopleAlsoSearch) &&
        Objects.equals(this.aboutThisResult, organicSerpElementItem.aboutThisResult) &&
        Objects.equals(this.relatedResult, organicSerpElementItem.relatedResult) &&
        Objects.equals(this.timestamp, organicSerpElementItem.timestamp) &&
        Objects.equals(this.rectangle, organicSerpElementItem.rectangle)&&
        Objects.equals(this.additionalProperties, organicSerpElementItem.additionalProperties) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, title, url, cacheUrl, relatedSearchUrl, breadcrumb, websiteName, isImage, isVideo, isFeaturedSnippet, isMalicious, isWebStory, description, preSnippet, extendedSnippet, images, ampVersion, rating, price, highlighted, links, faq, extendedPeopleAlsoSearch, aboutThisResult, relatedResult, timestamp, rectangle, super.hashCode(), additionalProperties);
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
    sb.append("class OrganicSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    cacheUrl: ").append(toIndentedString(cacheUrl)).append("\n");
    sb.append("    relatedSearchUrl: ").append(toIndentedString(relatedSearchUrl)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
    sb.append("    websiteName: ").append(toIndentedString(websiteName)).append("\n");
    sb.append("    isImage: ").append(toIndentedString(isImage)).append("\n");
    sb.append("    isVideo: ").append(toIndentedString(isVideo)).append("\n");
    sb.append("    isFeaturedSnippet: ").append(toIndentedString(isFeaturedSnippet)).append("\n");
    sb.append("    isMalicious: ").append(toIndentedString(isMalicious)).append("\n");
    sb.append("    isWebStory: ").append(toIndentedString(isWebStory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    preSnippet: ").append(toIndentedString(preSnippet)).append("\n");
    sb.append("    extendedSnippet: ").append(toIndentedString(extendedSnippet)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    ampVersion: ").append(toIndentedString(ampVersion)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    highlighted: ").append(toIndentedString(highlighted)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    faq: ").append(toIndentedString(faq)).append("\n");
    sb.append("    extendedPeopleAlsoSearch: ").append(toIndentedString(extendedPeopleAlsoSearch)).append("\n");
    sb.append("    aboutThisResult: ").append(toIndentedString(aboutThisResult)).append("\n");
    sb.append("    relatedResult: ").append(toIndentedString(relatedResult)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
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
    openapiFields.add("domain");
    openapiFields.add("title");
    openapiFields.add("url");
    openapiFields.add("cache_url");
    openapiFields.add("related_search_url");
    openapiFields.add("breadcrumb");
    openapiFields.add("website_name");
    openapiFields.add("is_image");
    openapiFields.add("is_video");
    openapiFields.add("is_featured_snippet");
    openapiFields.add("is_malicious");
    openapiFields.add("is_web_story");
    openapiFields.add("description");
    openapiFields.add("pre_snippet");
    openapiFields.add("extended_snippet");
    openapiFields.add("images");
    openapiFields.add("amp_version");
    openapiFields.add("rating");
    openapiFields.add("price");
    openapiFields.add("highlighted");
    openapiFields.add("links");
    openapiFields.add("faq");
    openapiFields.add("extended_people_also_search");
    openapiFields.add("about_this_result");
    openapiFields.add("related_result");
    openapiFields.add("timestamp");
    openapiFields.add("rectangle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrganicSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrganicSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganicSerpElementItem is not found in the empty JSON string", OrganicSerpElementItem.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganicSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganicSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganicSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganicSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganicSerpElementItem>() {
           @Override
           public void write(JsonWriter out, OrganicSerpElementItem value) throws IOException {
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
           public OrganicSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OrganicSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OrganicSerpElementItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrganicSerpElementItem
   * @throws IOException if the JSON string is invalid with respect to OrganicSerpElementItem
   */
  public static OrganicSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganicSerpElementItem.class);
  }

  /**
   * Convert an instance of OrganicSerpElementItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

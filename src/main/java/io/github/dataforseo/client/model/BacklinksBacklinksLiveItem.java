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



public class BacklinksBacklinksLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BacklinksBacklinksLiveItem type(String type) {
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


  public static final String SERIALIZED_NAME_DOMAIN_FROM = "domain_from";
  @SerializedName(SERIALIZED_NAME_DOMAIN_FROM)
  private String domainFrom;

  public BacklinksBacklinksLiveItem domainFrom(String domainFrom) {
    this.domainFrom = domainFrom;
    return this;
  }

  /**
   * domain referring to the target domain or webpage
   * @return domainFrom
   */
  @javax.annotation.Nullable
  public String getDomainFrom() {
    return domainFrom;
  }

  public void setDomainFrom(String domainFrom) {
    this.domainFrom = domainFrom;
  }


  public static final String SERIALIZED_NAME_URL_FROM = "url_from";
  @SerializedName(SERIALIZED_NAME_URL_FROM)
  private String urlFrom;

  public BacklinksBacklinksLiveItem urlFrom(String urlFrom) {
    this.urlFrom = urlFrom;
    return this;
  }

  /**
   * URL of the page where the backlink is found
   * @return urlFrom
   */
  @javax.annotation.Nullable
  public String getUrlFrom() {
    return urlFrom;
  }

  public void setUrlFrom(String urlFrom) {
    this.urlFrom = urlFrom;
  }


  public static final String SERIALIZED_NAME_URL_FROM_HTTPS = "url_from_https";
  @SerializedName(SERIALIZED_NAME_URL_FROM_HTTPS)
  private Boolean urlFromHttps;

  public BacklinksBacklinksLiveItem urlFromHttps(Boolean urlFromHttps) {
    this.urlFromHttps = urlFromHttps;
    return this;
  }

  /**
   * indicates whether the referring URL is secured with HTTPS
* if true, the referring URL is secured with HTTPS
   * @return urlFromHttps
   */
  @javax.annotation.Nullable
  public Boolean getUrlFromHttps() {
    return urlFromHttps;
  }

  public void setUrlFromHttps(Boolean urlFromHttps) {
    this.urlFromHttps = urlFromHttps;
  }


  public static final String SERIALIZED_NAME_DOMAIN_TO = "domain_to";
  @SerializedName(SERIALIZED_NAME_DOMAIN_TO)
  private String domainTo;

  public BacklinksBacklinksLiveItem domainTo(String domainTo) {
    this.domainTo = domainTo;
    return this;
  }

  /**
   * domain the backlink is pointing to
   * @return domainTo
   */
  @javax.annotation.Nullable
  public String getDomainTo() {
    return domainTo;
  }

  public void setDomainTo(String domainTo) {
    this.domainTo = domainTo;
  }


  public static final String SERIALIZED_NAME_URL_TO = "url_to";
  @SerializedName(SERIALIZED_NAME_URL_TO)
  private String urlTo;

  public BacklinksBacklinksLiveItem urlTo(String urlTo) {
    this.urlTo = urlTo;
    return this;
  }

  /**
   * URL the backlink is pointing to
   * @return urlTo
   */
  @javax.annotation.Nullable
  public String getUrlTo() {
    return urlTo;
  }

  public void setUrlTo(String urlTo) {
    this.urlTo = urlTo;
  }


  public static final String SERIALIZED_NAME_URL_TO_HTTPS = "url_to_https";
  @SerializedName(SERIALIZED_NAME_URL_TO_HTTPS)
  private Boolean urlToHttps;

  public BacklinksBacklinksLiveItem urlToHttps(Boolean urlToHttps) {
    this.urlToHttps = urlToHttps;
    return this;
  }

  /**
   * indicates if the URL the backlink is pointing to is secured with HTTPS
* if true, the URL is secured with HTTPS
   * @return urlToHttps
   */
  @javax.annotation.Nullable
  public Boolean getUrlToHttps() {
    return urlToHttps;
  }

  public void setUrlToHttps(Boolean urlToHttps) {
    this.urlToHttps = urlToHttps;
  }


  public static final String SERIALIZED_NAME_TLD_FROM = "tld_from";
  @SerializedName(SERIALIZED_NAME_TLD_FROM)
  private String tldFrom;

  public BacklinksBacklinksLiveItem tldFrom(String tldFrom) {
    this.tldFrom = tldFrom;
    return this;
  }

  /**
   * top-level domain of the referring URL
   * @return tldFrom
   */
  @javax.annotation.Nullable
  public String getTldFrom() {
    return tldFrom;
  }

  public void setTldFrom(String tldFrom) {
    this.tldFrom = tldFrom;
  }


  public static final String SERIALIZED_NAME_IS_NEW = "is_new";
  @SerializedName(SERIALIZED_NAME_IS_NEW)
  private Boolean isNew;

  public BacklinksBacklinksLiveItem isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

  /**
   * indicates whether the backlink is new
* if true, the backlink was found on the page last time our crawler visited it
   * @return isNew
   */
  @javax.annotation.Nullable
  public Boolean getIsNew() {
    return isNew;
  }

  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }


  public static final String SERIALIZED_NAME_IS_LOST = "is_lost";
  @SerializedName(SERIALIZED_NAME_IS_LOST)
  private Boolean isLost;

  public BacklinksBacklinksLiveItem isLost(Boolean isLost) {
    this.isLost = isLost;
    return this;
  }

  /**
   * indicates whether the backlink was removed
* if true, the backlink or the entire page was removed
   * @return isLost
   */
  @javax.annotation.Nullable
  public Boolean getIsLost() {
    return isLost;
  }

  public void setIsLost(Boolean isLost) {
    this.isLost = isLost;
  }


  public static final String SERIALIZED_NAME_BACKLINK_SPAM_SCORE = "backlink_spam_score";
  @SerializedName(SERIALIZED_NAME_BACKLINK_SPAM_SCORE)
  private Integer backlinkSpamScore;

  public BacklinksBacklinksLiveItem backlinkSpamScore(Integer backlinkSpamScore) {
    this.backlinkSpamScore = backlinkSpamScore;
    return this;
  }

  /**
   * spam score of the backlink
* learn more about how the metric is calculated on this help center page
   * @return backlinkSpamScore
   */
  @javax.annotation.Nullable
  public Integer getBacklinkSpamScore() {
    return backlinkSpamScore;
  }

  public void setBacklinkSpamScore(Integer backlinkSpamScore) {
    this.backlinkSpamScore = backlinkSpamScore;
  }


  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public BacklinksBacklinksLiveItem rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * backlink rank
* rank that the given backlink passes to the target
* rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm
* learn more about the metric and how it is calculated in this help center article
   * @return rank
   */
  @javax.annotation.Nullable
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public static final String SERIALIZED_NAME_PAGE_FROM_RANK = "page_from_rank";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_RANK)
  private Integer pageFromRank;

  public BacklinksBacklinksLiveItem pageFromRank(Integer pageFromRank) {
    this.pageFromRank = pageFromRank;
    return this;
  }

  /**
   * page rank of the referring page
* page_from_rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm
* learn more about the metric and how it is calculated in this help center article
   * @return pageFromRank
   */
  @javax.annotation.Nullable
  public Integer getPageFromRank() {
    return pageFromRank;
  }

  public void setPageFromRank(Integer pageFromRank) {
    this.pageFromRank = pageFromRank;
  }


  public static final String SERIALIZED_NAME_DOMAIN_FROM_RANK = "domain_from_rank";
  @SerializedName(SERIALIZED_NAME_DOMAIN_FROM_RANK)
  private Integer domainFromRank;

  public BacklinksBacklinksLiveItem domainFromRank(Integer domainFromRank) {
    this.domainFromRank = domainFromRank;
    return this;
  }

  /**
   * domain rank of the referring domain
* domain_from_rank is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm
* learn more about the metric and how it is calculated in this help center article
   * @return domainFromRank
   */
  @javax.annotation.Nullable
  public Integer getDomainFromRank() {
    return domainFromRank;
  }

  public void setDomainFromRank(Integer domainFromRank) {
    this.domainFromRank = domainFromRank;
  }


  public static final String SERIALIZED_NAME_DOMAIN_FROM_PLATFORM_TYPE = "domain_from_platform_type";
  @SerializedName(SERIALIZED_NAME_DOMAIN_FROM_PLATFORM_TYPE)
  private List<String> domainFromPlatformType;

  public BacklinksBacklinksLiveItem domainFromPlatformType(List<String> domainFromPlatformType) {
    this.domainFromPlatformType = domainFromPlatformType;
    return this;
  }

  /**
   * platform types of the referring domain
* possible values: cms, blogs, ecommerce, message-boards, wikis, news, organization
   * @return domainFromPlatformType
   */
  @javax.annotation.Nullable
  public List<String> getDomainFromPlatformType() {
    return domainFromPlatformType;
  }

  public void setDomainFromPlatformType(List<String> domainFromPlatformType) {
    this.domainFromPlatformType = domainFromPlatformType;
  }


  public static final String SERIALIZED_NAME_DOMAIN_FROM_IS_IP = "domain_from_is_ip";
  @SerializedName(SERIALIZED_NAME_DOMAIN_FROM_IS_IP)
  private Boolean domainFromIsIp;

  public BacklinksBacklinksLiveItem domainFromIsIp(Boolean domainFromIsIp) {
    this.domainFromIsIp = domainFromIsIp;
    return this;
  }

  /**
   * indicates if the domain is IP
* if true, the domain functions as an IP address and does not have a domain name
   * @return domainFromIsIp
   */
  @javax.annotation.Nullable
  public Boolean getDomainFromIsIp() {
    return domainFromIsIp;
  }

  public void setDomainFromIsIp(Boolean domainFromIsIp) {
    this.domainFromIsIp = domainFromIsIp;
  }


  public static final String SERIALIZED_NAME_DOMAIN_FROM_IP = "domain_from_ip";
  @SerializedName(SERIALIZED_NAME_DOMAIN_FROM_IP)
  private String domainFromIp;

  public BacklinksBacklinksLiveItem domainFromIp(String domainFromIp) {
    this.domainFromIp = domainFromIp;
    return this;
  }

  /**
   * IP address of the referring domain
   * @return domainFromIp
   */
  @javax.annotation.Nullable
  public String getDomainFromIp() {
    return domainFromIp;
  }

  public void setDomainFromIp(String domainFromIp) {
    this.domainFromIp = domainFromIp;
  }


  public static final String SERIALIZED_NAME_DOMAIN_FROM_COUNTRY = "domain_from_country";
  @SerializedName(SERIALIZED_NAME_DOMAIN_FROM_COUNTRY)
  private String domainFromCountry;

  public BacklinksBacklinksLiveItem domainFromCountry(String domainFromCountry) {
    this.domainFromCountry = domainFromCountry;
    return this;
  }

  /**
   * ISO country code of the referring domain
   * @return domainFromCountry
   */
  @javax.annotation.Nullable
  public String getDomainFromCountry() {
    return domainFromCountry;
  }

  public void setDomainFromCountry(String domainFromCountry) {
    this.domainFromCountry = domainFromCountry;
  }


  public static final String SERIALIZED_NAME_PAGE_FROM_EXTERNAL_LINKS = "page_from_external_links";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_EXTERNAL_LINKS)
  private Integer pageFromExternalLinks;

  public BacklinksBacklinksLiveItem pageFromExternalLinks(Integer pageFromExternalLinks) {
    this.pageFromExternalLinks = pageFromExternalLinks;
    return this;
  }

  /**
   * number of external links found on the referring page
   * @return pageFromExternalLinks
   */
  @javax.annotation.Nullable
  public Integer getPageFromExternalLinks() {
    return pageFromExternalLinks;
  }

  public void setPageFromExternalLinks(Integer pageFromExternalLinks) {
    this.pageFromExternalLinks = pageFromExternalLinks;
  }


  public static final String SERIALIZED_NAME_PAGE_FROM_INTERNAL_LINKS = "page_from_internal_links";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_INTERNAL_LINKS)
  private Integer pageFromInternalLinks;

  public BacklinksBacklinksLiveItem pageFromInternalLinks(Integer pageFromInternalLinks) {
    this.pageFromInternalLinks = pageFromInternalLinks;
    return this;
  }

  /**
   * number of internal links found on the referring page
   * @return pageFromInternalLinks
   */
  @javax.annotation.Nullable
  public Integer getPageFromInternalLinks() {
    return pageFromInternalLinks;
  }

  public void setPageFromInternalLinks(Integer pageFromInternalLinks) {
    this.pageFromInternalLinks = pageFromInternalLinks;
  }


  public static final String SERIALIZED_NAME_PAGE_FROM_SIZE = "page_from_size";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_SIZE)
  private Integer pageFromSize;

  public BacklinksBacklinksLiveItem pageFromSize(Integer pageFromSize) {
    this.pageFromSize = pageFromSize;
    return this;
  }

  /**
   * size of the referring page, in bytes
* example:
* 63357
   * @return pageFromSize
   */
  @javax.annotation.Nullable
  public Integer getPageFromSize() {
    return pageFromSize;
  }

  public void setPageFromSize(Integer pageFromSize) {
    this.pageFromSize = pageFromSize;
  }


  public static final String SERIALIZED_NAME_PAGE_FROM_ENCODING = "page_from_encoding";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_ENCODING)
  private String pageFromEncoding;

  public BacklinksBacklinksLiveItem pageFromEncoding(String pageFromEncoding) {
    this.pageFromEncoding = pageFromEncoding;
    return this;
  }

  /**
   * character encoding of the referring page
* example:
* utf-8
   * @return pageFromEncoding
   */
  @javax.annotation.Nullable
  public String getPageFromEncoding() {
    return pageFromEncoding;
  }

  public void setPageFromEncoding(String pageFromEncoding) {
    this.pageFromEncoding = pageFromEncoding;
  }


  public static final String SERIALIZED_NAME_PAGE_FROM_LANGUAGE = "page_from_language";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_LANGUAGE)
  private String pageFromLanguage;

  public BacklinksBacklinksLiveItem pageFromLanguage(String pageFromLanguage) {
    this.pageFromLanguage = pageFromLanguage;
    return this;
  }

  /**
   * language of the referring page
* in ISO 639-1 format
* example:
* en
   * @return pageFromLanguage
   */
  @javax.annotation.Nullable
  public String getPageFromLanguage() {
    return pageFromLanguage;
  }

  public void setPageFromLanguage(String pageFromLanguage) {
    this.pageFromLanguage = pageFromLanguage;
  }


  public static final String SERIALIZED_NAME_PAGE_FROM_TITLE = "page_from_title";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_TITLE)
  private String pageFromTitle;

  public BacklinksBacklinksLiveItem pageFromTitle(String pageFromTitle) {
    this.pageFromTitle = pageFromTitle;
    return this;
  }

  /**
   * title of the referring page
   * @return pageFromTitle
   */
  @javax.annotation.Nullable
  public String getPageFromTitle() {
    return pageFromTitle;
  }

  public void setPageFromTitle(String pageFromTitle) {
    this.pageFromTitle = pageFromTitle;
  }


  public static final String SERIALIZED_NAME_PAGE_FROM_STATUS_CODE = "page_from_status_code";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_STATUS_CODE)
  private Integer pageFromStatusCode;

  public BacklinksBacklinksLiveItem pageFromStatusCode(Integer pageFromStatusCode) {
    this.pageFromStatusCode = pageFromStatusCode;
    return this;
  }

  /**
   * HTTP status code returned by the referring page
* example:
* 200
   * @return pageFromStatusCode
   */
  @javax.annotation.Nullable
  public Integer getPageFromStatusCode() {
    return pageFromStatusCode;
  }

  public void setPageFromStatusCode(Integer pageFromStatusCode) {
    this.pageFromStatusCode = pageFromStatusCode;
  }


  public static final String SERIALIZED_NAME_FIRST_SEEN = "first_seen";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN)
  private String firstSeen;

  public BacklinksBacklinksLiveItem firstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

  /**
   * date and time when our crawler found the backlink for the first time
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return firstSeen
   */
  @javax.annotation.Nullable
  public String getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
  }


  public static final String SERIALIZED_NAME_PREV_SEEN = "prev_seen";
  @SerializedName(SERIALIZED_NAME_PREV_SEEN)
  private String prevSeen;

  public BacklinksBacklinksLiveItem prevSeen(String prevSeen) {
    this.prevSeen = prevSeen;
    return this;
  }

  /**
   * previous to the most recent date when our crawler visited the backlink
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return prevSeen
   */
  @javax.annotation.Nullable
  public String getPrevSeen() {
    return prevSeen;
  }

  public void setPrevSeen(String prevSeen) {
    this.prevSeen = prevSeen;
  }


  public static final String SERIALIZED_NAME_LAST_SEEN = "last_seen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private String lastSeen;

  public BacklinksBacklinksLiveItem lastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

  /**
   * most recent date when our crawler visited the backlink
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return lastSeen
   */
  @javax.annotation.Nullable
  public String getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
  }


  public static final String SERIALIZED_NAME_ITEM_TYPE = "item_type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private String itemType;

  public BacklinksBacklinksLiveItem itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * link type
* possible values:
* anchor, image, meta, canonical, alternate, redirect
   * @return itemType
   */
  @javax.annotation.Nullable
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }


  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<String> attributes;

  public BacklinksBacklinksLiveItem attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * link attributes of the referring links
* example:
* nofollow
   * @return attributes
   */
  @javax.annotation.Nullable
  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }


  public static final String SERIALIZED_NAME_DOFOLLOW = "dofollow";
  @SerializedName(SERIALIZED_NAME_DOFOLLOW)
  private Boolean dofollow;

  public BacklinksBacklinksLiveItem dofollow(Boolean dofollow) {
    this.dofollow = dofollow;
    return this;
  }

  /**
   * indicates whether the backlink is dofollow
* if false, the backlink is nofollow
   * @return dofollow
   */
  @javax.annotation.Nullable
  public Boolean getDofollow() {
    return dofollow;
  }

  public void setDofollow(Boolean dofollow) {
    this.dofollow = dofollow;
  }


  public static final String SERIALIZED_NAME_ORIGINAL = "original";
  @SerializedName(SERIALIZED_NAME_ORIGINAL)
  private Boolean original;

  public BacklinksBacklinksLiveItem original(Boolean original) {
    this.original = original;
    return this;
  }

  /**
   * indicates whether the backlink was present on the referring page when our crawler first visited it
   * @return original
   */
  @javax.annotation.Nullable
  public Boolean getOriginal() {
    return original;
  }

  public void setOriginal(Boolean original) {
    this.original = original;
  }


  public static final String SERIALIZED_NAME_ALT = "alt";
  @SerializedName(SERIALIZED_NAME_ALT)
  private String alt;

  public BacklinksBacklinksLiveItem alt(String alt) {
    this.alt = alt;
    return this;
  }

  /**
   * alternative text of the image
* this field will be null if backlink type is not image
   * @return alt
   */
  @javax.annotation.Nullable
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }


  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public BacklinksBacklinksLiveItem imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * URL of the image
* the URL leading to the image on the original resource or DataForSEO storage (in case the original source is not available)
   * @return imageUrl
   */
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public static final String SERIALIZED_NAME_ANCHOR = "anchor";
  @SerializedName(SERIALIZED_NAME_ANCHOR)
  private String anchor;

  public BacklinksBacklinksLiveItem anchor(String anchor) {
    this.anchor = anchor;
    return this;
  }

  /**
   * anchor text of the backlink
   * @return anchor
   */
  @javax.annotation.Nullable
  public String getAnchor() {
    return anchor;
  }

  public void setAnchor(String anchor) {
    this.anchor = anchor;
  }


  public static final String SERIALIZED_NAME_TEXT_PRE = "text_pre";
  @SerializedName(SERIALIZED_NAME_TEXT_PRE)
  private String textPre;

  public BacklinksBacklinksLiveItem textPre(String textPre) {
    this.textPre = textPre;
    return this;
  }

  /**
   * snippet before the anchor text
   * @return textPre
   */
  @javax.annotation.Nullable
  public String getTextPre() {
    return textPre;
  }

  public void setTextPre(String textPre) {
    this.textPre = textPre;
  }


  public static final String SERIALIZED_NAME_TEXT_POST = "text_post";
  @SerializedName(SERIALIZED_NAME_TEXT_POST)
  private String textPost;

  public BacklinksBacklinksLiveItem textPost(String textPost) {
    this.textPost = textPost;
    return this;
  }

  /**
   * snippet after the anchor text
   * @return textPost
   */
  @javax.annotation.Nullable
  public String getTextPost() {
    return textPost;
  }

  public void setTextPost(String textPost) {
    this.textPost = textPost;
  }


  public static final String SERIALIZED_NAME_SEMANTIC_LOCATION = "semantic_location";
  @SerializedName(SERIALIZED_NAME_SEMANTIC_LOCATION)
  private String semanticLocation;

  public BacklinksBacklinksLiveItem semanticLocation(String semanticLocation) {
    this.semanticLocation = semanticLocation;
    return this;
  }

  /**
   * indicates semantic element in HTML where the backlink is found
* you can get the full list of semantic elements here
* examples:
* article, section, summary
   * @return semanticLocation
   */
  @javax.annotation.Nullable
  public String getSemanticLocation() {
    return semanticLocation;
  }

  public void setSemanticLocation(String semanticLocation) {
    this.semanticLocation = semanticLocation;
  }


  public static final String SERIALIZED_NAME_LINKS_COUNT = "links_count";
  @SerializedName(SERIALIZED_NAME_LINKS_COUNT)
  private Long linksCount;

  public BacklinksBacklinksLiveItem linksCount(Long linksCount) {
    this.linksCount = linksCount;
    return this;
  }

  /**
   * number of identical backlinks found on the referring page
   * @return linksCount
   */
  @javax.annotation.Nullable
  public Long getLinksCount() {
    return linksCount;
  }

  public void setLinksCount(Long linksCount) {
    this.linksCount = linksCount;
  }


  public static final String SERIALIZED_NAME_GROUP_COUNT = "group_count";
  @SerializedName(SERIALIZED_NAME_GROUP_COUNT)
  private Long groupCount;

  public BacklinksBacklinksLiveItem groupCount(Long groupCount) {
    this.groupCount = groupCount;
    return this;
  }

  /**
   * indicates total number of backlinks from this domain
* for example, if mode is set to one_per_domain, this field will indicate the total number of backlinks coming from this domain
   * @return groupCount
   */
  @javax.annotation.Nullable
  public Long getGroupCount() {
    return groupCount;
  }

  public void setGroupCount(Long groupCount) {
    this.groupCount = groupCount;
  }


  public static final String SERIALIZED_NAME_IS_BROKEN = "is_broken";
  @SerializedName(SERIALIZED_NAME_IS_BROKEN)
  private Boolean isBroken;

  public BacklinksBacklinksLiveItem isBroken(Boolean isBroken) {
    this.isBroken = isBroken;
    return this;
  }

  /**
   * indicates whether the backlink is broken
* if true, the backlink is pointing to a page responding with a 4xx or 5xx status code
   * @return isBroken
   */
  @javax.annotation.Nullable
  public Boolean getIsBroken() {
    return isBroken;
  }

  public void setIsBroken(Boolean isBroken) {
    this.isBroken = isBroken;
  }


  public static final String SERIALIZED_NAME_URL_TO_STATUS_CODE = "url_to_status_code";
  @SerializedName(SERIALIZED_NAME_URL_TO_STATUS_CODE)
  private Integer urlToStatusCode;

  public BacklinksBacklinksLiveItem urlToStatusCode(Integer urlToStatusCode) {
    this.urlToStatusCode = urlToStatusCode;
    return this;
  }

  /**
   * status code of the referenced page
* if the value is null, our crawler hasn’t yet visited the webpage the link is pointing to
* example:
* 200
   * @return urlToStatusCode
   */
  @javax.annotation.Nullable
  public Integer getUrlToStatusCode() {
    return urlToStatusCode;
  }

  public void setUrlToStatusCode(Integer urlToStatusCode) {
    this.urlToStatusCode = urlToStatusCode;
  }


  public static final String SERIALIZED_NAME_URL_TO_SPAM_SCORE = "url_to_spam_score";
  @SerializedName(SERIALIZED_NAME_URL_TO_SPAM_SCORE)
  private Integer urlToSpamScore;

  public BacklinksBacklinksLiveItem urlToSpamScore(Integer urlToSpamScore) {
    this.urlToSpamScore = urlToSpamScore;
    return this;
  }

  /**
   * spam score of the referenced page
* if the value is null, our crawler hasn’t yet visited the webpage the link is pointing to;
* learn more about how the metric is calculated on this help center page
   * @return urlToSpamScore
   */
  @javax.annotation.Nullable
  public Integer getUrlToSpamScore() {
    return urlToSpamScore;
  }

  public void setUrlToSpamScore(Integer urlToSpamScore) {
    this.urlToSpamScore = urlToSpamScore;
  }


  public static final String SERIALIZED_NAME_URL_TO_REDIRECT_TARGET = "url_to_redirect_target";
  @SerializedName(SERIALIZED_NAME_URL_TO_REDIRECT_TARGET)
  private String urlToRedirectTarget;

  public BacklinksBacklinksLiveItem urlToRedirectTarget(String urlToRedirectTarget) {
    this.urlToRedirectTarget = urlToRedirectTarget;
    return this;
  }

  /**
   * target url of the redirect
* target page the redirect is pointing to
   * @return urlToRedirectTarget
   */
  @javax.annotation.Nullable
  public String getUrlToRedirectTarget() {
    return urlToRedirectTarget;
  }

  public void setUrlToRedirectTarget(String urlToRedirectTarget) {
    this.urlToRedirectTarget = urlToRedirectTarget;
  }


  public static final String SERIALIZED_NAME_RANKED_KEYWORDS_INFO = "ranked_keywords_info";
  @SerializedName(SERIALIZED_NAME_RANKED_KEYWORDS_INFO)
  private BacklinkRankedKeywordsInfo rankedKeywordsInfo;

  public BacklinksBacklinksLiveItem rankedKeywordsInfo(BacklinkRankedKeywordsInfo rankedKeywordsInfo) {
    this.rankedKeywordsInfo = rankedKeywordsInfo;
    return this;
  }

  /**
   * number of keywords for which the page is ranked in top search results
   * @return rankedKeywordsInfo
   */
  @javax.annotation.Nullable
  public BacklinkRankedKeywordsInfo getRankedKeywordsInfo() {
    return rankedKeywordsInfo;
  }

  public void setRankedKeywordsInfo(BacklinkRankedKeywordsInfo rankedKeywordsInfo) {
    this.rankedKeywordsInfo = rankedKeywordsInfo;
  }


  public static final String SERIALIZED_NAME_IS_INDIRECT_LINK = "is_indirect_link";
  @SerializedName(SERIALIZED_NAME_IS_INDIRECT_LINK)
  private Boolean isIndirectLink;

  public BacklinksBacklinksLiveItem isIndirectLink(Boolean isIndirectLink) {
    this.isIndirectLink = isIndirectLink;
    return this;
  }

  /**
   * indicates whether the backlink is an indirect link
* if true, the backlink is an indirect link pointing to a page that either redirects to url_to, or points to a canonical page
   * @return isIndirectLink
   */
  @javax.annotation.Nullable
  public Boolean getIsIndirectLink() {
    return isIndirectLink;
  }

  public void setIsIndirectLink(Boolean isIndirectLink) {
    this.isIndirectLink = isIndirectLink;
  }


  public static final String SERIALIZED_NAME_INDIRECT_LINK_PATH = "indirect_link_path";
  @SerializedName(SERIALIZED_NAME_INDIRECT_LINK_PATH)
  private List<BacklinksRedirectInfo> indirectLinkPath;

  public BacklinksBacklinksLiveItem indirectLinkPath(List<BacklinksRedirectInfo> indirectLinkPath) {
    this.indirectLinkPath = indirectLinkPath;
    return this;
  }

  /**
   * indirect link path
* indicates a URL or a sequence of URLs that lead to url_to
   * @return indirectLinkPath
   */
  @javax.annotation.Nullable
  public List<BacklinksRedirectInfo> getIndirectLinkPath() {
    return indirectLinkPath;
  }

  public void setIndirectLinkPath(List<BacklinksRedirectInfo> indirectLinkPath) {
    this.indirectLinkPath = indirectLinkPath;
  }



  public BacklinksBacklinksLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksBacklinksLiveItem putAdditionalProperty(String key, Object value) {
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


    
    BacklinksBacklinksLiveItem backlinksBacklinksLiveItem = (BacklinksBacklinksLiveItem) o;
    return

        Objects.equals(this.type, backlinksBacklinksLiveItem.type) &&
        Objects.equals(this.domainFrom, backlinksBacklinksLiveItem.domainFrom) &&
        Objects.equals(this.urlFrom, backlinksBacklinksLiveItem.urlFrom) &&
        Objects.equals(this.urlFromHttps, backlinksBacklinksLiveItem.urlFromHttps) &&
        Objects.equals(this.domainTo, backlinksBacklinksLiveItem.domainTo) &&
        Objects.equals(this.urlTo, backlinksBacklinksLiveItem.urlTo) &&
        Objects.equals(this.urlToHttps, backlinksBacklinksLiveItem.urlToHttps) &&
        Objects.equals(this.tldFrom, backlinksBacklinksLiveItem.tldFrom) &&
        Objects.equals(this.isNew, backlinksBacklinksLiveItem.isNew) &&
        Objects.equals(this.isLost, backlinksBacklinksLiveItem.isLost) &&
        Objects.equals(this.backlinkSpamScore, backlinksBacklinksLiveItem.backlinkSpamScore) &&
        Objects.equals(this.rank, backlinksBacklinksLiveItem.rank) &&
        Objects.equals(this.pageFromRank, backlinksBacklinksLiveItem.pageFromRank) &&
        Objects.equals(this.domainFromRank, backlinksBacklinksLiveItem.domainFromRank) &&
        Objects.equals(this.domainFromPlatformType, backlinksBacklinksLiveItem.domainFromPlatformType) &&
        Objects.equals(this.domainFromIsIp, backlinksBacklinksLiveItem.domainFromIsIp) &&
        Objects.equals(this.domainFromIp, backlinksBacklinksLiveItem.domainFromIp) &&
        Objects.equals(this.domainFromCountry, backlinksBacklinksLiveItem.domainFromCountry) &&
        Objects.equals(this.pageFromExternalLinks, backlinksBacklinksLiveItem.pageFromExternalLinks) &&
        Objects.equals(this.pageFromInternalLinks, backlinksBacklinksLiveItem.pageFromInternalLinks) &&
        Objects.equals(this.pageFromSize, backlinksBacklinksLiveItem.pageFromSize) &&
        Objects.equals(this.pageFromEncoding, backlinksBacklinksLiveItem.pageFromEncoding) &&
        Objects.equals(this.pageFromLanguage, backlinksBacklinksLiveItem.pageFromLanguage) &&
        Objects.equals(this.pageFromTitle, backlinksBacklinksLiveItem.pageFromTitle) &&
        Objects.equals(this.pageFromStatusCode, backlinksBacklinksLiveItem.pageFromStatusCode) &&
        Objects.equals(this.firstSeen, backlinksBacklinksLiveItem.firstSeen) &&
        Objects.equals(this.prevSeen, backlinksBacklinksLiveItem.prevSeen) &&
        Objects.equals(this.lastSeen, backlinksBacklinksLiveItem.lastSeen) &&
        Objects.equals(this.itemType, backlinksBacklinksLiveItem.itemType) &&
        Objects.equals(this.attributes, backlinksBacklinksLiveItem.attributes) &&
        Objects.equals(this.dofollow, backlinksBacklinksLiveItem.dofollow) &&
        Objects.equals(this.original, backlinksBacklinksLiveItem.original) &&
        Objects.equals(this.alt, backlinksBacklinksLiveItem.alt) &&
        Objects.equals(this.imageUrl, backlinksBacklinksLiveItem.imageUrl) &&
        Objects.equals(this.anchor, backlinksBacklinksLiveItem.anchor) &&
        Objects.equals(this.textPre, backlinksBacklinksLiveItem.textPre) &&
        Objects.equals(this.textPost, backlinksBacklinksLiveItem.textPost) &&
        Objects.equals(this.semanticLocation, backlinksBacklinksLiveItem.semanticLocation) &&
        Objects.equals(this.linksCount, backlinksBacklinksLiveItem.linksCount) &&
        Objects.equals(this.groupCount, backlinksBacklinksLiveItem.groupCount) &&
        Objects.equals(this.isBroken, backlinksBacklinksLiveItem.isBroken) &&
        Objects.equals(this.urlToStatusCode, backlinksBacklinksLiveItem.urlToStatusCode) &&
        Objects.equals(this.urlToSpamScore, backlinksBacklinksLiveItem.urlToSpamScore) &&
        Objects.equals(this.urlToRedirectTarget, backlinksBacklinksLiveItem.urlToRedirectTarget) &&
        Objects.equals(this.rankedKeywordsInfo, backlinksBacklinksLiveItem.rankedKeywordsInfo) &&
        Objects.equals(this.isIndirectLink, backlinksBacklinksLiveItem.isIndirectLink) &&
        Objects.equals(this.indirectLinkPath, backlinksBacklinksLiveItem.indirectLinkPath);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, domainFrom, urlFrom, urlFromHttps, domainTo, urlTo, urlToHttps, tldFrom, isNew, isLost, backlinkSpamScore, rank, pageFromRank, domainFromRank, domainFromPlatformType, domainFromIsIp, domainFromIp, domainFromCountry, pageFromExternalLinks, pageFromInternalLinks, pageFromSize, pageFromEncoding, pageFromLanguage, pageFromTitle, pageFromStatusCode, firstSeen, prevSeen, lastSeen, itemType, attributes, dofollow, original, alt, imageUrl, anchor, textPre, textPost, semanticLocation, linksCount, groupCount, isBroken, urlToStatusCode, urlToSpamScore, urlToRedirectTarget, rankedKeywordsInfo, isIndirectLink, indirectLinkPath);
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
    sb.append("class BacklinksBacklinksLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    domainFrom: ").append(toIndentedString(domainFrom)).append("\n");
    sb.append("    urlFrom: ").append(toIndentedString(urlFrom)).append("\n");
    sb.append("    urlFromHttps: ").append(toIndentedString(urlFromHttps)).append("\n");
    sb.append("    domainTo: ").append(toIndentedString(domainTo)).append("\n");
    sb.append("    urlTo: ").append(toIndentedString(urlTo)).append("\n");
    sb.append("    urlToHttps: ").append(toIndentedString(urlToHttps)).append("\n");
    sb.append("    tldFrom: ").append(toIndentedString(tldFrom)).append("\n");
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
    sb.append("    isLost: ").append(toIndentedString(isLost)).append("\n");
    sb.append("    backlinkSpamScore: ").append(toIndentedString(backlinkSpamScore)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    pageFromRank: ").append(toIndentedString(pageFromRank)).append("\n");
    sb.append("    domainFromRank: ").append(toIndentedString(domainFromRank)).append("\n");
    sb.append("    domainFromPlatformType: ").append(toIndentedString(domainFromPlatformType)).append("\n");
    sb.append("    domainFromIsIp: ").append(toIndentedString(domainFromIsIp)).append("\n");
    sb.append("    domainFromIp: ").append(toIndentedString(domainFromIp)).append("\n");
    sb.append("    domainFromCountry: ").append(toIndentedString(domainFromCountry)).append("\n");
    sb.append("    pageFromExternalLinks: ").append(toIndentedString(pageFromExternalLinks)).append("\n");
    sb.append("    pageFromInternalLinks: ").append(toIndentedString(pageFromInternalLinks)).append("\n");
    sb.append("    pageFromSize: ").append(toIndentedString(pageFromSize)).append("\n");
    sb.append("    pageFromEncoding: ").append(toIndentedString(pageFromEncoding)).append("\n");
    sb.append("    pageFromLanguage: ").append(toIndentedString(pageFromLanguage)).append("\n");
    sb.append("    pageFromTitle: ").append(toIndentedString(pageFromTitle)).append("\n");
    sb.append("    pageFromStatusCode: ").append(toIndentedString(pageFromStatusCode)).append("\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
    sb.append("    prevSeen: ").append(toIndentedString(prevSeen)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    dofollow: ").append(toIndentedString(dofollow)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    textPre: ").append(toIndentedString(textPre)).append("\n");
    sb.append("    textPost: ").append(toIndentedString(textPost)).append("\n");
    sb.append("    semanticLocation: ").append(toIndentedString(semanticLocation)).append("\n");
    sb.append("    linksCount: ").append(toIndentedString(linksCount)).append("\n");
    sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
    sb.append("    isBroken: ").append(toIndentedString(isBroken)).append("\n");
    sb.append("    urlToStatusCode: ").append(toIndentedString(urlToStatusCode)).append("\n");
    sb.append("    urlToSpamScore: ").append(toIndentedString(urlToSpamScore)).append("\n");
    sb.append("    urlToRedirectTarget: ").append(toIndentedString(urlToRedirectTarget)).append("\n");
    sb.append("    rankedKeywordsInfo: ").append(toIndentedString(rankedKeywordsInfo)).append("\n");
    sb.append("    isIndirectLink: ").append(toIndentedString(isIndirectLink)).append("\n");
    sb.append("    indirectLinkPath: ").append(toIndentedString(indirectLinkPath)).append("\n");
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
    
    openapiFields.add("domain_from");
    
    openapiFields.add("url_from");
    
    openapiFields.add("url_from_https");
    
    openapiFields.add("domain_to");
    
    openapiFields.add("url_to");
    
    openapiFields.add("url_to_https");
    
    openapiFields.add("tld_from");
    
    openapiFields.add("is_new");
    
    openapiFields.add("is_lost");
    
    openapiFields.add("backlink_spam_score");
    
    openapiFields.add("rank");
    
    openapiFields.add("page_from_rank");
    
    openapiFields.add("domain_from_rank");
    
    openapiFields.add("domain_from_platform_type");
    
    openapiFields.add("domain_from_is_ip");
    
    openapiFields.add("domain_from_ip");
    
    openapiFields.add("domain_from_country");
    
    openapiFields.add("page_from_external_links");
    
    openapiFields.add("page_from_internal_links");
    
    openapiFields.add("page_from_size");
    
    openapiFields.add("page_from_encoding");
    
    openapiFields.add("page_from_language");
    
    openapiFields.add("page_from_title");
    
    openapiFields.add("page_from_status_code");
    
    openapiFields.add("first_seen");
    
    openapiFields.add("prev_seen");
    
    openapiFields.add("last_seen");
    
    openapiFields.add("item_type");
    
    openapiFields.add("attributes");
    
    openapiFields.add("dofollow");
    
    openapiFields.add("original");
    
    openapiFields.add("alt");
    
    openapiFields.add("image_url");
    
    openapiFields.add("anchor");
    
    openapiFields.add("text_pre");
    
    openapiFields.add("text_post");
    
    openapiFields.add("semantic_location");
    
    openapiFields.add("links_count");
    
    openapiFields.add("group_count");
    
    openapiFields.add("is_broken");
    
    openapiFields.add("url_to_status_code");
    
    openapiFields.add("url_to_spam_score");
    
    openapiFields.add("url_to_redirect_target");
    
    openapiFields.add("ranked_keywords_info");
    
    openapiFields.add("is_indirect_link");
    
    openapiFields.add("indirect_link_path");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksBacklinksLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksBacklinksLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksBacklinksLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksBacklinksLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksBacklinksLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksBacklinksLiveItem>() {
           @Override
           public void write(JsonWriter out, BacklinksBacklinksLiveItem value) throws IOException {
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
           public BacklinksBacklinksLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksBacklinksLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksBacklinksLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksBacklinksLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
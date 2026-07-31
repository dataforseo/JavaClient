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


public class BacklinksPageIntersection  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BacklinksPageIntersection type(String type) {
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

  public BacklinksPageIntersection domainFrom(String domainFrom) {
    this.domainFrom = domainFrom;
    return this;
  }

  /**
   * <em>domain referring to the target domain or webpage</em>
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

  public BacklinksPageIntersection urlFrom(String urlFrom) {
    this.urlFrom = urlFrom;
    return this;
  }

  /**
   * <em>URL of the page where the backlink is found</em>
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

  public BacklinksPageIntersection urlFromHttps(Boolean urlFromHttps) {
    this.urlFromHttps = urlFromHttps;
    return this;
  }

  /**
   * <em>indicates whether the referring URL is secured with HTTPS</em><br>if <code>true</code>, the referring URL is secured with HTTPS
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

  public BacklinksPageIntersection domainTo(String domainTo) {
    this.domainTo = domainTo;
    return this;
  }

  /**
   * <em>domain the backlink is pointing to</em>
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

  public BacklinksPageIntersection urlTo(String urlTo) {
    this.urlTo = urlTo;
    return this;
  }

  /**
   * <em>URL the backlink is pointing to</em>
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

  public BacklinksPageIntersection urlToHttps(Boolean urlToHttps) {
    this.urlToHttps = urlToHttps;
    return this;
  }

  /**
   * <em>indicates if the URL the backlink is pointing to is secured with HTTPS</em><br>if <code>true</code>, the URL is secured with HTTPS
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

  public BacklinksPageIntersection tldFrom(String tldFrom) {
    this.tldFrom = tldFrom;
    return this;
  }

  /**
   * <em>top-level domain of the referring URL</em>
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

  public BacklinksPageIntersection isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

  /**
   * <em>indicates whether the backlink is new</em><br>if <code>true</code>, the backlink was found on the page last time our crawler visited it
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

  public BacklinksPageIntersection isLost(Boolean isLost) {
    this.isLost = isLost;
    return this;
  }

  /**
   * <em>indicates whether the backlink was removed</em><br>if <code>true</code>, the backlink or the entire page was removed
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

  public BacklinksPageIntersection backlinkSpamScore(Integer backlinkSpamScore) {
    this.backlinkSpamScore = backlinkSpamScore;
    return this;
  }

  /**
   * <em>spam score of the backlink</em><br>learn more about how the metric is calculated on <a href='https://dataforseo.com/help-center/what-is-spam-score-and-how-is-it-calculated' rel='noopener noreferrer' target='_blank'>this help center page</a>
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

  public BacklinksPageIntersection rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * <em>backlink rank</em><br><code>rank</code> is calculated based on the method for node ranking in a linked database - a principle used in the original Google PageRank algorithm<br>learn more about the metric and how it is calculated in <a href='https://dataforseo.com/help-center/what_is_rank_in_backlinks_api' rel='noopener noreferrer' target='_blank'>this help center article</a>
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

  public BacklinksPageIntersection pageFromRank(Integer pageFromRank) {
    this.pageFromRank = pageFromRank;
    return this;
  }

  /**
   * <em>page rank of the referring page</em><br><code>page_from_rank</code> is calculated based on the method for node ranking in a linked database - a principle used in the original Google PageRank algorithm<br>learn more about the metric and how it is calculated in <a href='https://dataforseo.com/help-center/what_is_rank_in_backlinks_api' rel='noopener noreferrer' target='_blank'>this help center article</a>
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

  public BacklinksPageIntersection domainFromRank(Integer domainFromRank) {
    this.domainFromRank = domainFromRank;
    return this;
  }

  /**
   * <em>domain rank of the referring domain</em><br>indicates the rank of the domain at the time our crawler last saw the backlink;<br><code>domain_from_rank</code> is calculated based on the method for node ranking in a linked database - a principle used in the original Google PageRank algorithm<br>learn more about the metric and how it is calculated in <a href='https://dataforseo.com/help-center/what_is_rank_in_backlinks_api' rel='noopener noreferrer' target='_blank'>this help center article</a>
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

  public BacklinksPageIntersection domainFromPlatformType(List<String> domainFromPlatformType) {
    this.domainFromPlatformType = domainFromPlatformType;
    return this;
  }

  /**
   * <em>platform types of the referring domain</em><p>possible values: <code>cms</code>, <code>blogs</code>, <code>ecommerce</code>, <code>message-boards</code>, <code>wikis</code>, <code>news</code>, <code>organization</code>
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

  public BacklinksPageIntersection domainFromIsIp(Boolean domainFromIsIp) {
    this.domainFromIsIp = domainFromIsIp;
    return this;
  }

  /**
   * <em>indicates if the domain is IP</em><br>if <code>true</code>, the domain functions as an IP address and does not have a domain name
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

  public BacklinksPageIntersection domainFromIp(String domainFromIp) {
    this.domainFromIp = domainFromIp;
    return this;
  }

  /**
   * <em>IP address of the referring domain</em>
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

  public BacklinksPageIntersection domainFromCountry(String domainFromCountry) {
    this.domainFromCountry = domainFromCountry;
    return this;
  }

  /**
   * <em>ISO country code of the referring domain</em>
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

  public BacklinksPageIntersection pageFromExternalLinks(Integer pageFromExternalLinks) {
    this.pageFromExternalLinks = pageFromExternalLinks;
    return this;
  }

  /**
   * <em>number of external links found on the referring page</em>
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

  public BacklinksPageIntersection pageFromInternalLinks(Integer pageFromInternalLinks) {
    this.pageFromInternalLinks = pageFromInternalLinks;
    return this;
  }

  /**
   * <em>number of internal links found on the referring page</em>
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

  public BacklinksPageIntersection pageFromSize(Integer pageFromSize) {
    this.pageFromSize = pageFromSize;
    return this;
  }

  /**
   * <em>size of the referring page, in bytes</em><br>example:<br><code>63357</code>
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

  public BacklinksPageIntersection pageFromEncoding(String pageFromEncoding) {
    this.pageFromEncoding = pageFromEncoding;
    return this;
  }

  /**
   * <em>character encoding of the referring page</em><br>example:<br><code>utf-8</code>
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

  public BacklinksPageIntersection pageFromLanguage(String pageFromLanguage) {
    this.pageFromLanguage = pageFromLanguage;
    return this;
  }

  /**
   * <em>language of the referring page</em><br>in ISO 639-1 format<br>example:<br><code>en</code>
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

  public BacklinksPageIntersection pageFromTitle(String pageFromTitle) {
    this.pageFromTitle = pageFromTitle;
    return this;
  }

  /**
   * <em>title of the referring page</em>
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

  public BacklinksPageIntersection pageFromStatusCode(Integer pageFromStatusCode) {
    this.pageFromStatusCode = pageFromStatusCode;
    return this;
  }

  /**
   * <em>HTTP status code returned by the referring page</em><br>example:<br><code>200</code>
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

  public BacklinksPageIntersection firstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

  /**
   * <em>date and time when our crawler found the backlink for the first time</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code>
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

  public BacklinksPageIntersection prevSeen(String prevSeen) {
    this.prevSeen = prevSeen;
    return this;
  }

  /**
   * <em>previous to the most recent date when our crawler visited the backlink</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code>
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

  public BacklinksPageIntersection lastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

  /**
   * <em>most recent date when our crawler visited the backlink</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code>2019-11-15 12:57:46 +00:00</code>
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

  public BacklinksPageIntersection itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * <em>link type</em><br>possible values:<br><code>anchor</code>, <code>image</code>, <code>link</code>, <code>meta</code>, <code>canonical</code>, <code>alternate</code>, <code>redirect</code>
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

  public BacklinksPageIntersection attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * <em>link attributes of the referring links</em><br>example:<br><code>nofollow</code>
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

  public BacklinksPageIntersection dofollow(Boolean dofollow) {
    this.dofollow = dofollow;
    return this;
  }

  /**
   * <em>indicates whether the backlink is dofollow</em><br>if <code>false</code>, the backlink is nofollow
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

  public BacklinksPageIntersection original(Boolean original) {
    this.original = original;
    return this;
  }

  /**
   * <em>indicates whether the backlink was present on the referring page when our crawler first visited it</em>
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

  public BacklinksPageIntersection alt(String alt) {
    this.alt = alt;
    return this;
  }

  /**
   * <em>alternative text of the image</em><br>this field will be <code>null</code> if backlink <code>type</code> is not image
   * @return alt
   */
  @javax.annotation.Nullable
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }


  public static final String SERIALIZED_NAME_ANCHOR = "anchor";
  @SerializedName(SERIALIZED_NAME_ANCHOR)
  private String anchor;

  public BacklinksPageIntersection anchor(String anchor) {
    this.anchor = anchor;
    return this;
  }

  /**
   * <em>anchor text of the backlink</em>
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

  public BacklinksPageIntersection textPre(String textPre) {
    this.textPre = textPre;
    return this;
  }

  /**
   * <em>text snippet before the anchor text</em>
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

  public BacklinksPageIntersection textPost(String textPost) {
    this.textPost = textPost;
    return this;
  }

  /**
   * <em>snippet after the anchor text</em>
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

  public BacklinksPageIntersection semanticLocation(String semanticLocation) {
    this.semanticLocation = semanticLocation;
    return this;
  }

  /**
   * <em>indicates semantic element in HTML where the backlink is found</em><br>you can get the full list of semantic elements <a href='https://www.w3schools.com/html/html5_semantic_elements.asp' target='_blank' rel='noopener noreferrer'>here</a><br>examples:<br><code>article</code>, <code>section</code>, <code>summary</code>
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

  public BacklinksPageIntersection linksCount(Long linksCount) {
    this.linksCount = linksCount;
    return this;
  }

  /**
   * <em>number of identical backlinks found on the referring page</em>
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

  public BacklinksPageIntersection groupCount(Long groupCount) {
    this.groupCount = groupCount;
    return this;
  }

  /**
   * <em>indicates total number of backlinks from this domain</em><br>for example, if <code>mode</code> is set to <code>one_per_domain</code>, this field will indicate the total number of backlinks coming from this domain
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

  public BacklinksPageIntersection isBroken(Boolean isBroken) {
    this.isBroken = isBroken;
    return this;
  }

  /**
   * <em>indicates whether the backlink is broken</em><br>if <code>true</code>, the backlink is pointing to a page responding with a 4xx or 5xx status code
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

  public BacklinksPageIntersection urlToStatusCode(Integer urlToStatusCode) {
    this.urlToStatusCode = urlToStatusCode;
    return this;
  }

  /**
   * <em>status code of the referenced page</em><br>if the value is <code>null</code>, our crawler hasn't yet visited the webpage the link is pointing to<br>example:<br><code>200</code>
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

  public BacklinksPageIntersection urlToSpamScore(Integer urlToSpamScore) {
    this.urlToSpamScore = urlToSpamScore;
    return this;
  }

  /**
   * <em>spam score of the referenced page</em><br>if the value is <code>null</code>, our crawler hasn't yet visited the webpage the link is pointing to<br>learn more about how the metric is calculated on <a href='https://dataforseo.com/help-center/what-is-spam-score-and-how-is-it-calculated' rel='noopener noreferrer' target='_blank'>this help center page</a>
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

  public BacklinksPageIntersection urlToRedirectTarget(String urlToRedirectTarget) {
    this.urlToRedirectTarget = urlToRedirectTarget;
    return this;
  }

  /**
   * <em>target url of the redirect</em><br>target page the redirect is pointing to
   * @return urlToRedirectTarget
   */
  @javax.annotation.Nullable
  public String getUrlToRedirectTarget() {
    return urlToRedirectTarget;
  }

  public void setUrlToRedirectTarget(String urlToRedirectTarget) {
    this.urlToRedirectTarget = urlToRedirectTarget;
  }


  public static final String SERIALIZED_NAME_IS_INDIRECT_LINK = "is_indirect_link";
  @SerializedName(SERIALIZED_NAME_IS_INDIRECT_LINK)
  private Boolean isIndirectLink;

  public BacklinksPageIntersection isIndirectLink(Boolean isIndirectLink) {
    this.isIndirectLink = isIndirectLink;
    return this;
  }

  /**
   * <em>indicates whether the backlink is an indirect link</em><br>if <code>true</code>, the backlink is an indirect link pointing to a page that either redirects to <code>url_to</code>, or points to a canonical page
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

  public BacklinksPageIntersection indirectLinkPath(List<BacklinksRedirectInfo> indirectLinkPath) {
    this.indirectLinkPath = indirectLinkPath;
    return this;
  }

  /**
   * <em>indirect link path</em><br>indicates a URL or a sequence of URLs that lead to <code>url_to</code>
   * @return indirectLinkPath
   */
  @javax.annotation.Nullable
  public List<BacklinksRedirectInfo> getIndirectLinkPath() {
    return indirectLinkPath;
  }

  public void setIndirectLinkPath(List<BacklinksRedirectInfo> indirectLinkPath) {
    this.indirectLinkPath = indirectLinkPath;
  }



  public BacklinksPageIntersection() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksPageIntersection putAdditionalProperty(String key, Object value) {
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


    
    BacklinksPageIntersection backlinksPageIntersection = (BacklinksPageIntersection) o;
    return

        Objects.equals(this.type, backlinksPageIntersection.type) &&
        Objects.equals(this.domainFrom, backlinksPageIntersection.domainFrom) &&
        Objects.equals(this.urlFrom, backlinksPageIntersection.urlFrom) &&
        Objects.equals(this.urlFromHttps, backlinksPageIntersection.urlFromHttps) &&
        Objects.equals(this.domainTo, backlinksPageIntersection.domainTo) &&
        Objects.equals(this.urlTo, backlinksPageIntersection.urlTo) &&
        Objects.equals(this.urlToHttps, backlinksPageIntersection.urlToHttps) &&
        Objects.equals(this.tldFrom, backlinksPageIntersection.tldFrom) &&
        Objects.equals(this.isNew, backlinksPageIntersection.isNew) &&
        Objects.equals(this.isLost, backlinksPageIntersection.isLost) &&
        Objects.equals(this.backlinkSpamScore, backlinksPageIntersection.backlinkSpamScore) &&
        Objects.equals(this.rank, backlinksPageIntersection.rank) &&
        Objects.equals(this.pageFromRank, backlinksPageIntersection.pageFromRank) &&
        Objects.equals(this.domainFromRank, backlinksPageIntersection.domainFromRank) &&
        Objects.equals(this.domainFromPlatformType, backlinksPageIntersection.domainFromPlatformType) &&
        Objects.equals(this.domainFromIsIp, backlinksPageIntersection.domainFromIsIp) &&
        Objects.equals(this.domainFromIp, backlinksPageIntersection.domainFromIp) &&
        Objects.equals(this.domainFromCountry, backlinksPageIntersection.domainFromCountry) &&
        Objects.equals(this.pageFromExternalLinks, backlinksPageIntersection.pageFromExternalLinks) &&
        Objects.equals(this.pageFromInternalLinks, backlinksPageIntersection.pageFromInternalLinks) &&
        Objects.equals(this.pageFromSize, backlinksPageIntersection.pageFromSize) &&
        Objects.equals(this.pageFromEncoding, backlinksPageIntersection.pageFromEncoding) &&
        Objects.equals(this.pageFromLanguage, backlinksPageIntersection.pageFromLanguage) &&
        Objects.equals(this.pageFromTitle, backlinksPageIntersection.pageFromTitle) &&
        Objects.equals(this.pageFromStatusCode, backlinksPageIntersection.pageFromStatusCode) &&
        Objects.equals(this.firstSeen, backlinksPageIntersection.firstSeen) &&
        Objects.equals(this.prevSeen, backlinksPageIntersection.prevSeen) &&
        Objects.equals(this.lastSeen, backlinksPageIntersection.lastSeen) &&
        Objects.equals(this.itemType, backlinksPageIntersection.itemType) &&
        Objects.equals(this.attributes, backlinksPageIntersection.attributes) &&
        Objects.equals(this.dofollow, backlinksPageIntersection.dofollow) &&
        Objects.equals(this.original, backlinksPageIntersection.original) &&
        Objects.equals(this.alt, backlinksPageIntersection.alt) &&
        Objects.equals(this.anchor, backlinksPageIntersection.anchor) &&
        Objects.equals(this.textPre, backlinksPageIntersection.textPre) &&
        Objects.equals(this.textPost, backlinksPageIntersection.textPost) &&
        Objects.equals(this.semanticLocation, backlinksPageIntersection.semanticLocation) &&
        Objects.equals(this.linksCount, backlinksPageIntersection.linksCount) &&
        Objects.equals(this.groupCount, backlinksPageIntersection.groupCount) &&
        Objects.equals(this.isBroken, backlinksPageIntersection.isBroken) &&
        Objects.equals(this.urlToStatusCode, backlinksPageIntersection.urlToStatusCode) &&
        Objects.equals(this.urlToSpamScore, backlinksPageIntersection.urlToSpamScore) &&
        Objects.equals(this.urlToRedirectTarget, backlinksPageIntersection.urlToRedirectTarget) &&
        Objects.equals(this.isIndirectLink, backlinksPageIntersection.isIndirectLink) &&
        Objects.equals(this.indirectLinkPath, backlinksPageIntersection.indirectLinkPath);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, domainFrom, urlFrom, urlFromHttps, domainTo, urlTo, urlToHttps, tldFrom, isNew, isLost, backlinkSpamScore, rank, pageFromRank, domainFromRank, domainFromPlatformType, domainFromIsIp, domainFromIp, domainFromCountry, pageFromExternalLinks, pageFromInternalLinks, pageFromSize, pageFromEncoding, pageFromLanguage, pageFromTitle, pageFromStatusCode, firstSeen, prevSeen, lastSeen, itemType, attributes, dofollow, original, alt, anchor, textPre, textPost, semanticLocation, linksCount, groupCount, isBroken, urlToStatusCode, urlToSpamScore, urlToRedirectTarget, isIndirectLink, indirectLinkPath);
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
    sb.append("class BacklinksPageIntersection {\n");

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
    
    openapiFields.add("is_indirect_link");
    
    openapiFields.add("indirect_link_path");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksPageIntersection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksPageIntersection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksPageIntersection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksPageIntersection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksPageIntersection.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksPageIntersection>() {
           @Override
           public void write(JsonWriter out, BacklinksPageIntersection value) throws IOException {
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
           public BacklinksPageIntersection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksPageIntersection instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksPageIntersection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksPageIntersection.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
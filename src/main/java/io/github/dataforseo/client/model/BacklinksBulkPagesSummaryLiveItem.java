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



public class BacklinksBulkPagesSummaryLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BacklinksBulkPagesSummaryLiveItem type(String type) {
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

  public BacklinksBulkPagesSummaryLiveItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * page URL
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public BacklinksBulkPagesSummaryLiveItem rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * page rank
* rank of the page on the target website
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


  public static final String SERIALIZED_NAME_MAIN_DOMAIN_RANK = "main_domain_rank";
  @SerializedName(SERIALIZED_NAME_MAIN_DOMAIN_RANK)
  private Integer mainDomainRank;

  public BacklinksBulkPagesSummaryLiveItem mainDomainRank(Integer mainDomainRank) {
    this.mainDomainRank = mainDomainRank;
    return this;
  }

  /**
   * rank of the main domain
* rank of the main domain is calculated based on the method for node ranking in a linked database – a principle used in the original Google PageRank algorithm
* learn more about the metric and how it is calculated in this help center article
   * @return mainDomainRank
   */
  @javax.annotation.Nullable
  public Integer getMainDomainRank() {
    return mainDomainRank;
  }

  public void setMainDomainRank(Integer mainDomainRank) {
    this.mainDomainRank = mainDomainRank;
  }


  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private Long backlinks;

  public BacklinksBulkPagesSummaryLiveItem backlinks(Long backlinks) {
    this.backlinks = backlinks;
    return this;
  }

  /**
   * number of backlinks
   * @return backlinks
   */
  @javax.annotation.Nullable
  public Long getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(Long backlinks) {
    this.backlinks = backlinks;
  }


  public static final String SERIALIZED_NAME_FIRST_SEEN = "first_seen";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN)
  private String firstSeen;

  public BacklinksBulkPagesSummaryLiveItem firstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

  /**
   * date and time when our crawler found a backlink to this page for the first time
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


  public static final String SERIALIZED_NAME_LOST_DATE = "lost_date";
  @SerializedName(SERIALIZED_NAME_LOST_DATE)
  private String lostDate;

  public BacklinksBulkPagesSummaryLiveItem lostDate(String lostDate) {
    this.lostDate = lostDate;
    return this;
  }

  /**
   * date and time when the last backlink to this page was lost
* indicates the date and time when our crawler visited the page and it responded with 4xx or 5xx status code or the last backlink was removed
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2017-01-24 13:20:59 +00:00
   * @return lostDate
   */
  @javax.annotation.Nullable
  public String getLostDate() {
    return lostDate;
  }

  public void setLostDate(String lostDate) {
    this.lostDate = lostDate;
  }


  public static final String SERIALIZED_NAME_BACKLINKS_SPAM_SCORE = "backlinks_spam_score";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_SPAM_SCORE)
  private Long backlinksSpamScore;

  public BacklinksBulkPagesSummaryLiveItem backlinksSpamScore(Long backlinksSpamScore) {
    this.backlinksSpamScore = backlinksSpamScore;
    return this;
  }

  /**
   * average spam score of the backlinks pointing to the page
* learn more about how the metric is calculated on this help center page
   * @return backlinksSpamScore
   */
  @javax.annotation.Nullable
  public Long getBacklinksSpamScore() {
    return backlinksSpamScore;
  }

  public void setBacklinksSpamScore(Long backlinksSpamScore) {
    this.backlinksSpamScore = backlinksSpamScore;
  }


  public static final String SERIALIZED_NAME_BROKEN_BACKLINKS = "broken_backlinks";
  @SerializedName(SERIALIZED_NAME_BROKEN_BACKLINKS)
  private Long brokenBacklinks;

  public BacklinksBulkPagesSummaryLiveItem brokenBacklinks(Long brokenBacklinks) {
    this.brokenBacklinks = brokenBacklinks;
    return this;
  }

  /**
   * number of broken backlinks
* number of broken backlinks pointing to the page
   * @return brokenBacklinks
   */
  @javax.annotation.Nullable
  public Long getBrokenBacklinks() {
    return brokenBacklinks;
  }

  public void setBrokenBacklinks(Long brokenBacklinks) {
    this.brokenBacklinks = brokenBacklinks;
  }


  public static final String SERIALIZED_NAME_BROKEN_PAGES = "broken_pages";
  @SerializedName(SERIALIZED_NAME_BROKEN_PAGES)
  private Integer brokenPages;

  public BacklinksBulkPagesSummaryLiveItem brokenPages(Integer brokenPages) {
    this.brokenPages = brokenPages;
    return this;
  }

  /**
   * number of broken pages
* number of pages that respond with 4xx or 5xx status codes where backlinks are pointing to
   * @return brokenPages
   */
  @javax.annotation.Nullable
  public Integer getBrokenPages() {
    return brokenPages;
  }

  public void setBrokenPages(Integer brokenPages) {
    this.brokenPages = brokenPages;
  }


  public static final String SERIALIZED_NAME_REFERRING_DOMAINS = "referring_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS)
  private Long referringDomains;

  public BacklinksBulkPagesSummaryLiveItem referringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
    return this;
  }

  /**
   * indicates the number domains referring to the page
   * @return referringDomains
   */
  @javax.annotation.Nullable
  public Long getReferringDomains() {
    return referringDomains;
  }

  public void setReferringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
  }


  public static final String SERIALIZED_NAME_REFERRING_DOMAINS_NOFOLLOW = "referring_domains_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS_NOFOLLOW)
  private Long referringDomainsNofollow;

  public BacklinksBulkPagesSummaryLiveItem referringDomainsNofollow(Long referringDomainsNofollow) {
    this.referringDomainsNofollow = referringDomainsNofollow;
    return this;
  }

  /**
   * number of domains pointing at least one nofollow link to the target
   * @return referringDomainsNofollow
   */
  @javax.annotation.Nullable
  public Long getReferringDomainsNofollow() {
    return referringDomainsNofollow;
  }

  public void setReferringDomainsNofollow(Long referringDomainsNofollow) {
    this.referringDomainsNofollow = referringDomainsNofollow;
  }


  public static final String SERIALIZED_NAME_REFERRING_MAIN_DOMAINS = "referring_main_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_MAIN_DOMAINS)
  private Long referringMainDomains;

  public BacklinksBulkPagesSummaryLiveItem referringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
    return this;
  }

  /**
   * indicates the number of referring main domains
   * @return referringMainDomains
   */
  @javax.annotation.Nullable
  public Long getReferringMainDomains() {
    return referringMainDomains;
  }

  public void setReferringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
  }


  public static final String SERIALIZED_NAME_REFERRING_MAIN_DOMAINS_NOFOLLOW = "referring_main_domains_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_MAIN_DOMAINS_NOFOLLOW)
  private Long referringMainDomainsNofollow;

  public BacklinksBulkPagesSummaryLiveItem referringMainDomainsNofollow(Long referringMainDomainsNofollow) {
    this.referringMainDomainsNofollow = referringMainDomainsNofollow;
    return this;
  }

  /**
   * 
   * @return referringMainDomainsNofollow
   */
  @javax.annotation.Nullable
  public Long getReferringMainDomainsNofollow() {
    return referringMainDomainsNofollow;
  }

  public void setReferringMainDomainsNofollow(Long referringMainDomainsNofollow) {
    this.referringMainDomainsNofollow = referringMainDomainsNofollow;
  }


  public static final String SERIALIZED_NAME_REFERRING_IPS = "referring_ips";
  @SerializedName(SERIALIZED_NAME_REFERRING_IPS)
  private Long referringIps;

  public BacklinksBulkPagesSummaryLiveItem referringIps(Long referringIps) {
    this.referringIps = referringIps;
    return this;
  }

  /**
   * number of referring IP addresses
* number of IP addresses pointing to this page
   * @return referringIps
   */
  @javax.annotation.Nullable
  public Long getReferringIps() {
    return referringIps;
  }

  public void setReferringIps(Long referringIps) {
    this.referringIps = referringIps;
  }


  public static final String SERIALIZED_NAME_REFERRING_SUBNETS = "referring_subnets";
  @SerializedName(SERIALIZED_NAME_REFERRING_SUBNETS)
  private Long referringSubnets;

  public BacklinksBulkPagesSummaryLiveItem referringSubnets(Long referringSubnets) {
    this.referringSubnets = referringSubnets;
    return this;
  }

  /**
   * number of referring subnetworks
   * @return referringSubnets
   */
  @javax.annotation.Nullable
  public Long getReferringSubnets() {
    return referringSubnets;
  }

  public void setReferringSubnets(Long referringSubnets) {
    this.referringSubnets = referringSubnets;
  }


  public static final String SERIALIZED_NAME_REFERRING_PAGES = "referring_pages";
  @SerializedName(SERIALIZED_NAME_REFERRING_PAGES)
  private Long referringPages;

  public BacklinksBulkPagesSummaryLiveItem referringPages(Long referringPages) {
    this.referringPages = referringPages;
    return this;
  }

  /**
   * indicates the number of pages pointing to the relevant url
   * @return referringPages
   */
  @javax.annotation.Nullable
  public Long getReferringPages() {
    return referringPages;
  }

  public void setReferringPages(Long referringPages) {
    this.referringPages = referringPages;
  }


  public static final String SERIALIZED_NAME_REFERRING_PAGES_NOFOLLOW = "referring_pages_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_PAGES_NOFOLLOW)
  private Long referringPagesNofollow;

  public BacklinksBulkPagesSummaryLiveItem referringPagesNofollow(Long referringPagesNofollow) {
    this.referringPagesNofollow = referringPagesNofollow;
    return this;
  }

  /**
   * number of referring pages pointing at least one nofollow link to the target
   * @return referringPagesNofollow
   */
  @javax.annotation.Nullable
  public Long getReferringPagesNofollow() {
    return referringPagesNofollow;
  }

  public void setReferringPagesNofollow(Long referringPagesNofollow) {
    this.referringPagesNofollow = referringPagesNofollow;
  }


  public static final String SERIALIZED_NAME_REFERRING_LINKS_TLD = "referring_links_tld";
  @SerializedName(SERIALIZED_NAME_REFERRING_LINKS_TLD)
  private Map<String, Long> referringLinksTld;

  public BacklinksBulkPagesSummaryLiveItem referringLinksTld(Map<String, Long> referringLinksTld) {
    this.referringLinksTld = referringLinksTld;
    return this;
  }

  /**
   * top-level domains of the referring links
* contains top level domains and referring link count per each
   * @return referringLinksTld
   */
  @javax.annotation.Nullable
  public Map<String, Long> getReferringLinksTld() {
    return referringLinksTld;
  }

  public void setReferringLinksTld(Map<String, Long> referringLinksTld) {
    this.referringLinksTld = referringLinksTld;
  }


  public static final String SERIALIZED_NAME_REFERRING_LINKS_TYPES = "referring_links_types";
  @SerializedName(SERIALIZED_NAME_REFERRING_LINKS_TYPES)
  private Map<String, Long> referringLinksTypes;

  public BacklinksBulkPagesSummaryLiveItem referringLinksTypes(Map<String, Long> referringLinksTypes) {
    this.referringLinksTypes = referringLinksTypes;
    return this;
  }

  /**
   * types of referring links
* indicates the types of the referring links and link count per each type
* possible values:
* anchor, image, link, meta, canonical, alternate, redirect
   * @return referringLinksTypes
   */
  @javax.annotation.Nullable
  public Map<String, Long> getReferringLinksTypes() {
    return referringLinksTypes;
  }

  public void setReferringLinksTypes(Map<String, Long> referringLinksTypes) {
    this.referringLinksTypes = referringLinksTypes;
  }


  public static final String SERIALIZED_NAME_REFERRING_LINKS_ATTRIBUTES = "referring_links_attributes";
  @SerializedName(SERIALIZED_NAME_REFERRING_LINKS_ATTRIBUTES)
  private Map<String, Long> referringLinksAttributes;

  public BacklinksBulkPagesSummaryLiveItem referringLinksAttributes(Map<String, Long> referringLinksAttributes) {
    this.referringLinksAttributes = referringLinksAttributes;
    return this;
  }

  /**
   * link attributes of the referring links
* indicates link attributes of the referring links and link count per each attribute
   * @return referringLinksAttributes
   */
  @javax.annotation.Nullable
  public Map<String, Long> getReferringLinksAttributes() {
    return referringLinksAttributes;
  }

  public void setReferringLinksAttributes(Map<String, Long> referringLinksAttributes) {
    this.referringLinksAttributes = referringLinksAttributes;
  }


  public static final String SERIALIZED_NAME_REFERRING_LINKS_PLATFORM_TYPES = "referring_links_platform_types";
  @SerializedName(SERIALIZED_NAME_REFERRING_LINKS_PLATFORM_TYPES)
  private Map<String, Long> referringLinksPlatformTypes;

  public BacklinksBulkPagesSummaryLiveItem referringLinksPlatformTypes(Map<String, Long> referringLinksPlatformTypes) {
    this.referringLinksPlatformTypes = referringLinksPlatformTypes;
    return this;
  }

  /**
   * types of referring platforms
* indicates referring platform types and and link count per each platform
* possible values: cms, blogs, ecommerce, message-boards, wikis, news, organization
   * @return referringLinksPlatformTypes
   */
  @javax.annotation.Nullable
  public Map<String, Long> getReferringLinksPlatformTypes() {
    return referringLinksPlatformTypes;
  }

  public void setReferringLinksPlatformTypes(Map<String, Long> referringLinksPlatformTypes) {
    this.referringLinksPlatformTypes = referringLinksPlatformTypes;
  }


  public static final String SERIALIZED_NAME_REFERRING_LINKS_SEMANTIC_LOCATIONS = "referring_links_semantic_locations";
  @SerializedName(SERIALIZED_NAME_REFERRING_LINKS_SEMANTIC_LOCATIONS)
  private Map<String, Long> referringLinksSemanticLocations;

  public BacklinksBulkPagesSummaryLiveItem referringLinksSemanticLocations(Map<String, Long> referringLinksSemanticLocations) {
    this.referringLinksSemanticLocations = referringLinksSemanticLocations;
    return this;
  }

  /**
   * semantic locations of the referring links
* indicates semantic elements in HTML where the referring links are located and link count per each semantic location
* you can get the full list of semantic elements here
* examples:
* article, section, footer
   * @return referringLinksSemanticLocations
   */
  @javax.annotation.Nullable
  public Map<String, Long> getReferringLinksSemanticLocations() {
    return referringLinksSemanticLocations;
  }

  public void setReferringLinksSemanticLocations(Map<String, Long> referringLinksSemanticLocations) {
    this.referringLinksSemanticLocations = referringLinksSemanticLocations;
  }


  public static final String SERIALIZED_NAME_REFERRING_LINKS_COUNTRIES = "referring_links_countries";
  @SerializedName(SERIALIZED_NAME_REFERRING_LINKS_COUNTRIES)
  private Map<String, Long> referringLinksCountries;

  public BacklinksBulkPagesSummaryLiveItem referringLinksCountries(Map<String, Long> referringLinksCountries) {
    this.referringLinksCountries = referringLinksCountries;
    return this;
  }

  /**
   * ISO country codes of the referring links
* indicates ISO country codes of the domains where the referring links are located and the link count per each country
   * @return referringLinksCountries
   */
  @javax.annotation.Nullable
  public Map<String, Long> getReferringLinksCountries() {
    return referringLinksCountries;
  }

  public void setReferringLinksCountries(Map<String, Long> referringLinksCountries) {
    this.referringLinksCountries = referringLinksCountries;
  }



  public BacklinksBulkPagesSummaryLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksBulkPagesSummaryLiveItem putAdditionalProperty(String key, Object value) {
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


    
    BacklinksBulkPagesSummaryLiveItem backlinksBulkPagesSummaryLiveItem = (BacklinksBulkPagesSummaryLiveItem) o;
    return

        Objects.equals(this.type, backlinksBulkPagesSummaryLiveItem.type) &&
        Objects.equals(this.url, backlinksBulkPagesSummaryLiveItem.url) &&
        Objects.equals(this.rank, backlinksBulkPagesSummaryLiveItem.rank) &&
        Objects.equals(this.mainDomainRank, backlinksBulkPagesSummaryLiveItem.mainDomainRank) &&
        Objects.equals(this.backlinks, backlinksBulkPagesSummaryLiveItem.backlinks) &&
        Objects.equals(this.firstSeen, backlinksBulkPagesSummaryLiveItem.firstSeen) &&
        Objects.equals(this.lostDate, backlinksBulkPagesSummaryLiveItem.lostDate) &&
        Objects.equals(this.backlinksSpamScore, backlinksBulkPagesSummaryLiveItem.backlinksSpamScore) &&
        Objects.equals(this.brokenBacklinks, backlinksBulkPagesSummaryLiveItem.brokenBacklinks) &&
        Objects.equals(this.brokenPages, backlinksBulkPagesSummaryLiveItem.brokenPages) &&
        Objects.equals(this.referringDomains, backlinksBulkPagesSummaryLiveItem.referringDomains) &&
        Objects.equals(this.referringDomainsNofollow, backlinksBulkPagesSummaryLiveItem.referringDomainsNofollow) &&
        Objects.equals(this.referringMainDomains, backlinksBulkPagesSummaryLiveItem.referringMainDomains) &&
        Objects.equals(this.referringMainDomainsNofollow, backlinksBulkPagesSummaryLiveItem.referringMainDomainsNofollow) &&
        Objects.equals(this.referringIps, backlinksBulkPagesSummaryLiveItem.referringIps) &&
        Objects.equals(this.referringSubnets, backlinksBulkPagesSummaryLiveItem.referringSubnets) &&
        Objects.equals(this.referringPages, backlinksBulkPagesSummaryLiveItem.referringPages) &&
        Objects.equals(this.referringPagesNofollow, backlinksBulkPagesSummaryLiveItem.referringPagesNofollow) &&
        Objects.equals(this.referringLinksTld, backlinksBulkPagesSummaryLiveItem.referringLinksTld) &&
        Objects.equals(this.referringLinksTypes, backlinksBulkPagesSummaryLiveItem.referringLinksTypes) &&
        Objects.equals(this.referringLinksAttributes, backlinksBulkPagesSummaryLiveItem.referringLinksAttributes) &&
        Objects.equals(this.referringLinksPlatformTypes, backlinksBulkPagesSummaryLiveItem.referringLinksPlatformTypes) &&
        Objects.equals(this.referringLinksSemanticLocations, backlinksBulkPagesSummaryLiveItem.referringLinksSemanticLocations) &&
        Objects.equals(this.referringLinksCountries, backlinksBulkPagesSummaryLiveItem.referringLinksCountries);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, url, rank, mainDomainRank, backlinks, firstSeen, lostDate, backlinksSpamScore, brokenBacklinks, brokenPages, referringDomains, referringDomainsNofollow, referringMainDomains, referringMainDomainsNofollow, referringIps, referringSubnets, referringPages, referringPagesNofollow, referringLinksTld, referringLinksTypes, referringLinksAttributes, referringLinksPlatformTypes, referringLinksSemanticLocations, referringLinksCountries);
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
    sb.append("class BacklinksBulkPagesSummaryLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    mainDomainRank: ").append(toIndentedString(mainDomainRank)).append("\n");
    sb.append("    backlinks: ").append(toIndentedString(backlinks)).append("\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
    sb.append("    lostDate: ").append(toIndentedString(lostDate)).append("\n");
    sb.append("    backlinksSpamScore: ").append(toIndentedString(backlinksSpamScore)).append("\n");
    sb.append("    brokenBacklinks: ").append(toIndentedString(brokenBacklinks)).append("\n");
    sb.append("    brokenPages: ").append(toIndentedString(brokenPages)).append("\n");
    sb.append("    referringDomains: ").append(toIndentedString(referringDomains)).append("\n");
    sb.append("    referringDomainsNofollow: ").append(toIndentedString(referringDomainsNofollow)).append("\n");
    sb.append("    referringMainDomains: ").append(toIndentedString(referringMainDomains)).append("\n");
    sb.append("    referringMainDomainsNofollow: ").append(toIndentedString(referringMainDomainsNofollow)).append("\n");
    sb.append("    referringIps: ").append(toIndentedString(referringIps)).append("\n");
    sb.append("    referringSubnets: ").append(toIndentedString(referringSubnets)).append("\n");
    sb.append("    referringPages: ").append(toIndentedString(referringPages)).append("\n");
    sb.append("    referringPagesNofollow: ").append(toIndentedString(referringPagesNofollow)).append("\n");
    sb.append("    referringLinksTld: ").append(toIndentedString(referringLinksTld)).append("\n");
    sb.append("    referringLinksTypes: ").append(toIndentedString(referringLinksTypes)).append("\n");
    sb.append("    referringLinksAttributes: ").append(toIndentedString(referringLinksAttributes)).append("\n");
    sb.append("    referringLinksPlatformTypes: ").append(toIndentedString(referringLinksPlatformTypes)).append("\n");
    sb.append("    referringLinksSemanticLocations: ").append(toIndentedString(referringLinksSemanticLocations)).append("\n");
    sb.append("    referringLinksCountries: ").append(toIndentedString(referringLinksCountries)).append("\n");
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
    
    openapiFields.add("rank");
    
    openapiFields.add("main_domain_rank");
    
    openapiFields.add("backlinks");
    
    openapiFields.add("first_seen");
    
    openapiFields.add("lost_date");
    
    openapiFields.add("backlinks_spam_score");
    
    openapiFields.add("broken_backlinks");
    
    openapiFields.add("broken_pages");
    
    openapiFields.add("referring_domains");
    
    openapiFields.add("referring_domains_nofollow");
    
    openapiFields.add("referring_main_domains");
    
    openapiFields.add("referring_main_domains_nofollow");
    
    openapiFields.add("referring_ips");
    
    openapiFields.add("referring_subnets");
    
    openapiFields.add("referring_pages");
    
    openapiFields.add("referring_pages_nofollow");
    
    openapiFields.add("referring_links_tld");
    
    openapiFields.add("referring_links_types");
    
    openapiFields.add("referring_links_attributes");
    
    openapiFields.add("referring_links_platform_types");
    
    openapiFields.add("referring_links_semantic_locations");
    
    openapiFields.add("referring_links_countries");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksBulkPagesSummaryLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksBulkPagesSummaryLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksBulkPagesSummaryLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksBulkPagesSummaryLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksBulkPagesSummaryLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksBulkPagesSummaryLiveItem>() {
           @Override
           public void write(JsonWriter out, BacklinksBulkPagesSummaryLiveItem value) throws IOException {
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
           public BacklinksBulkPagesSummaryLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksBulkPagesSummaryLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksBulkPagesSummaryLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksBulkPagesSummaryLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
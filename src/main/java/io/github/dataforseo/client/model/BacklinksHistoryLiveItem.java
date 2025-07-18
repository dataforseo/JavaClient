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



public class BacklinksHistoryLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BacklinksHistoryLiveItem type(String type) {
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


  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public BacklinksHistoryLiveItem date(String date) {
    this.date = date;
    return this;
  }

  /**
   * date and time when the data for the target was stored
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public BacklinksHistoryLiveItem rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * domain rank on the given date
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


  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private Long backlinks;

  public BacklinksHistoryLiveItem backlinks(Long backlinks) {
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


  public static final String SERIALIZED_NAME_NEW_BACKLINKS = "new_backlinks";
  @SerializedName(SERIALIZED_NAME_NEW_BACKLINKS)
  private Long newBacklinks;

  public BacklinksHistoryLiveItem newBacklinks(Long newBacklinks) {
    this.newBacklinks = newBacklinks;
    return this;
  }

  /**
   * number of new backlinks for the target
* data is provided based in a comparison with the previous period
* Note: this data is available from May 2021;
* if the date range specified in the POST request precedes May 2021, the field will equal 0
   * @return newBacklinks
   */
  @javax.annotation.Nullable
  public Long getNewBacklinks() {
    return newBacklinks;
  }

  public void setNewBacklinks(Long newBacklinks) {
    this.newBacklinks = newBacklinks;
  }


  public static final String SERIALIZED_NAME_LOST_BACKLINKS = "lost_backlinks";
  @SerializedName(SERIALIZED_NAME_LOST_BACKLINKS)
  private Long lostBacklinks;

  public BacklinksHistoryLiveItem lostBacklinks(Long lostBacklinks) {
    this.lostBacklinks = lostBacklinks;
    return this;
  }

  /**
   * number of lost backlinks for the target
* data is provided based in a comparison with the previous period
* Note: this data is available from May 2021;
* if the date range specified in the POST request precedes May 2021, the field will equal 0
   * @return lostBacklinks
   */
  @javax.annotation.Nullable
  public Long getLostBacklinks() {
    return lostBacklinks;
  }

  public void setLostBacklinks(Long lostBacklinks) {
    this.lostBacklinks = lostBacklinks;
  }


  public static final String SERIALIZED_NAME_NEW_REFERRING_DOMAINS = "new_referring_domains";
  @SerializedName(SERIALIZED_NAME_NEW_REFERRING_DOMAINS)
  private Long newReferringDomains;

  public BacklinksHistoryLiveItem newReferringDomains(Long newReferringDomains) {
    this.newReferringDomains = newReferringDomains;
    return this;
  }

  /**
   * number of new referring domains for the target
* data is provided based in a comparison with the previous period
* Note: this data is available from May 2021;
* if the date range specified in the POST request precedes May 2021, the field will equal 0
   * @return newReferringDomains
   */
  @javax.annotation.Nullable
  public Long getNewReferringDomains() {
    return newReferringDomains;
  }

  public void setNewReferringDomains(Long newReferringDomains) {
    this.newReferringDomains = newReferringDomains;
  }


  public static final String SERIALIZED_NAME_LOST_REFERRING_DOMAINS = "lost_referring_domains";
  @SerializedName(SERIALIZED_NAME_LOST_REFERRING_DOMAINS)
  private Long lostReferringDomains;

  public BacklinksHistoryLiveItem lostReferringDomains(Long lostReferringDomains) {
    this.lostReferringDomains = lostReferringDomains;
    return this;
  }

  /**
   * number of lost referring domains for the target
* data is provided based in a comparison with the previous period
* Note: this data is available from May 2021;
* if the date range specified in the POST request precedes May 2021, the field will equal 0
   * @return lostReferringDomains
   */
  @javax.annotation.Nullable
  public Long getLostReferringDomains() {
    return lostReferringDomains;
  }

  public void setLostReferringDomains(Long lostReferringDomains) {
    this.lostReferringDomains = lostReferringDomains;
  }


  public static final String SERIALIZED_NAME_CRAWLED_PAGES = "crawled_pages";
  @SerializedName(SERIALIZED_NAME_CRAWLED_PAGES)
  private Integer crawledPages;

  public BacklinksHistoryLiveItem crawledPages(Integer crawledPages) {
    this.crawledPages = crawledPages;
    return this;
  }

  /**
   * number of crawled pages for the target
   * @return crawledPages
   */
  @javax.annotation.Nullable
  public Integer getCrawledPages() {
    return crawledPages;
  }

  public void setCrawledPages(Integer crawledPages) {
    this.crawledPages = crawledPages;
  }


  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private TargetInfo info;

  public BacklinksHistoryLiveItem info(TargetInfo info) {
    this.info = info;
    return this;
  }

  /**
   * information about the target
   * @return info
   */
  @javax.annotation.Nullable
  public TargetInfo getInfo() {
    return info;
  }

  public void setInfo(TargetInfo info) {
    this.info = info;
  }


  public static final String SERIALIZED_NAME_INTERNAL_LINKS_COUNT = "internal_links_count";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LINKS_COUNT)
  private Long internalLinksCount;

  public BacklinksHistoryLiveItem internalLinksCount(Long internalLinksCount) {
    this.internalLinksCount = internalLinksCount;
    return this;
  }

  /**
   * number of internal links
* calculated as the sum of internal links on the pages of the specified target
   * @return internalLinksCount
   */
  @javax.annotation.Nullable
  public Long getInternalLinksCount() {
    return internalLinksCount;
  }

  public void setInternalLinksCount(Long internalLinksCount) {
    this.internalLinksCount = internalLinksCount;
  }


  public static final String SERIALIZED_NAME_EXTERNAL_LINKS_COUNT = "external_links_count";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_LINKS_COUNT)
  private Long externalLinksCount;

  public BacklinksHistoryLiveItem externalLinksCount(Long externalLinksCount) {
    this.externalLinksCount = externalLinksCount;
    return this;
  }

  /**
   * number of external links on the page
* calculated as the sum of external links on the pages of the specified target
   * @return externalLinksCount
   */
  @javax.annotation.Nullable
  public Long getExternalLinksCount() {
    return externalLinksCount;
  }

  public void setExternalLinksCount(Long externalLinksCount) {
    this.externalLinksCount = externalLinksCount;
  }


  public static final String SERIALIZED_NAME_BROKEN_BACKLINKS = "broken_backlinks";
  @SerializedName(SERIALIZED_NAME_BROKEN_BACKLINKS)
  private Long brokenBacklinks;

  public BacklinksHistoryLiveItem brokenBacklinks(Long brokenBacklinks) {
    this.brokenBacklinks = brokenBacklinks;
    return this;
  }

  /**
   * number of broken backlinks
* number of broken backlinks pointing to the target
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

  public BacklinksHistoryLiveItem brokenPages(Integer brokenPages) {
    this.brokenPages = brokenPages;
    return this;
  }

  /**
   * number of broken pages
* number of pages that receive backlinks but respond with 4xx or 5xx status codes
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

  public BacklinksHistoryLiveItem referringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
    return this;
  }

  /**
   * number of referring domains
* referring domains include subdomains that are counted as separate domains for this metric
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

  public BacklinksHistoryLiveItem referringDomainsNofollow(Long referringDomainsNofollow) {
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

  public BacklinksHistoryLiveItem referringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
    return this;
  }

  /**
   * number of referring main domains
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

  public BacklinksHistoryLiveItem referringMainDomainsNofollow(Long referringMainDomainsNofollow) {
    this.referringMainDomainsNofollow = referringMainDomainsNofollow;
    return this;
  }

  /**
   * number of main domains pointing at least one nofollow link to the target
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

  public BacklinksHistoryLiveItem referringIps(Long referringIps) {
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

  public BacklinksHistoryLiveItem referringSubnets(Long referringSubnets) {
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

  public BacklinksHistoryLiveItem referringPages(Long referringPages) {
    this.referringPages = referringPages;
    return this;
  }

  /**
   * number of pages pointing to the target
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

  public BacklinksHistoryLiveItem referringPagesNofollow(Long referringPagesNofollow) {
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

  public BacklinksHistoryLiveItem referringLinksTld(Map<String, Long> referringLinksTld) {
    this.referringLinksTld = referringLinksTld;
    return this;
  }

  /**
   * top-level domains of the referring links
* contains top-level domains and referring link count per each
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

  public BacklinksHistoryLiveItem referringLinksTypes(Map<String, Long> referringLinksTypes) {
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

  public BacklinksHistoryLiveItem referringLinksAttributes(Map<String, Long> referringLinksAttributes) {
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

  public BacklinksHistoryLiveItem referringLinksPlatformTypes(Map<String, Long> referringLinksPlatformTypes) {
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

  public BacklinksHistoryLiveItem referringLinksSemanticLocations(Map<String, Long> referringLinksSemanticLocations) {
    this.referringLinksSemanticLocations = referringLinksSemanticLocations;
    return this;
  }

  /**
   * semantic locations of the referring links
* indicates semantic elements in HTML where the referring links are located and link count per each semantic location
* you can get the full list of semantic elements here
* examples:
* article, section, summary
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

  public BacklinksHistoryLiveItem referringLinksCountries(Map<String, Long> referringLinksCountries) {
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



  public BacklinksHistoryLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksHistoryLiveItem putAdditionalProperty(String key, Object value) {
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


    
    BacklinksHistoryLiveItem backlinksHistoryLiveItem = (BacklinksHistoryLiveItem) o;
    return

        Objects.equals(this.type, backlinksHistoryLiveItem.type) &&
        Objects.equals(this.date, backlinksHistoryLiveItem.date) &&
        Objects.equals(this.rank, backlinksHistoryLiveItem.rank) &&
        Objects.equals(this.backlinks, backlinksHistoryLiveItem.backlinks) &&
        Objects.equals(this.newBacklinks, backlinksHistoryLiveItem.newBacklinks) &&
        Objects.equals(this.lostBacklinks, backlinksHistoryLiveItem.lostBacklinks) &&
        Objects.equals(this.newReferringDomains, backlinksHistoryLiveItem.newReferringDomains) &&
        Objects.equals(this.lostReferringDomains, backlinksHistoryLiveItem.lostReferringDomains) &&
        Objects.equals(this.crawledPages, backlinksHistoryLiveItem.crawledPages) &&
        Objects.equals(this.info, backlinksHistoryLiveItem.info) &&
        Objects.equals(this.internalLinksCount, backlinksHistoryLiveItem.internalLinksCount) &&
        Objects.equals(this.externalLinksCount, backlinksHistoryLiveItem.externalLinksCount) &&
        Objects.equals(this.brokenBacklinks, backlinksHistoryLiveItem.brokenBacklinks) &&
        Objects.equals(this.brokenPages, backlinksHistoryLiveItem.brokenPages) &&
        Objects.equals(this.referringDomains, backlinksHistoryLiveItem.referringDomains) &&
        Objects.equals(this.referringDomainsNofollow, backlinksHistoryLiveItem.referringDomainsNofollow) &&
        Objects.equals(this.referringMainDomains, backlinksHistoryLiveItem.referringMainDomains) &&
        Objects.equals(this.referringMainDomainsNofollow, backlinksHistoryLiveItem.referringMainDomainsNofollow) &&
        Objects.equals(this.referringIps, backlinksHistoryLiveItem.referringIps) &&
        Objects.equals(this.referringSubnets, backlinksHistoryLiveItem.referringSubnets) &&
        Objects.equals(this.referringPages, backlinksHistoryLiveItem.referringPages) &&
        Objects.equals(this.referringPagesNofollow, backlinksHistoryLiveItem.referringPagesNofollow) &&
        Objects.equals(this.referringLinksTld, backlinksHistoryLiveItem.referringLinksTld) &&
        Objects.equals(this.referringLinksTypes, backlinksHistoryLiveItem.referringLinksTypes) &&
        Objects.equals(this.referringLinksAttributes, backlinksHistoryLiveItem.referringLinksAttributes) &&
        Objects.equals(this.referringLinksPlatformTypes, backlinksHistoryLiveItem.referringLinksPlatformTypes) &&
        Objects.equals(this.referringLinksSemanticLocations, backlinksHistoryLiveItem.referringLinksSemanticLocations) &&
        Objects.equals(this.referringLinksCountries, backlinksHistoryLiveItem.referringLinksCountries);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, date, rank, backlinks, newBacklinks, lostBacklinks, newReferringDomains, lostReferringDomains, crawledPages, info, internalLinksCount, externalLinksCount, brokenBacklinks, brokenPages, referringDomains, referringDomainsNofollow, referringMainDomains, referringMainDomainsNofollow, referringIps, referringSubnets, referringPages, referringPagesNofollow, referringLinksTld, referringLinksTypes, referringLinksAttributes, referringLinksPlatformTypes, referringLinksSemanticLocations, referringLinksCountries);
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
    sb.append("class BacklinksHistoryLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    backlinks: ").append(toIndentedString(backlinks)).append("\n");
    sb.append("    newBacklinks: ").append(toIndentedString(newBacklinks)).append("\n");
    sb.append("    lostBacklinks: ").append(toIndentedString(lostBacklinks)).append("\n");
    sb.append("    newReferringDomains: ").append(toIndentedString(newReferringDomains)).append("\n");
    sb.append("    lostReferringDomains: ").append(toIndentedString(lostReferringDomains)).append("\n");
    sb.append("    crawledPages: ").append(toIndentedString(crawledPages)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    internalLinksCount: ").append(toIndentedString(internalLinksCount)).append("\n");
    sb.append("    externalLinksCount: ").append(toIndentedString(externalLinksCount)).append("\n");
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
    
    openapiFields.add("date");
    
    openapiFields.add("rank");
    
    openapiFields.add("backlinks");
    
    openapiFields.add("new_backlinks");
    
    openapiFields.add("lost_backlinks");
    
    openapiFields.add("new_referring_domains");
    
    openapiFields.add("lost_referring_domains");
    
    openapiFields.add("crawled_pages");
    
    openapiFields.add("info");
    
    openapiFields.add("internal_links_count");
    
    openapiFields.add("external_links_count");
    
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
   * @throws IOException if the JSON Element is invalid with respect to BacklinksHistoryLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksHistoryLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksHistoryLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksHistoryLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksHistoryLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksHistoryLiveItem>() {
           @Override
           public void write(JsonWriter out, BacklinksHistoryLiveItem value) throws IOException {
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
           public BacklinksHistoryLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksHistoryLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksHistoryLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksHistoryLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
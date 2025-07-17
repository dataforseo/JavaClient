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



public class AppendixBacklinksPriceData  {


  public static final String SERIALIZED_NAME_ANCHORS = "anchors";
  @SerializedName(SERIALIZED_NAME_ANCHORS)
  private AppendixBingKeywordsDataPriceDataInfo anchors;

  public AppendixBacklinksPriceData anchors(AppendixBingKeywordsDataPriceDataInfo anchors) {
    this.anchors = anchors;
    return this;
  }

  /**
   * 
   * @return anchors
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getAnchors() {
    return anchors;
  }

  public void setAnchors(AppendixBingKeywordsDataPriceDataInfo anchors) {
    this.anchors = anchors;
  }


  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private AppendixBingKeywordsDataPriceDataInfo backlinks;

  public AppendixBacklinksPriceData backlinks(AppendixBingKeywordsDataPriceDataInfo backlinks) {
    this.backlinks = backlinks;
    return this;
  }

  /**
   * 
   * @return backlinks
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(AppendixBingKeywordsDataPriceDataInfo backlinks) {
    this.backlinks = backlinks;
  }


  public static final String SERIALIZED_NAME_BULK_BACKLINKS = "bulk_backlinks";
  @SerializedName(SERIALIZED_NAME_BULK_BACKLINKS)
  private AppendixBingKeywordsDataPriceDataInfo bulkBacklinks;

  public AppendixBacklinksPriceData bulkBacklinks(AppendixBingKeywordsDataPriceDataInfo bulkBacklinks) {
    this.bulkBacklinks = bulkBacklinks;
    return this;
  }

  /**
   * 
   * @return bulkBacklinks
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkBacklinks() {
    return bulkBacklinks;
  }

  public void setBulkBacklinks(AppendixBingKeywordsDataPriceDataInfo bulkBacklinks) {
    this.bulkBacklinks = bulkBacklinks;
  }


  public static final String SERIALIZED_NAME_BULK_NEW_LOST_BACKLINKS = "bulk_new_lost_backlinks";
  @SerializedName(SERIALIZED_NAME_BULK_NEW_LOST_BACKLINKS)
  private AppendixBingKeywordsDataPriceDataInfo bulkNewLostBacklinks;

  public AppendixBacklinksPriceData bulkNewLostBacklinks(AppendixBingKeywordsDataPriceDataInfo bulkNewLostBacklinks) {
    this.bulkNewLostBacklinks = bulkNewLostBacklinks;
    return this;
  }

  /**
   * 
   * @return bulkNewLostBacklinks
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkNewLostBacklinks() {
    return bulkNewLostBacklinks;
  }

  public void setBulkNewLostBacklinks(AppendixBingKeywordsDataPriceDataInfo bulkNewLostBacklinks) {
    this.bulkNewLostBacklinks = bulkNewLostBacklinks;
  }


  public static final String SERIALIZED_NAME_BULK_NEW_LOST_REFERRING_DOMAINS = "bulk_new_lost_referring_domains";
  @SerializedName(SERIALIZED_NAME_BULK_NEW_LOST_REFERRING_DOMAINS)
  private AppendixBingKeywordsDataPriceDataInfo bulkNewLostReferringDomains;

  public AppendixBacklinksPriceData bulkNewLostReferringDomains(AppendixBingKeywordsDataPriceDataInfo bulkNewLostReferringDomains) {
    this.bulkNewLostReferringDomains = bulkNewLostReferringDomains;
    return this;
  }

  /**
   * 
   * @return bulkNewLostReferringDomains
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkNewLostReferringDomains() {
    return bulkNewLostReferringDomains;
  }

  public void setBulkNewLostReferringDomains(AppendixBingKeywordsDataPriceDataInfo bulkNewLostReferringDomains) {
    this.bulkNewLostReferringDomains = bulkNewLostReferringDomains;
  }


  public static final String SERIALIZED_NAME_BULK_PAGES_SUMMARY = "bulk_pages_summary";
  @SerializedName(SERIALIZED_NAME_BULK_PAGES_SUMMARY)
  private AppendixBingKeywordsDataPriceDataInfo bulkPagesSummary;

  public AppendixBacklinksPriceData bulkPagesSummary(AppendixBingKeywordsDataPriceDataInfo bulkPagesSummary) {
    this.bulkPagesSummary = bulkPagesSummary;
    return this;
  }

  /**
   * 
   * @return bulkPagesSummary
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkPagesSummary() {
    return bulkPagesSummary;
  }

  public void setBulkPagesSummary(AppendixBingKeywordsDataPriceDataInfo bulkPagesSummary) {
    this.bulkPagesSummary = bulkPagesSummary;
  }


  public static final String SERIALIZED_NAME_BULK_RANKS = "bulk_ranks";
  @SerializedName(SERIALIZED_NAME_BULK_RANKS)
  private AppendixBingKeywordsDataPriceDataInfo bulkRanks;

  public AppendixBacklinksPriceData bulkRanks(AppendixBingKeywordsDataPriceDataInfo bulkRanks) {
    this.bulkRanks = bulkRanks;
    return this;
  }

  /**
   * 
   * @return bulkRanks
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkRanks() {
    return bulkRanks;
  }

  public void setBulkRanks(AppendixBingKeywordsDataPriceDataInfo bulkRanks) {
    this.bulkRanks = bulkRanks;
  }


  public static final String SERIALIZED_NAME_BULK_REFERRING_DOMAINS = "bulk_referring_domains";
  @SerializedName(SERIALIZED_NAME_BULK_REFERRING_DOMAINS)
  private AppendixBingKeywordsDataPriceDataInfo bulkReferringDomains;

  public AppendixBacklinksPriceData bulkReferringDomains(AppendixBingKeywordsDataPriceDataInfo bulkReferringDomains) {
    this.bulkReferringDomains = bulkReferringDomains;
    return this;
  }

  /**
   * 
   * @return bulkReferringDomains
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkReferringDomains() {
    return bulkReferringDomains;
  }

  public void setBulkReferringDomains(AppendixBingKeywordsDataPriceDataInfo bulkReferringDomains) {
    this.bulkReferringDomains = bulkReferringDomains;
  }


  public static final String SERIALIZED_NAME_BULK_SPAM_SCORE = "bulk_spam_score";
  @SerializedName(SERIALIZED_NAME_BULK_SPAM_SCORE)
  private AppendixBingKeywordsDataPriceDataInfo bulkSpamScore;

  public AppendixBacklinksPriceData bulkSpamScore(AppendixBingKeywordsDataPriceDataInfo bulkSpamScore) {
    this.bulkSpamScore = bulkSpamScore;
    return this;
  }

  /**
   * 
   * @return bulkSpamScore
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkSpamScore() {
    return bulkSpamScore;
  }

  public void setBulkSpamScore(AppendixBingKeywordsDataPriceDataInfo bulkSpamScore) {
    this.bulkSpamScore = bulkSpamScore;
  }


  public static final String SERIALIZED_NAME_COMPETITORS = "competitors";
  @SerializedName(SERIALIZED_NAME_COMPETITORS)
  private AppendixBingKeywordsDataPriceDataInfo competitors;

  public AppendixBacklinksPriceData competitors(AppendixBingKeywordsDataPriceDataInfo competitors) {
    this.competitors = competitors;
    return this;
  }

  /**
   * 
   * @return competitors
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getCompetitors() {
    return competitors;
  }

  public void setCompetitors(AppendixBingKeywordsDataPriceDataInfo competitors) {
    this.competitors = competitors;
  }


  public static final String SERIALIZED_NAME_CONTENT_DUPLICATES = "content_duplicates";
  @SerializedName(SERIALIZED_NAME_CONTENT_DUPLICATES)
  private AppendixBingKeywordsDataPriceDataInfo contentDuplicates;

  public AppendixBacklinksPriceData contentDuplicates(AppendixBingKeywordsDataPriceDataInfo contentDuplicates) {
    this.contentDuplicates = contentDuplicates;
    return this;
  }

  /**
   * 
   * @return contentDuplicates
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getContentDuplicates() {
    return contentDuplicates;
  }

  public void setContentDuplicates(AppendixBingKeywordsDataPriceDataInfo contentDuplicates) {
    this.contentDuplicates = contentDuplicates;
  }


  public static final String SERIALIZED_NAME_DOMAIN_INTERSECTION = "domain_intersection";
  @SerializedName(SERIALIZED_NAME_DOMAIN_INTERSECTION)
  private AppendixBingKeywordsDataPriceDataInfo domainIntersection;

  public AppendixBacklinksPriceData domainIntersection(AppendixBingKeywordsDataPriceDataInfo domainIntersection) {
    this.domainIntersection = domainIntersection;
    return this;
  }

  /**
   * 
   * @return domainIntersection
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getDomainIntersection() {
    return domainIntersection;
  }

  public void setDomainIntersection(AppendixBingKeywordsDataPriceDataInfo domainIntersection) {
    this.domainIntersection = domainIntersection;
  }


  public static final String SERIALIZED_NAME_DOMAIN_PAGES = "domain_pages";
  @SerializedName(SERIALIZED_NAME_DOMAIN_PAGES)
  private AppendixBingKeywordsDataPriceDataInfo domainPages;

  public AppendixBacklinksPriceData domainPages(AppendixBingKeywordsDataPriceDataInfo domainPages) {
    this.domainPages = domainPages;
    return this;
  }

  /**
   * 
   * @return domainPages
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getDomainPages() {
    return domainPages;
  }

  public void setDomainPages(AppendixBingKeywordsDataPriceDataInfo domainPages) {
    this.domainPages = domainPages;
  }


  public static final String SERIALIZED_NAME_DOMAIN_PAGES_SUMMARY = "domain_pages_summary";
  @SerializedName(SERIALIZED_NAME_DOMAIN_PAGES_SUMMARY)
  private AppendixBingKeywordsDataPriceDataInfo domainPagesSummary;

  public AppendixBacklinksPriceData domainPagesSummary(AppendixBingKeywordsDataPriceDataInfo domainPagesSummary) {
    this.domainPagesSummary = domainPagesSummary;
    return this;
  }

  /**
   * 
   * @return domainPagesSummary
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getDomainPagesSummary() {
    return domainPagesSummary;
  }

  public void setDomainPagesSummary(AppendixBingKeywordsDataPriceDataInfo domainPagesSummary) {
    this.domainPagesSummary = domainPagesSummary;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public AppendixBacklinksPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
    return this;
  }

  /**
   * 
   * @return errors
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getErrors() {
    return errors;
  }

  public void setErrors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
  }


  public static final String SERIALIZED_NAME_HISTORY = "history";
  @SerializedName(SERIALIZED_NAME_HISTORY)
  private AppendixBingKeywordsDataPriceDataInfo history;

  public AppendixBacklinksPriceData history(AppendixBingKeywordsDataPriceDataInfo history) {
    this.history = history;
    return this;
  }

  /**
   * 
   * @return history
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getHistory() {
    return history;
  }

  public void setHistory(AppendixBingKeywordsDataPriceDataInfo history) {
    this.history = history;
  }


  public static final String SERIALIZED_NAME_PAGE_INTERSECTION = "page_intersection";
  @SerializedName(SERIALIZED_NAME_PAGE_INTERSECTION)
  private AppendixBingKeywordsDataPriceDataInfo pageIntersection;

  public AppendixBacklinksPriceData pageIntersection(AppendixBingKeywordsDataPriceDataInfo pageIntersection) {
    this.pageIntersection = pageIntersection;
    return this;
  }

  /**
   * 
   * @return pageIntersection
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getPageIntersection() {
    return pageIntersection;
  }

  public void setPageIntersection(AppendixBingKeywordsDataPriceDataInfo pageIntersection) {
    this.pageIntersection = pageIntersection;
  }


  public static final String SERIALIZED_NAME_REFERRING_DOMAINS = "referring_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS)
  private AppendixBingKeywordsDataPriceDataInfo referringDomains;

  public AppendixBacklinksPriceData referringDomains(AppendixBingKeywordsDataPriceDataInfo referringDomains) {
    this.referringDomains = referringDomains;
    return this;
  }

  /**
   * 
   * @return referringDomains
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getReferringDomains() {
    return referringDomains;
  }

  public void setReferringDomains(AppendixBingKeywordsDataPriceDataInfo referringDomains) {
    this.referringDomains = referringDomains;
  }


  public static final String SERIALIZED_NAME_REFERRING_NETWORKS = "referring_networks";
  @SerializedName(SERIALIZED_NAME_REFERRING_NETWORKS)
  private AppendixBingKeywordsDataPriceDataInfo referringNetworks;

  public AppendixBacklinksPriceData referringNetworks(AppendixBingKeywordsDataPriceDataInfo referringNetworks) {
    this.referringNetworks = referringNetworks;
    return this;
  }

  /**
   * 
   * @return referringNetworks
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getReferringNetworks() {
    return referringNetworks;
  }

  public void setReferringNetworks(AppendixBingKeywordsDataPriceDataInfo referringNetworks) {
    this.referringNetworks = referringNetworks;
  }


  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private AppendixBingKeywordsDataPriceDataInfo summary;

  public AppendixBacklinksPriceData summary(AppendixBingKeywordsDataPriceDataInfo summary) {
    this.summary = summary;
    return this;
  }

  /**
   * 
   * @return summary
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getSummary() {
    return summary;
  }

  public void setSummary(AppendixBingKeywordsDataPriceDataInfo summary) {
    this.summary = summary;
  }


  public static final String SERIALIZED_NAME_TIMESERIES_NEW_LOST_SUMMARY = "timeseries_new_lost_summary";
  @SerializedName(SERIALIZED_NAME_TIMESERIES_NEW_LOST_SUMMARY)
  private AppendixBingKeywordsDataPriceDataInfo timeseriesNewLostSummary;

  public AppendixBacklinksPriceData timeseriesNewLostSummary(AppendixBingKeywordsDataPriceDataInfo timeseriesNewLostSummary) {
    this.timeseriesNewLostSummary = timeseriesNewLostSummary;
    return this;
  }

  /**
   * 
   * @return timeseriesNewLostSummary
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getTimeseriesNewLostSummary() {
    return timeseriesNewLostSummary;
  }

  public void setTimeseriesNewLostSummary(AppendixBingKeywordsDataPriceDataInfo timeseriesNewLostSummary) {
    this.timeseriesNewLostSummary = timeseriesNewLostSummary;
  }


  public static final String SERIALIZED_NAME_TIMESERIES_SUMMARY = "timeseries_summary";
  @SerializedName(SERIALIZED_NAME_TIMESERIES_SUMMARY)
  private AppendixBingKeywordsDataPriceDataInfo timeseriesSummary;

  public AppendixBacklinksPriceData timeseriesSummary(AppendixBingKeywordsDataPriceDataInfo timeseriesSummary) {
    this.timeseriesSummary = timeseriesSummary;
    return this;
  }

  /**
   * 
   * @return timeseriesSummary
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getTimeseriesSummary() {
    return timeseriesSummary;
  }

  public void setTimeseriesSummary(AppendixBingKeywordsDataPriceDataInfo timeseriesSummary) {
    this.timeseriesSummary = timeseriesSummary;
  }



  public AppendixBacklinksPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixBacklinksPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixBacklinksPriceData appendixBacklinksPriceData = (AppendixBacklinksPriceData) o;
    return

        Objects.equals(this.anchors, appendixBacklinksPriceData.anchors) &&
        Objects.equals(this.backlinks, appendixBacklinksPriceData.backlinks) &&
        Objects.equals(this.bulkBacklinks, appendixBacklinksPriceData.bulkBacklinks) &&
        Objects.equals(this.bulkNewLostBacklinks, appendixBacklinksPriceData.bulkNewLostBacklinks) &&
        Objects.equals(this.bulkNewLostReferringDomains, appendixBacklinksPriceData.bulkNewLostReferringDomains) &&
        Objects.equals(this.bulkPagesSummary, appendixBacklinksPriceData.bulkPagesSummary) &&
        Objects.equals(this.bulkRanks, appendixBacklinksPriceData.bulkRanks) &&
        Objects.equals(this.bulkReferringDomains, appendixBacklinksPriceData.bulkReferringDomains) &&
        Objects.equals(this.bulkSpamScore, appendixBacklinksPriceData.bulkSpamScore) &&
        Objects.equals(this.competitors, appendixBacklinksPriceData.competitors) &&
        Objects.equals(this.contentDuplicates, appendixBacklinksPriceData.contentDuplicates) &&
        Objects.equals(this.domainIntersection, appendixBacklinksPriceData.domainIntersection) &&
        Objects.equals(this.domainPages, appendixBacklinksPriceData.domainPages) &&
        Objects.equals(this.domainPagesSummary, appendixBacklinksPriceData.domainPagesSummary) &&
        Objects.equals(this.errors, appendixBacklinksPriceData.errors) &&
        Objects.equals(this.history, appendixBacklinksPriceData.history) &&
        Objects.equals(this.pageIntersection, appendixBacklinksPriceData.pageIntersection) &&
        Objects.equals(this.referringDomains, appendixBacklinksPriceData.referringDomains) &&
        Objects.equals(this.referringNetworks, appendixBacklinksPriceData.referringNetworks) &&
        Objects.equals(this.summary, appendixBacklinksPriceData.summary) &&
        Objects.equals(this.timeseriesNewLostSummary, appendixBacklinksPriceData.timeseriesNewLostSummary) &&
        Objects.equals(this.timeseriesSummary, appendixBacklinksPriceData.timeseriesSummary);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(anchors, backlinks, bulkBacklinks, bulkNewLostBacklinks, bulkNewLostReferringDomains, bulkPagesSummary, bulkRanks, bulkReferringDomains, bulkSpamScore, competitors, contentDuplicates, domainIntersection, domainPages, domainPagesSummary, errors, history, pageIntersection, referringDomains, referringNetworks, summary, timeseriesNewLostSummary, timeseriesSummary);
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
    sb.append("class AppendixBacklinksPriceData {\n");

    sb.append("    anchors: ").append(toIndentedString(anchors)).append("\n");
    sb.append("    backlinks: ").append(toIndentedString(backlinks)).append("\n");
    sb.append("    bulkBacklinks: ").append(toIndentedString(bulkBacklinks)).append("\n");
    sb.append("    bulkNewLostBacklinks: ").append(toIndentedString(bulkNewLostBacklinks)).append("\n");
    sb.append("    bulkNewLostReferringDomains: ").append(toIndentedString(bulkNewLostReferringDomains)).append("\n");
    sb.append("    bulkPagesSummary: ").append(toIndentedString(bulkPagesSummary)).append("\n");
    sb.append("    bulkRanks: ").append(toIndentedString(bulkRanks)).append("\n");
    sb.append("    bulkReferringDomains: ").append(toIndentedString(bulkReferringDomains)).append("\n");
    sb.append("    bulkSpamScore: ").append(toIndentedString(bulkSpamScore)).append("\n");
    sb.append("    competitors: ").append(toIndentedString(competitors)).append("\n");
    sb.append("    contentDuplicates: ").append(toIndentedString(contentDuplicates)).append("\n");
    sb.append("    domainIntersection: ").append(toIndentedString(domainIntersection)).append("\n");
    sb.append("    domainPages: ").append(toIndentedString(domainPages)).append("\n");
    sb.append("    domainPagesSummary: ").append(toIndentedString(domainPagesSummary)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    pageIntersection: ").append(toIndentedString(pageIntersection)).append("\n");
    sb.append("    referringDomains: ").append(toIndentedString(referringDomains)).append("\n");
    sb.append("    referringNetworks: ").append(toIndentedString(referringNetworks)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    timeseriesNewLostSummary: ").append(toIndentedString(timeseriesNewLostSummary)).append("\n");
    sb.append("    timeseriesSummary: ").append(toIndentedString(timeseriesSummary)).append("\n");
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
    
    openapiFields.add("anchors");
    
    openapiFields.add("backlinks");
    
    openapiFields.add("bulk_backlinks");
    
    openapiFields.add("bulk_new_lost_backlinks");
    
    openapiFields.add("bulk_new_lost_referring_domains");
    
    openapiFields.add("bulk_pages_summary");
    
    openapiFields.add("bulk_ranks");
    
    openapiFields.add("bulk_referring_domains");
    
    openapiFields.add("bulk_spam_score");
    
    openapiFields.add("competitors");
    
    openapiFields.add("content_duplicates");
    
    openapiFields.add("domain_intersection");
    
    openapiFields.add("domain_pages");
    
    openapiFields.add("domain_pages_summary");
    
    openapiFields.add("errors");
    
    openapiFields.add("history");
    
    openapiFields.add("page_intersection");
    
    openapiFields.add("referring_domains");
    
    openapiFields.add("referring_networks");
    
    openapiFields.add("summary");
    
    openapiFields.add("timeseries_new_lost_summary");
    
    openapiFields.add("timeseries_summary");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixBacklinksPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixBacklinksPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixBacklinksPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixBacklinksPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixBacklinksPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixBacklinksPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixBacklinksPriceData value) throws IOException {
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
           public AppendixBacklinksPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixBacklinksPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixBacklinksPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixBacklinksPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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



public class AppendixBacklinksLimitsRatesDataInfo  {


  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private AppendixInfo summary;

  public AppendixBacklinksLimitsRatesDataInfo summary(AppendixInfo summary) {
    this.summary = summary;
    return this;
  }

  /**
   * 
   * @return summary
   */
  @javax.annotation.Nullable
  public AppendixInfo getSummary() {
    return summary;
  }

  public void setSummary(AppendixInfo summary) {
    this.summary = summary;
  }


  public static final String SERIALIZED_NAME_HISTORY = "history";
  @SerializedName(SERIALIZED_NAME_HISTORY)
  private AppendixInfo history;

  public AppendixBacklinksLimitsRatesDataInfo history(AppendixInfo history) {
    this.history = history;
    return this;
  }

  /**
   * 
   * @return history
   */
  @javax.annotation.Nullable
  public AppendixInfo getHistory() {
    return history;
  }

  public void setHistory(AppendixInfo history) {
    this.history = history;
  }


  public static final String SERIALIZED_NAME_CONTENT_DUPLICATES = "content_duplicates";
  @SerializedName(SERIALIZED_NAME_CONTENT_DUPLICATES)
  private AppendixInfo contentDuplicates;

  public AppendixBacklinksLimitsRatesDataInfo contentDuplicates(AppendixInfo contentDuplicates) {
    this.contentDuplicates = contentDuplicates;
    return this;
  }

  /**
   * 
   * @return contentDuplicates
   */
  @javax.annotation.Nullable
  public AppendixInfo getContentDuplicates() {
    return contentDuplicates;
  }

  public void setContentDuplicates(AppendixInfo contentDuplicates) {
    this.contentDuplicates = contentDuplicates;
  }


  public static final String SERIALIZED_NAME_DOMAIN_INTERSECTION = "domain_intersection";
  @SerializedName(SERIALIZED_NAME_DOMAIN_INTERSECTION)
  private AppendixInfo domainIntersection;

  public AppendixBacklinksLimitsRatesDataInfo domainIntersection(AppendixInfo domainIntersection) {
    this.domainIntersection = domainIntersection;
    return this;
  }

  /**
   * 
   * @return domainIntersection
   */
  @javax.annotation.Nullable
  public AppendixInfo getDomainIntersection() {
    return domainIntersection;
  }

  public void setDomainIntersection(AppendixInfo domainIntersection) {
    this.domainIntersection = domainIntersection;
  }


  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private AppendixInfo backlinks;

  public AppendixBacklinksLimitsRatesDataInfo backlinks(AppendixInfo backlinks) {
    this.backlinks = backlinks;
    return this;
  }

  /**
   * 
   * @return backlinks
   */
  @javax.annotation.Nullable
  public AppendixInfo getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(AppendixInfo backlinks) {
    this.backlinks = backlinks;
  }


  public static final String SERIALIZED_NAME_DOMAIN_PAGES = "domain_pages";
  @SerializedName(SERIALIZED_NAME_DOMAIN_PAGES)
  private AppendixInfo domainPages;

  public AppendixBacklinksLimitsRatesDataInfo domainPages(AppendixInfo domainPages) {
    this.domainPages = domainPages;
    return this;
  }

  /**
   * 
   * @return domainPages
   */
  @javax.annotation.Nullable
  public AppendixInfo getDomainPages() {
    return domainPages;
  }

  public void setDomainPages(AppendixInfo domainPages) {
    this.domainPages = domainPages;
  }


  public static final String SERIALIZED_NAME_ANCHORS = "anchors";
  @SerializedName(SERIALIZED_NAME_ANCHORS)
  private AppendixInfo anchors;

  public AppendixBacklinksLimitsRatesDataInfo anchors(AppendixInfo anchors) {
    this.anchors = anchors;
    return this;
  }

  /**
   * 
   * @return anchors
   */
  @javax.annotation.Nullable
  public AppendixInfo getAnchors() {
    return anchors;
  }

  public void setAnchors(AppendixInfo anchors) {
    this.anchors = anchors;
  }


  public static final String SERIALIZED_NAME_REFERRING_DOMAINS = "referring_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS)
  private AppendixInfo referringDomains;

  public AppendixBacklinksLimitsRatesDataInfo referringDomains(AppendixInfo referringDomains) {
    this.referringDomains = referringDomains;
    return this;
  }

  /**
   * 
   * @return referringDomains
   */
  @javax.annotation.Nullable
  public AppendixInfo getReferringDomains() {
    return referringDomains;
  }

  public void setReferringDomains(AppendixInfo referringDomains) {
    this.referringDomains = referringDomains;
  }


  public static final String SERIALIZED_NAME_PAGE_INTERSECTION = "page_intersection";
  @SerializedName(SERIALIZED_NAME_PAGE_INTERSECTION)
  private AppendixInfo pageIntersection;

  public AppendixBacklinksLimitsRatesDataInfo pageIntersection(AppendixInfo pageIntersection) {
    this.pageIntersection = pageIntersection;
    return this;
  }

  /**
   * 
   * @return pageIntersection
   */
  @javax.annotation.Nullable
  public AppendixInfo getPageIntersection() {
    return pageIntersection;
  }

  public void setPageIntersection(AppendixInfo pageIntersection) {
    this.pageIntersection = pageIntersection;
  }


  public static final String SERIALIZED_NAME_REFERRING_NETWORKS = "referring_networks";
  @SerializedName(SERIALIZED_NAME_REFERRING_NETWORKS)
  private AppendixInfo referringNetworks;

  public AppendixBacklinksLimitsRatesDataInfo referringNetworks(AppendixInfo referringNetworks) {
    this.referringNetworks = referringNetworks;
    return this;
  }

  /**
   * 
   * @return referringNetworks
   */
  @javax.annotation.Nullable
  public AppendixInfo getReferringNetworks() {
    return referringNetworks;
  }

  public void setReferringNetworks(AppendixInfo referringNetworks) {
    this.referringNetworks = referringNetworks;
  }


  public static final String SERIALIZED_NAME_BULK_RANKS = "bulk_ranks";
  @SerializedName(SERIALIZED_NAME_BULK_RANKS)
  private AppendixInfo bulkRanks;

  public AppendixBacklinksLimitsRatesDataInfo bulkRanks(AppendixInfo bulkRanks) {
    this.bulkRanks = bulkRanks;
    return this;
  }

  /**
   * 
   * @return bulkRanks
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkRanks() {
    return bulkRanks;
  }

  public void setBulkRanks(AppendixInfo bulkRanks) {
    this.bulkRanks = bulkRanks;
  }


  public static final String SERIALIZED_NAME_BULK_BACKLINKS = "bulk_backlinks";
  @SerializedName(SERIALIZED_NAME_BULK_BACKLINKS)
  private AppendixInfo bulkBacklinks;

  public AppendixBacklinksLimitsRatesDataInfo bulkBacklinks(AppendixInfo bulkBacklinks) {
    this.bulkBacklinks = bulkBacklinks;
    return this;
  }

  /**
   * 
   * @return bulkBacklinks
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkBacklinks() {
    return bulkBacklinks;
  }

  public void setBulkBacklinks(AppendixInfo bulkBacklinks) {
    this.bulkBacklinks = bulkBacklinks;
  }


  public static final String SERIALIZED_NAME_BULK_NEW_LOST_BACKLINKS = "bulk_new_lost_backlinks";
  @SerializedName(SERIALIZED_NAME_BULK_NEW_LOST_BACKLINKS)
  private AppendixInfo bulkNewLostBacklinks;

  public AppendixBacklinksLimitsRatesDataInfo bulkNewLostBacklinks(AppendixInfo bulkNewLostBacklinks) {
    this.bulkNewLostBacklinks = bulkNewLostBacklinks;
    return this;
  }

  /**
   * 
   * @return bulkNewLostBacklinks
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkNewLostBacklinks() {
    return bulkNewLostBacklinks;
  }

  public void setBulkNewLostBacklinks(AppendixInfo bulkNewLostBacklinks) {
    this.bulkNewLostBacklinks = bulkNewLostBacklinks;
  }


  public static final String SERIALIZED_NAME_BULK_NEW_LOST_REFERRING_DOMAINS = "bulk_new_lost_referring_domains";
  @SerializedName(SERIALIZED_NAME_BULK_NEW_LOST_REFERRING_DOMAINS)
  private AppendixInfo bulkNewLostReferringDomains;

  public AppendixBacklinksLimitsRatesDataInfo bulkNewLostReferringDomains(AppendixInfo bulkNewLostReferringDomains) {
    this.bulkNewLostReferringDomains = bulkNewLostReferringDomains;
    return this;
  }

  /**
   * 
   * @return bulkNewLostReferringDomains
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkNewLostReferringDomains() {
    return bulkNewLostReferringDomains;
  }

  public void setBulkNewLostReferringDomains(AppendixInfo bulkNewLostReferringDomains) {
    this.bulkNewLostReferringDomains = bulkNewLostReferringDomains;
  }


  public static final String SERIALIZED_NAME_BULK_REFERRING_DOMAINS = "bulk_referring_domains";
  @SerializedName(SERIALIZED_NAME_BULK_REFERRING_DOMAINS)
  private AppendixInfo bulkReferringDomains;

  public AppendixBacklinksLimitsRatesDataInfo bulkReferringDomains(AppendixInfo bulkReferringDomains) {
    this.bulkReferringDomains = bulkReferringDomains;
    return this;
  }

  /**
   * 
   * @return bulkReferringDomains
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkReferringDomains() {
    return bulkReferringDomains;
  }

  public void setBulkReferringDomains(AppendixInfo bulkReferringDomains) {
    this.bulkReferringDomains = bulkReferringDomains;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Double errors;

  public AppendixBacklinksLimitsRatesDataInfo errors(Double errors) {
    this.errors = errors;
    return this;
  }

  /**
   * 
   * @return errors
   */
  @javax.annotation.Nullable
  public Double getErrors() {
    return errors;
  }

  public void setErrors(Double errors) {
    this.errors = errors;
  }


  public static final String SERIALIZED_NAME_DOMAIN_PAGES_SUMMARY = "domain_pages_summary";
  @SerializedName(SERIALIZED_NAME_DOMAIN_PAGES_SUMMARY)
  private AppendixInfo domainPagesSummary;

  public AppendixBacklinksLimitsRatesDataInfo domainPagesSummary(AppendixInfo domainPagesSummary) {
    this.domainPagesSummary = domainPagesSummary;
    return this;
  }

  /**
   * 
   * @return domainPagesSummary
   */
  @javax.annotation.Nullable
  public AppendixInfo getDomainPagesSummary() {
    return domainPagesSummary;
  }

  public void setDomainPagesSummary(AppendixInfo domainPagesSummary) {
    this.domainPagesSummary = domainPagesSummary;
  }


  public static final String SERIALIZED_NAME_TIMESERIES_SUMMARY = "timeseries_summary";
  @SerializedName(SERIALIZED_NAME_TIMESERIES_SUMMARY)
  private AppendixInfo timeseriesSummary;

  public AppendixBacklinksLimitsRatesDataInfo timeseriesSummary(AppendixInfo timeseriesSummary) {
    this.timeseriesSummary = timeseriesSummary;
    return this;
  }

  /**
   * 
   * @return timeseriesSummary
   */
  @javax.annotation.Nullable
  public AppendixInfo getTimeseriesSummary() {
    return timeseriesSummary;
  }

  public void setTimeseriesSummary(AppendixInfo timeseriesSummary) {
    this.timeseriesSummary = timeseriesSummary;
  }


  public static final String SERIALIZED_NAME_TIMESERIES_NEW_LOST_SUMMARY = "timeseries_new_lost_summary";
  @SerializedName(SERIALIZED_NAME_TIMESERIES_NEW_LOST_SUMMARY)
  private AppendixInfo timeseriesNewLostSummary;

  public AppendixBacklinksLimitsRatesDataInfo timeseriesNewLostSummary(AppendixInfo timeseriesNewLostSummary) {
    this.timeseriesNewLostSummary = timeseriesNewLostSummary;
    return this;
  }

  /**
   * 
   * @return timeseriesNewLostSummary
   */
  @javax.annotation.Nullable
  public AppendixInfo getTimeseriesNewLostSummary() {
    return timeseriesNewLostSummary;
  }

  public void setTimeseriesNewLostSummary(AppendixInfo timeseriesNewLostSummary) {
    this.timeseriesNewLostSummary = timeseriesNewLostSummary;
  }


  public static final String SERIALIZED_NAME_COMPETITORS = "competitors";
  @SerializedName(SERIALIZED_NAME_COMPETITORS)
  private AppendixInfo competitors;

  public AppendixBacklinksLimitsRatesDataInfo competitors(AppendixInfo competitors) {
    this.competitors = competitors;
    return this;
  }

  /**
   * 
   * @return competitors
   */
  @javax.annotation.Nullable
  public AppendixInfo getCompetitors() {
    return competitors;
  }

  public void setCompetitors(AppendixInfo competitors) {
    this.competitors = competitors;
  }


  public static final String SERIALIZED_NAME_BULK_SPAM_SCORE = "bulk_spam_score";
  @SerializedName(SERIALIZED_NAME_BULK_SPAM_SCORE)
  private AppendixInfo bulkSpamScore;

  public AppendixBacklinksLimitsRatesDataInfo bulkSpamScore(AppendixInfo bulkSpamScore) {
    this.bulkSpamScore = bulkSpamScore;
    return this;
  }

  /**
   * 
   * @return bulkSpamScore
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkSpamScore() {
    return bulkSpamScore;
  }

  public void setBulkSpamScore(AppendixInfo bulkSpamScore) {
    this.bulkSpamScore = bulkSpamScore;
  }


  public static final String SERIALIZED_NAME_BULK_PAGES_SUMMARY = "bulk_pages_summary";
  @SerializedName(SERIALIZED_NAME_BULK_PAGES_SUMMARY)
  private AppendixInfo bulkPagesSummary;

  public AppendixBacklinksLimitsRatesDataInfo bulkPagesSummary(AppendixInfo bulkPagesSummary) {
    this.bulkPagesSummary = bulkPagesSummary;
    return this;
  }

  /**
   * 
   * @return bulkPagesSummary
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkPagesSummary() {
    return bulkPagesSummary;
  }

  public void setBulkPagesSummary(AppendixInfo bulkPagesSummary) {
    this.bulkPagesSummary = bulkPagesSummary;
  }



  public AppendixBacklinksLimitsRatesDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixBacklinksLimitsRatesDataInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixBacklinksLimitsRatesDataInfo appendixBacklinksLimitsRatesDataInfo = (AppendixBacklinksLimitsRatesDataInfo) o;
    return

        Objects.equals(this.summary, appendixBacklinksLimitsRatesDataInfo.summary) &&
        Objects.equals(this.history, appendixBacklinksLimitsRatesDataInfo.history) &&
        Objects.equals(this.contentDuplicates, appendixBacklinksLimitsRatesDataInfo.contentDuplicates) &&
        Objects.equals(this.domainIntersection, appendixBacklinksLimitsRatesDataInfo.domainIntersection) &&
        Objects.equals(this.backlinks, appendixBacklinksLimitsRatesDataInfo.backlinks) &&
        Objects.equals(this.domainPages, appendixBacklinksLimitsRatesDataInfo.domainPages) &&
        Objects.equals(this.anchors, appendixBacklinksLimitsRatesDataInfo.anchors) &&
        Objects.equals(this.referringDomains, appendixBacklinksLimitsRatesDataInfo.referringDomains) &&
        Objects.equals(this.pageIntersection, appendixBacklinksLimitsRatesDataInfo.pageIntersection) &&
        Objects.equals(this.referringNetworks, appendixBacklinksLimitsRatesDataInfo.referringNetworks) &&
        Objects.equals(this.bulkRanks, appendixBacklinksLimitsRatesDataInfo.bulkRanks) &&
        Objects.equals(this.bulkBacklinks, appendixBacklinksLimitsRatesDataInfo.bulkBacklinks) &&
        Objects.equals(this.bulkNewLostBacklinks, appendixBacklinksLimitsRatesDataInfo.bulkNewLostBacklinks) &&
        Objects.equals(this.bulkNewLostReferringDomains, appendixBacklinksLimitsRatesDataInfo.bulkNewLostReferringDomains) &&
        Objects.equals(this.bulkReferringDomains, appendixBacklinksLimitsRatesDataInfo.bulkReferringDomains) &&
        Objects.equals(this.errors, appendixBacklinksLimitsRatesDataInfo.errors) &&
        Objects.equals(this.domainPagesSummary, appendixBacklinksLimitsRatesDataInfo.domainPagesSummary) &&
        Objects.equals(this.timeseriesSummary, appendixBacklinksLimitsRatesDataInfo.timeseriesSummary) &&
        Objects.equals(this.timeseriesNewLostSummary, appendixBacklinksLimitsRatesDataInfo.timeseriesNewLostSummary) &&
        Objects.equals(this.competitors, appendixBacklinksLimitsRatesDataInfo.competitors) &&
        Objects.equals(this.bulkSpamScore, appendixBacklinksLimitsRatesDataInfo.bulkSpamScore) &&
        Objects.equals(this.bulkPagesSummary, appendixBacklinksLimitsRatesDataInfo.bulkPagesSummary);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(summary, history, contentDuplicates, domainIntersection, backlinks, domainPages, anchors, referringDomains, pageIntersection, referringNetworks, bulkRanks, bulkBacklinks, bulkNewLostBacklinks, bulkNewLostReferringDomains, bulkReferringDomains, errors, domainPagesSummary, timeseriesSummary, timeseriesNewLostSummary, competitors, bulkSpamScore, bulkPagesSummary);
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
    sb.append("class AppendixBacklinksLimitsRatesDataInfo {\n");

    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    contentDuplicates: ").append(toIndentedString(contentDuplicates)).append("\n");
    sb.append("    domainIntersection: ").append(toIndentedString(domainIntersection)).append("\n");
    sb.append("    backlinks: ").append(toIndentedString(backlinks)).append("\n");
    sb.append("    domainPages: ").append(toIndentedString(domainPages)).append("\n");
    sb.append("    anchors: ").append(toIndentedString(anchors)).append("\n");
    sb.append("    referringDomains: ").append(toIndentedString(referringDomains)).append("\n");
    sb.append("    pageIntersection: ").append(toIndentedString(pageIntersection)).append("\n");
    sb.append("    referringNetworks: ").append(toIndentedString(referringNetworks)).append("\n");
    sb.append("    bulkRanks: ").append(toIndentedString(bulkRanks)).append("\n");
    sb.append("    bulkBacklinks: ").append(toIndentedString(bulkBacklinks)).append("\n");
    sb.append("    bulkNewLostBacklinks: ").append(toIndentedString(bulkNewLostBacklinks)).append("\n");
    sb.append("    bulkNewLostReferringDomains: ").append(toIndentedString(bulkNewLostReferringDomains)).append("\n");
    sb.append("    bulkReferringDomains: ").append(toIndentedString(bulkReferringDomains)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    domainPagesSummary: ").append(toIndentedString(domainPagesSummary)).append("\n");
    sb.append("    timeseriesSummary: ").append(toIndentedString(timeseriesSummary)).append("\n");
    sb.append("    timeseriesNewLostSummary: ").append(toIndentedString(timeseriesNewLostSummary)).append("\n");
    sb.append("    competitors: ").append(toIndentedString(competitors)).append("\n");
    sb.append("    bulkSpamScore: ").append(toIndentedString(bulkSpamScore)).append("\n");
    sb.append("    bulkPagesSummary: ").append(toIndentedString(bulkPagesSummary)).append("\n");
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
    
    openapiFields.add("summary");
    
    openapiFields.add("history");
    
    openapiFields.add("content_duplicates");
    
    openapiFields.add("domain_intersection");
    
    openapiFields.add("backlinks");
    
    openapiFields.add("domain_pages");
    
    openapiFields.add("anchors");
    
    openapiFields.add("referring_domains");
    
    openapiFields.add("page_intersection");
    
    openapiFields.add("referring_networks");
    
    openapiFields.add("bulk_ranks");
    
    openapiFields.add("bulk_backlinks");
    
    openapiFields.add("bulk_new_lost_backlinks");
    
    openapiFields.add("bulk_new_lost_referring_domains");
    
    openapiFields.add("bulk_referring_domains");
    
    openapiFields.add("errors");
    
    openapiFields.add("domain_pages_summary");
    
    openapiFields.add("timeseries_summary");
    
    openapiFields.add("timeseries_new_lost_summary");
    
    openapiFields.add("competitors");
    
    openapiFields.add("bulk_spam_score");
    
    openapiFields.add("bulk_pages_summary");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixBacklinksLimitsRatesDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixBacklinksLimitsRatesDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixBacklinksLimitsRatesDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixBacklinksLimitsRatesDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixBacklinksLimitsRatesDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixBacklinksLimitsRatesDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixBacklinksLimitsRatesDataInfo value) throws IOException {
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
           public AppendixBacklinksLimitsRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixBacklinksLimitsRatesDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixBacklinksLimitsRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixBacklinksLimitsRatesDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
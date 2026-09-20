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


public class AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo  {


  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private AppendixInfo search;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo search(AppendixInfo search) {
    this.search = search;
    return this;
  }

  /**
   * 
   * @return search
   */
  @javax.annotation.Nullable
  public AppendixInfo getSearch() {
    return search;
  }

  public void setSearch(AppendixInfo search) {
    this.search = search;
  }


  public static final String SERIALIZED_NAME_AGGREGATED_METRICS = "aggregated_metrics";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_METRICS)
  private AppendixInfo aggregatedMetrics;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo aggregatedMetrics(AppendixInfo aggregatedMetrics) {
    this.aggregatedMetrics = aggregatedMetrics;
    return this;
  }

  /**
   * 
   * @return aggregatedMetrics
   */
  @javax.annotation.Nullable
  public AppendixInfo getAggregatedMetrics() {
    return aggregatedMetrics;
  }

  public void setAggregatedMetrics(AppendixInfo aggregatedMetrics) {
    this.aggregatedMetrics = aggregatedMetrics;
  }


  public static final String SERIALIZED_NAME_CROSS_AGGREGATED_METRICS = "cross_aggregated_metrics";
  @SerializedName(SERIALIZED_NAME_CROSS_AGGREGATED_METRICS)
  private AppendixInfo crossAggregatedMetrics;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo crossAggregatedMetrics(AppendixInfo crossAggregatedMetrics) {
    this.crossAggregatedMetrics = crossAggregatedMetrics;
    return this;
  }

  /**
   * 
   * @return crossAggregatedMetrics
   */
  @javax.annotation.Nullable
  public AppendixInfo getCrossAggregatedMetrics() {
    return crossAggregatedMetrics;
  }

  public void setCrossAggregatedMetrics(AppendixInfo crossAggregatedMetrics) {
    this.crossAggregatedMetrics = crossAggregatedMetrics;
  }


  public static final String SERIALIZED_NAME_TOP_DOMAINS = "top_domains";
  @SerializedName(SERIALIZED_NAME_TOP_DOMAINS)
  private AppendixInfo topDomains;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo topDomains(AppendixInfo topDomains) {
    this.topDomains = topDomains;
    return this;
  }

  /**
   * 
   * @return topDomains
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopDomains() {
    return topDomains;
  }

  public void setTopDomains(AppendixInfo topDomains) {
    this.topDomains = topDomains;
  }


  public static final String SERIALIZED_NAME_TOP_PAGES = "top_pages";
  @SerializedName(SERIALIZED_NAME_TOP_PAGES)
  private AppendixInfo topPages;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo topPages(AppendixInfo topPages) {
    this.topPages = topPages;
    return this;
  }

  /**
   * 
   * @return topPages
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopPages() {
    return topPages;
  }

  public void setTopPages(AppendixInfo topPages) {
    this.topPages = topPages;
  }


  public static final String SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES = "locations_and_languages";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES)
  private Double locationsAndLanguages;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo locationsAndLanguages(Double locationsAndLanguages) {
    this.locationsAndLanguages = locationsAndLanguages;
    return this;
  }

  /**
   * 
   * @return locationsAndLanguages
   */
  @javax.annotation.Nullable
  public Double getLocationsAndLanguages() {
    return locationsAndLanguages;
  }

  public void setLocationsAndLanguages(Double locationsAndLanguages) {
    this.locationsAndLanguages = locationsAndLanguages;
  }


  public static final String SERIALIZED_NAME_AVAILABLE_FILTERS = "available_filters";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_FILTERS)
  private Double availableFilters;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo availableFilters(Double availableFilters) {
    this.availableFilters = availableFilters;
    return this;
  }

  /**
   * 
   * @return availableFilters
   */
  @javax.annotation.Nullable
  public Double getAvailableFilters() {
    return availableFilters;
  }

  public void setAvailableFilters(Double availableFilters) {
    this.availableFilters = availableFilters;
  }


  public static final String SERIALIZED_NAME_SEARCH_MENTIONS = "search_mentions";
  @SerializedName(SERIALIZED_NAME_SEARCH_MENTIONS)
  private AppendixInfo searchMentions;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo searchMentions(AppendixInfo searchMentions) {
    this.searchMentions = searchMentions;
    return this;
  }

  /**
   * 
   * @return searchMentions
   */
  @javax.annotation.Nullable
  public AppendixInfo getSearchMentions() {
    return searchMentions;
  }

  public void setSearchMentions(AppendixInfo searchMentions) {
    this.searchMentions = searchMentions;
  }


  public static final String SERIALIZED_NAME_TARGET_METRICS = "target_metrics";
  @SerializedName(SERIALIZED_NAME_TARGET_METRICS)
  private AppendixInfo targetMetrics;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo targetMetrics(AppendixInfo targetMetrics) {
    this.targetMetrics = targetMetrics;
    return this;
  }

  /**
   * 
   * @return targetMetrics
   */
  @javax.annotation.Nullable
  public AppendixInfo getTargetMetrics() {
    return targetMetrics;
  }

  public void setTargetMetrics(AppendixInfo targetMetrics) {
    this.targetMetrics = targetMetrics;
  }


  public static final String SERIALIZED_NAME_MULTI_TARGET_METRICS = "multi_target_metrics";
  @SerializedName(SERIALIZED_NAME_MULTI_TARGET_METRICS)
  private AppendixInfo multiTargetMetrics;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo multiTargetMetrics(AppendixInfo multiTargetMetrics) {
    this.multiTargetMetrics = multiTargetMetrics;
    return this;
  }

  /**
   * 
   * @return multiTargetMetrics
   */
  @javax.annotation.Nullable
  public AppendixInfo getMultiTargetMetrics() {
    return multiTargetMetrics;
  }

  public void setMultiTargetMetrics(AppendixInfo multiTargetMetrics) {
    this.multiTargetMetrics = multiTargetMetrics;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_DOMAINS = "top_mentioned_domains";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_DOMAINS)
  private AppendixInfo topMentionedDomains;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo topMentionedDomains(AppendixInfo topMentionedDomains) {
    this.topMentionedDomains = topMentionedDomains;
    return this;
  }

  /**
   * 
   * @return topMentionedDomains
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopMentionedDomains() {
    return topMentionedDomains;
  }

  public void setTopMentionedDomains(AppendixInfo topMentionedDomains) {
    this.topMentionedDomains = topMentionedDomains;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_PAGES = "top_mentioned_pages";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_PAGES)
  private AppendixInfo topMentionedPages;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo topMentionedPages(AppendixInfo topMentionedPages) {
    this.topMentionedPages = topMentionedPages;
    return this;
  }

  /**
   * 
   * @return topMentionedPages
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopMentionedPages() {
    return topMentionedPages;
  }

  public void setTopMentionedPages(AppendixInfo topMentionedPages) {
    this.topMentionedPages = topMentionedPages;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_BRANDS = "top_mentioned_brands";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_BRANDS)
  private AppendixInfo topMentionedBrands;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo topMentionedBrands(AppendixInfo topMentionedBrands) {
    this.topMentionedBrands = topMentionedBrands;
    return this;
  }

  /**
   * 
   * @return topMentionedBrands
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopMentionedBrands() {
    return topMentionedBrands;
  }

  public void setTopMentionedBrands(AppendixInfo topMentionedBrands) {
    this.topMentionedBrands = topMentionedBrands;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_BRAND_CATEGORIES = "top_mentioned_brand_categories";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_BRAND_CATEGORIES)
  private AppendixInfo topMentionedBrandCategories;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo topMentionedBrandCategories(AppendixInfo topMentionedBrandCategories) {
    this.topMentionedBrandCategories = topMentionedBrandCategories;
    return this;
  }

  /**
   * 
   * @return topMentionedBrandCategories
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopMentionedBrandCategories() {
    return topMentionedBrandCategories;
  }

  public void setTopMentionedBrandCategories(AppendixInfo topMentionedBrandCategories) {
    this.topMentionedBrandCategories = topMentionedBrandCategories;
  }


  public static final String SERIALIZED_NAME_TARGET_METRICS_LITE = "target_metrics_lite";
  @SerializedName(SERIALIZED_NAME_TARGET_METRICS_LITE)
  private AppendixInfo targetMetricsLite;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo targetMetricsLite(AppendixInfo targetMetricsLite) {
    this.targetMetricsLite = targetMetricsLite;
    return this;
  }

  /**
   * 
   * @return targetMetricsLite
   */
  @javax.annotation.Nullable
  public AppendixInfo getTargetMetricsLite() {
    return targetMetricsLite;
  }

  public void setTargetMetricsLite(AppendixInfo targetMetricsLite) {
    this.targetMetricsLite = targetMetricsLite;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_DOMAINS_LITE = "top_mentioned_domains_lite";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_DOMAINS_LITE)
  private AppendixInfo topMentionedDomainsLite;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo topMentionedDomainsLite(AppendixInfo topMentionedDomainsLite) {
    this.topMentionedDomainsLite = topMentionedDomainsLite;
    return this;
  }

  /**
   * 
   * @return topMentionedDomainsLite
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopMentionedDomainsLite() {
    return topMentionedDomainsLite;
  }

  public void setTopMentionedDomainsLite(AppendixInfo topMentionedDomainsLite) {
    this.topMentionedDomainsLite = topMentionedDomainsLite;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_PAGES_LITE = "top_mentioned_pages_lite";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_PAGES_LITE)
  private AppendixInfo topMentionedPagesLite;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo topMentionedPagesLite(AppendixInfo topMentionedPagesLite) {
    this.topMentionedPagesLite = topMentionedPagesLite;
    return this;
  }

  /**
   * 
   * @return topMentionedPagesLite
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopMentionedPagesLite() {
    return topMentionedPagesLite;
  }

  public void setTopMentionedPagesLite(AppendixInfo topMentionedPagesLite) {
    this.topMentionedPagesLite = topMentionedPagesLite;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_BRANDS_LITE = "top_mentioned_brands_lite";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_BRANDS_LITE)
  private AppendixInfo topMentionedBrandsLite;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo topMentionedBrandsLite(AppendixInfo topMentionedBrandsLite) {
    this.topMentionedBrandsLite = topMentionedBrandsLite;
    return this;
  }

  /**
   * 
   * @return topMentionedBrandsLite
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopMentionedBrandsLite() {
    return topMentionedBrandsLite;
  }

  public void setTopMentionedBrandsLite(AppendixInfo topMentionedBrandsLite) {
    this.topMentionedBrandsLite = topMentionedBrandsLite;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_BRAND_CATEGORIES_LITE = "top_mentioned_brand_categories_lite";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_BRAND_CATEGORIES_LITE)
  private AppendixInfo topMentionedBrandCategoriesLite;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo topMentionedBrandCategoriesLite(AppendixInfo topMentionedBrandCategoriesLite) {
    this.topMentionedBrandCategoriesLite = topMentionedBrandCategoriesLite;
    return this;
  }

  /**
   * 
   * @return topMentionedBrandCategoriesLite
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopMentionedBrandCategoriesLite() {
    return topMentionedBrandCategoriesLite;
  }

  public void setTopMentionedBrandCategoriesLite(AppendixInfo topMentionedBrandCategoriesLite) {
    this.topMentionedBrandCategoriesLite = topMentionedBrandCategoriesLite;
  }


  public static final String SERIALIZED_NAME_HISTORICAL = "historical";
  @SerializedName(SERIALIZED_NAME_HISTORICAL)
  private AppendixInfo historical;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo historical(AppendixInfo historical) {
    this.historical = historical;
    return this;
  }

  /**
   * 
   * @return historical
   */
  @javax.annotation.Nullable
  public AppendixInfo getHistorical() {
    return historical;
  }

  public void setHistorical(AppendixInfo historical) {
    this.historical = historical;
  }


  public static final String SERIALIZED_NAME_TIMESERIES_DELTA = "timeseries_delta";
  @SerializedName(SERIALIZED_NAME_TIMESERIES_DELTA)
  private AppendixInfo timeseriesDelta;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo timeseriesDelta(AppendixInfo timeseriesDelta) {
    this.timeseriesDelta = timeseriesDelta;
    return this;
  }

  /**
   * 
   * @return timeseriesDelta
   */
  @javax.annotation.Nullable
  public AppendixInfo getTimeseriesDelta() {
    return timeseriesDelta;
  }

  public void setTimeseriesDelta(AppendixInfo timeseriesDelta) {
    this.timeseriesDelta = timeseriesDelta;
  }


  public static final String SERIALIZED_NAME_TIMESERIES_NEW_LOST = "timeseries_new_lost";
  @SerializedName(SERIALIZED_NAME_TIMESERIES_NEW_LOST)
  private AppendixInfo timeseriesNewLost;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo timeseriesNewLost(AppendixInfo timeseriesNewLost) {
    this.timeseriesNewLost = timeseriesNewLost;
    return this;
  }

  /**
   * 
   * @return timeseriesNewLost
   */
  @javax.annotation.Nullable
  public AppendixInfo getTimeseriesNewLost() {
    return timeseriesNewLost;
  }

  public void setTimeseriesNewLost(AppendixInfo timeseriesNewLost) {
    this.timeseriesNewLost = timeseriesNewLost;
  }



  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo appendixLlmMentionsAiOptimizationLimitsRatesDataInfo = (AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo) o;
    return

        Objects.equals(this.search, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.search) &&
        Objects.equals(this.aggregatedMetrics, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.aggregatedMetrics) &&
        Objects.equals(this.crossAggregatedMetrics, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.crossAggregatedMetrics) &&
        Objects.equals(this.topDomains, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.topDomains) &&
        Objects.equals(this.topPages, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.topPages) &&
        Objects.equals(this.locationsAndLanguages, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.locationsAndLanguages) &&
        Objects.equals(this.availableFilters, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.availableFilters) &&
        Objects.equals(this.searchMentions, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.searchMentions) &&
        Objects.equals(this.targetMetrics, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.targetMetrics) &&
        Objects.equals(this.multiTargetMetrics, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.multiTargetMetrics) &&
        Objects.equals(this.topMentionedDomains, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.topMentionedDomains) &&
        Objects.equals(this.topMentionedPages, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.topMentionedPages) &&
        Objects.equals(this.topMentionedBrands, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.topMentionedBrands) &&
        Objects.equals(this.topMentionedBrandCategories, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.topMentionedBrandCategories) &&
        Objects.equals(this.targetMetricsLite, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.targetMetricsLite) &&
        Objects.equals(this.topMentionedDomainsLite, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.topMentionedDomainsLite) &&
        Objects.equals(this.topMentionedPagesLite, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.topMentionedPagesLite) &&
        Objects.equals(this.topMentionedBrandsLite, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.topMentionedBrandsLite) &&
        Objects.equals(this.topMentionedBrandCategoriesLite, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.topMentionedBrandCategoriesLite) &&
        Objects.equals(this.historical, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.historical) &&
        Objects.equals(this.timeseriesDelta, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.timeseriesDelta) &&
        Objects.equals(this.timeseriesNewLost, appendixLlmMentionsAiOptimizationLimitsRatesDataInfo.timeseriesNewLost);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(search, aggregatedMetrics, crossAggregatedMetrics, topDomains, topPages, locationsAndLanguages, availableFilters, searchMentions, targetMetrics, multiTargetMetrics, topMentionedDomains, topMentionedPages, topMentionedBrands, topMentionedBrandCategories, targetMetricsLite, topMentionedDomainsLite, topMentionedPagesLite, topMentionedBrandsLite, topMentionedBrandCategoriesLite, historical, timeseriesDelta, timeseriesNewLost);
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
    sb.append("class AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo {\n");

    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    aggregatedMetrics: ").append(toIndentedString(aggregatedMetrics)).append("\n");
    sb.append("    crossAggregatedMetrics: ").append(toIndentedString(crossAggregatedMetrics)).append("\n");
    sb.append("    topDomains: ").append(toIndentedString(topDomains)).append("\n");
    sb.append("    topPages: ").append(toIndentedString(topPages)).append("\n");
    sb.append("    locationsAndLanguages: ").append(toIndentedString(locationsAndLanguages)).append("\n");
    sb.append("    availableFilters: ").append(toIndentedString(availableFilters)).append("\n");
    sb.append("    searchMentions: ").append(toIndentedString(searchMentions)).append("\n");
    sb.append("    targetMetrics: ").append(toIndentedString(targetMetrics)).append("\n");
    sb.append("    multiTargetMetrics: ").append(toIndentedString(multiTargetMetrics)).append("\n");
    sb.append("    topMentionedDomains: ").append(toIndentedString(topMentionedDomains)).append("\n");
    sb.append("    topMentionedPages: ").append(toIndentedString(topMentionedPages)).append("\n");
    sb.append("    topMentionedBrands: ").append(toIndentedString(topMentionedBrands)).append("\n");
    sb.append("    topMentionedBrandCategories: ").append(toIndentedString(topMentionedBrandCategories)).append("\n");
    sb.append("    targetMetricsLite: ").append(toIndentedString(targetMetricsLite)).append("\n");
    sb.append("    topMentionedDomainsLite: ").append(toIndentedString(topMentionedDomainsLite)).append("\n");
    sb.append("    topMentionedPagesLite: ").append(toIndentedString(topMentionedPagesLite)).append("\n");
    sb.append("    topMentionedBrandsLite: ").append(toIndentedString(topMentionedBrandsLite)).append("\n");
    sb.append("    topMentionedBrandCategoriesLite: ").append(toIndentedString(topMentionedBrandCategoriesLite)).append("\n");
    sb.append("    historical: ").append(toIndentedString(historical)).append("\n");
    sb.append("    timeseriesDelta: ").append(toIndentedString(timeseriesDelta)).append("\n");
    sb.append("    timeseriesNewLost: ").append(toIndentedString(timeseriesNewLost)).append("\n");
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
    
    openapiFields.add("search");
    
    openapiFields.add("aggregated_metrics");
    
    openapiFields.add("cross_aggregated_metrics");
    
    openapiFields.add("top_domains");
    
    openapiFields.add("top_pages");
    
    openapiFields.add("locations_and_languages");
    
    openapiFields.add("available_filters");
    
    openapiFields.add("search_mentions");
    
    openapiFields.add("target_metrics");
    
    openapiFields.add("multi_target_metrics");
    
    openapiFields.add("top_mentioned_domains");
    
    openapiFields.add("top_mentioned_pages");
    
    openapiFields.add("top_mentioned_brands");
    
    openapiFields.add("top_mentioned_brand_categories");
    
    openapiFields.add("target_metrics_lite");
    
    openapiFields.add("top_mentioned_domains_lite");
    
    openapiFields.add("top_mentioned_pages_lite");
    
    openapiFields.add("top_mentioned_brands_lite");
    
    openapiFields.add("top_mentioned_brand_categories_lite");
    
    openapiFields.add("historical");
    
    openapiFields.add("timeseries_delta");
    
    openapiFields.add("timeseries_new_lost");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo value) throws IOException {
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
           public AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixLlmMentionsAiOptimizationLimitsRatesDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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



public class AppendixDataforseoLabsLimitsRatesDataInfo  {


  public static final String SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES = "locations_and_languages";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES)
  private Double locationsAndLanguages;

  public AppendixDataforseoLabsLimitsRatesDataInfo locationsAndLanguages(Double locationsAndLanguages) {
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


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private Double categories;

  public AppendixDataforseoLabsLimitsRatesDataInfo categories(Double categories) {
    this.categories = categories;
    return this;
  }

  /**
   * 
   * @return categories
   */
  @javax.annotation.Nullable
  public Double getCategories() {
    return categories;
  }

  public void setCategories(Double categories) {
    this.categories = categories;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Double errors;

  public AppendixDataforseoLabsLimitsRatesDataInfo errors(Double errors) {
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


  public static final String SERIALIZED_NAME_PRODUCT_COMPETITORS = "product_competitors";
  @SerializedName(SERIALIZED_NAME_PRODUCT_COMPETITORS)
  private AppendixInfo productCompetitors;

  public AppendixDataforseoLabsLimitsRatesDataInfo productCompetitors(AppendixInfo productCompetitors) {
    this.productCompetitors = productCompetitors;
    return this;
  }

  /**
   * 
   * @return productCompetitors
   */
  @javax.annotation.Nullable
  public AppendixInfo getProductCompetitors() {
    return productCompetitors;
  }

  public void setProductCompetitors(AppendixInfo productCompetitors) {
    this.productCompetitors = productCompetitors;
  }


  public static final String SERIALIZED_NAME_PRODUCT_KEYWORD_INTERSECTIONS = "product_keyword_intersections";
  @SerializedName(SERIALIZED_NAME_PRODUCT_KEYWORD_INTERSECTIONS)
  private AppendixInfo productKeywordIntersections;

  public AppendixDataforseoLabsLimitsRatesDataInfo productKeywordIntersections(AppendixInfo productKeywordIntersections) {
    this.productKeywordIntersections = productKeywordIntersections;
    return this;
  }

  /**
   * 
   * @return productKeywordIntersections
   */
  @javax.annotation.Nullable
  public AppendixInfo getProductKeywordIntersections() {
    return productKeywordIntersections;
  }

  public void setProductKeywordIntersections(AppendixInfo productKeywordIntersections) {
    this.productKeywordIntersections = productKeywordIntersections;
  }


  public static final String SERIALIZED_NAME_PRODUCT_RANK_OVERVIEW = "product_rank_overview";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RANK_OVERVIEW)
  private AppendixInfo productRankOverview;

  public AppendixDataforseoLabsLimitsRatesDataInfo productRankOverview(AppendixInfo productRankOverview) {
    this.productRankOverview = productRankOverview;
    return this;
  }

  /**
   * 
   * @return productRankOverview
   */
  @javax.annotation.Nullable
  public AppendixInfo getProductRankOverview() {
    return productRankOverview;
  }

  public void setProductRankOverview(AppendixInfo productRankOverview) {
    this.productRankOverview = productRankOverview;
  }


  public static final String SERIALIZED_NAME_RANKED_KEYWORDS = "ranked_keywords";
  @SerializedName(SERIALIZED_NAME_RANKED_KEYWORDS)
  private AppendixInfo rankedKeywords;

  public AppendixDataforseoLabsLimitsRatesDataInfo rankedKeywords(AppendixInfo rankedKeywords) {
    this.rankedKeywords = rankedKeywords;
    return this;
  }

  /**
   * 
   * @return rankedKeywords
   */
  @javax.annotation.Nullable
  public AppendixInfo getRankedKeywords() {
    return rankedKeywords;
  }

  public void setRankedKeywords(AppendixInfo rankedKeywords) {
    this.rankedKeywords = rankedKeywords;
  }


  public static final String SERIALIZED_NAME_SERP_COMPETITORS = "serp_competitors";
  @SerializedName(SERIALIZED_NAME_SERP_COMPETITORS)
  private AppendixInfo serpCompetitors;

  public AppendixDataforseoLabsLimitsRatesDataInfo serpCompetitors(AppendixInfo serpCompetitors) {
    this.serpCompetitors = serpCompetitors;
    return this;
  }

  /**
   * 
   * @return serpCompetitors
   */
  @javax.annotation.Nullable
  public AppendixInfo getSerpCompetitors() {
    return serpCompetitors;
  }

  public void setSerpCompetitors(AppendixInfo serpCompetitors) {
    this.serpCompetitors = serpCompetitors;
  }


  public static final String SERIALIZED_NAME_SUBDOMAINS = "subdomains";
  @SerializedName(SERIALIZED_NAME_SUBDOMAINS)
  private AppendixInfo subdomains;

  public AppendixDataforseoLabsLimitsRatesDataInfo subdomains(AppendixInfo subdomains) {
    this.subdomains = subdomains;
    return this;
  }

  /**
   * 
   * @return subdomains
   */
  @javax.annotation.Nullable
  public AppendixInfo getSubdomains() {
    return subdomains;
  }

  public void setSubdomains(AppendixInfo subdomains) {
    this.subdomains = subdomains;
  }


  public static final String SERIALIZED_NAME_RELEVANT_PAGES = "relevant_pages";
  @SerializedName(SERIALIZED_NAME_RELEVANT_PAGES)
  private AppendixInfo relevantPages;

  public AppendixDataforseoLabsLimitsRatesDataInfo relevantPages(AppendixInfo relevantPages) {
    this.relevantPages = relevantPages;
    return this;
  }

  /**
   * 
   * @return relevantPages
   */
  @javax.annotation.Nullable
  public AppendixInfo getRelevantPages() {
    return relevantPages;
  }

  public void setRelevantPages(AppendixInfo relevantPages) {
    this.relevantPages = relevantPages;
  }


  public static final String SERIALIZED_NAME_COMPETITORS_DOMAIN = "competitors_domain";
  @SerializedName(SERIALIZED_NAME_COMPETITORS_DOMAIN)
  private AppendixInfo competitorsDomain;

  public AppendixDataforseoLabsLimitsRatesDataInfo competitorsDomain(AppendixInfo competitorsDomain) {
    this.competitorsDomain = competitorsDomain;
    return this;
  }

  /**
   * 
   * @return competitorsDomain
   */
  @javax.annotation.Nullable
  public AppendixInfo getCompetitorsDomain() {
    return competitorsDomain;
  }

  public void setCompetitorsDomain(AppendixInfo competitorsDomain) {
    this.competitorsDomain = competitorsDomain;
  }


  public static final String SERIALIZED_NAME_RELATED_KEYWORDS = "related_keywords";
  @SerializedName(SERIALIZED_NAME_RELATED_KEYWORDS)
  private AppendixInfo relatedKeywords;

  public AppendixDataforseoLabsLimitsRatesDataInfo relatedKeywords(AppendixInfo relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
    return this;
  }

  /**
   * 
   * @return relatedKeywords
   */
  @javax.annotation.Nullable
  public AppendixInfo getRelatedKeywords() {
    return relatedKeywords;
  }

  public void setRelatedKeywords(AppendixInfo relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }


  public static final String SERIALIZED_NAME_DOMAIN_RANK_OVERVIEW = "domain_rank_overview";
  @SerializedName(SERIALIZED_NAME_DOMAIN_RANK_OVERVIEW)
  private AppendixInfo domainRankOverview;

  public AppendixDataforseoLabsLimitsRatesDataInfo domainRankOverview(AppendixInfo domainRankOverview) {
    this.domainRankOverview = domainRankOverview;
    return this;
  }

  /**
   * 
   * @return domainRankOverview
   */
  @javax.annotation.Nullable
  public AppendixInfo getDomainRankOverview() {
    return domainRankOverview;
  }

  public void setDomainRankOverview(AppendixInfo domainRankOverview) {
    this.domainRankOverview = domainRankOverview;
  }


  public static final String SERIALIZED_NAME_DOMAIN_INTERSECTION = "domain_intersection";
  @SerializedName(SERIALIZED_NAME_DOMAIN_INTERSECTION)
  private AppendixInfo domainIntersection;

  public AppendixDataforseoLabsLimitsRatesDataInfo domainIntersection(AppendixInfo domainIntersection) {
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


  public static final String SERIALIZED_NAME_PAGE_INTERSECTION = "page_intersection";
  @SerializedName(SERIALIZED_NAME_PAGE_INTERSECTION)
  private AppendixInfo pageIntersection;

  public AppendixDataforseoLabsLimitsRatesDataInfo pageIntersection(AppendixInfo pageIntersection) {
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


  public static final String SERIALIZED_NAME_BULK_TRAFFIC_ESTIMATION = "bulk_traffic_estimation";
  @SerializedName(SERIALIZED_NAME_BULK_TRAFFIC_ESTIMATION)
  private AppendixInfo bulkTrafficEstimation;

  public AppendixDataforseoLabsLimitsRatesDataInfo bulkTrafficEstimation(AppendixInfo bulkTrafficEstimation) {
    this.bulkTrafficEstimation = bulkTrafficEstimation;
    return this;
  }

  /**
   * 
   * @return bulkTrafficEstimation
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkTrafficEstimation() {
    return bulkTrafficEstimation;
  }

  public void setBulkTrafficEstimation(AppendixInfo bulkTrafficEstimation) {
    this.bulkTrafficEstimation = bulkTrafficEstimation;
  }


  public static final String SERIALIZED_NAME_BULK_KEYWORD_DIFFICULTY = "bulk_keyword_difficulty";
  @SerializedName(SERIALIZED_NAME_BULK_KEYWORD_DIFFICULTY)
  private AppendixInfo bulkKeywordDifficulty;

  public AppendixDataforseoLabsLimitsRatesDataInfo bulkKeywordDifficulty(AppendixInfo bulkKeywordDifficulty) {
    this.bulkKeywordDifficulty = bulkKeywordDifficulty;
    return this;
  }

  /**
   * 
   * @return bulkKeywordDifficulty
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkKeywordDifficulty() {
    return bulkKeywordDifficulty;
  }

  public void setBulkKeywordDifficulty(AppendixInfo bulkKeywordDifficulty) {
    this.bulkKeywordDifficulty = bulkKeywordDifficulty;
  }


  public static final String SERIALIZED_NAME_BULK_SEARCH_VOLUME = "bulk_search_volume";
  @SerializedName(SERIALIZED_NAME_BULK_SEARCH_VOLUME)
  private AppendixInfo bulkSearchVolume;

  public AppendixDataforseoLabsLimitsRatesDataInfo bulkSearchVolume(AppendixInfo bulkSearchVolume) {
    this.bulkSearchVolume = bulkSearchVolume;
    return this;
  }

  /**
   * 
   * @return bulkSearchVolume
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkSearchVolume() {
    return bulkSearchVolume;
  }

  public void setBulkSearchVolume(AppendixInfo bulkSearchVolume) {
    this.bulkSearchVolume = bulkSearchVolume;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_SITE = "keywords_for_site";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_SITE)
  private AppendixInfo keywordsForSite;

  public AppendixDataforseoLabsLimitsRatesDataInfo keywordsForSite(AppendixInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
    return this;
  }

  /**
   * 
   * @return keywordsForSite
   */
  @javax.annotation.Nullable
  public AppendixInfo getKeywordsForSite() {
    return keywordsForSite;
  }

  public void setKeywordsForSite(AppendixInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
  }


  public static final String SERIALIZED_NAME_KEYWORD_SUGGESTIONS = "keyword_suggestions";
  @SerializedName(SERIALIZED_NAME_KEYWORD_SUGGESTIONS)
  private AppendixInfo keywordSuggestions;

  public AppendixDataforseoLabsLimitsRatesDataInfo keywordSuggestions(AppendixInfo keywordSuggestions) {
    this.keywordSuggestions = keywordSuggestions;
    return this;
  }

  /**
   * 
   * @return keywordSuggestions
   */
  @javax.annotation.Nullable
  public AppendixInfo getKeywordSuggestions() {
    return keywordSuggestions;
  }

  public void setKeywordSuggestions(AppendixInfo keywordSuggestions) {
    this.keywordSuggestions = keywordSuggestions;
  }


  public static final String SERIALIZED_NAME_KEYWORD_IDEAS = "keyword_ideas";
  @SerializedName(SERIALIZED_NAME_KEYWORD_IDEAS)
  private AppendixInfo keywordIdeas;

  public AppendixDataforseoLabsLimitsRatesDataInfo keywordIdeas(AppendixInfo keywordIdeas) {
    this.keywordIdeas = keywordIdeas;
    return this;
  }

  /**
   * 
   * @return keywordIdeas
   */
  @javax.annotation.Nullable
  public AppendixInfo getKeywordIdeas() {
    return keywordIdeas;
  }

  public void setKeywordIdeas(AppendixInfo keywordIdeas) {
    this.keywordIdeas = keywordIdeas;
  }


  public static final String SERIALIZED_NAME_HISTORICAL_SEARCH_VOLUME = "historical_search_volume";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SEARCH_VOLUME)
  private AppendixInfo historicalSearchVolume;

  public AppendixDataforseoLabsLimitsRatesDataInfo historicalSearchVolume(AppendixInfo historicalSearchVolume) {
    this.historicalSearchVolume = historicalSearchVolume;
    return this;
  }

  /**
   * 
   * @return historicalSearchVolume
   */
  @javax.annotation.Nullable
  public AppendixInfo getHistoricalSearchVolume() {
    return historicalSearchVolume;
  }

  public void setHistoricalSearchVolume(AppendixInfo historicalSearchVolume) {
    this.historicalSearchVolume = historicalSearchVolume;
  }


  public static final String SERIALIZED_NAME_CATEGORIES_FOR_DOMAIN = "categories_for_domain";
  @SerializedName(SERIALIZED_NAME_CATEGORIES_FOR_DOMAIN)
  private AppendixInfo categoriesForDomain;

  public AppendixDataforseoLabsLimitsRatesDataInfo categoriesForDomain(AppendixInfo categoriesForDomain) {
    this.categoriesForDomain = categoriesForDomain;
    return this;
  }

  /**
   * 
   * @return categoriesForDomain
   */
  @javax.annotation.Nullable
  public AppendixInfo getCategoriesForDomain() {
    return categoriesForDomain;
  }

  public void setCategoriesForDomain(AppendixInfo categoriesForDomain) {
    this.categoriesForDomain = categoriesForDomain;
  }


  public static final String SERIALIZED_NAME_DOMAIN_METRICS_BY_CATEGORIES = "domain_metrics_by_categories";
  @SerializedName(SERIALIZED_NAME_DOMAIN_METRICS_BY_CATEGORIES)
  private AppendixInfo domainMetricsByCategories;

  public AppendixDataforseoLabsLimitsRatesDataInfo domainMetricsByCategories(AppendixInfo domainMetricsByCategories) {
    this.domainMetricsByCategories = domainMetricsByCategories;
    return this;
  }

  /**
   * 
   * @return domainMetricsByCategories
   */
  @javax.annotation.Nullable
  public AppendixInfo getDomainMetricsByCategories() {
    return domainMetricsByCategories;
  }

  public void setDomainMetricsByCategories(AppendixInfo domainMetricsByCategories) {
    this.domainMetricsByCategories = domainMetricsByCategories;
  }


  public static final String SERIALIZED_NAME_TOP_SEARCHES = "top_searches";
  @SerializedName(SERIALIZED_NAME_TOP_SEARCHES)
  private AppendixInfo topSearches;

  public AppendixDataforseoLabsLimitsRatesDataInfo topSearches(AppendixInfo topSearches) {
    this.topSearches = topSearches;
    return this;
  }

  /**
   * 
   * @return topSearches
   */
  @javax.annotation.Nullable
  public AppendixInfo getTopSearches() {
    return topSearches;
  }

  public void setTopSearches(AppendixInfo topSearches) {
    this.topSearches = topSearches;
  }


  public static final String SERIALIZED_NAME_DOMAIN_WHOIS_OVERVIEW = "domain_whois_overview";
  @SerializedName(SERIALIZED_NAME_DOMAIN_WHOIS_OVERVIEW)
  private AppendixInfo domainWhoisOverview;

  public AppendixDataforseoLabsLimitsRatesDataInfo domainWhoisOverview(AppendixInfo domainWhoisOverview) {
    this.domainWhoisOverview = domainWhoisOverview;
    return this;
  }

  /**
   * 
   * @return domainWhoisOverview
   */
  @javax.annotation.Nullable
  public AppendixInfo getDomainWhoisOverview() {
    return domainWhoisOverview;
  }

  public void setDomainWhoisOverview(AppendixInfo domainWhoisOverview) {
    this.domainWhoisOverview = domainWhoisOverview;
  }


  public static final String SERIALIZED_NAME_HISTORICAL_RANK_OVERVIEW = "historical_rank_overview";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_RANK_OVERVIEW)
  private AppendixInfo historicalRankOverview;

  public AppendixDataforseoLabsLimitsRatesDataInfo historicalRankOverview(AppendixInfo historicalRankOverview) {
    this.historicalRankOverview = historicalRankOverview;
    return this;
  }

  /**
   * 
   * @return historicalRankOverview
   */
  @javax.annotation.Nullable
  public AppendixInfo getHistoricalRankOverview() {
    return historicalRankOverview;
  }

  public void setHistoricalRankOverview(AppendixInfo historicalRankOverview) {
    this.historicalRankOverview = historicalRankOverview;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_CATEGORIES = "keywords_for_categories";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_CATEGORIES)
  private AppendixInfo keywordsForCategories;

  public AppendixDataforseoLabsLimitsRatesDataInfo keywordsForCategories(AppendixInfo keywordsForCategories) {
    this.keywordsForCategories = keywordsForCategories;
    return this;
  }

  /**
   * 
   * @return keywordsForCategories
   */
  @javax.annotation.Nullable
  public AppendixInfo getKeywordsForCategories() {
    return keywordsForCategories;
  }

  public void setKeywordsForCategories(AppendixInfo keywordsForCategories) {
    this.keywordsForCategories = keywordsForCategories;
  }


  public static final String SERIALIZED_NAME_HISTORICAL_SERPS = "historical_serps";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SERPS)
  private AppendixInfo historicalSerps;

  public AppendixDataforseoLabsLimitsRatesDataInfo historicalSerps(AppendixInfo historicalSerps) {
    this.historicalSerps = historicalSerps;
    return this;
  }

  /**
   * 
   * @return historicalSerps
   */
  @javax.annotation.Nullable
  public AppendixInfo getHistoricalSerps() {
    return historicalSerps;
  }

  public void setHistoricalSerps(AppendixInfo historicalSerps) {
    this.historicalSerps = historicalSerps;
  }


  public static final String SERIALIZED_NAME_APP_COMPETITORS = "app_competitors";
  @SerializedName(SERIALIZED_NAME_APP_COMPETITORS)
  private AppendixInfo appCompetitors;

  public AppendixDataforseoLabsLimitsRatesDataInfo appCompetitors(AppendixInfo appCompetitors) {
    this.appCompetitors = appCompetitors;
    return this;
  }

  /**
   * 
   * @return appCompetitors
   */
  @javax.annotation.Nullable
  public AppendixInfo getAppCompetitors() {
    return appCompetitors;
  }

  public void setAppCompetitors(AppendixInfo appCompetitors) {
    this.appCompetitors = appCompetitors;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_APP = "keywords_for_app";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_APP)
  private AppendixInfo keywordsForApp;

  public AppendixDataforseoLabsLimitsRatesDataInfo keywordsForApp(AppendixInfo keywordsForApp) {
    this.keywordsForApp = keywordsForApp;
    return this;
  }

  /**
   * 
   * @return keywordsForApp
   */
  @javax.annotation.Nullable
  public AppendixInfo getKeywordsForApp() {
    return keywordsForApp;
  }

  public void setKeywordsForApp(AppendixInfo keywordsForApp) {
    this.keywordsForApp = keywordsForApp;
  }


  public static final String SERIALIZED_NAME_APP_INTERSECTION = "app_intersection";
  @SerializedName(SERIALIZED_NAME_APP_INTERSECTION)
  private AppendixInfo appIntersection;

  public AppendixDataforseoLabsLimitsRatesDataInfo appIntersection(AppendixInfo appIntersection) {
    this.appIntersection = appIntersection;
    return this;
  }

  /**
   * 
   * @return appIntersection
   */
  @javax.annotation.Nullable
  public AppendixInfo getAppIntersection() {
    return appIntersection;
  }

  public void setAppIntersection(AppendixInfo appIntersection) {
    this.appIntersection = appIntersection;
  }


  public static final String SERIALIZED_NAME_BULK_APP_METRICS = "bulk_app_metrics";
  @SerializedName(SERIALIZED_NAME_BULK_APP_METRICS)
  private AppendixInfo bulkAppMetrics;

  public AppendixDataforseoLabsLimitsRatesDataInfo bulkAppMetrics(AppendixInfo bulkAppMetrics) {
    this.bulkAppMetrics = bulkAppMetrics;
    return this;
  }

  /**
   * 
   * @return bulkAppMetrics
   */
  @javax.annotation.Nullable
  public AppendixInfo getBulkAppMetrics() {
    return bulkAppMetrics;
  }

  public void setBulkAppMetrics(AppendixInfo bulkAppMetrics) {
    this.bulkAppMetrics = bulkAppMetrics;
  }


  public static final String SERIALIZED_NAME_SEARCH_INTENT = "search_intent";
  @SerializedName(SERIALIZED_NAME_SEARCH_INTENT)
  private AppendixInfo searchIntent;

  public AppendixDataforseoLabsLimitsRatesDataInfo searchIntent(AppendixInfo searchIntent) {
    this.searchIntent = searchIntent;
    return this;
  }

  /**
   * 
   * @return searchIntent
   */
  @javax.annotation.Nullable
  public AppendixInfo getSearchIntent() {
    return searchIntent;
  }

  public void setSearchIntent(AppendixInfo searchIntent) {
    this.searchIntent = searchIntent;
  }


  public static final String SERIALIZED_NAME_HISTORICAL_BULK_TRAFFIC_ESTIMATION = "historical_bulk_traffic_estimation";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_BULK_TRAFFIC_ESTIMATION)
  private AppendixInfo historicalBulkTrafficEstimation;

  public AppendixDataforseoLabsLimitsRatesDataInfo historicalBulkTrafficEstimation(AppendixInfo historicalBulkTrafficEstimation) {
    this.historicalBulkTrafficEstimation = historicalBulkTrafficEstimation;
    return this;
  }

  /**
   * 
   * @return historicalBulkTrafficEstimation
   */
  @javax.annotation.Nullable
  public AppendixInfo getHistoricalBulkTrafficEstimation() {
    return historicalBulkTrafficEstimation;
  }

  public void setHistoricalBulkTrafficEstimation(AppendixInfo historicalBulkTrafficEstimation) {
    this.historicalBulkTrafficEstimation = historicalBulkTrafficEstimation;
  }


  public static final String SERIALIZED_NAME_CATEGORIES_FOR_KEYWORDS = "categories_for_keywords";
  @SerializedName(SERIALIZED_NAME_CATEGORIES_FOR_KEYWORDS)
  private AppendixInfo categoriesForKeywords;

  public AppendixDataforseoLabsLimitsRatesDataInfo categoriesForKeywords(AppendixInfo categoriesForKeywords) {
    this.categoriesForKeywords = categoriesForKeywords;
    return this;
  }

  /**
   * 
   * @return categoriesForKeywords
   */
  @javax.annotation.Nullable
  public AppendixInfo getCategoriesForKeywords() {
    return categoriesForKeywords;
  }

  public void setCategoriesForKeywords(AppendixInfo categoriesForKeywords) {
    this.categoriesForKeywords = categoriesForKeywords;
  }


  public static final String SERIALIZED_NAME_KEYWORD_OVERVIEW = "keyword_overview";
  @SerializedName(SERIALIZED_NAME_KEYWORD_OVERVIEW)
  private AppendixInfo keywordOverview;

  public AppendixDataforseoLabsLimitsRatesDataInfo keywordOverview(AppendixInfo keywordOverview) {
    this.keywordOverview = keywordOverview;
    return this;
  }

  /**
   * 
   * @return keywordOverview
   */
  @javax.annotation.Nullable
  public AppendixInfo getKeywordOverview() {
    return keywordOverview;
  }

  public void setKeywordOverview(AppendixInfo keywordOverview) {
    this.keywordOverview = keywordOverview;
  }


  public static final String SERIALIZED_NAME_HISTORICAL_KEYWORD_DATA = "historical_keyword_data";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_KEYWORD_DATA)
  private AppendixInfo historicalKeywordData;

  public AppendixDataforseoLabsLimitsRatesDataInfo historicalKeywordData(AppendixInfo historicalKeywordData) {
    this.historicalKeywordData = historicalKeywordData;
    return this;
  }

  /**
   * 
   * @return historicalKeywordData
   */
  @javax.annotation.Nullable
  public AppendixInfo getHistoricalKeywordData() {
    return historicalKeywordData;
  }

  public void setHistoricalKeywordData(AppendixInfo historicalKeywordData) {
    this.historicalKeywordData = historicalKeywordData;
  }



  public AppendixDataforseoLabsLimitsRatesDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixDataforseoLabsLimitsRatesDataInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixDataforseoLabsLimitsRatesDataInfo appendixDataforseoLabsLimitsRatesDataInfo = (AppendixDataforseoLabsLimitsRatesDataInfo) o;
    return

        Objects.equals(this.locationsAndLanguages, appendixDataforseoLabsLimitsRatesDataInfo.locationsAndLanguages) &&
        Objects.equals(this.categories, appendixDataforseoLabsLimitsRatesDataInfo.categories) &&
        Objects.equals(this.errors, appendixDataforseoLabsLimitsRatesDataInfo.errors) &&
        Objects.equals(this.productCompetitors, appendixDataforseoLabsLimitsRatesDataInfo.productCompetitors) &&
        Objects.equals(this.productKeywordIntersections, appendixDataforseoLabsLimitsRatesDataInfo.productKeywordIntersections) &&
        Objects.equals(this.productRankOverview, appendixDataforseoLabsLimitsRatesDataInfo.productRankOverview) &&
        Objects.equals(this.rankedKeywords, appendixDataforseoLabsLimitsRatesDataInfo.rankedKeywords) &&
        Objects.equals(this.serpCompetitors, appendixDataforseoLabsLimitsRatesDataInfo.serpCompetitors) &&
        Objects.equals(this.subdomains, appendixDataforseoLabsLimitsRatesDataInfo.subdomains) &&
        Objects.equals(this.relevantPages, appendixDataforseoLabsLimitsRatesDataInfo.relevantPages) &&
        Objects.equals(this.competitorsDomain, appendixDataforseoLabsLimitsRatesDataInfo.competitorsDomain) &&
        Objects.equals(this.relatedKeywords, appendixDataforseoLabsLimitsRatesDataInfo.relatedKeywords) &&
        Objects.equals(this.domainRankOverview, appendixDataforseoLabsLimitsRatesDataInfo.domainRankOverview) &&
        Objects.equals(this.domainIntersection, appendixDataforseoLabsLimitsRatesDataInfo.domainIntersection) &&
        Objects.equals(this.pageIntersection, appendixDataforseoLabsLimitsRatesDataInfo.pageIntersection) &&
        Objects.equals(this.bulkTrafficEstimation, appendixDataforseoLabsLimitsRatesDataInfo.bulkTrafficEstimation) &&
        Objects.equals(this.bulkKeywordDifficulty, appendixDataforseoLabsLimitsRatesDataInfo.bulkKeywordDifficulty) &&
        Objects.equals(this.bulkSearchVolume, appendixDataforseoLabsLimitsRatesDataInfo.bulkSearchVolume) &&
        Objects.equals(this.keywordsForSite, appendixDataforseoLabsLimitsRatesDataInfo.keywordsForSite) &&
        Objects.equals(this.keywordSuggestions, appendixDataforseoLabsLimitsRatesDataInfo.keywordSuggestions) &&
        Objects.equals(this.keywordIdeas, appendixDataforseoLabsLimitsRatesDataInfo.keywordIdeas) &&
        Objects.equals(this.historicalSearchVolume, appendixDataforseoLabsLimitsRatesDataInfo.historicalSearchVolume) &&
        Objects.equals(this.categoriesForDomain, appendixDataforseoLabsLimitsRatesDataInfo.categoriesForDomain) &&
        Objects.equals(this.domainMetricsByCategories, appendixDataforseoLabsLimitsRatesDataInfo.domainMetricsByCategories) &&
        Objects.equals(this.topSearches, appendixDataforseoLabsLimitsRatesDataInfo.topSearches) &&
        Objects.equals(this.domainWhoisOverview, appendixDataforseoLabsLimitsRatesDataInfo.domainWhoisOverview) &&
        Objects.equals(this.historicalRankOverview, appendixDataforseoLabsLimitsRatesDataInfo.historicalRankOverview) &&
        Objects.equals(this.keywordsForCategories, appendixDataforseoLabsLimitsRatesDataInfo.keywordsForCategories) &&
        Objects.equals(this.historicalSerps, appendixDataforseoLabsLimitsRatesDataInfo.historicalSerps) &&
        Objects.equals(this.appCompetitors, appendixDataforseoLabsLimitsRatesDataInfo.appCompetitors) &&
        Objects.equals(this.keywordsForApp, appendixDataforseoLabsLimitsRatesDataInfo.keywordsForApp) &&
        Objects.equals(this.appIntersection, appendixDataforseoLabsLimitsRatesDataInfo.appIntersection) &&
        Objects.equals(this.bulkAppMetrics, appendixDataforseoLabsLimitsRatesDataInfo.bulkAppMetrics) &&
        Objects.equals(this.searchIntent, appendixDataforseoLabsLimitsRatesDataInfo.searchIntent) &&
        Objects.equals(this.historicalBulkTrafficEstimation, appendixDataforseoLabsLimitsRatesDataInfo.historicalBulkTrafficEstimation) &&
        Objects.equals(this.categoriesForKeywords, appendixDataforseoLabsLimitsRatesDataInfo.categoriesForKeywords) &&
        Objects.equals(this.keywordOverview, appendixDataforseoLabsLimitsRatesDataInfo.keywordOverview) &&
        Objects.equals(this.historicalKeywordData, appendixDataforseoLabsLimitsRatesDataInfo.historicalKeywordData);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(locationsAndLanguages, categories, errors, productCompetitors, productKeywordIntersections, productRankOverview, rankedKeywords, serpCompetitors, subdomains, relevantPages, competitorsDomain, relatedKeywords, domainRankOverview, domainIntersection, pageIntersection, bulkTrafficEstimation, bulkKeywordDifficulty, bulkSearchVolume, keywordsForSite, keywordSuggestions, keywordIdeas, historicalSearchVolume, categoriesForDomain, domainMetricsByCategories, topSearches, domainWhoisOverview, historicalRankOverview, keywordsForCategories, historicalSerps, appCompetitors, keywordsForApp, appIntersection, bulkAppMetrics, searchIntent, historicalBulkTrafficEstimation, categoriesForKeywords, keywordOverview, historicalKeywordData);
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
    sb.append("class AppendixDataforseoLabsLimitsRatesDataInfo {\n");

    sb.append("    locationsAndLanguages: ").append(toIndentedString(locationsAndLanguages)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    productCompetitors: ").append(toIndentedString(productCompetitors)).append("\n");
    sb.append("    productKeywordIntersections: ").append(toIndentedString(productKeywordIntersections)).append("\n");
    sb.append("    productRankOverview: ").append(toIndentedString(productRankOverview)).append("\n");
    sb.append("    rankedKeywords: ").append(toIndentedString(rankedKeywords)).append("\n");
    sb.append("    serpCompetitors: ").append(toIndentedString(serpCompetitors)).append("\n");
    sb.append("    subdomains: ").append(toIndentedString(subdomains)).append("\n");
    sb.append("    relevantPages: ").append(toIndentedString(relevantPages)).append("\n");
    sb.append("    competitorsDomain: ").append(toIndentedString(competitorsDomain)).append("\n");
    sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
    sb.append("    domainRankOverview: ").append(toIndentedString(domainRankOverview)).append("\n");
    sb.append("    domainIntersection: ").append(toIndentedString(domainIntersection)).append("\n");
    sb.append("    pageIntersection: ").append(toIndentedString(pageIntersection)).append("\n");
    sb.append("    bulkTrafficEstimation: ").append(toIndentedString(bulkTrafficEstimation)).append("\n");
    sb.append("    bulkKeywordDifficulty: ").append(toIndentedString(bulkKeywordDifficulty)).append("\n");
    sb.append("    bulkSearchVolume: ").append(toIndentedString(bulkSearchVolume)).append("\n");
    sb.append("    keywordsForSite: ").append(toIndentedString(keywordsForSite)).append("\n");
    sb.append("    keywordSuggestions: ").append(toIndentedString(keywordSuggestions)).append("\n");
    sb.append("    keywordIdeas: ").append(toIndentedString(keywordIdeas)).append("\n");
    sb.append("    historicalSearchVolume: ").append(toIndentedString(historicalSearchVolume)).append("\n");
    sb.append("    categoriesForDomain: ").append(toIndentedString(categoriesForDomain)).append("\n");
    sb.append("    domainMetricsByCategories: ").append(toIndentedString(domainMetricsByCategories)).append("\n");
    sb.append("    topSearches: ").append(toIndentedString(topSearches)).append("\n");
    sb.append("    domainWhoisOverview: ").append(toIndentedString(domainWhoisOverview)).append("\n");
    sb.append("    historicalRankOverview: ").append(toIndentedString(historicalRankOverview)).append("\n");
    sb.append("    keywordsForCategories: ").append(toIndentedString(keywordsForCategories)).append("\n");
    sb.append("    historicalSerps: ").append(toIndentedString(historicalSerps)).append("\n");
    sb.append("    appCompetitors: ").append(toIndentedString(appCompetitors)).append("\n");
    sb.append("    keywordsForApp: ").append(toIndentedString(keywordsForApp)).append("\n");
    sb.append("    appIntersection: ").append(toIndentedString(appIntersection)).append("\n");
    sb.append("    bulkAppMetrics: ").append(toIndentedString(bulkAppMetrics)).append("\n");
    sb.append("    searchIntent: ").append(toIndentedString(searchIntent)).append("\n");
    sb.append("    historicalBulkTrafficEstimation: ").append(toIndentedString(historicalBulkTrafficEstimation)).append("\n");
    sb.append("    categoriesForKeywords: ").append(toIndentedString(categoriesForKeywords)).append("\n");
    sb.append("    keywordOverview: ").append(toIndentedString(keywordOverview)).append("\n");
    sb.append("    historicalKeywordData: ").append(toIndentedString(historicalKeywordData)).append("\n");
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
    
    openapiFields.add("locations_and_languages");
    
    openapiFields.add("categories");
    
    openapiFields.add("errors");
    
    openapiFields.add("product_competitors");
    
    openapiFields.add("product_keyword_intersections");
    
    openapiFields.add("product_rank_overview");
    
    openapiFields.add("ranked_keywords");
    
    openapiFields.add("serp_competitors");
    
    openapiFields.add("subdomains");
    
    openapiFields.add("relevant_pages");
    
    openapiFields.add("competitors_domain");
    
    openapiFields.add("related_keywords");
    
    openapiFields.add("domain_rank_overview");
    
    openapiFields.add("domain_intersection");
    
    openapiFields.add("page_intersection");
    
    openapiFields.add("bulk_traffic_estimation");
    
    openapiFields.add("bulk_keyword_difficulty");
    
    openapiFields.add("bulk_search_volume");
    
    openapiFields.add("keywords_for_site");
    
    openapiFields.add("keyword_suggestions");
    
    openapiFields.add("keyword_ideas");
    
    openapiFields.add("historical_search_volume");
    
    openapiFields.add("categories_for_domain");
    
    openapiFields.add("domain_metrics_by_categories");
    
    openapiFields.add("top_searches");
    
    openapiFields.add("domain_whois_overview");
    
    openapiFields.add("historical_rank_overview");
    
    openapiFields.add("keywords_for_categories");
    
    openapiFields.add("historical_serps");
    
    openapiFields.add("app_competitors");
    
    openapiFields.add("keywords_for_app");
    
    openapiFields.add("app_intersection");
    
    openapiFields.add("bulk_app_metrics");
    
    openapiFields.add("search_intent");
    
    openapiFields.add("historical_bulk_traffic_estimation");
    
    openapiFields.add("categories_for_keywords");
    
    openapiFields.add("keyword_overview");
    
    openapiFields.add("historical_keyword_data");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixDataforseoLabsLimitsRatesDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixDataforseoLabsLimitsRatesDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixDataforseoLabsLimitsRatesDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixDataforseoLabsLimitsRatesDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixDataforseoLabsLimitsRatesDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixDataforseoLabsLimitsRatesDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixDataforseoLabsLimitsRatesDataInfo value) throws IOException {
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
           public AppendixDataforseoLabsLimitsRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixDataforseoLabsLimitsRatesDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixDataforseoLabsLimitsRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixDataforseoLabsLimitsRatesDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
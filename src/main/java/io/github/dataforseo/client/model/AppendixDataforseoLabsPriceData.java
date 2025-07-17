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



public class AppendixDataforseoLabsPriceData  {


  public static final String SERIALIZED_NAME_APP_COMPETITORS = "app_competitors";
  @SerializedName(SERIALIZED_NAME_APP_COMPETITORS)
  private AppendixBingKeywordsDataPriceDataInfo appCompetitors;

  public AppendixDataforseoLabsPriceData appCompetitors(AppendixBingKeywordsDataPriceDataInfo appCompetitors) {
    this.appCompetitors = appCompetitors;
    return this;
  }

  /**
   * 
   * @return appCompetitors
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getAppCompetitors() {
    return appCompetitors;
  }

  public void setAppCompetitors(AppendixBingKeywordsDataPriceDataInfo appCompetitors) {
    this.appCompetitors = appCompetitors;
  }


  public static final String SERIALIZED_NAME_APP_INTERSECTION = "app_intersection";
  @SerializedName(SERIALIZED_NAME_APP_INTERSECTION)
  private AppendixBingKeywordsDataPriceDataInfo appIntersection;

  public AppendixDataforseoLabsPriceData appIntersection(AppendixBingKeywordsDataPriceDataInfo appIntersection) {
    this.appIntersection = appIntersection;
    return this;
  }

  /**
   * 
   * @return appIntersection
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getAppIntersection() {
    return appIntersection;
  }

  public void setAppIntersection(AppendixBingKeywordsDataPriceDataInfo appIntersection) {
    this.appIntersection = appIntersection;
  }


  public static final String SERIALIZED_NAME_BULK_APP_METRICS = "bulk_app_metrics";
  @SerializedName(SERIALIZED_NAME_BULK_APP_METRICS)
  private AppendixBingKeywordsDataPriceDataInfo bulkAppMetrics;

  public AppendixDataforseoLabsPriceData bulkAppMetrics(AppendixBingKeywordsDataPriceDataInfo bulkAppMetrics) {
    this.bulkAppMetrics = bulkAppMetrics;
    return this;
  }

  /**
   * 
   * @return bulkAppMetrics
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkAppMetrics() {
    return bulkAppMetrics;
  }

  public void setBulkAppMetrics(AppendixBingKeywordsDataPriceDataInfo bulkAppMetrics) {
    this.bulkAppMetrics = bulkAppMetrics;
  }


  public static final String SERIALIZED_NAME_BULK_KEYWORD_DIFFICULTY = "bulk_keyword_difficulty";
  @SerializedName(SERIALIZED_NAME_BULK_KEYWORD_DIFFICULTY)
  private AppendixBingKeywordsDataPriceDataInfo bulkKeywordDifficulty;

  public AppendixDataforseoLabsPriceData bulkKeywordDifficulty(AppendixBingKeywordsDataPriceDataInfo bulkKeywordDifficulty) {
    this.bulkKeywordDifficulty = bulkKeywordDifficulty;
    return this;
  }

  /**
   * 
   * @return bulkKeywordDifficulty
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkKeywordDifficulty() {
    return bulkKeywordDifficulty;
  }

  public void setBulkKeywordDifficulty(AppendixBingKeywordsDataPriceDataInfo bulkKeywordDifficulty) {
    this.bulkKeywordDifficulty = bulkKeywordDifficulty;
  }


  public static final String SERIALIZED_NAME_BULK_SEARCH_VOLUME = "bulk_search_volume";
  @SerializedName(SERIALIZED_NAME_BULK_SEARCH_VOLUME)
  private AppendixBingKeywordsDataPriceDataInfo bulkSearchVolume;

  public AppendixDataforseoLabsPriceData bulkSearchVolume(AppendixBingKeywordsDataPriceDataInfo bulkSearchVolume) {
    this.bulkSearchVolume = bulkSearchVolume;
    return this;
  }

  /**
   * 
   * @return bulkSearchVolume
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkSearchVolume() {
    return bulkSearchVolume;
  }

  public void setBulkSearchVolume(AppendixBingKeywordsDataPriceDataInfo bulkSearchVolume) {
    this.bulkSearchVolume = bulkSearchVolume;
  }


  public static final String SERIALIZED_NAME_BULK_TRAFFIC_ESTIMATION = "bulk_traffic_estimation";
  @SerializedName(SERIALIZED_NAME_BULK_TRAFFIC_ESTIMATION)
  private AppendixBingKeywordsDataPriceDataInfo bulkTrafficEstimation;

  public AppendixDataforseoLabsPriceData bulkTrafficEstimation(AppendixBingKeywordsDataPriceDataInfo bulkTrafficEstimation) {
    this.bulkTrafficEstimation = bulkTrafficEstimation;
    return this;
  }

  /**
   * 
   * @return bulkTrafficEstimation
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getBulkTrafficEstimation() {
    return bulkTrafficEstimation;
  }

  public void setBulkTrafficEstimation(AppendixBingKeywordsDataPriceDataInfo bulkTrafficEstimation) {
    this.bulkTrafficEstimation = bulkTrafficEstimation;
  }


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private AppendixTaskKeywordsDataPriceDataInfo categories;

  public AppendixDataforseoLabsPriceData categories(AppendixTaskKeywordsDataPriceDataInfo categories) {
    this.categories = categories;
    return this;
  }

  /**
   * 
   * @return categories
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getCategories() {
    return categories;
  }

  public void setCategories(AppendixTaskKeywordsDataPriceDataInfo categories) {
    this.categories = categories;
  }


  public static final String SERIALIZED_NAME_CATEGORIES_FOR_DOMAIN = "categories_for_domain";
  @SerializedName(SERIALIZED_NAME_CATEGORIES_FOR_DOMAIN)
  private AppendixBingKeywordsDataPriceDataInfo categoriesForDomain;

  public AppendixDataforseoLabsPriceData categoriesForDomain(AppendixBingKeywordsDataPriceDataInfo categoriesForDomain) {
    this.categoriesForDomain = categoriesForDomain;
    return this;
  }

  /**
   * 
   * @return categoriesForDomain
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getCategoriesForDomain() {
    return categoriesForDomain;
  }

  public void setCategoriesForDomain(AppendixBingKeywordsDataPriceDataInfo categoriesForDomain) {
    this.categoriesForDomain = categoriesForDomain;
  }


  public static final String SERIALIZED_NAME_CATEGORIES_FOR_KEYWORDS = "categories_for_keywords";
  @SerializedName(SERIALIZED_NAME_CATEGORIES_FOR_KEYWORDS)
  private AppendixBingKeywordsDataPriceDataInfo categoriesForKeywords;

  public AppendixDataforseoLabsPriceData categoriesForKeywords(AppendixBingKeywordsDataPriceDataInfo categoriesForKeywords) {
    this.categoriesForKeywords = categoriesForKeywords;
    return this;
  }

  /**
   * 
   * @return categoriesForKeywords
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getCategoriesForKeywords() {
    return categoriesForKeywords;
  }

  public void setCategoriesForKeywords(AppendixBingKeywordsDataPriceDataInfo categoriesForKeywords) {
    this.categoriesForKeywords = categoriesForKeywords;
  }


  public static final String SERIALIZED_NAME_COMPETITORS_DOMAIN = "competitors_domain";
  @SerializedName(SERIALIZED_NAME_COMPETITORS_DOMAIN)
  private AppendixBingKeywordsDataPriceDataInfo competitorsDomain;

  public AppendixDataforseoLabsPriceData competitorsDomain(AppendixBingKeywordsDataPriceDataInfo competitorsDomain) {
    this.competitorsDomain = competitorsDomain;
    return this;
  }

  /**
   * 
   * @return competitorsDomain
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getCompetitorsDomain() {
    return competitorsDomain;
  }

  public void setCompetitorsDomain(AppendixBingKeywordsDataPriceDataInfo competitorsDomain) {
    this.competitorsDomain = competitorsDomain;
  }


  public static final String SERIALIZED_NAME_DOMAIN_INTERSECTION = "domain_intersection";
  @SerializedName(SERIALIZED_NAME_DOMAIN_INTERSECTION)
  private AppendixBingKeywordsDataPriceDataInfo domainIntersection;

  public AppendixDataforseoLabsPriceData domainIntersection(AppendixBingKeywordsDataPriceDataInfo domainIntersection) {
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


  public static final String SERIALIZED_NAME_DOMAIN_METRICS_BY_CATEGORIES = "domain_metrics_by_categories";
  @SerializedName(SERIALIZED_NAME_DOMAIN_METRICS_BY_CATEGORIES)
  private AppendixBingKeywordsDataPriceDataInfo domainMetricsByCategories;

  public AppendixDataforseoLabsPriceData domainMetricsByCategories(AppendixBingKeywordsDataPriceDataInfo domainMetricsByCategories) {
    this.domainMetricsByCategories = domainMetricsByCategories;
    return this;
  }

  /**
   * 
   * @return domainMetricsByCategories
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getDomainMetricsByCategories() {
    return domainMetricsByCategories;
  }

  public void setDomainMetricsByCategories(AppendixBingKeywordsDataPriceDataInfo domainMetricsByCategories) {
    this.domainMetricsByCategories = domainMetricsByCategories;
  }


  public static final String SERIALIZED_NAME_DOMAIN_RANK_OVERVIEW = "domain_rank_overview";
  @SerializedName(SERIALIZED_NAME_DOMAIN_RANK_OVERVIEW)
  private AppendixBingKeywordsDataPriceDataInfo domainRankOverview;

  public AppendixDataforseoLabsPriceData domainRankOverview(AppendixBingKeywordsDataPriceDataInfo domainRankOverview) {
    this.domainRankOverview = domainRankOverview;
    return this;
  }

  /**
   * 
   * @return domainRankOverview
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getDomainRankOverview() {
    return domainRankOverview;
  }

  public void setDomainRankOverview(AppendixBingKeywordsDataPriceDataInfo domainRankOverview) {
    this.domainRankOverview = domainRankOverview;
  }


  public static final String SERIALIZED_NAME_DOMAIN_WHOIS_OVERVIEW = "domain_whois_overview";
  @SerializedName(SERIALIZED_NAME_DOMAIN_WHOIS_OVERVIEW)
  private AppendixBingKeywordsDataPriceDataInfo domainWhoisOverview;

  public AppendixDataforseoLabsPriceData domainWhoisOverview(AppendixBingKeywordsDataPriceDataInfo domainWhoisOverview) {
    this.domainWhoisOverview = domainWhoisOverview;
    return this;
  }

  /**
   * 
   * @return domainWhoisOverview
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getDomainWhoisOverview() {
    return domainWhoisOverview;
  }

  public void setDomainWhoisOverview(AppendixBingKeywordsDataPriceDataInfo domainWhoisOverview) {
    this.domainWhoisOverview = domainWhoisOverview;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public AppendixDataforseoLabsPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
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


  public static final String SERIALIZED_NAME_HISTORICAL_BULK_TRAFFIC_ESTIMATION = "historical_bulk_traffic_estimation";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_BULK_TRAFFIC_ESTIMATION)
  private AppendixBingKeywordsDataPriceDataInfo historicalBulkTrafficEstimation;

  public AppendixDataforseoLabsPriceData historicalBulkTrafficEstimation(AppendixBingKeywordsDataPriceDataInfo historicalBulkTrafficEstimation) {
    this.historicalBulkTrafficEstimation = historicalBulkTrafficEstimation;
    return this;
  }

  /**
   * 
   * @return historicalBulkTrafficEstimation
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getHistoricalBulkTrafficEstimation() {
    return historicalBulkTrafficEstimation;
  }

  public void setHistoricalBulkTrafficEstimation(AppendixBingKeywordsDataPriceDataInfo historicalBulkTrafficEstimation) {
    this.historicalBulkTrafficEstimation = historicalBulkTrafficEstimation;
  }


  public static final String SERIALIZED_NAME_HISTORICAL_KEYWORD_DATA = "historical_keyword_data";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_KEYWORD_DATA)
  private AppendixBingKeywordsDataPriceDataInfo historicalKeywordData;

  public AppendixDataforseoLabsPriceData historicalKeywordData(AppendixBingKeywordsDataPriceDataInfo historicalKeywordData) {
    this.historicalKeywordData = historicalKeywordData;
    return this;
  }

  /**
   * 
   * @return historicalKeywordData
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getHistoricalKeywordData() {
    return historicalKeywordData;
  }

  public void setHistoricalKeywordData(AppendixBingKeywordsDataPriceDataInfo historicalKeywordData) {
    this.historicalKeywordData = historicalKeywordData;
  }


  public static final String SERIALIZED_NAME_HISTORICAL_RANK_OVERVIEW = "historical_rank_overview";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_RANK_OVERVIEW)
  private AppendixBingKeywordsDataPriceDataInfo historicalRankOverview;

  public AppendixDataforseoLabsPriceData historicalRankOverview(AppendixBingKeywordsDataPriceDataInfo historicalRankOverview) {
    this.historicalRankOverview = historicalRankOverview;
    return this;
  }

  /**
   * 
   * @return historicalRankOverview
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getHistoricalRankOverview() {
    return historicalRankOverview;
  }

  public void setHistoricalRankOverview(AppendixBingKeywordsDataPriceDataInfo historicalRankOverview) {
    this.historicalRankOverview = historicalRankOverview;
  }


  public static final String SERIALIZED_NAME_HISTORICAL_SEARCH_VOLUME = "historical_search_volume";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SEARCH_VOLUME)
  private AppendixBingKeywordsDataPriceDataInfo historicalSearchVolume;

  public AppendixDataforseoLabsPriceData historicalSearchVolume(AppendixBingKeywordsDataPriceDataInfo historicalSearchVolume) {
    this.historicalSearchVolume = historicalSearchVolume;
    return this;
  }

  /**
   * 
   * @return historicalSearchVolume
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getHistoricalSearchVolume() {
    return historicalSearchVolume;
  }

  public void setHistoricalSearchVolume(AppendixBingKeywordsDataPriceDataInfo historicalSearchVolume) {
    this.historicalSearchVolume = historicalSearchVolume;
  }


  public static final String SERIALIZED_NAME_HISTORICAL_SERPS = "historical_serps";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SERPS)
  private AppendixBingKeywordsDataPriceDataInfo historicalSerps;

  public AppendixDataforseoLabsPriceData historicalSerps(AppendixBingKeywordsDataPriceDataInfo historicalSerps) {
    this.historicalSerps = historicalSerps;
    return this;
  }

  /**
   * 
   * @return historicalSerps
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getHistoricalSerps() {
    return historicalSerps;
  }

  public void setHistoricalSerps(AppendixBingKeywordsDataPriceDataInfo historicalSerps) {
    this.historicalSerps = historicalSerps;
  }


  public static final String SERIALIZED_NAME_KEYWORD_IDEAS = "keyword_ideas";
  @SerializedName(SERIALIZED_NAME_KEYWORD_IDEAS)
  private AppendixBingKeywordsDataPriceDataInfo keywordIdeas;

  public AppendixDataforseoLabsPriceData keywordIdeas(AppendixBingKeywordsDataPriceDataInfo keywordIdeas) {
    this.keywordIdeas = keywordIdeas;
    return this;
  }

  /**
   * 
   * @return keywordIdeas
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordIdeas() {
    return keywordIdeas;
  }

  public void setKeywordIdeas(AppendixBingKeywordsDataPriceDataInfo keywordIdeas) {
    this.keywordIdeas = keywordIdeas;
  }


  public static final String SERIALIZED_NAME_KEYWORD_OVERVIEW = "keyword_overview";
  @SerializedName(SERIALIZED_NAME_KEYWORD_OVERVIEW)
  private AppendixBingKeywordsDataPriceDataInfo keywordOverview;

  public AppendixDataforseoLabsPriceData keywordOverview(AppendixBingKeywordsDataPriceDataInfo keywordOverview) {
    this.keywordOverview = keywordOverview;
    return this;
  }

  /**
   * 
   * @return keywordOverview
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordOverview() {
    return keywordOverview;
  }

  public void setKeywordOverview(AppendixBingKeywordsDataPriceDataInfo keywordOverview) {
    this.keywordOverview = keywordOverview;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_APP = "keywords_for_app";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_APP)
  private AppendixBingKeywordsDataPriceDataInfo keywordsForApp;

  public AppendixDataforseoLabsPriceData keywordsForApp(AppendixBingKeywordsDataPriceDataInfo keywordsForApp) {
    this.keywordsForApp = keywordsForApp;
    return this;
  }

  /**
   * 
   * @return keywordsForApp
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordsForApp() {
    return keywordsForApp;
  }

  public void setKeywordsForApp(AppendixBingKeywordsDataPriceDataInfo keywordsForApp) {
    this.keywordsForApp = keywordsForApp;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_CATEGORIES = "keywords_for_categories";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_CATEGORIES)
  private AppendixBingKeywordsDataPriceDataInfo keywordsForCategories;

  public AppendixDataforseoLabsPriceData keywordsForCategories(AppendixBingKeywordsDataPriceDataInfo keywordsForCategories) {
    this.keywordsForCategories = keywordsForCategories;
    return this;
  }

  /**
   * 
   * @return keywordsForCategories
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordsForCategories() {
    return keywordsForCategories;
  }

  public void setKeywordsForCategories(AppendixBingKeywordsDataPriceDataInfo keywordsForCategories) {
    this.keywordsForCategories = keywordsForCategories;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_SITE = "keywords_for_site";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_SITE)
  private AppendixBingKeywordsDataPriceDataInfo keywordsForSite;

  public AppendixDataforseoLabsPriceData keywordsForSite(AppendixBingKeywordsDataPriceDataInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
    return this;
  }

  /**
   * 
   * @return keywordsForSite
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordsForSite() {
    return keywordsForSite;
  }

  public void setKeywordsForSite(AppendixBingKeywordsDataPriceDataInfo keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
  }


  public static final String SERIALIZED_NAME_KEYWORD_SUGGESTIONS = "keyword_suggestions";
  @SerializedName(SERIALIZED_NAME_KEYWORD_SUGGESTIONS)
  private AppendixBingKeywordsDataPriceDataInfo keywordSuggestions;

  public AppendixDataforseoLabsPriceData keywordSuggestions(AppendixBingKeywordsDataPriceDataInfo keywordSuggestions) {
    this.keywordSuggestions = keywordSuggestions;
    return this;
  }

  /**
   * 
   * @return keywordSuggestions
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getKeywordSuggestions() {
    return keywordSuggestions;
  }

  public void setKeywordSuggestions(AppendixBingKeywordsDataPriceDataInfo keywordSuggestions) {
    this.keywordSuggestions = keywordSuggestions;
  }


  public static final String SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES = "locations_and_languages";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_AND_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo locationsAndLanguages;

  public AppendixDataforseoLabsPriceData locationsAndLanguages(AppendixTaskKeywordsDataPriceDataInfo locationsAndLanguages) {
    this.locationsAndLanguages = locationsAndLanguages;
    return this;
  }

  /**
   * 
   * @return locationsAndLanguages
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLocationsAndLanguages() {
    return locationsAndLanguages;
  }

  public void setLocationsAndLanguages(AppendixTaskKeywordsDataPriceDataInfo locationsAndLanguages) {
    this.locationsAndLanguages = locationsAndLanguages;
  }


  public static final String SERIALIZED_NAME_PAGE_INTERSECTION = "page_intersection";
  @SerializedName(SERIALIZED_NAME_PAGE_INTERSECTION)
  private AppendixBingKeywordsDataPriceDataInfo pageIntersection;

  public AppendixDataforseoLabsPriceData pageIntersection(AppendixBingKeywordsDataPriceDataInfo pageIntersection) {
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


  public static final String SERIALIZED_NAME_PRODUCT_COMPETITORS = "product_competitors";
  @SerializedName(SERIALIZED_NAME_PRODUCT_COMPETITORS)
  private AppendixBingKeywordsDataPriceDataInfo productCompetitors;

  public AppendixDataforseoLabsPriceData productCompetitors(AppendixBingKeywordsDataPriceDataInfo productCompetitors) {
    this.productCompetitors = productCompetitors;
    return this;
  }

  /**
   * 
   * @return productCompetitors
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getProductCompetitors() {
    return productCompetitors;
  }

  public void setProductCompetitors(AppendixBingKeywordsDataPriceDataInfo productCompetitors) {
    this.productCompetitors = productCompetitors;
  }


  public static final String SERIALIZED_NAME_PRODUCT_KEYWORD_INTERSECTIONS = "product_keyword_intersections";
  @SerializedName(SERIALIZED_NAME_PRODUCT_KEYWORD_INTERSECTIONS)
  private AppendixBingKeywordsDataPriceDataInfo productKeywordIntersections;

  public AppendixDataforseoLabsPriceData productKeywordIntersections(AppendixBingKeywordsDataPriceDataInfo productKeywordIntersections) {
    this.productKeywordIntersections = productKeywordIntersections;
    return this;
  }

  /**
   * 
   * @return productKeywordIntersections
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getProductKeywordIntersections() {
    return productKeywordIntersections;
  }

  public void setProductKeywordIntersections(AppendixBingKeywordsDataPriceDataInfo productKeywordIntersections) {
    this.productKeywordIntersections = productKeywordIntersections;
  }


  public static final String SERIALIZED_NAME_PRODUCT_RANK_OVERVIEW = "product_rank_overview";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RANK_OVERVIEW)
  private AppendixBingKeywordsDataPriceDataInfo productRankOverview;

  public AppendixDataforseoLabsPriceData productRankOverview(AppendixBingKeywordsDataPriceDataInfo productRankOverview) {
    this.productRankOverview = productRankOverview;
    return this;
  }

  /**
   * 
   * @return productRankOverview
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getProductRankOverview() {
    return productRankOverview;
  }

  public void setProductRankOverview(AppendixBingKeywordsDataPriceDataInfo productRankOverview) {
    this.productRankOverview = productRankOverview;
  }


  public static final String SERIALIZED_NAME_RANKED_KEYWORDS = "ranked_keywords";
  @SerializedName(SERIALIZED_NAME_RANKED_KEYWORDS)
  private AppendixBingKeywordsDataPriceDataInfo rankedKeywords;

  public AppendixDataforseoLabsPriceData rankedKeywords(AppendixBingKeywordsDataPriceDataInfo rankedKeywords) {
    this.rankedKeywords = rankedKeywords;
    return this;
  }

  /**
   * 
   * @return rankedKeywords
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getRankedKeywords() {
    return rankedKeywords;
  }

  public void setRankedKeywords(AppendixBingKeywordsDataPriceDataInfo rankedKeywords) {
    this.rankedKeywords = rankedKeywords;
  }


  public static final String SERIALIZED_NAME_RELATED_KEYWORDS = "related_keywords";
  @SerializedName(SERIALIZED_NAME_RELATED_KEYWORDS)
  private AppendixBingKeywordsDataPriceDataInfo relatedKeywords;

  public AppendixDataforseoLabsPriceData relatedKeywords(AppendixBingKeywordsDataPriceDataInfo relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
    return this;
  }

  /**
   * 
   * @return relatedKeywords
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getRelatedKeywords() {
    return relatedKeywords;
  }

  public void setRelatedKeywords(AppendixBingKeywordsDataPriceDataInfo relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }


  public static final String SERIALIZED_NAME_RELEVANT_PAGES = "relevant_pages";
  @SerializedName(SERIALIZED_NAME_RELEVANT_PAGES)
  private AppendixBingKeywordsDataPriceDataInfo relevantPages;

  public AppendixDataforseoLabsPriceData relevantPages(AppendixBingKeywordsDataPriceDataInfo relevantPages) {
    this.relevantPages = relevantPages;
    return this;
  }

  /**
   * 
   * @return relevantPages
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getRelevantPages() {
    return relevantPages;
  }

  public void setRelevantPages(AppendixBingKeywordsDataPriceDataInfo relevantPages) {
    this.relevantPages = relevantPages;
  }


  public static final String SERIALIZED_NAME_SEARCH_INTENT = "search_intent";
  @SerializedName(SERIALIZED_NAME_SEARCH_INTENT)
  private AppendixBingKeywordsDataPriceDataInfo searchIntent;

  public AppendixDataforseoLabsPriceData searchIntent(AppendixBingKeywordsDataPriceDataInfo searchIntent) {
    this.searchIntent = searchIntent;
    return this;
  }

  /**
   * 
   * @return searchIntent
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getSearchIntent() {
    return searchIntent;
  }

  public void setSearchIntent(AppendixBingKeywordsDataPriceDataInfo searchIntent) {
    this.searchIntent = searchIntent;
  }


  public static final String SERIALIZED_NAME_SERP_COMPETITORS = "serp_competitors";
  @SerializedName(SERIALIZED_NAME_SERP_COMPETITORS)
  private AppendixBingKeywordsDataPriceDataInfo serpCompetitors;

  public AppendixDataforseoLabsPriceData serpCompetitors(AppendixBingKeywordsDataPriceDataInfo serpCompetitors) {
    this.serpCompetitors = serpCompetitors;
    return this;
  }

  /**
   * 
   * @return serpCompetitors
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getSerpCompetitors() {
    return serpCompetitors;
  }

  public void setSerpCompetitors(AppendixBingKeywordsDataPriceDataInfo serpCompetitors) {
    this.serpCompetitors = serpCompetitors;
  }


  public static final String SERIALIZED_NAME_SUBDOMAINS = "subdomains";
  @SerializedName(SERIALIZED_NAME_SUBDOMAINS)
  private AppendixBingKeywordsDataPriceDataInfo subdomains;

  public AppendixDataforseoLabsPriceData subdomains(AppendixBingKeywordsDataPriceDataInfo subdomains) {
    this.subdomains = subdomains;
    return this;
  }

  /**
   * 
   * @return subdomains
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getSubdomains() {
    return subdomains;
  }

  public void setSubdomains(AppendixBingKeywordsDataPriceDataInfo subdomains) {
    this.subdomains = subdomains;
  }


  public static final String SERIALIZED_NAME_TOP_SEARCHES = "top_searches";
  @SerializedName(SERIALIZED_NAME_TOP_SEARCHES)
  private AppendixBingKeywordsDataPriceDataInfo topSearches;

  public AppendixDataforseoLabsPriceData topSearches(AppendixBingKeywordsDataPriceDataInfo topSearches) {
    this.topSearches = topSearches;
    return this;
  }

  /**
   * 
   * @return topSearches
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getTopSearches() {
    return topSearches;
  }

  public void setTopSearches(AppendixBingKeywordsDataPriceDataInfo topSearches) {
    this.topSearches = topSearches;
  }



  public AppendixDataforseoLabsPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixDataforseoLabsPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixDataforseoLabsPriceData appendixDataforseoLabsPriceData = (AppendixDataforseoLabsPriceData) o;
    return

        Objects.equals(this.appCompetitors, appendixDataforseoLabsPriceData.appCompetitors) &&
        Objects.equals(this.appIntersection, appendixDataforseoLabsPriceData.appIntersection) &&
        Objects.equals(this.bulkAppMetrics, appendixDataforseoLabsPriceData.bulkAppMetrics) &&
        Objects.equals(this.bulkKeywordDifficulty, appendixDataforseoLabsPriceData.bulkKeywordDifficulty) &&
        Objects.equals(this.bulkSearchVolume, appendixDataforseoLabsPriceData.bulkSearchVolume) &&
        Objects.equals(this.bulkTrafficEstimation, appendixDataforseoLabsPriceData.bulkTrafficEstimation) &&
        Objects.equals(this.categories, appendixDataforseoLabsPriceData.categories) &&
        Objects.equals(this.categoriesForDomain, appendixDataforseoLabsPriceData.categoriesForDomain) &&
        Objects.equals(this.categoriesForKeywords, appendixDataforseoLabsPriceData.categoriesForKeywords) &&
        Objects.equals(this.competitorsDomain, appendixDataforseoLabsPriceData.competitorsDomain) &&
        Objects.equals(this.domainIntersection, appendixDataforseoLabsPriceData.domainIntersection) &&
        Objects.equals(this.domainMetricsByCategories, appendixDataforseoLabsPriceData.domainMetricsByCategories) &&
        Objects.equals(this.domainRankOverview, appendixDataforseoLabsPriceData.domainRankOverview) &&
        Objects.equals(this.domainWhoisOverview, appendixDataforseoLabsPriceData.domainWhoisOverview) &&
        Objects.equals(this.errors, appendixDataforseoLabsPriceData.errors) &&
        Objects.equals(this.historicalBulkTrafficEstimation, appendixDataforseoLabsPriceData.historicalBulkTrafficEstimation) &&
        Objects.equals(this.historicalKeywordData, appendixDataforseoLabsPriceData.historicalKeywordData) &&
        Objects.equals(this.historicalRankOverview, appendixDataforseoLabsPriceData.historicalRankOverview) &&
        Objects.equals(this.historicalSearchVolume, appendixDataforseoLabsPriceData.historicalSearchVolume) &&
        Objects.equals(this.historicalSerps, appendixDataforseoLabsPriceData.historicalSerps) &&
        Objects.equals(this.keywordIdeas, appendixDataforseoLabsPriceData.keywordIdeas) &&
        Objects.equals(this.keywordOverview, appendixDataforseoLabsPriceData.keywordOverview) &&
        Objects.equals(this.keywordsForApp, appendixDataforseoLabsPriceData.keywordsForApp) &&
        Objects.equals(this.keywordsForCategories, appendixDataforseoLabsPriceData.keywordsForCategories) &&
        Objects.equals(this.keywordsForSite, appendixDataforseoLabsPriceData.keywordsForSite) &&
        Objects.equals(this.keywordSuggestions, appendixDataforseoLabsPriceData.keywordSuggestions) &&
        Objects.equals(this.locationsAndLanguages, appendixDataforseoLabsPriceData.locationsAndLanguages) &&
        Objects.equals(this.pageIntersection, appendixDataforseoLabsPriceData.pageIntersection) &&
        Objects.equals(this.productCompetitors, appendixDataforseoLabsPriceData.productCompetitors) &&
        Objects.equals(this.productKeywordIntersections, appendixDataforseoLabsPriceData.productKeywordIntersections) &&
        Objects.equals(this.productRankOverview, appendixDataforseoLabsPriceData.productRankOverview) &&
        Objects.equals(this.rankedKeywords, appendixDataforseoLabsPriceData.rankedKeywords) &&
        Objects.equals(this.relatedKeywords, appendixDataforseoLabsPriceData.relatedKeywords) &&
        Objects.equals(this.relevantPages, appendixDataforseoLabsPriceData.relevantPages) &&
        Objects.equals(this.searchIntent, appendixDataforseoLabsPriceData.searchIntent) &&
        Objects.equals(this.serpCompetitors, appendixDataforseoLabsPriceData.serpCompetitors) &&
        Objects.equals(this.subdomains, appendixDataforseoLabsPriceData.subdomains) &&
        Objects.equals(this.topSearches, appendixDataforseoLabsPriceData.topSearches);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(appCompetitors, appIntersection, bulkAppMetrics, bulkKeywordDifficulty, bulkSearchVolume, bulkTrafficEstimation, categories, categoriesForDomain, categoriesForKeywords, competitorsDomain, domainIntersection, domainMetricsByCategories, domainRankOverview, domainWhoisOverview, errors, historicalBulkTrafficEstimation, historicalKeywordData, historicalRankOverview, historicalSearchVolume, historicalSerps, keywordIdeas, keywordOverview, keywordsForApp, keywordsForCategories, keywordsForSite, keywordSuggestions, locationsAndLanguages, pageIntersection, productCompetitors, productKeywordIntersections, productRankOverview, rankedKeywords, relatedKeywords, relevantPages, searchIntent, serpCompetitors, subdomains, topSearches);
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
    sb.append("class AppendixDataforseoLabsPriceData {\n");

    sb.append("    appCompetitors: ").append(toIndentedString(appCompetitors)).append("\n");
    sb.append("    appIntersection: ").append(toIndentedString(appIntersection)).append("\n");
    sb.append("    bulkAppMetrics: ").append(toIndentedString(bulkAppMetrics)).append("\n");
    sb.append("    bulkKeywordDifficulty: ").append(toIndentedString(bulkKeywordDifficulty)).append("\n");
    sb.append("    bulkSearchVolume: ").append(toIndentedString(bulkSearchVolume)).append("\n");
    sb.append("    bulkTrafficEstimation: ").append(toIndentedString(bulkTrafficEstimation)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoriesForDomain: ").append(toIndentedString(categoriesForDomain)).append("\n");
    sb.append("    categoriesForKeywords: ").append(toIndentedString(categoriesForKeywords)).append("\n");
    sb.append("    competitorsDomain: ").append(toIndentedString(competitorsDomain)).append("\n");
    sb.append("    domainIntersection: ").append(toIndentedString(domainIntersection)).append("\n");
    sb.append("    domainMetricsByCategories: ").append(toIndentedString(domainMetricsByCategories)).append("\n");
    sb.append("    domainRankOverview: ").append(toIndentedString(domainRankOverview)).append("\n");
    sb.append("    domainWhoisOverview: ").append(toIndentedString(domainWhoisOverview)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    historicalBulkTrafficEstimation: ").append(toIndentedString(historicalBulkTrafficEstimation)).append("\n");
    sb.append("    historicalKeywordData: ").append(toIndentedString(historicalKeywordData)).append("\n");
    sb.append("    historicalRankOverview: ").append(toIndentedString(historicalRankOverview)).append("\n");
    sb.append("    historicalSearchVolume: ").append(toIndentedString(historicalSearchVolume)).append("\n");
    sb.append("    historicalSerps: ").append(toIndentedString(historicalSerps)).append("\n");
    sb.append("    keywordIdeas: ").append(toIndentedString(keywordIdeas)).append("\n");
    sb.append("    keywordOverview: ").append(toIndentedString(keywordOverview)).append("\n");
    sb.append("    keywordsForApp: ").append(toIndentedString(keywordsForApp)).append("\n");
    sb.append("    keywordsForCategories: ").append(toIndentedString(keywordsForCategories)).append("\n");
    sb.append("    keywordsForSite: ").append(toIndentedString(keywordsForSite)).append("\n");
    sb.append("    keywordSuggestions: ").append(toIndentedString(keywordSuggestions)).append("\n");
    sb.append("    locationsAndLanguages: ").append(toIndentedString(locationsAndLanguages)).append("\n");
    sb.append("    pageIntersection: ").append(toIndentedString(pageIntersection)).append("\n");
    sb.append("    productCompetitors: ").append(toIndentedString(productCompetitors)).append("\n");
    sb.append("    productKeywordIntersections: ").append(toIndentedString(productKeywordIntersections)).append("\n");
    sb.append("    productRankOverview: ").append(toIndentedString(productRankOverview)).append("\n");
    sb.append("    rankedKeywords: ").append(toIndentedString(rankedKeywords)).append("\n");
    sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
    sb.append("    relevantPages: ").append(toIndentedString(relevantPages)).append("\n");
    sb.append("    searchIntent: ").append(toIndentedString(searchIntent)).append("\n");
    sb.append("    serpCompetitors: ").append(toIndentedString(serpCompetitors)).append("\n");
    sb.append("    subdomains: ").append(toIndentedString(subdomains)).append("\n");
    sb.append("    topSearches: ").append(toIndentedString(topSearches)).append("\n");
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
    
    openapiFields.add("app_competitors");
    
    openapiFields.add("app_intersection");
    
    openapiFields.add("bulk_app_metrics");
    
    openapiFields.add("bulk_keyword_difficulty");
    
    openapiFields.add("bulk_search_volume");
    
    openapiFields.add("bulk_traffic_estimation");
    
    openapiFields.add("categories");
    
    openapiFields.add("categories_for_domain");
    
    openapiFields.add("categories_for_keywords");
    
    openapiFields.add("competitors_domain");
    
    openapiFields.add("domain_intersection");
    
    openapiFields.add("domain_metrics_by_categories");
    
    openapiFields.add("domain_rank_overview");
    
    openapiFields.add("domain_whois_overview");
    
    openapiFields.add("errors");
    
    openapiFields.add("historical_bulk_traffic_estimation");
    
    openapiFields.add("historical_keyword_data");
    
    openapiFields.add("historical_rank_overview");
    
    openapiFields.add("historical_search_volume");
    
    openapiFields.add("historical_serps");
    
    openapiFields.add("keyword_ideas");
    
    openapiFields.add("keyword_overview");
    
    openapiFields.add("keywords_for_app");
    
    openapiFields.add("keywords_for_categories");
    
    openapiFields.add("keywords_for_site");
    
    openapiFields.add("keyword_suggestions");
    
    openapiFields.add("locations_and_languages");
    
    openapiFields.add("page_intersection");
    
    openapiFields.add("product_competitors");
    
    openapiFields.add("product_keyword_intersections");
    
    openapiFields.add("product_rank_overview");
    
    openapiFields.add("ranked_keywords");
    
    openapiFields.add("related_keywords");
    
    openapiFields.add("relevant_pages");
    
    openapiFields.add("search_intent");
    
    openapiFields.add("serp_competitors");
    
    openapiFields.add("subdomains");
    
    openapiFields.add("top_searches");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixDataforseoLabsPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixDataforseoLabsPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixDataforseoLabsPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixDataforseoLabsPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixDataforseoLabsPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixDataforseoLabsPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixDataforseoLabsPriceData value) throws IOException {
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
           public AppendixDataforseoLabsPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixDataforseoLabsPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixDataforseoLabsPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixDataforseoLabsPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
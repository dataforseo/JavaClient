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



public class DataforseoLabsAvailableFiltersResultInfo  {


  public static final String SERIALIZED_NAME_RELATED_KEYWORDS = "related_keywords";
  @SerializedName(SERIALIZED_NAME_RELATED_KEYWORDS)
  private Map<String, Map<String, String>> relatedKeywords;

  public DataforseoLabsAvailableFiltersResultInfo relatedKeywords(Map<String, Map<String, String>> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
    return this;
  }

  /**
   * 
   * @return relatedKeywords
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getRelatedKeywords() {
    return relatedKeywords;
  }

  public void setRelatedKeywords(Map<String, Map<String, String>> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }


  public static final String SERIALIZED_NAME_KEYWORD_SUGGESTIONS = "keyword_suggestions";
  @SerializedName(SERIALIZED_NAME_KEYWORD_SUGGESTIONS)
  private Map<String, Map<String, String>> keywordSuggestions;

  public DataforseoLabsAvailableFiltersResultInfo keywordSuggestions(Map<String, Map<String, String>> keywordSuggestions) {
    this.keywordSuggestions = keywordSuggestions;
    return this;
  }

  /**
   * 
   * @return keywordSuggestions
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getKeywordSuggestions() {
    return keywordSuggestions;
  }

  public void setKeywordSuggestions(Map<String, Map<String, String>> keywordSuggestions) {
    this.keywordSuggestions = keywordSuggestions;
  }


  public static final String SERIALIZED_NAME_RANKED_KEYWORDS = "ranked_keywords";
  @SerializedName(SERIALIZED_NAME_RANKED_KEYWORDS)
  private Map<String, Map<String, String>> rankedKeywords;

  public DataforseoLabsAvailableFiltersResultInfo rankedKeywords(Map<String, Map<String, String>> rankedKeywords) {
    this.rankedKeywords = rankedKeywords;
    return this;
  }

  /**
   * 
   * @return rankedKeywords
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getRankedKeywords() {
    return rankedKeywords;
  }

  public void setRankedKeywords(Map<String, Map<String, String>> rankedKeywords) {
    this.rankedKeywords = rankedKeywords;
  }


  public static final String SERIALIZED_NAME_KEYWORD_IDEAS = "keyword_ideas";
  @SerializedName(SERIALIZED_NAME_KEYWORD_IDEAS)
  private Map<String, Map<String, String>> keywordIdeas;

  public DataforseoLabsAvailableFiltersResultInfo keywordIdeas(Map<String, Map<String, String>> keywordIdeas) {
    this.keywordIdeas = keywordIdeas;
    return this;
  }

  /**
   * 
   * @return keywordIdeas
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getKeywordIdeas() {
    return keywordIdeas;
  }

  public void setKeywordIdeas(Map<String, Map<String, String>> keywordIdeas) {
    this.keywordIdeas = keywordIdeas;
  }


  public static final String SERIALIZED_NAME_SERP_COMPETITORS = "serp_competitors";
  @SerializedName(SERIALIZED_NAME_SERP_COMPETITORS)
  private Map<String, Map<String, String>> serpCompetitors;

  public DataforseoLabsAvailableFiltersResultInfo serpCompetitors(Map<String, Map<String, String>> serpCompetitors) {
    this.serpCompetitors = serpCompetitors;
    return this;
  }

  /**
   * 
   * @return serpCompetitors
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getSerpCompetitors() {
    return serpCompetitors;
  }

  public void setSerpCompetitors(Map<String, Map<String, String>> serpCompetitors) {
    this.serpCompetitors = serpCompetitors;
  }


  public static final String SERIALIZED_NAME_RELEVANT_PAGES = "relevant_pages";
  @SerializedName(SERIALIZED_NAME_RELEVANT_PAGES)
  private Map<String, Map<String, String>> relevantPages;

  public DataforseoLabsAvailableFiltersResultInfo relevantPages(Map<String, Map<String, String>> relevantPages) {
    this.relevantPages = relevantPages;
    return this;
  }

  /**
   * 
   * @return relevantPages
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getRelevantPages() {
    return relevantPages;
  }

  public void setRelevantPages(Map<String, Map<String, String>> relevantPages) {
    this.relevantPages = relevantPages;
  }


  public static final String SERIALIZED_NAME_SUBDOMAINS = "subdomains";
  @SerializedName(SERIALIZED_NAME_SUBDOMAINS)
  private Map<String, Map<String, String>> subdomains;

  public DataforseoLabsAvailableFiltersResultInfo subdomains(Map<String, Map<String, String>> subdomains) {
    this.subdomains = subdomains;
    return this;
  }

  /**
   * 
   * @return subdomains
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getSubdomains() {
    return subdomains;
  }

  public void setSubdomains(Map<String, Map<String, String>> subdomains) {
    this.subdomains = subdomains;
  }


  public static final String SERIALIZED_NAME_COMPETITORS_DOMAIN = "competitors_domain";
  @SerializedName(SERIALIZED_NAME_COMPETITORS_DOMAIN)
  private Map<String, Map<String, String>> competitorsDomain;

  public DataforseoLabsAvailableFiltersResultInfo competitorsDomain(Map<String, Map<String, String>> competitorsDomain) {
    this.competitorsDomain = competitorsDomain;
    return this;
  }

  /**
   * 
   * @return competitorsDomain
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getCompetitorsDomain() {
    return competitorsDomain;
  }

  public void setCompetitorsDomain(Map<String, Map<String, String>> competitorsDomain) {
    this.competitorsDomain = competitorsDomain;
  }


  public static final String SERIALIZED_NAME_CATEGORIES_FOR_DOMAIN = "categories_for_domain";
  @SerializedName(SERIALIZED_NAME_CATEGORIES_FOR_DOMAIN)
  private Map<String, Map<String, String>> categoriesForDomain;

  public DataforseoLabsAvailableFiltersResultInfo categoriesForDomain(Map<String, Map<String, String>> categoriesForDomain) {
    this.categoriesForDomain = categoriesForDomain;
    return this;
  }

  /**
   * 
   * @return categoriesForDomain
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getCategoriesForDomain() {
    return categoriesForDomain;
  }

  public void setCategoriesForDomain(Map<String, Map<String, String>> categoriesForDomain) {
    this.categoriesForDomain = categoriesForDomain;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_CATEGORIES = "keywords_for_categories";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_CATEGORIES)
  private Map<String, Map<String, String>> keywordsForCategories;

  public DataforseoLabsAvailableFiltersResultInfo keywordsForCategories(Map<String, Map<String, String>> keywordsForCategories) {
    this.keywordsForCategories = keywordsForCategories;
    return this;
  }

  /**
   * 
   * @return keywordsForCategories
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getKeywordsForCategories() {
    return keywordsForCategories;
  }

  public void setKeywordsForCategories(Map<String, Map<String, String>> keywordsForCategories) {
    this.keywordsForCategories = keywordsForCategories;
  }


  public static final String SERIALIZED_NAME_DOMAIN_INTERSECTION = "domain_intersection";
  @SerializedName(SERIALIZED_NAME_DOMAIN_INTERSECTION)
  private Map<String, Map<String, String>> domainIntersection;

  public DataforseoLabsAvailableFiltersResultInfo domainIntersection(Map<String, Map<String, String>> domainIntersection) {
    this.domainIntersection = domainIntersection;
    return this;
  }

  /**
   * 
   * @return domainIntersection
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getDomainIntersection() {
    return domainIntersection;
  }

  public void setDomainIntersection(Map<String, Map<String, String>> domainIntersection) {
    this.domainIntersection = domainIntersection;
  }


  public static final String SERIALIZED_NAME_PAGE_INTERSECTION = "page_intersection";
  @SerializedName(SERIALIZED_NAME_PAGE_INTERSECTION)
  private Map<String, Map<String, String>> pageIntersection;

  public DataforseoLabsAvailableFiltersResultInfo pageIntersection(Map<String, Map<String, String>> pageIntersection) {
    this.pageIntersection = pageIntersection;
    return this;
  }

  /**
   * 
   * @return pageIntersection
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getPageIntersection() {
    return pageIntersection;
  }

  public void setPageIntersection(Map<String, Map<String, String>> pageIntersection) {
    this.pageIntersection = pageIntersection;
  }


  public static final String SERIALIZED_NAME_DOMAIN_WHOIS_OVERVIEW = "domain_whois_overview";
  @SerializedName(SERIALIZED_NAME_DOMAIN_WHOIS_OVERVIEW)
  private Map<String, Map<String, String>> domainWhoisOverview;

  public DataforseoLabsAvailableFiltersResultInfo domainWhoisOverview(Map<String, Map<String, String>> domainWhoisOverview) {
    this.domainWhoisOverview = domainWhoisOverview;
    return this;
  }

  /**
   * 
   * @return domainWhoisOverview
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getDomainWhoisOverview() {
    return domainWhoisOverview;
  }

  public void setDomainWhoisOverview(Map<String, Map<String, String>> domainWhoisOverview) {
    this.domainWhoisOverview = domainWhoisOverview;
  }


  public static final String SERIALIZED_NAME_TOP_SEARCHES = "top_searches";
  @SerializedName(SERIALIZED_NAME_TOP_SEARCHES)
  private Map<String, Map<String, String>> topSearches;

  public DataforseoLabsAvailableFiltersResultInfo topSearches(Map<String, Map<String, String>> topSearches) {
    this.topSearches = topSearches;
    return this;
  }

  /**
   * 
   * @return topSearches
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getTopSearches() {
    return topSearches;
  }

  public void setTopSearches(Map<String, Map<String, String>> topSearches) {
    this.topSearches = topSearches;
  }


  public static final String SERIALIZED_NAME_DOMAIN_METRICS_BY_CATEGORIES = "domain_metrics_by_categories";
  @SerializedName(SERIALIZED_NAME_DOMAIN_METRICS_BY_CATEGORIES)
  private Map<String, Map<String, String>> domainMetricsByCategories;

  public DataforseoLabsAvailableFiltersResultInfo domainMetricsByCategories(Map<String, Map<String, String>> domainMetricsByCategories) {
    this.domainMetricsByCategories = domainMetricsByCategories;
    return this;
  }

  /**
   * 
   * @return domainMetricsByCategories
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getDomainMetricsByCategories() {
    return domainMetricsByCategories;
  }

  public void setDomainMetricsByCategories(Map<String, Map<String, String>> domainMetricsByCategories) {
    this.domainMetricsByCategories = domainMetricsByCategories;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_SITE = "keywords_for_site";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_SITE)
  private Map<String, Map<String, String>> keywordsForSite;

  public DataforseoLabsAvailableFiltersResultInfo keywordsForSite(Map<String, Map<String, String>> keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
    return this;
  }

  /**
   * 
   * @return keywordsForSite
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getKeywordsForSite() {
    return keywordsForSite;
  }

  public void setKeywordsForSite(Map<String, Map<String, String>> keywordsForSite) {
    this.keywordsForSite = keywordsForSite;
  }


  public static final String SERIALIZED_NAME_PRODUCT_COMPETITORS = "product_competitors";
  @SerializedName(SERIALIZED_NAME_PRODUCT_COMPETITORS)
  private Map<String, Map<String, String>> productCompetitors;

  public DataforseoLabsAvailableFiltersResultInfo productCompetitors(Map<String, Map<String, String>> productCompetitors) {
    this.productCompetitors = productCompetitors;
    return this;
  }

  /**
   * 
   * @return productCompetitors
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getProductCompetitors() {
    return productCompetitors;
  }

  public void setProductCompetitors(Map<String, Map<String, String>> productCompetitors) {
    this.productCompetitors = productCompetitors;
  }


  public static final String SERIALIZED_NAME_PRODUCT_KEYWORD_INTERSECTIONS = "product_keyword_intersections";
  @SerializedName(SERIALIZED_NAME_PRODUCT_KEYWORD_INTERSECTIONS)
  private Map<String, Map<String, String>> productKeywordIntersections;

  public DataforseoLabsAvailableFiltersResultInfo productKeywordIntersections(Map<String, Map<String, String>> productKeywordIntersections) {
    this.productKeywordIntersections = productKeywordIntersections;
    return this;
  }

  /**
   * 
   * @return productKeywordIntersections
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getProductKeywordIntersections() {
    return productKeywordIntersections;
  }

  public void setProductKeywordIntersections(Map<String, Map<String, String>> productKeywordIntersections) {
    this.productKeywordIntersections = productKeywordIntersections;
  }


  public static final String SERIALIZED_NAME_APP_INTERSECTION = "app_intersection";
  @SerializedName(SERIALIZED_NAME_APP_INTERSECTION)
  private Map<String, Map<String, String>> appIntersection;

  public DataforseoLabsAvailableFiltersResultInfo appIntersection(Map<String, Map<String, String>> appIntersection) {
    this.appIntersection = appIntersection;
    return this;
  }

  /**
   * 
   * @return appIntersection
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getAppIntersection() {
    return appIntersection;
  }

  public void setAppIntersection(Map<String, Map<String, String>> appIntersection) {
    this.appIntersection = appIntersection;
  }


  public static final String SERIALIZED_NAME_APP_COMPETITORS = "app_competitors";
  @SerializedName(SERIALIZED_NAME_APP_COMPETITORS)
  private Map<String, Map<String, String>> appCompetitors;

  public DataforseoLabsAvailableFiltersResultInfo appCompetitors(Map<String, Map<String, String>> appCompetitors) {
    this.appCompetitors = appCompetitors;
    return this;
  }

  /**
   * 
   * @return appCompetitors
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getAppCompetitors() {
    return appCompetitors;
  }

  public void setAppCompetitors(Map<String, Map<String, String>> appCompetitors) {
    this.appCompetitors = appCompetitors;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_FOR_APP = "keywords_for_app";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_FOR_APP)
  private Map<String, Map<String, String>> keywordsForApp;

  public DataforseoLabsAvailableFiltersResultInfo keywordsForApp(Map<String, Map<String, String>> keywordsForApp) {
    this.keywordsForApp = keywordsForApp;
    return this;
  }

  /**
   * 
   * @return keywordsForApp
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getKeywordsForApp() {
    return keywordsForApp;
  }

  public void setKeywordsForApp(Map<String, Map<String, String>> keywordsForApp) {
    this.keywordsForApp = keywordsForApp;
  }


  public static final String SERIALIZED_NAME_DATABASE_ROWS_COUNT = "database_rows_count";
  @SerializedName(SERIALIZED_NAME_DATABASE_ROWS_COUNT)
  private Map<String, String> databaseRowsCount;

  public DataforseoLabsAvailableFiltersResultInfo databaseRowsCount(Map<String, String> databaseRowsCount) {
    this.databaseRowsCount = databaseRowsCount;
    return this;
  }

  /**
   * 
   * @return databaseRowsCount
   */
  @javax.annotation.Nullable
  public Map<String, String> getDatabaseRowsCount() {
    return databaseRowsCount;
  }

  public void setDatabaseRowsCount(Map<String, String> databaseRowsCount) {
    this.databaseRowsCount = databaseRowsCount;
  }



  public DataforseoLabsAvailableFiltersResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsAvailableFiltersResultInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsAvailableFiltersResultInfo dataforseoLabsAvailableFiltersResultInfo = (DataforseoLabsAvailableFiltersResultInfo) o;
    return

        Objects.equals(this.relatedKeywords, dataforseoLabsAvailableFiltersResultInfo.relatedKeywords) &&
        Objects.equals(this.keywordSuggestions, dataforseoLabsAvailableFiltersResultInfo.keywordSuggestions) &&
        Objects.equals(this.rankedKeywords, dataforseoLabsAvailableFiltersResultInfo.rankedKeywords) &&
        Objects.equals(this.keywordIdeas, dataforseoLabsAvailableFiltersResultInfo.keywordIdeas) &&
        Objects.equals(this.serpCompetitors, dataforseoLabsAvailableFiltersResultInfo.serpCompetitors) &&
        Objects.equals(this.relevantPages, dataforseoLabsAvailableFiltersResultInfo.relevantPages) &&
        Objects.equals(this.subdomains, dataforseoLabsAvailableFiltersResultInfo.subdomains) &&
        Objects.equals(this.competitorsDomain, dataforseoLabsAvailableFiltersResultInfo.competitorsDomain) &&
        Objects.equals(this.categoriesForDomain, dataforseoLabsAvailableFiltersResultInfo.categoriesForDomain) &&
        Objects.equals(this.keywordsForCategories, dataforseoLabsAvailableFiltersResultInfo.keywordsForCategories) &&
        Objects.equals(this.domainIntersection, dataforseoLabsAvailableFiltersResultInfo.domainIntersection) &&
        Objects.equals(this.pageIntersection, dataforseoLabsAvailableFiltersResultInfo.pageIntersection) &&
        Objects.equals(this.domainWhoisOverview, dataforseoLabsAvailableFiltersResultInfo.domainWhoisOverview) &&
        Objects.equals(this.topSearches, dataforseoLabsAvailableFiltersResultInfo.topSearches) &&
        Objects.equals(this.domainMetricsByCategories, dataforseoLabsAvailableFiltersResultInfo.domainMetricsByCategories) &&
        Objects.equals(this.keywordsForSite, dataforseoLabsAvailableFiltersResultInfo.keywordsForSite) &&
        Objects.equals(this.productCompetitors, dataforseoLabsAvailableFiltersResultInfo.productCompetitors) &&
        Objects.equals(this.productKeywordIntersections, dataforseoLabsAvailableFiltersResultInfo.productKeywordIntersections) &&
        Objects.equals(this.appIntersection, dataforseoLabsAvailableFiltersResultInfo.appIntersection) &&
        Objects.equals(this.appCompetitors, dataforseoLabsAvailableFiltersResultInfo.appCompetitors) &&
        Objects.equals(this.keywordsForApp, dataforseoLabsAvailableFiltersResultInfo.keywordsForApp) &&
        Objects.equals(this.databaseRowsCount, dataforseoLabsAvailableFiltersResultInfo.databaseRowsCount);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(relatedKeywords, keywordSuggestions, rankedKeywords, keywordIdeas, serpCompetitors, relevantPages, subdomains, competitorsDomain, categoriesForDomain, keywordsForCategories, domainIntersection, pageIntersection, domainWhoisOverview, topSearches, domainMetricsByCategories, keywordsForSite, productCompetitors, productKeywordIntersections, appIntersection, appCompetitors, keywordsForApp, databaseRowsCount);
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
    sb.append("class DataforseoLabsAvailableFiltersResultInfo {\n");

    sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
    sb.append("    keywordSuggestions: ").append(toIndentedString(keywordSuggestions)).append("\n");
    sb.append("    rankedKeywords: ").append(toIndentedString(rankedKeywords)).append("\n");
    sb.append("    keywordIdeas: ").append(toIndentedString(keywordIdeas)).append("\n");
    sb.append("    serpCompetitors: ").append(toIndentedString(serpCompetitors)).append("\n");
    sb.append("    relevantPages: ").append(toIndentedString(relevantPages)).append("\n");
    sb.append("    subdomains: ").append(toIndentedString(subdomains)).append("\n");
    sb.append("    competitorsDomain: ").append(toIndentedString(competitorsDomain)).append("\n");
    sb.append("    categoriesForDomain: ").append(toIndentedString(categoriesForDomain)).append("\n");
    sb.append("    keywordsForCategories: ").append(toIndentedString(keywordsForCategories)).append("\n");
    sb.append("    domainIntersection: ").append(toIndentedString(domainIntersection)).append("\n");
    sb.append("    pageIntersection: ").append(toIndentedString(pageIntersection)).append("\n");
    sb.append("    domainWhoisOverview: ").append(toIndentedString(domainWhoisOverview)).append("\n");
    sb.append("    topSearches: ").append(toIndentedString(topSearches)).append("\n");
    sb.append("    domainMetricsByCategories: ").append(toIndentedString(domainMetricsByCategories)).append("\n");
    sb.append("    keywordsForSite: ").append(toIndentedString(keywordsForSite)).append("\n");
    sb.append("    productCompetitors: ").append(toIndentedString(productCompetitors)).append("\n");
    sb.append("    productKeywordIntersections: ").append(toIndentedString(productKeywordIntersections)).append("\n");
    sb.append("    appIntersection: ").append(toIndentedString(appIntersection)).append("\n");
    sb.append("    appCompetitors: ").append(toIndentedString(appCompetitors)).append("\n");
    sb.append("    keywordsForApp: ").append(toIndentedString(keywordsForApp)).append("\n");
    sb.append("    databaseRowsCount: ").append(toIndentedString(databaseRowsCount)).append("\n");
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
    
    openapiFields.add("related_keywords");
    
    openapiFields.add("keyword_suggestions");
    
    openapiFields.add("ranked_keywords");
    
    openapiFields.add("keyword_ideas");
    
    openapiFields.add("serp_competitors");
    
    openapiFields.add("relevant_pages");
    
    openapiFields.add("subdomains");
    
    openapiFields.add("competitors_domain");
    
    openapiFields.add("categories_for_domain");
    
    openapiFields.add("keywords_for_categories");
    
    openapiFields.add("domain_intersection");
    
    openapiFields.add("page_intersection");
    
    openapiFields.add("domain_whois_overview");
    
    openapiFields.add("top_searches");
    
    openapiFields.add("domain_metrics_by_categories");
    
    openapiFields.add("keywords_for_site");
    
    openapiFields.add("product_competitors");
    
    openapiFields.add("product_keyword_intersections");
    
    openapiFields.add("app_intersection");
    
    openapiFields.add("app_competitors");
    
    openapiFields.add("keywords_for_app");
    
    openapiFields.add("database_rows_count");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsAvailableFiltersResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsAvailableFiltersResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsAvailableFiltersResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsAvailableFiltersResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsAvailableFiltersResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsAvailableFiltersResultInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsAvailableFiltersResultInfo value) throws IOException {
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
           public DataforseoLabsAvailableFiltersResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsAvailableFiltersResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsAvailableFiltersResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsAvailableFiltersResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
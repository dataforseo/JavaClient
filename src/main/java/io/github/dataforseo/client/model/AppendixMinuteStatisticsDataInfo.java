/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.dataforseo.client.model.AppendixAppDataLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixAppendixDaysRatesDataInfo;
import io.github.dataforseo.client.model.AppendixBacklinksLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixBusinessDataLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixContentAnalysisLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixContentGenerationLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixDataforseoLabsLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixDomainAnalyticsLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixKeywordsDatasRatesDataInfo;
import io.github.dataforseo.client.model.AppendixMerchantLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixOnPageLimitsRatesDataInfo;
import io.github.dataforseo.client.model.AppendixSerpLimitsRatesDataInfo;
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

/**
 * AppendixMinuteStatisticsDataInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T10:03:11.930414100+02:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class AppendixMinuteStatisticsDataInfo {
  public static final String SERIALIZED_NAME_SERP = "serp";
  @SerializedName(SERIALIZED_NAME_SERP)
  private AppendixSerpLimitsRatesDataInfo serp;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public static final String SERIALIZED_NAME_TOTAL_SERP = "total_serp";
  @SerializedName(SERIALIZED_NAME_TOTAL_SERP)
  private Double totalSerp;

  public static final String SERIALIZED_NAME_KEYWORDS_DATA = "keywords_data";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_DATA)
  private AppendixKeywordsDatasRatesDataInfo keywordsData;

  public static final String SERIALIZED_NAME_TOTAL_KEYWORDS_DATA = "total_keywords_data";
  @SerializedName(SERIALIZED_NAME_TOTAL_KEYWORDS_DATA)
  private Double totalKeywordsData;

  public static final String SERIALIZED_NAME_APPENDIX = "appendix";
  @SerializedName(SERIALIZED_NAME_APPENDIX)
  private AppendixAppendixDaysRatesDataInfo appendix;

  public static final String SERIALIZED_NAME_TOTAL_APPENDIX = "total_appendix";
  @SerializedName(SERIALIZED_NAME_TOTAL_APPENDIX)
  private Double totalAppendix;

  public static final String SERIALIZED_NAME_DATAFORSEO_LABS = "dataforseo_labs";
  @SerializedName(SERIALIZED_NAME_DATAFORSEO_LABS)
  private AppendixDataforseoLabsLimitsRatesDataInfo dataforseoLabs;

  public static final String SERIALIZED_NAME_TOTAL_DATAFORSEO_LABS = "total_dataforseo_labs";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATAFORSEO_LABS)
  private Double totalDataforseoLabs;

  public static final String SERIALIZED_NAME_DOMAIN_ANALYTICS = "domain_analytics";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ANALYTICS)
  private AppendixDomainAnalyticsLimitsRatesDataInfo domainAnalytics;

  public static final String SERIALIZED_NAME_TOTAL_DOMAIN_ANALYTICS = "total_domain_analytics";
  @SerializedName(SERIALIZED_NAME_TOTAL_DOMAIN_ANALYTICS)
  private Double totalDomainAnalytics;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private AppendixMerchantLimitsRatesDataInfo merchant;

  public static final String SERIALIZED_NAME_TOTAL_MERCHANT = "total_merchant";
  @SerializedName(SERIALIZED_NAME_TOTAL_MERCHANT)
  private Double totalMerchant;

  public static final String SERIALIZED_NAME_ON_PAGE = "on_page";
  @SerializedName(SERIALIZED_NAME_ON_PAGE)
  private AppendixOnPageLimitsRatesDataInfo onPage;

  public static final String SERIALIZED_NAME_TOTAL_ON_PAGE = "total_on_page";
  @SerializedName(SERIALIZED_NAME_TOTAL_ON_PAGE)
  private Double totalOnPage;

  public static final String SERIALIZED_NAME_BUSINESS_DATA = "business_data";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DATA)
  private AppendixBusinessDataLimitsRatesDataInfo businessData;

  public static final String SERIALIZED_NAME_TOTAL_BUSINESS_DATA = "total_business_data";
  @SerializedName(SERIALIZED_NAME_TOTAL_BUSINESS_DATA)
  private Double totalBusinessData;

  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private AppendixBacklinksLimitsRatesDataInfo backlinks;

  public static final String SERIALIZED_NAME_TOTAL_BACKLINKS = "total_backlinks";
  @SerializedName(SERIALIZED_NAME_TOTAL_BACKLINKS)
  private Double totalBacklinks;

  public static final String SERIALIZED_NAME_APP_DATA = "app_data";
  @SerializedName(SERIALIZED_NAME_APP_DATA)
  private AppendixAppDataLimitsRatesDataInfo appData;

  public static final String SERIALIZED_NAME_TOTAL_APP_DATA = "total_app_data";
  @SerializedName(SERIALIZED_NAME_TOTAL_APP_DATA)
  private Double totalAppData;

  public static final String SERIALIZED_NAME_CONTENT_ANALYSIS = "content_analysis";
  @SerializedName(SERIALIZED_NAME_CONTENT_ANALYSIS)
  private AppendixContentAnalysisLimitsRatesDataInfo contentAnalysis;

  public static final String SERIALIZED_NAME_TOTAL_CONTENT_ANALYSIS = "total_content_analysis";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONTENT_ANALYSIS)
  private Double totalContentAnalysis;

  public static final String SERIALIZED_NAME_CONTENT_GENERATION = "content_generation";
  @SerializedName(SERIALIZED_NAME_CONTENT_GENERATION)
  private AppendixContentGenerationLimitsRatesDataInfo contentGeneration;

  public static final String SERIALIZED_NAME_TOTAL_CONTENT_GENERATION = "total_content_generation";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONTENT_GENERATION)
  private Double totalContentGeneration;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public AppendixMinuteStatisticsDataInfo() {
  }

  public AppendixMinuteStatisticsDataInfo serp(AppendixSerpLimitsRatesDataInfo serp) {
    this.serp = serp;
    return this;
  }

  /**
   * Get serp
   * @return serp
   */
  @javax.annotation.Nullable
  public AppendixSerpLimitsRatesDataInfo getSerp() {
    return serp;
  }

  public void setSerp(AppendixSerpLimitsRatesDataInfo serp) {
    this.serp = serp;
  }


  public AppendixMinuteStatisticsDataInfo total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * total amount of money deposited to your account
   * @return total
   */
  @javax.annotation.Nullable
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  public AppendixMinuteStatisticsDataInfo totalSerp(Double totalSerp) {
    this.totalSerp = totalSerp;
    return this;
  }

  /**
   * Get totalSerp
   * @return totalSerp
   */
  @javax.annotation.Nullable
  public Double getTotalSerp() {
    return totalSerp;
  }

  public void setTotalSerp(Double totalSerp) {
    this.totalSerp = totalSerp;
  }


  public AppendixMinuteStatisticsDataInfo keywordsData(AppendixKeywordsDatasRatesDataInfo keywordsData) {
    this.keywordsData = keywordsData;
    return this;
  }

  /**
   * Get keywordsData
   * @return keywordsData
   */
  @javax.annotation.Nullable
  public AppendixKeywordsDatasRatesDataInfo getKeywordsData() {
    return keywordsData;
  }

  public void setKeywordsData(AppendixKeywordsDatasRatesDataInfo keywordsData) {
    this.keywordsData = keywordsData;
  }


  public AppendixMinuteStatisticsDataInfo totalKeywordsData(Double totalKeywordsData) {
    this.totalKeywordsData = totalKeywordsData;
    return this;
  }

  /**
   * Get totalKeywordsData
   * @return totalKeywordsData
   */
  @javax.annotation.Nullable
  public Double getTotalKeywordsData() {
    return totalKeywordsData;
  }

  public void setTotalKeywordsData(Double totalKeywordsData) {
    this.totalKeywordsData = totalKeywordsData;
  }


  public AppendixMinuteStatisticsDataInfo appendix(AppendixAppendixDaysRatesDataInfo appendix) {
    this.appendix = appendix;
    return this;
  }

  /**
   * Get appendix
   * @return appendix
   */
  @javax.annotation.Nullable
  public AppendixAppendixDaysRatesDataInfo getAppendix() {
    return appendix;
  }

  public void setAppendix(AppendixAppendixDaysRatesDataInfo appendix) {
    this.appendix = appendix;
  }


  public AppendixMinuteStatisticsDataInfo totalAppendix(Double totalAppendix) {
    this.totalAppendix = totalAppendix;
    return this;
  }

  /**
   * Get totalAppendix
   * @return totalAppendix
   */
  @javax.annotation.Nullable
  public Double getTotalAppendix() {
    return totalAppendix;
  }

  public void setTotalAppendix(Double totalAppendix) {
    this.totalAppendix = totalAppendix;
  }


  public AppendixMinuteStatisticsDataInfo dataforseoLabs(AppendixDataforseoLabsLimitsRatesDataInfo dataforseoLabs) {
    this.dataforseoLabs = dataforseoLabs;
    return this;
  }

  /**
   * Get dataforseoLabs
   * @return dataforseoLabs
   */
  @javax.annotation.Nullable
  public AppendixDataforseoLabsLimitsRatesDataInfo getDataforseoLabs() {
    return dataforseoLabs;
  }

  public void setDataforseoLabs(AppendixDataforseoLabsLimitsRatesDataInfo dataforseoLabs) {
    this.dataforseoLabs = dataforseoLabs;
  }


  public AppendixMinuteStatisticsDataInfo totalDataforseoLabs(Double totalDataforseoLabs) {
    this.totalDataforseoLabs = totalDataforseoLabs;
    return this;
  }

  /**
   * Get totalDataforseoLabs
   * @return totalDataforseoLabs
   */
  @javax.annotation.Nullable
  public Double getTotalDataforseoLabs() {
    return totalDataforseoLabs;
  }

  public void setTotalDataforseoLabs(Double totalDataforseoLabs) {
    this.totalDataforseoLabs = totalDataforseoLabs;
  }


  public AppendixMinuteStatisticsDataInfo domainAnalytics(AppendixDomainAnalyticsLimitsRatesDataInfo domainAnalytics) {
    this.domainAnalytics = domainAnalytics;
    return this;
  }

  /**
   * Get domainAnalytics
   * @return domainAnalytics
   */
  @javax.annotation.Nullable
  public AppendixDomainAnalyticsLimitsRatesDataInfo getDomainAnalytics() {
    return domainAnalytics;
  }

  public void setDomainAnalytics(AppendixDomainAnalyticsLimitsRatesDataInfo domainAnalytics) {
    this.domainAnalytics = domainAnalytics;
  }


  public AppendixMinuteStatisticsDataInfo totalDomainAnalytics(Double totalDomainAnalytics) {
    this.totalDomainAnalytics = totalDomainAnalytics;
    return this;
  }

  /**
   * Get totalDomainAnalytics
   * @return totalDomainAnalytics
   */
  @javax.annotation.Nullable
  public Double getTotalDomainAnalytics() {
    return totalDomainAnalytics;
  }

  public void setTotalDomainAnalytics(Double totalDomainAnalytics) {
    this.totalDomainAnalytics = totalDomainAnalytics;
  }


  public AppendixMinuteStatisticsDataInfo merchant(AppendixMerchantLimitsRatesDataInfo merchant) {
    this.merchant = merchant;
    return this;
  }

  /**
   * Get merchant
   * @return merchant
   */
  @javax.annotation.Nullable
  public AppendixMerchantLimitsRatesDataInfo getMerchant() {
    return merchant;
  }

  public void setMerchant(AppendixMerchantLimitsRatesDataInfo merchant) {
    this.merchant = merchant;
  }


  public AppendixMinuteStatisticsDataInfo totalMerchant(Double totalMerchant) {
    this.totalMerchant = totalMerchant;
    return this;
  }

  /**
   * Get totalMerchant
   * @return totalMerchant
   */
  @javax.annotation.Nullable
  public Double getTotalMerchant() {
    return totalMerchant;
  }

  public void setTotalMerchant(Double totalMerchant) {
    this.totalMerchant = totalMerchant;
  }


  public AppendixMinuteStatisticsDataInfo onPage(AppendixOnPageLimitsRatesDataInfo onPage) {
    this.onPage = onPage;
    return this;
  }

  /**
   * Get onPage
   * @return onPage
   */
  @javax.annotation.Nullable
  public AppendixOnPageLimitsRatesDataInfo getOnPage() {
    return onPage;
  }

  public void setOnPage(AppendixOnPageLimitsRatesDataInfo onPage) {
    this.onPage = onPage;
  }


  public AppendixMinuteStatisticsDataInfo totalOnPage(Double totalOnPage) {
    this.totalOnPage = totalOnPage;
    return this;
  }

  /**
   * Get totalOnPage
   * @return totalOnPage
   */
  @javax.annotation.Nullable
  public Double getTotalOnPage() {
    return totalOnPage;
  }

  public void setTotalOnPage(Double totalOnPage) {
    this.totalOnPage = totalOnPage;
  }


  public AppendixMinuteStatisticsDataInfo businessData(AppendixBusinessDataLimitsRatesDataInfo businessData) {
    this.businessData = businessData;
    return this;
  }

  /**
   * Get businessData
   * @return businessData
   */
  @javax.annotation.Nullable
  public AppendixBusinessDataLimitsRatesDataInfo getBusinessData() {
    return businessData;
  }

  public void setBusinessData(AppendixBusinessDataLimitsRatesDataInfo businessData) {
    this.businessData = businessData;
  }


  public AppendixMinuteStatisticsDataInfo totalBusinessData(Double totalBusinessData) {
    this.totalBusinessData = totalBusinessData;
    return this;
  }

  /**
   * Get totalBusinessData
   * @return totalBusinessData
   */
  @javax.annotation.Nullable
  public Double getTotalBusinessData() {
    return totalBusinessData;
  }

  public void setTotalBusinessData(Double totalBusinessData) {
    this.totalBusinessData = totalBusinessData;
  }


  public AppendixMinuteStatisticsDataInfo backlinks(AppendixBacklinksLimitsRatesDataInfo backlinks) {
    this.backlinks = backlinks;
    return this;
  }

  /**
   * Get backlinks
   * @return backlinks
   */
  @javax.annotation.Nullable
  public AppendixBacklinksLimitsRatesDataInfo getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(AppendixBacklinksLimitsRatesDataInfo backlinks) {
    this.backlinks = backlinks;
  }


  public AppendixMinuteStatisticsDataInfo totalBacklinks(Double totalBacklinks) {
    this.totalBacklinks = totalBacklinks;
    return this;
  }

  /**
   * Get totalBacklinks
   * @return totalBacklinks
   */
  @javax.annotation.Nullable
  public Double getTotalBacklinks() {
    return totalBacklinks;
  }

  public void setTotalBacklinks(Double totalBacklinks) {
    this.totalBacklinks = totalBacklinks;
  }


  public AppendixMinuteStatisticsDataInfo appData(AppendixAppDataLimitsRatesDataInfo appData) {
    this.appData = appData;
    return this;
  }

  /**
   * Get appData
   * @return appData
   */
  @javax.annotation.Nullable
  public AppendixAppDataLimitsRatesDataInfo getAppData() {
    return appData;
  }

  public void setAppData(AppendixAppDataLimitsRatesDataInfo appData) {
    this.appData = appData;
  }


  public AppendixMinuteStatisticsDataInfo totalAppData(Double totalAppData) {
    this.totalAppData = totalAppData;
    return this;
  }

  /**
   * Get totalAppData
   * @return totalAppData
   */
  @javax.annotation.Nullable
  public Double getTotalAppData() {
    return totalAppData;
  }

  public void setTotalAppData(Double totalAppData) {
    this.totalAppData = totalAppData;
  }


  public AppendixMinuteStatisticsDataInfo contentAnalysis(AppendixContentAnalysisLimitsRatesDataInfo contentAnalysis) {
    this.contentAnalysis = contentAnalysis;
    return this;
  }

  /**
   * Get contentAnalysis
   * @return contentAnalysis
   */
  @javax.annotation.Nullable
  public AppendixContentAnalysisLimitsRatesDataInfo getContentAnalysis() {
    return contentAnalysis;
  }

  public void setContentAnalysis(AppendixContentAnalysisLimitsRatesDataInfo contentAnalysis) {
    this.contentAnalysis = contentAnalysis;
  }


  public AppendixMinuteStatisticsDataInfo totalContentAnalysis(Double totalContentAnalysis) {
    this.totalContentAnalysis = totalContentAnalysis;
    return this;
  }

  /**
   * Get totalContentAnalysis
   * @return totalContentAnalysis
   */
  @javax.annotation.Nullable
  public Double getTotalContentAnalysis() {
    return totalContentAnalysis;
  }

  public void setTotalContentAnalysis(Double totalContentAnalysis) {
    this.totalContentAnalysis = totalContentAnalysis;
  }


  public AppendixMinuteStatisticsDataInfo contentGeneration(AppendixContentGenerationLimitsRatesDataInfo contentGeneration) {
    this.contentGeneration = contentGeneration;
    return this;
  }

  /**
   * Get contentGeneration
   * @return contentGeneration
   */
  @javax.annotation.Nullable
  public AppendixContentGenerationLimitsRatesDataInfo getContentGeneration() {
    return contentGeneration;
  }

  public void setContentGeneration(AppendixContentGenerationLimitsRatesDataInfo contentGeneration) {
    this.contentGeneration = contentGeneration;
  }


  public AppendixMinuteStatisticsDataInfo totalContentGeneration(Double totalContentGeneration) {
    this.totalContentGeneration = totalContentGeneration;
    return this;
  }

  /**
   * Get totalContentGeneration
   * @return totalContentGeneration
   */
  @javax.annotation.Nullable
  public Double getTotalContentGeneration() {
    return totalContentGeneration;
  }

  public void setTotalContentGeneration(Double totalContentGeneration) {
    this.totalContentGeneration = totalContentGeneration;
  }


  public AppendixMinuteStatisticsDataInfo value(String value) {
    this.value = value;
    return this;
  }

  /**
   * time period for grouping day in the yyyy-MM-dd format minute in the yyyy-MM-dd HH:mm format
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AppendixMinuteStatisticsDataInfo instance itself
   */
  public AppendixMinuteStatisticsDataInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    AppendixMinuteStatisticsDataInfo appendixMinuteStatisticsDataInfo = (AppendixMinuteStatisticsDataInfo) o;
    return Objects.equals(this.serp, appendixMinuteStatisticsDataInfo.serp) &&
        Objects.equals(this.total, appendixMinuteStatisticsDataInfo.total) &&
        Objects.equals(this.totalSerp, appendixMinuteStatisticsDataInfo.totalSerp) &&
        Objects.equals(this.keywordsData, appendixMinuteStatisticsDataInfo.keywordsData) &&
        Objects.equals(this.totalKeywordsData, appendixMinuteStatisticsDataInfo.totalKeywordsData) &&
        Objects.equals(this.appendix, appendixMinuteStatisticsDataInfo.appendix) &&
        Objects.equals(this.totalAppendix, appendixMinuteStatisticsDataInfo.totalAppendix) &&
        Objects.equals(this.dataforseoLabs, appendixMinuteStatisticsDataInfo.dataforseoLabs) &&
        Objects.equals(this.totalDataforseoLabs, appendixMinuteStatisticsDataInfo.totalDataforseoLabs) &&
        Objects.equals(this.domainAnalytics, appendixMinuteStatisticsDataInfo.domainAnalytics) &&
        Objects.equals(this.totalDomainAnalytics, appendixMinuteStatisticsDataInfo.totalDomainAnalytics) &&
        Objects.equals(this.merchant, appendixMinuteStatisticsDataInfo.merchant) &&
        Objects.equals(this.totalMerchant, appendixMinuteStatisticsDataInfo.totalMerchant) &&
        Objects.equals(this.onPage, appendixMinuteStatisticsDataInfo.onPage) &&
        Objects.equals(this.totalOnPage, appendixMinuteStatisticsDataInfo.totalOnPage) &&
        Objects.equals(this.businessData, appendixMinuteStatisticsDataInfo.businessData) &&
        Objects.equals(this.totalBusinessData, appendixMinuteStatisticsDataInfo.totalBusinessData) &&
        Objects.equals(this.backlinks, appendixMinuteStatisticsDataInfo.backlinks) &&
        Objects.equals(this.totalBacklinks, appendixMinuteStatisticsDataInfo.totalBacklinks) &&
        Objects.equals(this.appData, appendixMinuteStatisticsDataInfo.appData) &&
        Objects.equals(this.totalAppData, appendixMinuteStatisticsDataInfo.totalAppData) &&
        Objects.equals(this.contentAnalysis, appendixMinuteStatisticsDataInfo.contentAnalysis) &&
        Objects.equals(this.totalContentAnalysis, appendixMinuteStatisticsDataInfo.totalContentAnalysis) &&
        Objects.equals(this.contentGeneration, appendixMinuteStatisticsDataInfo.contentGeneration) &&
        Objects.equals(this.totalContentGeneration, appendixMinuteStatisticsDataInfo.totalContentGeneration) &&
        Objects.equals(this.value, appendixMinuteStatisticsDataInfo.value)&&
        Objects.equals(this.additionalProperties, appendixMinuteStatisticsDataInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(serp, total, totalSerp, keywordsData, totalKeywordsData, appendix, totalAppendix, dataforseoLabs, totalDataforseoLabs, domainAnalytics, totalDomainAnalytics, merchant, totalMerchant, onPage, totalOnPage, businessData, totalBusinessData, backlinks, totalBacklinks, appData, totalAppData, contentAnalysis, totalContentAnalysis, contentGeneration, totalContentGeneration, value, additionalProperties);
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
    sb.append("class AppendixMinuteStatisticsDataInfo {\n");
    sb.append("    serp: ").append(toIndentedString(serp)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalSerp: ").append(toIndentedString(totalSerp)).append("\n");
    sb.append("    keywordsData: ").append(toIndentedString(keywordsData)).append("\n");
    sb.append("    totalKeywordsData: ").append(toIndentedString(totalKeywordsData)).append("\n");
    sb.append("    appendix: ").append(toIndentedString(appendix)).append("\n");
    sb.append("    totalAppendix: ").append(toIndentedString(totalAppendix)).append("\n");
    sb.append("    dataforseoLabs: ").append(toIndentedString(dataforseoLabs)).append("\n");
    sb.append("    totalDataforseoLabs: ").append(toIndentedString(totalDataforseoLabs)).append("\n");
    sb.append("    domainAnalytics: ").append(toIndentedString(domainAnalytics)).append("\n");
    sb.append("    totalDomainAnalytics: ").append(toIndentedString(totalDomainAnalytics)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    totalMerchant: ").append(toIndentedString(totalMerchant)).append("\n");
    sb.append("    onPage: ").append(toIndentedString(onPage)).append("\n");
    sb.append("    totalOnPage: ").append(toIndentedString(totalOnPage)).append("\n");
    sb.append("    businessData: ").append(toIndentedString(businessData)).append("\n");
    sb.append("    totalBusinessData: ").append(toIndentedString(totalBusinessData)).append("\n");
    sb.append("    backlinks: ").append(toIndentedString(backlinks)).append("\n");
    sb.append("    totalBacklinks: ").append(toIndentedString(totalBacklinks)).append("\n");
    sb.append("    appData: ").append(toIndentedString(appData)).append("\n");
    sb.append("    totalAppData: ").append(toIndentedString(totalAppData)).append("\n");
    sb.append("    contentAnalysis: ").append(toIndentedString(contentAnalysis)).append("\n");
    sb.append("    totalContentAnalysis: ").append(toIndentedString(totalContentAnalysis)).append("\n");
    sb.append("    contentGeneration: ").append(toIndentedString(contentGeneration)).append("\n");
    sb.append("    totalContentGeneration: ").append(toIndentedString(totalContentGeneration)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("serp");
    openapiFields.add("total");
    openapiFields.add("total_serp");
    openapiFields.add("keywords_data");
    openapiFields.add("total_keywords_data");
    openapiFields.add("appendix");
    openapiFields.add("total_appendix");
    openapiFields.add("dataforseo_labs");
    openapiFields.add("total_dataforseo_labs");
    openapiFields.add("domain_analytics");
    openapiFields.add("total_domain_analytics");
    openapiFields.add("merchant");
    openapiFields.add("total_merchant");
    openapiFields.add("on_page");
    openapiFields.add("total_on_page");
    openapiFields.add("business_data");
    openapiFields.add("total_business_data");
    openapiFields.add("backlinks");
    openapiFields.add("total_backlinks");
    openapiFields.add("app_data");
    openapiFields.add("total_app_data");
    openapiFields.add("content_analysis");
    openapiFields.add("total_content_analysis");
    openapiFields.add("content_generation");
    openapiFields.add("total_content_generation");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixMinuteStatisticsDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixMinuteStatisticsDataInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixMinuteStatisticsDataInfo is not found in the empty JSON string", AppendixMinuteStatisticsDataInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `serp`
      if (jsonObj.get("serp") != null && !jsonObj.get("serp").isJsonNull()) {
        AppendixSerpLimitsRatesDataInfo.validateJsonElement(jsonObj.get("serp"));
      }
      // validate the optional field `keywords_data`
      if (jsonObj.get("keywords_data") != null && !jsonObj.get("keywords_data").isJsonNull()) {
        AppendixKeywordsDatasRatesDataInfo.validateJsonElement(jsonObj.get("keywords_data"));
      }
      // validate the optional field `appendix`
      if (jsonObj.get("appendix") != null && !jsonObj.get("appendix").isJsonNull()) {
        AppendixAppendixDaysRatesDataInfo.validateJsonElement(jsonObj.get("appendix"));
      }
      // validate the optional field `dataforseo_labs`
      if (jsonObj.get("dataforseo_labs") != null && !jsonObj.get("dataforseo_labs").isJsonNull()) {
        AppendixDataforseoLabsLimitsRatesDataInfo.validateJsonElement(jsonObj.get("dataforseo_labs"));
      }
      // validate the optional field `domain_analytics`
      if (jsonObj.get("domain_analytics") != null && !jsonObj.get("domain_analytics").isJsonNull()) {
        AppendixDomainAnalyticsLimitsRatesDataInfo.validateJsonElement(jsonObj.get("domain_analytics"));
      }
      // validate the optional field `merchant`
      if (jsonObj.get("merchant") != null && !jsonObj.get("merchant").isJsonNull()) {
        AppendixMerchantLimitsRatesDataInfo.validateJsonElement(jsonObj.get("merchant"));
      }
      // validate the optional field `on_page`
      if (jsonObj.get("on_page") != null && !jsonObj.get("on_page").isJsonNull()) {
        AppendixOnPageLimitsRatesDataInfo.validateJsonElement(jsonObj.get("on_page"));
      }
      // validate the optional field `business_data`
      if (jsonObj.get("business_data") != null && !jsonObj.get("business_data").isJsonNull()) {
        AppendixBusinessDataLimitsRatesDataInfo.validateJsonElement(jsonObj.get("business_data"));
      }
      // validate the optional field `backlinks`
      if (jsonObj.get("backlinks") != null && !jsonObj.get("backlinks").isJsonNull()) {
        AppendixBacklinksLimitsRatesDataInfo.validateJsonElement(jsonObj.get("backlinks"));
      }
      // validate the optional field `app_data`
      if (jsonObj.get("app_data") != null && !jsonObj.get("app_data").isJsonNull()) {
        AppendixAppDataLimitsRatesDataInfo.validateJsonElement(jsonObj.get("app_data"));
      }
      // validate the optional field `content_analysis`
      if (jsonObj.get("content_analysis") != null && !jsonObj.get("content_analysis").isJsonNull()) {
        AppendixContentAnalysisLimitsRatesDataInfo.validateJsonElement(jsonObj.get("content_analysis"));
      }
      // validate the optional field `content_generation`
      if (jsonObj.get("content_generation") != null && !jsonObj.get("content_generation").isJsonNull()) {
        AppendixContentGenerationLimitsRatesDataInfo.validateJsonElement(jsonObj.get("content_generation"));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixMinuteStatisticsDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixMinuteStatisticsDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixMinuteStatisticsDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixMinuteStatisticsDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixMinuteStatisticsDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixMinuteStatisticsDataInfo value) throws IOException {
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
           public AppendixMinuteStatisticsDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixMinuteStatisticsDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of AppendixMinuteStatisticsDataInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppendixMinuteStatisticsDataInfo
   * @throws IOException if the JSON string is invalid with respect to AppendixMinuteStatisticsDataInfo
   */
  public static AppendixMinuteStatisticsDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixMinuteStatisticsDataInfo.class);
  }

  /**
   * Convert an instance of AppendixMinuteStatisticsDataInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


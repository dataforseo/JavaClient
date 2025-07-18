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



public class AppendixDataInfo  {


  public static final String SERIALIZED_NAME_SERP = "serp";
  @SerializedName(SERIALIZED_NAME_SERP)
  private AppendixSerpDataInfo serp;

  public AppendixDataInfo serp(AppendixSerpDataInfo serp) {
    this.serp = serp;
    return this;
  }

  /**
   * 
   * @return serp
   */
  @javax.annotation.Nullable
  public AppendixSerpDataInfo getSerp() {
    return serp;
  }

  public void setSerp(AppendixSerpDataInfo serp) {
    this.serp = serp;
  }


  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public AppendixDataInfo total(Double total) {
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


  public static final String SERIALIZED_NAME_TOTAL_SERP = "total_serp";
  @SerializedName(SERIALIZED_NAME_TOTAL_SERP)
  private Double totalSerp;

  public AppendixDataInfo totalSerp(Double totalSerp) {
    this.totalSerp = totalSerp;
    return this;
  }

  /**
   * 
   * @return totalSerp
   */
  @javax.annotation.Nullable
  public Double getTotalSerp() {
    return totalSerp;
  }

  public void setTotalSerp(Double totalSerp) {
    this.totalSerp = totalSerp;
  }


  public static final String SERIALIZED_NAME_KEYWORDS_DATA = "keywords_data";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_DATA)
  private AppendixKeywordsDataDataInfo keywordsData;

  public AppendixDataInfo keywordsData(AppendixKeywordsDataDataInfo keywordsData) {
    this.keywordsData = keywordsData;
    return this;
  }

  /**
   * 
   * @return keywordsData
   */
  @javax.annotation.Nullable
  public AppendixKeywordsDataDataInfo getKeywordsData() {
    return keywordsData;
  }

  public void setKeywordsData(AppendixKeywordsDataDataInfo keywordsData) {
    this.keywordsData = keywordsData;
  }


  public static final String SERIALIZED_NAME_TOTAL_KEYWORDS_DATA = "total_keywords_data";
  @SerializedName(SERIALIZED_NAME_TOTAL_KEYWORDS_DATA)
  private Double totalKeywordsData;

  public AppendixDataInfo totalKeywordsData(Double totalKeywordsData) {
    this.totalKeywordsData = totalKeywordsData;
    return this;
  }

  /**
   * 
   * @return totalKeywordsData
   */
  @javax.annotation.Nullable
  public Double getTotalKeywordsData() {
    return totalKeywordsData;
  }

  public void setTotalKeywordsData(Double totalKeywordsData) {
    this.totalKeywordsData = totalKeywordsData;
  }


  public static final String SERIALIZED_NAME_APPENDIX = "appendix";
  @SerializedName(SERIALIZED_NAME_APPENDIX)
  private AppendixAppendixDataInfo appendix;

  public AppendixDataInfo appendix(AppendixAppendixDataInfo appendix) {
    this.appendix = appendix;
    return this;
  }

  /**
   * 
   * @return appendix
   */
  @javax.annotation.Nullable
  public AppendixAppendixDataInfo getAppendix() {
    return appendix;
  }

  public void setAppendix(AppendixAppendixDataInfo appendix) {
    this.appendix = appendix;
  }


  public static final String SERIALIZED_NAME_TOTAL_APPENDIX = "total_appendix";
  @SerializedName(SERIALIZED_NAME_TOTAL_APPENDIX)
  private Double totalAppendix;

  public AppendixDataInfo totalAppendix(Double totalAppendix) {
    this.totalAppendix = totalAppendix;
    return this;
  }

  /**
   * 
   * @return totalAppendix
   */
  @javax.annotation.Nullable
  public Double getTotalAppendix() {
    return totalAppendix;
  }

  public void setTotalAppendix(Double totalAppendix) {
    this.totalAppendix = totalAppendix;
  }


  public static final String SERIALIZED_NAME_DATAFORSEO_LABS = "dataforseo_labs";
  @SerializedName(SERIALIZED_NAME_DATAFORSEO_LABS)
  private AppendixDataforseoLabsLimitsRatesDataInfo dataforseoLabs;

  public AppendixDataInfo dataforseoLabs(AppendixDataforseoLabsLimitsRatesDataInfo dataforseoLabs) {
    this.dataforseoLabs = dataforseoLabs;
    return this;
  }

  /**
   * 
   * @return dataforseoLabs
   */
  @javax.annotation.Nullable
  public AppendixDataforseoLabsLimitsRatesDataInfo getDataforseoLabs() {
    return dataforseoLabs;
  }

  public void setDataforseoLabs(AppendixDataforseoLabsLimitsRatesDataInfo dataforseoLabs) {
    this.dataforseoLabs = dataforseoLabs;
  }


  public static final String SERIALIZED_NAME_TOTAL_DATAFORSEO_LABS = "total_dataforseo_labs";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATAFORSEO_LABS)
  private Double totalDataforseoLabs;

  public AppendixDataInfo totalDataforseoLabs(Double totalDataforseoLabs) {
    this.totalDataforseoLabs = totalDataforseoLabs;
    return this;
  }

  /**
   * 
   * @return totalDataforseoLabs
   */
  @javax.annotation.Nullable
  public Double getTotalDataforseoLabs() {
    return totalDataforseoLabs;
  }

  public void setTotalDataforseoLabs(Double totalDataforseoLabs) {
    this.totalDataforseoLabs = totalDataforseoLabs;
  }


  public static final String SERIALIZED_NAME_DOMAIN_ANALYTICS = "domain_analytics";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ANALYTICS)
  private AppendixDomainAnalyticsLimitsRatesDataInfo domainAnalytics;

  public AppendixDataInfo domainAnalytics(AppendixDomainAnalyticsLimitsRatesDataInfo domainAnalytics) {
    this.domainAnalytics = domainAnalytics;
    return this;
  }

  /**
   * 
   * @return domainAnalytics
   */
  @javax.annotation.Nullable
  public AppendixDomainAnalyticsLimitsRatesDataInfo getDomainAnalytics() {
    return domainAnalytics;
  }

  public void setDomainAnalytics(AppendixDomainAnalyticsLimitsRatesDataInfo domainAnalytics) {
    this.domainAnalytics = domainAnalytics;
  }


  public static final String SERIALIZED_NAME_TOTAL_DOMAIN_ANALYTICS = "total_domain_analytics";
  @SerializedName(SERIALIZED_NAME_TOTAL_DOMAIN_ANALYTICS)
  private Double totalDomainAnalytics;

  public AppendixDataInfo totalDomainAnalytics(Double totalDomainAnalytics) {
    this.totalDomainAnalytics = totalDomainAnalytics;
    return this;
  }

  /**
   * 
   * @return totalDomainAnalytics
   */
  @javax.annotation.Nullable
  public Double getTotalDomainAnalytics() {
    return totalDomainAnalytics;
  }

  public void setTotalDomainAnalytics(Double totalDomainAnalytics) {
    this.totalDomainAnalytics = totalDomainAnalytics;
  }


  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private AppendixMerchantLimitsRatesDataInfo merchant;

  public AppendixDataInfo merchant(AppendixMerchantLimitsRatesDataInfo merchant) {
    this.merchant = merchant;
    return this;
  }

  /**
   * 
   * @return merchant
   */
  @javax.annotation.Nullable
  public AppendixMerchantLimitsRatesDataInfo getMerchant() {
    return merchant;
  }

  public void setMerchant(AppendixMerchantLimitsRatesDataInfo merchant) {
    this.merchant = merchant;
  }


  public static final String SERIALIZED_NAME_TOTAL_MERCHANT = "total_merchant";
  @SerializedName(SERIALIZED_NAME_TOTAL_MERCHANT)
  private Double totalMerchant;

  public AppendixDataInfo totalMerchant(Double totalMerchant) {
    this.totalMerchant = totalMerchant;
    return this;
  }

  /**
   * 
   * @return totalMerchant
   */
  @javax.annotation.Nullable
  public Double getTotalMerchant() {
    return totalMerchant;
  }

  public void setTotalMerchant(Double totalMerchant) {
    this.totalMerchant = totalMerchant;
  }


  public static final String SERIALIZED_NAME_ON_PAGE = "on_page";
  @SerializedName(SERIALIZED_NAME_ON_PAGE)
  private AppendixOnPageLimitsRatesDataInfo onPage;

  public AppendixDataInfo onPage(AppendixOnPageLimitsRatesDataInfo onPage) {
    this.onPage = onPage;
    return this;
  }

  /**
   * 
   * @return onPage
   */
  @javax.annotation.Nullable
  public AppendixOnPageLimitsRatesDataInfo getOnPage() {
    return onPage;
  }

  public void setOnPage(AppendixOnPageLimitsRatesDataInfo onPage) {
    this.onPage = onPage;
  }


  public static final String SERIALIZED_NAME_TOTAL_ON_PAGE = "total_on_page";
  @SerializedName(SERIALIZED_NAME_TOTAL_ON_PAGE)
  private Double totalOnPage;

  public AppendixDataInfo totalOnPage(Double totalOnPage) {
    this.totalOnPage = totalOnPage;
    return this;
  }

  /**
   * 
   * @return totalOnPage
   */
  @javax.annotation.Nullable
  public Double getTotalOnPage() {
    return totalOnPage;
  }

  public void setTotalOnPage(Double totalOnPage) {
    this.totalOnPage = totalOnPage;
  }


  public static final String SERIALIZED_NAME_BUSINESS_DATA = "business_data";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DATA)
  private AppendixBusinessDataLimitsRatesDataInfo businessData;

  public AppendixDataInfo businessData(AppendixBusinessDataLimitsRatesDataInfo businessData) {
    this.businessData = businessData;
    return this;
  }

  /**
   * 
   * @return businessData
   */
  @javax.annotation.Nullable
  public AppendixBusinessDataLimitsRatesDataInfo getBusinessData() {
    return businessData;
  }

  public void setBusinessData(AppendixBusinessDataLimitsRatesDataInfo businessData) {
    this.businessData = businessData;
  }


  public static final String SERIALIZED_NAME_TOTAL_BUSINESS_DATA = "total_business_data";
  @SerializedName(SERIALIZED_NAME_TOTAL_BUSINESS_DATA)
  private Double totalBusinessData;

  public AppendixDataInfo totalBusinessData(Double totalBusinessData) {
    this.totalBusinessData = totalBusinessData;
    return this;
  }

  /**
   * 
   * @return totalBusinessData
   */
  @javax.annotation.Nullable
  public Double getTotalBusinessData() {
    return totalBusinessData;
  }

  public void setTotalBusinessData(Double totalBusinessData) {
    this.totalBusinessData = totalBusinessData;
  }


  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private AppendixBacklinksLimitsRatesDataInfo backlinks;

  public AppendixDataInfo backlinks(AppendixBacklinksLimitsRatesDataInfo backlinks) {
    this.backlinks = backlinks;
    return this;
  }

  /**
   * 
   * @return backlinks
   */
  @javax.annotation.Nullable
  public AppendixBacklinksLimitsRatesDataInfo getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(AppendixBacklinksLimitsRatesDataInfo backlinks) {
    this.backlinks = backlinks;
  }


  public static final String SERIALIZED_NAME_TOTAL_BACKLINKS = "total_backlinks";
  @SerializedName(SERIALIZED_NAME_TOTAL_BACKLINKS)
  private Double totalBacklinks;

  public AppendixDataInfo totalBacklinks(Double totalBacklinks) {
    this.totalBacklinks = totalBacklinks;
    return this;
  }

  /**
   * 
   * @return totalBacklinks
   */
  @javax.annotation.Nullable
  public Double getTotalBacklinks() {
    return totalBacklinks;
  }

  public void setTotalBacklinks(Double totalBacklinks) {
    this.totalBacklinks = totalBacklinks;
  }


  public static final String SERIALIZED_NAME_APP_DATA = "app_data";
  @SerializedName(SERIALIZED_NAME_APP_DATA)
  private AppendixAppDataLimitsRatesDataInfo appData;

  public AppendixDataInfo appData(AppendixAppDataLimitsRatesDataInfo appData) {
    this.appData = appData;
    return this;
  }

  /**
   * 
   * @return appData
   */
  @javax.annotation.Nullable
  public AppendixAppDataLimitsRatesDataInfo getAppData() {
    return appData;
  }

  public void setAppData(AppendixAppDataLimitsRatesDataInfo appData) {
    this.appData = appData;
  }


  public static final String SERIALIZED_NAME_TOTAL_APP_DATA = "total_app_data";
  @SerializedName(SERIALIZED_NAME_TOTAL_APP_DATA)
  private Double totalAppData;

  public AppendixDataInfo totalAppData(Double totalAppData) {
    this.totalAppData = totalAppData;
    return this;
  }

  /**
   * 
   * @return totalAppData
   */
  @javax.annotation.Nullable
  public Double getTotalAppData() {
    return totalAppData;
  }

  public void setTotalAppData(Double totalAppData) {
    this.totalAppData = totalAppData;
  }


  public static final String SERIALIZED_NAME_CONTENT_ANALYSIS = "content_analysis";
  @SerializedName(SERIALIZED_NAME_CONTENT_ANALYSIS)
  private AppendixContentAnalysisLimitsRatesDataInfo contentAnalysis;

  public AppendixDataInfo contentAnalysis(AppendixContentAnalysisLimitsRatesDataInfo contentAnalysis) {
    this.contentAnalysis = contentAnalysis;
    return this;
  }

  /**
   * 
   * @return contentAnalysis
   */
  @javax.annotation.Nullable
  public AppendixContentAnalysisLimitsRatesDataInfo getContentAnalysis() {
    return contentAnalysis;
  }

  public void setContentAnalysis(AppendixContentAnalysisLimitsRatesDataInfo contentAnalysis) {
    this.contentAnalysis = contentAnalysis;
  }


  public static final String SERIALIZED_NAME_TOTAL_CONTENT_ANALYSIS = "total_content_analysis";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONTENT_ANALYSIS)
  private Double totalContentAnalysis;

  public AppendixDataInfo totalContentAnalysis(Double totalContentAnalysis) {
    this.totalContentAnalysis = totalContentAnalysis;
    return this;
  }

  /**
   * 
   * @return totalContentAnalysis
   */
  @javax.annotation.Nullable
  public Double getTotalContentAnalysis() {
    return totalContentAnalysis;
  }

  public void setTotalContentAnalysis(Double totalContentAnalysis) {
    this.totalContentAnalysis = totalContentAnalysis;
  }


  public static final String SERIALIZED_NAME_CONTENT_GENERATION = "content_generation";
  @SerializedName(SERIALIZED_NAME_CONTENT_GENERATION)
  private AppendixContentGenerationLimitsRatesDataInfo contentGeneration;

  public AppendixDataInfo contentGeneration(AppendixContentGenerationLimitsRatesDataInfo contentGeneration) {
    this.contentGeneration = contentGeneration;
    return this;
  }

  /**
   * 
   * @return contentGeneration
   */
  @javax.annotation.Nullable
  public AppendixContentGenerationLimitsRatesDataInfo getContentGeneration() {
    return contentGeneration;
  }

  public void setContentGeneration(AppendixContentGenerationLimitsRatesDataInfo contentGeneration) {
    this.contentGeneration = contentGeneration;
  }


  public static final String SERIALIZED_NAME_TOTAL_CONTENT_GENERATION = "total_content_generation";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONTENT_GENERATION)
  private Double totalContentGeneration;

  public AppendixDataInfo totalContentGeneration(Double totalContentGeneration) {
    this.totalContentGeneration = totalContentGeneration;
    return this;
  }

  /**
   * 
   * @return totalContentGeneration
   */
  @javax.annotation.Nullable
  public Double getTotalContentGeneration() {
    return totalContentGeneration;
  }

  public void setTotalContentGeneration(Double totalContentGeneration) {
    this.totalContentGeneration = totalContentGeneration;
  }


  public static final String SERIALIZED_NAME_TOTAL_TRAFFIC_ANALYTICS = "total_traffic_analytics";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRAFFIC_ANALYTICS)
  private Double totalTrafficAnalytics;

  public AppendixDataInfo totalTrafficAnalytics(Double totalTrafficAnalytics) {
    this.totalTrafficAnalytics = totalTrafficAnalytics;
    return this;
  }

  /**
   * 
   * @return totalTrafficAnalytics
   */
  @javax.annotation.Nullable
  public Double getTotalTrafficAnalytics() {
    return totalTrafficAnalytics;
  }

  public void setTotalTrafficAnalytics(Double totalTrafficAnalytics) {
    this.totalTrafficAnalytics = totalTrafficAnalytics;
  }


  public static final String SERIALIZED_NAME_TRAFFIC_ANALYTICS = "traffic_analytics";
  @SerializedName(SERIALIZED_NAME_TRAFFIC_ANALYTICS)
  private AppendixSerpDaysRatesDataInfo trafficAnalytics;

  public AppendixDataInfo trafficAnalytics(AppendixSerpDaysRatesDataInfo trafficAnalytics) {
    this.trafficAnalytics = trafficAnalytics;
    return this;
  }

  /**
   * 
   * @return trafficAnalytics
   */
  @javax.annotation.Nullable
  public AppendixSerpDaysRatesDataInfo getTrafficAnalytics() {
    return trafficAnalytics;
  }

  public void setTrafficAnalytics(AppendixSerpDaysRatesDataInfo trafficAnalytics) {
    this.trafficAnalytics = trafficAnalytics;
  }


  public static final String SERIALIZED_NAME_TOTAL_REVIEWS = "total_reviews";
  @SerializedName(SERIALIZED_NAME_TOTAL_REVIEWS)
  private Double totalReviews;

  public AppendixDataInfo totalReviews(Double totalReviews) {
    this.totalReviews = totalReviews;
    return this;
  }

  /**
   * 
   * @return totalReviews
   */
  @javax.annotation.Nullable
  public Double getTotalReviews() {
    return totalReviews;
  }

  public void setTotalReviews(Double totalReviews) {
    this.totalReviews = totalReviews;
  }


  public static final String SERIALIZED_NAME_REVIEWS = "reviews";
  @SerializedName(SERIALIZED_NAME_REVIEWS)
  private AppendixSerpDaysRatesDataInfo reviews;

  public AppendixDataInfo reviews(AppendixSerpDaysRatesDataInfo reviews) {
    this.reviews = reviews;
    return this;
  }

  /**
   * 
   * @return reviews
   */
  @javax.annotation.Nullable
  public AppendixSerpDaysRatesDataInfo getReviews() {
    return reviews;
  }

  public void setReviews(AppendixSerpDaysRatesDataInfo reviews) {
    this.reviews = reviews;
  }


  public static final String SERIALIZED_NAME_TOTAL_SOCIAL = "total_social";
  @SerializedName(SERIALIZED_NAME_TOTAL_SOCIAL)
  private Double totalSocial;

  public AppendixDataInfo totalSocial(Double totalSocial) {
    this.totalSocial = totalSocial;
    return this;
  }

  /**
   * 
   * @return totalSocial
   */
  @javax.annotation.Nullable
  public Double getTotalSocial() {
    return totalSocial;
  }

  public void setTotalSocial(Double totalSocial) {
    this.totalSocial = totalSocial;
  }


  public static final String SERIALIZED_NAME_SOCIAL = "social";
  @SerializedName(SERIALIZED_NAME_SOCIAL)
  private AppendixSerpDaysRatesDataInfo social;

  public AppendixDataInfo social(AppendixSerpDaysRatesDataInfo social) {
    this.social = social;
    return this;
  }

  /**
   * 
   * @return social
   */
  @javax.annotation.Nullable
  public AppendixSerpDaysRatesDataInfo getSocial() {
    return social;
  }

  public void setSocial(AppendixSerpDaysRatesDataInfo social) {
    this.social = social;
  }



  public AppendixDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixDataInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixDataInfo appendixDataInfo = (AppendixDataInfo) o;
    return

        Objects.equals(this.serp, appendixDataInfo.serp) &&
        Objects.equals(this.total, appendixDataInfo.total) &&
        Objects.equals(this.totalSerp, appendixDataInfo.totalSerp) &&
        Objects.equals(this.keywordsData, appendixDataInfo.keywordsData) &&
        Objects.equals(this.totalKeywordsData, appendixDataInfo.totalKeywordsData) &&
        Objects.equals(this.appendix, appendixDataInfo.appendix) &&
        Objects.equals(this.totalAppendix, appendixDataInfo.totalAppendix) &&
        Objects.equals(this.dataforseoLabs, appendixDataInfo.dataforseoLabs) &&
        Objects.equals(this.totalDataforseoLabs, appendixDataInfo.totalDataforseoLabs) &&
        Objects.equals(this.domainAnalytics, appendixDataInfo.domainAnalytics) &&
        Objects.equals(this.totalDomainAnalytics, appendixDataInfo.totalDomainAnalytics) &&
        Objects.equals(this.merchant, appendixDataInfo.merchant) &&
        Objects.equals(this.totalMerchant, appendixDataInfo.totalMerchant) &&
        Objects.equals(this.onPage, appendixDataInfo.onPage) &&
        Objects.equals(this.totalOnPage, appendixDataInfo.totalOnPage) &&
        Objects.equals(this.businessData, appendixDataInfo.businessData) &&
        Objects.equals(this.totalBusinessData, appendixDataInfo.totalBusinessData) &&
        Objects.equals(this.backlinks, appendixDataInfo.backlinks) &&
        Objects.equals(this.totalBacklinks, appendixDataInfo.totalBacklinks) &&
        Objects.equals(this.appData, appendixDataInfo.appData) &&
        Objects.equals(this.totalAppData, appendixDataInfo.totalAppData) &&
        Objects.equals(this.contentAnalysis, appendixDataInfo.contentAnalysis) &&
        Objects.equals(this.totalContentAnalysis, appendixDataInfo.totalContentAnalysis) &&
        Objects.equals(this.contentGeneration, appendixDataInfo.contentGeneration) &&
        Objects.equals(this.totalContentGeneration, appendixDataInfo.totalContentGeneration) &&
        Objects.equals(this.totalTrafficAnalytics, appendixDataInfo.totalTrafficAnalytics) &&
        Objects.equals(this.trafficAnalytics, appendixDataInfo.trafficAnalytics) &&
        Objects.equals(this.totalReviews, appendixDataInfo.totalReviews) &&
        Objects.equals(this.reviews, appendixDataInfo.reviews) &&
        Objects.equals(this.totalSocial, appendixDataInfo.totalSocial) &&
        Objects.equals(this.social, appendixDataInfo.social);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(serp, total, totalSerp, keywordsData, totalKeywordsData, appendix, totalAppendix, dataforseoLabs, totalDataforseoLabs, domainAnalytics, totalDomainAnalytics, merchant, totalMerchant, onPage, totalOnPage, businessData, totalBusinessData, backlinks, totalBacklinks, appData, totalAppData, contentAnalysis, totalContentAnalysis, contentGeneration, totalContentGeneration, totalTrafficAnalytics, trafficAnalytics, totalReviews, reviews, totalSocial, social);
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
    sb.append("class AppendixDataInfo {\n");

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
    sb.append("    totalTrafficAnalytics: ").append(toIndentedString(totalTrafficAnalytics)).append("\n");
    sb.append("    trafficAnalytics: ").append(toIndentedString(trafficAnalytics)).append("\n");
    sb.append("    totalReviews: ").append(toIndentedString(totalReviews)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
    sb.append("    totalSocial: ").append(toIndentedString(totalSocial)).append("\n");
    sb.append("    social: ").append(toIndentedString(social)).append("\n");
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
    
    openapiFields.add("total_traffic_analytics");
    
    openapiFields.add("traffic_analytics");
    
    openapiFields.add("total_reviews");
    
    openapiFields.add("reviews");
    
    openapiFields.add("total_social");
    
    openapiFields.add("social");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixDataInfo value) throws IOException {
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
           public AppendixDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
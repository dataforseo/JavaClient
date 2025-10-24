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



public class DataforseoLabsAvailableFiltersGoogleInfo  {


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD = "keyword_data.keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD)
  private String keywordDataKeyword;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeyword(String keywordDataKeyword) {
    this.keywordDataKeyword = keywordDataKeyword;
    return this;
  }

  /**
   * 
   * @return keywordDataKeyword
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeyword() {
    return keywordDataKeyword;
  }

  public void setKeywordDataKeyword(String keywordDataKeyword) {
    this.keywordDataKeyword = keywordDataKeyword;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.LAST_UPDATED_TIME = "keyword_data.keyword_info.last_updated_time";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.LAST_UPDATED_TIME)
  private String keywordDataKeywordInfoLastUpdatedTime;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoLastUpdatedTime(String keywordDataKeywordInfoLastUpdatedTime) {
    this.keywordDataKeywordInfoLastUpdatedTime = keywordDataKeywordInfoLastUpdatedTime;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoLastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoLastUpdatedTime() {
    return keywordDataKeywordInfoLastUpdatedTime;
  }

  public void setKeywordDataKeywordInfoLastUpdatedTime(String keywordDataKeywordInfoLastUpdatedTime) {
    this.keywordDataKeywordInfoLastUpdatedTime = keywordDataKeywordInfoLastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.COMPETITION = "keyword_data.keyword_info.competition";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.COMPETITION)
  private String keywordDataKeywordInfoCompetition;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoCompetition(String keywordDataKeywordInfoCompetition) {
    this.keywordDataKeywordInfoCompetition = keywordDataKeywordInfoCompetition;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoCompetition
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoCompetition() {
    return keywordDataKeywordInfoCompetition;
  }

  public void setKeywordDataKeywordInfoCompetition(String keywordDataKeywordInfoCompetition) {
    this.keywordDataKeywordInfoCompetition = keywordDataKeywordInfoCompetition;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.COMPETITION_LEVEL = "keyword_data.keyword_info.competition_level";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.COMPETITION_LEVEL)
  private String keywordDataKeywordInfoCompetitionLevel;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoCompetitionLevel(String keywordDataKeywordInfoCompetitionLevel) {
    this.keywordDataKeywordInfoCompetitionLevel = keywordDataKeywordInfoCompetitionLevel;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoCompetitionLevel
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoCompetitionLevel() {
    return keywordDataKeywordInfoCompetitionLevel;
  }

  public void setKeywordDataKeywordInfoCompetitionLevel(String keywordDataKeywordInfoCompetitionLevel) {
    this.keywordDataKeywordInfoCompetitionLevel = keywordDataKeywordInfoCompetitionLevel;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.CPC = "keyword_data.keyword_info.cpc";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.CPC)
  private String keywordDataKeywordInfoCpc;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoCpc(String keywordDataKeywordInfoCpc) {
    this.keywordDataKeywordInfoCpc = keywordDataKeywordInfoCpc;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoCpc
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoCpc() {
    return keywordDataKeywordInfoCpc;
  }

  public void setKeywordDataKeywordInfoCpc(String keywordDataKeywordInfoCpc) {
    this.keywordDataKeywordInfoCpc = keywordDataKeywordInfoCpc;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.SEARCH_VOLUME = "keyword_data.keyword_info.search_volume";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.SEARCH_VOLUME)
  private String keywordDataKeywordInfoSearchVolume;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoSearchVolume(String keywordDataKeywordInfoSearchVolume) {
    this.keywordDataKeywordInfoSearchVolume = keywordDataKeywordInfoSearchVolume;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoSearchVolume
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoSearchVolume() {
    return keywordDataKeywordInfoSearchVolume;
  }

  public void setKeywordDataKeywordInfoSearchVolume(String keywordDataKeywordInfoSearchVolume) {
    this.keywordDataKeywordInfoSearchVolume = keywordDataKeywordInfoSearchVolume;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.LOW_TOP_OF_PAGE_BID = "keyword_data.keyword_info.low_top_of_page_bid";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.LOW_TOP_OF_PAGE_BID)
  private String keywordDataKeywordInfoLowTopOfPageBid;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoLowTopOfPageBid(String keywordDataKeywordInfoLowTopOfPageBid) {
    this.keywordDataKeywordInfoLowTopOfPageBid = keywordDataKeywordInfoLowTopOfPageBid;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoLowTopOfPageBid
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoLowTopOfPageBid() {
    return keywordDataKeywordInfoLowTopOfPageBid;
  }

  public void setKeywordDataKeywordInfoLowTopOfPageBid(String keywordDataKeywordInfoLowTopOfPageBid) {
    this.keywordDataKeywordInfoLowTopOfPageBid = keywordDataKeywordInfoLowTopOfPageBid;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.HIGH_TOP_OF_PAGE_BID = "keyword_data.keyword_info.high_top_of_page_bid";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.HIGH_TOP_OF_PAGE_BID)
  private String keywordDataKeywordInfoHighTopOfPageBid;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoHighTopOfPageBid(String keywordDataKeywordInfoHighTopOfPageBid) {
    this.keywordDataKeywordInfoHighTopOfPageBid = keywordDataKeywordInfoHighTopOfPageBid;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoHighTopOfPageBid
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoHighTopOfPageBid() {
    return keywordDataKeywordInfoHighTopOfPageBid;
  }

  public void setKeywordDataKeywordInfoHighTopOfPageBid(String keywordDataKeywordInfoHighTopOfPageBid) {
    this.keywordDataKeywordInfoHighTopOfPageBid = keywordDataKeywordInfoHighTopOfPageBid;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.CATEGORIES = "keyword_data.keyword_info.categories";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.CATEGORIES)
  private String keywordDataKeywordInfoCategories;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoCategories(String keywordDataKeywordInfoCategories) {
    this.keywordDataKeywordInfoCategories = keywordDataKeywordInfoCategories;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoCategories
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoCategories() {
    return keywordDataKeywordInfoCategories;
  }

  public void setKeywordDataKeywordInfoCategories(String keywordDataKeywordInfoCategories) {
    this.keywordDataKeywordInfoCategories = keywordDataKeywordInfoCategories;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.SEARCH_VOLUME_TREND.MONTHLY = "keyword_data.keyword_info.search_volume_trend.monthly";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.SEARCH_VOLUME_TREND.MONTHLY)
  private String keywordDataKeywordInfoSearchVolumeTrendMonthly;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoSearchVolumeTrendMonthly(String keywordDataKeywordInfoSearchVolumeTrendMonthly) {
    this.keywordDataKeywordInfoSearchVolumeTrendMonthly = keywordDataKeywordInfoSearchVolumeTrendMonthly;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoSearchVolumeTrendMonthly
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoSearchVolumeTrendMonthly() {
    return keywordDataKeywordInfoSearchVolumeTrendMonthly;
  }

  public void setKeywordDataKeywordInfoSearchVolumeTrendMonthly(String keywordDataKeywordInfoSearchVolumeTrendMonthly) {
    this.keywordDataKeywordInfoSearchVolumeTrendMonthly = keywordDataKeywordInfoSearchVolumeTrendMonthly;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.SEARCH_VOLUME_TREND.QUARTERLY = "keyword_data.keyword_info.search_volume_trend.quarterly";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.SEARCH_VOLUME_TREND.QUARTERLY)
  private String keywordDataKeywordInfoSearchVolumeTrendQuarterly;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoSearchVolumeTrendQuarterly(String keywordDataKeywordInfoSearchVolumeTrendQuarterly) {
    this.keywordDataKeywordInfoSearchVolumeTrendQuarterly = keywordDataKeywordInfoSearchVolumeTrendQuarterly;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoSearchVolumeTrendQuarterly
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoSearchVolumeTrendQuarterly() {
    return keywordDataKeywordInfoSearchVolumeTrendQuarterly;
  }

  public void setKeywordDataKeywordInfoSearchVolumeTrendQuarterly(String keywordDataKeywordInfoSearchVolumeTrendQuarterly) {
    this.keywordDataKeywordInfoSearchVolumeTrendQuarterly = keywordDataKeywordInfoSearchVolumeTrendQuarterly;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.SEARCH_VOLUME_TREND.YEARLY = "keyword_data.keyword_info.search_volume_trend.yearly";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.SEARCH_VOLUME_TREND.YEARLY)
  private String keywordDataKeywordInfoSearchVolumeTrendYearly;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoSearchVolumeTrendYearly(String keywordDataKeywordInfoSearchVolumeTrendYearly) {
    this.keywordDataKeywordInfoSearchVolumeTrendYearly = keywordDataKeywordInfoSearchVolumeTrendYearly;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoSearchVolumeTrendYearly
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoSearchVolumeTrendYearly() {
    return keywordDataKeywordInfoSearchVolumeTrendYearly;
  }

  public void setKeywordDataKeywordInfoSearchVolumeTrendYearly(String keywordDataKeywordInfoSearchVolumeTrendYearly) {
    this.keywordDataKeywordInfoSearchVolumeTrendYearly = keywordDataKeywordInfoSearchVolumeTrendYearly;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.SEARCH_VOLUME = "keyword_data.clickstream_keyword_info.search_volume";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.SEARCH_VOLUME)
  private String keywordDataClickstreamKeywordInfoSearchVolume;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataClickstreamKeywordInfoSearchVolume(String keywordDataClickstreamKeywordInfoSearchVolume) {
    this.keywordDataClickstreamKeywordInfoSearchVolume = keywordDataClickstreamKeywordInfoSearchVolume;
    return this;
  }

  /**
   * 
   * @return keywordDataClickstreamKeywordInfoSearchVolume
   */
  @javax.annotation.Nullable
  public String getKeywordDataClickstreamKeywordInfoSearchVolume() {
    return keywordDataClickstreamKeywordInfoSearchVolume;
  }

  public void setKeywordDataClickstreamKeywordInfoSearchVolume(String keywordDataClickstreamKeywordInfoSearchVolume) {
    this.keywordDataClickstreamKeywordInfoSearchVolume = keywordDataClickstreamKeywordInfoSearchVolume;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.LAST_UPDATED_TIME = "keyword_data.clickstream_keyword_info.last_updated_time";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.LAST_UPDATED_TIME)
  private String keywordDataClickstreamKeywordInfoLastUpdatedTime;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataClickstreamKeywordInfoLastUpdatedTime(String keywordDataClickstreamKeywordInfoLastUpdatedTime) {
    this.keywordDataClickstreamKeywordInfoLastUpdatedTime = keywordDataClickstreamKeywordInfoLastUpdatedTime;
    return this;
  }

  /**
   * 
   * @return keywordDataClickstreamKeywordInfoLastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getKeywordDataClickstreamKeywordInfoLastUpdatedTime() {
    return keywordDataClickstreamKeywordInfoLastUpdatedTime;
  }

  public void setKeywordDataClickstreamKeywordInfoLastUpdatedTime(String keywordDataClickstreamKeywordInfoLastUpdatedTime) {
    this.keywordDataClickstreamKeywordInfoLastUpdatedTime = keywordDataClickstreamKeywordInfoLastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.GENDER_DISTRIBUTION.FEMALE = "keyword_data.clickstream_keyword_info.gender_distribution.female";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.GENDER_DISTRIBUTION.FEMALE)
  private String keywordDataClickstreamKeywordInfoGenderDistributionFemale;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataClickstreamKeywordInfoGenderDistributionFemale(String keywordDataClickstreamKeywordInfoGenderDistributionFemale) {
    this.keywordDataClickstreamKeywordInfoGenderDistributionFemale = keywordDataClickstreamKeywordInfoGenderDistributionFemale;
    return this;
  }

  /**
   * 
   * @return keywordDataClickstreamKeywordInfoGenderDistributionFemale
   */
  @javax.annotation.Nullable
  public String getKeywordDataClickstreamKeywordInfoGenderDistributionFemale() {
    return keywordDataClickstreamKeywordInfoGenderDistributionFemale;
  }

  public void setKeywordDataClickstreamKeywordInfoGenderDistributionFemale(String keywordDataClickstreamKeywordInfoGenderDistributionFemale) {
    this.keywordDataClickstreamKeywordInfoGenderDistributionFemale = keywordDataClickstreamKeywordInfoGenderDistributionFemale;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.GENDER_DISTRIBUTION.MALE = "keyword_data.clickstream_keyword_info.gender_distribution.male";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.GENDER_DISTRIBUTION.MALE)
  private String keywordDataClickstreamKeywordInfoGenderDistributionMale;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataClickstreamKeywordInfoGenderDistributionMale(String keywordDataClickstreamKeywordInfoGenderDistributionMale) {
    this.keywordDataClickstreamKeywordInfoGenderDistributionMale = keywordDataClickstreamKeywordInfoGenderDistributionMale;
    return this;
  }

  /**
   * 
   * @return keywordDataClickstreamKeywordInfoGenderDistributionMale
   */
  @javax.annotation.Nullable
  public String getKeywordDataClickstreamKeywordInfoGenderDistributionMale() {
    return keywordDataClickstreamKeywordInfoGenderDistributionMale;
  }

  public void setKeywordDataClickstreamKeywordInfoGenderDistributionMale(String keywordDataClickstreamKeywordInfoGenderDistributionMale) {
    this.keywordDataClickstreamKeywordInfoGenderDistributionMale = keywordDataClickstreamKeywordInfoGenderDistributionMale;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.AGE_DISTRIBUTION.18_24 = "keyword_data.clickstream_keyword_info.age_distribution.18-24";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.AGE_DISTRIBUTION.18_24)
  private String keywordDataClickstreamKeywordInfoAgeDistribution1824;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataClickstreamKeywordInfoAgeDistribution1824(String keywordDataClickstreamKeywordInfoAgeDistribution1824) {
    this.keywordDataClickstreamKeywordInfoAgeDistribution1824 = keywordDataClickstreamKeywordInfoAgeDistribution1824;
    return this;
  }

  /**
   * 
   * @return keywordDataClickstreamKeywordInfoAgeDistribution1824
   */
  @javax.annotation.Nullable
  public String getKeywordDataClickstreamKeywordInfoAgeDistribution1824() {
    return keywordDataClickstreamKeywordInfoAgeDistribution1824;
  }

  public void setKeywordDataClickstreamKeywordInfoAgeDistribution1824(String keywordDataClickstreamKeywordInfoAgeDistribution1824) {
    this.keywordDataClickstreamKeywordInfoAgeDistribution1824 = keywordDataClickstreamKeywordInfoAgeDistribution1824;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.AGE_DISTRIBUTION.25_34 = "keyword_data.clickstream_keyword_info.age_distribution.25-34";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.AGE_DISTRIBUTION.25_34)
  private String keywordDataClickstreamKeywordInfoAgeDistribution2534;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataClickstreamKeywordInfoAgeDistribution2534(String keywordDataClickstreamKeywordInfoAgeDistribution2534) {
    this.keywordDataClickstreamKeywordInfoAgeDistribution2534 = keywordDataClickstreamKeywordInfoAgeDistribution2534;
    return this;
  }

  /**
   * 
   * @return keywordDataClickstreamKeywordInfoAgeDistribution2534
   */
  @javax.annotation.Nullable
  public String getKeywordDataClickstreamKeywordInfoAgeDistribution2534() {
    return keywordDataClickstreamKeywordInfoAgeDistribution2534;
  }

  public void setKeywordDataClickstreamKeywordInfoAgeDistribution2534(String keywordDataClickstreamKeywordInfoAgeDistribution2534) {
    this.keywordDataClickstreamKeywordInfoAgeDistribution2534 = keywordDataClickstreamKeywordInfoAgeDistribution2534;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.AGE_DISTRIBUTION.35_44 = "keyword_data.clickstream_keyword_info.age_distribution.35-44";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.AGE_DISTRIBUTION.35_44)
  private String keywordDataClickstreamKeywordInfoAgeDistribution3544;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataClickstreamKeywordInfoAgeDistribution3544(String keywordDataClickstreamKeywordInfoAgeDistribution3544) {
    this.keywordDataClickstreamKeywordInfoAgeDistribution3544 = keywordDataClickstreamKeywordInfoAgeDistribution3544;
    return this;
  }

  /**
   * 
   * @return keywordDataClickstreamKeywordInfoAgeDistribution3544
   */
  @javax.annotation.Nullable
  public String getKeywordDataClickstreamKeywordInfoAgeDistribution3544() {
    return keywordDataClickstreamKeywordInfoAgeDistribution3544;
  }

  public void setKeywordDataClickstreamKeywordInfoAgeDistribution3544(String keywordDataClickstreamKeywordInfoAgeDistribution3544) {
    this.keywordDataClickstreamKeywordInfoAgeDistribution3544 = keywordDataClickstreamKeywordInfoAgeDistribution3544;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.AGE_DISTRIBUTION.45_54 = "keyword_data.clickstream_keyword_info.age_distribution.45-54";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.AGE_DISTRIBUTION.45_54)
  private String keywordDataClickstreamKeywordInfoAgeDistribution4554;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataClickstreamKeywordInfoAgeDistribution4554(String keywordDataClickstreamKeywordInfoAgeDistribution4554) {
    this.keywordDataClickstreamKeywordInfoAgeDistribution4554 = keywordDataClickstreamKeywordInfoAgeDistribution4554;
    return this;
  }

  /**
   * 
   * @return keywordDataClickstreamKeywordInfoAgeDistribution4554
   */
  @javax.annotation.Nullable
  public String getKeywordDataClickstreamKeywordInfoAgeDistribution4554() {
    return keywordDataClickstreamKeywordInfoAgeDistribution4554;
  }

  public void setKeywordDataClickstreamKeywordInfoAgeDistribution4554(String keywordDataClickstreamKeywordInfoAgeDistribution4554) {
    this.keywordDataClickstreamKeywordInfoAgeDistribution4554 = keywordDataClickstreamKeywordInfoAgeDistribution4554;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.AGE_DISTRIBUTION.55_64 = "keyword_data.clickstream_keyword_info.age_distribution.55-64";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.CLICKSTREAM_KEYWORD_INFO.AGE_DISTRIBUTION.55_64)
  private String keywordDataClickstreamKeywordInfoAgeDistribution5564;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataClickstreamKeywordInfoAgeDistribution5564(String keywordDataClickstreamKeywordInfoAgeDistribution5564) {
    this.keywordDataClickstreamKeywordInfoAgeDistribution5564 = keywordDataClickstreamKeywordInfoAgeDistribution5564;
    return this;
  }

  /**
   * 
   * @return keywordDataClickstreamKeywordInfoAgeDistribution5564
   */
  @javax.annotation.Nullable
  public String getKeywordDataClickstreamKeywordInfoAgeDistribution5564() {
    return keywordDataClickstreamKeywordInfoAgeDistribution5564;
  }

  public void setKeywordDataClickstreamKeywordInfoAgeDistribution5564(String keywordDataClickstreamKeywordInfoAgeDistribution5564) {
    this.keywordDataClickstreamKeywordInfoAgeDistribution5564 = keywordDataClickstreamKeywordInfoAgeDistribution5564;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_PROPERTIES.CORE_KEYWORD = "keyword_data.keyword_properties.core_keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_PROPERTIES.CORE_KEYWORD)
  private String keywordDataKeywordPropertiesCoreKeyword;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordPropertiesCoreKeyword(String keywordDataKeywordPropertiesCoreKeyword) {
    this.keywordDataKeywordPropertiesCoreKeyword = keywordDataKeywordPropertiesCoreKeyword;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordPropertiesCoreKeyword
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordPropertiesCoreKeyword() {
    return keywordDataKeywordPropertiesCoreKeyword;
  }

  public void setKeywordDataKeywordPropertiesCoreKeyword(String keywordDataKeywordPropertiesCoreKeyword) {
    this.keywordDataKeywordPropertiesCoreKeyword = keywordDataKeywordPropertiesCoreKeyword;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_PROPERTIES.SYNONYM_CLUSTERING_ALGORITHM = "keyword_data.keyword_properties.synonym_clustering_algorithm";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_PROPERTIES.SYNONYM_CLUSTERING_ALGORITHM)
  private String keywordDataKeywordPropertiesSynonymClusteringAlgorithm;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordPropertiesSynonymClusteringAlgorithm(String keywordDataKeywordPropertiesSynonymClusteringAlgorithm) {
    this.keywordDataKeywordPropertiesSynonymClusteringAlgorithm = keywordDataKeywordPropertiesSynonymClusteringAlgorithm;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordPropertiesSynonymClusteringAlgorithm
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordPropertiesSynonymClusteringAlgorithm() {
    return keywordDataKeywordPropertiesSynonymClusteringAlgorithm;
  }

  public void setKeywordDataKeywordPropertiesSynonymClusteringAlgorithm(String keywordDataKeywordPropertiesSynonymClusteringAlgorithm) {
    this.keywordDataKeywordPropertiesSynonymClusteringAlgorithm = keywordDataKeywordPropertiesSynonymClusteringAlgorithm;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_PROPERTIES.KEYWORD_DIFFICULTY = "keyword_data.keyword_properties.keyword_difficulty";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_PROPERTIES.KEYWORD_DIFFICULTY)
  private String keywordDataKeywordPropertiesKeywordDifficulty;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordPropertiesKeywordDifficulty(String keywordDataKeywordPropertiesKeywordDifficulty) {
    this.keywordDataKeywordPropertiesKeywordDifficulty = keywordDataKeywordPropertiesKeywordDifficulty;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordPropertiesKeywordDifficulty
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordPropertiesKeywordDifficulty() {
    return keywordDataKeywordPropertiesKeywordDifficulty;
  }

  public void setKeywordDataKeywordPropertiesKeywordDifficulty(String keywordDataKeywordPropertiesKeywordDifficulty) {
    this.keywordDataKeywordPropertiesKeywordDifficulty = keywordDataKeywordPropertiesKeywordDifficulty;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_PROPERTIES.DETECTED_LANGUAGE = "keyword_data.keyword_properties.detected_language";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_PROPERTIES.DETECTED_LANGUAGE)
  private String keywordDataKeywordPropertiesDetectedLanguage;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordPropertiesDetectedLanguage(String keywordDataKeywordPropertiesDetectedLanguage) {
    this.keywordDataKeywordPropertiesDetectedLanguage = keywordDataKeywordPropertiesDetectedLanguage;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordPropertiesDetectedLanguage
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordPropertiesDetectedLanguage() {
    return keywordDataKeywordPropertiesDetectedLanguage;
  }

  public void setKeywordDataKeywordPropertiesDetectedLanguage(String keywordDataKeywordPropertiesDetectedLanguage) {
    this.keywordDataKeywordPropertiesDetectedLanguage = keywordDataKeywordPropertiesDetectedLanguage;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_PROPERTIES.IS_ANOTHER_LANGUAGE = "keyword_data.keyword_properties.is_another_language";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_PROPERTIES.IS_ANOTHER_LANGUAGE)
  private String keywordDataKeywordPropertiesIsAnotherLanguage;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordPropertiesIsAnotherLanguage(String keywordDataKeywordPropertiesIsAnotherLanguage) {
    this.keywordDataKeywordPropertiesIsAnotherLanguage = keywordDataKeywordPropertiesIsAnotherLanguage;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordPropertiesIsAnotherLanguage
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordPropertiesIsAnotherLanguage() {
    return keywordDataKeywordPropertiesIsAnotherLanguage;
  }

  public void setKeywordDataKeywordPropertiesIsAnotherLanguage(String keywordDataKeywordPropertiesIsAnotherLanguage) {
    this.keywordDataKeywordPropertiesIsAnotherLanguage = keywordDataKeywordPropertiesIsAnotherLanguage;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.SERP_INFO.CHECK_URL = "keyword_data.serp_info.check_url";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.SERP_INFO.CHECK_URL)
  private String keywordDataSerpInfoCheckUrl;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataSerpInfoCheckUrl(String keywordDataSerpInfoCheckUrl) {
    this.keywordDataSerpInfoCheckUrl = keywordDataSerpInfoCheckUrl;
    return this;
  }

  /**
   * 
   * @return keywordDataSerpInfoCheckUrl
   */
  @javax.annotation.Nullable
  public String getKeywordDataSerpInfoCheckUrl() {
    return keywordDataSerpInfoCheckUrl;
  }

  public void setKeywordDataSerpInfoCheckUrl(String keywordDataSerpInfoCheckUrl) {
    this.keywordDataSerpInfoCheckUrl = keywordDataSerpInfoCheckUrl;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.SERP_INFO.SERP_ITEM_TYPES = "keyword_data.serp_info.serp_item_types";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.SERP_INFO.SERP_ITEM_TYPES)
  private String keywordDataSerpInfoSerpItemTypes;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataSerpInfoSerpItemTypes(String keywordDataSerpInfoSerpItemTypes) {
    this.keywordDataSerpInfoSerpItemTypes = keywordDataSerpInfoSerpItemTypes;
    return this;
  }

  /**
   * 
   * @return keywordDataSerpInfoSerpItemTypes
   */
  @javax.annotation.Nullable
  public String getKeywordDataSerpInfoSerpItemTypes() {
    return keywordDataSerpInfoSerpItemTypes;
  }

  public void setKeywordDataSerpInfoSerpItemTypes(String keywordDataSerpInfoSerpItemTypes) {
    this.keywordDataSerpInfoSerpItemTypes = keywordDataSerpInfoSerpItemTypes;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.SERP_INFO.SE_RESULTS_COUNT = "keyword_data.serp_info.se_results_count";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.SERP_INFO.SE_RESULTS_COUNT)
  private String keywordDataSerpInfoSeResultsCount;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataSerpInfoSeResultsCount(String keywordDataSerpInfoSeResultsCount) {
    this.keywordDataSerpInfoSeResultsCount = keywordDataSerpInfoSeResultsCount;
    return this;
  }

  /**
   * 
   * @return keywordDataSerpInfoSeResultsCount
   */
  @javax.annotation.Nullable
  public String getKeywordDataSerpInfoSeResultsCount() {
    return keywordDataSerpInfoSeResultsCount;
  }

  public void setKeywordDataSerpInfoSeResultsCount(String keywordDataSerpInfoSeResultsCount) {
    this.keywordDataSerpInfoSeResultsCount = keywordDataSerpInfoSeResultsCount;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.SERP_INFO.LAST_UPDATED_TIME = "keyword_data.serp_info.last_updated_time";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.SERP_INFO.LAST_UPDATED_TIME)
  private String keywordDataSerpInfoLastUpdatedTime;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataSerpInfoLastUpdatedTime(String keywordDataSerpInfoLastUpdatedTime) {
    this.keywordDataSerpInfoLastUpdatedTime = keywordDataSerpInfoLastUpdatedTime;
    return this;
  }

  /**
   * 
   * @return keywordDataSerpInfoLastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getKeywordDataSerpInfoLastUpdatedTime() {
    return keywordDataSerpInfoLastUpdatedTime;
  }

  public void setKeywordDataSerpInfoLastUpdatedTime(String keywordDataSerpInfoLastUpdatedTime) {
    this.keywordDataSerpInfoLastUpdatedTime = keywordDataSerpInfoLastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.SERP_INFO.PREVIOUS_UPDATED_TIME = "keyword_data.serp_info.previous_updated_time";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.SERP_INFO.PREVIOUS_UPDATED_TIME)
  private String keywordDataSerpInfoPreviousUpdatedTime;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataSerpInfoPreviousUpdatedTime(String keywordDataSerpInfoPreviousUpdatedTime) {
    this.keywordDataSerpInfoPreviousUpdatedTime = keywordDataSerpInfoPreviousUpdatedTime;
    return this;
  }

  /**
   * 
   * @return keywordDataSerpInfoPreviousUpdatedTime
   */
  @javax.annotation.Nullable
  public String getKeywordDataSerpInfoPreviousUpdatedTime() {
    return keywordDataSerpInfoPreviousUpdatedTime;
  }

  public void setKeywordDataSerpInfoPreviousUpdatedTime(String keywordDataSerpInfoPreviousUpdatedTime) {
    this.keywordDataSerpInfoPreviousUpdatedTime = keywordDataSerpInfoPreviousUpdatedTime;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.BACKLINKS = "keyword_data.avg_backlinks_info.backlinks";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.BACKLINKS)
  private String keywordDataAvgBacklinksInfoBacklinks;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataAvgBacklinksInfoBacklinks(String keywordDataAvgBacklinksInfoBacklinks) {
    this.keywordDataAvgBacklinksInfoBacklinks = keywordDataAvgBacklinksInfoBacklinks;
    return this;
  }

  /**
   * 
   * @return keywordDataAvgBacklinksInfoBacklinks
   */
  @javax.annotation.Nullable
  public String getKeywordDataAvgBacklinksInfoBacklinks() {
    return keywordDataAvgBacklinksInfoBacklinks;
  }

  public void setKeywordDataAvgBacklinksInfoBacklinks(String keywordDataAvgBacklinksInfoBacklinks) {
    this.keywordDataAvgBacklinksInfoBacklinks = keywordDataAvgBacklinksInfoBacklinks;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.DOFOLLOW = "keyword_data.avg_backlinks_info.dofollow";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.DOFOLLOW)
  private String keywordDataAvgBacklinksInfoDofollow;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataAvgBacklinksInfoDofollow(String keywordDataAvgBacklinksInfoDofollow) {
    this.keywordDataAvgBacklinksInfoDofollow = keywordDataAvgBacklinksInfoDofollow;
    return this;
  }

  /**
   * 
   * @return keywordDataAvgBacklinksInfoDofollow
   */
  @javax.annotation.Nullable
  public String getKeywordDataAvgBacklinksInfoDofollow() {
    return keywordDataAvgBacklinksInfoDofollow;
  }

  public void setKeywordDataAvgBacklinksInfoDofollow(String keywordDataAvgBacklinksInfoDofollow) {
    this.keywordDataAvgBacklinksInfoDofollow = keywordDataAvgBacklinksInfoDofollow;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.REFERRING_PAGES = "keyword_data.avg_backlinks_info.referring_pages";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.REFERRING_PAGES)
  private String keywordDataAvgBacklinksInfoReferringPages;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataAvgBacklinksInfoReferringPages(String keywordDataAvgBacklinksInfoReferringPages) {
    this.keywordDataAvgBacklinksInfoReferringPages = keywordDataAvgBacklinksInfoReferringPages;
    return this;
  }

  /**
   * 
   * @return keywordDataAvgBacklinksInfoReferringPages
   */
  @javax.annotation.Nullable
  public String getKeywordDataAvgBacklinksInfoReferringPages() {
    return keywordDataAvgBacklinksInfoReferringPages;
  }

  public void setKeywordDataAvgBacklinksInfoReferringPages(String keywordDataAvgBacklinksInfoReferringPages) {
    this.keywordDataAvgBacklinksInfoReferringPages = keywordDataAvgBacklinksInfoReferringPages;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.REFERRING_DOMAINS = "keyword_data.avg_backlinks_info.referring_domains";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.REFERRING_DOMAINS)
  private String keywordDataAvgBacklinksInfoReferringDomains;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataAvgBacklinksInfoReferringDomains(String keywordDataAvgBacklinksInfoReferringDomains) {
    this.keywordDataAvgBacklinksInfoReferringDomains = keywordDataAvgBacklinksInfoReferringDomains;
    return this;
  }

  /**
   * 
   * @return keywordDataAvgBacklinksInfoReferringDomains
   */
  @javax.annotation.Nullable
  public String getKeywordDataAvgBacklinksInfoReferringDomains() {
    return keywordDataAvgBacklinksInfoReferringDomains;
  }

  public void setKeywordDataAvgBacklinksInfoReferringDomains(String keywordDataAvgBacklinksInfoReferringDomains) {
    this.keywordDataAvgBacklinksInfoReferringDomains = keywordDataAvgBacklinksInfoReferringDomains;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.REFERRING_MAIN_DOMAINS = "keyword_data.avg_backlinks_info.referring_main_domains";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.REFERRING_MAIN_DOMAINS)
  private String keywordDataAvgBacklinksInfoReferringMainDomains;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataAvgBacklinksInfoReferringMainDomains(String keywordDataAvgBacklinksInfoReferringMainDomains) {
    this.keywordDataAvgBacklinksInfoReferringMainDomains = keywordDataAvgBacklinksInfoReferringMainDomains;
    return this;
  }

  /**
   * 
   * @return keywordDataAvgBacklinksInfoReferringMainDomains
   */
  @javax.annotation.Nullable
  public String getKeywordDataAvgBacklinksInfoReferringMainDomains() {
    return keywordDataAvgBacklinksInfoReferringMainDomains;
  }

  public void setKeywordDataAvgBacklinksInfoReferringMainDomains(String keywordDataAvgBacklinksInfoReferringMainDomains) {
    this.keywordDataAvgBacklinksInfoReferringMainDomains = keywordDataAvgBacklinksInfoReferringMainDomains;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.RANK = "keyword_data.avg_backlinks_info.rank";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.RANK)
  private String keywordDataAvgBacklinksInfoRank;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataAvgBacklinksInfoRank(String keywordDataAvgBacklinksInfoRank) {
    this.keywordDataAvgBacklinksInfoRank = keywordDataAvgBacklinksInfoRank;
    return this;
  }

  /**
   * 
   * @return keywordDataAvgBacklinksInfoRank
   */
  @javax.annotation.Nullable
  public String getKeywordDataAvgBacklinksInfoRank() {
    return keywordDataAvgBacklinksInfoRank;
  }

  public void setKeywordDataAvgBacklinksInfoRank(String keywordDataAvgBacklinksInfoRank) {
    this.keywordDataAvgBacklinksInfoRank = keywordDataAvgBacklinksInfoRank;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.MAIN_DOMAIN_RANK = "keyword_data.avg_backlinks_info.main_domain_rank";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.MAIN_DOMAIN_RANK)
  private String keywordDataAvgBacklinksInfoMainDomainRank;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataAvgBacklinksInfoMainDomainRank(String keywordDataAvgBacklinksInfoMainDomainRank) {
    this.keywordDataAvgBacklinksInfoMainDomainRank = keywordDataAvgBacklinksInfoMainDomainRank;
    return this;
  }

  /**
   * 
   * @return keywordDataAvgBacklinksInfoMainDomainRank
   */
  @javax.annotation.Nullable
  public String getKeywordDataAvgBacklinksInfoMainDomainRank() {
    return keywordDataAvgBacklinksInfoMainDomainRank;
  }

  public void setKeywordDataAvgBacklinksInfoMainDomainRank(String keywordDataAvgBacklinksInfoMainDomainRank) {
    this.keywordDataAvgBacklinksInfoMainDomainRank = keywordDataAvgBacklinksInfoMainDomainRank;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.LAST_UPDATED_TIME = "keyword_data.avg_backlinks_info.last_updated_time";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.AVG_BACKLINKS_INFO.LAST_UPDATED_TIME)
  private String keywordDataAvgBacklinksInfoLastUpdatedTime;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataAvgBacklinksInfoLastUpdatedTime(String keywordDataAvgBacklinksInfoLastUpdatedTime) {
    this.keywordDataAvgBacklinksInfoLastUpdatedTime = keywordDataAvgBacklinksInfoLastUpdatedTime;
    return this;
  }

  /**
   * 
   * @return keywordDataAvgBacklinksInfoLastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getKeywordDataAvgBacklinksInfoLastUpdatedTime() {
    return keywordDataAvgBacklinksInfoLastUpdatedTime;
  }

  public void setKeywordDataAvgBacklinksInfoLastUpdatedTime(String keywordDataAvgBacklinksInfoLastUpdatedTime) {
    this.keywordDataAvgBacklinksInfoLastUpdatedTime = keywordDataAvgBacklinksInfoLastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.SEARCH_INTENT_INFO.MAIN_INTENT = "keyword_data.search_intent_info.main_intent";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.SEARCH_INTENT_INFO.MAIN_INTENT)
  private String keywordDataSearchIntentInfoMainIntent;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataSearchIntentInfoMainIntent(String keywordDataSearchIntentInfoMainIntent) {
    this.keywordDataSearchIntentInfoMainIntent = keywordDataSearchIntentInfoMainIntent;
    return this;
  }

  /**
   * 
   * @return keywordDataSearchIntentInfoMainIntent
   */
  @javax.annotation.Nullable
  public String getKeywordDataSearchIntentInfoMainIntent() {
    return keywordDataSearchIntentInfoMainIntent;
  }

  public void setKeywordDataSearchIntentInfoMainIntent(String keywordDataSearchIntentInfoMainIntent) {
    this.keywordDataSearchIntentInfoMainIntent = keywordDataSearchIntentInfoMainIntent;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.SEARCH_INTENT_INFO.FOREIGN_INTENT = "keyword_data.search_intent_info.foreign_intent";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.SEARCH_INTENT_INFO.FOREIGN_INTENT)
  private String keywordDataSearchIntentInfoForeignIntent;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataSearchIntentInfoForeignIntent(String keywordDataSearchIntentInfoForeignIntent) {
    this.keywordDataSearchIntentInfoForeignIntent = keywordDataSearchIntentInfoForeignIntent;
    return this;
  }

  /**
   * 
   * @return keywordDataSearchIntentInfoForeignIntent
   */
  @javax.annotation.Nullable
  public String getKeywordDataSearchIntentInfoForeignIntent() {
    return keywordDataSearchIntentInfoForeignIntent;
  }

  public void setKeywordDataSearchIntentInfoForeignIntent(String keywordDataSearchIntentInfoForeignIntent) {
    this.keywordDataSearchIntentInfoForeignIntent = keywordDataSearchIntentInfoForeignIntent;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.SEARCH_INTENT_INFO.LAST_UPDATED_TIME = "keyword_data.search_intent_info.last_updated_time";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.SEARCH_INTENT_INFO.LAST_UPDATED_TIME)
  private String keywordDataSearchIntentInfoLastUpdatedTime;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataSearchIntentInfoLastUpdatedTime(String keywordDataSearchIntentInfoLastUpdatedTime) {
    this.keywordDataSearchIntentInfoLastUpdatedTime = keywordDataSearchIntentInfoLastUpdatedTime;
    return this;
  }

  /**
   * 
   * @return keywordDataSearchIntentInfoLastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getKeywordDataSearchIntentInfoLastUpdatedTime() {
    return keywordDataSearchIntentInfoLastUpdatedTime;
  }

  public void setKeywordDataSearchIntentInfoLastUpdatedTime(String keywordDataSearchIntentInfoLastUpdatedTime) {
    this.keywordDataSearchIntentInfoLastUpdatedTime = keywordDataSearchIntentInfoLastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_BING.SEARCH_VOLUME = "keyword_data.keyword_info_normalized_with_bing.search_volume";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_BING.SEARCH_VOLUME)
  private String keywordDataKeywordInfoNormalizedWithBingSearchVolume;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoNormalizedWithBingSearchVolume(String keywordDataKeywordInfoNormalizedWithBingSearchVolume) {
    this.keywordDataKeywordInfoNormalizedWithBingSearchVolume = keywordDataKeywordInfoNormalizedWithBingSearchVolume;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoNormalizedWithBingSearchVolume
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoNormalizedWithBingSearchVolume() {
    return keywordDataKeywordInfoNormalizedWithBingSearchVolume;
  }

  public void setKeywordDataKeywordInfoNormalizedWithBingSearchVolume(String keywordDataKeywordInfoNormalizedWithBingSearchVolume) {
    this.keywordDataKeywordInfoNormalizedWithBingSearchVolume = keywordDataKeywordInfoNormalizedWithBingSearchVolume;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_BING.LAST_UPDATED_TIME = "keyword_data.keyword_info_normalized_with_bing.last_updated_time";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_BING.LAST_UPDATED_TIME)
  private String keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime(String keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime) {
    this.keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime = keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoNormalizedWithBingLastUpdatedTime() {
    return keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime;
  }

  public void setKeywordDataKeywordInfoNormalizedWithBingLastUpdatedTime(String keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime) {
    this.keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime = keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_BING.IS_NORMALIZED = "keyword_data.keyword_info_normalized_with_bing.is_normalized";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_BING.IS_NORMALIZED)
  private String keywordDataKeywordInfoNormalizedWithBingIsNormalized;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoNormalizedWithBingIsNormalized(String keywordDataKeywordInfoNormalizedWithBingIsNormalized) {
    this.keywordDataKeywordInfoNormalizedWithBingIsNormalized = keywordDataKeywordInfoNormalizedWithBingIsNormalized;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoNormalizedWithBingIsNormalized
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoNormalizedWithBingIsNormalized() {
    return keywordDataKeywordInfoNormalizedWithBingIsNormalized;
  }

  public void setKeywordDataKeywordInfoNormalizedWithBingIsNormalized(String keywordDataKeywordInfoNormalizedWithBingIsNormalized) {
    this.keywordDataKeywordInfoNormalizedWithBingIsNormalized = keywordDataKeywordInfoNormalizedWithBingIsNormalized;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_CLICKSTREAM.SEARCH_VOLUME = "keyword_data.keyword_info_normalized_with_clickstream.search_volume";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_CLICKSTREAM.SEARCH_VOLUME)
  private String keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume(String keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume) {
    this.keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume = keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoNormalizedWithClickstreamSearchVolume() {
    return keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume;
  }

  public void setKeywordDataKeywordInfoNormalizedWithClickstreamSearchVolume(String keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume) {
    this.keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume = keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_CLICKSTREAM.LAST_UPDATED_TIME = "keyword_data.keyword_info_normalized_with_clickstream.last_updated_time";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_CLICKSTREAM.LAST_UPDATED_TIME)
  private String keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime(String keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime) {
    this.keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime = keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime() {
    return keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime;
  }

  public void setKeywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime(String keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime) {
    this.keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime = keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_CLICKSTREAM.IS_NORMALIZED = "keyword_data.keyword_info_normalized_with_clickstream.is_normalized";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO_NORMALIZED_WITH_CLICKSTREAM.IS_NORMALIZED)
  private String keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized;

  public DataforseoLabsAvailableFiltersGoogleInfo keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized(String keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized) {
    this.keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized = keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized;
    return this;
  }

  /**
   * 
   * @return keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized
   */
  @javax.annotation.Nullable
  public String getKeywordDataKeywordInfoNormalizedWithClickstreamIsNormalized() {
    return keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized;
  }

  public void setKeywordDataKeywordInfoNormalizedWithClickstreamIsNormalized(String keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized) {
    this.keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized = keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.TYPE = "ranked_serp_element.serp_item.type";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.TYPE)
  private String rankedSerpElementSerpItemType;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemType(String rankedSerpElementSerpItemType) {
    this.rankedSerpElementSerpItemType = rankedSerpElementSerpItemType;
    return this;
  }

  /**
   * type of element
   * @return rankedSerpElementSerpItemType
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemType() {
    return rankedSerpElementSerpItemType;
  }

  public void setRankedSerpElementSerpItemType(String rankedSerpElementSerpItemType) {
    this.rankedSerpElementSerpItemType = rankedSerpElementSerpItemType;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_GROUP = "ranked_serp_element.serp_item.rank_group";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_GROUP)
  private String rankedSerpElementSerpItemRankGroup;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRankGroup(String rankedSerpElementSerpItemRankGroup) {
    this.rankedSerpElementSerpItemRankGroup = rankedSerpElementSerpItemRankGroup;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRankGroup
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRankGroup() {
    return rankedSerpElementSerpItemRankGroup;
  }

  public void setRankedSerpElementSerpItemRankGroup(String rankedSerpElementSerpItemRankGroup) {
    this.rankedSerpElementSerpItemRankGroup = rankedSerpElementSerpItemRankGroup;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_ABSOLUTE = "ranked_serp_element.serp_item.rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_ABSOLUTE)
  private String rankedSerpElementSerpItemRankAbsolute;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRankAbsolute(String rankedSerpElementSerpItemRankAbsolute) {
    this.rankedSerpElementSerpItemRankAbsolute = rankedSerpElementSerpItemRankAbsolute;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRankAbsolute
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRankAbsolute() {
    return rankedSerpElementSerpItemRankAbsolute;
  }

  public void setRankedSerpElementSerpItemRankAbsolute(String rankedSerpElementSerpItemRankAbsolute) {
    this.rankedSerpElementSerpItemRankAbsolute = rankedSerpElementSerpItemRankAbsolute;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.POSITION = "ranked_serp_element.serp_item.position";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.POSITION)
  private String rankedSerpElementSerpItemPosition;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemPosition(String rankedSerpElementSerpItemPosition) {
    this.rankedSerpElementSerpItemPosition = rankedSerpElementSerpItemPosition;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemPosition
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemPosition() {
    return rankedSerpElementSerpItemPosition;
  }

  public void setRankedSerpElementSerpItemPosition(String rankedSerpElementSerpItemPosition) {
    this.rankedSerpElementSerpItemPosition = rankedSerpElementSerpItemPosition;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.XPATH = "ranked_serp_element.serp_item.xpath";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.XPATH)
  private String rankedSerpElementSerpItemXpath;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemXpath(String rankedSerpElementSerpItemXpath) {
    this.rankedSerpElementSerpItemXpath = rankedSerpElementSerpItemXpath;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemXpath
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemXpath() {
    return rankedSerpElementSerpItemXpath;
  }

  public void setRankedSerpElementSerpItemXpath(String rankedSerpElementSerpItemXpath) {
    this.rankedSerpElementSerpItemXpath = rankedSerpElementSerpItemXpath;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DOMAIN = "ranked_serp_element.serp_item.domain";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DOMAIN)
  private String rankedSerpElementSerpItemDomain;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemDomain(String rankedSerpElementSerpItemDomain) {
    this.rankedSerpElementSerpItemDomain = rankedSerpElementSerpItemDomain;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDomain
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDomain() {
    return rankedSerpElementSerpItemDomain;
  }

  public void setRankedSerpElementSerpItemDomain(String rankedSerpElementSerpItemDomain) {
    this.rankedSerpElementSerpItemDomain = rankedSerpElementSerpItemDomain;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.TITLE = "ranked_serp_element.serp_item.title";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.TITLE)
  private String rankedSerpElementSerpItemTitle;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemTitle(String rankedSerpElementSerpItemTitle) {
    this.rankedSerpElementSerpItemTitle = rankedSerpElementSerpItemTitle;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemTitle
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemTitle() {
    return rankedSerpElementSerpItemTitle;
  }

  public void setRankedSerpElementSerpItemTitle(String rankedSerpElementSerpItemTitle) {
    this.rankedSerpElementSerpItemTitle = rankedSerpElementSerpItemTitle;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.URL = "ranked_serp_element.serp_item.url";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.URL)
  private String rankedSerpElementSerpItemUrl;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemUrl(String rankedSerpElementSerpItemUrl) {
    this.rankedSerpElementSerpItemUrl = rankedSerpElementSerpItemUrl;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemUrl
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemUrl() {
    return rankedSerpElementSerpItemUrl;
  }

  public void setRankedSerpElementSerpItemUrl(String rankedSerpElementSerpItemUrl) {
    this.rankedSerpElementSerpItemUrl = rankedSerpElementSerpItemUrl;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BREADCRUMB = "ranked_serp_element.serp_item.breadcrumb";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BREADCRUMB)
  private String rankedSerpElementSerpItemBreadcrumb;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemBreadcrumb(String rankedSerpElementSerpItemBreadcrumb) {
    this.rankedSerpElementSerpItemBreadcrumb = rankedSerpElementSerpItemBreadcrumb;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemBreadcrumb
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemBreadcrumb() {
    return rankedSerpElementSerpItemBreadcrumb;
  }

  public void setRankedSerpElementSerpItemBreadcrumb(String rankedSerpElementSerpItemBreadcrumb) {
    this.rankedSerpElementSerpItemBreadcrumb = rankedSerpElementSerpItemBreadcrumb;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.WEBSITE_NAME = "ranked_serp_element.serp_item.website_name";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.WEBSITE_NAME)
  private String rankedSerpElementSerpItemWebsiteName;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemWebsiteName(String rankedSerpElementSerpItemWebsiteName) {
    this.rankedSerpElementSerpItemWebsiteName = rankedSerpElementSerpItemWebsiteName;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemWebsiteName
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemWebsiteName() {
    return rankedSerpElementSerpItemWebsiteName;
  }

  public void setRankedSerpElementSerpItemWebsiteName(String rankedSerpElementSerpItemWebsiteName) {
    this.rankedSerpElementSerpItemWebsiteName = rankedSerpElementSerpItemWebsiteName;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_IMAGE = "ranked_serp_element.serp_item.is_image";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_IMAGE)
  private String rankedSerpElementSerpItemIsImage;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemIsImage(String rankedSerpElementSerpItemIsImage) {
    this.rankedSerpElementSerpItemIsImage = rankedSerpElementSerpItemIsImage;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemIsImage
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemIsImage() {
    return rankedSerpElementSerpItemIsImage;
  }

  public void setRankedSerpElementSerpItemIsImage(String rankedSerpElementSerpItemIsImage) {
    this.rankedSerpElementSerpItemIsImage = rankedSerpElementSerpItemIsImage;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_VIDEO = "ranked_serp_element.serp_item.is_video";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_VIDEO)
  private String rankedSerpElementSerpItemIsVideo;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemIsVideo(String rankedSerpElementSerpItemIsVideo) {
    this.rankedSerpElementSerpItemIsVideo = rankedSerpElementSerpItemIsVideo;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemIsVideo
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemIsVideo() {
    return rankedSerpElementSerpItemIsVideo;
  }

  public void setRankedSerpElementSerpItemIsVideo(String rankedSerpElementSerpItemIsVideo) {
    this.rankedSerpElementSerpItemIsVideo = rankedSerpElementSerpItemIsVideo;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_FEATURED_SNIPPET = "ranked_serp_element.serp_item.is_featured_snippet";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_FEATURED_SNIPPET)
  private String rankedSerpElementSerpItemIsFeaturedSnippet;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemIsFeaturedSnippet(String rankedSerpElementSerpItemIsFeaturedSnippet) {
    this.rankedSerpElementSerpItemIsFeaturedSnippet = rankedSerpElementSerpItemIsFeaturedSnippet;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemIsFeaturedSnippet
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemIsFeaturedSnippet() {
    return rankedSerpElementSerpItemIsFeaturedSnippet;
  }

  public void setRankedSerpElementSerpItemIsFeaturedSnippet(String rankedSerpElementSerpItemIsFeaturedSnippet) {
    this.rankedSerpElementSerpItemIsFeaturedSnippet = rankedSerpElementSerpItemIsFeaturedSnippet;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_MALICIOUS = "ranked_serp_element.serp_item.is_malicious";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_MALICIOUS)
  private String rankedSerpElementSerpItemIsMalicious;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemIsMalicious(String rankedSerpElementSerpItemIsMalicious) {
    this.rankedSerpElementSerpItemIsMalicious = rankedSerpElementSerpItemIsMalicious;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemIsMalicious
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemIsMalicious() {
    return rankedSerpElementSerpItemIsMalicious;
  }

  public void setRankedSerpElementSerpItemIsMalicious(String rankedSerpElementSerpItemIsMalicious) {
    this.rankedSerpElementSerpItemIsMalicious = rankedSerpElementSerpItemIsMalicious;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DESCRIPTION = "ranked_serp_element.serp_item.description";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DESCRIPTION)
  private String rankedSerpElementSerpItemDescription;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemDescription(String rankedSerpElementSerpItemDescription) {
    this.rankedSerpElementSerpItemDescription = rankedSerpElementSerpItemDescription;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDescription
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDescription() {
    return rankedSerpElementSerpItemDescription;
  }

  public void setRankedSerpElementSerpItemDescription(String rankedSerpElementSerpItemDescription) {
    this.rankedSerpElementSerpItemDescription = rankedSerpElementSerpItemDescription;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.PRE_SNIPPET = "ranked_serp_element.serp_item.pre_snippet";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.PRE_SNIPPET)
  private String rankedSerpElementSerpItemPreSnippet;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemPreSnippet(String rankedSerpElementSerpItemPreSnippet) {
    this.rankedSerpElementSerpItemPreSnippet = rankedSerpElementSerpItemPreSnippet;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemPreSnippet
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemPreSnippet() {
    return rankedSerpElementSerpItemPreSnippet;
  }

  public void setRankedSerpElementSerpItemPreSnippet(String rankedSerpElementSerpItemPreSnippet) {
    this.rankedSerpElementSerpItemPreSnippet = rankedSerpElementSerpItemPreSnippet;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.EXTENDED_SNIPPET = "ranked_serp_element.serp_item.extended_snippet";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.EXTENDED_SNIPPET)
  private String rankedSerpElementSerpItemExtendedSnippet;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemExtendedSnippet(String rankedSerpElementSerpItemExtendedSnippet) {
    this.rankedSerpElementSerpItemExtendedSnippet = rankedSerpElementSerpItemExtendedSnippet;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemExtendedSnippet
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemExtendedSnippet() {
    return rankedSerpElementSerpItemExtendedSnippet;
  }

  public void setRankedSerpElementSerpItemExtendedSnippet(String rankedSerpElementSerpItemExtendedSnippet) {
    this.rankedSerpElementSerpItemExtendedSnippet = rankedSerpElementSerpItemExtendedSnippet;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.AMP_VERSION = "ranked_serp_element.serp_item.amp_version";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.AMP_VERSION)
  private String rankedSerpElementSerpItemAmpVersion;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemAmpVersion(String rankedSerpElementSerpItemAmpVersion) {
    this.rankedSerpElementSerpItemAmpVersion = rankedSerpElementSerpItemAmpVersion;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemAmpVersion
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemAmpVersion() {
    return rankedSerpElementSerpItemAmpVersion;
  }

  public void setRankedSerpElementSerpItemAmpVersion(String rankedSerpElementSerpItemAmpVersion) {
    this.rankedSerpElementSerpItemAmpVersion = rankedSerpElementSerpItemAmpVersion;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RATING.RATING_TYPE = "ranked_serp_element.serp_item.rating.rating_type";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RATING.RATING_TYPE)
  private String rankedSerpElementSerpItemRatingRatingType;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRatingRatingType(String rankedSerpElementSerpItemRatingRatingType) {
    this.rankedSerpElementSerpItemRatingRatingType = rankedSerpElementSerpItemRatingRatingType;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRatingRatingType
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRatingRatingType() {
    return rankedSerpElementSerpItemRatingRatingType;
  }

  public void setRankedSerpElementSerpItemRatingRatingType(String rankedSerpElementSerpItemRatingRatingType) {
    this.rankedSerpElementSerpItemRatingRatingType = rankedSerpElementSerpItemRatingRatingType;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RATING.VALUE = "ranked_serp_element.serp_item.rating.value";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RATING.VALUE)
  private String rankedSerpElementSerpItemRatingValue;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRatingValue(String rankedSerpElementSerpItemRatingValue) {
    this.rankedSerpElementSerpItemRatingValue = rankedSerpElementSerpItemRatingValue;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRatingValue
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRatingValue() {
    return rankedSerpElementSerpItemRatingValue;
  }

  public void setRankedSerpElementSerpItemRatingValue(String rankedSerpElementSerpItemRatingValue) {
    this.rankedSerpElementSerpItemRatingValue = rankedSerpElementSerpItemRatingValue;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RATING.VOTES_COUNT = "ranked_serp_element.serp_item.rating.votes_count";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RATING.VOTES_COUNT)
  private String rankedSerpElementSerpItemRatingVotesCount;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRatingVotesCount(String rankedSerpElementSerpItemRatingVotesCount) {
    this.rankedSerpElementSerpItemRatingVotesCount = rankedSerpElementSerpItemRatingVotesCount;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRatingVotesCount
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRatingVotesCount() {
    return rankedSerpElementSerpItemRatingVotesCount;
  }

  public void setRankedSerpElementSerpItemRatingVotesCount(String rankedSerpElementSerpItemRatingVotesCount) {
    this.rankedSerpElementSerpItemRatingVotesCount = rankedSerpElementSerpItemRatingVotesCount;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RATING.RATING_MAX = "ranked_serp_element.serp_item.rating.rating_max";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RATING.RATING_MAX)
  private Integer rankedSerpElementSerpItemRatingRatingMax;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRatingRatingMax(Integer rankedSerpElementSerpItemRatingRatingMax) {
    this.rankedSerpElementSerpItemRatingRatingMax = rankedSerpElementSerpItemRatingRatingMax;
    return this;
  }

  /**
   * the maximum value for a rating_type
   * @return rankedSerpElementSerpItemRatingRatingMax
   */
  @javax.annotation.Nullable
  public Integer getRankedSerpElementSerpItemRatingRatingMax() {
    return rankedSerpElementSerpItemRatingRatingMax;
  }

  public void setRankedSerpElementSerpItemRatingRatingMax(Integer rankedSerpElementSerpItemRatingRatingMax) {
    this.rankedSerpElementSerpItemRatingRatingMax = rankedSerpElementSerpItemRatingRatingMax;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.ABOUT_THIS_RESULT = "ranked_serp_element.serp_item.about_this_result";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.ABOUT_THIS_RESULT)
  private String rankedSerpElementSerpItemAboutThisResult;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemAboutThisResult(String rankedSerpElementSerpItemAboutThisResult) {
    this.rankedSerpElementSerpItemAboutThisResult = rankedSerpElementSerpItemAboutThisResult;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemAboutThisResult
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemAboutThisResult() {
    return rankedSerpElementSerpItemAboutThisResult;
  }

  public void setRankedSerpElementSerpItemAboutThisResult(String rankedSerpElementSerpItemAboutThisResult) {
    this.rankedSerpElementSerpItemAboutThisResult = rankedSerpElementSerpItemAboutThisResult;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.MAIN_DOMAIN = "ranked_serp_element.serp_item.main_domain";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.MAIN_DOMAIN)
  private String rankedSerpElementSerpItemMainDomain;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemMainDomain(String rankedSerpElementSerpItemMainDomain) {
    this.rankedSerpElementSerpItemMainDomain = rankedSerpElementSerpItemMainDomain;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemMainDomain
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemMainDomain() {
    return rankedSerpElementSerpItemMainDomain;
  }

  public void setRankedSerpElementSerpItemMainDomain(String rankedSerpElementSerpItemMainDomain) {
    this.rankedSerpElementSerpItemMainDomain = rankedSerpElementSerpItemMainDomain;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RELATIVE_URL = "ranked_serp_element.serp_item.relative_url";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RELATIVE_URL)
  private String rankedSerpElementSerpItemRelativeUrl;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRelativeUrl(String rankedSerpElementSerpItemRelativeUrl) {
    this.rankedSerpElementSerpItemRelativeUrl = rankedSerpElementSerpItemRelativeUrl;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRelativeUrl
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRelativeUrl() {
    return rankedSerpElementSerpItemRelativeUrl;
  }

  public void setRankedSerpElementSerpItemRelativeUrl(String rankedSerpElementSerpItemRelativeUrl) {
    this.rankedSerpElementSerpItemRelativeUrl = rankedSerpElementSerpItemRelativeUrl;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.ETV = "ranked_serp_element.serp_item.etv";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.ETV)
  private String rankedSerpElementSerpItemEtv;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemEtv(String rankedSerpElementSerpItemEtv) {
    this.rankedSerpElementSerpItemEtv = rankedSerpElementSerpItemEtv;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemEtv
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemEtv() {
    return rankedSerpElementSerpItemEtv;
  }

  public void setRankedSerpElementSerpItemEtv(String rankedSerpElementSerpItemEtv) {
    this.rankedSerpElementSerpItemEtv = rankedSerpElementSerpItemEtv;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.ESTIMATED_PAID_TRAFFIC_COST = "ranked_serp_element.serp_item.estimated_paid_traffic_cost";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.ESTIMATED_PAID_TRAFFIC_COST)
  private String rankedSerpElementSerpItemEstimatedPaidTrafficCost;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemEstimatedPaidTrafficCost(String rankedSerpElementSerpItemEstimatedPaidTrafficCost) {
    this.rankedSerpElementSerpItemEstimatedPaidTrafficCost = rankedSerpElementSerpItemEstimatedPaidTrafficCost;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemEstimatedPaidTrafficCost
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemEstimatedPaidTrafficCost() {
    return rankedSerpElementSerpItemEstimatedPaidTrafficCost;
  }

  public void setRankedSerpElementSerpItemEstimatedPaidTrafficCost(String rankedSerpElementSerpItemEstimatedPaidTrafficCost) {
    this.rankedSerpElementSerpItemEstimatedPaidTrafficCost = rankedSerpElementSerpItemEstimatedPaidTrafficCost;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.CLICKSTREAM_ETV = "ranked_serp_element.serp_item.clickstream_etv";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.CLICKSTREAM_ETV)
  private String rankedSerpElementSerpItemClickstreamEtv;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemClickstreamEtv(String rankedSerpElementSerpItemClickstreamEtv) {
    this.rankedSerpElementSerpItemClickstreamEtv = rankedSerpElementSerpItemClickstreamEtv;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemClickstreamEtv
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemClickstreamEtv() {
    return rankedSerpElementSerpItemClickstreamEtv;
  }

  public void setRankedSerpElementSerpItemClickstreamEtv(String rankedSerpElementSerpItemClickstreamEtv) {
    this.rankedSerpElementSerpItemClickstreamEtv = rankedSerpElementSerpItemClickstreamEtv;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_CHANGES.PREVIOUS_RANK_ABSOLUTE = "ranked_serp_element.serp_item.rank_changes.previous_rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_CHANGES.PREVIOUS_RANK_ABSOLUTE)
  private String rankedSerpElementSerpItemRankChangesPreviousRankAbsolute;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRankChangesPreviousRankAbsolute(String rankedSerpElementSerpItemRankChangesPreviousRankAbsolute) {
    this.rankedSerpElementSerpItemRankChangesPreviousRankAbsolute = rankedSerpElementSerpItemRankChangesPreviousRankAbsolute;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRankChangesPreviousRankAbsolute
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRankChangesPreviousRankAbsolute() {
    return rankedSerpElementSerpItemRankChangesPreviousRankAbsolute;
  }

  public void setRankedSerpElementSerpItemRankChangesPreviousRankAbsolute(String rankedSerpElementSerpItemRankChangesPreviousRankAbsolute) {
    this.rankedSerpElementSerpItemRankChangesPreviousRankAbsolute = rankedSerpElementSerpItemRankChangesPreviousRankAbsolute;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_CHANGES.IS_NEW = "ranked_serp_element.serp_item.rank_changes.is_new";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_CHANGES.IS_NEW)
  private String rankedSerpElementSerpItemRankChangesIsNew;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRankChangesIsNew(String rankedSerpElementSerpItemRankChangesIsNew) {
    this.rankedSerpElementSerpItemRankChangesIsNew = rankedSerpElementSerpItemRankChangesIsNew;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRankChangesIsNew
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRankChangesIsNew() {
    return rankedSerpElementSerpItemRankChangesIsNew;
  }

  public void setRankedSerpElementSerpItemRankChangesIsNew(String rankedSerpElementSerpItemRankChangesIsNew) {
    this.rankedSerpElementSerpItemRankChangesIsNew = rankedSerpElementSerpItemRankChangesIsNew;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_CHANGES.IS_UP = "ranked_serp_element.serp_item.rank_changes.is_up";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_CHANGES.IS_UP)
  private String rankedSerpElementSerpItemRankChangesIsUp;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRankChangesIsUp(String rankedSerpElementSerpItemRankChangesIsUp) {
    this.rankedSerpElementSerpItemRankChangesIsUp = rankedSerpElementSerpItemRankChangesIsUp;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRankChangesIsUp
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRankChangesIsUp() {
    return rankedSerpElementSerpItemRankChangesIsUp;
  }

  public void setRankedSerpElementSerpItemRankChangesIsUp(String rankedSerpElementSerpItemRankChangesIsUp) {
    this.rankedSerpElementSerpItemRankChangesIsUp = rankedSerpElementSerpItemRankChangesIsUp;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_CHANGES.IS_DOWN = "ranked_serp_element.serp_item.rank_changes.is_down";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_CHANGES.IS_DOWN)
  private String rankedSerpElementSerpItemRankChangesIsDown;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRankChangesIsDown(String rankedSerpElementSerpItemRankChangesIsDown) {
    this.rankedSerpElementSerpItemRankChangesIsDown = rankedSerpElementSerpItemRankChangesIsDown;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRankChangesIsDown
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRankChangesIsDown() {
    return rankedSerpElementSerpItemRankChangesIsDown;
  }

  public void setRankedSerpElementSerpItemRankChangesIsDown(String rankedSerpElementSerpItemRankChangesIsDown) {
    this.rankedSerpElementSerpItemRankChangesIsDown = rankedSerpElementSerpItemRankChangesIsDown;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.REFERRING_DOMAINS = "ranked_serp_element.serp_item.backlinks_info.referring_domains";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.REFERRING_DOMAINS)
  private String rankedSerpElementSerpItemBacklinksInfoReferringDomains;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemBacklinksInfoReferringDomains(String rankedSerpElementSerpItemBacklinksInfoReferringDomains) {
    this.rankedSerpElementSerpItemBacklinksInfoReferringDomains = rankedSerpElementSerpItemBacklinksInfoReferringDomains;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemBacklinksInfoReferringDomains
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemBacklinksInfoReferringDomains() {
    return rankedSerpElementSerpItemBacklinksInfoReferringDomains;
  }

  public void setRankedSerpElementSerpItemBacklinksInfoReferringDomains(String rankedSerpElementSerpItemBacklinksInfoReferringDomains) {
    this.rankedSerpElementSerpItemBacklinksInfoReferringDomains = rankedSerpElementSerpItemBacklinksInfoReferringDomains;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.REFERRING_MAIN_DOMAINS = "ranked_serp_element.serp_item.backlinks_info.referring_main_domains";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.REFERRING_MAIN_DOMAINS)
  private String rankedSerpElementSerpItemBacklinksInfoReferringMainDomains;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemBacklinksInfoReferringMainDomains(String rankedSerpElementSerpItemBacklinksInfoReferringMainDomains) {
    this.rankedSerpElementSerpItemBacklinksInfoReferringMainDomains = rankedSerpElementSerpItemBacklinksInfoReferringMainDomains;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemBacklinksInfoReferringMainDomains
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemBacklinksInfoReferringMainDomains() {
    return rankedSerpElementSerpItemBacklinksInfoReferringMainDomains;
  }

  public void setRankedSerpElementSerpItemBacklinksInfoReferringMainDomains(String rankedSerpElementSerpItemBacklinksInfoReferringMainDomains) {
    this.rankedSerpElementSerpItemBacklinksInfoReferringMainDomains = rankedSerpElementSerpItemBacklinksInfoReferringMainDomains;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.REFERRING_PAGES = "ranked_serp_element.serp_item.backlinks_info.referring_pages";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.REFERRING_PAGES)
  private String rankedSerpElementSerpItemBacklinksInfoReferringPages;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemBacklinksInfoReferringPages(String rankedSerpElementSerpItemBacklinksInfoReferringPages) {
    this.rankedSerpElementSerpItemBacklinksInfoReferringPages = rankedSerpElementSerpItemBacklinksInfoReferringPages;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemBacklinksInfoReferringPages
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemBacklinksInfoReferringPages() {
    return rankedSerpElementSerpItemBacklinksInfoReferringPages;
  }

  public void setRankedSerpElementSerpItemBacklinksInfoReferringPages(String rankedSerpElementSerpItemBacklinksInfoReferringPages) {
    this.rankedSerpElementSerpItemBacklinksInfoReferringPages = rankedSerpElementSerpItemBacklinksInfoReferringPages;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.DOFOLLOW = "ranked_serp_element.serp_item.backlinks_info.dofollow";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.DOFOLLOW)
  private String rankedSerpElementSerpItemBacklinksInfoDofollow;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemBacklinksInfoDofollow(String rankedSerpElementSerpItemBacklinksInfoDofollow) {
    this.rankedSerpElementSerpItemBacklinksInfoDofollow = rankedSerpElementSerpItemBacklinksInfoDofollow;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemBacklinksInfoDofollow
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemBacklinksInfoDofollow() {
    return rankedSerpElementSerpItemBacklinksInfoDofollow;
  }

  public void setRankedSerpElementSerpItemBacklinksInfoDofollow(String rankedSerpElementSerpItemBacklinksInfoDofollow) {
    this.rankedSerpElementSerpItemBacklinksInfoDofollow = rankedSerpElementSerpItemBacklinksInfoDofollow;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.BACKLINKS = "ranked_serp_element.serp_item.backlinks_info.backlinks";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.BACKLINKS)
  private String rankedSerpElementSerpItemBacklinksInfoBacklinks;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemBacklinksInfoBacklinks(String rankedSerpElementSerpItemBacklinksInfoBacklinks) {
    this.rankedSerpElementSerpItemBacklinksInfoBacklinks = rankedSerpElementSerpItemBacklinksInfoBacklinks;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemBacklinksInfoBacklinks
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemBacklinksInfoBacklinks() {
    return rankedSerpElementSerpItemBacklinksInfoBacklinks;
  }

  public void setRankedSerpElementSerpItemBacklinksInfoBacklinks(String rankedSerpElementSerpItemBacklinksInfoBacklinks) {
    this.rankedSerpElementSerpItemBacklinksInfoBacklinks = rankedSerpElementSerpItemBacklinksInfoBacklinks;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.TIME_UPDATE = "ranked_serp_element.serp_item.backlinks_info.time_update";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.BACKLINKS_INFO.TIME_UPDATE)
  private String rankedSerpElementSerpItemBacklinksInfoTimeUpdate;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemBacklinksInfoTimeUpdate(String rankedSerpElementSerpItemBacklinksInfoTimeUpdate) {
    this.rankedSerpElementSerpItemBacklinksInfoTimeUpdate = rankedSerpElementSerpItemBacklinksInfoTimeUpdate;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemBacklinksInfoTimeUpdate
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemBacklinksInfoTimeUpdate() {
    return rankedSerpElementSerpItemBacklinksInfoTimeUpdate;
  }

  public void setRankedSerpElementSerpItemBacklinksInfoTimeUpdate(String rankedSerpElementSerpItemBacklinksInfoTimeUpdate) {
    this.rankedSerpElementSerpItemBacklinksInfoTimeUpdate = rankedSerpElementSerpItemBacklinksInfoTimeUpdate;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_INFO.PAGE_RANK = "ranked_serp_element.serp_item.rank_info.page_rank";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_INFO.PAGE_RANK)
  private String rankedSerpElementSerpItemRankInfoPageRank;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRankInfoPageRank(String rankedSerpElementSerpItemRankInfoPageRank) {
    this.rankedSerpElementSerpItemRankInfoPageRank = rankedSerpElementSerpItemRankInfoPageRank;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRankInfoPageRank
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRankInfoPageRank() {
    return rankedSerpElementSerpItemRankInfoPageRank;
  }

  public void setRankedSerpElementSerpItemRankInfoPageRank(String rankedSerpElementSerpItemRankInfoPageRank) {
    this.rankedSerpElementSerpItemRankInfoPageRank = rankedSerpElementSerpItemRankInfoPageRank;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_INFO.MAIN_DOMAIN_RANK = "ranked_serp_element.serp_item.rank_info.main_domain_rank";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RANK_INFO.MAIN_DOMAIN_RANK)
  private String rankedSerpElementSerpItemRankInfoMainDomainRank;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemRankInfoMainDomainRank(String rankedSerpElementSerpItemRankInfoMainDomainRank) {
    this.rankedSerpElementSerpItemRankInfoMainDomainRank = rankedSerpElementSerpItemRankInfoMainDomainRank;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemRankInfoMainDomainRank
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemRankInfoMainDomainRank() {
    return rankedSerpElementSerpItemRankInfoMainDomainRank;
  }

  public void setRankedSerpElementSerpItemRankInfoMainDomainRank(String rankedSerpElementSerpItemRankInfoMainDomainRank) {
    this.rankedSerpElementSerpItemRankInfoMainDomainRank = rankedSerpElementSerpItemRankInfoMainDomainRank;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.CHECK_URL = "ranked_serp_element.check_url";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.CHECK_URL)
  private String rankedSerpElementCheckUrl;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementCheckUrl(String rankedSerpElementCheckUrl) {
    this.rankedSerpElementCheckUrl = rankedSerpElementCheckUrl;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementCheckUrl
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementCheckUrl() {
    return rankedSerpElementCheckUrl;
  }

  public void setRankedSerpElementCheckUrl(String rankedSerpElementCheckUrl) {
    this.rankedSerpElementCheckUrl = rankedSerpElementCheckUrl;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM_TYPES = "ranked_serp_element.serp_item_types";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM_TYPES)
  private String rankedSerpElementSerpItemTypes;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemTypes(String rankedSerpElementSerpItemTypes) {
    this.rankedSerpElementSerpItemTypes = rankedSerpElementSerpItemTypes;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemTypes
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemTypes() {
    return rankedSerpElementSerpItemTypes;
  }

  public void setRankedSerpElementSerpItemTypes(String rankedSerpElementSerpItemTypes) {
    this.rankedSerpElementSerpItemTypes = rankedSerpElementSerpItemTypes;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SE_RESULTS_COUNT = "ranked_serp_element.se_results_count";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SE_RESULTS_COUNT)
  private String rankedSerpElementSeResultsCount;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSeResultsCount(String rankedSerpElementSeResultsCount) {
    this.rankedSerpElementSeResultsCount = rankedSerpElementSeResultsCount;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSeResultsCount
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSeResultsCount() {
    return rankedSerpElementSeResultsCount;
  }

  public void setRankedSerpElementSeResultsCount(String rankedSerpElementSeResultsCount) {
    this.rankedSerpElementSeResultsCount = rankedSerpElementSeResultsCount;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.KEYWORD_DIFFICULTY = "ranked_serp_element.keyword_difficulty";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.KEYWORD_DIFFICULTY)
  private String rankedSerpElementKeywordDifficulty;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementKeywordDifficulty(String rankedSerpElementKeywordDifficulty) {
    this.rankedSerpElementKeywordDifficulty = rankedSerpElementKeywordDifficulty;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementKeywordDifficulty
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementKeywordDifficulty() {
    return rankedSerpElementKeywordDifficulty;
  }

  public void setRankedSerpElementKeywordDifficulty(String rankedSerpElementKeywordDifficulty) {
    this.rankedSerpElementKeywordDifficulty = rankedSerpElementKeywordDifficulty;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.IS_LOST = "ranked_serp_element.is_lost";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.IS_LOST)
  private String rankedSerpElementIsLost;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementIsLost(String rankedSerpElementIsLost) {
    this.rankedSerpElementIsLost = rankedSerpElementIsLost;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementIsLost
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementIsLost() {
    return rankedSerpElementIsLost;
  }

  public void setRankedSerpElementIsLost(String rankedSerpElementIsLost) {
    this.rankedSerpElementIsLost = rankedSerpElementIsLost;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.LAST_UPDATED_TIME = "ranked_serp_element.last_updated_time";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.LAST_UPDATED_TIME)
  private String rankedSerpElementLastUpdatedTime;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementLastUpdatedTime(String rankedSerpElementLastUpdatedTime) {
    this.rankedSerpElementLastUpdatedTime = rankedSerpElementLastUpdatedTime;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementLastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementLastUpdatedTime() {
    return rankedSerpElementLastUpdatedTime;
  }

  public void setRankedSerpElementLastUpdatedTime(String rankedSerpElementLastUpdatedTime) {
    this.rankedSerpElementLastUpdatedTime = rankedSerpElementLastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.PREVIOUS_UPDATED_TIME = "ranked_serp_element.previous_updated_time";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.PREVIOUS_UPDATED_TIME)
  private String rankedSerpElementPreviousUpdatedTime;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementPreviousUpdatedTime(String rankedSerpElementPreviousUpdatedTime) {
    this.rankedSerpElementPreviousUpdatedTime = rankedSerpElementPreviousUpdatedTime;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementPreviousUpdatedTime
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementPreviousUpdatedTime() {
    return rankedSerpElementPreviousUpdatedTime;
  }

  public void setRankedSerpElementPreviousUpdatedTime(String rankedSerpElementPreviousUpdatedTime) {
    this.rankedSerpElementPreviousUpdatedTime = rankedSerpElementPreviousUpdatedTime;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.EXTRA.AD_ACLK = "ranked_serp_element.serp_item.extra.ad_aclk";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.EXTRA.AD_ACLK)
  private String rankedSerpElementSerpItemExtraAdAclk;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemExtraAdAclk(String rankedSerpElementSerpItemExtraAdAclk) {
    this.rankedSerpElementSerpItemExtraAdAclk = rankedSerpElementSerpItemExtraAdAclk;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemExtraAdAclk
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemExtraAdAclk() {
    return rankedSerpElementSerpItemExtraAdAclk;
  }

  public void setRankedSerpElementSerpItemExtraAdAclk(String rankedSerpElementSerpItemExtraAdAclk) {
    this.rankedSerpElementSerpItemExtraAdAclk = rankedSerpElementSerpItemExtraAdAclk;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DESCRIPTION_ROWS = "ranked_serp_element.serp_item.description_rows";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DESCRIPTION_ROWS)
  private String rankedSerpElementSerpItemDescriptionRows;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemDescriptionRows(String rankedSerpElementSerpItemDescriptionRows) {
    this.rankedSerpElementSerpItemDescriptionRows = rankedSerpElementSerpItemDescriptionRows;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDescriptionRows
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDescriptionRows() {
    return rankedSerpElementSerpItemDescriptionRows;
  }

  public void setRankedSerpElementSerpItemDescriptionRows(String rankedSerpElementSerpItemDescriptionRows) {
    this.rankedSerpElementSerpItemDescriptionRows = rankedSerpElementSerpItemDescriptionRows;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.PHONE = "ranked_serp_element.serp_item.phone";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.PHONE)
  private String rankedSerpElementSerpItemPhone;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemPhone(String rankedSerpElementSerpItemPhone) {
    this.rankedSerpElementSerpItemPhone = rankedSerpElementSerpItemPhone;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemPhone
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemPhone() {
    return rankedSerpElementSerpItemPhone;
  }

  public void setRankedSerpElementSerpItemPhone(String rankedSerpElementSerpItemPhone) {
    this.rankedSerpElementSerpItemPhone = rankedSerpElementSerpItemPhone;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_PAID = "ranked_serp_element.serp_item.is_paid";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_PAID)
  private String rankedSerpElementSerpItemIsPaid;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemIsPaid(String rankedSerpElementSerpItemIsPaid) {
    this.rankedSerpElementSerpItemIsPaid = rankedSerpElementSerpItemIsPaid;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemIsPaid
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemIsPaid() {
    return rankedSerpElementSerpItemIsPaid;
  }

  public void setRankedSerpElementSerpItemIsPaid(String rankedSerpElementSerpItemIsPaid) {
    this.rankedSerpElementSerpItemIsPaid = rankedSerpElementSerpItemIsPaid;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.FEATURED_TITLE = "ranked_serp_element.serp_item.featured_title";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.FEATURED_TITLE)
  private String rankedSerpElementSerpItemFeaturedTitle;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemFeaturedTitle(String rankedSerpElementSerpItemFeaturedTitle) {
    this.rankedSerpElementSerpItemFeaturedTitle = rankedSerpElementSerpItemFeaturedTitle;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemFeaturedTitle
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemFeaturedTitle() {
    return rankedSerpElementSerpItemFeaturedTitle;
  }

  public void setRankedSerpElementSerpItemFeaturedTitle(String rankedSerpElementSerpItemFeaturedTitle) {
    this.rankedSerpElementSerpItemFeaturedTitle = rankedSerpElementSerpItemFeaturedTitle;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.SOURCE = "ranked_serp_element.serp_item.source";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.SOURCE)
  private String rankedSerpElementSerpItemSource;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemSource(String rankedSerpElementSerpItemSource) {
    this.rankedSerpElementSerpItemSource = rankedSerpElementSerpItemSource;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemSource
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemSource() {
    return rankedSerpElementSerpItemSource;
  }

  public void setRankedSerpElementSerpItemSource(String rankedSerpElementSerpItemSource) {
    this.rankedSerpElementSerpItemSource = rankedSerpElementSerpItemSource;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.TEXT = "ranked_serp_element.serp_item.text";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.TEXT)
  private String rankedSerpElementSerpItemText;

  public DataforseoLabsAvailableFiltersGoogleInfo rankedSerpElementSerpItemText(String rankedSerpElementSerpItemText) {
    this.rankedSerpElementSerpItemText = rankedSerpElementSerpItemText;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemText
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemText() {
    return rankedSerpElementSerpItemText;
  }

  public void setRankedSerpElementSerpItemText(String rankedSerpElementSerpItemText) {
    this.rankedSerpElementSerpItemText = rankedSerpElementSerpItemText;
  }



  public DataforseoLabsAvailableFiltersGoogleInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsAvailableFiltersGoogleInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsAvailableFiltersGoogleInfo dataforseoLabsAvailableFiltersGoogleInfo = (DataforseoLabsAvailableFiltersGoogleInfo) o;
    return

        Objects.equals(this.keywordDataKeyword, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeyword) &&
        Objects.equals(this.keywordDataKeywordInfoLastUpdatedTime, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoLastUpdatedTime) &&
        Objects.equals(this.keywordDataKeywordInfoCompetition, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoCompetition) &&
        Objects.equals(this.keywordDataKeywordInfoCompetitionLevel, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoCompetitionLevel) &&
        Objects.equals(this.keywordDataKeywordInfoCpc, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoCpc) &&
        Objects.equals(this.keywordDataKeywordInfoSearchVolume, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoSearchVolume) &&
        Objects.equals(this.keywordDataKeywordInfoLowTopOfPageBid, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoLowTopOfPageBid) &&
        Objects.equals(this.keywordDataKeywordInfoHighTopOfPageBid, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoHighTopOfPageBid) &&
        Objects.equals(this.keywordDataKeywordInfoCategories, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoCategories) &&
        Objects.equals(this.keywordDataKeywordInfoSearchVolumeTrendMonthly, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoSearchVolumeTrendMonthly) &&
        Objects.equals(this.keywordDataKeywordInfoSearchVolumeTrendQuarterly, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoSearchVolumeTrendQuarterly) &&
        Objects.equals(this.keywordDataKeywordInfoSearchVolumeTrendYearly, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoSearchVolumeTrendYearly) &&
        Objects.equals(this.keywordDataClickstreamKeywordInfoSearchVolume, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataClickstreamKeywordInfoSearchVolume) &&
        Objects.equals(this.keywordDataClickstreamKeywordInfoLastUpdatedTime, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataClickstreamKeywordInfoLastUpdatedTime) &&
        Objects.equals(this.keywordDataClickstreamKeywordInfoGenderDistributionFemale, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataClickstreamKeywordInfoGenderDistributionFemale) &&
        Objects.equals(this.keywordDataClickstreamKeywordInfoGenderDistributionMale, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataClickstreamKeywordInfoGenderDistributionMale) &&
        Objects.equals(this.keywordDataClickstreamKeywordInfoAgeDistribution1824, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataClickstreamKeywordInfoAgeDistribution1824) &&
        Objects.equals(this.keywordDataClickstreamKeywordInfoAgeDistribution2534, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataClickstreamKeywordInfoAgeDistribution2534) &&
        Objects.equals(this.keywordDataClickstreamKeywordInfoAgeDistribution3544, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataClickstreamKeywordInfoAgeDistribution3544) &&
        Objects.equals(this.keywordDataClickstreamKeywordInfoAgeDistribution4554, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataClickstreamKeywordInfoAgeDistribution4554) &&
        Objects.equals(this.keywordDataClickstreamKeywordInfoAgeDistribution5564, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataClickstreamKeywordInfoAgeDistribution5564) &&
        Objects.equals(this.keywordDataKeywordPropertiesCoreKeyword, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordPropertiesCoreKeyword) &&
        Objects.equals(this.keywordDataKeywordPropertiesSynonymClusteringAlgorithm, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordPropertiesSynonymClusteringAlgorithm) &&
        Objects.equals(this.keywordDataKeywordPropertiesKeywordDifficulty, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordPropertiesKeywordDifficulty) &&
        Objects.equals(this.keywordDataKeywordPropertiesDetectedLanguage, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordPropertiesDetectedLanguage) &&
        Objects.equals(this.keywordDataKeywordPropertiesIsAnotherLanguage, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordPropertiesIsAnotherLanguage) &&
        Objects.equals(this.keywordDataSerpInfoCheckUrl, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataSerpInfoCheckUrl) &&
        Objects.equals(this.keywordDataSerpInfoSerpItemTypes, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataSerpInfoSerpItemTypes) &&
        Objects.equals(this.keywordDataSerpInfoSeResultsCount, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataSerpInfoSeResultsCount) &&
        Objects.equals(this.keywordDataSerpInfoLastUpdatedTime, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataSerpInfoLastUpdatedTime) &&
        Objects.equals(this.keywordDataSerpInfoPreviousUpdatedTime, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataSerpInfoPreviousUpdatedTime) &&
        Objects.equals(this.keywordDataAvgBacklinksInfoBacklinks, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataAvgBacklinksInfoBacklinks) &&
        Objects.equals(this.keywordDataAvgBacklinksInfoDofollow, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataAvgBacklinksInfoDofollow) &&
        Objects.equals(this.keywordDataAvgBacklinksInfoReferringPages, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataAvgBacklinksInfoReferringPages) &&
        Objects.equals(this.keywordDataAvgBacklinksInfoReferringDomains, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataAvgBacklinksInfoReferringDomains) &&
        Objects.equals(this.keywordDataAvgBacklinksInfoReferringMainDomains, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataAvgBacklinksInfoReferringMainDomains) &&
        Objects.equals(this.keywordDataAvgBacklinksInfoRank, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataAvgBacklinksInfoRank) &&
        Objects.equals(this.keywordDataAvgBacklinksInfoMainDomainRank, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataAvgBacklinksInfoMainDomainRank) &&
        Objects.equals(this.keywordDataAvgBacklinksInfoLastUpdatedTime, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataAvgBacklinksInfoLastUpdatedTime) &&
        Objects.equals(this.keywordDataSearchIntentInfoMainIntent, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataSearchIntentInfoMainIntent) &&
        Objects.equals(this.keywordDataSearchIntentInfoForeignIntent, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataSearchIntentInfoForeignIntent) &&
        Objects.equals(this.keywordDataSearchIntentInfoLastUpdatedTime, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataSearchIntentInfoLastUpdatedTime) &&
        Objects.equals(this.keywordDataKeywordInfoNormalizedWithBingSearchVolume, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoNormalizedWithBingSearchVolume) &&
        Objects.equals(this.keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime) &&
        Objects.equals(this.keywordDataKeywordInfoNormalizedWithBingIsNormalized, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoNormalizedWithBingIsNormalized) &&
        Objects.equals(this.keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume) &&
        Objects.equals(this.keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime) &&
        Objects.equals(this.keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized, dataforseoLabsAvailableFiltersGoogleInfo.keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized) &&
        Objects.equals(this.rankedSerpElementSerpItemType, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemType) &&
        Objects.equals(this.rankedSerpElementSerpItemRankGroup, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRankGroup) &&
        Objects.equals(this.rankedSerpElementSerpItemRankAbsolute, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRankAbsolute) &&
        Objects.equals(this.rankedSerpElementSerpItemPosition, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemPosition) &&
        Objects.equals(this.rankedSerpElementSerpItemXpath, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemXpath) &&
        Objects.equals(this.rankedSerpElementSerpItemDomain, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemDomain) &&
        Objects.equals(this.rankedSerpElementSerpItemTitle, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemTitle) &&
        Objects.equals(this.rankedSerpElementSerpItemUrl, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemUrl) &&
        Objects.equals(this.rankedSerpElementSerpItemBreadcrumb, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemBreadcrumb) &&
        Objects.equals(this.rankedSerpElementSerpItemWebsiteName, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemWebsiteName) &&
        Objects.equals(this.rankedSerpElementSerpItemIsImage, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemIsImage) &&
        Objects.equals(this.rankedSerpElementSerpItemIsVideo, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemIsVideo) &&
        Objects.equals(this.rankedSerpElementSerpItemIsFeaturedSnippet, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemIsFeaturedSnippet) &&
        Objects.equals(this.rankedSerpElementSerpItemIsMalicious, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemIsMalicious) &&
        Objects.equals(this.rankedSerpElementSerpItemDescription, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemDescription) &&
        Objects.equals(this.rankedSerpElementSerpItemPreSnippet, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemPreSnippet) &&
        Objects.equals(this.rankedSerpElementSerpItemExtendedSnippet, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemExtendedSnippet) &&
        Objects.equals(this.rankedSerpElementSerpItemAmpVersion, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemAmpVersion) &&
        Objects.equals(this.rankedSerpElementSerpItemRatingRatingType, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRatingRatingType) &&
        Objects.equals(this.rankedSerpElementSerpItemRatingValue, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRatingValue) &&
        Objects.equals(this.rankedSerpElementSerpItemRatingVotesCount, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRatingVotesCount) &&
        Objects.equals(this.rankedSerpElementSerpItemRatingRatingMax, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRatingRatingMax) &&
        Objects.equals(this.rankedSerpElementSerpItemAboutThisResult, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemAboutThisResult) &&
        Objects.equals(this.rankedSerpElementSerpItemMainDomain, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemMainDomain) &&
        Objects.equals(this.rankedSerpElementSerpItemRelativeUrl, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRelativeUrl) &&
        Objects.equals(this.rankedSerpElementSerpItemEtv, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemEtv) &&
        Objects.equals(this.rankedSerpElementSerpItemEstimatedPaidTrafficCost, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemEstimatedPaidTrafficCost) &&
        Objects.equals(this.rankedSerpElementSerpItemClickstreamEtv, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemClickstreamEtv) &&
        Objects.equals(this.rankedSerpElementSerpItemRankChangesPreviousRankAbsolute, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRankChangesPreviousRankAbsolute) &&
        Objects.equals(this.rankedSerpElementSerpItemRankChangesIsNew, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRankChangesIsNew) &&
        Objects.equals(this.rankedSerpElementSerpItemRankChangesIsUp, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRankChangesIsUp) &&
        Objects.equals(this.rankedSerpElementSerpItemRankChangesIsDown, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRankChangesIsDown) &&
        Objects.equals(this.rankedSerpElementSerpItemBacklinksInfoReferringDomains, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemBacklinksInfoReferringDomains) &&
        Objects.equals(this.rankedSerpElementSerpItemBacklinksInfoReferringMainDomains, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemBacklinksInfoReferringMainDomains) &&
        Objects.equals(this.rankedSerpElementSerpItemBacklinksInfoReferringPages, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemBacklinksInfoReferringPages) &&
        Objects.equals(this.rankedSerpElementSerpItemBacklinksInfoDofollow, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemBacklinksInfoDofollow) &&
        Objects.equals(this.rankedSerpElementSerpItemBacklinksInfoBacklinks, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemBacklinksInfoBacklinks) &&
        Objects.equals(this.rankedSerpElementSerpItemBacklinksInfoTimeUpdate, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemBacklinksInfoTimeUpdate) &&
        Objects.equals(this.rankedSerpElementSerpItemRankInfoPageRank, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRankInfoPageRank) &&
        Objects.equals(this.rankedSerpElementSerpItemRankInfoMainDomainRank, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemRankInfoMainDomainRank) &&
        Objects.equals(this.rankedSerpElementCheckUrl, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementCheckUrl) &&
        Objects.equals(this.rankedSerpElementSerpItemTypes, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemTypes) &&
        Objects.equals(this.rankedSerpElementSeResultsCount, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSeResultsCount) &&
        Objects.equals(this.rankedSerpElementKeywordDifficulty, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementKeywordDifficulty) &&
        Objects.equals(this.rankedSerpElementIsLost, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementIsLost) &&
        Objects.equals(this.rankedSerpElementLastUpdatedTime, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementLastUpdatedTime) &&
        Objects.equals(this.rankedSerpElementPreviousUpdatedTime, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementPreviousUpdatedTime) &&
        Objects.equals(this.rankedSerpElementSerpItemExtraAdAclk, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemExtraAdAclk) &&
        Objects.equals(this.rankedSerpElementSerpItemDescriptionRows, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemDescriptionRows) &&
        Objects.equals(this.rankedSerpElementSerpItemPhone, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemPhone) &&
        Objects.equals(this.rankedSerpElementSerpItemIsPaid, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemIsPaid) &&
        Objects.equals(this.rankedSerpElementSerpItemFeaturedTitle, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemFeaturedTitle) &&
        Objects.equals(this.rankedSerpElementSerpItemSource, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemSource) &&
        Objects.equals(this.rankedSerpElementSerpItemText, dataforseoLabsAvailableFiltersGoogleInfo.rankedSerpElementSerpItemText);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keywordDataKeyword, keywordDataKeywordInfoLastUpdatedTime, keywordDataKeywordInfoCompetition, keywordDataKeywordInfoCompetitionLevel, keywordDataKeywordInfoCpc, keywordDataKeywordInfoSearchVolume, keywordDataKeywordInfoLowTopOfPageBid, keywordDataKeywordInfoHighTopOfPageBid, keywordDataKeywordInfoCategories, keywordDataKeywordInfoSearchVolumeTrendMonthly, keywordDataKeywordInfoSearchVolumeTrendQuarterly, keywordDataKeywordInfoSearchVolumeTrendYearly, keywordDataClickstreamKeywordInfoSearchVolume, keywordDataClickstreamKeywordInfoLastUpdatedTime, keywordDataClickstreamKeywordInfoGenderDistributionFemale, keywordDataClickstreamKeywordInfoGenderDistributionMale, keywordDataClickstreamKeywordInfoAgeDistribution1824, keywordDataClickstreamKeywordInfoAgeDistribution2534, keywordDataClickstreamKeywordInfoAgeDistribution3544, keywordDataClickstreamKeywordInfoAgeDistribution4554, keywordDataClickstreamKeywordInfoAgeDistribution5564, keywordDataKeywordPropertiesCoreKeyword, keywordDataKeywordPropertiesSynonymClusteringAlgorithm, keywordDataKeywordPropertiesKeywordDifficulty, keywordDataKeywordPropertiesDetectedLanguage, keywordDataKeywordPropertiesIsAnotherLanguage, keywordDataSerpInfoCheckUrl, keywordDataSerpInfoSerpItemTypes, keywordDataSerpInfoSeResultsCount, keywordDataSerpInfoLastUpdatedTime, keywordDataSerpInfoPreviousUpdatedTime, keywordDataAvgBacklinksInfoBacklinks, keywordDataAvgBacklinksInfoDofollow, keywordDataAvgBacklinksInfoReferringPages, keywordDataAvgBacklinksInfoReferringDomains, keywordDataAvgBacklinksInfoReferringMainDomains, keywordDataAvgBacklinksInfoRank, keywordDataAvgBacklinksInfoMainDomainRank, keywordDataAvgBacklinksInfoLastUpdatedTime, keywordDataSearchIntentInfoMainIntent, keywordDataSearchIntentInfoForeignIntent, keywordDataSearchIntentInfoLastUpdatedTime, keywordDataKeywordInfoNormalizedWithBingSearchVolume, keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime, keywordDataKeywordInfoNormalizedWithBingIsNormalized, keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume, keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime, keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized, rankedSerpElementSerpItemType, rankedSerpElementSerpItemRankGroup, rankedSerpElementSerpItemRankAbsolute, rankedSerpElementSerpItemPosition, rankedSerpElementSerpItemXpath, rankedSerpElementSerpItemDomain, rankedSerpElementSerpItemTitle, rankedSerpElementSerpItemUrl, rankedSerpElementSerpItemBreadcrumb, rankedSerpElementSerpItemWebsiteName, rankedSerpElementSerpItemIsImage, rankedSerpElementSerpItemIsVideo, rankedSerpElementSerpItemIsFeaturedSnippet, rankedSerpElementSerpItemIsMalicious, rankedSerpElementSerpItemDescription, rankedSerpElementSerpItemPreSnippet, rankedSerpElementSerpItemExtendedSnippet, rankedSerpElementSerpItemAmpVersion, rankedSerpElementSerpItemRatingRatingType, rankedSerpElementSerpItemRatingValue, rankedSerpElementSerpItemRatingVotesCount, rankedSerpElementSerpItemRatingRatingMax, rankedSerpElementSerpItemAboutThisResult, rankedSerpElementSerpItemMainDomain, rankedSerpElementSerpItemRelativeUrl, rankedSerpElementSerpItemEtv, rankedSerpElementSerpItemEstimatedPaidTrafficCost, rankedSerpElementSerpItemClickstreamEtv, rankedSerpElementSerpItemRankChangesPreviousRankAbsolute, rankedSerpElementSerpItemRankChangesIsNew, rankedSerpElementSerpItemRankChangesIsUp, rankedSerpElementSerpItemRankChangesIsDown, rankedSerpElementSerpItemBacklinksInfoReferringDomains, rankedSerpElementSerpItemBacklinksInfoReferringMainDomains, rankedSerpElementSerpItemBacklinksInfoReferringPages, rankedSerpElementSerpItemBacklinksInfoDofollow, rankedSerpElementSerpItemBacklinksInfoBacklinks, rankedSerpElementSerpItemBacklinksInfoTimeUpdate, rankedSerpElementSerpItemRankInfoPageRank, rankedSerpElementSerpItemRankInfoMainDomainRank, rankedSerpElementCheckUrl, rankedSerpElementSerpItemTypes, rankedSerpElementSeResultsCount, rankedSerpElementKeywordDifficulty, rankedSerpElementIsLost, rankedSerpElementLastUpdatedTime, rankedSerpElementPreviousUpdatedTime, rankedSerpElementSerpItemExtraAdAclk, rankedSerpElementSerpItemDescriptionRows, rankedSerpElementSerpItemPhone, rankedSerpElementSerpItemIsPaid, rankedSerpElementSerpItemFeaturedTitle, rankedSerpElementSerpItemSource, rankedSerpElementSerpItemText);
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
    sb.append("class DataforseoLabsAvailableFiltersGoogleInfo {\n");

    sb.append("    keywordDataKeyword: ").append(toIndentedString(keywordDataKeyword)).append("\n");
    sb.append("    keywordDataKeywordInfoLastUpdatedTime: ").append(toIndentedString(keywordDataKeywordInfoLastUpdatedTime)).append("\n");
    sb.append("    keywordDataKeywordInfoCompetition: ").append(toIndentedString(keywordDataKeywordInfoCompetition)).append("\n");
    sb.append("    keywordDataKeywordInfoCompetitionLevel: ").append(toIndentedString(keywordDataKeywordInfoCompetitionLevel)).append("\n");
    sb.append("    keywordDataKeywordInfoCpc: ").append(toIndentedString(keywordDataKeywordInfoCpc)).append("\n");
    sb.append("    keywordDataKeywordInfoSearchVolume: ").append(toIndentedString(keywordDataKeywordInfoSearchVolume)).append("\n");
    sb.append("    keywordDataKeywordInfoLowTopOfPageBid: ").append(toIndentedString(keywordDataKeywordInfoLowTopOfPageBid)).append("\n");
    sb.append("    keywordDataKeywordInfoHighTopOfPageBid: ").append(toIndentedString(keywordDataKeywordInfoHighTopOfPageBid)).append("\n");
    sb.append("    keywordDataKeywordInfoCategories: ").append(toIndentedString(keywordDataKeywordInfoCategories)).append("\n");
    sb.append("    keywordDataKeywordInfoSearchVolumeTrendMonthly: ").append(toIndentedString(keywordDataKeywordInfoSearchVolumeTrendMonthly)).append("\n");
    sb.append("    keywordDataKeywordInfoSearchVolumeTrendQuarterly: ").append(toIndentedString(keywordDataKeywordInfoSearchVolumeTrendQuarterly)).append("\n");
    sb.append("    keywordDataKeywordInfoSearchVolumeTrendYearly: ").append(toIndentedString(keywordDataKeywordInfoSearchVolumeTrendYearly)).append("\n");
    sb.append("    keywordDataClickstreamKeywordInfoSearchVolume: ").append(toIndentedString(keywordDataClickstreamKeywordInfoSearchVolume)).append("\n");
    sb.append("    keywordDataClickstreamKeywordInfoLastUpdatedTime: ").append(toIndentedString(keywordDataClickstreamKeywordInfoLastUpdatedTime)).append("\n");
    sb.append("    keywordDataClickstreamKeywordInfoGenderDistributionFemale: ").append(toIndentedString(keywordDataClickstreamKeywordInfoGenderDistributionFemale)).append("\n");
    sb.append("    keywordDataClickstreamKeywordInfoGenderDistributionMale: ").append(toIndentedString(keywordDataClickstreamKeywordInfoGenderDistributionMale)).append("\n");
    sb.append("    keywordDataClickstreamKeywordInfoAgeDistribution1824: ").append(toIndentedString(keywordDataClickstreamKeywordInfoAgeDistribution1824)).append("\n");
    sb.append("    keywordDataClickstreamKeywordInfoAgeDistribution2534: ").append(toIndentedString(keywordDataClickstreamKeywordInfoAgeDistribution2534)).append("\n");
    sb.append("    keywordDataClickstreamKeywordInfoAgeDistribution3544: ").append(toIndentedString(keywordDataClickstreamKeywordInfoAgeDistribution3544)).append("\n");
    sb.append("    keywordDataClickstreamKeywordInfoAgeDistribution4554: ").append(toIndentedString(keywordDataClickstreamKeywordInfoAgeDistribution4554)).append("\n");
    sb.append("    keywordDataClickstreamKeywordInfoAgeDistribution5564: ").append(toIndentedString(keywordDataClickstreamKeywordInfoAgeDistribution5564)).append("\n");
    sb.append("    keywordDataKeywordPropertiesCoreKeyword: ").append(toIndentedString(keywordDataKeywordPropertiesCoreKeyword)).append("\n");
    sb.append("    keywordDataKeywordPropertiesSynonymClusteringAlgorithm: ").append(toIndentedString(keywordDataKeywordPropertiesSynonymClusteringAlgorithm)).append("\n");
    sb.append("    keywordDataKeywordPropertiesKeywordDifficulty: ").append(toIndentedString(keywordDataKeywordPropertiesKeywordDifficulty)).append("\n");
    sb.append("    keywordDataKeywordPropertiesDetectedLanguage: ").append(toIndentedString(keywordDataKeywordPropertiesDetectedLanguage)).append("\n");
    sb.append("    keywordDataKeywordPropertiesIsAnotherLanguage: ").append(toIndentedString(keywordDataKeywordPropertiesIsAnotherLanguage)).append("\n");
    sb.append("    keywordDataSerpInfoCheckUrl: ").append(toIndentedString(keywordDataSerpInfoCheckUrl)).append("\n");
    sb.append("    keywordDataSerpInfoSerpItemTypes: ").append(toIndentedString(keywordDataSerpInfoSerpItemTypes)).append("\n");
    sb.append("    keywordDataSerpInfoSeResultsCount: ").append(toIndentedString(keywordDataSerpInfoSeResultsCount)).append("\n");
    sb.append("    keywordDataSerpInfoLastUpdatedTime: ").append(toIndentedString(keywordDataSerpInfoLastUpdatedTime)).append("\n");
    sb.append("    keywordDataSerpInfoPreviousUpdatedTime: ").append(toIndentedString(keywordDataSerpInfoPreviousUpdatedTime)).append("\n");
    sb.append("    keywordDataAvgBacklinksInfoBacklinks: ").append(toIndentedString(keywordDataAvgBacklinksInfoBacklinks)).append("\n");
    sb.append("    keywordDataAvgBacklinksInfoDofollow: ").append(toIndentedString(keywordDataAvgBacklinksInfoDofollow)).append("\n");
    sb.append("    keywordDataAvgBacklinksInfoReferringPages: ").append(toIndentedString(keywordDataAvgBacklinksInfoReferringPages)).append("\n");
    sb.append("    keywordDataAvgBacklinksInfoReferringDomains: ").append(toIndentedString(keywordDataAvgBacklinksInfoReferringDomains)).append("\n");
    sb.append("    keywordDataAvgBacklinksInfoReferringMainDomains: ").append(toIndentedString(keywordDataAvgBacklinksInfoReferringMainDomains)).append("\n");
    sb.append("    keywordDataAvgBacklinksInfoRank: ").append(toIndentedString(keywordDataAvgBacklinksInfoRank)).append("\n");
    sb.append("    keywordDataAvgBacklinksInfoMainDomainRank: ").append(toIndentedString(keywordDataAvgBacklinksInfoMainDomainRank)).append("\n");
    sb.append("    keywordDataAvgBacklinksInfoLastUpdatedTime: ").append(toIndentedString(keywordDataAvgBacklinksInfoLastUpdatedTime)).append("\n");
    sb.append("    keywordDataSearchIntentInfoMainIntent: ").append(toIndentedString(keywordDataSearchIntentInfoMainIntent)).append("\n");
    sb.append("    keywordDataSearchIntentInfoForeignIntent: ").append(toIndentedString(keywordDataSearchIntentInfoForeignIntent)).append("\n");
    sb.append("    keywordDataSearchIntentInfoLastUpdatedTime: ").append(toIndentedString(keywordDataSearchIntentInfoLastUpdatedTime)).append("\n");
    sb.append("    keywordDataKeywordInfoNormalizedWithBingSearchVolume: ").append(toIndentedString(keywordDataKeywordInfoNormalizedWithBingSearchVolume)).append("\n");
    sb.append("    keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime: ").append(toIndentedString(keywordDataKeywordInfoNormalizedWithBingLastUpdatedTime)).append("\n");
    sb.append("    keywordDataKeywordInfoNormalizedWithBingIsNormalized: ").append(toIndentedString(keywordDataKeywordInfoNormalizedWithBingIsNormalized)).append("\n");
    sb.append("    keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume: ").append(toIndentedString(keywordDataKeywordInfoNormalizedWithClickstreamSearchVolume)).append("\n");
    sb.append("    keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime: ").append(toIndentedString(keywordDataKeywordInfoNormalizedWithClickstreamLastUpdatedTime)).append("\n");
    sb.append("    keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized: ").append(toIndentedString(keywordDataKeywordInfoNormalizedWithClickstreamIsNormalized)).append("\n");
    sb.append("    rankedSerpElementSerpItemType: ").append(toIndentedString(rankedSerpElementSerpItemType)).append("\n");
    sb.append("    rankedSerpElementSerpItemRankGroup: ").append(toIndentedString(rankedSerpElementSerpItemRankGroup)).append("\n");
    sb.append("    rankedSerpElementSerpItemRankAbsolute: ").append(toIndentedString(rankedSerpElementSerpItemRankAbsolute)).append("\n");
    sb.append("    rankedSerpElementSerpItemPosition: ").append(toIndentedString(rankedSerpElementSerpItemPosition)).append("\n");
    sb.append("    rankedSerpElementSerpItemXpath: ").append(toIndentedString(rankedSerpElementSerpItemXpath)).append("\n");
    sb.append("    rankedSerpElementSerpItemDomain: ").append(toIndentedString(rankedSerpElementSerpItemDomain)).append("\n");
    sb.append("    rankedSerpElementSerpItemTitle: ").append(toIndentedString(rankedSerpElementSerpItemTitle)).append("\n");
    sb.append("    rankedSerpElementSerpItemUrl: ").append(toIndentedString(rankedSerpElementSerpItemUrl)).append("\n");
    sb.append("    rankedSerpElementSerpItemBreadcrumb: ").append(toIndentedString(rankedSerpElementSerpItemBreadcrumb)).append("\n");
    sb.append("    rankedSerpElementSerpItemWebsiteName: ").append(toIndentedString(rankedSerpElementSerpItemWebsiteName)).append("\n");
    sb.append("    rankedSerpElementSerpItemIsImage: ").append(toIndentedString(rankedSerpElementSerpItemIsImage)).append("\n");
    sb.append("    rankedSerpElementSerpItemIsVideo: ").append(toIndentedString(rankedSerpElementSerpItemIsVideo)).append("\n");
    sb.append("    rankedSerpElementSerpItemIsFeaturedSnippet: ").append(toIndentedString(rankedSerpElementSerpItemIsFeaturedSnippet)).append("\n");
    sb.append("    rankedSerpElementSerpItemIsMalicious: ").append(toIndentedString(rankedSerpElementSerpItemIsMalicious)).append("\n");
    sb.append("    rankedSerpElementSerpItemDescription: ").append(toIndentedString(rankedSerpElementSerpItemDescription)).append("\n");
    sb.append("    rankedSerpElementSerpItemPreSnippet: ").append(toIndentedString(rankedSerpElementSerpItemPreSnippet)).append("\n");
    sb.append("    rankedSerpElementSerpItemExtendedSnippet: ").append(toIndentedString(rankedSerpElementSerpItemExtendedSnippet)).append("\n");
    sb.append("    rankedSerpElementSerpItemAmpVersion: ").append(toIndentedString(rankedSerpElementSerpItemAmpVersion)).append("\n");
    sb.append("    rankedSerpElementSerpItemRatingRatingType: ").append(toIndentedString(rankedSerpElementSerpItemRatingRatingType)).append("\n");
    sb.append("    rankedSerpElementSerpItemRatingValue: ").append(toIndentedString(rankedSerpElementSerpItemRatingValue)).append("\n");
    sb.append("    rankedSerpElementSerpItemRatingVotesCount: ").append(toIndentedString(rankedSerpElementSerpItemRatingVotesCount)).append("\n");
    sb.append("    rankedSerpElementSerpItemRatingRatingMax: ").append(toIndentedString(rankedSerpElementSerpItemRatingRatingMax)).append("\n");
    sb.append("    rankedSerpElementSerpItemAboutThisResult: ").append(toIndentedString(rankedSerpElementSerpItemAboutThisResult)).append("\n");
    sb.append("    rankedSerpElementSerpItemMainDomain: ").append(toIndentedString(rankedSerpElementSerpItemMainDomain)).append("\n");
    sb.append("    rankedSerpElementSerpItemRelativeUrl: ").append(toIndentedString(rankedSerpElementSerpItemRelativeUrl)).append("\n");
    sb.append("    rankedSerpElementSerpItemEtv: ").append(toIndentedString(rankedSerpElementSerpItemEtv)).append("\n");
    sb.append("    rankedSerpElementSerpItemEstimatedPaidTrafficCost: ").append(toIndentedString(rankedSerpElementSerpItemEstimatedPaidTrafficCost)).append("\n");
    sb.append("    rankedSerpElementSerpItemClickstreamEtv: ").append(toIndentedString(rankedSerpElementSerpItemClickstreamEtv)).append("\n");
    sb.append("    rankedSerpElementSerpItemRankChangesPreviousRankAbsolute: ").append(toIndentedString(rankedSerpElementSerpItemRankChangesPreviousRankAbsolute)).append("\n");
    sb.append("    rankedSerpElementSerpItemRankChangesIsNew: ").append(toIndentedString(rankedSerpElementSerpItemRankChangesIsNew)).append("\n");
    sb.append("    rankedSerpElementSerpItemRankChangesIsUp: ").append(toIndentedString(rankedSerpElementSerpItemRankChangesIsUp)).append("\n");
    sb.append("    rankedSerpElementSerpItemRankChangesIsDown: ").append(toIndentedString(rankedSerpElementSerpItemRankChangesIsDown)).append("\n");
    sb.append("    rankedSerpElementSerpItemBacklinksInfoReferringDomains: ").append(toIndentedString(rankedSerpElementSerpItemBacklinksInfoReferringDomains)).append("\n");
    sb.append("    rankedSerpElementSerpItemBacklinksInfoReferringMainDomains: ").append(toIndentedString(rankedSerpElementSerpItemBacklinksInfoReferringMainDomains)).append("\n");
    sb.append("    rankedSerpElementSerpItemBacklinksInfoReferringPages: ").append(toIndentedString(rankedSerpElementSerpItemBacklinksInfoReferringPages)).append("\n");
    sb.append("    rankedSerpElementSerpItemBacklinksInfoDofollow: ").append(toIndentedString(rankedSerpElementSerpItemBacklinksInfoDofollow)).append("\n");
    sb.append("    rankedSerpElementSerpItemBacklinksInfoBacklinks: ").append(toIndentedString(rankedSerpElementSerpItemBacklinksInfoBacklinks)).append("\n");
    sb.append("    rankedSerpElementSerpItemBacklinksInfoTimeUpdate: ").append(toIndentedString(rankedSerpElementSerpItemBacklinksInfoTimeUpdate)).append("\n");
    sb.append("    rankedSerpElementSerpItemRankInfoPageRank: ").append(toIndentedString(rankedSerpElementSerpItemRankInfoPageRank)).append("\n");
    sb.append("    rankedSerpElementSerpItemRankInfoMainDomainRank: ").append(toIndentedString(rankedSerpElementSerpItemRankInfoMainDomainRank)).append("\n");
    sb.append("    rankedSerpElementCheckUrl: ").append(toIndentedString(rankedSerpElementCheckUrl)).append("\n");
    sb.append("    rankedSerpElementSerpItemTypes: ").append(toIndentedString(rankedSerpElementSerpItemTypes)).append("\n");
    sb.append("    rankedSerpElementSeResultsCount: ").append(toIndentedString(rankedSerpElementSeResultsCount)).append("\n");
    sb.append("    rankedSerpElementKeywordDifficulty: ").append(toIndentedString(rankedSerpElementKeywordDifficulty)).append("\n");
    sb.append("    rankedSerpElementIsLost: ").append(toIndentedString(rankedSerpElementIsLost)).append("\n");
    sb.append("    rankedSerpElementLastUpdatedTime: ").append(toIndentedString(rankedSerpElementLastUpdatedTime)).append("\n");
    sb.append("    rankedSerpElementPreviousUpdatedTime: ").append(toIndentedString(rankedSerpElementPreviousUpdatedTime)).append("\n");
    sb.append("    rankedSerpElementSerpItemExtraAdAclk: ").append(toIndentedString(rankedSerpElementSerpItemExtraAdAclk)).append("\n");
    sb.append("    rankedSerpElementSerpItemDescriptionRows: ").append(toIndentedString(rankedSerpElementSerpItemDescriptionRows)).append("\n");
    sb.append("    rankedSerpElementSerpItemPhone: ").append(toIndentedString(rankedSerpElementSerpItemPhone)).append("\n");
    sb.append("    rankedSerpElementSerpItemIsPaid: ").append(toIndentedString(rankedSerpElementSerpItemIsPaid)).append("\n");
    sb.append("    rankedSerpElementSerpItemFeaturedTitle: ").append(toIndentedString(rankedSerpElementSerpItemFeaturedTitle)).append("\n");
    sb.append("    rankedSerpElementSerpItemSource: ").append(toIndentedString(rankedSerpElementSerpItemSource)).append("\n");
    sb.append("    rankedSerpElementSerpItemText: ").append(toIndentedString(rankedSerpElementSerpItemText)).append("\n");
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
    
    openapiFields.add("keyword_data.keyword");
    
    openapiFields.add("keyword_data.keyword_info.last_updated_time");
    
    openapiFields.add("keyword_data.keyword_info.competition");
    
    openapiFields.add("keyword_data.keyword_info.competition_level");
    
    openapiFields.add("keyword_data.keyword_info.cpc");
    
    openapiFields.add("keyword_data.keyword_info.search_volume");
    
    openapiFields.add("keyword_data.keyword_info.low_top_of_page_bid");
    
    openapiFields.add("keyword_data.keyword_info.high_top_of_page_bid");
    
    openapiFields.add("keyword_data.keyword_info.categories");
    
    openapiFields.add("keyword_data.keyword_info.search_volume_trend.monthly");
    
    openapiFields.add("keyword_data.keyword_info.search_volume_trend.quarterly");
    
    openapiFields.add("keyword_data.keyword_info.search_volume_trend.yearly");
    
    openapiFields.add("keyword_data.clickstream_keyword_info.search_volume");
    
    openapiFields.add("keyword_data.clickstream_keyword_info.last_updated_time");
    
    openapiFields.add("keyword_data.clickstream_keyword_info.gender_distribution.female");
    
    openapiFields.add("keyword_data.clickstream_keyword_info.gender_distribution.male");
    
    openapiFields.add("keyword_data.clickstream_keyword_info.age_distribution.18-24");
    
    openapiFields.add("keyword_data.clickstream_keyword_info.age_distribution.25-34");
    
    openapiFields.add("keyword_data.clickstream_keyword_info.age_distribution.35-44");
    
    openapiFields.add("keyword_data.clickstream_keyword_info.age_distribution.45-54");
    
    openapiFields.add("keyword_data.clickstream_keyword_info.age_distribution.55-64");
    
    openapiFields.add("keyword_data.keyword_properties.core_keyword");
    
    openapiFields.add("keyword_data.keyword_properties.synonym_clustering_algorithm");
    
    openapiFields.add("keyword_data.keyword_properties.keyword_difficulty");
    
    openapiFields.add("keyword_data.keyword_properties.detected_language");
    
    openapiFields.add("keyword_data.keyword_properties.is_another_language");
    
    openapiFields.add("keyword_data.serp_info.check_url");
    
    openapiFields.add("keyword_data.serp_info.serp_item_types");
    
    openapiFields.add("keyword_data.serp_info.se_results_count");
    
    openapiFields.add("keyword_data.serp_info.last_updated_time");
    
    openapiFields.add("keyword_data.serp_info.previous_updated_time");
    
    openapiFields.add("keyword_data.avg_backlinks_info.backlinks");
    
    openapiFields.add("keyword_data.avg_backlinks_info.dofollow");
    
    openapiFields.add("keyword_data.avg_backlinks_info.referring_pages");
    
    openapiFields.add("keyword_data.avg_backlinks_info.referring_domains");
    
    openapiFields.add("keyword_data.avg_backlinks_info.referring_main_domains");
    
    openapiFields.add("keyword_data.avg_backlinks_info.rank");
    
    openapiFields.add("keyword_data.avg_backlinks_info.main_domain_rank");
    
    openapiFields.add("keyword_data.avg_backlinks_info.last_updated_time");
    
    openapiFields.add("keyword_data.search_intent_info.main_intent");
    
    openapiFields.add("keyword_data.search_intent_info.foreign_intent");
    
    openapiFields.add("keyword_data.search_intent_info.last_updated_time");
    
    openapiFields.add("keyword_data.keyword_info_normalized_with_bing.search_volume");
    
    openapiFields.add("keyword_data.keyword_info_normalized_with_bing.last_updated_time");
    
    openapiFields.add("keyword_data.keyword_info_normalized_with_bing.is_normalized");
    
    openapiFields.add("keyword_data.keyword_info_normalized_with_clickstream.search_volume");
    
    openapiFields.add("keyword_data.keyword_info_normalized_with_clickstream.last_updated_time");
    
    openapiFields.add("keyword_data.keyword_info_normalized_with_clickstream.is_normalized");
    
    openapiFields.add("ranked_serp_element.serp_item.type");
    
    openapiFields.add("ranked_serp_element.serp_item.rank_group");
    
    openapiFields.add("ranked_serp_element.serp_item.rank_absolute");
    
    openapiFields.add("ranked_serp_element.serp_item.position");
    
    openapiFields.add("ranked_serp_element.serp_item.xpath");
    
    openapiFields.add("ranked_serp_element.serp_item.domain");
    
    openapiFields.add("ranked_serp_element.serp_item.title");
    
    openapiFields.add("ranked_serp_element.serp_item.url");
    
    openapiFields.add("ranked_serp_element.serp_item.breadcrumb");
    
    openapiFields.add("ranked_serp_element.serp_item.website_name");
    
    openapiFields.add("ranked_serp_element.serp_item.is_image");
    
    openapiFields.add("ranked_serp_element.serp_item.is_video");
    
    openapiFields.add("ranked_serp_element.serp_item.is_featured_snippet");
    
    openapiFields.add("ranked_serp_element.serp_item.is_malicious");
    
    openapiFields.add("ranked_serp_element.serp_item.description");
    
    openapiFields.add("ranked_serp_element.serp_item.pre_snippet");
    
    openapiFields.add("ranked_serp_element.serp_item.extended_snippet");
    
    openapiFields.add("ranked_serp_element.serp_item.amp_version");
    
    openapiFields.add("ranked_serp_element.serp_item.rating.rating_type");
    
    openapiFields.add("ranked_serp_element.serp_item.rating.value");
    
    openapiFields.add("ranked_serp_element.serp_item.rating.votes_count");
    
    openapiFields.add("ranked_serp_element.serp_item.rating.rating_max");
    
    openapiFields.add("ranked_serp_element.serp_item.about_this_result");
    
    openapiFields.add("ranked_serp_element.serp_item.main_domain");
    
    openapiFields.add("ranked_serp_element.serp_item.relative_url");
    
    openapiFields.add("ranked_serp_element.serp_item.etv");
    
    openapiFields.add("ranked_serp_element.serp_item.estimated_paid_traffic_cost");
    
    openapiFields.add("ranked_serp_element.serp_item.clickstream_etv");
    
    openapiFields.add("ranked_serp_element.serp_item.rank_changes.previous_rank_absolute");
    
    openapiFields.add("ranked_serp_element.serp_item.rank_changes.is_new");
    
    openapiFields.add("ranked_serp_element.serp_item.rank_changes.is_up");
    
    openapiFields.add("ranked_serp_element.serp_item.rank_changes.is_down");
    
    openapiFields.add("ranked_serp_element.serp_item.backlinks_info.referring_domains");
    
    openapiFields.add("ranked_serp_element.serp_item.backlinks_info.referring_main_domains");
    
    openapiFields.add("ranked_serp_element.serp_item.backlinks_info.referring_pages");
    
    openapiFields.add("ranked_serp_element.serp_item.backlinks_info.dofollow");
    
    openapiFields.add("ranked_serp_element.serp_item.backlinks_info.backlinks");
    
    openapiFields.add("ranked_serp_element.serp_item.backlinks_info.time_update");
    
    openapiFields.add("ranked_serp_element.serp_item.rank_info.page_rank");
    
    openapiFields.add("ranked_serp_element.serp_item.rank_info.main_domain_rank");
    
    openapiFields.add("ranked_serp_element.check_url");
    
    openapiFields.add("ranked_serp_element.serp_item_types");
    
    openapiFields.add("ranked_serp_element.se_results_count");
    
    openapiFields.add("ranked_serp_element.keyword_difficulty");
    
    openapiFields.add("ranked_serp_element.is_lost");
    
    openapiFields.add("ranked_serp_element.last_updated_time");
    
    openapiFields.add("ranked_serp_element.previous_updated_time");
    
    openapiFields.add("ranked_serp_element.serp_item.extra.ad_aclk");
    
    openapiFields.add("ranked_serp_element.serp_item.description_rows");
    
    openapiFields.add("ranked_serp_element.serp_item.phone");
    
    openapiFields.add("ranked_serp_element.serp_item.is_paid");
    
    openapiFields.add("ranked_serp_element.serp_item.featured_title");
    
    openapiFields.add("ranked_serp_element.serp_item.source");
    
    openapiFields.add("ranked_serp_element.serp_item.text");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsAvailableFiltersGoogleInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsAvailableFiltersGoogleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsAvailableFiltersGoogleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsAvailableFiltersGoogleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsAvailableFiltersGoogleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsAvailableFiltersGoogleInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsAvailableFiltersGoogleInfo value) throws IOException {
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
           public DataforseoLabsAvailableFiltersGoogleInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsAvailableFiltersGoogleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsAvailableFiltersGoogleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsAvailableFiltersGoogleInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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



public class DataforseoLabsAvailableFiltersAmazonInfo  {


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD = "keyword_data.keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD)
  private String keywordDataKeyword;

  public DataforseoLabsAvailableFiltersAmazonInfo keywordDataKeyword(String keywordDataKeyword) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo keywordDataKeywordInfoLastUpdatedTime(String keywordDataKeywordInfoLastUpdatedTime) {
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


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.SEARCH_VOLUME = "keyword_data.keyword_info.search_volume";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.SEARCH_VOLUME)
  private String keywordDataKeywordInfoSearchVolume;

  public DataforseoLabsAvailableFiltersAmazonInfo keywordDataKeywordInfoSearchVolume(String keywordDataKeywordInfoSearchVolume) {
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


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.TYPE = "ranked_serp_element.serp_item.type";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.TYPE)
  private String rankedSerpElementSerpItemType;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemType(String rankedSerpElementSerpItemType) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemRankGroup(String rankedSerpElementSerpItemRankGroup) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemRankAbsolute(String rankedSerpElementSerpItemRankAbsolute) {
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


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.XPATH = "ranked_serp_element.serp_item.xpath";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.XPATH)
  private String rankedSerpElementSerpItemXpath;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemXpath(String rankedSerpElementSerpItemXpath) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDomain(String rankedSerpElementSerpItemDomain) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemTitle(String rankedSerpElementSerpItemTitle) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemUrl(String rankedSerpElementSerpItemUrl) {
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


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.ASIN = "ranked_serp_element.serp_item.asin";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.ASIN)
  private String rankedSerpElementSerpItemAsin;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemAsin(String rankedSerpElementSerpItemAsin) {
    this.rankedSerpElementSerpItemAsin = rankedSerpElementSerpItemAsin;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemAsin
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemAsin() {
    return rankedSerpElementSerpItemAsin;
  }

  public void setRankedSerpElementSerpItemAsin(String rankedSerpElementSerpItemAsin) {
    this.rankedSerpElementSerpItemAsin = rankedSerpElementSerpItemAsin;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IMAGE_URL = "ranked_serp_element.serp_item.image_url";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IMAGE_URL)
  private String rankedSerpElementSerpItemImageUrl;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemImageUrl(String rankedSerpElementSerpItemImageUrl) {
    this.rankedSerpElementSerpItemImageUrl = rankedSerpElementSerpItemImageUrl;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemImageUrl
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemImageUrl() {
    return rankedSerpElementSerpItemImageUrl;
  }

  public void setRankedSerpElementSerpItemImageUrl(String rankedSerpElementSerpItemImageUrl) {
    this.rankedSerpElementSerpItemImageUrl = rankedSerpElementSerpItemImageUrl;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.PRICE_FROM = "ranked_serp_element.serp_item.price_from";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.PRICE_FROM)
  private String rankedSerpElementSerpItemPriceFrom;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemPriceFrom(String rankedSerpElementSerpItemPriceFrom) {
    this.rankedSerpElementSerpItemPriceFrom = rankedSerpElementSerpItemPriceFrom;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemPriceFrom
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemPriceFrom() {
    return rankedSerpElementSerpItemPriceFrom;
  }

  public void setRankedSerpElementSerpItemPriceFrom(String rankedSerpElementSerpItemPriceFrom) {
    this.rankedSerpElementSerpItemPriceFrom = rankedSerpElementSerpItemPriceFrom;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.PRICE_TO = "ranked_serp_element.serp_item.price_to";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.PRICE_TO)
  private String rankedSerpElementSerpItemPriceTo;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemPriceTo(String rankedSerpElementSerpItemPriceTo) {
    this.rankedSerpElementSerpItemPriceTo = rankedSerpElementSerpItemPriceTo;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemPriceTo
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemPriceTo() {
    return rankedSerpElementSerpItemPriceTo;
  }

  public void setRankedSerpElementSerpItemPriceTo(String rankedSerpElementSerpItemPriceTo) {
    this.rankedSerpElementSerpItemPriceTo = rankedSerpElementSerpItemPriceTo;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.CURRENCY = "ranked_serp_element.serp_item.currency";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.CURRENCY)
  private String rankedSerpElementSerpItemCurrency;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemCurrency(String rankedSerpElementSerpItemCurrency) {
    this.rankedSerpElementSerpItemCurrency = rankedSerpElementSerpItemCurrency;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemCurrency
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemCurrency() {
    return rankedSerpElementSerpItemCurrency;
  }

  public void setRankedSerpElementSerpItemCurrency(String rankedSerpElementSerpItemCurrency) {
    this.rankedSerpElementSerpItemCurrency = rankedSerpElementSerpItemCurrency;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_BEST_SELLER = "ranked_serp_element.serp_item.is_best_seller";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_BEST_SELLER)
  private String rankedSerpElementSerpItemIsBestSeller;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemIsBestSeller(String rankedSerpElementSerpItemIsBestSeller) {
    this.rankedSerpElementSerpItemIsBestSeller = rankedSerpElementSerpItemIsBestSeller;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemIsBestSeller
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemIsBestSeller() {
    return rankedSerpElementSerpItemIsBestSeller;
  }

  public void setRankedSerpElementSerpItemIsBestSeller(String rankedSerpElementSerpItemIsBestSeller) {
    this.rankedSerpElementSerpItemIsBestSeller = rankedSerpElementSerpItemIsBestSeller;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_AMAZON_CHOICE = "ranked_serp_element.serp_item.is_amazon_choice";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.IS_AMAZON_CHOICE)
  private String rankedSerpElementSerpItemIsAmazonChoice;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemIsAmazonChoice(String rankedSerpElementSerpItemIsAmazonChoice) {
    this.rankedSerpElementSerpItemIsAmazonChoice = rankedSerpElementSerpItemIsAmazonChoice;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemIsAmazonChoice
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemIsAmazonChoice() {
    return rankedSerpElementSerpItemIsAmazonChoice;
  }

  public void setRankedSerpElementSerpItemIsAmazonChoice(String rankedSerpElementSerpItemIsAmazonChoice) {
    this.rankedSerpElementSerpItemIsAmazonChoice = rankedSerpElementSerpItemIsAmazonChoice;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RATING.RATING_TYPE = "ranked_serp_element.serp_item.rating.rating_type";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.RATING.RATING_TYPE)
  private String rankedSerpElementSerpItemRatingRatingType;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemRatingRatingType(String rankedSerpElementSerpItemRatingRatingType) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemRatingValue(String rankedSerpElementSerpItemRatingValue) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemRatingVotesCount(String rankedSerpElementSerpItemRatingVotesCount) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemRatingRatingMax(Integer rankedSerpElementSerpItemRatingRatingMax) {
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


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_DATE_FROM = "ranked_serp_element.serp_item.delivery_info.delivery_date_from";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_DATE_FROM)
  private String rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom(String rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom = rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom() {
    return rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom(String rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom = rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_DATE_TO = "ranked_serp_element.serp_item.delivery_info.delivery_date_to";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_DATE_TO)
  private String rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo(String rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo = rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoDeliveryDateTo() {
    return rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoDeliveryDateTo(String rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo = rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.FASTEST_DELIVERY_DATE_FROM = "ranked_serp_element.serp_item.delivery_info.fastest_delivery_date_from";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.FASTEST_DELIVERY_DATE_FROM)
  private String rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom(String rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom) {
    this.rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom = rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom() {
    return rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom(String rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom) {
    this.rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom = rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.FASTEST_DELIVERY_DATE_TO = "ranked_serp_element.serp_item.delivery_info.fastest_delivery_date_to";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.FASTEST_DELIVERY_DATE_TO)
  private String rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo(String rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo) {
    this.rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo = rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo() {
    return rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo(String rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo) {
    this.rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo = rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_MESSAGE = "ranked_serp_element.serp_item.delivery_info.delivery_message";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_MESSAGE)
  private String rankedSerpElementSerpItemDeliveryInfoDeliveryMessage;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoDeliveryMessage(String rankedSerpElementSerpItemDeliveryInfoDeliveryMessage) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryMessage = rankedSerpElementSerpItemDeliveryInfoDeliveryMessage;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoDeliveryMessage
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoDeliveryMessage() {
    return rankedSerpElementSerpItemDeliveryInfoDeliveryMessage;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoDeliveryMessage(String rankedSerpElementSerpItemDeliveryInfoDeliveryMessage) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryMessage = rankedSerpElementSerpItemDeliveryInfoDeliveryMessage;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.CURRENT = "ranked_serp_element.serp_item.delivery_info.delivery_price.current";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.CURRENT)
  private String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent() {
    return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.REGULAR = "ranked_serp_element.serp_item.delivery_info.delivery_price.regular";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.REGULAR)
  private String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular() {
    return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.MAX_VALUE = "ranked_serp_element.serp_item.delivery_info.delivery_price.max_value";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.MAX_VALUE)
  private String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue() {
    return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.CURRENCY = "ranked_serp_element.serp_item.delivery_info.delivery_price.currency";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.CURRENCY)
  private String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency() {
    return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.IS_PRICE_RANGE = "ranked_serp_element.serp_item.delivery_info.delivery_price.is_price_range";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.IS_PRICE_RANGE)
  private String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange() {
    return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.DISPLAYED_PRICE = "ranked_serp_element.serp_item.delivery_info.delivery_price.displayed_price";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.SERP_ITEM.DELIVERY_INFO.DELIVERY_PRICE.DISPLAYED_PRICE)
  private String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice;
    return this;
  }

  /**
   * 
   * @return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice
   */
  @javax.annotation.Nullable
  public String getRankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice() {
    return rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice;
  }

  public void setRankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice(String rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice) {
    this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice = rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice;
  }


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.CHECK_URL = "ranked_serp_element.check_url";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.CHECK_URL)
  private String rankedSerpElementCheckUrl;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementCheckUrl(String rankedSerpElementCheckUrl) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSerpItemTypes(String rankedSerpElementSerpItemTypes) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementSeResultsCount(String rankedSerpElementSeResultsCount) {
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


  public static final String SERIALIZED_NAME_RANKED_SERP_ELEMENT.LAST_UPDATED_TIME = "ranked_serp_element.last_updated_time";
  @SerializedName(SERIALIZED_NAME_RANKED_SERP_ELEMENT.LAST_UPDATED_TIME)
  private String rankedSerpElementLastUpdatedTime;

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementLastUpdatedTime(String rankedSerpElementLastUpdatedTime) {
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

  public DataforseoLabsAvailableFiltersAmazonInfo rankedSerpElementPreviousUpdatedTime(String rankedSerpElementPreviousUpdatedTime) {
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



  public DataforseoLabsAvailableFiltersAmazonInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsAvailableFiltersAmazonInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsAvailableFiltersAmazonInfo dataforseoLabsAvailableFiltersAmazonInfo = (DataforseoLabsAvailableFiltersAmazonInfo) o;
    return

        Objects.equals(this.keywordDataKeyword, dataforseoLabsAvailableFiltersAmazonInfo.keywordDataKeyword) &&
        Objects.equals(this.keywordDataKeywordInfoLastUpdatedTime, dataforseoLabsAvailableFiltersAmazonInfo.keywordDataKeywordInfoLastUpdatedTime) &&
        Objects.equals(this.keywordDataKeywordInfoSearchVolume, dataforseoLabsAvailableFiltersAmazonInfo.keywordDataKeywordInfoSearchVolume) &&
        Objects.equals(this.rankedSerpElementSerpItemType, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemType) &&
        Objects.equals(this.rankedSerpElementSerpItemRankGroup, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemRankGroup) &&
        Objects.equals(this.rankedSerpElementSerpItemRankAbsolute, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemRankAbsolute) &&
        Objects.equals(this.rankedSerpElementSerpItemXpath, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemXpath) &&
        Objects.equals(this.rankedSerpElementSerpItemDomain, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDomain) &&
        Objects.equals(this.rankedSerpElementSerpItemTitle, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemTitle) &&
        Objects.equals(this.rankedSerpElementSerpItemUrl, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemUrl) &&
        Objects.equals(this.rankedSerpElementSerpItemAsin, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemAsin) &&
        Objects.equals(this.rankedSerpElementSerpItemImageUrl, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemImageUrl) &&
        Objects.equals(this.rankedSerpElementSerpItemPriceFrom, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemPriceFrom) &&
        Objects.equals(this.rankedSerpElementSerpItemPriceTo, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemPriceTo) &&
        Objects.equals(this.rankedSerpElementSerpItemCurrency, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemCurrency) &&
        Objects.equals(this.rankedSerpElementSerpItemIsBestSeller, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemIsBestSeller) &&
        Objects.equals(this.rankedSerpElementSerpItemIsAmazonChoice, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemIsAmazonChoice) &&
        Objects.equals(this.rankedSerpElementSerpItemRatingRatingType, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemRatingRatingType) &&
        Objects.equals(this.rankedSerpElementSerpItemRatingValue, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemRatingValue) &&
        Objects.equals(this.rankedSerpElementSerpItemRatingVotesCount, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemRatingVotesCount) &&
        Objects.equals(this.rankedSerpElementSerpItemRatingRatingMax, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemRatingRatingMax) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoDeliveryMessage, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoDeliveryMessage) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange) &&
        Objects.equals(this.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice) &&
        Objects.equals(this.rankedSerpElementCheckUrl, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementCheckUrl) &&
        Objects.equals(this.rankedSerpElementSerpItemTypes, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSerpItemTypes) &&
        Objects.equals(this.rankedSerpElementSeResultsCount, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementSeResultsCount) &&
        Objects.equals(this.rankedSerpElementLastUpdatedTime, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementLastUpdatedTime) &&
        Objects.equals(this.rankedSerpElementPreviousUpdatedTime, dataforseoLabsAvailableFiltersAmazonInfo.rankedSerpElementPreviousUpdatedTime);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keywordDataKeyword, keywordDataKeywordInfoLastUpdatedTime, keywordDataKeywordInfoSearchVolume, rankedSerpElementSerpItemType, rankedSerpElementSerpItemRankGroup, rankedSerpElementSerpItemRankAbsolute, rankedSerpElementSerpItemXpath, rankedSerpElementSerpItemDomain, rankedSerpElementSerpItemTitle, rankedSerpElementSerpItemUrl, rankedSerpElementSerpItemAsin, rankedSerpElementSerpItemImageUrl, rankedSerpElementSerpItemPriceFrom, rankedSerpElementSerpItemPriceTo, rankedSerpElementSerpItemCurrency, rankedSerpElementSerpItemIsBestSeller, rankedSerpElementSerpItemIsAmazonChoice, rankedSerpElementSerpItemRatingRatingType, rankedSerpElementSerpItemRatingValue, rankedSerpElementSerpItemRatingVotesCount, rankedSerpElementSerpItemRatingRatingMax, rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom, rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo, rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom, rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo, rankedSerpElementSerpItemDeliveryInfoDeliveryMessage, rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent, rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular, rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue, rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency, rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange, rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice, rankedSerpElementCheckUrl, rankedSerpElementSerpItemTypes, rankedSerpElementSeResultsCount, rankedSerpElementLastUpdatedTime, rankedSerpElementPreviousUpdatedTime);
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
    sb.append("class DataforseoLabsAvailableFiltersAmazonInfo {\n");

    sb.append("    keywordDataKeyword: ").append(toIndentedString(keywordDataKeyword)).append("\n");
    sb.append("    keywordDataKeywordInfoLastUpdatedTime: ").append(toIndentedString(keywordDataKeywordInfoLastUpdatedTime)).append("\n");
    sb.append("    keywordDataKeywordInfoSearchVolume: ").append(toIndentedString(keywordDataKeywordInfoSearchVolume)).append("\n");
    sb.append("    rankedSerpElementSerpItemType: ").append(toIndentedString(rankedSerpElementSerpItemType)).append("\n");
    sb.append("    rankedSerpElementSerpItemRankGroup: ").append(toIndentedString(rankedSerpElementSerpItemRankGroup)).append("\n");
    sb.append("    rankedSerpElementSerpItemRankAbsolute: ").append(toIndentedString(rankedSerpElementSerpItemRankAbsolute)).append("\n");
    sb.append("    rankedSerpElementSerpItemXpath: ").append(toIndentedString(rankedSerpElementSerpItemXpath)).append("\n");
    sb.append("    rankedSerpElementSerpItemDomain: ").append(toIndentedString(rankedSerpElementSerpItemDomain)).append("\n");
    sb.append("    rankedSerpElementSerpItemTitle: ").append(toIndentedString(rankedSerpElementSerpItemTitle)).append("\n");
    sb.append("    rankedSerpElementSerpItemUrl: ").append(toIndentedString(rankedSerpElementSerpItemUrl)).append("\n");
    sb.append("    rankedSerpElementSerpItemAsin: ").append(toIndentedString(rankedSerpElementSerpItemAsin)).append("\n");
    sb.append("    rankedSerpElementSerpItemImageUrl: ").append(toIndentedString(rankedSerpElementSerpItemImageUrl)).append("\n");
    sb.append("    rankedSerpElementSerpItemPriceFrom: ").append(toIndentedString(rankedSerpElementSerpItemPriceFrom)).append("\n");
    sb.append("    rankedSerpElementSerpItemPriceTo: ").append(toIndentedString(rankedSerpElementSerpItemPriceTo)).append("\n");
    sb.append("    rankedSerpElementSerpItemCurrency: ").append(toIndentedString(rankedSerpElementSerpItemCurrency)).append("\n");
    sb.append("    rankedSerpElementSerpItemIsBestSeller: ").append(toIndentedString(rankedSerpElementSerpItemIsBestSeller)).append("\n");
    sb.append("    rankedSerpElementSerpItemIsAmazonChoice: ").append(toIndentedString(rankedSerpElementSerpItemIsAmazonChoice)).append("\n");
    sb.append("    rankedSerpElementSerpItemRatingRatingType: ").append(toIndentedString(rankedSerpElementSerpItemRatingRatingType)).append("\n");
    sb.append("    rankedSerpElementSerpItemRatingValue: ").append(toIndentedString(rankedSerpElementSerpItemRatingValue)).append("\n");
    sb.append("    rankedSerpElementSerpItemRatingVotesCount: ").append(toIndentedString(rankedSerpElementSerpItemRatingVotesCount)).append("\n");
    sb.append("    rankedSerpElementSerpItemRatingRatingMax: ").append(toIndentedString(rankedSerpElementSerpItemRatingRatingMax)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoDeliveryDateFrom)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoDeliveryDateTo)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateFrom)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoFastestDeliveryDateTo)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoDeliveryMessage: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoDeliveryMessage)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrent)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoDeliveryPriceRegular)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoDeliveryPriceMaxValue)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoDeliveryPriceCurrency)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoDeliveryPriceIsPriceRange)).append("\n");
    sb.append("    rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice: ").append(toIndentedString(rankedSerpElementSerpItemDeliveryInfoDeliveryPriceDisplayedPrice)).append("\n");
    sb.append("    rankedSerpElementCheckUrl: ").append(toIndentedString(rankedSerpElementCheckUrl)).append("\n");
    sb.append("    rankedSerpElementSerpItemTypes: ").append(toIndentedString(rankedSerpElementSerpItemTypes)).append("\n");
    sb.append("    rankedSerpElementSeResultsCount: ").append(toIndentedString(rankedSerpElementSeResultsCount)).append("\n");
    sb.append("    rankedSerpElementLastUpdatedTime: ").append(toIndentedString(rankedSerpElementLastUpdatedTime)).append("\n");
    sb.append("    rankedSerpElementPreviousUpdatedTime: ").append(toIndentedString(rankedSerpElementPreviousUpdatedTime)).append("\n");
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
    
    openapiFields.add("keyword_data.keyword_info.search_volume");
    
    openapiFields.add("ranked_serp_element.serp_item.type");
    
    openapiFields.add("ranked_serp_element.serp_item.rank_group");
    
    openapiFields.add("ranked_serp_element.serp_item.rank_absolute");
    
    openapiFields.add("ranked_serp_element.serp_item.xpath");
    
    openapiFields.add("ranked_serp_element.serp_item.domain");
    
    openapiFields.add("ranked_serp_element.serp_item.title");
    
    openapiFields.add("ranked_serp_element.serp_item.url");
    
    openapiFields.add("ranked_serp_element.serp_item.asin");
    
    openapiFields.add("ranked_serp_element.serp_item.image_url");
    
    openapiFields.add("ranked_serp_element.serp_item.price_from");
    
    openapiFields.add("ranked_serp_element.serp_item.price_to");
    
    openapiFields.add("ranked_serp_element.serp_item.currency");
    
    openapiFields.add("ranked_serp_element.serp_item.is_best_seller");
    
    openapiFields.add("ranked_serp_element.serp_item.is_amazon_choice");
    
    openapiFields.add("ranked_serp_element.serp_item.rating.rating_type");
    
    openapiFields.add("ranked_serp_element.serp_item.rating.value");
    
    openapiFields.add("ranked_serp_element.serp_item.rating.votes_count");
    
    openapiFields.add("ranked_serp_element.serp_item.rating.rating_max");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.delivery_date_from");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.delivery_date_to");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.fastest_delivery_date_from");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.fastest_delivery_date_to");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.delivery_message");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.delivery_price.current");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.delivery_price.regular");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.delivery_price.max_value");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.delivery_price.currency");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.delivery_price.is_price_range");
    
    openapiFields.add("ranked_serp_element.serp_item.delivery_info.delivery_price.displayed_price");
    
    openapiFields.add("ranked_serp_element.check_url");
    
    openapiFields.add("ranked_serp_element.serp_item_types");
    
    openapiFields.add("ranked_serp_element.se_results_count");
    
    openapiFields.add("ranked_serp_element.last_updated_time");
    
    openapiFields.add("ranked_serp_element.previous_updated_time");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsAvailableFiltersAmazonInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsAvailableFiltersAmazonInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsAvailableFiltersAmazonInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsAvailableFiltersAmazonInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsAvailableFiltersAmazonInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsAvailableFiltersAmazonInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsAvailableFiltersAmazonInfo value) throws IOException {
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
           public DataforseoLabsAvailableFiltersAmazonInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsAvailableFiltersAmazonInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsAvailableFiltersAmazonInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsAvailableFiltersAmazonInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
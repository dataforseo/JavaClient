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



public class ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo  {


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD = "keyword_data.keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD)
  private String keywordDataKeyword;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo keywordDataKeyword(String keywordDataKeyword) {
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


  public static final String SERIALIZED_NAME_KEYWORD_DATA.LOCATION_CODE = "keyword_data.location_code";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.LOCATION_CODE)
  private String keywordDataLocationCode;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo keywordDataLocationCode(String keywordDataLocationCode) {
    this.keywordDataLocationCode = keywordDataLocationCode;
    return this;
  }

  /**
   * 
   * @return keywordDataLocationCode
   */
  @javax.annotation.Nullable
  public String getKeywordDataLocationCode() {
    return keywordDataLocationCode;
  }

  public void setKeywordDataLocationCode(String keywordDataLocationCode) {
    this.keywordDataLocationCode = keywordDataLocationCode;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.LANGUAGE_CODE = "keyword_data.language_code";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.LANGUAGE_CODE)
  private String keywordDataLanguageCode;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo keywordDataLanguageCode(String keywordDataLanguageCode) {
    this.keywordDataLanguageCode = keywordDataLanguageCode;
    return this;
  }

  /**
   * 
   * @return keywordDataLanguageCode
   */
  @javax.annotation.Nullable
  public String getKeywordDataLanguageCode() {
    return keywordDataLanguageCode;
  }

  public void setKeywordDataLanguageCode(String keywordDataLanguageCode) {
    this.keywordDataLanguageCode = keywordDataLanguageCode;
  }


  public static final String SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.LAST_UPDATED_TIME = "keyword_data.keyword_info.last_updated_time";
  @SerializedName(SERIALIZED_NAME_KEYWORD_DATA.KEYWORD_INFO.LAST_UPDATED_TIME)
  private String keywordDataKeywordInfoLastUpdatedTime;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo keywordDataKeywordInfoLastUpdatedTime(String keywordDataKeywordInfoLastUpdatedTime) {
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

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo keywordDataKeywordInfoSearchVolume(String keywordDataKeywordInfoSearchVolume) {
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


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.TYPE = "intersection_result.$key.type";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.TYPE)
  private String intersectionResultKeyType;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyType(String intersectionResultKeyType) {
    this.intersectionResultKeyType = intersectionResultKeyType;
    return this;
  }

  /**
   * type of element
   * @return intersectionResultKeyType
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyType() {
    return intersectionResultKeyType;
  }

  public void setIntersectionResultKeyType(String intersectionResultKeyType) {
    this.intersectionResultKeyType = intersectionResultKeyType;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RANK_GROUP = "intersection_result.$key.rank_group";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RANK_GROUP)
  private String intersectionResultKeyRankGroup;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyRankGroup(String intersectionResultKeyRankGroup) {
    this.intersectionResultKeyRankGroup = intersectionResultKeyRankGroup;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyRankGroup
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyRankGroup() {
    return intersectionResultKeyRankGroup;
  }

  public void setIntersectionResultKeyRankGroup(String intersectionResultKeyRankGroup) {
    this.intersectionResultKeyRankGroup = intersectionResultKeyRankGroup;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RANK_ABSOLUTE = "intersection_result.$key.rank_absolute";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RANK_ABSOLUTE)
  private String intersectionResultKeyRankAbsolute;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyRankAbsolute(String intersectionResultKeyRankAbsolute) {
    this.intersectionResultKeyRankAbsolute = intersectionResultKeyRankAbsolute;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyRankAbsolute
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyRankAbsolute() {
    return intersectionResultKeyRankAbsolute;
  }

  public void setIntersectionResultKeyRankAbsolute(String intersectionResultKeyRankAbsolute) {
    this.intersectionResultKeyRankAbsolute = intersectionResultKeyRankAbsolute;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.XPATH = "intersection_result.$key.xpath";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.XPATH)
  private String intersectionResultKeyXpath;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyXpath(String intersectionResultKeyXpath) {
    this.intersectionResultKeyXpath = intersectionResultKeyXpath;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyXpath
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyXpath() {
    return intersectionResultKeyXpath;
  }

  public void setIntersectionResultKeyXpath(String intersectionResultKeyXpath) {
    this.intersectionResultKeyXpath = intersectionResultKeyXpath;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DOMAIN = "intersection_result.$key.domain";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DOMAIN)
  private String intersectionResultKeyDomain;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyDomain(String intersectionResultKeyDomain) {
    this.intersectionResultKeyDomain = intersectionResultKeyDomain;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyDomain
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyDomain() {
    return intersectionResultKeyDomain;
  }

  public void setIntersectionResultKeyDomain(String intersectionResultKeyDomain) {
    this.intersectionResultKeyDomain = intersectionResultKeyDomain;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.TITLE = "intersection_result.$key.title";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.TITLE)
  private String intersectionResultKeyTitle;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyTitle(String intersectionResultKeyTitle) {
    this.intersectionResultKeyTitle = intersectionResultKeyTitle;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyTitle
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyTitle() {
    return intersectionResultKeyTitle;
  }

  public void setIntersectionResultKeyTitle(String intersectionResultKeyTitle) {
    this.intersectionResultKeyTitle = intersectionResultKeyTitle;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.URL = "intersection_result.$key.url";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.URL)
  private String intersectionResultKeyUrl;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyUrl(String intersectionResultKeyUrl) {
    this.intersectionResultKeyUrl = intersectionResultKeyUrl;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyUrl
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyUrl() {
    return intersectionResultKeyUrl;
  }

  public void setIntersectionResultKeyUrl(String intersectionResultKeyUrl) {
    this.intersectionResultKeyUrl = intersectionResultKeyUrl;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.ASIN = "intersection_result.$key.asin";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.ASIN)
  private String intersectionResultKeyAsin;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyAsin(String intersectionResultKeyAsin) {
    this.intersectionResultKeyAsin = intersectionResultKeyAsin;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyAsin
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyAsin() {
    return intersectionResultKeyAsin;
  }

  public void setIntersectionResultKeyAsin(String intersectionResultKeyAsin) {
    this.intersectionResultKeyAsin = intersectionResultKeyAsin;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.IMAGE_URL = "intersection_result.$key.image_url";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.IMAGE_URL)
  private String intersectionResultKeyImageUrl;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyImageUrl(String intersectionResultKeyImageUrl) {
    this.intersectionResultKeyImageUrl = intersectionResultKeyImageUrl;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyImageUrl
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyImageUrl() {
    return intersectionResultKeyImageUrl;
  }

  public void setIntersectionResultKeyImageUrl(String intersectionResultKeyImageUrl) {
    this.intersectionResultKeyImageUrl = intersectionResultKeyImageUrl;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.PRICE_FROM = "intersection_result.$key.price_from";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.PRICE_FROM)
  private String intersectionResultKeyPriceFrom;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyPriceFrom(String intersectionResultKeyPriceFrom) {
    this.intersectionResultKeyPriceFrom = intersectionResultKeyPriceFrom;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyPriceFrom
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyPriceFrom() {
    return intersectionResultKeyPriceFrom;
  }

  public void setIntersectionResultKeyPriceFrom(String intersectionResultKeyPriceFrom) {
    this.intersectionResultKeyPriceFrom = intersectionResultKeyPriceFrom;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.PRICE_TO = "intersection_result.$key.price_to";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.PRICE_TO)
  private String intersectionResultKeyPriceTo;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyPriceTo(String intersectionResultKeyPriceTo) {
    this.intersectionResultKeyPriceTo = intersectionResultKeyPriceTo;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyPriceTo
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyPriceTo() {
    return intersectionResultKeyPriceTo;
  }

  public void setIntersectionResultKeyPriceTo(String intersectionResultKeyPriceTo) {
    this.intersectionResultKeyPriceTo = intersectionResultKeyPriceTo;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.CURRENCY = "intersection_result.$key.currency";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.CURRENCY)
  private String intersectionResultKeyCurrency;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyCurrency(String intersectionResultKeyCurrency) {
    this.intersectionResultKeyCurrency = intersectionResultKeyCurrency;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyCurrency
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyCurrency() {
    return intersectionResultKeyCurrency;
  }

  public void setIntersectionResultKeyCurrency(String intersectionResultKeyCurrency) {
    this.intersectionResultKeyCurrency = intersectionResultKeyCurrency;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.IS_BEST_SELLER = "intersection_result.$key.is_best_seller";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.IS_BEST_SELLER)
  private String intersectionResultKeyIsBestSeller;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyIsBestSeller(String intersectionResultKeyIsBestSeller) {
    this.intersectionResultKeyIsBestSeller = intersectionResultKeyIsBestSeller;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyIsBestSeller
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyIsBestSeller() {
    return intersectionResultKeyIsBestSeller;
  }

  public void setIntersectionResultKeyIsBestSeller(String intersectionResultKeyIsBestSeller) {
    this.intersectionResultKeyIsBestSeller = intersectionResultKeyIsBestSeller;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.IS_AMAZON_CHOICE = "intersection_result.$key.is_amazon_choice";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.IS_AMAZON_CHOICE)
  private String intersectionResultKeyIsAmazonChoice;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyIsAmazonChoice(String intersectionResultKeyIsAmazonChoice) {
    this.intersectionResultKeyIsAmazonChoice = intersectionResultKeyIsAmazonChoice;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyIsAmazonChoice
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyIsAmazonChoice() {
    return intersectionResultKeyIsAmazonChoice;
  }

  public void setIntersectionResultKeyIsAmazonChoice(String intersectionResultKeyIsAmazonChoice) {
    this.intersectionResultKeyIsAmazonChoice = intersectionResultKeyIsAmazonChoice;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RATING.RATING_TYPE = "intersection_result.$key.rating.rating_type";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RATING.RATING_TYPE)
  private String intersectionResultKeyRatingRatingType;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyRatingRatingType(String intersectionResultKeyRatingRatingType) {
    this.intersectionResultKeyRatingRatingType = intersectionResultKeyRatingRatingType;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyRatingRatingType
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyRatingRatingType() {
    return intersectionResultKeyRatingRatingType;
  }

  public void setIntersectionResultKeyRatingRatingType(String intersectionResultKeyRatingRatingType) {
    this.intersectionResultKeyRatingRatingType = intersectionResultKeyRatingRatingType;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RATING.VALUE = "intersection_result.$key.rating.value";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RATING.VALUE)
  private String intersectionResultKeyRatingValue;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyRatingValue(String intersectionResultKeyRatingValue) {
    this.intersectionResultKeyRatingValue = intersectionResultKeyRatingValue;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyRatingValue
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyRatingValue() {
    return intersectionResultKeyRatingValue;
  }

  public void setIntersectionResultKeyRatingValue(String intersectionResultKeyRatingValue) {
    this.intersectionResultKeyRatingValue = intersectionResultKeyRatingValue;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RATING.VOTES_COUNT = "intersection_result.$key.rating.votes_count";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RATING.VOTES_COUNT)
  private String intersectionResultKeyRatingVotesCount;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyRatingVotesCount(String intersectionResultKeyRatingVotesCount) {
    this.intersectionResultKeyRatingVotesCount = intersectionResultKeyRatingVotesCount;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyRatingVotesCount
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyRatingVotesCount() {
    return intersectionResultKeyRatingVotesCount;
  }

  public void setIntersectionResultKeyRatingVotesCount(String intersectionResultKeyRatingVotesCount) {
    this.intersectionResultKeyRatingVotesCount = intersectionResultKeyRatingVotesCount;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RATING.RATING_MAX = "intersection_result.$key.rating.rating_max";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.RATING.RATING_MAX)
  private Integer intersectionResultKeyRatingRatingMax;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyRatingRatingMax(Integer intersectionResultKeyRatingRatingMax) {
    this.intersectionResultKeyRatingRatingMax = intersectionResultKeyRatingRatingMax;
    return this;
  }

  /**
   * the maximum value for a rating_type
   * @return intersectionResultKeyRatingRatingMax
   */
  @javax.annotation.Nullable
  public Integer getIntersectionResultKeyRatingRatingMax() {
    return intersectionResultKeyRatingRatingMax;
  }

  public void setIntersectionResultKeyRatingRatingMax(Integer intersectionResultKeyRatingRatingMax) {
    this.intersectionResultKeyRatingRatingMax = intersectionResultKeyRatingRatingMax;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_MESSAGE = "intersection_result.$key.delivery_info.delivery_message";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_MESSAGE)
  private String intersectionResultKeyDeliveryInfoDeliveryMessage;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyDeliveryInfoDeliveryMessage(String intersectionResultKeyDeliveryInfoDeliveryMessage) {
    this.intersectionResultKeyDeliveryInfoDeliveryMessage = intersectionResultKeyDeliveryInfoDeliveryMessage;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyDeliveryInfoDeliveryMessage
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyDeliveryInfoDeliveryMessage() {
    return intersectionResultKeyDeliveryInfoDeliveryMessage;
  }

  public void setIntersectionResultKeyDeliveryInfoDeliveryMessage(String intersectionResultKeyDeliveryInfoDeliveryMessage) {
    this.intersectionResultKeyDeliveryInfoDeliveryMessage = intersectionResultKeyDeliveryInfoDeliveryMessage;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.CURRENT = "intersection_result.$key.delivery_info.delivery_price.current";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.CURRENT)
  private String intersectionResultKeyDeliveryInfoDeliveryPriceCurrent;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyDeliveryInfoDeliveryPriceCurrent(String intersectionResultKeyDeliveryInfoDeliveryPriceCurrent) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceCurrent = intersectionResultKeyDeliveryInfoDeliveryPriceCurrent;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyDeliveryInfoDeliveryPriceCurrent
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyDeliveryInfoDeliveryPriceCurrent() {
    return intersectionResultKeyDeliveryInfoDeliveryPriceCurrent;
  }

  public void setIntersectionResultKeyDeliveryInfoDeliveryPriceCurrent(String intersectionResultKeyDeliveryInfoDeliveryPriceCurrent) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceCurrent = intersectionResultKeyDeliveryInfoDeliveryPriceCurrent;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.REGULAR = "intersection_result.$key.delivery_info.delivery_price.regular";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.REGULAR)
  private String intersectionResultKeyDeliveryInfoDeliveryPriceRegular;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyDeliveryInfoDeliveryPriceRegular(String intersectionResultKeyDeliveryInfoDeliveryPriceRegular) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceRegular = intersectionResultKeyDeliveryInfoDeliveryPriceRegular;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyDeliveryInfoDeliveryPriceRegular
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyDeliveryInfoDeliveryPriceRegular() {
    return intersectionResultKeyDeliveryInfoDeliveryPriceRegular;
  }

  public void setIntersectionResultKeyDeliveryInfoDeliveryPriceRegular(String intersectionResultKeyDeliveryInfoDeliveryPriceRegular) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceRegular = intersectionResultKeyDeliveryInfoDeliveryPriceRegular;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.MAX_VALUE = "intersection_result.$key.delivery_info.delivery_price.max_value";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.MAX_VALUE)
  private String intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue(String intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue = intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyDeliveryInfoDeliveryPriceMaxValue() {
    return intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue;
  }

  public void setIntersectionResultKeyDeliveryInfoDeliveryPriceMaxValue(String intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue = intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.CURRENCY = "intersection_result.$key.delivery_info.delivery_price.currency";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.CURRENCY)
  private String intersectionResultKeyDeliveryInfoDeliveryPriceCurrency;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyDeliveryInfoDeliveryPriceCurrency(String intersectionResultKeyDeliveryInfoDeliveryPriceCurrency) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceCurrency = intersectionResultKeyDeliveryInfoDeliveryPriceCurrency;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyDeliveryInfoDeliveryPriceCurrency
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyDeliveryInfoDeliveryPriceCurrency() {
    return intersectionResultKeyDeliveryInfoDeliveryPriceCurrency;
  }

  public void setIntersectionResultKeyDeliveryInfoDeliveryPriceCurrency(String intersectionResultKeyDeliveryInfoDeliveryPriceCurrency) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceCurrency = intersectionResultKeyDeliveryInfoDeliveryPriceCurrency;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.IS_PRICE_RANGE = "intersection_result.$key.delivery_info.delivery_price.is_price_range";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.IS_PRICE_RANGE)
  private String intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange(String intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange = intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange() {
    return intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange;
  }

  public void setIntersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange(String intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange = intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.DISPLAYED_PRICE = "intersection_result.$key.delivery_info.delivery_price.displayed_price";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_RESULT.$KEY.DELIVERY_INFO.DELIVERY_PRICE.DISPLAYED_PRICE)
  private String intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice(String intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice = intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice;
    return this;
  }

  /**
   * 
   * @return intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice
   */
  @javax.annotation.Nullable
  public String getIntersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice() {
    return intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice;
  }

  public void setIntersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice(String intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice) {
    this.intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice = intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice;
  }



  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo putAdditionalProperty(String key, Object value) {
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


    
    ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo = (ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo) o;
    return

        Objects.equals(this.keywordDataKeyword, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.keywordDataKeyword) &&
        Objects.equals(this.keywordDataLocationCode, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.keywordDataLocationCode) &&
        Objects.equals(this.keywordDataLanguageCode, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.keywordDataLanguageCode) &&
        Objects.equals(this.keywordDataKeywordInfoLastUpdatedTime, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.keywordDataKeywordInfoLastUpdatedTime) &&
        Objects.equals(this.keywordDataKeywordInfoSearchVolume, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.keywordDataKeywordInfoSearchVolume) &&
        Objects.equals(this.intersectionResultKeyType, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyType) &&
        Objects.equals(this.intersectionResultKeyRankGroup, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyRankGroup) &&
        Objects.equals(this.intersectionResultKeyRankAbsolute, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyRankAbsolute) &&
        Objects.equals(this.intersectionResultKeyXpath, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyXpath) &&
        Objects.equals(this.intersectionResultKeyDomain, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyDomain) &&
        Objects.equals(this.intersectionResultKeyTitle, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyTitle) &&
        Objects.equals(this.intersectionResultKeyUrl, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyUrl) &&
        Objects.equals(this.intersectionResultKeyAsin, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyAsin) &&
        Objects.equals(this.intersectionResultKeyImageUrl, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyImageUrl) &&
        Objects.equals(this.intersectionResultKeyPriceFrom, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyPriceFrom) &&
        Objects.equals(this.intersectionResultKeyPriceTo, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyPriceTo) &&
        Objects.equals(this.intersectionResultKeyCurrency, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyCurrency) &&
        Objects.equals(this.intersectionResultKeyIsBestSeller, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyIsBestSeller) &&
        Objects.equals(this.intersectionResultKeyIsAmazonChoice, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyIsAmazonChoice) &&
        Objects.equals(this.intersectionResultKeyRatingRatingType, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyRatingRatingType) &&
        Objects.equals(this.intersectionResultKeyRatingValue, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyRatingValue) &&
        Objects.equals(this.intersectionResultKeyRatingVotesCount, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyRatingVotesCount) &&
        Objects.equals(this.intersectionResultKeyRatingRatingMax, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyRatingRatingMax) &&
        Objects.equals(this.intersectionResultKeyDeliveryInfoDeliveryMessage, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyDeliveryInfoDeliveryMessage) &&
        Objects.equals(this.intersectionResultKeyDeliveryInfoDeliveryPriceCurrent, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyDeliveryInfoDeliveryPriceCurrent) &&
        Objects.equals(this.intersectionResultKeyDeliveryInfoDeliveryPriceRegular, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyDeliveryInfoDeliveryPriceRegular) &&
        Objects.equals(this.intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue) &&
        Objects.equals(this.intersectionResultKeyDeliveryInfoDeliveryPriceCurrency, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyDeliveryInfoDeliveryPriceCurrency) &&
        Objects.equals(this.intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange) &&
        Objects.equals(this.intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice, productKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keywordDataKeyword, keywordDataLocationCode, keywordDataLanguageCode, keywordDataKeywordInfoLastUpdatedTime, keywordDataKeywordInfoSearchVolume, intersectionResultKeyType, intersectionResultKeyRankGroup, intersectionResultKeyRankAbsolute, intersectionResultKeyXpath, intersectionResultKeyDomain, intersectionResultKeyTitle, intersectionResultKeyUrl, intersectionResultKeyAsin, intersectionResultKeyImageUrl, intersectionResultKeyPriceFrom, intersectionResultKeyPriceTo, intersectionResultKeyCurrency, intersectionResultKeyIsBestSeller, intersectionResultKeyIsAmazonChoice, intersectionResultKeyRatingRatingType, intersectionResultKeyRatingValue, intersectionResultKeyRatingVotesCount, intersectionResultKeyRatingRatingMax, intersectionResultKeyDeliveryInfoDeliveryMessage, intersectionResultKeyDeliveryInfoDeliveryPriceCurrent, intersectionResultKeyDeliveryInfoDeliveryPriceRegular, intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue, intersectionResultKeyDeliveryInfoDeliveryPriceCurrency, intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange, intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice);
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
    sb.append("class ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo {\n");

    sb.append("    keywordDataKeyword: ").append(toIndentedString(keywordDataKeyword)).append("\n");
    sb.append("    keywordDataLocationCode: ").append(toIndentedString(keywordDataLocationCode)).append("\n");
    sb.append("    keywordDataLanguageCode: ").append(toIndentedString(keywordDataLanguageCode)).append("\n");
    sb.append("    keywordDataKeywordInfoLastUpdatedTime: ").append(toIndentedString(keywordDataKeywordInfoLastUpdatedTime)).append("\n");
    sb.append("    keywordDataKeywordInfoSearchVolume: ").append(toIndentedString(keywordDataKeywordInfoSearchVolume)).append("\n");
    sb.append("    intersectionResultKeyType: ").append(toIndentedString(intersectionResultKeyType)).append("\n");
    sb.append("    intersectionResultKeyRankGroup: ").append(toIndentedString(intersectionResultKeyRankGroup)).append("\n");
    sb.append("    intersectionResultKeyRankAbsolute: ").append(toIndentedString(intersectionResultKeyRankAbsolute)).append("\n");
    sb.append("    intersectionResultKeyXpath: ").append(toIndentedString(intersectionResultKeyXpath)).append("\n");
    sb.append("    intersectionResultKeyDomain: ").append(toIndentedString(intersectionResultKeyDomain)).append("\n");
    sb.append("    intersectionResultKeyTitle: ").append(toIndentedString(intersectionResultKeyTitle)).append("\n");
    sb.append("    intersectionResultKeyUrl: ").append(toIndentedString(intersectionResultKeyUrl)).append("\n");
    sb.append("    intersectionResultKeyAsin: ").append(toIndentedString(intersectionResultKeyAsin)).append("\n");
    sb.append("    intersectionResultKeyImageUrl: ").append(toIndentedString(intersectionResultKeyImageUrl)).append("\n");
    sb.append("    intersectionResultKeyPriceFrom: ").append(toIndentedString(intersectionResultKeyPriceFrom)).append("\n");
    sb.append("    intersectionResultKeyPriceTo: ").append(toIndentedString(intersectionResultKeyPriceTo)).append("\n");
    sb.append("    intersectionResultKeyCurrency: ").append(toIndentedString(intersectionResultKeyCurrency)).append("\n");
    sb.append("    intersectionResultKeyIsBestSeller: ").append(toIndentedString(intersectionResultKeyIsBestSeller)).append("\n");
    sb.append("    intersectionResultKeyIsAmazonChoice: ").append(toIndentedString(intersectionResultKeyIsAmazonChoice)).append("\n");
    sb.append("    intersectionResultKeyRatingRatingType: ").append(toIndentedString(intersectionResultKeyRatingRatingType)).append("\n");
    sb.append("    intersectionResultKeyRatingValue: ").append(toIndentedString(intersectionResultKeyRatingValue)).append("\n");
    sb.append("    intersectionResultKeyRatingVotesCount: ").append(toIndentedString(intersectionResultKeyRatingVotesCount)).append("\n");
    sb.append("    intersectionResultKeyRatingRatingMax: ").append(toIndentedString(intersectionResultKeyRatingRatingMax)).append("\n");
    sb.append("    intersectionResultKeyDeliveryInfoDeliveryMessage: ").append(toIndentedString(intersectionResultKeyDeliveryInfoDeliveryMessage)).append("\n");
    sb.append("    intersectionResultKeyDeliveryInfoDeliveryPriceCurrent: ").append(toIndentedString(intersectionResultKeyDeliveryInfoDeliveryPriceCurrent)).append("\n");
    sb.append("    intersectionResultKeyDeliveryInfoDeliveryPriceRegular: ").append(toIndentedString(intersectionResultKeyDeliveryInfoDeliveryPriceRegular)).append("\n");
    sb.append("    intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue: ").append(toIndentedString(intersectionResultKeyDeliveryInfoDeliveryPriceMaxValue)).append("\n");
    sb.append("    intersectionResultKeyDeliveryInfoDeliveryPriceCurrency: ").append(toIndentedString(intersectionResultKeyDeliveryInfoDeliveryPriceCurrency)).append("\n");
    sb.append("    intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange: ").append(toIndentedString(intersectionResultKeyDeliveryInfoDeliveryPriceIsPriceRange)).append("\n");
    sb.append("    intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice: ").append(toIndentedString(intersectionResultKeyDeliveryInfoDeliveryPriceDisplayedPrice)).append("\n");
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
    
    openapiFields.add("keyword_data.location_code");
    
    openapiFields.add("keyword_data.language_code");
    
    openapiFields.add("keyword_data.keyword_info.last_updated_time");
    
    openapiFields.add("keyword_data.keyword_info.search_volume");
    
    openapiFields.add("intersection_result.$key.type");
    
    openapiFields.add("intersection_result.$key.rank_group");
    
    openapiFields.add("intersection_result.$key.rank_absolute");
    
    openapiFields.add("intersection_result.$key.xpath");
    
    openapiFields.add("intersection_result.$key.domain");
    
    openapiFields.add("intersection_result.$key.title");
    
    openapiFields.add("intersection_result.$key.url");
    
    openapiFields.add("intersection_result.$key.asin");
    
    openapiFields.add("intersection_result.$key.image_url");
    
    openapiFields.add("intersection_result.$key.price_from");
    
    openapiFields.add("intersection_result.$key.price_to");
    
    openapiFields.add("intersection_result.$key.currency");
    
    openapiFields.add("intersection_result.$key.is_best_seller");
    
    openapiFields.add("intersection_result.$key.is_amazon_choice");
    
    openapiFields.add("intersection_result.$key.rating.rating_type");
    
    openapiFields.add("intersection_result.$key.rating.value");
    
    openapiFields.add("intersection_result.$key.rating.votes_count");
    
    openapiFields.add("intersection_result.$key.rating.rating_max");
    
    openapiFields.add("intersection_result.$key.delivery_info.delivery_message");
    
    openapiFields.add("intersection_result.$key.delivery_info.delivery_price.current");
    
    openapiFields.add("intersection_result.$key.delivery_info.delivery_price.regular");
    
    openapiFields.add("intersection_result.$key.delivery_info.delivery_price.max_value");
    
    openapiFields.add("intersection_result.$key.delivery_info.delivery_price.currency");
    
    openapiFields.add("intersection_result.$key.delivery_info.delivery_price.is_price_range");
    
    openapiFields.add("intersection_result.$key.delivery_info.delivery_price.displayed_price");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo>() {
           @Override
           public void write(JsonWriter out, ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo value) throws IOException {
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
           public ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductKeywordIntersectionsAmazonDataforseoLabsAvailableFiltersAmazonInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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



public class Info  {


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Info title(String title) {
    this.title = title;
    return this;
  }

  /**
   * 
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public Info description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public Info category(String category) {
    this.category = category;
    return this;
  }

  /**
   * 
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public static final String SERIALIZED_NAME_CATEGORY_IDS = "category_ids";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private String categoryIds;

  public Info categoryIds(String categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  /**
   * 
   * @return categoryIds
   */
  @javax.annotation.Nullable
  public String getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(String categoryIds) {
    this.categoryIds = categoryIds;
  }


  public static final String SERIALIZED_NAME_ADDITIONAL_CATEGORIES = "additional_categories";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_CATEGORIES)
  private String additionalCategories;

  public Info additionalCategories(String additionalCategories) {
    this.additionalCategories = additionalCategories;
    return this;
  }

  /**
   * 
   * @return additionalCategories
   */
  @javax.annotation.Nullable
  public String getAdditionalCategories() {
    return additionalCategories;
  }

  public void setAdditionalCategories(String additionalCategories) {
    this.additionalCategories = additionalCategories;
  }


  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public Info cid(String cid) {
    this.cid = cid;
    return this;
  }

  /**
   * 
   * @return cid
   */
  @javax.annotation.Nullable
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }


  public static final String SERIALIZED_NAME_FEATURE_ID = "feature_id";
  @SerializedName(SERIALIZED_NAME_FEATURE_ID)
  private String featureId;

  public Info featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * 
   * @return featureId
   */
  @javax.annotation.Nullable
  public String getFeatureId() {
    return featureId;
  }

  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }


  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public Info address(String address) {
    this.address = address;
    return this;
  }

  /**
   * 
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public static final String SERIALIZED_NAME_ADDRESS_INFO.BOROUGH = "address_info.borough";
  @SerializedName(SERIALIZED_NAME_ADDRESS_INFO.BOROUGH)
  private String addressInfoBorough;

  public Info addressInfoBorough(String addressInfoBorough) {
    this.addressInfoBorough = addressInfoBorough;
    return this;
  }

  /**
   * 
   * @return addressInfoBorough
   */
  @javax.annotation.Nullable
  public String getAddressInfoBorough() {
    return addressInfoBorough;
  }

  public void setAddressInfoBorough(String addressInfoBorough) {
    this.addressInfoBorough = addressInfoBorough;
  }


  public static final String SERIALIZED_NAME_ADDRESS_INFO.ADDRESS = "address_info.address";
  @SerializedName(SERIALIZED_NAME_ADDRESS_INFO.ADDRESS)
  private String addressInfoAddress;

  public Info addressInfoAddress(String addressInfoAddress) {
    this.addressInfoAddress = addressInfoAddress;
    return this;
  }

  /**
   * 
   * @return addressInfoAddress
   */
  @javax.annotation.Nullable
  public String getAddressInfoAddress() {
    return addressInfoAddress;
  }

  public void setAddressInfoAddress(String addressInfoAddress) {
    this.addressInfoAddress = addressInfoAddress;
  }


  public static final String SERIALIZED_NAME_ADDRESS_INFO.CITY = "address_info.city";
  @SerializedName(SERIALIZED_NAME_ADDRESS_INFO.CITY)
  private String addressInfoCity;

  public Info addressInfoCity(String addressInfoCity) {
    this.addressInfoCity = addressInfoCity;
    return this;
  }

  /**
   * 
   * @return addressInfoCity
   */
  @javax.annotation.Nullable
  public String getAddressInfoCity() {
    return addressInfoCity;
  }

  public void setAddressInfoCity(String addressInfoCity) {
    this.addressInfoCity = addressInfoCity;
  }


  public static final String SERIALIZED_NAME_ADDRESS_INFO.ZIP = "address_info.zip";
  @SerializedName(SERIALIZED_NAME_ADDRESS_INFO.ZIP)
  private String addressInfoZip;

  public Info addressInfoZip(String addressInfoZip) {
    this.addressInfoZip = addressInfoZip;
    return this;
  }

  /**
   * 
   * @return addressInfoZip
   */
  @javax.annotation.Nullable
  public String getAddressInfoZip() {
    return addressInfoZip;
  }

  public void setAddressInfoZip(String addressInfoZip) {
    this.addressInfoZip = addressInfoZip;
  }


  public static final String SERIALIZED_NAME_ADDRESS_INFO.REGION = "address_info.region";
  @SerializedName(SERIALIZED_NAME_ADDRESS_INFO.REGION)
  private String addressInfoRegion;

  public Info addressInfoRegion(String addressInfoRegion) {
    this.addressInfoRegion = addressInfoRegion;
    return this;
  }

  /**
   * 
   * @return addressInfoRegion
   */
  @javax.annotation.Nullable
  public String getAddressInfoRegion() {
    return addressInfoRegion;
  }

  public void setAddressInfoRegion(String addressInfoRegion) {
    this.addressInfoRegion = addressInfoRegion;
  }


  public static final String SERIALIZED_NAME_ADDRESS_INFO.COUNTRY_CODE = "address_info.country_code";
  @SerializedName(SERIALIZED_NAME_ADDRESS_INFO.COUNTRY_CODE)
  private String addressInfoCountryCode;

  public Info addressInfoCountryCode(String addressInfoCountryCode) {
    this.addressInfoCountryCode = addressInfoCountryCode;
    return this;
  }

  /**
   * 
   * @return addressInfoCountryCode
   */
  @javax.annotation.Nullable
  public String getAddressInfoCountryCode() {
    return addressInfoCountryCode;
  }

  public void setAddressInfoCountryCode(String addressInfoCountryCode) {
    this.addressInfoCountryCode = addressInfoCountryCode;
  }


  public static final String SERIALIZED_NAME_PLACE_ID = "place_id";
  @SerializedName(SERIALIZED_NAME_PLACE_ID)
  private String placeId;

  public Info placeId(String placeId) {
    this.placeId = placeId;
    return this;
  }

  /**
   * 
   * @return placeId
   */
  @javax.annotation.Nullable
  public String getPlaceId() {
    return placeId;
  }

  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }


  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public Info phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * 
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public Info url(String url) {
    this.url = url;
    return this;
  }

  /**
   * 
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public Info domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * 
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public Info logo(String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * 
   * @return logo
   */
  @javax.annotation.Nullable
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }


  public static final String SERIALIZED_NAME_MAIN_IMAGE = "main_image";
  @SerializedName(SERIALIZED_NAME_MAIN_IMAGE)
  private String mainImage;

  public Info mainImage(String mainImage) {
    this.mainImage = mainImage;
    return this;
  }

  /**
   * 
   * @return mainImage
   */
  @javax.annotation.Nullable
  public String getMainImage() {
    return mainImage;
  }

  public void setMainImage(String mainImage) {
    this.mainImage = mainImage;
  }


  public static final String SERIALIZED_NAME_TOTAL_PHOTOS = "total_photos";
  @SerializedName(SERIALIZED_NAME_TOTAL_PHOTOS)
  private String totalPhotos;

  public Info totalPhotos(String totalPhotos) {
    this.totalPhotos = totalPhotos;
    return this;
  }

  /**
   * 
   * @return totalPhotos
   */
  @javax.annotation.Nullable
  public String getTotalPhotos() {
    return totalPhotos;
  }

  public void setTotalPhotos(String totalPhotos) {
    this.totalPhotos = totalPhotos;
  }


  public static final String SERIALIZED_NAME_SNIPPET = "snippet";
  @SerializedName(SERIALIZED_NAME_SNIPPET)
  private String snippet;

  public Info snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * 
   * @return snippet
   */
  @javax.annotation.Nullable
  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public Info latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * 
   * @return latitude
   */
  @javax.annotation.Nullable
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public Info longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * 
   * @return longitude
   */
  @javax.annotation.Nullable
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public static final String SERIALIZED_NAME_IS_CLAIMED = "is_claimed";
  @SerializedName(SERIALIZED_NAME_IS_CLAIMED)
  private String isClaimed;

  public Info isClaimed(String isClaimed) {
    this.isClaimed = isClaimed;
    return this;
  }

  /**
   * 
   * @return isClaimed
   */
  @javax.annotation.Nullable
  public String getIsClaimed() {
    return isClaimed;
  }

  public void setIsClaimed(String isClaimed) {
    this.isClaimed = isClaimed;
  }


  public static final String SERIALIZED_NAME_RATING.RATING_TYPE = "rating.rating_type";
  @SerializedName(SERIALIZED_NAME_RATING.RATING_TYPE)
  private String ratingRatingType;

  public Info ratingRatingType(String ratingRatingType) {
    this.ratingRatingType = ratingRatingType;
    return this;
  }

  /**
   * 
   * @return ratingRatingType
   */
  @javax.annotation.Nullable
  public String getRatingRatingType() {
    return ratingRatingType;
  }

  public void setRatingRatingType(String ratingRatingType) {
    this.ratingRatingType = ratingRatingType;
  }


  public static final String SERIALIZED_NAME_RATING.VALUE = "rating.value";
  @SerializedName(SERIALIZED_NAME_RATING.VALUE)
  private String ratingValue;

  public Info ratingValue(String ratingValue) {
    this.ratingValue = ratingValue;
    return this;
  }

  /**
   * 
   * @return ratingValue
   */
  @javax.annotation.Nullable
  public String getRatingValue() {
    return ratingValue;
  }

  public void setRatingValue(String ratingValue) {
    this.ratingValue = ratingValue;
  }


  public static final String SERIALIZED_NAME_RATING.VOTES_COUNT = "rating.votes_count";
  @SerializedName(SERIALIZED_NAME_RATING.VOTES_COUNT)
  private String ratingVotesCount;

  public Info ratingVotesCount(String ratingVotesCount) {
    this.ratingVotesCount = ratingVotesCount;
    return this;
  }

  /**
   * 
   * @return ratingVotesCount
   */
  @javax.annotation.Nullable
  public String getRatingVotesCount() {
    return ratingVotesCount;
  }

  public void setRatingVotesCount(String ratingVotesCount) {
    this.ratingVotesCount = ratingVotesCount;
  }


  public static final String SERIALIZED_NAME_RATING.RATING_MAX = "rating.rating_max";
  @SerializedName(SERIALIZED_NAME_RATING.RATING_MAX)
  private Integer ratingRatingMax;

  public Info ratingRatingMax(Integer ratingRatingMax) {
    this.ratingRatingMax = ratingRatingMax;
    return this;
  }

  /**
   * the maximum value for a rating_type
   * @return ratingRatingMax
   */
  @javax.annotation.Nullable
  public Integer getRatingRatingMax() {
    return ratingRatingMax;
  }

  public void setRatingRatingMax(Integer ratingRatingMax) {
    this.ratingRatingMax = ratingRatingMax;
  }


  public static final String SERIALIZED_NAME_RATING_DISTRIBUTION.1 = "rating_distribution.1";
  @SerializedName(SERIALIZED_NAME_RATING_DISTRIBUTION.1)
  private String ratingDistribution1;

  public Info ratingDistribution1(String ratingDistribution1) {
    this.ratingDistribution1 = ratingDistribution1;
    return this;
  }

  /**
   * 
   * @return ratingDistribution1
   */
  @javax.annotation.Nullable
  public String getRatingDistribution1() {
    return ratingDistribution1;
  }

  public void setRatingDistribution1(String ratingDistribution1) {
    this.ratingDistribution1 = ratingDistribution1;
  }


  public static final String SERIALIZED_NAME_RATING_DISTRIBUTION.2 = "rating_distribution.2";
  @SerializedName(SERIALIZED_NAME_RATING_DISTRIBUTION.2)
  private String ratingDistribution2;

  public Info ratingDistribution2(String ratingDistribution2) {
    this.ratingDistribution2 = ratingDistribution2;
    return this;
  }

  /**
   * 
   * @return ratingDistribution2
   */
  @javax.annotation.Nullable
  public String getRatingDistribution2() {
    return ratingDistribution2;
  }

  public void setRatingDistribution2(String ratingDistribution2) {
    this.ratingDistribution2 = ratingDistribution2;
  }


  public static final String SERIALIZED_NAME_RATING_DISTRIBUTION.3 = "rating_distribution.3";
  @SerializedName(SERIALIZED_NAME_RATING_DISTRIBUTION.3)
  private String ratingDistribution3;

  public Info ratingDistribution3(String ratingDistribution3) {
    this.ratingDistribution3 = ratingDistribution3;
    return this;
  }

  /**
   * 
   * @return ratingDistribution3
   */
  @javax.annotation.Nullable
  public String getRatingDistribution3() {
    return ratingDistribution3;
  }

  public void setRatingDistribution3(String ratingDistribution3) {
    this.ratingDistribution3 = ratingDistribution3;
  }


  public static final String SERIALIZED_NAME_RATING_DISTRIBUTION.4 = "rating_distribution.4";
  @SerializedName(SERIALIZED_NAME_RATING_DISTRIBUTION.4)
  private String ratingDistribution4;

  public Info ratingDistribution4(String ratingDistribution4) {
    this.ratingDistribution4 = ratingDistribution4;
    return this;
  }

  /**
   * 
   * @return ratingDistribution4
   */
  @javax.annotation.Nullable
  public String getRatingDistribution4() {
    return ratingDistribution4;
  }

  public void setRatingDistribution4(String ratingDistribution4) {
    this.ratingDistribution4 = ratingDistribution4;
  }


  public static final String SERIALIZED_NAME_RATING_DISTRIBUTION.5 = "rating_distribution.5";
  @SerializedName(SERIALIZED_NAME_RATING_DISTRIBUTION.5)
  private String ratingDistribution5;

  public Info ratingDistribution5(String ratingDistribution5) {
    this.ratingDistribution5 = ratingDistribution5;
    return this;
  }

  /**
   * 
   * @return ratingDistribution5
   */
  @javax.annotation.Nullable
  public String getRatingDistribution5() {
    return ratingDistribution5;
  }

  public void setRatingDistribution5(String ratingDistribution5) {
    this.ratingDistribution5 = ratingDistribution5;
  }


  public static final String SERIALIZED_NAME_WORK_TIME.WORK_HOURS.CURRENT_STATUS = "work_time.work_hours.current_status";
  @SerializedName(SERIALIZED_NAME_WORK_TIME.WORK_HOURS.CURRENT_STATUS)
  private String workTimeWorkHoursCurrentStatus;

  public Info workTimeWorkHoursCurrentStatus(String workTimeWorkHoursCurrentStatus) {
    this.workTimeWorkHoursCurrentStatus = workTimeWorkHoursCurrentStatus;
    return this;
  }

  /**
   * 
   * @return workTimeWorkHoursCurrentStatus
   */
  @javax.annotation.Nullable
  public String getWorkTimeWorkHoursCurrentStatus() {
    return workTimeWorkHoursCurrentStatus;
  }

  public void setWorkTimeWorkHoursCurrentStatus(String workTimeWorkHoursCurrentStatus) {
    this.workTimeWorkHoursCurrentStatus = workTimeWorkHoursCurrentStatus;
  }


  public static final String SERIALIZED_NAME_CHECK_URL = "check_url";
  @SerializedName(SERIALIZED_NAME_CHECK_URL)
  private String checkUrl;

  public Info checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * 
   * @return checkUrl
   */
  @javax.annotation.Nullable
  public String getCheckUrl() {
    return checkUrl;
  }

  public void setCheckUrl(String checkUrl) {
    this.checkUrl = checkUrl;
  }


  public static final String SERIALIZED_NAME_LAST_UPDATED_TIME = "last_updated_time";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_TIME)
  private String lastUpdatedTime;

  public Info lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * 
   * @return lastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_PRICE_LEVEL = "price_level";
  @SerializedName(SERIALIZED_NAME_PRICE_LEVEL)
  private String priceLevel;

  public Info priceLevel(String priceLevel) {
    this.priceLevel = priceLevel;
    return this;
  }

  /**
   * 
   * @return priceLevel
   */
  @javax.annotation.Nullable
  public String getPriceLevel() {
    return priceLevel;
  }

  public void setPriceLevel(String priceLevel) {
    this.priceLevel = priceLevel;
  }


  public static final String SERIALIZED_NAME_HOTEL_RATING = "hotel_rating";
  @SerializedName(SERIALIZED_NAME_HOTEL_RATING)
  private String hotelRating;

  public Info hotelRating(String hotelRating) {
    this.hotelRating = hotelRating;
    return this;
  }

  /**
   * 
   * @return hotelRating
   */
  @javax.annotation.Nullable
  public String getHotelRating() {
    return hotelRating;
  }

  public void setHotelRating(String hotelRating) {
    this.hotelRating = hotelRating;
  }


  public static final String SERIALIZED_NAME_CONTACT_INFO.TYPE = "contact_info.type";
  @SerializedName(SERIALIZED_NAME_CONTACT_INFO.TYPE)
  private String contactInfoType;

  public Info contactInfoType(String contactInfoType) {
    this.contactInfoType = contactInfoType;
    return this;
  }

  /**
   * type of element
   * @return contactInfoType
   */
  @javax.annotation.Nullable
  public String getContactInfoType() {
    return contactInfoType;
  }

  public void setContactInfoType(String contactInfoType) {
    this.contactInfoType = contactInfoType;
  }


  public static final String SERIALIZED_NAME_FIRST_SEEN = "first_seen";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN)
  private String firstSeen;

  public Info firstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

  /**
   * 
   * @return firstSeen
   */
  @javax.annotation.Nullable
  public String getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
  }



  public Info() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public Info putAdditionalProperty(String key, Object value) {
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


    
    Info info = (Info) o;
    return

        Objects.equals(this.title, info.title) &&
        Objects.equals(this.description, info.description) &&
        Objects.equals(this.category, info.category) &&
        Objects.equals(this.categoryIds, info.categoryIds) &&
        Objects.equals(this.additionalCategories, info.additionalCategories) &&
        Objects.equals(this.cid, info.cid) &&
        Objects.equals(this.featureId, info.featureId) &&
        Objects.equals(this.address, info.address) &&
        Objects.equals(this.addressInfoBorough, info.addressInfoBorough) &&
        Objects.equals(this.addressInfoAddress, info.addressInfoAddress) &&
        Objects.equals(this.addressInfoCity, info.addressInfoCity) &&
        Objects.equals(this.addressInfoZip, info.addressInfoZip) &&
        Objects.equals(this.addressInfoRegion, info.addressInfoRegion) &&
        Objects.equals(this.addressInfoCountryCode, info.addressInfoCountryCode) &&
        Objects.equals(this.placeId, info.placeId) &&
        Objects.equals(this.phone, info.phone) &&
        Objects.equals(this.url, info.url) &&
        Objects.equals(this.domain, info.domain) &&
        Objects.equals(this.logo, info.logo) &&
        Objects.equals(this.mainImage, info.mainImage) &&
        Objects.equals(this.totalPhotos, info.totalPhotos) &&
        Objects.equals(this.snippet, info.snippet) &&
        Objects.equals(this.latitude, info.latitude) &&
        Objects.equals(this.longitude, info.longitude) &&
        Objects.equals(this.isClaimed, info.isClaimed) &&
        Objects.equals(this.ratingRatingType, info.ratingRatingType) &&
        Objects.equals(this.ratingValue, info.ratingValue) &&
        Objects.equals(this.ratingVotesCount, info.ratingVotesCount) &&
        Objects.equals(this.ratingRatingMax, info.ratingRatingMax) &&
        Objects.equals(this.ratingDistribution1, info.ratingDistribution1) &&
        Objects.equals(this.ratingDistribution2, info.ratingDistribution2) &&
        Objects.equals(this.ratingDistribution3, info.ratingDistribution3) &&
        Objects.equals(this.ratingDistribution4, info.ratingDistribution4) &&
        Objects.equals(this.ratingDistribution5, info.ratingDistribution5) &&
        Objects.equals(this.workTimeWorkHoursCurrentStatus, info.workTimeWorkHoursCurrentStatus) &&
        Objects.equals(this.checkUrl, info.checkUrl) &&
        Objects.equals(this.lastUpdatedTime, info.lastUpdatedTime) &&
        Objects.equals(this.priceLevel, info.priceLevel) &&
        Objects.equals(this.hotelRating, info.hotelRating) &&
        Objects.equals(this.contactInfoType, info.contactInfoType) &&
        Objects.equals(this.firstSeen, info.firstSeen);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(title, description, category, categoryIds, additionalCategories, cid, featureId, address, addressInfoBorough, addressInfoAddress, addressInfoCity, addressInfoZip, addressInfoRegion, addressInfoCountryCode, placeId, phone, url, domain, logo, mainImage, totalPhotos, snippet, latitude, longitude, isClaimed, ratingRatingType, ratingValue, ratingVotesCount, ratingRatingMax, ratingDistribution1, ratingDistribution2, ratingDistribution3, ratingDistribution4, ratingDistribution5, workTimeWorkHoursCurrentStatus, checkUrl, lastUpdatedTime, priceLevel, hotelRating, contactInfoType, firstSeen);
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
    sb.append("class Info {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    additionalCategories: ").append(toIndentedString(additionalCategories)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressInfoBorough: ").append(toIndentedString(addressInfoBorough)).append("\n");
    sb.append("    addressInfoAddress: ").append(toIndentedString(addressInfoAddress)).append("\n");
    sb.append("    addressInfoCity: ").append(toIndentedString(addressInfoCity)).append("\n");
    sb.append("    addressInfoZip: ").append(toIndentedString(addressInfoZip)).append("\n");
    sb.append("    addressInfoRegion: ").append(toIndentedString(addressInfoRegion)).append("\n");
    sb.append("    addressInfoCountryCode: ").append(toIndentedString(addressInfoCountryCode)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    mainImage: ").append(toIndentedString(mainImage)).append("\n");
    sb.append("    totalPhotos: ").append(toIndentedString(totalPhotos)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    isClaimed: ").append(toIndentedString(isClaimed)).append("\n");
    sb.append("    ratingRatingType: ").append(toIndentedString(ratingRatingType)).append("\n");
    sb.append("    ratingValue: ").append(toIndentedString(ratingValue)).append("\n");
    sb.append("    ratingVotesCount: ").append(toIndentedString(ratingVotesCount)).append("\n");
    sb.append("    ratingRatingMax: ").append(toIndentedString(ratingRatingMax)).append("\n");
    sb.append("    ratingDistribution1: ").append(toIndentedString(ratingDistribution1)).append("\n");
    sb.append("    ratingDistribution2: ").append(toIndentedString(ratingDistribution2)).append("\n");
    sb.append("    ratingDistribution3: ").append(toIndentedString(ratingDistribution3)).append("\n");
    sb.append("    ratingDistribution4: ").append(toIndentedString(ratingDistribution4)).append("\n");
    sb.append("    ratingDistribution5: ").append(toIndentedString(ratingDistribution5)).append("\n");
    sb.append("    workTimeWorkHoursCurrentStatus: ").append(toIndentedString(workTimeWorkHoursCurrentStatus)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    priceLevel: ").append(toIndentedString(priceLevel)).append("\n");
    sb.append("    hotelRating: ").append(toIndentedString(hotelRating)).append("\n");
    sb.append("    contactInfoType: ").append(toIndentedString(contactInfoType)).append("\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
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
    
    openapiFields.add("title");
    
    openapiFields.add("description");
    
    openapiFields.add("category");
    
    openapiFields.add("category_ids");
    
    openapiFields.add("additional_categories");
    
    openapiFields.add("cid");
    
    openapiFields.add("feature_id");
    
    openapiFields.add("address");
    
    openapiFields.add("address_info.borough");
    
    openapiFields.add("address_info.address");
    
    openapiFields.add("address_info.city");
    
    openapiFields.add("address_info.zip");
    
    openapiFields.add("address_info.region");
    
    openapiFields.add("address_info.country_code");
    
    openapiFields.add("place_id");
    
    openapiFields.add("phone");
    
    openapiFields.add("url");
    
    openapiFields.add("domain");
    
    openapiFields.add("logo");
    
    openapiFields.add("main_image");
    
    openapiFields.add("total_photos");
    
    openapiFields.add("snippet");
    
    openapiFields.add("latitude");
    
    openapiFields.add("longitude");
    
    openapiFields.add("is_claimed");
    
    openapiFields.add("rating.rating_type");
    
    openapiFields.add("rating.value");
    
    openapiFields.add("rating.votes_count");
    
    openapiFields.add("rating.rating_max");
    
    openapiFields.add("rating_distribution.1");
    
    openapiFields.add("rating_distribution.2");
    
    openapiFields.add("rating_distribution.3");
    
    openapiFields.add("rating_distribution.4");
    
    openapiFields.add("rating_distribution.5");
    
    openapiFields.add("work_time.work_hours.current_status");
    
    openapiFields.add("check_url");
    
    openapiFields.add("last_updated_time");
    
    openapiFields.add("price_level");
    
    openapiFields.add("hotel_rating");
    
    openapiFields.add("contact_info.type");
    
    openapiFields.add("first_seen");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Info
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Info.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Info' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Info> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Info.class));

       return (TypeAdapter<T>) new TypeAdapter<Info>() {
           @Override
           public void write(JsonWriter out, Info value) throws IOException {
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
           public Info read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Info instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static Info fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Info.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
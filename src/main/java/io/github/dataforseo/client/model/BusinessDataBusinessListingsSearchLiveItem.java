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



public class BusinessDataBusinessListingsSearchLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BusinessDataBusinessListingsSearchLiveItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of element
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public BusinessDataBusinessListingsSearchLiveItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the element in SERP
* the name of the business entity for which the results are collected
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_ORIGINAL_TITLE = "original_title";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_TITLE)
  private String originalTitle;

  public BusinessDataBusinessListingsSearchLiveItem originalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
    return this;
  }

  /**
   * original title of the element
* original title not translated by Google
   * @return originalTitle
   */
  @javax.annotation.Nullable
  public String getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public BusinessDataBusinessListingsSearchLiveItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the element in SERP
* the description of the business entity for which the results are collected
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

  public BusinessDataBusinessListingsSearchLiveItem category(String category) {
    this.category = category;
    return this;
  }

  /**
   * business category
* Google My Business general category that best describes the services provided by the business entity
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
  private List<String> categoryIds;

  public BusinessDataBusinessListingsSearchLiveItem categoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  /**
   * global category IDs
* universal category IDs that do not change based on the selected country
   * @return categoryIds
   */
  @javax.annotation.Nullable
  public List<String> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
  }


  public static final String SERIALIZED_NAME_ADDITIONAL_CATEGORIES = "additional_categories";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_CATEGORIES)
  private List<String> additionalCategories;

  public BusinessDataBusinessListingsSearchLiveItem additionalCategories(List<String> additionalCategories) {
    this.additionalCategories = additionalCategories;
    return this;
  }

  /**
   * additional business categories
* additional Google My Business categories that describe the services provided by the business entity in more detail
   * @return additionalCategories
   */
  @javax.annotation.Nullable
  public List<String> getAdditionalCategories() {
    return additionalCategories;
  }

  public void setAdditionalCategories(List<String> additionalCategories) {
    this.additionalCategories = additionalCategories;
  }


  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public BusinessDataBusinessListingsSearchLiveItem cid(String cid) {
    this.cid = cid;
    return this;
  }

  /**
   * google-defined client id
* unique id of a local establishment
* learn more about the identifier in this help center article
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

  public BusinessDataBusinessListingsSearchLiveItem featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * the unique identifier of the element in SERP
* learn more about the identifier in this help center article
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

  public BusinessDataBusinessListingsSearchLiveItem address(String address) {
    this.address = address;
    return this;
  }

  /**
   * address of the business entity
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public static final String SERIALIZED_NAME_ADDRESS_INFO = "address_info";
  @SerializedName(SERIALIZED_NAME_ADDRESS_INFO)
  private AddressInfo addressInfo;

  public BusinessDataBusinessListingsSearchLiveItem addressInfo(AddressInfo addressInfo) {
    this.addressInfo = addressInfo;
    return this;
  }

  /**
   * object containing address components of the business entity
   * @return addressInfo
   */
  @javax.annotation.Nullable
  public AddressInfo getAddressInfo() {
    return addressInfo;
  }

  public void setAddressInfo(AddressInfo addressInfo) {
    this.addressInfo = addressInfo;
  }


  public static final String SERIALIZED_NAME_PLACE_ID = "place_id";
  @SerializedName(SERIALIZED_NAME_PLACE_ID)
  private String placeId;

  public BusinessDataBusinessListingsSearchLiveItem placeId(String placeId) {
    this.placeId = placeId;
    return this;
  }

  /**
   * unique place identifier
* place id of the local establishment featured in the element
* learn more about the identifier in this help center article
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

  public BusinessDataBusinessListingsSearchLiveItem phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * phone number of the business entity
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

  public BusinessDataBusinessListingsSearchLiveItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * absolute url of the business entity
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

  public BusinessDataBusinessListingsSearchLiveItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain of the business entity
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

  public BusinessDataBusinessListingsSearchLiveItem logo(String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * URL of the logo featured in Google My Business profile
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

  public BusinessDataBusinessListingsSearchLiveItem mainImage(String mainImage) {
    this.mainImage = mainImage;
    return this;
  }

  /**
   * URL of the main image featured in Google My Business profile
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
  private Long totalPhotos;

  public BusinessDataBusinessListingsSearchLiveItem totalPhotos(Long totalPhotos) {
    this.totalPhotos = totalPhotos;
    return this;
  }

  /**
   * total count of images featured in Google My Business profile
   * @return totalPhotos
   */
  @javax.annotation.Nullable
  public Long getTotalPhotos() {
    return totalPhotos;
  }

  public void setTotalPhotos(Long totalPhotos) {
    this.totalPhotos = totalPhotos;
  }


  public static final String SERIALIZED_NAME_SNIPPET = "snippet";
  @SerializedName(SERIALIZED_NAME_SNIPPET)
  private String snippet;

  public BusinessDataBusinessListingsSearchLiveItem snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * additional information on the business entity
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
  private Double latitude;

  public BusinessDataBusinessListingsSearchLiveItem latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * latitude coordinate of the local establishments in google maps
* example:
* 'latitude': 51.584091
   * @return latitude
   */
  @javax.annotation.Nullable
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public BusinessDataBusinessListingsSearchLiveItem longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * longitude coordinate of the local establishment in google maps
* example:
* 'longitude': -0.31365919999999997
   * @return longitude
   */
  @javax.annotation.Nullable
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public static final String SERIALIZED_NAME_IS_CLAIMED = "is_claimed";
  @SerializedName(SERIALIZED_NAME_IS_CLAIMED)
  private Boolean isClaimed;

  public BusinessDataBusinessListingsSearchLiveItem isClaimed(Boolean isClaimed) {
    this.isClaimed = isClaimed;
    return this;
  }

  /**
   * shows whether the entity is verified by its owner on Google Maps
   * @return isClaimed
   */
  @javax.annotation.Nullable
  public Boolean getIsClaimed() {
    return isClaimed;
  }

  public void setIsClaimed(Boolean isClaimed) {
    this.isClaimed = isClaimed;
  }


  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private BusinessDataAttributesInfo attributes;

  public BusinessDataBusinessListingsSearchLiveItem attributes(BusinessDataAttributesInfo attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * service details in a form of user-reviewed checks;
* service details of a business entity displayed in a form of checks and based on user feedback and business category
   * @return attributes
   */
  @javax.annotation.Nullable
  public BusinessDataAttributesInfo getAttributes() {
    return attributes;
  }

  public void setAttributes(BusinessDataAttributesInfo attributes) {
    this.attributes = attributes;
  }


  public static final String SERIALIZED_NAME_PLACE_TOPICS = "place_topics";
  @SerializedName(SERIALIZED_NAME_PLACE_TOPICS)
  private Map<String, Long> placeTopics;

  public BusinessDataBusinessListingsSearchLiveItem placeTopics(Map<String, Long> placeTopics) {
    this.placeTopics = placeTopics;
    return this;
  }

  /**
   * keywords mentioned in customer reviews
* contains most popular keywords related to products/services mentioned in customer reviews of a business entity and the number of reviews mentioning each keyword
* example: 
* 'place_topics': {
* 'egg roll': 48,
* 'birthday': 33
* }
   * @return placeTopics
   */
  @javax.annotation.Nullable
  public Map<String, Long> getPlaceTopics() {
    return placeTopics;
  }

  public void setPlaceTopics(Map<String, Long> placeTopics) {
    this.placeTopics = placeTopics;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public BusinessDataBusinessListingsSearchLiveItem rating(RatingInfo rating) {
    this.rating = rating;
    return this;
  }

  /**
   * the element’s rating 
* the popularity rate based on reviews and displayed in SERP
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingInfo getRating() {
    return rating;
  }

  public void setRating(RatingInfo rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_HOTEL_RATING = "hotel_rating";
  @SerializedName(SERIALIZED_NAME_HOTEL_RATING)
  private Integer hotelRating;

  public BusinessDataBusinessListingsSearchLiveItem hotelRating(Integer hotelRating) {
    this.hotelRating = hotelRating;
    return this;
  }

  /**
   * hotel class rating
* class ratings range between 1-5 stars, learn more
* if there is no hotel class rating information, the value will be null
   * @return hotelRating
   */
  @javax.annotation.Nullable
  public Integer getHotelRating() {
    return hotelRating;
  }

  public void setHotelRating(Integer hotelRating) {
    this.hotelRating = hotelRating;
  }


  public static final String SERIALIZED_NAME_PRICE_LEVEL = "price_level";
  @SerializedName(SERIALIZED_NAME_PRICE_LEVEL)
  private String priceLevel;

  public BusinessDataBusinessListingsSearchLiveItem priceLevel(String priceLevel) {
    this.priceLevel = priceLevel;
    return this;
  }

  /**
   * property price level
* can take values: inexpensive, moderate, expensive, very_expensive
* if there is no price level information, the value will be null
   * @return priceLevel
   */
  @javax.annotation.Nullable
  public String getPriceLevel() {
    return priceLevel;
  }

  public void setPriceLevel(String priceLevel) {
    this.priceLevel = priceLevel;
  }


  public static final String SERIALIZED_NAME_RATING_DISTRIBUTION = "rating_distribution";
  @SerializedName(SERIALIZED_NAME_RATING_DISTRIBUTION)
  private Map<String, Integer> ratingDistribution;

  public BusinessDataBusinessListingsSearchLiveItem ratingDistribution(Map<String, Integer> ratingDistribution) {
    this.ratingDistribution = ratingDistribution;
    return this;
  }

  /**
   * the distribution of ratings of the business entity
* the object displays the number of 1-star to 5-star ratings, as reviewed by users
   * @return ratingDistribution
   */
  @javax.annotation.Nullable
  public Map<String, Integer> getRatingDistribution() {
    return ratingDistribution;
  }

  public void setRatingDistribution(Map<String, Integer> ratingDistribution) {
    this.ratingDistribution = ratingDistribution;
  }


  public static final String SERIALIZED_NAME_PEOPLE_ALSO_SEARCH = "people_also_search";
  @SerializedName(SERIALIZED_NAME_PEOPLE_ALSO_SEARCH)
  private List<PeopleAlsoSearch> peopleAlsoSearch;

  public BusinessDataBusinessListingsSearchLiveItem peopleAlsoSearch(List<PeopleAlsoSearch> peopleAlsoSearch) {
    this.peopleAlsoSearch = peopleAlsoSearch;
    return this;
  }

  /**
   * related business entities
   * @return peopleAlsoSearch
   */
  @javax.annotation.Nullable
  public List<PeopleAlsoSearch> getPeopleAlsoSearch() {
    return peopleAlsoSearch;
  }

  public void setPeopleAlsoSearch(List<PeopleAlsoSearch> peopleAlsoSearch) {
    this.peopleAlsoSearch = peopleAlsoSearch;
  }


  public static final String SERIALIZED_NAME_WORK_TIME = "work_time";
  @SerializedName(SERIALIZED_NAME_WORK_TIME)
  private BusinessWorkHoursInfo workTime;

  public BusinessDataBusinessListingsSearchLiveItem workTime(BusinessWorkHoursInfo workTime) {
    this.workTime = workTime;
    return this;
  }

  /**
   * work time details
* information related to operational hours of the business entity
   * @return workTime
   */
  @javax.annotation.Nullable
  public BusinessWorkHoursInfo getWorkTime() {
    return workTime;
  }

  public void setWorkTime(BusinessWorkHoursInfo workTime) {
    this.workTime = workTime;
  }


  public static final String SERIALIZED_NAME_POPULAR_TIMES = "popular_times";
  @SerializedName(SERIALIZED_NAME_POPULAR_TIMES)
  private PopularTimes popularTimes;

  public BusinessDataBusinessListingsSearchLiveItem popularTimes(PopularTimes popularTimes) {
    this.popularTimes = popularTimes;
    return this;
  }

  /**
   * popular times
* information related to busy hours of the business entity
   * @return popularTimes
   */
  @javax.annotation.Nullable
  public PopularTimes getPopularTimes() {
    return popularTimes;
  }

  public void setPopularTimes(PopularTimes popularTimes) {
    this.popularTimes = popularTimes;
  }


  public static final String SERIALIZED_NAME_LOCAL_BUSINESS_LINKS = "local_business_links";
  @SerializedName(SERIALIZED_NAME_LOCAL_BUSINESS_LINKS)
  private List<BaseLocalBusinessLink> localBusinessLinks;

  public BusinessDataBusinessListingsSearchLiveItem localBusinessLinks(List<BaseLocalBusinessLink> localBusinessLinks) {
    this.localBusinessLinks = localBusinessLinks;
    return this;
  }

  /**
   * available interactions with the business
* list of options to interact with the business directly from search results
   * @return localBusinessLinks
   */
  @javax.annotation.Nullable
  public List<BaseLocalBusinessLink> getLocalBusinessLinks() {
    return localBusinessLinks;
  }

  public void setLocalBusinessLinks(List<BaseLocalBusinessLink> localBusinessLinks) {
    this.localBusinessLinks = localBusinessLinks;
  }


  public static final String SERIALIZED_NAME_CONTACT_INFO = "contact_info";
  @SerializedName(SERIALIZED_NAME_CONTACT_INFO)
  private List<BusinessDataContactInfo> contactInfo;

  public BusinessDataBusinessListingsSearchLiveItem contactInfo(List<BusinessDataContactInfo> contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  /**
   * available contacts of the business
* list of contacts to interact with the business
   * @return contactInfo
   */
  @javax.annotation.Nullable
  public List<BusinessDataContactInfo> getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(List<BusinessDataContactInfo> contactInfo) {
    this.contactInfo = contactInfo;
  }


  public static final String SERIALIZED_NAME_CHECK_URL = "check_url";
  @SerializedName(SERIALIZED_NAME_CHECK_URL)
  private String checkUrl;

  public BusinessDataBusinessListingsSearchLiveItem checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * direct URL to search engine results
* you can use it to make sure that we provided accurate results
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

  public BusinessDataBusinessListingsSearchLiveItem lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * date and time when the data was last updated
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2023-01-26 09:03:15 +00:00
   * @return lastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }


  public static final String SERIALIZED_NAME_FIRST_SEEN = "first_seen";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN)
  private String firstSeen;

  public BusinessDataBusinessListingsSearchLiveItem firstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

  /**
   * date and time when our crawler found the business listing element for the first time
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2023-03-11 10:04:11 +00:00
   * @return firstSeen
   */
  @javax.annotation.Nullable
  public String getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
  }



  public BusinessDataBusinessListingsSearchLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BusinessDataBusinessListingsSearchLiveItem putAdditionalProperty(String key, Object value) {
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


    
    BusinessDataBusinessListingsSearchLiveItem businessDataBusinessListingsSearchLiveItem = (BusinessDataBusinessListingsSearchLiveItem) o;
    return

        Objects.equals(this.type, businessDataBusinessListingsSearchLiveItem.type) &&
        Objects.equals(this.title, businessDataBusinessListingsSearchLiveItem.title) &&
        Objects.equals(this.originalTitle, businessDataBusinessListingsSearchLiveItem.originalTitle) &&
        Objects.equals(this.description, businessDataBusinessListingsSearchLiveItem.description) &&
        Objects.equals(this.category, businessDataBusinessListingsSearchLiveItem.category) &&
        Objects.equals(this.categoryIds, businessDataBusinessListingsSearchLiveItem.categoryIds) &&
        Objects.equals(this.additionalCategories, businessDataBusinessListingsSearchLiveItem.additionalCategories) &&
        Objects.equals(this.cid, businessDataBusinessListingsSearchLiveItem.cid) &&
        Objects.equals(this.featureId, businessDataBusinessListingsSearchLiveItem.featureId) &&
        Objects.equals(this.address, businessDataBusinessListingsSearchLiveItem.address) &&
        Objects.equals(this.addressInfo, businessDataBusinessListingsSearchLiveItem.addressInfo) &&
        Objects.equals(this.placeId, businessDataBusinessListingsSearchLiveItem.placeId) &&
        Objects.equals(this.phone, businessDataBusinessListingsSearchLiveItem.phone) &&
        Objects.equals(this.url, businessDataBusinessListingsSearchLiveItem.url) &&
        Objects.equals(this.domain, businessDataBusinessListingsSearchLiveItem.domain) &&
        Objects.equals(this.logo, businessDataBusinessListingsSearchLiveItem.logo) &&
        Objects.equals(this.mainImage, businessDataBusinessListingsSearchLiveItem.mainImage) &&
        Objects.equals(this.totalPhotos, businessDataBusinessListingsSearchLiveItem.totalPhotos) &&
        Objects.equals(this.snippet, businessDataBusinessListingsSearchLiveItem.snippet) &&
        Objects.equals(this.latitude, businessDataBusinessListingsSearchLiveItem.latitude) &&
        Objects.equals(this.longitude, businessDataBusinessListingsSearchLiveItem.longitude) &&
        Objects.equals(this.isClaimed, businessDataBusinessListingsSearchLiveItem.isClaimed) &&
        Objects.equals(this.attributes, businessDataBusinessListingsSearchLiveItem.attributes) &&
        Objects.equals(this.placeTopics, businessDataBusinessListingsSearchLiveItem.placeTopics) &&
        Objects.equals(this.rating, businessDataBusinessListingsSearchLiveItem.rating) &&
        Objects.equals(this.hotelRating, businessDataBusinessListingsSearchLiveItem.hotelRating) &&
        Objects.equals(this.priceLevel, businessDataBusinessListingsSearchLiveItem.priceLevel) &&
        Objects.equals(this.ratingDistribution, businessDataBusinessListingsSearchLiveItem.ratingDistribution) &&
        Objects.equals(this.peopleAlsoSearch, businessDataBusinessListingsSearchLiveItem.peopleAlsoSearch) &&
        Objects.equals(this.workTime, businessDataBusinessListingsSearchLiveItem.workTime) &&
        Objects.equals(this.popularTimes, businessDataBusinessListingsSearchLiveItem.popularTimes) &&
        Objects.equals(this.localBusinessLinks, businessDataBusinessListingsSearchLiveItem.localBusinessLinks) &&
        Objects.equals(this.contactInfo, businessDataBusinessListingsSearchLiveItem.contactInfo) &&
        Objects.equals(this.checkUrl, businessDataBusinessListingsSearchLiveItem.checkUrl) &&
        Objects.equals(this.lastUpdatedTime, businessDataBusinessListingsSearchLiveItem.lastUpdatedTime) &&
        Objects.equals(this.firstSeen, businessDataBusinessListingsSearchLiveItem.firstSeen);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, title, originalTitle, description, category, categoryIds, additionalCategories, cid, featureId, address, addressInfo, placeId, phone, url, domain, logo, mainImage, totalPhotos, snippet, latitude, longitude, isClaimed, attributes, placeTopics, rating, hotelRating, priceLevel, ratingDistribution, peopleAlsoSearch, workTime, popularTimes, localBusinessLinks, contactInfo, checkUrl, lastUpdatedTime, firstSeen);
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
    sb.append("class BusinessDataBusinessListingsSearchLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    additionalCategories: ").append(toIndentedString(additionalCategories)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressInfo: ").append(toIndentedString(addressInfo)).append("\n");
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
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    placeTopics: ").append(toIndentedString(placeTopics)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    hotelRating: ").append(toIndentedString(hotelRating)).append("\n");
    sb.append("    priceLevel: ").append(toIndentedString(priceLevel)).append("\n");
    sb.append("    ratingDistribution: ").append(toIndentedString(ratingDistribution)).append("\n");
    sb.append("    peopleAlsoSearch: ").append(toIndentedString(peopleAlsoSearch)).append("\n");
    sb.append("    workTime: ").append(toIndentedString(workTime)).append("\n");
    sb.append("    popularTimes: ").append(toIndentedString(popularTimes)).append("\n");
    sb.append("    localBusinessLinks: ").append(toIndentedString(localBusinessLinks)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
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
    
    openapiFields.add("type");
    
    openapiFields.add("title");
    
    openapiFields.add("original_title");
    
    openapiFields.add("description");
    
    openapiFields.add("category");
    
    openapiFields.add("category_ids");
    
    openapiFields.add("additional_categories");
    
    openapiFields.add("cid");
    
    openapiFields.add("feature_id");
    
    openapiFields.add("address");
    
    openapiFields.add("address_info");
    
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
    
    openapiFields.add("attributes");
    
    openapiFields.add("place_topics");
    
    openapiFields.add("rating");
    
    openapiFields.add("hotel_rating");
    
    openapiFields.add("price_level");
    
    openapiFields.add("rating_distribution");
    
    openapiFields.add("people_also_search");
    
    openapiFields.add("work_time");
    
    openapiFields.add("popular_times");
    
    openapiFields.add("local_business_links");
    
    openapiFields.add("contact_info");
    
    openapiFields.add("check_url");
    
    openapiFields.add("last_updated_time");
    
    openapiFields.add("first_seen");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessDataBusinessListingsSearchLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataBusinessListingsSearchLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataBusinessListingsSearchLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataBusinessListingsSearchLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataBusinessListingsSearchLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataBusinessListingsSearchLiveItem>() {
           @Override
           public void write(JsonWriter out, BusinessDataBusinessListingsSearchLiveItem value) throws IOException {
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
           public BusinessDataBusinessListingsSearchLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessDataBusinessListingsSearchLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BusinessDataBusinessListingsSearchLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataBusinessListingsSearchLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
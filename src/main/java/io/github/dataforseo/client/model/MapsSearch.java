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



public class MapsSearch  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public MapsSearch type(String type) {
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


  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public MapsSearch rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * position within a group of elements with identical type values
* positions of elements with different type values are omitted from the rank_group
   * @return rankGroup
   */
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public MapsSearch rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank among all the elements
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public MapsSearch domain(String domain) {
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


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public MapsSearch title(String title) {
    this.title = title;
    return this;
  }

  /**
   * directory title
* can take the following values: At this place, Directory
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public MapsSearch url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to view the menu
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public MapsSearch rating(RatingInfo rating) {
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


  public static final String SERIALIZED_NAME_RATING_DISTRIBUTION = "rating_distribution";
  @SerializedName(SERIALIZED_NAME_RATING_DISTRIBUTION)
  private Map<String, Integer> ratingDistribution;

  public MapsSearch ratingDistribution(Map<String, Integer> ratingDistribution) {
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


  public static final String SERIALIZED_NAME_SNIPPET = "snippet";
  @SerializedName(SERIALIZED_NAME_SNIPPET)
  private String snippet;

  public MapsSearch snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * additional information about the business entity
   * @return snippet
   */
  @javax.annotation.Nullable
  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public MapsSearch address(String address) {
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

  public MapsSearch addressInfo(AddressInfo addressInfo) {
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

  public MapsSearch placeId(String placeId) {
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

  public MapsSearch phone(String phone) {
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


  public static final String SERIALIZED_NAME_MAIN_IMAGE = "main_image";
  @SerializedName(SERIALIZED_NAME_MAIN_IMAGE)
  private String mainImage;

  public MapsSearch mainImage(String mainImage) {
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
  private String totalPhotos;

  public MapsSearch totalPhotos(String totalPhotos) {
    this.totalPhotos = totalPhotos;
    return this;
  }

  /**
   * total count of images featured in Google My Business profile
   * @return totalPhotos
   */
  @javax.annotation.Nullable
  public String getTotalPhotos() {
    return totalPhotos;
  }

  public void setTotalPhotos(String totalPhotos) {
    this.totalPhotos = totalPhotos;
  }


  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public MapsSearch category(String category) {
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


  public static final String SERIALIZED_NAME_ADDITIONAL_CATEGORIES = "additional_categories";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_CATEGORIES)
  private List<String> additionalCategories;

  public MapsSearch additionalCategories(List<String> additionalCategories) {
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


  public static final String SERIALIZED_NAME_PRICE_LEVEL = "price_level";
  @SerializedName(SERIALIZED_NAME_PRICE_LEVEL)
  private String priceLevel;

  public MapsSearch priceLevel(String priceLevel) {
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


  public static final String SERIALIZED_NAME_HOTEL_RATING = "hotel_rating";
  @SerializedName(SERIALIZED_NAME_HOTEL_RATING)
  private String hotelRating;

  public MapsSearch hotelRating(String hotelRating) {
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
  public String getHotelRating() {
    return hotelRating;
  }

  public void setHotelRating(String hotelRating) {
    this.hotelRating = hotelRating;
  }


  public static final String SERIALIZED_NAME_CATEGORY_IDS = "category_ids";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<String> categoryIds;

  public MapsSearch categoryIds(List<String> categoryIds) {
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


  public static final String SERIALIZED_NAME_WORK_HOURS = "work_hours";
  @SerializedName(SERIALIZED_NAME_WORK_HOURS)
  private BusinessWorkHoursInfo workHours;

  public MapsSearch workHours(BusinessWorkHoursInfo workHours) {
    this.workHours = workHours;
    return this;
  }

  /**
   * open hours
* information about work hours of the local establishment
   * @return workHours
   */
  @javax.annotation.Nullable
  public BusinessWorkHoursInfo getWorkHours() {
    return workHours;
  }

  public void setWorkHours(BusinessWorkHoursInfo workHours) {
    this.workHours = workHours;
  }


  public static final String SERIALIZED_NAME_FEATURE_ID = "feature_id";
  @SerializedName(SERIALIZED_NAME_FEATURE_ID)
  private String featureId;

  public MapsSearch featureId(String featureId) {
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


  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public MapsSearch cid(String cid) {
    this.cid = cid;
    return this;
  }

  /**
   * google-defined client id
* unique id of a local establishment;
* can be used with Google Reviews API to get a full list of reviews
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


  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public MapsSearch latitude(Double latitude) {
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

  public MapsSearch longitude(Double longitude) {
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

  public MapsSearch isClaimed(Boolean isClaimed) {
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


  public static final String SERIALIZED_NAME_LOCAL_JUSTIFICATIONS = "local_justifications";
  @SerializedName(SERIALIZED_NAME_LOCAL_JUSTIFICATIONS)
  private List<String> localJustifications;

  public MapsSearch localJustifications(List<String> localJustifications) {
    this.localJustifications = localJustifications;
    return this;
  }

  /**
   * Google local justifications
* snippets of text that “justify” why the business is showing up for search query
   * @return localJustifications
   */
  @javax.annotation.Nullable
  public List<String> getLocalJustifications() {
    return localJustifications;
  }

  public void setLocalJustifications(List<String> localJustifications) {
    this.localJustifications = localJustifications;
  }


  public static final String SERIALIZED_NAME_IS_DIRECTORY_ITEM = "is_directory_item";
  @SerializedName(SERIALIZED_NAME_IS_DIRECTORY_ITEM)
  private Boolean isDirectoryItem;

  public MapsSearch isDirectoryItem(Boolean isDirectoryItem) {
    this.isDirectoryItem = isDirectoryItem;
    return this;
  }

  /**
   * business establishment is a part of the directory
* indicates whether the business establishment is a part of the directory;
* if true, the item is a part of the larger directory of businesses with the same address (e.g., a mall or a business centre);
* note: if the business establishment is a parent item in the directory, the value will be null
   * @return isDirectoryItem
   */
  @javax.annotation.Nullable
  public Boolean getIsDirectoryItem() {
    return isDirectoryItem;
  }

  public void setIsDirectoryItem(Boolean isDirectoryItem) {
    this.isDirectoryItem = isDirectoryItem;
  }



  public MapsSearch() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public MapsSearch putAdditionalProperty(String key, Object value) {
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


    
    MapsSearch mapsSearch = (MapsSearch) o;
    return

        Objects.equals(this.type, mapsSearch.type) &&
        Objects.equals(this.rankGroup, mapsSearch.rankGroup) &&
        Objects.equals(this.rankAbsolute, mapsSearch.rankAbsolute) &&
        Objects.equals(this.domain, mapsSearch.domain) &&
        Objects.equals(this.title, mapsSearch.title) &&
        Objects.equals(this.url, mapsSearch.url) &&
        Objects.equals(this.rating, mapsSearch.rating) &&
        Objects.equals(this.ratingDistribution, mapsSearch.ratingDistribution) &&
        Objects.equals(this.snippet, mapsSearch.snippet) &&
        Objects.equals(this.address, mapsSearch.address) &&
        Objects.equals(this.addressInfo, mapsSearch.addressInfo) &&
        Objects.equals(this.placeId, mapsSearch.placeId) &&
        Objects.equals(this.phone, mapsSearch.phone) &&
        Objects.equals(this.mainImage, mapsSearch.mainImage) &&
        Objects.equals(this.totalPhotos, mapsSearch.totalPhotos) &&
        Objects.equals(this.category, mapsSearch.category) &&
        Objects.equals(this.additionalCategories, mapsSearch.additionalCategories) &&
        Objects.equals(this.priceLevel, mapsSearch.priceLevel) &&
        Objects.equals(this.hotelRating, mapsSearch.hotelRating) &&
        Objects.equals(this.categoryIds, mapsSearch.categoryIds) &&
        Objects.equals(this.workHours, mapsSearch.workHours) &&
        Objects.equals(this.featureId, mapsSearch.featureId) &&
        Objects.equals(this.cid, mapsSearch.cid) &&
        Objects.equals(this.latitude, mapsSearch.latitude) &&
        Objects.equals(this.longitude, mapsSearch.longitude) &&
        Objects.equals(this.isClaimed, mapsSearch.isClaimed) &&
        Objects.equals(this.localJustifications, mapsSearch.localJustifications) &&
        Objects.equals(this.isDirectoryItem, mapsSearch.isDirectoryItem);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, domain, title, url, rating, ratingDistribution, snippet, address, addressInfo, placeId, phone, mainImage, totalPhotos, category, additionalCategories, priceLevel, hotelRating, categoryIds, workHours, featureId, cid, latitude, longitude, isClaimed, localJustifications, isDirectoryItem);
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
    sb.append("class MapsSearch {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    ratingDistribution: ").append(toIndentedString(ratingDistribution)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressInfo: ").append(toIndentedString(addressInfo)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mainImage: ").append(toIndentedString(mainImage)).append("\n");
    sb.append("    totalPhotos: ").append(toIndentedString(totalPhotos)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    additionalCategories: ").append(toIndentedString(additionalCategories)).append("\n");
    sb.append("    priceLevel: ").append(toIndentedString(priceLevel)).append("\n");
    sb.append("    hotelRating: ").append(toIndentedString(hotelRating)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    workHours: ").append(toIndentedString(workHours)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    isClaimed: ").append(toIndentedString(isClaimed)).append("\n");
    sb.append("    localJustifications: ").append(toIndentedString(localJustifications)).append("\n");
    sb.append("    isDirectoryItem: ").append(toIndentedString(isDirectoryItem)).append("\n");
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
    
    openapiFields.add("rank_group");
    
    openapiFields.add("rank_absolute");
    
    openapiFields.add("domain");
    
    openapiFields.add("title");
    
    openapiFields.add("url");
    
    openapiFields.add("rating");
    
    openapiFields.add("rating_distribution");
    
    openapiFields.add("snippet");
    
    openapiFields.add("address");
    
    openapiFields.add("address_info");
    
    openapiFields.add("place_id");
    
    openapiFields.add("phone");
    
    openapiFields.add("main_image");
    
    openapiFields.add("total_photos");
    
    openapiFields.add("category");
    
    openapiFields.add("additional_categories");
    
    openapiFields.add("price_level");
    
    openapiFields.add("hotel_rating");
    
    openapiFields.add("category_ids");
    
    openapiFields.add("work_hours");
    
    openapiFields.add("feature_id");
    
    openapiFields.add("cid");
    
    openapiFields.add("latitude");
    
    openapiFields.add("longitude");
    
    openapiFields.add("is_claimed");
    
    openapiFields.add("local_justifications");
    
    openapiFields.add("is_directory_item");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MapsSearch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MapsSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MapsSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MapsSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MapsSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<MapsSearch>() {
           @Override
           public void write(JsonWriter out, MapsSearch value) throws IOException {
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
           public MapsSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MapsSearch instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static MapsSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MapsSearch.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
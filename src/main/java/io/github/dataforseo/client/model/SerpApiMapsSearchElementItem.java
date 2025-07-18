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



public class SerpApiMapsSearchElementItem  extends BaseSerpApiGoogleMapsElementItem  {


  public static final String SERIALIZED_NAME_ORIGINAL_TITLE = "original_title";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_TITLE)
  private String originalTitle;

  public SerpApiMapsSearchElementItem originalTitle(String originalTitle) {
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


  public static final String SERIALIZED_NAME_CONTACT_URL = "contact_url";
  @SerializedName(SERIALIZED_NAME_CONTACT_URL)
  private String contactUrl;

  public SerpApiMapsSearchElementItem contactUrl(String contactUrl) {
    this.contactUrl = contactUrl;
    return this;
  }

  /**
   * URL of the preferred contact page
   * @return contactUrl
   */
  @javax.annotation.Nullable
  public String getContactUrl() {
    return contactUrl;
  }

  public void setContactUrl(String contactUrl) {
    this.contactUrl = contactUrl;
  }


  public static final String SERIALIZED_NAME_CONTRIBUTOR_URL = "contributor_url";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTOR_URL)
  private String contributorUrl;

  public SerpApiMapsSearchElementItem contributorUrl(String contributorUrl) {
    this.contributorUrl = contributorUrl;
    return this;
  }

  /**
   * URL of the user’s or entity’s Local Guides profile, if available
   * @return contributorUrl
   */
  @javax.annotation.Nullable
  public String getContributorUrl() {
    return contributorUrl;
  }

  public void setContributorUrl(String contributorUrl) {
    this.contributorUrl = contributorUrl;
  }


  public static final String SERIALIZED_NAME_BOOK_ONLINE_URL = "book_online_url";
  @SerializedName(SERIALIZED_NAME_BOOK_ONLINE_URL)
  private String bookOnlineUrl;

  public SerpApiMapsSearchElementItem bookOnlineUrl(String bookOnlineUrl) {
    this.bookOnlineUrl = bookOnlineUrl;
    return this;
  }

  /**
   * URL in the ‘book online’ button of the element
* URL directing users to the online booking or order page of the business entity
   * @return bookOnlineUrl
   */
  @javax.annotation.Nullable
  public String getBookOnlineUrl() {
    return bookOnlineUrl;
  }

  public void setBookOnlineUrl(String bookOnlineUrl) {
    this.bookOnlineUrl = bookOnlineUrl;
  }


  public static final String SERIALIZED_NAME_HOTEL_RATING = "hotel_rating";
  @SerializedName(SERIALIZED_NAME_HOTEL_RATING)
  private Double hotelRating;

  public SerpApiMapsSearchElementItem hotelRating(Double hotelRating) {
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
  public Double getHotelRating() {
    return hotelRating;
  }

  public void setHotelRating(Double hotelRating) {
    this.hotelRating = hotelRating;
  }


  public static final String SERIALIZED_NAME_PRICE_LEVEL = "price_level";
  @SerializedName(SERIALIZED_NAME_PRICE_LEVEL)
  private String priceLevel;

  public SerpApiMapsSearchElementItem priceLevel(String priceLevel) {
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


  public static final String SERIALIZED_NAME_SNIPPET = "snippet";
  @SerializedName(SERIALIZED_NAME_SNIPPET)
  private String snippet;

  public SerpApiMapsSearchElementItem snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * element snippet
* contains the address and other information about the local establishment featured in the element
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

  public SerpApiMapsSearchElementItem address(String address) {
    this.address = address;
    return this;
  }

  /**
   * address line
* address of the local establishment featured in the element
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

  public SerpApiMapsSearchElementItem addressInfo(AddressInfo addressInfo) {
    this.addressInfo = addressInfo;
    return this;
  }

  /**
   * object containing address components of the local establishment
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

  public SerpApiMapsSearchElementItem placeId(String placeId) {
    this.placeId = placeId;
    return this;
  }

  /**
   * unique place identifier
* place id of the local establishment featured in the element
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

  public SerpApiMapsSearchElementItem phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * phone number
* phone number of the local establishment featured in the element
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

  public SerpApiMapsSearchElementItem mainImage(String mainImage) {
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

  public SerpApiMapsSearchElementItem totalPhotos(Long totalPhotos) {
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


  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public SerpApiMapsSearchElementItem category(String category) {
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

  public SerpApiMapsSearchElementItem additionalCategories(List<String> additionalCategories) {
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


  public static final String SERIALIZED_NAME_CATEGORY_IDS = "category_ids";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<String> categoryIds;

  public SerpApiMapsSearchElementItem categoryIds(List<String> categoryIds) {
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
  private WorkHours workHours;

  public SerpApiMapsSearchElementItem workHours(WorkHours workHours) {
    this.workHours = workHours;
    return this;
  }

  /**
   * open hours
* information about work hours of the local establishment
   * @return workHours
   */
  @javax.annotation.Nullable
  public WorkHours getWorkHours() {
    return workHours;
  }

  public void setWorkHours(WorkHours workHours) {
    this.workHours = workHours;
  }


  public static final String SERIALIZED_NAME_FEATURE_ID = "feature_id";
  @SerializedName(SERIALIZED_NAME_FEATURE_ID)
  private String featureId;

  public SerpApiMapsSearchElementItem featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * the unique identifier of the element in SERP
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

  public SerpApiMapsSearchElementItem cid(String cid) {
    this.cid = cid;
    return this;
  }

  /**
   * google-defined client id
* unique id of a local establishment;
* can be used with Google Reviews API to get a full list of reviews
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

  public SerpApiMapsSearchElementItem latitude(Double latitude) {
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

  public SerpApiMapsSearchElementItem longitude(Double longitude) {
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

  public SerpApiMapsSearchElementItem isClaimed(Boolean isClaimed) {
    this.isClaimed = isClaimed;
    return this;
  }

  /**
   * indicates whether ownership of this local establishment is claimed
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
  private List<LocalJustificationInfo> localJustifications;

  public SerpApiMapsSearchElementItem localJustifications(List<LocalJustificationInfo> localJustifications) {
    this.localJustifications = localJustifications;
    return this;
  }

  /**
   * Google local justifications
* snippets of text that “justify” why the business is showing up for search query
   * @return localJustifications
   */
  @javax.annotation.Nullable
  public List<LocalJustificationInfo> getLocalJustifications() {
    return localJustifications;
  }

  public void setLocalJustifications(List<LocalJustificationInfo> localJustifications) {
    this.localJustifications = localJustifications;
  }


  public static final String SERIALIZED_NAME_IS_DIRECTORY_ITEM = "is_directory_item";
  @SerializedName(SERIALIZED_NAME_IS_DIRECTORY_ITEM)
  private Boolean isDirectoryItem;

  public SerpApiMapsSearchElementItem isDirectoryItem(Boolean isDirectoryItem) {
    this.isDirectoryItem = isDirectoryItem;
    return this;
  }

  /**
   * indicates whether this local establishment is a directory
   * @return isDirectoryItem
   */
  @javax.annotation.Nullable
  public Boolean getIsDirectoryItem() {
    return isDirectoryItem;
  }

  public void setIsDirectoryItem(Boolean isDirectoryItem) {
    this.isDirectoryItem = isDirectoryItem;
  }



  public SerpApiMapsSearchElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpApiMapsSearchElementItem putAdditionalProperty(String key, Object value) {
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


    
    SerpApiMapsSearchElementItem serpApiMapsSearchElementItem = (SerpApiMapsSearchElementItem) o;
    return

        Objects.equals(this.originalTitle, serpApiMapsSearchElementItem.originalTitle) &&
        Objects.equals(this.contactUrl, serpApiMapsSearchElementItem.contactUrl) &&
        Objects.equals(this.contributorUrl, serpApiMapsSearchElementItem.contributorUrl) &&
        Objects.equals(this.bookOnlineUrl, serpApiMapsSearchElementItem.bookOnlineUrl) &&
        Objects.equals(this.hotelRating, serpApiMapsSearchElementItem.hotelRating) &&
        Objects.equals(this.priceLevel, serpApiMapsSearchElementItem.priceLevel) &&
        Objects.equals(this.snippet, serpApiMapsSearchElementItem.snippet) &&
        Objects.equals(this.address, serpApiMapsSearchElementItem.address) &&
        Objects.equals(this.addressInfo, serpApiMapsSearchElementItem.addressInfo) &&
        Objects.equals(this.placeId, serpApiMapsSearchElementItem.placeId) &&
        Objects.equals(this.phone, serpApiMapsSearchElementItem.phone) &&
        Objects.equals(this.mainImage, serpApiMapsSearchElementItem.mainImage) &&
        Objects.equals(this.totalPhotos, serpApiMapsSearchElementItem.totalPhotos) &&
        Objects.equals(this.category, serpApiMapsSearchElementItem.category) &&
        Objects.equals(this.additionalCategories, serpApiMapsSearchElementItem.additionalCategories) &&
        Objects.equals(this.categoryIds, serpApiMapsSearchElementItem.categoryIds) &&
        Objects.equals(this.workHours, serpApiMapsSearchElementItem.workHours) &&
        Objects.equals(this.featureId, serpApiMapsSearchElementItem.featureId) &&
        Objects.equals(this.cid, serpApiMapsSearchElementItem.cid) &&
        Objects.equals(this.latitude, serpApiMapsSearchElementItem.latitude) &&
        Objects.equals(this.longitude, serpApiMapsSearchElementItem.longitude) &&
        Objects.equals(this.isClaimed, serpApiMapsSearchElementItem.isClaimed) &&
        Objects.equals(this.localJustifications, serpApiMapsSearchElementItem.localJustifications) &&
        Objects.equals(this.isDirectoryItem, serpApiMapsSearchElementItem.isDirectoryItem) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(originalTitle, contactUrl, contributorUrl, bookOnlineUrl, hotelRating, priceLevel, snippet, address, addressInfo, placeId, phone, mainImage, totalPhotos, category, additionalCategories, categoryIds, workHours, featureId, cid, latitude, longitude, isClaimed, localJustifications, isDirectoryItem);
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
    sb.append("class SerpApiMapsSearchElementItem {\n");

    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    contactUrl: ").append(toIndentedString(contactUrl)).append("\n");
    sb.append("    contributorUrl: ").append(toIndentedString(contributorUrl)).append("\n");
    sb.append("    bookOnlineUrl: ").append(toIndentedString(bookOnlineUrl)).append("\n");
    sb.append("    hotelRating: ").append(toIndentedString(hotelRating)).append("\n");
    sb.append("    priceLevel: ").append(toIndentedString(priceLevel)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressInfo: ").append(toIndentedString(addressInfo)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mainImage: ").append(toIndentedString(mainImage)).append("\n");
    sb.append("    totalPhotos: ").append(toIndentedString(totalPhotos)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    additionalCategories: ").append(toIndentedString(additionalCategories)).append("\n");
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
    
    openapiFields.add("original_title");
    
    openapiFields.add("contact_url");
    
    openapiFields.add("contributor_url");
    
    openapiFields.add("book_online_url");
    
    openapiFields.add("hotel_rating");
    
    openapiFields.add("price_level");
    
    openapiFields.add("snippet");
    
    openapiFields.add("address");
    
    openapiFields.add("address_info");
    
    openapiFields.add("place_id");
    
    openapiFields.add("phone");
    
    openapiFields.add("main_image");
    
    openapiFields.add("total_photos");
    
    openapiFields.add("category");
    
    openapiFields.add("additional_categories");
    
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
   * @throws IOException if the JSON Element is invalid with respect to SerpApiMapsSearchElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpApiMapsSearchElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpApiMapsSearchElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpApiMapsSearchElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpApiMapsSearchElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpApiMapsSearchElementItem>() {
           @Override
           public void write(JsonWriter out, SerpApiMapsSearchElementItem value) throws IOException {
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
           public SerpApiMapsSearchElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpApiMapsSearchElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpApiMapsSearchElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpApiMapsSearchElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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



public class BusinessDataGoogleHotelSearchesItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BusinessDataGoogleHotelSearchesItem type(String type) {
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


  public static final String SERIALIZED_NAME_HOTEL_IDENTIFIER = "hotel_identifier";
  @SerializedName(SERIALIZED_NAME_HOTEL_IDENTIFIER)
  private String hotelIdentifier;

  public BusinessDataGoogleHotelSearchesItem hotelIdentifier(String hotelIdentifier) {
    this.hotelIdentifier = hotelIdentifier;
    return this;
  }

  /**
   * unique identifier of a hotel entity in Google search
* example:
* CgoI-KWyzenM_MV3EAE
   * @return hotelIdentifier
   */
  @javax.annotation.Nullable
  public String getHotelIdentifier() {
    return hotelIdentifier;
  }

  public void setHotelIdentifier(String hotelIdentifier) {
    this.hotelIdentifier = hotelIdentifier;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public BusinessDataGoogleHotelSearchesItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the hotel
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_STARS = "stars";
  @SerializedName(SERIALIZED_NAME_STARS)
  private Integer stars;

  public BusinessDataGoogleHotelSearchesItem stars(Integer stars) {
    this.stars = stars;
    return this;
  }

  /**
   * hotel class rating
* class rating that ranges between 1-5 stars
   * @return stars
   */
  @javax.annotation.Nullable
  public Integer getStars() {
    return stars;
  }

  public void setStars(Integer stars) {
    this.stars = stars;
  }


  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  private Boolean isPaid;

  public BusinessDataGoogleHotelSearchesItem isPaid(Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  /**
   * indicates a paid hotel listing
* if true, related hotel_search_item is a paid ad
* if false, related hotel_search_item is an organic hotel listing
   * @return isPaid
   */
  @javax.annotation.Nullable
  public Boolean getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private GpsCoordinatesLocationInfo location;

  public BusinessDataGoogleHotelSearchesItem location(GpsCoordinatesLocationInfo location) {
    this.location = location;
    return this;
  }

  /**
   * GPS coordinates of the hotel’s location
   * @return location
   */
  @javax.annotation.Nullable
  public GpsCoordinatesLocationInfo getLocation() {
    return location;
  }

  public void setLocation(GpsCoordinatesLocationInfo location) {
    this.location = location;
  }


  public static final String SERIALIZED_NAME_REVIEWS = "reviews";
  @SerializedName(SERIALIZED_NAME_REVIEWS)
  private HotelReviewInfo reviews;

  public BusinessDataGoogleHotelSearchesItem reviews(HotelReviewInfo reviews) {
    this.reviews = reviews;
    return this;
  }

  /**
   * hotel reviews and rating information
   * @return reviews
   */
  @javax.annotation.Nullable
  public HotelReviewInfo getReviews() {
    return reviews;
  }

  public void setReviews(HotelReviewInfo reviews) {
    this.reviews = reviews;
  }


  public static final String SERIALIZED_NAME_OVERVIEW_IMAGES = "overview_images";
  @SerializedName(SERIALIZED_NAME_OVERVIEW_IMAGES)
  private List<String> overviewImages;

  public BusinessDataGoogleHotelSearchesItem overviewImages(List<String> overviewImages) {
    this.overviewImages = overviewImages;
    return this;
  }

  /**
   * featured images for a hotel
   * @return overviewImages
   */
  @javax.annotation.Nullable
  public List<String> getOverviewImages() {
    return overviewImages;
  }

  public void setOverviewImages(List<String> overviewImages) {
    this.overviewImages = overviewImages;
  }


  public static final String SERIALIZED_NAME_PRICES = "prices";
  @SerializedName(SERIALIZED_NAME_PRICES)
  private HotelPriceInfo prices;

  public BusinessDataGoogleHotelSearchesItem prices(HotelPriceInfo prices) {
    this.prices = prices;
    return this;
  }

  /**
   * hotel price
   * @return prices
   */
  @javax.annotation.Nullable
  public HotelPriceInfo getPrices() {
    return prices;
  }

  public void setPrices(HotelPriceInfo prices) {
    this.prices = prices;
  }



  public BusinessDataGoogleHotelSearchesItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BusinessDataGoogleHotelSearchesItem putAdditionalProperty(String key, Object value) {
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


    
    BusinessDataGoogleHotelSearchesItem businessDataGoogleHotelSearchesItem = (BusinessDataGoogleHotelSearchesItem) o;
    return

        Objects.equals(this.type, businessDataGoogleHotelSearchesItem.type) &&
        Objects.equals(this.hotelIdentifier, businessDataGoogleHotelSearchesItem.hotelIdentifier) &&
        Objects.equals(this.title, businessDataGoogleHotelSearchesItem.title) &&
        Objects.equals(this.stars, businessDataGoogleHotelSearchesItem.stars) &&
        Objects.equals(this.isPaid, businessDataGoogleHotelSearchesItem.isPaid) &&
        Objects.equals(this.location, businessDataGoogleHotelSearchesItem.location) &&
        Objects.equals(this.reviews, businessDataGoogleHotelSearchesItem.reviews) &&
        Objects.equals(this.overviewImages, businessDataGoogleHotelSearchesItem.overviewImages) &&
        Objects.equals(this.prices, businessDataGoogleHotelSearchesItem.prices);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, hotelIdentifier, title, stars, isPaid, location, reviews, overviewImages, prices);
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
    sb.append("class BusinessDataGoogleHotelSearchesItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hotelIdentifier: ").append(toIndentedString(hotelIdentifier)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
    sb.append("    overviewImages: ").append(toIndentedString(overviewImages)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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
    
    openapiFields.add("hotel_identifier");
    
    openapiFields.add("title");
    
    openapiFields.add("stars");
    
    openapiFields.add("is_paid");
    
    openapiFields.add("location");
    
    openapiFields.add("reviews");
    
    openapiFields.add("overview_images");
    
    openapiFields.add("prices");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessDataGoogleHotelSearchesItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataGoogleHotelSearchesItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataGoogleHotelSearchesItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataGoogleHotelSearchesItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataGoogleHotelSearchesItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataGoogleHotelSearchesItem>() {
           @Override
           public void write(JsonWriter out, BusinessDataGoogleHotelSearchesItem value) throws IOException {
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
           public BusinessDataGoogleHotelSearchesItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessDataGoogleHotelSearchesItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BusinessDataGoogleHotelSearchesItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataGoogleHotelSearchesItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
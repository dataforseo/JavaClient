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
import io.github.dataforseo.client.model.AmazonDeliveryInfo;
import io.github.dataforseo.client.model.BaseAmazonSerpElementItem;
import io.github.dataforseo.client.model.RatingElement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * AmazonAmazonSerpSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class AmazonAmazonSerpSerpElementItem extends BaseAmazonSerpElementItem {
  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ASIN = "asin";
  @SerializedName(SERIALIZED_NAME_ASIN)
  private String asin;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_PRICE_FROM = "price_from";
  @SerializedName(SERIALIZED_NAME_PRICE_FROM)
  private Float priceFrom;

  public static final String SERIALIZED_NAME_PRICE_TO = "price_to";
  @SerializedName(SERIALIZED_NAME_PRICE_TO)
  private Float priceTo;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SPECIAL_OFFERS = "special_offers";
  @SerializedName(SERIALIZED_NAME_SPECIAL_OFFERS)
  private List<String> specialOffers;

  public static final String SERIALIZED_NAME_IS_BEST_SELLER = "is_best_seller";
  @SerializedName(SERIALIZED_NAME_IS_BEST_SELLER)
  private Boolean isBestSeller;

  public static final String SERIALIZED_NAME_IS_AMAZON_CHOICE = "is_amazon_choice";
  @SerializedName(SERIALIZED_NAME_IS_AMAZON_CHOICE)
  private Boolean isAmazonChoice;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingElement rating;

  public static final String SERIALIZED_NAME_DELIVERY_INFO = "delivery_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_INFO)
  private AmazonDeliveryInfo deliveryInfo;

  public static final String SERIALIZED_NAME_BOUGHT_PAST_MONTH = "bought_past_month";
  @SerializedName(SERIALIZED_NAME_BOUGHT_PAST_MONTH)
  private Integer boughtPastMonth;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATA_ASIN = "data_asin";
  @SerializedName(SERIALIZED_NAME_DATA_ASIN)
  private String dataAsin;

  public AmazonAmazonSerpSerpElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public AmazonAmazonSerpSerpElementItem seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * search engine type
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public AmazonAmazonSerpSerpElementItem position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the element in Amazon SERP can take the following values: left, right
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public AmazonAmazonSerpSerpElementItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Amazon domain
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public AmazonAmazonSerpSerpElementItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * product title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public AmazonAmazonSerpSerpElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the product page
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public AmazonAmazonSerpSerpElementItem asin(String asin) {
    this.asin = asin;
    return this;
  }

  /**
   * ASIN of the product learn more about ASIN in this help center guide
   * @return asin
   */
  @javax.annotation.Nullable
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }


  public AmazonAmazonSerpSerpElementItem imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * URL of the product image featured in the results
   * @return imageUrl
   */
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public AmazonAmazonSerpSerpElementItem priceFrom(Float priceFrom) {
    this.priceFrom = priceFrom;
    return this;
  }

  /**
   * the regular price of a product example: 49.98
   * @return priceFrom
   */
  @javax.annotation.Nullable
  public Float getPriceFrom() {
    return priceFrom;
  }

  public void setPriceFrom(Float priceFrom) {
    this.priceFrom = priceFrom;
  }


  public AmazonAmazonSerpSerpElementItem priceTo(Float priceTo) {
    this.priceTo = priceTo;
    return this;
  }

  /**
   * the upper limit of the product price range example: 384.99
   * @return priceTo
   */
  @javax.annotation.Nullable
  public Float getPriceTo() {
    return priceTo;
  }

  public void setPriceTo(Float priceTo) {
    this.priceTo = priceTo;
  }


  public AmazonAmazonSerpSerpElementItem currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * currency in the ISO format example: USD
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public AmazonAmazonSerpSerpElementItem specialOffers(List<String> specialOffers) {
    this.specialOffers = specialOffers;
    return this;
  }

  public AmazonAmazonSerpSerpElementItem addSpecialOffersItem(String specialOffersItem) {
    if (this.specialOffers == null) {
      this.specialOffers = new ArrayList<>();
    }
    this.specialOffers.add(specialOffersItem);
    return this;
  }

  /**
   * special offer details contains special offer details, including coupon and Subscribe &amp; Save discounts
   * @return specialOffers
   */
  @javax.annotation.Nullable
  public List<String> getSpecialOffers() {
    return specialOffers;
  }

  public void setSpecialOffers(List<String> specialOffers) {
    this.specialOffers = specialOffers;
  }


  public AmazonAmazonSerpSerpElementItem isBestSeller(Boolean isBestSeller) {
    this.isBestSeller = isBestSeller;
    return this;
  }

  /**
   * “Best Seller” label if the value is true, the product is marked with the “Best Seller” label
   * @return isBestSeller
   */
  @javax.annotation.Nullable
  public Boolean getIsBestSeller() {
    return isBestSeller;
  }

  public void setIsBestSeller(Boolean isBestSeller) {
    this.isBestSeller = isBestSeller;
  }


  public AmazonAmazonSerpSerpElementItem isAmazonChoice(Boolean isAmazonChoice) {
    this.isAmazonChoice = isAmazonChoice;
    return this;
  }

  /**
   * “Amazon’s choice” label if the value is true, the product is marked with the “Amazon’s choice” label
   * @return isAmazonChoice
   */
  @javax.annotation.Nullable
  public Boolean getIsAmazonChoice() {
    return isAmazonChoice;
  }

  public void setIsAmazonChoice(Boolean isAmazonChoice) {
    this.isAmazonChoice = isAmazonChoice;
  }


  public AmazonAmazonSerpSerpElementItem rating(RatingElement rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingElement getRating() {
    return rating;
  }

  public void setRating(RatingElement rating) {
    this.rating = rating;
  }


  public AmazonAmazonSerpSerpElementItem deliveryInfo(AmazonDeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
    return this;
  }

  /**
   * Get deliveryInfo
   * @return deliveryInfo
   */
  @javax.annotation.Nullable
  public AmazonDeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }

  public void setDeliveryInfo(AmazonDeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }


  public AmazonAmazonSerpSerpElementItem boughtPastMonth(Integer boughtPastMonth) {
    this.boughtPastMonth = boughtPastMonth;
    return this;
  }

  /**
   * number of product purchases in the past month
   * @return boughtPastMonth
   */
  @javax.annotation.Nullable
  public Integer getBoughtPastMonth() {
    return boughtPastMonth;
  }

  public void setBoughtPastMonth(Integer boughtPastMonth) {
    this.boughtPastMonth = boughtPastMonth;
  }


  public AmazonAmazonSerpSerpElementItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the product
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AmazonAmazonSerpSerpElementItem dataAsin(String dataAsin) {
    this.dataAsin = dataAsin;
    return this;
  }

  /**
   * unique product identifier on Amazon note that there is no full list of possible values as the data_asin is a dynamic value assigned by Amazon example: B07G82D89J
   * @return dataAsin
   */
  @javax.annotation.Nullable
  public String getDataAsin() {
    return dataAsin;
  }

  public void setDataAsin(String dataAsin) {
    this.dataAsin = dataAsin;
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
   * @return the AmazonAmazonSerpSerpElementItem instance itself
   */
  public AmazonAmazonSerpSerpElementItem putAdditionalProperty(String key, Object value) {
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
    AmazonAmazonSerpSerpElementItem amazonAmazonSerpSerpElementItem = (AmazonAmazonSerpSerpElementItem) o;
    return Objects.equals(this.seType, amazonAmazonSerpSerpElementItem.seType) &&
        Objects.equals(this.position, amazonAmazonSerpSerpElementItem.position) &&
        Objects.equals(this.domain, amazonAmazonSerpSerpElementItem.domain) &&
        Objects.equals(this.title, amazonAmazonSerpSerpElementItem.title) &&
        Objects.equals(this.url, amazonAmazonSerpSerpElementItem.url) &&
        Objects.equals(this.asin, amazonAmazonSerpSerpElementItem.asin) &&
        Objects.equals(this.imageUrl, amazonAmazonSerpSerpElementItem.imageUrl) &&
        Objects.equals(this.priceFrom, amazonAmazonSerpSerpElementItem.priceFrom) &&
        Objects.equals(this.priceTo, amazonAmazonSerpSerpElementItem.priceTo) &&
        Objects.equals(this.currency, amazonAmazonSerpSerpElementItem.currency) &&
        Objects.equals(this.specialOffers, amazonAmazonSerpSerpElementItem.specialOffers) &&
        Objects.equals(this.isBestSeller, amazonAmazonSerpSerpElementItem.isBestSeller) &&
        Objects.equals(this.isAmazonChoice, amazonAmazonSerpSerpElementItem.isAmazonChoice) &&
        Objects.equals(this.rating, amazonAmazonSerpSerpElementItem.rating) &&
        Objects.equals(this.deliveryInfo, amazonAmazonSerpSerpElementItem.deliveryInfo) &&
        Objects.equals(this.boughtPastMonth, amazonAmazonSerpSerpElementItem.boughtPastMonth) &&
        Objects.equals(this.description, amazonAmazonSerpSerpElementItem.description) &&
        Objects.equals(this.dataAsin, amazonAmazonSerpSerpElementItem.dataAsin)&&
        Objects.equals(this.additionalProperties, amazonAmazonSerpSerpElementItem.additionalProperties) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(seType, position, domain, title, url, asin, imageUrl, priceFrom, priceTo, currency, specialOffers, isBestSeller, isAmazonChoice, rating, deliveryInfo, boughtPastMonth, description, dataAsin, super.hashCode(), additionalProperties);
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
    sb.append("class AmazonAmazonSerpSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    priceFrom: ").append(toIndentedString(priceFrom)).append("\n");
    sb.append("    priceTo: ").append(toIndentedString(priceTo)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    specialOffers: ").append(toIndentedString(specialOffers)).append("\n");
    sb.append("    isBestSeller: ").append(toIndentedString(isBestSeller)).append("\n");
    sb.append("    isAmazonChoice: ").append(toIndentedString(isAmazonChoice)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
    sb.append("    boughtPastMonth: ").append(toIndentedString(boughtPastMonth)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataAsin: ").append(toIndentedString(dataAsin)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("rank_group");
    openapiFields.add("rank_absolute");
    openapiFields.add("xpath");
    openapiFields.add("se_type");
    openapiFields.add("position");
    openapiFields.add("domain");
    openapiFields.add("title");
    openapiFields.add("url");
    openapiFields.add("asin");
    openapiFields.add("image_url");
    openapiFields.add("price_from");
    openapiFields.add("price_to");
    openapiFields.add("currency");
    openapiFields.add("special_offers");
    openapiFields.add("is_best_seller");
    openapiFields.add("is_amazon_choice");
    openapiFields.add("rating");
    openapiFields.add("delivery_info");
    openapiFields.add("bought_past_month");
    openapiFields.add("description");
    openapiFields.add("data_asin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AmazonAmazonSerpSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AmazonAmazonSerpSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AmazonAmazonSerpSerpElementItem is not found in the empty JSON string", AmazonAmazonSerpSerpElementItem.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmazonAmazonSerpSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonAmazonSerpSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonAmazonSerpSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonAmazonSerpSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonAmazonSerpSerpElementItem>() {
           @Override
           public void write(JsonWriter out, AmazonAmazonSerpSerpElementItem value) throws IOException {
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
           public AmazonAmazonSerpSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AmazonAmazonSerpSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AmazonAmazonSerpSerpElementItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AmazonAmazonSerpSerpElementItem
   * @throws IOException if the JSON string is invalid with respect to AmazonAmazonSerpSerpElementItem
   */
  public static AmazonAmazonSerpSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonAmazonSerpSerpElementItem.class);
  }

  /**
   * Convert an instance of AmazonAmazonSerpSerpElementItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

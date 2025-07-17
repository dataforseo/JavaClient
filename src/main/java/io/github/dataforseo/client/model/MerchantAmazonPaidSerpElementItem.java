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



public class MerchantAmazonPaidSerpElementItem  extends BaseMerchantAmazonElementItem  {


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public MerchantAmazonPaidSerpElementItem domain(String domain) {
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


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public MerchantAmazonPaidSerpElementItem title(String title) {
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


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public MerchantAmazonPaidSerpElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * the URL of the product page
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public MerchantAmazonPaidSerpElementItem imageUrl(String imageUrl) {
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


  public static final String SERIALIZED_NAME_BOUGHT_PAST_MONTH = "bought_past_month";
  @SerializedName(SERIALIZED_NAME_BOUGHT_PAST_MONTH)
  private Integer boughtPastMonth;

  public MerchantAmazonPaidSerpElementItem boughtPastMonth(Integer boughtPastMonth) {
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


  public static final String SERIALIZED_NAME_PRICE_FROM = "price_from";
  @SerializedName(SERIALIZED_NAME_PRICE_FROM)
  private Double priceFrom;

  public MerchantAmazonPaidSerpElementItem priceFrom(Double priceFrom) {
    this.priceFrom = priceFrom;
    return this;
  }

  /**
   * the regular price of a product
* example:
* 49.98
   * @return priceFrom
   */
  @javax.annotation.Nullable
  public Double getPriceFrom() {
    return priceFrom;
  }

  public void setPriceFrom(Double priceFrom) {
    this.priceFrom = priceFrom;
  }


  public static final String SERIALIZED_NAME_PRICE_TO = "price_to";
  @SerializedName(SERIALIZED_NAME_PRICE_TO)
  private Double priceTo;

  public MerchantAmazonPaidSerpElementItem priceTo(Double priceTo) {
    this.priceTo = priceTo;
    return this;
  }

  /**
   * the upper limit of the product price range
* example:
* 384.99
   * @return priceTo
   */
  @javax.annotation.Nullable
  public Double getPriceTo() {
    return priceTo;
  }

  public void setPriceTo(Double priceTo) {
    this.priceTo = priceTo;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public MerchantAmazonPaidSerpElementItem currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * currency in the ISO format
* example:
* USD
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public static final String SERIALIZED_NAME_SPECIAL_OFFERS = "special_offers";
  @SerializedName(SERIALIZED_NAME_SPECIAL_OFFERS)
  private List<String> specialOffers;

  public MerchantAmazonPaidSerpElementItem specialOffers(List<String> specialOffers) {
    this.specialOffers = specialOffers;
    return this;
  }

  /**
   * special offer details
* contains special offer details, including coupon and Subscribe & Save discounts
   * @return specialOffers
   */
  @javax.annotation.Nullable
  public List<String> getSpecialOffers() {
    return specialOffers;
  }

  public void setSpecialOffers(List<String> specialOffers) {
    this.specialOffers = specialOffers;
  }


  public static final String SERIALIZED_NAME_DATA_ASIN = "data_asin";
  @SerializedName(SERIALIZED_NAME_DATA_ASIN)
  private String dataAsin;

  public MerchantAmazonPaidSerpElementItem dataAsin(String dataAsin) {
    this.dataAsin = dataAsin;
    return this;
  }

  /**
   * unique product identifier on Amazon
* note that there is no full list of possible values as the data_asin is a dynamic value assigned by Amazon
* example:
* B07G82D89J
   * @return dataAsin
   */
  @javax.annotation.Nullable
  public String getDataAsin() {
    return dataAsin;
  }

  public void setDataAsin(String dataAsin) {
    this.dataAsin = dataAsin;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingElement rating;

  public MerchantAmazonPaidSerpElementItem rating(RatingElement rating) {
    this.rating = rating;
    return this;
  }

  /**
   * product rating info
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingElement getRating() {
    return rating;
  }

  public void setRating(RatingElement rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_IS_AMAZON_CHOICE = "is_amazon_choice";
  @SerializedName(SERIALIZED_NAME_IS_AMAZON_CHOICE)
  private Boolean isAmazonChoice;

  public MerchantAmazonPaidSerpElementItem isAmazonChoice(Boolean isAmazonChoice) {
    this.isAmazonChoice = isAmazonChoice;
    return this;
  }

  /**
   * “Amazon’s choice” label
* if the value is true, the product is marked with the “Amazon’s choice” label
   * @return isAmazonChoice
   */
  @javax.annotation.Nullable
  public Boolean getIsAmazonChoice() {
    return isAmazonChoice;
  }

  public void setIsAmazonChoice(Boolean isAmazonChoice) {
    this.isAmazonChoice = isAmazonChoice;
  }


  public static final String SERIALIZED_NAME_IS_BEST_SELLER = "is_best_seller";
  @SerializedName(SERIALIZED_NAME_IS_BEST_SELLER)
  private Boolean isBestSeller;

  public MerchantAmazonPaidSerpElementItem isBestSeller(Boolean isBestSeller) {
    this.isBestSeller = isBestSeller;
    return this;
  }

  /**
   * “Best Seller” label
* if the value is true, the product is marked with the “Best Seller” label
   * @return isBestSeller
   */
  @javax.annotation.Nullable
  public Boolean getIsBestSeller() {
    return isBestSeller;
  }

  public void setIsBestSeller(Boolean isBestSeller) {
    this.isBestSeller = isBestSeller;
  }


  public static final String SERIALIZED_NAME_DELIVERY_INFO = "delivery_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_INFO)
  private AmazonDeliveryInfo deliveryInfo;

  public MerchantAmazonPaidSerpElementItem deliveryInfo(AmazonDeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
    return this;
  }

  /**
   * delivery information
* delivery information including free and fast delivery date ranges
   * @return deliveryInfo
   */
  @javax.annotation.Nullable
  public AmazonDeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }

  public void setDeliveryInfo(AmazonDeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }



  public MerchantAmazonPaidSerpElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public MerchantAmazonPaidSerpElementItem putAdditionalProperty(String key, Object value) {
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


    
    MerchantAmazonPaidSerpElementItem merchantAmazonPaidSerpElementItem = (MerchantAmazonPaidSerpElementItem) o;
    return

        Objects.equals(this.domain, merchantAmazonPaidSerpElementItem.domain) &&
        Objects.equals(this.title, merchantAmazonPaidSerpElementItem.title) &&
        Objects.equals(this.url, merchantAmazonPaidSerpElementItem.url) &&
        Objects.equals(this.imageUrl, merchantAmazonPaidSerpElementItem.imageUrl) &&
        Objects.equals(this.boughtPastMonth, merchantAmazonPaidSerpElementItem.boughtPastMonth) &&
        Objects.equals(this.priceFrom, merchantAmazonPaidSerpElementItem.priceFrom) &&
        Objects.equals(this.priceTo, merchantAmazonPaidSerpElementItem.priceTo) &&
        Objects.equals(this.currency, merchantAmazonPaidSerpElementItem.currency) &&
        Objects.equals(this.specialOffers, merchantAmazonPaidSerpElementItem.specialOffers) &&
        Objects.equals(this.dataAsin, merchantAmazonPaidSerpElementItem.dataAsin) &&
        Objects.equals(this.rating, merchantAmazonPaidSerpElementItem.rating) &&
        Objects.equals(this.isAmazonChoice, merchantAmazonPaidSerpElementItem.isAmazonChoice) &&
        Objects.equals(this.isBestSeller, merchantAmazonPaidSerpElementItem.isBestSeller) &&
        Objects.equals(this.deliveryInfo, merchantAmazonPaidSerpElementItem.deliveryInfo) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(domain, title, url, imageUrl, boughtPastMonth, priceFrom, priceTo, currency, specialOffers, dataAsin, rating, isAmazonChoice, isBestSeller, deliveryInfo);
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
    sb.append("class MerchantAmazonPaidSerpElementItem {\n");

    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    boughtPastMonth: ").append(toIndentedString(boughtPastMonth)).append("\n");
    sb.append("    priceFrom: ").append(toIndentedString(priceFrom)).append("\n");
    sb.append("    priceTo: ").append(toIndentedString(priceTo)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    specialOffers: ").append(toIndentedString(specialOffers)).append("\n");
    sb.append("    dataAsin: ").append(toIndentedString(dataAsin)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    isAmazonChoice: ").append(toIndentedString(isAmazonChoice)).append("\n");
    sb.append("    isBestSeller: ").append(toIndentedString(isBestSeller)).append("\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
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
    
    openapiFields.add("domain");
    
    openapiFields.add("title");
    
    openapiFields.add("url");
    
    openapiFields.add("image_url");
    
    openapiFields.add("bought_past_month");
    
    openapiFields.add("price_from");
    
    openapiFields.add("price_to");
    
    openapiFields.add("currency");
    
    openapiFields.add("special_offers");
    
    openapiFields.add("data_asin");
    
    openapiFields.add("rating");
    
    openapiFields.add("is_amazon_choice");
    
    openapiFields.add("is_best_seller");
    
    openapiFields.add("delivery_info");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MerchantAmazonPaidSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantAmazonPaidSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantAmazonPaidSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantAmazonPaidSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantAmazonPaidSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantAmazonPaidSerpElementItem>() {
           @Override
           public void write(JsonWriter out, MerchantAmazonPaidSerpElementItem value) throws IOException {
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
           public MerchantAmazonPaidSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MerchantAmazonPaidSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static MerchantAmazonPaidSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantAmazonPaidSerpElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
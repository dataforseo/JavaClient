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



public class GoogleShoppingSponsoredCarouselElement  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GoogleShoppingSponsoredCarouselElement type(String type) {
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


  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public GoogleShoppingSponsoredCarouselElement xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  /**
   * XPath of the element
   * @return xpath
   */
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public GoogleShoppingSponsoredCarouselElement title(String title) {
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


  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public GoogleShoppingSponsoredCarouselElement tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * tags assigned to the product
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public static final String SERIALIZED_NAME_SELLER = "seller";
  @SerializedName(SERIALIZED_NAME_SELLER)
  private String seller;

  public GoogleShoppingSponsoredCarouselElement seller(String seller) {
    this.seller = seller;
    return this;
  }

  /**
   * name of the seller
* the name of the company that placed a corresponding product on Google Shopping
   * @return seller
   */
  @javax.annotation.Nullable
  public String getSeller() {
    return seller;
  }

  public void setSeller(String seller) {
    this.seller = seller;
  }


  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public GoogleShoppingSponsoredCarouselElement price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * product price
* example:
* 384.99
   * @return price
   */
  @javax.annotation.Nullable
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public GoogleShoppingSponsoredCarouselElement currency(String currency) {
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


  public static final String SERIALIZED_NAME_PRODUCT_RATING = "product_rating";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RATING)
  private RatingElement productRating;

  public GoogleShoppingSponsoredCarouselElement productRating(RatingElement productRating) {
    this.productRating = productRating;
    return this;
  }

  /**
   * product rating
* the product popularity rate based on product reviews
   * @return productRating
   */
  @javax.annotation.Nullable
  public RatingElement getProductRating() {
    return productRating;
  }

  public void setProductRating(RatingElement productRating) {
    this.productRating = productRating;
  }


  public static final String SERIALIZED_NAME_PRODUCT_IMAGES = "product_images";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGES)
  private List<String> productImages;

  public GoogleShoppingSponsoredCarouselElement productImages(List<String> productImages) {
    this.productImages = productImages;
    return this;
  }

  /**
   * URLs to the images of the product
* the first URL in the array is the featured image of the product
   * @return productImages
   */
  @javax.annotation.Nullable
  public List<String> getProductImages() {
    return productImages;
  }

  public void setProductImages(List<String> productImages) {
    this.productImages = productImages;
  }


  public static final String SERIALIZED_NAME_SHOP_AD_ACLK = "shop_ad_aclk";
  @SerializedName(SERIALIZED_NAME_SHOP_AD_ACLK)
  private String shopAdAclk;

  public GoogleShoppingSponsoredCarouselElement shopAdAclk(String shopAdAclk) {
    this.shopAdAclk = shopAdAclk;
    return this;
  }

  /**
   * unique ad click referral parameter
* using this parameter you can get a URL of the advertisement in Google Shopping Sellers Ad URL
   * @return shopAdAclk
   */
  @javax.annotation.Nullable
  public String getShopAdAclk() {
    return shopAdAclk;
  }

  public void setShopAdAclk(String shopAdAclk) {
    this.shopAdAclk = shopAdAclk;
  }


  public static final String SERIALIZED_NAME_DELIVERY_INFO = "delivery_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_INFO)
  private DeliveryInfo deliveryInfo;

  public GoogleShoppingSponsoredCarouselElement deliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
    return this;
  }

  /**
   * delivery information
* delivery information including free and fast delivery date ranges
   * @return deliveryInfo
   */
  @javax.annotation.Nullable
  public DeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }

  public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }


  public static final String SERIALIZED_NAME_SPECIAL_OFFER_INFO = "special_offer_info";
  @SerializedName(SERIALIZED_NAME_SPECIAL_OFFER_INFO)
  private SpecialOfferInfo specialOfferInfo;

  public GoogleShoppingSponsoredCarouselElement specialOfferInfo(SpecialOfferInfo specialOfferInfo) {
    this.specialOfferInfo = specialOfferInfo;
    return this;
  }

  /**
   * special offer from the seller
* information on the special offer from the seller, including discount and coupon info
   * @return specialOfferInfo
   */
  @javax.annotation.Nullable
  public SpecialOfferInfo getSpecialOfferInfo() {
    return specialOfferInfo;
  }

  public void setSpecialOfferInfo(SpecialOfferInfo specialOfferInfo) {
    this.specialOfferInfo = specialOfferInfo;
  }



  public GoogleShoppingSponsoredCarouselElement() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public GoogleShoppingSponsoredCarouselElement putAdditionalProperty(String key, Object value) {
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


    
    GoogleShoppingSponsoredCarouselElement googleShoppingSponsoredCarouselElement = (GoogleShoppingSponsoredCarouselElement) o;
    return

        Objects.equals(this.type, googleShoppingSponsoredCarouselElement.type) &&
        Objects.equals(this.xpath, googleShoppingSponsoredCarouselElement.xpath) &&
        Objects.equals(this.title, googleShoppingSponsoredCarouselElement.title) &&
        Objects.equals(this.tags, googleShoppingSponsoredCarouselElement.tags) &&
        Objects.equals(this.seller, googleShoppingSponsoredCarouselElement.seller) &&
        Objects.equals(this.price, googleShoppingSponsoredCarouselElement.price) &&
        Objects.equals(this.currency, googleShoppingSponsoredCarouselElement.currency) &&
        Objects.equals(this.productRating, googleShoppingSponsoredCarouselElement.productRating) &&
        Objects.equals(this.productImages, googleShoppingSponsoredCarouselElement.productImages) &&
        Objects.equals(this.shopAdAclk, googleShoppingSponsoredCarouselElement.shopAdAclk) &&
        Objects.equals(this.deliveryInfo, googleShoppingSponsoredCarouselElement.deliveryInfo) &&
        Objects.equals(this.specialOfferInfo, googleShoppingSponsoredCarouselElement.specialOfferInfo);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, xpath, title, tags, seller, price, currency, productRating, productImages, shopAdAclk, deliveryInfo, specialOfferInfo);
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
    sb.append("class GoogleShoppingSponsoredCarouselElement {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    productRating: ").append(toIndentedString(productRating)).append("\n");
    sb.append("    productImages: ").append(toIndentedString(productImages)).append("\n");
    sb.append("    shopAdAclk: ").append(toIndentedString(shopAdAclk)).append("\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
    sb.append("    specialOfferInfo: ").append(toIndentedString(specialOfferInfo)).append("\n");
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
    
    openapiFields.add("xpath");
    
    openapiFields.add("title");
    
    openapiFields.add("tags");
    
    openapiFields.add("seller");
    
    openapiFields.add("price");
    
    openapiFields.add("currency");
    
    openapiFields.add("product_rating");
    
    openapiFields.add("product_images");
    
    openapiFields.add("shop_ad_aclk");
    
    openapiFields.add("delivery_info");
    
    openapiFields.add("special_offer_info");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleShoppingSponsoredCarouselElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleShoppingSponsoredCarouselElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleShoppingSponsoredCarouselElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleShoppingSponsoredCarouselElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleShoppingSponsoredCarouselElement.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleShoppingSponsoredCarouselElement>() {
           @Override
           public void write(JsonWriter out, GoogleShoppingSponsoredCarouselElement value) throws IOException {
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
           public GoogleShoppingSponsoredCarouselElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleShoppingSponsoredCarouselElement instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static GoogleShoppingSponsoredCarouselElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleShoppingSponsoredCarouselElement.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
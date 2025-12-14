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



public class GoogleShoppingCarouselElement  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GoogleShoppingCarouselElement type(String type) {
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

  public GoogleShoppingCarouselElement xpath(String xpath) {
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

  public GoogleShoppingCarouselElement title(String title) {
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

  public GoogleShoppingCarouselElement tags(List<String> tags) {
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

  public GoogleShoppingCarouselElement seller(String seller) {
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

  public GoogleShoppingCarouselElement price(Double price) {
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

  public GoogleShoppingCarouselElement currency(String currency) {
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

  public GoogleShoppingCarouselElement productRating(RatingElement productRating) {
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

  public GoogleShoppingCarouselElement productImages(List<String> productImages) {
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


  public static final String SERIALIZED_NAME_SHOPPING_URL = "shopping_url";
  @SerializedName(SERIALIZED_NAME_SHOPPING_URL)
  private String shoppingUrl;

  public GoogleShoppingCarouselElement shoppingUrl(String shoppingUrl) {
    this.shoppingUrl = shoppingUrl;
    return this;
  }

  /**
   * URL to the product page on Google Shopping
   * @return shoppingUrl
   */
  @javax.annotation.Nullable
  public String getShoppingUrl() {
    return shoppingUrl;
  }

  public void setShoppingUrl(String shoppingUrl) {
    this.shoppingUrl = shoppingUrl;
  }


  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public GoogleShoppingCarouselElement productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * unique product identifier on Google Shopping
* note that there is no full list of possible values as the product_id is a dynamic value assigned by Google
* if there are no values, you will get null
* example:
* 4485466949985702538
* learn more about the parameter in this help center guide
   * @return productId
   */
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public static final String SERIALIZED_NAME_DATA_DOCID = "data_docid";
  @SerializedName(SERIALIZED_NAME_DATA_DOCID)
  private String dataDocid;

  public GoogleShoppingCarouselElement dataDocid(String dataDocid) {
    this.dataDocid = dataDocid;
    return this;
  }

  /**
   * unique identifier of the SERP data element
* note that there is no full list of possible values as the data_docid is a dynamic value assigned by Google
* example:
* 17363035694596624076
   * @return dataDocid
   */
  @javax.annotation.Nullable
  public String getDataDocid() {
    return dataDocid;
  }

  public void setDataDocid(String dataDocid) {
    this.dataDocid = dataDocid;
  }


  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public GoogleShoppingCarouselElement gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * global product identifier on Google Shopping
* note that there is no full list of possible values as the gid is a dynamic value assigned by Google
* if there are no values, you will get null
* example:
* 4702526954592161872
* learn more about gid parameter in this help center guide
   * @return gid
   */
  @javax.annotation.Nullable
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }


  public static final String SERIALIZED_NAME_DELIVERY_INFO = "delivery_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_INFO)
  private DeliveryInfo deliveryInfo;

  public GoogleShoppingCarouselElement deliveryInfo(DeliveryInfo deliveryInfo) {
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

  public GoogleShoppingCarouselElement specialOfferInfo(SpecialOfferInfo specialOfferInfo) {
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



  public GoogleShoppingCarouselElement() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public GoogleShoppingCarouselElement putAdditionalProperty(String key, Object value) {
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


    
    GoogleShoppingCarouselElement googleShoppingCarouselElement = (GoogleShoppingCarouselElement) o;
    return

        Objects.equals(this.type, googleShoppingCarouselElement.type) &&
        Objects.equals(this.xpath, googleShoppingCarouselElement.xpath) &&
        Objects.equals(this.title, googleShoppingCarouselElement.title) &&
        Objects.equals(this.tags, googleShoppingCarouselElement.tags) &&
        Objects.equals(this.seller, googleShoppingCarouselElement.seller) &&
        Objects.equals(this.price, googleShoppingCarouselElement.price) &&
        Objects.equals(this.currency, googleShoppingCarouselElement.currency) &&
        Objects.equals(this.productRating, googleShoppingCarouselElement.productRating) &&
        Objects.equals(this.productImages, googleShoppingCarouselElement.productImages) &&
        Objects.equals(this.shoppingUrl, googleShoppingCarouselElement.shoppingUrl) &&
        Objects.equals(this.productId, googleShoppingCarouselElement.productId) &&
        Objects.equals(this.dataDocid, googleShoppingCarouselElement.dataDocid) &&
        Objects.equals(this.gid, googleShoppingCarouselElement.gid) &&
        Objects.equals(this.deliveryInfo, googleShoppingCarouselElement.deliveryInfo) &&
        Objects.equals(this.specialOfferInfo, googleShoppingCarouselElement.specialOfferInfo);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, xpath, title, tags, seller, price, currency, productRating, productImages, shoppingUrl, productId, dataDocid, gid, deliveryInfo, specialOfferInfo);
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
    sb.append("class GoogleShoppingCarouselElement {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    productRating: ").append(toIndentedString(productRating)).append("\n");
    sb.append("    productImages: ").append(toIndentedString(productImages)).append("\n");
    sb.append("    shoppingUrl: ").append(toIndentedString(shoppingUrl)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    dataDocid: ").append(toIndentedString(dataDocid)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
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
    
    openapiFields.add("shopping_url");
    
    openapiFields.add("product_id");
    
    openapiFields.add("data_docid");
    
    openapiFields.add("gid");
    
    openapiFields.add("delivery_info");
    
    openapiFields.add("special_offer_info");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleShoppingCarouselElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleShoppingCarouselElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleShoppingCarouselElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleShoppingCarouselElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleShoppingCarouselElement.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleShoppingCarouselElement>() {
           @Override
           public void write(JsonWriter out, GoogleShoppingCarouselElement value) throws IOException {
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
           public GoogleShoppingCarouselElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleShoppingCarouselElement instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static GoogleShoppingCarouselElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleShoppingCarouselElement.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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



public class GoogleShoppingSerpElementItem  extends BaseMerchantGoogleShoppingProductsElementItem  {


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public GoogleShoppingSerpElementItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain of the URL
* domain of the URL where a special offer is posted
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

  public GoogleShoppingSerpElementItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the element
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

  public GoogleShoppingSerpElementItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the product in Google Shopping SERP
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public GoogleShoppingSerpElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL pointing at special offer page
* URL where a special offer is posted
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_SHOPPING_URL = "shopping_url";
  @SerializedName(SERIALIZED_NAME_SHOPPING_URL)
  private String shoppingUrl;

  public GoogleShoppingSerpElementItem shoppingUrl(String shoppingUrl) {
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


  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public GoogleShoppingSerpElementItem tags(List<String> tags) {
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


  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public GoogleShoppingSerpElementItem price(Double price) {
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


  public static final String SERIALIZED_NAME_PRICE_MULTIPLIER = "price_multiplier";
  @SerializedName(SERIALIZED_NAME_PRICE_MULTIPLIER)
  private Integer priceMultiplier;

  public GoogleShoppingSerpElementItem priceMultiplier(Integer priceMultiplier) {
    this.priceMultiplier = priceMultiplier;
    return this;
  }

  /**
   * price multiplier for instalment plan
* indicates the number of months covered by the monthly payment for the product
   * @return priceMultiplier
   */
  @javax.annotation.Nullable
  public Integer getPriceMultiplier() {
    return priceMultiplier;
  }

  public void setPriceMultiplier(Integer priceMultiplier) {
    this.priceMultiplier = priceMultiplier;
  }


  public static final String SERIALIZED_NAME_OLD_PRICE = "old_price";
  @SerializedName(SERIALIZED_NAME_OLD_PRICE)
  private Double oldPrice;

  public GoogleShoppingSerpElementItem oldPrice(Double oldPrice) {
    this.oldPrice = oldPrice;
    return this;
  }

  /**
   * product old price
* displayed if the product price has been changed
* example:
* 499
   * @return oldPrice
   */
  @javax.annotation.Nullable
  public Double getOldPrice() {
    return oldPrice;
  }

  public void setOldPrice(Double oldPrice) {
    this.oldPrice = oldPrice;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public GoogleShoppingSerpElementItem currency(String currency) {
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


  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public GoogleShoppingSerpElementItem productId(String productId) {
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

  public GoogleShoppingSerpElementItem dataDocid(String dataDocid) {
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


  public static final String SERIALIZED_NAME_SELLER = "seller";
  @SerializedName(SERIALIZED_NAME_SELLER)
  private String seller;

  public GoogleShoppingSerpElementItem seller(String seller) {
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


  public static final String SERIALIZED_NAME_ADDITIONAL_SPECIFICATIONS = "additional_specifications";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_SPECIFICATIONS)
  private Map<String, String> additionalSpecifications;

  public GoogleShoppingSerpElementItem additionalSpecifications(Map<String, String> additionalSpecifications) {
    this.additionalSpecifications = additionalSpecifications;
    return this;
  }

  /**
   * object containing additional url parameters
* you can get more details about the product by using this object in the POST request to the Google Shopping Product Specification and Google Shopping Sellers endpoint
   * @return additionalSpecifications
   */
  @javax.annotation.Nullable
  public Map<String, String> getAdditionalSpecifications() {
    return additionalSpecifications;
  }

  public void setAdditionalSpecifications(Map<String, String> additionalSpecifications) {
    this.additionalSpecifications = additionalSpecifications;
  }


  public static final String SERIALIZED_NAME_REVIEWS_COUNT = "reviews_count";
  @SerializedName(SERIALIZED_NAME_REVIEWS_COUNT)
  private Long reviewsCount;

  public GoogleShoppingSerpElementItem reviewsCount(Long reviewsCount) {
    this.reviewsCount = reviewsCount;
    return this;
  }

  /**
   * number of product reviews
* indicates the number of reviews left by users on Google Shopping
* if there are no values, you will get null
   * @return reviewsCount
   */
  @javax.annotation.Nullable
  public Long getReviewsCount() {
    return reviewsCount;
  }

  public void setReviewsCount(Long reviewsCount) {
    this.reviewsCount = reviewsCount;
  }


  public static final String SERIALIZED_NAME_IS_BEST_MATCH = "is_best_match";
  @SerializedName(SERIALIZED_NAME_IS_BEST_MATCH)
  private Boolean isBestMatch;

  public GoogleShoppingSerpElementItem isBestMatch(Boolean isBestMatch) {
    this.isBestMatch = isBestMatch;
    return this;
  }

  /**
   * “best match” label
* if the value is true, the product is marked with the “best match” label
* if there are no values, you will get null
   * @return isBestMatch
   */
  @javax.annotation.Nullable
  public Boolean getIsBestMatch() {
    return isBestMatch;
  }

  public void setIsBestMatch(Boolean isBestMatch) {
    this.isBestMatch = isBestMatch;
  }


  public static final String SERIALIZED_NAME_PRODUCT_RATING = "product_rating";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RATING)
  private RatingElement productRating;

  public GoogleShoppingSerpElementItem productRating(RatingElement productRating) {
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


  public static final String SERIALIZED_NAME_SHOP_RATING = "shop_rating";
  @SerializedName(SERIALIZED_NAME_SHOP_RATING)
  private RatingElement shopRating;

  public GoogleShoppingSerpElementItem shopRating(RatingElement shopRating) {
    this.shopRating = shopRating;
    return this;
  }

  /**
   * shop rating
* the popularity rate of the seller based on user reviews
   * @return shopRating
   */
  @javax.annotation.Nullable
  public RatingElement getShopRating() {
    return shopRating;
  }

  public void setShopRating(RatingElement shopRating) {
    this.shopRating = shopRating;
  }


  public static final String SERIALIZED_NAME_PRODUCT_IMAGES = "product_images";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGES)
  private List<String> productImages;

  public GoogleShoppingSerpElementItem productImages(List<String> productImages) {
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

  public GoogleShoppingSerpElementItem shopAdAclk(String shopAdAclk) {
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

  public GoogleShoppingSerpElementItem deliveryInfo(DeliveryInfo deliveryInfo) {
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


  public static final String SERIALIZED_NAME_STORES_COUNT_INFO = "stores_count_info";
  @SerializedName(SERIALIZED_NAME_STORES_COUNT_INFO)
  private StoresCountInfo storesCountInfo;

  public GoogleShoppingSerpElementItem storesCountInfo(StoresCountInfo storesCountInfo) {
    this.storesCountInfo = storesCountInfo;
    return this;
  }

  /**
   * stores count information
* contains information about the number of stores that offer the same product
   * @return storesCountInfo
   */
  @javax.annotation.Nullable
  public StoresCountInfo getStoresCountInfo() {
    return storesCountInfo;
  }

  public void setStoresCountInfo(StoresCountInfo storesCountInfo) {
    this.storesCountInfo = storesCountInfo;
  }



  public GoogleShoppingSerpElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public GoogleShoppingSerpElementItem putAdditionalProperty(String key, Object value) {
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


    
    GoogleShoppingSerpElementItem googleShoppingSerpElementItem = (GoogleShoppingSerpElementItem) o;
    return

        Objects.equals(this.domain, googleShoppingSerpElementItem.domain) &&
        Objects.equals(this.title, googleShoppingSerpElementItem.title) &&
        Objects.equals(this.description, googleShoppingSerpElementItem.description) &&
        Objects.equals(this.url, googleShoppingSerpElementItem.url) &&
        Objects.equals(this.shoppingUrl, googleShoppingSerpElementItem.shoppingUrl) &&
        Objects.equals(this.tags, googleShoppingSerpElementItem.tags) &&
        Objects.equals(this.price, googleShoppingSerpElementItem.price) &&
        Objects.equals(this.priceMultiplier, googleShoppingSerpElementItem.priceMultiplier) &&
        Objects.equals(this.oldPrice, googleShoppingSerpElementItem.oldPrice) &&
        Objects.equals(this.currency, googleShoppingSerpElementItem.currency) &&
        Objects.equals(this.productId, googleShoppingSerpElementItem.productId) &&
        Objects.equals(this.dataDocid, googleShoppingSerpElementItem.dataDocid) &&
        Objects.equals(this.seller, googleShoppingSerpElementItem.seller) &&
        Objects.equals(this.additionalSpecifications, googleShoppingSerpElementItem.additionalSpecifications) &&
        Objects.equals(this.reviewsCount, googleShoppingSerpElementItem.reviewsCount) &&
        Objects.equals(this.isBestMatch, googleShoppingSerpElementItem.isBestMatch) &&
        Objects.equals(this.productRating, googleShoppingSerpElementItem.productRating) &&
        Objects.equals(this.shopRating, googleShoppingSerpElementItem.shopRating) &&
        Objects.equals(this.productImages, googleShoppingSerpElementItem.productImages) &&
        Objects.equals(this.shopAdAclk, googleShoppingSerpElementItem.shopAdAclk) &&
        Objects.equals(this.deliveryInfo, googleShoppingSerpElementItem.deliveryInfo) &&
        Objects.equals(this.storesCountInfo, googleShoppingSerpElementItem.storesCountInfo) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(domain, title, description, url, shoppingUrl, tags, price, priceMultiplier, oldPrice, currency, productId, dataDocid, seller, additionalSpecifications, reviewsCount, isBestMatch, productRating, shopRating, productImages, shopAdAclk, deliveryInfo, storesCountInfo);
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
    sb.append("class GoogleShoppingSerpElementItem {\n");

    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    shoppingUrl: ").append(toIndentedString(shoppingUrl)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceMultiplier: ").append(toIndentedString(priceMultiplier)).append("\n");
    sb.append("    oldPrice: ").append(toIndentedString(oldPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    dataDocid: ").append(toIndentedString(dataDocid)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    additionalSpecifications: ").append(toIndentedString(additionalSpecifications)).append("\n");
    sb.append("    reviewsCount: ").append(toIndentedString(reviewsCount)).append("\n");
    sb.append("    isBestMatch: ").append(toIndentedString(isBestMatch)).append("\n");
    sb.append("    productRating: ").append(toIndentedString(productRating)).append("\n");
    sb.append("    shopRating: ").append(toIndentedString(shopRating)).append("\n");
    sb.append("    productImages: ").append(toIndentedString(productImages)).append("\n");
    sb.append("    shopAdAclk: ").append(toIndentedString(shopAdAclk)).append("\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
    sb.append("    storesCountInfo: ").append(toIndentedString(storesCountInfo)).append("\n");
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
    openapiFields.add("position");
    openapiFields.add("xpath");
    
    openapiFields.add("domain");
    
    openapiFields.add("title");
    
    openapiFields.add("description");
    
    openapiFields.add("url");
    
    openapiFields.add("shopping_url");
    
    openapiFields.add("tags");
    
    openapiFields.add("price");
    
    openapiFields.add("price_multiplier");
    
    openapiFields.add("old_price");
    
    openapiFields.add("currency");
    
    openapiFields.add("product_id");
    
    openapiFields.add("data_docid");
    
    openapiFields.add("seller");
    
    openapiFields.add("additional_specifications");
    
    openapiFields.add("reviews_count");
    
    openapiFields.add("is_best_match");
    
    openapiFields.add("product_rating");
    
    openapiFields.add("shop_rating");
    
    openapiFields.add("product_images");
    
    openapiFields.add("shop_ad_aclk");
    
    openapiFields.add("delivery_info");
    
    openapiFields.add("stores_count_info");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleShoppingSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleShoppingSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleShoppingSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleShoppingSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleShoppingSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleShoppingSerpElementItem>() {
           @Override
           public void write(JsonWriter out, GoogleShoppingSerpElementItem value) throws IOException {
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
           public GoogleShoppingSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleShoppingSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static GoogleShoppingSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleShoppingSerpElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
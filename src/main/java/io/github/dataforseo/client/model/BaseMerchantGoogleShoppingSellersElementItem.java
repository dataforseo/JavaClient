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



public class BaseMerchantGoogleShoppingSellersElementItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BaseMerchantGoogleShoppingSellersElementItem type(String type) {
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

  public BaseMerchantGoogleShoppingSellersElementItem rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * position within a group of elements with identical type values
* positions of elements with different type values are omitted from rank_group
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

  public BaseMerchantGoogleShoppingSellersElementItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP
* absolute position among all the elements found in Google Shopping SERP
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public BaseMerchantGoogleShoppingSellersElementItem position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the element in Google Shopping SERP
* possible values:
* left, right
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public BaseMerchantGoogleShoppingSellersElementItem xpath(String xpath) {
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


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public BaseMerchantGoogleShoppingSellersElementItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain in SERP
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

  public BaseMerchantGoogleShoppingSellersElementItem title(String title) {
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

  public BaseMerchantGoogleShoppingSellersElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Google Shopping URL forwarding to the product page on the seller’s website
* if you want to obtain a URL of the advertisement forwarding to the product page on the seller’s website, please refer to the Google Shopping Sellers Ad URL endpoint
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public BaseMerchantGoogleShoppingSellersElementItem details(String details) {
    this.details = details;
    return this;
  }

  /**
   * details and special offers
* if there are no details, the value will be null
   * @return details
   */
  @javax.annotation.Nullable
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  public static final String SERIALIZED_NAME_BASE_PRICE = "base_price";
  @SerializedName(SERIALIZED_NAME_BASE_PRICE)
  private Double basePrice;

  public BaseMerchantGoogleShoppingSellersElementItem basePrice(Double basePrice) {
    this.basePrice = basePrice;
    return this;
  }

  /**
   * product price without tax and shipping
   * @return basePrice
   */
  @javax.annotation.Nullable
  public Double getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(Double basePrice) {
    this.basePrice = basePrice;
  }


  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private Double tax;

  public BaseMerchantGoogleShoppingSellersElementItem tax(Double tax) {
    this.tax = tax;
    return this;
  }

  /**
   * the amount of tax
* tax is specified as the actual amount of money, not as the percentage
   * @return tax
   */
  @javax.annotation.Nullable
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }


  public static final String SERIALIZED_NAME_SHIPPING_PRICE = "shipping_price";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PRICE)
  private Double shippingPrice;

  public BaseMerchantGoogleShoppingSellersElementItem shippingPrice(Double shippingPrice) {
    this.shippingPrice = shippingPrice;
    return this;
  }

  /**
   * product shipping price
   * @return shippingPrice
   */
  @javax.annotation.Nullable
  public Double getShippingPrice() {
    return shippingPrice;
  }

  public void setShippingPrice(Double shippingPrice) {
    this.shippingPrice = shippingPrice;
  }


  public static final String SERIALIZED_NAME_TOTAL_PRICE = "total_price";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private Double totalPrice;

  public BaseMerchantGoogleShoppingSellersElementItem totalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * product price including tax and shipping
   * @return totalPrice
   */
  @javax.annotation.Nullable
  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public BaseMerchantGoogleShoppingSellersElementItem currency(String currency) {
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


  public static final String SERIALIZED_NAME_SELLER_NAME = "seller_name";
  @SerializedName(SERIALIZED_NAME_SELLER_NAME)
  private String sellerName;

  public BaseMerchantGoogleShoppingSellersElementItem sellerName(String sellerName) {
    this.sellerName = sellerName;
    return this;
  }

  /**
   * name of the seller
* the name of the company that placed a corresponding product on Google Shopping
   * @return sellerName
   */
  @javax.annotation.Nullable
  public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingElement rating;

  public BaseMerchantGoogleShoppingSellersElementItem rating(RatingElement rating) {
    this.rating = rating;
    return this;
  }

  /**
   * shop rating
* the shop popularity rate based on product reviews
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingElement getRating() {
    return rating;
  }

  public void setRating(RatingElement rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_SHOP_AD_ACLK = "shop_ad_aclk";
  @SerializedName(SERIALIZED_NAME_SHOP_AD_ACLK)
  private String shopAdAclk;

  public BaseMerchantGoogleShoppingSellersElementItem shopAdAclk(String shopAdAclk) {
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



  public BaseMerchantGoogleShoppingSellersElementItem() {
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }


    
    BaseMerchantGoogleShoppingSellersElementItem baseMerchantGoogleShoppingSellersElementItem = (BaseMerchantGoogleShoppingSellersElementItem) o;
    return

        Objects.equals(this.type, baseMerchantGoogleShoppingSellersElementItem.type) &&
        Objects.equals(this.rankGroup, baseMerchantGoogleShoppingSellersElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, baseMerchantGoogleShoppingSellersElementItem.rankAbsolute) &&
        Objects.equals(this.position, baseMerchantGoogleShoppingSellersElementItem.position) &&
        Objects.equals(this.xpath, baseMerchantGoogleShoppingSellersElementItem.xpath) &&
        Objects.equals(this.domain, baseMerchantGoogleShoppingSellersElementItem.domain) &&
        Objects.equals(this.title, baseMerchantGoogleShoppingSellersElementItem.title) &&
        Objects.equals(this.url, baseMerchantGoogleShoppingSellersElementItem.url) &&
        Objects.equals(this.details, baseMerchantGoogleShoppingSellersElementItem.details) &&
        Objects.equals(this.basePrice, baseMerchantGoogleShoppingSellersElementItem.basePrice) &&
        Objects.equals(this.tax, baseMerchantGoogleShoppingSellersElementItem.tax) &&
        Objects.equals(this.shippingPrice, baseMerchantGoogleShoppingSellersElementItem.shippingPrice) &&
        Objects.equals(this.totalPrice, baseMerchantGoogleShoppingSellersElementItem.totalPrice) &&
        Objects.equals(this.currency, baseMerchantGoogleShoppingSellersElementItem.currency) &&
        Objects.equals(this.sellerName, baseMerchantGoogleShoppingSellersElementItem.sellerName) &&
        Objects.equals(this.rating, baseMerchantGoogleShoppingSellersElementItem.rating) &&
        Objects.equals(this.shopAdAclk, baseMerchantGoogleShoppingSellersElementItem.shopAdAclk);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, position, xpath, domain, title, url, details, basePrice, tax, shippingPrice, totalPrice, currency, sellerName, rating, shopAdAclk);
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
    sb.append("class BaseMerchantGoogleShoppingSellersElementItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    shippingPrice: ").append(toIndentedString(shippingPrice)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    sellerName: ").append(toIndentedString(sellerName)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    shopAdAclk: ").append(toIndentedString(shopAdAclk)).append("\n");
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
    
    openapiFields.add("url");
    
    openapiFields.add("details");
    
    openapiFields.add("base_price");
    
    openapiFields.add("tax");
    
    openapiFields.add("shipping_price");
    
    openapiFields.add("total_price");
    
    openapiFields.add("currency");
    
    openapiFields.add("seller_name");
    
    openapiFields.add("rating");
    
    openapiFields.add("shop_ad_aclk");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  
  public static BaseMerchantGoogleShoppingSellersElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseMerchantGoogleShoppingSellersElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
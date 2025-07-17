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



public class BaseMerchantAmazonSellersElementItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BaseMerchantAmazonSellersElementItem type(String type) {
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

  public BaseMerchantAmazonSellersElementItem rankGroup(Integer rankGroup) {
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

  public BaseMerchantAmazonSellersElementItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP
* absolute position among all the elements found in Amazon Sellers SERP
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

  public BaseMerchantAmazonSellersElementItem position(String position) {
    this.position = position;
    return this;
  }

  /**
   * alignment of the element in SERP
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

  public BaseMerchantAmazonSellersElementItem xpath(String xpath) {
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


  public static final String SERIALIZED_NAME_SELLER_NAME = "seller_name";
  @SerializedName(SERIALIZED_NAME_SELLER_NAME)
  private String sellerName;

  public BaseMerchantAmazonSellersElementItem sellerName(String sellerName) {
    this.sellerName = sellerName;
    return this;
  }

  /**
   * business name of the seller
   * @return sellerName
   */
  @javax.annotation.Nullable
  public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }


  public static final String SERIALIZED_NAME_SELLER_URL = "seller_url";
  @SerializedName(SERIALIZED_NAME_SELLER_URL)
  private String sellerUrl;

  public BaseMerchantAmazonSellersElementItem sellerUrl(String sellerUrl) {
    this.sellerUrl = sellerUrl;
    return this;
  }

  /**
   * url forwarding to the seller’s page on Amazon
   * @return sellerUrl
   */
  @javax.annotation.Nullable
  public String getSellerUrl() {
    return sellerUrl;
  }

  public void setSellerUrl(String sellerUrl) {
    this.sellerUrl = sellerUrl;
  }


  public static final String SERIALIZED_NAME_SHIPS_FROM = "ships_from";
  @SerializedName(SERIALIZED_NAME_SHIPS_FROM)
  private String shipsFrom;

  public BaseMerchantAmazonSellersElementItem shipsFrom(String shipsFrom) {
    this.shipsFrom = shipsFrom;
    return this;
  }

  /**
   * sender company name
   * @return shipsFrom
   */
  @javax.annotation.Nullable
  public String getShipsFrom() {
    return shipsFrom;
  }

  public void setShipsFrom(String shipsFrom) {
    this.shipsFrom = shipsFrom;
  }


  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private PriceInfo price;

  public BaseMerchantAmazonSellersElementItem price(PriceInfo price) {
    this.price = price;
    return this;
  }

  /**
   * product pricing details
* if there are no details, the value will be null
   * @return price
   */
  @javax.annotation.Nullable
  public PriceInfo getPrice() {
    return price;
  }

  public void setPrice(PriceInfo price) {
    this.price = price;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingElement rating;

  public BaseMerchantAmazonSellersElementItem rating(RatingElement rating) {
    this.rating = rating;
    return this;
  }

  /**
   * seller rating details
* seller popularity rate based on customer reviews
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingElement getRating() {
    return rating;
  }

  public void setRating(RatingElement rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition;

  public BaseMerchantAmazonSellersElementItem condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * product condition
* condition of the product offered by the seller
   * @return condition
   */
  @javax.annotation.Nullable
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }


  public static final String SERIALIZED_NAME_CONDITION_DESCRIPTION = "condition_description";
  @SerializedName(SERIALIZED_NAME_CONDITION_DESCRIPTION)
  private String conditionDescription;

  public BaseMerchantAmazonSellersElementItem conditionDescription(String conditionDescription) {
    this.conditionDescription = conditionDescription;
    return this;
  }

  /**
   * product condition details
* expanded details on the condition of the product offered by the seller
   * @return conditionDescription
   */
  @javax.annotation.Nullable
  public String getConditionDescription() {
    return conditionDescription;
  }

  public void setConditionDescription(String conditionDescription) {
    this.conditionDescription = conditionDescription;
  }


  public static final String SERIALIZED_NAME_DELIVERY_INFO = "delivery_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_INFO)
  private AmazonDeliveryInfo deliveryInfo;

  public BaseMerchantAmazonSellersElementItem deliveryInfo(AmazonDeliveryInfo deliveryInfo) {
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



  public BaseMerchantAmazonSellersElementItem() {
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }


    
    BaseMerchantAmazonSellersElementItem baseMerchantAmazonSellersElementItem = (BaseMerchantAmazonSellersElementItem) o;
    return

        Objects.equals(this.type, baseMerchantAmazonSellersElementItem.type) &&
        Objects.equals(this.rankGroup, baseMerchantAmazonSellersElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, baseMerchantAmazonSellersElementItem.rankAbsolute) &&
        Objects.equals(this.position, baseMerchantAmazonSellersElementItem.position) &&
        Objects.equals(this.xpath, baseMerchantAmazonSellersElementItem.xpath) &&
        Objects.equals(this.sellerName, baseMerchantAmazonSellersElementItem.sellerName) &&
        Objects.equals(this.sellerUrl, baseMerchantAmazonSellersElementItem.sellerUrl) &&
        Objects.equals(this.shipsFrom, baseMerchantAmazonSellersElementItem.shipsFrom) &&
        Objects.equals(this.price, baseMerchantAmazonSellersElementItem.price) &&
        Objects.equals(this.rating, baseMerchantAmazonSellersElementItem.rating) &&
        Objects.equals(this.condition, baseMerchantAmazonSellersElementItem.condition) &&
        Objects.equals(this.conditionDescription, baseMerchantAmazonSellersElementItem.conditionDescription) &&
        Objects.equals(this.deliveryInfo, baseMerchantAmazonSellersElementItem.deliveryInfo);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, position, xpath, sellerName, sellerUrl, shipsFrom, price, rating, condition, conditionDescription, deliveryInfo);
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
    sb.append("class BaseMerchantAmazonSellersElementItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    sellerName: ").append(toIndentedString(sellerName)).append("\n");
    sb.append("    sellerUrl: ").append(toIndentedString(sellerUrl)).append("\n");
    sb.append("    shipsFrom: ").append(toIndentedString(shipsFrom)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    conditionDescription: ").append(toIndentedString(conditionDescription)).append("\n");
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
    
    openapiFields.add("position");
    
    openapiFields.add("xpath");
    
    openapiFields.add("seller_name");
    
    openapiFields.add("seller_url");
    
    openapiFields.add("ships_from");
    
    openapiFields.add("price");
    
    openapiFields.add("rating");
    
    openapiFields.add("condition");
    
    openapiFields.add("condition_description");
    
    openapiFields.add("delivery_info");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  
  public static BaseMerchantAmazonSellersElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseMerchantAmazonSellersElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
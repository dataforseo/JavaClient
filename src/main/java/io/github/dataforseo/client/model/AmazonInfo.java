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



public class AmazonInfo  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public AmazonInfo seType(String seType) {
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


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AmazonInfo type(String type) {
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

  public AmazonInfo rankGroup(Integer rankGroup) {
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

  public AmazonInfo rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in Amazon SERP
* absolute position among all the elements in SERP
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

  public AmazonInfo position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the element in Amazon SERP
* can take the following values:
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

  public AmazonInfo xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  /**
   * the XPath of the element
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

  public AmazonInfo domain(String domain) {
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

  public AmazonInfo title(String title) {
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

  public AmazonInfo url(String url) {
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


  public static final String SERIALIZED_NAME_ASIN = "asin";
  @SerializedName(SERIALIZED_NAME_ASIN)
  private String asin;

  public AmazonInfo asin(String asin) {
    this.asin = asin;
    return this;
  }

  /**
   * ASIN of the product
* learn more about ASIN in this help center guide
   * @return asin
   */
  @javax.annotation.Nullable
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }


  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public AmazonInfo imageUrl(String imageUrl) {
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


  public static final String SERIALIZED_NAME_PRICE_FROM = "price_from";
  @SerializedName(SERIALIZED_NAME_PRICE_FROM)
  private Double priceFrom;

  public AmazonInfo priceFrom(Double priceFrom) {
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

  public AmazonInfo priceTo(Double priceTo) {
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

  public AmazonInfo currency(String currency) {
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

  public AmazonInfo specialOffers(List<String> specialOffers) {
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


  public static final String SERIALIZED_NAME_IS_BEST_SELLER = "is_best_seller";
  @SerializedName(SERIALIZED_NAME_IS_BEST_SELLER)
  private Boolean isBestSeller;

  public AmazonInfo isBestSeller(Boolean isBestSeller) {
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


  public static final String SERIALIZED_NAME_IS_AMAZON_CHOICE = "is_amazon_choice";
  @SerializedName(SERIALIZED_NAME_IS_AMAZON_CHOICE)
  private Boolean isAmazonChoice;

  public AmazonInfo isAmazonChoice(Boolean isAmazonChoice) {
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


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public AmazonInfo rating(RatingInfo rating) {
    this.rating = rating;
    return this;
  }

  /**
   * the item’s rating 
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


  public static final String SERIALIZED_NAME_DELIVERY_INFO = "delivery_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_INFO)
  private AmazonDeliveryInfo deliveryInfo;

  public AmazonInfo deliveryInfo(AmazonDeliveryInfo deliveryInfo) {
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


  public static final String SERIALIZED_NAME_BOUGHT_PAST_MONTH = "bought_past_month";
  @SerializedName(SERIALIZED_NAME_BOUGHT_PAST_MONTH)
  private Integer boughtPastMonth;

  public AmazonInfo boughtPastMonth(Integer boughtPastMonth) {
    this.boughtPastMonth = boughtPastMonth;
    return this;
  }

  /**
   * 
   * @return boughtPastMonth
   */
  @javax.annotation.Nullable
  public Integer getBoughtPastMonth() {
    return boughtPastMonth;
  }

  public void setBoughtPastMonth(Integer boughtPastMonth) {
    this.boughtPastMonth = boughtPastMonth;
  }



  public AmazonInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AmazonInfo putAdditionalProperty(String key, Object value) {
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


    
    AmazonInfo amazonInfo = (AmazonInfo) o;
    return

        Objects.equals(this.seType, amazonInfo.seType) &&
        Objects.equals(this.type, amazonInfo.type) &&
        Objects.equals(this.rankGroup, amazonInfo.rankGroup) &&
        Objects.equals(this.rankAbsolute, amazonInfo.rankAbsolute) &&
        Objects.equals(this.position, amazonInfo.position) &&
        Objects.equals(this.xpath, amazonInfo.xpath) &&
        Objects.equals(this.domain, amazonInfo.domain) &&
        Objects.equals(this.title, amazonInfo.title) &&
        Objects.equals(this.url, amazonInfo.url) &&
        Objects.equals(this.asin, amazonInfo.asin) &&
        Objects.equals(this.imageUrl, amazonInfo.imageUrl) &&
        Objects.equals(this.priceFrom, amazonInfo.priceFrom) &&
        Objects.equals(this.priceTo, amazonInfo.priceTo) &&
        Objects.equals(this.currency, amazonInfo.currency) &&
        Objects.equals(this.specialOffers, amazonInfo.specialOffers) &&
        Objects.equals(this.isBestSeller, amazonInfo.isBestSeller) &&
        Objects.equals(this.isAmazonChoice, amazonInfo.isAmazonChoice) &&
        Objects.equals(this.rating, amazonInfo.rating) &&
        Objects.equals(this.deliveryInfo, amazonInfo.deliveryInfo) &&
        Objects.equals(this.boughtPastMonth, amazonInfo.boughtPastMonth);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, type, rankGroup, rankAbsolute, position, xpath, domain, title, url, asin, imageUrl, priceFrom, priceTo, currency, specialOffers, isBestSeller, isAmazonChoice, rating, deliveryInfo, boughtPastMonth);
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
    sb.append("class AmazonInfo {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
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
    
    openapiFields.add("se_type");
    
    openapiFields.add("type");
    
    openapiFields.add("rank_group");
    
    openapiFields.add("rank_absolute");
    
    openapiFields.add("position");
    
    openapiFields.add("xpath");
    
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
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AmazonInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmazonInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonInfo>() {
           @Override
           public void write(JsonWriter out, AmazonInfo value) throws IOException {
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
           public AmazonInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AmazonInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AmazonInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
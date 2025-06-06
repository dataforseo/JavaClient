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
import io.github.dataforseo.client.model.BaseMerchantSerpElementItem;
import io.github.dataforseo.client.model.RatingElement;
import java.io.IOException;
import java.math.BigDecimal;
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

/**
 * BuyOnGoogleMerchantSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class BuyOnGoogleMerchantSerpElementItem extends BaseMerchantSerpElementItem {
  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_BASE_PRICE = "base_price";
  @SerializedName(SERIALIZED_NAME_BASE_PRICE)
  private BigDecimal basePrice;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private BigDecimal tax;

  public static final String SERIALIZED_NAME_SHIPPING_PRICE = "shipping_price";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PRICE)
  private BigDecimal shippingPrice;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "total_price";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private BigDecimal totalPrice;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SELLER_NAME = "seller_name";
  @SerializedName(SERIALIZED_NAME_SELLER_NAME)
  private String sellerName;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingElement rating;

  public static final String SERIALIZED_NAME_SHOP_AD_ACLK = "shop_ad_aclk";
  @SerializedName(SERIALIZED_NAME_SHOP_AD_ACLK)
  private String shopAdAclk;

  public BuyOnGoogleMerchantSerpElementItem() {
  }

  public BuyOnGoogleMerchantSerpElementItem xpath(String xpath) {
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


  public BuyOnGoogleMerchantSerpElementItem domain(String domain) {
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


  public BuyOnGoogleMerchantSerpElementItem title(String title) {
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


  public BuyOnGoogleMerchantSerpElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Google Shopping URL forwarding to the product page
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public BuyOnGoogleMerchantSerpElementItem details(String details) {
    this.details = details;
    return this;
  }

  /**
   * details and special offers if there are no details, the value will be null
   * @return details
   */
  @javax.annotation.Nullable
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  public BuyOnGoogleMerchantSerpElementItem basePrice(BigDecimal basePrice) {
    this.basePrice = basePrice;
    return this;
  }

  /**
   * product price without tax and shipping
   * @return basePrice
   */
  @javax.annotation.Nullable
  public BigDecimal getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(BigDecimal basePrice) {
    this.basePrice = basePrice;
  }


  public BuyOnGoogleMerchantSerpElementItem tax(BigDecimal tax) {
    this.tax = tax;
    return this;
  }

  /**
   * the amount of tax tax is specified as the actual amount of money, not as the percentage
   * @return tax
   */
  @javax.annotation.Nullable
  public BigDecimal getTax() {
    return tax;
  }

  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }


  public BuyOnGoogleMerchantSerpElementItem shippingPrice(BigDecimal shippingPrice) {
    this.shippingPrice = shippingPrice;
    return this;
  }

  /**
   * product shipping price
   * @return shippingPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getShippingPrice() {
    return shippingPrice;
  }

  public void setShippingPrice(BigDecimal shippingPrice) {
    this.shippingPrice = shippingPrice;
  }


  public BuyOnGoogleMerchantSerpElementItem totalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * product price including tax and shipping
   * @return totalPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }


  public BuyOnGoogleMerchantSerpElementItem currency(String currency) {
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


  public BuyOnGoogleMerchantSerpElementItem sellerName(String sellerName) {
    this.sellerName = sellerName;
    return this;
  }

  /**
   * name of the seller the name of the company that placed a corresponding product on Google Shopping
   * @return sellerName
   */
  @javax.annotation.Nullable
  public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }


  public BuyOnGoogleMerchantSerpElementItem rating(RatingElement rating) {
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


  public BuyOnGoogleMerchantSerpElementItem shopAdAclk(String shopAdAclk) {
    this.shopAdAclk = shopAdAclk;
    return this;
  }

  /**
   * unique ad click referral parameter using this parameter you can get a URL of the advertisement in Google Shopping Sellers Ad URL in this case, the value equals null
   * @return shopAdAclk
   */
  @javax.annotation.Nullable
  public String getShopAdAclk() {
    return shopAdAclk;
  }

  public void setShopAdAclk(String shopAdAclk) {
    this.shopAdAclk = shopAdAclk;
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
   * @return the BuyOnGoogleMerchantSerpElementItem instance itself
   */
  public BuyOnGoogleMerchantSerpElementItem putAdditionalProperty(String key, Object value) {
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
    BuyOnGoogleMerchantSerpElementItem buyOnGoogleMerchantSerpElementItem = (BuyOnGoogleMerchantSerpElementItem) o;
    return Objects.equals(this.xpath, buyOnGoogleMerchantSerpElementItem.xpath) &&
        Objects.equals(this.domain, buyOnGoogleMerchantSerpElementItem.domain) &&
        Objects.equals(this.title, buyOnGoogleMerchantSerpElementItem.title) &&
        Objects.equals(this.url, buyOnGoogleMerchantSerpElementItem.url) &&
        Objects.equals(this.details, buyOnGoogleMerchantSerpElementItem.details) &&
        Objects.equals(this.basePrice, buyOnGoogleMerchantSerpElementItem.basePrice) &&
        Objects.equals(this.tax, buyOnGoogleMerchantSerpElementItem.tax) &&
        Objects.equals(this.shippingPrice, buyOnGoogleMerchantSerpElementItem.shippingPrice) &&
        Objects.equals(this.totalPrice, buyOnGoogleMerchantSerpElementItem.totalPrice) &&
        Objects.equals(this.currency, buyOnGoogleMerchantSerpElementItem.currency) &&
        Objects.equals(this.sellerName, buyOnGoogleMerchantSerpElementItem.sellerName) &&
        Objects.equals(this.rating, buyOnGoogleMerchantSerpElementItem.rating) &&
        Objects.equals(this.shopAdAclk, buyOnGoogleMerchantSerpElementItem.shopAdAclk)&&
        Objects.equals(this.additionalProperties, buyOnGoogleMerchantSerpElementItem.additionalProperties) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpath, domain, title, url, details, basePrice, tax, shippingPrice, totalPrice, currency, sellerName, rating, shopAdAclk, super.hashCode(), additionalProperties);
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
    sb.append("class BuyOnGoogleMerchantSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BuyOnGoogleMerchantSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BuyOnGoogleMerchantSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BuyOnGoogleMerchantSerpElementItem is not found in the empty JSON string", BuyOnGoogleMerchantSerpElementItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("xpath") != null && !jsonObj.get("xpath").isJsonNull()) && !jsonObj.get("xpath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xpath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xpath").toString()));
      }
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("seller_name") != null && !jsonObj.get("seller_name").isJsonNull()) && !jsonObj.get("seller_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_name").toString()));
      }
      // validate the optional field `rating`
      if (jsonObj.get("rating") != null && !jsonObj.get("rating").isJsonNull()) {
        RatingElement.validateJsonElement(jsonObj.get("rating"));
      }
      if ((jsonObj.get("shop_ad_aclk") != null && !jsonObj.get("shop_ad_aclk").isJsonNull()) && !jsonObj.get("shop_ad_aclk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_ad_aclk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_ad_aclk").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BuyOnGoogleMerchantSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BuyOnGoogleMerchantSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BuyOnGoogleMerchantSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BuyOnGoogleMerchantSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BuyOnGoogleMerchantSerpElementItem>() {
           @Override
           public void write(JsonWriter out, BuyOnGoogleMerchantSerpElementItem value) throws IOException {
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
           public BuyOnGoogleMerchantSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BuyOnGoogleMerchantSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of BuyOnGoogleMerchantSerpElementItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BuyOnGoogleMerchantSerpElementItem
   * @throws IOException if the JSON string is invalid with respect to BuyOnGoogleMerchantSerpElementItem
   */
  public static BuyOnGoogleMerchantSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BuyOnGoogleMerchantSerpElementItem.class);
  }

  /**
   * Convert an instance of BuyOnGoogleMerchantSerpElementItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


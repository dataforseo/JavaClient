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



public class SpecialOfferInfo  {


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public SpecialOfferInfo title(String title) {
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


  public static final String SERIALIZED_NAME_SUB_TITLE = "sub_title";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE)
  private String subTitle;

  public SpecialOfferInfo subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  /**
   * subtitle of the special offer
   * @return subTitle
   */
  @javax.annotation.Nullable
  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public static final String SERIALIZED_NAME_FIXED_DISCOUNT = "fixed_discount";
  @SerializedName(SERIALIZED_NAME_FIXED_DISCOUNT)
  private Double fixedDiscount;

  public SpecialOfferInfo fixedDiscount(Double fixedDiscount) {
    this.fixedDiscount = fixedDiscount;
    return this;
  }

  /**
   * amount of the fixed discount
   * @return fixedDiscount
   */
  @javax.annotation.Nullable
  public Double getFixedDiscount() {
    return fixedDiscount;
  }

  public void setFixedDiscount(Double fixedDiscount) {
    this.fixedDiscount = fixedDiscount;
  }


  public static final String SERIALIZED_NAME_FIXED_DISCOUNT_CURRENCY = "fixed_discount_currency";
  @SerializedName(SERIALIZED_NAME_FIXED_DISCOUNT_CURRENCY)
  private String fixedDiscountCurrency;

  public SpecialOfferInfo fixedDiscountCurrency(String fixedDiscountCurrency) {
    this.fixedDiscountCurrency = fixedDiscountCurrency;
    return this;
  }

  /**
   * currency of the fixed discount
   * @return fixedDiscountCurrency
   */
  @javax.annotation.Nullable
  public String getFixedDiscountCurrency() {
    return fixedDiscountCurrency;
  }

  public void setFixedDiscountCurrency(String fixedDiscountCurrency) {
    this.fixedDiscountCurrency = fixedDiscountCurrency;
  }


  public static final String SERIALIZED_NAME_PERCENTAGE_DISCOUNT = "percentage_discount";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_DISCOUNT)
  private Double percentageDiscount;

  public SpecialOfferInfo percentageDiscount(Double percentageDiscount) {
    this.percentageDiscount = percentageDiscount;
    return this;
  }

  /**
   * percentage of the discount
   * @return percentageDiscount
   */
  @javax.annotation.Nullable
  public Double getPercentageDiscount() {
    return percentageDiscount;
  }

  public void setPercentageDiscount(Double percentageDiscount) {
    this.percentageDiscount = percentageDiscount;
  }


  public static final String SERIALIZED_NAME_COUPON_CODE = "coupon_code";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public SpecialOfferInfo couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

  /**
   * code of coupon discount
   * @return couponCode
   */
  @javax.annotation.Nullable
  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public static final String SERIALIZED_NAME_COUPON_INFO = "coupon_info";
  @SerializedName(SERIALIZED_NAME_COUPON_INFO)
  private String couponInfo;

  public SpecialOfferInfo couponInfo(String couponInfo) {
    this.couponInfo = couponInfo;
    return this;
  }

  /**
   * information on coupon discount
   * @return couponInfo
   */
  @javax.annotation.Nullable
  public String getCouponInfo() {
    return couponInfo;
  }

  public void setCouponInfo(String couponInfo) {
    this.couponInfo = couponInfo;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public SpecialOfferInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to the product page on the seller’s website
* Note: this field is deprecated and will return null
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public SpecialOfferInfo domain(String domain) {
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



  public SpecialOfferInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SpecialOfferInfo putAdditionalProperty(String key, Object value) {
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


    
    SpecialOfferInfo specialOfferInfo = (SpecialOfferInfo) o;
    return

        Objects.equals(this.title, specialOfferInfo.title) &&
        Objects.equals(this.subTitle, specialOfferInfo.subTitle) &&
        Objects.equals(this.fixedDiscount, specialOfferInfo.fixedDiscount) &&
        Objects.equals(this.fixedDiscountCurrency, specialOfferInfo.fixedDiscountCurrency) &&
        Objects.equals(this.percentageDiscount, specialOfferInfo.percentageDiscount) &&
        Objects.equals(this.couponCode, specialOfferInfo.couponCode) &&
        Objects.equals(this.couponInfo, specialOfferInfo.couponInfo) &&
        Objects.equals(this.url, specialOfferInfo.url) &&
        Objects.equals(this.domain, specialOfferInfo.domain);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(title, subTitle, fixedDiscount, fixedDiscountCurrency, percentageDiscount, couponCode, couponInfo, url, domain);
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
    sb.append("class SpecialOfferInfo {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    fixedDiscount: ").append(toIndentedString(fixedDiscount)).append("\n");
    sb.append("    fixedDiscountCurrency: ").append(toIndentedString(fixedDiscountCurrency)).append("\n");
    sb.append("    percentageDiscount: ").append(toIndentedString(percentageDiscount)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    couponInfo: ").append(toIndentedString(couponInfo)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
    
    openapiFields.add("title");
    
    openapiFields.add("sub_title");
    
    openapiFields.add("fixed_discount");
    
    openapiFields.add("fixed_discount_currency");
    
    openapiFields.add("percentage_discount");
    
    openapiFields.add("coupon_code");
    
    openapiFields.add("coupon_info");
    
    openapiFields.add("url");
    
    openapiFields.add("domain");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SpecialOfferInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpecialOfferInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpecialOfferInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpecialOfferInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpecialOfferInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SpecialOfferInfo>() {
           @Override
           public void write(JsonWriter out, SpecialOfferInfo value) throws IOException {
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
           public SpecialOfferInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SpecialOfferInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SpecialOfferInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpecialOfferInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
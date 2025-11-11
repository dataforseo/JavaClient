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



public class GoogleShoppingSellersShopsListElementItem  extends BaseMerchantGoogleShoppingSellersElementItem  {


  public static final String SERIALIZED_NAME_PRICE_MULTIPLIER = "price_multiplier";
  @SerializedName(SERIALIZED_NAME_PRICE_MULTIPLIER)
  private Integer priceMultiplier;

  public GoogleShoppingSellersShopsListElementItem priceMultiplier(Integer priceMultiplier) {
    this.priceMultiplier = priceMultiplier;
    return this;
  }

  /**
   * monthly price multiplier
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


  public static final String SERIALIZED_NAME_DISPLAYED_PAYMENT_BREAKDOWN = "displayed_payment_breakdown";
  @SerializedName(SERIALIZED_NAME_DISPLAYED_PAYMENT_BREAKDOWN)
  private String displayedPaymentBreakdown;

  public GoogleShoppingSellersShopsListElementItem displayedPaymentBreakdown(String displayedPaymentBreakdown) {
    this.displayedPaymentBreakdown = displayedPaymentBreakdown;
    return this;
  }

  /**
   * installment details as displayed in the results
* shows how the product price can be broken down into monthly payments, if applicable
   * @return displayedPaymentBreakdown
   */
  @javax.annotation.Nullable
  public String getDisplayedPaymentBreakdown() {
    return displayedPaymentBreakdown;
  }

  public void setDisplayedPaymentBreakdown(String displayedPaymentBreakdown) {
    this.displayedPaymentBreakdown = displayedPaymentBreakdown;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingElement rating;

  public GoogleShoppingSellersShopsListElementItem rating(RatingElement rating) {
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


  public static final String SERIALIZED_NAME_PRODUCT_CONDITION = "product_condition";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CONDITION)
  private String productCondition;

  public GoogleShoppingSellersShopsListElementItem productCondition(String productCondition) {
    this.productCondition = productCondition;
    return this;
  }

  /**
   * indicated condition of the product
* possible values: Used, Refurbished, New, null
   * @return productCondition
   */
  @javax.annotation.Nullable
  public String getProductCondition() {
    return productCondition;
  }

  public void setProductCondition(String productCondition) {
    this.productCondition = productCondition;
  }


  public static final String SERIALIZED_NAME_PRODUCT_ANNOTATION = "product_annotation";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ANNOTATION)
  private String productAnnotation;

  public GoogleShoppingSellersShopsListElementItem productAnnotation(String productAnnotation) {
    this.productAnnotation = productAnnotation;
    return this;
  }

  /**
   * data from annotations and badges with special offers
* if there is no annotation for this product, the value will be null
* examples: LOW PRICE, SPECIAL OFFER, SALE, PRICE DROP
   * @return productAnnotation
   */
  @javax.annotation.Nullable
  public String getProductAnnotation() {
    return productAnnotation;
  }

  public void setProductAnnotation(String productAnnotation) {
    this.productAnnotation = productAnnotation;
  }


  public static final String SERIALIZED_NAME_PRODUCT_AVAILABILITY = "product_availability";
  @SerializedName(SERIALIZED_NAME_PRODUCT_AVAILABILITY)
  private String productAvailability;

  public GoogleShoppingSellersShopsListElementItem productAvailability(String productAvailability) {
    this.productAvailability = productAvailability;
    return this;
  }

  /**
   * product availability information
* product availability information
* can take the following values: in_stock, limited_stock, out_of_stock, backordered, pre_order_available, on_display_to_order
   * @return productAvailability
   */
  @javax.annotation.Nullable
  public String getProductAvailability() {
    return productAvailability;
  }

  public void setProductAvailability(String productAvailability) {
    this.productAvailability = productAvailability;
  }



  public GoogleShoppingSellersShopsListElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public GoogleShoppingSellersShopsListElementItem putAdditionalProperty(String key, Object value) {
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


    
    GoogleShoppingSellersShopsListElementItem googleShoppingSellersShopsListElementItem = (GoogleShoppingSellersShopsListElementItem) o;
    return

        Objects.equals(this.priceMultiplier, googleShoppingSellersShopsListElementItem.priceMultiplier) &&
        Objects.equals(this.displayedPaymentBreakdown, googleShoppingSellersShopsListElementItem.displayedPaymentBreakdown) &&
        Objects.equals(this.rating, googleShoppingSellersShopsListElementItem.rating) &&
        Objects.equals(this.productCondition, googleShoppingSellersShopsListElementItem.productCondition) &&
        Objects.equals(this.productAnnotation, googleShoppingSellersShopsListElementItem.productAnnotation) &&
        Objects.equals(this.productAvailability, googleShoppingSellersShopsListElementItem.productAvailability) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(priceMultiplier, displayedPaymentBreakdown, rating, productCondition, productAnnotation, productAvailability);
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
    sb.append("class GoogleShoppingSellersShopsListElementItem {\n");

    sb.append("    priceMultiplier: ").append(toIndentedString(priceMultiplier)).append("\n");
    sb.append("    displayedPaymentBreakdown: ").append(toIndentedString(displayedPaymentBreakdown)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    productCondition: ").append(toIndentedString(productCondition)).append("\n");
    sb.append("    productAnnotation: ").append(toIndentedString(productAnnotation)).append("\n");
    sb.append("    productAvailability: ").append(toIndentedString(productAvailability)).append("\n");
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
    openapiFields.add("shop_ad_aclk");
    
    openapiFields.add("price_multiplier");
    
    openapiFields.add("displayed_payment_breakdown");
    
    openapiFields.add("rating");
    
    openapiFields.add("product_condition");
    
    openapiFields.add("product_annotation");
    
    openapiFields.add("product_availability");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleShoppingSellersShopsListElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleShoppingSellersShopsListElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleShoppingSellersShopsListElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleShoppingSellersShopsListElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleShoppingSellersShopsListElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleShoppingSellersShopsListElementItem>() {
           @Override
           public void write(JsonWriter out, GoogleShoppingSellersShopsListElementItem value) throws IOException {
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
           public GoogleShoppingSellersShopsListElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleShoppingSellersShopsListElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static GoogleShoppingSellersShopsListElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleShoppingSellersShopsListElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
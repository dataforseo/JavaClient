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



public class AmazonApplicableVouchersItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AmazonApplicableVouchersItem type(String type) {
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


  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public AmazonApplicableVouchersItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * text of the voucher
   * @return text
   */
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public static final String SERIALIZED_NAME_FIXED_DISCOUNT = "fixed_discount";
  @SerializedName(SERIALIZED_NAME_FIXED_DISCOUNT)
  private Double fixedDiscount;

  public AmazonApplicableVouchersItem fixedDiscount(Double fixedDiscount) {
    this.fixedDiscount = fixedDiscount;
    return this;
  }

  /**
   * value of the fixed discount
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

  public AmazonApplicableVouchersItem fixedDiscountCurrency(String fixedDiscountCurrency) {
    this.fixedDiscountCurrency = fixedDiscountCurrency;
    return this;
  }

  /**
   * currency code of the fixed discount
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

  public AmazonApplicableVouchersItem percentageDiscount(Double percentageDiscount) {
    this.percentageDiscount = percentageDiscount;
    return this;
  }

  /**
   * value of the percentage discount
* if the discount is fixed, the value will be null
   * @return percentageDiscount
   */
  @javax.annotation.Nullable
  public Double getPercentageDiscount() {
    return percentageDiscount;
  }

  public void setPercentageDiscount(Double percentageDiscount) {
    this.percentageDiscount = percentageDiscount;
  }


  public static final String SERIALIZED_NAME_IMPORTANT_DETAILS = "important_details";
  @SerializedName(SERIALIZED_NAME_IMPORTANT_DETAILS)
  private String importantDetails;

  public AmazonApplicableVouchersItem importantDetails(String importantDetails) {
    this.importantDetails = importantDetails;
    return this;
  }

  /**
   * important details about the terms of discount vouchers
   * @return importantDetails
   */
  @javax.annotation.Nullable
  public String getImportantDetails() {
    return importantDetails;
  }

  public void setImportantDetails(String importantDetails) {
    this.importantDetails = importantDetails;
  }



  public AmazonApplicableVouchersItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AmazonApplicableVouchersItem putAdditionalProperty(String key, Object value) {
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


    
    AmazonApplicableVouchersItem amazonApplicableVouchersItem = (AmazonApplicableVouchersItem) o;
    return

        Objects.equals(this.type, amazonApplicableVouchersItem.type) &&
        Objects.equals(this.text, amazonApplicableVouchersItem.text) &&
        Objects.equals(this.fixedDiscount, amazonApplicableVouchersItem.fixedDiscount) &&
        Objects.equals(this.fixedDiscountCurrency, amazonApplicableVouchersItem.fixedDiscountCurrency) &&
        Objects.equals(this.percentageDiscount, amazonApplicableVouchersItem.percentageDiscount) &&
        Objects.equals(this.importantDetails, amazonApplicableVouchersItem.importantDetails);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, text, fixedDiscount, fixedDiscountCurrency, percentageDiscount, importantDetails);
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
    sb.append("class AmazonApplicableVouchersItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fixedDiscount: ").append(toIndentedString(fixedDiscount)).append("\n");
    sb.append("    fixedDiscountCurrency: ").append(toIndentedString(fixedDiscountCurrency)).append("\n");
    sb.append("    percentageDiscount: ").append(toIndentedString(percentageDiscount)).append("\n");
    sb.append("    importantDetails: ").append(toIndentedString(importantDetails)).append("\n");
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
    
    openapiFields.add("text");
    
    openapiFields.add("fixed_discount");
    
    openapiFields.add("fixed_discount_currency");
    
    openapiFields.add("percentage_discount");
    
    openapiFields.add("important_details");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AmazonApplicableVouchersItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmazonApplicableVouchersItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonApplicableVouchersItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonApplicableVouchersItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonApplicableVouchersItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonApplicableVouchersItem>() {
           @Override
           public void write(JsonWriter out, AmazonApplicableVouchersItem value) throws IOException {
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
           public AmazonApplicableVouchersItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AmazonApplicableVouchersItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AmazonApplicableVouchersItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonApplicableVouchersItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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
import io.github.dataforseo.client.model.AppendixSerpLimitsRatesDataInfo;
import java.io.IOException;
import java.util.Arrays;

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
 * AppendixMerchantAmazonInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class AppendixMerchantAmazonInfo {
  public static final String SERIALIZED_NAME_ASIN = "asin";
  @SerializedName(SERIALIZED_NAME_ASIN)
  private AppendixSerpLimitsRatesDataInfo asin;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private AppendixSerpLimitsRatesDataInfo products;

  public static final String SERIALIZED_NAME_SELLERS = "sellers";
  @SerializedName(SERIALIZED_NAME_SELLERS)
  private AppendixSerpLimitsRatesDataInfo sellers;

  public AppendixMerchantAmazonInfo() {
  }

  public AppendixMerchantAmazonInfo asin(AppendixSerpLimitsRatesDataInfo asin) {
    this.asin = asin;
    return this;
  }

  /**
   * Get asin
   * @return asin
   */
  @javax.annotation.Nullable
  public AppendixSerpLimitsRatesDataInfo getAsin() {
    return asin;
  }

  public void setAsin(AppendixSerpLimitsRatesDataInfo asin) {
    this.asin = asin;
  }


  public AppendixMerchantAmazonInfo products(AppendixSerpLimitsRatesDataInfo products) {
    this.products = products;
    return this;
  }

  /**
   * Get products
   * @return products
   */
  @javax.annotation.Nullable
  public AppendixSerpLimitsRatesDataInfo getProducts() {
    return products;
  }

  public void setProducts(AppendixSerpLimitsRatesDataInfo products) {
    this.products = products;
  }


  public AppendixMerchantAmazonInfo sellers(AppendixSerpLimitsRatesDataInfo sellers) {
    this.sellers = sellers;
    return this;
  }

  /**
   * Get sellers
   * @return sellers
   */
  @javax.annotation.Nullable
  public AppendixSerpLimitsRatesDataInfo getSellers() {
    return sellers;
  }

  public void setSellers(AppendixSerpLimitsRatesDataInfo sellers) {
    this.sellers = sellers;
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
   * @return the AppendixMerchantAmazonInfo instance itself
   */
  public AppendixMerchantAmazonInfo putAdditionalProperty(String key, Object value) {
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
    AppendixMerchantAmazonInfo appendixMerchantAmazonInfo = (AppendixMerchantAmazonInfo) o;
    return Objects.equals(this.asin, appendixMerchantAmazonInfo.asin) &&
        Objects.equals(this.products, appendixMerchantAmazonInfo.products) &&
        Objects.equals(this.sellers, appendixMerchantAmazonInfo.sellers)&&
        Objects.equals(this.additionalProperties, appendixMerchantAmazonInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asin, products, sellers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendixMerchantAmazonInfo {\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    sellers: ").append(toIndentedString(sellers)).append("\n");
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
    openapiFields.add("asin");
    openapiFields.add("products");
    openapiFields.add("sellers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixMerchantAmazonInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendixMerchantAmazonInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendixMerchantAmazonInfo is not found in the empty JSON string", AppendixMerchantAmazonInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `asin`
      if (jsonObj.get("asin") != null && !jsonObj.get("asin").isJsonNull()) {
        AppendixSerpLimitsRatesDataInfo.validateJsonElement(jsonObj.get("asin"));
      }
      // validate the optional field `products`
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        AppendixSerpLimitsRatesDataInfo.validateJsonElement(jsonObj.get("products"));
      }
      // validate the optional field `sellers`
      if (jsonObj.get("sellers") != null && !jsonObj.get("sellers").isJsonNull()) {
        AppendixSerpLimitsRatesDataInfo.validateJsonElement(jsonObj.get("sellers"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixMerchantAmazonInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixMerchantAmazonInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixMerchantAmazonInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixMerchantAmazonInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixMerchantAmazonInfo>() {
           @Override
           public void write(JsonWriter out, AppendixMerchantAmazonInfo value) throws IOException {
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
           public AppendixMerchantAmazonInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixMerchantAmazonInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AppendixMerchantAmazonInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppendixMerchantAmazonInfo
   * @throws IOException if the JSON string is invalid with respect to AppendixMerchantAmazonInfo
   */
  public static AppendixMerchantAmazonInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixMerchantAmazonInfo.class);
  }

  /**
   * Convert an instance of AppendixMerchantAmazonInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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


package org.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.dataforseo.client.model.PriceInfo;
import org.dataforseo.client.model.StoresCountInfo;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * DeliveryInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T20:18:33.613150200+03:00[Europe/Kiev]", comments = "Generator version: 7.4.0")
public class DeliveryInfo {
  public static final String SERIALIZED_NAME_DELIVERY_MESSAGE = "delivery_message";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MESSAGE)
  private String deliveryMessage;

  public static final String SERIALIZED_NAME_DELIVERY_PRICE = "delivery_price";
  @SerializedName(SERIALIZED_NAME_DELIVERY_PRICE)
  private PriceInfo deliveryPrice;

  public static final String SERIALIZED_NAME_STORES_COUNT_INFO = "stores_count_info";
  @SerializedName(SERIALIZED_NAME_STORES_COUNT_INFO)
  private StoresCountInfo storesCountInfo;

  public DeliveryInfo() {
  }

  public DeliveryInfo deliveryMessage(String deliveryMessage) {
    this.deliveryMessage = deliveryMessage;
    return this;
  }

   /**
   * delivery information message accompanying the delivery information as posted by the seller
   * @return deliveryMessage
  **/
  @javax.annotation.Nullable
  public String getDeliveryMessage() {
    return deliveryMessage;
  }

  public void setDeliveryMessage(String deliveryMessage) {
    this.deliveryMessage = deliveryMessage;
  }


  public DeliveryInfo deliveryPrice(PriceInfo deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
    return this;
  }

   /**
   * Get deliveryPrice
   * @return deliveryPrice
  **/
  @javax.annotation.Nullable
  public PriceInfo getDeliveryPrice() {
    return deliveryPrice;
  }

  public void setDeliveryPrice(PriceInfo deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
  }


  public DeliveryInfo storesCountInfo(StoresCountInfo storesCountInfo) {
    this.storesCountInfo = storesCountInfo;
    return this;
  }

   /**
   * Get storesCountInfo
   * @return storesCountInfo
  **/
  @javax.annotation.Nullable
  public StoresCountInfo getStoresCountInfo() {
    return storesCountInfo;
  }

  public void setStoresCountInfo(StoresCountInfo storesCountInfo) {
    this.storesCountInfo = storesCountInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryInfo deliveryInfo = (DeliveryInfo) o;
    return Objects.equals(this.deliveryMessage, deliveryInfo.deliveryMessage) &&
        Objects.equals(this.deliveryPrice, deliveryInfo.deliveryPrice) &&
        Objects.equals(this.storesCountInfo, deliveryInfo.storesCountInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMessage, deliveryPrice, storesCountInfo);
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
    sb.append("class DeliveryInfo {\n");
    sb.append("    deliveryMessage: ").append(toIndentedString(deliveryMessage)).append("\n");
    sb.append("    deliveryPrice: ").append(toIndentedString(deliveryPrice)).append("\n");
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
    openapiFields.add("delivery_message");
    openapiFields.add("delivery_price");
    openapiFields.add("stores_count_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeliveryInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeliveryInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryInfo is not found in the empty JSON string", DeliveryInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeliveryInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("delivery_message") != null && !jsonObj.get("delivery_message").isJsonNull()) && !jsonObj.get("delivery_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_message").toString()));
      }
      // validate the optional field `delivery_price`
      if (jsonObj.get("delivery_price") != null && !jsonObj.get("delivery_price").isJsonNull()) {
        PriceInfo.validateJsonElement(jsonObj.get("delivery_price"));
      }
      // validate the optional field `stores_count_info`
      if (jsonObj.get("stores_count_info") != null && !jsonObj.get("stores_count_info").isJsonNull()) {
        StoresCountInfo.validateJsonElement(jsonObj.get("stores_count_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryInfo>() {
           @Override
           public void write(JsonWriter out, DeliveryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryInfo
  * @throws IOException if the JSON string is invalid with respect to DeliveryInfo
  */
  public static DeliveryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryInfo.class);
  }

 /**
  * Convert an instance of DeliveryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

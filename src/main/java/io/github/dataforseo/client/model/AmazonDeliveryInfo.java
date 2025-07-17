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



public class AmazonDeliveryInfo  {


  public static final String SERIALIZED_NAME_DELIVERY_MESSAGE = "delivery_message";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MESSAGE)
  private String deliveryMessage;

  public AmazonDeliveryInfo deliveryMessage(String deliveryMessage) {
    this.deliveryMessage = deliveryMessage;
    return this;
  }

  /**
   * message accompanying the delivery information as posted by the seller
   * @return deliveryMessage
   */
  @javax.annotation.Nullable
  public String getDeliveryMessage() {
    return deliveryMessage;
  }

  public void setDeliveryMessage(String deliveryMessage) {
    this.deliveryMessage = deliveryMessage;
  }


  public static final String SERIALIZED_NAME_DELIVERY_DATE_FROM = "delivery_date_from";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE_FROM)
  private String deliveryDateFrom;

  public AmazonDeliveryInfo deliveryDateFrom(String deliveryDateFrom) {
    this.deliveryDateFrom = deliveryDateFrom;
    return this;
  }

  /**
   * the earliest date when the product can be shipped
   * @return deliveryDateFrom
   */
  @javax.annotation.Nullable
  public String getDeliveryDateFrom() {
    return deliveryDateFrom;
  }

  public void setDeliveryDateFrom(String deliveryDateFrom) {
    this.deliveryDateFrom = deliveryDateFrom;
  }


  public static final String SERIALIZED_NAME_DELIVERY_DATE_TO = "delivery_date_to";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE_TO)
  private String deliveryDateTo;

  public AmazonDeliveryInfo deliveryDateTo(String deliveryDateTo) {
    this.deliveryDateTo = deliveryDateTo;
    return this;
  }

  /**
   * the latest date when the product can be delivered
   * @return deliveryDateTo
   */
  @javax.annotation.Nullable
  public String getDeliveryDateTo() {
    return deliveryDateTo;
  }

  public void setDeliveryDateTo(String deliveryDateTo) {
    this.deliveryDateTo = deliveryDateTo;
  }


  public static final String SERIALIZED_NAME_FASTEST_DELIVERY_DATE_FROM = "fastest_delivery_date_from";
  @SerializedName(SERIALIZED_NAME_FASTEST_DELIVERY_DATE_FROM)
  private String fastestDeliveryDateFrom;

  public AmazonDeliveryInfo fastestDeliveryDateFrom(String fastestDeliveryDateFrom) {
    this.fastestDeliveryDateFrom = fastestDeliveryDateFrom;
    return this;
  }

  /**
   * the earliest date when the product can be delivered with a fast delivery option
   * @return fastestDeliveryDateFrom
   */
  @javax.annotation.Nullable
  public String getFastestDeliveryDateFrom() {
    return fastestDeliveryDateFrom;
  }

  public void setFastestDeliveryDateFrom(String fastestDeliveryDateFrom) {
    this.fastestDeliveryDateFrom = fastestDeliveryDateFrom;
  }


  public static final String SERIALIZED_NAME_FASTEST_DELIVERY_DATE_TO = "fastest_delivery_date_to";
  @SerializedName(SERIALIZED_NAME_FASTEST_DELIVERY_DATE_TO)
  private String fastestDeliveryDateTo;

  public AmazonDeliveryInfo fastestDeliveryDateTo(String fastestDeliveryDateTo) {
    this.fastestDeliveryDateTo = fastestDeliveryDateTo;
    return this;
  }

  /**
   * the latest date when the product can be delivered with a fast delivery option
   * @return fastestDeliveryDateTo
   */
  @javax.annotation.Nullable
  public String getFastestDeliveryDateTo() {
    return fastestDeliveryDateTo;
  }

  public void setFastestDeliveryDateTo(String fastestDeliveryDateTo) {
    this.fastestDeliveryDateTo = fastestDeliveryDateTo;
  }


  public static final String SERIALIZED_NAME_DELIVERY_PRICE = "delivery_price";
  @SerializedName(SERIALIZED_NAME_DELIVERY_PRICE)
  private PriceInfo deliveryPrice;

  public AmazonDeliveryInfo deliveryPrice(PriceInfo deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
    return this;
  }

  /**
   * price for the delivery
* price of the delivery based on the location you specified in the POST request;
* if free delivery is available, the value is null
   * @return deliveryPrice
   */
  @javax.annotation.Nullable
  public PriceInfo getDeliveryPrice() {
    return deliveryPrice;
  }

  public void setDeliveryPrice(PriceInfo deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
  }



  public AmazonDeliveryInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AmazonDeliveryInfo putAdditionalProperty(String key, Object value) {
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


    
    AmazonDeliveryInfo amazonDeliveryInfo = (AmazonDeliveryInfo) o;
    return

        Objects.equals(this.deliveryMessage, amazonDeliveryInfo.deliveryMessage) &&
        Objects.equals(this.deliveryDateFrom, amazonDeliveryInfo.deliveryDateFrom) &&
        Objects.equals(this.deliveryDateTo, amazonDeliveryInfo.deliveryDateTo) &&
        Objects.equals(this.fastestDeliveryDateFrom, amazonDeliveryInfo.fastestDeliveryDateFrom) &&
        Objects.equals(this.fastestDeliveryDateTo, amazonDeliveryInfo.fastestDeliveryDateTo) &&
        Objects.equals(this.deliveryPrice, amazonDeliveryInfo.deliveryPrice);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(deliveryMessage, deliveryDateFrom, deliveryDateTo, fastestDeliveryDateFrom, fastestDeliveryDateTo, deliveryPrice);
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
    sb.append("class AmazonDeliveryInfo {\n");

    sb.append("    deliveryMessage: ").append(toIndentedString(deliveryMessage)).append("\n");
    sb.append("    deliveryDateFrom: ").append(toIndentedString(deliveryDateFrom)).append("\n");
    sb.append("    deliveryDateTo: ").append(toIndentedString(deliveryDateTo)).append("\n");
    sb.append("    fastestDeliveryDateFrom: ").append(toIndentedString(fastestDeliveryDateFrom)).append("\n");
    sb.append("    fastestDeliveryDateTo: ").append(toIndentedString(fastestDeliveryDateTo)).append("\n");
    sb.append("    deliveryPrice: ").append(toIndentedString(deliveryPrice)).append("\n");
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
    
    openapiFields.add("delivery_date_from");
    
    openapiFields.add("delivery_date_to");
    
    openapiFields.add("fastest_delivery_date_from");
    
    openapiFields.add("fastest_delivery_date_to");
    
    openapiFields.add("delivery_price");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AmazonDeliveryInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmazonDeliveryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonDeliveryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonDeliveryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonDeliveryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonDeliveryInfo>() {
           @Override
           public void write(JsonWriter out, AmazonDeliveryInfo value) throws IOException {
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
           public AmazonDeliveryInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AmazonDeliveryInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AmazonDeliveryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonDeliveryInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
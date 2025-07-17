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



public class HotelPriceItemInfo  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public HotelPriceItemInfo type(String type) {
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


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public HotelPriceItemInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the hotel
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public HotelPriceItemInfo price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * price per night
   * @return price
   */
  @javax.annotation.Nullable
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public HotelPriceItemInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * price currency
* USD is applied by default, unless specified in the POST array
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public HotelPriceItemInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * third-party page url
* URL to the third-party website page with pricing information
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

  public HotelPriceItemInfo domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * third-party domain
* domain of the third-party website page with pricing information
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  private Boolean isPaid;

  public HotelPriceItemInfo isPaid(Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  /**
   * indicates a paid hotel listing
* if true, related hotel_search_item is a paid ad
* if false, related hotel_search_item is an organic hotel listing
   * @return isPaid
   */
  @javax.annotation.Nullable
  public Boolean getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }


  public static final String SERIALIZED_NAME_FREE_CANCELLATION_UNTIL = "free_cancellation_until";
  @SerializedName(SERIALIZED_NAME_FREE_CANCELLATION_UNTIL)
  private String freeCancellationUntil;

  public HotelPriceItemInfo freeCancellationUntil(String freeCancellationUntil) {
    this.freeCancellationUntil = freeCancellationUntil;
    return this;
  }

  /**
   * date until which free cancellation is available
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* equals null if free cancellation is not available for the selected dates
   * @return freeCancellationUntil
   */
  @javax.annotation.Nullable
  public String getFreeCancellationUntil() {
    return freeCancellationUntil;
  }

  public void setFreeCancellationUntil(String freeCancellationUntil) {
    this.freeCancellationUntil = freeCancellationUntil;
  }


  public static final String SERIALIZED_NAME_OFFERS = "offers";
  @SerializedName(SERIALIZED_NAME_OFFERS)
  private List<HotelInfoPriceOffer> offers;

  public HotelPriceItemInfo offers(List<HotelInfoPriceOffer> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * featured price offers
   * @return offers
   */
  @javax.annotation.Nullable
  public List<HotelInfoPriceOffer> getOffers() {
    return offers;
  }

  public void setOffers(List<HotelInfoPriceOffer> offers) {
    this.offers = offers;
  }



  public HotelPriceItemInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public HotelPriceItemInfo putAdditionalProperty(String key, Object value) {
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


    
    HotelPriceItemInfo hotelPriceItemInfo = (HotelPriceItemInfo) o;
    return

        Objects.equals(this.type, hotelPriceItemInfo.type) &&
        Objects.equals(this.title, hotelPriceItemInfo.title) &&
        Objects.equals(this.price, hotelPriceItemInfo.price) &&
        Objects.equals(this.currency, hotelPriceItemInfo.currency) &&
        Objects.equals(this.url, hotelPriceItemInfo.url) &&
        Objects.equals(this.domain, hotelPriceItemInfo.domain) &&
        Objects.equals(this.isPaid, hotelPriceItemInfo.isPaid) &&
        Objects.equals(this.freeCancellationUntil, hotelPriceItemInfo.freeCancellationUntil) &&
        Objects.equals(this.offers, hotelPriceItemInfo.offers);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, title, price, currency, url, domain, isPaid, freeCancellationUntil, offers);
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
    sb.append("class HotelPriceItemInfo {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    freeCancellationUntil: ").append(toIndentedString(freeCancellationUntil)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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
    
    openapiFields.add("title");
    
    openapiFields.add("price");
    
    openapiFields.add("currency");
    
    openapiFields.add("url");
    
    openapiFields.add("domain");
    
    openapiFields.add("is_paid");
    
    openapiFields.add("free_cancellation_until");
    
    openapiFields.add("offers");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HotelPriceItemInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelPriceItemInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelPriceItemInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelPriceItemInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelPriceItemInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelPriceItemInfo>() {
           @Override
           public void write(JsonWriter out, HotelPriceItemInfo value) throws IOException {
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
           public HotelPriceItemInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             HotelPriceItemInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static HotelPriceItemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelPriceItemInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
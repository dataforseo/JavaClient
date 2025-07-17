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



public class HotelAboutInfo  {


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public HotelAboutInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the hotel
* the description of the hotel entity for which the results are collected
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_SUB_DESCRIPTIONS = "sub_descriptions";
  @SerializedName(SERIALIZED_NAME_SUB_DESCRIPTIONS)
  private List<String> subDescriptions;

  public HotelAboutInfo subDescriptions(List<String> subDescriptions) {
    this.subDescriptions = subDescriptions;
    return this;
  }

  /**
   * additional description of the hotel
* details about the hotel provided in addition to the description
   * @return subDescriptions
   */
  @javax.annotation.Nullable
  public List<String> getSubDescriptions() {
    return subDescriptions;
  }

  public void setSubDescriptions(List<String> subDescriptions) {
    this.subDescriptions = subDescriptions;
  }


  public static final String SERIALIZED_NAME_CHECK_IN_TIME = "check_in_time";
  @SerializedName(SERIALIZED_NAME_CHECK_IN_TIME)
  private TimeInfo checkInTime;

  public HotelAboutInfo checkInTime(TimeInfo checkInTime) {
    this.checkInTime = checkInTime;
    return this;
  }

  /**
   * hotel check-in time
* check-in time indicated in the hotel listing
   * @return checkInTime
   */
  @javax.annotation.Nullable
  public TimeInfo getCheckInTime() {
    return checkInTime;
  }

  public void setCheckInTime(TimeInfo checkInTime) {
    this.checkInTime = checkInTime;
  }


  public static final String SERIALIZED_NAME_CHECK_OUT_TIME = "check_out_time";
  @SerializedName(SERIALIZED_NAME_CHECK_OUT_TIME)
  private TimeInfo checkOutTime;

  public HotelAboutInfo checkOutTime(TimeInfo checkOutTime) {
    this.checkOutTime = checkOutTime;
    return this;
  }

  /**
   * hotel check-out time
* check-out time indicated in the hotel listing
   * @return checkOutTime
   */
  @javax.annotation.Nullable
  public TimeInfo getCheckOutTime() {
    return checkOutTime;
  }

  public void setCheckOutTime(TimeInfo checkOutTime) {
    this.checkOutTime = checkOutTime;
  }


  public static final String SERIALIZED_NAME_FULL_ADDRESS = "full_address";
  @SerializedName(SERIALIZED_NAME_FULL_ADDRESS)
  private String fullAddress;

  public HotelAboutInfo fullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
    return this;
  }

  /**
   * full address of the hotel
* address of the hotel indicated in the standardised format
   * @return fullAddress
   */
  @javax.annotation.Nullable
  public String getFullAddress() {
    return fullAddress;
  }

  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public HotelAboutInfo domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * hotel domain
* domain of the hotel’s website
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public HotelAboutInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * hotel url
* URL to the hotel’s website indicated in the listing
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_AMENITIES = "amenities";
  @SerializedName(SERIALIZED_NAME_AMENITIES)
  private List<HotelAmenityInfo> amenities;

  public HotelAboutInfo amenities(List<HotelAmenityInfo> amenities) {
    this.amenities = amenities;
    return this;
  }

  /**
   * hotel amenities
* information about hotel amenities
   * @return amenities
   */
  @javax.annotation.Nullable
  public List<HotelAmenityInfo> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<HotelAmenityInfo> amenities) {
    this.amenities = amenities;
  }


  public static final String SERIALIZED_NAME_POPULAR_AMENITIES = "popular_amenities";
  @SerializedName(SERIALIZED_NAME_POPULAR_AMENITIES)
  private List<HotelAmenityItemInfo> popularAmenities;

  public HotelAboutInfo popularAmenities(List<HotelAmenityItemInfo> popularAmenities) {
    this.popularAmenities = popularAmenities;
    return this;
  }

  /**
   * hotel amenities
* information about hotel amenities labelled as “popular”
   * @return popularAmenities
   */
  @javax.annotation.Nullable
  public List<HotelAmenityItemInfo> getPopularAmenities() {
    return popularAmenities;
  }

  public void setPopularAmenities(List<HotelAmenityItemInfo> popularAmenities) {
    this.popularAmenities = popularAmenities;
  }



  public HotelAboutInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public HotelAboutInfo putAdditionalProperty(String key, Object value) {
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


    
    HotelAboutInfo hotelAboutInfo = (HotelAboutInfo) o;
    return

        Objects.equals(this.description, hotelAboutInfo.description) &&
        Objects.equals(this.subDescriptions, hotelAboutInfo.subDescriptions) &&
        Objects.equals(this.checkInTime, hotelAboutInfo.checkInTime) &&
        Objects.equals(this.checkOutTime, hotelAboutInfo.checkOutTime) &&
        Objects.equals(this.fullAddress, hotelAboutInfo.fullAddress) &&
        Objects.equals(this.domain, hotelAboutInfo.domain) &&
        Objects.equals(this.url, hotelAboutInfo.url) &&
        Objects.equals(this.amenities, hotelAboutInfo.amenities) &&
        Objects.equals(this.popularAmenities, hotelAboutInfo.popularAmenities);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(description, subDescriptions, checkInTime, checkOutTime, fullAddress, domain, url, amenities, popularAmenities);
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
    sb.append("class HotelAboutInfo {\n");

    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subDescriptions: ").append(toIndentedString(subDescriptions)).append("\n");
    sb.append("    checkInTime: ").append(toIndentedString(checkInTime)).append("\n");
    sb.append("    checkOutTime: ").append(toIndentedString(checkOutTime)).append("\n");
    sb.append("    fullAddress: ").append(toIndentedString(fullAddress)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    amenities: ").append(toIndentedString(amenities)).append("\n");
    sb.append("    popularAmenities: ").append(toIndentedString(popularAmenities)).append("\n");
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
    
    openapiFields.add("description");
    
    openapiFields.add("sub_descriptions");
    
    openapiFields.add("check_in_time");
    
    openapiFields.add("check_out_time");
    
    openapiFields.add("full_address");
    
    openapiFields.add("domain");
    
    openapiFields.add("url");
    
    openapiFields.add("amenities");
    
    openapiFields.add("popular_amenities");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HotelAboutInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelAboutInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelAboutInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelAboutInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelAboutInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelAboutInfo>() {
           @Override
           public void write(JsonWriter out, HotelAboutInfo value) throws IOException {
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
           public HotelAboutInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             HotelAboutInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static HotelAboutInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelAboutInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
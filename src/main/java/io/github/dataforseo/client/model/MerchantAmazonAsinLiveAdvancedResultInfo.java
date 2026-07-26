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


public class MerchantAmazonAsinLiveAdvancedResultInfo  {


  public static final String SERIALIZED_NAME_ASIN = "asin";
  @SerializedName(SERIALIZED_NAME_ASIN)
  private String asin;

  public MerchantAmazonAsinLiveAdvancedResultInfo asin(String asin) {
    this.asin = asin;
    return this;
  }

  /**
   * <em>ASIN received in a POST array</em><br>the unique product identifier in Amazon (ASIN) received in a POST array<br>learn more about the identified in <a href='https://dataforseo.com/help-center/asin-in-amazon-api' rel='noopener noreferrer' target='_blank'>this help center guide</a>
   * @return asin
   */
  @javax.annotation.Nullable
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public MerchantAmazonAsinLiveAdvancedResultInfo type(String type) {
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


  public static final String SERIALIZED_NAME_SE_DOMAIN = "se_domain";
  @SerializedName(SERIALIZED_NAME_SE_DOMAIN)
  private String seDomain;

  public MerchantAmazonAsinLiveAdvancedResultInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * <em>Amazon domain in a POST array</em>
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public MerchantAmazonAsinLiveAdvancedResultInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>location code in a POST array</em>
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public MerchantAmazonAsinLiveAdvancedResultInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>language code in a POST array</em>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_CHECK_URL = "check_url";
  @SerializedName(SERIALIZED_NAME_CHECK_URL)
  private String checkUrl;

  public MerchantAmazonAsinLiveAdvancedResultInfo checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * <em>direct URL to Amazon results</em><br>you can use it to make sure that we provided accurate results
   * @return checkUrl
   */
  @javax.annotation.Nullable
  public String getCheckUrl() {
    return checkUrl;
  }

  public void setCheckUrl(String checkUrl) {
    this.checkUrl = checkUrl;
  }


  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private String datetime;

  public MerchantAmazonAsinLiveAdvancedResultInfo datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * <em>date and time when the result was received</em><br>in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>example:<br><code class='long-string'>2019-11-15 12:57:46 +00:00</code>
   * @return datetime
   */
  @javax.annotation.Nullable
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }


  public static final String SERIALIZED_NAME_ITEM_TYPES = "item_types";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPES)
  private List<String> itemTypes;

  public MerchantAmazonAsinLiveAdvancedResultInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  /**
   * <em>types of search results found on Amazon</em><br>contains types of all search results (<code>items</code>) found in the returned SERP<br>possible item types:<br><code>amazon_product_info</code>
   * @return itemTypes
   */
  @javax.annotation.Nullable
  public List<String> getItemTypes() {
    return itemTypes;
  }

  public void setItemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public MerchantAmazonAsinLiveAdvancedResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  /**
   * <em>the number of results returned in the <strong><code>items</code></strong> array</em>
   * @return itemsCount
   */
  @javax.annotation.Nullable
  public Long getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
  }


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AmazonProductInfo> items;

  public MerchantAmazonAsinLiveAdvancedResultInfo items(List<AmazonProductInfo> items) {
    this.items = items;
    return this;
  }

  /**
   * <em>Amazon product info items</em>
   * @return items
   */
  @javax.annotation.Nullable
  public List<AmazonProductInfo> getItems() {
    return items;
  }

  public void setItems(List<AmazonProductInfo> items) {
    this.items = items;
  }



  public MerchantAmazonAsinLiveAdvancedResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public MerchantAmazonAsinLiveAdvancedResultInfo putAdditionalProperty(String key, Object value) {
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


    
    MerchantAmazonAsinLiveAdvancedResultInfo merchantAmazonAsinLiveAdvancedResultInfo = (MerchantAmazonAsinLiveAdvancedResultInfo) o;
    return

        Objects.equals(this.asin, merchantAmazonAsinLiveAdvancedResultInfo.asin) &&
        Objects.equals(this.type, merchantAmazonAsinLiveAdvancedResultInfo.type) &&
        Objects.equals(this.seDomain, merchantAmazonAsinLiveAdvancedResultInfo.seDomain) &&
        Objects.equals(this.locationCode, merchantAmazonAsinLiveAdvancedResultInfo.locationCode) &&
        Objects.equals(this.languageCode, merchantAmazonAsinLiveAdvancedResultInfo.languageCode) &&
        Objects.equals(this.checkUrl, merchantAmazonAsinLiveAdvancedResultInfo.checkUrl) &&
        Objects.equals(this.datetime, merchantAmazonAsinLiveAdvancedResultInfo.datetime) &&
        Objects.equals(this.itemTypes, merchantAmazonAsinLiveAdvancedResultInfo.itemTypes) &&
        Objects.equals(this.itemsCount, merchantAmazonAsinLiveAdvancedResultInfo.itemsCount) &&
        Objects.equals(this.items, merchantAmazonAsinLiveAdvancedResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(asin, type, seDomain, locationCode, languageCode, checkUrl, datetime, itemTypes, itemsCount, items);
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
    sb.append("class MerchantAmazonAsinLiveAdvancedResultInfo {\n");

    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    
    openapiFields.add("type");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_code");
    
    openapiFields.add("check_url");
    
    openapiFields.add("datetime");
    
    openapiFields.add("item_types");
    
    openapiFields.add("items_count");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MerchantAmazonAsinLiveAdvancedResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantAmazonAsinLiveAdvancedResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantAmazonAsinLiveAdvancedResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantAmazonAsinLiveAdvancedResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantAmazonAsinLiveAdvancedResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantAmazonAsinLiveAdvancedResultInfo>() {
           @Override
           public void write(JsonWriter out, MerchantAmazonAsinLiveAdvancedResultInfo value) throws IOException {
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
           public MerchantAmazonAsinLiveAdvancedResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MerchantAmazonAsinLiveAdvancedResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static MerchantAmazonAsinLiveAdvancedResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantAmazonAsinLiveAdvancedResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
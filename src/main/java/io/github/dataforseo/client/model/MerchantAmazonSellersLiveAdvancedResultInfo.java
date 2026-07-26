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


public class MerchantAmazonSellersLiveAdvancedResultInfo  {


  public static final String SERIALIZED_NAME_ASIN = "asin";
  @SerializedName(SERIALIZED_NAME_ASIN)
  private String asin;

  public MerchantAmazonSellersLiveAdvancedResultInfo asin(String asin) {
    this.asin = asin;
    return this;
  }

  /**
   * <em><code>asin</code> received in a POST array</em><br>learn more about ASINs in <a href='https://dataforseo.com/help-center/asin-in-amazon-api' rel='noopener noreferrer' target='_blank'>this help center guide</a>
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

  public MerchantAmazonSellersLiveAdvancedResultInfo type(String type) {
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

  public MerchantAmazonSellersLiveAdvancedResultInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * <em>search engine domain received in a POST array</em>
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

  public MerchantAmazonSellersLiveAdvancedResultInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>location code received in a POST array</em>
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

  public MerchantAmazonSellersLiveAdvancedResultInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>language code received in a POST array</em>
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

  public MerchantAmazonSellersLiveAdvancedResultInfo checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * <em>direct URL to Amazon results</em><br>you can use it to make sure the provided results are accurate
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

  public MerchantAmazonSellersLiveAdvancedResultInfo datetime(String datetime) {
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


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public MerchantAmazonSellersLiveAdvancedResultInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <em>product title</em><br>title of the product relevant to the <code>asin</code> received in a POST array
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public MerchantAmazonSellersLiveAdvancedResultInfo image(String image) {
    this.image = image;
    return this;
  }

  /**
   * <em>product image url</em><br>image URL of the product relevant to the <code>asin</code> received in a POST array
   * @return image
   */
  @javax.annotation.Nullable
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public static final String SERIALIZED_NAME_ITEM_TYPES = "item_types";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPES)
  private List<String> itemTypes;

  public MerchantAmazonSellersLiveAdvancedResultInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  /**
   * <em>types of search results found in Amazon Sellers SERP</em><br>contains types of all search results (<code>items</code>) found in the returned SERP<br>possible item types:<br><code>amazon_seller_main_item</code>, <code>amazon_seller_item</code>
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

  public MerchantAmazonSellersLiveAdvancedResultInfo itemsCount(Long itemsCount) {
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
  private List<BaseMerchantAmazonSellersElementItem> items;

  public MerchantAmazonSellersLiveAdvancedResultInfo items(List<BaseMerchantAmazonSellersElementItem> items) {
    this.items = items;
    return this;
  }

  /**
   * <em>items in SERP</em>
   * @return items
   */
  @javax.annotation.Nullable
  public List<BaseMerchantAmazonSellersElementItem> getItems() {
    return items;
  }

  public void setItems(List<BaseMerchantAmazonSellersElementItem> items) {
    this.items = items;
  }



  public MerchantAmazonSellersLiveAdvancedResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public MerchantAmazonSellersLiveAdvancedResultInfo putAdditionalProperty(String key, Object value) {
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


    
    MerchantAmazonSellersLiveAdvancedResultInfo merchantAmazonSellersLiveAdvancedResultInfo = (MerchantAmazonSellersLiveAdvancedResultInfo) o;
    return

        Objects.equals(this.asin, merchantAmazonSellersLiveAdvancedResultInfo.asin) &&
        Objects.equals(this.type, merchantAmazonSellersLiveAdvancedResultInfo.type) &&
        Objects.equals(this.seDomain, merchantAmazonSellersLiveAdvancedResultInfo.seDomain) &&
        Objects.equals(this.locationCode, merchantAmazonSellersLiveAdvancedResultInfo.locationCode) &&
        Objects.equals(this.languageCode, merchantAmazonSellersLiveAdvancedResultInfo.languageCode) &&
        Objects.equals(this.checkUrl, merchantAmazonSellersLiveAdvancedResultInfo.checkUrl) &&
        Objects.equals(this.datetime, merchantAmazonSellersLiveAdvancedResultInfo.datetime) &&
        Objects.equals(this.title, merchantAmazonSellersLiveAdvancedResultInfo.title) &&
        Objects.equals(this.image, merchantAmazonSellersLiveAdvancedResultInfo.image) &&
        Objects.equals(this.itemTypes, merchantAmazonSellersLiveAdvancedResultInfo.itemTypes) &&
        Objects.equals(this.itemsCount, merchantAmazonSellersLiveAdvancedResultInfo.itemsCount) &&
        Objects.equals(this.items, merchantAmazonSellersLiveAdvancedResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(asin, type, seDomain, locationCode, languageCode, checkUrl, datetime, title, image, itemTypes, itemsCount, items);
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
    sb.append("class MerchantAmazonSellersLiveAdvancedResultInfo {\n");

    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
    
    openapiFields.add("title");
    
    openapiFields.add("image");
    
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
   * @throws IOException if the JSON Element is invalid with respect to MerchantAmazonSellersLiveAdvancedResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantAmazonSellersLiveAdvancedResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantAmazonSellersLiveAdvancedResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantAmazonSellersLiveAdvancedResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantAmazonSellersLiveAdvancedResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantAmazonSellersLiveAdvancedResultInfo>() {
           @Override
           public void write(JsonWriter out, MerchantAmazonSellersLiveAdvancedResultInfo value) throws IOException {
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
           public MerchantAmazonSellersLiveAdvancedResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MerchantAmazonSellersLiveAdvancedResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static MerchantAmazonSellersLiveAdvancedResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantAmazonSellersLiveAdvancedResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
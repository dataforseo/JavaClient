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



public class BusinessDataTrustpilotReviewsTaskGetResultInfo  {


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public BusinessDataTrustpilotReviewsTaskGetResultInfo domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain of the business entity
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BusinessDataTrustpilotReviewsTaskGetResultInfo type(String type) {
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

  public BusinessDataTrustpilotReviewsTaskGetResultInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * search engine domain in a POST array
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_CHECK_URL = "check_url";
  @SerializedName(SERIALIZED_NAME_CHECK_URL)
  private String checkUrl;

  public BusinessDataTrustpilotReviewsTaskGetResultInfo checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * direct URL to search engine results
* you can use it to make sure that we provided accurate results
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

  public BusinessDataTrustpilotReviewsTaskGetResultInfo datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * date and time when the result was received
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
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

  public BusinessDataTrustpilotReviewsTaskGetResultInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the ‘reviews’ element on Trustpilot
* the name of the business entity for which the reviews are collected
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public BusinessDataTrustpilotReviewsTaskGetResultInfo location(String location) {
    this.location = location;
    return this;
  }

  /**
   * location of the business entity as specified on Trustpilot
* address of the business entity for which the reviews are collected
   * @return location
   */
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public static final String SERIALIZED_NAME_REVIEWS_COUNT = "reviews_count";
  @SerializedName(SERIALIZED_NAME_REVIEWS_COUNT)
  private String reviewsCount;

  public BusinessDataTrustpilotReviewsTaskGetResultInfo reviewsCount(String reviewsCount) {
    this.reviewsCount = reviewsCount;
    return this;
  }

  /**
   * the total number of reviews
   * @return reviewsCount
   */
  @javax.annotation.Nullable
  public String getReviewsCount() {
    return reviewsCount;
  }

  public void setReviewsCount(String reviewsCount) {
    this.reviewsCount = reviewsCount;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private Object rating;

  public BusinessDataTrustpilotReviewsTaskGetResultInfo rating(Object rating) {
    this.rating = rating;
    return this;
  }

  /**
   * rating of the corresponding business entity
* popularity rate based on reviews and displayed in SERP
   * @return rating
   */
  @javax.annotation.Nullable
  public Object getRating() {
    return rating;
  }

  public void setRating(Object rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public BusinessDataTrustpilotReviewsTaskGetResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  /**
   * the number of items in the results array
* you can get more results by using the depth parameter when setting a task
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
  private List<TrustpilotReviewSearch> items;

  public BusinessDataTrustpilotReviewsTaskGetResultInfo items(List<TrustpilotReviewSearch> items) {
    this.items = items;
    return this;
  }

  /**
   * found reviews
* you can get more results by using the depth parameter when setting a task
   * @return items
   */
  @javax.annotation.Nullable
  public List<TrustpilotReviewSearch> getItems() {
    return items;
  }

  public void setItems(List<TrustpilotReviewSearch> items) {
    this.items = items;
  }



  public BusinessDataTrustpilotReviewsTaskGetResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BusinessDataTrustpilotReviewsTaskGetResultInfo putAdditionalProperty(String key, Object value) {
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


    
    BusinessDataTrustpilotReviewsTaskGetResultInfo businessDataTrustpilotReviewsTaskGetResultInfo = (BusinessDataTrustpilotReviewsTaskGetResultInfo) o;
    return

        Objects.equals(this.domain, businessDataTrustpilotReviewsTaskGetResultInfo.domain) &&
        Objects.equals(this.type, businessDataTrustpilotReviewsTaskGetResultInfo.type) &&
        Objects.equals(this.seDomain, businessDataTrustpilotReviewsTaskGetResultInfo.seDomain) &&
        Objects.equals(this.checkUrl, businessDataTrustpilotReviewsTaskGetResultInfo.checkUrl) &&
        Objects.equals(this.datetime, businessDataTrustpilotReviewsTaskGetResultInfo.datetime) &&
        Objects.equals(this.title, businessDataTrustpilotReviewsTaskGetResultInfo.title) &&
        Objects.equals(this.location, businessDataTrustpilotReviewsTaskGetResultInfo.location) &&
        Objects.equals(this.reviewsCount, businessDataTrustpilotReviewsTaskGetResultInfo.reviewsCount) &&
        Objects.equals(this.rating, businessDataTrustpilotReviewsTaskGetResultInfo.rating) &&
        Objects.equals(this.itemsCount, businessDataTrustpilotReviewsTaskGetResultInfo.itemsCount) &&
        Objects.equals(this.items, businessDataTrustpilotReviewsTaskGetResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(domain, type, seDomain, checkUrl, datetime, title, location, reviewsCount, rating, itemsCount, items);
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
    sb.append("class BusinessDataTrustpilotReviewsTaskGetResultInfo {\n");

    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    reviewsCount: ").append(toIndentedString(reviewsCount)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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
    
    openapiFields.add("domain");
    
    openapiFields.add("type");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("check_url");
    
    openapiFields.add("datetime");
    
    openapiFields.add("title");
    
    openapiFields.add("location");
    
    openapiFields.add("reviews_count");
    
    openapiFields.add("rating");
    
    openapiFields.add("items_count");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessDataTrustpilotReviewsTaskGetResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataTrustpilotReviewsTaskGetResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataTrustpilotReviewsTaskGetResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataTrustpilotReviewsTaskGetResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataTrustpilotReviewsTaskGetResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataTrustpilotReviewsTaskGetResultInfo>() {
           @Override
           public void write(JsonWriter out, BusinessDataTrustpilotReviewsTaskGetResultInfo value) throws IOException {
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
           public BusinessDataTrustpilotReviewsTaskGetResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessDataTrustpilotReviewsTaskGetResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BusinessDataTrustpilotReviewsTaskGetResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataTrustpilotReviewsTaskGetResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
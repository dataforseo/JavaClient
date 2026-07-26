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


public class BusinessDataBusinessListingsSearchLiveRequestInfo  {


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories;

  public BusinessDataBusinessListingsSearchLiveRequestInfo categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * <em>business categories</em><br>optional field<br>the categories you specify are used to search for business listings;<br>if you don't use this field, we will return business listings found in the specified location;<br>you can specify <strong>up to 10 categories</strong>
   * @return categories
   */
  @javax.annotation.Nullable
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public BusinessDataBusinessListingsSearchLiveRequestInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <em>description of the element in SERP</em><br>optional field<br>the description of the business entity for which the results are collected;<br>can contain up to 200 characters
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public BusinessDataBusinessListingsSearchLiveRequestInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <em>title of the element in SERP</em><br>optional field<br>the name of the business entity for which the results are collected;<br>can contain up to 200 characters
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_IS_CLAIMED = "is_claimed";
  @SerializedName(SERIALIZED_NAME_IS_CLAIMED)
  private Boolean isClaimed;

  public BusinessDataBusinessListingsSearchLiveRequestInfo isClaimed(Boolean isClaimed) {
    this.isClaimed = isClaimed;
    return this;
  }

  /**
   * <em>indicates whether the business is verified by its owner on Google Maps</em><br>optional field
   * @return isClaimed
   */
  @javax.annotation.Nullable
  public Boolean getIsClaimed() {
    return isClaimed;
  }

  public void setIsClaimed(Boolean isClaimed) {
    this.isClaimed = isClaimed;
  }


  public static final String SERIALIZED_NAME_LOCATION_COORDINATE = "location_coordinate";
  @SerializedName(SERIALIZED_NAME_LOCATION_COORDINATE)
  private String locationCoordinate;

  public BusinessDataBusinessListingsSearchLiveRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <em>GPS coordinates of a location</em><br>optional field<br><code>location_coordinate</code> parameter should be specified in the <em>'latitude,longitude,radius'</em> format<br>the maximum number of decimal digits for <em>'latitude'</em> and <em>'longitude'</em>: 7<br>the value of <em>'radius'</em> is specified in kilometres (km)<br>the minimum value for <em>'radius'</em>: <code>1</code><br>the maximum value for <em>'radius'</em>: <code>100000</code><br>example:<br><code class='long-string'>53.476225,-2.243572,200</code>
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public BusinessDataBusinessListingsSearchLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>regex</code>, <code>not_regex</code>, <code><</code>, <code><=</code>, <code>></code>, <code>>=</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>, <code>not_like</code>, <code>ilike</code>, <code>not_ilike</code>, <code>match</code>, <code>not_match</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>example:<br><code>['rating.value','>',3]</code><br>you can receive the list of available filters_by making a separate request to <code>https://api.dataforseo.com/v3/business_data/business_listings/available_filters</code><br>The full list of possible filters is available <a href='/v3/business_data/business_listings/filters' rel='noopener noreferrer' target='_blank'>here.</a>n
   * @return filters
   */
  @javax.annotation.Nullable
  public List<Object> getFilters() {
    return filters;
  }

  public void setFilters(List<Object> filters) {
    this.filters = filters;
  }


  public static final String SERIALIZED_NAME_ORDER_BY = "order_by";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private List<String> orderBy;

  public BusinessDataBusinessListingsSearchLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>you can use the same values as in the <code>filters</code> array to sort the results<br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting parameter<br>example:<br><code>['rating.value,desc']</code><strong>note that you can set no more than three sorting rules in a single request</strong><br>you should use a comma to separate several sorting rules<br>example:<br><code>['rating.value,desc','rating.votes_count,desc']</code>
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public BusinessDataBusinessListingsSearchLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of returned businesses</em><br>optional field<br>default value: <code>100</code><br>maximum value: <code>1000</code>
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public BusinessDataBusinessListingsSearchLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of returned businesses</em><br>optional field<br>default value: <code>0</code><br>if you specify the <code>10</code> value, the first ten entities in the results array will be omitted and the data will be provided for the successive entities<br><strong>Note:</strong> we recommend using this parameter only when retrieving up to 10,000 results<br>for retrieving over 10,000 results, use the <code>offset_token</code> instead
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_OFFSET_TOKEN = "offset_token";
  @SerializedName(SERIALIZED_NAME_OFFSET_TOKEN)
  private String offsetToken;

  public BusinessDataBusinessListingsSearchLiveRequestInfo offsetToken(String offsetToken) {
    this.offsetToken = offsetToken;
    return this;
  }

  /**
   * <em>token for subsequent requests</em><br>optional field<br>provided in the identical filed of the response to each request;<br>use this parameter to avoid timeouts while trying to obtain over 100,000 results in a single request;<br>by specifying the unique <code>offset_token</code> value from the response array, you will get the subsequent results of the initial task;<br><code>offset_token</code> values are unique for each subsequent task<br><strong>Note:</strong> if the <code>offset_token</code> is specified in the request, all other parameters should be identical to the previous request<br>learn more about this parameter on our <a href='https://dataforseo.com/help-center/what-is-the-difference-between-the-offset-and-offset_token-parameters#offset_token' target='_blank'>Help Center</a>
   * @return offsetToken
   */
  @javax.annotation.Nullable
  public String getOffsetToken() {
    return offsetToken;
  }

  public void setOffsetToken(String offsetToken) {
    this.offsetToken = offsetToken;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public BusinessDataBusinessListingsSearchLiveRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * <em>user-defined task identifier</em><br>optional field<br><em>the character limit is 255</em><br>you can use this parameter to identify the task and match it with the result<br>you will find the specified <code>tag</code> value in the <code>data</code> object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }



  public BusinessDataBusinessListingsSearchLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BusinessDataBusinessListingsSearchLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    BusinessDataBusinessListingsSearchLiveRequestInfo businessDataBusinessListingsSearchLiveRequestInfo = (BusinessDataBusinessListingsSearchLiveRequestInfo) o;
    return

        Objects.equals(this.categories, businessDataBusinessListingsSearchLiveRequestInfo.categories) &&
        Objects.equals(this.description, businessDataBusinessListingsSearchLiveRequestInfo.description) &&
        Objects.equals(this.title, businessDataBusinessListingsSearchLiveRequestInfo.title) &&
        Objects.equals(this.isClaimed, businessDataBusinessListingsSearchLiveRequestInfo.isClaimed) &&
        Objects.equals(this.locationCoordinate, businessDataBusinessListingsSearchLiveRequestInfo.locationCoordinate) &&
        Objects.equals(this.filters, businessDataBusinessListingsSearchLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, businessDataBusinessListingsSearchLiveRequestInfo.orderBy) &&
        Objects.equals(this.limit, businessDataBusinessListingsSearchLiveRequestInfo.limit) &&
        Objects.equals(this.offset, businessDataBusinessListingsSearchLiveRequestInfo.offset) &&
        Objects.equals(this.offsetToken, businessDataBusinessListingsSearchLiveRequestInfo.offsetToken) &&
        Objects.equals(this.tag, businessDataBusinessListingsSearchLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(categories, description, title, isClaimed, locationCoordinate, filters, orderBy, limit, offset, offsetToken, tag);
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
    sb.append("class BusinessDataBusinessListingsSearchLiveRequestInfo {\n");

    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isClaimed: ").append(toIndentedString(isClaimed)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    offsetToken: ").append(toIndentedString(offsetToken)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    
    openapiFields.add("categories");
    
    openapiFields.add("description");
    
    openapiFields.add("title");
    
    openapiFields.add("is_claimed");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("offset_token");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BusinessDataBusinessListingsSearchLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataBusinessListingsSearchLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataBusinessListingsSearchLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataBusinessListingsSearchLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataBusinessListingsSearchLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataBusinessListingsSearchLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, BusinessDataBusinessListingsSearchLiveRequestInfo value) throws IOException {
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
           public BusinessDataBusinessListingsSearchLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BusinessDataBusinessListingsSearchLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BusinessDataBusinessListingsSearchLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataBusinessListingsSearchLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
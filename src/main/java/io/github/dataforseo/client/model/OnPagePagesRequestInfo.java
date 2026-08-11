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


public class OnPagePagesRequestInfo  {


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public OnPagePagesRequestInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <em>ID of the task</em><br><strong>required field</strong><br>you can get this ID in the response of the <a href='https://docs.dataforseo.com/v3/on_page/task_post/'>Task POST</a> endpoint<br>example:<br>'07131248-1535-0216-1000-17384017ad04'
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public OnPagePagesRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of returned pages</em><br>optional field<br>default value: <code>100</code><br>maximum value: <code>1000</code>
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

  public OnPagePagesRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of returned pages</em><br>optional field<br>default value: <code>0</code><br>maximum value: <code>2000000</code><br>if you specify the <code>10</code> value, the first ten pages in the results array will be omitted and the data will be provided for the successive pages
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public OnPagePagesRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>regex</code>, <code>not_regex</code>, <code><</code>, <code><=</code>, <code>></code>, <code>>=</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>, <code>not_like</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>example:<br><code>['meta.external_links_count','<=',50]</code><code>['url','like','https://dataforseo.com/apis/dataforseo-labs-api']</code><code>[['checks.high_waiting_time','=',false],<br>'and',['resource_type','=','html']]</code><code>[['page_timing.duration_time','<',100],'and',[['checks.large_page_size','=',false],'or',['checks.high_waiting_time','=',false]]]</code>The full list of possible filters is available <a href='/v3/on_page/filters_and_thresholds/?bash' target='_blank' rel='noopener noreferrer'>by this link.</a>
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

  public OnPagePagesRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>you can use the same values as in the <code>filters</code> array to sort the results<br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting type<br>example:<br><code>['meta.external_links_count,desc']</code><br><strong>note that you can set no more than three sorting rules in a single request</strong><br>you should use a comma to separate several sorting rules<br>example:<br><code>['page_timing.dom_complete,asc','size,desc']</code>
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }


  public static final String SERIALIZED_NAME_SEARCH_AFTER_TOKEN = "search_after_token";
  @SerializedName(SERIALIZED_NAME_SEARCH_AFTER_TOKEN)
  private String searchAfterToken;

  public OnPagePagesRequestInfo searchAfterToken(String searchAfterToken) {
    this.searchAfterToken = searchAfterToken;
    return this;
  }

  /**
   * <em>token for subsequent requests</em><br>optional field<br>provided in the identical filed of the response to each request;<br>use this parameter to avoid timeouts while trying to obtain over <code>20,000</code> results in a single request;<br>by specifying the unique <code>search_after_token</code> value from the response array, you will get the subsequent results of the initial task;<br><code>search_after_token</code> values are unique for each subsequent task ;<br><strong>Note:</strong> if the <code>search_after_token</code> is specified in the request, all other parameters should be identical to the previous request
   * @return searchAfterToken
   */
  @javax.annotation.Nullable
  public String getSearchAfterToken() {
    return searchAfterToken;
  }

  public void setSearchAfterToken(String searchAfterToken) {
    this.searchAfterToken = searchAfterToken;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public OnPagePagesRequestInfo tag(String tag) {
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



  public OnPagePagesRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPagePagesRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    OnPagePagesRequestInfo onPagePagesRequestInfo = (OnPagePagesRequestInfo) o;
    return

        Objects.equals(this.id, onPagePagesRequestInfo.id) &&
        Objects.equals(this.limit, onPagePagesRequestInfo.limit) &&
        Objects.equals(this.offset, onPagePagesRequestInfo.offset) &&
        Objects.equals(this.filters, onPagePagesRequestInfo.filters) &&
        Objects.equals(this.orderBy, onPagePagesRequestInfo.orderBy) &&
        Objects.equals(this.searchAfterToken, onPagePagesRequestInfo.searchAfterToken) &&
        Objects.equals(this.tag, onPagePagesRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(id, limit, offset, filters, orderBy, searchAfterToken, tag);
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
    sb.append("class OnPagePagesRequestInfo {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    searchAfterToken: ").append(toIndentedString(searchAfterToken)).append("\n");
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
    
    openapiFields.add("id");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("search_after_token");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPagePagesRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPagePagesRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPagePagesRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPagePagesRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPagePagesRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPagePagesRequestInfo>() {
           @Override
           public void write(JsonWriter out, OnPagePagesRequestInfo value) throws IOException {
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
           public OnPagePagesRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPagePagesRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPagePagesRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPagePagesRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
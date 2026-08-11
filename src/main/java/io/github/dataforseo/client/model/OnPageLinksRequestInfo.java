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


public class OnPageLinksRequestInfo  {


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public OnPageLinksRequestInfo id(String id) {
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


  public static final String SERIALIZED_NAME_PAGE_FROM = "page_from";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM)
  private String pageFrom;

  public OnPageLinksRequestInfo pageFrom(String pageFrom) {
    this.pageFrom = pageFrom;
    return this;
  }

  /**
   * <em>relative page URL</em><br>optional field<br>if you use this field, the API response will contain only links from the specified page<br>note that in this field you can specify relative URLs only
   * @return pageFrom
   */
  @javax.annotation.Nullable
  public String getPageFrom() {
    return pageFrom;
  }

  public void setPageFrom(String pageFrom) {
    this.pageFrom = pageFrom;
  }


  public static final String SERIALIZED_NAME_PAGE_TO = "page_to";
  @SerializedName(SERIALIZED_NAME_PAGE_TO)
  private String pageTo;

  public OnPageLinksRequestInfo pageTo(String pageTo) {
    this.pageTo = pageTo;
    return this;
  }

  /**
   * <em>relative page URL</em><br>optional field<br>if you use this field, the API response will contain only internal links pointing to the specified page<br>note that in this field you can specify relative URLs only
   * @return pageTo
   */
  @javax.annotation.Nullable
  public String getPageTo() {
    return pageTo;
  }

  public void setPageTo(String pageTo) {
    this.pageTo = pageTo;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public OnPageLinksRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of returned links</em><br>optional field<br>default value: <code>100</code><br>maximum value: <code>1000</code>
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

  public OnPageLinksRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of returned links</em><br>optional field<br>default value: <code>0</code><br>maximum value: <code>2000000</code><br>if you specify the <code>10</code> value, the first ten links in the results array will be omitted and the data will be provided for the successive links
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

  public OnPageLinksRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>regex</code>, <code>not_regex</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>, <code>not_like</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>example:<br><code>['direction','=','external']</code><p><code>[['domain_to','<>','example.com'],<br>'and',<br>['link_from','not_like','%example.com/blog%']]</code><p><code>[['direction','=','external'],<br>'and',<br>[['link_from','like','%example.com/blog%'],'or',['link_from','like','%example.com/help%']]]</code><p>The full list of possible filters is available <a href='/v3/on_page/filters_and_thresholds/?bash' rel='noopener noreferrer' target='_blank'>by this link.</a>
   * @return filters
   */
  @javax.annotation.Nullable
  public List<Object> getFilters() {
    return filters;
  }

  public void setFilters(List<Object> filters) {
    this.filters = filters;
  }


  public static final String SERIALIZED_NAME_SEARCH_AFTER_TOKEN = "search_after_token";
  @SerializedName(SERIALIZED_NAME_SEARCH_AFTER_TOKEN)
  private String searchAfterToken;

  public OnPageLinksRequestInfo searchAfterToken(String searchAfterToken) {
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

  public OnPageLinksRequestInfo tag(String tag) {
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



  public OnPageLinksRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageLinksRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    OnPageLinksRequestInfo onPageLinksRequestInfo = (OnPageLinksRequestInfo) o;
    return

        Objects.equals(this.id, onPageLinksRequestInfo.id) &&
        Objects.equals(this.pageFrom, onPageLinksRequestInfo.pageFrom) &&
        Objects.equals(this.pageTo, onPageLinksRequestInfo.pageTo) &&
        Objects.equals(this.limit, onPageLinksRequestInfo.limit) &&
        Objects.equals(this.offset, onPageLinksRequestInfo.offset) &&
        Objects.equals(this.filters, onPageLinksRequestInfo.filters) &&
        Objects.equals(this.searchAfterToken, onPageLinksRequestInfo.searchAfterToken) &&
        Objects.equals(this.tag, onPageLinksRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(id, pageFrom, pageTo, limit, offset, filters, searchAfterToken, tag);
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
    sb.append("class OnPageLinksRequestInfo {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pageFrom: ").append(toIndentedString(pageFrom)).append("\n");
    sb.append("    pageTo: ").append(toIndentedString(pageTo)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
    
    openapiFields.add("page_from");
    
    openapiFields.add("page_to");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("filters");
    
    openapiFields.add("search_after_token");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPageLinksRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageLinksRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageLinksRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageLinksRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageLinksRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageLinksRequestInfo>() {
           @Override
           public void write(JsonWriter out, OnPageLinksRequestInfo value) throws IOException {
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
           public OnPageLinksRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageLinksRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPageLinksRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageLinksRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
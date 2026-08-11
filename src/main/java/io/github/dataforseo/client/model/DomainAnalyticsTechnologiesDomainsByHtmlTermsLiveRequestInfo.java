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


public class DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo  {


  public static final String SERIALIZED_NAME_SEARCH_TERMS = "search_terms";
  @SerializedName(SERIALIZED_NAME_SEARCH_TERMS)
  private List<String> searchTerms;

  public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo searchTerms(List<String> searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }

  /**
   * <em>target search terms</em><br><strong>required field</strong><br>specify target HTML elements, tags, attributes, their content or all of the above<br>if you specify more than one search term, you will receive only the domains containing all of the specified terms in the HTML code of their homepage<br>maximum number of search terms you can specify: 10<br>example:<br><code>['data-attrid']</code>
   * @return searchTerms
   */
  @javax.annotation.Nullable
  public List<String> getSearchTerms() {
    return searchTerms;
  }

  public void setSearchTerms(List<String> searchTerms) {
    this.searchTerms = searchTerms;
  }


  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * <em>target keywords in the domain's title, description or meta keywords</em><br>optional field<br>UTF-8 encoding<br>maximum number of keywords you can specify: 10 <br>example:<br><code>['seo','software']</code><p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a>
   * @return keywords
   */
  @javax.annotation.Nullable
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * <em>search mode</em><br>optional field<br>possible search mode types:<br><code>strict_entry</code> - search for results exactly matching the order, intervals and separators in the specified search terms<br><code>entry</code> - search for results ignoring the order, intervals and separators in the specified search terms<br>default value: <code>entry</code>
   * @return mode
   */
  @javax.annotation.Nullable
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code><</code>, <code><=</code>, <code>></code>, <code>>=</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>, <code>not_like</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>example:<br><code>['domain','like','%seo%']</code><p><code>[['country_iso_code','=','US'],<br>'and',<br>['domain_rank','>',100]]</code><p><code>[['domain_rank','>',100],<br>'and',<br>[['country_iso_code','=','US'],'or',['country_iso_code','=','CA']]]</code><p>for more information about filters, please refer to <a href='/v3/domain_analytics/technologies/filters' target='_blank' rel='noopener noreferrer'>Domain Analytics Technologies API - Filters</a>
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

  public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>available fields: <br><code>domain_rank</code>, <code>domain</code>, <code>last_visited</code>, <code>country_iso_code</code>, <code>language_code</code>, <code>content_language_code</code><br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting type<br>example:<br><code>['last_visited,desc']</code><br>default rule:<br><code>['domain_rank,desc']</code><br><strong>note that you can set no more than three sorting rules in a single request</strong><br>you should use a comma to separate several sorting rules<br>example:<br><code>['last_visited,desc','domain_rank,desc']</code>
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

  public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of returned domains</em><br>optional field<br>default value: <code>100</code><br>maximum value: <code>10000</code>
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

  public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of returned domains</em><br>optional field<br>default value: <code>0</code><br>if you specify the <code>10</code> value, the first ten domains in the results array will be omitted and the data will be provided for the successive domains;<br><strong>Note:</strong> the maximum value is <code>9999</code>, the sum of <code>limit</code> and <code>offset</code> must not exceed <code>10000</code>;<br>use the <code>offset_token</code> if you would like to offset more results
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

  public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo offsetToken(String offsetToken) {
    this.offsetToken = offsetToken;
    return this;
  }

  /**
   * <em>token for subsequent requests</em><br>optional field<br>provided in the identical filed of the response to each request;<br>use this parameter to avoid timeouts while trying to obtain over 100,000 results in a single request;<br>by specifying the unique <code>offset_token</code> value from the response array, you will get the subsequent results of the initial task;<br><code>offset_token</code> values are unique for each subsequent task <br><strong>Note:</strong> if the <code>offset_token</code> is specified in the request, all other parameters should be identical to the previous request<br>learn more about this parameter on our <a href='https://dataforseo.com/help-center/what-is-the-difference-between-the-offset-and-offset_token-parameters#offset_token' target='_blank'>Help Center</a>
   * @return offsetToken
   */
  @javax.annotation.Nullable
  public String getOffsetToken() {
    return offsetToken;
  }

  public void setOffsetToken(String offsetToken) {
    this.offsetToken = offsetToken;
  }



  public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo = (DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo) o;
    return

        Objects.equals(this.searchTerms, domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.searchTerms) &&
        Objects.equals(this.keywords, domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.keywords) &&
        Objects.equals(this.mode, domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.mode) &&
        Objects.equals(this.filters, domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.orderBy) &&
        Objects.equals(this.limit, domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.limit) &&
        Objects.equals(this.offset, domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.offset) &&
        Objects.equals(this.offsetToken, domainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.offsetToken);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(searchTerms, keywords, mode, filters, orderBy, limit, offset, offsetToken);
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
    sb.append("class DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo {\n");

    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    offsetToken: ").append(toIndentedString(offsetToken)).append("\n");
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
    
    openapiFields.add("search_terms");
    
    openapiFields.add("keywords");
    
    openapiFields.add("mode");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("offset_token");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo value) throws IOException {
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
           public DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
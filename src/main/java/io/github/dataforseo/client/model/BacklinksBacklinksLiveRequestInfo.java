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


public class BacklinksBacklinksLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public BacklinksBacklinksLiveRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <em>domain, subdomain or webpage to get backlinks for</em><br><strong>required field</strong><br>a domain or a subdomain should be specified without <code>https://</code> and <code>www.</code><br>a page should be specified with absolute URL (including <code>http://</code> or <code>https://</code>)
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public BacklinksBacklinksLiveRequestInfo mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * <em>results grouping type</em><br>optional field<br>possible grouping types:<br><code>as_is</code> - returns all backlinks<br><code>one_per_domain</code> - returns one backlink per domain<br><code>one_per_anchor</code> - returns one backlink per anchor<p>default value: <code>as_is</code>
   * @return mode
   */
  @javax.annotation.Nullable
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  public static final String SERIALIZED_NAME_CUSTOM_MODE = "custom_mode";
  @SerializedName(SERIALIZED_NAME_CUSTOM_MODE)
  private Map<String, Object> customMode;

  public BacklinksBacklinksLiveRequestInfo customMode(Map<String, Object> customMode) {
    this.customMode = customMode;
    return this;
  }

  /**
   * <em>detailed results grouping type</em><br>optional field<br>use this object to get a specific number of backlinks per <code>field</code><br>if you use <code>custom_mode</code>, then <code>mode</code> will be ignored<br>example:<br><code>'custom_mode': {'field': 'domain', 'value': 100}</code>
   * @return customMode
   */
  @javax.annotation.Nullable
  public Map<String, Object> getCustomMode() {
    return customMode;
  }

  public void setCustomMode(Map<String, Object> customMode) {
    this.customMode = customMode;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public BacklinksBacklinksLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>, <code>not_like</code>, <code>ilike</code>, <code>not_ilike</code>, <code>regex</code>, <code>not_regex</code>, <code>match</code>, <code>not_match</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>example:<br><code>['rank','>','80']</code><p><code>[['page_from_rank','>','55'],<br>'and',<br>['dofollow','=',true]]</code><p><code>[['first_seen','>','2017-10-23 11:31:45 +00:00'],<br>'and',<br>[['anchor','like','%seo%'],'or',['text_pre','like','%seo%']]]</code><p>The full list of possible filters is available <a href='/v3/backlinks/filters/?bash' rel='noopener noreferrer' target='_blank'>here.</a>
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

  public BacklinksBacklinksLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>you can use the same values as in the <code>filters</code> array to sort the results<br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting type<br>example:<br><code>['rank,desc']</code><br><strong>note that you can set no more than three sorting rules in a single request</strong><br>you should use a comma to separate several sorting rules<br>example:<br><code>['domain_from_rank,desc','page_from_rank,asc']</code>
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public BacklinksBacklinksLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of the returned backlinks</em><br>optional field<p>default value: <code>0</code><br>if you specify the <code>10</code> value, the first ten backlinks in the results array will be omitted and the data will be provided for the successive backlinks;<br><strong>Note:</strong> the maximum value is <code>20,000</code>, use the <code>search_after_token</code> if you would like to offset more results
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_SEARCH_AFTER_TOKEN = "search_after_token";
  @SerializedName(SERIALIZED_NAME_SEARCH_AFTER_TOKEN)
  private String searchAfterToken;

  public BacklinksBacklinksLiveRequestInfo searchAfterToken(String searchAfterToken) {
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


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public BacklinksBacklinksLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of returned backlinks</em><br>optional field<p>default value: <code>100</code><br>maximum value: <code>1000</code>
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public static final String SERIALIZED_NAME_BACKLINKS_STATUS_TYPE = "backlinks_status_type";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_STATUS_TYPE)
  private String backlinksStatusType;

  public BacklinksBacklinksLiveRequestInfo backlinksStatusType(String backlinksStatusType) {
    this.backlinksStatusType = backlinksStatusType;
    return this;
  }

  /**
   * <em>set what backlinks to return and count</em><br>optional field<br>you can use this field to choose what backlinks will be returned and used for aggregated metrics for your <code>target</code>;<br>possible values: <br><code>all</code> - all backlinks will be returned and counted;<br><code>live</code> - backlinks found during the last check will be returned and counted;<br><code>lost</code> - lost backlinks will be returned and counted;<p>default value: <code>live</code>
   * @return backlinksStatusType
   */
  @javax.annotation.Nullable
  public String getBacklinksStatusType() {
    return backlinksStatusType;
  }

  public void setBacklinksStatusType(String backlinksStatusType) {
    this.backlinksStatusType = backlinksStatusType;
  }


  public static final String SERIALIZED_NAME_INCLUDE_SUBDOMAINS = "include_subdomains";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SUBDOMAINS)
  private Boolean includeSubdomains;

  public BacklinksBacklinksLiveRequestInfo includeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
    return this;
  }

  /**
   * <em>indicates if the subdomains of the <code>target</code> will be included in the search</em><br>optional field<br>if set to <code>false</code>, the subdomains will be ignored<br>default value: <code>true</code>
   * @return includeSubdomains
   */
  @javax.annotation.Nullable
  public Boolean getIncludeSubdomains() {
    return includeSubdomains;
  }

  public void setIncludeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
  }


  public static final String SERIALIZED_NAME_EXCLUDE_INTERNAL_BACKLINKS = "exclude_internal_backlinks";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_INTERNAL_BACKLINKS)
  private Boolean excludeInternalBacklinks;

  public BacklinksBacklinksLiveRequestInfo excludeInternalBacklinks(Boolean excludeInternalBacklinks) {
    this.excludeInternalBacklinks = excludeInternalBacklinks;
    return this;
  }

  /**
   * <em>indicates if internal backlinks from subdomains to the <code>target</code> will be excluded from the results</em><br>optional field<br>if set to <code>true</code>, the results will not include data on internal backlinks from subdomains of the same domain as <code>target</code><br>if set to <code>false</code>, internal links will be included in the results<br>default value: <code>true</code>
   * @return excludeInternalBacklinks
   */
  @javax.annotation.Nullable
  public Boolean getExcludeInternalBacklinks() {
    return excludeInternalBacklinks;
  }

  public void setExcludeInternalBacklinks(Boolean excludeInternalBacklinks) {
    this.excludeInternalBacklinks = excludeInternalBacklinks;
  }


  public static final String SERIALIZED_NAME_RANK_SCALE = "rank_scale";
  @SerializedName(SERIALIZED_NAME_RANK_SCALE)
  private String rankScale;

  public BacklinksBacklinksLiveRequestInfo rankScale(String rankScale) {
    this.rankScale = rankScale;
    return this;
  }

  /**
   * <em>defines the scale used for calculating and displaying the <code>rank</code>, <code>domain_from_rank</code>, and <code>page_from_rank</code> values</em><br>optional field<p>you can use this parameter to choose whether rank values are presented on a 0–100 or 0–1000 scale<p>possible values:<br><code>one_hundred</code> — rank values are displayed on a 0–100 scale<br><code>one_thousand</code> — rank values are displayed on a 0–1000 scale<p>default value: <code>one_thousand</code><p>learn more about how this parameter works and how ranking metrics are calculated in <a href='https://dataforseo.com/help-center/what_is_rank_in_backlinks_api#rank_scale'>this Help Center article</a>
   * @return rankScale
   */
  @javax.annotation.Nullable
  public String getRankScale() {
    return rankScale;
  }

  public void setRankScale(String rankScale) {
    this.rankScale = rankScale;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public BacklinksBacklinksLiveRequestInfo tag(String tag) {
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



  public BacklinksBacklinksLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksBacklinksLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    BacklinksBacklinksLiveRequestInfo backlinksBacklinksLiveRequestInfo = (BacklinksBacklinksLiveRequestInfo) o;
    return

        Objects.equals(this.target, backlinksBacklinksLiveRequestInfo.target) &&
        Objects.equals(this.mode, backlinksBacklinksLiveRequestInfo.mode) &&
        Objects.equals(this.customMode, backlinksBacklinksLiveRequestInfo.customMode) &&
        Objects.equals(this.filters, backlinksBacklinksLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, backlinksBacklinksLiveRequestInfo.orderBy) &&
        Objects.equals(this.offset, backlinksBacklinksLiveRequestInfo.offset) &&
        Objects.equals(this.searchAfterToken, backlinksBacklinksLiveRequestInfo.searchAfterToken) &&
        Objects.equals(this.limit, backlinksBacklinksLiveRequestInfo.limit) &&
        Objects.equals(this.backlinksStatusType, backlinksBacklinksLiveRequestInfo.backlinksStatusType) &&
        Objects.equals(this.includeSubdomains, backlinksBacklinksLiveRequestInfo.includeSubdomains) &&
        Objects.equals(this.excludeInternalBacklinks, backlinksBacklinksLiveRequestInfo.excludeInternalBacklinks) &&
        Objects.equals(this.rankScale, backlinksBacklinksLiveRequestInfo.rankScale) &&
        Objects.equals(this.tag, backlinksBacklinksLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, mode, customMode, filters, orderBy, offset, searchAfterToken, limit, backlinksStatusType, includeSubdomains, excludeInternalBacklinks, rankScale, tag);
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
    sb.append("class BacklinksBacklinksLiveRequestInfo {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    customMode: ").append(toIndentedString(customMode)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    searchAfterToken: ").append(toIndentedString(searchAfterToken)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    backlinksStatusType: ").append(toIndentedString(backlinksStatusType)).append("\n");
    sb.append("    includeSubdomains: ").append(toIndentedString(includeSubdomains)).append("\n");
    sb.append("    excludeInternalBacklinks: ").append(toIndentedString(excludeInternalBacklinks)).append("\n");
    sb.append("    rankScale: ").append(toIndentedString(rankScale)).append("\n");
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
    
    openapiFields.add("target");
    
    openapiFields.add("mode");
    
    openapiFields.add("custom_mode");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("offset");
    
    openapiFields.add("search_after_token");
    
    openapiFields.add("limit");
    
    openapiFields.add("backlinks_status_type");
    
    openapiFields.add("include_subdomains");
    
    openapiFields.add("exclude_internal_backlinks");
    
    openapiFields.add("rank_scale");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksBacklinksLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksBacklinksLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksBacklinksLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksBacklinksLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksBacklinksLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksBacklinksLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, BacklinksBacklinksLiveRequestInfo value) throws IOException {
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
           public BacklinksBacklinksLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksBacklinksLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksBacklinksLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksBacklinksLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
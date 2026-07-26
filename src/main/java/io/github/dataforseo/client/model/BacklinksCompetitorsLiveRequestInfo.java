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


public class BacklinksCompetitorsLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public BacklinksCompetitorsLiveRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <em>domain, subdomain or webpage to get competitor domains for</em><br><strong>required field</strong><br>a domain or a subdomain should be specified without <code>https://</code> and <code>www.</code><br>a page should be specified with absolute URL (including <code>http://</code> or <code>https://</code>)
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public BacklinksCompetitorsLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of returned domains</em><br>optional field<br>default value: <code>100</code><br>maximum value: <code>1000</code>
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

  public BacklinksCompetitorsLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of returned domains</em><br>optional field<br>default value: <code>0</code><br>if you specify the <code>10</code> value, the first ten domains in the results array will be omitted and the data will be provided for the successive pages
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

  public BacklinksCompetitorsLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>regex</code>, <code>not_regex</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>, <code>not_like</code>, <code>ilike</code>, <code>not_ilike</code>, <code>match</code>, <code>not_match</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>example:<br><code>['rank','>','100']</code><p><code>[['target','like','%forbes%'],<br>'and',<br>[['rank','>','100'],'or',['intersections','>','5']]]</code><p>The full list of possible filters is available <a href='/v3/backlinks/filters/?bash' rel='noopener noreferrer' target='_blank'>here.</a>
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

  public BacklinksCompetitorsLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>you can use the same values as in the <code>filters</code> array to sort the results<br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting type<br>example:<br><code>['rank,desc']</code><br><strong>note that you can set no more than three sorting rules in a single request</strong><br>you should use a comma to separate several sorting rules<br>example:<br><code>['intersections,desc','rank,asc']</code>
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }


  public static final String SERIALIZED_NAME_MAIN_DOMAIN = "main_domain";
  @SerializedName(SERIALIZED_NAME_MAIN_DOMAIN)
  private Boolean mainDomain;

  public BacklinksCompetitorsLiveRequestInfo mainDomain(Boolean mainDomain) {
    this.mainDomain = mainDomain;
    return this;
  }

  /**
   * <em>indicates if only main domain of the <code>target</code> will be included in the search</em><br>optional field<br>if set to <code>true</code>, only the main domain will be included in search;<br>default value: <code>true</code>
   * @return mainDomain
   */
  @javax.annotation.Nullable
  public Boolean getMainDomain() {
    return mainDomain;
  }

  public void setMainDomain(Boolean mainDomain) {
    this.mainDomain = mainDomain;
  }


  public static final String SERIALIZED_NAME_EXCLUDE_LARGE_DOMAINS = "exclude_large_domains";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_LARGE_DOMAINS)
  private Boolean excludeLargeDomains;

  public BacklinksCompetitorsLiveRequestInfo excludeLargeDomains(Boolean excludeLargeDomains) {
    this.excludeLargeDomains = excludeLargeDomains;
    return this;
  }

  /**
   * <em>indicates whether large domain will appear in results</em><br>optional field<br>if set to <code>true</code>, the results from the large domain (google.com, amazon.com, etc.) will be omitted;<br>default value: <code>true</code>
   * @return excludeLargeDomains
   */
  @javax.annotation.Nullable
  public Boolean getExcludeLargeDomains() {
    return excludeLargeDomains;
  }

  public void setExcludeLargeDomains(Boolean excludeLargeDomains) {
    this.excludeLargeDomains = excludeLargeDomains;
  }


  public static final String SERIALIZED_NAME_EXCLUDE_INTERNAL_BACKLINKS = "exclude_internal_backlinks";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_INTERNAL_BACKLINKS)
  private Boolean excludeInternalBacklinks;

  public BacklinksCompetitorsLiveRequestInfo excludeInternalBacklinks(Boolean excludeInternalBacklinks) {
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

  public BacklinksCompetitorsLiveRequestInfo rankScale(String rankScale) {
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

  public BacklinksCompetitorsLiveRequestInfo tag(String tag) {
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



  public BacklinksCompetitorsLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksCompetitorsLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    BacklinksCompetitorsLiveRequestInfo backlinksCompetitorsLiveRequestInfo = (BacklinksCompetitorsLiveRequestInfo) o;
    return

        Objects.equals(this.target, backlinksCompetitorsLiveRequestInfo.target) &&
        Objects.equals(this.limit, backlinksCompetitorsLiveRequestInfo.limit) &&
        Objects.equals(this.offset, backlinksCompetitorsLiveRequestInfo.offset) &&
        Objects.equals(this.filters, backlinksCompetitorsLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, backlinksCompetitorsLiveRequestInfo.orderBy) &&
        Objects.equals(this.mainDomain, backlinksCompetitorsLiveRequestInfo.mainDomain) &&
        Objects.equals(this.excludeLargeDomains, backlinksCompetitorsLiveRequestInfo.excludeLargeDomains) &&
        Objects.equals(this.excludeInternalBacklinks, backlinksCompetitorsLiveRequestInfo.excludeInternalBacklinks) &&
        Objects.equals(this.rankScale, backlinksCompetitorsLiveRequestInfo.rankScale) &&
        Objects.equals(this.tag, backlinksCompetitorsLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, limit, offset, filters, orderBy, mainDomain, excludeLargeDomains, excludeInternalBacklinks, rankScale, tag);
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
    sb.append("class BacklinksCompetitorsLiveRequestInfo {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    mainDomain: ").append(toIndentedString(mainDomain)).append("\n");
    sb.append("    excludeLargeDomains: ").append(toIndentedString(excludeLargeDomains)).append("\n");
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
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("main_domain");
    
    openapiFields.add("exclude_large_domains");
    
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
   * @throws IOException if the JSON Element is invalid with respect to BacklinksCompetitorsLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksCompetitorsLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksCompetitorsLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksCompetitorsLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksCompetitorsLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksCompetitorsLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, BacklinksCompetitorsLiveRequestInfo value) throws IOException {
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
           public BacklinksCompetitorsLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksCompetitorsLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksCompetitorsLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksCompetitorsLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
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


public class BacklinksDomainIntersectionLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private Map<String, String> targets;

  public BacklinksDomainIntersectionLiveRequestInfo targets(Map<String, String> targets) {
    this.targets = targets;
    return this;
  }

  /**
   * <em>domains, subdomains or webpages to get links for</em><br><strong>required field</strong><br>you can set up to 20 domains, subdomains or webpages<br>a domain or a subdomain should be specified without <code>https://</code> and <code>www.</code><br>a page should be specified with absolute URL (including <code>http://</code> or <code>https://</code>)<br>example:<br><code>'targets':</code> <code>{<br>'1': 'http://planet.postgresql.org/',</code><br><code>'2': 'http://gborg.postgresql.org/'<br>}</code>
   * @return targets
   */
  @javax.annotation.Nullable
  public Map<String, String> getTargets() {
    return targets;
  }

  public void setTargets(Map<String, String> targets) {
    this.targets = targets;
  }


  public static final String SERIALIZED_NAME_EXCLUDE_TARGETS = "exclude_targets";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_TARGETS)
  private List<String> excludeTargets;

  public BacklinksDomainIntersectionLiveRequestInfo excludeTargets(List<String> excludeTargets) {
    this.excludeTargets = excludeTargets;
    return this;
  }

  /**
   * <em>domains, subdomains or webpages you want to exclude</em><br>optional field<br>you can specify up to 10 domains, subdomains or webpages<br>if you use this array, results will contain the referring domains that link to <code>targets</code> but don't link to <code>exclude_targets</code><br>example:<br><code>'exclude_targets': [<br>'bbc.com',<br>'https://www.apple.com/iphone/*',<br>'https://dataforseo.com/apis/*']</code>
   * @return excludeTargets
   */
  @javax.annotation.Nullable
  public List<String> getExcludeTargets() {
    return excludeTargets;
  }

  public void setExcludeTargets(List<String> excludeTargets) {
    this.excludeTargets = excludeTargets;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public BacklinksDomainIntersectionLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * <em>array of results filtering parameters</em><br>optional field<br><strong>you can add several filters at once (8 filters maximum)</strong><br>you should set a logical operator <code>and</code>, <code>or</code> between the conditions<br>the following operators are supported:<br><code>regex</code>, <code>not_regex</code>, <code>=</code>, <code><></code>, <code>in</code>, <code>not_in</code>, <code>like</code>, <code>not_like</code>, <code>ilike</code>, <code>not_ilike</code>, <code>match</code>, <code>not_match</code><br>you can use the <code>%</code> operator with <code>like</code> and <code>not_like</code> to match any string of zero or more characters<br>example:<br><code>['1.internal_links_count','>','1']</code><p><code>[['2.referring_pages','>','2'],<br>'and',<br>['1.backlinks','>','10']]</code><p><code>[['1.first_seen','>','2017-10-23 11:31:45 +00:00'],<br>'and',<br>[['2.target','like','%dataforseo.com%'],'or',['1.referring_domains','>','10']]]</code><p>The full list of possible filters is available <a href='/v3/backlinks/filters/?bash' rel='noopener noreferrer' target='_blank'>here.</a>
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

  public BacklinksDomainIntersectionLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>you can use the same values as in the <code>filters</code> array to sort the results<br>possible sorting types:<br><code>asc</code> - results will be sorted in the ascending order<br><code>desc</code> - results will be sorted in the descending order<br>you should use a comma to set up a sorting type<br>example:<br><code>['backlinks,desc']</code><br><strong>note that you can set no more than three sorting rules in a single request</strong><br>you should use a comma to separate several sorting rules<br>example:<br><code>['backlinks,desc','rank,asc']</code>
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

  public BacklinksDomainIntersectionLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the array of returned results</em><br>optional field<br>default value: <code>0</code><br>if you specify the <code>10</code> value, the first ten backlinks in the results array will be omitted and the data will be provided for the successive backlinks
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public BacklinksDomainIntersectionLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <em>the maximum number of returned results</em><br>optional field<br>default value: <code>100</code><br>maximum value: <code>1000</code>
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public static final String SERIALIZED_NAME_INTERNAL_LIST_LIMIT = "internal_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LIST_LIMIT)
  private Integer internalListLimit;

  public BacklinksDomainIntersectionLiveRequestInfo internalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
    return this;
  }

  /**
   * <em>maximum number of elements within internal arrays</em><br>optional field<br>you can use this field to limit the number of elements within the following arrays:<br><code>referring_links_tld</code><br><code>referring_links_types</code><br><code>referring_links_attributes</code><br><code>referring_links_platform_types</code><br><code>referring_links_semantic_locations</code><p>default value: <code>10</code><br>maximum value: <code>1000</code>
   * @return internalListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalListLimit() {
    return internalListLimit;
  }

  public void setInternalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
  }


  public static final String SERIALIZED_NAME_BACKLINKS_STATUS_TYPE = "backlinks_status_type";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_STATUS_TYPE)
  private String backlinksStatusType;

  public BacklinksDomainIntersectionLiveRequestInfo backlinksStatusType(String backlinksStatusType) {
    this.backlinksStatusType = backlinksStatusType;
    return this;
  }

  /**
   * <em>set what backlinks to return and count</em><br>optional field<br>you can use this field to choose what backlinks will be returned and used for aggregated metrics for your <code>targets</code>;<br>possible values: <br><code>all</code> - all backlinks will be returned and counted;<br><code>live</code> - backlinks found during the last check will be returned and counted;<br><code>lost</code> - lost backlinks will be returned and counted;<p>default value: <code>live</code>
   * @return backlinksStatusType
   */
  @javax.annotation.Nullable
  public String getBacklinksStatusType() {
    return backlinksStatusType;
  }

  public void setBacklinksStatusType(String backlinksStatusType) {
    this.backlinksStatusType = backlinksStatusType;
  }


  public static final String SERIALIZED_NAME_BACKLINKS_FILTERS = "backlinks_filters";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_FILTERS)
  private List<Object> backlinksFilters;

  public BacklinksDomainIntersectionLiveRequestInfo backlinksFilters(List<Object> backlinksFilters) {
    this.backlinksFilters = backlinksFilters;
    return this;
  }

  /**
   * <em>filter the backlinks of your <code>target</code></em><br>optional field<br>you can use this field to filter the initial backlinks that will be included in the dataset for aggregated metrics for your <code>target</code><br>you can filter the backlinks by all fields available in the response of <a href='/v3/backlinks/backlinks/live'>this endpoint</a><br>using this parameter, you can include only dofollow backlinks in the response and create a flexible backlinks dataset to calculate the metrics for<br>example:<br><code>'backlinks_filters': [['dofollow', '=', true]]</code>
   * @return backlinksFilters
   */
  @javax.annotation.Nullable
  public List<Object> getBacklinksFilters() {
    return backlinksFilters;
  }

  public void setBacklinksFilters(List<Object> backlinksFilters) {
    this.backlinksFilters = backlinksFilters;
  }


  public static final String SERIALIZED_NAME_INCLUDE_SUBDOMAINS = "include_subdomains";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SUBDOMAINS)
  private Boolean includeSubdomains;

  public BacklinksDomainIntersectionLiveRequestInfo includeSubdomains(Boolean includeSubdomains) {
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


  public static final String SERIALIZED_NAME_INCLUDE_INDIRECT_LINKS = "include_indirect_links";
  @SerializedName(SERIALIZED_NAME_INCLUDE_INDIRECT_LINKS)
  private Boolean includeIndirectLinks;

  public BacklinksDomainIntersectionLiveRequestInfo includeIndirectLinks(Boolean includeIndirectLinks) {
    this.includeIndirectLinks = includeIndirectLinks;
    return this;
  }

  /**
   * <em>indicates if indirect links to the <code>targets</code> will be included in the results</em><br>optional field<br>if set to <code>true</code>, the results will include data on indirect links pointing to a page that either redirects to a target, or points to a canonical page<br>if set to <code>false</code>, indirect links will be ignored<br>default value: <code>true</code>
   * @return includeIndirectLinks
   */
  @javax.annotation.Nullable
  public Boolean getIncludeIndirectLinks() {
    return includeIndirectLinks;
  }

  public void setIncludeIndirectLinks(Boolean includeIndirectLinks) {
    this.includeIndirectLinks = includeIndirectLinks;
  }


  public static final String SERIALIZED_NAME_EXCLUDE_INTERNAL_BACKLINKS = "exclude_internal_backlinks";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_INTERNAL_BACKLINKS)
  private Boolean excludeInternalBacklinks;

  public BacklinksDomainIntersectionLiveRequestInfo excludeInternalBacklinks(Boolean excludeInternalBacklinks) {
    this.excludeInternalBacklinks = excludeInternalBacklinks;
    return this;
  }

  /**
   * <em>indicates whether the backlinks from subdomains of the <code>target</code> are excluded</em><br>optional field<br>if set to <code>false</code>, the backlinks from subdomains of the <code>target</code> will be omitted and you won't receive the same domain in the response;<br>default value: <code>true</code>
   * @return excludeInternalBacklinks
   */
  @javax.annotation.Nullable
  public Boolean getExcludeInternalBacklinks() {
    return excludeInternalBacklinks;
  }

  public void setExcludeInternalBacklinks(Boolean excludeInternalBacklinks) {
    this.excludeInternalBacklinks = excludeInternalBacklinks;
  }


  public static final String SERIALIZED_NAME_INTERSECTION_MODE = "intersection_mode";
  @SerializedName(SERIALIZED_NAME_INTERSECTION_MODE)
  private String intersectionMode;

  public BacklinksDomainIntersectionLiveRequestInfo intersectionMode(String intersectionMode) {
    this.intersectionMode = intersectionMode;
    return this;
  }

  /**
   * <em>indicates whether to intersect backlinks</em><br>optional field<br>use this field to intersect or merge results for the specified domains<br>possible values: <code>all</code>, <code>partial</code><br><code>all</code> - results are based on all backlinks;<br><code>partial</code> - results are based on the intersecting backlinks only;<br>default value: <code>all</code>
   * @return intersectionMode
   */
  @javax.annotation.Nullable
  public String getIntersectionMode() {
    return intersectionMode;
  }

  public void setIntersectionMode(String intersectionMode) {
    this.intersectionMode = intersectionMode;
  }


  public static final String SERIALIZED_NAME_RANK_SCALE = "rank_scale";
  @SerializedName(SERIALIZED_NAME_RANK_SCALE)
  private String rankScale;

  public BacklinksDomainIntersectionLiveRequestInfo rankScale(String rankScale) {
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

  public BacklinksDomainIntersectionLiveRequestInfo tag(String tag) {
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



  public BacklinksDomainIntersectionLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksDomainIntersectionLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    BacklinksDomainIntersectionLiveRequestInfo backlinksDomainIntersectionLiveRequestInfo = (BacklinksDomainIntersectionLiveRequestInfo) o;
    return

        Objects.equals(this.targets, backlinksDomainIntersectionLiveRequestInfo.targets) &&
        Objects.equals(this.excludeTargets, backlinksDomainIntersectionLiveRequestInfo.excludeTargets) &&
        Objects.equals(this.filters, backlinksDomainIntersectionLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, backlinksDomainIntersectionLiveRequestInfo.orderBy) &&
        Objects.equals(this.offset, backlinksDomainIntersectionLiveRequestInfo.offset) &&
        Objects.equals(this.limit, backlinksDomainIntersectionLiveRequestInfo.limit) &&
        Objects.equals(this.internalListLimit, backlinksDomainIntersectionLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.backlinksStatusType, backlinksDomainIntersectionLiveRequestInfo.backlinksStatusType) &&
        Objects.equals(this.backlinksFilters, backlinksDomainIntersectionLiveRequestInfo.backlinksFilters) &&
        Objects.equals(this.includeSubdomains, backlinksDomainIntersectionLiveRequestInfo.includeSubdomains) &&
        Objects.equals(this.includeIndirectLinks, backlinksDomainIntersectionLiveRequestInfo.includeIndirectLinks) &&
        Objects.equals(this.excludeInternalBacklinks, backlinksDomainIntersectionLiveRequestInfo.excludeInternalBacklinks) &&
        Objects.equals(this.intersectionMode, backlinksDomainIntersectionLiveRequestInfo.intersectionMode) &&
        Objects.equals(this.rankScale, backlinksDomainIntersectionLiveRequestInfo.rankScale) &&
        Objects.equals(this.tag, backlinksDomainIntersectionLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(targets, excludeTargets, filters, orderBy, offset, limit, internalListLimit, backlinksStatusType, backlinksFilters, includeSubdomains, includeIndirectLinks, excludeInternalBacklinks, intersectionMode, rankScale, tag);
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
    sb.append("class BacklinksDomainIntersectionLiveRequestInfo {\n");

    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    excludeTargets: ").append(toIndentedString(excludeTargets)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    internalListLimit: ").append(toIndentedString(internalListLimit)).append("\n");
    sb.append("    backlinksStatusType: ").append(toIndentedString(backlinksStatusType)).append("\n");
    sb.append("    backlinksFilters: ").append(toIndentedString(backlinksFilters)).append("\n");
    sb.append("    includeSubdomains: ").append(toIndentedString(includeSubdomains)).append("\n");
    sb.append("    includeIndirectLinks: ").append(toIndentedString(includeIndirectLinks)).append("\n");
    sb.append("    excludeInternalBacklinks: ").append(toIndentedString(excludeInternalBacklinks)).append("\n");
    sb.append("    intersectionMode: ").append(toIndentedString(intersectionMode)).append("\n");
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
    
    openapiFields.add("targets");
    
    openapiFields.add("exclude_targets");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("offset");
    
    openapiFields.add("limit");
    
    openapiFields.add("internal_list_limit");
    
    openapiFields.add("backlinks_status_type");
    
    openapiFields.add("backlinks_filters");
    
    openapiFields.add("include_subdomains");
    
    openapiFields.add("include_indirect_links");
    
    openapiFields.add("exclude_internal_backlinks");
    
    openapiFields.add("intersection_mode");
    
    openapiFields.add("rank_scale");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksDomainIntersectionLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksDomainIntersectionLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksDomainIntersectionLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksDomainIntersectionLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksDomainIntersectionLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksDomainIntersectionLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, BacklinksDomainIntersectionLiveRequestInfo value) throws IOException {
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
           public BacklinksDomainIntersectionLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksDomainIntersectionLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksDomainIntersectionLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksDomainIntersectionLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
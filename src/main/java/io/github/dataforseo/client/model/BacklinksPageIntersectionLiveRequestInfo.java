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



public class BacklinksPageIntersectionLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private Map<String, String> targets;

  public BacklinksPageIntersectionLiveRequestInfo targets(Map<String, String> targets) {
    this.targets = targets;
    return this;
  }

  /**
   * domains, subdomains or webpages to get links for
* required field
* you can set up to 20 domains, subdomains or webpages
* a domain or a subdomain should be specified without https:// and www.
* a page should be specified with absolute URL (including http:// or https://)
* example:
* 'targets': {
* '1': 'http://planet.postgresql.org/',
* '2': 'http://gborg.postgresql.org/'
* }
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

  public BacklinksPageIntersectionLiveRequestInfo excludeTargets(List<String> excludeTargets) {
    this.excludeTargets = excludeTargets;
    return this;
  }

  /**
   * domains, subdomains or webpages you want to exclude
* optional field
* you can set up to 10 domains, subdomains or webpages
* if you use this array, results will contain the referring pages that link to targets but don’t link to exclude_targets
* example:
* 'exclude_targets': [
* 'bbc.com',
* 'https://www.apple.com/iphone/*',
* 'https://dataforseo.com/apis/*']
   * @return excludeTargets
   */
  @javax.annotation.Nullable
  public List<String> getExcludeTargets() {
    return excludeTargets;
  }

  public void setExcludeTargets(List<String> excludeTargets) {
    this.excludeTargets = excludeTargets;
  }


  public static final String SERIALIZED_NAME_BACKLINKS_STATUS_TYPE = "backlinks_status_type";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_STATUS_TYPE)
  private String backlinksStatusType;

  public BacklinksPageIntersectionLiveRequestInfo backlinksStatusType(String backlinksStatusType) {
    this.backlinksStatusType = backlinksStatusType;
    return this;
  }

  /**
   * set what backlinks to return and count
* optional field
* you can use this field to choose what backlinks will be returned and used for aggregated metrics for your targets;
* possible values:
* all – all backlinks will be returned and counted;
* live – backlinks found during the last check will be returned and counted;
* lost – lost backlinks will be returned and counted;
* default value: live
   * @return backlinksStatusType
   */
  @javax.annotation.Nullable
  public String getBacklinksStatusType() {
    return backlinksStatusType;
  }

  public void setBacklinksStatusType(String backlinksStatusType) {
    this.backlinksStatusType = backlinksStatusType;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public BacklinksPageIntersectionLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * array of results filtering parameters
* optional field
* you can add several filters at once (8 filters maximum)
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* regex, not_regex, =, <>, in, not_in, like, not_like, ilike, not_ilike, match, not_match
* you can use the % operator with like and not_like to match any string of zero or more characters
* example:
* ['1.rank','>','80']
* [['2.page_from_rank','>','55'],
* 'and',
* ['1.original','=','true']]
* [['1.first_seen','>','2017-10-23 11:31:45 +00:00'],
* 'and',
* [['1.acnhor','like','%seo%'],'or',['1.text_pre','not_like','%seo%']]]
* The full list of possible filters is available here.
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

  public BacklinksPageIntersectionLiveRequestInfo orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * results sorting rules
* optional field
* you can use the same values as in the filters array to sort the results
* possible sorting types:
* asc – results will be sorted in the ascending order
* desc – results will be sorted in the descending order
* you should use a comma to set up a sorting type
* example:
* ['rank,desc']
* note that you can set no more than three sorting rules in a single request
* you should use a comma to separate several sorting rules
* example:
* ['domain_from_rank,desc','page_from_rank,asc']
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

  public BacklinksPageIntersectionLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of the returned backlinks
* optional field
* default value: 0
* if you specify the 10 value, the first ten backlinks in the results array will be omitted and the data will be provided for the successive backlinks
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

  public BacklinksPageIntersectionLiveRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * the maximum number of returned backlinks
* optional field
* default value: 100
* maximum value: 1000
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

  public BacklinksPageIntersectionLiveRequestInfo internalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
    return this;
  }

  /**
   * maximum number of elements within internal arrays
* optional field
* you can use this field to limit the number of elements within the following arrays:
* attributes
* domain_from_platform_type
* default value: 10
* maximum value: 1000
   * @return internalListLimit
   */
  @javax.annotation.Nullable
  public Integer getInternalListLimit() {
    return internalListLimit;
  }

  public void setInternalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
  }


  public static final String SERIALIZED_NAME_INCLUDE_SUBDOMAINS = "include_subdomains";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SUBDOMAINS)
  private Boolean includeSubdomains;

  public BacklinksPageIntersectionLiveRequestInfo includeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
    return this;
  }

  /**
   * indicates if the subdomains of the targets will be included in the search
* optional field
* if set to false, the subdomains will be ignored
* default value: true
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

  public BacklinksPageIntersectionLiveRequestInfo includeIndirectLinks(Boolean includeIndirectLinks) {
    this.includeIndirectLinks = includeIndirectLinks;
    return this;
  }

  /**
   * indicates if indirect links to the targets will be included in the results
* optional field
* if set to true, the results will include data on indirect links pointing to a page that either redirects to a target, or points to a canonical page
* if set to false, indirect links will be ignored
* default value: true
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

  public BacklinksPageIntersectionLiveRequestInfo excludeInternalBacklinks(Boolean excludeInternalBacklinks) {
    this.excludeInternalBacklinks = excludeInternalBacklinks;
    return this;
  }

  /**
   * indicates if internal backlinks from subdomains to the target will be excluded from the results
* optional field
* if set to true, the results will not include data on internal backlinks from subdomains of the same domain as target
* if set to false, internal links will be included in the result
* default value: true
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

  public BacklinksPageIntersectionLiveRequestInfo intersectionMode(String intersectionMode) {
    this.intersectionMode = intersectionMode;
    return this;
  }

  /**
   * indicates whether to intersect backlinks
* optional field
* use this field to intersect or merge results for the specified URLs
* possible values: all, partial
* all – results are based on all backlinks;
* partial – results are based on the intersecting backlinks only;
* default value: all
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

  public BacklinksPageIntersectionLiveRequestInfo rankScale(String rankScale) {
    this.rankScale = rankScale;
    return this;
  }

  /**
   * defines the scale used for calculating and displaying the rank, domain_from_rank, and page_from_rank values
* optional field
* you can use this parameter to choose whether rank values are presented on a 0–100 or 0–1000 scale
* possible values:
* one_hundred — rank values are displayed on a 0–100 scale
* one_thousand — rank values are displayed on a 0–1000 scale
* default value: one_thousand
* learn more about how this parameter works and how ranking metrics are calculated in this Help Center article
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

  public BacklinksPageIntersectionLiveRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier
* optional field
* the character limit is 255
* you can use this parameter to identify the task and match it with the result
* you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }



  public BacklinksPageIntersectionLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksPageIntersectionLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    BacklinksPageIntersectionLiveRequestInfo backlinksPageIntersectionLiveRequestInfo = (BacklinksPageIntersectionLiveRequestInfo) o;
    return

        Objects.equals(this.targets, backlinksPageIntersectionLiveRequestInfo.targets) &&
        Objects.equals(this.excludeTargets, backlinksPageIntersectionLiveRequestInfo.excludeTargets) &&
        Objects.equals(this.backlinksStatusType, backlinksPageIntersectionLiveRequestInfo.backlinksStatusType) &&
        Objects.equals(this.filters, backlinksPageIntersectionLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, backlinksPageIntersectionLiveRequestInfo.orderBy) &&
        Objects.equals(this.offset, backlinksPageIntersectionLiveRequestInfo.offset) &&
        Objects.equals(this.limit, backlinksPageIntersectionLiveRequestInfo.limit) &&
        Objects.equals(this.internalListLimit, backlinksPageIntersectionLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.includeSubdomains, backlinksPageIntersectionLiveRequestInfo.includeSubdomains) &&
        Objects.equals(this.includeIndirectLinks, backlinksPageIntersectionLiveRequestInfo.includeIndirectLinks) &&
        Objects.equals(this.excludeInternalBacklinks, backlinksPageIntersectionLiveRequestInfo.excludeInternalBacklinks) &&
        Objects.equals(this.intersectionMode, backlinksPageIntersectionLiveRequestInfo.intersectionMode) &&
        Objects.equals(this.rankScale, backlinksPageIntersectionLiveRequestInfo.rankScale) &&
        Objects.equals(this.tag, backlinksPageIntersectionLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(targets, excludeTargets, backlinksStatusType, filters, orderBy, offset, limit, internalListLimit, includeSubdomains, includeIndirectLinks, excludeInternalBacklinks, intersectionMode, rankScale, tag);
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
    sb.append("class BacklinksPageIntersectionLiveRequestInfo {\n");

    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    excludeTargets: ").append(toIndentedString(excludeTargets)).append("\n");
    sb.append("    backlinksStatusType: ").append(toIndentedString(backlinksStatusType)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    internalListLimit: ").append(toIndentedString(internalListLimit)).append("\n");
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
    
    openapiFields.add("backlinks_status_type");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("offset");
    
    openapiFields.add("limit");
    
    openapiFields.add("internal_list_limit");
    
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
   * @throws IOException if the JSON Element is invalid with respect to BacklinksPageIntersectionLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksPageIntersectionLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksPageIntersectionLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksPageIntersectionLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksPageIntersectionLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksPageIntersectionLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, BacklinksPageIntersectionLiveRequestInfo value) throws IOException {
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
           public BacklinksPageIntersectionLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksPageIntersectionLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksPageIntersectionLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksPageIntersectionLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
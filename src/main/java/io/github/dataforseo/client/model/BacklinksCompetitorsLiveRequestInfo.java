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
   * domain, subdomain or webpage to get competitor domains for
* required field
* a domain or a subdomain should be specified without https:// and www.
* a page should be specified with absolute URL (including http:// or https://)
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
   * the maximum number of returned domains
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


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public BacklinksCompetitorsLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of returned domains
* optional field
* default value: 0
* if you specify the 10 value, the first ten domains in the results array will be omitted and the data will be provided for the successive pages
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
   * array of results filtering parameters
* optional field
* you can add several filters at once (8 filters maximum)
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* regex, not_regex, =, <>, in, not_in, like, not_like, ilike, not_ilike, match, not_match
* you can use the % operator with like and not_like to match any string of zero or more characters
* example:
* ['rank','>','100']
* [['target','like','%forbes%'],
* 'and',
* [['rank','>','100'],'or',['intersections','>','5']]]
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

  public BacklinksCompetitorsLiveRequestInfo orderBy(List<String> orderBy) {
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
* ['intersections,desc','rank,asc']
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
   * indicates if only main domain of the target will be included in the search
* optional field
* if set to true, only the main domain will be included in search;
* default value: true
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
   * indicates whether large domain will appear in results
* optional field
* if set to true, the results from the large domain (google.com, amazon.com, etc.) will be omitted;
* default value: true
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
   * indicates if internal backlinks from subdomains to the target will be excluded from the results
* optional field
* if set to true, the results will not include data on internal backlinks from subdomains of the same domain as target
* if set to false, internal links will be included in the results
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


  public static final String SERIALIZED_NAME_RANK_SCALE = "rank_scale";
  @SerializedName(SERIALIZED_NAME_RANK_SCALE)
  private String rankScale;

  public BacklinksCompetitorsLiveRequestInfo rankScale(String rankScale) {
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

  public BacklinksCompetitorsLiveRequestInfo tag(String tag) {
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
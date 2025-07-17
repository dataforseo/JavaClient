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



public class BacklinksSummaryLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public BacklinksSummaryLiveRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * domain, subdomain or webpage to get data for
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


  public static final String SERIALIZED_NAME_INCLUDE_SUBDOMAINS = "include_subdomains";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SUBDOMAINS)
  private Boolean includeSubdomains;

  public BacklinksSummaryLiveRequestInfo includeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
    return this;
  }

  /**
   * indicates if the subdomains of the target will be included in the search
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

  public BacklinksSummaryLiveRequestInfo includeIndirectLinks(Boolean includeIndirectLinks) {
    this.includeIndirectLinks = includeIndirectLinks;
    return this;
  }

  /**
   * indicates if indirect links to the target will be included in the results
* optional field
* if set to true, the results will include data on indirect links pointing to a page that either redirects to the target, or points to a canonical page
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

  public BacklinksSummaryLiveRequestInfo excludeInternalBacklinks(Boolean excludeInternalBacklinks) {
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


  public static final String SERIALIZED_NAME_INTERNAL_LIST_LIMIT = "internal_list_limit";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LIST_LIMIT)
  private Integer internalListLimit;

  public BacklinksSummaryLiveRequestInfo internalListLimit(Integer internalListLimit) {
    this.internalListLimit = internalListLimit;
    return this;
  }

  /**
   * maximum number of elements within internal arrays
* optional field
* you can use this field to limit the number of elements within the following arrays:
* referring_links_tld
* referring_links_types
* referring_links_attributes
* referring_links_platform_types
* referring_links_semantic_locations
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


  public static final String SERIALIZED_NAME_BACKLINKS_STATUS_TYPE = "backlinks_status_type";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_STATUS_TYPE)
  private String backlinksStatusType;

  public BacklinksSummaryLiveRequestInfo backlinksStatusType(String backlinksStatusType) {
    this.backlinksStatusType = backlinksStatusType;
    return this;
  }

  /**
   * set what backlinks to return and count
* optional field
* you can use this field to choose what backlinks will be returned and used for aggregated metrics for your target;
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


  public static final String SERIALIZED_NAME_BACKLINKS_FILTERS = "backlinks_filters";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_FILTERS)
  private List<Object> backlinksFilters;

  public BacklinksSummaryLiveRequestInfo backlinksFilters(List<Object> backlinksFilters) {
    this.backlinksFilters = backlinksFilters;
    return this;
  }

  /**
   * filter the backlinks of your target
* optional field
* you can use this field to filter the initial backlinks that will be included in the dataset for aggregated metrics for your target
* you can filter the backlinks by all fields available in the response of this endpoint
* using this parameter, you can include only dofollow backlinks in the response and create a flexible backlinks dataset to calculate the metrics for
* example:
* 'backlinks_filters': ['dofollow', '=', true]
   * @return backlinksFilters
   */
  @javax.annotation.Nullable
  public List<Object> getBacklinksFilters() {
    return backlinksFilters;
  }

  public void setBacklinksFilters(List<Object> backlinksFilters) {
    this.backlinksFilters = backlinksFilters;
  }


  public static final String SERIALIZED_NAME_RANK_SCALE = "rank_scale";
  @SerializedName(SERIALIZED_NAME_RANK_SCALE)
  private String rankScale;

  public BacklinksSummaryLiveRequestInfo rankScale(String rankScale) {
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

  public BacklinksSummaryLiveRequestInfo tag(String tag) {
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



  public BacklinksSummaryLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksSummaryLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    BacklinksSummaryLiveRequestInfo backlinksSummaryLiveRequestInfo = (BacklinksSummaryLiveRequestInfo) o;
    return

        Objects.equals(this.target, backlinksSummaryLiveRequestInfo.target) &&
        Objects.equals(this.includeSubdomains, backlinksSummaryLiveRequestInfo.includeSubdomains) &&
        Objects.equals(this.includeIndirectLinks, backlinksSummaryLiveRequestInfo.includeIndirectLinks) &&
        Objects.equals(this.excludeInternalBacklinks, backlinksSummaryLiveRequestInfo.excludeInternalBacklinks) &&
        Objects.equals(this.internalListLimit, backlinksSummaryLiveRequestInfo.internalListLimit) &&
        Objects.equals(this.backlinksStatusType, backlinksSummaryLiveRequestInfo.backlinksStatusType) &&
        Objects.equals(this.backlinksFilters, backlinksSummaryLiveRequestInfo.backlinksFilters) &&
        Objects.equals(this.rankScale, backlinksSummaryLiveRequestInfo.rankScale) &&
        Objects.equals(this.tag, backlinksSummaryLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, includeSubdomains, includeIndirectLinks, excludeInternalBacklinks, internalListLimit, backlinksStatusType, backlinksFilters, rankScale, tag);
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
    sb.append("class BacklinksSummaryLiveRequestInfo {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    includeSubdomains: ").append(toIndentedString(includeSubdomains)).append("\n");
    sb.append("    includeIndirectLinks: ").append(toIndentedString(includeIndirectLinks)).append("\n");
    sb.append("    excludeInternalBacklinks: ").append(toIndentedString(excludeInternalBacklinks)).append("\n");
    sb.append("    internalListLimit: ").append(toIndentedString(internalListLimit)).append("\n");
    sb.append("    backlinksStatusType: ").append(toIndentedString(backlinksStatusType)).append("\n");
    sb.append("    backlinksFilters: ").append(toIndentedString(backlinksFilters)).append("\n");
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
    
    openapiFields.add("include_subdomains");
    
    openapiFields.add("include_indirect_links");
    
    openapiFields.add("exclude_internal_backlinks");
    
    openapiFields.add("internal_list_limit");
    
    openapiFields.add("backlinks_status_type");
    
    openapiFields.add("backlinks_filters");
    
    openapiFields.add("rank_scale");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksSummaryLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksSummaryLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksSummaryLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksSummaryLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksSummaryLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksSummaryLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, BacklinksSummaryLiveRequestInfo value) throws IOException {
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
           public BacklinksSummaryLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksSummaryLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksSummaryLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksSummaryLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
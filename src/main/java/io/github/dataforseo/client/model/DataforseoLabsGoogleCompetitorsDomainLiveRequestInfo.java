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



public class DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo target(String target) {
    this.target = target;
    return this;
  }

  /**
   * domain
* required field
* the domain name of the target website
* the domain should be specified without https:// and www.
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * full name of the location
* required field if you don’t specify location_code
* Note: it is required to specify either location_name or location_code
* you can receive the list of available locations with their location_name by making a separate request to the
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages
* example:
* United Kingdom
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code
* required field if you don’t specify location_name
* Note: it is required to specify either location_name or location_code
* you can receive the list of available locations with their location_code by making a separate request to the
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages
* example:
* 2840
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * full name of the language
* required field if you don’t specify language_code
* Note: it is required to specify either language_name or language_code
* you can receive the list of available languages with their language_name by making a separate request to the
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages
* example:
* English
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code
* required field if you don’t specify language_name
* Note: it is required to specify either language_name or language_code
* you can receive the list of available languages with their language_code by making a separate request to the
* https://api.dataforseo.com/v3/dataforseo_labs/locations_and_languages
* example:
* en
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_ITEM_TYPES = "item_types";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPES)
  private List<String> itemTypes;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  /**
   * display results by item type
* optional field
* indicates the type of search results included in the response
* Note: if the item_types array contains item types that are different from organic, the results will be ordered by the first item type in the array; you will not be able to sort and filter results by the types of search results not included in the response;
* possible values:
* ['organic', 'paid', 'featured_snippet', 'local_pack']
* default value:
* ['organic', 'paid']
   * @return itemTypes
   */
  @javax.annotation.Nullable
  public List<String> getItemTypes() {
    return itemTypes;
  }

  public void setItemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public static final String SERIALIZED_NAME_INCLUDE_CLICKSTREAM_DATA = "include_clickstream_data";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CLICKSTREAM_DATA)
  private Boolean includeClickstreamData;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo includeClickstreamData(Boolean includeClickstreamData) {
    this.includeClickstreamData = includeClickstreamData;
    return this;
  }

  /**
   * include or exclude data from clickstream-based metrics in the result
* optional field
* if the parameter is set to true, you will receive clickstream_etv, clickstream_gender_distribution, and clickstream_age_distribution fields with clickstream data in the response
* default value: false
* with this parameter enabled, you will be charged double the price for the request
* learn more about how clickstream-based metrics are calculated in this help center article
   * @return includeClickstreamData
   */
  @javax.annotation.Nullable
  public Boolean getIncludeClickstreamData() {
    return includeClickstreamData;
  }

  public void setIncludeClickstreamData(Boolean includeClickstreamData) {
    this.includeClickstreamData = includeClickstreamData;
  }


  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Object> filters;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo filters(List<Object> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * array of results filtering parameters
* optional field
* you can add several filters at once (8 filters maximum)
* you should set a logical operator and, or between the conditions
* the following operators are supported:
* regex, not_regex, <, <=, >, >=, =, <>, in, not_in
* example:
* ['metrics.organic.count','>',50]
* [[['metrics.organic.count','>=',50],'and',['metrics.organic.pos_1','in',[1,5]]],
* 'or',
* ['metrics.organic.etv','>=','100']]
* for more information about filters, please refer to Dataforseo Labs – Filters or this help center guide
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

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo orderBy(List<String> orderBy) {
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
* you should use a comma to specify a sorting type
* example:
* ['metrics.paid.etv,asc']
* Note: you can set no more than three sorting rules in a single request
* you should use a comma to separate several sorting rules
* example:
* ['metrics.organic.etv,desc','metrics.paid.count,asc']
* default rule:
* ['metrics.organic.count,desc']
* Note: if the item_types array contains item types that are different from organic, the results will be ordered by the first item type in the array
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

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo limit(Integer limit) {
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

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of returned domains
* optional field
* default value: 0
* if you specify the 10 value, the first ten keywords in the results array will be omitted and the data will be provided for the successive keywords
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_MAX_RANK_GROUP = "max_rank_group";
  @SerializedName(SERIALIZED_NAME_MAX_RANK_GROUP)
  private Integer maxRankGroup;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo maxRankGroup(Integer maxRankGroup) {
    this.maxRankGroup = maxRankGroup;
    return this;
  }

  /**
   * maximum rank up to which competitors will be considered
* optional field
* default value: 100
* if you specify 10 here, we will extract competitors from the top 10 Google search results only
   * @return maxRankGroup
   */
  @javax.annotation.Nullable
  public Integer getMaxRankGroup() {
    return maxRankGroup;
  }

  public void setMaxRankGroup(Integer maxRankGroup) {
    this.maxRankGroup = maxRankGroup;
  }


  public static final String SERIALIZED_NAME_EXCLUDE_TOP_DOMAINS = "exclude_top_domains";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_TOP_DOMAINS)
  private Boolean excludeTopDomains;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo excludeTopDomains(Boolean excludeTopDomains) {
    this.excludeTopDomains = excludeTopDomains;
    return this;
  }

  /**
   * indicates whether to exclude world’s largest websites
* optional field
* default value: false
* set to true if you want to get highly-relevant competitors excluding the websites listed below:
* wikipedia.org
* pinterest.com
* amazon.com
* google.com
* facebook.com
* wordpress.com
* medium.com
* quora.com
* reddit.com
* youtube.com
* ebay.com
* uol.com.br
* instagram.com
* olx.com
* twitter.com
* linkedin.com
* slideshare.net
   * @return excludeTopDomains
   */
  @javax.annotation.Nullable
  public Boolean getExcludeTopDomains() {
    return excludeTopDomains;
  }

  public void setExcludeTopDomains(Boolean excludeTopDomains) {
    this.excludeTopDomains = excludeTopDomains;
  }


  public static final String SERIALIZED_NAME_EXCLUDE_DOMAINS = "exclude_domains";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_DOMAINS)
  private List<String> excludeDomains;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo excludeDomains(List<String> excludeDomains) {
    this.excludeDomains = excludeDomains;
    return this;
  }

  /**
   * exclude domains from the results
* optional field
* use this parameter to exclude specific domains from the results
* Note: you can specify up to 1000 domains in this array
* example:
* 'exclude_domains': [
* 'reddit.com',
* 'youtube.com'
* ]
   * @return excludeDomains
   */
  @javax.annotation.Nullable
  public List<String> getExcludeDomains() {
    return excludeDomains;
  }

  public void setExcludeDomains(List<String> excludeDomains) {
    this.excludeDomains = excludeDomains;
  }


  public static final String SERIALIZED_NAME_INTERSECTING_DOMAINS = "intersecting_domains";
  @SerializedName(SERIALIZED_NAME_INTERSECTING_DOMAINS)
  private List<String> intersectingDomains;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo intersectingDomains(List<String> intersectingDomains) {
    this.intersectingDomains = intersectingDomains;
    return this;
  }

  /**
   * additional domains for improving results accuracy
* optional field
* to improve the accuracy of the result, you can specify domains that are known to intersect with the target in SERPs;
* if you use this array, metrics in the result will be based on SERPs where both target website and intersecting_domains appear;
* Note: you can specify up to 20 domains in this array
   * @return intersectingDomains
   */
  @javax.annotation.Nullable
  public List<String> getIntersectingDomains() {
    return intersectingDomains;
  }

  public void setIntersectingDomains(List<String> intersectingDomains) {
    this.intersectingDomains = intersectingDomains;
  }


  public static final String SERIALIZED_NAME_IGNORE_SYNONYMS = "ignore_synonyms";
  @SerializedName(SERIALIZED_NAME_IGNORE_SYNONYMS)
  private Boolean ignoreSynonyms;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo ignoreSynonyms(Boolean ignoreSynonyms) {
    this.ignoreSynonyms = ignoreSynonyms;
    return this;
  }

  /**
   * ignore highly similar keywords
* optional field
* if set to true, only core keywords will be returned, all highly similar keywords will be excluded;
* default value: false
   * @return ignoreSynonyms
   */
  @javax.annotation.Nullable
  public Boolean getIgnoreSynonyms() {
    return ignoreSynonyms;
  }

  public void setIgnoreSynonyms(Boolean ignoreSynonyms) {
    this.ignoreSynonyms = ignoreSynonyms;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo tag(String tag) {
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



  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo = (DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo) o;
    return

        Objects.equals(this.target, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.target) &&
        Objects.equals(this.locationName, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.locationName) &&
        Objects.equals(this.locationCode, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.locationCode) &&
        Objects.equals(this.languageName, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.languageName) &&
        Objects.equals(this.languageCode, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.languageCode) &&
        Objects.equals(this.itemTypes, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.itemTypes) &&
        Objects.equals(this.includeClickstreamData, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.includeClickstreamData) &&
        Objects.equals(this.filters, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.filters) &&
        Objects.equals(this.orderBy, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.orderBy) &&
        Objects.equals(this.limit, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.limit) &&
        Objects.equals(this.offset, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.offset) &&
        Objects.equals(this.maxRankGroup, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.maxRankGroup) &&
        Objects.equals(this.excludeTopDomains, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.excludeTopDomains) &&
        Objects.equals(this.excludeDomains, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.excludeDomains) &&
        Objects.equals(this.intersectingDomains, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.intersectingDomains) &&
        Objects.equals(this.ignoreSynonyms, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.ignoreSynonyms) &&
        Objects.equals(this.tag, dataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(target, locationName, locationCode, languageName, languageCode, itemTypes, includeClickstreamData, filters, orderBy, limit, offset, maxRankGroup, excludeTopDomains, excludeDomains, intersectingDomains, ignoreSynonyms, tag);
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
    sb.append("class DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo {\n");

    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    includeClickstreamData: ").append(toIndentedString(includeClickstreamData)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    maxRankGroup: ").append(toIndentedString(maxRankGroup)).append("\n");
    sb.append("    excludeTopDomains: ").append(toIndentedString(excludeTopDomains)).append("\n");
    sb.append("    excludeDomains: ").append(toIndentedString(excludeDomains)).append("\n");
    sb.append("    intersectingDomains: ").append(toIndentedString(intersectingDomains)).append("\n");
    sb.append("    ignoreSynonyms: ").append(toIndentedString(ignoreSynonyms)).append("\n");
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
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("item_types");
    
    openapiFields.add("include_clickstream_data");
    
    openapiFields.add("filters");
    
    openapiFields.add("order_by");
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("max_rank_group");
    
    openapiFields.add("exclude_top_domains");
    
    openapiFields.add("exclude_domains");
    
    openapiFields.add("intersecting_domains");
    
    openapiFields.add("ignore_synonyms");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo value) throws IOException {
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
           public DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}